package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcrtinc_impl extends GXDataArea
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
      if ( ! entryPointCalled && ! ( isAjaxCallMode( ) || isFullAjaxMode( ) ) )
      {
         Gx_mode = gxfirstwebparm ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
         {
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33Inc_Dia = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33Inc_Dia", localUtil.format(AV33Inc_Dia, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINC_DIA", getSecureSignedToken( "", AV33Inc_Dia));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control de Incidencias", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtInc_Dia_Internalname ;
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
      nRC_GXsfl_28 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_28"))) ;
      nGXsfl_28_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_28_idx"))) ;
      sGXsfl_28_idx = httpContext.GetPar( "sGXsfl_28_idx") ;
      A4930Inc_Num_ul = GXutil.lval( httpContext.GetPar( "Inc_Num_ul")) ;
      n4930Inc_Num_ul = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tcrtinc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcrtinc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcrtinc_impl.class ));
   }

   public tcrtinc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtInc_Dia_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtInc_Dia_Internalname, httpContext.getMessage( "Dia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtInc_Dia_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Dia_Internalname, localUtil.format(A4929Inc_Dia, "99/99/99"), localUtil.format( A4929Inc_Dia, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Dia_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtInc_Dia_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCRTINC.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtInc_Dia_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtInc_Dia_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TCRTINC.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_level1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCRTINC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCRTINC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCRTINC.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCRTINC.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCRTINC.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtInc_Num_ul_Internalname, GXutil.ltrim( localUtil.ntoc( A4930Inc_Num_ul, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtInc_Num_ul_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4930Inc_Num_ul), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4930Inc_Num_ul), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtInc_Num_ul_Jsonclick, 0, "Attribute", "", "", "", "", edtInc_Num_ul_Visible, edtInc_Num_ul_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCRTINC.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol28( ) ;
      nGXsfl_28_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount726 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_726 = (short)(1) ;
            scanStartNE726( ) ;
            while ( RcdFound726 != 0 )
            {
               init_level_properties726( ) ;
               getByPrimaryKeyNE726( ) ;
               addRowNE726( ) ;
               scanNextNE726( ) ;
            }
            scanEndNE726( ) ;
            nBlankRcdCount726 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B4930Inc_Num_ul = A4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         standaloneNotModalNE726( ) ;
         standaloneModalNE726( ) ;
         sMode726 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRowNE726( ) ;
            edtInc_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_LINEA_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Hora_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_HORA_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hora_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Usuari_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_USUARI_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Usuari_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Usuari_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Termin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_TERMIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Termin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Termin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Prog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_PROG_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Prog_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_OBS_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Obs_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_BARCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Barcod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_BARREO_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_BarReo_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_BARPAR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_BarPar_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_obsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_OBSTXT_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_obsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_obsTxt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Hdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_HDR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hdr_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_Maqcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_MAQCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_Maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Maqcod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtInc_St_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_ST_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtInc_St_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_St_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            if ( ( nRcdExists_726 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalNE726( ) ;
            }
            sendRowNE726( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode726 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4930Inc_Num_ul = B4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount726 = (short)(5) ;
         nRcdExists_726 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartNE726( ) ;
            while ( RcdFound726 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_28726( ) ;
               init_level_properties726( ) ;
               standaloneNotModalNE726( ) ;
               getByPrimaryKeyNE726( ) ;
               standaloneModalNE726( ) ;
               addRowNE726( ) ;
               scanNextNE726( ) ;
            }
            scanEndNE726( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode726 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_28726( ) ;
         initAllNE726( ) ;
         init_level_properties726( ) ;
         B4930Inc_Num_ul = A4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         nRcdExists_726 = (short)(0) ;
         nIsMod_726 = (short)(0) ;
         nRcdDeleted_726 = (short)(0) ;
         nBlankRcdCount726 = (short)(nBlankRcdUsr726+nBlankRcdCount726) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount726 > 0 )
         {
            standaloneNotModalNE726( ) ;
            standaloneModalNE726( ) ;
            addRowNE726( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtInc_Linea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount726 = (short)(nBlankRcdCount726-1) ;
         }
         Gx_mode = sMode726 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A4930Inc_Num_ul = B4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      }
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
      e11NE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4929Inc_Dia = localUtil.ctod( httpContext.cgiGet( "Z4929Inc_Dia"), 0) ;
            Z4930Inc_Num_ul = localUtil.ctol( httpContext.cgiGet( "Z4930Inc_Num_ul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            O4930Inc_Num_ul = localUtil.ctol( httpContext.cgiGet( "O4930Inc_Num_ul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV33Inc_Dia = localUtil.ctod( httpContext.cgiGet( "vINC_DIA"), 0) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( localUtil.vcdate( httpContext.cgiGet( edtInc_Dia_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "INC_DIA");
               AnyError = (short)(1) ;
               GX_FocusControl = edtInc_Dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4929Inc_Dia = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
            }
            else
            {
               A4929Inc_Dia = localUtil.ctod( httpContext.cgiGet( edtInc_Dia_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
            }
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4930Inc_Num_ul = localUtil.ctol( httpContext.cgiGet( edtInc_Num_ul_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            n4930Inc_Num_ul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCRTINC");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( !( GXutil.dateCompare(GXutil.resetTime(A4929Inc_Dia), GXutil.resetTime(Z4929Inc_Dia)) ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tcrtinc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A4929Inc_Dia = localUtil.parseDateParm( httpContext.GetPar( "Inc_Dia")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
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
                  sMode725 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode725 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound725 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_NE0( ) ;
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
                        e11NE2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12NE2 ();
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
         e12NE2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllNE725( ) ;
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
         disableAttributesNE725( ) ;
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

   public void confirm_NE0( )
   {
      beforeValidateNE725( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsNE725( ) ;
         }
         else
         {
            checkExtendedTableNE725( ) ;
            closeExtendedTableCursorsNE725( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode725 = Gx_mode ;
         confirm_NE726( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode725 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode725 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_NE726( )
   {
      s4930Inc_Num_ul = O4930Inc_Num_ul ;
      n4930Inc_Num_ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRowNE726( ) ;
         if ( ( nRcdExists_726 != 0 ) || ( nIsMod_726 != 0 ) )
         {
            getKeyNE726( ) ;
            if ( ( nRcdExists_726 == 0 ) && ( nRcdDeleted_726 == 0 ) )
            {
               if ( RcdFound726 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateNE726( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableNE726( ) ;
                     closeExtendedTableCursorsNE726( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4930Inc_Num_ul = A4930Inc_Num_ul ;
                     n4930Inc_Num_ul = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
                  }
               }
               else
               {
                  GXCCtl = "INC_LINEA_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtInc_Linea_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound726 != 0 )
               {
                  if ( nRcdDeleted_726 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyNE726( ) ;
                     loadNE726( ) ;
                     beforeValidateNE726( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsNE726( ) ;
                        O4930Inc_Num_ul = A4930Inc_Num_ul ;
                        n4930Inc_Num_ul = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_726 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateNE726( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableNE726( ) ;
                           closeExtendedTableCursorsNE726( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4930Inc_Num_ul = A4930Inc_Num_ul ;
                           n4930Inc_Num_ul = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_726 == 0 )
                  {
                     GXCCtl = "INC_LINEA_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtInc_Linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtInc_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInc_Hora_Internalname, localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtInc_Usuari_Internalname, GXutil.rtrim( A4933Inc_Usuari)) ;
         httpContext.changePostValue( edtInc_Termin_Internalname, GXutil.rtrim( A4934Inc_Termin)) ;
         httpContext.changePostValue( edtInc_Prog_Internalname, GXutil.rtrim( A4935Inc_Prog)) ;
         httpContext.changePostValue( edtInc_Obs_Internalname, A4936Inc_Obs) ;
         httpContext.changePostValue( edtInc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInc_BarPar_Internalname, GXutil.rtrim( A5301Inc_BarPar)) ;
         httpContext.changePostValue( edtInc_obsTxt_Internalname, A13712Inc_obsTxt) ;
         httpContext.changePostValue( edtInc_Hdr_Internalname, GXutil.rtrim( A13713Inc_Hdr)) ;
         httpContext.changePostValue( edtInc_Maqcod_Internalname, GXutil.rtrim( A7499Inc_Maqcod)) ;
         httpContext.changePostValue( edtInc_St_Internalname, GXutil.ltrim( localUtil.ntoc( A8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4931Inc_Linea_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4932Inc_Hora_"+sGXsfl_28_idx, localUtil.ttoc( Z4932Inc_Hora, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4933Inc_Usuari_"+sGXsfl_28_idx, GXutil.rtrim( Z4933Inc_Usuari)) ;
         httpContext.changePostValue( "ZT_"+"Z4934Inc_Termin_"+sGXsfl_28_idx, GXutil.rtrim( Z4934Inc_Termin)) ;
         httpContext.changePostValue( "ZT_"+"Z4935Inc_Prog_"+sGXsfl_28_idx, GXutil.rtrim( Z4935Inc_Prog)) ;
         httpContext.changePostValue( "ZT_"+"Z4936Inc_Obs_"+sGXsfl_28_idx, Z4936Inc_Obs) ;
         httpContext.changePostValue( "ZT_"+"Z5299Inc_Barcod_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5300Inc_BarReo_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5301Inc_BarPar_"+sGXsfl_28_idx, GXutil.rtrim( Z5301Inc_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z7499Inc_Maqcod_"+sGXsfl_28_idx, GXutil.rtrim( Z7499Inc_Maqcod)) ;
         httpContext.changePostValue( "ZT_"+"Z8012Inc_St_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_726_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_726_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_726_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_726 != 0 )
         {
            httpContext.changePostValue( "INC_LINEA_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_HORA_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hora_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_USUARI_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Usuari_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_TERMIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Termin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_PROG_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Prog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_OBS_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_BARCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_BARREO_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_BARPAR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_OBSTXT_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_obsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_HDR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_MAQCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Maqcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_ST_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_St_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4930Inc_Num_ul = s4930Inc_Num_ul ;
      n4930Inc_Num_ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionNE0( )
   {
   }

   public void e11NE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcrtinc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcrtinc_impl.this.A396EmprCod = GXv_char2[0] ;
      tcrtinc_impl.this.AV31EmprNom = GXv_char3[0] ;
      tcrtinc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprNom", AV31EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV29Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tcrtinc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV31EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char3, GXv_char2) ;
      tcrtinc_impl.this.AV32EmprCod = GXv_char4[0] ;
      tcrtinc_impl.this.AV31EmprNom = GXv_char3[0] ;
      tcrtinc_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprNom", AV31EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtInc_Num_ul_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Num_ul_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Num_ul_Visible), 5, 0), true);
   }

   public void e12NE2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV35TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tcrtincww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zmNE725( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4930Inc_Num_ul = T00NE5_A4930Inc_Num_ul[0] ;
         }
         else
         {
            Z4930Inc_Num_ul = A4930Inc_Num_ul ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z4929Inc_Dia = A4929Inc_Dia ;
         Z4930Inc_Num_ul = A4930Inc_Num_ul ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtInc_Num_ul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Num_ul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Num_ul_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtInc_Num_ul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Num_ul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Num_ul_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00NE6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00NE6_A407EmprNom[0] ;
      n407EmprNom = T00NE6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33Inc_Dia)) )
      {
         A4929Inc_Dia = AV33Inc_Dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33Inc_Dia)) )
      {
         edtInc_Dia_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Enabled), 5, 0), true);
      }
      else
      {
         edtInc_Dia_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Enabled), 5, 0), true);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV33Inc_Dia)) )
      {
         edtInc_Dia_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Enabled), 5, 0), true);
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

   public void loadNE725( )
   {
      /* Using cursor T00NE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A4929Inc_Dia});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound725 = (short)(1) ;
         A407EmprNom = T00NE7_A407EmprNom[0] ;
         n407EmprNom = T00NE7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4930Inc_Num_ul = T00NE7_A4930Inc_Num_ul[0] ;
         n4930Inc_Num_ul = T00NE7_n4930Inc_Num_ul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         zmNE725( -17) ;
      }
      pr_default.close(5);
      onLoadActionsNE725( ) ;
   }

   public void onLoadActionsNE725( )
   {
   }

   public void checkExtendedTableNE725( )
   {
      nIsDirty_725 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsNE725( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyNE725( )
   {
      /* Using cursor T00NE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A4929Inc_Dia});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound725 = (short)(1) ;
      }
      else
      {
         RcdFound725 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00NE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A4929Inc_Dia});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T00NE5_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmNE725( 17) ;
         RcdFound725 = (short)(1) ;
         A4929Inc_Dia = T00NE5_A4929Inc_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         A4930Inc_Num_ul = T00NE5_A4930Inc_Num_ul[0] ;
         n4930Inc_Num_ul = T00NE5_n4930Inc_Num_ul[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         O4930Inc_Num_ul = A4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         Z396EmprCod = A396EmprCod ;
         Z4929Inc_Dia = A4929Inc_Dia ;
         sMode725 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadNE725( ) ;
         if ( AnyError == 1 )
         {
            RcdFound725 = (short)(0) ;
            initializeNonKeyNE725( ) ;
         }
         Gx_mode = sMode725 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound725 = (short)(0) ;
         initializeNonKeyNE725( ) ;
         sMode725 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode725 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyNE725( ) ;
      if ( RcdFound725 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound725 = (short)(0) ;
      /* Using cursor T00NE9 */
      pr_default.execute(7, new Object[] {A4929Inc_Dia, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.resetTime(T00NE9_A4929Inc_Dia[0]).before( GXutil.resetTime( A4929Inc_Dia )) ) && ( GXutil.strcmp(T00NE9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.resetTime(T00NE9_A4929Inc_Dia[0]).after( GXutil.resetTime( A4929Inc_Dia )) ) && ( GXutil.strcmp(T00NE9_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4929Inc_Dia = T00NE9_A4929Inc_Dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
            RcdFound725 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound725 = (short)(0) ;
      /* Using cursor T00NE10 */
      pr_default.execute(8, new Object[] {A4929Inc_Dia, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.resetTime(T00NE10_A4929Inc_Dia[0]).after( GXutil.resetTime( A4929Inc_Dia )) ) && ( GXutil.strcmp(T00NE10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.resetTime(T00NE10_A4929Inc_Dia[0]).before( GXutil.resetTime( A4929Inc_Dia )) ) && ( GXutil.strcmp(T00NE10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A4929Inc_Dia = T00NE10_A4929Inc_Dia[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
            RcdFound725 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyNE725( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4930Inc_Num_ul = O4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         GX_FocusControl = edtInc_Dia_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertNE725( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound725 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A4929Inc_Dia), GXutil.resetTime(Z4929Inc_Dia)) ) )
            {
               A4929Inc_Dia = Z4929Inc_Dia ;
               httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4930Inc_Num_ul = O4930Inc_Num_ul ;
               n4930Inc_Num_ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtInc_Dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A4930Inc_Num_ul = O4930Inc_Num_ul ;
               n4930Inc_Num_ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
               updateNE725( ) ;
               GX_FocusControl = edtInc_Dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A4929Inc_Dia), GXutil.resetTime(Z4929Inc_Dia)) ) )
            {
               /* Insert record */
               A4930Inc_Num_ul = O4930Inc_Num_ul ;
               n4930Inc_Num_ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
               GX_FocusControl = edtInc_Dia_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertNE725( ) ;
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
                  A4930Inc_Num_ul = O4930Inc_Num_ul ;
                  n4930Inc_Num_ul = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
                  GX_FocusControl = edtInc_Dia_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertNE725( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(A4929Inc_Dia), GXutil.resetTime(Z4929Inc_Dia)) ) )
      {
         A4929Inc_Dia = Z4929Inc_Dia ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4930Inc_Num_ul = O4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtInc_Dia_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyNE725( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00NE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A4929Inc_Dia});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRTINC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z4930Inc_Num_ul != T00NE4_A4930Inc_Num_ul[0] ) )
         {
            if ( Z4930Inc_Num_ul != T00NE4_A4930Inc_Num_ul[0] )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Num_ul");
               GXutil.writeLogRaw("Old: ",Z4930Inc_Num_ul);
               GXutil.writeLogRaw("Current: ",T00NE4_A4930Inc_Num_ul[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRTINC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertNE725( )
   {
      beforeValidateNE725( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNE725( ) ;
      }
      if ( AnyError == 0 )
      {
         zmNE725( 0) ;
         checkOptimisticConcurrencyNE725( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNE725( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertNE725( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NE11 */
                  pr_default.execute(9, new Object[] {A4929Inc_Dia, Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
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
                        processLevelNE725( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionNE0( ) ;
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
            loadNE725( ) ;
         }
         endLevelNE725( ) ;
      }
      closeExtendedTableCursorsNE725( ) ;
   }

   public void updateNE725( )
   {
      beforeValidateNE725( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNE725( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNE725( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNE725( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateNE725( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NE12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul), A396EmprCod, A4929Inc_Dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRTINC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateNE725( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelNE725( ) ;
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
         endLevelNE725( ) ;
      }
      closeExtendedTableCursorsNE725( ) ;
   }

   public void deferredUpdateNE725( )
   {
   }

   public void delete( )
   {
      beforeValidateNE725( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNE725( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsNE725( ) ;
         afterConfirmNE725( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteNE725( ) ;
            if ( AnyError == 0 )
            {
               A4930Inc_Num_ul = O4930Inc_Num_ul ;
               n4930Inc_Num_ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
               scanStartNE726( ) ;
               while ( RcdFound726 != 0 )
               {
                  getByPrimaryKeyNE726( ) ;
                  deleteNE726( ) ;
                  scanNextNE726( ) ;
                  O4930Inc_Num_ul = A4930Inc_Num_ul ;
                  n4930Inc_Num_ul = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
               }
               scanEndNE726( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NE13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, A4929Inc_Dia});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
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
      }
      sMode725 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelNE725( ) ;
      Gx_mode = sMode725 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsNE725( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00NE14 */
         pr_default.execute(12, new Object[] {A396EmprCod, A4929Inc_Dia});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
      }
   }

   public void processNestedLevelNE726( )
   {
      s4930Inc_Num_ul = O4930Inc_Num_ul ;
      n4930Inc_Num_ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRowNE726( ) ;
         if ( ( nRcdExists_726 != 0 ) || ( nIsMod_726 != 0 ) )
         {
            standaloneNotModalNE726( ) ;
            getKeyNE726( ) ;
            if ( ( nRcdExists_726 == 0 ) && ( nRcdDeleted_726 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertNE726( ) ;
            }
            else
            {
               if ( RcdFound726 != 0 )
               {
                  if ( ( nRcdDeleted_726 != 0 ) && ( nRcdExists_726 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteNE726( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_726 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateNE726( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_726 == 0 )
                  {
                     GXCCtl = "INC_LINEA_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtInc_Linea_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4930Inc_Num_ul = A4930Inc_Num_ul ;
            n4930Inc_Num_ul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
         }
         httpContext.changePostValue( edtInc_Linea_Internalname, GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInc_Hora_Internalname, localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
         httpContext.changePostValue( edtInc_Usuari_Internalname, GXutil.rtrim( A4933Inc_Usuari)) ;
         httpContext.changePostValue( edtInc_Termin_Internalname, GXutil.rtrim( A4934Inc_Termin)) ;
         httpContext.changePostValue( edtInc_Prog_Internalname, GXutil.rtrim( A4935Inc_Prog)) ;
         httpContext.changePostValue( edtInc_Obs_Internalname, A4936Inc_Obs) ;
         httpContext.changePostValue( edtInc_Barcod_Internalname, GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInc_BarReo_Internalname, GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtInc_BarPar_Internalname, GXutil.rtrim( A5301Inc_BarPar)) ;
         httpContext.changePostValue( edtInc_obsTxt_Internalname, A13712Inc_obsTxt) ;
         httpContext.changePostValue( edtInc_Hdr_Internalname, GXutil.rtrim( A13713Inc_Hdr)) ;
         httpContext.changePostValue( edtInc_Maqcod_Internalname, GXutil.rtrim( A7499Inc_Maqcod)) ;
         httpContext.changePostValue( edtInc_St_Internalname, GXutil.ltrim( localUtil.ntoc( A8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4931Inc_Linea_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4932Inc_Hora_"+sGXsfl_28_idx, localUtil.ttoc( Z4932Inc_Hora, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z4933Inc_Usuari_"+sGXsfl_28_idx, GXutil.rtrim( Z4933Inc_Usuari)) ;
         httpContext.changePostValue( "ZT_"+"Z4934Inc_Termin_"+sGXsfl_28_idx, GXutil.rtrim( Z4934Inc_Termin)) ;
         httpContext.changePostValue( "ZT_"+"Z4935Inc_Prog_"+sGXsfl_28_idx, GXutil.rtrim( Z4935Inc_Prog)) ;
         httpContext.changePostValue( "ZT_"+"Z4936Inc_Obs_"+sGXsfl_28_idx, Z4936Inc_Obs) ;
         httpContext.changePostValue( "ZT_"+"Z5299Inc_Barcod_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5300Inc_BarReo_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5301Inc_BarPar_"+sGXsfl_28_idx, GXutil.rtrim( Z5301Inc_BarPar)) ;
         httpContext.changePostValue( "ZT_"+"Z7499Inc_Maqcod_"+sGXsfl_28_idx, GXutil.rtrim( Z7499Inc_Maqcod)) ;
         httpContext.changePostValue( "ZT_"+"Z8012Inc_St_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_726_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_726_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_726_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_726 != 0 )
         {
            httpContext.changePostValue( "INC_LINEA_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Linea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_HORA_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hora_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_USUARI_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Usuari_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_TERMIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Termin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_PROG_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Prog_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_OBS_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Obs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_BARCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Barcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_BARREO_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarReo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_BARPAR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarPar_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_OBSTXT_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_obsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_HDR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hdr_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_MAQCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Maqcod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "INC_ST_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_St_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllNE726( ) ;
      if ( AnyError != 0 )
      {
         O4930Inc_Num_ul = s4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      }
      nRcdExists_726 = (short)(0) ;
      nIsMod_726 = (short)(0) ;
      nRcdDeleted_726 = (short)(0) ;
   }

   public void processLevelNE725( )
   {
      /* Save parent mode. */
      sMode725 = Gx_mode ;
      processNestedLevelNE726( ) ;
      if ( AnyError != 0 )
      {
         O4930Inc_Num_ul = s4930Inc_Num_ul ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode725 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00NE15 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n4930Inc_Num_ul), Long.valueOf(A4930Inc_Num_ul), A396EmprCod, A4929Inc_Dia});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTINC");
   }

   public void endLevelNE725( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteNE725( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcrtinc");
         if ( AnyError == 0 )
         {
            confirmValuesNE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcrtinc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartNE725( )
   {
      /* Scan By routine */
      /* Using cursor T00NE16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound725 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound725 = (short)(1) ;
         A4929Inc_Dia = T00NE16_A4929Inc_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextNE725( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound725 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound725 = (short)(1) ;
         A4929Inc_Dia = T00NE16_A4929Inc_Dia[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
      }
   }

   public void scanEndNE725( )
   {
      pr_default.close(14);
   }

   public void afterConfirmNE725( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertNE725( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateNE725( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteNE725( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteNE725( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateNE725( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesNE725( )
   {
      edtInc_Dia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Dia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Dia_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtInc_Num_ul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Num_ul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Num_ul_Enabled), 5, 0), true);
   }

   public void zmNE726( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4932Inc_Hora = T00NE3_A4932Inc_Hora[0] ;
            Z4933Inc_Usuari = T00NE3_A4933Inc_Usuari[0] ;
            Z4934Inc_Termin = T00NE3_A4934Inc_Termin[0] ;
            Z4935Inc_Prog = T00NE3_A4935Inc_Prog[0] ;
            Z4936Inc_Obs = T00NE3_A4936Inc_Obs[0] ;
            Z5299Inc_Barcod = T00NE3_A5299Inc_Barcod[0] ;
            Z5300Inc_BarReo = T00NE3_A5300Inc_BarReo[0] ;
            Z5301Inc_BarPar = T00NE3_A5301Inc_BarPar[0] ;
            Z7499Inc_Maqcod = T00NE3_A7499Inc_Maqcod[0] ;
            Z8012Inc_St = T00NE3_A8012Inc_St[0] ;
         }
         else
         {
            Z4932Inc_Hora = A4932Inc_Hora ;
            Z4933Inc_Usuari = A4933Inc_Usuari ;
            Z4934Inc_Termin = A4934Inc_Termin ;
            Z4935Inc_Prog = A4935Inc_Prog ;
            Z4936Inc_Obs = A4936Inc_Obs ;
            Z5299Inc_Barcod = A5299Inc_Barcod ;
            Z5300Inc_BarReo = A5300Inc_BarReo ;
            Z5301Inc_BarPar = A5301Inc_BarPar ;
            Z7499Inc_Maqcod = A7499Inc_Maqcod ;
            Z8012Inc_St = A8012Inc_St ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4929Inc_Dia = A4929Inc_Dia ;
         Z4931Inc_Linea = A4931Inc_Linea ;
         Z4932Inc_Hora = A4932Inc_Hora ;
         Z4933Inc_Usuari = A4933Inc_Usuari ;
         Z4934Inc_Termin = A4934Inc_Termin ;
         Z4935Inc_Prog = A4935Inc_Prog ;
         Z4936Inc_Obs = A4936Inc_Obs ;
         Z5299Inc_Barcod = A5299Inc_Barcod ;
         Z5300Inc_BarReo = A5300Inc_BarReo ;
         Z5301Inc_BarPar = A5301Inc_BarPar ;
         Z7499Inc_Maqcod = A7499Inc_Maqcod ;
         Z8012Inc_St = A8012Inc_St ;
      }
   }

   public void standaloneNotModalNE726( )
   {
      edtInc_obsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_obsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_obsTxt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hdr_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Maqcod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_St_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_St_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_St_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Num_ul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Num_ul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Num_ul_Enabled), 5, 0), true);
      edtInc_Num_ul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Num_ul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Num_ul_Enabled), 5, 0), true);
   }

   public void standaloneModalNE726( )
   {
      if ( isIns( )  )
      {
         A4930Inc_Num_ul = (long)(O4930Inc_Num_ul+1) ;
         n4930Inc_Num_ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A4931Inc_Linea = A4930Inc_Num_ul ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtInc_Linea_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtInc_Linea_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void loadNE726( )
   {
      /* Using cursor T00NE17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound726 = (short)(1) ;
         A4932Inc_Hora = T00NE17_A4932Inc_Hora[0] ;
         A4933Inc_Usuari = T00NE17_A4933Inc_Usuari[0] ;
         A4934Inc_Termin = T00NE17_A4934Inc_Termin[0] ;
         A4935Inc_Prog = T00NE17_A4935Inc_Prog[0] ;
         A4936Inc_Obs = T00NE17_A4936Inc_Obs[0] ;
         A5299Inc_Barcod = T00NE17_A5299Inc_Barcod[0] ;
         A5300Inc_BarReo = T00NE17_A5300Inc_BarReo[0] ;
         A5301Inc_BarPar = T00NE17_A5301Inc_BarPar[0] ;
         A7499Inc_Maqcod = T00NE17_A7499Inc_Maqcod[0] ;
         A8012Inc_St = T00NE17_A8012Inc_St[0] ;
         zmNE726( -19) ;
      }
      pr_default.close(15);
      onLoadActionsNE726( ) ;
   }

   public void onLoadActionsNE726( )
   {
      A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
      A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
   }

   public void checkExtendedTableNE726( )
   {
      nIsDirty_726 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalNE726( ) ;
      nIsDirty_726 = (short)(1) ;
      A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
      nIsDirty_726 = (short)(1) ;
      A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
   }

   public void closeExtendedTableCursorsNE726( )
   {
   }

   public void enableDisableNE726( )
   {
   }

   public void getKeyNE726( )
   {
      /* Using cursor T00NE18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound726 = (short)(1) ;
      }
      else
      {
         RcdFound726 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKeyNE726( )
   {
      /* Using cursor T00NE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00NE3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmNE726( 19) ;
         RcdFound726 = (short)(1) ;
         initializeNonKeyNE726( ) ;
         A4931Inc_Linea = T00NE3_A4931Inc_Linea[0] ;
         A4932Inc_Hora = T00NE3_A4932Inc_Hora[0] ;
         A4933Inc_Usuari = T00NE3_A4933Inc_Usuari[0] ;
         A4934Inc_Termin = T00NE3_A4934Inc_Termin[0] ;
         A4935Inc_Prog = T00NE3_A4935Inc_Prog[0] ;
         A4936Inc_Obs = T00NE3_A4936Inc_Obs[0] ;
         A5299Inc_Barcod = T00NE3_A5299Inc_Barcod[0] ;
         A5300Inc_BarReo = T00NE3_A5300Inc_BarReo[0] ;
         A5301Inc_BarPar = T00NE3_A5301Inc_BarPar[0] ;
         A7499Inc_Maqcod = T00NE3_A7499Inc_Maqcod[0] ;
         A8012Inc_St = T00NE3_A8012Inc_St[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4929Inc_Dia = A4929Inc_Dia ;
         Z4931Inc_Linea = A4931Inc_Linea ;
         sMode726 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadNE726( ) ;
         Gx_mode = sMode726 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound726 = (short)(0) ;
         initializeNonKeyNE726( ) ;
         sMode726 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalNE726( ) ;
         Gx_mode = sMode726 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesNE726( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyNE726( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00NE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRTIN1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(Z4932Inc_Hora, T00NE2_A4932Inc_Hora[0]) ) || ( GXutil.strcmp(Z4933Inc_Usuari, T00NE2_A4933Inc_Usuari[0]) != 0 ) || ( GXutil.strcmp(Z4934Inc_Termin, T00NE2_A4934Inc_Termin[0]) != 0 ) || ( GXutil.strcmp(Z4935Inc_Prog, T00NE2_A4935Inc_Prog[0]) != 0 ) || ( GXutil.strcmp(Z4936Inc_Obs, T00NE2_A4936Inc_Obs[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z5299Inc_Barcod != T00NE2_A5299Inc_Barcod[0] ) || ( Z5300Inc_BarReo != T00NE2_A5300Inc_BarReo[0] ) || ( GXutil.strcmp(Z5301Inc_BarPar, T00NE2_A5301Inc_BarPar[0]) != 0 ) || ( GXutil.strcmp(Z7499Inc_Maqcod, T00NE2_A7499Inc_Maqcod[0]) != 0 ) || ( Z8012Inc_St != T00NE2_A8012Inc_St[0] ) )
         {
            if ( !( GXutil.dateCompare(Z4932Inc_Hora, T00NE2_A4932Inc_Hora[0]) ) )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Hora");
               GXutil.writeLogRaw("Old: ",Z4932Inc_Hora);
               GXutil.writeLogRaw("Current: ",T00NE2_A4932Inc_Hora[0]);
            }
            if ( GXutil.strcmp(Z4933Inc_Usuari, T00NE2_A4933Inc_Usuari[0]) != 0 )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Usuari");
               GXutil.writeLogRaw("Old: ",Z4933Inc_Usuari);
               GXutil.writeLogRaw("Current: ",T00NE2_A4933Inc_Usuari[0]);
            }
            if ( GXutil.strcmp(Z4934Inc_Termin, T00NE2_A4934Inc_Termin[0]) != 0 )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Termin");
               GXutil.writeLogRaw("Old: ",Z4934Inc_Termin);
               GXutil.writeLogRaw("Current: ",T00NE2_A4934Inc_Termin[0]);
            }
            if ( GXutil.strcmp(Z4935Inc_Prog, T00NE2_A4935Inc_Prog[0]) != 0 )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Prog");
               GXutil.writeLogRaw("Old: ",Z4935Inc_Prog);
               GXutil.writeLogRaw("Current: ",T00NE2_A4935Inc_Prog[0]);
            }
            if ( GXutil.strcmp(Z4936Inc_Obs, T00NE2_A4936Inc_Obs[0]) != 0 )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Obs");
               GXutil.writeLogRaw("Old: ",Z4936Inc_Obs);
               GXutil.writeLogRaw("Current: ",T00NE2_A4936Inc_Obs[0]);
            }
            if ( Z5299Inc_Barcod != T00NE2_A5299Inc_Barcod[0] )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Barcod");
               GXutil.writeLogRaw("Old: ",Z5299Inc_Barcod);
               GXutil.writeLogRaw("Current: ",T00NE2_A5299Inc_Barcod[0]);
            }
            if ( Z5300Inc_BarReo != T00NE2_A5300Inc_BarReo[0] )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_BarReo");
               GXutil.writeLogRaw("Old: ",Z5300Inc_BarReo);
               GXutil.writeLogRaw("Current: ",T00NE2_A5300Inc_BarReo[0]);
            }
            if ( GXutil.strcmp(Z5301Inc_BarPar, T00NE2_A5301Inc_BarPar[0]) != 0 )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_BarPar");
               GXutil.writeLogRaw("Old: ",Z5301Inc_BarPar);
               GXutil.writeLogRaw("Current: ",T00NE2_A5301Inc_BarPar[0]);
            }
            if ( GXutil.strcmp(Z7499Inc_Maqcod, T00NE2_A7499Inc_Maqcod[0]) != 0 )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_Maqcod");
               GXutil.writeLogRaw("Old: ",Z7499Inc_Maqcod);
               GXutil.writeLogRaw("Current: ",T00NE2_A7499Inc_Maqcod[0]);
            }
            if ( Z8012Inc_St != T00NE2_A8012Inc_St[0] )
            {
               GXutil.writeLogln("tcrtinc:[seudo value changed for attri]"+"Inc_St");
               GXutil.writeLogRaw("Old: ",Z8012Inc_St);
               GXutil.writeLogRaw("Current: ",T00NE2_A8012Inc_St[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCRTIN1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertNE726( )
   {
      beforeValidateNE726( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNE726( ) ;
      }
      if ( AnyError == 0 )
      {
         zmNE726( 0) ;
         checkOptimisticConcurrencyNE726( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmNE726( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertNE726( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00NE19 */
                  pr_default.execute(17, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea), A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar, A7499Inc_Maqcod, Byte.valueOf(A8012Inc_St)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
                  if ( (pr_default.getStatus(17) == 1) )
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
            loadNE726( ) ;
         }
         endLevelNE726( ) ;
      }
      closeExtendedTableCursorsNE726( ) ;
   }

   public void updateNE726( )
   {
      beforeValidateNE726( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableNE726( ) ;
      }
      if ( ( nIsMod_726 != 0 ) || ( nIsDirty_726 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyNE726( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmNE726( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateNE726( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00NE20 */
                     pr_default.execute(18, new Object[] {A4932Inc_Hora, A4933Inc_Usuari, A4934Inc_Termin, A4935Inc_Prog, A4936Inc_Obs, Integer.valueOf(A5299Inc_Barcod), Byte.valueOf(A5300Inc_BarReo), A5301Inc_BarPar, A7499Inc_Maqcod, Byte.valueOf(A8012Inc_St), A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
                     if ( (pr_default.getStatus(18) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCRTIN1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateNE726( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyNE726( ) ;
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
            endLevelNE726( ) ;
         }
      }
      closeExtendedTableCursorsNE726( ) ;
   }

   public void deferredUpdateNE726( )
   {
   }

   public void deleteNE726( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateNE726( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyNE726( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsNE726( ) ;
         afterConfirmNE726( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteNE726( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00NE21 */
               pr_default.execute(19, new Object[] {A396EmprCod, A4929Inc_Dia, Long.valueOf(A4931Inc_Linea)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCRTIN1");
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
      sMode726 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelNE726( ) ;
      Gx_mode = sMode726 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsNE726( )
   {
      standaloneModalNE726( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13712Inc_obsTxt = GXutil.substring( A4936Inc_Obs, 1, 400) ;
         A13713Inc_Hdr = GXutil.trim( GXutil.str( A5299Inc_Barcod, 8, 0)) + "-" + GXutil.trim( GXutil.str( A5300Inc_BarReo, 1, 0)) + A5301Inc_BarPar ;
      }
   }

   public void endLevelNE726( )
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

   public void scanStartNE726( )
   {
      /* Scan By routine */
      /* Using cursor T00NE22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A4929Inc_Dia});
      RcdFound726 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound726 = (short)(1) ;
         A4931Inc_Linea = T00NE22_A4931Inc_Linea[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextNE726( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound726 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound726 = (short)(1) ;
         A4931Inc_Linea = T00NE22_A4931Inc_Linea[0] ;
      }
   }

   public void scanEndNE726( )
   {
      pr_default.close(20);
   }

   public void afterConfirmNE726( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertNE726( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateNE726( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteNE726( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteNE726( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateNE726( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesNE726( )
   {
      edtInc_Linea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Hora_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hora_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hora_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Usuari_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Usuari_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Usuari_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Termin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Termin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Termin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Prog_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Prog_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Prog_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Obs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Obs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Obs_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Barcod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_BarReo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_BarReo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_BarReo_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_BarPar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_BarPar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_BarPar_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_obsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_obsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_obsTxt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Hdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hdr_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Maqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Maqcod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_St_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_St_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_St_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashesNE726( )
   {
   }

   public void send_integrity_lvl_hashesNE725( )
   {
   }

   public void subsflControlProps_28726( )
   {
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_28_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_28_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_28_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_28_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_28_idx ;
      edtInc_Obs_Internalname = "INC_OBS_"+sGXsfl_28_idx ;
      edtInc_Barcod_Internalname = "INC_BARCOD_"+sGXsfl_28_idx ;
      edtInc_BarReo_Internalname = "INC_BARREO_"+sGXsfl_28_idx ;
      edtInc_BarPar_Internalname = "INC_BARPAR_"+sGXsfl_28_idx ;
      edtInc_obsTxt_Internalname = "INC_OBSTXT_"+sGXsfl_28_idx ;
      edtInc_Hdr_Internalname = "INC_HDR_"+sGXsfl_28_idx ;
      edtInc_Maqcod_Internalname = "INC_MAQCOD_"+sGXsfl_28_idx ;
      edtInc_St_Internalname = "INC_ST_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_28726( )
   {
      edtInc_Linea_Internalname = "INC_LINEA_"+sGXsfl_28_fel_idx ;
      edtInc_Hora_Internalname = "INC_HORA_"+sGXsfl_28_fel_idx ;
      edtInc_Usuari_Internalname = "INC_USUARI_"+sGXsfl_28_fel_idx ;
      edtInc_Termin_Internalname = "INC_TERMIN_"+sGXsfl_28_fel_idx ;
      edtInc_Prog_Internalname = "INC_PROG_"+sGXsfl_28_fel_idx ;
      edtInc_Obs_Internalname = "INC_OBS_"+sGXsfl_28_fel_idx ;
      edtInc_Barcod_Internalname = "INC_BARCOD_"+sGXsfl_28_fel_idx ;
      edtInc_BarReo_Internalname = "INC_BARREO_"+sGXsfl_28_fel_idx ;
      edtInc_BarPar_Internalname = "INC_BARPAR_"+sGXsfl_28_fel_idx ;
      edtInc_obsTxt_Internalname = "INC_OBSTXT_"+sGXsfl_28_fel_idx ;
      edtInc_Hdr_Internalname = "INC_HDR_"+sGXsfl_28_fel_idx ;
      edtInc_Maqcod_Internalname = "INC_MAQCOD_"+sGXsfl_28_fel_idx ;
      edtInc_St_Internalname = "INC_ST_"+sGXsfl_28_fel_idx ;
   }

   public void addRowNE726( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28726( ) ;
      sendRowNE726( ) ;
   }

   public void sendRowNE726( )
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
         if ( ((int)((nGXsfl_28_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Linea_Internalname,GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4931Inc_Linea), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Linea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_Linea_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Hora_Internalname,localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4932Inc_Hora, "99:99:99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 0,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Hora_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_Hora_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Usuari_Internalname,GXutil.rtrim( A4933Inc_Usuari),GXutil.rtrim( localUtil.format( A4933Inc_Usuari, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,31);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Usuari_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_Usuari_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Termin_Internalname,GXutil.rtrim( A4934Inc_Termin),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Termin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_Termin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Prog_Internalname,GXutil.rtrim( A4935Inc_Prog),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Prog_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_Prog_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Obs_Internalname,A4936Inc_Obs,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Obs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_Obs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Barcod_Internalname,GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtInc_Barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5299Inc_Barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5299Inc_Barcod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_Barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_BarReo_Internalname,GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtInc_BarReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5300Inc_BarReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A5300Inc_BarReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_BarReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_BarReo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_726_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_BarPar_Internalname,GXutil.rtrim( A5301Inc_BarPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_BarPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtInc_BarPar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_obsTxt_Internalname,A13712Inc_obsTxt,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_obsTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtInc_obsTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(400),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Hdr_Internalname,GXutil.rtrim( A13713Inc_Hdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Hdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtInc_Hdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_Maqcod_Internalname,GXutil.rtrim( A7499Inc_Maqcod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_Maqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtInc_Maqcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtInc_St_Internalname,GXutil.ltrim( localUtil.ntoc( A8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtInc_St_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A8012Inc_St), "9") : localUtil.format( DecimalUtil.doubleToDec(A8012Inc_St), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtInc_St_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtInc_St_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesNE726( ) ;
      GXCCtl = "Z4931Inc_Linea_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4931Inc_Linea, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z4932Inc_Hora_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z4932Inc_Hora, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z4933Inc_Usuari_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4933Inc_Usuari));
      GXCCtl = "Z4934Inc_Termin_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4934Inc_Termin));
      GXCCtl = "Z4935Inc_Prog_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z4935Inc_Prog));
      GXCCtl = "Z4936Inc_Obs_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z4936Inc_Obs);
      GXCCtl = "Z5299Inc_Barcod_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5299Inc_Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5300Inc_BarReo_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5300Inc_BarReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5301Inc_BarPar_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5301Inc_BarPar));
      GXCCtl = "Z7499Inc_Maqcod_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z7499Inc_Maqcod));
      GXCCtl = "Z8012Inc_St_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z8012Inc_St, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_726_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_726_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_726_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_726, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_28_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV35TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vINC_DIA_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( AV33Inc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_LINEA_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_HORA_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hora_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_USUARI_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Usuari_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_TERMIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Termin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_PROG_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Prog_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_OBS_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_BARCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_BARREO_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_BARPAR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_OBSTXT_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_obsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_HDR_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_MAQCOD_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "INC_ST_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_St_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowNE726( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28726( ) ;
      edtInc_Linea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_LINEA_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Hora_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_HORA_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Usuari_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_USUARI_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Termin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_TERMIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Prog_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_PROG_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Obs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_OBS_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Barcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_BARCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_BarReo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_BARREO_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_BarPar_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_BARPAR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_obsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_OBSTXT_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Hdr_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_HDR_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_Maqcod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_MAQCOD_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtInc_St_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "INC_ST_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
      {
         GXCCtl = "INC_LINEA_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInc_Linea_Internalname ;
         wbErr = true ;
         A4931Inc_Linea = 0 ;
      }
      else
      {
         A4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( edtInc_Linea_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtInc_Hora_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "INC_HORA_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badtime", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInc_Hora_Internalname ;
         wbErr = true ;
         A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      }
      else
      {
         A4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( edtInc_Hora_Internalname))) ;
      }
      A4933Inc_Usuari = GXutil.upper( httpContext.cgiGet( edtInc_Usuari_Internalname)) ;
      A4934Inc_Termin = httpContext.cgiGet( edtInc_Termin_Internalname) ;
      A4935Inc_Prog = httpContext.cgiGet( edtInc_Prog_Internalname) ;
      A4936Inc_Obs = httpContext.cgiGet( edtInc_Obs_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "INC_BARCOD_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInc_Barcod_Internalname ;
         wbErr = true ;
         A5299Inc_Barcod = 0 ;
      }
      else
      {
         A5299Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtInc_Barcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "INC_BARREO_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtInc_BarReo_Internalname ;
         wbErr = true ;
         A5300Inc_BarReo = (byte)(0) ;
      }
      else
      {
         A5300Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtInc_BarReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A5301Inc_BarPar = httpContext.cgiGet( edtInc_BarPar_Internalname) ;
      A13712Inc_obsTxt = httpContext.cgiGet( edtInc_obsTxt_Internalname) ;
      A13713Inc_Hdr = httpContext.cgiGet( edtInc_Hdr_Internalname) ;
      A7499Inc_Maqcod = httpContext.cgiGet( edtInc_Maqcod_Internalname) ;
      A8012Inc_St = (byte)(localUtil.ctol( httpContext.cgiGet( edtInc_St_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z4931Inc_Linea_" + sGXsfl_28_idx ;
      Z4931Inc_Linea = localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      GXCCtl = "Z4932Inc_Hora_" + sGXsfl_28_idx ;
      Z4932Inc_Hora = GXutil.resetDate(localUtil.ctot( httpContext.cgiGet( GXCCtl), 0)) ;
      GXCCtl = "Z4933Inc_Usuari_" + sGXsfl_28_idx ;
      Z4933Inc_Usuari = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4934Inc_Termin_" + sGXsfl_28_idx ;
      Z4934Inc_Termin = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4935Inc_Prog_" + sGXsfl_28_idx ;
      Z4935Inc_Prog = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4936Inc_Obs_" + sGXsfl_28_idx ;
      Z4936Inc_Obs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5299Inc_Barcod_" + sGXsfl_28_idx ;
      Z5299Inc_Barcod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5300Inc_BarReo_" + sGXsfl_28_idx ;
      Z5300Inc_BarReo = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5301Inc_BarPar_" + sGXsfl_28_idx ;
      Z5301Inc_BarPar = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z7499Inc_Maqcod_" + sGXsfl_28_idx ;
      Z7499Inc_Maqcod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8012Inc_St_" + sGXsfl_28_idx ;
      Z8012Inc_St = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_726_" + sGXsfl_28_idx ;
      nRcdDeleted_726 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_726_" + sGXsfl_28_idx ;
      nRcdExists_726 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_726_" + sGXsfl_28_idx ;
      nIsMod_726 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtInc_St_Enabled = edtInc_St_Enabled ;
      defedtInc_Maqcod_Enabled = edtInc_Maqcod_Enabled ;
      defedtInc_Hdr_Enabled = edtInc_Hdr_Enabled ;
      defedtInc_obsTxt_Enabled = edtInc_obsTxt_Enabled ;
      defedtInc_Linea_Enabled = edtInc_Linea_Enabled ;
   }

   public void confirmValuesNE0( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28726( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28726( ) ;
         httpContext.changePostValue( "Z4931Inc_Linea_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z4931Inc_Linea_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4931Inc_Linea_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z4932Inc_Hora_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z4932Inc_Hora_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4932Inc_Hora_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z4933Inc_Usuari_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z4933Inc_Usuari_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4933Inc_Usuari_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z4934Inc_Termin_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z4934Inc_Termin_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4934Inc_Termin_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z4935Inc_Prog_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z4935Inc_Prog_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4935Inc_Prog_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z4936Inc_Obs_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z4936Inc_Obs_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4936Inc_Obs_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z5299Inc_Barcod_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z5299Inc_Barcod_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5299Inc_Barcod_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z5300Inc_BarReo_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z5300Inc_BarReo_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5300Inc_BarReo_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z5301Inc_BarPar_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z5301Inc_BarPar_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5301Inc_BarPar_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z7499Inc_Maqcod_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z7499Inc_Maqcod_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7499Inc_Maqcod_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z8012Inc_St_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z8012Inc_St_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8012Inc_St_"+sGXsfl_28_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcrtinc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV33Inc_Dia))}, new String[] {"Gx_mode","EmprCod","Inc_Dia"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCRTINC");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tcrtinc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4929Inc_Dia", localUtil.dtoc( Z4929Inc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4930Inc_Num_ul", GXutil.ltrim( localUtil.ntoc( Z4930Inc_Num_ul, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O4930Inc_Num_ul", GXutil.ltrim( localUtil.ntoc( O4930Inc_Num_ul, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV35TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV35TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV35TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINC_DIA", localUtil.dtoc( AV33Inc_Dia, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vINC_DIA", getSecureSignedToken( "", AV33Inc_Dia));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.tcrtinc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.formatDateParm(AV33Inc_Dia))}, new String[] {"Gx_mode","EmprCod","Inc_Dia"})  ;
   }

   public String getPgmname( )
   {
      return "TCRTINC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control de Incidencias", "") ;
   }

   public void initializeNonKeyNE725( )
   {
      A4930Inc_Num_ul = 0 ;
      n4930Inc_Num_ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      O4930Inc_Num_ul = A4930Inc_Num_ul ;
      n4930Inc_Num_ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
      Z4930Inc_Num_ul = 0 ;
   }

   public void initAllNE725( )
   {
      A4929Inc_Dia = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A4929Inc_Dia", localUtil.format(A4929Inc_Dia, "99/99/99"));
      initializeNonKeyNE725( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyNE726( )
   {
      A13713Inc_Hdr = "" ;
      A13712Inc_obsTxt = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A5299Inc_Barcod = 0 ;
      A5300Inc_BarReo = (byte)(0) ;
      A5301Inc_BarPar = "" ;
      A7499Inc_Maqcod = "" ;
      A8012Inc_St = (byte)(0) ;
      Z4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      Z4933Inc_Usuari = "" ;
      Z4934Inc_Termin = "" ;
      Z4935Inc_Prog = "" ;
      Z4936Inc_Obs = "" ;
      Z5299Inc_Barcod = 0 ;
      Z5300Inc_BarReo = (byte)(0) ;
      Z5301Inc_BarPar = "" ;
      Z7499Inc_Maqcod = "" ;
      Z8012Inc_St = (byte)(0) ;
   }

   public void initAllNE726( )
   {
      A4931Inc_Linea = 0 ;
      initializeNonKeyNE726( ) ;
   }

   public void standaloneModalInsertNE726( )
   {
      A4930Inc_Num_ul = i4930Inc_Num_ul ;
      n4930Inc_Num_ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4930Inc_Num_ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4930Inc_Num_ul), 10, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655331", true, true);
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
      httpContext.AddJavascriptSource("tcrtinc.js", "?20268211655331", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties726( )
   {
      edtInc_St_Enabled = defedtInc_St_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_St_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_St_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Maqcod_Enabled = defedtInc_Maqcod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Maqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Maqcod_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Hdr_Enabled = defedtInc_Hdr_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Hdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Hdr_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_obsTxt_Enabled = defedtInc_obsTxt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_obsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_obsTxt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtInc_Linea_Enabled = defedtInc_Linea_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtInc_Linea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtInc_Linea_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void startgridcontrol28( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4931Inc_Linea, (byte)(10), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Linea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", localUtil.ttoc( A4932Inc_Hora, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hora_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4933Inc_Usuari));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Usuari_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4934Inc_Termin));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Termin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4935Inc_Prog));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Prog_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", A4936Inc_Obs);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Obs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5299Inc_Barcod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5300Inc_BarReo, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarReo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5301Inc_BarPar));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_BarPar_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", A13712Inc_obsTxt);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_obsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13713Inc_Hdr));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Hdr_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A7499Inc_Maqcod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_Maqcod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A8012Inc_St, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtInc_St_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtInc_Dia_Internalname = "INC_DIA" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtInc_Linea_Internalname = "INC_LINEA" ;
      edtInc_Hora_Internalname = "INC_HORA" ;
      edtInc_Usuari_Internalname = "INC_USUARI" ;
      edtInc_Termin_Internalname = "INC_TERMIN" ;
      edtInc_Prog_Internalname = "INC_PROG" ;
      edtInc_Obs_Internalname = "INC_OBS" ;
      edtInc_Barcod_Internalname = "INC_BARCOD" ;
      edtInc_BarReo_Internalname = "INC_BARREO" ;
      edtInc_BarPar_Internalname = "INC_BARPAR" ;
      edtInc_obsTxt_Internalname = "INC_OBSTXT" ;
      edtInc_Hdr_Internalname = "INC_HDR" ;
      edtInc_Maqcod_Internalname = "INC_MAQCOD" ;
      edtInc_St_Internalname = "INC_ST" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtInc_Num_ul_Internalname = "INC_NUM_UL" ;
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
      Form.setCaption( httpContext.getMessage( "Control de Incidencias", "") );
      edtInc_St_Jsonclick = "" ;
      edtInc_Maqcod_Jsonclick = "" ;
      edtInc_Hdr_Jsonclick = "" ;
      edtInc_obsTxt_Jsonclick = "" ;
      edtInc_BarPar_Jsonclick = "" ;
      edtInc_BarReo_Jsonclick = "" ;
      edtInc_Barcod_Jsonclick = "" ;
      edtInc_Obs_Jsonclick = "" ;
      edtInc_Prog_Jsonclick = "" ;
      edtInc_Termin_Jsonclick = "" ;
      edtInc_Usuari_Jsonclick = "" ;
      edtInc_Hora_Jsonclick = "" ;
      edtInc_Linea_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtInc_St_Enabled = 0 ;
      edtInc_Maqcod_Enabled = 0 ;
      edtInc_Hdr_Enabled = 0 ;
      edtInc_obsTxt_Enabled = 0 ;
      edtInc_BarPar_Enabled = 1 ;
      edtInc_BarReo_Enabled = 1 ;
      edtInc_Barcod_Enabled = 1 ;
      edtInc_Obs_Enabled = 1 ;
      edtInc_Prog_Enabled = 1 ;
      edtInc_Termin_Enabled = 1 ;
      edtInc_Usuari_Enabled = 1 ;
      edtInc_Hora_Enabled = 1 ;
      edtInc_Linea_Enabled = 1 ;
      edtInc_Num_ul_Jsonclick = "" ;
      edtInc_Num_ul_Enabled = 0 ;
      edtInc_Num_ul_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtInc_Dia_Jsonclick = "" ;
      edtInc_Dia_Enabled = 1 ;
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

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_28726( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalNE726( ) ;
         standaloneModalNE726( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowNE726( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28726( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33Inc_Dia',fld:'vINC_DIA',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33Inc_Dia',fld:'vINC_DIA',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12NE2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_INC_DIA","{handler:'valid_Inc_dia',iparms:[]");
      setEventMetadata("VALID_INC_DIA",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_INC_NUM_UL","{handler:'valid_Inc_num_ul',iparms:[]");
      setEventMetadata("VALID_INC_NUM_UL",",oparms:[]}");
      setEventMetadata("VALID_INC_LINEA","{handler:'valid_Inc_linea',iparms:[]");
      setEventMetadata("VALID_INC_LINEA",",oparms:[]}");
      setEventMetadata("VALID_INC_OBS","{handler:'valid_Inc_obs',iparms:[]");
      setEventMetadata("VALID_INC_OBS",",oparms:[]}");
      setEventMetadata("VALID_INC_BARCOD","{handler:'valid_Inc_barcod',iparms:[]");
      setEventMetadata("VALID_INC_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_INC_BARREO","{handler:'valid_Inc_barreo',iparms:[]");
      setEventMetadata("VALID_INC_BARREO",",oparms:[]}");
      setEventMetadata("VALID_INC_BARPAR","{handler:'valid_Inc_barpar',iparms:[]");
      setEventMetadata("VALID_INC_BARPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Inc_st',iparms:[]");
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
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV33Inc_Dia = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z4929Inc_Dia = GXutil.nullDate() ;
      Z4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      Z4933Inc_Usuari = "" ;
      Z4934Inc_Termin = "" ;
      Z4935Inc_Prog = "" ;
      Z4936Inc_Obs = "" ;
      Z5301Inc_BarPar = "" ;
      Z7499Inc_Maqcod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV33Inc_Dia = GXutil.nullDate() ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4929Inc_Dia = GXutil.nullDate() ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode726 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode725 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A4932Inc_Hora = GXutil.resetTime( GXutil.nullDate() );
      A4933Inc_Usuari = "" ;
      A4934Inc_Termin = "" ;
      A4935Inc_Prog = "" ;
      A4936Inc_Obs = "" ;
      A5301Inc_BarPar = "" ;
      A13712Inc_obsTxt = "" ;
      A13713Inc_Hdr = "" ;
      A7499Inc_Maqcod = "" ;
      AV29Station = "" ;
      AV31EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00NE6_A407EmprNom = new String[] {""} ;
      T00NE6_n407EmprNom = new boolean[] {false} ;
      T00NE7_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE7_A407EmprNom = new String[] {""} ;
      T00NE7_n407EmprNom = new boolean[] {false} ;
      T00NE7_A4930Inc_Num_ul = new long[1] ;
      T00NE7_n4930Inc_Num_ul = new boolean[] {false} ;
      T00NE7_A396EmprCod = new String[] {""} ;
      T00NE8_A396EmprCod = new String[] {""} ;
      T00NE8_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE5_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE5_A4930Inc_Num_ul = new long[1] ;
      T00NE5_n4930Inc_Num_ul = new boolean[] {false} ;
      T00NE5_A396EmprCod = new String[] {""} ;
      T00NE9_A396EmprCod = new String[] {""} ;
      T00NE9_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE10_A396EmprCod = new String[] {""} ;
      T00NE10_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE4_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE4_A4930Inc_Num_ul = new long[1] ;
      T00NE4_n4930Inc_Num_ul = new boolean[] {false} ;
      T00NE4_A396EmprCod = new String[] {""} ;
      T00NE14_A396EmprCod = new String[] {""} ;
      T00NE14_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE14_A5728JBCLLin = new short[1] ;
      T00NE16_A396EmprCod = new String[] {""} ;
      T00NE16_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE17_A396EmprCod = new String[] {""} ;
      T00NE17_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE17_A4931Inc_Linea = new long[1] ;
      T00NE17_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE17_A4933Inc_Usuari = new String[] {""} ;
      T00NE17_A4934Inc_Termin = new String[] {""} ;
      T00NE17_A4935Inc_Prog = new String[] {""} ;
      T00NE17_A4936Inc_Obs = new String[] {""} ;
      T00NE17_A5299Inc_Barcod = new int[1] ;
      T00NE17_A5300Inc_BarReo = new byte[1] ;
      T00NE17_A5301Inc_BarPar = new String[] {""} ;
      T00NE17_A7499Inc_Maqcod = new String[] {""} ;
      T00NE17_A8012Inc_St = new byte[1] ;
      T00NE18_A396EmprCod = new String[] {""} ;
      T00NE18_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE18_A4931Inc_Linea = new long[1] ;
      T00NE3_A396EmprCod = new String[] {""} ;
      T00NE3_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE3_A4931Inc_Linea = new long[1] ;
      T00NE3_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE3_A4933Inc_Usuari = new String[] {""} ;
      T00NE3_A4934Inc_Termin = new String[] {""} ;
      T00NE3_A4935Inc_Prog = new String[] {""} ;
      T00NE3_A4936Inc_Obs = new String[] {""} ;
      T00NE3_A5299Inc_Barcod = new int[1] ;
      T00NE3_A5300Inc_BarReo = new byte[1] ;
      T00NE3_A5301Inc_BarPar = new String[] {""} ;
      T00NE3_A7499Inc_Maqcod = new String[] {""} ;
      T00NE3_A8012Inc_St = new byte[1] ;
      T00NE2_A396EmprCod = new String[] {""} ;
      T00NE2_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE2_A4931Inc_Linea = new long[1] ;
      T00NE2_A4932Inc_Hora = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE2_A4933Inc_Usuari = new String[] {""} ;
      T00NE2_A4934Inc_Termin = new String[] {""} ;
      T00NE2_A4935Inc_Prog = new String[] {""} ;
      T00NE2_A4936Inc_Obs = new String[] {""} ;
      T00NE2_A5299Inc_Barcod = new int[1] ;
      T00NE2_A5300Inc_BarReo = new byte[1] ;
      T00NE2_A5301Inc_BarPar = new String[] {""} ;
      T00NE2_A7499Inc_Maqcod = new String[] {""} ;
      T00NE2_A8012Inc_St = new byte[1] ;
      T00NE22_A396EmprCod = new String[] {""} ;
      T00NE22_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T00NE22_A4931Inc_Linea = new long[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcrtinc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcrtinc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcrtinc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcrtinc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcrtinc__default(),
         new Object[] {
             new Object[] {
            T00NE2_A396EmprCod, T00NE2_A4929Inc_Dia, T00NE2_A4931Inc_Linea, T00NE2_A4932Inc_Hora, T00NE2_A4933Inc_Usuari, T00NE2_A4934Inc_Termin, T00NE2_A4935Inc_Prog, T00NE2_A4936Inc_Obs, T00NE2_A5299Inc_Barcod, T00NE2_A5300Inc_BarReo,
            T00NE2_A5301Inc_BarPar, T00NE2_A7499Inc_Maqcod, T00NE2_A8012Inc_St
            }
            , new Object[] {
            T00NE3_A396EmprCod, T00NE3_A4929Inc_Dia, T00NE3_A4931Inc_Linea, T00NE3_A4932Inc_Hora, T00NE3_A4933Inc_Usuari, T00NE3_A4934Inc_Termin, T00NE3_A4935Inc_Prog, T00NE3_A4936Inc_Obs, T00NE3_A5299Inc_Barcod, T00NE3_A5300Inc_BarReo,
            T00NE3_A5301Inc_BarPar, T00NE3_A7499Inc_Maqcod, T00NE3_A8012Inc_St
            }
            , new Object[] {
            T00NE4_A4929Inc_Dia, T00NE4_A4930Inc_Num_ul, T00NE4_n4930Inc_Num_ul, T00NE4_A396EmprCod
            }
            , new Object[] {
            T00NE5_A4929Inc_Dia, T00NE5_A4930Inc_Num_ul, T00NE5_n4930Inc_Num_ul, T00NE5_A396EmprCod
            }
            , new Object[] {
            T00NE6_A407EmprNom, T00NE6_n407EmprNom
            }
            , new Object[] {
            T00NE7_A4929Inc_Dia, T00NE7_A407EmprNom, T00NE7_n407EmprNom, T00NE7_A4930Inc_Num_ul, T00NE7_n4930Inc_Num_ul, T00NE7_A396EmprCod
            }
            , new Object[] {
            T00NE8_A396EmprCod, T00NE8_A4929Inc_Dia
            }
            , new Object[] {
            T00NE9_A396EmprCod, T00NE9_A4929Inc_Dia
            }
            , new Object[] {
            T00NE10_A396EmprCod, T00NE10_A4929Inc_Dia
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00NE14_A396EmprCod, T00NE14_A4929Inc_Dia, T00NE14_A5728JBCLLin
            }
            , new Object[] {
            }
            , new Object[] {
            T00NE16_A396EmprCod, T00NE16_A4929Inc_Dia
            }
            , new Object[] {
            T00NE17_A396EmprCod, T00NE17_A4929Inc_Dia, T00NE17_A4931Inc_Linea, T00NE17_A4932Inc_Hora, T00NE17_A4933Inc_Usuari, T00NE17_A4934Inc_Termin, T00NE17_A4935Inc_Prog, T00NE17_A4936Inc_Obs, T00NE17_A5299Inc_Barcod, T00NE17_A5300Inc_BarReo,
            T00NE17_A5301Inc_BarPar, T00NE17_A7499Inc_Maqcod, T00NE17_A8012Inc_St
            }
            , new Object[] {
            T00NE18_A396EmprCod, T00NE18_A4929Inc_Dia, T00NE18_A4931Inc_Linea
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00NE22_A396EmprCod, T00NE22_A4929Inc_Dia, T00NE22_A4931Inc_Linea
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z5300Inc_BarReo ;
   private byte Z8012Inc_St ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A5300Inc_BarReo ;
   private byte A8012Inc_St ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_726 ;
   private short nRcdExists_726 ;
   private short nIsMod_726 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount726 ;
   private short RcdFound726 ;
   private short nBlankRcdUsr726 ;
   private short RcdFound725 ;
   private short nIsDirty_725 ;
   private short nIsDirty_726 ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int Z5299Inc_Barcod ;
   private int trnEnded ;
   private int edtInc_Dia_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtInc_Num_ul_Enabled ;
   private int edtInc_Num_ul_Visible ;
   private int edtInc_Linea_Enabled ;
   private int edtInc_Hora_Enabled ;
   private int edtInc_Usuari_Enabled ;
   private int edtInc_Termin_Enabled ;
   private int edtInc_Prog_Enabled ;
   private int edtInc_Obs_Enabled ;
   private int edtInc_Barcod_Enabled ;
   private int edtInc_BarReo_Enabled ;
   private int edtInc_BarPar_Enabled ;
   private int edtInc_obsTxt_Enabled ;
   private int edtInc_Hdr_Enabled ;
   private int edtInc_Maqcod_Enabled ;
   private int edtInc_St_Enabled ;
   private int fRowAdded ;
   private int A5299Inc_Barcod ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtInc_St_Enabled ;
   private int defedtInc_Maqcod_Enabled ;
   private int defedtInc_Hdr_Enabled ;
   private int defedtInc_obsTxt_Enabled ;
   private int defedtInc_Linea_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long Z4930Inc_Num_ul ;
   private long O4930Inc_Num_ul ;
   private long Z4931Inc_Linea ;
   private long A4930Inc_Num_ul ;
   private long B4930Inc_Num_ul ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long s4930Inc_Num_ul ;
   private long A4931Inc_Linea ;
   private long i4930Inc_Num_ul ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String Z396EmprCod ;
   private String Z4933Inc_Usuari ;
   private String Z4934Inc_Termin ;
   private String Z4935Inc_Prog ;
   private String Z5301Inc_BarPar ;
   private String Z7499Inc_Maqcod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtInc_Dia_Internalname ;
   private String sGXsfl_28_idx="0001" ;
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
   private String edtInc_Dia_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtInc_Num_ul_Internalname ;
   private String edtInc_Num_ul_Jsonclick ;
   private String sMode726 ;
   private String edtInc_Linea_Internalname ;
   private String edtInc_Hora_Internalname ;
   private String edtInc_Usuari_Internalname ;
   private String edtInc_Termin_Internalname ;
   private String edtInc_Prog_Internalname ;
   private String edtInc_Obs_Internalname ;
   private String edtInc_Barcod_Internalname ;
   private String edtInc_BarReo_Internalname ;
   private String edtInc_BarPar_Internalname ;
   private String edtInc_obsTxt_Internalname ;
   private String edtInc_Hdr_Internalname ;
   private String edtInc_Maqcod_Internalname ;
   private String edtInc_St_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode725 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A4933Inc_Usuari ;
   private String A4934Inc_Termin ;
   private String A4935Inc_Prog ;
   private String A5301Inc_BarPar ;
   private String A13713Inc_Hdr ;
   private String A7499Inc_Maqcod ;
   private String AV29Station ;
   private String AV31EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtInc_Linea_Jsonclick ;
   private String edtInc_Hora_Jsonclick ;
   private String edtInc_Usuari_Jsonclick ;
   private String edtInc_Termin_Jsonclick ;
   private String edtInc_Prog_Jsonclick ;
   private String edtInc_Obs_Jsonclick ;
   private String edtInc_Barcod_Jsonclick ;
   private String edtInc_BarReo_Jsonclick ;
   private String edtInc_BarPar_Jsonclick ;
   private String edtInc_obsTxt_Jsonclick ;
   private String edtInc_Hdr_Jsonclick ;
   private String edtInc_Maqcod_Jsonclick ;
   private String edtInc_St_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private java.util.Date Z4932Inc_Hora ;
   private java.util.Date A4932Inc_Hora ;
   private java.util.Date wcpOAV33Inc_Dia ;
   private java.util.Date Z4929Inc_Dia ;
   private java.util.Date AV33Inc_Dia ;
   private java.util.Date A4929Inc_Dia ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n4930Inc_Num_ul ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_28_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z4936Inc_Obs ;
   private String A4936Inc_Obs ;
   private String A13712Inc_obsTxt ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00NE6_A407EmprNom ;
   private boolean[] T00NE6_n407EmprNom ;
   private java.util.Date[] T00NE7_A4929Inc_Dia ;
   private String[] T00NE7_A407EmprNom ;
   private boolean[] T00NE7_n407EmprNom ;
   private long[] T00NE7_A4930Inc_Num_ul ;
   private boolean[] T00NE7_n4930Inc_Num_ul ;
   private String[] T00NE7_A396EmprCod ;
   private String[] T00NE8_A396EmprCod ;
   private java.util.Date[] T00NE8_A4929Inc_Dia ;
   private java.util.Date[] T00NE5_A4929Inc_Dia ;
   private long[] T00NE5_A4930Inc_Num_ul ;
   private boolean[] T00NE5_n4930Inc_Num_ul ;
   private String[] T00NE5_A396EmprCod ;
   private String[] T00NE9_A396EmprCod ;
   private java.util.Date[] T00NE9_A4929Inc_Dia ;
   private String[] T00NE10_A396EmprCod ;
   private java.util.Date[] T00NE10_A4929Inc_Dia ;
   private java.util.Date[] T00NE4_A4929Inc_Dia ;
   private long[] T00NE4_A4930Inc_Num_ul ;
   private boolean[] T00NE4_n4930Inc_Num_ul ;
   private String[] T00NE4_A396EmprCod ;
   private String[] T00NE14_A396EmprCod ;
   private java.util.Date[] T00NE14_A4929Inc_Dia ;
   private short[] T00NE14_A5728JBCLLin ;
   private String[] T00NE16_A396EmprCod ;
   private java.util.Date[] T00NE16_A4929Inc_Dia ;
   private String[] T00NE17_A396EmprCod ;
   private java.util.Date[] T00NE17_A4929Inc_Dia ;
   private long[] T00NE17_A4931Inc_Linea ;
   private java.util.Date[] T00NE17_A4932Inc_Hora ;
   private String[] T00NE17_A4933Inc_Usuari ;
   private String[] T00NE17_A4934Inc_Termin ;
   private String[] T00NE17_A4935Inc_Prog ;
   private String[] T00NE17_A4936Inc_Obs ;
   private int[] T00NE17_A5299Inc_Barcod ;
   private byte[] T00NE17_A5300Inc_BarReo ;
   private String[] T00NE17_A5301Inc_BarPar ;
   private String[] T00NE17_A7499Inc_Maqcod ;
   private byte[] T00NE17_A8012Inc_St ;
   private String[] T00NE18_A396EmprCod ;
   private java.util.Date[] T00NE18_A4929Inc_Dia ;
   private long[] T00NE18_A4931Inc_Linea ;
   private String[] T00NE3_A396EmprCod ;
   private java.util.Date[] T00NE3_A4929Inc_Dia ;
   private long[] T00NE3_A4931Inc_Linea ;
   private java.util.Date[] T00NE3_A4932Inc_Hora ;
   private String[] T00NE3_A4933Inc_Usuari ;
   private String[] T00NE3_A4934Inc_Termin ;
   private String[] T00NE3_A4935Inc_Prog ;
   private String[] T00NE3_A4936Inc_Obs ;
   private int[] T00NE3_A5299Inc_Barcod ;
   private byte[] T00NE3_A5300Inc_BarReo ;
   private String[] T00NE3_A5301Inc_BarPar ;
   private String[] T00NE3_A7499Inc_Maqcod ;
   private byte[] T00NE3_A8012Inc_St ;
   private String[] T00NE2_A396EmprCod ;
   private java.util.Date[] T00NE2_A4929Inc_Dia ;
   private long[] T00NE2_A4931Inc_Linea ;
   private java.util.Date[] T00NE2_A4932Inc_Hora ;
   private String[] T00NE2_A4933Inc_Usuari ;
   private String[] T00NE2_A4934Inc_Termin ;
   private String[] T00NE2_A4935Inc_Prog ;
   private String[] T00NE2_A4936Inc_Obs ;
   private int[] T00NE2_A5299Inc_Barcod ;
   private byte[] T00NE2_A5300Inc_BarReo ;
   private String[] T00NE2_A5301Inc_BarPar ;
   private String[] T00NE2_A7499Inc_Maqcod ;
   private byte[] T00NE2_A8012Inc_St ;
   private String[] T00NE22_A396EmprCod ;
   private java.util.Date[] T00NE22_A4929Inc_Dia ;
   private long[] T00NE22_A4931Inc_Linea ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
}

final  class tcrtinc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcrtinc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcrtinc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcrtinc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcrtinc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00NE2", "SELECT EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St FROM TXPCRTIN1 WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ?  FOR UPDATE OF Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE3", "SELECT EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St FROM TXPCRTIN1 WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE4", "SELECT Inc_Dia, Inc_Num_ul, EmprCod FROM TXPCRTINC WHERE EmprCod = ? AND Inc_Dia = ?  FOR UPDATE OF Inc_Num_ul NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE5", "SELECT Inc_Dia, Inc_Num_ul, EmprCod FROM TXPCRTINC WHERE EmprCod = ? AND Inc_Dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE7", "SELECT /*+ FIRST_ROWS(100) */ TM1.Inc_Dia, T2.EmprNom, TM1.Inc_Num_ul, TM1.EmprCod FROM (TXPCRTINC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Inc_Dia = ? ORDER BY TM1.EmprCod, TM1.Inc_Dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Inc_Dia FROM TXPCRTINC WHERE EmprCod = ? AND Inc_Dia = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Inc_Dia FROM TXPCRTINC WHERE ( Inc_Dia > ?) and EmprCod = ? ORDER BY EmprCod, Inc_Dia) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00NE10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Inc_Dia FROM TXPCRTINC WHERE ( Inc_Dia < ?) and EmprCod = ? ORDER BY EmprCod DESC, Inc_Dia DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00NE11", "INSERT INTO TXPCRTINC(Inc_Dia, Inc_Num_ul, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPCRTINC")
         ,new UpdateCursor("T00NE12", "UPDATE TXPCRTINC SET Inc_Num_ul=?  WHERE EmprCod = ? AND Inc_Dia = ?", GX_NOMASK, "TXPCRTINC")
         ,new UpdateCursor("T00NE13", "DELETE FROM TXPCRTINC  WHERE EmprCod = ? AND Inc_Dia = ?", GX_NOMASK, "TXPCRTINC")
         ,new ForEachCursor("T00NE14", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND Inc_Dia = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00NE15", "UPDATE TXPCRTINC SET Inc_Num_ul=?  WHERE EmprCod = ? AND Inc_Dia = ?", GX_NOMASK, "TXPCRTINC")
         ,new ForEachCursor("T00NE16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Inc_Dia FROM TXPCRTINC WHERE EmprCod = ? ORDER BY EmprCod, Inc_Dia ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE17", "SELECT EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St FROM TXPCRTIN1 WHERE EmprCod = ? and Inc_Dia = ? and Inc_Linea = ? ORDER BY EmprCod, Inc_Dia, Inc_Linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00NE18", "SELECT EmprCod, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00NE19", "INSERT INTO TXPCRTIN1(EmprCod, Inc_Dia, Inc_Linea, Inc_Hora, Inc_Usuari, Inc_Termin, Inc_Prog, Inc_Obs, Inc_Barcod, Inc_BarReo, Inc_BarPar, Inc_Maqcod, Inc_St) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCRTIN1")
         ,new UpdateCursor("T00NE20", "UPDATE TXPCRTIN1 SET Inc_Hora=?, Inc_Usuari=?, Inc_Termin=?, Inc_Prog=?, Inc_Obs=?, Inc_Barcod=?, Inc_BarReo=?, Inc_BarPar=?, Inc_Maqcod=?, Inc_St=?  WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ?", GX_NOMASK, "TXPCRTIN1")
         ,new UpdateCursor("T00NE21", "DELETE FROM TXPCRTIN1  WHERE EmprCod = ? AND Inc_Dia = ? AND Inc_Linea = ?", GX_NOMASK, "TXPCRTIN1")
         ,new ForEachCursor("T00NE22", "SELECT EmprCod, Inc_Dia, Inc_Linea FROM TXPCRTIN1 WHERE EmprCod = ? and Inc_Dia = ? ORDER BY EmprCod, Inc_Dia, Inc_Linea ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               return;
            case 2 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((long[]) buf[3])[0] = rslt.getLong(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = GXutil.resetDate(rslt.getGXDateTime(4));
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 10);
               ((String[]) buf[6])[0] = rslt.getString(7, 10);
               ((String[]) buf[7])[0] = rslt.getVarchar(8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((String[]) buf[11])[0] = rslt.getString(12, 6);
               ((byte[]) buf[12])[0] = rslt.getByte(13);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 7 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 8 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(2, ((Number) parms[2]).longValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(1, ((Number) parms[1]).longValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setDate(3, (java.util.Date)parms[3]);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setDateTime(4, (java.util.Date)parms[3], true);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setString(6, (String)parms[5], 10);
               stmt.setString(7, (String)parms[6], 10);
               stmt.setVarchar(8, (String)parms[7], 400, false);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 1);
               stmt.setString(12, (String)parms[11], 6);
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               return;
            case 18 :
               stmt.setDateTime(1, (java.util.Date)parms[0], true);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 10);
               stmt.setString(4, (String)parms[3], 10);
               stmt.setVarchar(5, (String)parms[4], 400, false);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 6);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 3);
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setLong(13, ((Number) parms[12]).longValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               return;
      }
   }

}

