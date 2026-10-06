package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tensprd_impl extends GXDataArea
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
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_18( A396EmprCod, A719PrdNum) ;
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
            AV33EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
            AV34Lb_CodGru = httpContext.GetPar( "Lb_CodGru") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Lb_CodGru", AV34Lb_CodGru);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_CODGRU", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Lb_CodGru, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Grupo de Productos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtLb_CodGru_Internalname ;
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
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      A5614Lb_UltGru = (short)(GXutil.lval( httpContext.GetPar( "Lb_UltGru"))) ;
      n5614Lb_UltGru = false ;
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

   public tensprd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tensprd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tensprd_impl.class ));
   }

   public tensprd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_CodGru_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_CodGru_Internalname, httpContext.getMessage( "Grupo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_CodGru_Internalname, GXutil.rtrim( A5612Lb_CodGru), GXutil.rtrim( localUtil.format( A5612Lb_CodGru, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_CodGru_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_CodGru_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TENSPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtLb_DscGru_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtLb_DscGru_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_DscGru_Internalname, GXutil.rtrim( A5613Lb_DscGru), GXutil.rtrim( localUtil.format( A5613Lb_DscGru, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_DscGru_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtLb_DscGru_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TENSPRD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-9 CellMarginTop", "left", "top", "", "", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TENSPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TENSPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\TENSPRD.htm");
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
      /* User Defined Control */
      ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
      ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
      ucCombo_prdnum.setProperty("IsGridItem", Combo_prdnum_Isgriditem);
      ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
      ucCombo_prdnum.setProperty("DropDownOptionsData", AV38PrdNum_Data);
      ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TENSPRD.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\TENSPRD.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtLb_UltGru_Internalname, GXutil.ltrim( localUtil.ntoc( A5614Lb_UltGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtLb_UltGru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5614Lb_UltGru), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5614Lb_UltGru), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtLb_UltGru_Jsonclick, 0, "Attribute", "", "", "", "", edtLb_UltGru_Visible, edtLb_UltGru_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_GestionLaboratorio\\TENSPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount831 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_831 = (short)(1) ;
            scanStartR4831( ) ;
            while ( RcdFound831 != 0 )
            {
               init_level_properties831( ) ;
               getByPrimaryKeyR4831( ) ;
               addRowR4831( ) ;
               scanNextR4831( ) ;
            }
            scanEndR4831( ) ;
            nBlankRcdCount831 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5614Lb_UltGru = A5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         standaloneNotModalR4831( ) ;
         standaloneModalR4831( ) ;
         sMode831 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRowR4831( ) ;
            edtLb_LinGru_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINGRU_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLb_LinGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinGru_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_831 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalR4831( ) ;
            }
            sendRowR4831( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode831 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5614Lb_UltGru = B5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount831 = (short)(5) ;
         nRcdExists_831 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartR4831( ) ;
            while ( RcdFound831 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_32831( ) ;
               init_level_properties831( ) ;
               standaloneNotModalR4831( ) ;
               getByPrimaryKeyR4831( ) ;
               standaloneModalR4831( ) ;
               addRowR4831( ) ;
               scanNextR4831( ) ;
            }
            scanEndR4831( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode831 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_32831( ) ;
         initAllR4831( ) ;
         init_level_properties831( ) ;
         B5614Lb_UltGru = A5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         nRcdExists_831 = (short)(0) ;
         nIsMod_831 = (short)(0) ;
         nRcdDeleted_831 = (short)(0) ;
         nBlankRcdCount831 = (short)(nBlankRcdUsr831+nBlankRcdCount831) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount831 > 0 )
         {
            standaloneNotModalR4831( ) ;
            standaloneModalR4831( ) ;
            addRowR4831( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtLb_LinGru_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount831 = (short)(nBlankRcdCount831-1) ;
         }
         Gx_mode = sMode831 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5614Lb_UltGru = B5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
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
      e11R42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV38PrdNum_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5612Lb_CodGru = httpContext.cgiGet( "Z5612Lb_CodGru") ;
            Z5613Lb_DscGru = httpContext.cgiGet( "Z5613Lb_DscGru") ;
            Z5614Lb_UltGru = (short)(localUtil.ctol( httpContext.cgiGet( "Z5614Lb_UltGru"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O5614Lb_UltGru = (short)(localUtil.ctol( httpContext.cgiGet( "O5614Lb_UltGru"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14093IDLb_DscGr = httpContext.cgiGet( "IDLB_DSCGR") ;
            AV33EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV34Lb_CodGru = httpContext.cgiGet( "vLB_CODGRU") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A856ValCod = (byte)(localUtil.ctol( httpContext.cgiGet( "VALCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A718PrdNom = httpContext.cgiGet( "PRDNOM") ;
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
            Combo_prdnum_Objectcall = httpContext.cgiGet( "COMBO_PRDNUM_Objectcall") ;
            Combo_prdnum_Class = httpContext.cgiGet( "COMBO_PRDNUM_Class") ;
            Combo_prdnum_Icontype = httpContext.cgiGet( "COMBO_PRDNUM_Icontype") ;
            Combo_prdnum_Icon = httpContext.cgiGet( "COMBO_PRDNUM_Icon") ;
            Combo_prdnum_Caption = httpContext.cgiGet( "COMBO_PRDNUM_Caption") ;
            Combo_prdnum_Tooltip = httpContext.cgiGet( "COMBO_PRDNUM_Tooltip") ;
            Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
            Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
            Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
            Combo_prdnum_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_set") ;
            Combo_prdnum_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedtext_get") ;
            Combo_prdnum_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDNUM_Gamoauthtoken") ;
            Combo_prdnum_Ddointernalname = httpContext.cgiGet( "COMBO_PRDNUM_Ddointernalname") ;
            Combo_prdnum_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolalign") ;
            Combo_prdnum_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDNUM_Dropdownoptionstype") ;
            Combo_prdnum_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Enabled")) ;
            Combo_prdnum_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Visible")) ;
            Combo_prdnum_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDNUM_Titlecontrolidtoreplace") ;
            Combo_prdnum_Datalisttype = httpContext.cgiGet( "COMBO_PRDNUM_Datalisttype") ;
            Combo_prdnum_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Allowmultipleselection")) ;
            Combo_prdnum_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Datalistfixedvalues") ;
            Combo_prdnum_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Isgriditem")) ;
            Combo_prdnum_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Hasdescription")) ;
            Combo_prdnum_Datalistproc = httpContext.cgiGet( "COMBO_PRDNUM_Datalistproc") ;
            Combo_prdnum_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDNUM_Datalistprocparametersprefix") ;
            Combo_prdnum_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDNUM_Remoteservicesparameters") ;
            Combo_prdnum_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDNUM_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdnum_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeonlyselectedoption")) ;
            Combo_prdnum_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeselectalloption")) ;
            Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
            Combo_prdnum_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Includeaddnewoption")) ;
            Combo_prdnum_Htmltemplate = httpContext.cgiGet( "COMBO_PRDNUM_Htmltemplate") ;
            Combo_prdnum_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluestype") ;
            Combo_prdnum_Loadingdata = httpContext.cgiGet( "COMBO_PRDNUM_Loadingdata") ;
            Combo_prdnum_Noresultsfound = httpContext.cgiGet( "COMBO_PRDNUM_Noresultsfound") ;
            Combo_prdnum_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDNUM_Emptyitemtext") ;
            Combo_prdnum_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDNUM_Onlyselectedvalues") ;
            Combo_prdnum_Selectalltext = httpContext.cgiGet( "COMBO_PRDNUM_Selectalltext") ;
            Combo_prdnum_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDNUM_Multiplevaluesseparator") ;
            Combo_prdnum_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDNUM_Addnewoptiontext") ;
            /* Read variables values. */
            A5612Lb_CodGru = httpContext.cgiGet( edtLb_CodGru_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
            A5613Lb_DscGru = httpContext.cgiGet( edtLb_DscGru_Internalname) ;
            n5613Lb_DscGru = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5613Lb_DscGru", A5613Lb_DscGru);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A5614Lb_UltGru = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_UltGru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5614Lb_UltGru = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TENSPRD");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A5612Lb_CodGru, Z5612Lb_CodGru) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("gestionlaboratorio\\tensprd:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A5612Lb_CodGru = httpContext.GetPar( "Lb_CodGru") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
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
                  sMode830 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode830 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound830 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_R40( ) ;
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
                        e11R42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12R42 ();
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
         e12R42 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllR4830( ) ;
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
         disableAttributesR4830( ) ;
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

   public void confirm_R40( )
   {
      beforeValidateR4830( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsR4830( ) ;
         }
         else
         {
            checkExtendedTableR4830( ) ;
            closeExtendedTableCursorsR4830( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode830 = Gx_mode ;
         confirm_R4831( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode830 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode830 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_R4831( )
   {
      s5614Lb_UltGru = O5614Lb_UltGru ;
      n5614Lb_UltGru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowR4831( ) ;
         if ( ( nRcdExists_831 != 0 ) || ( nIsMod_831 != 0 ) )
         {
            getKeyR4831( ) ;
            if ( ( nRcdExists_831 == 0 ) && ( nRcdDeleted_831 == 0 ) )
            {
               if ( RcdFound831 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateR4831( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableR4831( ) ;
                     closeExtendedTableCursorsR4831( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5614Lb_UltGru = A5614Lb_UltGru ;
                     n5614Lb_UltGru = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "LB_LINGRU_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLb_LinGru_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound831 != 0 )
               {
                  if ( nRcdDeleted_831 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyR4831( ) ;
                     loadR4831( ) ;
                     beforeValidateR4831( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsR4831( ) ;
                        O5614Lb_UltGru = A5614Lb_UltGru ;
                        n5614Lb_UltGru = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_831 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateR4831( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableR4831( ) ;
                           closeExtendedTableCursorsR4831( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5614Lb_UltGru = A5614Lb_UltGru ;
                           n5614Lb_UltGru = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_831 == 0 )
                  {
                     GXCCtl = "LB_LINGRU_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_LinGru_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLb_LinGru_Internalname, GXutil.ltrim( localUtil.ntoc( A5615Lb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z5615Lb_LinGru_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5615Lb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_32_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_831_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_831_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_831_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_831 != 0 )
         {
            httpContext.changePostValue( "LB_LINGRU_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinGru_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5614Lb_UltGru = s5614Lb_UltGru ;
      n5614Lb_UltGru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionR40( )
   {
   }

   public void e11R42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tensprd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tensprd_impl.this.A396EmprCod = GXv_char2[0] ;
      tensprd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tensprd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tensprd_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV33EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tensprd_impl.this.AV33EmprCod = GXv_char4[0] ;
      tensprd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tensprd_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33EmprCod", AV33EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV35WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_prdnum_Titlecontrolidtoreplace = edtPrdNum_Internalname ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "TitleControlIdToReplace", Combo_prdnum_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
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
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtLb_UltGru_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltGru_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltGru_Visible), 5, 0), true);
   }

   public void e12R42( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV36TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.gestionlaboratorio.tensprdww", new String[] {}, new String[] {}) );
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
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV38PrdNum_Data ;
      GXv_char4[0] = AV39ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.gestionlaboratorio.tensprdloaddvcombo(remoteHandle, context).execute( "PrdNum", Gx_mode, AV33EmprCod, AV34Lb_CodGru, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tensprd_impl.this.AV39ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV38PrdNum_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zmR4830( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5613Lb_DscGru = T00R46_A5613Lb_DscGru[0] ;
            Z5614Lb_UltGru = T00R46_A5614Lb_UltGru[0] ;
         }
         else
         {
            Z5613Lb_DscGru = A5613Lb_DscGru ;
            Z5614Lb_UltGru = A5614Lb_UltGru ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z5612Lb_CodGru = A5612Lb_CodGru ;
         Z5613Lb_DscGru = A5613Lb_DscGru ;
         Z5614Lb_UltGru = A5614Lb_UltGru ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtLb_UltGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltGru_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtLb_UltGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltGru_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV33EmprCod)==0) )
      {
         A396EmprCod = AV33EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00R47 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00R47_A407EmprNom[0] ;
      n407EmprNom = T00R47_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV33EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV33EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34Lb_CodGru)==0) )
      {
         A5612Lb_CodGru = AV34Lb_CodGru ;
         httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
      }
      if ( ! (GXutil.strcmp("", AV34Lb_CodGru)==0) )
      {
         edtLb_CodGru_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_CodGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_CodGru_Enabled), 5, 0), true);
      }
      else
      {
         edtLb_CodGru_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_CodGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_CodGru_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV34Lb_CodGru)==0) )
      {
         edtLb_CodGru_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_CodGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_CodGru_Enabled), 5, 0), true);
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

   public void loadR4830( )
   {
      /* Using cursor T00R48 */
      pr_default.execute(6, new Object[] {A396EmprCod, A5612Lb_CodGru});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound830 = (short)(1) ;
         A407EmprNom = T00R48_A407EmprNom[0] ;
         n407EmprNom = T00R48_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A5613Lb_DscGru = T00R48_A5613Lb_DscGru[0] ;
         n5613Lb_DscGru = T00R48_n5613Lb_DscGru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5613Lb_DscGru", A5613Lb_DscGru);
         A5614Lb_UltGru = T00R48_A5614Lb_UltGru[0] ;
         n5614Lb_UltGru = T00R48_n5614Lb_UltGru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         zmR4830( -15) ;
      }
      pr_default.close(6);
      onLoadActionsR4830( ) ;
   }

   public void onLoadActionsR4830( )
   {
      A14093IDLb_DscGr = GXutil.trim( A5612Lb_CodGru) + "-" + GXutil.trim( A5613Lb_DscGru) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14093IDLb_DscGr", A14093IDLb_DscGr);
   }

   public void checkExtendedTableR4830( )
   {
      nIsDirty_830 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_830 = (short)(1) ;
      A14093IDLb_DscGr = GXutil.trim( A5612Lb_CodGru) + "-" + GXutil.trim( A5613Lb_DscGru) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14093IDLb_DscGr", A14093IDLb_DscGr);
   }

   public void closeExtendedTableCursorsR4830( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyR4830( )
   {
      /* Using cursor T00R49 */
      pr_default.execute(7, new Object[] {A396EmprCod, A5612Lb_CodGru});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound830 = (short)(1) ;
      }
      else
      {
         RcdFound830 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00R46 */
      pr_default.execute(4, new Object[] {A396EmprCod, A5612Lb_CodGru});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T00R46_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmR4830( 15) ;
         RcdFound830 = (short)(1) ;
         A5612Lb_CodGru = T00R46_A5612Lb_CodGru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
         A5613Lb_DscGru = T00R46_A5613Lb_DscGru[0] ;
         n5613Lb_DscGru = T00R46_n5613Lb_DscGru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5613Lb_DscGru", A5613Lb_DscGru);
         A5614Lb_UltGru = T00R46_A5614Lb_UltGru[0] ;
         n5614Lb_UltGru = T00R46_n5614Lb_UltGru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         O5614Lb_UltGru = A5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z5612Lb_CodGru = A5612Lb_CodGru ;
         sMode830 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadR4830( ) ;
         if ( AnyError == 1 )
         {
            RcdFound830 = (short)(0) ;
            initializeNonKeyR4830( ) ;
         }
         Gx_mode = sMode830 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound830 = (short)(0) ;
         initializeNonKeyR4830( ) ;
         sMode830 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode830 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyR4830( ) ;
      if ( RcdFound830 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound830 = (short)(0) ;
      /* Using cursor T00R410 */
      pr_default.execute(8, new Object[] {A5612Lb_CodGru, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00R410_A5612Lb_CodGru[0], A5612Lb_CodGru) < 0 ) ) && ( GXutil.strcmp(T00R410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00R410_A5612Lb_CodGru[0], A5612Lb_CodGru) > 0 ) ) && ( GXutil.strcmp(T00R410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5612Lb_CodGru = T00R410_A5612Lb_CodGru[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
            RcdFound830 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound830 = (short)(0) ;
      /* Using cursor T00R411 */
      pr_default.execute(9, new Object[] {A5612Lb_CodGru, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00R411_A5612Lb_CodGru[0], A5612Lb_CodGru) > 0 ) ) && ( GXutil.strcmp(T00R411_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00R411_A5612Lb_CodGru[0], A5612Lb_CodGru) < 0 ) ) && ( GXutil.strcmp(T00R411_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A5612Lb_CodGru = T00R411_A5612Lb_CodGru[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
            RcdFound830 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyR4830( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5614Lb_UltGru = O5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         GX_FocusControl = edtLb_CodGru_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertR4830( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound830 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5612Lb_CodGru, Z5612Lb_CodGru) != 0 ) )
            {
               A5612Lb_CodGru = Z5612Lb_CodGru ;
               httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A5614Lb_UltGru = O5614Lb_UltGru ;
               n5614Lb_UltGru = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtLb_CodGru_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A5614Lb_UltGru = O5614Lb_UltGru ;
               n5614Lb_UltGru = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
               updateR4830( ) ;
               GX_FocusControl = edtLb_CodGru_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5612Lb_CodGru, Z5612Lb_CodGru) != 0 ) )
            {
               /* Insert record */
               A5614Lb_UltGru = O5614Lb_UltGru ;
               n5614Lb_UltGru = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
               GX_FocusControl = edtLb_CodGru_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertR4830( ) ;
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
                  A5614Lb_UltGru = O5614Lb_UltGru ;
                  n5614Lb_UltGru = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
                  GX_FocusControl = edtLb_CodGru_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertR4830( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5612Lb_CodGru, Z5612Lb_CodGru) != 0 ) )
      {
         A5612Lb_CodGru = Z5612Lb_CodGru ;
         httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A5614Lb_UltGru = O5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtLb_CodGru_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyR4830( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00R45 */
         pr_default.execute(3, new Object[] {A396EmprCod, A5612Lb_CodGru});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENSPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z5613Lb_DscGru, T00R45_A5613Lb_DscGru[0]) != 0 ) || ( Z5614Lb_UltGru != T00R45_A5614Lb_UltGru[0] ) )
         {
            if ( GXutil.strcmp(Z5613Lb_DscGru, T00R45_A5613Lb_DscGru[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tensprd:[seudo value changed for attri]"+"Lb_DscGru");
               GXutil.writeLogRaw("Old: ",Z5613Lb_DscGru);
               GXutil.writeLogRaw("Current: ",T00R45_A5613Lb_DscGru[0]);
            }
            if ( Z5614Lb_UltGru != T00R45_A5614Lb_UltGru[0] )
            {
               GXutil.writeLogln("gestionlaboratorio.tensprd:[seudo value changed for attri]"+"Lb_UltGru");
               GXutil.writeLogRaw("Old: ",Z5614Lb_UltGru);
               GXutil.writeLogRaw("Current: ",T00R45_A5614Lb_UltGru[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENSPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertR4830( )
   {
      beforeValidateR4830( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableR4830( ) ;
      }
      if ( AnyError == 0 )
      {
         zmR4830( 0) ;
         checkOptimisticConcurrencyR4830( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmR4830( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertR4830( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00R412 */
                  pr_default.execute(10, new Object[] {A5612Lb_CodGru, Boolean.valueOf(n5613Lb_DscGru), A5613Lb_DscGru, Boolean.valueOf(n5614Lb_UltGru), Short.valueOf(A5614Lb_UltGru), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSPRD");
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
                        processLevelR4830( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionR40( ) ;
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
            loadR4830( ) ;
         }
         endLevelR4830( ) ;
      }
      closeExtendedTableCursorsR4830( ) ;
   }

   public void updateR4830( )
   {
      beforeValidateR4830( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableR4830( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyR4830( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmR4830( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateR4830( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00R413 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n5613Lb_DscGru), A5613Lb_DscGru, Boolean.valueOf(n5614Lb_UltGru), Short.valueOf(A5614Lb_UltGru), A396EmprCod, A5612Lb_CodGru});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSPRD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENSPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateR4830( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelR4830( ) ;
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
         endLevelR4830( ) ;
      }
      closeExtendedTableCursorsR4830( ) ;
   }

   public void deferredUpdateR4830( )
   {
   }

   public void delete( )
   {
      beforeValidateR4830( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyR4830( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsR4830( ) ;
         afterConfirmR4830( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteR4830( ) ;
            if ( AnyError == 0 )
            {
               A5614Lb_UltGru = O5614Lb_UltGru ;
               n5614Lb_UltGru = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
               scanStartR4831( ) ;
               while ( RcdFound831 != 0 )
               {
                  getByPrimaryKeyR4831( ) ;
                  deleteR4831( ) ;
                  scanNextR4831( ) ;
                  O5614Lb_UltGru = A5614Lb_UltGru ;
                  n5614Lb_UltGru = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
               }
               scanEndR4831( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00R414 */
                  pr_default.execute(12, new Object[] {A396EmprCod, A5612Lb_CodGru});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSPRD");
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
      sMode830 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelR4830( ) ;
      Gx_mode = sMode830 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsR4830( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A14093IDLb_DscGr = GXutil.trim( A5612Lb_CodGru) + "-" + GXutil.trim( A5613Lb_DscGru) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14093IDLb_DscGr", A14093IDLb_DscGr);
      }
   }

   public void processNestedLevelR4831( )
   {
      s5614Lb_UltGru = O5614Lb_UltGru ;
      n5614Lb_UltGru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowR4831( ) ;
         if ( ( nRcdExists_831 != 0 ) || ( nIsMod_831 != 0 ) )
         {
            standaloneNotModalR4831( ) ;
            getKeyR4831( ) ;
            if ( ( nRcdExists_831 == 0 ) && ( nRcdDeleted_831 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertR4831( ) ;
            }
            else
            {
               if ( RcdFound831 != 0 )
               {
                  if ( ( nRcdDeleted_831 != 0 ) && ( nRcdExists_831 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteR4831( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_831 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateR4831( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_831 == 0 )
                  {
                     GXCCtl = "LB_LINGRU_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLb_LinGru_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5614Lb_UltGru = A5614Lb_UltGru ;
            n5614Lb_UltGru = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
         }
         httpContext.changePostValue( edtLb_LinGru_Internalname, GXutil.ltrim( localUtil.ntoc( A5615Lb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum)) ;
         httpContext.changePostValue( "ZT_"+"Z5615Lb_LinGru_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5615Lb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_32_idx, GXutil.rtrim( Z719PrdNum)) ;
         httpContext.changePostValue( "nRcdDeleted_831_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_831_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_831_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_831 != 0 )
         {
            httpContext.changePostValue( "LB_LINGRU_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinGru_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllR4831( ) ;
      if ( AnyError != 0 )
      {
         O5614Lb_UltGru = s5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      }
      nRcdExists_831 = (short)(0) ;
      nIsMod_831 = (short)(0) ;
      nRcdDeleted_831 = (short)(0) ;
   }

   public void processLevelR4830( )
   {
      /* Save parent mode. */
      sMode830 = Gx_mode ;
      processNestedLevelR4831( ) ;
      if ( AnyError != 0 )
      {
         O5614Lb_UltGru = s5614Lb_UltGru ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode830 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00R415 */
      pr_default.execute(13, new Object[] {Boolean.valueOf(n5614Lb_UltGru), Short.valueOf(A5614Lb_UltGru), A396EmprCod, A5612Lb_CodGru});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSPRD");
   }

   public void endLevelR4830( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeCompleteR4830( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tensprd");
         if ( AnyError == 0 )
         {
            confirmValuesR40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "gestionlaboratorio.tensprd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartR4830( )
   {
      /* Scan By routine */
      /* Using cursor T00R416 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound830 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound830 = (short)(1) ;
         A5612Lb_CodGru = T00R416_A5612Lb_CodGru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextR4830( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound830 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound830 = (short)(1) ;
         A5612Lb_CodGru = T00R416_A5612Lb_CodGru[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
      }
   }

   public void scanEndR4830( )
   {
      pr_default.close(14);
   }

   public void afterConfirmR4830( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertR4830( )
   {
      /* Before Insert Rules */
      if ( (GXutil.strcmp("", A5612Lb_CodGru)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Nulo", ""), 1, "LB_CODGRU");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_CodGru_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeUpdateR4830( )
   {
      /* Before Update Rules */
      if ( (GXutil.strcmp("", A5612Lb_CodGru)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Nulo", ""), 1, "LB_CODGRU");
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_CodGru_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void beforeDeleteR4830( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteR4830( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateR4830( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesR4830( )
   {
      edtLb_CodGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_CodGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_CodGru_Enabled), 5, 0), true);
      edtLb_DscGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_DscGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_DscGru_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtLb_UltGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltGru_Enabled), 5, 0), true);
   }

   public void zmR4831( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z719PrdNum = T00R43_A719PrdNum[0] ;
         }
         else
         {
            Z719PrdNum = A719PrdNum ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z5612Lb_CodGru = A5612Lb_CodGru ;
         Z5615Lb_LinGru = A5615Lb_LinGru ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z856ValCod = A856ValCod ;
      }
   }

   public void standaloneNotModalR4831( )
   {
      edtLb_UltGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltGru_Enabled), 5, 0), true);
      edtLb_UltGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_UltGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_UltGru_Enabled), 5, 0), true);
   }

   public void standaloneModalR4831( )
   {
      if ( isIns( )  )
      {
         A5614Lb_UltGru = (short)(O5614Lb_UltGru+1) ;
         n5614Lb_UltGru = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5615Lb_LinGru = A5614Lb_UltGru ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLb_LinGru_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LinGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinGru_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtLb_LinGru_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLb_LinGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinGru_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void loadR4831( )
   {
      /* Using cursor T00R417 */
      pr_default.execute(15, new Object[] {A396EmprCod, A5612Lb_CodGru, Short.valueOf(A5615Lb_LinGru)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound831 = (short)(1) ;
         A718PrdNom = T00R417_A718PrdNom[0] ;
         A719PrdNum = T00R417_A719PrdNum[0] ;
         A856ValCod = T00R417_A856ValCod[0] ;
         zmR4831( -17) ;
      }
      pr_default.close(15);
      onLoadActionsR4831( ) ;
   }

   public void onLoadActionsR4831( )
   {
   }

   public void checkExtendedTableR4831( )
   {
      nIsDirty_831 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalR4831( ) ;
      /* Using cursor T00R44 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T00R44_A718PrdNom[0] ;
      A856ValCod = T00R44_A856ValCod[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsR4831( )
   {
      pr_default.close(2);
   }

   public void enableDisableR4831( )
   {
   }

   public void gxload_18( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T00R418 */
      pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(16) == 101) )
      {
         GXCCtl = "PRDNUM_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T00R418_A718PrdNom[0] ;
      A856ValCod = T00R418_A856ValCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(16) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(16);
   }

   public void getKeyR4831( )
   {
      /* Using cursor T00R419 */
      pr_default.execute(17, new Object[] {A396EmprCod, A5612Lb_CodGru, Short.valueOf(A5615Lb_LinGru)});
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound831 = (short)(1) ;
      }
      else
      {
         RcdFound831 = (short)(0) ;
      }
      pr_default.close(17);
   }

   public void getByPrimaryKeyR4831( )
   {
      /* Using cursor T00R43 */
      pr_default.execute(1, new Object[] {A396EmprCod, A5612Lb_CodGru, Short.valueOf(A5615Lb_LinGru)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00R43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmR4831( 17) ;
         RcdFound831 = (short)(1) ;
         initializeNonKeyR4831( ) ;
         A5615Lb_LinGru = T00R43_A5615Lb_LinGru[0] ;
         A719PrdNum = T00R43_A719PrdNum[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5612Lb_CodGru = A5612Lb_CodGru ;
         Z5615Lb_LinGru = A5615Lb_LinGru ;
         sMode831 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadR4831( ) ;
         Gx_mode = sMode831 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound831 = (short)(0) ;
         initializeNonKeyR4831( ) ;
         sMode831 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalR4831( ) ;
         Gx_mode = sMode831 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesR4831( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyR4831( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00R42 */
         pr_default.execute(0, new Object[] {A396EmprCod, A5612Lb_CodGru, Short.valueOf(A5615Lb_LinGru)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENSPR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z719PrdNum, T00R42_A719PrdNum[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z719PrdNum, T00R42_A719PrdNum[0]) != 0 )
            {
               GXutil.writeLogln("gestionlaboratorio.tensprd:[seudo value changed for attri]"+"PrdNum");
               GXutil.writeLogRaw("Old: ",Z719PrdNum);
               GXutil.writeLogRaw("Current: ",T00R42_A719PrdNum[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPENSPR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertR4831( )
   {
      beforeValidateR4831( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableR4831( ) ;
      }
      if ( AnyError == 0 )
      {
         zmR4831( 0) ;
         checkOptimisticConcurrencyR4831( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmR4831( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertR4831( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00R420 */
                  pr_default.execute(18, new Object[] {A5612Lb_CodGru, Short.valueOf(A5615Lb_LinGru), A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSPR1");
                  if ( (pr_default.getStatus(18) == 1) )
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
            loadR4831( ) ;
         }
         endLevelR4831( ) ;
      }
      closeExtendedTableCursorsR4831( ) ;
   }

   public void updateR4831( )
   {
      beforeValidateR4831( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableR4831( ) ;
      }
      if ( ( nIsMod_831 != 0 ) || ( nIsDirty_831 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyR4831( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmR4831( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateR4831( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00R421 */
                     pr_default.execute(19, new Object[] {A719PrdNum, A396EmprCod, A5612Lb_CodGru, Short.valueOf(A5615Lb_LinGru)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSPR1");
                     if ( (pr_default.getStatus(19) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPENSPR1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateR4831( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyR4831( ) ;
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
            endLevelR4831( ) ;
         }
      }
      closeExtendedTableCursorsR4831( ) ;
   }

   public void deferredUpdateR4831( )
   {
   }

   public void deleteR4831( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateR4831( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyR4831( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsR4831( ) ;
         afterConfirmR4831( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteR4831( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00R422 */
               pr_default.execute(20, new Object[] {A396EmprCod, A5612Lb_CodGru, Short.valueOf(A5615Lb_LinGru)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENSPR1");
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
      sMode831 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelR4831( ) ;
      Gx_mode = sMode831 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsR4831( )
   {
      standaloneModalR4831( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00R423 */
         pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T00R423_A718PrdNom[0] ;
         A856ValCod = T00R423_A856ValCod[0] ;
         pr_default.close(21);
      }
   }

   public void endLevelR4831( )
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

   public void scanStartR4831( )
   {
      /* Scan By routine */
      /* Using cursor T00R424 */
      pr_default.execute(22, new Object[] {A396EmprCod, A5612Lb_CodGru});
      RcdFound831 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound831 = (short)(1) ;
         A5615Lb_LinGru = T00R424_A5615Lb_LinGru[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextR4831( )
   {
      /* Scan next routine */
      pr_default.readNext(22);
      RcdFound831 = (short)(0) ;
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound831 = (short)(1) ;
         A5615Lb_LinGru = T00R424_A5615Lb_LinGru[0] ;
      }
   }

   public void scanEndR4831( )
   {
      pr_default.close(22);
   }

   public void afterConfirmR4831( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertR4831( )
   {
      /* Before Insert Rules */
      if ( ( A856ValCod == 2 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Validez 2. Producto a ser Suprimido ¡¡¡", ""), 0, "");
      }
      if ( ( A856ValCod == 3 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Validez 3 Producto SUPRIMIDO", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeUpdateR4831( )
   {
      /* Before Update Rules */
      if ( ( A856ValCod == 2 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Validez 2. Producto a ser Suprimido ¡¡¡", ""), 0, "");
      }
      if ( ( A856ValCod == 3 ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atencion. Validez 3 Producto SUPRIMIDO", ""), 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void beforeDeleteR4831( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteR4831( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateR4831( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesR4831( )
   {
      edtLb_LinGru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LinGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinGru_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashesR4831( )
   {
   }

   public void send_integrity_lvl_hashesR4830( )
   {
   }

   public void subsflControlProps_32831( )
   {
      edtLb_LinGru_Internalname = "LB_LINGRU_"+sGXsfl_32_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_32831( )
   {
      edtLb_LinGru_Internalname = "LB_LINGRU_"+sGXsfl_32_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_32_fel_idx ;
   }

   public void addRowR4831( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32831( ) ;
      sendRowR4831( ) ;
   }

   public void sendRowR4831( )
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
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_831_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLb_LinGru_Internalname,GXutil.ltrim( localUtil.ntoc( A5615Lb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5615Lb_LinGru), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLb_LinGru_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLb_LinGru_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_831_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "TagColum" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdNum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesR4831( ) ;
      GXCCtl = "Z5615Lb_LinGru_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5615Lb_LinGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z719PrdNum_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z719PrdNum));
      GXCCtl = "nRcdDeleted_831_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_831_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_831_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_831, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV36TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33EmprCod));
      GXCCtl = "vLB_CODGRU_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34Lb_CodGru));
      app.GxWebStd.gx_hidden_field( httpContext, "LB_LINGRU_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinGru_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNUM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowR4831( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32831( ) ;
      edtLb_LinGru_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LB_LINGRU_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdNum_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDNUM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LinGru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLb_LinGru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LB_LINGRU_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLb_LinGru_Internalname ;
         wbErr = true ;
         A5615Lb_LinGru = (short)(0) ;
      }
      else
      {
         A5615Lb_LinGru = (short)(localUtil.ctol( httpContext.cgiGet( edtLb_LinGru_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
      GXCCtl = "Z5615Lb_LinGru_" + sGXsfl_32_idx ;
      Z5615Lb_LinGru = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z719PrdNum_" + sGXsfl_32_idx ;
      Z719PrdNum = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_831_" + sGXsfl_32_idx ;
      nRcdDeleted_831 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_831_" + sGXsfl_32_idx ;
      nRcdExists_831 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_831_" + sGXsfl_32_idx ;
      nIsMod_831 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLb_LinGru_Enabled = edtLb_LinGru_Enabled ;
   }

   public void confirmValuesR40( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32831( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32831( ) ;
         httpContext.changePostValue( "Z5615Lb_LinGru_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5615Lb_LinGru_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5615Lb_LinGru_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z719PrdNum_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z719PrdNum_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z719PrdNum_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.tensprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV33EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34Lb_CodGru))}, new String[] {"Gx_mode","EmprCod","Lb_CodGru"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TENSPRD");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\tensprd:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5612Lb_CodGru", GXutil.rtrim( Z5612Lb_CodGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5613Lb_DscGru", GXutil.rtrim( Z5613Lb_DscGru));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5614Lb_UltGru", GXutil.ltrim( localUtil.ntoc( Z5614Lb_UltGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5614Lb_UltGru", GXutil.ltrim( localUtil.ntoc( O5614Lb_UltGru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV38PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV38PrdNum_Data);
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
      app.GxWebStd.gx_hidden_field( httpContext, "IDLB_DSCGR", GXutil.rtrim( A14093IDLb_DscGr));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV33EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vLB_CODGRU", GXutil.rtrim( AV34Lb_CodGru));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLB_CODGRU", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Lb_CodGru, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "VALCOD", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDNOM", GXutil.rtrim( A718PrdNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Objectcall", GXutil.rtrim( Combo_prdnum_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Enabled", GXutil.booltostr( Combo_prdnum_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdnum_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Isgriditem", GXutil.booltostr( Combo_prdnum_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
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
      return formatLink("app.gestionlaboratorio.tensprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV33EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34Lb_CodGru))}, new String[] {"Gx_mode","EmprCod","Lb_CodGru"})  ;
   }

   public String getPgmname( )
   {
      return "GestionLaboratorio.TENSPRD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Grupo de Productos", "") ;
   }

   public void initializeNonKeyR4830( )
   {
      A14093IDLb_DscGr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14093IDLb_DscGr", A14093IDLb_DscGr);
      A5613Lb_DscGru = "" ;
      n5613Lb_DscGru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5613Lb_DscGru", A5613Lb_DscGru);
      A5614Lb_UltGru = (short)(0) ;
      n5614Lb_UltGru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      O5614Lb_UltGru = A5614Lb_UltGru ;
      n5614Lb_UltGru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
      Z5613Lb_DscGru = "" ;
      Z5614Lb_UltGru = (short)(0) ;
   }

   public void initAllR4830( )
   {
      A5612Lb_CodGru = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5612Lb_CodGru", A5612Lb_CodGru);
      initializeNonKeyR4830( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyR4831( )
   {
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      A856ValCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.str( A856ValCod, 1, 0));
      Z719PrdNum = "" ;
   }

   public void initAllR4831( )
   {
      A5615Lb_LinGru = (short)(0) ;
      initializeNonKeyR4831( ) ;
   }

   public void standaloneModalInsertR4831( )
   {
      A5614Lb_UltGru = i5614Lb_UltGru ;
      n5614Lb_UltGru = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5614Lb_UltGru", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5614Lb_UltGru), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165563", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/tensprd.js", "?2026821165563", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties831( )
   {
      edtLb_LinGru_Enabled = defedtLb_LinGru_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLb_LinGru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLb_LinGru_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5615Lb_LinGru, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLb_LinGru_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtLb_CodGru_Internalname = "LB_CODGRU" ;
      edtLb_DscGru_Internalname = "LB_DSCGRU" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtLb_LinGru_Internalname = "LB_LINGRU" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtLb_UltGru_Internalname = "LB_ULTGRU" ;
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
      Combo_prdnum_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Grupo de Productos", "") );
      edtPrdNum_Jsonclick = "" ;
      edtLb_LinGru_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_prdnum_Titlecontrolidtoreplace = "" ;
      edtPrdNum_Enabled = 1 ;
      edtLb_LinGru_Enabled = 1 ;
      edtLb_UltGru_Jsonclick = "" ;
      edtLb_UltGru_Enabled = 0 ;
      edtLb_UltGru_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 0 ;
      edtEmprCod_Visible = 1 ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdnum_Cls = "ExtendedCombo" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtLb_DscGru_Jsonclick = "" ;
      edtLb_DscGru_Enabled = 1 ;
      edtLb_CodGru_Jsonclick = "" ;
      edtLb_CodGru_Enabled = 1 ;
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
      subsflControlProps_32831( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalR4831( ) ;
         standaloneModalR4831( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowR4831( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32831( ) ;
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

   public void valid_Prdnum( )
   {
      n5614Lb_UltGru = false ;
      /* Using cursor T00R423 */
      pr_default.execute(21, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T00R423_A718PrdNom[0] ;
      A856ValCod = T00R423_A856ValCod[0] ;
      pr_default.close(21);
      O5614Lb_UltGru = A5614Lb_UltGru ;
      n5614Lb_UltGru = false ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
      httpContext.ajax_rsp_assign_attri("", false, "A856ValCod", GXutil.ltrim( localUtil.ntoc( A856ValCod, (byte)(1), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34Lb_CodGru',fld:'vLB_CODGRU',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV33EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34Lb_CodGru',fld:'vLB_CODGRU',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12R42',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_LB_CODGRU","{handler:'valid_Lb_codgru',iparms:[]");
      setEventMetadata("VALID_LB_CODGRU",",oparms:[]}");
      setEventMetadata("VALID_LB_DSCGRU","{handler:'valid_Lb_dscgru',iparms:[]");
      setEventMetadata("VALID_LB_DSCGRU",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_LB_ULTGRU","{handler:'valid_Lb_ultgru',iparms:[]");
      setEventMetadata("VALID_LB_ULTGRU",",oparms:[]}");
      setEventMetadata("VALID_LB_LINGRU","{handler:'valid_Lb_lingru',iparms:[]");
      setEventMetadata("VALID_LB_LINGRU",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A5614Lb_UltGru',fld:'LB_ULTGRU',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''},{av:'A856ValCod',fld:'VALCOD',pic:'9'}]}");
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
      pr_default.close(21);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV33EmprCod = "" ;
      wcpOAV34Lb_CodGru = "" ;
      Z396EmprCod = "" ;
      Z5612Lb_CodGru = "" ;
      Z5613Lb_DscGru = "" ;
      Z719PrdNum = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV33EmprCod = "" ;
      AV34Lb_CodGru = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A5612Lb_CodGru = "" ;
      A5613Lb_DscGru = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV38PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode831 = "" ;
      sStyleString = "" ;
      A14093IDLb_DscGr = "" ;
      A718PrdNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdnum_Objectcall = "" ;
      Combo_prdnum_Class = "" ;
      Combo_prdnum_Icontype = "" ;
      Combo_prdnum_Icon = "" ;
      Combo_prdnum_Tooltip = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      Combo_prdnum_Selectedtext_set = "" ;
      Combo_prdnum_Selectedtext_get = "" ;
      Combo_prdnum_Gamoauthtoken = "" ;
      Combo_prdnum_Ddointernalname = "" ;
      Combo_prdnum_Titlecontrolalign = "" ;
      Combo_prdnum_Dropdownoptionstype = "" ;
      Combo_prdnum_Datalisttype = "" ;
      Combo_prdnum_Datalistfixedvalues = "" ;
      Combo_prdnum_Datalistproc = "" ;
      Combo_prdnum_Datalistprocparametersprefix = "" ;
      Combo_prdnum_Remoteservicesparameters = "" ;
      Combo_prdnum_Htmltemplate = "" ;
      Combo_prdnum_Multiplevaluestype = "" ;
      Combo_prdnum_Loadingdata = "" ;
      Combo_prdnum_Noresultsfound = "" ;
      Combo_prdnum_Emptyitemtext = "" ;
      Combo_prdnum_Onlyselectedvalues = "" ;
      Combo_prdnum_Selectalltext = "" ;
      Combo_prdnum_Multiplevaluesseparator = "" ;
      Combo_prdnum_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode830 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV39ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T00R47_A407EmprNom = new String[] {""} ;
      T00R47_n407EmprNom = new boolean[] {false} ;
      T00R48_A5612Lb_CodGru = new String[] {""} ;
      T00R48_A407EmprNom = new String[] {""} ;
      T00R48_n407EmprNom = new boolean[] {false} ;
      T00R48_A5613Lb_DscGru = new String[] {""} ;
      T00R48_n5613Lb_DscGru = new boolean[] {false} ;
      T00R48_A5614Lb_UltGru = new short[1] ;
      T00R48_n5614Lb_UltGru = new boolean[] {false} ;
      T00R48_A396EmprCod = new String[] {""} ;
      T00R49_A396EmprCod = new String[] {""} ;
      T00R49_A5612Lb_CodGru = new String[] {""} ;
      T00R46_A5612Lb_CodGru = new String[] {""} ;
      T00R46_A5613Lb_DscGru = new String[] {""} ;
      T00R46_n5613Lb_DscGru = new boolean[] {false} ;
      T00R46_A5614Lb_UltGru = new short[1] ;
      T00R46_n5614Lb_UltGru = new boolean[] {false} ;
      T00R46_A396EmprCod = new String[] {""} ;
      T00R410_A396EmprCod = new String[] {""} ;
      T00R410_A5612Lb_CodGru = new String[] {""} ;
      T00R411_A396EmprCod = new String[] {""} ;
      T00R411_A5612Lb_CodGru = new String[] {""} ;
      T00R45_A5612Lb_CodGru = new String[] {""} ;
      T00R45_A5613Lb_DscGru = new String[] {""} ;
      T00R45_n5613Lb_DscGru = new boolean[] {false} ;
      T00R45_A5614Lb_UltGru = new short[1] ;
      T00R45_n5614Lb_UltGru = new boolean[] {false} ;
      T00R45_A396EmprCod = new String[] {""} ;
      T00R416_A396EmprCod = new String[] {""} ;
      T00R416_A5612Lb_CodGru = new String[] {""} ;
      Z718PrdNom = "" ;
      T00R417_A5612Lb_CodGru = new String[] {""} ;
      T00R417_A5615Lb_LinGru = new short[1] ;
      T00R417_A718PrdNom = new String[] {""} ;
      T00R417_A396EmprCod = new String[] {""} ;
      T00R417_A719PrdNum = new String[] {""} ;
      T00R417_A856ValCod = new byte[1] ;
      T00R44_A718PrdNom = new String[] {""} ;
      T00R44_A856ValCod = new byte[1] ;
      T00R418_A718PrdNom = new String[] {""} ;
      T00R418_A856ValCod = new byte[1] ;
      T00R419_A396EmprCod = new String[] {""} ;
      T00R419_A5612Lb_CodGru = new String[] {""} ;
      T00R419_A5615Lb_LinGru = new short[1] ;
      T00R43_A5612Lb_CodGru = new String[] {""} ;
      T00R43_A5615Lb_LinGru = new short[1] ;
      T00R43_A396EmprCod = new String[] {""} ;
      T00R43_A719PrdNum = new String[] {""} ;
      T00R42_A5612Lb_CodGru = new String[] {""} ;
      T00R42_A5615Lb_LinGru = new short[1] ;
      T00R42_A396EmprCod = new String[] {""} ;
      T00R42_A719PrdNum = new String[] {""} ;
      T00R423_A718PrdNom = new String[] {""} ;
      T00R423_A856ValCod = new byte[1] ;
      T00R424_A396EmprCod = new String[] {""} ;
      T00R424_A5612Lb_CodGru = new String[] {""} ;
      T00R424_A5615Lb_LinGru = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tensprd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tensprd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tensprd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tensprd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gestionlaboratorio.tensprd__default(),
         new Object[] {
             new Object[] {
            T00R42_A5612Lb_CodGru, T00R42_A5615Lb_LinGru, T00R42_A396EmprCod, T00R42_A719PrdNum
            }
            , new Object[] {
            T00R43_A5612Lb_CodGru, T00R43_A5615Lb_LinGru, T00R43_A396EmprCod, T00R43_A719PrdNum
            }
            , new Object[] {
            T00R44_A718PrdNom, T00R44_A856ValCod
            }
            , new Object[] {
            T00R45_A5612Lb_CodGru, T00R45_A5613Lb_DscGru, T00R45_n5613Lb_DscGru, T00R45_A5614Lb_UltGru, T00R45_n5614Lb_UltGru, T00R45_A396EmprCod
            }
            , new Object[] {
            T00R46_A5612Lb_CodGru, T00R46_A5613Lb_DscGru, T00R46_n5613Lb_DscGru, T00R46_A5614Lb_UltGru, T00R46_n5614Lb_UltGru, T00R46_A396EmprCod
            }
            , new Object[] {
            T00R47_A407EmprNom, T00R47_n407EmprNom
            }
            , new Object[] {
            T00R48_A5612Lb_CodGru, T00R48_A407EmprNom, T00R48_n407EmprNom, T00R48_A5613Lb_DscGru, T00R48_n5613Lb_DscGru, T00R48_A5614Lb_UltGru, T00R48_n5614Lb_UltGru, T00R48_A396EmprCod
            }
            , new Object[] {
            T00R49_A396EmprCod, T00R49_A5612Lb_CodGru
            }
            , new Object[] {
            T00R410_A396EmprCod, T00R410_A5612Lb_CodGru
            }
            , new Object[] {
            T00R411_A396EmprCod, T00R411_A5612Lb_CodGru
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00R416_A396EmprCod, T00R416_A5612Lb_CodGru
            }
            , new Object[] {
            T00R417_A5612Lb_CodGru, T00R417_A5615Lb_LinGru, T00R417_A718PrdNom, T00R417_A396EmprCod, T00R417_A719PrdNum, T00R417_A856ValCod
            }
            , new Object[] {
            T00R418_A718PrdNom, T00R418_A856ValCod
            }
            , new Object[] {
            T00R419_A396EmprCod, T00R419_A5612Lb_CodGru, T00R419_A5615Lb_LinGru
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00R423_A718PrdNom, T00R423_A856ValCod
            }
            , new Object[] {
            T00R424_A396EmprCod, T00R424_A5612Lb_CodGru, T00R424_A5615Lb_LinGru
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A856ValCod ;
   private byte Z856ValCod ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short Z5614Lb_UltGru ;
   private short O5614Lb_UltGru ;
   private short Z5615Lb_LinGru ;
   private short nRcdDeleted_831 ;
   private short nRcdExists_831 ;
   private short nIsMod_831 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5614Lb_UltGru ;
   private short nBlankRcdCount831 ;
   private short RcdFound831 ;
   private short B5614Lb_UltGru ;
   private short nBlankRcdUsr831 ;
   private short RcdFound830 ;
   private short s5614Lb_UltGru ;
   private short A5615Lb_LinGru ;
   private short nIsDirty_830 ;
   private short nIsDirty_831 ;
   private short i5614Lb_UltGru ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int trnEnded ;
   private int edtLb_CodGru_Enabled ;
   private int edtLb_DscGru_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtLb_UltGru_Enabled ;
   private int edtLb_UltGru_Visible ;
   private int edtLb_LinGru_Enabled ;
   private int edtPrdNum_Enabled ;
   private int fRowAdded ;
   private int Combo_prdnum_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtLb_LinGru_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV33EmprCod ;
   private String wcpOAV34Lb_CodGru ;
   private String Z396EmprCod ;
   private String Z5612Lb_CodGru ;
   private String Z5613Lb_DscGru ;
   private String Z719PrdNum ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV33EmprCod ;
   private String AV34Lb_CodGru ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtLb_CodGru_Internalname ;
   private String sGXsfl_32_idx="0001" ;
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
   private String A5612Lb_CodGru ;
   private String edtLb_CodGru_Jsonclick ;
   private String edtLb_DscGru_Internalname ;
   private String A5613Lb_DscGru ;
   private String edtLb_DscGru_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtLb_UltGru_Internalname ;
   private String edtLb_UltGru_Jsonclick ;
   private String sMode831 ;
   private String edtLb_LinGru_Internalname ;
   private String edtPrdNum_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A14093IDLb_DscGr ;
   private String A718PrdNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdnum_Objectcall ;
   private String Combo_prdnum_Class ;
   private String Combo_prdnum_Icontype ;
   private String Combo_prdnum_Icon ;
   private String Combo_prdnum_Tooltip ;
   private String Combo_prdnum_Selectedvalue_set ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String Combo_prdnum_Selectedtext_set ;
   private String Combo_prdnum_Selectedtext_get ;
   private String Combo_prdnum_Gamoauthtoken ;
   private String Combo_prdnum_Ddointernalname ;
   private String Combo_prdnum_Titlecontrolalign ;
   private String Combo_prdnum_Dropdownoptionstype ;
   private String Combo_prdnum_Titlecontrolidtoreplace ;
   private String Combo_prdnum_Datalisttype ;
   private String Combo_prdnum_Datalistfixedvalues ;
   private String Combo_prdnum_Datalistproc ;
   private String Combo_prdnum_Datalistprocparametersprefix ;
   private String Combo_prdnum_Remoteservicesparameters ;
   private String Combo_prdnum_Htmltemplate ;
   private String Combo_prdnum_Multiplevaluestype ;
   private String Combo_prdnum_Loadingdata ;
   private String Combo_prdnum_Noresultsfound ;
   private String Combo_prdnum_Emptyitemtext ;
   private String Combo_prdnum_Onlyselectedvalues ;
   private String Combo_prdnum_Selectalltext ;
   private String Combo_prdnum_Multiplevaluesseparator ;
   private String Combo_prdnum_Addnewoptiontext ;
   private String hsh ;
   private String sMode830 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtLb_LinGru_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5614Lb_UltGru ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_prdnum_Isgriditem ;
   private boolean Combo_prdnum_Emptyitem ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdnum_Enabled ;
   private boolean Combo_prdnum_Visible ;
   private boolean Combo_prdnum_Allowmultipleselection ;
   private boolean Combo_prdnum_Hasdescription ;
   private boolean Combo_prdnum_Includeonlyselectedoption ;
   private boolean Combo_prdnum_Includeselectalloption ;
   private boolean Combo_prdnum_Includeaddnewoption ;
   private boolean n5613Lb_DscGru ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String AV39ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00R47_A407EmprNom ;
   private boolean[] T00R47_n407EmprNom ;
   private String[] T00R48_A5612Lb_CodGru ;
   private String[] T00R48_A407EmprNom ;
   private boolean[] T00R48_n407EmprNom ;
   private String[] T00R48_A5613Lb_DscGru ;
   private boolean[] T00R48_n5613Lb_DscGru ;
   private short[] T00R48_A5614Lb_UltGru ;
   private boolean[] T00R48_n5614Lb_UltGru ;
   private String[] T00R48_A396EmprCod ;
   private String[] T00R49_A396EmprCod ;
   private String[] T00R49_A5612Lb_CodGru ;
   private String[] T00R46_A5612Lb_CodGru ;
   private String[] T00R46_A5613Lb_DscGru ;
   private boolean[] T00R46_n5613Lb_DscGru ;
   private short[] T00R46_A5614Lb_UltGru ;
   private boolean[] T00R46_n5614Lb_UltGru ;
   private String[] T00R46_A396EmprCod ;
   private String[] T00R410_A396EmprCod ;
   private String[] T00R410_A5612Lb_CodGru ;
   private String[] T00R411_A396EmprCod ;
   private String[] T00R411_A5612Lb_CodGru ;
   private String[] T00R45_A5612Lb_CodGru ;
   private String[] T00R45_A5613Lb_DscGru ;
   private boolean[] T00R45_n5613Lb_DscGru ;
   private short[] T00R45_A5614Lb_UltGru ;
   private boolean[] T00R45_n5614Lb_UltGru ;
   private String[] T00R45_A396EmprCod ;
   private String[] T00R416_A396EmprCod ;
   private String[] T00R416_A5612Lb_CodGru ;
   private String[] T00R417_A5612Lb_CodGru ;
   private short[] T00R417_A5615Lb_LinGru ;
   private String[] T00R417_A718PrdNom ;
   private String[] T00R417_A396EmprCod ;
   private String[] T00R417_A719PrdNum ;
   private byte[] T00R417_A856ValCod ;
   private String[] T00R44_A718PrdNom ;
   private byte[] T00R44_A856ValCod ;
   private String[] T00R418_A718PrdNom ;
   private byte[] T00R418_A856ValCod ;
   private String[] T00R419_A396EmprCod ;
   private String[] T00R419_A5612Lb_CodGru ;
   private short[] T00R419_A5615Lb_LinGru ;
   private String[] T00R43_A5612Lb_CodGru ;
   private short[] T00R43_A5615Lb_LinGru ;
   private String[] T00R43_A396EmprCod ;
   private String[] T00R43_A719PrdNum ;
   private String[] T00R42_A5612Lb_CodGru ;
   private short[] T00R42_A5615Lb_LinGru ;
   private String[] T00R42_A396EmprCod ;
   private String[] T00R42_A719PrdNum ;
   private String[] T00R423_A718PrdNom ;
   private byte[] T00R423_A856ValCod ;
   private String[] T00R424_A396EmprCod ;
   private String[] T00R424_A5612Lb_CodGru ;
   private short[] T00R424_A5615Lb_LinGru ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV38PrdNum_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class tensprd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tensprd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tensprd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tensprd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tensprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00R42", "SELECT Lb_CodGru, Lb_LinGru, EmprCod, PrdNum FROM TXPENSPR1 WHERE EmprCod = ? AND Lb_CodGru = ? AND Lb_LinGru = ?  FOR UPDATE OF PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R43", "SELECT Lb_CodGru, Lb_LinGru, EmprCod, PrdNum FROM TXPENSPR1 WHERE EmprCod = ? AND Lb_CodGru = ? AND Lb_LinGru = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R44", "SELECT PrdNom, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R45", "SELECT Lb_CodGru, Lb_DscGru, Lb_UltGru, EmprCod FROM TXPENSPRD WHERE EmprCod = ? AND Lb_CodGru = ?  FOR UPDATE OF Lb_DscGru, Lb_UltGru NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R46", "SELECT Lb_CodGru, Lb_DscGru, Lb_UltGru, EmprCod FROM TXPENSPRD WHERE EmprCod = ? AND Lb_CodGru = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R47", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R48", "SELECT /*+ FIRST_ROWS(100) */ TM1.Lb_CodGru, T2.EmprNom, TM1.Lb_DscGru, TM1.Lb_UltGru, TM1.EmprCod FROM (TXPENSPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Lb_CodGru = ? ORDER BY TM1.EmprCod, TM1.Lb_CodGru ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R49", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_CodGru FROM TXPENSPRD WHERE EmprCod = ? AND Lb_CodGru = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R410", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_CodGru FROM TXPENSPRD WHERE ( Lb_CodGru > ?) and EmprCod = ? ORDER BY EmprCod, Lb_CodGru) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00R411", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Lb_CodGru FROM TXPENSPRD WHERE ( Lb_CodGru < ?) and EmprCod = ? ORDER BY EmprCod DESC, Lb_CodGru DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00R412", "INSERT INTO TXPENSPRD(Lb_CodGru, Lb_DscGru, Lb_UltGru, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPENSPRD")
         ,new UpdateCursor("T00R413", "UPDATE TXPENSPRD SET Lb_DscGru=?, Lb_UltGru=?  WHERE EmprCod = ? AND Lb_CodGru = ?", GX_NOMASK, "TXPENSPRD")
         ,new UpdateCursor("T00R414", "DELETE FROM TXPENSPRD  WHERE EmprCod = ? AND Lb_CodGru = ?", GX_NOMASK, "TXPENSPRD")
         ,new UpdateCursor("T00R415", "UPDATE TXPENSPRD SET Lb_UltGru=?  WHERE EmprCod = ? AND Lb_CodGru = ?", GX_NOMASK, "TXPENSPRD")
         ,new ForEachCursor("T00R416", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Lb_CodGru FROM TXPENSPRD WHERE EmprCod = ? ORDER BY EmprCod, Lb_CodGru ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R417", "SELECT T1.Lb_CodGru, T1.Lb_LinGru, T2.PrdNom, T1.EmprCod, T1.PrdNum, T2.ValCod FROM (TXPENSPR1 T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) WHERE T1.EmprCod = ? and T1.Lb_CodGru = ? and T1.Lb_LinGru = ? ORDER BY T1.EmprCod, T1.Lb_CodGru, T1.Lb_LinGru ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R418", "SELECT PrdNom, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R419", "SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND Lb_CodGru = ? AND Lb_LinGru = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00R420", "INSERT INTO TXPENSPR1(Lb_CodGru, Lb_LinGru, EmprCod, PrdNum) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPENSPR1")
         ,new UpdateCursor("T00R421", "UPDATE TXPENSPR1 SET PrdNum=?  WHERE EmprCod = ? AND Lb_CodGru = ? AND Lb_LinGru = ?", GX_NOMASK, "TXPENSPR1")
         ,new UpdateCursor("T00R422", "DELETE FROM TXPENSPR1  WHERE EmprCod = ? AND Lb_CodGru = ? AND Lb_LinGru = ?", GX_NOMASK, "TXPENSPR1")
         ,new ForEachCursor("T00R423", "SELECT PrdNom, ValCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00R424", "SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? and Lb_CodGru = ? ORDER BY EmprCod, Lb_CodGru, Lb_LinGru ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
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
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 2);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 40);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setString(4, (String)parms[5], 2);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
            case 13 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 2);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 2);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 6);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 2);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
      }
   }

}

