package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfaspq_impl extends GXDataArea
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
      gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROFORCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13740ProFDsc = httpContext.GetPar( "ProFDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaproforcodV60( A396EmprCod, A13740ProFDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"PROFORCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13740ProFDsc = httpContext.GetPar( "ProFDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgaproforcodV60( A396EmprCod, A13740ProFDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"PROFORCOD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h764ProForCod = httpContext.GetPar( "h764ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcaproforcodV6689( A396EmprCod, h764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel2"+"_"+"FASFORLIN") == 0 )
      {
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A13823FasMaxLin = (short)(GXutil.lval( httpContext.GetPar( "FasMaxLin"))) ;
         n13823FasMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
         A4650FasForLin = (short)(GXutil.lval( httpContext.GetPar( "FasForLin"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx2asafasforlinV6689( A764ProForCod, Gx_mode, A13823FasMaxLin, A4650FasForLin) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A764ProForCod) ;
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
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tratamientos Quimicos por Fase", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasCod_Internalname ;
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

   public tfaspq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfaspq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfaspq_impl.class ));
   }

   public tfaspq_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TFASPQ.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TFASPQ.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         nBlankRcdCount689 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_689 = (short)(1) ;
            scanStartV6689( ) ;
            while ( RcdFound689 != 0 )
            {
               init_level_properties689( ) ;
               getByPrimaryKeyV6689( ) ;
               addRowV6689( ) ;
               scanNextV6689( ) ;
            }
            scanEndV6689( ) ;
            nBlankRcdCount689 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalV6689( ) ;
         standaloneModalV6689( ) ;
         sMode689 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRowV6689( ) ;
            edtFasForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtProForDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_689 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalV6689( ) ;
            }
            sendRowV6689( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode689 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount689 = (short)(5) ;
         nRcdExists_689 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartV6689( ) ;
            while ( RcdFound689 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_32689( ) ;
               init_level_properties689( ) ;
               standaloneNotModalV6689( ) ;
               getByPrimaryKeyV6689( ) ;
               standaloneModalV6689( ) ;
               addRowV6689( ) ;
               scanNextV6689( ) ;
            }
            scanEndV6689( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      sMode689 = Gx_mode ;
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
      subsflControlProps_32689( ) ;
      initAllV6689( ) ;
      init_level_properties689( ) ;
      nRcdExists_689 = (short)(0) ;
      nIsMod_689 = (short)(0) ;
      nRcdDeleted_689 = (short)(0) ;
      nBlankRcdCount689 = (short)(nBlankRcdUsr689+nBlankRcdCount689) ;
      fRowAdded = 0 ;
      while ( nBlankRcdCount689 > 0 )
      {
         standaloneNotModalV6689( ) ;
         standaloneModalV6689( ) ;
         addRowV6689( ) ;
         if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
         {
            fRowAdded = 1 ;
            GX_FocusControl = edtFasForLin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nBlankRcdCount689 = (short)(nBlankRcdCount689-1) ;
      }
      Gx_mode = sMode689 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
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
      e11V62 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            Z4649FasUltForL = (short)(localUtil.ctol( httpContext.cgiGet( "Z4649FasUltForL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z460FasDsc = httpContext.cgiGet( "Z460FasDsc") ;
            A4649FasUltForL = (short)(localUtil.ctol( httpContext.cgiGet( "Z4649FasUltForL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n4649FasUltForL = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13823FasMaxLin = (short)(localUtil.ctol( httpContext.cgiGet( "FASMAXLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4649FasUltForL = (short)(localUtil.ctol( httpContext.cgiGet( "FASULTFORL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A764ProForCod = httpContext.cgiGet( "GXHCPROFORCOD") ;
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
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            n457FasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
               A457FasCod = httpContext.GetPar( "FasCod") ;
               n457FasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
               getEqualNoModal( ) ;
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons_dsp( ) ;
               standaloneModal( ) ;
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal( ) ;
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
                        e11V62 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12V62 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
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
         e12V62 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllV645( ) ;
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
      if ( isIns( ) )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      bttBtntrn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtntrn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Visible), 5, 0), true);
      }
      disableAttributesV645( ) ;
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

   public void confirm_V6689( )
   {
      s4649FasUltForL = O4649FasUltForL ;
      n4649FasUltForL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowV6689( ) ;
         if ( ( nRcdExists_689 != 0 ) || ( nIsMod_689 != 0 ) )
         {
            getKeyV6689( ) ;
            if ( ( nRcdExists_689 == 0 ) && ( nRcdDeleted_689 == 0 ) )
            {
               if ( RcdFound689 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateV6689( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableV6689( ) ;
                     closeExtendedTableCursorsV6689( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O4649FasUltForL = A4649FasUltForL ;
                     n4649FasUltForL = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "FASFORLIN_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasForLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound689 != 0 )
               {
                  if ( nRcdDeleted_689 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyV6689( ) ;
                     loadV6689( ) ;
                     beforeValidateV6689( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsV6689( ) ;
                        O4649FasUltForL = A4649FasUltForL ;
                        n4649FasUltForL = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_689 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateV6689( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableV6689( ) ;
                           closeExtendedTableCursorsV6689( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O4649FasUltForL = A4649FasUltForL ;
                           n4649FasUltForL = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_689 == 0 )
                  {
                     GXCCtl = "FASFORLIN_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, h764ProForCod) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z4650FasForLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_32_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "T4650FasForLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( O4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_689_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_689_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_689_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_689 != 0 )
         {
            httpContext.changePostValue( "FASFORLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O4649FasUltForL = s4649FasUltForL ;
      n4649FasUltForL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      /* Start of After( level) rules */
      /* Using cursor T00V66 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13823FasMaxLin = T00V66_A13823FasMaxLin[0] ;
         n13823FasMaxLin = T00V66_n13823FasMaxLin[0] ;
      }
      else
      {
         A13823FasMaxLin = (short)(0) ;
         n13823FasMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
      }
      if ( ! ( A4649FasUltForL == A13823FasMaxLin ) )
      {
         A4649FasUltForL = A13823FasMaxLin ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaptionV60( )
   {
   }

   public void e11V62( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfaspq_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfaspq_impl.this.A396EmprCod = GXv_char2[0] ;
      tfaspq_impl.this.AV16EmprNom = GXv_char3[0] ;
      tfaspq_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
   }

   public void e12V62( )
   {
      /* After Trn Routine */
      returnInSub = false ;
   }

   public void zmV645( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4649FasUltForL = T00V68_A4649FasUltForL[0] ;
            Z460FasDsc = T00V68_A460FasDsc[0] ;
         }
         else
         {
            Z4649FasUltForL = A4649FasUltForL ;
            Z460FasDsc = A460FasDsc ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z457FasCod = A457FasCod ;
         Z4649FasUltForL = A4649FasUltForL ;
         Z460FasDsc = A460FasDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13823FasMaxLin = A13823FasMaxLin ;
      }
   }

   public void standaloneNotModal( )
   {
      /* Using cursor T00V69 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00V69_A407EmprNom[0] ;
      n407EmprNom = T00V69_n407EmprNom[0] ;
      pr_default.close(6);
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtntrn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtntrn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
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
   }

   public void loadV645( )
   {
      /* Using cursor T00V611 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A4649FasUltForL = T00V611_A4649FasUltForL[0] ;
         n4649FasUltForL = T00V611_n4649FasUltForL[0] ;
         A460FasDsc = T00V611_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A407EmprNom = T00V611_A407EmprNom[0] ;
         n407EmprNom = T00V611_n407EmprNom[0] ;
         A13823FasMaxLin = T00V611_A13823FasMaxLin[0] ;
         n13823FasMaxLin = T00V611_n13823FasMaxLin[0] ;
         zmV645( -9) ;
      }
      pr_default.close(7);
      onLoadActionsV645( ) ;
   }

   public void onLoadActionsV645( )
   {
   }

   public void checkExtendedTableV645( )
   {
      nIsDirty_45 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T00V66 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13823FasMaxLin = T00V66_A13823FasMaxLin[0] ;
         n13823FasMaxLin = T00V66_n13823FasMaxLin[0] ;
      }
      else
      {
         nIsDirty_45 = (short)(1) ;
         A13823FasMaxLin = (short)(0) ;
         n13823FasMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursorsV645( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T00V613 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13823FasMaxLin = T00V613_A13823FasMaxLin[0] ;
         n13823FasMaxLin = T00V613_n13823FasMaxLin[0] ;
      }
      else
      {
         A13823FasMaxLin = (short)(0) ;
         n13823FasMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13823FasMaxLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKeyV645( )
   {
      /* Using cursor T00V614 */
      pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00V68 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(5) != 101) && ( GXutil.strcmp(T00V68_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmV645( 9) ;
         RcdFound45 = (short)(1) ;
         A457FasCod = T00V68_A457FasCod[0] ;
         n457FasCod = T00V68_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A4649FasUltForL = T00V68_A4649FasUltForL[0] ;
         n4649FasUltForL = T00V68_n4649FasUltForL[0] ;
         A460FasDsc = T00V68_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         loadV645( ) ;
         if ( AnyError == 1 )
         {
            RcdFound45 = (short)(0) ;
            initializeNonKeyV645( ) ;
         }
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKeyV645( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKeyV645( ) ;
      if ( RcdFound45 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T00V615 */
      pr_default.execute(10, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00V615_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T00V615_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T00V615_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T00V615_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A457FasCod = T00V615_A457FasCod[0] ;
            n457FasCod = T00V615_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T00V616 */
      pr_default.execute(11, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, A396EmprCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00V616_A457FasCod[0], A457FasCod) > 0 ) ) && ( GXutil.strcmp(T00V616_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T00V616_A457FasCod[0], A457FasCod) < 0 ) ) && ( GXutil.strcmp(T00V616_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A457FasCod = T00V616_A457FasCod[0] ;
            n457FasCod = T00V616_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyV645( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A4649FasUltForL = O4649FasUltForL ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertV645( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound45 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               A457FasCod = Z457FasCod ;
               n457FasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A4649FasUltForL = O4649FasUltForL ;
               n4649FasUltForL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               A4649FasUltForL = O4649FasUltForL ;
               n4649FasUltForL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
               updateV645( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               A4649FasUltForL = O4649FasUltForL ;
               n4649FasUltForL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertV645( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FASCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  A4649FasUltForL = O4649FasUltForL ;
                  n4649FasUltForL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertV645( ) ;
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
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
      {
         A457FasCod = Z457FasCod ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A4649FasUltForL = O4649FasUltForL ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartV645( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndV645( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStartV645( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound45 != 0 )
         {
            scanNextV645( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEndV645( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrencyV645( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00V67 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(4) == 101) || ( Z4649FasUltForL != T00V67_A4649FasUltForL[0] ) || ( GXutil.strcmp(Z460FasDsc, T00V67_A460FasDsc[0]) != 0 ) )
         {
            if ( Z4649FasUltForL != T00V67_A4649FasUltForL[0] )
            {
               GXutil.writeLogln("tfaspq:[seudo value changed for attri]"+"FasUltForL");
               GXutil.writeLogRaw("Old: ",Z4649FasUltForL);
               GXutil.writeLogRaw("Current: ",T00V67_A4649FasUltForL[0]);
            }
            if ( GXutil.strcmp(Z460FasDsc, T00V67_A460FasDsc[0]) != 0 )
            {
               GXutil.writeLogln("tfaspq:[seudo value changed for attri]"+"FasDsc");
               GXutil.writeLogRaw("Old: ",Z460FasDsc);
               GXutil.writeLogRaw("Current: ",T00V67_A460FasDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertV645( )
   {
      beforeValidateV645( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableV645( ) ;
      }
      if ( AnyError == 0 )
      {
         zmV645( 0) ;
         checkOptimisticConcurrencyV645( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmV645( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertV645( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00V617 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, Boolean.valueOf(n4649FasUltForL), Short.valueOf(A4649FasUltForL), A460FasDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
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
                        processLevelV645( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionV60( ) ;
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
            loadV645( ) ;
         }
         endLevelV645( ) ;
      }
      closeExtendedTableCursorsV645( ) ;
   }

   public void updateV645( )
   {
      beforeValidateV645( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableV645( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyV645( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmV645( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateV645( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00V618 */
                  pr_default.execute(13, new Object[] {Boolean.valueOf(n4649FasUltForL), Short.valueOf(A4649FasUltForL), A460FasDsc, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateV645( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = A457FasCod ;
                     new app.txpfasproupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                     tfaspq_impl.this.A396EmprCod = GXv_char4[0] ;
                     tfaspq_impl.this.A457FasCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelV645( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                           endTrnMsgCod = "SuccessfullyUpdated" ;
                           resetCaptionV60( ) ;
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
         endLevelV645( ) ;
      }
      closeExtendedTableCursorsV645( ) ;
   }

   public void deferredUpdateV645( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateV645( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyV645( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsV645( ) ;
         afterConfirmV645( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteV645( ) ;
            if ( AnyError == 0 )
            {
               A4649FasUltForL = O4649FasUltForL ;
               n4649FasUltForL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
               scanStartV6689( ) ;
               while ( RcdFound689 != 0 )
               {
                  getByPrimaryKeyV6689( ) ;
                  deleteV6689( ) ;
                  scanNextV6689( ) ;
                  O4649FasUltForL = A4649FasUltForL ;
                  n4649FasUltForL = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
               }
               scanEndV6689( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00V619 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        move_next( ) ;
                        if ( RcdFound45 == 0 )
                        {
                           initAllV645( ) ;
                           Gx_mode = "INS" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        else
                        {
                           getByPrimaryKey( ) ;
                           Gx_mode = "UPD" ;
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                        endTrnMsgCod = "SuccessfullyDeleted" ;
                        resetCaptionV60( ) ;
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
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelV645( ) ;
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsV645( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00V621 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A13823FasMaxLin = T00V621_A13823FasMaxLin[0] ;
            n13823FasMaxLin = T00V621_n13823FasMaxLin[0] ;
         }
         else
         {
            A13823FasMaxLin = (short)(0) ;
            n13823FasMaxLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
         }
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00V622 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00V623 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T00V624 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T00V625 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T00V626 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T00V627 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AVI001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T00V628 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFSMQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T00V629 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFSS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T00V630 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ArtPrd", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T00V631 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T00V632 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EXHDPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T00V633 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALAPFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T00V634 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERECL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T00V635 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T00V636 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASES (TERMINALES BROS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T00V637 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T00V638 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T00V639 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T00V640 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T00V641 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T00V642 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T00V643 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T00V644 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
      }
   }

   public void processNestedLevelV6689( )
   {
      s4649FasUltForL = O4649FasUltForL ;
      n4649FasUltForL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowV6689( ) ;
         if ( ( nRcdExists_689 != 0 ) || ( nIsMod_689 != 0 ) )
         {
            standaloneNotModalV6689( ) ;
            getKeyV6689( ) ;
            if ( ( nRcdExists_689 == 0 ) && ( nRcdDeleted_689 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertV6689( ) ;
            }
            else
            {
               if ( RcdFound689 != 0 )
               {
                  if ( ( nRcdDeleted_689 != 0 ) && ( nRcdExists_689 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteV6689( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_689 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateV6689( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_689 == 0 )
                  {
                     GXCCtl = "FASFORLIN_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasForLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O4649FasUltForL = A4649FasUltForL ;
            n4649FasUltForL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
         }
         httpContext.changePostValue( edtFasForLin_Internalname, GXutil.ltrim( localUtil.ntoc( A4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtProForCod_Internalname, h764ProForCod) ;
         httpContext.changePostValue( edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc)) ;
         httpContext.changePostValue( edtProForDsc2_Internalname, GXutil.rtrim( A4715ProForDsc2)) ;
         httpContext.changePostValue( "ZT_"+"Z4650FasForLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_32_idx, GXutil.rtrim( Z764ProForCod)) ;
         httpContext.changePostValue( "T4650FasForLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( O4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_689_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_689_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_689_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_689 != 0 )
         {
            httpContext.changePostValue( "FASFORLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PROFORDSC2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T00V621 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13823FasMaxLin = T00V621_A13823FasMaxLin[0] ;
         n13823FasMaxLin = T00V621_n13823FasMaxLin[0] ;
      }
      else
      {
         A13823FasMaxLin = (short)(0) ;
         n13823FasMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
      }
      if ( ! ( A4649FasUltForL == A13823FasMaxLin ) )
      {
         A4649FasUltForL = A13823FasMaxLin ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      }
      /* End of After( level) rules */
      initAllV6689( ) ;
      if ( AnyError != 0 )
      {
         O4649FasUltForL = s4649FasUltForL ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      }
      nRcdExists_689 = (short)(0) ;
      nIsMod_689 = (short)(0) ;
      nRcdDeleted_689 = (short)(0) ;
   }

   public void processLevelV645( )
   {
      /* Save parent mode. */
      sMode45 = Gx_mode ;
      processNestedLevelV6689( ) ;
      if ( AnyError != 0 )
      {
         O4649FasUltForL = s4649FasUltForL ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00V645 */
      pr_default.execute(39, new Object[] {Boolean.valueOf(n4649FasUltForL), Short.valueOf(A4649FasUltForL), A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
   }

   public void endLevelV645( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeCompleteV645( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfaspq");
         if ( AnyError == 0 )
         {
            confirmValuesV60( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaspq");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartV645( )
   {
      /* Scan By routine */
      /* Using cursor T00V646 */
      pr_default.execute(40, new Object[] {A396EmprCod});
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A457FasCod = T00V646_A457FasCod[0] ;
         n457FasCod = T00V646_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextV645( )
   {
      /* Scan next routine */
      pr_default.readNext(40);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(40) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A457FasCod = T00V646_A457FasCod[0] ;
         n457FasCod = T00V646_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
   }

   public void scanEndV645( )
   {
      pr_default.close(40);
   }

   public void afterConfirmV645( )
   {
      /* After Confirm Rules */
      if ( ! ( A4649FasUltForL == A13823FasMaxLin ) )
      {
         A4649FasUltForL = A13823FasMaxLin ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      }
   }

   public void beforeInsertV645( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateV645( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteV645( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteV645( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateV645( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesV645( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
   }

   public void zmV6689( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z764ProForCod = T00V63_A764ProForCod[0] ;
         }
         else
         {
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z457FasCod = A457FasCod ;
         Z4650FasForLin = A4650FasForLin ;
         Z396EmprCod = A396EmprCod ;
         Z764ProForCod = A764ProForCod ;
         Z766ProForDsc = A766ProForDsc ;
         Z4715ProForDsc2 = A4715ProForDsc2 ;
      }
   }

   public void standaloneNotModalV6689( )
   {
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModalV6689( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFasForLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtFasForLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void loadV6689( )
   {
      /* Using cursor T00V647 */
      pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A4650FasForLin)});
      if ( (pr_default.getStatus(41) != 101) )
      {
         RcdFound689 = (short)(1) ;
         A766ProForDsc = T00V647_A766ProForDsc[0] ;
         A4715ProForDsc2 = T00V647_A4715ProForDsc2[0] ;
         A764ProForCod = T00V647_A764ProForCod[0] ;
         zmV6689( -12) ;
      }
      pr_default.close(41);
      onLoadActionsV6689( ) ;
   }

   public void onLoadActionsV6689( )
   {
      if ( (0==A4650FasForLin) && isIns( )  && ( ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( (0==A4650FasForLin) && true /* After */ ) ) )
      {
         GXt_int5 = A4650FasForLin ;
         GXv_int6[0] = GXt_int5 ;
         new app.pnumlin(remoteHandle, context).execute( A13823FasMaxLin, (short)(10), (short)(4), O4650FasForLin, GXv_int6) ;
         tfaspq_impl.this.GXt_int5 = GXv_int6[0] ;
         A4650FasForLin = (short)(GXt_int5) ;
      }
      if ( (0==A4650FasForLin) && true /* After */ && isIns( )  )
      {
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         /* Using cursor T00V648 */
         pr_default.execute(42, new Object[] {A396EmprCod, A764ProForCod});
         h764ProForCod = "" ;
         while ( (pr_default.getStatus(42) != 101) )
         {
            h764ProForCod = T00V648_A13740ProFDsc[0] ;
            if (true) break;
         }
         pr_default.close(42);
         httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      }
      /* Using cursor T00V649 */
      pr_default.execute(43, new Object[] {A396EmprCod, A764ProForCod});
      h764ProForCod = "" ;
      while ( (pr_default.getStatus(43) != 101) )
      {
         h764ProForCod = T00V649_A13740ProFDsc[0] ;
         if (true) break;
      }
      pr_default.close(43);
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
   }

   public void checkExtendedTableV6689( )
   {
      nIsDirty_689 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalV6689( ) ;
      if ( (GXutil.strcmp("", h764ProForCod)==0) )
      {
         nIsDirty_689 = (short)(1) ;
         A764ProForCod = "" ;
      }
      else
      {
         A13740ProFDsc = h764ProForCod ;
         /* Using cursor T00V650 */
         pr_default.execute(44, new Object[] {A13740ProFDsc, A396EmprCod});
         A396EmprCod = T00V650_A396EmprCod[0] ;
         A764ProForCod = T00V650_A764ProForCod[0] ;
         A764ProForCod = T00V650_A764ProForCod[0] ;
         if ( ! ( (pr_default.getStatus(44) == 101) ) )
         {
            pr_default.readNext(44);
            if ( ! ( (pr_default.getStatus(44) == 101) ) )
            {
               GXCCtl = "PROFORCOD_" + sGXsfl_32_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(44);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      if ( (GXutil.strcmp("", h764ProForCod)==0) )
      {
         nIsDirty_689 = (short)(1) ;
         A764ProForCod = "" ;
      }
      else
      {
         A13740ProFDsc = h764ProForCod ;
         /* Using cursor T00V651 */
         pr_default.execute(45, new Object[] {A13740ProFDsc, A396EmprCod});
         A764ProForCod = T00V651_A764ProForCod[0] ;
         A764ProForCod = T00V651_A764ProForCod[0] ;
         if ( ! ( (pr_default.getStatus(45) == 101) ) )
         {
            pr_default.readNext(45);
            if ( ! ( (pr_default.getStatus(45) == 101) ) )
            {
               GXCCtl = "PROFORCOD_" + sGXsfl_32_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(45);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      /* Using cursor T00V64 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00V64_A766ProForDsc[0] ;
      A4715ProForDsc2 = T00V64_A4715ProForDsc2[0] ;
      pr_default.close(2);
      if ( (0==A4650FasForLin) && isIns( )  && ( ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( (0==A4650FasForLin) && true /* After */ ) ) )
      {
         nIsDirty_689 = (short)(1) ;
         GXt_int5 = A4650FasForLin ;
         GXv_int6[0] = GXt_int5 ;
         new app.pnumlin(remoteHandle, context).execute( A13823FasMaxLin, (short)(10), (short)(4), O4650FasForLin, GXv_int6) ;
         tfaspq_impl.this.GXt_int5 = GXv_int6[0] ;
         A4650FasForLin = (short)(GXt_int5) ;
      }
      if ( (0==A4650FasForLin) && true /* After */ && isIns( )  )
      {
         nIsDirty_689 = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         /* Using cursor T00V652 */
         pr_default.execute(46, new Object[] {A396EmprCod, A764ProForCod});
         h764ProForCod = "" ;
         while ( (pr_default.getStatus(46) != 101) )
         {
            h764ProForCod = T00V652_A13740ProFDsc[0] ;
            if (true) break;
         }
         pr_default.close(46);
         httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      }
      if ( A4650FasForLin == 9999 )
      {
         GXCCtl = "FASFORLIN_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha alcanzado el numero de lineas maximo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasForLin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsV6689( )
   {
      pr_default.close(2);
   }

   public void enableDisableV6689( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T00V653 */
      pr_default.execute(47, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(47) == 101) )
      {
         GXCCtl = "PROFORCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T00V653_A766ProForDsc[0] ;
      A4715ProForDsc2 = T00V653_A4715ProForDsc2[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4715ProForDsc2))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(47) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(47);
   }

   public void getKeyV6689( )
   {
      if ( (GXutil.strcmp("", h764ProForCod)==0) )
      {
         A764ProForCod = "" ;
      }
      else
      {
         A13740ProFDsc = h764ProForCod ;
         /* Using cursor T00V654 */
         pr_default.execute(48, new Object[] {A13740ProFDsc, A396EmprCod});
         A396EmprCod = T00V654_A396EmprCod[0] ;
         A764ProForCod = T00V654_A764ProForCod[0] ;
         A764ProForCod = T00V654_A764ProForCod[0] ;
         if ( ! ( (pr_default.getStatus(48) == 101) ) )
         {
            pr_default.readNext(48);
            if ( ! ( (pr_default.getStatus(48) == 101) ) )
            {
               GXCCtl = "PROFORCOD_" + sGXsfl_32_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(48);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      /* Using cursor T00V655 */
      pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A4650FasForLin)});
      if ( (pr_default.getStatus(49) != 101) )
      {
         RcdFound689 = (short)(1) ;
      }
      else
      {
         RcdFound689 = (short)(0) ;
      }
      pr_default.close(49);
   }

   public void getByPrimaryKeyV6689( )
   {
      /* Using cursor T00V63 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A4650FasForLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00V63_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmV6689( 12) ;
         RcdFound689 = (short)(1) ;
         initializeNonKeyV6689( ) ;
         A4650FasForLin = T00V63_A4650FasForLin[0] ;
         A764ProForCod = T00V63_A764ProForCod[0] ;
         O4650FasForLin = A4650FasForLin ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z4650FasForLin = A4650FasForLin ;
         sMode689 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalV6689( ) ;
         loadV6689( ) ;
         Gx_mode = sMode689 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound689 = (short)(0) ;
         initializeNonKeyV6689( ) ;
         sMode689 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalV6689( ) ;
         Gx_mode = sMode689 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesV6689( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyV6689( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h764ProForCod)==0) )
         {
            A764ProForCod = "" ;
         }
         else
         {
            A13740ProFDsc = h764ProForCod ;
            /* Using cursor T00V656 */
            pr_default.execute(50, new Object[] {A13740ProFDsc, A396EmprCod});
            A396EmprCod = T00V656_A396EmprCod[0] ;
            A764ProForCod = T00V656_A764ProForCod[0] ;
            A764ProForCod = T00V656_A764ProForCod[0] ;
            if ( ! ( (pr_default.getStatus(50) == 101) ) )
            {
               pr_default.readNext(50);
               if ( ! ( (pr_default.getStatus(50) == 101) ) )
               {
                  GXCCtl = "PROFORCOD_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(50);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T00V62 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A4650FasForLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPR1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z764ProForCod, T00V62_A764ProForCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z764ProForCod, T00V62_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("tfaspq:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T00V62_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASPR1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertV6689( )
   {
      beforeValidateV6689( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableV6689( ) ;
      }
      if ( AnyError == 0 )
      {
         zmV6689( 0) ;
         checkOptimisticConcurrencyV6689( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmV6689( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertV6689( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00V657 */
                  pr_default.execute(51, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A4650FasForLin), A396EmprCod, A764ProForCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPR1");
                  if ( (pr_default.getStatus(51) == 1) )
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
            loadV6689( ) ;
         }
         endLevelV6689( ) ;
      }
      closeExtendedTableCursorsV6689( ) ;
   }

   public void updateV6689( )
   {
      beforeValidateV6689( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableV6689( ) ;
      }
      if ( ( nIsMod_689 != 0 ) || ( nIsDirty_689 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyV6689( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmV6689( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateV6689( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00V658 */
                     pr_default.execute(52, new Object[] {A764ProForCod, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A4650FasForLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPR1");
                     if ( (pr_default.getStatus(52) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPR1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateV6689( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A457FasCod ;
                        new app.txpfasproupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                        tfaspq_impl.this.A396EmprCod = GXv_char4[0] ;
                        tfaspq_impl.this.A457FasCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyV6689( ) ;
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
            endLevelV6689( ) ;
         }
      }
      closeExtendedTableCursorsV6689( ) ;
   }

   public void deferredUpdateV6689( )
   {
   }

   public void deleteV6689( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateV6689( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyV6689( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsV6689( ) ;
         afterConfirmV6689( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteV6689( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00V659 */
               pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Short.valueOf(A4650FasForLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPR1");
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
      sMode689 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelV6689( ) ;
      Gx_mode = sMode689 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsV6689( )
   {
      standaloneModalV6689( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00V660 */
         pr_default.execute(54, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T00V660_A766ProForDsc[0] ;
         A4715ProForDsc2 = T00V660_A4715ProForDsc2[0] ;
         pr_default.close(54);
      }
   }

   public void endLevelV6689( )
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

   public void scanStartV6689( )
   {
      /* Scan By routine */
      /* Using cursor T00V661 */
      pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      RcdFound689 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound689 = (short)(1) ;
         A4650FasForLin = T00V661_A4650FasForLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextV6689( )
   {
      /* Scan next routine */
      pr_default.readNext(55);
      RcdFound689 = (short)(0) ;
      if ( (pr_default.getStatus(55) != 101) )
      {
         RcdFound689 = (short)(1) ;
         A4650FasForLin = T00V661_A4650FasForLin[0] ;
      }
   }

   public void scanEndV6689( )
   {
      pr_default.close(55);
   }

   public void afterConfirmV6689( )
   {
      /* After Confirm Rules */
      if ( ! ( A4649FasUltForL == A13823FasMaxLin ) )
      {
         A4649FasUltForL = A13823FasMaxLin ;
         n4649FasUltForL = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      }
   }

   public void beforeInsertV6689( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateV6689( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteV6689( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteV6689( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateV6689( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesV6689( )
   {
      edtFasForLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtProForDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashesV6689( )
   {
   }

   public void send_integrity_lvl_hashesV645( )
   {
   }

   public void subsflControlProps_32689( )
   {
      edtFasForLin_Internalname = "FASFORLIN_"+sGXsfl_32_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_32_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_32_idx ;
      edtProForDsc2_Internalname = "PROFORDSC2_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_32689( )
   {
      edtFasForLin_Internalname = "FASFORLIN_"+sGXsfl_32_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_32_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_32_fel_idx ;
      edtProForDsc2_Internalname = "PROFORDSC2_"+sGXsfl_32_fel_idx ;
   }

   public void addRowV6689( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32689( ) ;
      sendRowV6689( ) ;
   }

   public void sendRowV6689( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_689_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForLin_Internalname,GXutil.ltrim( localUtil.ntoc( A4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4650FasForLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasForLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_689_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,h764ProForCod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtProForCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtProForDsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc2_Internalname,GXutil.rtrim( A4715ProForDsc2),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtProForDsc2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesV6689( ) ;
      GXCCtl = "GXHCPROFORCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A764ProForCod));
      GXCCtl = "Z4650FasForLin_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z764ProForCod_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z764ProForCod));
      GXCCtl = "O4650FasForLin_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O4650FasForLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_689_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_689_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_689_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_689, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROFORDSC2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowV6689( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32689( ) ;
      edtFasForLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtProForDsc2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PROFORDSC2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFasForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFasForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "FASFORLIN_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasForLin_Internalname ;
         wbErr = true ;
         A4650FasForLin = (short)(0) ;
      }
      else
      {
         A4650FasForLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFasForLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      h764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
      A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
      A4715ProForDsc2 = httpContext.cgiGet( edtProForDsc2_Internalname) ;
      GXCCtl = "GXHCPROFORCOD_" + sGXsfl_32_idx ;
      A764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z4650FasForLin_" + sGXsfl_32_idx ;
      Z4650FasForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z764ProForCod_" + sGXsfl_32_idx ;
      Z764ProForCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O4650FasForLin_" + sGXsfl_32_idx ;
      O4650FasForLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_689_" + sGXsfl_32_idx ;
      nRcdDeleted_689 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_689_" + sGXsfl_32_idx ;
      nRcdExists_689 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_689_" + sGXsfl_32_idx ;
      nIsMod_689 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtProForDsc2_Enabled = edtProForDsc2_Enabled ;
      defedtProForDsc_Enabled = edtProForDsc_Enabled ;
      defedtFasForLin_Enabled = edtFasForLin_Enabled ;
   }

   public void confirmValuesV60( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32689( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32689( ) ;
         httpContext.changePostValue( "Z4650FasForLin_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z4650FasForLin_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4650FasForLin_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z764ProForCod_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z764ProForCod_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z764ProForCod_"+sGXsfl_32_idx) ;
      }
      httpContext.changePostValue( "O4650FasForLin", httpContext.cgiGet( "T4650FasForLin")) ;
      httpContext.deletePostValue( "T4650FasForLin") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tfaspq", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4649FasUltForL", GXutil.ltrim( localUtil.ntoc( Z4649FasUltForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASMAXLIN", GXutil.ltrim( localUtil.ntoc( A13823FasMaxLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASULTFORL", GXutil.ltrim( localUtil.ntoc( A4649FasUltForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCPROFORCOD", GXutil.rtrim( A764ProForCod));
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
      return formatLink("app.tfaspq", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "TFASPQ" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tratamientos Quimicos por Fase", "") ;
   }

   public void initializeNonKeyV645( )
   {
      A4649FasUltForL = (short)(0) ;
      n4649FasUltForL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4649FasUltForL), 4, 0));
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A13823FasMaxLin = (short)(0) ;
      n13823FasMaxLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
      Z4649FasUltForL = (short)(0) ;
      Z460FasDsc = "" ;
   }

   public void initAllV645( )
   {
      A457FasCod = "" ;
      n457FasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      initializeNonKeyV645( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyV6689( )
   {
      h764ProForCod = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      Z764ProForCod = "" ;
   }

   public void initAllV6689( )
   {
      A4650FasForLin = (short)(0) ;
      initializeNonKeyV6689( ) ;
   }

   public void standaloneModalInsertV6689( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211661333", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("tfaspq.js", "?20268211661334", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties689( )
   {
      edtProForDsc2_Enabled = defedtProForDsc2_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtProForDsc_Enabled = defedtProForDsc_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtFasForLin_Enabled = defedtFasForLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4650FasForLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", h764ProForCod);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A4715ProForDsc2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProForDsc2_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtFasForLin_Internalname = "FASFORLIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForDsc2_Internalname = "PROFORDSC2" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      Form.setCaption( httpContext.getMessage( "Tratamientos Quimicos por Fase", "") );
      edtProForDsc2_Jsonclick = "" ;
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtFasForLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtProForDsc2_Enabled = 0 ;
      edtProForDsc_Enabled = 0 ;
      edtProForCod_Enabled = 1 ;
      edtFasForLin_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 1 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
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

   public void gxsgaproforcodV60( String A396EmprCod ,
                                  String A13740ProFDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgaproforcod_dataV60( A396EmprCod, A13740ProFDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgaproforcod_dataV60( String A396EmprCod ,
                                          String A13740ProFDsc )
   {
      l13740ProFDsc = GXutil.concat( GXutil.rtrim( A13740ProFDsc), "%", "") ;
      /* Using cursor T00V662 */
      pr_default.execute(56, new Object[] {A396EmprCod, l13740ProFDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(56) != 101) )
      {
         gxdynajaxctrlcodr.add(T00V662_A13740ProFDsc[0]);
         gxdynajaxctrldescr.add(T00V662_A13740ProFDsc[0]);
         pr_default.readNext(56);
      }
      pr_default.close(56);
   }

   public void gxhcaproforcodV6689( String A396EmprCod ,
                                    String A13740ProFDsc )
   {
      /* Using cursor T00V663 */
      pr_default.execute(57, new Object[] {A13740ProFDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(57) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13740ProFDsc = T00V663_A13740ProFDsc[0] ;
         A396EmprCod = T00V663_A396EmprCod[0] ;
         A764ProForCod = T00V663_A764ProForCod[0] ;
         pr_default.readNext(57);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A764ProForCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(57);
   }

   public void gx2asafasforlinV6689( String A764ProForCod ,
                                     String Gx_mode ,
                                     short A13823FasMaxLin ,
                                     short A4650FasForLin )
   {
      if ( (0==A4650FasForLin) && isIns( )  && ( ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( (0==A4650FasForLin) && true /* After */ ) ) )
      {
         GXt_int5 = A4650FasForLin ;
         GXv_int6[0] = GXt_int5 ;
         new app.pnumlin(remoteHandle, context).execute( A13823FasMaxLin, (short)(10), (short)(4), O4650FasForLin, GXv_int6) ;
         tfaspq_impl.this.GXt_int5 = GXv_int6[0] ;
         A4650FasForLin = (short)(GXt_int5) ;
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4650FasForLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      subsflControlProps_32689( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalV6689( ) ;
         standaloneModalV6689( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowV6689( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32689( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      /* Using cursor T00V664 */
      pr_default.execute(58, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(58) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00V664_A407EmprNom[0] ;
      n407EmprNom = T00V664_n407EmprNom[0] ;
      pr_default.close(58);
      /* Using cursor T00V621 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13823FasMaxLin = T00V621_A13823FasMaxLin[0] ;
         n13823FasMaxLin = T00V621_n13823FasMaxLin[0] ;
      }
      else
      {
         A13823FasMaxLin = (short)(0) ;
         n13823FasMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13823FasMaxLin), 4, 0));
      }
      pr_default.close(15);
      GX_FocusControl = edtFasDsc_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
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

   public void valid_Fascod( )
   {
      n457FasCod = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      /* Using cursor T00V621 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13823FasMaxLin = T00V621_A13823FasMaxLin[0] ;
         n13823FasMaxLin = T00V621_n13823FasMaxLin[0] ;
      }
      else
      {
         A13823FasMaxLin = (short)(0) ;
         n13823FasMaxLin = false ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4649FasUltForL", GXutil.ltrim( localUtil.ntoc( A4649FasUltForL, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A13823FasMaxLin", GXutil.ltrim( localUtil.ntoc( A13823FasMaxLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4649FasUltForL", GXutil.ltrim( localUtil.ntoc( Z4649FasUltForL, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z407EmprNom", GXutil.rtrim( Z407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13823FasMaxLin", GXutil.ltrim( localUtil.ntoc( Z13823FasMaxLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public void valid_Proforcod( )
   {
      n13823FasMaxLin = false ;
      if ( (GXutil.strcmp("", h764ProForCod)==0) )
      {
         A764ProForCod = "" ;
      }
      else
      {
         A13740ProFDsc = h764ProForCod ;
         /* Using cursor T00V665 */
         pr_default.execute(59, new Object[] {A13740ProFDsc, A396EmprCod});
         A764ProForCod = T00V665_A764ProForCod[0] ;
         A764ProForCod = T00V665_A764ProForCod[0] ;
         if ( ! ( (pr_default.getStatus(59) == 101) ) )
         {
            pr_default.readNext(59);
            if ( ! ( (pr_default.getStatus(59) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "PROFORCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForCod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(59);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
      /* Using cursor T00V666 */
      pr_default.execute(60, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(60) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      A766ProForDsc = T00V666_A766ProForDsc[0] ;
      A4715ProForDsc2 = T00V666_A4715ProForDsc2[0] ;
      pr_default.close(60);
      if ( (0==A4650FasForLin) && isIns( )  && ( ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( ! (GXutil.strcmp("", A764ProForCod)==0) && true /* After */ ) || ( (0==A4650FasForLin) && true /* After */ ) ) )
      {
         GXt_int5 = A4650FasForLin ;
         GXv_int6[0] = GXt_int5 ;
         new app.pnumlin(remoteHandle, context).execute( A13823FasMaxLin, (short)(10), (short)(4), O4650FasForLin, GXv_int6) ;
         tfaspq_impl.this.GXt_int5 = GXv_int6[0] ;
         A4650FasForLin = (short)(GXt_int5) ;
      }
      if ( A4650FasForLin == 9999 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se ha alcanzado el numero de lineas maximo", ""), 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProForCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", GXutil.rtrim( A764ProForCod));
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A4715ProForDsc2", GXutil.rtrim( A4715ProForDsc2));
      httpContext.ajax_rsp_assign_attri("", false, "A4650FasForLin", GXutil.ltrim( localUtil.ntoc( A4650FasForLin, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "h764ProForCod", h764ProForCod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12V62',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A4649FasUltForL',fld:'FASULTFORL',pic:'ZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A13823FasMaxLin',fld:'FASMAXLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z396EmprCod'},{av:'Z457FasCod'},{av:'Z4649FasUltForL'},{av:'Z460FasDsc'},{av:'Z407EmprNom'},{av:'Z13823FasMaxLin'},{ctrl:'BTNTRN_DELETE',prop:'Enabled'},{ctrl:'BTNTRN_ENTER',prop:'Enabled'}]}");
      setEventMetadata("VALID_FASFORLIN","{handler:'valid_Fasforlin',iparms:[]");
      setEventMetadata("VALID_FASFORLIN",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A13823FasMaxLin',fld:'FASMAXLIN',pic:'ZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'O4650FasForLin'},{av:'h764ProForCod'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4650FasForLin',fld:'FASFORLIN',pic:'ZZZ9'},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A4715ProForDsc2',fld:'PROFORDSC2',pic:''},{av:'A4650FasForLin',fld:'FASFORLIN',pic:'ZZZ9'},{av:'h764ProForCod'}]}");
      setEventMetadata("NULL","{handler:'valid_Profordsc2',iparms:[]");
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
      pr_default.close(60);
      pr_default.close(54);
      pr_default.close(58);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z396EmprCod = "" ;
      Z457FasCod = "" ;
      Z460FasDsc = "" ;
      Z764ProForCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13740ProFDsc = "" ;
      h764ProForCod = "" ;
      A764ProForCod = "" ;
      Gx_mode = "" ;
      A457FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A460FasDsc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode689 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A766ProForDsc = "" ;
      A4715ProForDsc2 = "" ;
      T00V66_A13823FasMaxLin = new short[1] ;
      T00V66_n13823FasMaxLin = new boolean[] {false} ;
      AV33Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      Z407EmprNom = "" ;
      T00V69_A407EmprNom = new String[] {""} ;
      T00V69_n407EmprNom = new boolean[] {false} ;
      T00V611_A457FasCod = new String[] {""} ;
      T00V611_n457FasCod = new boolean[] {false} ;
      T00V611_A4649FasUltForL = new short[1] ;
      T00V611_n4649FasUltForL = new boolean[] {false} ;
      T00V611_A460FasDsc = new String[] {""} ;
      T00V611_A407EmprNom = new String[] {""} ;
      T00V611_n407EmprNom = new boolean[] {false} ;
      T00V611_A396EmprCod = new String[] {""} ;
      T00V611_A13823FasMaxLin = new short[1] ;
      T00V611_n13823FasMaxLin = new boolean[] {false} ;
      T00V613_A13823FasMaxLin = new short[1] ;
      T00V613_n13823FasMaxLin = new boolean[] {false} ;
      T00V614_A396EmprCod = new String[] {""} ;
      T00V614_A457FasCod = new String[] {""} ;
      T00V614_n457FasCod = new boolean[] {false} ;
      T00V68_A457FasCod = new String[] {""} ;
      T00V68_n457FasCod = new boolean[] {false} ;
      T00V68_A4649FasUltForL = new short[1] ;
      T00V68_n4649FasUltForL = new boolean[] {false} ;
      T00V68_A460FasDsc = new String[] {""} ;
      T00V68_A396EmprCod = new String[] {""} ;
      sMode45 = "" ;
      T00V615_A396EmprCod = new String[] {""} ;
      T00V615_A457FasCod = new String[] {""} ;
      T00V615_n457FasCod = new boolean[] {false} ;
      T00V616_A396EmprCod = new String[] {""} ;
      T00V616_A457FasCod = new String[] {""} ;
      T00V616_n457FasCod = new boolean[] {false} ;
      T00V67_A457FasCod = new String[] {""} ;
      T00V67_n457FasCod = new boolean[] {false} ;
      T00V67_A4649FasUltForL = new short[1] ;
      T00V67_n4649FasUltForL = new boolean[] {false} ;
      T00V67_A460FasDsc = new String[] {""} ;
      T00V67_A396EmprCod = new String[] {""} ;
      T00V621_A13823FasMaxLin = new short[1] ;
      T00V621_n13823FasMaxLin = new boolean[] {false} ;
      T00V622_A396EmprCod = new String[] {""} ;
      T00V622_A129BarCod = new int[1] ;
      T00V622_A132BarCodReo = new byte[1] ;
      T00V622_A130BarCodPar = new String[] {""} ;
      T00V622_A14152MEnvOrd = new short[1] ;
      T00V623_A396EmprCod = new String[] {""} ;
      T00V623_A13026PedDGId = new int[1] ;
      T00V623_A758ProCod = new String[] {""} ;
      T00V623_A13045PedDGFasLi = new short[1] ;
      T00V624_A396EmprCod = new String[] {""} ;
      T00V624_A6882Tas_num = new int[1] ;
      T00V624_A6922Tas_lin = new short[1] ;
      T00V625_A396EmprCod = new String[] {""} ;
      T00V625_A11604PArtId = new int[1] ;
      T00V625_A11611PAFOrd = new short[1] ;
      T00V626_A396EmprCod = new String[] {""} ;
      T00V626_A11278Regc_c1 = new String[] {""} ;
      T00V626_A457FasCod = new String[] {""} ;
      T00V626_n457FasCod = new boolean[] {false} ;
      T00V627_A396EmprCod = new String[] {""} ;
      T00V627_A1131AviNumero = new long[1] ;
      T00V627_A457FasCod = new String[] {""} ;
      T00V627_n457FasCod = new boolean[] {false} ;
      T00V628_A396EmprCod = new String[] {""} ;
      T00V628_A457FasCod = new String[] {""} ;
      T00V628_n457FasCod = new boolean[] {false} ;
      T00V628_A9832MaqCodF = new String[] {""} ;
      T00V629_A396EmprCod = new String[] {""} ;
      T00V629_A457FasCod = new String[] {""} ;
      T00V629_n457FasCod = new boolean[] {false} ;
      T00V629_A9723Cod_par = new short[1] ;
      T00V630_A396EmprCod = new String[] {""} ;
      T00V630_A457FasCod = new String[] {""} ;
      T00V630_n457FasCod = new boolean[] {false} ;
      T00V630_A8096FasArtTip = new short[1] ;
      T00V630_A7730FasArtInt = new byte[1] ;
      T00V630_A7731FasArtSeg = new String[] {""} ;
      T00V631_A396EmprCod = new String[] {""} ;
      T00V631_A6633NumOrd = new short[1] ;
      T00V631_A457FasCod = new String[] {""} ;
      T00V631_n457FasCod = new boolean[] {false} ;
      T00V632_A396EmprCod = new String[] {""} ;
      T00V632_A2253SalExtAlb = new int[1] ;
      T00V632_A6248SalExNln = new short[1] ;
      T00V633_A396EmprCod = new String[] {""} ;
      T00V633_A457FasCod = new String[] {""} ;
      T00V633_n457FasCod = new boolean[] {false} ;
      T00V633_A5703Hh_FLin = new short[1] ;
      T00V634_A396EmprCod = new String[] {""} ;
      T00V634_A4744RecPreCod = new int[1] ;
      T00V635_A396EmprCod = new String[] {""} ;
      T00V635_A457FasCod = new String[] {""} ;
      T00V635_n457FasCod = new boolean[] {false} ;
      T00V635_A4031CCTCod = new int[1] ;
      T00V636_A396EmprCod = new String[] {""} ;
      T00V636_A457FasCod = new String[] {""} ;
      T00V636_n457FasCod = new boolean[] {false} ;
      T00V636_A3635FasTerCod = new byte[1] ;
      T00V637_A396EmprCod = new String[] {""} ;
      T00V637_A2406ExhAlbCod = new int[1] ;
      T00V637_A129BarCod = new int[1] ;
      T00V637_A132BarCodReo = new byte[1] ;
      T00V637_A130BarCodPar = new String[] {""} ;
      T00V638_A396EmprCod = new String[] {""} ;
      T00V638_A2253SalExtAlb = new int[1] ;
      T00V638_A129BarCod = new int[1] ;
      T00V638_A132BarCodReo = new byte[1] ;
      T00V638_A130BarCodPar = new String[] {""} ;
      T00V639_A396EmprCod = new String[] {""} ;
      T00V639_A30AlbProCod = new long[1] ;
      T00V639_A129BarCod = new int[1] ;
      T00V639_A132BarCodReo = new byte[1] ;
      T00V639_A130BarCodPar = new String[] {""} ;
      T00V639_A1240GuiFasLin = new short[1] ;
      T00V640_A396EmprCod = new String[] {""} ;
      T00V640_A758ProCod = new String[] {""} ;
      T00V640_A774ProNumLin = new short[1] ;
      T00V641_A396EmprCod = new String[] {""} ;
      T00V641_A252CliCod = new int[1] ;
      T00V641_A457FasCod = new String[] {""} ;
      T00V641_n457FasCod = new boolean[] {false} ;
      T00V642_A396EmprCod = new String[] {""} ;
      T00V642_A457FasCod = new String[] {""} ;
      T00V642_n457FasCod = new boolean[] {false} ;
      T00V642_A463FasNumLin = new byte[1] ;
      T00V643_A396EmprCod = new String[] {""} ;
      T00V643_A361DisCod = new int[1] ;
      T00V643_A758ProCod = new String[] {""} ;
      T00V643_A368DisFasLin = new short[1] ;
      T00V644_A396EmprCod = new String[] {""} ;
      T00V644_A129BarCod = new int[1] ;
      T00V644_A132BarCodReo = new byte[1] ;
      T00V644_A130BarCodPar = new String[] {""} ;
      T00V644_A758ProCod = new String[] {""} ;
      T00V644_A194BarOrdLin = new short[1] ;
      T00V646_A396EmprCod = new String[] {""} ;
      T00V646_A457FasCod = new String[] {""} ;
      T00V646_n457FasCod = new boolean[] {false} ;
      Z766ProForDsc = "" ;
      Z4715ProForDsc2 = "" ;
      T00V647_A457FasCod = new String[] {""} ;
      T00V647_n457FasCod = new boolean[] {false} ;
      T00V647_A4650FasForLin = new short[1] ;
      T00V647_A766ProForDsc = new String[] {""} ;
      T00V647_A4715ProForDsc2 = new String[] {""} ;
      T00V647_A396EmprCod = new String[] {""} ;
      T00V647_A764ProForCod = new String[] {""} ;
      T00V648_A13740ProFDsc = new String[] {""} ;
      T00V648_A396EmprCod = new String[] {""} ;
      T00V648_A764ProForCod = new String[] {""} ;
      T00V649_A13740ProFDsc = new String[] {""} ;
      T00V649_A396EmprCod = new String[] {""} ;
      T00V649_A764ProForCod = new String[] {""} ;
      T00V650_A13740ProFDsc = new String[] {""} ;
      T00V650_A396EmprCod = new String[] {""} ;
      T00V650_A764ProForCod = new String[] {""} ;
      T00V651_A13740ProFDsc = new String[] {""} ;
      T00V651_A396EmprCod = new String[] {""} ;
      T00V651_A764ProForCod = new String[] {""} ;
      T00V64_A766ProForDsc = new String[] {""} ;
      T00V64_A4715ProForDsc2 = new String[] {""} ;
      T00V652_A13740ProFDsc = new String[] {""} ;
      T00V652_A396EmprCod = new String[] {""} ;
      T00V652_A764ProForCod = new String[] {""} ;
      T00V653_A766ProForDsc = new String[] {""} ;
      T00V653_A4715ProForDsc2 = new String[] {""} ;
      T00V654_A13740ProFDsc = new String[] {""} ;
      T00V654_A396EmprCod = new String[] {""} ;
      T00V654_A764ProForCod = new String[] {""} ;
      T00V655_A396EmprCod = new String[] {""} ;
      T00V655_A457FasCod = new String[] {""} ;
      T00V655_n457FasCod = new boolean[] {false} ;
      T00V655_A4650FasForLin = new short[1] ;
      T00V63_A457FasCod = new String[] {""} ;
      T00V63_n457FasCod = new boolean[] {false} ;
      T00V63_A4650FasForLin = new short[1] ;
      T00V63_A396EmprCod = new String[] {""} ;
      T00V63_A764ProForCod = new String[] {""} ;
      T00V656_A13740ProFDsc = new String[] {""} ;
      T00V656_A396EmprCod = new String[] {""} ;
      T00V656_A764ProForCod = new String[] {""} ;
      T00V62_A457FasCod = new String[] {""} ;
      T00V62_n457FasCod = new boolean[] {false} ;
      T00V62_A4650FasForLin = new short[1] ;
      T00V62_A396EmprCod = new String[] {""} ;
      T00V62_A764ProForCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      T00V660_A766ProForDsc = new String[] {""} ;
      T00V660_A4715ProForDsc2 = new String[] {""} ;
      T00V661_A396EmprCod = new String[] {""} ;
      T00V661_A457FasCod = new String[] {""} ;
      T00V661_n457FasCod = new boolean[] {false} ;
      T00V661_A4650FasForLin = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13740ProFDsc = "" ;
      T00V662_A13740ProFDsc = new String[] {""} ;
      T00V663_A13740ProFDsc = new String[] {""} ;
      T00V663_A396EmprCod = new String[] {""} ;
      T00V663_A764ProForCod = new String[] {""} ;
      T00V664_A407EmprNom = new String[] {""} ;
      T00V664_n407EmprNom = new boolean[] {false} ;
      ZZ396EmprCod = "" ;
      ZZ457FasCod = "" ;
      ZZ460FasDsc = "" ;
      ZZ407EmprNom = "" ;
      T00V665_A13740ProFDsc = new String[] {""} ;
      T00V665_A396EmprCod = new String[] {""} ;
      T00V665_A764ProForCod = new String[] {""} ;
      T00V666_A766ProForDsc = new String[] {""} ;
      T00V666_A4715ProForDsc2 = new String[] {""} ;
      GXv_int6 = new long[1] ;
      Zh764ProForCod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfaspq__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfaspq__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfaspq__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfaspq__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfaspq__default(),
         new Object[] {
             new Object[] {
            T00V62_A457FasCod, T00V62_A4650FasForLin, T00V62_A396EmprCod, T00V62_A764ProForCod
            }
            , new Object[] {
            T00V63_A457FasCod, T00V63_A4650FasForLin, T00V63_A396EmprCod, T00V63_A764ProForCod
            }
            , new Object[] {
            T00V64_A766ProForDsc, T00V64_A4715ProForDsc2
            }
            , new Object[] {
            T00V66_A13823FasMaxLin, T00V66_n13823FasMaxLin
            }
            , new Object[] {
            T00V67_A457FasCod, T00V67_A4649FasUltForL, T00V67_n4649FasUltForL, T00V67_A460FasDsc, T00V67_A396EmprCod
            }
            , new Object[] {
            T00V68_A457FasCod, T00V68_A4649FasUltForL, T00V68_n4649FasUltForL, T00V68_A460FasDsc, T00V68_A396EmprCod
            }
            , new Object[] {
            T00V69_A407EmprNom, T00V69_n407EmprNom
            }
            , new Object[] {
            T00V611_A457FasCod, T00V611_A4649FasUltForL, T00V611_n4649FasUltForL, T00V611_A460FasDsc, T00V611_A407EmprNom, T00V611_n407EmprNom, T00V611_A396EmprCod, T00V611_A13823FasMaxLin, T00V611_n13823FasMaxLin
            }
            , new Object[] {
            T00V613_A13823FasMaxLin, T00V613_n13823FasMaxLin
            }
            , new Object[] {
            T00V614_A396EmprCod, T00V614_A457FasCod
            }
            , new Object[] {
            T00V615_A396EmprCod, T00V615_A457FasCod
            }
            , new Object[] {
            T00V616_A396EmprCod, T00V616_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00V621_A13823FasMaxLin, T00V621_n13823FasMaxLin
            }
            , new Object[] {
            T00V622_A396EmprCod, T00V622_A129BarCod, T00V622_A132BarCodReo, T00V622_A130BarCodPar, T00V622_A14152MEnvOrd
            }
            , new Object[] {
            T00V623_A396EmprCod, T00V623_A13026PedDGId, T00V623_A758ProCod, T00V623_A13045PedDGFasLi
            }
            , new Object[] {
            T00V624_A396EmprCod, T00V624_A6882Tas_num, T00V624_A6922Tas_lin
            }
            , new Object[] {
            T00V625_A396EmprCod, T00V625_A11604PArtId, T00V625_A11611PAFOrd
            }
            , new Object[] {
            T00V626_A396EmprCod, T00V626_A11278Regc_c1, T00V626_A457FasCod
            }
            , new Object[] {
            T00V627_A396EmprCod, T00V627_A1131AviNumero, T00V627_A457FasCod
            }
            , new Object[] {
            T00V628_A396EmprCod, T00V628_A457FasCod, T00V628_A9832MaqCodF
            }
            , new Object[] {
            T00V629_A396EmprCod, T00V629_A457FasCod, T00V629_A9723Cod_par
            }
            , new Object[] {
            T00V630_A396EmprCod, T00V630_A457FasCod, T00V630_A8096FasArtTip, T00V630_A7730FasArtInt, T00V630_A7731FasArtSeg
            }
            , new Object[] {
            T00V631_A396EmprCod, T00V631_A6633NumOrd, T00V631_A457FasCod
            }
            , new Object[] {
            T00V632_A396EmprCod, T00V632_A2253SalExtAlb, T00V632_A6248SalExNln
            }
            , new Object[] {
            T00V633_A396EmprCod, T00V633_A457FasCod, T00V633_A5703Hh_FLin
            }
            , new Object[] {
            T00V634_A396EmprCod, T00V634_A4744RecPreCod
            }
            , new Object[] {
            T00V635_A396EmprCod, T00V635_A457FasCod, T00V635_A4031CCTCod
            }
            , new Object[] {
            T00V636_A396EmprCod, T00V636_A457FasCod, T00V636_A3635FasTerCod
            }
            , new Object[] {
            T00V637_A396EmprCod, T00V637_A2406ExhAlbCod, T00V637_A129BarCod, T00V637_A132BarCodReo, T00V637_A130BarCodPar
            }
            , new Object[] {
            T00V638_A396EmprCod, T00V638_A2253SalExtAlb, T00V638_A129BarCod, T00V638_A132BarCodReo, T00V638_A130BarCodPar
            }
            , new Object[] {
            T00V639_A396EmprCod, T00V639_A30AlbProCod, T00V639_A129BarCod, T00V639_A132BarCodReo, T00V639_A130BarCodPar, T00V639_A1240GuiFasLin
            }
            , new Object[] {
            T00V640_A396EmprCod, T00V640_A758ProCod, T00V640_A774ProNumLin
            }
            , new Object[] {
            T00V641_A396EmprCod, T00V641_A252CliCod, T00V641_A457FasCod
            }
            , new Object[] {
            T00V642_A396EmprCod, T00V642_A457FasCod, T00V642_A463FasNumLin
            }
            , new Object[] {
            T00V643_A396EmprCod, T00V643_A361DisCod, T00V643_A758ProCod, T00V643_A368DisFasLin
            }
            , new Object[] {
            T00V644_A396EmprCod, T00V644_A129BarCod, T00V644_A132BarCodReo, T00V644_A130BarCodPar, T00V644_A758ProCod, T00V644_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            T00V646_A396EmprCod, T00V646_A457FasCod
            }
            , new Object[] {
            T00V647_A457FasCod, T00V647_A4650FasForLin, T00V647_A766ProForDsc, T00V647_A4715ProForDsc2, T00V647_A396EmprCod, T00V647_A764ProForCod
            }
            , new Object[] {
            T00V648_A13740ProFDsc, T00V648_A396EmprCod, T00V648_A764ProForCod
            }
            , new Object[] {
            T00V649_A13740ProFDsc, T00V649_A396EmprCod, T00V649_A764ProForCod
            }
            , new Object[] {
            T00V650_A13740ProFDsc, T00V650_A396EmprCod, T00V650_A764ProForCod
            }
            , new Object[] {
            T00V651_A13740ProFDsc, T00V651_A396EmprCod, T00V651_A764ProForCod
            }
            , new Object[] {
            T00V652_A13740ProFDsc, T00V652_A396EmprCod, T00V652_A764ProForCod
            }
            , new Object[] {
            T00V653_A766ProForDsc, T00V653_A4715ProForDsc2
            }
            , new Object[] {
            T00V654_A13740ProFDsc, T00V654_A396EmprCod, T00V654_A764ProForCod
            }
            , new Object[] {
            T00V655_A396EmprCod, T00V655_A457FasCod, T00V655_A4650FasForLin
            }
            , new Object[] {
            T00V656_A13740ProFDsc, T00V656_A396EmprCod, T00V656_A764ProForCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00V660_A766ProForDsc, T00V660_A4715ProForDsc2
            }
            , new Object[] {
            T00V661_A396EmprCod, T00V661_A457FasCod, T00V661_A4650FasForLin
            }
            , new Object[] {
            T00V662_A13740ProFDsc
            }
            , new Object[] {
            T00V663_A13740ProFDsc, T00V663_A396EmprCod, T00V663_A764ProForCod
            }
            , new Object[] {
            T00V664_A407EmprNom, T00V664_n407EmprNom
            }
            , new Object[] {
            T00V665_A13740ProFDsc, T00V665_A396EmprCod, T00V665_A764ProForCod
            }
            , new Object[] {
            T00V666_A766ProForDsc, T00V666_A4715ProForDsc2
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short Z4649FasUltForL ;
   private short Z4650FasForLin ;
   private short O4650FasForLin ;
   private short nRcdDeleted_689 ;
   private short nRcdExists_689 ;
   private short nIsMod_689 ;
   private short A13823FasMaxLin ;
   private short A4650FasForLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount689 ;
   private short RcdFound689 ;
   private short nBlankRcdUsr689 ;
   private short A4649FasUltForL ;
   private short s4649FasUltForL ;
   private short O4649FasUltForL ;
   private short T4650FasForLin ;
   private short Z13823FasMaxLin ;
   private short RcdFound45 ;
   private short nIsDirty_45 ;
   private short nIsDirty_689 ;
   private short gxhchits ;
   private short ZZ4649FasUltForL ;
   private short ZZ13823FasMaxLin ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int trnEnded ;
   private int edtFasCod_Enabled ;
   private int edtFasDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtFasForLin_Enabled ;
   private int edtProForCod_Enabled ;
   private int edtProForDsc_Enabled ;
   private int edtProForDsc2_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtProForDsc2_Enabled ;
   private int defedtProForDsc_Enabled ;
   private int defedtFasForLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private String sPrefix ;
   private String Z396EmprCod ;
   private String Z457FasCod ;
   private String Z460FasDsc ;
   private String Z764ProForCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String Gx_mode ;
   private String A457FasCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasCod_Internalname ;
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
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode689 ;
   private String edtFasForLin_Internalname ;
   private String edtProForCod_Internalname ;
   private String edtProForDsc_Internalname ;
   private String edtProForDsc2_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A766ProForDsc ;
   private String A4715ProForDsc2 ;
   private String AV33Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String Z407EmprNom ;
   private String sMode45 ;
   private String Z766ProForDsc ;
   private String Z4715ProForDsc2 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtFasForLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForDsc2_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
   private String ZZ396EmprCod ;
   private String ZZ457FasCod ;
   private String ZZ460FasDsc ;
   private String ZZ407EmprNom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n13823FasMaxLin ;
   private boolean n457FasCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean n4649FasUltForL ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private String A13740ProFDsc ;
   private String h764ProForCod ;
   private String l13740ProFDsc ;
   private String Zh764ProForCod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private IDataStoreProvider pr_default ;
   private short[] T00V66_A13823FasMaxLin ;
   private boolean[] T00V66_n13823FasMaxLin ;
   private String[] T00V69_A407EmprNom ;
   private boolean[] T00V69_n407EmprNom ;
   private String[] T00V611_A457FasCod ;
   private boolean[] T00V611_n457FasCod ;
   private short[] T00V611_A4649FasUltForL ;
   private boolean[] T00V611_n4649FasUltForL ;
   private String[] T00V611_A460FasDsc ;
   private String[] T00V611_A407EmprNom ;
   private boolean[] T00V611_n407EmprNom ;
   private String[] T00V611_A396EmprCod ;
   private short[] T00V611_A13823FasMaxLin ;
   private boolean[] T00V611_n13823FasMaxLin ;
   private short[] T00V613_A13823FasMaxLin ;
   private boolean[] T00V613_n13823FasMaxLin ;
   private String[] T00V614_A396EmprCod ;
   private String[] T00V614_A457FasCod ;
   private boolean[] T00V614_n457FasCod ;
   private String[] T00V68_A457FasCod ;
   private boolean[] T00V68_n457FasCod ;
   private short[] T00V68_A4649FasUltForL ;
   private boolean[] T00V68_n4649FasUltForL ;
   private String[] T00V68_A460FasDsc ;
   private String[] T00V68_A396EmprCod ;
   private String[] T00V615_A396EmprCod ;
   private String[] T00V615_A457FasCod ;
   private boolean[] T00V615_n457FasCod ;
   private String[] T00V616_A396EmprCod ;
   private String[] T00V616_A457FasCod ;
   private boolean[] T00V616_n457FasCod ;
   private String[] T00V67_A457FasCod ;
   private boolean[] T00V67_n457FasCod ;
   private short[] T00V67_A4649FasUltForL ;
   private boolean[] T00V67_n4649FasUltForL ;
   private String[] T00V67_A460FasDsc ;
   private String[] T00V67_A396EmprCod ;
   private short[] T00V621_A13823FasMaxLin ;
   private boolean[] T00V621_n13823FasMaxLin ;
   private String[] T00V622_A396EmprCod ;
   private int[] T00V622_A129BarCod ;
   private byte[] T00V622_A132BarCodReo ;
   private String[] T00V622_A130BarCodPar ;
   private short[] T00V622_A14152MEnvOrd ;
   private String[] T00V623_A396EmprCod ;
   private int[] T00V623_A13026PedDGId ;
   private String[] T00V623_A758ProCod ;
   private short[] T00V623_A13045PedDGFasLi ;
   private String[] T00V624_A396EmprCod ;
   private int[] T00V624_A6882Tas_num ;
   private short[] T00V624_A6922Tas_lin ;
   private String[] T00V625_A396EmprCod ;
   private int[] T00V625_A11604PArtId ;
   private short[] T00V625_A11611PAFOrd ;
   private String[] T00V626_A396EmprCod ;
   private String[] T00V626_A11278Regc_c1 ;
   private String[] T00V626_A457FasCod ;
   private boolean[] T00V626_n457FasCod ;
   private String[] T00V627_A396EmprCod ;
   private long[] T00V627_A1131AviNumero ;
   private String[] T00V627_A457FasCod ;
   private boolean[] T00V627_n457FasCod ;
   private String[] T00V628_A396EmprCod ;
   private String[] T00V628_A457FasCod ;
   private boolean[] T00V628_n457FasCod ;
   private String[] T00V628_A9832MaqCodF ;
   private String[] T00V629_A396EmprCod ;
   private String[] T00V629_A457FasCod ;
   private boolean[] T00V629_n457FasCod ;
   private short[] T00V629_A9723Cod_par ;
   private String[] T00V630_A396EmprCod ;
   private String[] T00V630_A457FasCod ;
   private boolean[] T00V630_n457FasCod ;
   private short[] T00V630_A8096FasArtTip ;
   private byte[] T00V630_A7730FasArtInt ;
   private String[] T00V630_A7731FasArtSeg ;
   private String[] T00V631_A396EmprCod ;
   private short[] T00V631_A6633NumOrd ;
   private String[] T00V631_A457FasCod ;
   private boolean[] T00V631_n457FasCod ;
   private String[] T00V632_A396EmprCod ;
   private int[] T00V632_A2253SalExtAlb ;
   private short[] T00V632_A6248SalExNln ;
   private String[] T00V633_A396EmprCod ;
   private String[] T00V633_A457FasCod ;
   private boolean[] T00V633_n457FasCod ;
   private short[] T00V633_A5703Hh_FLin ;
   private String[] T00V634_A396EmprCod ;
   private int[] T00V634_A4744RecPreCod ;
   private String[] T00V635_A396EmprCod ;
   private String[] T00V635_A457FasCod ;
   private boolean[] T00V635_n457FasCod ;
   private int[] T00V635_A4031CCTCod ;
   private String[] T00V636_A396EmprCod ;
   private String[] T00V636_A457FasCod ;
   private boolean[] T00V636_n457FasCod ;
   private byte[] T00V636_A3635FasTerCod ;
   private String[] T00V637_A396EmprCod ;
   private int[] T00V637_A2406ExhAlbCod ;
   private int[] T00V637_A129BarCod ;
   private byte[] T00V637_A132BarCodReo ;
   private String[] T00V637_A130BarCodPar ;
   private String[] T00V638_A396EmprCod ;
   private int[] T00V638_A2253SalExtAlb ;
   private int[] T00V638_A129BarCod ;
   private byte[] T00V638_A132BarCodReo ;
   private String[] T00V638_A130BarCodPar ;
   private String[] T00V639_A396EmprCod ;
   private long[] T00V639_A30AlbProCod ;
   private int[] T00V639_A129BarCod ;
   private byte[] T00V639_A132BarCodReo ;
   private String[] T00V639_A130BarCodPar ;
   private short[] T00V639_A1240GuiFasLin ;
   private String[] T00V640_A396EmprCod ;
   private String[] T00V640_A758ProCod ;
   private short[] T00V640_A774ProNumLin ;
   private String[] T00V641_A396EmprCod ;
   private int[] T00V641_A252CliCod ;
   private String[] T00V641_A457FasCod ;
   private boolean[] T00V641_n457FasCod ;
   private String[] T00V642_A396EmprCod ;
   private String[] T00V642_A457FasCod ;
   private boolean[] T00V642_n457FasCod ;
   private byte[] T00V642_A463FasNumLin ;
   private String[] T00V643_A396EmprCod ;
   private int[] T00V643_A361DisCod ;
   private String[] T00V643_A758ProCod ;
   private short[] T00V643_A368DisFasLin ;
   private String[] T00V644_A396EmprCod ;
   private int[] T00V644_A129BarCod ;
   private byte[] T00V644_A132BarCodReo ;
   private String[] T00V644_A130BarCodPar ;
   private String[] T00V644_A758ProCod ;
   private short[] T00V644_A194BarOrdLin ;
   private String[] T00V646_A396EmprCod ;
   private String[] T00V646_A457FasCod ;
   private boolean[] T00V646_n457FasCod ;
   private String[] T00V647_A457FasCod ;
   private boolean[] T00V647_n457FasCod ;
   private short[] T00V647_A4650FasForLin ;
   private String[] T00V647_A766ProForDsc ;
   private String[] T00V647_A4715ProForDsc2 ;
   private String[] T00V647_A396EmprCod ;
   private String[] T00V647_A764ProForCod ;
   private String[] T00V648_A13740ProFDsc ;
   private String[] T00V648_A396EmprCod ;
   private String[] T00V648_A764ProForCod ;
   private String[] T00V649_A13740ProFDsc ;
   private String[] T00V649_A396EmprCod ;
   private String[] T00V649_A764ProForCod ;
   private String[] T00V650_A13740ProFDsc ;
   private String[] T00V650_A396EmprCod ;
   private String[] T00V650_A764ProForCod ;
   private String[] T00V651_A13740ProFDsc ;
   private String[] T00V651_A396EmprCod ;
   private String[] T00V651_A764ProForCod ;
   private String[] T00V64_A766ProForDsc ;
   private String[] T00V64_A4715ProForDsc2 ;
   private String[] T00V652_A13740ProFDsc ;
   private String[] T00V652_A396EmprCod ;
   private String[] T00V652_A764ProForCod ;
   private String[] T00V653_A766ProForDsc ;
   private String[] T00V653_A4715ProForDsc2 ;
   private String[] T00V654_A13740ProFDsc ;
   private String[] T00V654_A396EmprCod ;
   private String[] T00V654_A764ProForCod ;
   private String[] T00V655_A396EmprCod ;
   private String[] T00V655_A457FasCod ;
   private boolean[] T00V655_n457FasCod ;
   private short[] T00V655_A4650FasForLin ;
   private String[] T00V63_A457FasCod ;
   private boolean[] T00V63_n457FasCod ;
   private short[] T00V63_A4650FasForLin ;
   private String[] T00V63_A396EmprCod ;
   private String[] T00V63_A764ProForCod ;
   private String[] T00V656_A13740ProFDsc ;
   private String[] T00V656_A396EmprCod ;
   private String[] T00V656_A764ProForCod ;
   private String[] T00V62_A457FasCod ;
   private boolean[] T00V62_n457FasCod ;
   private short[] T00V62_A4650FasForLin ;
   private String[] T00V62_A396EmprCod ;
   private String[] T00V62_A764ProForCod ;
   private String[] T00V660_A766ProForDsc ;
   private String[] T00V660_A4715ProForDsc2 ;
   private String[] T00V661_A396EmprCod ;
   private String[] T00V661_A457FasCod ;
   private boolean[] T00V661_n457FasCod ;
   private short[] T00V661_A4650FasForLin ;
   private String[] T00V662_A13740ProFDsc ;
   private String[] T00V663_A13740ProFDsc ;
   private String[] T00V663_A396EmprCod ;
   private String[] T00V663_A764ProForCod ;
   private String[] T00V664_A407EmprNom ;
   private boolean[] T00V664_n407EmprNom ;
   private String[] T00V665_A13740ProFDsc ;
   private String[] T00V665_A396EmprCod ;
   private String[] T00V665_A764ProForCod ;
   private String[] T00V666_A766ProForDsc ;
   private String[] T00V666_A4715ProForDsc2 ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class tfaspq__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspq__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspq__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspq__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00V62", "SELECT FasCod, FasForLin, EmprCod, ProForCod FROM TXPFASPR1 WHERE EmprCod = ? AND FasCod = ? AND FasForLin = ?  FOR UPDATE OF ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V63", "SELECT FasCod, FasForLin, EmprCod, ProForCod FROM TXPFASPR1 WHERE EmprCod = ? AND FasCod = ? AND FasForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V64", "SELECT ProForDsc, ProForDsc2 FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V66", "SELECT COALESCE( T1.FasMaxLin, 0) AS FasMaxLin FROM (SELECT MAX(FasForLin) AS FasMaxLin, EmprCod, FasCod FROM TXPFASPR1 GROUP BY EmprCod, FasCod ) T1 WHERE T1.EmprCod = ? AND T1.FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V67", "SELECT FasCod, FasUltForL, FasDsc, EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ?  FOR UPDATE OF FasUltForL, FasDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V68", "SELECT FasCod, FasUltForL, FasDsc, EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V69", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V611", "SELECT /*+ FIRST_ROWS(100) */ TM1.FasCod, TM1.FasUltForL, TM1.FasDsc, T2.EmprNom, TM1.EmprCod, COALESCE( T3.FasMaxLin, 0) AS FasMaxLin FROM ((TXPFASPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(FasForLin) AS FasMaxLin, EmprCod, FasCod FROM TXPFASPR1 GROUP BY EmprCod, FasCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V613", "SELECT COALESCE( T1.FasMaxLin, 0) AS FasMaxLin FROM (SELECT MAX(FasForLin) AS FasMaxLin, EmprCod, FasCod FROM TXPFASPR1 GROUP BY EmprCod, FasCod ) T1 WHERE T1.EmprCod = ? AND T1.FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V614", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V615", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE ( FasCod > ?) and EmprCod = ? ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V616", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE ( FasCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, FasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00V617", "INSERT INTO TXPFASPRO(FasCod, FasUltForL, FasDsc, EmprCod, MaqCod, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasUltLin, FasForMul, FasConPla, FasEstamp, FasCC, FasCara, FasUltFor, FasProDsc, FasDsc2, FasValMtr, FasAcab, FasPreMC, FasProCtb, FasGral, FasFact, FasTExt, Hh_FUltL, FasDec2, FasTip, SecCodF, FasTpp, FasTog, FasFGp, FasUnpLt, FasOpeIns, FasPesInt, FasSigla, Tip_CodFas, FasObl, FasRbCost, FasTpCost, FasH2OReh, FasPreObl, FasPesExp, FasObsF, FasCrgNor, FasCrgOpt, FasOpeTip, FasGrupo, FasNorma, FasCarda, FasActiva, FasSalida, FastoVtx, FasMtsAnc, FasInsAlb, FasTubos, FasStki, FasCops, FasClsHdr, FasStkT, FasPrefj, FasFinHdr, FasDivTime) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T00V618", "UPDATE TXPFASPRO SET FasUltForL=?, FasDsc=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T00V619", "DELETE FROM TXPFASPRO  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new ForEachCursor("T00V621", "SELECT COALESCE( T1.FasMaxLin, 0) AS FasMaxLin FROM (SELECT MAX(FasForLin) AS FasMaxLin, EmprCod, FasCod FROM TXPFASPR1 GROUP BY EmprCod, FasCod ) T1 WHERE T1.EmprCod = ? AND T1.FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V622", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V623", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V624", "SELECT * FROM (SELECT EmprCod, Tas_num, Tas_lin FROM TXPCOSTA1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V625", "SELECT * FROM (SELECT EmprCod, PArtId, PAFOrd FROM TXPPedAFa WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V626", "SELECT * FROM (SELECT EmprCod, Regc_c1, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V627", "SELECT * FROM (SELECT EmprCod, AviNumero, FasCod FROM TXPAVI001 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V628", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V629", "SELECT * FROM (SELECT EmprCod, FasCod, Cod_par FROM TXPPARFSS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V630", "SELECT * FROM (SELECT EmprCod, FasCod, FasArtTip, FasArtInt, FasArtSeg FROM TXPArtPrd WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V631", "SELECT * FROM (SELECT EmprCod, NumOrd, FasCod FROM TXPFASMUS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V632", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND FasCodn = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V633", "SELECT * FROM (SELECT EmprCod, FasCod, Hh_FLin FROM TXPALAPFA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V634", "SELECT * FROM (SELECT EmprCod, RecPreCod FROM TXPPREREC WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V635", "SELECT * FROM (SELECT EmprCod, FasCod, CCTCod FROM TXPCCFas WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V636", "SELECT * FROM (SELECT EmprCod, FasCod, FasTerCod FROM TXPFASTER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V637", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V638", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V639", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V640", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V641", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V642", "SELECT * FROM (SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V643", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00V644", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00V645", "UPDATE TXPFASPRO SET FasUltForL=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new ForEachCursor("T00V646", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? ORDER BY EmprCod, FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V647", "SELECT T1.FasCod, T1.FasForLin, T2.ProForDsc, T2.ProForDsc2, T1.EmprCod, T1.ProForCod FROM (TXPFASPR1 T1 INNER JOIN TXPCPROFO T2 ON T2.EmprCod = T1.EmprCod AND T2.ProForCod = T1.ProForCod) WHERE T1.EmprCod = ? and T1.FasCod = ? and T1.FasForLin = ? ORDER BY T1.EmprCod, T1.FasCod, T1.FasForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V648", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V649", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V650", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V651", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V652", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (EmprCod = ?) AND (ProForCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V653", "SELECT ProForDsc, ProForDsc2 FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V654", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V655", "SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND FasCod = ? AND FasForLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V656", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00V657", "INSERT INTO TXPFASPR1(FasCod, FasForLin, EmprCod, ProForCod, FasForNPro, FasForTPau, FasForRb, FasClave) VALUES(?, ?, ?, ?, 0, 0, 0, ' ')", GX_NOMASK, "TXPFASPR1")
         ,new UpdateCursor("T00V658", "UPDATE TXPFASPR1 SET ProForCod=?  WHERE EmprCod = ? AND FasCod = ? AND FasForLin = ?", GX_NOMASK, "TXPFASPR1")
         ,new UpdateCursor("T00V659", "DELETE FROM TXPFASPR1  WHERE EmprCod = ? AND FasCod = ? AND FasForLin = ?", GX_NOMASK, "TXPFASPR1")
         ,new ForEachCursor("T00V660", "SELECT ProForDsc, ProForDsc2 FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V661", "SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasForLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V662", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc FROM TXPCPROFO WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc))) like '%' || UPPER(?))) WHERE rownum <= 20 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V663", "SELECT RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V664", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V665", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) AS ProFDsc, EmprCod, ProForCod FROM TXPCPROFO WHERE (RTRIM(LTRIM(ProForCod)) || '-' || RTRIM(LTRIM(ProForDsc)) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00V666", "SELECT ProForDsc, ProForDsc2 FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 28);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 11 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 12 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               stmt.setString(3, (String)parms[4], 28);
               stmt.setString(4, (String)parms[5], 3);
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
               stmt.setString(2, (String)parms[2], 28);
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[5], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
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
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 8);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 44 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 45 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 48 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 50 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 51 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setShort(2, ((Number) parms[2]).shortValue());
               stmt.setString(3, (String)parms[3], 3);
               stmt.setString(4, (String)parms[4], 6);
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 8);
               }
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
               return;
            case 57 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 59 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

