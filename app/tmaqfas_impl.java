package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmaqfas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"MAQFFACT") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1142MaqFCod = httpContext.GetPar( "MaqFCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asamaqffact1G152( A396EmprCod, A1142MaqFCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1142MaqFCod = httpContext.GetPar( "MaqFCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A1142MaqFCod) ;
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
            AV29EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
            AV30MaqCod = httpContext.GetPar( "MaqCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30MaqCod", AV30MaqCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30MaqCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "MAQUINAS POR FASE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbMaqFasUni.getInternalname() ;
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
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

   public tmaqfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmaqfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmaqfas_impl.class ));
   }

   public tmaqfas_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMaqFasUni = new HTMLChoice();
      chkMaqFFAct = UIFactory.getCheckbox(this);
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
      if ( cmbMaqFasUni.getItemCount() > 0 )
      {
         A1257MaqFasUni = cmbMaqFasUni.getValidValue(A1257MaqFasUni) ;
         n1257MaqFasUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMaqFasUni.setValue( GXutil.rtrim( A1257MaqFasUni) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMaqFasUni.getInternalname(), "Values", cmbMaqFasUni.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqCod_Internalname, httpContext.getMessage( "Código Máquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod), GXutil.rtrim( localUtil.format( A602MaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMaqDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMaqDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMaqDsc_Internalname, GXutil.rtrim( A606MaqDsc), GXutil.rtrim( localUtil.format( A606MaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMaqDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMaqFasUni.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMaqFasUni.getInternalname(), httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMaqFasUni, cmbMaqFasUni.getInternalname(), GXutil.rtrim( A1257MaqFasUni), 1, cmbMaqFasUni.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMaqFasUni.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "", true, (byte)(0), "HLP_TMAQFAS.htm");
      cmbMaqFasUni.setValue( GXutil.rtrim( A1257MaqFasUni) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqFasUni.getInternalname(), "Values", cmbMaqFasUni.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMAQFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV37Pgmname), GXutil.rtrim( localUtil.format( AV37Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMAQFAS.htm");
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
      /* User Defined Control */
      ucCombo_maqfcod.setProperty("Caption", Combo_maqfcod_Caption);
      ucCombo_maqfcod.setProperty("Cls", Combo_maqfcod_Cls);
      ucCombo_maqfcod.setProperty("IsGridItem", Combo_maqfcod_Isgriditem);
      ucCombo_maqfcod.setProperty("EmptyItem", Combo_maqfcod_Emptyitem);
      ucCombo_maqfcod.setProperty("DropDownOptionsTitleSettingsIcons", AV36DDO_TitleSettingsIcons);
      ucCombo_maqfcod.setProperty("DropDownOptionsData", AV34MaqFCod_Data);
      ucCombo_maqfcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_maqfcod_Internalname, "COMBO_MAQFCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol36( ) ;
      nGXsfl_36_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount152 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_152 = (short)(1) ;
            scanStart1G152( ) ;
            while ( RcdFound152 != 0 )
            {
               init_level_properties152( ) ;
               getByPrimaryKey1G152( ) ;
               addRow1G152( ) ;
               scanNext1G152( ) ;
            }
            scanEnd1G152( ) ;
            nBlankRcdCount152 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1G152( ) ;
         standaloneModal1G152( ) ;
         sMode152 = Gx_mode ;
         while ( nGXsfl_36_idx < nRC_GXsfl_36 )
         {
            bGXsfl_36_Refreshing = true ;
            readRow1G152( ) ;
            edtMaqFCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQFCOD_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqFCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFCod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
            chkMaqFFAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MAQFFACT_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkMaqFFAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkMaqFFAct.getEnabled(), 5, 0), !bGXsfl_36_Refreshing);
            if ( ( nRcdExists_152 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1G152( ) ;
            }
            sendRow1G152( ) ;
            bGXsfl_36_Refreshing = false ;
         }
         Gx_mode = sMode152 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount152 = (short)(5) ;
         nRcdExists_152 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1G152( ) ;
            while ( RcdFound152 != 0 )
            {
               sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_36152( ) ;
               init_level_properties152( ) ;
               standaloneNotModal1G152( ) ;
               getByPrimaryKey1G152( ) ;
               standaloneModal1G152( ) ;
               addRow1G152( ) ;
               scanNext1G152( ) ;
            }
            scanEnd1G152( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode152 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_36152( ) ;
         initAll1G152( ) ;
         init_level_properties152( ) ;
         nRcdExists_152 = (short)(0) ;
         nIsMod_152 = (short)(0) ;
         nRcdDeleted_152 = (short)(0) ;
         nBlankRcdCount152 = (short)(nBlankRcdUsr152+nBlankRcdCount152) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount152 > 0 )
         {
            standaloneNotModal1G152( ) ;
            standaloneModal1G152( ) ;
            addRow1G152( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMaqFCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount152 = (short)(nBlankRcdCount152-1) ;
         }
         Gx_mode = sMode152 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      e111G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV36DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMAQFCOD_DATA"), AV34MaqFCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z602MaqCod = httpContext.cgiGet( "Z602MaqCod") ;
            Z1257MaqFasUni = httpContext.cgiGet( "Z1257MaqFasUni") ;
            Z606MaqDsc = httpContext.cgiGet( "Z606MaqDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV30MaqCod = httpContext.cgiGet( "vMAQCOD") ;
            AV28Kgs = (byte)(localUtil.ctol( httpContext.cgiGet( "vKGS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27Mts = (byte)(localUtil.ctol( httpContext.cgiGet( "vMTS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A1145MaqDscFind = httpContext.cgiGet( "MAQDSCFIND") ;
            n1145MaqDscFind = false ;
            A1144MaqFFind = httpContext.cgiGet( "MAQFFIND") ;
            n1144MaqFFind = false ;
            A1143MaqFDsc = httpContext.cgiGet( "MAQFDSC") ;
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
            Combo_maqfcod_Objectcall = httpContext.cgiGet( "COMBO_MAQFCOD_Objectcall") ;
            Combo_maqfcod_Class = httpContext.cgiGet( "COMBO_MAQFCOD_Class") ;
            Combo_maqfcod_Icontype = httpContext.cgiGet( "COMBO_MAQFCOD_Icontype") ;
            Combo_maqfcod_Icon = httpContext.cgiGet( "COMBO_MAQFCOD_Icon") ;
            Combo_maqfcod_Caption = httpContext.cgiGet( "COMBO_MAQFCOD_Caption") ;
            Combo_maqfcod_Tooltip = httpContext.cgiGet( "COMBO_MAQFCOD_Tooltip") ;
            Combo_maqfcod_Cls = httpContext.cgiGet( "COMBO_MAQFCOD_Cls") ;
            Combo_maqfcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MAQFCOD_Selectedvalue_set") ;
            Combo_maqfcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MAQFCOD_Selectedvalue_get") ;
            Combo_maqfcod_Selectedtext_set = httpContext.cgiGet( "COMBO_MAQFCOD_Selectedtext_set") ;
            Combo_maqfcod_Selectedtext_get = httpContext.cgiGet( "COMBO_MAQFCOD_Selectedtext_get") ;
            Combo_maqfcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_MAQFCOD_Gamoauthtoken") ;
            Combo_maqfcod_Ddointernalname = httpContext.cgiGet( "COMBO_MAQFCOD_Ddointernalname") ;
            Combo_maqfcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_MAQFCOD_Titlecontrolalign") ;
            Combo_maqfcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MAQFCOD_Dropdownoptionstype") ;
            Combo_maqfcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Enabled")) ;
            Combo_maqfcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Visible")) ;
            Combo_maqfcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MAQFCOD_Titlecontrolidtoreplace") ;
            Combo_maqfcod_Datalisttype = httpContext.cgiGet( "COMBO_MAQFCOD_Datalisttype") ;
            Combo_maqfcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Allowmultipleselection")) ;
            Combo_maqfcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MAQFCOD_Datalistfixedvalues") ;
            Combo_maqfcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Isgriditem")) ;
            Combo_maqfcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Hasdescription")) ;
            Combo_maqfcod_Datalistproc = httpContext.cgiGet( "COMBO_MAQFCOD_Datalistproc") ;
            Combo_maqfcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MAQFCOD_Datalistprocparametersprefix") ;
            Combo_maqfcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MAQFCOD_Remoteservicesparameters") ;
            Combo_maqfcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MAQFCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_maqfcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Includeonlyselectedoption")) ;
            Combo_maqfcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Includeselectalloption")) ;
            Combo_maqfcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Emptyitem")) ;
            Combo_maqfcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MAQFCOD_Includeaddnewoption")) ;
            Combo_maqfcod_Htmltemplate = httpContext.cgiGet( "COMBO_MAQFCOD_Htmltemplate") ;
            Combo_maqfcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MAQFCOD_Multiplevaluestype") ;
            Combo_maqfcod_Loadingdata = httpContext.cgiGet( "COMBO_MAQFCOD_Loadingdata") ;
            Combo_maqfcod_Noresultsfound = httpContext.cgiGet( "COMBO_MAQFCOD_Noresultsfound") ;
            Combo_maqfcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MAQFCOD_Emptyitemtext") ;
            Combo_maqfcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MAQFCOD_Onlyselectedvalues") ;
            Combo_maqfcod_Selectalltext = httpContext.cgiGet( "COMBO_MAQFCOD_Selectalltext") ;
            Combo_maqfcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MAQFCOD_Multiplevaluesseparator") ;
            Combo_maqfcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_MAQFCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
            cmbMaqFasUni.setName( cmbMaqFasUni.getInternalname() );
            cmbMaqFasUni.setValue( httpContext.cgiGet( cmbMaqFasUni.getInternalname()) );
            A1257MaqFasUni = httpContext.cgiGet( cmbMaqFasUni.getInternalname()) ;
            n1257MaqFasUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
            AV37Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMAQFAS");
            A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
            n602MaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            forbiddenHiddens.add("MaqCod", GXutil.rtrim( localUtil.format( A602MaqCod, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A606MaqDsc = httpContext.cgiGet( edtMaqDsc_Internalname) ;
            n606MaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
            forbiddenHiddens.add("MaqDsc", GXutil.rtrim( localUtil.format( A606MaqDsc, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmaqfas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
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
                  sMode65 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode65 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound65 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1G0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MAQCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqCod_Internalname ;
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
                        e111G2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121G2 ();
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
         e121G2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1G65( ) ;
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
         disableAttributes1G65( ) ;
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

   public void confirm_1G0( )
   {
      beforeValidate1G65( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1G65( ) ;
         }
         else
         {
            checkExtendedTable1G65( ) ;
            closeExtendedTableCursors1G65( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode65 = Gx_mode ;
         confirm_1G152( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode65 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1G152( )
   {
      nGXsfl_36_idx = 0 ;
      while ( nGXsfl_36_idx < nRC_GXsfl_36 )
      {
         readRow1G152( ) ;
         if ( ( nRcdExists_152 != 0 ) || ( nIsMod_152 != 0 ) )
         {
            getKey1G152( ) ;
            if ( ( nRcdExists_152 == 0 ) && ( nRcdDeleted_152 == 0 ) )
            {
               if ( RcdFound152 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1G152( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1G152( ) ;
                     closeExtendedTableCursors1G152( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MAQFCOD_" + sGXsfl_36_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqFCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound152 != 0 )
               {
                  if ( nRcdDeleted_152 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1G152( ) ;
                     load1G152( ) ;
                     beforeValidate1G152( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1G152( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_152 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1G152( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1G152( ) ;
                           closeExtendedTableCursors1G152( ) ;
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
                  if ( nRcdDeleted_152 == 0 )
                  {
                     GXCCtl = "MAQFCOD_" + sGXsfl_36_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqFCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqFCod_Internalname, GXutil.rtrim( A1142MaqFCod)) ;
         httpContext.changePostValue( chkMaqFFAct.getInternalname(), ((GXutil.strcmp(A14276MaqFFAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z1142MaqFCod_"+sGXsfl_36_idx, GXutil.rtrim( Z1142MaqFCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1143MaqFDsc_"+sGXsfl_36_idx, GXutil.rtrim( Z1143MaqFDsc)) ;
         httpContext.changePostValue( "nRcdDeleted_152_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_152_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_152_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_152 != 0 )
         {
            httpContext.changePostValue( "MAQFCOD_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqFCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQFFACT_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMaqFFAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1G0( )
   {
   }

   public void e111G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmaqfas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmaqfas_impl.this.A396EmprCod = GXv_char2[0] ;
      tmaqfas_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmaqfas_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = AV28Kgs ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "KILOS", ""), GXv_int6) ;
      tmaqfas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28Kgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Kgs", GXutil.str( AV28Kgs, 1, 0));
      GXt_int5 = AV27Mts ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "METROS", ""), GXv_int6) ;
      tmaqfas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27Mts = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Mts", GXutil.str( AV27Mts, 1, 0));
      GXt_char1 = AV18Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmaqfas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV18Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Station", AV18Station);
      GXv_char4[0] = AV29EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmaqfas_impl.this.AV29EmprCod = GXv_char4[0] ;
      tmaqfas_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmaqfas_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29EmprCod", AV29EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV31WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV31WWPContext = GXv_SdtWWPContext7[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV36DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV36DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Combo_maqfcod_Titlecontrolidtoreplace = edtMaqFCod_Internalname ;
      ucCombo_maqfcod.sendProperty(context, "", false, Combo_maqfcod_Internalname, "TitleControlIdToReplace", Combo_maqfcod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOMAQFCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV32TrnContext.fromxml(AV33WebSession.getValue("TrnContext"), null, null);
   }

   public void e121G2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV32TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmaqfasww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOMAQFCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV34MaqFCod_Data ;
      GXv_char4[0] = AV35ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.tmaqfasloaddvcombo(remoteHandle, context).execute( "MaqFCod", Gx_mode, AV29EmprCod, AV30MaqCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tmaqfas_impl.this.AV35ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV34MaqFCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void zm1G65( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1257MaqFasUni = T001G6_A1257MaqFasUni[0] ;
            Z606MaqDsc = T001G6_A606MaqDsc[0] ;
         }
         else
         {
            Z1257MaqFasUni = A1257MaqFasUni ;
            Z606MaqDsc = A606MaqDsc ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z602MaqCod = A602MaqCod ;
         Z1257MaqFasUni = A1257MaqFasUni ;
         Z606MaqDsc = A606MaqDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      AV37Pgmname = "TMAQFAS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmname", AV37Pgmname);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV29EmprCod)==0) )
      {
         A396EmprCod = AV29EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T001G7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T001G7_A407EmprNom[0] ;
      n407EmprNom = T001G7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV30MaqCod)==0) )
      {
         A602MaqCod = AV30MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
   }

   public void standaloneModal( )
   {
      if ( true /* Level */ && isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Función no permitida", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( AV28Kgs == 1 ) && isIns( )  )
      {
         A1257MaqFasUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
         n1257MaqFasUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
      }
      else
      {
         if ( ( AV27Mts == 1 ) && isIns( )  )
         {
            A1257MaqFasUni = httpContext.getMessage( httpContext.getMessage( "K", ""), "") ;
            n1257MaqFasUni = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1G65( )
   {
      /* Using cursor T001G8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A1257MaqFasUni = T001G8_A1257MaqFasUni[0] ;
         n1257MaqFasUni = T001G8_n1257MaqFasUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
         A407EmprNom = T001G8_A407EmprNom[0] ;
         n407EmprNom = T001G8_n407EmprNom[0] ;
         A606MaqDsc = T001G8_A606MaqDsc[0] ;
         n606MaqDsc = T001G8_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         zm1G65( -12) ;
      }
      pr_default.close(6);
      onLoadActions1G65( ) ;
   }

   public void onLoadActions1G65( )
   {
   }

   public void checkExtendedTable1G65( )
   {
      nIsDirty_65 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A1257MaqFasUni, httpContext.getMessage( "K", "")) != 0 ) && ( GXutil.strcmp(A1257MaqFasUni, httpContext.getMessage( "M", "")) != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Las unidades deben ser K:Kilos o M:Metros", ""), 1, "MAQFASUNI");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMaqFasUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1G65( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1G65( )
   {
      /* Using cursor T001G9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001G6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T001G6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G65( 12) ;
         RcdFound65 = (short)(1) ;
         A602MaqCod = T001G6_A602MaqCod[0] ;
         n602MaqCod = T001G6_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         A1257MaqFasUni = T001G6_A1257MaqFasUni[0] ;
         n1257MaqFasUni = T001G6_n1257MaqFasUni[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
         A606MaqDsc = T001G6_A606MaqDsc[0] ;
         n606MaqDsc = T001G6_n606MaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1G65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey1G65( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey1G65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1G65( ) ;
      if ( RcdFound65 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T001G10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T001G10_A602MaqCod[0], A602MaqCod) < 0 ) ) && ( GXutil.strcmp(T001G10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T001G10_A602MaqCod[0], A602MaqCod) > 0 ) ) && ( GXutil.strcmp(T001G10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T001G10_A602MaqCod[0] ;
            n602MaqCod = T001G10_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T001G11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T001G11_A602MaqCod[0], A602MaqCod) > 0 ) ) && ( GXutil.strcmp(T001G11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T001G11_A602MaqCod[0], A602MaqCod) < 0 ) ) && ( GXutil.strcmp(T001G11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A602MaqCod = T001G11_A602MaqCod[0] ;
            n602MaqCod = T001G11_n602MaqCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G65( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = cmbMaqFasUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1G65( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               A602MaqCod = Z602MaqCod ;
               n602MaqCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MAQCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMaqCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbMaqFasUni.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1G65( ) ;
               GX_FocusControl = cmbMaqFasUni.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = cmbMaqFasUni.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1G65( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MAQCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMaqCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = cmbMaqFasUni.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1G65( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A602MaqCod, Z602MaqCod) != 0 ) )
      {
         A602MaqCod = Z602MaqCod ;
         n602MaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbMaqFasUni.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1G65( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001G5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z1257MaqFasUni, T001G5_A1257MaqFasUni[0]) != 0 ) || ( GXutil.strcmp(Z606MaqDsc, T001G5_A606MaqDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1257MaqFasUni, T001G5_A1257MaqFasUni[0]) != 0 )
            {
               GXutil.writeLogln("tmaqfas:[seudo value changed for attri]"+"MaqFasUni");
               GXutil.writeLogRaw("Old: ",Z1257MaqFasUni);
               GXutil.writeLogRaw("Current: ",T001G5_A1257MaqFasUni[0]);
            }
            if ( GXutil.strcmp(Z606MaqDsc, T001G5_A606MaqDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmaqfas:[seudo value changed for attri]"+"MaqDsc");
               GXutil.writeLogRaw("Old: ",Z606MaqDsc);
               GXutil.writeLogRaw("Current: ",T001G5_A606MaqDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQUIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G65( )
   {
      beforeValidate1G65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G65( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G65( 0) ;
         checkOptimisticConcurrency1G65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, Boolean.valueOf(n1257MaqFasUni), A1257MaqFasUni, Boolean.valueOf(n606MaqDsc), A606MaqDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(10) == 1) )
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
                        processLevel1G65( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1G0( ) ;
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
            load1G65( ) ;
         }
         endLevel1G65( ) ;
      }
      closeExtendedTableCursors1G65( ) ;
   }

   public void update1G65( )
   {
      beforeValidate1G65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n1257MaqFasUni), A1257MaqFasUni, Boolean.valueOf(n606MaqDsc), A606MaqDsc, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQUIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G65( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1G65( ) ;
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
         endLevel1G65( ) ;
      }
      closeExtendedTableCursors1G65( ) ;
   }

   public void deferredUpdate1G65( )
   {
   }

   public void delete( )
   {
      beforeValidate1G65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G65( ) ;
         afterConfirm1G65( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G65( ) ;
            if ( AnyError == 0 )
            {
               scanStart1G152( ) ;
               while ( RcdFound152 != 0 )
               {
                  getByPrimaryKey1G152( ) ;
                  delete1G152( ) ;
                  scanNext1G152( ) ;
               }
               scanEnd1G152( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQUIN");
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G65( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G65( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T001G15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Costes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T001G16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T001G17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Maquinas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T001G18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PLNMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T001G19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T001G20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Recetas Lavados Maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T001G21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo NO planificado", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T001G22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calendario Maquinas Tiempo por Mantenimiento", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T001G23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Consumos Lab. JBP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T001G24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pedidos Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T001G25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Uso", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T001G26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Piezas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T001G27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Documentos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T001G28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MQDDOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T001G29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLATF1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T001G30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T001G31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQFABS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T001G32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MSolicitudes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T001G33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MPreventivo", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T001G34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T001G35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T001G36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CONVPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T001G37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T001G38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTNQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T001G39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TARTM1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T001G40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T001G41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQGR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T001G42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Líneas Costes Retroalimentados", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T001G43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PlaMaq", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T001G44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T001G45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T001G46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFOC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T001G47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T001G48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANBRL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T001G49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parámetros por maquina", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T001G50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMAQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T001G51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPLATI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T001G52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQMAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T001G53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMAQCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T001G54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T001G55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T001G56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMHPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T001G57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T001G58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAQHNP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T001G59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T001G60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHIPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T001G61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRULIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T001G62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T001G63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T001G64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
      }
   }

   public void processNestedLevel1G152( )
   {
      nGXsfl_36_idx = 0 ;
      while ( nGXsfl_36_idx < nRC_GXsfl_36 )
      {
         readRow1G152( ) ;
         if ( ( nRcdExists_152 != 0 ) || ( nIsMod_152 != 0 ) )
         {
            standaloneNotModal1G152( ) ;
            getKey1G152( ) ;
            if ( ( nRcdExists_152 == 0 ) && ( nRcdDeleted_152 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1G152( ) ;
            }
            else
            {
               if ( RcdFound152 != 0 )
               {
                  if ( ( nRcdDeleted_152 != 0 ) && ( nRcdExists_152 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1G152( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_152 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1G152( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_152 == 0 )
                  {
                     GXCCtl = "MAQFCOD_" + sGXsfl_36_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMaqFCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMaqFCod_Internalname, GXutil.rtrim( A1142MaqFCod)) ;
         httpContext.changePostValue( chkMaqFFAct.getInternalname(), ((GXutil.strcmp(A14276MaqFFAct, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z1142MaqFCod_"+sGXsfl_36_idx, GXutil.rtrim( Z1142MaqFCod)) ;
         httpContext.changePostValue( "ZT_"+"Z1143MaqFDsc_"+sGXsfl_36_idx, GXutil.rtrim( Z1143MaqFDsc)) ;
         httpContext.changePostValue( "nRcdDeleted_152_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_152_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_152_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_152 != 0 )
         {
            httpContext.changePostValue( "MAQFCOD_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqFCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQFFACT_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMaqFFAct.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1G152( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_152 = (short)(0) ;
      nIsMod_152 = (short)(0) ;
      nRcdDeleted_152 = (short)(0) ;
   }

   public void processLevel1G65( )
   {
      /* Save parent mode. */
      sMode65 = Gx_mode ;
      processNestedLevel1G152( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1G65( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1G65( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmaqfas");
         if ( AnyError == 0 )
         {
            confirmValues1G0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmaqfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G65( )
   {
      /* Scan By routine */
      /* Using cursor T001G65 */
      pr_default.execute(63, new Object[] {A396EmprCod});
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A602MaqCod = T001G65_A602MaqCod[0] ;
         n602MaqCod = T001G65_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G65( )
   {
      /* Scan next routine */
      pr_default.readNext(63);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(63) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A602MaqCod = T001G65_A602MaqCod[0] ;
         n602MaqCod = T001G65_n602MaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      }
   }

   public void scanEnd1G65( )
   {
      pr_default.close(63);
   }

   public void afterConfirm1G65( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G65( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G65( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G65( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G65( )
   {
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), true);
      edtMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqDsc_Enabled), 5, 0), true);
      cmbMaqFasUni.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMaqFasUni.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMaqFasUni.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1G152( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1143MaqFDsc = T001G3_A1143MaqFDsc[0] ;
         }
         else
         {
            Z1143MaqFDsc = A1143MaqFDsc ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z602MaqCod = A602MaqCod ;
         Z1142MaqFCod = A1142MaqFCod ;
         Z1143MaqFDsc = A1143MaqFDsc ;
         Z396EmprCod = A396EmprCod ;
         Z1144MaqFFind = A1144MaqFFind ;
         Z1145MaqDscFind = A1145MaqDscFind ;
      }
   }

   public void standaloneNotModal1G152( )
   {
   }

   public void standaloneModal1G152( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMaqFCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqFCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFCod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      }
      else
      {
         edtMaqFCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMaqFCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFCod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      }
   }

   public void load1G152( )
   {
      /* Using cursor T001G66 */
      pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod});
      if ( (pr_default.getStatus(64) != 101) )
      {
         RcdFound152 = (short)(1) ;
         A1143MaqFDsc = T001G66_A1143MaqFDsc[0] ;
         A1144MaqFFind = T001G66_A1144MaqFFind[0] ;
         n1144MaqFFind = T001G66_n1144MaqFFind[0] ;
         A1145MaqDscFind = T001G66_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T001G66_n1145MaqDscFind[0] ;
         zm1G152( -14) ;
      }
      pr_default.close(64);
      onLoadActions1G152( ) ;
   }

   public void onLoadActions1G152( )
   {
      if ( GXutil.strcmp(A1144MaqFFind, "xxxxxxxx") != 0 )
      {
         A1143MaqFDsc = A1145MaqDscFind ;
         httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", A1143MaqFDsc);
      }
      GXt_char1 = A14276MaqFFAct ;
      GXv_char4[0] = GXt_char1 ;
      new app.faseactiva(remoteHandle, context).execute( A396EmprCod, A1142MaqFCod, GXv_char4) ;
      tmaqfas_impl.this.GXt_char1 = GXv_char4[0] ;
      A14276MaqFFAct = GXt_char1 ;
   }

   public void checkExtendedTable1G152( )
   {
      nIsDirty_152 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1G152( ) ;
      /* Using cursor T001G4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(2) != 101) )
      {
         A1144MaqFFind = T001G4_A1144MaqFFind[0] ;
         n1144MaqFFind = T001G4_n1144MaqFFind[0] ;
         A1145MaqDscFind = T001G4_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T001G4_n1145MaqDscFind[0] ;
      }
      else
      {
         nIsDirty_152 = (short)(1) ;
         A1145MaqDscFind = "" ;
         n1145MaqDscFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
         nIsDirty_152 = (short)(1) ;
         A1144MaqFFind = "xxxxxxxx" ;
         n1144MaqFFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
      }
      pr_default.close(2);
      if ( GXutil.strcmp(A1144MaqFFind, "xxxxxxxx") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fase inexistente", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( GXutil.strcmp(A1144MaqFFind, "xxxxxxxx") != 0 )
      {
         nIsDirty_152 = (short)(1) ;
         A1143MaqFDsc = A1145MaqDscFind ;
         httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", A1143MaqFDsc);
      }
      nIsDirty_152 = (short)(1) ;
      GXt_char1 = A14276MaqFFAct ;
      GXv_char4[0] = GXt_char1 ;
      new app.faseactiva(remoteHandle, context).execute( A396EmprCod, A1142MaqFCod, GXv_char4) ;
      tmaqfas_impl.this.GXt_char1 = GXv_char4[0] ;
      A14276MaqFFAct = GXt_char1 ;
   }

   public void closeExtendedTableCursors1G152( )
   {
      pr_default.close(2);
   }

   public void enableDisable1G152( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          String A1142MaqFCod )
   {
      /* Using cursor T001G67 */
      pr_default.execute(65, new Object[] {A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(65) != 101) )
      {
         A1144MaqFFind = T001G67_A1144MaqFFind[0] ;
         n1144MaqFFind = T001G67_n1144MaqFFind[0] ;
         A1145MaqDscFind = T001G67_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T001G67_n1145MaqDscFind[0] ;
      }
      else
      {
         A1145MaqDscFind = "" ;
         n1145MaqDscFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
         A1144MaqFFind = "xxxxxxxx" ;
         n1144MaqFFind = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1144MaqFFind))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1145MaqDscFind))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(65) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(65);
   }

   public void getKey1G152( )
   {
      /* Using cursor T001G68 */
      pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod});
      if ( (pr_default.getStatus(66) != 101) )
      {
         RcdFound152 = (short)(1) ;
      }
      else
      {
         RcdFound152 = (short)(0) ;
      }
      pr_default.close(66);
   }

   public void getByPrimaryKey1G152( )
   {
      /* Using cursor T001G3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T001G3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1G152( 14) ;
         RcdFound152 = (short)(1) ;
         initializeNonKey1G152( ) ;
         A1142MaqFCod = T001G3_A1142MaqFCod[0] ;
         A1143MaqFDsc = T001G3_A1143MaqFDsc[0] ;
         Z396EmprCod = A396EmprCod ;
         Z602MaqCod = A602MaqCod ;
         Z1142MaqFCod = A1142MaqFCod ;
         sMode152 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1G152( ) ;
         Gx_mode = sMode152 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound152 = (short)(0) ;
         initializeNonKey1G152( ) ;
         sMode152 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1G152( ) ;
         Gx_mode = sMode152 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1G152( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1G152( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T001G2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1143MaqFDsc, T001G2_A1143MaqFDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1143MaqFDsc, T001G2_A1143MaqFDsc[0]) != 0 )
            {
               GXutil.writeLogln("tmaqfas:[seudo value changed for attri]"+"MaqFDsc");
               GXutil.writeLogRaw("Old: ",Z1143MaqFDsc);
               GXutil.writeLogRaw("Current: ",T001G2_A1143MaqFDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMAQFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G152( )
   {
      beforeValidate1G152( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G152( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G152( 0) ;
         checkOptimisticConcurrency1G152( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G152( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G152( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G69 */
                  pr_default.execute(67, new Object[] {Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod, A1143MaqFDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
                  if ( (pr_default.getStatus(67) == 1) )
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
            load1G152( ) ;
         }
         endLevel1G152( ) ;
      }
      closeExtendedTableCursors1G152( ) ;
   }

   public void update1G152( )
   {
      beforeValidate1G152( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G152( ) ;
      }
      if ( ( nIsMod_152 != 0 ) || ( nIsDirty_152 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1G152( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1G152( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1G152( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T001G70 */
                     pr_default.execute(68, new Object[] {A1143MaqFDsc, A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
                     if ( (pr_default.getStatus(68) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMAQFAS"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1G152( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1G152( ) ;
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
            endLevel1G152( ) ;
         }
      }
      closeExtendedTableCursors1G152( ) ;
   }

   public void deferredUpdate1G152( )
   {
   }

   public void delete1G152( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G152( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G152( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G152( ) ;
         afterConfirm1G152( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G152( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001G71 */
               pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMAQFAS");
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
      sMode152 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G152( ) ;
      Gx_mode = sMode152 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G152( )
   {
      standaloneModal1G152( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T001G72 */
         pr_default.execute(70, new Object[] {A396EmprCod, A1142MaqFCod});
         if ( (pr_default.getStatus(70) != 101) )
         {
            A1144MaqFFind = T001G72_A1144MaqFFind[0] ;
            n1144MaqFFind = T001G72_n1144MaqFFind[0] ;
            A1145MaqDscFind = T001G72_A1145MaqDscFind[0] ;
            n1145MaqDscFind = T001G72_n1145MaqDscFind[0] ;
         }
         else
         {
            A1145MaqDscFind = "" ;
            n1145MaqDscFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
            A1144MaqFFind = "xxxxxxxx" ;
            n1144MaqFFind = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
         }
         pr_default.close(70);
         GXt_char1 = A14276MaqFFAct ;
         GXv_char4[0] = GXt_char1 ;
         new app.faseactiva(remoteHandle, context).execute( A396EmprCod, A1142MaqFCod, GXv_char4) ;
         tmaqfas_impl.this.GXt_char1 = GXv_char4[0] ;
         A14276MaqFFAct = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001G73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod, A1142MaqFCod});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Planificacion ETAL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
      }
   }

   public void endLevel1G152( )
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

   public void scanStart1G152( )
   {
      /* Scan By routine */
      /* Using cursor T001G74 */
      pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n602MaqCod), A602MaqCod});
      RcdFound152 = (short)(0) ;
      if ( (pr_default.getStatus(72) != 101) )
      {
         RcdFound152 = (short)(1) ;
         A1142MaqFCod = T001G74_A1142MaqFCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G152( )
   {
      /* Scan next routine */
      pr_default.readNext(72);
      RcdFound152 = (short)(0) ;
      if ( (pr_default.getStatus(72) != 101) )
      {
         RcdFound152 = (short)(1) ;
         A1142MaqFCod = T001G74_A1142MaqFCod[0] ;
      }
   }

   public void scanEnd1G152( )
   {
      pr_default.close(72);
   }

   public void afterConfirm1G152( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G152( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G152( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G152( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G152( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G152( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G152( )
   {
      edtMaqFCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqFCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFCod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      chkMaqFFAct.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkMaqFFAct.getInternalname(), "Enabled", GXutil.ltrimstr( chkMaqFFAct.getEnabled(), 5, 0), !bGXsfl_36_Refreshing);
   }

   public void send_integrity_lvl_hashes1G152( )
   {
   }

   public void send_integrity_lvl_hashes1G65( )
   {
   }

   public void subsflControlProps_36152( )
   {
      edtMaqFCod_Internalname = "MAQFCOD_"+sGXsfl_36_idx ;
      chkMaqFFAct.setInternalname( "MAQFFACT_"+sGXsfl_36_idx );
   }

   public void subsflControlProps_fel_36152( )
   {
      edtMaqFCod_Internalname = "MAQFCOD_"+sGXsfl_36_fel_idx ;
      chkMaqFFAct.setInternalname( "MAQFFACT_"+sGXsfl_36_fel_idx );
   }

   public void addRow1G152( )
   {
      nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_36152( ) ;
      sendRow1G152( ) ;
   }

   public void sendRow1G152( )
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
         if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_152_" + sGXsfl_36_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_36_idx + "',36)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqFCod_Internalname,GXutil.rtrim( A1142MaqFCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqFCod_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMaqFCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "MAQFFACT_" + sGXsfl_36_idx ;
      chkMaqFFAct.setName( GXCCtl );
      chkMaqFFAct.setWebtags( "" );
      chkMaqFFAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMaqFFAct.getInternalname(), "TitleCaption", chkMaqFFAct.getCaption(), !bGXsfl_36_Refreshing);
      chkMaqFFAct.setCheckedValue( "N" );
      A14276MaqFFAct = ((GXutil.strcmp(GXutil.rtrim( A14276MaqFFAct), "S")==0) ? "S" : "N") ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkMaqFFAct.getInternalname(),A14276MaqFFAct,"","",Integer.valueOf(-1),Integer.valueOf(chkMaqFFAct.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1G152( ) ;
      GXCCtl = "Z1142MaqFCod_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1142MaqFCod));
      GXCCtl = "Z1143MaqFDsc_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z1143MaqFDsc));
      GXCCtl = "nRcdDeleted_152_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_152_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_152_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_152, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_36_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV32TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV32TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV29EmprCod));
      GXCCtl = "vMAQCOD_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV30MaqCod));
      GXCCtl = "EMPRCOD_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFCOD_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqFCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFFACT_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkMaqFFAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1G152( )
   {
      nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_36152( ) ;
      edtMaqFCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQFCOD_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkMaqFFAct.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MAQFFACT_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      A1142MaqFCod = httpContext.cgiGet( edtMaqFCod_Internalname) ;
      A14276MaqFFAct = ((GXutil.strcmp(httpContext.cgiGet( chkMaqFFAct.getInternalname()), "S")==0) ? "S" : "N") ;
      GXCCtl = "Z1142MaqFCod_" + sGXsfl_36_idx ;
      Z1142MaqFCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1143MaqFDsc_" + sGXsfl_36_idx ;
      Z1143MaqFDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z1143MaqFDsc_" + sGXsfl_36_idx ;
      A1143MaqFDsc = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_152_" + sGXsfl_36_idx ;
      nRcdDeleted_152 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_152_" + sGXsfl_36_idx ;
      nRcdExists_152 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_152_" + sGXsfl_36_idx ;
      nIsMod_152 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMaqFCod_Enabled = edtMaqFCod_Enabled ;
   }

   public void confirmValues1G0( )
   {
      nGXsfl_36_idx = 0 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_36152( ) ;
      while ( nGXsfl_36_idx < nRC_GXsfl_36 )
      {
         nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_36152( ) ;
         httpContext.changePostValue( "Z1142MaqFCod_"+sGXsfl_36_idx, httpContext.cgiGet( "ZT_"+"Z1142MaqFCod_"+sGXsfl_36_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1142MaqFCod_"+sGXsfl_36_idx) ;
         httpContext.changePostValue( "Z1143MaqFDsc_"+sGXsfl_36_idx, httpContext.cgiGet( "ZT_"+"Z1143MaqFDsc_"+sGXsfl_36_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1143MaqFDsc_"+sGXsfl_36_idx) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmaqfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV30MaqCod))}, new String[] {"Gx_mode","EmprCod","MaqCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMAQFAS");
      forbiddenHiddens.add("MaqCod", GXutil.rtrim( localUtil.format( A602MaqCod, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("MaqDsc", GXutil.rtrim( localUtil.format( A606MaqDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmaqfas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z602MaqCod", GXutil.rtrim( Z602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1257MaqFasUni", GXutil.rtrim( Z1257MaqFasUni));
      app.GxWebStd.gx_hidden_field( httpContext, "Z606MaqDsc", GXutil.rtrim( Z606MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nGXsfl_36_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMAQFCOD_DATA", AV34MaqFCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMAQFCOD_DATA", AV34MaqFCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV32TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV32TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV32TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV29EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV30MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV30MaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vKGS", GXutil.ltrim( localUtil.ntoc( AV28Kgs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMTS", GXutil.ltrim( localUtil.ntoc( AV27Mts, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQDSCFIND", GXutil.rtrim( A1145MaqDscFind));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFFIND", GXutil.rtrim( A1144MaqFFind));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQFDSC", GXutil.rtrim( A1143MaqFDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQFCOD_Objectcall", GXutil.rtrim( Combo_maqfcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQFCOD_Cls", GXutil.rtrim( Combo_maqfcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQFCOD_Enabled", GXutil.booltostr( Combo_maqfcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQFCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_maqfcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQFCOD_Isgriditem", GXutil.booltostr( Combo_maqfcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MAQFCOD_Emptyitem", GXutil.booltostr( Combo_maqfcod_Emptyitem));
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
      return formatLink("app.tmaqfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV29EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV30MaqCod))}, new String[] {"Gx_mode","EmprCod","MaqCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMAQFAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "MAQUINAS POR FASE", "") ;
   }

   public void initializeNonKey1G65( )
   {
      A1257MaqFasUni = "" ;
      n1257MaqFasUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
      A606MaqDsc = "" ;
      n606MaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A606MaqDsc", A606MaqDsc);
      Z1257MaqFasUni = "" ;
      Z606MaqDsc = "" ;
   }

   public void initAll1G65( )
   {
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      initializeNonKey1G65( ) ;
   }

   public void standaloneModalInsert( )
   {
      A1257MaqFasUni = i1257MaqFasUni ;
      n1257MaqFasUni = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
   }

   public void initializeNonKey1G152( )
   {
      A1143MaqFDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", A1143MaqFDsc);
      A1144MaqFFind = "" ;
      n1144MaqFFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", A1144MaqFFind);
      A1145MaqDscFind = "" ;
      n1145MaqDscFind = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", A1145MaqDscFind);
      A14276MaqFFAct = "" ;
      Z1143MaqFDsc = "" ;
   }

   public void initAll1G152( )
   {
      A1142MaqFCod = "" ;
      initializeNonKey1G152( ) ;
   }

   public void standaloneModalInsert1G152( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211652188", true, true);
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
      httpContext.AddJavascriptSource("tmaqfas.js", "?20268211652188", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties152( )
   {
      edtMaqFCod_Enabled = defedtMaqFCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqFCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqFCod_Enabled), 5, 0), !bGXsfl_36_Refreshing);
   }

   public void startgridcontrol36( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1142MaqFCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqFCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A14276MaqFFAct));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkMaqFFAct.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtMaqCod_Internalname = "MAQCOD" ;
      edtMaqDsc_Internalname = "MAQDSC" ;
      cmbMaqFasUni.setInternalname( "MAQFASUNI" );
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMaqFCod_Internalname = "MAQFCOD" ;
      chkMaqFFAct.setInternalname( "MAQFFACT" );
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_maqfcod_Internalname = "COMBO_MAQFCOD" ;
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
      Combo_maqfcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "MAQUINAS POR FASE", "") );
      chkMaqFFAct.setCaption( "" );
      edtMaqFCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_maqfcod_Titlecontrolidtoreplace = "" ;
      chkMaqFFAct.setEnabled( 0 );
      edtMaqFCod_Enabled = 1 ;
      Combo_maqfcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_maqfcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_maqfcod_Cls = "ExtendedCombo" ;
      Combo_maqfcod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      cmbMaqFasUni.setJsonclick( "" );
      cmbMaqFasUni.setEnabled( 1 );
      edtMaqDsc_Jsonclick = "" ;
      edtMaqDsc_Enabled = 0 ;
      edtMaqCod_Jsonclick = "" ;
      edtMaqCod_Enabled = 0 ;
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

   public void gx9asamaqffact1G152( String A396EmprCod ,
                                    String A1142MaqFCod )
   {
      GXt_char1 = A14276MaqFFAct ;
      GXv_char4[0] = GXt_char1 ;
      new app.faseactiva(remoteHandle, context).execute( A396EmprCod, A1142MaqFCod, GXv_char4) ;
      tmaqfas_impl.this.GXt_char1 = GXv_char4[0] ;
      A14276MaqFFAct = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A14276MaqFFAct))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_36152( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1G152( ) ;
         standaloneModal1G152( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1G152( ) ;
         nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_36152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbMaqFasUni.setName( "MAQFASUNI" );
      cmbMaqFasUni.setWebtags( "" );
      cmbMaqFasUni.addItem("K", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbMaqFasUni.addItem("M", httpContext.getMessage( "Metros", ""), (short)(0));
      if ( cmbMaqFasUni.getItemCount() > 0 )
      {
         A1257MaqFasUni = cmbMaqFasUni.getValidValue(A1257MaqFasUni) ;
         n1257MaqFasUni = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1257MaqFasUni", A1257MaqFasUni);
      }
      GXCCtl = "MAQFFACT_" + sGXsfl_36_idx ;
      chkMaqFFAct.setName( GXCCtl );
      chkMaqFFAct.setWebtags( "" );
      chkMaqFFAct.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkMaqFFAct.getInternalname(), "TitleCaption", chkMaqFFAct.getCaption(), !bGXsfl_36_Refreshing);
      chkMaqFFAct.setCheckedValue( "N" );
      A14276MaqFFAct = ((GXutil.strcmp(GXutil.rtrim( A14276MaqFFAct), "S")==0) ? "S" : "N") ;
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

   public void valid_Maqfcod( )
   {
      n1144MaqFFind = false ;
      n1145MaqDscFind = false ;
      /* Using cursor T001G72 */
      pr_default.execute(70, new Object[] {A396EmprCod, A1142MaqFCod});
      if ( (pr_default.getStatus(70) != 101) )
      {
         A1144MaqFFind = T001G72_A1144MaqFFind[0] ;
         n1144MaqFFind = T001G72_n1144MaqFFind[0] ;
         A1145MaqDscFind = T001G72_A1145MaqDscFind[0] ;
         n1145MaqDscFind = T001G72_n1145MaqDscFind[0] ;
      }
      else
      {
         A1145MaqDscFind = "" ;
         n1145MaqDscFind = false ;
         A1144MaqFFind = "xxxxxxxx" ;
         n1144MaqFFind = false ;
      }
      pr_default.close(70);
      if ( GXutil.strcmp(A1144MaqFFind, "xxxxxxxx") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Fase inexistente", ""), 1, "MAQFCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMaqFCod_Internalname ;
      }
      if ( GXutil.strcmp(A1144MaqFFind, "xxxxxxxx") != 0 )
      {
         A1143MaqFDsc = A1145MaqDscFind ;
      }
      GXt_char1 = A14276MaqFFAct ;
      GXv_char4[0] = GXt_char1 ;
      new app.faseactiva(remoteHandle, context).execute( A396EmprCod, A1142MaqFCod, GXv_char4) ;
      tmaqfas_impl.this.GXt_char1 = GXv_char4[0] ;
      A14276MaqFFAct = GXt_char1 ;
      dynload_actions( ) ;
      A14276MaqFFAct = ((GXutil.strcmp(GXutil.rtrim( A14276MaqFFAct), "S")==0) ? "S" : "N") ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1144MaqFFind", GXutil.rtrim( A1144MaqFFind));
      httpContext.ajax_rsp_assign_attri("", false, "A1145MaqDscFind", GXutil.rtrim( A1145MaqDscFind));
      httpContext.ajax_rsp_assign_attri("", false, "A1143MaqFDsc", GXutil.rtrim( A1143MaqFDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A14276MaqFFAct", GXutil.rtrim( A14276MaqFFAct));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV30MaqCod',fld:'vMAQCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV29EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV30MaqCod',fld:'vMAQCOD',pic:'',hsh:true},{av:'A602MaqCod',fld:'MAQCOD',pic:''},{av:'A606MaqDsc',fld:'MAQDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121G2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MAQCOD","{handler:'valid_Maqcod',iparms:[]");
      setEventMetadata("VALID_MAQCOD",",oparms:[]}");
      setEventMetadata("VALID_MAQFASUNI","{handler:'valid_Maqfasuni',iparms:[]");
      setEventMetadata("VALID_MAQFASUNI",",oparms:[]}");
      setEventMetadata("VALID_MAQFCOD","{handler:'valid_Maqfcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1142MaqFCod',fld:'MAQFCOD',pic:''},{av:'A1144MaqFFind',fld:'MAQFFIND',pic:''},{av:'A1145MaqDscFind',fld:'MAQDSCFIND',pic:''},{av:'A1143MaqFDsc',fld:'MAQFDSC',pic:''},{av:'A14276MaqFFAct',fld:'MAQFFACT',pic:''}]");
      setEventMetadata("VALID_MAQFCOD",",oparms:[{av:'A1144MaqFFind',fld:'MAQFFIND',pic:''},{av:'A1145MaqDscFind',fld:'MAQDSCFIND',pic:''},{av:'A1143MaqFDsc',fld:'MAQFDSC',pic:''},{av:'A14276MaqFFAct',fld:'MAQFFACT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Maqffact',iparms:[]");
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
      pr_default.close(70);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV29EmprCod = "" ;
      wcpOAV30MaqCod = "" ;
      Z396EmprCod = "" ;
      Z602MaqCod = "" ;
      Z1257MaqFasUni = "" ;
      Z606MaqDsc = "" ;
      Z1142MaqFCod = "" ;
      Z1143MaqFDsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A1142MaqFCod = "" ;
      Gx_mode = "" ;
      AV29EmprCod = "" ;
      AV30MaqCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A1257MaqFasUni = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A602MaqCod = "" ;
      A606MaqDsc = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV37Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_maqfcod = new com.genexus.webpanels.GXUserControl();
      AV36DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV34MaqFCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode152 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A1145MaqDscFind = "" ;
      A1144MaqFFind = "" ;
      A1143MaqFDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_maqfcod_Objectcall = "" ;
      Combo_maqfcod_Class = "" ;
      Combo_maqfcod_Icontype = "" ;
      Combo_maqfcod_Icon = "" ;
      Combo_maqfcod_Tooltip = "" ;
      Combo_maqfcod_Selectedvalue_set = "" ;
      Combo_maqfcod_Selectedvalue_get = "" ;
      Combo_maqfcod_Selectedtext_set = "" ;
      Combo_maqfcod_Selectedtext_get = "" ;
      Combo_maqfcod_Gamoauthtoken = "" ;
      Combo_maqfcod_Ddointernalname = "" ;
      Combo_maqfcod_Titlecontrolalign = "" ;
      Combo_maqfcod_Dropdownoptionstype = "" ;
      Combo_maqfcod_Datalisttype = "" ;
      Combo_maqfcod_Datalistfixedvalues = "" ;
      Combo_maqfcod_Datalistproc = "" ;
      Combo_maqfcod_Datalistprocparametersprefix = "" ;
      Combo_maqfcod_Remoteservicesparameters = "" ;
      Combo_maqfcod_Htmltemplate = "" ;
      Combo_maqfcod_Multiplevaluestype = "" ;
      Combo_maqfcod_Loadingdata = "" ;
      Combo_maqfcod_Noresultsfound = "" ;
      Combo_maqfcod_Emptyitemtext = "" ;
      Combo_maqfcod_Onlyselectedvalues = "" ;
      Combo_maqfcod_Selectalltext = "" ;
      Combo_maqfcod_Multiplevaluesseparator = "" ;
      Combo_maqfcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode65 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A14276MaqFFAct = "" ;
      AV18Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV31WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV32TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV33WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV35ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T001G7_A407EmprNom = new String[] {""} ;
      T001G7_n407EmprNom = new boolean[] {false} ;
      T001G8_A602MaqCod = new String[] {""} ;
      T001G8_n602MaqCod = new boolean[] {false} ;
      T001G8_A1257MaqFasUni = new String[] {""} ;
      T001G8_n1257MaqFasUni = new boolean[] {false} ;
      T001G8_A407EmprNom = new String[] {""} ;
      T001G8_n407EmprNom = new boolean[] {false} ;
      T001G8_A606MaqDsc = new String[] {""} ;
      T001G8_n606MaqDsc = new boolean[] {false} ;
      T001G8_A396EmprCod = new String[] {""} ;
      T001G9_A396EmprCod = new String[] {""} ;
      T001G9_A602MaqCod = new String[] {""} ;
      T001G9_n602MaqCod = new boolean[] {false} ;
      T001G6_A602MaqCod = new String[] {""} ;
      T001G6_n602MaqCod = new boolean[] {false} ;
      T001G6_A1257MaqFasUni = new String[] {""} ;
      T001G6_n1257MaqFasUni = new boolean[] {false} ;
      T001G6_A606MaqDsc = new String[] {""} ;
      T001G6_n606MaqDsc = new boolean[] {false} ;
      T001G6_A396EmprCod = new String[] {""} ;
      T001G10_A396EmprCod = new String[] {""} ;
      T001G10_A602MaqCod = new String[] {""} ;
      T001G10_n602MaqCod = new boolean[] {false} ;
      T001G11_A396EmprCod = new String[] {""} ;
      T001G11_A602MaqCod = new String[] {""} ;
      T001G11_n602MaqCod = new boolean[] {false} ;
      T001G5_A602MaqCod = new String[] {""} ;
      T001G5_n602MaqCod = new boolean[] {false} ;
      T001G5_A1257MaqFasUni = new String[] {""} ;
      T001G5_n1257MaqFasUni = new boolean[] {false} ;
      T001G5_A606MaqDsc = new String[] {""} ;
      T001G5_n606MaqDsc = new boolean[] {false} ;
      T001G5_A396EmprCod = new String[] {""} ;
      T001G15_A396EmprCod = new String[] {""} ;
      T001G15_A602MaqCod = new String[] {""} ;
      T001G15_n602MaqCod = new boolean[] {false} ;
      T001G15_A14529MqCAnyo = new short[1] ;
      T001G15_A14530MqCMes = new byte[1] ;
      T001G16_A396EmprCod = new String[] {""} ;
      T001G16_A129BarCod = new int[1] ;
      T001G16_A132BarCodReo = new byte[1] ;
      T001G16_A130BarCodPar = new String[] {""} ;
      T001G16_A14152MEnvOrd = new short[1] ;
      T001G17_A396EmprCod = new String[] {""} ;
      T001G17_A13604RARID = new int[1] ;
      T001G17_A602MaqCod = new String[] {""} ;
      T001G17_n602MaqCod = new boolean[] {false} ;
      T001G18_A396EmprCod = new String[] {""} ;
      T001G18_A602MaqCod = new String[] {""} ;
      T001G18_n602MaqCod = new boolean[] {false} ;
      T001G18_A13193MaqHdr = new int[1] ;
      T001G18_A13194MaqHdrR = new byte[1] ;
      T001G18_A13195MaqHdrP = new String[] {""} ;
      T001G18_A13196MaqRecLinM = new short[1] ;
      T001G19_A396EmprCod = new String[] {""} ;
      T001G19_A13137NCHdr = new int[1] ;
      T001G19_A13138NCHdrr = new byte[1] ;
      T001G19_A13139NCHdrp = new String[] {""} ;
      T001G20_A396EmprCod = new String[] {""} ;
      T001G20_A12673LavMqId = new int[1] ;
      T001G21_A396EmprCod = new String[] {""} ;
      T001G21_A602MaqCod = new String[] {""} ;
      T001G21_n602MaqCod = new boolean[] {false} ;
      T001G21_A12444MaqAnyNP = new short[1] ;
      T001G21_A12445MaqMesNP = new byte[1] ;
      T001G22_A396EmprCod = new String[] {""} ;
      T001G22_A602MaqCod = new String[] {""} ;
      T001G22_n602MaqCod = new boolean[] {false} ;
      T001G22_A12434MaqAnyM = new short[1] ;
      T001G22_A12435MaqMesM = new byte[1] ;
      T001G23_A396EmprCod = new String[] {""} ;
      T001G23_A4929Inc_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T001G23_A5728JBCLLin = new short[1] ;
      T001G24_A396EmprCod = new String[] {""} ;
      T001G24_A11604PArtId = new int[1] ;
      T001G25_A396EmprCod = new String[] {""} ;
      T001G25_A602MaqCod = new String[] {""} ;
      T001G25_n602MaqCod = new boolean[] {false} ;
      T001G25_A11445MaqFch = new java.util.Date[] {GXutil.nullDate()} ;
      T001G26_A396EmprCod = new String[] {""} ;
      T001G26_A602MaqCod = new String[] {""} ;
      T001G26_n602MaqCod = new boolean[] {false} ;
      T001G26_A11438MaqEquCod = new String[] {""} ;
      T001G26_A11439MaqSEqCod = new String[] {""} ;
      T001G26_A11440MaqPieCod = new String[] {""} ;
      T001G27_A396EmprCod = new String[] {""} ;
      T001G27_A602MaqCod = new String[] {""} ;
      T001G27_n602MaqCod = new boolean[] {false} ;
      T001G27_A11432MaqDocId = new short[1] ;
      T001G28_A396EmprCod = new String[] {""} ;
      T001G28_A602MaqCod = new String[] {""} ;
      T001G28_n602MaqCod = new boolean[] {false} ;
      T001G28_A10111Mq_Dia = new java.util.Date[] {GXutil.nullDate()} ;
      T001G28_A10112Mq_Op = new int[1] ;
      T001G29_A396EmprCod = new String[] {""} ;
      T001G29_A252CliCod = new int[1] ;
      T001G29_A65ArtCod = new String[] {""} ;
      T001G29_A10041ArtSH = new String[] {""} ;
      T001G29_A10042ArtMqFa = new String[] {""} ;
      T001G30_A396EmprCod = new String[] {""} ;
      T001G30_A602MaqCod = new String[] {""} ;
      T001G30_n602MaqCod = new boolean[] {false} ;
      T001G30_A74MaqTMuIni = new java.util.Date[] {GXutil.nullDate()} ;
      T001G31_A396EmprCod = new String[] {""} ;
      T001G31_A602MaqCod = new String[] {""} ;
      T001G31_n602MaqCod = new boolean[] {false} ;
      T001G31_A9725MaqFabC = new String[] {""} ;
      T001G32_A396EmprCod = new String[] {""} ;
      T001G32_A9428SMCod = new int[1] ;
      T001G33_A396EmprCod = new String[] {""} ;
      T001G33_A9429PMCod = new int[1] ;
      T001G34_A396EmprCod = new String[] {""} ;
      T001G34_A9425OMCod = new int[1] ;
      T001G35_A396EmprCod = new String[] {""} ;
      T001G35_A602MaqCod = new String[] {""} ;
      T001G35_n602MaqCod = new boolean[] {false} ;
      T001G35_A8008Maq_Prg = new String[] {""} ;
      T001G36_A396EmprCod = new String[] {""} ;
      T001G36_A602MaqCod = new String[] {""} ;
      T001G36_n602MaqCod = new boolean[] {false} ;
      T001G36_A6874CPROCORIG = new String[] {""} ;
      T001G37_A396EmprCod = new String[] {""} ;
      T001G37_A6319C_Barcod = new int[1] ;
      T001G37_A6320C_Barcodre = new byte[1] ;
      T001G37_A6321C_Barcodpa = new String[] {""} ;
      T001G37_A6322C_Reclinma = new short[1] ;
      T001G38_A396EmprCod = new String[] {""} ;
      T001G38_A602MaqCod = new String[] {""} ;
      T001G38_n602MaqCod = new boolean[] {false} ;
      T001G38_A6260MaqTqn = new byte[1] ;
      T001G39_A396EmprCod = new String[] {""} ;
      T001G39_A6188MaqTArt = new short[1] ;
      T001G39_A602MaqCod = new String[] {""} ;
      T001G39_n602MaqCod = new boolean[] {false} ;
      T001G40_A396EmprCod = new String[] {""} ;
      T001G40_A602MaqCod = new String[] {""} ;
      T001G40_n602MaqCod = new boolean[] {false} ;
      T001G40_A6078MaqCliCod = new int[1] ;
      T001G40_A6079MaqArtCod = new String[] {""} ;
      T001G41_A396EmprCod = new String[] {""} ;
      T001G41_A6037Mq_Grupo = new byte[1] ;
      T001G41_A602MaqCod = new String[] {""} ;
      T001G41_n602MaqCod = new boolean[] {false} ;
      T001G42_A396EmprCod = new String[] {""} ;
      T001G42_A6000CRCod = new String[] {""} ;
      T001G42_A6005CRLin = new short[1] ;
      T001G43_A396EmprCod = new String[] {""} ;
      T001G43_A602MaqCod = new String[] {""} ;
      T001G43_n602MaqCod = new boolean[] {false} ;
      T001G43_A5879PlaMTAOrd = new short[1] ;
      T001G44_A396EmprCod = new String[] {""} ;
      T001G44_A5603PrdNumM = new String[] {""} ;
      T001G44_A602MaqCod = new String[] {""} ;
      T001G44_n602MaqCod = new boolean[] {false} ;
      T001G45_A396EmprCod = new String[] {""} ;
      T001G45_A602MaqCod = new String[] {""} ;
      T001G45_n602MaqCod = new boolean[] {false} ;
      T001G45_A5525MaqPrdNum = new String[] {""} ;
      T001G46_A396EmprCod = new String[] {""} ;
      T001G46_A764ProForCod = new String[] {""} ;
      T001G46_A5191ProForLC = new short[1] ;
      T001G47_A396EmprCod = new String[] {""} ;
      T001G47_A4686MaqTipArt = new short[1] ;
      T001G47_A602MaqCod = new String[] {""} ;
      T001G47_n602MaqCod = new boolean[] {false} ;
      T001G48_A396EmprCod = new String[] {""} ;
      T001G48_A3331LanBroCod = new byte[1] ;
      T001G48_A3333LanBroLin = new short[1] ;
      T001G49_A396EmprCod = new String[] {""} ;
      T001G49_A602MaqCod = new String[] {""} ;
      T001G49_n602MaqCod = new boolean[] {false} ;
      T001G49_A3047LOParId = new String[] {""} ;
      T001G50_A396EmprCod = new String[] {""} ;
      T001G50_A129BarCod = new int[1] ;
      T001G50_A132BarCodReo = new byte[1] ;
      T001G50_A130BarCodPar = new String[] {""} ;
      T001G50_A2804RecLinMaq = new short[1] ;
      T001G51_A396EmprCod = new String[] {""} ;
      T001G51_A602MaqCod = new String[] {""} ;
      T001G51_n602MaqCod = new boolean[] {false} ;
      T001G51_A2461PlaFecTin = new java.util.Date[] {GXutil.nullDate()} ;
      T001G52_A396EmprCod = new String[] {""} ;
      T001G52_A602MaqCod = new String[] {""} ;
      T001G52_n602MaqCod = new boolean[] {false} ;
      T001G52_A2019MaqMadLin = new short[1] ;
      T001G53_A396EmprCod = new String[] {""} ;
      T001G53_A602MaqCod = new String[] {""} ;
      T001G53_n602MaqCod = new boolean[] {false} ;
      T001G53_A2014MaqConLin = new short[1] ;
      T001G54_A396EmprCod = new String[] {""} ;
      T001G54_A1621CosTermCod = new String[] {""} ;
      T001G54_A1615CosLin = new int[1] ;
      T001G55_A396EmprCod = new String[] {""} ;
      T001G55_A602MaqCod = new String[] {""} ;
      T001G55_n602MaqCod = new boolean[] {false} ;
      T001G55_A1142MaqFCod = new String[] {""} ;
      T001G55_A3068PlaEtaOrd = new short[1] ;
      T001G55_A3069PlaEtaOrdA = new byte[1] ;
      T001G55_A129BarCod = new int[1] ;
      T001G55_A132BarCodReo = new byte[1] ;
      T001G55_A130BarCodPar = new String[] {""} ;
      T001G56_A396EmprCod = new String[] {""} ;
      T001G56_A602MaqCod = new String[] {""} ;
      T001G56_n602MaqCod = new boolean[] {false} ;
      T001G56_A634MhiMes = new byte[1] ;
      T001G56_A632MhiAny = new short[1] ;
      T001G57_A396EmprCod = new String[] {""} ;
      T001G57_A602MaqCod = new String[] {""} ;
      T001G57_n602MaqCod = new boolean[] {false} ;
      T001G57_A320DesTecLin = new byte[1] ;
      T001G58_A396EmprCod = new String[] {""} ;
      T001G58_A602MaqCod = new String[] {""} ;
      T001G58_n602MaqCod = new boolean[] {false} ;
      T001G58_A599MaqAny = new short[1] ;
      T001G58_A614MaqMes = new byte[1] ;
      T001G59_A396EmprCod = new String[] {""} ;
      T001G59_A539HisBarCod = new int[1] ;
      T001G59_A545HisCodReo = new byte[1] ;
      T001G59_A544HisCodPar = new String[] {""} ;
      T001G59_A833TipDefCod = new short[1] ;
      T001G60_A396EmprCod = new String[] {""} ;
      T001G60_A602MaqCod = new String[] {""} ;
      T001G60_n602MaqCod = new boolean[] {false} ;
      T001G60_A558HisProFec = new java.util.Date[] {GXutil.nullDate()} ;
      T001G61_A396EmprCod = new String[] {""} ;
      T001G61_A501GruMaqCod = new String[] {""} ;
      T001G61_A602MaqCod = new String[] {""} ;
      T001G61_n602MaqCod = new boolean[] {false} ;
      T001G62_A396EmprCod = new String[] {""} ;
      T001G62_A457FasCod = new String[] {""} ;
      T001G63_A396EmprCod = new String[] {""} ;
      T001G63_A361DisCod = new int[1] ;
      T001G64_A396EmprCod = new String[] {""} ;
      T001G64_A129BarCod = new int[1] ;
      T001G64_A132BarCodReo = new byte[1] ;
      T001G64_A130BarCodPar = new String[] {""} ;
      T001G64_A758ProCod = new String[] {""} ;
      T001G64_A194BarOrdLin = new short[1] ;
      T001G65_A396EmprCod = new String[] {""} ;
      T001G65_A602MaqCod = new String[] {""} ;
      T001G65_n602MaqCod = new boolean[] {false} ;
      Z1144MaqFFind = "" ;
      Z1145MaqDscFind = "" ;
      T001G66_A457FasCod = new String[] {""} ;
      T001G66_A602MaqCod = new String[] {""} ;
      T001G66_n602MaqCod = new boolean[] {false} ;
      T001G66_A1142MaqFCod = new String[] {""} ;
      T001G66_A1143MaqFDsc = new String[] {""} ;
      T001G66_A396EmprCod = new String[] {""} ;
      T001G66_A1144MaqFFind = new String[] {""} ;
      T001G66_n1144MaqFFind = new boolean[] {false} ;
      T001G66_A1145MaqDscFind = new String[] {""} ;
      T001G66_n1145MaqDscFind = new boolean[] {false} ;
      T001G4_A1144MaqFFind = new String[] {""} ;
      T001G4_n1144MaqFFind = new boolean[] {false} ;
      T001G4_A1145MaqDscFind = new String[] {""} ;
      T001G4_n1145MaqDscFind = new boolean[] {false} ;
      T001G67_A1144MaqFFind = new String[] {""} ;
      T001G67_n1144MaqFFind = new boolean[] {false} ;
      T001G67_A1145MaqDscFind = new String[] {""} ;
      T001G67_n1145MaqDscFind = new boolean[] {false} ;
      T001G68_A396EmprCod = new String[] {""} ;
      T001G68_A602MaqCod = new String[] {""} ;
      T001G68_n602MaqCod = new boolean[] {false} ;
      T001G68_A1142MaqFCod = new String[] {""} ;
      T001G3_A602MaqCod = new String[] {""} ;
      T001G3_n602MaqCod = new boolean[] {false} ;
      T001G3_A1142MaqFCod = new String[] {""} ;
      T001G3_A1143MaqFDsc = new String[] {""} ;
      T001G3_A396EmprCod = new String[] {""} ;
      T001G2_A602MaqCod = new String[] {""} ;
      T001G2_n602MaqCod = new boolean[] {false} ;
      T001G2_A1142MaqFCod = new String[] {""} ;
      T001G2_A1143MaqFDsc = new String[] {""} ;
      T001G2_A396EmprCod = new String[] {""} ;
      T001G72_A1144MaqFFind = new String[] {""} ;
      T001G72_n1144MaqFFind = new boolean[] {false} ;
      T001G72_A1145MaqDscFind = new String[] {""} ;
      T001G72_n1145MaqDscFind = new boolean[] {false} ;
      T001G73_A396EmprCod = new String[] {""} ;
      T001G73_A602MaqCod = new String[] {""} ;
      T001G73_n602MaqCod = new boolean[] {false} ;
      T001G73_A1142MaqFCod = new String[] {""} ;
      T001G73_A3068PlaEtaOrd = new short[1] ;
      T001G73_A3069PlaEtaOrdA = new byte[1] ;
      T001G73_A129BarCod = new int[1] ;
      T001G73_A132BarCodReo = new byte[1] ;
      T001G73_A130BarCodPar = new String[] {""} ;
      T001G74_A396EmprCod = new String[] {""} ;
      T001G74_A602MaqCod = new String[] {""} ;
      T001G74_n602MaqCod = new boolean[] {false} ;
      T001G74_A1142MaqFCod = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i1257MaqFasUni = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      Z14276MaqFFAct = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tmaqfas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmaqfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmaqfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmaqfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmaqfas__default(),
         new Object[] {
             new Object[] {
            T001G2_A602MaqCod, T001G2_A1142MaqFCod, T001G2_A1143MaqFDsc, T001G2_A396EmprCod
            }
            , new Object[] {
            T001G3_A602MaqCod, T001G3_A1142MaqFCod, T001G3_A1143MaqFDsc, T001G3_A396EmprCod
            }
            , new Object[] {
            T001G4_A1144MaqFFind, T001G4_n1144MaqFFind, T001G4_A1145MaqDscFind, T001G4_n1145MaqDscFind
            }
            , new Object[] {
            T001G5_A602MaqCod, T001G5_A1257MaqFasUni, T001G5_n1257MaqFasUni, T001G5_A606MaqDsc, T001G5_n606MaqDsc, T001G5_A396EmprCod
            }
            , new Object[] {
            T001G6_A602MaqCod, T001G6_A1257MaqFasUni, T001G6_n1257MaqFasUni, T001G6_A606MaqDsc, T001G6_n606MaqDsc, T001G6_A396EmprCod
            }
            , new Object[] {
            T001G7_A407EmprNom, T001G7_n407EmprNom
            }
            , new Object[] {
            T001G8_A602MaqCod, T001G8_A1257MaqFasUni, T001G8_n1257MaqFasUni, T001G8_A407EmprNom, T001G8_n407EmprNom, T001G8_A606MaqDsc, T001G8_n606MaqDsc, T001G8_A396EmprCod
            }
            , new Object[] {
            T001G9_A396EmprCod, T001G9_A602MaqCod
            }
            , new Object[] {
            T001G10_A396EmprCod, T001G10_A602MaqCod
            }
            , new Object[] {
            T001G11_A396EmprCod, T001G11_A602MaqCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001G15_A396EmprCod, T001G15_A602MaqCod, T001G15_A14529MqCAnyo, T001G15_A14530MqCMes
            }
            , new Object[] {
            T001G16_A396EmprCod, T001G16_A129BarCod, T001G16_A132BarCodReo, T001G16_A130BarCodPar, T001G16_A14152MEnvOrd
            }
            , new Object[] {
            T001G17_A396EmprCod, T001G17_A13604RARID, T001G17_A602MaqCod
            }
            , new Object[] {
            T001G18_A396EmprCod, T001G18_A602MaqCod, T001G18_A13193MaqHdr, T001G18_A13194MaqHdrR, T001G18_A13195MaqHdrP, T001G18_A13196MaqRecLinM
            }
            , new Object[] {
            T001G19_A396EmprCod, T001G19_A13137NCHdr, T001G19_A13138NCHdrr, T001G19_A13139NCHdrp
            }
            , new Object[] {
            T001G20_A396EmprCod, T001G20_A12673LavMqId
            }
            , new Object[] {
            T001G21_A396EmprCod, T001G21_A602MaqCod, T001G21_A12444MaqAnyNP, T001G21_A12445MaqMesNP
            }
            , new Object[] {
            T001G22_A396EmprCod, T001G22_A602MaqCod, T001G22_A12434MaqAnyM, T001G22_A12435MaqMesM
            }
            , new Object[] {
            T001G23_A396EmprCod, T001G23_A4929Inc_Dia, T001G23_A5728JBCLLin
            }
            , new Object[] {
            T001G24_A396EmprCod, T001G24_A11604PArtId
            }
            , new Object[] {
            T001G25_A396EmprCod, T001G25_A602MaqCod, T001G25_A11445MaqFch
            }
            , new Object[] {
            T001G26_A396EmprCod, T001G26_A602MaqCod, T001G26_A11438MaqEquCod, T001G26_A11439MaqSEqCod, T001G26_A11440MaqPieCod
            }
            , new Object[] {
            T001G27_A396EmprCod, T001G27_A602MaqCod, T001G27_A11432MaqDocId
            }
            , new Object[] {
            T001G28_A396EmprCod, T001G28_A602MaqCod, T001G28_A10111Mq_Dia, T001G28_A10112Mq_Op
            }
            , new Object[] {
            T001G29_A396EmprCod, T001G29_A252CliCod, T001G29_A65ArtCod, T001G29_A10041ArtSH, T001G29_A10042ArtMqFa
            }
            , new Object[] {
            T001G30_A396EmprCod, T001G30_A602MaqCod, T001G30_A74MaqTMuIni
            }
            , new Object[] {
            T001G31_A396EmprCod, T001G31_A602MaqCod, T001G31_A9725MaqFabC
            }
            , new Object[] {
            T001G32_A396EmprCod, T001G32_A9428SMCod
            }
            , new Object[] {
            T001G33_A396EmprCod, T001G33_A9429PMCod
            }
            , new Object[] {
            T001G34_A396EmprCod, T001G34_A9425OMCod
            }
            , new Object[] {
            T001G35_A396EmprCod, T001G35_A602MaqCod, T001G35_A8008Maq_Prg
            }
            , new Object[] {
            T001G36_A396EmprCod, T001G36_A602MaqCod, T001G36_A6874CPROCORIG
            }
            , new Object[] {
            T001G37_A396EmprCod, T001G37_A6319C_Barcod, T001G37_A6320C_Barcodre, T001G37_A6321C_Barcodpa, T001G37_A6322C_Reclinma
            }
            , new Object[] {
            T001G38_A396EmprCod, T001G38_A602MaqCod, T001G38_A6260MaqTqn
            }
            , new Object[] {
            T001G39_A396EmprCod, T001G39_A6188MaqTArt, T001G39_A602MaqCod
            }
            , new Object[] {
            T001G40_A396EmprCod, T001G40_A602MaqCod, T001G40_A6078MaqCliCod, T001G40_A6079MaqArtCod
            }
            , new Object[] {
            T001G41_A396EmprCod, T001G41_A6037Mq_Grupo, T001G41_A602MaqCod
            }
            , new Object[] {
            T001G42_A396EmprCod, T001G42_A6000CRCod, T001G42_A6005CRLin
            }
            , new Object[] {
            T001G43_A396EmprCod, T001G43_A602MaqCod, T001G43_A5879PlaMTAOrd
            }
            , new Object[] {
            T001G44_A396EmprCod, T001G44_A5603PrdNumM, T001G44_A602MaqCod
            }
            , new Object[] {
            T001G45_A396EmprCod, T001G45_A602MaqCod, T001G45_A5525MaqPrdNum
            }
            , new Object[] {
            T001G46_A396EmprCod, T001G46_A764ProForCod, T001G46_A5191ProForLC
            }
            , new Object[] {
            T001G47_A396EmprCod, T001G47_A4686MaqTipArt, T001G47_A602MaqCod
            }
            , new Object[] {
            T001G48_A396EmprCod, T001G48_A3331LanBroCod, T001G48_A3333LanBroLin
            }
            , new Object[] {
            T001G49_A396EmprCod, T001G49_A602MaqCod, T001G49_A3047LOParId
            }
            , new Object[] {
            T001G50_A396EmprCod, T001G50_A129BarCod, T001G50_A132BarCodReo, T001G50_A130BarCodPar, T001G50_A2804RecLinMaq
            }
            , new Object[] {
            T001G51_A396EmprCod, T001G51_A602MaqCod, T001G51_A2461PlaFecTin
            }
            , new Object[] {
            T001G52_A396EmprCod, T001G52_A602MaqCod, T001G52_A2019MaqMadLin
            }
            , new Object[] {
            T001G53_A396EmprCod, T001G53_A602MaqCod, T001G53_A2014MaqConLin
            }
            , new Object[] {
            T001G54_A396EmprCod, T001G54_A1621CosTermCod, T001G54_A1615CosLin
            }
            , new Object[] {
            T001G55_A396EmprCod, T001G55_A602MaqCod, T001G55_A1142MaqFCod, T001G55_A3068PlaEtaOrd, T001G55_A3069PlaEtaOrdA, T001G55_A129BarCod, T001G55_A132BarCodReo, T001G55_A130BarCodPar
            }
            , new Object[] {
            T001G56_A396EmprCod, T001G56_A602MaqCod, T001G56_A634MhiMes, T001G56_A632MhiAny
            }
            , new Object[] {
            T001G57_A396EmprCod, T001G57_A602MaqCod, T001G57_A320DesTecLin
            }
            , new Object[] {
            T001G58_A396EmprCod, T001G58_A602MaqCod, T001G58_A599MaqAny, T001G58_A614MaqMes
            }
            , new Object[] {
            T001G59_A396EmprCod, T001G59_A539HisBarCod, T001G59_A545HisCodReo, T001G59_A544HisCodPar, T001G59_A833TipDefCod
            }
            , new Object[] {
            T001G60_A396EmprCod, T001G60_A602MaqCod, T001G60_A558HisProFec
            }
            , new Object[] {
            T001G61_A396EmprCod, T001G61_A501GruMaqCod, T001G61_A602MaqCod
            }
            , new Object[] {
            T001G62_A396EmprCod, T001G62_A457FasCod
            }
            , new Object[] {
            T001G63_A396EmprCod, T001G63_A361DisCod
            }
            , new Object[] {
            T001G64_A396EmprCod, T001G64_A129BarCod, T001G64_A132BarCodReo, T001G64_A130BarCodPar, T001G64_A758ProCod, T001G64_A194BarOrdLin
            }
            , new Object[] {
            T001G65_A396EmprCod, T001G65_A602MaqCod
            }
            , new Object[] {
            T001G66_A457FasCod, T001G66_A602MaqCod, T001G66_A1142MaqFCod, T001G66_A1143MaqFDsc, T001G66_A396EmprCod, T001G66_A1144MaqFFind, T001G66_n1144MaqFFind, T001G66_A1145MaqDscFind, T001G66_n1145MaqDscFind
            }
            , new Object[] {
            T001G67_A1144MaqFFind, T001G67_n1144MaqFFind, T001G67_A1145MaqDscFind, T001G67_n1145MaqDscFind
            }
            , new Object[] {
            T001G68_A396EmprCod, T001G68_A602MaqCod, T001G68_A1142MaqFCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001G72_A1144MaqFFind, T001G72_n1144MaqFFind, T001G72_A1145MaqDscFind, T001G72_n1145MaqDscFind
            }
            , new Object[] {
            T001G73_A396EmprCod, T001G73_A602MaqCod, T001G73_A1142MaqFCod, T001G73_A3068PlaEtaOrd, T001G73_A3069PlaEtaOrdA, T001G73_A129BarCod, T001G73_A132BarCodReo, T001G73_A130BarCodPar
            }
            , new Object[] {
            T001G74_A396EmprCod, T001G74_A602MaqCod, T001G74_A1142MaqFCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV37Pgmname = "TMAQFAS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte AV28Kgs ;
   private byte AV27Mts ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short nRcdDeleted_152 ;
   private short nRcdExists_152 ;
   private short nIsMod_152 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount152 ;
   private short RcdFound152 ;
   private short nBlankRcdUsr152 ;
   private short RcdFound65 ;
   private short nIsDirty_65 ;
   private short nIsDirty_152 ;
   private int nRC_GXsfl_36 ;
   private int nGXsfl_36_idx=1 ;
   private int trnEnded ;
   private int edtMaqCod_Enabled ;
   private int edtMaqDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtMaqFCod_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_maqfcod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtMaqFCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV29EmprCod ;
   private String wcpOAV30MaqCod ;
   private String Z396EmprCod ;
   private String Z602MaqCod ;
   private String Z1257MaqFasUni ;
   private String Z606MaqDsc ;
   private String Z1142MaqFCod ;
   private String Z1143MaqFDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A1142MaqFCod ;
   private String Gx_mode ;
   private String AV29EmprCod ;
   private String AV30MaqCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String sGXsfl_36_idx="0001" ;
   private String A1257MaqFasUni ;
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
   private String edtMaqCod_Internalname ;
   private String A602MaqCod ;
   private String edtMaqCod_Jsonclick ;
   private String edtMaqDsc_Internalname ;
   private String A606MaqDsc ;
   private String edtMaqDsc_Jsonclick ;
   private String TempTags ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV37Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_maqfcod_Caption ;
   private String Combo_maqfcod_Cls ;
   private String Combo_maqfcod_Internalname ;
   private String sMode152 ;
   private String edtMaqFCod_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A1145MaqDscFind ;
   private String A1144MaqFFind ;
   private String A1143MaqFDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_maqfcod_Objectcall ;
   private String Combo_maqfcod_Class ;
   private String Combo_maqfcod_Icontype ;
   private String Combo_maqfcod_Icon ;
   private String Combo_maqfcod_Tooltip ;
   private String Combo_maqfcod_Selectedvalue_set ;
   private String Combo_maqfcod_Selectedvalue_get ;
   private String Combo_maqfcod_Selectedtext_set ;
   private String Combo_maqfcod_Selectedtext_get ;
   private String Combo_maqfcod_Gamoauthtoken ;
   private String Combo_maqfcod_Ddointernalname ;
   private String Combo_maqfcod_Titlecontrolalign ;
   private String Combo_maqfcod_Dropdownoptionstype ;
   private String Combo_maqfcod_Titlecontrolidtoreplace ;
   private String Combo_maqfcod_Datalisttype ;
   private String Combo_maqfcod_Datalistfixedvalues ;
   private String Combo_maqfcod_Datalistproc ;
   private String Combo_maqfcod_Datalistprocparametersprefix ;
   private String Combo_maqfcod_Remoteservicesparameters ;
   private String Combo_maqfcod_Htmltemplate ;
   private String Combo_maqfcod_Multiplevaluestype ;
   private String Combo_maqfcod_Loadingdata ;
   private String Combo_maqfcod_Noresultsfound ;
   private String Combo_maqfcod_Emptyitemtext ;
   private String Combo_maqfcod_Onlyselectedvalues ;
   private String Combo_maqfcod_Selectalltext ;
   private String Combo_maqfcod_Multiplevaluesseparator ;
   private String Combo_maqfcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode65 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A14276MaqFFAct ;
   private String AV18Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z1144MaqFFind ;
   private String Z1145MaqDscFind ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtMaqFCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i1257MaqFasUni ;
   private String subGridlevel_level1_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String Z14276MaqFFAct ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n1257MaqFasUni ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_maqfcod_Isgriditem ;
   private boolean Combo_maqfcod_Emptyitem ;
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n1145MaqDscFind ;
   private boolean n1144MaqFFind ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_maqfcod_Enabled ;
   private boolean Combo_maqfcod_Visible ;
   private boolean Combo_maqfcod_Allowmultipleselection ;
   private boolean Combo_maqfcod_Hasdescription ;
   private boolean Combo_maqfcod_Includeonlyselectedoption ;
   private boolean Combo_maqfcod_Includeselectalloption ;
   private boolean Combo_maqfcod_Includeaddnewoption ;
   private boolean n602MaqCod ;
   private boolean n606MaqDsc ;
   private boolean returnInSub ;
   private String AV35ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV33WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_maqfcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMaqFasUni ;
   private ICheckbox chkMaqFFAct ;
   private IDataStoreProvider pr_default ;
   private String[] T001G7_A407EmprNom ;
   private boolean[] T001G7_n407EmprNom ;
   private String[] T001G8_A602MaqCod ;
   private boolean[] T001G8_n602MaqCod ;
   private String[] T001G8_A1257MaqFasUni ;
   private boolean[] T001G8_n1257MaqFasUni ;
   private String[] T001G8_A407EmprNom ;
   private boolean[] T001G8_n407EmprNom ;
   private String[] T001G8_A606MaqDsc ;
   private boolean[] T001G8_n606MaqDsc ;
   private String[] T001G8_A396EmprCod ;
   private String[] T001G9_A396EmprCod ;
   private String[] T001G9_A602MaqCod ;
   private boolean[] T001G9_n602MaqCod ;
   private String[] T001G6_A602MaqCod ;
   private boolean[] T001G6_n602MaqCod ;
   private String[] T001G6_A1257MaqFasUni ;
   private boolean[] T001G6_n1257MaqFasUni ;
   private String[] T001G6_A606MaqDsc ;
   private boolean[] T001G6_n606MaqDsc ;
   private String[] T001G6_A396EmprCod ;
   private String[] T001G10_A396EmprCod ;
   private String[] T001G10_A602MaqCod ;
   private boolean[] T001G10_n602MaqCod ;
   private String[] T001G11_A396EmprCod ;
   private String[] T001G11_A602MaqCod ;
   private boolean[] T001G11_n602MaqCod ;
   private String[] T001G5_A602MaqCod ;
   private boolean[] T001G5_n602MaqCod ;
   private String[] T001G5_A1257MaqFasUni ;
   private boolean[] T001G5_n1257MaqFasUni ;
   private String[] T001G5_A606MaqDsc ;
   private boolean[] T001G5_n606MaqDsc ;
   private String[] T001G5_A396EmprCod ;
   private String[] T001G15_A396EmprCod ;
   private String[] T001G15_A602MaqCod ;
   private boolean[] T001G15_n602MaqCod ;
   private short[] T001G15_A14529MqCAnyo ;
   private byte[] T001G15_A14530MqCMes ;
   private String[] T001G16_A396EmprCod ;
   private int[] T001G16_A129BarCod ;
   private byte[] T001G16_A132BarCodReo ;
   private String[] T001G16_A130BarCodPar ;
   private short[] T001G16_A14152MEnvOrd ;
   private String[] T001G17_A396EmprCod ;
   private int[] T001G17_A13604RARID ;
   private String[] T001G17_A602MaqCod ;
   private boolean[] T001G17_n602MaqCod ;
   private String[] T001G18_A396EmprCod ;
   private String[] T001G18_A602MaqCod ;
   private boolean[] T001G18_n602MaqCod ;
   private int[] T001G18_A13193MaqHdr ;
   private byte[] T001G18_A13194MaqHdrR ;
   private String[] T001G18_A13195MaqHdrP ;
   private short[] T001G18_A13196MaqRecLinM ;
   private String[] T001G19_A396EmprCod ;
   private int[] T001G19_A13137NCHdr ;
   private byte[] T001G19_A13138NCHdrr ;
   private String[] T001G19_A13139NCHdrp ;
   private String[] T001G20_A396EmprCod ;
   private int[] T001G20_A12673LavMqId ;
   private String[] T001G21_A396EmprCod ;
   private String[] T001G21_A602MaqCod ;
   private boolean[] T001G21_n602MaqCod ;
   private short[] T001G21_A12444MaqAnyNP ;
   private byte[] T001G21_A12445MaqMesNP ;
   private String[] T001G22_A396EmprCod ;
   private String[] T001G22_A602MaqCod ;
   private boolean[] T001G22_n602MaqCod ;
   private short[] T001G22_A12434MaqAnyM ;
   private byte[] T001G22_A12435MaqMesM ;
   private String[] T001G23_A396EmprCod ;
   private java.util.Date[] T001G23_A4929Inc_Dia ;
   private short[] T001G23_A5728JBCLLin ;
   private String[] T001G24_A396EmprCod ;
   private int[] T001G24_A11604PArtId ;
   private String[] T001G25_A396EmprCod ;
   private String[] T001G25_A602MaqCod ;
   private boolean[] T001G25_n602MaqCod ;
   private java.util.Date[] T001G25_A11445MaqFch ;
   private String[] T001G26_A396EmprCod ;
   private String[] T001G26_A602MaqCod ;
   private boolean[] T001G26_n602MaqCod ;
   private String[] T001G26_A11438MaqEquCod ;
   private String[] T001G26_A11439MaqSEqCod ;
   private String[] T001G26_A11440MaqPieCod ;
   private String[] T001G27_A396EmprCod ;
   private String[] T001G27_A602MaqCod ;
   private boolean[] T001G27_n602MaqCod ;
   private short[] T001G27_A11432MaqDocId ;
   private String[] T001G28_A396EmprCod ;
   private String[] T001G28_A602MaqCod ;
   private boolean[] T001G28_n602MaqCod ;
   private java.util.Date[] T001G28_A10111Mq_Dia ;
   private int[] T001G28_A10112Mq_Op ;
   private String[] T001G29_A396EmprCod ;
   private int[] T001G29_A252CliCod ;
   private String[] T001G29_A65ArtCod ;
   private String[] T001G29_A10041ArtSH ;
   private String[] T001G29_A10042ArtMqFa ;
   private String[] T001G30_A396EmprCod ;
   private String[] T001G30_A602MaqCod ;
   private boolean[] T001G30_n602MaqCod ;
   private java.util.Date[] T001G30_A74MaqTMuIni ;
   private String[] T001G31_A396EmprCod ;
   private String[] T001G31_A602MaqCod ;
   private boolean[] T001G31_n602MaqCod ;
   private String[] T001G31_A9725MaqFabC ;
   private String[] T001G32_A396EmprCod ;
   private int[] T001G32_A9428SMCod ;
   private String[] T001G33_A396EmprCod ;
   private int[] T001G33_A9429PMCod ;
   private String[] T001G34_A396EmprCod ;
   private int[] T001G34_A9425OMCod ;
   private String[] T001G35_A396EmprCod ;
   private String[] T001G35_A602MaqCod ;
   private boolean[] T001G35_n602MaqCod ;
   private String[] T001G35_A8008Maq_Prg ;
   private String[] T001G36_A396EmprCod ;
   private String[] T001G36_A602MaqCod ;
   private boolean[] T001G36_n602MaqCod ;
   private String[] T001G36_A6874CPROCORIG ;
   private String[] T001G37_A396EmprCod ;
   private int[] T001G37_A6319C_Barcod ;
   private byte[] T001G37_A6320C_Barcodre ;
   private String[] T001G37_A6321C_Barcodpa ;
   private short[] T001G37_A6322C_Reclinma ;
   private String[] T001G38_A396EmprCod ;
   private String[] T001G38_A602MaqCod ;
   private boolean[] T001G38_n602MaqCod ;
   private byte[] T001G38_A6260MaqTqn ;
   private String[] T001G39_A396EmprCod ;
   private short[] T001G39_A6188MaqTArt ;
   private String[] T001G39_A602MaqCod ;
   private boolean[] T001G39_n602MaqCod ;
   private String[] T001G40_A396EmprCod ;
   private String[] T001G40_A602MaqCod ;
   private boolean[] T001G40_n602MaqCod ;
   private int[] T001G40_A6078MaqCliCod ;
   private String[] T001G40_A6079MaqArtCod ;
   private String[] T001G41_A396EmprCod ;
   private byte[] T001G41_A6037Mq_Grupo ;
   private String[] T001G41_A602MaqCod ;
   private boolean[] T001G41_n602MaqCod ;
   private String[] T001G42_A396EmprCod ;
   private String[] T001G42_A6000CRCod ;
   private short[] T001G42_A6005CRLin ;
   private String[] T001G43_A396EmprCod ;
   private String[] T001G43_A602MaqCod ;
   private boolean[] T001G43_n602MaqCod ;
   private short[] T001G43_A5879PlaMTAOrd ;
   private String[] T001G44_A396EmprCod ;
   private String[] T001G44_A5603PrdNumM ;
   private String[] T001G44_A602MaqCod ;
   private boolean[] T001G44_n602MaqCod ;
   private String[] T001G45_A396EmprCod ;
   private String[] T001G45_A602MaqCod ;
   private boolean[] T001G45_n602MaqCod ;
   private String[] T001G45_A5525MaqPrdNum ;
   private String[] T001G46_A396EmprCod ;
   private String[] T001G46_A764ProForCod ;
   private short[] T001G46_A5191ProForLC ;
   private String[] T001G47_A396EmprCod ;
   private short[] T001G47_A4686MaqTipArt ;
   private String[] T001G47_A602MaqCod ;
   private boolean[] T001G47_n602MaqCod ;
   private String[] T001G48_A396EmprCod ;
   private byte[] T001G48_A3331LanBroCod ;
   private short[] T001G48_A3333LanBroLin ;
   private String[] T001G49_A396EmprCod ;
   private String[] T001G49_A602MaqCod ;
   private boolean[] T001G49_n602MaqCod ;
   private String[] T001G49_A3047LOParId ;
   private String[] T001G50_A396EmprCod ;
   private int[] T001G50_A129BarCod ;
   private byte[] T001G50_A132BarCodReo ;
   private String[] T001G50_A130BarCodPar ;
   private short[] T001G50_A2804RecLinMaq ;
   private String[] T001G51_A396EmprCod ;
   private String[] T001G51_A602MaqCod ;
   private boolean[] T001G51_n602MaqCod ;
   private java.util.Date[] T001G51_A2461PlaFecTin ;
   private String[] T001G52_A396EmprCod ;
   private String[] T001G52_A602MaqCod ;
   private boolean[] T001G52_n602MaqCod ;
   private short[] T001G52_A2019MaqMadLin ;
   private String[] T001G53_A396EmprCod ;
   private String[] T001G53_A602MaqCod ;
   private boolean[] T001G53_n602MaqCod ;
   private short[] T001G53_A2014MaqConLin ;
   private String[] T001G54_A396EmprCod ;
   private String[] T001G54_A1621CosTermCod ;
   private int[] T001G54_A1615CosLin ;
   private String[] T001G55_A396EmprCod ;
   private String[] T001G55_A602MaqCod ;
   private boolean[] T001G55_n602MaqCod ;
   private String[] T001G55_A1142MaqFCod ;
   private short[] T001G55_A3068PlaEtaOrd ;
   private byte[] T001G55_A3069PlaEtaOrdA ;
   private int[] T001G55_A129BarCod ;
   private byte[] T001G55_A132BarCodReo ;
   private String[] T001G55_A130BarCodPar ;
   private String[] T001G56_A396EmprCod ;
   private String[] T001G56_A602MaqCod ;
   private boolean[] T001G56_n602MaqCod ;
   private byte[] T001G56_A634MhiMes ;
   private short[] T001G56_A632MhiAny ;
   private String[] T001G57_A396EmprCod ;
   private String[] T001G57_A602MaqCod ;
   private boolean[] T001G57_n602MaqCod ;
   private byte[] T001G57_A320DesTecLin ;
   private String[] T001G58_A396EmprCod ;
   private String[] T001G58_A602MaqCod ;
   private boolean[] T001G58_n602MaqCod ;
   private short[] T001G58_A599MaqAny ;
   private byte[] T001G58_A614MaqMes ;
   private String[] T001G59_A396EmprCod ;
   private int[] T001G59_A539HisBarCod ;
   private byte[] T001G59_A545HisCodReo ;
   private String[] T001G59_A544HisCodPar ;
   private short[] T001G59_A833TipDefCod ;
   private String[] T001G60_A396EmprCod ;
   private String[] T001G60_A602MaqCod ;
   private boolean[] T001G60_n602MaqCod ;
   private java.util.Date[] T001G60_A558HisProFec ;
   private String[] T001G61_A396EmprCod ;
   private String[] T001G61_A501GruMaqCod ;
   private String[] T001G61_A602MaqCod ;
   private boolean[] T001G61_n602MaqCod ;
   private String[] T001G62_A396EmprCod ;
   private String[] T001G62_A457FasCod ;
   private String[] T001G63_A396EmprCod ;
   private int[] T001G63_A361DisCod ;
   private String[] T001G64_A396EmprCod ;
   private int[] T001G64_A129BarCod ;
   private byte[] T001G64_A132BarCodReo ;
   private String[] T001G64_A130BarCodPar ;
   private String[] T001G64_A758ProCod ;
   private short[] T001G64_A194BarOrdLin ;
   private String[] T001G65_A396EmprCod ;
   private String[] T001G65_A602MaqCod ;
   private boolean[] T001G65_n602MaqCod ;
   private String[] T001G66_A457FasCod ;
   private String[] T001G66_A602MaqCod ;
   private boolean[] T001G66_n602MaqCod ;
   private String[] T001G66_A1142MaqFCod ;
   private String[] T001G66_A1143MaqFDsc ;
   private String[] T001G66_A396EmprCod ;
   private String[] T001G66_A1144MaqFFind ;
   private boolean[] T001G66_n1144MaqFFind ;
   private String[] T001G66_A1145MaqDscFind ;
   private boolean[] T001G66_n1145MaqDscFind ;
   private String[] T001G4_A1144MaqFFind ;
   private boolean[] T001G4_n1144MaqFFind ;
   private String[] T001G4_A1145MaqDscFind ;
   private boolean[] T001G4_n1145MaqDscFind ;
   private String[] T001G67_A1144MaqFFind ;
   private boolean[] T001G67_n1144MaqFFind ;
   private String[] T001G67_A1145MaqDscFind ;
   private boolean[] T001G67_n1145MaqDscFind ;
   private String[] T001G68_A396EmprCod ;
   private String[] T001G68_A602MaqCod ;
   private boolean[] T001G68_n602MaqCod ;
   private String[] T001G68_A1142MaqFCod ;
   private String[] T001G3_A602MaqCod ;
   private boolean[] T001G3_n602MaqCod ;
   private String[] T001G3_A1142MaqFCod ;
   private String[] T001G3_A1143MaqFDsc ;
   private String[] T001G3_A396EmprCod ;
   private String[] T001G2_A602MaqCod ;
   private boolean[] T001G2_n602MaqCod ;
   private String[] T001G2_A1142MaqFCod ;
   private String[] T001G2_A1143MaqFDsc ;
   private String[] T001G2_A396EmprCod ;
   private String[] T001G72_A1144MaqFFind ;
   private boolean[] T001G72_n1144MaqFFind ;
   private String[] T001G72_A1145MaqDscFind ;
   private boolean[] T001G72_n1145MaqDscFind ;
   private String[] T001G73_A396EmprCod ;
   private String[] T001G73_A602MaqCod ;
   private boolean[] T001G73_n602MaqCod ;
   private String[] T001G73_A1142MaqFCod ;
   private short[] T001G73_A3068PlaEtaOrd ;
   private byte[] T001G73_A3069PlaEtaOrdA ;
   private int[] T001G73_A129BarCod ;
   private byte[] T001G73_A132BarCodReo ;
   private String[] T001G73_A130BarCodPar ;
   private String[] T001G74_A396EmprCod ;
   private String[] T001G74_A602MaqCod ;
   private boolean[] T001G74_n602MaqCod ;
   private String[] T001G74_A1142MaqFCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV34MaqFCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV31WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV32TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV36DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
}

final  class tmaqfas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmaqfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001G2", "SELECT MaqCod, MaqFCod, MaqFDsc, EmprCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ?  FOR UPDATE OF MaqFDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G3", "SELECT MaqCod, MaqFCod, MaqFDsc, EmprCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G4", "SELECT COALESCE( FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( FasDsc, '') AS MaqDscFind FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G5", "SELECT MaqCod, MaqFasUni, MaqDsc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ?  FOR UPDATE OF MaqFasUni, MaqDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G6", "SELECT MaqCod, MaqFasUni, MaqDsc, EmprCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G8", "SELECT /*+ FIRST_ROWS(100) */ TM1.MaqCod, TM1.MaqFasUni, T2.EmprNom, TM1.MaqDsc, TM1.EmprCod FROM (TXPMAQUIN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.MaqCod = ? ORDER BY TM1.EmprCod, TM1.MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( MaqCod > ?) and EmprCod = ? ORDER BY EmprCod, MaqCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE ( MaqCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, MaqCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T001G12", "INSERT INTO TXPMAQUIN(MaqCod, MaqFasUni, MaqDsc, EmprCod, MaqCodFor, MaqVolMax, MaqVolMin, MaqVolMed, MaqTemMax, MaqChp, MaqTinTip, MaqCap, MaqCosMin, MaqHorPro, MaqMinPro, MaqTip, MaqEst, MaqUltFec, MaqResDia, MaqHorAsi, MaqOrdSeq, MaqUltLin, MaqConUlt, MaqMadUlt, MaqMicro, MaqVolRes, MaqVolTop, MaqCapac, MaqPri, MaqNhd, MaqNroTub, MaqRelBan, MaqTipMaq, TipMaqCod, MaqFormul, MaqKgsMin, MaqKgsMed, MaqKgsMax, MaqPrdMin, MaqPrdMed, MaqPrdMax, MaqCCoCod, MaqCodBan, MaqSalM, MaqSalMKi, MaqSalMKf, MaqCantCor, MaqTipCen, MaqDosifP, MaqDteCol, MaqFacAbs, MaqKgsId, MaqPln, MaqPlnVis, MaqConFas, MaqVaril, MaqPasw, MaqLoc, MaqObs, MaqFabsHm, MaqHhCon, MaqHhCtr, MaqUltDoc, MaqDTTipo, MaqDTMar, MaqDTMod, MaqDTRef, MaqDTSer, MaqDTFab, MaqDTOri, MaqDTAdqFc, MaqDTAdqFo, MaqDTPrv, MaqDTPrvDi, MaqDTAdqCo, MaqDTRepCo, MaqDTCar, MaqDTVolt, MaqDTReq, MaqDTMnt, MaqDTCal, MaqDTServ, MaqDTInv, MaqDTGarIn, MaqDTGarFi, MaqVolBal, MaqCosGen, MaqOgtId, MaqMOD, MaqMOI, MaqEnerg, MaqGas, MaqAgua, MaqTmCarg, MaqTmDcarg, MaqMtsMn, MaqMtsMx, MaqCosFijo, MaqCosKg, MaqDscLarg, MaqCuerdas, MaqGI, MaqAdCent, MaqAmort) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0)", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T001G13", "UPDATE TXPMAQUIN SET MaqFasUni=?, MaqDsc=?  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new UpdateCursor("T001G14", "DELETE FROM TXPMAQUIN  WHERE EmprCod = ? AND MaqCod = ?", GX_NOMASK, "TXPMAQUIN")
         ,new ForEachCursor("T001G15", "SELECT * FROM (SELECT EmprCod, MaqCod, MqCAnyo, MqCMes FROM TXPMAQCOS WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G16", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND MEnvMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G17", "SELECT * FROM (SELECT EmprCod, RARID, MaqCod FROM TXPDSPRA3 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G18", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqHdr, MaqHdrR, MaqHdrP, MaqRecLinM FROM TXPPLNMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G19", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G20", "SELECT * FROM (SELECT EmprCod, LavMqId FROM TXPLAVMQ0 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G21", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyNP, MaqMesNP FROM TXPMAQNP1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G22", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAnyM, MaqMesM FROM TXPMAQMT1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G23", "SELECT * FROM (SELECT EmprCod, Inc_Dia, JBCLLin FROM TXPJBConL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G24", "SELECT * FROM (SELECT EmprCod, PArtId FROM TXPPedAEs WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G25", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFch FROM TXPMAQUSO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G26", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqEquCod, MaqSEqCod, MaqPieCod FROM TXPMaqPie WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G27", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqDocId FROM TXPMaqDoc WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G28", "SELECT * FROM (SELECT EmprCod, MaqCod, Mq_Dia, Mq_Op FROM TXPMQDDOP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ArtSH, ArtMqFa FROM TXPCLATF1 WHERE EmprCod = ? AND ArtMqFa = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G30", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTMuIni FROM TXPMAQTMU WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G31", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFabC FROM TXPMAQFAB WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G32", "SELECT * FROM (SELECT EmprCod, SMCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G33", "SELECT * FROM (SELECT EmprCod, PMCod FROM TXPMPREVE WHERE EmprCod = ? AND PMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G34", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND OMMaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G35", "SELECT * FROM (SELECT EmprCod, MaqCod, Maq_Prg FROM TXPMAQPRG WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G36", "SELECT * FROM (SELECT EmprCod, MaqCod, CPROCORIG FROM TXPCONVPR WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G37", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G38", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqTqn FROM TXPMAQTNQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G39", "SELECT * FROM (SELECT EmprCod, MaqTArt, MaqCod FROM TXPTARTM1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G40", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G41", "SELECT * FROM (SELECT EmprCod, Mq_Grupo, MaqCod FROM TXPMAQGR1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G42", "SELECT * FROM (SELECT EmprCod, CRCod, CRLin FROM TXPLCOSRE WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G43", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaMTAOrd FROM TXPPlaMaq WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G44", "SELECT * FROM (SELECT EmprCod, PrdNumM, MaqCod FROM TXPPRDMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G45", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqPrdNum FROM TXPMAQPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G46", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLC FROM TXPPROFOC WHERE EmprCod = ? AND ProFoMaq = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G47", "SELECT * FROM (SELECT EmprCod, MaqTipArt, MaqCod FROM TXPMAQTA1 WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G48", "SELECT * FROM (SELECT EmprCod, LanBroCod, LanBroLin FROM TXPLANBRL WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G49", "SELECT * FROM (SELECT EmprCod, MaqCod, LOParId FROM TXPLOMaqP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G50", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G51", "SELECT * FROM (SELECT EmprCod, MaqCod, PlaFecTin FROM TXPCPLATI WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G52", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqMadLin FROM TXPLMAQMA WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G53", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqConLin FROM TXPLMAQCO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G54", "SELECT * FROM (SELECT EmprCod, CosTermCod, CosLin FROM TXPCOSTES WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G55", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G56", "SELECT * FROM (SELECT EmprCod, MaqCod, MhiMes, MhiAny FROM TXPCMHPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G57", "SELECT * FROM (SELECT EmprCod, MaqCod, DesTecLin FROM TXPMAQLIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G58", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqAny, MaqMes FROM TXPMAQHNP WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G59", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G60", "SELECT * FROM (SELECT EmprCod, MaqCod, HisProFec FROM TXPCHIPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G61", "SELECT * FROM (SELECT EmprCod, GruMaqCod, MaqCod FROM TXPGRULIN WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G62", "SELECT * FROM (SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND MaqCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G63", "SELECT * FROM (SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND MaqCodDis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G64", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND MaqCodBis = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G65", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MaqCod FROM TXPMAQUIN WHERE EmprCod = ? ORDER BY EmprCod, MaqCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G66", "SELECT T2.FasCod, T1.MaqCod, T1.MaqFCod, T1.MaqFDsc, T1.EmprCod, COALESCE( T2.FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( T2.FasDsc, '') AS MaqDscFind FROM (TXPMAQFAS T1 LEFT JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.MaqFCod) WHERE T1.EmprCod = ? and T1.MaqCod = ? and T1.MaqFCod = ? ORDER BY T1.EmprCod, T1.MaqCod, T1.MaqFCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G67", "SELECT COALESCE( FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( FasDsc, '') AS MaqDscFind FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G68", "SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T001G69", "INSERT INTO TXPMAQFAS(MaqCod, MaqFCod, MaqFDsc, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPMAQFAS")
         ,new UpdateCursor("T001G70", "UPDATE TXPMAQFAS SET MaqFDsc=?  WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ?", GX_NOMASK, "TXPMAQFAS")
         ,new UpdateCursor("T001G71", "DELETE FROM TXPMAQFAS  WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ?", GX_NOMASK, "TXPMAQFAS")
         ,new ForEachCursor("T001G72", "SELECT COALESCE( FasCod, 'xxxxxxxx') AS MaqFFind, COALESCE( FasDsc, '') AS MaqDscFind FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T001G73", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqFCod, PlaEtaOrd, PlaEtaOrdA, BarCod, BarCodReo, BarCodPar FROM TXPPLAETA WHERE EmprCod = ? AND MaqCod = ? AND MaqFCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T001G74", "SELECT EmprCod, MaqCod, MaqFCod FROM TXPMAQFAS WHERE EmprCod = ? and MaqCod = ? ORDER BY EmprCod, MaqCod, MaqFCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 16);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 16);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               ((String[]) buf[3])[0] = rslt.getString(4, 10);
               ((String[]) buf[4])[0] = rslt.getString(5, 10);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 15);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 28);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 28);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
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
                  stmt.setString(3, (String)parms[5], 16);
               }
               stmt.setString(4, (String)parms[6], 3);
               return;
            case 11 :
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
                  stmt.setString(2, (String)parms[3], 16);
               }
               stmt.setString(3, (String)parms[4], 3);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 67 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 8);
               stmt.setString(3, (String)parms[3], 28);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 28);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
               }
               stmt.setString(4, (String)parms[4], 8);
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 8);
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

