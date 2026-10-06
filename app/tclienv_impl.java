package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclienv_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel7"+"_"+"CLIENVNMT") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A723CliEnvTp = (short)(GXutil.lval( httpContext.GetPar( "CliEnvTp"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx7asaclienvnmt0J22( A396EmprCod, A723CliEnvTp) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A270CliEnvPrv = (short)(GXutil.lval( httpContext.GetPar( "CliEnvPrv"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A270CliEnvPrv) ;
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
            AV31EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
            AV32CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CliCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DOMICILIOS ENVIO CLIENTE", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCliCod_Internalname ;
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
      edtCliEnvTp_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvTp_Internalname, "Horizontalalignment", edtCliEnvTp_Horizontalalignment, !bGXsfl_32_Refreshing);
      edtCliEnvPrv_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrv_Internalname, "Horizontalalignment", edtCliEnvPrv_Horizontalalignment, !bGXsfl_32_Refreshing);
      A271CliEnvUli = (byte)(GXutil.lval( httpContext.GetPar( "CliEnvUli"))) ;
      n271CliEnvUli = false ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_level1_newrow( ) ;
      /* End function gxnrGridlevel_level1_newrow_invoke */
   }

   public tclienv_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclienv_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclienv_impl.class ));
   }

   public tclienv_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCliEnvAg = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", divTablemain_Height, "px", "TableMainTransaction", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCliNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIENV.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIENV.htm");
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
      ucCombo_clienvprv.setProperty("Caption", Combo_clienvprv_Caption);
      ucCombo_clienvprv.setProperty("Cls", Combo_clienvprv_Cls);
      ucCombo_clienvprv.setProperty("IsGridItem", Combo_clienvprv_Isgriditem);
      ucCombo_clienvprv.setProperty("EmptyItem", Combo_clienvprv_Emptyitem);
      ucCombo_clienvprv.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
      ucCombo_clienvprv.setProperty("DropDownOptionsData", AV36CliEnvPrv_Data);
      ucCombo_clienvprv.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clienvprv_Internalname, "COMBO_CLIENVPRVContainer");
      /* User Defined Control */
      ucCombo_clienvtp.setProperty("Caption", Combo_clienvtp_Caption);
      ucCombo_clienvtp.setProperty("Cls", Combo_clienvtp_Cls);
      ucCombo_clienvtp.setProperty("IsGridItem", Combo_clienvtp_Isgriditem);
      ucCombo_clienvtp.setProperty("DropDownOptionsTitleSettingsIcons", AV39DDO_TitleSettingsIcons);
      ucCombo_clienvtp.setProperty("DropDownOptionsData", AV38CliEnvTp_Data);
      ucCombo_clienvtp.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clienvtp_Internalname, "COMBO_CLIENVTPContainer");
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
         nBlankRcdCount22 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_22 = (short)(1) ;
            scanStart0J22( ) ;
            while ( RcdFound22 != 0 )
            {
               init_level_properties22( ) ;
               getByPrimaryKey0J22( ) ;
               addRow0J22( ) ;
               scanNext0J22( ) ;
            }
            scanEnd0J22( ) ;
            nBlankRcdCount22 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B271CliEnvUli = A271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
         standaloneNotModal0J22( ) ;
         standaloneModal0J22( ) ;
         sMode22 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow0J22( ) ;
            edtCliEnvLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVNOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvNm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVNM2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNm2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvDom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVDOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvDom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvDm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVDM2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvDm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvDm2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvPob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVPOB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPob_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvCp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVCP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvCp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvCp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvCp2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVCP2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvCp2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvPrv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVPRV_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrv_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvPrv_Horizontalalignment = httpContext.cgiGet( "CLIENVPRV_"+sGXsfl_32_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrv_Internalname, "Horizontalalignment", edtCliEnvPrv_Horizontalalignment, !bGXsfl_32_Refreshing);
            edtCliEnvPrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVPRN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliEnvAg.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVAG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliEnvAg.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliEnvAg.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVTP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvTp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvTp_Horizontalalignment = httpContext.cgiGet( "CLIENVTP_"+sGXsfl_32_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvTp_Internalname, "Horizontalalignment", edtCliEnvTp_Horizontalalignment, !bGXsfl_32_Refreshing);
            edtCliEnvNmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVNMT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNmt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvMail_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVMAIL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvMail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvMail_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliEnvFx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVFX_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliEnvFx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvFx_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_22 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0J22( ) ;
            }
            sendRow0J22( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A271CliEnvUli = B271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount22 = (short)(1) ;
         nRcdExists_22 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0J22( ) ;
            while ( RcdFound22 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3222( ) ;
               init_level_properties22( ) ;
               standaloneNotModal0J22( ) ;
               getByPrimaryKey0J22( ) ;
               standaloneModal0J22( ) ;
               addRow0J22( ) ;
               scanNext0J22( ) ;
            }
            scanEnd0J22( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode22 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_3222( ) ;
         initAll0J22( ) ;
         init_level_properties22( ) ;
         B271CliEnvUli = A271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
         nRcdExists_22 = (short)(0) ;
         nIsMod_22 = (short)(0) ;
         nRcdDeleted_22 = (short)(0) ;
         nBlankRcdCount22 = (short)(nBlankRcdUsr22+nBlankRcdCount22) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount22 > 0 )
         {
            standaloneNotModal0J22( ) ;
            standaloneModal0J22( ) ;
            addRow0J22( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCliEnvNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount22 = (short)(nBlankRcdCount22-1) ;
         }
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A271CliEnvUli = B271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
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
      e110J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV39DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIENVPRV_DATA"), AV36CliEnvPrv_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIENVTP_DATA"), AV38CliEnvTp_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            Z271CliEnvUli = (byte)(localUtil.ctol( httpContext.cgiGet( "Z271CliEnvUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A271CliEnvUli = (byte)(localUtil.ctol( httpContext.cgiGet( "Z271CliEnvUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n271CliEnvUli = false ;
            O271CliEnvUli = (byte)(localUtil.ctol( httpContext.cgiGet( "O271CliEnvUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV32CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A271CliEnvUli = (byte)(localUtil.ctol( httpContext.cgiGet( "CLIENVULI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            Combo_clienvprv_Objectcall = httpContext.cgiGet( "COMBO_CLIENVPRV_Objectcall") ;
            Combo_clienvprv_Class = httpContext.cgiGet( "COMBO_CLIENVPRV_Class") ;
            Combo_clienvprv_Icontype = httpContext.cgiGet( "COMBO_CLIENVPRV_Icontype") ;
            Combo_clienvprv_Icon = httpContext.cgiGet( "COMBO_CLIENVPRV_Icon") ;
            Combo_clienvprv_Caption = httpContext.cgiGet( "COMBO_CLIENVPRV_Caption") ;
            Combo_clienvprv_Tooltip = httpContext.cgiGet( "COMBO_CLIENVPRV_Tooltip") ;
            Combo_clienvprv_Cls = httpContext.cgiGet( "COMBO_CLIENVPRV_Cls") ;
            Combo_clienvprv_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIENVPRV_Selectedvalue_set") ;
            Combo_clienvprv_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLIENVPRV_Selectedvalue_get") ;
            Combo_clienvprv_Selectedtext_set = httpContext.cgiGet( "COMBO_CLIENVPRV_Selectedtext_set") ;
            Combo_clienvprv_Selectedtext_get = httpContext.cgiGet( "COMBO_CLIENVPRV_Selectedtext_get") ;
            Combo_clienvprv_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLIENVPRV_Gamoauthtoken") ;
            Combo_clienvprv_Ddointernalname = httpContext.cgiGet( "COMBO_CLIENVPRV_Ddointernalname") ;
            Combo_clienvprv_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLIENVPRV_Titlecontrolalign") ;
            Combo_clienvprv_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLIENVPRV_Dropdownoptionstype") ;
            Combo_clienvprv_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Enabled")) ;
            Combo_clienvprv_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Visible")) ;
            Combo_clienvprv_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLIENVPRV_Titlecontrolidtoreplace") ;
            Combo_clienvprv_Datalisttype = httpContext.cgiGet( "COMBO_CLIENVPRV_Datalisttype") ;
            Combo_clienvprv_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Allowmultipleselection")) ;
            Combo_clienvprv_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLIENVPRV_Datalistfixedvalues") ;
            Combo_clienvprv_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Isgriditem")) ;
            Combo_clienvprv_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Hasdescription")) ;
            Combo_clienvprv_Datalistproc = httpContext.cgiGet( "COMBO_CLIENVPRV_Datalistproc") ;
            Combo_clienvprv_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLIENVPRV_Datalistprocparametersprefix") ;
            Combo_clienvprv_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLIENVPRV_Remoteservicesparameters") ;
            Combo_clienvprv_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLIENVPRV_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clienvprv_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Includeonlyselectedoption")) ;
            Combo_clienvprv_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Includeselectalloption")) ;
            Combo_clienvprv_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Emptyitem")) ;
            Combo_clienvprv_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVPRV_Includeaddnewoption")) ;
            Combo_clienvprv_Htmltemplate = httpContext.cgiGet( "COMBO_CLIENVPRV_Htmltemplate") ;
            Combo_clienvprv_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLIENVPRV_Multiplevaluestype") ;
            Combo_clienvprv_Loadingdata = httpContext.cgiGet( "COMBO_CLIENVPRV_Loadingdata") ;
            Combo_clienvprv_Noresultsfound = httpContext.cgiGet( "COMBO_CLIENVPRV_Noresultsfound") ;
            Combo_clienvprv_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIENVPRV_Emptyitemtext") ;
            Combo_clienvprv_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLIENVPRV_Onlyselectedvalues") ;
            Combo_clienvprv_Selectalltext = httpContext.cgiGet( "COMBO_CLIENVPRV_Selectalltext") ;
            Combo_clienvprv_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLIENVPRV_Multiplevaluesseparator") ;
            Combo_clienvprv_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLIENVPRV_Addnewoptiontext") ;
            Combo_clienvtp_Objectcall = httpContext.cgiGet( "COMBO_CLIENVTP_Objectcall") ;
            Combo_clienvtp_Class = httpContext.cgiGet( "COMBO_CLIENVTP_Class") ;
            Combo_clienvtp_Icontype = httpContext.cgiGet( "COMBO_CLIENVTP_Icontype") ;
            Combo_clienvtp_Icon = httpContext.cgiGet( "COMBO_CLIENVTP_Icon") ;
            Combo_clienvtp_Caption = httpContext.cgiGet( "COMBO_CLIENVTP_Caption") ;
            Combo_clienvtp_Tooltip = httpContext.cgiGet( "COMBO_CLIENVTP_Tooltip") ;
            Combo_clienvtp_Cls = httpContext.cgiGet( "COMBO_CLIENVTP_Cls") ;
            Combo_clienvtp_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIENVTP_Selectedvalue_set") ;
            Combo_clienvtp_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLIENVTP_Selectedvalue_get") ;
            Combo_clienvtp_Selectedtext_set = httpContext.cgiGet( "COMBO_CLIENVTP_Selectedtext_set") ;
            Combo_clienvtp_Selectedtext_get = httpContext.cgiGet( "COMBO_CLIENVTP_Selectedtext_get") ;
            Combo_clienvtp_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLIENVTP_Gamoauthtoken") ;
            Combo_clienvtp_Ddointernalname = httpContext.cgiGet( "COMBO_CLIENVTP_Ddointernalname") ;
            Combo_clienvtp_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLIENVTP_Titlecontrolalign") ;
            Combo_clienvtp_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLIENVTP_Dropdownoptionstype") ;
            Combo_clienvtp_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Enabled")) ;
            Combo_clienvtp_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Visible")) ;
            Combo_clienvtp_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLIENVTP_Titlecontrolidtoreplace") ;
            Combo_clienvtp_Datalisttype = httpContext.cgiGet( "COMBO_CLIENVTP_Datalisttype") ;
            Combo_clienvtp_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Allowmultipleselection")) ;
            Combo_clienvtp_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLIENVTP_Datalistfixedvalues") ;
            Combo_clienvtp_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Isgriditem")) ;
            Combo_clienvtp_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Hasdescription")) ;
            Combo_clienvtp_Datalistproc = httpContext.cgiGet( "COMBO_CLIENVTP_Datalistproc") ;
            Combo_clienvtp_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLIENVTP_Datalistprocparametersprefix") ;
            Combo_clienvtp_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLIENVTP_Remoteservicesparameters") ;
            Combo_clienvtp_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLIENVTP_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clienvtp_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Includeonlyselectedoption")) ;
            Combo_clienvtp_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Includeselectalloption")) ;
            Combo_clienvtp_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Emptyitem")) ;
            Combo_clienvtp_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIENVTP_Includeaddnewoption")) ;
            Combo_clienvtp_Htmltemplate = httpContext.cgiGet( "COMBO_CLIENVTP_Htmltemplate") ;
            Combo_clienvtp_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLIENVTP_Multiplevaluestype") ;
            Combo_clienvtp_Loadingdata = httpContext.cgiGet( "COMBO_CLIENVTP_Loadingdata") ;
            Combo_clienvtp_Noresultsfound = httpContext.cgiGet( "COMBO_CLIENVTP_Noresultsfound") ;
            Combo_clienvtp_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIENVTP_Emptyitemtext") ;
            Combo_clienvtp_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLIENVTP_Onlyselectedvalues") ;
            Combo_clienvtp_Selectalltext = httpContext.cgiGet( "COMBO_CLIENVTP_Selectalltext") ;
            Combo_clienvtp_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLIENVTP_Multiplevaluesseparator") ;
            Combo_clienvtp_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLIENVTP_Addnewoptiontext") ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCLIENV");
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tclienv:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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
                  sMode21 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode21 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound21 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_0J0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
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
                        e110J2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120J2 ();
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
         e120J2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll0J21( ) ;
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
         disableAttributes0J21( ) ;
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

   public void confirm_0J0( )
   {
      beforeValidate0J21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0J21( ) ;
         }
         else
         {
            checkExtendedTable0J21( ) ;
            closeExtendedTableCursors0J21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_0J22( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode21 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_0J22( )
   {
      s271CliEnvUli = O271CliEnvUli ;
      n271CliEnvUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow0J22( ) ;
         if ( ( nRcdExists_22 != 0 ) || ( nIsMod_22 != 0 ) )
         {
            getKey0J22( ) ;
            if ( ( nRcdExists_22 == 0 ) && ( nRcdDeleted_22 == 0 ) )
            {
               if ( RcdFound22 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0J22( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0J22( ) ;
                     closeExtendedTableCursors0J22( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O271CliEnvUli = A271CliEnvUli ;
                     n271CliEnvUli = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound22 != 0 )
               {
                  if ( nRcdDeleted_22 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0J22( ) ;
                     load0J22( ) ;
                     beforeValidate0J22( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0J22( ) ;
                        O271CliEnvUli = A271CliEnvUli ;
                        n271CliEnvUli = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_22 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0J22( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0J22( ) ;
                           closeExtendedTableCursors0J22( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O271CliEnvUli = A271CliEnvUli ;
                           n271CliEnvUli = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_22 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtCliEnvLin_Internalname, GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliEnvNom_Internalname, GXutil.rtrim( A267CliEnvNom)) ;
         httpContext.changePostValue( edtCliEnvNm2_Internalname, GXutil.rtrim( A5531CliEnvNm2)) ;
         httpContext.changePostValue( edtCliEnvDom_Internalname, GXutil.rtrim( A265CliEnvDom)) ;
         httpContext.changePostValue( edtCliEnvDm2_Internalname, GXutil.rtrim( A5530CliEnvDm2)) ;
         httpContext.changePostValue( edtCliEnvPob_Internalname, GXutil.rtrim( A268CliEnvPob)) ;
         httpContext.changePostValue( edtCliEnvCp_Internalname, GXutil.rtrim( A264CliEnvCp)) ;
         httpContext.changePostValue( edtCliEnvCp2_Internalname, GXutil.rtrim( A10775CliEnvCp2)) ;
         httpContext.changePostValue( edtCliEnvPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliEnvPrn_Internalname, GXutil.rtrim( A269CliEnvPrn)) ;
         httpContext.changePostValue( cmbCliEnvAg.getInternalname(), GXutil.rtrim( A689CliEnvAg)) ;
         httpContext.changePostValue( edtCliEnvTp_Internalname, GXutil.ltrim( localUtil.ntoc( A723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliEnvNmt_Internalname, GXutil.rtrim( A693CliEnvNmt)) ;
         httpContext.changePostValue( edtCliEnvMail_Internalname, GXutil.rtrim( A10051CliEnvMail)) ;
         httpContext.changePostValue( edtCliEnvFx_Internalname, GXutil.rtrim( A10052CliEnvFx)) ;
         httpContext.changePostValue( "ZT_"+"Z266CliEnvLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z689CliEnvAg_"+sGXsfl_32_idx, GXutil.rtrim( Z689CliEnvAg)) ;
         httpContext.changePostValue( "ZT_"+"Z267CliEnvNom_"+sGXsfl_32_idx, GXutil.rtrim( Z267CliEnvNom)) ;
         httpContext.changePostValue( "ZT_"+"Z5531CliEnvNm2_"+sGXsfl_32_idx, GXutil.rtrim( Z5531CliEnvNm2)) ;
         httpContext.changePostValue( "ZT_"+"Z265CliEnvDom_"+sGXsfl_32_idx, GXutil.rtrim( Z265CliEnvDom)) ;
         httpContext.changePostValue( "ZT_"+"Z5530CliEnvDm2_"+sGXsfl_32_idx, GXutil.rtrim( Z5530CliEnvDm2)) ;
         httpContext.changePostValue( "ZT_"+"Z268CliEnvPob_"+sGXsfl_32_idx, GXutil.rtrim( Z268CliEnvPob)) ;
         httpContext.changePostValue( "ZT_"+"Z264CliEnvCp_"+sGXsfl_32_idx, GXutil.rtrim( Z264CliEnvCp)) ;
         httpContext.changePostValue( "ZT_"+"Z10775CliEnvCp2_"+sGXsfl_32_idx, GXutil.rtrim( Z10775CliEnvCp2)) ;
         httpContext.changePostValue( "ZT_"+"Z723CliEnvTp_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10051CliEnvMail_"+sGXsfl_32_idx, GXutil.rtrim( Z10051CliEnvMail)) ;
         httpContext.changePostValue( "ZT_"+"Z10052CliEnvFx_"+sGXsfl_32_idx, GXutil.rtrim( Z10052CliEnvFx)) ;
         httpContext.changePostValue( "ZT_"+"Z270CliEnvPrv_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_22_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_22_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_22_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_22 != 0 )
         {
            httpContext.changePostValue( "CLIENVLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVNM2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVDOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVDM2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVPOB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVCP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVCP2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVPRV_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVPRV_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliEnvPrv_Horizontalalignment)) ;
            httpContext.changePostValue( "CLIENVPRN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVAG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliEnvAg.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVTP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVTP_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliEnvTp_Horizontalalignment)) ;
            httpContext.changePostValue( "CLIENVNMT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVMAIL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvMail_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVFX_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvFx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O271CliEnvUli = s271CliEnvUli ;
      n271CliEnvUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0J0( )
   {
   }

   public void e110J2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV25Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tclienv_impl.this.GXt_char1 = GXv_char2[0] ;
      AV25Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclienv_impl.this.A396EmprCod = GXv_char2[0] ;
      tclienv_impl.this.AV26EmprNom = GXv_char3[0] ;
      tclienv_impl.this.AV22UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      GXt_char1 = AV25Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tclienv_impl.this.GXt_char1 = GXv_char4[0] ;
      AV25Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      GXv_char4[0] = AV31EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char2[0] = AV22UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char4, GXv_char3, GXv_char2) ;
      tclienv_impl.this.AV31EmprCod = GXv_char4[0] ;
      tclienv_impl.this.AV26EmprNom = GXv_char3[0] ;
      tclienv_impl.this.AV22UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV22UsurCod", AV22UsurCod);
      GXv_SdtWWPContext5[0] = AV33WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV33WWPContext = GXv_SdtWWPContext5[0] ;
      divTablemain_Height = 800 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablemain_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablemain_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV39DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV39DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_clienvtp_Titlecontrolidtoreplace = edtCliEnvTp_Internalname ;
      ucCombo_clienvtp.sendProperty(context, "", false, Combo_clienvtp_Internalname, "TitleControlIdToReplace", Combo_clienvtp_Titlecontrolidtoreplace);
      edtCliEnvTp_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvTp_Internalname, "Horizontalalignment", edtCliEnvTp_Horizontalalignment, !bGXsfl_32_Refreshing);
      Combo_clienvprv_Titlecontrolidtoreplace = edtCliEnvPrv_Internalname ;
      ucCombo_clienvprv.sendProperty(context, "", false, Combo_clienvprv_Internalname, "TitleControlIdToReplace", Combo_clienvprv_Titlecontrolidtoreplace);
      edtCliEnvPrv_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrv_Internalname, "Horizontalalignment", edtCliEnvPrv_Horizontalalignment, !bGXsfl_32_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOCLIENVPRV' */
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
      /* Execute user subroutine: 'LOADCOMBOCLIENVTP' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV34TrnContext.fromxml(AV35WebSession.getValue("TrnContext"), null, null);
   }

   public void e120J2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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

   public void S122( )
   {
      /* 'LOADCOMBOCLIENVTP' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV38CliEnvTp_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tclienvloaddvcombo(remoteHandle, context).execute( "CliEnvTp", Gx_mode, AV31EmprCod, AV32CliCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tclienv_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV38CliEnvTp_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLIENVPRV' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV36CliEnvPrv_Data ;
      GXv_char4[0] = AV37ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tclienvloaddvcombo(remoteHandle, context).execute( "CliEnvPrv", Gx_mode, AV31EmprCod, AV32CliCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tclienv_impl.this.AV37ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV36CliEnvPrv_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void zm0J21( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T000J6_A279CliNom[0] ;
            Z271CliEnvUli = T000J6_A271CliEnvUli[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z271CliEnvUli = A271CliEnvUli ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z271CliEnvUli = A271CliEnvUli ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV31EmprCod)==0) )
      {
         A396EmprCod = AV31EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T000J7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T000J7_A407EmprNom[0] ;
      n407EmprNom = T000J7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV32CliCod) )
      {
         A252CliCod = AV32CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV32CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV32CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
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

   public void load0J21( )
   {
      /* Using cursor T000J8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A279CliNom = T000J8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A271CliEnvUli = T000J8_A271CliEnvUli[0] ;
         n271CliEnvUli = T000J8_n271CliEnvUli[0] ;
         A407EmprNom = T000J8_A407EmprNom[0] ;
         n407EmprNom = T000J8_n407EmprNom[0] ;
         zm0J21( -14) ;
      }
      pr_default.close(6);
      onLoadActions0J21( ) ;
   }

   public void onLoadActions0J21( )
   {
   }

   public void checkExtendedTable0J21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors0J21( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0J21( )
   {
      /* Using cursor T000J9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000J6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T000J6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0J21( 14) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T000J6_A252CliCod[0] ;
         n252CliCod = T000J6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T000J6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A271CliEnvUli = T000J6_A271CliEnvUli[0] ;
         n271CliEnvUli = T000J6_n271CliEnvUli[0] ;
         O271CliEnvUli = A271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0J21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey0J21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey0J21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0J21( ) ;
      if ( RcdFound21 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T000J10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000J10_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T000J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000J10_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T000J10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T000J10_A252CliCod[0] ;
            n252CliCod = T000J10_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T000J11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000J11_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T000J11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000J11_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T000J11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T000J11_A252CliCod[0] ;
            n252CliCod = T000J11_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0J21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A271CliEnvUli = O271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0J21( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound21 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               A252CliCod = Z252CliCod ;
               n252CliCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A271CliEnvUli = O271CliEnvUli ;
               n271CliEnvUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A271CliEnvUli = O271CliEnvUli ;
               n271CliEnvUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
               update0J21( ) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               /* Insert record */
               A271CliEnvUli = O271CliEnvUli ;
               n271CliEnvUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0J21( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  A271CliEnvUli = O271CliEnvUli ;
                  n271CliEnvUli = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
                  GX_FocusControl = edtCliCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0J21( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
      {
         A252CliCod = Z252CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A271CliEnvUli = O271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0J21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000J5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z279CliNom, T000J5_A279CliNom[0]) != 0 ) || ( Z271CliEnvUli != T000J5_A271CliEnvUli[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T000J5_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T000J5_A279CliNom[0]);
            }
            if ( Z271CliEnvUli != T000J5_A271CliEnvUli[0] )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvUli");
               GXutil.writeLogRaw("Old: ",Z271CliEnvUli);
               GXutil.writeLogRaw("Current: ",T000J5_A271CliEnvUli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0J21( )
   {
      beforeValidate0J21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0J21( 0) ;
         checkOptimisticConcurrency0J21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0J21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0J21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000J12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n271CliEnvUli), Byte.valueOf(A271CliEnvUli), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
                        processLevel0J21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption0J0( ) ;
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
            load0J21( ) ;
         }
         endLevel0J21( ) ;
      }
      closeExtendedTableCursors0J21( ) ;
   }

   public void update0J21( )
   {
      beforeValidate0J21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0J21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0J21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0J21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000J13 */
                  pr_default.execute(11, new Object[] {A279CliNom, Boolean.valueOf(n271CliEnvUli), Byte.valueOf(A271CliEnvUli), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0J21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0J21( ) ;
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
         endLevel0J21( ) ;
      }
      closeExtendedTableCursors0J21( ) ;
   }

   public void deferredUpdate0J21( )
   {
   }

   public void delete( )
   {
      beforeValidate0J21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0J21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0J21( ) ;
         afterConfirm0J21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0J21( ) ;
            if ( AnyError == 0 )
            {
               A271CliEnvUli = O271CliEnvUli ;
               n271CliEnvUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
               scanStart0J22( ) ;
               while ( RcdFound22 != 0 )
               {
                  getByPrimaryKey0J22( ) ;
                  delete0J22( ) ;
                  scanNext0J22( ) ;
                  O271CliEnvUli = A271CliEnvUli ;
                  n271CliEnvUli = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
               }
               scanEnd0J22( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000J14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0J21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0J21( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000J15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000J16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000J17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T000J18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T000J19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T000J20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T000J21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T000J22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T000J23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T000J24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T000J25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T000J26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T000J27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T000J28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T000J29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T000J30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T000J31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T000J32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T000J33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T000J34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T000J35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T000J36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T000J37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T000J38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T000J39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T000J40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T000J41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T000J42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T000J43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T000J44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T000J45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T000J46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T000J47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T000J48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T000J49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T000J50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T000J51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T000J52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T000J53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T000J54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T000J55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T000J56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T000J57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T000J58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T000J59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T000J60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T000J61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T000J62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T000J63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T000J64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T000J65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T000J66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T000J67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T000J68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T000J69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T000J70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T000J71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T000J72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T000J73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T000J74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T000J75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T000J76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
      }
   }

   public void processNestedLevel0J22( )
   {
      s271CliEnvUli = O271CliEnvUli ;
      n271CliEnvUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow0J22( ) ;
         if ( ( nRcdExists_22 != 0 ) || ( nIsMod_22 != 0 ) )
         {
            standaloneNotModal0J22( ) ;
            getKey0J22( ) ;
            if ( ( nRcdExists_22 == 0 ) && ( nRcdDeleted_22 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0J22( ) ;
            }
            else
            {
               if ( RcdFound22 != 0 )
               {
                  if ( ( nRcdDeleted_22 != 0 ) && ( nRcdExists_22 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0J22( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_22 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0J22( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_22 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CLICOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCliCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O271CliEnvUli = A271CliEnvUli ;
            n271CliEnvUli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
         }
         httpContext.changePostValue( edtCliEnvLin_Internalname, GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliEnvNom_Internalname, GXutil.rtrim( A267CliEnvNom)) ;
         httpContext.changePostValue( edtCliEnvNm2_Internalname, GXutil.rtrim( A5531CliEnvNm2)) ;
         httpContext.changePostValue( edtCliEnvDom_Internalname, GXutil.rtrim( A265CliEnvDom)) ;
         httpContext.changePostValue( edtCliEnvDm2_Internalname, GXutil.rtrim( A5530CliEnvDm2)) ;
         httpContext.changePostValue( edtCliEnvPob_Internalname, GXutil.rtrim( A268CliEnvPob)) ;
         httpContext.changePostValue( edtCliEnvCp_Internalname, GXutil.rtrim( A264CliEnvCp)) ;
         httpContext.changePostValue( edtCliEnvCp2_Internalname, GXutil.rtrim( A10775CliEnvCp2)) ;
         httpContext.changePostValue( edtCliEnvPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliEnvPrn_Internalname, GXutil.rtrim( A269CliEnvPrn)) ;
         httpContext.changePostValue( cmbCliEnvAg.getInternalname(), GXutil.rtrim( A689CliEnvAg)) ;
         httpContext.changePostValue( edtCliEnvTp_Internalname, GXutil.ltrim( localUtil.ntoc( A723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliEnvNmt_Internalname, GXutil.rtrim( A693CliEnvNmt)) ;
         httpContext.changePostValue( edtCliEnvMail_Internalname, GXutil.rtrim( A10051CliEnvMail)) ;
         httpContext.changePostValue( edtCliEnvFx_Internalname, GXutil.rtrim( A10052CliEnvFx)) ;
         httpContext.changePostValue( "ZT_"+"Z266CliEnvLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z689CliEnvAg_"+sGXsfl_32_idx, GXutil.rtrim( Z689CliEnvAg)) ;
         httpContext.changePostValue( "ZT_"+"Z267CliEnvNom_"+sGXsfl_32_idx, GXutil.rtrim( Z267CliEnvNom)) ;
         httpContext.changePostValue( "ZT_"+"Z5531CliEnvNm2_"+sGXsfl_32_idx, GXutil.rtrim( Z5531CliEnvNm2)) ;
         httpContext.changePostValue( "ZT_"+"Z265CliEnvDom_"+sGXsfl_32_idx, GXutil.rtrim( Z265CliEnvDom)) ;
         httpContext.changePostValue( "ZT_"+"Z5530CliEnvDm2_"+sGXsfl_32_idx, GXutil.rtrim( Z5530CliEnvDm2)) ;
         httpContext.changePostValue( "ZT_"+"Z268CliEnvPob_"+sGXsfl_32_idx, GXutil.rtrim( Z268CliEnvPob)) ;
         httpContext.changePostValue( "ZT_"+"Z264CliEnvCp_"+sGXsfl_32_idx, GXutil.rtrim( Z264CliEnvCp)) ;
         httpContext.changePostValue( "ZT_"+"Z10775CliEnvCp2_"+sGXsfl_32_idx, GXutil.rtrim( Z10775CliEnvCp2)) ;
         httpContext.changePostValue( "ZT_"+"Z723CliEnvTp_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10051CliEnvMail_"+sGXsfl_32_idx, GXutil.rtrim( Z10051CliEnvMail)) ;
         httpContext.changePostValue( "ZT_"+"Z10052CliEnvFx_"+sGXsfl_32_idx, GXutil.rtrim( Z10052CliEnvFx)) ;
         httpContext.changePostValue( "ZT_"+"Z270CliEnvPrv_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_22_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_22_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_22_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_22 != 0 )
         {
            httpContext.changePostValue( "CLIENVLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVNM2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVDOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVDM2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDm2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVPOB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVCP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVCP2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp2_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVPRV_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVPRV_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliEnvPrv_Horizontalalignment)) ;
            httpContext.changePostValue( "CLIENVPRN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVAG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliEnvAg.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVTP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvTp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVTP_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliEnvTp_Horizontalalignment)) ;
            httpContext.changePostValue( "CLIENVNMT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNmt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVMAIL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvMail_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIENVFX_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvFx_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0J22( ) ;
      if ( AnyError != 0 )
      {
         O271CliEnvUli = s271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      }
      nRcdExists_22 = (short)(0) ;
      nIsMod_22 = (short)(0) ;
      nRcdDeleted_22 = (short)(0) ;
   }

   public void processLevel0J21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel0J22( ) ;
      if ( AnyError != 0 )
      {
         O271CliEnvUli = s271CliEnvUli ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T000J77 */
      pr_default.execute(75, new Object[] {Boolean.valueOf(n271CliEnvUli), Byte.valueOf(A271CliEnvUli), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
   }

   public void endLevel0J21( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete0J21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclienv");
         if ( AnyError == 0 )
         {
            confirmValues0J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclienv");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0J21( )
   {
      /* Scan By routine */
      /* Using cursor T000J78 */
      pr_default.execute(76, new Object[] {A396EmprCod});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T000J78_A252CliCod[0] ;
         n252CliCod = T000J78_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0J21( )
   {
      /* Scan next routine */
      pr_default.readNext(76);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T000J78_A252CliCod[0] ;
         n252CliCod = T000J78_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd0J21( )
   {
      pr_default.close(76);
   }

   public void afterConfirm0J21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0J21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0J21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0J21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0J21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0J21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0J21( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm0J22( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z689CliEnvAg = T000J3_A689CliEnvAg[0] ;
            Z267CliEnvNom = T000J3_A267CliEnvNom[0] ;
            Z5531CliEnvNm2 = T000J3_A5531CliEnvNm2[0] ;
            Z265CliEnvDom = T000J3_A265CliEnvDom[0] ;
            Z5530CliEnvDm2 = T000J3_A5530CliEnvDm2[0] ;
            Z268CliEnvPob = T000J3_A268CliEnvPob[0] ;
            Z264CliEnvCp = T000J3_A264CliEnvCp[0] ;
            Z10775CliEnvCp2 = T000J3_A10775CliEnvCp2[0] ;
            Z723CliEnvTp = T000J3_A723CliEnvTp[0] ;
            Z10051CliEnvMail = T000J3_A10051CliEnvMail[0] ;
            Z10052CliEnvFx = T000J3_A10052CliEnvFx[0] ;
            Z270CliEnvPrv = T000J3_A270CliEnvPrv[0] ;
         }
         else
         {
            Z689CliEnvAg = A689CliEnvAg ;
            Z267CliEnvNom = A267CliEnvNom ;
            Z5531CliEnvNm2 = A5531CliEnvNm2 ;
            Z265CliEnvDom = A265CliEnvDom ;
            Z5530CliEnvDm2 = A5530CliEnvDm2 ;
            Z268CliEnvPob = A268CliEnvPob ;
            Z264CliEnvCp = A264CliEnvCp ;
            Z10775CliEnvCp2 = A10775CliEnvCp2 ;
            Z723CliEnvTp = A723CliEnvTp ;
            Z10051CliEnvMail = A10051CliEnvMail ;
            Z10052CliEnvFx = A10052CliEnvFx ;
            Z270CliEnvPrv = A270CliEnvPrv ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z252CliCod = A252CliCod ;
         Z266CliEnvLin = A266CliEnvLin ;
         Z689CliEnvAg = A689CliEnvAg ;
         Z267CliEnvNom = A267CliEnvNom ;
         Z5531CliEnvNm2 = A5531CliEnvNm2 ;
         Z265CliEnvDom = A265CliEnvDom ;
         Z5530CliEnvDm2 = A5530CliEnvDm2 ;
         Z268CliEnvPob = A268CliEnvPob ;
         Z264CliEnvCp = A264CliEnvCp ;
         Z10775CliEnvCp2 = A10775CliEnvCp2 ;
         Z723CliEnvTp = A723CliEnvTp ;
         Z10051CliEnvMail = A10051CliEnvMail ;
         Z10052CliEnvFx = A10052CliEnvFx ;
         Z270CliEnvPrv = A270CliEnvPrv ;
         Z396EmprCod = A396EmprCod ;
         Z269CliEnvPrn = A269CliEnvPrn ;
      }
   }

   public void standaloneNotModal0J22( )
   {
      edtCliEnvLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvPrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvNmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNmt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModal0J22( )
   {
      if ( isIns( )  )
      {
         A271CliEnvUli = (byte)(O271CliEnvUli+1) ;
         n271CliEnvUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A266CliEnvLin = A271CliEnvUli ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A689CliEnvAg)==0) && ( Gx_BScreen == 0 ) )
      {
         A689CliEnvAg = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
   }

   public void load0J22( )
   {
      /* Using cursor T000J79 */
      pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(77) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A689CliEnvAg = T000J79_A689CliEnvAg[0] ;
         A267CliEnvNom = T000J79_A267CliEnvNom[0] ;
         A5531CliEnvNm2 = T000J79_A5531CliEnvNm2[0] ;
         A265CliEnvDom = T000J79_A265CliEnvDom[0] ;
         A5530CliEnvDm2 = T000J79_A5530CliEnvDm2[0] ;
         A268CliEnvPob = T000J79_A268CliEnvPob[0] ;
         A264CliEnvCp = T000J79_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = T000J79_A10775CliEnvCp2[0] ;
         A269CliEnvPrn = T000J79_A269CliEnvPrn[0] ;
         n269CliEnvPrn = T000J79_n269CliEnvPrn[0] ;
         A723CliEnvTp = T000J79_A723CliEnvTp[0] ;
         A10051CliEnvMail = T000J79_A10051CliEnvMail[0] ;
         A10052CliEnvFx = T000J79_A10052CliEnvFx[0] ;
         A270CliEnvPrv = T000J79_A270CliEnvPrv[0] ;
         zm0J22( -16) ;
      }
      pr_default.close(77);
      onLoadActions0J22( ) ;
   }

   public void onLoadActions0J22( )
   {
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      tclienv_impl.this.A396EmprCod = GXv_char4[0] ;
      tclienv_impl.this.A723CliEnvTp = GXv_int10[0] ;
      tclienv_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A693CliEnvNmt = GXt_char1 ;
   }

   public void checkExtendedTable0J22( )
   {
      nIsDirty_22 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0J22( ) ;
      nIsDirty_22 = (short)(1) ;
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      tclienv_impl.this.A396EmprCod = GXv_char4[0] ;
      tclienv_impl.this.A723CliEnvTp = GXv_int10[0] ;
      tclienv_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A693CliEnvNmt = GXt_char1 ;
      /* Using cursor T000J4 */
      pr_default.execute(2, new Object[] {Short.valueOf(A270CliEnvPrv)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLIENVPRV_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliEnv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliEnvPrv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A269CliEnvPrn = T000J4_A269CliEnvPrn[0] ;
      n269CliEnvPrn = T000J4_n269CliEnvPrn[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0J22( )
   {
      pr_default.close(2);
   }

   public void enableDisable0J22( )
   {
   }

   public void gxload_17( short A270CliEnvPrv )
   {
      /* Using cursor T000J80 */
      pr_default.execute(78, new Object[] {Short.valueOf(A270CliEnvPrv)});
      if ( (pr_default.getStatus(78) == 101) )
      {
         GXCCtl = "CLIENVPRV_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliEnv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliEnvPrv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A269CliEnvPrn = T000J80_A269CliEnvPrn[0] ;
      n269CliEnvPrn = T000J80_n269CliEnvPrn[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A269CliEnvPrn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(78) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(78);
   }

   public void getKey0J22( )
   {
      /* Using cursor T000J81 */
      pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(79) != 101) )
      {
         RcdFound22 = (short)(1) ;
      }
      else
      {
         RcdFound22 = (short)(0) ;
      }
      pr_default.close(79);
   }

   public void getByPrimaryKey0J22( )
   {
      /* Using cursor T000J3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T000J3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0J22( 16) ;
         RcdFound22 = (short)(1) ;
         initializeNonKey0J22( ) ;
         A266CliEnvLin = T000J3_A266CliEnvLin[0] ;
         A689CliEnvAg = T000J3_A689CliEnvAg[0] ;
         A267CliEnvNom = T000J3_A267CliEnvNom[0] ;
         A5531CliEnvNm2 = T000J3_A5531CliEnvNm2[0] ;
         A265CliEnvDom = T000J3_A265CliEnvDom[0] ;
         A5530CliEnvDm2 = T000J3_A5530CliEnvDm2[0] ;
         A268CliEnvPob = T000J3_A268CliEnvPob[0] ;
         A264CliEnvCp = T000J3_A264CliEnvCp[0] ;
         A10775CliEnvCp2 = T000J3_A10775CliEnvCp2[0] ;
         A723CliEnvTp = T000J3_A723CliEnvTp[0] ;
         A10051CliEnvMail = T000J3_A10051CliEnvMail[0] ;
         A10052CliEnvFx = T000J3_A10052CliEnvFx[0] ;
         A270CliEnvPrv = T000J3_A270CliEnvPrv[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z266CliEnvLin = A266CliEnvLin ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0J22( ) ;
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound22 = (short)(0) ;
         initializeNonKey0J22( ) ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0J22( ) ;
         Gx_mode = sMode22 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0J22( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0J22( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000J2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z689CliEnvAg, T000J2_A689CliEnvAg[0]) != 0 ) || ( GXutil.strcmp(Z267CliEnvNom, T000J2_A267CliEnvNom[0]) != 0 ) || ( GXutil.strcmp(Z5531CliEnvNm2, T000J2_A5531CliEnvNm2[0]) != 0 ) || ( GXutil.strcmp(Z265CliEnvDom, T000J2_A265CliEnvDom[0]) != 0 ) || ( GXutil.strcmp(Z5530CliEnvDm2, T000J2_A5530CliEnvDm2[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z268CliEnvPob, T000J2_A268CliEnvPob[0]) != 0 ) || ( GXutil.strcmp(Z264CliEnvCp, T000J2_A264CliEnvCp[0]) != 0 ) || ( GXutil.strcmp(Z10775CliEnvCp2, T000J2_A10775CliEnvCp2[0]) != 0 ) || ( Z723CliEnvTp != T000J2_A723CliEnvTp[0] ) || ( GXutil.strcmp(Z10051CliEnvMail, T000J2_A10051CliEnvMail[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10052CliEnvFx, T000J2_A10052CliEnvFx[0]) != 0 ) || ( Z270CliEnvPrv != T000J2_A270CliEnvPrv[0] ) )
         {
            if ( GXutil.strcmp(Z689CliEnvAg, T000J2_A689CliEnvAg[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvAg");
               GXutil.writeLogRaw("Old: ",Z689CliEnvAg);
               GXutil.writeLogRaw("Current: ",T000J2_A689CliEnvAg[0]);
            }
            if ( GXutil.strcmp(Z267CliEnvNom, T000J2_A267CliEnvNom[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvNom");
               GXutil.writeLogRaw("Old: ",Z267CliEnvNom);
               GXutil.writeLogRaw("Current: ",T000J2_A267CliEnvNom[0]);
            }
            if ( GXutil.strcmp(Z5531CliEnvNm2, T000J2_A5531CliEnvNm2[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvNm2");
               GXutil.writeLogRaw("Old: ",Z5531CliEnvNm2);
               GXutil.writeLogRaw("Current: ",T000J2_A5531CliEnvNm2[0]);
            }
            if ( GXutil.strcmp(Z265CliEnvDom, T000J2_A265CliEnvDom[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvDom");
               GXutil.writeLogRaw("Old: ",Z265CliEnvDom);
               GXutil.writeLogRaw("Current: ",T000J2_A265CliEnvDom[0]);
            }
            if ( GXutil.strcmp(Z5530CliEnvDm2, T000J2_A5530CliEnvDm2[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvDm2");
               GXutil.writeLogRaw("Old: ",Z5530CliEnvDm2);
               GXutil.writeLogRaw("Current: ",T000J2_A5530CliEnvDm2[0]);
            }
            if ( GXutil.strcmp(Z268CliEnvPob, T000J2_A268CliEnvPob[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvPob");
               GXutil.writeLogRaw("Old: ",Z268CliEnvPob);
               GXutil.writeLogRaw("Current: ",T000J2_A268CliEnvPob[0]);
            }
            if ( GXutil.strcmp(Z264CliEnvCp, T000J2_A264CliEnvCp[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvCp");
               GXutil.writeLogRaw("Old: ",Z264CliEnvCp);
               GXutil.writeLogRaw("Current: ",T000J2_A264CliEnvCp[0]);
            }
            if ( GXutil.strcmp(Z10775CliEnvCp2, T000J2_A10775CliEnvCp2[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvCp2");
               GXutil.writeLogRaw("Old: ",Z10775CliEnvCp2);
               GXutil.writeLogRaw("Current: ",T000J2_A10775CliEnvCp2[0]);
            }
            if ( Z723CliEnvTp != T000J2_A723CliEnvTp[0] )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvTp");
               GXutil.writeLogRaw("Old: ",Z723CliEnvTp);
               GXutil.writeLogRaw("Current: ",T000J2_A723CliEnvTp[0]);
            }
            if ( GXutil.strcmp(Z10051CliEnvMail, T000J2_A10051CliEnvMail[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvMail");
               GXutil.writeLogRaw("Old: ",Z10051CliEnvMail);
               GXutil.writeLogRaw("Current: ",T000J2_A10051CliEnvMail[0]);
            }
            if ( GXutil.strcmp(Z10052CliEnvFx, T000J2_A10052CliEnvFx[0]) != 0 )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvFx");
               GXutil.writeLogRaw("Old: ",Z10052CliEnvFx);
               GXutil.writeLogRaw("Current: ",T000J2_A10052CliEnvFx[0]);
            }
            if ( Z270CliEnvPrv != T000J2_A270CliEnvPrv[0] )
            {
               GXutil.writeLogln("tclienv:[seudo value changed for attri]"+"CliEnvPrv");
               GXutil.writeLogRaw("Old: ",Z270CliEnvPrv);
               GXutil.writeLogRaw("Current: ",T000J2_A270CliEnvPrv[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0J22( )
   {
      beforeValidate0J22( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J22( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0J22( 0) ;
         checkOptimisticConcurrency0J22( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0J22( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0J22( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000J82 */
                  pr_default.execute(80, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin), A689CliEnvAg, A267CliEnvNom, A5531CliEnvNm2, A265CliEnvDom, A5530CliEnvDm2, A268CliEnvPob, A264CliEnvCp, A10775CliEnvCp2, Short.valueOf(A723CliEnvTp), A10051CliEnvMail, A10052CliEnvFx, Short.valueOf(A270CliEnvPrv), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
                  if ( (pr_default.getStatus(80) == 1) )
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
            load0J22( ) ;
         }
         endLevel0J22( ) ;
      }
      closeExtendedTableCursors0J22( ) ;
   }

   public void update0J22( )
   {
      beforeValidate0J22( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J22( ) ;
      }
      if ( ( nIsMod_22 != 0 ) || ( nIsDirty_22 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0J22( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0J22( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0J22( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T000J83 */
                     pr_default.execute(81, new Object[] {A689CliEnvAg, A267CliEnvNom, A5531CliEnvNm2, A265CliEnvDom, A5530CliEnvDm2, A268CliEnvPob, A264CliEnvCp, A10775CliEnvCp2, Short.valueOf(A723CliEnvTp), A10051CliEnvMail, A10052CliEnvFx, Short.valueOf(A270CliEnvPrv), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
                     if ( (pr_default.getStatus(81) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENV"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0J22( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0J22( ) ;
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
            endLevel0J22( ) ;
         }
      }
      closeExtendedTableCursors0J22( ) ;
   }

   public void deferredUpdate0J22( )
   {
   }

   public void delete0J22( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0J22( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0J22( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0J22( ) ;
         afterConfirm0J22( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0J22( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000J84 */
               pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENV");
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
      sMode22 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0J22( ) ;
      Gx_mode = sMode22 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0J22( )
   {
      standaloneModal0J22( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000J85 */
         pr_default.execute(83, new Object[] {Short.valueOf(A270CliEnvPrv)});
         A269CliEnvPrn = T000J85_A269CliEnvPrn[0] ;
         n269CliEnvPrn = T000J85_n269CliEnvPrn[0] ;
         pr_default.close(83);
         GXt_char1 = A693CliEnvNmt ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A723CliEnvTp ;
         GXv_char3[0] = GXt_char1 ;
         new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         tclienv_impl.this.A396EmprCod = GXv_char4[0] ;
         tclienv_impl.this.A723CliEnvTp = GXv_int10[0] ;
         tclienv_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A693CliEnvNmt = GXt_char1 ;
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000J86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
         /* Using cursor T000J87 */
         pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A266CliEnvLin)});
         if ( (pr_default.getStatus(85) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVGEH", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(85);
      }
   }

   public void endLevel0J22( )
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

   public void scanStart0J22( )
   {
      /* Scan By routine */
      /* Using cursor T000J88 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A266CliEnvLin = T000J88_A266CliEnvLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0J22( )
   {
      /* Scan next routine */
      pr_default.readNext(86);
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A266CliEnvLin = T000J88_A266CliEnvLin[0] ;
      }
   }

   public void scanEnd0J22( )
   {
      pr_default.close(86);
   }

   public void afterConfirm0J22( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0J22( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0J22( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0J22( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0J22( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0J22( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0J22( )
   {
      edtCliEnvLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvNm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNm2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvDom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvDm2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvDm2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvDm2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPob_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvCp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvCp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvCp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvCp2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvCp2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvCp2_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrv_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvPrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliEnvAg.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliEnvAg.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliEnvAg.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvTp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvTp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvTp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvNmt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNmt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvMail_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvMail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvMail_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvFx_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvFx_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvFx_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes0J22( )
   {
   }

   public void send_integrity_lvl_hashes0J21( )
   {
   }

   public void subsflControlProps_3222( )
   {
      edtCliEnvLin_Internalname = "CLIENVLIN_"+sGXsfl_32_idx ;
      edtCliEnvNom_Internalname = "CLIENVNOM_"+sGXsfl_32_idx ;
      edtCliEnvNm2_Internalname = "CLIENVNM2_"+sGXsfl_32_idx ;
      edtCliEnvDom_Internalname = "CLIENVDOM_"+sGXsfl_32_idx ;
      edtCliEnvDm2_Internalname = "CLIENVDM2_"+sGXsfl_32_idx ;
      edtCliEnvPob_Internalname = "CLIENVPOB_"+sGXsfl_32_idx ;
      edtCliEnvCp_Internalname = "CLIENVCP_"+sGXsfl_32_idx ;
      edtCliEnvCp2_Internalname = "CLIENVCP2_"+sGXsfl_32_idx ;
      edtCliEnvPrv_Internalname = "CLIENVPRV_"+sGXsfl_32_idx ;
      edtCliEnvPrn_Internalname = "CLIENVPRN_"+sGXsfl_32_idx ;
      cmbCliEnvAg.setInternalname( "CLIENVAG_"+sGXsfl_32_idx );
      edtCliEnvTp_Internalname = "CLIENVTP_"+sGXsfl_32_idx ;
      edtCliEnvNmt_Internalname = "CLIENVNMT_"+sGXsfl_32_idx ;
      edtCliEnvMail_Internalname = "CLIENVMAIL_"+sGXsfl_32_idx ;
      edtCliEnvFx_Internalname = "CLIENVFX_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_3222( )
   {
      edtCliEnvLin_Internalname = "CLIENVLIN_"+sGXsfl_32_fel_idx ;
      edtCliEnvNom_Internalname = "CLIENVNOM_"+sGXsfl_32_fel_idx ;
      edtCliEnvNm2_Internalname = "CLIENVNM2_"+sGXsfl_32_fel_idx ;
      edtCliEnvDom_Internalname = "CLIENVDOM_"+sGXsfl_32_fel_idx ;
      edtCliEnvDm2_Internalname = "CLIENVDM2_"+sGXsfl_32_fel_idx ;
      edtCliEnvPob_Internalname = "CLIENVPOB_"+sGXsfl_32_fel_idx ;
      edtCliEnvCp_Internalname = "CLIENVCP_"+sGXsfl_32_fel_idx ;
      edtCliEnvCp2_Internalname = "CLIENVCP2_"+sGXsfl_32_fel_idx ;
      edtCliEnvPrv_Internalname = "CLIENVPRV_"+sGXsfl_32_fel_idx ;
      edtCliEnvPrn_Internalname = "CLIENVPRN_"+sGXsfl_32_fel_idx ;
      cmbCliEnvAg.setInternalname( "CLIENVAG_"+sGXsfl_32_fel_idx );
      edtCliEnvTp_Internalname = "CLIENVTP_"+sGXsfl_32_fel_idx ;
      edtCliEnvNmt_Internalname = "CLIENVNMT_"+sGXsfl_32_fel_idx ;
      edtCliEnvMail_Internalname = "CLIENVMAIL_"+sGXsfl_32_fel_idx ;
      edtCliEnvFx_Internalname = "CLIENVFX_"+sGXsfl_32_fel_idx ;
   }

   public void addRow0J22( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3222( ) ;
      sendRow0J22( ) ;
   }

   public void sendRow0J22( )
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
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvLin_Internalname,GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliEnvLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A266CliEnvLin), "9") : localUtil.format( DecimalUtil.doubleToDec(A266CliEnvLin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCliEnvLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvNom_Internalname,GXutil.rtrim( A267CliEnvNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvNm2_Internalname,GXutil.rtrim( A5531CliEnvNm2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvNm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvNm2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvDom_Internalname,GXutil.rtrim( A265CliEnvDom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvDom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvDm2_Internalname,GXutil.rtrim( A5530CliEnvDm2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvDm2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvDm2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvPob_Internalname,GXutil.rtrim( A268CliEnvPob),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvPob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvCp_Internalname,GXutil.rtrim( A264CliEnvCp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvCp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvCp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvCp2_Internalname,GXutil.rtrim( A10775CliEnvCp2),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvCp2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvCp2_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvPrv_Internalname,GXutil.ltrim( localUtil.ntoc( A270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliEnvPrv_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A270CliEnvPrv), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A270CliEnvPrv), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvPrv_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtCliEnvPrv_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvPrn_Internalname,GXutil.rtrim( A269CliEnvPrn),GXutil.rtrim( localUtil.format( A269CliEnvPrn, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvPrn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCliEnvPrn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "CLIENVAG_" + sGXsfl_32_idx ;
      cmbCliEnvAg.setName( GXCCtl );
      cmbCliEnvAg.setWebtags( "" );
      cmbCliEnvAg.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbCliEnvAg.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbCliEnvAg.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A689CliEnvAg)==0) )
         {
            A689CliEnvAg = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliEnvAg,cmbCliEnvAg.getInternalname(),GXutil.rtrim( A689CliEnvAg),Integer.valueOf(1),cmbCliEnvAg.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbCliEnvAg.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliEnvAg.setValue( GXutil.rtrim( A689CliEnvAg) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliEnvAg.getInternalname(), "Values", cmbCliEnvAg.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvTp_Internalname,GXutil.ltrim( localUtil.ntoc( A723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliEnvTp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A723CliEnvTp), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A723CliEnvTp), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvTp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvTp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtCliEnvTp_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvNmt_Internalname,GXutil.rtrim( A693CliEnvNmt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvNmt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCliEnvNmt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvMail_Internalname,GXutil.rtrim( A10051CliEnvMail),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvMail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvMail_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_22_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEnvFx_Internalname,GXutil.rtrim( A10052CliEnvFx),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEnvFx_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliEnvFx_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes0J22( ) ;
      GXCCtl = "Z266CliEnvLin_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z266CliEnvLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z689CliEnvAg_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z689CliEnvAg));
      GXCCtl = "Z267CliEnvNom_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z267CliEnvNom));
      GXCCtl = "Z5531CliEnvNm2_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5531CliEnvNm2));
      GXCCtl = "Z265CliEnvDom_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z265CliEnvDom));
      GXCCtl = "Z5530CliEnvDm2_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z5530CliEnvDm2));
      GXCCtl = "Z268CliEnvPob_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z268CliEnvPob));
      GXCCtl = "Z264CliEnvCp_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z264CliEnvCp));
      GXCCtl = "Z10775CliEnvCp2_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10775CliEnvCp2));
      GXCCtl = "Z723CliEnvTp_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z723CliEnvTp, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10051CliEnvMail_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10051CliEnvMail));
      GXCCtl = "Z10052CliEnvFx_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10052CliEnvFx));
      GXCCtl = "Z270CliEnvPrv_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z270CliEnvPrv, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_22_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_22_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_22_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_22, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV31EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVNM2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVDOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVDM2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVPOB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVCP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVCP2_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp2_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVPRV_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVPRV_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliEnvPrv_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVPRN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVAG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliEnvAg.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVTP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVTP_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliEnvTp_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVNMT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVMAIL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvMail_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVFX_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvFx_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow0J22( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3222( ) ;
      edtCliEnvLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVNOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvNm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVNM2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvDom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVDOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvDm2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVDM2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvPob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVPOB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvCp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVCP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvCp2_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVCP2_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvPrv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVPRV_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvPrv_Horizontalalignment = httpContext.cgiGet( "CLIENVPRV_"+sGXsfl_32_idx+"Horizontalalignment") ;
      edtCliEnvPrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVPRN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCliEnvAg.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVAG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCliEnvTp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVTP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvTp_Horizontalalignment = httpContext.cgiGet( "CLIENVTP_"+sGXsfl_32_idx+"Horizontalalignment") ;
      edtCliEnvNmt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVNMT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvMail_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVMAIL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliEnvFx_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIENVFX_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A266CliEnvLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliEnvLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A267CliEnvNom = httpContext.cgiGet( edtCliEnvNom_Internalname) ;
      A5531CliEnvNm2 = httpContext.cgiGet( edtCliEnvNm2_Internalname) ;
      A265CliEnvDom = httpContext.cgiGet( edtCliEnvDom_Internalname) ;
      A5530CliEnvDm2 = httpContext.cgiGet( edtCliEnvDm2_Internalname) ;
      A268CliEnvPob = httpContext.cgiGet( edtCliEnvPob_Internalname) ;
      A264CliEnvCp = httpContext.cgiGet( edtCliEnvCp_Internalname) ;
      A10775CliEnvCp2 = httpContext.cgiGet( edtCliEnvCp2_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliEnvPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliEnvPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "CLIENVPRV_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliEnvPrv_Internalname ;
         wbErr = true ;
         A270CliEnvPrv = (short)(0) ;
      }
      else
      {
         A270CliEnvPrv = (short)(localUtil.ctol( httpContext.cgiGet( edtCliEnvPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A269CliEnvPrn = GXutil.upper( httpContext.cgiGet( edtCliEnvPrn_Internalname)) ;
      n269CliEnvPrn = false ;
      cmbCliEnvAg.setName( cmbCliEnvAg.getInternalname() );
      cmbCliEnvAg.setValue( httpContext.cgiGet( cmbCliEnvAg.getInternalname()) );
      A689CliEnvAg = httpContext.cgiGet( cmbCliEnvAg.getInternalname()) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliEnvTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliEnvTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "CLIENVTP_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliEnvTp_Internalname ;
         wbErr = true ;
         A723CliEnvTp = (short)(0) ;
      }
      else
      {
         A723CliEnvTp = (short)(localUtil.ctol( httpContext.cgiGet( edtCliEnvTp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A693CliEnvNmt = httpContext.cgiGet( edtCliEnvNmt_Internalname) ;
      A10051CliEnvMail = httpContext.cgiGet( edtCliEnvMail_Internalname) ;
      A10052CliEnvFx = httpContext.cgiGet( edtCliEnvFx_Internalname) ;
      GXCCtl = "Z266CliEnvLin_" + sGXsfl_32_idx ;
      Z266CliEnvLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z689CliEnvAg_" + sGXsfl_32_idx ;
      Z689CliEnvAg = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z267CliEnvNom_" + sGXsfl_32_idx ;
      Z267CliEnvNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5531CliEnvNm2_" + sGXsfl_32_idx ;
      Z5531CliEnvNm2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z265CliEnvDom_" + sGXsfl_32_idx ;
      Z265CliEnvDom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z5530CliEnvDm2_" + sGXsfl_32_idx ;
      Z5530CliEnvDm2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z268CliEnvPob_" + sGXsfl_32_idx ;
      Z268CliEnvPob = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z264CliEnvCp_" + sGXsfl_32_idx ;
      Z264CliEnvCp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10775CliEnvCp2_" + sGXsfl_32_idx ;
      Z10775CliEnvCp2 = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z723CliEnvTp_" + sGXsfl_32_idx ;
      Z723CliEnvTp = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z10051CliEnvMail_" + sGXsfl_32_idx ;
      Z10051CliEnvMail = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10052CliEnvFx_" + sGXsfl_32_idx ;
      Z10052CliEnvFx = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z270CliEnvPrv_" + sGXsfl_32_idx ;
      Z270CliEnvPrv = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_22_" + sGXsfl_32_idx ;
      nRcdDeleted_22 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_22_" + sGXsfl_32_idx ;
      nRcdExists_22 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_22_" + sGXsfl_32_idx ;
      nIsMod_22 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCliEnvNmt_Enabled = edtCliEnvNmt_Enabled ;
      defedtCliEnvPrn_Enabled = edtCliEnvPrn_Enabled ;
      defedtCliEnvLin_Enabled = edtCliEnvLin_Enabled ;
   }

   public void confirmValues0J0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3222( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3222( ) ;
         httpContext.changePostValue( "Z266CliEnvLin_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z266CliEnvLin_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z266CliEnvLin_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z689CliEnvAg_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z689CliEnvAg_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z689CliEnvAg_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z267CliEnvNom_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z267CliEnvNom_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z267CliEnvNom_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z5531CliEnvNm2_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5531CliEnvNm2_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5531CliEnvNm2_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z265CliEnvDom_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z265CliEnvDom_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z265CliEnvDom_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z5530CliEnvDm2_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5530CliEnvDm2_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5530CliEnvDm2_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z268CliEnvPob_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z268CliEnvPob_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z268CliEnvPob_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z264CliEnvCp_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z264CliEnvCp_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z264CliEnvCp_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10775CliEnvCp2_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10775CliEnvCp2_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10775CliEnvCp2_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z723CliEnvTp_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z723CliEnvTp_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z723CliEnvTp_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10051CliEnvMail_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10051CliEnvMail_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10051CliEnvMail_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10052CliEnvFx_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10052CliEnvFx_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10052CliEnvFx_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z270CliEnvPrv_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z270CliEnvPrv_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z270CliEnvPrv_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tclienv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCLIENV");
      forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tclienv:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z271CliEnvUli", GXutil.ltrim( localUtil.ntoc( Z271CliEnvUli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O271CliEnvUli", GXutil.ltrim( localUtil.ntoc( O271CliEnvUli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIENVPRV_DATA", AV36CliEnvPrv_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIENVPRV_DATA", AV36CliEnvPrv_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIENVTP_DATA", AV38CliEnvTp_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIENVTP_DATA", AV38CliEnvTp_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV31EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV32CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIENVULI", GXutil.ltrim( localUtil.ntoc( A271CliEnvUli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVPRV_Objectcall", GXutil.rtrim( Combo_clienvprv_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVPRV_Cls", GXutil.rtrim( Combo_clienvprv_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVPRV_Enabled", GXutil.booltostr( Combo_clienvprv_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVPRV_Titlecontrolidtoreplace", GXutil.rtrim( Combo_clienvprv_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVPRV_Isgriditem", GXutil.booltostr( Combo_clienvprv_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVPRV_Emptyitem", GXutil.booltostr( Combo_clienvprv_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVTP_Objectcall", GXutil.rtrim( Combo_clienvtp_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVTP_Cls", GXutil.rtrim( Combo_clienvtp_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVTP_Enabled", GXutil.booltostr( Combo_clienvtp_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVTP_Titlecontrolidtoreplace", GXutil.rtrim( Combo_clienvtp_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIENVTP_Isgriditem", GXutil.booltostr( Combo_clienvtp_Isgriditem));
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
      return formatLink("app.tclienv", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV32CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCLIENV" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DOMICILIOS ENVIO CLIENTE", "") ;
   }

   public void initializeNonKey0J21( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A271CliEnvUli = (byte)(0) ;
      n271CliEnvUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      O271CliEnvUli = A271CliEnvUli ;
      n271CliEnvUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      Z279CliNom = "" ;
      Z271CliEnvUli = (byte)(0) ;
   }

   public void initAll0J21( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey0J21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0J22( )
   {
      A693CliEnvNmt = "" ;
      A267CliEnvNom = "" ;
      A5531CliEnvNm2 = "" ;
      A265CliEnvDom = "" ;
      A5530CliEnvDm2 = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A270CliEnvPrv = (short)(0) ;
      A269CliEnvPrn = "" ;
      n269CliEnvPrn = false ;
      A723CliEnvTp = (short)(0) ;
      A10051CliEnvMail = "" ;
      A10052CliEnvFx = "" ;
      A689CliEnvAg = httpContext.getMessage( "N", "") ;
      Z689CliEnvAg = "" ;
      Z267CliEnvNom = "" ;
      Z5531CliEnvNm2 = "" ;
      Z265CliEnvDom = "" ;
      Z5530CliEnvDm2 = "" ;
      Z268CliEnvPob = "" ;
      Z264CliEnvCp = "" ;
      Z10775CliEnvCp2 = "" ;
      Z723CliEnvTp = (short)(0) ;
      Z10051CliEnvMail = "" ;
      Z10052CliEnvFx = "" ;
      Z270CliEnvPrv = (short)(0) ;
   }

   public void initAll0J22( )
   {
      A266CliEnvLin = (byte)(0) ;
      initializeNonKey0J22( ) ;
   }

   public void standaloneModalInsert0J22( )
   {
      A271CliEnvUli = i271CliEnvUli ;
      n271CliEnvUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A271CliEnvUli", GXutil.str( A271CliEnvUli, 1, 0));
      A689CliEnvAg = i689CliEnvAg ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211651880", true, true);
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
      httpContext.AddJavascriptSource("tclienv.js", "?20268211651880", false, true);
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

   public void init_level_properties22( )
   {
      edtCliEnvNmt_Enabled = defedtCliEnvNmt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvNmt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvNmt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvPrn_Enabled = defedtCliEnvPrn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliEnvLin_Enabled = defedtCliEnvLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliEnvLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliEnvLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A266CliEnvLin, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A267CliEnvNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5531CliEnvNm2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A265CliEnvDom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A5530CliEnvDm2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvDm2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A268CliEnvPob));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A264CliEnvCp));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10775CliEnvCp2));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvCp2_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A270CliEnvPrv, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtCliEnvPrv_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A269CliEnvPrn));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvPrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A689CliEnvAg));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliEnvAg.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A723CliEnvTp, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvTp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtCliEnvTp_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A693CliEnvNmt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvNmt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10051CliEnvMail));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvMail_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10052CliEnvFx));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliEnvFx_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtCliEnvLin_Internalname = "CLIENVLIN" ;
      edtCliEnvNom_Internalname = "CLIENVNOM" ;
      edtCliEnvNm2_Internalname = "CLIENVNM2" ;
      edtCliEnvDom_Internalname = "CLIENVDOM" ;
      edtCliEnvDm2_Internalname = "CLIENVDM2" ;
      edtCliEnvPob_Internalname = "CLIENVPOB" ;
      edtCliEnvCp_Internalname = "CLIENVCP" ;
      edtCliEnvCp2_Internalname = "CLIENVCP2" ;
      edtCliEnvPrv_Internalname = "CLIENVPRV" ;
      edtCliEnvPrn_Internalname = "CLIENVPRN" ;
      cmbCliEnvAg.setInternalname( "CLIENVAG" );
      edtCliEnvTp_Internalname = "CLIENVTP" ;
      edtCliEnvNmt_Internalname = "CLIENVNMT" ;
      edtCliEnvMail_Internalname = "CLIENVMAIL" ;
      edtCliEnvFx_Internalname = "CLIENVFX" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_clienvprv_Internalname = "COMBO_CLIENVPRV" ;
      Combo_clienvtp_Internalname = "COMBO_CLIENVTP" ;
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
      Combo_clienvtp_Enabled = GXutil.toBoolean( -1) ;
      Combo_clienvprv_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "DOMICILIOS ENVIO CLIENTE", "") );
      edtCliEnvFx_Jsonclick = "" ;
      edtCliEnvMail_Jsonclick = "" ;
      edtCliEnvNmt_Jsonclick = "" ;
      edtCliEnvTp_Jsonclick = "" ;
      cmbCliEnvAg.setJsonclick( "" );
      edtCliEnvPrn_Jsonclick = "" ;
      edtCliEnvPrv_Jsonclick = "" ;
      edtCliEnvCp2_Jsonclick = "" ;
      edtCliEnvCp_Jsonclick = "" ;
      edtCliEnvPob_Jsonclick = "" ;
      edtCliEnvDm2_Jsonclick = "" ;
      edtCliEnvDom_Jsonclick = "" ;
      edtCliEnvNm2_Jsonclick = "" ;
      edtCliEnvNom_Jsonclick = "" ;
      edtCliEnvLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_clienvprv_Titlecontrolidtoreplace = "" ;
      Combo_clienvtp_Titlecontrolidtoreplace = "" ;
      edtCliEnvFx_Enabled = 1 ;
      edtCliEnvMail_Enabled = 1 ;
      edtCliEnvNmt_Enabled = 0 ;
      edtCliEnvTp_Enabled = 1 ;
      cmbCliEnvAg.setEnabled( 1 );
      edtCliEnvPrn_Enabled = 0 ;
      edtCliEnvPrv_Enabled = 1 ;
      edtCliEnvCp2_Enabled = 1 ;
      edtCliEnvCp_Enabled = 1 ;
      edtCliEnvPob_Enabled = 1 ;
      edtCliEnvDm2_Enabled = 1 ;
      edtCliEnvDom_Enabled = 1 ;
      edtCliEnvNm2_Enabled = 1 ;
      edtCliEnvNom_Enabled = 1 ;
      edtCliEnvLin_Enabled = 0 ;
      Combo_clienvtp_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_clienvtp_Cls = "ExtendedCombo" ;
      Combo_clienvtp_Caption = "" ;
      Combo_clienvprv_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clienvprv_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_clienvprv_Cls = "ExtendedCombo" ;
      Combo_clienvprv_Caption = "" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
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
      divTablemain_Height = 0 ;
      edtCliEnvPrv_Horizontalalignment = "right" ;
      edtCliEnvTp_Horizontalalignment = "right" ;
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

   public void gx7asaclienvnmt0J22( String A396EmprCod ,
                                    short A723CliEnvTp )
   {
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      tclienv_impl.this.A396EmprCod = GXv_char4[0] ;
      tclienv_impl.this.A723CliEnvTp = GXv_int10[0] ;
      tclienv_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A693CliEnvNmt = GXt_char1 ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A693CliEnvNmt))+"\"") ;
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
      subsflControlProps_3222( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0J22( ) ;
         standaloneModal0J22( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0J22( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3222( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "CLIENVAG_" + sGXsfl_32_idx ;
      cmbCliEnvAg.setName( GXCCtl );
      cmbCliEnvAg.setWebtags( "" );
      cmbCliEnvAg.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbCliEnvAg.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbCliEnvAg.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A689CliEnvAg)==0) )
         {
            A689CliEnvAg = httpContext.getMessage( "N", "") ;
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

   public void valid_Clienvprv( )
   {
      n269CliEnvPrn = false ;
      /* Using cursor T000J85 */
      pr_default.execute(83, new Object[] {Short.valueOf(A270CliEnvPrv)});
      if ( (pr_default.getStatus(83) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliEnv", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLIENVPRV");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliEnvPrv_Internalname ;
      }
      A269CliEnvPrn = T000J85_A269CliEnvPrn[0] ;
      n269CliEnvPrn = T000J85_n269CliEnvPrn[0] ;
      pr_default.close(83);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A269CliEnvPrn", GXutil.rtrim( A269CliEnvPrn));
   }

   public void valid_Clienvtp( )
   {
      GXt_char1 = A693CliEnvNmt ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int10[0] = A723CliEnvTp ;
      GXv_char3[0] = GXt_char1 ;
      new app.ptrnnom(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
      tclienv_impl.this.A396EmprCod = GXv_char4[0] ;
      tclienv_impl.this.A723CliEnvTp = GXv_int10[0] ;
      tclienv_impl.this.GXt_char1 = GXv_char3[0] ;
      A693CliEnvNmt = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A693CliEnvNmt", GXutil.rtrim( A693CliEnvNmt));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV32CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV32CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120J2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLIENVLIN","{handler:'valid_Clienvlin',iparms:[]");
      setEventMetadata("VALID_CLIENVLIN",",oparms:[]}");
      setEventMetadata("VALID_CLIENVPRV","{handler:'valid_Clienvprv',iparms:[{av:'A270CliEnvPrv',fld:'CLIENVPRV',pic:'ZZ9'},{av:'A269CliEnvPrn',fld:'CLIENVPRN',pic:'@!'}]");
      setEventMetadata("VALID_CLIENVPRV",",oparms:[{av:'A269CliEnvPrn',fld:'CLIENVPRN',pic:'@!'}]}");
      setEventMetadata("VALID_CLIENVTP","{handler:'valid_Clienvtp',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A723CliEnvTp',fld:'CLIENVTP',pic:'ZZZ9'},{av:'A693CliEnvNmt',fld:'CLIENVNMT',pic:''}]");
      setEventMetadata("VALID_CLIENVTP",",oparms:[{av:'A693CliEnvNmt',fld:'CLIENVNMT',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Clienvfx',iparms:[]");
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
      pr_default.close(83);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV31EmprCod = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z689CliEnvAg = "" ;
      Z267CliEnvNom = "" ;
      Z5531CliEnvNm2 = "" ;
      Z265CliEnvDom = "" ;
      Z5530CliEnvDm2 = "" ;
      Z268CliEnvPob = "" ;
      Z264CliEnvCp = "" ;
      Z10775CliEnvCp2 = "" ;
      Z10051CliEnvMail = "" ;
      Z10052CliEnvFx = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV31EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A279CliNom = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucCombo_clienvprv = new com.genexus.webpanels.GXUserControl();
      AV39DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV36CliEnvPrv_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      ucCombo_clienvtp = new com.genexus.webpanels.GXUserControl();
      AV38CliEnvTp_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode22 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_clienvprv_Objectcall = "" ;
      Combo_clienvprv_Class = "" ;
      Combo_clienvprv_Icontype = "" ;
      Combo_clienvprv_Icon = "" ;
      Combo_clienvprv_Tooltip = "" ;
      Combo_clienvprv_Selectedvalue_set = "" ;
      Combo_clienvprv_Selectedvalue_get = "" ;
      Combo_clienvprv_Selectedtext_set = "" ;
      Combo_clienvprv_Selectedtext_get = "" ;
      Combo_clienvprv_Gamoauthtoken = "" ;
      Combo_clienvprv_Ddointernalname = "" ;
      Combo_clienvprv_Titlecontrolalign = "" ;
      Combo_clienvprv_Dropdownoptionstype = "" ;
      Combo_clienvprv_Datalisttype = "" ;
      Combo_clienvprv_Datalistfixedvalues = "" ;
      Combo_clienvprv_Datalistproc = "" ;
      Combo_clienvprv_Datalistprocparametersprefix = "" ;
      Combo_clienvprv_Remoteservicesparameters = "" ;
      Combo_clienvprv_Htmltemplate = "" ;
      Combo_clienvprv_Multiplevaluestype = "" ;
      Combo_clienvprv_Loadingdata = "" ;
      Combo_clienvprv_Noresultsfound = "" ;
      Combo_clienvprv_Emptyitemtext = "" ;
      Combo_clienvprv_Onlyselectedvalues = "" ;
      Combo_clienvprv_Selectalltext = "" ;
      Combo_clienvprv_Multiplevaluesseparator = "" ;
      Combo_clienvprv_Addnewoptiontext = "" ;
      Combo_clienvtp_Objectcall = "" ;
      Combo_clienvtp_Class = "" ;
      Combo_clienvtp_Icontype = "" ;
      Combo_clienvtp_Icon = "" ;
      Combo_clienvtp_Tooltip = "" ;
      Combo_clienvtp_Selectedvalue_set = "" ;
      Combo_clienvtp_Selectedvalue_get = "" ;
      Combo_clienvtp_Selectedtext_set = "" ;
      Combo_clienvtp_Selectedtext_get = "" ;
      Combo_clienvtp_Gamoauthtoken = "" ;
      Combo_clienvtp_Ddointernalname = "" ;
      Combo_clienvtp_Titlecontrolalign = "" ;
      Combo_clienvtp_Dropdownoptionstype = "" ;
      Combo_clienvtp_Datalisttype = "" ;
      Combo_clienvtp_Datalistfixedvalues = "" ;
      Combo_clienvtp_Datalistproc = "" ;
      Combo_clienvtp_Datalistprocparametersprefix = "" ;
      Combo_clienvtp_Remoteservicesparameters = "" ;
      Combo_clienvtp_Htmltemplate = "" ;
      Combo_clienvtp_Multiplevaluestype = "" ;
      Combo_clienvtp_Loadingdata = "" ;
      Combo_clienvtp_Noresultsfound = "" ;
      Combo_clienvtp_Emptyitemtext = "" ;
      Combo_clienvtp_Onlyselectedvalues = "" ;
      Combo_clienvtp_Selectalltext = "" ;
      Combo_clienvtp_Multiplevaluesseparator = "" ;
      Combo_clienvtp_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode21 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A267CliEnvNom = "" ;
      A5531CliEnvNm2 = "" ;
      A265CliEnvDom = "" ;
      A5530CliEnvDm2 = "" ;
      A268CliEnvPob = "" ;
      A264CliEnvCp = "" ;
      A10775CliEnvCp2 = "" ;
      A269CliEnvPrn = "" ;
      A689CliEnvAg = "" ;
      A693CliEnvNmt = "" ;
      A10051CliEnvMail = "" ;
      A10052CliEnvFx = "" ;
      AV25Station = "" ;
      AV26EmprNom = "" ;
      AV22UsurCod = "" ;
      GXv_char2 = new String[1] ;
      AV33WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV34TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV35WebSession = httpContext.getWebSession();
      AV37ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T000J7_A407EmprNom = new String[] {""} ;
      T000J7_n407EmprNom = new boolean[] {false} ;
      T000J8_A252CliCod = new int[1] ;
      T000J8_n252CliCod = new boolean[] {false} ;
      T000J8_A279CliNom = new String[] {""} ;
      T000J8_A271CliEnvUli = new byte[1] ;
      T000J8_n271CliEnvUli = new boolean[] {false} ;
      T000J8_A407EmprNom = new String[] {""} ;
      T000J8_n407EmprNom = new boolean[] {false} ;
      T000J8_A396EmprCod = new String[] {""} ;
      T000J9_A396EmprCod = new String[] {""} ;
      T000J9_A252CliCod = new int[1] ;
      T000J9_n252CliCod = new boolean[] {false} ;
      T000J6_A252CliCod = new int[1] ;
      T000J6_n252CliCod = new boolean[] {false} ;
      T000J6_A279CliNom = new String[] {""} ;
      T000J6_A271CliEnvUli = new byte[1] ;
      T000J6_n271CliEnvUli = new boolean[] {false} ;
      T000J6_A396EmprCod = new String[] {""} ;
      T000J10_A396EmprCod = new String[] {""} ;
      T000J10_A252CliCod = new int[1] ;
      T000J10_n252CliCod = new boolean[] {false} ;
      T000J11_A396EmprCod = new String[] {""} ;
      T000J11_A252CliCod = new int[1] ;
      T000J11_n252CliCod = new boolean[] {false} ;
      T000J5_A252CliCod = new int[1] ;
      T000J5_n252CliCod = new boolean[] {false} ;
      T000J5_A279CliNom = new String[] {""} ;
      T000J5_A271CliEnvUli = new byte[1] ;
      T000J5_n271CliEnvUli = new boolean[] {false} ;
      T000J5_A396EmprCod = new String[] {""} ;
      T000J15_A396EmprCod = new String[] {""} ;
      T000J15_A252CliCod = new int[1] ;
      T000J15_n252CliCod = new boolean[] {false} ;
      T000J15_A6930Lb_rclin = new int[1] ;
      T000J16_A396EmprCod = new String[] {""} ;
      T000J16_A6850Tex_NPed = new int[1] ;
      T000J17_A396EmprCod = new String[] {""} ;
      T000J17_A252CliCod = new int[1] ;
      T000J17_n252CliCod = new boolean[] {false} ;
      T000J17_A829TipArtCod = new short[1] ;
      T000J17_A831TipColCod = new byte[1] ;
      T000J17_A583IntCod = new byte[1] ;
      T000J17_A5098TipDisCod = new String[] {""} ;
      T000J17_A6603Est1_anyo = new short[1] ;
      T000J17_A6604Est1_mes = new byte[1] ;
      T000J17_A6605Est1_dia = new byte[1] ;
      T000J18_A396EmprCod = new String[] {""} ;
      T000J18_A6319C_Barcod = new int[1] ;
      T000J18_A6320C_Barcodre = new byte[1] ;
      T000J18_A6321C_Barcodpa = new String[] {""} ;
      T000J18_A6322C_Reclinma = new short[1] ;
      T000J19_A396EmprCod = new String[] {""} ;
      T000J19_A6235DevEmpCod = new int[1] ;
      T000J20_A396EmprCod = new String[] {""} ;
      T000J20_A602MaqCod = new String[] {""} ;
      T000J20_A6078MaqCliCod = new int[1] ;
      T000J20_A6079MaqArtCod = new String[] {""} ;
      T000J21_A396EmprCod = new String[] {""} ;
      T000J21_A5532Lb_numero = new int[1] ;
      T000J22_A396EmprCod = new String[] {""} ;
      T000J22_A252CliCod = new int[1] ;
      T000J22_n252CliCod = new boolean[] {false} ;
      T000J22_A5503CliifLin = new short[1] ;
      T000J23_A396EmprCod = new String[] {""} ;
      T000J23_A252CliCod = new int[1] ;
      T000J23_n252CliCod = new boolean[] {false} ;
      T000J23_A5499ClieiLin = new short[1] ;
      T000J24_A396EmprCod = new String[] {""} ;
      T000J24_A252CliCod = new int[1] ;
      T000J24_n252CliCod = new boolean[] {false} ;
      T000J24_A5495ClidtLin = new short[1] ;
      T000J25_A396EmprCod = new String[] {""} ;
      T000J25_A252CliCod = new int[1] ;
      T000J25_n252CliCod = new boolean[] {false} ;
      T000J25_A5491CliedLin = new short[1] ;
      T000J26_A396EmprCod = new String[] {""} ;
      T000J26_A252CliCod = new int[1] ;
      T000J26_n252CliCod = new boolean[] {false} ;
      T000J26_A5452P_ForCod = new String[] {""} ;
      T000J27_A396EmprCod = new String[] {""} ;
      T000J27_A252CliCod = new int[1] ;
      T000J27_n252CliCod = new boolean[] {false} ;
      T000J27_A5443Mdl_Cod = new String[] {""} ;
      T000J28_A396EmprCod = new String[] {""} ;
      T000J28_A252CliCod = new int[1] ;
      T000J28_n252CliCod = new boolean[] {false} ;
      T000J28_A5436IntCodF2 = new short[1] ;
      T000J29_A396EmprCod = new String[] {""} ;
      T000J29_A252CliCod = new int[1] ;
      T000J29_n252CliCod = new boolean[] {false} ;
      T000J29_A5396IntCodFC = new byte[1] ;
      T000J29_A5434Tip_ColC = new byte[1] ;
      T000J30_A396EmprCod = new String[] {""} ;
      T000J30_A252CliCod = new int[1] ;
      T000J30_n252CliCod = new boolean[] {false} ;
      T000J30_A5428FasPreCod = new String[] {""} ;
      T000J31_A396EmprCod = new String[] {""} ;
      T000J31_A252CliCod = new int[1] ;
      T000J31_n252CliCod = new boolean[] {false} ;
      T000J31_A5398Cli_Proc = new String[] {""} ;
      T000J32_A396EmprCod = new String[] {""} ;
      T000J32_A5130PagIden = new int[1] ;
      T000J33_A396EmprCod = new String[] {""} ;
      T000J33_A5059Hl_hdr = new int[1] ;
      T000J33_A5060Hl_hdrr = new byte[1] ;
      T000J33_A5061Hl_hdrp = new String[] {""} ;
      T000J34_A396EmprCod = new String[] {""} ;
      T000J34_A252CliCod = new int[1] ;
      T000J34_n252CliCod = new boolean[] {false} ;
      T000J34_A4718DishCod = new String[] {""} ;
      T000J34_A5020TipEstCod = new byte[1] ;
      T000J34_A5022GraCod = new byte[1] ;
      T000J35_A396EmprCod = new String[] {""} ;
      T000J35_A4618EnsLCod = new int[1] ;
      T000J36_A396EmprCod = new String[] {""} ;
      T000J36_A4492HreBarCod = new int[1] ;
      T000J36_A4493HreBarReo = new byte[1] ;
      T000J36_A4494HreBarPar = new String[] {""} ;
      T000J36_A4495HreNumCie = new byte[1] ;
      T000J37_A396EmprCod = new String[] {""} ;
      T000J37_A252CliCod = new int[1] ;
      T000J37_n252CliCod = new boolean[] {false} ;
      T000J37_A4415EstCol = new String[] {""} ;
      T000J38_A396EmprCod = new String[] {""} ;
      T000J38_A4185WEBUSU = new String[] {""} ;
      T000J39_A396EmprCod = new String[] {""} ;
      T000J39_A252CliCod = new int[1] ;
      T000J39_n252CliCod = new boolean[] {false} ;
      T000J39_A4079WEBDISCOD = new String[] {""} ;
      T000J39_A4078EMPCOD = new String[] {""} ;
      T000J40_A396EmprCod = new String[] {""} ;
      T000J40_A2637HisEstHRu = new int[1] ;
      T000J40_A2636HisEstHRe = new byte[1] ;
      T000J40_A2635HisEstHPa = new String[] {""} ;
      T000J40_A2638HisEstLCo = new byte[1] ;
      T000J40_A2630HisEstCom = new String[] {""} ;
      T000J40_A2634HisEstFon = new String[] {""} ;
      T000J41_A396EmprCod = new String[] {""} ;
      T000J41_A2574GrpDibCod = new int[1] ;
      T000J42_A396EmprCod = new String[] {""} ;
      T000J42_A2558GrmDibCod = new int[1] ;
      T000J43_A396EmprCod = new String[] {""} ;
      T000J43_A2542GrcDibCod = new int[1] ;
      T000J44_A396EmprCod = new String[] {""} ;
      T000J44_A1031EmpesCod = new String[] {""} ;
      T000J44_A252CliCod = new int[1] ;
      T000J44_n252CliCod = new boolean[] {false} ;
      T000J44_A1032FonCod = new String[] {""} ;
      T000J45_A396EmprCod = new String[] {""} ;
      T000J45_A1013DibCli = new String[] {""} ;
      T000J45_A252CliCod = new int[1] ;
      T000J45_n252CliCod = new boolean[] {false} ;
      T000J45_A1014DibInt = new int[1] ;
      T000J46_A396EmprCod = new String[] {""} ;
      T000J46_A1736AlbExtCod = new long[1] ;
      T000J47_A396EmprCod = new String[] {""} ;
      T000J47_A252CliCod = new int[1] ;
      T000J47_n252CliCod = new boolean[] {false} ;
      T000J47_A3661FacProAny = new short[1] ;
      T000J47_A3662FacProSer = new String[] {""} ;
      T000J47_A3663FacProInt = new byte[1] ;
      T000J47_A3664FacProTip = new byte[1] ;
      T000J47_A3665FacProTar = new short[1] ;
      T000J48_A396EmprCod = new String[] {""} ;
      T000J48_A3646EstTinAny = new short[1] ;
      T000J48_A3647EstTinMes = new byte[1] ;
      T000J48_A3648EstTinDia = new byte[1] ;
      T000J48_A1929EstTinNr = new short[1] ;
      T000J49_A396EmprCod = new String[] {""} ;
      T000J49_A3617AlbTrnCod = new long[1] ;
      T000J50_A396EmprCod = new String[] {""} ;
      T000J50_A252CliCod = new int[1] ;
      T000J50_n252CliCod = new boolean[] {false} ;
      T000J50_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000J51_A396EmprCod = new String[] {""} ;
      T000J51_A3073RepCod = new String[] {""} ;
      T000J51_A252CliCod = new int[1] ;
      T000J51_n252CliCod = new boolean[] {false} ;
      T000J52_A396EmprCod = new String[] {""} ;
      T000J52_A3061Codia = new byte[1] ;
      T000J52_A3062CoMes = new byte[1] ;
      T000J52_A3063CoAny = new short[1] ;
      T000J52_A3065CoLin = new byte[1] ;
      T000J52_A3010CoBarCod = new int[1] ;
      T000J52_A3011CoBarReo = new byte[1] ;
      T000J52_A3012CoBarPar = new String[] {""} ;
      T000J53_A396EmprCod = new String[] {""} ;
      T000J53_A2971SabFacCod = new int[1] ;
      T000J54_A396EmprCod = new String[] {""} ;
      T000J54_A2954TiDia = new byte[1] ;
      T000J54_A2955TiMes = new byte[1] ;
      T000J54_A2956TiAny = new short[1] ;
      T000J54_A2958TiLin = new byte[1] ;
      T000J54_A2959TiBarCod = new int[1] ;
      T000J54_A2960TiBarReo = new byte[1] ;
      T000J54_A2961TiBarPar = new String[] {""} ;
      T000J55_A396EmprCod = new String[] {""} ;
      T000J55_A252CliCod = new int[1] ;
      T000J55_n252CliCod = new boolean[] {false} ;
      T000J55_A2933RecTipCon = new short[1] ;
      T000J56_A396EmprCod = new String[] {""} ;
      T000J56_A252CliCod = new int[1] ;
      T000J56_n252CliCod = new boolean[] {false} ;
      T000J56_A2927RecProCod = new String[] {""} ;
      T000J57_A396EmprCod = new String[] {""} ;
      T000J57_A252CliCod = new int[1] ;
      T000J57_n252CliCod = new boolean[] {false} ;
      T000J57_A2891HMaForSer = new String[] {""} ;
      T000J57_A2892HMaForCNom = new String[] {""} ;
      T000J57_A2893HMaForCNum = new int[1] ;
      T000J57_A2894HMaTipCCod = new byte[1] ;
      T000J57_A2895HMaForNumC = new int[1] ;
      T000J57_A2897HMaColLin = new short[1] ;
      T000J57_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T000J57_A2907HmaLin = new short[1] ;
      T000J58_A396EmprCod = new String[] {""} ;
      T000J58_A252CliCod = new int[1] ;
      T000J58_n252CliCod = new boolean[] {false} ;
      T000J58_A425EstAny = new short[1] ;
      T000J58_A2755EstSerFac = new String[] {""} ;
      T000J59_A396EmprCod = new String[] {""} ;
      T000J59_A2730RecTipCo = new short[1] ;
      T000J59_A252CliCod = new int[1] ;
      T000J59_n252CliCod = new boolean[] {false} ;
      T000J60_A396EmprCod = new String[] {""} ;
      T000J60_A2720TarSec = new String[] {""} ;
      T000J60_A252CliCod = new int[1] ;
      T000J60_n252CliCod = new boolean[] {false} ;
      T000J60_A829TipArtCod = new short[1] ;
      T000J60_A831TipColCod = new byte[1] ;
      T000J61_A396EmprCod = new String[] {""} ;
      T000J61_A2382AbcTerCod = new String[] {""} ;
      T000J61_A2381AbcSec = new String[] {""} ;
      T000J61_A252CliCod = new int[1] ;
      T000J61_n252CliCod = new boolean[] {false} ;
      T000J62_A396EmprCod = new String[] {""} ;
      T000J62_A252CliCod = new int[1] ;
      T000J62_n252CliCod = new boolean[] {false} ;
      T000J62_A2308CliDesCod = new int[1] ;
      T000J63_A396EmprCod = new String[] {""} ;
      T000J63_A2268MovParCod = new String[] {""} ;
      T000J63_A252CliCod = new int[1] ;
      T000J63_n252CliCod = new boolean[] {false} ;
      T000J64_A396EmprCod = new String[] {""} ;
      T000J64_A966PartCod = new String[] {""} ;
      T000J64_A252CliCod = new int[1] ;
      T000J64_n252CliCod = new boolean[] {false} ;
      T000J65_A396EmprCod = new String[] {""} ;
      T000J65_A1387AlbPrvCod = new int[1] ;
      T000J66_A396EmprCod = new String[] {""} ;
      T000J66_A252CliCod = new int[1] ;
      T000J66_n252CliCod = new boolean[] {false} ;
      T000J66_A1213TalCod = new String[] {""} ;
      T000J67_A396EmprCod = new String[] {""} ;
      T000J67_A252CliCod = new int[1] ;
      T000J67_n252CliCod = new boolean[] {false} ;
      T000J67_A457FasCod = new String[] {""} ;
      T000J68_A396EmprCod = new String[] {""} ;
      T000J68_A539HisBarCod = new int[1] ;
      T000J68_A545HisCodReo = new byte[1] ;
      T000J68_A544HisCodPar = new String[] {""} ;
      T000J68_A833TipDefCod = new short[1] ;
      T000J69_A396EmprCod = new String[] {""} ;
      T000J69_A506HbaBarCod = new int[1] ;
      T000J69_A508HbaBarReo = new byte[1] ;
      T000J69_A507HbaBarPar = new String[] {""} ;
      T000J70_A396EmprCod = new String[] {""} ;
      T000J70_A252CliCod = new int[1] ;
      T000J70_n252CliCod = new boolean[] {false} ;
      T000J70_A494ForSer = new String[] {""} ;
      T000J70_A482ForColNom = new String[] {""} ;
      T000J70_A483ForColNum = new int[1] ;
      T000J70_A831TipColCod = new byte[1] ;
      T000J71_A396EmprCod = new String[] {""} ;
      T000J71_A252CliCod = new int[1] ;
      T000J71_n252CliCod = new boolean[] {false} ;
      T000J71_A287CliPagLin = new byte[1] ;
      T000J72_A396EmprCod = new String[] {""} ;
      T000J72_A1453DevGenHil = new int[1] ;
      T000J73_A396EmprCod = new String[] {""} ;
      T000J73_A252CliCod = new int[1] ;
      T000J73_n252CliCod = new boolean[] {false} ;
      T000J73_A65ArtCod = new String[] {""} ;
      T000J74_A396EmprCod = new String[] {""} ;
      T000J74_A44AlbRecCod = new int[1] ;
      T000J75_A396EmprCod = new String[] {""} ;
      T000J75_A30AlbProCod = new long[1] ;
      T000J76_A396EmprCod = new String[] {""} ;
      T000J76_A14AlbComCod = new int[1] ;
      T000J78_A396EmprCod = new String[] {""} ;
      T000J78_A252CliCod = new int[1] ;
      T000J78_n252CliCod = new boolean[] {false} ;
      Z269CliEnvPrn = "" ;
      T000J79_A252CliCod = new int[1] ;
      T000J79_n252CliCod = new boolean[] {false} ;
      T000J79_A266CliEnvLin = new byte[1] ;
      T000J79_A689CliEnvAg = new String[] {""} ;
      T000J79_A267CliEnvNom = new String[] {""} ;
      T000J79_A5531CliEnvNm2 = new String[] {""} ;
      T000J79_A265CliEnvDom = new String[] {""} ;
      T000J79_A5530CliEnvDm2 = new String[] {""} ;
      T000J79_A268CliEnvPob = new String[] {""} ;
      T000J79_A264CliEnvCp = new String[] {""} ;
      T000J79_A10775CliEnvCp2 = new String[] {""} ;
      T000J79_A269CliEnvPrn = new String[] {""} ;
      T000J79_n269CliEnvPrn = new boolean[] {false} ;
      T000J79_A723CliEnvTp = new short[1] ;
      T000J79_A10051CliEnvMail = new String[] {""} ;
      T000J79_A10052CliEnvFx = new String[] {""} ;
      T000J79_A270CliEnvPrv = new short[1] ;
      T000J79_A396EmprCod = new String[] {""} ;
      T000J4_A269CliEnvPrn = new String[] {""} ;
      T000J4_n269CliEnvPrn = new boolean[] {false} ;
      GXCCtl = "" ;
      T000J80_A269CliEnvPrn = new String[] {""} ;
      T000J80_n269CliEnvPrn = new boolean[] {false} ;
      T000J81_A396EmprCod = new String[] {""} ;
      T000J81_A252CliCod = new int[1] ;
      T000J81_n252CliCod = new boolean[] {false} ;
      T000J81_A266CliEnvLin = new byte[1] ;
      T000J3_A252CliCod = new int[1] ;
      T000J3_n252CliCod = new boolean[] {false} ;
      T000J3_A266CliEnvLin = new byte[1] ;
      T000J3_A689CliEnvAg = new String[] {""} ;
      T000J3_A267CliEnvNom = new String[] {""} ;
      T000J3_A5531CliEnvNm2 = new String[] {""} ;
      T000J3_A265CliEnvDom = new String[] {""} ;
      T000J3_A5530CliEnvDm2 = new String[] {""} ;
      T000J3_A268CliEnvPob = new String[] {""} ;
      T000J3_A264CliEnvCp = new String[] {""} ;
      T000J3_A10775CliEnvCp2 = new String[] {""} ;
      T000J3_A723CliEnvTp = new short[1] ;
      T000J3_A10051CliEnvMail = new String[] {""} ;
      T000J3_A10052CliEnvFx = new String[] {""} ;
      T000J3_A270CliEnvPrv = new short[1] ;
      T000J3_A396EmprCod = new String[] {""} ;
      T000J2_A252CliCod = new int[1] ;
      T000J2_n252CliCod = new boolean[] {false} ;
      T000J2_A266CliEnvLin = new byte[1] ;
      T000J2_A689CliEnvAg = new String[] {""} ;
      T000J2_A267CliEnvNom = new String[] {""} ;
      T000J2_A5531CliEnvNm2 = new String[] {""} ;
      T000J2_A265CliEnvDom = new String[] {""} ;
      T000J2_A5530CliEnvDm2 = new String[] {""} ;
      T000J2_A268CliEnvPob = new String[] {""} ;
      T000J2_A264CliEnvCp = new String[] {""} ;
      T000J2_A10775CliEnvCp2 = new String[] {""} ;
      T000J2_A723CliEnvTp = new short[1] ;
      T000J2_A10051CliEnvMail = new String[] {""} ;
      T000J2_A10052CliEnvFx = new String[] {""} ;
      T000J2_A270CliEnvPrv = new short[1] ;
      T000J2_A396EmprCod = new String[] {""} ;
      T000J85_A269CliEnvPrn = new String[] {""} ;
      T000J85_n269CliEnvPrn = new boolean[] {false} ;
      T000J86_A396EmprCod = new String[] {""} ;
      T000J86_A3617AlbTrnCod = new long[1] ;
      T000J87_A396EmprCod = new String[] {""} ;
      T000J87_A1453DevGenHil = new int[1] ;
      T000J88_A396EmprCod = new String[] {""} ;
      T000J88_A252CliCod = new int[1] ;
      T000J88_n252CliCod = new boolean[] {false} ;
      T000J88_A266CliEnvLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i689CliEnvAg = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new short[1] ;
      GXv_char3 = new String[1] ;
      Z693CliEnvNmt = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclienv__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclienv__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclienv__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclienv__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclienv__default(),
         new Object[] {
             new Object[] {
            T000J2_A252CliCod, T000J2_A266CliEnvLin, T000J2_A689CliEnvAg, T000J2_A267CliEnvNom, T000J2_A5531CliEnvNm2, T000J2_A265CliEnvDom, T000J2_A5530CliEnvDm2, T000J2_A268CliEnvPob, T000J2_A264CliEnvCp, T000J2_A10775CliEnvCp2,
            T000J2_A723CliEnvTp, T000J2_A10051CliEnvMail, T000J2_A10052CliEnvFx, T000J2_A270CliEnvPrv, T000J2_A396EmprCod
            }
            , new Object[] {
            T000J3_A252CliCod, T000J3_A266CliEnvLin, T000J3_A689CliEnvAg, T000J3_A267CliEnvNom, T000J3_A5531CliEnvNm2, T000J3_A265CliEnvDom, T000J3_A5530CliEnvDm2, T000J3_A268CliEnvPob, T000J3_A264CliEnvCp, T000J3_A10775CliEnvCp2,
            T000J3_A723CliEnvTp, T000J3_A10051CliEnvMail, T000J3_A10052CliEnvFx, T000J3_A270CliEnvPrv, T000J3_A396EmprCod
            }
            , new Object[] {
            T000J4_A269CliEnvPrn, T000J4_n269CliEnvPrn
            }
            , new Object[] {
            T000J5_A252CliCod, T000J5_A279CliNom, T000J5_A271CliEnvUli, T000J5_n271CliEnvUli, T000J5_A396EmprCod
            }
            , new Object[] {
            T000J6_A252CliCod, T000J6_A279CliNom, T000J6_A271CliEnvUli, T000J6_n271CliEnvUli, T000J6_A396EmprCod
            }
            , new Object[] {
            T000J7_A407EmprNom, T000J7_n407EmprNom
            }
            , new Object[] {
            T000J8_A252CliCod, T000J8_A279CliNom, T000J8_A271CliEnvUli, T000J8_n271CliEnvUli, T000J8_A407EmprNom, T000J8_n407EmprNom, T000J8_A396EmprCod
            }
            , new Object[] {
            T000J9_A396EmprCod, T000J9_A252CliCod
            }
            , new Object[] {
            T000J10_A396EmprCod, T000J10_A252CliCod
            }
            , new Object[] {
            T000J11_A396EmprCod, T000J11_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000J15_A396EmprCod, T000J15_A252CliCod, T000J15_A6930Lb_rclin
            }
            , new Object[] {
            T000J16_A396EmprCod, T000J16_A6850Tex_NPed
            }
            , new Object[] {
            T000J17_A396EmprCod, T000J17_A252CliCod, T000J17_A829TipArtCod, T000J17_A831TipColCod, T000J17_A583IntCod, T000J17_A5098TipDisCod, T000J17_A6603Est1_anyo, T000J17_A6604Est1_mes, T000J17_A6605Est1_dia
            }
            , new Object[] {
            T000J18_A396EmprCod, T000J18_A6319C_Barcod, T000J18_A6320C_Barcodre, T000J18_A6321C_Barcodpa, T000J18_A6322C_Reclinma
            }
            , new Object[] {
            T000J19_A396EmprCod, T000J19_A6235DevEmpCod
            }
            , new Object[] {
            T000J20_A396EmprCod, T000J20_A602MaqCod, T000J20_A6078MaqCliCod, T000J20_A6079MaqArtCod
            }
            , new Object[] {
            T000J21_A396EmprCod, T000J21_A5532Lb_numero
            }
            , new Object[] {
            T000J22_A396EmprCod, T000J22_A252CliCod, T000J22_A5503CliifLin
            }
            , new Object[] {
            T000J23_A396EmprCod, T000J23_A252CliCod, T000J23_A5499ClieiLin
            }
            , new Object[] {
            T000J24_A396EmprCod, T000J24_A252CliCod, T000J24_A5495ClidtLin
            }
            , new Object[] {
            T000J25_A396EmprCod, T000J25_A252CliCod, T000J25_A5491CliedLin
            }
            , new Object[] {
            T000J26_A396EmprCod, T000J26_A252CliCod, T000J26_A5452P_ForCod
            }
            , new Object[] {
            T000J27_A396EmprCod, T000J27_A252CliCod, T000J27_A5443Mdl_Cod
            }
            , new Object[] {
            T000J28_A396EmprCod, T000J28_A252CliCod, T000J28_A5436IntCodF2
            }
            , new Object[] {
            T000J29_A396EmprCod, T000J29_A252CliCod, T000J29_A5396IntCodFC, T000J29_A5434Tip_ColC
            }
            , new Object[] {
            T000J30_A396EmprCod, T000J30_A252CliCod, T000J30_A5428FasPreCod
            }
            , new Object[] {
            T000J31_A396EmprCod, T000J31_A252CliCod, T000J31_A5398Cli_Proc
            }
            , new Object[] {
            T000J32_A396EmprCod, T000J32_A5130PagIden
            }
            , new Object[] {
            T000J33_A396EmprCod, T000J33_A5059Hl_hdr, T000J33_A5060Hl_hdrr, T000J33_A5061Hl_hdrp
            }
            , new Object[] {
            T000J34_A396EmprCod, T000J34_A252CliCod, T000J34_A4718DishCod, T000J34_A5020TipEstCod, T000J34_A5022GraCod
            }
            , new Object[] {
            T000J35_A396EmprCod, T000J35_A4618EnsLCod
            }
            , new Object[] {
            T000J36_A396EmprCod, T000J36_A4492HreBarCod, T000J36_A4493HreBarReo, T000J36_A4494HreBarPar, T000J36_A4495HreNumCie
            }
            , new Object[] {
            T000J37_A396EmprCod, T000J37_A252CliCod, T000J37_A4415EstCol
            }
            , new Object[] {
            T000J38_A396EmprCod, T000J38_A4185WEBUSU
            }
            , new Object[] {
            T000J39_A396EmprCod, T000J39_A252CliCod, T000J39_A4079WEBDISCOD, T000J39_A4078EMPCOD
            }
            , new Object[] {
            T000J40_A396EmprCod, T000J40_A2637HisEstHRu, T000J40_A2636HisEstHRe, T000J40_A2635HisEstHPa, T000J40_A2638HisEstLCo, T000J40_A2630HisEstCom, T000J40_A2634HisEstFon
            }
            , new Object[] {
            T000J41_A396EmprCod, T000J41_A2574GrpDibCod
            }
            , new Object[] {
            T000J42_A396EmprCod, T000J42_A2558GrmDibCod
            }
            , new Object[] {
            T000J43_A396EmprCod, T000J43_A2542GrcDibCod
            }
            , new Object[] {
            T000J44_A396EmprCod, T000J44_A1031EmpesCod, T000J44_A252CliCod, T000J44_A1032FonCod
            }
            , new Object[] {
            T000J45_A396EmprCod, T000J45_A1013DibCli, T000J45_A252CliCod, T000J45_A1014DibInt
            }
            , new Object[] {
            T000J46_A396EmprCod, T000J46_A1736AlbExtCod
            }
            , new Object[] {
            T000J47_A396EmprCod, T000J47_A252CliCod, T000J47_A3661FacProAny, T000J47_A3662FacProSer, T000J47_A3663FacProInt, T000J47_A3664FacProTip, T000J47_A3665FacProTar
            }
            , new Object[] {
            T000J48_A396EmprCod, T000J48_A3646EstTinAny, T000J48_A3647EstTinMes, T000J48_A3648EstTinDia, T000J48_A1929EstTinNr
            }
            , new Object[] {
            T000J49_A396EmprCod, T000J49_A3617AlbTrnCod
            }
            , new Object[] {
            T000J50_A396EmprCod, T000J50_A252CliCod, T000J50_A3320CliLimKgs
            }
            , new Object[] {
            T000J51_A396EmprCod, T000J51_A3073RepCod, T000J51_A252CliCod
            }
            , new Object[] {
            T000J52_A396EmprCod, T000J52_A3061Codia, T000J52_A3062CoMes, T000J52_A3063CoAny, T000J52_A3065CoLin, T000J52_A3010CoBarCod, T000J52_A3011CoBarReo, T000J52_A3012CoBarPar
            }
            , new Object[] {
            T000J53_A396EmprCod, T000J53_A2971SabFacCod
            }
            , new Object[] {
            T000J54_A396EmprCod, T000J54_A2954TiDia, T000J54_A2955TiMes, T000J54_A2956TiAny, T000J54_A2958TiLin, T000J54_A2959TiBarCod, T000J54_A2960TiBarReo, T000J54_A2961TiBarPar
            }
            , new Object[] {
            T000J55_A396EmprCod, T000J55_A252CliCod, T000J55_A2933RecTipCon
            }
            , new Object[] {
            T000J56_A396EmprCod, T000J56_A252CliCod, T000J56_A2927RecProCod
            }
            , new Object[] {
            T000J57_A396EmprCod, T000J57_A252CliCod, T000J57_A2891HMaForSer, T000J57_A2892HMaForCNom, T000J57_A2893HMaForCNum, T000J57_A2894HMaTipCCod, T000J57_A2895HMaForNumC, T000J57_A2897HMaColLin, T000J57_A2896HMaFec, T000J57_A2907HmaLin
            }
            , new Object[] {
            T000J58_A396EmprCod, T000J58_A252CliCod, T000J58_A425EstAny, T000J58_A2755EstSerFac
            }
            , new Object[] {
            T000J59_A396EmprCod, T000J59_A2730RecTipCo, T000J59_A252CliCod
            }
            , new Object[] {
            T000J60_A396EmprCod, T000J60_A2720TarSec, T000J60_A252CliCod, T000J60_A829TipArtCod, T000J60_A831TipColCod
            }
            , new Object[] {
            T000J61_A396EmprCod, T000J61_A2382AbcTerCod, T000J61_A2381AbcSec, T000J61_A252CliCod
            }
            , new Object[] {
            T000J62_A396EmprCod, T000J62_A252CliCod, T000J62_A2308CliDesCod
            }
            , new Object[] {
            T000J63_A396EmprCod, T000J63_A2268MovParCod, T000J63_A252CliCod
            }
            , new Object[] {
            T000J64_A396EmprCod, T000J64_A966PartCod, T000J64_A252CliCod
            }
            , new Object[] {
            T000J65_A396EmprCod, T000J65_A1387AlbPrvCod
            }
            , new Object[] {
            T000J66_A396EmprCod, T000J66_A252CliCod, T000J66_A1213TalCod
            }
            , new Object[] {
            T000J67_A396EmprCod, T000J67_A252CliCod, T000J67_A457FasCod
            }
            , new Object[] {
            T000J68_A396EmprCod, T000J68_A539HisBarCod, T000J68_A545HisCodReo, T000J68_A544HisCodPar, T000J68_A833TipDefCod
            }
            , new Object[] {
            T000J69_A396EmprCod, T000J69_A506HbaBarCod, T000J69_A508HbaBarReo, T000J69_A507HbaBarPar
            }
            , new Object[] {
            T000J70_A396EmprCod, T000J70_A252CliCod, T000J70_A494ForSer, T000J70_A482ForColNom, T000J70_A483ForColNum, T000J70_A831TipColCod
            }
            , new Object[] {
            T000J71_A396EmprCod, T000J71_A252CliCod, T000J71_A287CliPagLin
            }
            , new Object[] {
            T000J72_A396EmprCod, T000J72_A1453DevGenHil
            }
            , new Object[] {
            T000J73_A396EmprCod, T000J73_A252CliCod, T000J73_A65ArtCod
            }
            , new Object[] {
            T000J74_A396EmprCod, T000J74_A44AlbRecCod
            }
            , new Object[] {
            T000J75_A396EmprCod, T000J75_A30AlbProCod
            }
            , new Object[] {
            T000J76_A396EmprCod, T000J76_A14AlbComCod
            }
            , new Object[] {
            }
            , new Object[] {
            T000J78_A396EmprCod, T000J78_A252CliCod
            }
            , new Object[] {
            T000J79_A252CliCod, T000J79_A266CliEnvLin, T000J79_A689CliEnvAg, T000J79_A267CliEnvNom, T000J79_A5531CliEnvNm2, T000J79_A265CliEnvDom, T000J79_A5530CliEnvDm2, T000J79_A268CliEnvPob, T000J79_A264CliEnvCp, T000J79_A10775CliEnvCp2,
            T000J79_A269CliEnvPrn, T000J79_n269CliEnvPrn, T000J79_A723CliEnvTp, T000J79_A10051CliEnvMail, T000J79_A10052CliEnvFx, T000J79_A270CliEnvPrv, T000J79_A396EmprCod
            }
            , new Object[] {
            T000J80_A269CliEnvPrn, T000J80_n269CliEnvPrn
            }
            , new Object[] {
            T000J81_A396EmprCod, T000J81_A252CliCod, T000J81_A266CliEnvLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000J85_A269CliEnvPrn, T000J85_n269CliEnvPrn
            }
            , new Object[] {
            T000J86_A396EmprCod, T000J86_A3617AlbTrnCod
            }
            , new Object[] {
            T000J87_A396EmprCod, T000J87_A1453DevGenHil
            }
            , new Object[] {
            T000J88_A396EmprCod, T000J88_A252CliCod, T000J88_A266CliEnvLin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      Z689CliEnvAg = httpContext.getMessage( "N", "") ;
      A689CliEnvAg = httpContext.getMessage( "N", "") ;
      i689CliEnvAg = httpContext.getMessage( "N", "") ;
   }

   private byte Z271CliEnvUli ;
   private byte O271CliEnvUli ;
   private byte Z266CliEnvLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A271CliEnvUli ;
   private byte Gx_BScreen ;
   private byte B271CliEnvUli ;
   private byte s271CliEnvUli ;
   private byte A266CliEnvLin ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i271CliEnvUli ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short Z723CliEnvTp ;
   private short Z270CliEnvPrv ;
   private short nRcdDeleted_22 ;
   private short nRcdExists_22 ;
   private short nIsMod_22 ;
   private short A723CliEnvTp ;
   private short A270CliEnvPrv ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount22 ;
   private short RcdFound22 ;
   private short nBlankRcdUsr22 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_22 ;
   private short GXv_int10[] ;
   private int wcpOAV32CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int AV32CliCod ;
   private int trnEnded ;
   private int divTablemain_Height ;
   private int A252CliCod ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtCliEnvLin_Enabled ;
   private int edtCliEnvNom_Enabled ;
   private int edtCliEnvNm2_Enabled ;
   private int edtCliEnvDom_Enabled ;
   private int edtCliEnvDm2_Enabled ;
   private int edtCliEnvPob_Enabled ;
   private int edtCliEnvCp_Enabled ;
   private int edtCliEnvCp2_Enabled ;
   private int edtCliEnvPrv_Enabled ;
   private int edtCliEnvPrn_Enabled ;
   private int edtCliEnvTp_Enabled ;
   private int edtCliEnvNmt_Enabled ;
   private int edtCliEnvMail_Enabled ;
   private int edtCliEnvFx_Enabled ;
   private int fRowAdded ;
   private int Combo_clienvprv_Datalistupdateminimumcharacters ;
   private int Combo_clienvtp_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtCliEnvNmt_Enabled ;
   private int defedtCliEnvPrn_Enabled ;
   private int defedtCliEnvLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV31EmprCod ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z689CliEnvAg ;
   private String Z267CliEnvNom ;
   private String Z5531CliEnvNm2 ;
   private String Z265CliEnvDom ;
   private String Z5530CliEnvDm2 ;
   private String Z268CliEnvPob ;
   private String Z264CliEnvCp ;
   private String Z10775CliEnvCp2 ;
   private String Z10051CliEnvMail ;
   private String Z10052CliEnvFx ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV31EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCliCod_Internalname ;
   private String sGXsfl_32_idx="0001" ;
   private String edtCliEnvTp_Horizontalalignment ;
   private String edtCliEnvTp_Internalname ;
   private String edtCliEnvPrv_Horizontalalignment ;
   private String edtCliEnvPrv_Internalname ;
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
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_clienvprv_Caption ;
   private String Combo_clienvprv_Cls ;
   private String Combo_clienvprv_Internalname ;
   private String Combo_clienvtp_Caption ;
   private String Combo_clienvtp_Cls ;
   private String Combo_clienvtp_Internalname ;
   private String sMode22 ;
   private String edtCliEnvLin_Internalname ;
   private String edtCliEnvNom_Internalname ;
   private String edtCliEnvNm2_Internalname ;
   private String edtCliEnvDom_Internalname ;
   private String edtCliEnvDm2_Internalname ;
   private String edtCliEnvPob_Internalname ;
   private String edtCliEnvCp_Internalname ;
   private String edtCliEnvCp2_Internalname ;
   private String edtCliEnvPrn_Internalname ;
   private String edtCliEnvNmt_Internalname ;
   private String edtCliEnvMail_Internalname ;
   private String edtCliEnvFx_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_clienvprv_Objectcall ;
   private String Combo_clienvprv_Class ;
   private String Combo_clienvprv_Icontype ;
   private String Combo_clienvprv_Icon ;
   private String Combo_clienvprv_Tooltip ;
   private String Combo_clienvprv_Selectedvalue_set ;
   private String Combo_clienvprv_Selectedvalue_get ;
   private String Combo_clienvprv_Selectedtext_set ;
   private String Combo_clienvprv_Selectedtext_get ;
   private String Combo_clienvprv_Gamoauthtoken ;
   private String Combo_clienvprv_Ddointernalname ;
   private String Combo_clienvprv_Titlecontrolalign ;
   private String Combo_clienvprv_Dropdownoptionstype ;
   private String Combo_clienvprv_Titlecontrolidtoreplace ;
   private String Combo_clienvprv_Datalisttype ;
   private String Combo_clienvprv_Datalistfixedvalues ;
   private String Combo_clienvprv_Datalistproc ;
   private String Combo_clienvprv_Datalistprocparametersprefix ;
   private String Combo_clienvprv_Remoteservicesparameters ;
   private String Combo_clienvprv_Htmltemplate ;
   private String Combo_clienvprv_Multiplevaluestype ;
   private String Combo_clienvprv_Loadingdata ;
   private String Combo_clienvprv_Noresultsfound ;
   private String Combo_clienvprv_Emptyitemtext ;
   private String Combo_clienvprv_Onlyselectedvalues ;
   private String Combo_clienvprv_Selectalltext ;
   private String Combo_clienvprv_Multiplevaluesseparator ;
   private String Combo_clienvprv_Addnewoptiontext ;
   private String Combo_clienvtp_Objectcall ;
   private String Combo_clienvtp_Class ;
   private String Combo_clienvtp_Icontype ;
   private String Combo_clienvtp_Icon ;
   private String Combo_clienvtp_Tooltip ;
   private String Combo_clienvtp_Selectedvalue_set ;
   private String Combo_clienvtp_Selectedvalue_get ;
   private String Combo_clienvtp_Selectedtext_set ;
   private String Combo_clienvtp_Selectedtext_get ;
   private String Combo_clienvtp_Gamoauthtoken ;
   private String Combo_clienvtp_Ddointernalname ;
   private String Combo_clienvtp_Titlecontrolalign ;
   private String Combo_clienvtp_Dropdownoptionstype ;
   private String Combo_clienvtp_Titlecontrolidtoreplace ;
   private String Combo_clienvtp_Datalisttype ;
   private String Combo_clienvtp_Datalistfixedvalues ;
   private String Combo_clienvtp_Datalistproc ;
   private String Combo_clienvtp_Datalistprocparametersprefix ;
   private String Combo_clienvtp_Remoteservicesparameters ;
   private String Combo_clienvtp_Htmltemplate ;
   private String Combo_clienvtp_Multiplevaluestype ;
   private String Combo_clienvtp_Loadingdata ;
   private String Combo_clienvtp_Noresultsfound ;
   private String Combo_clienvtp_Emptyitemtext ;
   private String Combo_clienvtp_Onlyselectedvalues ;
   private String Combo_clienvtp_Selectalltext ;
   private String Combo_clienvtp_Multiplevaluesseparator ;
   private String Combo_clienvtp_Addnewoptiontext ;
   private String hsh ;
   private String sMode21 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A267CliEnvNom ;
   private String A5531CliEnvNm2 ;
   private String A265CliEnvDom ;
   private String A5530CliEnvDm2 ;
   private String A268CliEnvPob ;
   private String A264CliEnvCp ;
   private String A10775CliEnvCp2 ;
   private String A269CliEnvPrn ;
   private String A689CliEnvAg ;
   private String A693CliEnvNmt ;
   private String A10051CliEnvMail ;
   private String A10052CliEnvFx ;
   private String AV25Station ;
   private String AV26EmprNom ;
   private String AV22UsurCod ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z269CliEnvPrn ;
   private String GXCCtl ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtCliEnvLin_Jsonclick ;
   private String edtCliEnvNom_Jsonclick ;
   private String edtCliEnvNm2_Jsonclick ;
   private String edtCliEnvDom_Jsonclick ;
   private String edtCliEnvDm2_Jsonclick ;
   private String edtCliEnvPob_Jsonclick ;
   private String edtCliEnvCp_Jsonclick ;
   private String edtCliEnvCp2_Jsonclick ;
   private String edtCliEnvPrv_Jsonclick ;
   private String edtCliEnvPrn_Jsonclick ;
   private String edtCliEnvTp_Jsonclick ;
   private String edtCliEnvNmt_Jsonclick ;
   private String edtCliEnvMail_Jsonclick ;
   private String edtCliEnvFx_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i689CliEnvAg ;
   private String subGridlevel_level1_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z693CliEnvNmt ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean n271CliEnvUli ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_clienvprv_Isgriditem ;
   private boolean Combo_clienvprv_Emptyitem ;
   private boolean Combo_clienvtp_Isgriditem ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_clienvprv_Enabled ;
   private boolean Combo_clienvprv_Visible ;
   private boolean Combo_clienvprv_Allowmultipleselection ;
   private boolean Combo_clienvprv_Hasdescription ;
   private boolean Combo_clienvprv_Includeonlyselectedoption ;
   private boolean Combo_clienvprv_Includeselectalloption ;
   private boolean Combo_clienvprv_Includeaddnewoption ;
   private boolean Combo_clienvtp_Enabled ;
   private boolean Combo_clienvtp_Visible ;
   private boolean Combo_clienvtp_Allowmultipleselection ;
   private boolean Combo_clienvtp_Hasdescription ;
   private boolean Combo_clienvtp_Includeonlyselectedoption ;
   private boolean Combo_clienvtp_Includeselectalloption ;
   private boolean Combo_clienvtp_Emptyitem ;
   private boolean Combo_clienvtp_Includeaddnewoption ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n269CliEnvPrn ;
   private boolean Gx_longc ;
   private String AV37ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV35WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clienvprv ;
   private com.genexus.webpanels.GXUserControl ucCombo_clienvtp ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCliEnvAg ;
   private IDataStoreProvider pr_default ;
   private String[] T000J7_A407EmprNom ;
   private boolean[] T000J7_n407EmprNom ;
   private int[] T000J8_A252CliCod ;
   private boolean[] T000J8_n252CliCod ;
   private String[] T000J8_A279CliNom ;
   private byte[] T000J8_A271CliEnvUli ;
   private boolean[] T000J8_n271CliEnvUli ;
   private String[] T000J8_A407EmprNom ;
   private boolean[] T000J8_n407EmprNom ;
   private String[] T000J8_A396EmprCod ;
   private String[] T000J9_A396EmprCod ;
   private int[] T000J9_A252CliCod ;
   private boolean[] T000J9_n252CliCod ;
   private int[] T000J6_A252CliCod ;
   private boolean[] T000J6_n252CliCod ;
   private String[] T000J6_A279CliNom ;
   private byte[] T000J6_A271CliEnvUli ;
   private boolean[] T000J6_n271CliEnvUli ;
   private String[] T000J6_A396EmprCod ;
   private String[] T000J10_A396EmprCod ;
   private int[] T000J10_A252CliCod ;
   private boolean[] T000J10_n252CliCod ;
   private String[] T000J11_A396EmprCod ;
   private int[] T000J11_A252CliCod ;
   private boolean[] T000J11_n252CliCod ;
   private int[] T000J5_A252CliCod ;
   private boolean[] T000J5_n252CliCod ;
   private String[] T000J5_A279CliNom ;
   private byte[] T000J5_A271CliEnvUli ;
   private boolean[] T000J5_n271CliEnvUli ;
   private String[] T000J5_A396EmprCod ;
   private String[] T000J15_A396EmprCod ;
   private int[] T000J15_A252CliCod ;
   private boolean[] T000J15_n252CliCod ;
   private int[] T000J15_A6930Lb_rclin ;
   private String[] T000J16_A396EmprCod ;
   private int[] T000J16_A6850Tex_NPed ;
   private String[] T000J17_A396EmprCod ;
   private int[] T000J17_A252CliCod ;
   private boolean[] T000J17_n252CliCod ;
   private short[] T000J17_A829TipArtCod ;
   private byte[] T000J17_A831TipColCod ;
   private byte[] T000J17_A583IntCod ;
   private String[] T000J17_A5098TipDisCod ;
   private short[] T000J17_A6603Est1_anyo ;
   private byte[] T000J17_A6604Est1_mes ;
   private byte[] T000J17_A6605Est1_dia ;
   private String[] T000J18_A396EmprCod ;
   private int[] T000J18_A6319C_Barcod ;
   private byte[] T000J18_A6320C_Barcodre ;
   private String[] T000J18_A6321C_Barcodpa ;
   private short[] T000J18_A6322C_Reclinma ;
   private String[] T000J19_A396EmprCod ;
   private int[] T000J19_A6235DevEmpCod ;
   private String[] T000J20_A396EmprCod ;
   private String[] T000J20_A602MaqCod ;
   private int[] T000J20_A6078MaqCliCod ;
   private String[] T000J20_A6079MaqArtCod ;
   private String[] T000J21_A396EmprCod ;
   private int[] T000J21_A5532Lb_numero ;
   private String[] T000J22_A396EmprCod ;
   private int[] T000J22_A252CliCod ;
   private boolean[] T000J22_n252CliCod ;
   private short[] T000J22_A5503CliifLin ;
   private String[] T000J23_A396EmprCod ;
   private int[] T000J23_A252CliCod ;
   private boolean[] T000J23_n252CliCod ;
   private short[] T000J23_A5499ClieiLin ;
   private String[] T000J24_A396EmprCod ;
   private int[] T000J24_A252CliCod ;
   private boolean[] T000J24_n252CliCod ;
   private short[] T000J24_A5495ClidtLin ;
   private String[] T000J25_A396EmprCod ;
   private int[] T000J25_A252CliCod ;
   private boolean[] T000J25_n252CliCod ;
   private short[] T000J25_A5491CliedLin ;
   private String[] T000J26_A396EmprCod ;
   private int[] T000J26_A252CliCod ;
   private boolean[] T000J26_n252CliCod ;
   private String[] T000J26_A5452P_ForCod ;
   private String[] T000J27_A396EmprCod ;
   private int[] T000J27_A252CliCod ;
   private boolean[] T000J27_n252CliCod ;
   private String[] T000J27_A5443Mdl_Cod ;
   private String[] T000J28_A396EmprCod ;
   private int[] T000J28_A252CliCod ;
   private boolean[] T000J28_n252CliCod ;
   private short[] T000J28_A5436IntCodF2 ;
   private String[] T000J29_A396EmprCod ;
   private int[] T000J29_A252CliCod ;
   private boolean[] T000J29_n252CliCod ;
   private byte[] T000J29_A5396IntCodFC ;
   private byte[] T000J29_A5434Tip_ColC ;
   private String[] T000J30_A396EmprCod ;
   private int[] T000J30_A252CliCod ;
   private boolean[] T000J30_n252CliCod ;
   private String[] T000J30_A5428FasPreCod ;
   private String[] T000J31_A396EmprCod ;
   private int[] T000J31_A252CliCod ;
   private boolean[] T000J31_n252CliCod ;
   private String[] T000J31_A5398Cli_Proc ;
   private String[] T000J32_A396EmprCod ;
   private int[] T000J32_A5130PagIden ;
   private String[] T000J33_A396EmprCod ;
   private int[] T000J33_A5059Hl_hdr ;
   private byte[] T000J33_A5060Hl_hdrr ;
   private String[] T000J33_A5061Hl_hdrp ;
   private String[] T000J34_A396EmprCod ;
   private int[] T000J34_A252CliCod ;
   private boolean[] T000J34_n252CliCod ;
   private String[] T000J34_A4718DishCod ;
   private byte[] T000J34_A5020TipEstCod ;
   private byte[] T000J34_A5022GraCod ;
   private String[] T000J35_A396EmprCod ;
   private int[] T000J35_A4618EnsLCod ;
   private String[] T000J36_A396EmprCod ;
   private int[] T000J36_A4492HreBarCod ;
   private byte[] T000J36_A4493HreBarReo ;
   private String[] T000J36_A4494HreBarPar ;
   private byte[] T000J36_A4495HreNumCie ;
   private String[] T000J37_A396EmprCod ;
   private int[] T000J37_A252CliCod ;
   private boolean[] T000J37_n252CliCod ;
   private String[] T000J37_A4415EstCol ;
   private String[] T000J38_A396EmprCod ;
   private String[] T000J38_A4185WEBUSU ;
   private String[] T000J39_A396EmprCod ;
   private int[] T000J39_A252CliCod ;
   private boolean[] T000J39_n252CliCod ;
   private String[] T000J39_A4079WEBDISCOD ;
   private String[] T000J39_A4078EMPCOD ;
   private String[] T000J40_A396EmprCod ;
   private int[] T000J40_A2637HisEstHRu ;
   private byte[] T000J40_A2636HisEstHRe ;
   private String[] T000J40_A2635HisEstHPa ;
   private byte[] T000J40_A2638HisEstLCo ;
   private String[] T000J40_A2630HisEstCom ;
   private String[] T000J40_A2634HisEstFon ;
   private String[] T000J41_A396EmprCod ;
   private int[] T000J41_A2574GrpDibCod ;
   private String[] T000J42_A396EmprCod ;
   private int[] T000J42_A2558GrmDibCod ;
   private String[] T000J43_A396EmprCod ;
   private int[] T000J43_A2542GrcDibCod ;
   private String[] T000J44_A396EmprCod ;
   private String[] T000J44_A1031EmpesCod ;
   private int[] T000J44_A252CliCod ;
   private boolean[] T000J44_n252CliCod ;
   private String[] T000J44_A1032FonCod ;
   private String[] T000J45_A396EmprCod ;
   private String[] T000J45_A1013DibCli ;
   private int[] T000J45_A252CliCod ;
   private boolean[] T000J45_n252CliCod ;
   private int[] T000J45_A1014DibInt ;
   private String[] T000J46_A396EmprCod ;
   private long[] T000J46_A1736AlbExtCod ;
   private String[] T000J47_A396EmprCod ;
   private int[] T000J47_A252CliCod ;
   private boolean[] T000J47_n252CliCod ;
   private short[] T000J47_A3661FacProAny ;
   private String[] T000J47_A3662FacProSer ;
   private byte[] T000J47_A3663FacProInt ;
   private byte[] T000J47_A3664FacProTip ;
   private short[] T000J47_A3665FacProTar ;
   private String[] T000J48_A396EmprCod ;
   private short[] T000J48_A3646EstTinAny ;
   private byte[] T000J48_A3647EstTinMes ;
   private byte[] T000J48_A3648EstTinDia ;
   private short[] T000J48_A1929EstTinNr ;
   private String[] T000J49_A396EmprCod ;
   private long[] T000J49_A3617AlbTrnCod ;
   private String[] T000J50_A396EmprCod ;
   private int[] T000J50_A252CliCod ;
   private boolean[] T000J50_n252CliCod ;
   private java.math.BigDecimal[] T000J50_A3320CliLimKgs ;
   private String[] T000J51_A396EmprCod ;
   private String[] T000J51_A3073RepCod ;
   private int[] T000J51_A252CliCod ;
   private boolean[] T000J51_n252CliCod ;
   private String[] T000J52_A396EmprCod ;
   private byte[] T000J52_A3061Codia ;
   private byte[] T000J52_A3062CoMes ;
   private short[] T000J52_A3063CoAny ;
   private byte[] T000J52_A3065CoLin ;
   private int[] T000J52_A3010CoBarCod ;
   private byte[] T000J52_A3011CoBarReo ;
   private String[] T000J52_A3012CoBarPar ;
   private String[] T000J53_A396EmprCod ;
   private int[] T000J53_A2971SabFacCod ;
   private String[] T000J54_A396EmprCod ;
   private byte[] T000J54_A2954TiDia ;
   private byte[] T000J54_A2955TiMes ;
   private short[] T000J54_A2956TiAny ;
   private byte[] T000J54_A2958TiLin ;
   private int[] T000J54_A2959TiBarCod ;
   private byte[] T000J54_A2960TiBarReo ;
   private String[] T000J54_A2961TiBarPar ;
   private String[] T000J55_A396EmprCod ;
   private int[] T000J55_A252CliCod ;
   private boolean[] T000J55_n252CliCod ;
   private short[] T000J55_A2933RecTipCon ;
   private String[] T000J56_A396EmprCod ;
   private int[] T000J56_A252CliCod ;
   private boolean[] T000J56_n252CliCod ;
   private String[] T000J56_A2927RecProCod ;
   private String[] T000J57_A396EmprCod ;
   private int[] T000J57_A252CliCod ;
   private boolean[] T000J57_n252CliCod ;
   private String[] T000J57_A2891HMaForSer ;
   private String[] T000J57_A2892HMaForCNom ;
   private int[] T000J57_A2893HMaForCNum ;
   private byte[] T000J57_A2894HMaTipCCod ;
   private int[] T000J57_A2895HMaForNumC ;
   private short[] T000J57_A2897HMaColLin ;
   private java.util.Date[] T000J57_A2896HMaFec ;
   private short[] T000J57_A2907HmaLin ;
   private String[] T000J58_A396EmprCod ;
   private int[] T000J58_A252CliCod ;
   private boolean[] T000J58_n252CliCod ;
   private short[] T000J58_A425EstAny ;
   private String[] T000J58_A2755EstSerFac ;
   private String[] T000J59_A396EmprCod ;
   private short[] T000J59_A2730RecTipCo ;
   private int[] T000J59_A252CliCod ;
   private boolean[] T000J59_n252CliCod ;
   private String[] T000J60_A396EmprCod ;
   private String[] T000J60_A2720TarSec ;
   private int[] T000J60_A252CliCod ;
   private boolean[] T000J60_n252CliCod ;
   private short[] T000J60_A829TipArtCod ;
   private byte[] T000J60_A831TipColCod ;
   private String[] T000J61_A396EmprCod ;
   private String[] T000J61_A2382AbcTerCod ;
   private String[] T000J61_A2381AbcSec ;
   private int[] T000J61_A252CliCod ;
   private boolean[] T000J61_n252CliCod ;
   private String[] T000J62_A396EmprCod ;
   private int[] T000J62_A252CliCod ;
   private boolean[] T000J62_n252CliCod ;
   private int[] T000J62_A2308CliDesCod ;
   private String[] T000J63_A396EmprCod ;
   private String[] T000J63_A2268MovParCod ;
   private int[] T000J63_A252CliCod ;
   private boolean[] T000J63_n252CliCod ;
   private String[] T000J64_A396EmprCod ;
   private String[] T000J64_A966PartCod ;
   private int[] T000J64_A252CliCod ;
   private boolean[] T000J64_n252CliCod ;
   private String[] T000J65_A396EmprCod ;
   private int[] T000J65_A1387AlbPrvCod ;
   private String[] T000J66_A396EmprCod ;
   private int[] T000J66_A252CliCod ;
   private boolean[] T000J66_n252CliCod ;
   private String[] T000J66_A1213TalCod ;
   private String[] T000J67_A396EmprCod ;
   private int[] T000J67_A252CliCod ;
   private boolean[] T000J67_n252CliCod ;
   private String[] T000J67_A457FasCod ;
   private String[] T000J68_A396EmprCod ;
   private int[] T000J68_A539HisBarCod ;
   private byte[] T000J68_A545HisCodReo ;
   private String[] T000J68_A544HisCodPar ;
   private short[] T000J68_A833TipDefCod ;
   private String[] T000J69_A396EmprCod ;
   private int[] T000J69_A506HbaBarCod ;
   private byte[] T000J69_A508HbaBarReo ;
   private String[] T000J69_A507HbaBarPar ;
   private String[] T000J70_A396EmprCod ;
   private int[] T000J70_A252CliCod ;
   private boolean[] T000J70_n252CliCod ;
   private String[] T000J70_A494ForSer ;
   private String[] T000J70_A482ForColNom ;
   private int[] T000J70_A483ForColNum ;
   private byte[] T000J70_A831TipColCod ;
   private String[] T000J71_A396EmprCod ;
   private int[] T000J71_A252CliCod ;
   private boolean[] T000J71_n252CliCod ;
   private byte[] T000J71_A287CliPagLin ;
   private String[] T000J72_A396EmprCod ;
   private int[] T000J72_A1453DevGenHil ;
   private String[] T000J73_A396EmprCod ;
   private int[] T000J73_A252CliCod ;
   private boolean[] T000J73_n252CliCod ;
   private String[] T000J73_A65ArtCod ;
   private String[] T000J74_A396EmprCod ;
   private int[] T000J74_A44AlbRecCod ;
   private String[] T000J75_A396EmprCod ;
   private long[] T000J75_A30AlbProCod ;
   private String[] T000J76_A396EmprCod ;
   private int[] T000J76_A14AlbComCod ;
   private String[] T000J78_A396EmprCod ;
   private int[] T000J78_A252CliCod ;
   private boolean[] T000J78_n252CliCod ;
   private int[] T000J79_A252CliCod ;
   private boolean[] T000J79_n252CliCod ;
   private byte[] T000J79_A266CliEnvLin ;
   private String[] T000J79_A689CliEnvAg ;
   private String[] T000J79_A267CliEnvNom ;
   private String[] T000J79_A5531CliEnvNm2 ;
   private String[] T000J79_A265CliEnvDom ;
   private String[] T000J79_A5530CliEnvDm2 ;
   private String[] T000J79_A268CliEnvPob ;
   private String[] T000J79_A264CliEnvCp ;
   private String[] T000J79_A10775CliEnvCp2 ;
   private String[] T000J79_A269CliEnvPrn ;
   private boolean[] T000J79_n269CliEnvPrn ;
   private short[] T000J79_A723CliEnvTp ;
   private String[] T000J79_A10051CliEnvMail ;
   private String[] T000J79_A10052CliEnvFx ;
   private short[] T000J79_A270CliEnvPrv ;
   private String[] T000J79_A396EmprCod ;
   private String[] T000J4_A269CliEnvPrn ;
   private boolean[] T000J4_n269CliEnvPrn ;
   private String[] T000J80_A269CliEnvPrn ;
   private boolean[] T000J80_n269CliEnvPrn ;
   private String[] T000J81_A396EmprCod ;
   private int[] T000J81_A252CliCod ;
   private boolean[] T000J81_n252CliCod ;
   private byte[] T000J81_A266CliEnvLin ;
   private int[] T000J3_A252CliCod ;
   private boolean[] T000J3_n252CliCod ;
   private byte[] T000J3_A266CliEnvLin ;
   private String[] T000J3_A689CliEnvAg ;
   private String[] T000J3_A267CliEnvNom ;
   private String[] T000J3_A5531CliEnvNm2 ;
   private String[] T000J3_A265CliEnvDom ;
   private String[] T000J3_A5530CliEnvDm2 ;
   private String[] T000J3_A268CliEnvPob ;
   private String[] T000J3_A264CliEnvCp ;
   private String[] T000J3_A10775CliEnvCp2 ;
   private short[] T000J3_A723CliEnvTp ;
   private String[] T000J3_A10051CliEnvMail ;
   private String[] T000J3_A10052CliEnvFx ;
   private short[] T000J3_A270CliEnvPrv ;
   private String[] T000J3_A396EmprCod ;
   private int[] T000J2_A252CliCod ;
   private boolean[] T000J2_n252CliCod ;
   private byte[] T000J2_A266CliEnvLin ;
   private String[] T000J2_A689CliEnvAg ;
   private String[] T000J2_A267CliEnvNom ;
   private String[] T000J2_A5531CliEnvNm2 ;
   private String[] T000J2_A265CliEnvDom ;
   private String[] T000J2_A5530CliEnvDm2 ;
   private String[] T000J2_A268CliEnvPob ;
   private String[] T000J2_A264CliEnvCp ;
   private String[] T000J2_A10775CliEnvCp2 ;
   private short[] T000J2_A723CliEnvTp ;
   private String[] T000J2_A10051CliEnvMail ;
   private String[] T000J2_A10052CliEnvFx ;
   private short[] T000J2_A270CliEnvPrv ;
   private String[] T000J2_A396EmprCod ;
   private String[] T000J85_A269CliEnvPrn ;
   private boolean[] T000J85_n269CliEnvPrn ;
   private String[] T000J86_A396EmprCod ;
   private long[] T000J86_A3617AlbTrnCod ;
   private String[] T000J87_A396EmprCod ;
   private int[] T000J87_A1453DevGenHil ;
   private String[] T000J88_A396EmprCod ;
   private int[] T000J88_A252CliCod ;
   private boolean[] T000J88_n252CliCod ;
   private byte[] T000J88_A266CliEnvLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV36CliEnvPrv_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV38CliEnvTp_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV33WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV34TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV39DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tclienv__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclienv__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclienv__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclienv__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclienv__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000J2", "SELECT CliCod, CliEnvLin, CliEnvAg, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvTp, CliEnvMail, CliEnvFx, CliEnvPrv, EmprCod FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?  FOR UPDATE OF CliEnvAg, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvTp, CliEnvMail, CliEnvFx, CliEnvPrv NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J3", "SELECT CliCod, CliEnvLin, CliEnvAg, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvTp, CliEnvMail, CliEnvFx, CliEnvPrv, EmprCod FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J4", "SELECT PrvDsc AS CliEnvPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J5", "SELECT CliCod, CliNom, CliEnvUli, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, CliEnvUli NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J6", "SELECT CliCod, CliNom, CliEnvUli, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J8", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, TM1.CliNom, TM1.CliEnvUli, T2.EmprNom, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000J12", "INSERT INTO TXPCLIENT(CliCod, CliNom, CliEnvUli, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T000J13", "UPDATE TXPCLIENT SET CliNom=?, CliEnvUli=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T000J14", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T000J15", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J16", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J17", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J18", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J19", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J20", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J21", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J22", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J23", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J24", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J25", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J26", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J27", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J28", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J29", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J30", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J31", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J32", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J33", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J34", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J35", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J36", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J37", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J38", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J39", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J40", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J41", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J42", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J43", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J44", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J45", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J46", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J47", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J48", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J49", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J50", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J51", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J52", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J53", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J54", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J55", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J56", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J57", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J58", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J59", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J60", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J61", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J62", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J63", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J64", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J65", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J66", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J67", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J68", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J69", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J70", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J71", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J72", "SELECT * FROM (SELECT EmprCod, DevGenHil FROM TXPDEVGEH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J73", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J74", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J75", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J76", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000J77", "UPDATE TXPCLIENT SET CliEnvUli=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T000J78", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J79", "SELECT T1.CliCod, T1.CliEnvLin, T1.CliEnvAg, T1.CliEnvNom, T1.CliEnvNm2, T1.CliEnvDom, T1.CliEnvDm2, T1.CliEnvPob, T1.CliEnvCp, T1.CliEnvCp2, T2.PrvDsc AS CliEnvPrn, T1.CliEnvTp, T1.CliEnvMail, T1.CliEnvFx, T1.CliEnvPrv AS CliEnvPrv, T1.EmprCod FROM (TXPCLIENV T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliEnvPrv) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliEnvLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliEnvLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J80", "SELECT PrvDsc AS CliEnvPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J81", "SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000J82", "INSERT INTO TXPCLIENV(CliCod, CliEnvLin, CliEnvAg, CliEnvNom, CliEnvNm2, CliEnvDom, CliEnvDm2, CliEnvPob, CliEnvCp, CliEnvCp2, CliEnvTp, CliEnvMail, CliEnvFx, CliEnvPrv, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLIENV")
         ,new UpdateCursor("T000J83", "UPDATE TXPCLIENV SET CliEnvAg=?, CliEnvNom=?, CliEnvNm2=?, CliEnvDom=?, CliEnvDm2=?, CliEnvPob=?, CliEnvCp=?, CliEnvCp2=?, CliEnvTp=?, CliEnvMail=?, CliEnvFx=?, CliEnvPrv=?  WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?", GX_NOMASK, "TXPCLIENV")
         ,new UpdateCursor("T000J84", "DELETE FROM TXPCLIENV  WHERE EmprCod = ? AND CliCod = ? AND CliEnvLin = ?", GX_NOMASK, "TXPCLIENV")
         ,new ForEachCursor("T000J85", "SELECT PrvDsc AS CliEnvPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000J86", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ? AND AlbTrnEnv = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J87", "SELECT * FROM (SELECT EmprCod, DevGenHil FROM TXPDEVGEH WHERE EmprCod = ? AND CliCod = ? AND DevDomEnv = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000J88", "SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliEnvLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 34);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 34);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 20);
               ((short[]) buf[13])[0] = rslt.getShort(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
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
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 55 :
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
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 77 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 34);
               ((String[]) buf[6])[0] = rslt.getString(7, 34);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((String[]) buf[8])[0] = rslt.getString(9, 6);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((String[]) buf[10])[0] = rslt.getString(11, 30);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 40);
               ((String[]) buf[14])[0] = rslt.getString(14, 20);
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 30);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               stmt.setString(4, (String)parms[5], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(2, ((Number) parms[2]).byteValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(4, ((Number) parms[5]).intValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 33 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 75 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[4]).intValue());
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 78 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 80 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setString(3, (String)parms[3], 1);
               stmt.setString(4, (String)parms[4], 30);
               stmt.setString(5, (String)parms[5], 30);
               stmt.setString(6, (String)parms[6], 34);
               stmt.setString(7, (String)parms[7], 34);
               stmt.setString(8, (String)parms[8], 30);
               stmt.setString(9, (String)parms[9], 6);
               stmt.setString(10, (String)parms[10], 6);
               stmt.setShort(11, ((Number) parms[11]).shortValue());
               stmt.setString(12, (String)parms[12], 40);
               stmt.setString(13, (String)parms[13], 20);
               stmt.setShort(14, ((Number) parms[14]).shortValue());
               stmt.setString(15, (String)parms[15], 3);
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 34);
               stmt.setString(5, (String)parms[4], 34);
               stmt.setString(6, (String)parms[5], 30);
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 40);
               stmt.setString(11, (String)parms[10], 20);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setString(13, (String)parms[12], 3);
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(14, ((Number) parms[14]).intValue());
               }
               stmt.setByte(15, ((Number) parms[15]).byteValue());
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 83 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

