package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclipag_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A291CliPagPro = (short)(GXutil.lval( httpContext.GetPar( "CliPagPro"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A291CliPagPro) ;
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
            AV35EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
            AV36CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CliCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "DOMICILIOS PAGO CLIENTES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
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
      edtCliPagPro_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagPro_Internalname, "Horizontalalignment", edtCliPagPro_Horizontalalignment, !bGXsfl_32_Refreshing);
      A292CliPagUli = (byte)(GXutil.lval( httpContext.GetPar( "CliPagUli"))) ;
      n292CliPagUli = false ;
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

   public tclipag_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclipag_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclipag_impl.class ));
   }

   public tclipag_impl( int remoteHandle ,
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIPAG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIPAG.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIPAG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIPAG.htm");
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
      ucCombo_clipagpro.setProperty("Caption", Combo_clipagpro_Caption);
      ucCombo_clipagpro.setProperty("Cls", Combo_clipagpro_Cls);
      ucCombo_clipagpro.setProperty("IsGridItem", Combo_clipagpro_Isgriditem);
      ucCombo_clipagpro.setProperty("EmptyItem", Combo_clipagpro_Emptyitem);
      ucCombo_clipagpro.setProperty("DropDownOptionsTitleSettingsIcons", AV42DDO_TitleSettingsIcons);
      ucCombo_clipagpro.setProperty("DropDownOptionsData", AV40CliPagPro_Data);
      ucCombo_clipagpro.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clipagpro_Internalname, "COMBO_CLIPAGPROContainer");
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
         nBlankRcdCount26 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_26 = (short)(1) ;
            scanStart0M26( ) ;
            while ( RcdFound26 != 0 )
            {
               init_level_properties26( ) ;
               getByPrimaryKey0M26( ) ;
               addRow0M26( ) ;
               scanNext0M26( ) ;
            }
            scanEnd0M26( ) ;
            nBlankRcdCount26 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B292CliPagUli = A292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
         standaloneNotModal0M26( ) ;
         standaloneModal0M26( ) ;
         sMode26 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow0M26( ) ;
            edtCliPagLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGNOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagNom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagDom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGDOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagDom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagHome_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGHOME_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagHome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagHome_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagPob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGPOB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPob_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagCp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagCp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGPRO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPro_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagPro_Horizontalalignment = httpContext.cgiGet( "CLIPAGPRO_"+sGXsfl_32_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagPro_Internalname, "Horizontalalignment", edtCliPagPro_Horizontalalignment, !bGXsfl_32_Refreshing);
            edtCliPagPrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGPRN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagCcb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCCB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagCcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCcb_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagCcs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCCS_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagCcs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCcs_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagDig_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGDIG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagDig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagDig_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagCue_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCUE_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagCue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCue_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPagIban_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGIBAN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPagIban_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagIban_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliNIB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINIB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliNIB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNIB_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliSwift_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLISWIFT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliSwift_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliSwift_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_26 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0M26( ) ;
            }
            sendRow0M26( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A292CliPagUli = B292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount26 = (short)(1) ;
         nRcdExists_26 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0M26( ) ;
            while ( RcdFound26 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3226( ) ;
               init_level_properties26( ) ;
               standaloneNotModal0M26( ) ;
               getByPrimaryKey0M26( ) ;
               standaloneModal0M26( ) ;
               addRow0M26( ) ;
               scanNext0M26( ) ;
            }
            scanEnd0M26( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode26 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_3226( ) ;
         initAll0M26( ) ;
         init_level_properties26( ) ;
         B292CliPagUli = A292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
         nRcdExists_26 = (short)(0) ;
         nIsMod_26 = (short)(0) ;
         nRcdDeleted_26 = (short)(0) ;
         nBlankRcdCount26 = (short)(nBlankRcdUsr26+nBlankRcdCount26) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount26 > 0 )
         {
            standaloneNotModal0M26( ) ;
            standaloneModal0M26( ) ;
            addRow0M26( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtCliPagNom_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount26 = (short)(nBlankRcdCount26-1) ;
         }
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A292CliPagUli = B292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
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
      e110M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV42DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLIPAGPRO_DATA"), AV40CliPagPro_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            Z292CliPagUli = (byte)(localUtil.ctol( httpContext.cgiGet( "Z292CliPagUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A292CliPagUli = (byte)(localUtil.ctol( httpContext.cgiGet( "Z292CliPagUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n292CliPagUli = false ;
            O292CliPagUli = (byte)(localUtil.ctol( httpContext.cgiGet( "O292CliPagUli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV36CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A292CliPagUli = (byte)(localUtil.ctol( httpContext.cgiGet( "CLIPAGULI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_clipagpro_Objectcall = httpContext.cgiGet( "COMBO_CLIPAGPRO_Objectcall") ;
            Combo_clipagpro_Class = httpContext.cgiGet( "COMBO_CLIPAGPRO_Class") ;
            Combo_clipagpro_Icontype = httpContext.cgiGet( "COMBO_CLIPAGPRO_Icontype") ;
            Combo_clipagpro_Icon = httpContext.cgiGet( "COMBO_CLIPAGPRO_Icon") ;
            Combo_clipagpro_Caption = httpContext.cgiGet( "COMBO_CLIPAGPRO_Caption") ;
            Combo_clipagpro_Tooltip = httpContext.cgiGet( "COMBO_CLIPAGPRO_Tooltip") ;
            Combo_clipagpro_Cls = httpContext.cgiGet( "COMBO_CLIPAGPRO_Cls") ;
            Combo_clipagpro_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLIPAGPRO_Selectedvalue_set") ;
            Combo_clipagpro_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLIPAGPRO_Selectedvalue_get") ;
            Combo_clipagpro_Selectedtext_set = httpContext.cgiGet( "COMBO_CLIPAGPRO_Selectedtext_set") ;
            Combo_clipagpro_Selectedtext_get = httpContext.cgiGet( "COMBO_CLIPAGPRO_Selectedtext_get") ;
            Combo_clipagpro_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLIPAGPRO_Gamoauthtoken") ;
            Combo_clipagpro_Ddointernalname = httpContext.cgiGet( "COMBO_CLIPAGPRO_Ddointernalname") ;
            Combo_clipagpro_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLIPAGPRO_Titlecontrolalign") ;
            Combo_clipagpro_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLIPAGPRO_Dropdownoptionstype") ;
            Combo_clipagpro_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Enabled")) ;
            Combo_clipagpro_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Visible")) ;
            Combo_clipagpro_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLIPAGPRO_Titlecontrolidtoreplace") ;
            Combo_clipagpro_Datalisttype = httpContext.cgiGet( "COMBO_CLIPAGPRO_Datalisttype") ;
            Combo_clipagpro_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Allowmultipleselection")) ;
            Combo_clipagpro_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLIPAGPRO_Datalistfixedvalues") ;
            Combo_clipagpro_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Isgriditem")) ;
            Combo_clipagpro_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Hasdescription")) ;
            Combo_clipagpro_Datalistproc = httpContext.cgiGet( "COMBO_CLIPAGPRO_Datalistproc") ;
            Combo_clipagpro_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLIPAGPRO_Datalistprocparametersprefix") ;
            Combo_clipagpro_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLIPAGPRO_Remoteservicesparameters") ;
            Combo_clipagpro_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLIPAGPRO_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clipagpro_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Includeonlyselectedoption")) ;
            Combo_clipagpro_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Includeselectalloption")) ;
            Combo_clipagpro_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Emptyitem")) ;
            Combo_clipagpro_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLIPAGPRO_Includeaddnewoption")) ;
            Combo_clipagpro_Htmltemplate = httpContext.cgiGet( "COMBO_CLIPAGPRO_Htmltemplate") ;
            Combo_clipagpro_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLIPAGPRO_Multiplevaluestype") ;
            Combo_clipagpro_Loadingdata = httpContext.cgiGet( "COMBO_CLIPAGPRO_Loadingdata") ;
            Combo_clipagpro_Noresultsfound = httpContext.cgiGet( "COMBO_CLIPAGPRO_Noresultsfound") ;
            Combo_clipagpro_Emptyitemtext = httpContext.cgiGet( "COMBO_CLIPAGPRO_Emptyitemtext") ;
            Combo_clipagpro_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLIPAGPRO_Onlyselectedvalues") ;
            Combo_clipagpro_Selectalltext = httpContext.cgiGet( "COMBO_CLIPAGPRO_Selectalltext") ;
            Combo_clipagpro_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLIPAGPRO_Multiplevaluesseparator") ;
            Combo_clipagpro_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLIPAGPRO_Addnewoptiontext") ;
            /* Read variables values. */
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCLIPAG");
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A252CliCod != Z252CliCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tclipag:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_0M0( ) ;
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
                        e110M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120M2 ();
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
         e120M2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll0M21( ) ;
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
         disableAttributes0M21( ) ;
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

   public void confirm_0M0( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0M21( ) ;
         }
         else
         {
            checkExtendedTable0M21( ) ;
            closeExtendedTableCursors0M21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_0M26( ) ;
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

   public void confirm_0M26( )
   {
      s292CliPagUli = O292CliPagUli ;
      n292CliPagUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow0M26( ) ;
         if ( ( nRcdExists_26 != 0 ) || ( nIsMod_26 != 0 ) )
         {
            getKey0M26( ) ;
            if ( ( nRcdExists_26 == 0 ) && ( nRcdDeleted_26 == 0 ) )
            {
               if ( RcdFound26 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0M26( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0M26( ) ;
                     closeExtendedTableCursors0M26( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O292CliPagUli = A292CliPagUli ;
                     n292CliPagUli = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                  AnyError = (short)(1) ;
               }
            }
            else
            {
               if ( RcdFound26 != 0 )
               {
                  if ( nRcdDeleted_26 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0M26( ) ;
                     load0M26( ) ;
                     beforeValidate0M26( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0M26( ) ;
                        O292CliPagUli = A292CliPagUli ;
                        n292CliPagUli = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_26 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0M26( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0M26( ) ;
                           closeExtendedTableCursors0M26( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O292CliPagUli = A292CliPagUli ;
                           n292CliPagUli = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_26 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtCliPagLin_Internalname, GXutil.ltrim( localUtil.ntoc( A287CliPagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliPagNom_Internalname, GXutil.rtrim( A288CliPagNom)) ;
         httpContext.changePostValue( edtCliPagDom_Internalname, GXutil.rtrim( A286CliPagDom)) ;
         httpContext.changePostValue( edtCliPagHome_Internalname, GXutil.rtrim( A11471CliPagHome)) ;
         httpContext.changePostValue( edtCliPagPob_Internalname, GXutil.rtrim( A289CliPagPob)) ;
         httpContext.changePostValue( edtCliPagCp_Internalname, GXutil.rtrim( A2326CliPagCp)) ;
         httpContext.changePostValue( edtCliPagPro_Internalname, GXutil.ltrim( localUtil.ntoc( A291CliPagPro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliPagPrn_Internalname, GXutil.rtrim( A290CliPagPrn)) ;
         httpContext.changePostValue( edtCliPagCcb_Internalname, GXutil.rtrim( A282CliPagCcb)) ;
         httpContext.changePostValue( edtCliPagCcs_Internalname, GXutil.rtrim( A283CliPagCcs)) ;
         httpContext.changePostValue( edtCliPagDig_Internalname, GXutil.rtrim( A285CliPagDig)) ;
         httpContext.changePostValue( edtCliPagCue_Internalname, GXutil.rtrim( A284CliPagCue)) ;
         httpContext.changePostValue( edtCliPagIban_Internalname, GXutil.rtrim( A10060CliPagIban)) ;
         httpContext.changePostValue( edtCliNIB_Internalname, GXutil.rtrim( A10415CliNIB)) ;
         httpContext.changePostValue( edtCliSwift_Internalname, GXutil.rtrim( A10416CliSwift)) ;
         httpContext.changePostValue( "ZT_"+"Z287CliPagLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z287CliPagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z288CliPagNom_"+sGXsfl_32_idx, GXutil.rtrim( Z288CliPagNom)) ;
         httpContext.changePostValue( "ZT_"+"Z286CliPagDom_"+sGXsfl_32_idx, GXutil.rtrim( Z286CliPagDom)) ;
         httpContext.changePostValue( "ZT_"+"Z11471CliPagHome_"+sGXsfl_32_idx, GXutil.rtrim( Z11471CliPagHome)) ;
         httpContext.changePostValue( "ZT_"+"Z289CliPagPob_"+sGXsfl_32_idx, GXutil.rtrim( Z289CliPagPob)) ;
         httpContext.changePostValue( "ZT_"+"Z2326CliPagCp_"+sGXsfl_32_idx, GXutil.rtrim( Z2326CliPagCp)) ;
         httpContext.changePostValue( "ZT_"+"Z282CliPagCcb_"+sGXsfl_32_idx, GXutil.rtrim( Z282CliPagCcb)) ;
         httpContext.changePostValue( "ZT_"+"Z283CliPagCcs_"+sGXsfl_32_idx, GXutil.rtrim( Z283CliPagCcs)) ;
         httpContext.changePostValue( "ZT_"+"Z285CliPagDig_"+sGXsfl_32_idx, GXutil.rtrim( Z285CliPagDig)) ;
         httpContext.changePostValue( "ZT_"+"Z284CliPagCue_"+sGXsfl_32_idx, GXutil.rtrim( Z284CliPagCue)) ;
         httpContext.changePostValue( "ZT_"+"Z10060CliPagIban_"+sGXsfl_32_idx, GXutil.rtrim( Z10060CliPagIban)) ;
         httpContext.changePostValue( "ZT_"+"Z10415CliNIB_"+sGXsfl_32_idx, GXutil.rtrim( Z10415CliNIB)) ;
         httpContext.changePostValue( "ZT_"+"Z10416CliSwift_"+sGXsfl_32_idx, GXutil.rtrim( Z10416CliSwift)) ;
         httpContext.changePostValue( "ZT_"+"Z291CliPagPro_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z291CliPagPro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_26_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_26_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_26_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_26 != 0 )
         {
            httpContext.changePostValue( "CLIPAGLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGDOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGHOME_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagHome_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGPOB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGPRO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGPRO_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliPagPro_Horizontalalignment)) ;
            httpContext.changePostValue( "CLIPAGPRN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCCB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCCS_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGDIG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDig_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCUE_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCue_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGIBAN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagIban_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINIB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNIB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLISWIFT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliSwift_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O292CliPagUli = s292CliPagUli ;
      n292CliPagUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0M0( )
   {
   }

   public void e110M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tclipag_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char4[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclipag_impl.this.A396EmprCod = GXv_char2[0] ;
      tclipag_impl.this.AV30EmprNom = GXv_char3[0] ;
      tclipag_impl.this.AV26UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprNom", AV30EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXt_char1 = AV29Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tclipag_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char4[0] = AV35EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char2[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char3, GXv_char2) ;
      tclipag_impl.this.AV35EmprCod = GXv_char4[0] ;
      tclipag_impl.this.AV30EmprNom = GXv_char3[0] ;
      tclipag_impl.this.AV26UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35EmprCod", AV35EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprNom", AV30EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXv_SdtWWPContext5[0] = AV37WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV37WWPContext = GXv_SdtWWPContext5[0] ;
      divTablemain_Height = 800 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablemain_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablemain_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV42DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV42DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_clipagpro_Titlecontrolidtoreplace = edtCliPagPro_Internalname ;
      ucCombo_clipagpro.sendProperty(context, "", false, Combo_clipagpro_Internalname, "TitleControlIdToReplace", Combo_clipagpro_Titlecontrolidtoreplace);
      edtCliPagPro_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagPro_Internalname, "Horizontalalignment", edtCliPagPro_Horizontalalignment, !bGXsfl_32_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOCLIPAGPRO' */
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
      AV38TrnContext.fromxml(AV39WebSession.getValue("TrnContext"), null, null);
   }

   public void e120M2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV38TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tclipagww", new String[] {}, new String[] {}) );
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
      /* 'LOADCOMBOCLIPAGPRO' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV40CliPagPro_Data ;
      GXv_char4[0] = AV41ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tclipagloaddvcombo(remoteHandle, context).execute( "CliPagPro", Gx_mode, AV35EmprCod, AV36CliCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tclipag_impl.this.AV41ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV40CliPagPro_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void zm0M21( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T000M6_A279CliNom[0] ;
            Z292CliPagUli = T000M6_A292CliPagUli[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
            Z292CliPagUli = A292CliPagUli ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
         Z292CliPagUli = A292CliPagUli ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV35EmprCod)==0) )
      {
         A396EmprCod = AV35EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T000M7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T000M7_A407EmprNom[0] ;
      n407EmprNom = T000M7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV36CliCod) )
      {
         A252CliCod = AV36CliCod ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
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

   public void load0M21( )
   {
      /* Using cursor T000M8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A279CliNom = T000M8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A292CliPagUli = T000M8_A292CliPagUli[0] ;
         n292CliPagUli = T000M8_n292CliPagUli[0] ;
         A407EmprNom = T000M8_A407EmprNom[0] ;
         n407EmprNom = T000M8_n407EmprNom[0] ;
         zm0M21( -10) ;
      }
      pr_default.close(6);
      onLoadActions0M21( ) ;
   }

   public void onLoadActions0M21( )
   {
   }

   public void checkExtendedTable0M21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors0M21( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0M21( )
   {
      /* Using cursor T000M9 */
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
      /* Using cursor T000M6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T000M6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0M21( 10) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T000M6_A252CliCod[0] ;
         n252CliCod = T000M6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T000M6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A292CliPagUli = T000M6_A292CliPagUli[0] ;
         n292CliPagUli = T000M6_n292CliPagUli[0] ;
         O292CliPagUli = A292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0M21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey0M21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey0M21( ) ;
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
      getKey0M21( ) ;
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
      /* Using cursor T000M10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000M10_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T000M10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000M10_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T000M10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T000M10_A252CliCod[0] ;
            n252CliCod = T000M10_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T000M11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000M11_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T000M11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000M11_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T000M11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T000M11_A252CliCod[0] ;
            n252CliCod = T000M11_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0M21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A292CliPagUli = O292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
         insert0M21( ) ;
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
               A292CliPagUli = O292CliPagUli ;
               n292CliPagUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A292CliPagUli = O292CliPagUli ;
               n292CliPagUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
               update0M21( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               /* Insert record */
               A292CliPagUli = O292CliPagUli ;
               n292CliPagUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
               insert0M21( ) ;
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
                  A292CliPagUli = O292CliPagUli ;
                  n292CliPagUli = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
                  insert0M21( ) ;
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
         A292CliPagUli = O292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0M21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000M5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z279CliNom, T000M5_A279CliNom[0]) != 0 ) || ( Z292CliPagUli != T000M5_A292CliPagUli[0] ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T000M5_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T000M5_A279CliNom[0]);
            }
            if ( Z292CliPagUli != T000M5_A292CliPagUli[0] )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagUli");
               GXutil.writeLogRaw("Old: ",Z292CliPagUli);
               GXutil.writeLogRaw("Current: ",T000M5_A292CliPagUli[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0M21( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0M21( 0) ;
         checkOptimisticConcurrency0M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, Boolean.valueOf(n292CliPagUli), Byte.valueOf(A292CliPagUli), A396EmprCod});
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
                        processLevel0M21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption0M0( ) ;
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
            load0M21( ) ;
         }
         endLevel0M21( ) ;
      }
      closeExtendedTableCursors0M21( ) ;
   }

   public void update0M21( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M13 */
                  pr_default.execute(11, new Object[] {A279CliNom, Boolean.valueOf(n292CliPagUli), Byte.valueOf(A292CliPagUli), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0M21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0M21( ) ;
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
         endLevel0M21( ) ;
      }
      closeExtendedTableCursors0M21( ) ;
   }

   public void deferredUpdate0M21( )
   {
   }

   public void delete( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0M21( ) ;
         afterConfirm0M21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0M21( ) ;
            if ( AnyError == 0 )
            {
               A292CliPagUli = O292CliPagUli ;
               n292CliPagUli = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
               scanStart0M26( ) ;
               while ( RcdFound26 != 0 )
               {
                  getByPrimaryKey0M26( ) ;
                  delete0M26( ) ;
                  scanNext0M26( ) ;
                  O292CliPagUli = A292CliPagUli ;
                  n292CliPagUli = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
               }
               scanEnd0M26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M14 */
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
      endLevel0M21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0M21( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000M15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000M16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000M17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T000M18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T000M19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T000M20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T000M21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T000M22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T000M23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T000M24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T000M25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T000M26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T000M27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T000M28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T000M29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T000M30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T000M31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T000M32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T000M33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T000M34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T000M35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T000M36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T000M37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T000M38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T000M39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T000M40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T000M41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T000M42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T000M43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T000M44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T000M45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T000M46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T000M47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T000M48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T000M49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T000M50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T000M51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T000M52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T000M53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T000M54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T000M55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T000M56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T000M57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T000M58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T000M59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T000M60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T000M61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T000M62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T000M63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T000M64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T000M65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T000M66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T000M67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T000M68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T000M69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T000M70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T000M71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T000M72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T000M73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T000M74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T000M75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
      }
   }

   public void processNestedLevel0M26( )
   {
      s292CliPagUli = O292CliPagUli ;
      n292CliPagUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow0M26( ) ;
         if ( ( nRcdExists_26 != 0 ) || ( nIsMod_26 != 0 ) )
         {
            standaloneNotModal0M26( ) ;
            getKey0M26( ) ;
            if ( ( nRcdExists_26 == 0 ) && ( nRcdDeleted_26 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0M26( ) ;
            }
            else
            {
               if ( RcdFound26 != 0 )
               {
                  if ( ( nRcdDeleted_26 != 0 ) && ( nRcdExists_26 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0M26( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_26 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0M26( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_26 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O292CliPagUli = A292CliPagUli ;
            n292CliPagUli = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
         }
         httpContext.changePostValue( edtCliPagLin_Internalname, GXutil.ltrim( localUtil.ntoc( A287CliPagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliPagNom_Internalname, GXutil.rtrim( A288CliPagNom)) ;
         httpContext.changePostValue( edtCliPagDom_Internalname, GXutil.rtrim( A286CliPagDom)) ;
         httpContext.changePostValue( edtCliPagHome_Internalname, GXutil.rtrim( A11471CliPagHome)) ;
         httpContext.changePostValue( edtCliPagPob_Internalname, GXutil.rtrim( A289CliPagPob)) ;
         httpContext.changePostValue( edtCliPagCp_Internalname, GXutil.rtrim( A2326CliPagCp)) ;
         httpContext.changePostValue( edtCliPagPro_Internalname, GXutil.ltrim( localUtil.ntoc( A291CliPagPro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliPagPrn_Internalname, GXutil.rtrim( A290CliPagPrn)) ;
         httpContext.changePostValue( edtCliPagCcb_Internalname, GXutil.rtrim( A282CliPagCcb)) ;
         httpContext.changePostValue( edtCliPagCcs_Internalname, GXutil.rtrim( A283CliPagCcs)) ;
         httpContext.changePostValue( edtCliPagDig_Internalname, GXutil.rtrim( A285CliPagDig)) ;
         httpContext.changePostValue( edtCliPagCue_Internalname, GXutil.rtrim( A284CliPagCue)) ;
         httpContext.changePostValue( edtCliPagIban_Internalname, GXutil.rtrim( A10060CliPagIban)) ;
         httpContext.changePostValue( edtCliNIB_Internalname, GXutil.rtrim( A10415CliNIB)) ;
         httpContext.changePostValue( edtCliSwift_Internalname, GXutil.rtrim( A10416CliSwift)) ;
         httpContext.changePostValue( "ZT_"+"Z287CliPagLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z287CliPagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z288CliPagNom_"+sGXsfl_32_idx, GXutil.rtrim( Z288CliPagNom)) ;
         httpContext.changePostValue( "ZT_"+"Z286CliPagDom_"+sGXsfl_32_idx, GXutil.rtrim( Z286CliPagDom)) ;
         httpContext.changePostValue( "ZT_"+"Z11471CliPagHome_"+sGXsfl_32_idx, GXutil.rtrim( Z11471CliPagHome)) ;
         httpContext.changePostValue( "ZT_"+"Z289CliPagPob_"+sGXsfl_32_idx, GXutil.rtrim( Z289CliPagPob)) ;
         httpContext.changePostValue( "ZT_"+"Z2326CliPagCp_"+sGXsfl_32_idx, GXutil.rtrim( Z2326CliPagCp)) ;
         httpContext.changePostValue( "ZT_"+"Z282CliPagCcb_"+sGXsfl_32_idx, GXutil.rtrim( Z282CliPagCcb)) ;
         httpContext.changePostValue( "ZT_"+"Z283CliPagCcs_"+sGXsfl_32_idx, GXutil.rtrim( Z283CliPagCcs)) ;
         httpContext.changePostValue( "ZT_"+"Z285CliPagDig_"+sGXsfl_32_idx, GXutil.rtrim( Z285CliPagDig)) ;
         httpContext.changePostValue( "ZT_"+"Z284CliPagCue_"+sGXsfl_32_idx, GXutil.rtrim( Z284CliPagCue)) ;
         httpContext.changePostValue( "ZT_"+"Z10060CliPagIban_"+sGXsfl_32_idx, GXutil.rtrim( Z10060CliPagIban)) ;
         httpContext.changePostValue( "ZT_"+"Z10415CliNIB_"+sGXsfl_32_idx, GXutil.rtrim( Z10415CliNIB)) ;
         httpContext.changePostValue( "ZT_"+"Z10416CliSwift_"+sGXsfl_32_idx, GXutil.rtrim( Z10416CliSwift)) ;
         httpContext.changePostValue( "ZT_"+"Z291CliPagPro_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z291CliPagPro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_26_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_26_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_26_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_26 != 0 )
         {
            httpContext.changePostValue( "CLIPAGLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGDOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGHOME_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagHome_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGPOB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPob_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGPRO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGPRO_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliPagPro_Horizontalalignment)) ;
            httpContext.changePostValue( "CLIPAGPRN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPrn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCCB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCCS_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGDIG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDig_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGCUE_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCue_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPAGIBAN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagIban_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINIB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNIB_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLISWIFT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliSwift_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0M26( ) ;
      if ( AnyError != 0 )
      {
         O292CliPagUli = s292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      }
      nRcdExists_26 = (short)(0) ;
      nIsMod_26 = (short)(0) ;
      nRcdDeleted_26 = (short)(0) ;
   }

   public void processLevel0M21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel0M26( ) ;
      if ( AnyError != 0 )
      {
         O292CliPagUli = s292CliPagUli ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T000M76 */
      pr_default.execute(74, new Object[] {Boolean.valueOf(n292CliPagUli), Byte.valueOf(A292CliPagUli), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
   }

   public void endLevel0M21( )
   {
      pr_default.close(3);
      if ( AnyError == 0 )
      {
         beforeComplete0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclipag");
         if ( AnyError == 0 )
         {
            confirmValues0M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclipag");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0M21( )
   {
      /* Scan By routine */
      /* Using cursor T000M77 */
      pr_default.execute(75, new Object[] {A396EmprCod});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T000M77_A252CliCod[0] ;
         n252CliCod = T000M77_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0M21( )
   {
      /* Scan next routine */
      pr_default.readNext(75);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T000M77_A252CliCod[0] ;
         n252CliCod = T000M77_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd0M21( )
   {
      pr_default.close(75);
   }

   public void afterConfirm0M21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0M21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0M21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0M21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0M21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0M21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0M21( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
   }

   public void zm0M26( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z288CliPagNom = T000M3_A288CliPagNom[0] ;
            Z286CliPagDom = T000M3_A286CliPagDom[0] ;
            Z11471CliPagHome = T000M3_A11471CliPagHome[0] ;
            Z289CliPagPob = T000M3_A289CliPagPob[0] ;
            Z2326CliPagCp = T000M3_A2326CliPagCp[0] ;
            Z282CliPagCcb = T000M3_A282CliPagCcb[0] ;
            Z283CliPagCcs = T000M3_A283CliPagCcs[0] ;
            Z285CliPagDig = T000M3_A285CliPagDig[0] ;
            Z284CliPagCue = T000M3_A284CliPagCue[0] ;
            Z10060CliPagIban = T000M3_A10060CliPagIban[0] ;
            Z10415CliNIB = T000M3_A10415CliNIB[0] ;
            Z10416CliSwift = T000M3_A10416CliSwift[0] ;
            Z291CliPagPro = T000M3_A291CliPagPro[0] ;
         }
         else
         {
            Z288CliPagNom = A288CliPagNom ;
            Z286CliPagDom = A286CliPagDom ;
            Z11471CliPagHome = A11471CliPagHome ;
            Z289CliPagPob = A289CliPagPob ;
            Z2326CliPagCp = A2326CliPagCp ;
            Z282CliPagCcb = A282CliPagCcb ;
            Z283CliPagCcs = A283CliPagCcs ;
            Z285CliPagDig = A285CliPagDig ;
            Z284CliPagCue = A284CliPagCue ;
            Z10060CliPagIban = A10060CliPagIban ;
            Z10415CliNIB = A10415CliNIB ;
            Z10416CliSwift = A10416CliSwift ;
            Z291CliPagPro = A291CliPagPro ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z252CliCod = A252CliCod ;
         Z287CliPagLin = A287CliPagLin ;
         Z288CliPagNom = A288CliPagNom ;
         Z286CliPagDom = A286CliPagDom ;
         Z11471CliPagHome = A11471CliPagHome ;
         Z289CliPagPob = A289CliPagPob ;
         Z2326CliPagCp = A2326CliPagCp ;
         Z282CliPagCcb = A282CliPagCcb ;
         Z283CliPagCcs = A283CliPagCcs ;
         Z285CliPagDig = A285CliPagDig ;
         Z284CliPagCue = A284CliPagCue ;
         Z10060CliPagIban = A10060CliPagIban ;
         Z10415CliNIB = A10415CliNIB ;
         Z10416CliSwift = A10416CliSwift ;
         Z291CliPagPro = A291CliPagPro ;
         Z396EmprCod = A396EmprCod ;
         Z290CliPagPrn = A290CliPagPrn ;
      }
   }

   public void standaloneNotModal0M26( )
   {
      edtCliPagLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagPrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModal0M26( )
   {
      if ( isIns( )  )
      {
         A292CliPagUli = (byte)(O292CliPagUli+1) ;
         n292CliPagUli = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A287CliPagLin = A292CliPagUli ;
      }
   }

   public void load0M26( )
   {
      /* Using cursor T000M78 */
      pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A288CliPagNom = T000M78_A288CliPagNom[0] ;
         A286CliPagDom = T000M78_A286CliPagDom[0] ;
         A11471CliPagHome = T000M78_A11471CliPagHome[0] ;
         A289CliPagPob = T000M78_A289CliPagPob[0] ;
         A2326CliPagCp = T000M78_A2326CliPagCp[0] ;
         A290CliPagPrn = T000M78_A290CliPagPrn[0] ;
         n290CliPagPrn = T000M78_n290CliPagPrn[0] ;
         A282CliPagCcb = T000M78_A282CliPagCcb[0] ;
         A283CliPagCcs = T000M78_A283CliPagCcs[0] ;
         A285CliPagDig = T000M78_A285CliPagDig[0] ;
         A284CliPagCue = T000M78_A284CliPagCue[0] ;
         A10060CliPagIban = T000M78_A10060CliPagIban[0] ;
         A10415CliNIB = T000M78_A10415CliNIB[0] ;
         A10416CliSwift = T000M78_A10416CliSwift[0] ;
         A291CliPagPro = T000M78_A291CliPagPro[0] ;
         zm0M26( -12) ;
      }
      pr_default.close(76);
      onLoadActions0M26( ) ;
   }

   public void onLoadActions0M26( )
   {
   }

   public void checkExtendedTable0M26( )
   {
      nIsDirty_26 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0M26( ) ;
      /* Using cursor T000M4 */
      pr_default.execute(2, new Object[] {Short.valueOf(A291CliPagPro)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "CLIPAGPRO_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliPag", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliPagPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A290CliPagPrn = T000M4_A290CliPagPrn[0] ;
      n290CliPagPrn = T000M4_n290CliPagPrn[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors0M26( )
   {
      pr_default.close(2);
   }

   public void enableDisable0M26( )
   {
   }

   public void gxload_13( short A291CliPagPro )
   {
      /* Using cursor T000M79 */
      pr_default.execute(77, new Object[] {Short.valueOf(A291CliPagPro)});
      if ( (pr_default.getStatus(77) == 101) )
      {
         GXCCtl = "CLIPAGPRO_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliPag", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliPagPro_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A290CliPagPrn = T000M79_A290CliPagPrn[0] ;
      n290CliPagPrn = T000M79_n290CliPagPrn[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A290CliPagPrn))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(77) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(77);
   }

   public void getKey0M26( )
   {
      /* Using cursor T000M80 */
      pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound26 = (short)(1) ;
      }
      else
      {
         RcdFound26 = (short)(0) ;
      }
      pr_default.close(78);
   }

   public void getByPrimaryKey0M26( )
   {
      /* Using cursor T000M3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T000M3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0M26( 12) ;
         RcdFound26 = (short)(1) ;
         initializeNonKey0M26( ) ;
         A287CliPagLin = T000M3_A287CliPagLin[0] ;
         A288CliPagNom = T000M3_A288CliPagNom[0] ;
         A286CliPagDom = T000M3_A286CliPagDom[0] ;
         A11471CliPagHome = T000M3_A11471CliPagHome[0] ;
         A289CliPagPob = T000M3_A289CliPagPob[0] ;
         A2326CliPagCp = T000M3_A2326CliPagCp[0] ;
         A282CliPagCcb = T000M3_A282CliPagCcb[0] ;
         A283CliPagCcs = T000M3_A283CliPagCcs[0] ;
         A285CliPagDig = T000M3_A285CliPagDig[0] ;
         A284CliPagCue = T000M3_A284CliPagCue[0] ;
         A10060CliPagIban = T000M3_A10060CliPagIban[0] ;
         A10415CliNIB = T000M3_A10415CliNIB[0] ;
         A10416CliSwift = T000M3_A10416CliSwift[0] ;
         A291CliPagPro = T000M3_A291CliPagPro[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z287CliPagLin = A287CliPagLin ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0M26( ) ;
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound26 = (short)(0) ;
         initializeNonKey0M26( ) ;
         sMode26 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0M26( ) ;
         Gx_mode = sMode26 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0M26( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0M26( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIPAG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z288CliPagNom, T000M2_A288CliPagNom[0]) != 0 ) || ( GXutil.strcmp(Z286CliPagDom, T000M2_A286CliPagDom[0]) != 0 ) || ( GXutil.strcmp(Z11471CliPagHome, T000M2_A11471CliPagHome[0]) != 0 ) || ( GXutil.strcmp(Z289CliPagPob, T000M2_A289CliPagPob[0]) != 0 ) || ( GXutil.strcmp(Z2326CliPagCp, T000M2_A2326CliPagCp[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z282CliPagCcb, T000M2_A282CliPagCcb[0]) != 0 ) || ( GXutil.strcmp(Z283CliPagCcs, T000M2_A283CliPagCcs[0]) != 0 ) || ( GXutil.strcmp(Z285CliPagDig, T000M2_A285CliPagDig[0]) != 0 ) || ( GXutil.strcmp(Z284CliPagCue, T000M2_A284CliPagCue[0]) != 0 ) || ( GXutil.strcmp(Z10060CliPagIban, T000M2_A10060CliPagIban[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z10415CliNIB, T000M2_A10415CliNIB[0]) != 0 ) || ( GXutil.strcmp(Z10416CliSwift, T000M2_A10416CliSwift[0]) != 0 ) || ( Z291CliPagPro != T000M2_A291CliPagPro[0] ) )
         {
            if ( GXutil.strcmp(Z288CliPagNom, T000M2_A288CliPagNom[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagNom");
               GXutil.writeLogRaw("Old: ",Z288CliPagNom);
               GXutil.writeLogRaw("Current: ",T000M2_A288CliPagNom[0]);
            }
            if ( GXutil.strcmp(Z286CliPagDom, T000M2_A286CliPagDom[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagDom");
               GXutil.writeLogRaw("Old: ",Z286CliPagDom);
               GXutil.writeLogRaw("Current: ",T000M2_A286CliPagDom[0]);
            }
            if ( GXutil.strcmp(Z11471CliPagHome, T000M2_A11471CliPagHome[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagHome");
               GXutil.writeLogRaw("Old: ",Z11471CliPagHome);
               GXutil.writeLogRaw("Current: ",T000M2_A11471CliPagHome[0]);
            }
            if ( GXutil.strcmp(Z289CliPagPob, T000M2_A289CliPagPob[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagPob");
               GXutil.writeLogRaw("Old: ",Z289CliPagPob);
               GXutil.writeLogRaw("Current: ",T000M2_A289CliPagPob[0]);
            }
            if ( GXutil.strcmp(Z2326CliPagCp, T000M2_A2326CliPagCp[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagCp");
               GXutil.writeLogRaw("Old: ",Z2326CliPagCp);
               GXutil.writeLogRaw("Current: ",T000M2_A2326CliPagCp[0]);
            }
            if ( GXutil.strcmp(Z282CliPagCcb, T000M2_A282CliPagCcb[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagCcb");
               GXutil.writeLogRaw("Old: ",Z282CliPagCcb);
               GXutil.writeLogRaw("Current: ",T000M2_A282CliPagCcb[0]);
            }
            if ( GXutil.strcmp(Z283CliPagCcs, T000M2_A283CliPagCcs[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagCcs");
               GXutil.writeLogRaw("Old: ",Z283CliPagCcs);
               GXutil.writeLogRaw("Current: ",T000M2_A283CliPagCcs[0]);
            }
            if ( GXutil.strcmp(Z285CliPagDig, T000M2_A285CliPagDig[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagDig");
               GXutil.writeLogRaw("Old: ",Z285CliPagDig);
               GXutil.writeLogRaw("Current: ",T000M2_A285CliPagDig[0]);
            }
            if ( GXutil.strcmp(Z284CliPagCue, T000M2_A284CliPagCue[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagCue");
               GXutil.writeLogRaw("Old: ",Z284CliPagCue);
               GXutil.writeLogRaw("Current: ",T000M2_A284CliPagCue[0]);
            }
            if ( GXutil.strcmp(Z10060CliPagIban, T000M2_A10060CliPagIban[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagIban");
               GXutil.writeLogRaw("Old: ",Z10060CliPagIban);
               GXutil.writeLogRaw("Current: ",T000M2_A10060CliPagIban[0]);
            }
            if ( GXutil.strcmp(Z10415CliNIB, T000M2_A10415CliNIB[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliNIB");
               GXutil.writeLogRaw("Old: ",Z10415CliNIB);
               GXutil.writeLogRaw("Current: ",T000M2_A10415CliNIB[0]);
            }
            if ( GXutil.strcmp(Z10416CliSwift, T000M2_A10416CliSwift[0]) != 0 )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliSwift");
               GXutil.writeLogRaw("Old: ",Z10416CliSwift);
               GXutil.writeLogRaw("Current: ",T000M2_A10416CliSwift[0]);
            }
            if ( Z291CliPagPro != T000M2_A291CliPagPro[0] )
            {
               GXutil.writeLogln("tclipag:[seudo value changed for attri]"+"CliPagPro");
               GXutil.writeLogRaw("Old: ",Z291CliPagPro);
               GXutil.writeLogRaw("Current: ",T000M2_A291CliPagPro[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIPAG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0M26( )
   {
      beforeValidate0M26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M26( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0M26( 0) ;
         checkOptimisticConcurrency0M26( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M26( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0M26( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M81 */
                  pr_default.execute(79, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin), A288CliPagNom, A286CliPagDom, A11471CliPagHome, A289CliPagPob, A2326CliPagCp, A282CliPagCcb, A283CliPagCcs, A285CliPagDig, A284CliPagCue, A10060CliPagIban, A10415CliNIB, A10416CliSwift, Short.valueOf(A291CliPagPro), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIPAG");
                  if ( (pr_default.getStatus(79) == 1) )
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
            load0M26( ) ;
         }
         endLevel0M26( ) ;
      }
      closeExtendedTableCursors0M26( ) ;
   }

   public void update0M26( )
   {
      beforeValidate0M26( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M26( ) ;
      }
      if ( ( nIsMod_26 != 0 ) || ( nIsDirty_26 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0M26( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0M26( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0M26( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T000M82 */
                     pr_default.execute(80, new Object[] {A288CliPagNom, A286CliPagDom, A11471CliPagHome, A289CliPagPob, A2326CliPagCp, A282CliPagCcb, A283CliPagCcs, A285CliPagDig, A284CliPagCue, A10060CliPagIban, A10415CliNIB, A10416CliSwift, Short.valueOf(A291CliPagPro), A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIPAG");
                     if ( (pr_default.getStatus(80) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIPAG"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0M26( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0M26( ) ;
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
            endLevel0M26( ) ;
         }
      }
      closeExtendedTableCursors0M26( ) ;
   }

   public void deferredUpdate0M26( )
   {
   }

   public void delete0M26( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0M26( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M26( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0M26( ) ;
         afterConfirm0M26( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0M26( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000M83 */
               pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), Byte.valueOf(A287CliPagLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIPAG");
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
      sMode26 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0M26( ) ;
      Gx_mode = sMode26 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0M26( )
   {
      standaloneModal0M26( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000M84 */
         pr_default.execute(82, new Object[] {Short.valueOf(A291CliPagPro)});
         A290CliPagPrn = T000M84_A290CliPagPrn[0] ;
         n290CliPagPrn = T000M84_n290CliPagPrn[0] ;
         pr_default.close(82);
      }
   }

   public void endLevel0M26( )
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

   public void scanStart0M26( )
   {
      /* Scan By routine */
      /* Using cursor T000M85 */
      pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound26 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A287CliPagLin = T000M85_A287CliPagLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0M26( )
   {
      /* Scan next routine */
      pr_default.readNext(83);
      RcdFound26 = (short)(0) ;
      if ( (pr_default.getStatus(83) != 101) )
      {
         RcdFound26 = (short)(1) ;
         A287CliPagLin = T000M85_A287CliPagLin[0] ;
      }
   }

   public void scanEnd0M26( )
   {
      pr_default.close(83);
   }

   public void afterConfirm0M26( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0M26( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0M26( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0M26( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0M26( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0M26( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0M26( )
   {
      edtCliPagLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagNom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagDom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagDom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagDom_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagHome_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagHome_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagHome_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagPob_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagPob_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPob_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagCp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagCp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPro_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagPrn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagCcb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagCcb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCcb_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagCcs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagCcs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCcs_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagDig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagDig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagDig_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagCue_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagCue_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagCue_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagIban_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagIban_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagIban_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliNIB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNIB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNIB_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliSwift_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliSwift_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliSwift_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes0M26( )
   {
   }

   public void send_integrity_lvl_hashes0M21( )
   {
   }

   public void subsflControlProps_3226( )
   {
      edtCliPagLin_Internalname = "CLIPAGLIN_"+sGXsfl_32_idx ;
      edtCliPagNom_Internalname = "CLIPAGNOM_"+sGXsfl_32_idx ;
      edtCliPagDom_Internalname = "CLIPAGDOM_"+sGXsfl_32_idx ;
      edtCliPagHome_Internalname = "CLIPAGHOME_"+sGXsfl_32_idx ;
      edtCliPagPob_Internalname = "CLIPAGPOB_"+sGXsfl_32_idx ;
      edtCliPagCp_Internalname = "CLIPAGCP_"+sGXsfl_32_idx ;
      edtCliPagPro_Internalname = "CLIPAGPRO_"+sGXsfl_32_idx ;
      edtCliPagPrn_Internalname = "CLIPAGPRN_"+sGXsfl_32_idx ;
      edtCliPagCcb_Internalname = "CLIPAGCCB_"+sGXsfl_32_idx ;
      edtCliPagCcs_Internalname = "CLIPAGCCS_"+sGXsfl_32_idx ;
      edtCliPagDig_Internalname = "CLIPAGDIG_"+sGXsfl_32_idx ;
      edtCliPagCue_Internalname = "CLIPAGCUE_"+sGXsfl_32_idx ;
      edtCliPagIban_Internalname = "CLIPAGIBAN_"+sGXsfl_32_idx ;
      edtCliNIB_Internalname = "CLINIB_"+sGXsfl_32_idx ;
      edtCliSwift_Internalname = "CLISWIFT_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_3226( )
   {
      edtCliPagLin_Internalname = "CLIPAGLIN_"+sGXsfl_32_fel_idx ;
      edtCliPagNom_Internalname = "CLIPAGNOM_"+sGXsfl_32_fel_idx ;
      edtCliPagDom_Internalname = "CLIPAGDOM_"+sGXsfl_32_fel_idx ;
      edtCliPagHome_Internalname = "CLIPAGHOME_"+sGXsfl_32_fel_idx ;
      edtCliPagPob_Internalname = "CLIPAGPOB_"+sGXsfl_32_fel_idx ;
      edtCliPagCp_Internalname = "CLIPAGCP_"+sGXsfl_32_fel_idx ;
      edtCliPagPro_Internalname = "CLIPAGPRO_"+sGXsfl_32_fel_idx ;
      edtCliPagPrn_Internalname = "CLIPAGPRN_"+sGXsfl_32_fel_idx ;
      edtCliPagCcb_Internalname = "CLIPAGCCB_"+sGXsfl_32_fel_idx ;
      edtCliPagCcs_Internalname = "CLIPAGCCS_"+sGXsfl_32_fel_idx ;
      edtCliPagDig_Internalname = "CLIPAGDIG_"+sGXsfl_32_fel_idx ;
      edtCliPagCue_Internalname = "CLIPAGCUE_"+sGXsfl_32_fel_idx ;
      edtCliPagIban_Internalname = "CLIPAGIBAN_"+sGXsfl_32_fel_idx ;
      edtCliNIB_Internalname = "CLINIB_"+sGXsfl_32_fel_idx ;
      edtCliSwift_Internalname = "CLISWIFT_"+sGXsfl_32_fel_idx ;
   }

   public void addRow0M26( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3226( ) ;
      sendRow0M26( ) ;
   }

   public void sendRow0M26( )
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
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagLin_Internalname,GXutil.ltrim( localUtil.ntoc( A287CliPagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliPagLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A287CliPagLin), "9") : localUtil.format( DecimalUtil.doubleToDec(A287CliPagLin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCliPagLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagNom_Internalname,GXutil.rtrim( A288CliPagNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagDom_Internalname,GXutil.rtrim( A286CliPagDom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagDom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagHome_Internalname,GXutil.rtrim( A11471CliPagHome),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagHome_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagHome_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(34),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagPob_Internalname,GXutil.rtrim( A289CliPagPob),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagPob_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagPob_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagCp_Internalname,GXutil.rtrim( A2326CliPagCp),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagCp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagCp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagPro_Internalname,GXutil.ltrim( localUtil.ntoc( A291CliPagPro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliPagPro_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A291CliPagPro), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A291CliPagPro), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagPro_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtCliPagPro_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagPrn_Internalname,GXutil.rtrim( A290CliPagPrn),GXutil.rtrim( localUtil.format( A290CliPagPrn, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagPrn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtCliPagPrn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagCcb_Internalname,GXutil.rtrim( A282CliPagCcb),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagCcb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagCcb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagCcs_Internalname,GXutil.rtrim( A283CliPagCcs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagCcs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagCcs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagDig_Internalname,GXutil.rtrim( A285CliPagDig),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagDig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagDig_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagCue_Internalname,GXutil.rtrim( A284CliPagCue),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagCue_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagCue_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPagIban_Internalname,GXutil.rtrim( A10060CliPagIban),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPagIban_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPagIban_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNIB_Internalname,GXutil.rtrim( A10415CliNIB),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNIB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliNIB_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_26_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliSwift_Internalname,GXutil.rtrim( A10416CliSwift),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliSwift_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliSwift_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes0M26( ) ;
      GXCCtl = "Z287CliPagLin_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z287CliPagLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z288CliPagNom_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z288CliPagNom));
      GXCCtl = "Z286CliPagDom_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z286CliPagDom));
      GXCCtl = "Z11471CliPagHome_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11471CliPagHome));
      GXCCtl = "Z289CliPagPob_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z289CliPagPob));
      GXCCtl = "Z2326CliPagCp_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z2326CliPagCp));
      GXCCtl = "Z282CliPagCcb_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z282CliPagCcb));
      GXCCtl = "Z283CliPagCcs_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z283CliPagCcs));
      GXCCtl = "Z285CliPagDig_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z285CliPagDig));
      GXCCtl = "Z284CliPagCue_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z284CliPagCue));
      GXCCtl = "Z10060CliPagIban_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10060CliPagIban));
      GXCCtl = "Z10415CliNIB_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10415CliNIB));
      GXCCtl = "Z10416CliSwift_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10416CliSwift));
      GXCCtl = "Z291CliPagPro_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z291CliPagPro, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_26_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_26_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_26_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_26, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV38TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV38TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV35EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV36CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGNOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGDOM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDom_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGHOME_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagHome_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGPOB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPob_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGCP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGPRO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGPRO_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtCliPagPro_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGPRN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGCCB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGCCS_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcs_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGDIG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDig_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGCUE_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCue_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGIBAN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagIban_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINIB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNIB_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLISWIFT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliSwift_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow0M26( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3226( ) ;
      edtCliPagLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGNOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagDom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGDOM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagHome_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGHOME_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagPob_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGPOB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagCp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGPRO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagPro_Horizontalalignment = httpContext.cgiGet( "CLIPAGPRO_"+sGXsfl_32_idx+"Horizontalalignment") ;
      edtCliPagPrn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGPRN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagCcb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCCB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagCcs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCCS_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagDig_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGDIG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagCue_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGCUE_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliPagIban_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPAGIBAN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliNIB_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLINIB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliSwift_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLISWIFT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A287CliPagLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtCliPagLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A288CliPagNom = httpContext.cgiGet( edtCliPagNom_Internalname) ;
      A286CliPagDom = httpContext.cgiGet( edtCliPagDom_Internalname) ;
      A11471CliPagHome = httpContext.cgiGet( edtCliPagHome_Internalname) ;
      A289CliPagPob = httpContext.cgiGet( edtCliPagPob_Internalname) ;
      A2326CliPagCp = httpContext.cgiGet( edtCliPagCp_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliPagPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliPagPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "CLIPAGPRO_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliPagPro_Internalname ;
         wbErr = true ;
         A291CliPagPro = (short)(0) ;
      }
      else
      {
         A291CliPagPro = (short)(localUtil.ctol( httpContext.cgiGet( edtCliPagPro_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A290CliPagPrn = GXutil.upper( httpContext.cgiGet( edtCliPagPrn_Internalname)) ;
      n290CliPagPrn = false ;
      A282CliPagCcb = httpContext.cgiGet( edtCliPagCcb_Internalname) ;
      A283CliPagCcs = httpContext.cgiGet( edtCliPagCcs_Internalname) ;
      A285CliPagDig = httpContext.cgiGet( edtCliPagDig_Internalname) ;
      A284CliPagCue = httpContext.cgiGet( edtCliPagCue_Internalname) ;
      A10060CliPagIban = httpContext.cgiGet( edtCliPagIban_Internalname) ;
      A10415CliNIB = httpContext.cgiGet( edtCliNIB_Internalname) ;
      A10416CliSwift = httpContext.cgiGet( edtCliSwift_Internalname) ;
      GXCCtl = "Z287CliPagLin_" + sGXsfl_32_idx ;
      Z287CliPagLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z288CliPagNom_" + sGXsfl_32_idx ;
      Z288CliPagNom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z286CliPagDom_" + sGXsfl_32_idx ;
      Z286CliPagDom = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11471CliPagHome_" + sGXsfl_32_idx ;
      Z11471CliPagHome = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z289CliPagPob_" + sGXsfl_32_idx ;
      Z289CliPagPob = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z2326CliPagCp_" + sGXsfl_32_idx ;
      Z2326CliPagCp = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z282CliPagCcb_" + sGXsfl_32_idx ;
      Z282CliPagCcb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z283CliPagCcs_" + sGXsfl_32_idx ;
      Z283CliPagCcs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z285CliPagDig_" + sGXsfl_32_idx ;
      Z285CliPagDig = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z284CliPagCue_" + sGXsfl_32_idx ;
      Z284CliPagCue = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10060CliPagIban_" + sGXsfl_32_idx ;
      Z10060CliPagIban = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10415CliNIB_" + sGXsfl_32_idx ;
      Z10415CliNIB = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z10416CliSwift_" + sGXsfl_32_idx ;
      Z10416CliSwift = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z291CliPagPro_" + sGXsfl_32_idx ;
      Z291CliPagPro = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_26_" + sGXsfl_32_idx ;
      nRcdDeleted_26 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_26_" + sGXsfl_32_idx ;
      nRcdExists_26 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_26_" + sGXsfl_32_idx ;
      nIsMod_26 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtCliPagPrn_Enabled = edtCliPagPrn_Enabled ;
      defedtCliPagLin_Enabled = edtCliPagLin_Enabled ;
   }

   public void confirmValues0M0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3226( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3226( ) ;
         httpContext.changePostValue( "Z287CliPagLin_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z287CliPagLin_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z287CliPagLin_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z288CliPagNom_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z288CliPagNom_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z288CliPagNom_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z286CliPagDom_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z286CliPagDom_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z286CliPagDom_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z11471CliPagHome_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11471CliPagHome_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11471CliPagHome_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z289CliPagPob_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z289CliPagPob_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z289CliPagPob_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z2326CliPagCp_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z2326CliPagCp_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z2326CliPagCp_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z282CliPagCcb_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z282CliPagCcb_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z282CliPagCcb_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z283CliPagCcs_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z283CliPagCcs_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z283CliPagCcs_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z285CliPagDig_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z285CliPagDig_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z285CliPagDig_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z284CliPagCue_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z284CliPagCue_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z284CliPagCue_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10060CliPagIban_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10060CliPagIban_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10060CliPagIban_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10415CliNIB_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10415CliNIB_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10415CliNIB_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10416CliSwift_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10416CliSwift_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10416CliSwift_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z291CliPagPro_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z291CliPagPro_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z291CliPagPro_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tclipag", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCLIPAG");
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tclipag:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z292CliPagUli", GXutil.ltrim( localUtil.ntoc( Z292CliPagUli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O292CliPagUli", GXutil.ltrim( localUtil.ntoc( O292CliPagUli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV42DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLIPAGPRO_DATA", AV40CliPagPro_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLIPAGPRO_DATA", AV40CliPagPro_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV38TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV38TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV38TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV35EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV36CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPAGULI", GXutil.ltrim( localUtil.ntoc( A292CliPagUli, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIPAGPRO_Objectcall", GXutil.rtrim( Combo_clipagpro_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIPAGPRO_Cls", GXutil.rtrim( Combo_clipagpro_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIPAGPRO_Enabled", GXutil.booltostr( Combo_clipagpro_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIPAGPRO_Titlecontrolidtoreplace", GXutil.rtrim( Combo_clipagpro_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIPAGPRO_Isgriditem", GXutil.booltostr( Combo_clipagpro_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLIPAGPRO_Emptyitem", GXutil.booltostr( Combo_clipagpro_Emptyitem));
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
      return formatLink("app.tclipag", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV35EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV36CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCLIPAG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "DOMICILIOS PAGO CLIENTES", "") ;
   }

   public void initializeNonKey0M21( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A292CliPagUli = (byte)(0) ;
      n292CliPagUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      O292CliPagUli = A292CliPagUli ;
      n292CliPagUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
      Z279CliNom = "" ;
      Z292CliPagUli = (byte)(0) ;
   }

   public void initAll0M21( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey0M21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0M26( )
   {
      A288CliPagNom = "" ;
      A286CliPagDom = "" ;
      A11471CliPagHome = "" ;
      A289CliPagPob = "" ;
      A2326CliPagCp = "" ;
      A291CliPagPro = (short)(0) ;
      A290CliPagPrn = "" ;
      n290CliPagPrn = false ;
      A282CliPagCcb = "" ;
      A283CliPagCcs = "" ;
      A285CliPagDig = "" ;
      A284CliPagCue = "" ;
      A10060CliPagIban = "" ;
      A10415CliNIB = "" ;
      A10416CliSwift = "" ;
      Z288CliPagNom = "" ;
      Z286CliPagDom = "" ;
      Z11471CliPagHome = "" ;
      Z289CliPagPob = "" ;
      Z2326CliPagCp = "" ;
      Z282CliPagCcb = "" ;
      Z283CliPagCcs = "" ;
      Z285CliPagDig = "" ;
      Z284CliPagCue = "" ;
      Z10060CliPagIban = "" ;
      Z10415CliNIB = "" ;
      Z10416CliSwift = "" ;
      Z291CliPagPro = (short)(0) ;
   }

   public void initAll0M26( )
   {
      A287CliPagLin = (byte)(0) ;
      initializeNonKey0M26( ) ;
   }

   public void standaloneModalInsert0M26( )
   {
      A292CliPagUli = i292CliPagUli ;
      n292CliPagUli = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A292CliPagUli", GXutil.str( A292CliPagUli, 1, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211652325", true, true);
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
      httpContext.AddJavascriptSource("tclipag.js", "?20268211652326", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties26( )
   {
      edtCliPagPrn_Enabled = defedtCliPagPrn_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagPrn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagPrn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPagLin_Enabled = defedtCliPagLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPagLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPagLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A287CliPagLin, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A288CliPagNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A286CliPagDom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDom_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A11471CliPagHome));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagHome_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A289CliPagPob));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPob_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A2326CliPagCp));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A291CliPagPro, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtCliPagPro_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A290CliPagPrn));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagPrn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A282CliPagCcb));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A283CliPagCcs));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCcs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A285CliPagDig));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagDig_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A284CliPagCue));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagCue_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10060CliPagIban));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPagIban_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10415CliNIB));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliNIB_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A10416CliSwift));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliSwift_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtCliPagLin_Internalname = "CLIPAGLIN" ;
      edtCliPagNom_Internalname = "CLIPAGNOM" ;
      edtCliPagDom_Internalname = "CLIPAGDOM" ;
      edtCliPagHome_Internalname = "CLIPAGHOME" ;
      edtCliPagPob_Internalname = "CLIPAGPOB" ;
      edtCliPagCp_Internalname = "CLIPAGCP" ;
      edtCliPagPro_Internalname = "CLIPAGPRO" ;
      edtCliPagPrn_Internalname = "CLIPAGPRN" ;
      edtCliPagCcb_Internalname = "CLIPAGCCB" ;
      edtCliPagCcs_Internalname = "CLIPAGCCS" ;
      edtCliPagDig_Internalname = "CLIPAGDIG" ;
      edtCliPagCue_Internalname = "CLIPAGCUE" ;
      edtCliPagIban_Internalname = "CLIPAGIBAN" ;
      edtCliNIB_Internalname = "CLINIB" ;
      edtCliSwift_Internalname = "CLISWIFT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_clipagpro_Internalname = "COMBO_CLIPAGPRO" ;
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
      Combo_clipagpro_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "DOMICILIOS PAGO CLIENTES", "") );
      edtCliSwift_Jsonclick = "" ;
      edtCliNIB_Jsonclick = "" ;
      edtCliPagIban_Jsonclick = "" ;
      edtCliPagCue_Jsonclick = "" ;
      edtCliPagDig_Jsonclick = "" ;
      edtCliPagCcs_Jsonclick = "" ;
      edtCliPagCcb_Jsonclick = "" ;
      edtCliPagPrn_Jsonclick = "" ;
      edtCliPagPro_Jsonclick = "" ;
      edtCliPagCp_Jsonclick = "" ;
      edtCliPagPob_Jsonclick = "" ;
      edtCliPagHome_Jsonclick = "" ;
      edtCliPagDom_Jsonclick = "" ;
      edtCliPagNom_Jsonclick = "" ;
      edtCliPagLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_clipagpro_Titlecontrolidtoreplace = "" ;
      edtCliSwift_Enabled = 1 ;
      edtCliNIB_Enabled = 1 ;
      edtCliPagIban_Enabled = 1 ;
      edtCliPagCue_Enabled = 1 ;
      edtCliPagDig_Enabled = 1 ;
      edtCliPagCcs_Enabled = 1 ;
      edtCliPagCcb_Enabled = 1 ;
      edtCliPagPrn_Enabled = 0 ;
      edtCliPagPro_Enabled = 1 ;
      edtCliPagCp_Enabled = 1 ;
      edtCliPagPob_Enabled = 1 ;
      edtCliPagHome_Enabled = 1 ;
      edtCliPagDom_Enabled = 1 ;
      edtCliPagNom_Enabled = 1 ;
      edtCliPagLin_Enabled = 0 ;
      Combo_clipagpro_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clipagpro_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_clipagpro_Cls = "ExtendedCombo" ;
      Combo_clipagpro_Caption = "" ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
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
      edtCliPagPro_Horizontalalignment = "right" ;
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
      subsflControlProps_3226( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0M26( ) ;
         standaloneModal0M26( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0M26( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3226( ) ;
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

   public void valid_Clipagpro( )
   {
      n290CliPagPrn = false ;
      /* Using cursor T000M84 */
      pr_default.execute(82, new Object[] {Short.valueOf(A291CliPagPro)});
      if ( (pr_default.getStatus(82) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CliPag", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLIPAGPRO");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliPagPro_Internalname ;
      }
      A290CliPagPrn = T000M84_A290CliPagPrn[0] ;
      n290CliPagPrn = T000M84_n290CliPagPrn[0] ;
      pr_default.close(82);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A290CliPagPrn", GXutil.rtrim( A290CliPagPrn));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV38TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV35EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV36CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120M2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV38TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLIPAGLIN","{handler:'valid_Clipaglin',iparms:[]");
      setEventMetadata("VALID_CLIPAGLIN",",oparms:[]}");
      setEventMetadata("VALID_CLIPAGPRO","{handler:'valid_Clipagpro',iparms:[{av:'A291CliPagPro',fld:'CLIPAGPRO',pic:'ZZ9'},{av:'A290CliPagPrn',fld:'CLIPAGPRN',pic:'@!'}]");
      setEventMetadata("VALID_CLIPAGPRO",",oparms:[{av:'A290CliPagPrn',fld:'CLIPAGPRN',pic:'@!'}]}");
      setEventMetadata("NULL","{handler:'valid_Cliswift',iparms:[]");
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
      pr_default.close(82);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV35EmprCod = "" ;
      Z396EmprCod = "" ;
      Z279CliNom = "" ;
      Z288CliPagNom = "" ;
      Z286CliPagDom = "" ;
      Z11471CliPagHome = "" ;
      Z289CliPagPob = "" ;
      Z2326CliPagCp = "" ;
      Z282CliPagCcb = "" ;
      Z283CliPagCcs = "" ;
      Z285CliPagDig = "" ;
      Z284CliPagCue = "" ;
      Z10060CliPagIban = "" ;
      Z10415CliNIB = "" ;
      Z10416CliSwift = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV35EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A279CliNom = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      ucCombo_clipagpro = new com.genexus.webpanels.GXUserControl();
      AV42DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV40CliPagPro_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode26 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_clipagpro_Objectcall = "" ;
      Combo_clipagpro_Class = "" ;
      Combo_clipagpro_Icontype = "" ;
      Combo_clipagpro_Icon = "" ;
      Combo_clipagpro_Tooltip = "" ;
      Combo_clipagpro_Selectedvalue_set = "" ;
      Combo_clipagpro_Selectedvalue_get = "" ;
      Combo_clipagpro_Selectedtext_set = "" ;
      Combo_clipagpro_Selectedtext_get = "" ;
      Combo_clipagpro_Gamoauthtoken = "" ;
      Combo_clipagpro_Ddointernalname = "" ;
      Combo_clipagpro_Titlecontrolalign = "" ;
      Combo_clipagpro_Dropdownoptionstype = "" ;
      Combo_clipagpro_Datalisttype = "" ;
      Combo_clipagpro_Datalistfixedvalues = "" ;
      Combo_clipagpro_Datalistproc = "" ;
      Combo_clipagpro_Datalistprocparametersprefix = "" ;
      Combo_clipagpro_Remoteservicesparameters = "" ;
      Combo_clipagpro_Htmltemplate = "" ;
      Combo_clipagpro_Multiplevaluestype = "" ;
      Combo_clipagpro_Loadingdata = "" ;
      Combo_clipagpro_Noresultsfound = "" ;
      Combo_clipagpro_Emptyitemtext = "" ;
      Combo_clipagpro_Onlyselectedvalues = "" ;
      Combo_clipagpro_Selectalltext = "" ;
      Combo_clipagpro_Multiplevaluesseparator = "" ;
      Combo_clipagpro_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode21 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A288CliPagNom = "" ;
      A286CliPagDom = "" ;
      A11471CliPagHome = "" ;
      A289CliPagPob = "" ;
      A2326CliPagCp = "" ;
      A290CliPagPrn = "" ;
      A282CliPagCcb = "" ;
      A283CliPagCcs = "" ;
      A285CliPagDig = "" ;
      A284CliPagCue = "" ;
      A10060CliPagIban = "" ;
      A10415CliNIB = "" ;
      A10416CliSwift = "" ;
      AV29Station = "" ;
      AV30EmprNom = "" ;
      AV26UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV37WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV38TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV39WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV41ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T000M7_A407EmprNom = new String[] {""} ;
      T000M7_n407EmprNom = new boolean[] {false} ;
      T000M8_A252CliCod = new int[1] ;
      T000M8_n252CliCod = new boolean[] {false} ;
      T000M8_A279CliNom = new String[] {""} ;
      T000M8_A292CliPagUli = new byte[1] ;
      T000M8_n292CliPagUli = new boolean[] {false} ;
      T000M8_A407EmprNom = new String[] {""} ;
      T000M8_n407EmprNom = new boolean[] {false} ;
      T000M8_A396EmprCod = new String[] {""} ;
      T000M9_A396EmprCod = new String[] {""} ;
      T000M9_A252CliCod = new int[1] ;
      T000M9_n252CliCod = new boolean[] {false} ;
      T000M6_A252CliCod = new int[1] ;
      T000M6_n252CliCod = new boolean[] {false} ;
      T000M6_A279CliNom = new String[] {""} ;
      T000M6_A292CliPagUli = new byte[1] ;
      T000M6_n292CliPagUli = new boolean[] {false} ;
      T000M6_A396EmprCod = new String[] {""} ;
      T000M10_A396EmprCod = new String[] {""} ;
      T000M10_A252CliCod = new int[1] ;
      T000M10_n252CliCod = new boolean[] {false} ;
      T000M11_A396EmprCod = new String[] {""} ;
      T000M11_A252CliCod = new int[1] ;
      T000M11_n252CliCod = new boolean[] {false} ;
      T000M5_A252CliCod = new int[1] ;
      T000M5_n252CliCod = new boolean[] {false} ;
      T000M5_A279CliNom = new String[] {""} ;
      T000M5_A292CliPagUli = new byte[1] ;
      T000M5_n292CliPagUli = new boolean[] {false} ;
      T000M5_A396EmprCod = new String[] {""} ;
      T000M15_A396EmprCod = new String[] {""} ;
      T000M15_A252CliCod = new int[1] ;
      T000M15_n252CliCod = new boolean[] {false} ;
      T000M15_A6930Lb_rclin = new int[1] ;
      T000M16_A396EmprCod = new String[] {""} ;
      T000M16_A6850Tex_NPed = new int[1] ;
      T000M17_A396EmprCod = new String[] {""} ;
      T000M17_A252CliCod = new int[1] ;
      T000M17_n252CliCod = new boolean[] {false} ;
      T000M17_A829TipArtCod = new short[1] ;
      T000M17_A831TipColCod = new byte[1] ;
      T000M17_A583IntCod = new byte[1] ;
      T000M17_A5098TipDisCod = new String[] {""} ;
      T000M17_A6603Est1_anyo = new short[1] ;
      T000M17_A6604Est1_mes = new byte[1] ;
      T000M17_A6605Est1_dia = new byte[1] ;
      T000M18_A396EmprCod = new String[] {""} ;
      T000M18_A6319C_Barcod = new int[1] ;
      T000M18_A6320C_Barcodre = new byte[1] ;
      T000M18_A6321C_Barcodpa = new String[] {""} ;
      T000M18_A6322C_Reclinma = new short[1] ;
      T000M19_A396EmprCod = new String[] {""} ;
      T000M19_A6235DevEmpCod = new int[1] ;
      T000M20_A396EmprCod = new String[] {""} ;
      T000M20_A602MaqCod = new String[] {""} ;
      T000M20_A6078MaqCliCod = new int[1] ;
      T000M20_A6079MaqArtCod = new String[] {""} ;
      T000M21_A396EmprCod = new String[] {""} ;
      T000M21_A5532Lb_numero = new int[1] ;
      T000M22_A396EmprCod = new String[] {""} ;
      T000M22_A252CliCod = new int[1] ;
      T000M22_n252CliCod = new boolean[] {false} ;
      T000M22_A5503CliifLin = new short[1] ;
      T000M23_A396EmprCod = new String[] {""} ;
      T000M23_A252CliCod = new int[1] ;
      T000M23_n252CliCod = new boolean[] {false} ;
      T000M23_A5499ClieiLin = new short[1] ;
      T000M24_A396EmprCod = new String[] {""} ;
      T000M24_A252CliCod = new int[1] ;
      T000M24_n252CliCod = new boolean[] {false} ;
      T000M24_A5495ClidtLin = new short[1] ;
      T000M25_A396EmprCod = new String[] {""} ;
      T000M25_A252CliCod = new int[1] ;
      T000M25_n252CliCod = new boolean[] {false} ;
      T000M25_A5491CliedLin = new short[1] ;
      T000M26_A396EmprCod = new String[] {""} ;
      T000M26_A252CliCod = new int[1] ;
      T000M26_n252CliCod = new boolean[] {false} ;
      T000M26_A5452P_ForCod = new String[] {""} ;
      T000M27_A396EmprCod = new String[] {""} ;
      T000M27_A252CliCod = new int[1] ;
      T000M27_n252CliCod = new boolean[] {false} ;
      T000M27_A5443Mdl_Cod = new String[] {""} ;
      T000M28_A396EmprCod = new String[] {""} ;
      T000M28_A252CliCod = new int[1] ;
      T000M28_n252CliCod = new boolean[] {false} ;
      T000M28_A5436IntCodF2 = new short[1] ;
      T000M29_A396EmprCod = new String[] {""} ;
      T000M29_A252CliCod = new int[1] ;
      T000M29_n252CliCod = new boolean[] {false} ;
      T000M29_A5396IntCodFC = new byte[1] ;
      T000M29_A5434Tip_ColC = new byte[1] ;
      T000M30_A396EmprCod = new String[] {""} ;
      T000M30_A252CliCod = new int[1] ;
      T000M30_n252CliCod = new boolean[] {false} ;
      T000M30_A5428FasPreCod = new String[] {""} ;
      T000M31_A396EmprCod = new String[] {""} ;
      T000M31_A252CliCod = new int[1] ;
      T000M31_n252CliCod = new boolean[] {false} ;
      T000M31_A5398Cli_Proc = new String[] {""} ;
      T000M32_A396EmprCod = new String[] {""} ;
      T000M32_A5130PagIden = new int[1] ;
      T000M33_A396EmprCod = new String[] {""} ;
      T000M33_A5059Hl_hdr = new int[1] ;
      T000M33_A5060Hl_hdrr = new byte[1] ;
      T000M33_A5061Hl_hdrp = new String[] {""} ;
      T000M34_A396EmprCod = new String[] {""} ;
      T000M34_A252CliCod = new int[1] ;
      T000M34_n252CliCod = new boolean[] {false} ;
      T000M34_A4718DishCod = new String[] {""} ;
      T000M34_A5020TipEstCod = new byte[1] ;
      T000M34_A5022GraCod = new byte[1] ;
      T000M35_A396EmprCod = new String[] {""} ;
      T000M35_A4618EnsLCod = new int[1] ;
      T000M36_A396EmprCod = new String[] {""} ;
      T000M36_A4492HreBarCod = new int[1] ;
      T000M36_A4493HreBarReo = new byte[1] ;
      T000M36_A4494HreBarPar = new String[] {""} ;
      T000M36_A4495HreNumCie = new byte[1] ;
      T000M37_A396EmprCod = new String[] {""} ;
      T000M37_A252CliCod = new int[1] ;
      T000M37_n252CliCod = new boolean[] {false} ;
      T000M37_A4415EstCol = new String[] {""} ;
      T000M38_A396EmprCod = new String[] {""} ;
      T000M38_A4185WEBUSU = new String[] {""} ;
      T000M39_A396EmprCod = new String[] {""} ;
      T000M39_A252CliCod = new int[1] ;
      T000M39_n252CliCod = new boolean[] {false} ;
      T000M39_A4079WEBDISCOD = new String[] {""} ;
      T000M39_A4078EMPCOD = new String[] {""} ;
      T000M40_A396EmprCod = new String[] {""} ;
      T000M40_A2637HisEstHRu = new int[1] ;
      T000M40_A2636HisEstHRe = new byte[1] ;
      T000M40_A2635HisEstHPa = new String[] {""} ;
      T000M40_A2638HisEstLCo = new byte[1] ;
      T000M40_A2630HisEstCom = new String[] {""} ;
      T000M40_A2634HisEstFon = new String[] {""} ;
      T000M41_A396EmprCod = new String[] {""} ;
      T000M41_A2574GrpDibCod = new int[1] ;
      T000M42_A396EmprCod = new String[] {""} ;
      T000M42_A2558GrmDibCod = new int[1] ;
      T000M43_A396EmprCod = new String[] {""} ;
      T000M43_A2542GrcDibCod = new int[1] ;
      T000M44_A396EmprCod = new String[] {""} ;
      T000M44_A1031EmpesCod = new String[] {""} ;
      T000M44_A252CliCod = new int[1] ;
      T000M44_n252CliCod = new boolean[] {false} ;
      T000M44_A1032FonCod = new String[] {""} ;
      T000M45_A396EmprCod = new String[] {""} ;
      T000M45_A1013DibCli = new String[] {""} ;
      T000M45_A252CliCod = new int[1] ;
      T000M45_n252CliCod = new boolean[] {false} ;
      T000M45_A1014DibInt = new int[1] ;
      T000M46_A396EmprCod = new String[] {""} ;
      T000M46_A1736AlbExtCod = new long[1] ;
      T000M47_A396EmprCod = new String[] {""} ;
      T000M47_A252CliCod = new int[1] ;
      T000M47_n252CliCod = new boolean[] {false} ;
      T000M47_A3661FacProAny = new short[1] ;
      T000M47_A3662FacProSer = new String[] {""} ;
      T000M47_A3663FacProInt = new byte[1] ;
      T000M47_A3664FacProTip = new byte[1] ;
      T000M47_A3665FacProTar = new short[1] ;
      T000M48_A396EmprCod = new String[] {""} ;
      T000M48_A3646EstTinAny = new short[1] ;
      T000M48_A3647EstTinMes = new byte[1] ;
      T000M48_A3648EstTinDia = new byte[1] ;
      T000M48_A1929EstTinNr = new short[1] ;
      T000M49_A396EmprCod = new String[] {""} ;
      T000M49_A3617AlbTrnCod = new long[1] ;
      T000M50_A396EmprCod = new String[] {""} ;
      T000M50_A252CliCod = new int[1] ;
      T000M50_n252CliCod = new boolean[] {false} ;
      T000M50_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000M51_A396EmprCod = new String[] {""} ;
      T000M51_A3073RepCod = new String[] {""} ;
      T000M51_A252CliCod = new int[1] ;
      T000M51_n252CliCod = new boolean[] {false} ;
      T000M52_A396EmprCod = new String[] {""} ;
      T000M52_A3061Codia = new byte[1] ;
      T000M52_A3062CoMes = new byte[1] ;
      T000M52_A3063CoAny = new short[1] ;
      T000M52_A3065CoLin = new byte[1] ;
      T000M52_A3010CoBarCod = new int[1] ;
      T000M52_A3011CoBarReo = new byte[1] ;
      T000M52_A3012CoBarPar = new String[] {""} ;
      T000M53_A396EmprCod = new String[] {""} ;
      T000M53_A2971SabFacCod = new int[1] ;
      T000M54_A396EmprCod = new String[] {""} ;
      T000M54_A2954TiDia = new byte[1] ;
      T000M54_A2955TiMes = new byte[1] ;
      T000M54_A2956TiAny = new short[1] ;
      T000M54_A2958TiLin = new byte[1] ;
      T000M54_A2959TiBarCod = new int[1] ;
      T000M54_A2960TiBarReo = new byte[1] ;
      T000M54_A2961TiBarPar = new String[] {""} ;
      T000M55_A396EmprCod = new String[] {""} ;
      T000M55_A252CliCod = new int[1] ;
      T000M55_n252CliCod = new boolean[] {false} ;
      T000M55_A2933RecTipCon = new short[1] ;
      T000M56_A396EmprCod = new String[] {""} ;
      T000M56_A252CliCod = new int[1] ;
      T000M56_n252CliCod = new boolean[] {false} ;
      T000M56_A2927RecProCod = new String[] {""} ;
      T000M57_A396EmprCod = new String[] {""} ;
      T000M57_A252CliCod = new int[1] ;
      T000M57_n252CliCod = new boolean[] {false} ;
      T000M57_A2891HMaForSer = new String[] {""} ;
      T000M57_A2892HMaForCNom = new String[] {""} ;
      T000M57_A2893HMaForCNum = new int[1] ;
      T000M57_A2894HMaTipCCod = new byte[1] ;
      T000M57_A2895HMaForNumC = new int[1] ;
      T000M57_A2897HMaColLin = new short[1] ;
      T000M57_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T000M57_A2907HmaLin = new short[1] ;
      T000M58_A396EmprCod = new String[] {""} ;
      T000M58_A252CliCod = new int[1] ;
      T000M58_n252CliCod = new boolean[] {false} ;
      T000M58_A425EstAny = new short[1] ;
      T000M58_A2755EstSerFac = new String[] {""} ;
      T000M59_A396EmprCod = new String[] {""} ;
      T000M59_A2730RecTipCo = new short[1] ;
      T000M59_A252CliCod = new int[1] ;
      T000M59_n252CliCod = new boolean[] {false} ;
      T000M60_A396EmprCod = new String[] {""} ;
      T000M60_A2720TarSec = new String[] {""} ;
      T000M60_A252CliCod = new int[1] ;
      T000M60_n252CliCod = new boolean[] {false} ;
      T000M60_A829TipArtCod = new short[1] ;
      T000M60_A831TipColCod = new byte[1] ;
      T000M61_A396EmprCod = new String[] {""} ;
      T000M61_A2382AbcTerCod = new String[] {""} ;
      T000M61_A2381AbcSec = new String[] {""} ;
      T000M61_A252CliCod = new int[1] ;
      T000M61_n252CliCod = new boolean[] {false} ;
      T000M62_A396EmprCod = new String[] {""} ;
      T000M62_A252CliCod = new int[1] ;
      T000M62_n252CliCod = new boolean[] {false} ;
      T000M62_A2308CliDesCod = new int[1] ;
      T000M63_A396EmprCod = new String[] {""} ;
      T000M63_A2268MovParCod = new String[] {""} ;
      T000M63_A252CliCod = new int[1] ;
      T000M63_n252CliCod = new boolean[] {false} ;
      T000M64_A396EmprCod = new String[] {""} ;
      T000M64_A966PartCod = new String[] {""} ;
      T000M64_A252CliCod = new int[1] ;
      T000M64_n252CliCod = new boolean[] {false} ;
      T000M65_A396EmprCod = new String[] {""} ;
      T000M65_A1387AlbPrvCod = new int[1] ;
      T000M66_A396EmprCod = new String[] {""} ;
      T000M66_A252CliCod = new int[1] ;
      T000M66_n252CliCod = new boolean[] {false} ;
      T000M66_A1213TalCod = new String[] {""} ;
      T000M67_A396EmprCod = new String[] {""} ;
      T000M67_A252CliCod = new int[1] ;
      T000M67_n252CliCod = new boolean[] {false} ;
      T000M67_A457FasCod = new String[] {""} ;
      T000M68_A396EmprCod = new String[] {""} ;
      T000M68_A539HisBarCod = new int[1] ;
      T000M68_A545HisCodReo = new byte[1] ;
      T000M68_A544HisCodPar = new String[] {""} ;
      T000M68_A833TipDefCod = new short[1] ;
      T000M69_A396EmprCod = new String[] {""} ;
      T000M69_A506HbaBarCod = new int[1] ;
      T000M69_A508HbaBarReo = new byte[1] ;
      T000M69_A507HbaBarPar = new String[] {""} ;
      T000M70_A396EmprCod = new String[] {""} ;
      T000M70_A252CliCod = new int[1] ;
      T000M70_n252CliCod = new boolean[] {false} ;
      T000M70_A494ForSer = new String[] {""} ;
      T000M70_A482ForColNom = new String[] {""} ;
      T000M70_A483ForColNum = new int[1] ;
      T000M70_A831TipColCod = new byte[1] ;
      T000M71_A396EmprCod = new String[] {""} ;
      T000M71_A252CliCod = new int[1] ;
      T000M71_n252CliCod = new boolean[] {false} ;
      T000M71_A266CliEnvLin = new byte[1] ;
      T000M72_A396EmprCod = new String[] {""} ;
      T000M72_A252CliCod = new int[1] ;
      T000M72_n252CliCod = new boolean[] {false} ;
      T000M72_A65ArtCod = new String[] {""} ;
      T000M73_A396EmprCod = new String[] {""} ;
      T000M73_A44AlbRecCod = new int[1] ;
      T000M74_A396EmprCod = new String[] {""} ;
      T000M74_A30AlbProCod = new long[1] ;
      T000M75_A396EmprCod = new String[] {""} ;
      T000M75_A14AlbComCod = new int[1] ;
      T000M77_A396EmprCod = new String[] {""} ;
      T000M77_A252CliCod = new int[1] ;
      T000M77_n252CliCod = new boolean[] {false} ;
      Z290CliPagPrn = "" ;
      T000M78_A252CliCod = new int[1] ;
      T000M78_n252CliCod = new boolean[] {false} ;
      T000M78_A287CliPagLin = new byte[1] ;
      T000M78_A288CliPagNom = new String[] {""} ;
      T000M78_A286CliPagDom = new String[] {""} ;
      T000M78_A11471CliPagHome = new String[] {""} ;
      T000M78_A289CliPagPob = new String[] {""} ;
      T000M78_A2326CliPagCp = new String[] {""} ;
      T000M78_A290CliPagPrn = new String[] {""} ;
      T000M78_n290CliPagPrn = new boolean[] {false} ;
      T000M78_A282CliPagCcb = new String[] {""} ;
      T000M78_A283CliPagCcs = new String[] {""} ;
      T000M78_A285CliPagDig = new String[] {""} ;
      T000M78_A284CliPagCue = new String[] {""} ;
      T000M78_A10060CliPagIban = new String[] {""} ;
      T000M78_A10415CliNIB = new String[] {""} ;
      T000M78_A10416CliSwift = new String[] {""} ;
      T000M78_A291CliPagPro = new short[1] ;
      T000M78_A396EmprCod = new String[] {""} ;
      T000M4_A290CliPagPrn = new String[] {""} ;
      T000M4_n290CliPagPrn = new boolean[] {false} ;
      GXCCtl = "" ;
      T000M79_A290CliPagPrn = new String[] {""} ;
      T000M79_n290CliPagPrn = new boolean[] {false} ;
      T000M80_A396EmprCod = new String[] {""} ;
      T000M80_A252CliCod = new int[1] ;
      T000M80_n252CliCod = new boolean[] {false} ;
      T000M80_A287CliPagLin = new byte[1] ;
      T000M3_A252CliCod = new int[1] ;
      T000M3_n252CliCod = new boolean[] {false} ;
      T000M3_A287CliPagLin = new byte[1] ;
      T000M3_A288CliPagNom = new String[] {""} ;
      T000M3_A286CliPagDom = new String[] {""} ;
      T000M3_A11471CliPagHome = new String[] {""} ;
      T000M3_A289CliPagPob = new String[] {""} ;
      T000M3_A2326CliPagCp = new String[] {""} ;
      T000M3_A282CliPagCcb = new String[] {""} ;
      T000M3_A283CliPagCcs = new String[] {""} ;
      T000M3_A285CliPagDig = new String[] {""} ;
      T000M3_A284CliPagCue = new String[] {""} ;
      T000M3_A10060CliPagIban = new String[] {""} ;
      T000M3_A10415CliNIB = new String[] {""} ;
      T000M3_A10416CliSwift = new String[] {""} ;
      T000M3_A291CliPagPro = new short[1] ;
      T000M3_A396EmprCod = new String[] {""} ;
      T000M2_A252CliCod = new int[1] ;
      T000M2_n252CliCod = new boolean[] {false} ;
      T000M2_A287CliPagLin = new byte[1] ;
      T000M2_A288CliPagNom = new String[] {""} ;
      T000M2_A286CliPagDom = new String[] {""} ;
      T000M2_A11471CliPagHome = new String[] {""} ;
      T000M2_A289CliPagPob = new String[] {""} ;
      T000M2_A2326CliPagCp = new String[] {""} ;
      T000M2_A282CliPagCcb = new String[] {""} ;
      T000M2_A283CliPagCcs = new String[] {""} ;
      T000M2_A285CliPagDig = new String[] {""} ;
      T000M2_A284CliPagCue = new String[] {""} ;
      T000M2_A10060CliPagIban = new String[] {""} ;
      T000M2_A10415CliNIB = new String[] {""} ;
      T000M2_A10416CliSwift = new String[] {""} ;
      T000M2_A291CliPagPro = new short[1] ;
      T000M2_A396EmprCod = new String[] {""} ;
      T000M84_A290CliPagPrn = new String[] {""} ;
      T000M84_n290CliPagPrn = new boolean[] {false} ;
      T000M85_A396EmprCod = new String[] {""} ;
      T000M85_A252CliCod = new int[1] ;
      T000M85_n252CliCod = new boolean[] {false} ;
      T000M85_A287CliPagLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclipag__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclipag__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclipag__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclipag__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclipag__default(),
         new Object[] {
             new Object[] {
            T000M2_A252CliCod, T000M2_A287CliPagLin, T000M2_A288CliPagNom, T000M2_A286CliPagDom, T000M2_A11471CliPagHome, T000M2_A289CliPagPob, T000M2_A2326CliPagCp, T000M2_A282CliPagCcb, T000M2_A283CliPagCcs, T000M2_A285CliPagDig,
            T000M2_A284CliPagCue, T000M2_A10060CliPagIban, T000M2_A10415CliNIB, T000M2_A10416CliSwift, T000M2_A291CliPagPro, T000M2_A396EmprCod
            }
            , new Object[] {
            T000M3_A252CliCod, T000M3_A287CliPagLin, T000M3_A288CliPagNom, T000M3_A286CliPagDom, T000M3_A11471CliPagHome, T000M3_A289CliPagPob, T000M3_A2326CliPagCp, T000M3_A282CliPagCcb, T000M3_A283CliPagCcs, T000M3_A285CliPagDig,
            T000M3_A284CliPagCue, T000M3_A10060CliPagIban, T000M3_A10415CliNIB, T000M3_A10416CliSwift, T000M3_A291CliPagPro, T000M3_A396EmprCod
            }
            , new Object[] {
            T000M4_A290CliPagPrn, T000M4_n290CliPagPrn
            }
            , new Object[] {
            T000M5_A252CliCod, T000M5_A279CliNom, T000M5_A292CliPagUli, T000M5_n292CliPagUli, T000M5_A396EmprCod
            }
            , new Object[] {
            T000M6_A252CliCod, T000M6_A279CliNom, T000M6_A292CliPagUli, T000M6_n292CliPagUli, T000M6_A396EmprCod
            }
            , new Object[] {
            T000M7_A407EmprNom, T000M7_n407EmprNom
            }
            , new Object[] {
            T000M8_A252CliCod, T000M8_A279CliNom, T000M8_A292CliPagUli, T000M8_n292CliPagUli, T000M8_A407EmprNom, T000M8_n407EmprNom, T000M8_A396EmprCod
            }
            , new Object[] {
            T000M9_A396EmprCod, T000M9_A252CliCod
            }
            , new Object[] {
            T000M10_A396EmprCod, T000M10_A252CliCod
            }
            , new Object[] {
            T000M11_A396EmprCod, T000M11_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000M15_A396EmprCod, T000M15_A252CliCod, T000M15_A6930Lb_rclin
            }
            , new Object[] {
            T000M16_A396EmprCod, T000M16_A6850Tex_NPed
            }
            , new Object[] {
            T000M17_A396EmprCod, T000M17_A252CliCod, T000M17_A829TipArtCod, T000M17_A831TipColCod, T000M17_A583IntCod, T000M17_A5098TipDisCod, T000M17_A6603Est1_anyo, T000M17_A6604Est1_mes, T000M17_A6605Est1_dia
            }
            , new Object[] {
            T000M18_A396EmprCod, T000M18_A6319C_Barcod, T000M18_A6320C_Barcodre, T000M18_A6321C_Barcodpa, T000M18_A6322C_Reclinma
            }
            , new Object[] {
            T000M19_A396EmprCod, T000M19_A6235DevEmpCod
            }
            , new Object[] {
            T000M20_A396EmprCod, T000M20_A602MaqCod, T000M20_A6078MaqCliCod, T000M20_A6079MaqArtCod
            }
            , new Object[] {
            T000M21_A396EmprCod, T000M21_A5532Lb_numero
            }
            , new Object[] {
            T000M22_A396EmprCod, T000M22_A252CliCod, T000M22_A5503CliifLin
            }
            , new Object[] {
            T000M23_A396EmprCod, T000M23_A252CliCod, T000M23_A5499ClieiLin
            }
            , new Object[] {
            T000M24_A396EmprCod, T000M24_A252CliCod, T000M24_A5495ClidtLin
            }
            , new Object[] {
            T000M25_A396EmprCod, T000M25_A252CliCod, T000M25_A5491CliedLin
            }
            , new Object[] {
            T000M26_A396EmprCod, T000M26_A252CliCod, T000M26_A5452P_ForCod
            }
            , new Object[] {
            T000M27_A396EmprCod, T000M27_A252CliCod, T000M27_A5443Mdl_Cod
            }
            , new Object[] {
            T000M28_A396EmprCod, T000M28_A252CliCod, T000M28_A5436IntCodF2
            }
            , new Object[] {
            T000M29_A396EmprCod, T000M29_A252CliCod, T000M29_A5396IntCodFC, T000M29_A5434Tip_ColC
            }
            , new Object[] {
            T000M30_A396EmprCod, T000M30_A252CliCod, T000M30_A5428FasPreCod
            }
            , new Object[] {
            T000M31_A396EmprCod, T000M31_A252CliCod, T000M31_A5398Cli_Proc
            }
            , new Object[] {
            T000M32_A396EmprCod, T000M32_A5130PagIden
            }
            , new Object[] {
            T000M33_A396EmprCod, T000M33_A5059Hl_hdr, T000M33_A5060Hl_hdrr, T000M33_A5061Hl_hdrp
            }
            , new Object[] {
            T000M34_A396EmprCod, T000M34_A252CliCod, T000M34_A4718DishCod, T000M34_A5020TipEstCod, T000M34_A5022GraCod
            }
            , new Object[] {
            T000M35_A396EmprCod, T000M35_A4618EnsLCod
            }
            , new Object[] {
            T000M36_A396EmprCod, T000M36_A4492HreBarCod, T000M36_A4493HreBarReo, T000M36_A4494HreBarPar, T000M36_A4495HreNumCie
            }
            , new Object[] {
            T000M37_A396EmprCod, T000M37_A252CliCod, T000M37_A4415EstCol
            }
            , new Object[] {
            T000M38_A396EmprCod, T000M38_A4185WEBUSU
            }
            , new Object[] {
            T000M39_A396EmprCod, T000M39_A252CliCod, T000M39_A4079WEBDISCOD, T000M39_A4078EMPCOD
            }
            , new Object[] {
            T000M40_A396EmprCod, T000M40_A2637HisEstHRu, T000M40_A2636HisEstHRe, T000M40_A2635HisEstHPa, T000M40_A2638HisEstLCo, T000M40_A2630HisEstCom, T000M40_A2634HisEstFon
            }
            , new Object[] {
            T000M41_A396EmprCod, T000M41_A2574GrpDibCod
            }
            , new Object[] {
            T000M42_A396EmprCod, T000M42_A2558GrmDibCod
            }
            , new Object[] {
            T000M43_A396EmprCod, T000M43_A2542GrcDibCod
            }
            , new Object[] {
            T000M44_A396EmprCod, T000M44_A1031EmpesCod, T000M44_A252CliCod, T000M44_A1032FonCod
            }
            , new Object[] {
            T000M45_A396EmprCod, T000M45_A1013DibCli, T000M45_A252CliCod, T000M45_A1014DibInt
            }
            , new Object[] {
            T000M46_A396EmprCod, T000M46_A1736AlbExtCod
            }
            , new Object[] {
            T000M47_A396EmprCod, T000M47_A252CliCod, T000M47_A3661FacProAny, T000M47_A3662FacProSer, T000M47_A3663FacProInt, T000M47_A3664FacProTip, T000M47_A3665FacProTar
            }
            , new Object[] {
            T000M48_A396EmprCod, T000M48_A3646EstTinAny, T000M48_A3647EstTinMes, T000M48_A3648EstTinDia, T000M48_A1929EstTinNr
            }
            , new Object[] {
            T000M49_A396EmprCod, T000M49_A3617AlbTrnCod
            }
            , new Object[] {
            T000M50_A396EmprCod, T000M50_A252CliCod, T000M50_A3320CliLimKgs
            }
            , new Object[] {
            T000M51_A396EmprCod, T000M51_A3073RepCod, T000M51_A252CliCod
            }
            , new Object[] {
            T000M52_A396EmprCod, T000M52_A3061Codia, T000M52_A3062CoMes, T000M52_A3063CoAny, T000M52_A3065CoLin, T000M52_A3010CoBarCod, T000M52_A3011CoBarReo, T000M52_A3012CoBarPar
            }
            , new Object[] {
            T000M53_A396EmprCod, T000M53_A2971SabFacCod
            }
            , new Object[] {
            T000M54_A396EmprCod, T000M54_A2954TiDia, T000M54_A2955TiMes, T000M54_A2956TiAny, T000M54_A2958TiLin, T000M54_A2959TiBarCod, T000M54_A2960TiBarReo, T000M54_A2961TiBarPar
            }
            , new Object[] {
            T000M55_A396EmprCod, T000M55_A252CliCod, T000M55_A2933RecTipCon
            }
            , new Object[] {
            T000M56_A396EmprCod, T000M56_A252CliCod, T000M56_A2927RecProCod
            }
            , new Object[] {
            T000M57_A396EmprCod, T000M57_A252CliCod, T000M57_A2891HMaForSer, T000M57_A2892HMaForCNom, T000M57_A2893HMaForCNum, T000M57_A2894HMaTipCCod, T000M57_A2895HMaForNumC, T000M57_A2897HMaColLin, T000M57_A2896HMaFec, T000M57_A2907HmaLin
            }
            , new Object[] {
            T000M58_A396EmprCod, T000M58_A252CliCod, T000M58_A425EstAny, T000M58_A2755EstSerFac
            }
            , new Object[] {
            T000M59_A396EmprCod, T000M59_A2730RecTipCo, T000M59_A252CliCod
            }
            , new Object[] {
            T000M60_A396EmprCod, T000M60_A2720TarSec, T000M60_A252CliCod, T000M60_A829TipArtCod, T000M60_A831TipColCod
            }
            , new Object[] {
            T000M61_A396EmprCod, T000M61_A2382AbcTerCod, T000M61_A2381AbcSec, T000M61_A252CliCod
            }
            , new Object[] {
            T000M62_A396EmprCod, T000M62_A252CliCod, T000M62_A2308CliDesCod
            }
            , new Object[] {
            T000M63_A396EmprCod, T000M63_A2268MovParCod, T000M63_A252CliCod
            }
            , new Object[] {
            T000M64_A396EmprCod, T000M64_A966PartCod, T000M64_A252CliCod
            }
            , new Object[] {
            T000M65_A396EmprCod, T000M65_A1387AlbPrvCod
            }
            , new Object[] {
            T000M66_A396EmprCod, T000M66_A252CliCod, T000M66_A1213TalCod
            }
            , new Object[] {
            T000M67_A396EmprCod, T000M67_A252CliCod, T000M67_A457FasCod
            }
            , new Object[] {
            T000M68_A396EmprCod, T000M68_A539HisBarCod, T000M68_A545HisCodReo, T000M68_A544HisCodPar, T000M68_A833TipDefCod
            }
            , new Object[] {
            T000M69_A396EmprCod, T000M69_A506HbaBarCod, T000M69_A508HbaBarReo, T000M69_A507HbaBarPar
            }
            , new Object[] {
            T000M70_A396EmprCod, T000M70_A252CliCod, T000M70_A494ForSer, T000M70_A482ForColNom, T000M70_A483ForColNum, T000M70_A831TipColCod
            }
            , new Object[] {
            T000M71_A396EmprCod, T000M71_A252CliCod, T000M71_A266CliEnvLin
            }
            , new Object[] {
            T000M72_A396EmprCod, T000M72_A252CliCod, T000M72_A65ArtCod
            }
            , new Object[] {
            T000M73_A396EmprCod, T000M73_A44AlbRecCod
            }
            , new Object[] {
            T000M74_A396EmprCod, T000M74_A30AlbProCod
            }
            , new Object[] {
            T000M75_A396EmprCod, T000M75_A14AlbComCod
            }
            , new Object[] {
            }
            , new Object[] {
            T000M77_A396EmprCod, T000M77_A252CliCod
            }
            , new Object[] {
            T000M78_A252CliCod, T000M78_A287CliPagLin, T000M78_A288CliPagNom, T000M78_A286CliPagDom, T000M78_A11471CliPagHome, T000M78_A289CliPagPob, T000M78_A2326CliPagCp, T000M78_A290CliPagPrn, T000M78_n290CliPagPrn, T000M78_A282CliPagCcb,
            T000M78_A283CliPagCcs, T000M78_A285CliPagDig, T000M78_A284CliPagCue, T000M78_A10060CliPagIban, T000M78_A10415CliNIB, T000M78_A10416CliSwift, T000M78_A291CliPagPro, T000M78_A396EmprCod
            }
            , new Object[] {
            T000M79_A290CliPagPrn, T000M79_n290CliPagPrn
            }
            , new Object[] {
            T000M80_A396EmprCod, T000M80_A252CliCod, T000M80_A287CliPagLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000M84_A290CliPagPrn, T000M84_n290CliPagPrn
            }
            , new Object[] {
            T000M85_A396EmprCod, T000M85_A252CliCod, T000M85_A287CliPagLin
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte Z292CliPagUli ;
   private byte O292CliPagUli ;
   private byte Z287CliPagLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A292CliPagUli ;
   private byte Gx_BScreen ;
   private byte B292CliPagUli ;
   private byte s292CliPagUli ;
   private byte A287CliPagLin ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i292CliPagUli ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short Z291CliPagPro ;
   private short nRcdDeleted_26 ;
   private short nRcdExists_26 ;
   private short nIsMod_26 ;
   private short A291CliPagPro ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount26 ;
   private short RcdFound26 ;
   private short nBlankRcdUsr26 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_26 ;
   private int wcpOAV36CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int AV36CliCod ;
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
   private int edtCliPagLin_Enabled ;
   private int edtCliPagNom_Enabled ;
   private int edtCliPagDom_Enabled ;
   private int edtCliPagHome_Enabled ;
   private int edtCliPagPob_Enabled ;
   private int edtCliPagCp_Enabled ;
   private int edtCliPagPro_Enabled ;
   private int edtCliPagPrn_Enabled ;
   private int edtCliPagCcb_Enabled ;
   private int edtCliPagCcs_Enabled ;
   private int edtCliPagDig_Enabled ;
   private int edtCliPagCue_Enabled ;
   private int edtCliPagIban_Enabled ;
   private int edtCliNIB_Enabled ;
   private int edtCliSwift_Enabled ;
   private int fRowAdded ;
   private int Combo_clipagpro_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtCliPagPrn_Enabled ;
   private int defedtCliPagLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV35EmprCod ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z288CliPagNom ;
   private String Z286CliPagDom ;
   private String Z11471CliPagHome ;
   private String Z289CliPagPob ;
   private String Z2326CliPagCp ;
   private String Z282CliPagCcb ;
   private String Z283CliPagCcs ;
   private String Z285CliPagDig ;
   private String Z284CliPagCue ;
   private String Z10060CliPagIban ;
   private String Z10415CliNIB ;
   private String Z10416CliSwift ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV35EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_32_idx="0001" ;
   private String edtCliPagPro_Horizontalalignment ;
   private String edtCliPagPro_Internalname ;
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
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_clipagpro_Caption ;
   private String Combo_clipagpro_Cls ;
   private String Combo_clipagpro_Internalname ;
   private String sMode26 ;
   private String edtCliPagLin_Internalname ;
   private String edtCliPagNom_Internalname ;
   private String edtCliPagDom_Internalname ;
   private String edtCliPagHome_Internalname ;
   private String edtCliPagPob_Internalname ;
   private String edtCliPagCp_Internalname ;
   private String edtCliPagPrn_Internalname ;
   private String edtCliPagCcb_Internalname ;
   private String edtCliPagCcs_Internalname ;
   private String edtCliPagDig_Internalname ;
   private String edtCliPagCue_Internalname ;
   private String edtCliPagIban_Internalname ;
   private String edtCliNIB_Internalname ;
   private String edtCliSwift_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_clipagpro_Objectcall ;
   private String Combo_clipagpro_Class ;
   private String Combo_clipagpro_Icontype ;
   private String Combo_clipagpro_Icon ;
   private String Combo_clipagpro_Tooltip ;
   private String Combo_clipagpro_Selectedvalue_set ;
   private String Combo_clipagpro_Selectedvalue_get ;
   private String Combo_clipagpro_Selectedtext_set ;
   private String Combo_clipagpro_Selectedtext_get ;
   private String Combo_clipagpro_Gamoauthtoken ;
   private String Combo_clipagpro_Ddointernalname ;
   private String Combo_clipagpro_Titlecontrolalign ;
   private String Combo_clipagpro_Dropdownoptionstype ;
   private String Combo_clipagpro_Titlecontrolidtoreplace ;
   private String Combo_clipagpro_Datalisttype ;
   private String Combo_clipagpro_Datalistfixedvalues ;
   private String Combo_clipagpro_Datalistproc ;
   private String Combo_clipagpro_Datalistprocparametersprefix ;
   private String Combo_clipagpro_Remoteservicesparameters ;
   private String Combo_clipagpro_Htmltemplate ;
   private String Combo_clipagpro_Multiplevaluestype ;
   private String Combo_clipagpro_Loadingdata ;
   private String Combo_clipagpro_Noresultsfound ;
   private String Combo_clipagpro_Emptyitemtext ;
   private String Combo_clipagpro_Onlyselectedvalues ;
   private String Combo_clipagpro_Selectalltext ;
   private String Combo_clipagpro_Multiplevaluesseparator ;
   private String Combo_clipagpro_Addnewoptiontext ;
   private String hsh ;
   private String sMode21 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A288CliPagNom ;
   private String A286CliPagDom ;
   private String A11471CliPagHome ;
   private String A289CliPagPob ;
   private String A2326CliPagCp ;
   private String A290CliPagPrn ;
   private String A282CliPagCcb ;
   private String A283CliPagCcs ;
   private String A285CliPagDig ;
   private String A284CliPagCue ;
   private String A10060CliPagIban ;
   private String A10415CliNIB ;
   private String A10416CliSwift ;
   private String AV29Station ;
   private String AV30EmprNom ;
   private String AV26UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z290CliPagPrn ;
   private String GXCCtl ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtCliPagLin_Jsonclick ;
   private String edtCliPagNom_Jsonclick ;
   private String edtCliPagDom_Jsonclick ;
   private String edtCliPagHome_Jsonclick ;
   private String edtCliPagPob_Jsonclick ;
   private String edtCliPagCp_Jsonclick ;
   private String edtCliPagPro_Jsonclick ;
   private String edtCliPagPrn_Jsonclick ;
   private String edtCliPagCcb_Jsonclick ;
   private String edtCliPagCcs_Jsonclick ;
   private String edtCliPagDig_Jsonclick ;
   private String edtCliPagCue_Jsonclick ;
   private String edtCliPagIban_Jsonclick ;
   private String edtCliNIB_Jsonclick ;
   private String edtCliSwift_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean n292CliPagUli ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_clipagpro_Isgriditem ;
   private boolean Combo_clipagpro_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_clipagpro_Enabled ;
   private boolean Combo_clipagpro_Visible ;
   private boolean Combo_clipagpro_Allowmultipleselection ;
   private boolean Combo_clipagpro_Hasdescription ;
   private boolean Combo_clipagpro_Includeonlyselectedoption ;
   private boolean Combo_clipagpro_Includeselectalloption ;
   private boolean Combo_clipagpro_Includeaddnewoption ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean n290CliPagPrn ;
   private boolean Gx_longc ;
   private String AV41ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV39WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clipagpro ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T000M7_A407EmprNom ;
   private boolean[] T000M7_n407EmprNom ;
   private int[] T000M8_A252CliCod ;
   private boolean[] T000M8_n252CliCod ;
   private String[] T000M8_A279CliNom ;
   private byte[] T000M8_A292CliPagUli ;
   private boolean[] T000M8_n292CliPagUli ;
   private String[] T000M8_A407EmprNom ;
   private boolean[] T000M8_n407EmprNom ;
   private String[] T000M8_A396EmprCod ;
   private String[] T000M9_A396EmprCod ;
   private int[] T000M9_A252CliCod ;
   private boolean[] T000M9_n252CliCod ;
   private int[] T000M6_A252CliCod ;
   private boolean[] T000M6_n252CliCod ;
   private String[] T000M6_A279CliNom ;
   private byte[] T000M6_A292CliPagUli ;
   private boolean[] T000M6_n292CliPagUli ;
   private String[] T000M6_A396EmprCod ;
   private String[] T000M10_A396EmprCod ;
   private int[] T000M10_A252CliCod ;
   private boolean[] T000M10_n252CliCod ;
   private String[] T000M11_A396EmprCod ;
   private int[] T000M11_A252CliCod ;
   private boolean[] T000M11_n252CliCod ;
   private int[] T000M5_A252CliCod ;
   private boolean[] T000M5_n252CliCod ;
   private String[] T000M5_A279CliNom ;
   private byte[] T000M5_A292CliPagUli ;
   private boolean[] T000M5_n292CliPagUli ;
   private String[] T000M5_A396EmprCod ;
   private String[] T000M15_A396EmprCod ;
   private int[] T000M15_A252CliCod ;
   private boolean[] T000M15_n252CliCod ;
   private int[] T000M15_A6930Lb_rclin ;
   private String[] T000M16_A396EmprCod ;
   private int[] T000M16_A6850Tex_NPed ;
   private String[] T000M17_A396EmprCod ;
   private int[] T000M17_A252CliCod ;
   private boolean[] T000M17_n252CliCod ;
   private short[] T000M17_A829TipArtCod ;
   private byte[] T000M17_A831TipColCod ;
   private byte[] T000M17_A583IntCod ;
   private String[] T000M17_A5098TipDisCod ;
   private short[] T000M17_A6603Est1_anyo ;
   private byte[] T000M17_A6604Est1_mes ;
   private byte[] T000M17_A6605Est1_dia ;
   private String[] T000M18_A396EmprCod ;
   private int[] T000M18_A6319C_Barcod ;
   private byte[] T000M18_A6320C_Barcodre ;
   private String[] T000M18_A6321C_Barcodpa ;
   private short[] T000M18_A6322C_Reclinma ;
   private String[] T000M19_A396EmprCod ;
   private int[] T000M19_A6235DevEmpCod ;
   private String[] T000M20_A396EmprCod ;
   private String[] T000M20_A602MaqCod ;
   private int[] T000M20_A6078MaqCliCod ;
   private String[] T000M20_A6079MaqArtCod ;
   private String[] T000M21_A396EmprCod ;
   private int[] T000M21_A5532Lb_numero ;
   private String[] T000M22_A396EmprCod ;
   private int[] T000M22_A252CliCod ;
   private boolean[] T000M22_n252CliCod ;
   private short[] T000M22_A5503CliifLin ;
   private String[] T000M23_A396EmprCod ;
   private int[] T000M23_A252CliCod ;
   private boolean[] T000M23_n252CliCod ;
   private short[] T000M23_A5499ClieiLin ;
   private String[] T000M24_A396EmprCod ;
   private int[] T000M24_A252CliCod ;
   private boolean[] T000M24_n252CliCod ;
   private short[] T000M24_A5495ClidtLin ;
   private String[] T000M25_A396EmprCod ;
   private int[] T000M25_A252CliCod ;
   private boolean[] T000M25_n252CliCod ;
   private short[] T000M25_A5491CliedLin ;
   private String[] T000M26_A396EmprCod ;
   private int[] T000M26_A252CliCod ;
   private boolean[] T000M26_n252CliCod ;
   private String[] T000M26_A5452P_ForCod ;
   private String[] T000M27_A396EmprCod ;
   private int[] T000M27_A252CliCod ;
   private boolean[] T000M27_n252CliCod ;
   private String[] T000M27_A5443Mdl_Cod ;
   private String[] T000M28_A396EmprCod ;
   private int[] T000M28_A252CliCod ;
   private boolean[] T000M28_n252CliCod ;
   private short[] T000M28_A5436IntCodF2 ;
   private String[] T000M29_A396EmprCod ;
   private int[] T000M29_A252CliCod ;
   private boolean[] T000M29_n252CliCod ;
   private byte[] T000M29_A5396IntCodFC ;
   private byte[] T000M29_A5434Tip_ColC ;
   private String[] T000M30_A396EmprCod ;
   private int[] T000M30_A252CliCod ;
   private boolean[] T000M30_n252CliCod ;
   private String[] T000M30_A5428FasPreCod ;
   private String[] T000M31_A396EmprCod ;
   private int[] T000M31_A252CliCod ;
   private boolean[] T000M31_n252CliCod ;
   private String[] T000M31_A5398Cli_Proc ;
   private String[] T000M32_A396EmprCod ;
   private int[] T000M32_A5130PagIden ;
   private String[] T000M33_A396EmprCod ;
   private int[] T000M33_A5059Hl_hdr ;
   private byte[] T000M33_A5060Hl_hdrr ;
   private String[] T000M33_A5061Hl_hdrp ;
   private String[] T000M34_A396EmprCod ;
   private int[] T000M34_A252CliCod ;
   private boolean[] T000M34_n252CliCod ;
   private String[] T000M34_A4718DishCod ;
   private byte[] T000M34_A5020TipEstCod ;
   private byte[] T000M34_A5022GraCod ;
   private String[] T000M35_A396EmprCod ;
   private int[] T000M35_A4618EnsLCod ;
   private String[] T000M36_A396EmprCod ;
   private int[] T000M36_A4492HreBarCod ;
   private byte[] T000M36_A4493HreBarReo ;
   private String[] T000M36_A4494HreBarPar ;
   private byte[] T000M36_A4495HreNumCie ;
   private String[] T000M37_A396EmprCod ;
   private int[] T000M37_A252CliCod ;
   private boolean[] T000M37_n252CliCod ;
   private String[] T000M37_A4415EstCol ;
   private String[] T000M38_A396EmprCod ;
   private String[] T000M38_A4185WEBUSU ;
   private String[] T000M39_A396EmprCod ;
   private int[] T000M39_A252CliCod ;
   private boolean[] T000M39_n252CliCod ;
   private String[] T000M39_A4079WEBDISCOD ;
   private String[] T000M39_A4078EMPCOD ;
   private String[] T000M40_A396EmprCod ;
   private int[] T000M40_A2637HisEstHRu ;
   private byte[] T000M40_A2636HisEstHRe ;
   private String[] T000M40_A2635HisEstHPa ;
   private byte[] T000M40_A2638HisEstLCo ;
   private String[] T000M40_A2630HisEstCom ;
   private String[] T000M40_A2634HisEstFon ;
   private String[] T000M41_A396EmprCod ;
   private int[] T000M41_A2574GrpDibCod ;
   private String[] T000M42_A396EmprCod ;
   private int[] T000M42_A2558GrmDibCod ;
   private String[] T000M43_A396EmprCod ;
   private int[] T000M43_A2542GrcDibCod ;
   private String[] T000M44_A396EmprCod ;
   private String[] T000M44_A1031EmpesCod ;
   private int[] T000M44_A252CliCod ;
   private boolean[] T000M44_n252CliCod ;
   private String[] T000M44_A1032FonCod ;
   private String[] T000M45_A396EmprCod ;
   private String[] T000M45_A1013DibCli ;
   private int[] T000M45_A252CliCod ;
   private boolean[] T000M45_n252CliCod ;
   private int[] T000M45_A1014DibInt ;
   private String[] T000M46_A396EmprCod ;
   private long[] T000M46_A1736AlbExtCod ;
   private String[] T000M47_A396EmprCod ;
   private int[] T000M47_A252CliCod ;
   private boolean[] T000M47_n252CliCod ;
   private short[] T000M47_A3661FacProAny ;
   private String[] T000M47_A3662FacProSer ;
   private byte[] T000M47_A3663FacProInt ;
   private byte[] T000M47_A3664FacProTip ;
   private short[] T000M47_A3665FacProTar ;
   private String[] T000M48_A396EmprCod ;
   private short[] T000M48_A3646EstTinAny ;
   private byte[] T000M48_A3647EstTinMes ;
   private byte[] T000M48_A3648EstTinDia ;
   private short[] T000M48_A1929EstTinNr ;
   private String[] T000M49_A396EmprCod ;
   private long[] T000M49_A3617AlbTrnCod ;
   private String[] T000M50_A396EmprCod ;
   private int[] T000M50_A252CliCod ;
   private boolean[] T000M50_n252CliCod ;
   private java.math.BigDecimal[] T000M50_A3320CliLimKgs ;
   private String[] T000M51_A396EmprCod ;
   private String[] T000M51_A3073RepCod ;
   private int[] T000M51_A252CliCod ;
   private boolean[] T000M51_n252CliCod ;
   private String[] T000M52_A396EmprCod ;
   private byte[] T000M52_A3061Codia ;
   private byte[] T000M52_A3062CoMes ;
   private short[] T000M52_A3063CoAny ;
   private byte[] T000M52_A3065CoLin ;
   private int[] T000M52_A3010CoBarCod ;
   private byte[] T000M52_A3011CoBarReo ;
   private String[] T000M52_A3012CoBarPar ;
   private String[] T000M53_A396EmprCod ;
   private int[] T000M53_A2971SabFacCod ;
   private String[] T000M54_A396EmprCod ;
   private byte[] T000M54_A2954TiDia ;
   private byte[] T000M54_A2955TiMes ;
   private short[] T000M54_A2956TiAny ;
   private byte[] T000M54_A2958TiLin ;
   private int[] T000M54_A2959TiBarCod ;
   private byte[] T000M54_A2960TiBarReo ;
   private String[] T000M54_A2961TiBarPar ;
   private String[] T000M55_A396EmprCod ;
   private int[] T000M55_A252CliCod ;
   private boolean[] T000M55_n252CliCod ;
   private short[] T000M55_A2933RecTipCon ;
   private String[] T000M56_A396EmprCod ;
   private int[] T000M56_A252CliCod ;
   private boolean[] T000M56_n252CliCod ;
   private String[] T000M56_A2927RecProCod ;
   private String[] T000M57_A396EmprCod ;
   private int[] T000M57_A252CliCod ;
   private boolean[] T000M57_n252CliCod ;
   private String[] T000M57_A2891HMaForSer ;
   private String[] T000M57_A2892HMaForCNom ;
   private int[] T000M57_A2893HMaForCNum ;
   private byte[] T000M57_A2894HMaTipCCod ;
   private int[] T000M57_A2895HMaForNumC ;
   private short[] T000M57_A2897HMaColLin ;
   private java.util.Date[] T000M57_A2896HMaFec ;
   private short[] T000M57_A2907HmaLin ;
   private String[] T000M58_A396EmprCod ;
   private int[] T000M58_A252CliCod ;
   private boolean[] T000M58_n252CliCod ;
   private short[] T000M58_A425EstAny ;
   private String[] T000M58_A2755EstSerFac ;
   private String[] T000M59_A396EmprCod ;
   private short[] T000M59_A2730RecTipCo ;
   private int[] T000M59_A252CliCod ;
   private boolean[] T000M59_n252CliCod ;
   private String[] T000M60_A396EmprCod ;
   private String[] T000M60_A2720TarSec ;
   private int[] T000M60_A252CliCod ;
   private boolean[] T000M60_n252CliCod ;
   private short[] T000M60_A829TipArtCod ;
   private byte[] T000M60_A831TipColCod ;
   private String[] T000M61_A396EmprCod ;
   private String[] T000M61_A2382AbcTerCod ;
   private String[] T000M61_A2381AbcSec ;
   private int[] T000M61_A252CliCod ;
   private boolean[] T000M61_n252CliCod ;
   private String[] T000M62_A396EmprCod ;
   private int[] T000M62_A252CliCod ;
   private boolean[] T000M62_n252CliCod ;
   private int[] T000M62_A2308CliDesCod ;
   private String[] T000M63_A396EmprCod ;
   private String[] T000M63_A2268MovParCod ;
   private int[] T000M63_A252CliCod ;
   private boolean[] T000M63_n252CliCod ;
   private String[] T000M64_A396EmprCod ;
   private String[] T000M64_A966PartCod ;
   private int[] T000M64_A252CliCod ;
   private boolean[] T000M64_n252CliCod ;
   private String[] T000M65_A396EmprCod ;
   private int[] T000M65_A1387AlbPrvCod ;
   private String[] T000M66_A396EmprCod ;
   private int[] T000M66_A252CliCod ;
   private boolean[] T000M66_n252CliCod ;
   private String[] T000M66_A1213TalCod ;
   private String[] T000M67_A396EmprCod ;
   private int[] T000M67_A252CliCod ;
   private boolean[] T000M67_n252CliCod ;
   private String[] T000M67_A457FasCod ;
   private String[] T000M68_A396EmprCod ;
   private int[] T000M68_A539HisBarCod ;
   private byte[] T000M68_A545HisCodReo ;
   private String[] T000M68_A544HisCodPar ;
   private short[] T000M68_A833TipDefCod ;
   private String[] T000M69_A396EmprCod ;
   private int[] T000M69_A506HbaBarCod ;
   private byte[] T000M69_A508HbaBarReo ;
   private String[] T000M69_A507HbaBarPar ;
   private String[] T000M70_A396EmprCod ;
   private int[] T000M70_A252CliCod ;
   private boolean[] T000M70_n252CliCod ;
   private String[] T000M70_A494ForSer ;
   private String[] T000M70_A482ForColNom ;
   private int[] T000M70_A483ForColNum ;
   private byte[] T000M70_A831TipColCod ;
   private String[] T000M71_A396EmprCod ;
   private int[] T000M71_A252CliCod ;
   private boolean[] T000M71_n252CliCod ;
   private byte[] T000M71_A266CliEnvLin ;
   private String[] T000M72_A396EmprCod ;
   private int[] T000M72_A252CliCod ;
   private boolean[] T000M72_n252CliCod ;
   private String[] T000M72_A65ArtCod ;
   private String[] T000M73_A396EmprCod ;
   private int[] T000M73_A44AlbRecCod ;
   private String[] T000M74_A396EmprCod ;
   private long[] T000M74_A30AlbProCod ;
   private String[] T000M75_A396EmprCod ;
   private int[] T000M75_A14AlbComCod ;
   private String[] T000M77_A396EmprCod ;
   private int[] T000M77_A252CliCod ;
   private boolean[] T000M77_n252CliCod ;
   private int[] T000M78_A252CliCod ;
   private boolean[] T000M78_n252CliCod ;
   private byte[] T000M78_A287CliPagLin ;
   private String[] T000M78_A288CliPagNom ;
   private String[] T000M78_A286CliPagDom ;
   private String[] T000M78_A11471CliPagHome ;
   private String[] T000M78_A289CliPagPob ;
   private String[] T000M78_A2326CliPagCp ;
   private String[] T000M78_A290CliPagPrn ;
   private boolean[] T000M78_n290CliPagPrn ;
   private String[] T000M78_A282CliPagCcb ;
   private String[] T000M78_A283CliPagCcs ;
   private String[] T000M78_A285CliPagDig ;
   private String[] T000M78_A284CliPagCue ;
   private String[] T000M78_A10060CliPagIban ;
   private String[] T000M78_A10415CliNIB ;
   private String[] T000M78_A10416CliSwift ;
   private short[] T000M78_A291CliPagPro ;
   private String[] T000M78_A396EmprCod ;
   private String[] T000M4_A290CliPagPrn ;
   private boolean[] T000M4_n290CliPagPrn ;
   private String[] T000M79_A290CliPagPrn ;
   private boolean[] T000M79_n290CliPagPrn ;
   private String[] T000M80_A396EmprCod ;
   private int[] T000M80_A252CliCod ;
   private boolean[] T000M80_n252CliCod ;
   private byte[] T000M80_A287CliPagLin ;
   private int[] T000M3_A252CliCod ;
   private boolean[] T000M3_n252CliCod ;
   private byte[] T000M3_A287CliPagLin ;
   private String[] T000M3_A288CliPagNom ;
   private String[] T000M3_A286CliPagDom ;
   private String[] T000M3_A11471CliPagHome ;
   private String[] T000M3_A289CliPagPob ;
   private String[] T000M3_A2326CliPagCp ;
   private String[] T000M3_A282CliPagCcb ;
   private String[] T000M3_A283CliPagCcs ;
   private String[] T000M3_A285CliPagDig ;
   private String[] T000M3_A284CliPagCue ;
   private String[] T000M3_A10060CliPagIban ;
   private String[] T000M3_A10415CliNIB ;
   private String[] T000M3_A10416CliSwift ;
   private short[] T000M3_A291CliPagPro ;
   private String[] T000M3_A396EmprCod ;
   private int[] T000M2_A252CliCod ;
   private boolean[] T000M2_n252CliCod ;
   private byte[] T000M2_A287CliPagLin ;
   private String[] T000M2_A288CliPagNom ;
   private String[] T000M2_A286CliPagDom ;
   private String[] T000M2_A11471CliPagHome ;
   private String[] T000M2_A289CliPagPob ;
   private String[] T000M2_A2326CliPagCp ;
   private String[] T000M2_A282CliPagCcb ;
   private String[] T000M2_A283CliPagCcs ;
   private String[] T000M2_A285CliPagDig ;
   private String[] T000M2_A284CliPagCue ;
   private String[] T000M2_A10060CliPagIban ;
   private String[] T000M2_A10415CliNIB ;
   private String[] T000M2_A10416CliSwift ;
   private short[] T000M2_A291CliPagPro ;
   private String[] T000M2_A396EmprCod ;
   private String[] T000M84_A290CliPagPrn ;
   private boolean[] T000M84_n290CliPagPrn ;
   private String[] T000M85_A396EmprCod ;
   private int[] T000M85_A252CliCod ;
   private boolean[] T000M85_n252CliCod ;
   private byte[] T000M85_A287CliPagLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40CliPagPro_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV37WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV38TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV42DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tclipag__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclipag__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclipag__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclipag__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclipag__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000M2", "SELECT CliCod, CliPagLin, CliPagNom, CliPagDom, CliPagHome, CliPagPob, CliPagCp, CliPagCcb, CliPagCcs, CliPagDig, CliPagCue, CliPagIban, CliNIB, CliSwift, CliPagPro, EmprCod FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ? AND CliPagLin = ?  FOR UPDATE OF CliPagNom, CliPagDom, CliPagHome, CliPagPob, CliPagCp, CliPagCcb, CliPagCcs, CliPagDig, CliPagCue, CliPagIban, CliNIB, CliSwift, CliPagPro NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M3", "SELECT CliCod, CliPagLin, CliPagNom, CliPagDom, CliPagHome, CliPagPob, CliPagCp, CliPagCcb, CliPagCcs, CliPagDig, CliPagCue, CliPagIban, CliNIB, CliSwift, CliPagPro, EmprCod FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ? AND CliPagLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M4", "SELECT PrvDsc AS CliPagPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M5", "SELECT CliCod, CliNom, CliPagUli, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom, CliPagUli NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M6", "SELECT CliCod, CliNom, CliPagUli, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M8", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, TM1.CliNom, TM1.CliPagUli, T2.EmprNom, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000M12", "INSERT INTO TXPCLIENT(CliCod, CliNom, CliPagUli, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T000M13", "UPDATE TXPCLIENT SET CliNom=?, CliPagUli=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T000M14", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T000M15", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M16", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M17", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M18", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M19", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M20", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M21", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M22", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M23", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M24", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M25", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M26", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M27", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M28", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M29", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M30", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M31", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M32", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M33", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M34", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M35", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M36", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M37", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M38", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M39", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M40", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M41", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M42", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M43", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M44", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M45", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M46", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M47", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M48", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M49", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M50", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M51", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M52", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M53", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M54", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M55", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M56", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M57", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M58", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M59", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M60", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M61", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M62", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M63", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M64", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M65", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M66", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M67", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M68", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M69", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M70", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M71", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M72", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M73", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M74", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000M75", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000M76", "UPDATE TXPCLIENT SET CliPagUli=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T000M77", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M78", "SELECT T1.CliCod, T1.CliPagLin, T1.CliPagNom, T1.CliPagDom, T1.CliPagHome, T1.CliPagPob, T1.CliPagCp, T2.PrvDsc AS CliPagPrn, T1.CliPagCcb, T1.CliPagCcs, T1.CliPagDig, T1.CliPagCue, T1.CliPagIban, T1.CliNIB, T1.CliSwift, T1.CliPagPro AS CliPagPro, T1.EmprCod FROM (TXPCLIPAG T1 INNER JOIN TXPPROVIN T2 ON T2.PrvCod = T1.CliPagPro) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.CliPagLin = ? ORDER BY T1.EmprCod, T1.CliCod, T1.CliPagLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M79", "SELECT PrvDsc AS CliPagPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M80", "SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ? AND CliPagLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000M81", "INSERT INTO TXPCLIPAG(CliCod, CliPagLin, CliPagNom, CliPagDom, CliPagHome, CliPagPob, CliPagCp, CliPagCcb, CliPagCcs, CliPagDig, CliPagCue, CliPagIban, CliNIB, CliSwift, CliPagPro, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLIPAG")
         ,new UpdateCursor("T000M82", "UPDATE TXPCLIPAG SET CliPagNom=?, CliPagDom=?, CliPagHome=?, CliPagPob=?, CliPagCp=?, CliPagCcb=?, CliPagCcs=?, CliPagDig=?, CliPagCue=?, CliPagIban=?, CliNIB=?, CliSwift=?, CliPagPro=?  WHERE EmprCod = ? AND CliCod = ? AND CliPagLin = ?", GX_NOMASK, "TXPCLIPAG")
         ,new UpdateCursor("T000M83", "DELETE FROM TXPCLIPAG  WHERE EmprCod = ? AND CliCod = ? AND CliPagLin = ?", GX_NOMASK, "TXPCLIPAG")
         ,new ForEachCursor("T000M84", "SELECT PrvDsc AS CliPagPrn FROM TXPPROVIN WHERE PrvCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000M85", "SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliPagLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((String[]) buf[9])[0] = rslt.getString(10, 2);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 40);
               ((String[]) buf[13])[0] = rslt.getString(14, 40);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 4);
               ((String[]) buf[8])[0] = rslt.getString(9, 4);
               ((String[]) buf[9])[0] = rslt.getString(10, 2);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((String[]) buf[11])[0] = rslt.getString(12, 40);
               ((String[]) buf[12])[0] = rslt.getString(13, 40);
               ((String[]) buf[13])[0] = rslt.getString(14, 40);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 34);
               ((String[]) buf[4])[0] = rslt.getString(5, 34);
               ((String[]) buf[5])[0] = rslt.getString(6, 30);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 4);
               ((String[]) buf[10])[0] = rslt.getString(10, 4);
               ((String[]) buf[11])[0] = rslt.getString(11, 2);
               ((String[]) buf[12])[0] = rslt.getString(12, 20);
               ((String[]) buf[13])[0] = rslt.getString(13, 40);
               ((String[]) buf[14])[0] = rslt.getString(14, 40);
               ((String[]) buf[15])[0] = rslt.getString(15, 40);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 3);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 83 :
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
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 76 :
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
            case 77 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 78 :
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
            case 79 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setString(3, (String)parms[3], 30);
               stmt.setString(4, (String)parms[4], 34);
               stmt.setString(5, (String)parms[5], 34);
               stmt.setString(6, (String)parms[6], 30);
               stmt.setString(7, (String)parms[7], 12);
               stmt.setString(8, (String)parms[8], 4);
               stmt.setString(9, (String)parms[9], 4);
               stmt.setString(10, (String)parms[10], 2);
               stmt.setString(11, (String)parms[11], 20);
               stmt.setString(12, (String)parms[12], 40);
               stmt.setString(13, (String)parms[13], 40);
               stmt.setString(14, (String)parms[14], 40);
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               stmt.setString(16, (String)parms[16], 3);
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 34);
               stmt.setString(3, (String)parms[2], 34);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 12);
               stmt.setString(6, (String)parms[5], 4);
               stmt.setString(7, (String)parms[6], 4);
               stmt.setString(8, (String)parms[7], 2);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setString(10, (String)parms[9], 40);
               stmt.setString(11, (String)parms[10], 40);
               stmt.setString(12, (String)parms[11], 40);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 3);
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(15, ((Number) parms[15]).intValue());
               }
               stmt.setByte(16, ((Number) parms[16]).byteValue());
               return;
            case 81 :
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
            case 82 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               return;
            case 83 :
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

