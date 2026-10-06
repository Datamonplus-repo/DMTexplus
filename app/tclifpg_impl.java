package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tclifpg_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A497FpgCod = httpContext.GetPar( "FpgCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A497FpgCod) ;
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
            AV45CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45CliCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "CLIENTES FORMAS DE PAGO", ""), (short)(0)) ;
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
      cmbCliRetF.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetF.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetF.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliRetIca.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetIca.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetIca.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliGranCon.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliGranCon.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliGranCon.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliRetI.setVisible( (int)(GXutil.lval( httpContext.GetNextPar( ))) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetI.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
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

   public tclifpg_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tclifpg_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tclifpg_impl.class ));
   }

   public tclifpg_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCliPri = new HTMLChoice();
      cmbCliNroVto = new HTMLChoice();
      cmbCliDiaPag = new HTMLChoice();
      cmbCliRegIVA = new HTMLChoice();
      cmbCliRetI = new HTMLChoice();
      cmbCliGranCon = new HTMLChoice();
      cmbCliRetIca = new HTMLChoice();
      cmbCliRetF = new HTMLChoice();
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TCLIFPG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIFPG.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIFPG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIFPG.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCLIFPG.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV52Pgmname), GXutil.rtrim( localUtil.format( AV52Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCLIFPG.htm");
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
      ucCombo_fpgcod.setProperty("Caption", Combo_fpgcod_Caption);
      ucCombo_fpgcod.setProperty("Cls", Combo_fpgcod_Cls);
      ucCombo_fpgcod.setProperty("IsGridItem", Combo_fpgcod_Isgriditem);
      ucCombo_fpgcod.setProperty("EmptyItem", Combo_fpgcod_Emptyitem);
      ucCombo_fpgcod.setProperty("DropDownOptionsTitleSettingsIcons", AV47DDO_TitleSettingsIcons);
      ucCombo_fpgcod.setProperty("DropDownOptionsData", AV46FpgCod_Data);
      ucCombo_fpgcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fpgcod_Internalname, "COMBO_FPGCODContainer");
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
         nBlankRcdCount1868 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1868 = (short)(1) ;
            scanStart0L1868( ) ;
            while ( RcdFound1868 != 0 )
            {
               init_level_properties1868( ) ;
               getByPrimaryKey0L1868( ) ;
               addRow0L1868( ) ;
               scanNext0L1868( ) ;
            }
            scanEnd0L1868( ) ;
            nBlankRcdCount1868 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal0L1868( ) ;
         standaloneModal0L1868( ) ;
         sMode1868 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow0L1868( ) ;
            cmbCliPri.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIPRI_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliPri.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            edtFpgCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FPGCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliNroVto.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLINROVTO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliNroVto.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliNroVto.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            edtCliPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPRD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPrd_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliDiaPag.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIDIAPAG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliDiaPag.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliDiaPag.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            edtCliDtoPpg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIDTOPPG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliDtoPpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDtoPpg_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIDTO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDto_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtCliDtoGrl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIDTOGRL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtCliDtoGrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDtoGrl_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliRegIVA.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIREGIVA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliRegIVA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRegIVA.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliRetI.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETI_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliRetI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetI.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliRetI.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETI_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliRetI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRetI.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliGranCon.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIGRANCON_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliGranCon.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliGranCon.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliGranCon.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIGRANCON_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliGranCon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliGranCon.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliRetIca.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETICA_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliRetIca.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetIca.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliRetIca.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETICA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliRetIca.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRetIca.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliRetF.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETF_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliRetF.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetF.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
            cmbCliRetF.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbCliRetF.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRetF.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_1868 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0L1868( ) ;
            }
            sendRow0L1868( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode1868 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1868 = (short)(1) ;
         nRcdExists_1868 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0L1868( ) ;
            while ( RcdFound1868 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_321868( ) ;
               init_level_properties1868( ) ;
               standaloneNotModal0L1868( ) ;
               getByPrimaryKey0L1868( ) ;
               standaloneModal0L1868( ) ;
               addRow0L1868( ) ;
               scanNext0L1868( ) ;
            }
            scanEnd0L1868( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1868 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_321868( ) ;
         initAll0L1868( ) ;
         init_level_properties1868( ) ;
         nRcdExists_1868 = (short)(0) ;
         nIsMod_1868 = (short)(0) ;
         nRcdDeleted_1868 = (short)(0) ;
         nBlankRcdCount1868 = (short)(nBlankRcdUsr1868+nBlankRcdCount1868) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1868 > 0 )
         {
            standaloneNotModal0L1868( ) ;
            standaloneModal0L1868( ) ;
            addRow0L1868( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = cmbCliPri.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1868 = (short)(nBlankRcdCount1868-1) ;
         }
         Gx_mode = sMode1868 ;
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
      e110L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV47DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFPGCOD_DATA"), AV46FpgCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z279CliNom = httpContext.cgiGet( "Z279CliNom") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV45CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A14421Clipor1 = localUtil.ctond( httpContext.cgiGet( "CLIPOR1")) ;
            A14422Clipor2 = (short)(localUtil.ctol( httpContext.cgiGet( "CLIPOR2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_fpgcod_Objectcall = httpContext.cgiGet( "COMBO_FPGCOD_Objectcall") ;
            Combo_fpgcod_Class = httpContext.cgiGet( "COMBO_FPGCOD_Class") ;
            Combo_fpgcod_Icontype = httpContext.cgiGet( "COMBO_FPGCOD_Icontype") ;
            Combo_fpgcod_Icon = httpContext.cgiGet( "COMBO_FPGCOD_Icon") ;
            Combo_fpgcod_Caption = httpContext.cgiGet( "COMBO_FPGCOD_Caption") ;
            Combo_fpgcod_Tooltip = httpContext.cgiGet( "COMBO_FPGCOD_Tooltip") ;
            Combo_fpgcod_Cls = httpContext.cgiGet( "COMBO_FPGCOD_Cls") ;
            Combo_fpgcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FPGCOD_Selectedvalue_set") ;
            Combo_fpgcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FPGCOD_Selectedvalue_get") ;
            Combo_fpgcod_Selectedtext_set = httpContext.cgiGet( "COMBO_FPGCOD_Selectedtext_set") ;
            Combo_fpgcod_Selectedtext_get = httpContext.cgiGet( "COMBO_FPGCOD_Selectedtext_get") ;
            Combo_fpgcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FPGCOD_Gamoauthtoken") ;
            Combo_fpgcod_Ddointernalname = httpContext.cgiGet( "COMBO_FPGCOD_Ddointernalname") ;
            Combo_fpgcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FPGCOD_Titlecontrolalign") ;
            Combo_fpgcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FPGCOD_Dropdownoptionstype") ;
            Combo_fpgcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Enabled")) ;
            Combo_fpgcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Visible")) ;
            Combo_fpgcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FPGCOD_Titlecontrolidtoreplace") ;
            Combo_fpgcod_Datalisttype = httpContext.cgiGet( "COMBO_FPGCOD_Datalisttype") ;
            Combo_fpgcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Allowmultipleselection")) ;
            Combo_fpgcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FPGCOD_Datalistfixedvalues") ;
            Combo_fpgcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Isgriditem")) ;
            Combo_fpgcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Hasdescription")) ;
            Combo_fpgcod_Datalistproc = httpContext.cgiGet( "COMBO_FPGCOD_Datalistproc") ;
            Combo_fpgcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FPGCOD_Datalistprocparametersprefix") ;
            Combo_fpgcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FPGCOD_Remoteservicesparameters") ;
            Combo_fpgcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FPGCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fpgcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Includeonlyselectedoption")) ;
            Combo_fpgcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Includeselectalloption")) ;
            Combo_fpgcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Emptyitem")) ;
            Combo_fpgcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FPGCOD_Includeaddnewoption")) ;
            Combo_fpgcod_Htmltemplate = httpContext.cgiGet( "COMBO_FPGCOD_Htmltemplate") ;
            Combo_fpgcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FPGCOD_Multiplevaluestype") ;
            Combo_fpgcod_Loadingdata = httpContext.cgiGet( "COMBO_FPGCOD_Loadingdata") ;
            Combo_fpgcod_Noresultsfound = httpContext.cgiGet( "COMBO_FPGCOD_Noresultsfound") ;
            Combo_fpgcod_Emptyitemtext = httpContext.cgiGet( "COMBO_FPGCOD_Emptyitemtext") ;
            Combo_fpgcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FPGCOD_Onlyselectedvalues") ;
            Combo_fpgcod_Selectalltext = httpContext.cgiGet( "COMBO_FPGCOD_Selectalltext") ;
            Combo_fpgcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FPGCOD_Multiplevaluesseparator") ;
            Combo_fpgcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FPGCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
            AV52Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCLIFPG");
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
               GXutil.writeLogError("tclifpg:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_0L0( ) ;
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
                        e110L2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120L2 ();
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
         e120L2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll0L21( ) ;
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
         disableAttributes0L21( ) ;
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

   public void confirm_0L0( )
   {
      beforeValidate0L21( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0L21( ) ;
         }
         else
         {
            checkExtendedTable0L21( ) ;
            closeExtendedTableCursors0L21( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode21 = Gx_mode ;
         confirm_0L1868( ) ;
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

   public void confirm_0L1868( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow0L1868( ) ;
         if ( ( nRcdExists_1868 != 0 ) || ( nIsMod_1868 != 0 ) )
         {
            getKey0L1868( ) ;
            if ( ( nRcdExists_1868 == 0 ) && ( nRcdDeleted_1868 == 0 ) )
            {
               if ( RcdFound1868 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0L1868( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0L1868( ) ;
                     closeExtendedTableCursors0L1868( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "CLIPRI_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = cmbCliPri.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1868 != 0 )
               {
                  if ( nRcdDeleted_1868 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0L1868( ) ;
                     load0L1868( ) ;
                     beforeValidate0L1868( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0L1868( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1868 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0L1868( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0L1868( ) ;
                           closeExtendedTableCursors0L1868( ) ;
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
                  if ( nRcdDeleted_1868 == 0 )
                  {
                     GXCCtl = "CLIPRI_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = cmbCliPri.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( cmbCliPri.getInternalname(), GXutil.rtrim( A297CliPri)) ;
         httpContext.changePostValue( edtFpgCod_Internalname, GXutil.rtrim( A497FpgCod)) ;
         httpContext.changePostValue( cmbCliNroVto.getInternalname(), GXutil.ltrim( localUtil.ntoc( A280CliNroVto, (byte)(2), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCliPrd_Internalname, GXutil.rtrim( A296CliPrd)) ;
         httpContext.changePostValue( cmbCliDiaPag.getInternalname(), GXutil.rtrim( A259CliDiaPag)) ;
         httpContext.changePostValue( edtCliDtoPpg_Internalname, GXutil.ltrim( localUtil.ntoc( A262CliDtoPpg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliDto_Internalname, GXutil.ltrim( localUtil.ntoc( A6630CliDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliDtoGrl_Internalname, GXutil.ltrim( localUtil.ntoc( A261CliDtoGrl, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCliRegIVA.getInternalname(), GXutil.rtrim( A299CliRegIVA)) ;
         httpContext.changePostValue( cmbCliRetI.getInternalname(), GXutil.rtrim( A8350CliRetI)) ;
         httpContext.changePostValue( cmbCliGranCon.getInternalname(), GXutil.rtrim( A6867CliGranCon)) ;
         httpContext.changePostValue( cmbCliRetIca.getInternalname(), GXutil.rtrim( A6866CliRetIca)) ;
         httpContext.changePostValue( cmbCliRetF.getInternalname(), GXutil.rtrim( A6865CliRetF)) ;
         httpContext.changePostValue( "ZT_"+"Z297CliPri_"+sGXsfl_32_idx, GXutil.rtrim( Z297CliPri)) ;
         httpContext.changePostValue( "ZT_"+"Z6630CliDto_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z6630CliDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6865CliRetF_"+sGXsfl_32_idx, GXutil.rtrim( Z6865CliRetF)) ;
         httpContext.changePostValue( "ZT_"+"Z6866CliRetIca_"+sGXsfl_32_idx, GXutil.rtrim( Z6866CliRetIca)) ;
         httpContext.changePostValue( "ZT_"+"Z6867CliGranCon_"+sGXsfl_32_idx, GXutil.rtrim( Z6867CliGranCon)) ;
         httpContext.changePostValue( "ZT_"+"Z8350CliRetI_"+sGXsfl_32_idx, GXutil.rtrim( Z8350CliRetI)) ;
         httpContext.changePostValue( "ZT_"+"Z280CliNroVto_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z280CliNroVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z296CliPrd_"+sGXsfl_32_idx, GXutil.rtrim( Z296CliPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z259CliDiaPag_"+sGXsfl_32_idx, GXutil.rtrim( Z259CliDiaPag)) ;
         httpContext.changePostValue( "ZT_"+"Z261CliDtoGrl_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z261CliDtoGrl, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z262CliDtoPpg_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z262CliDtoPpg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z299CliRegIVA_"+sGXsfl_32_idx, GXutil.rtrim( Z299CliRegIVA)) ;
         httpContext.changePostValue( "ZT_"+"Z14421Clipor1_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14421Clipor1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14422Clipor2_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14422Clipor2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z497FpgCod_"+sGXsfl_32_idx, GXutil.rtrim( Z497FpgCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1868_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1868_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1868_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1868 != 0 )
         {
            httpContext.changePostValue( "CLIPRI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliPri.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FPGCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFpgCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINROVTO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliNroVto.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPRD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDIAPAG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliDiaPag.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDTOPPG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoPpg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDTO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDTOGRL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoGrl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIREGIVA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRegIVA.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETI_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIGRANCON_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIGRANCON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETICA_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETICA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETF_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0L0( )
   {
   }

   public void e110L2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tclifpg_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char4[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      tclifpg_impl.this.A396EmprCod = GXv_char2[0] ;
      tclifpg_impl.this.AV30EmprNom = GXv_char3[0] ;
      tclifpg_impl.this.AV26UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprNom", AV30EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLOMB", ""), GXv_int6) ;
      tclifpg_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbCliRetF.setVisible( GXt_int5 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetF.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetF.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLOMB", ""), GXv_int6) ;
      tclifpg_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbCliRetIca.setVisible( GXt_int5 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetIca.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetIca.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLOMB", ""), GXv_int6) ;
      tclifpg_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbCliGranCon.setVisible( GXt_int5 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliGranCon.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliGranCon.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "COLOMB", ""), GXv_int6) ;
      tclifpg_impl.this.GXt_int5 = GXv_int6[0] ;
      cmbCliRetI.setVisible( GXt_int5 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetI.getInternalname(), "Visible", GXutil.ltrimstr( cmbCliRetI.getVisible(), 5, 0), !bGXsfl_32_Refreshing);
      GXt_char1 = AV29Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tclifpg_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char4[0] = AV31EmprCod ;
      GXv_char3[0] = AV30EmprNom ;
      GXv_char2[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char3, GXv_char2) ;
      tclifpg_impl.this.AV31EmprCod = GXv_char4[0] ;
      tclifpg_impl.this.AV30EmprNom = GXv_char3[0] ;
      tclifpg_impl.this.AV26UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31EmprCod", AV31EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV30EmprNom", AV30EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXv_SdtWWPContext7[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV40WWPContext = GXv_SdtWWPContext7[0] ;
      divTablemain_Height = 800 ;
      httpContext.ajax_rsp_assign_prop("", false, divTablemain_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTablemain_Height), 9, 0), true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = AV47DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[0] ;
      AV47DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8;
      Combo_fpgcod_Titlecontrolidtoreplace = edtFpgCod_Internalname ;
      ucCombo_fpgcod.sendProperty(context, "", false, Combo_fpgcod_Internalname, "TitleControlIdToReplace", Combo_fpgcod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOFPGCOD' */
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
      AV41TrnContext.fromxml(AV42WebSession.getValue("TrnContext"), null, null);
   }

   public void e120L2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV41TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tclifpgww", new String[] {}, new String[] {}) );
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
      /* 'LOADCOMBOFPGCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV46FpgCod_Data ;
      GXv_char4[0] = AV48ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.tclifpgloaddvcombo(remoteHandle, context).execute( "FpgCod", Gx_mode, AV31EmprCod, AV45CliCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      tclifpg_impl.this.AV48ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV46FpgCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   }

   public void zm0L21( int GX_JID )
   {
      if ( ( GX_JID == 17 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z279CliNom = T000L6_A279CliNom[0] ;
         }
         else
         {
            Z279CliNom = A279CliNom ;
         }
      }
      if ( GX_JID == -17 )
      {
         Z252CliCod = A252CliCod ;
         Z279CliNom = A279CliNom ;
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
      AV52Pgmname = "TCLIFPG" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV31EmprCod)==0) )
      {
         A396EmprCod = AV31EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T000L7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T000L7_A407EmprNom[0] ;
      n407EmprNom = T000L7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV45CliCod) )
      {
         A252CliCod = AV45CliCod ;
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

   public void load0L21( )
   {
      /* Using cursor T000L8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A407EmprNom = T000L8_A407EmprNom[0] ;
         n407EmprNom = T000L8_n407EmprNom[0] ;
         A279CliNom = T000L8_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         zm0L21( -17) ;
      }
      pr_default.close(6);
      onLoadActions0L21( ) ;
   }

   public void onLoadActions0L21( )
   {
   }

   public void checkExtendedTable0L21( )
   {
      nIsDirty_21 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors0L21( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0L21( )
   {
      /* Using cursor T000L9 */
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
      /* Using cursor T000L6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T000L6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0L21( 17) ;
         RcdFound21 = (short)(1) ;
         A252CliCod = T000L6_A252CliCod[0] ;
         n252CliCod = T000L6_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = T000L6_A279CliNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0L21( ) ;
         if ( AnyError == 1 )
         {
            RcdFound21 = (short)(0) ;
            initializeNonKey0L21( ) ;
         }
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey0L21( ) ;
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
      getKey0L21( ) ;
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
      /* Using cursor T000L10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000L10_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T000L10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000L10_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T000L10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T000L10_A252CliCod[0] ;
            n252CliCod = T000L10_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T000L11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000L11_A252CliCod[0] > A252CliCod ) ) && ( GXutil.strcmp(T000L11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000L11_A252CliCod[0] < A252CliCod ) ) && ( GXutil.strcmp(T000L11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A252CliCod = T000L11_A252CliCod[0] ;
            n252CliCod = T000L11_n252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0L21( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert0L21( ) ;
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
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               update0L21( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) )
            {
               /* Insert record */
               insert0L21( ) ;
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
                  insert0L21( ) ;
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
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0L21( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000L5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z279CliNom, T000L5_A279CliNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z279CliNom, T000L5_A279CliNom[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliNom");
               GXutil.writeLogRaw("Old: ",Z279CliNom);
               GXutil.writeLogRaw("Current: ",T000L5_A279CliNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIENT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0L21( )
   {
      beforeValidate0L21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0L21( 0) ;
         checkOptimisticConcurrency0L21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0L21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000L12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A279CliNom, A396EmprCod});
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
                        processLevel0L21( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption0L0( ) ;
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
            load0L21( ) ;
         }
         endLevel0L21( ) ;
      }
      closeExtendedTableCursors0L21( ) ;
   }

   public void update0L21( )
   {
      beforeValidate0L21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0L21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000L13 */
                  pr_default.execute(11, new Object[] {A279CliNom, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIENT");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIENT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0L21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0L21( ) ;
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
         endLevel0L21( ) ;
      }
      closeExtendedTableCursors0L21( ) ;
   }

   public void deferredUpdate0L21( )
   {
   }

   public void delete( )
   {
      beforeValidate0L21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0L21( ) ;
         afterConfirm0L21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0L21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000L14 */
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0L21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0L21( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T000L15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "REGCOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000L16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TEX000", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000L17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLTATCIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T000L18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECMA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T000L19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVEMP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T000L20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ConPes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T000L21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T000L22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T000L23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T000L24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T000L25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDTE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T000L26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREQL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T000L27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIMOD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T000L28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIIN2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T000L29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIINTF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T000L30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFSP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T000L31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPRLL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T000L32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pagos de Clientes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T000L33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HLREOP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T000L34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESTPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T000L35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLAV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T000L36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Hdr)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T000L37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colores p/Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T000L38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "WEBU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T000L39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Empesas de la Disposición", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T000L40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CHISES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T000L41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRPEQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T000L42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRMOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T000L43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CGRCIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T000L44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CEMPES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T000L45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CDIBUJ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T000L46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALEXT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T000L47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FACPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T000L48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCONTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T000L49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBTRA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T000L50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREKIL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T000L51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COMREP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T000L52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LCOSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T000L53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFACSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T000L54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LKGSTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T000L55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T000L56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCLIPR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T000L57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T000L58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CESCLI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T000L59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CRECLT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T000L60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CTARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T000L61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ABCEXP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T000L62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T000L63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CMOVPD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T000L64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPARTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T000L65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALBPV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T000L66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CENTMA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T000L67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T000L68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T000L69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T000L70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CFORMU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T000L71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIPAG", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T000L72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CLIENV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T000L73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTICU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T000L74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBREC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T000L75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T000L76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CALCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
      }
   }

   public void processNestedLevel0L1868( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow0L1868( ) ;
         if ( ( nRcdExists_1868 != 0 ) || ( nIsMod_1868 != 0 ) )
         {
            standaloneNotModal0L1868( ) ;
            getKey0L1868( ) ;
            if ( ( nRcdExists_1868 == 0 ) && ( nRcdDeleted_1868 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0L1868( ) ;
            }
            else
            {
               if ( RcdFound1868 != 0 )
               {
                  if ( ( nRcdDeleted_1868 != 0 ) && ( nRcdExists_1868 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0L1868( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1868 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0L1868( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1868 == 0 )
                  {
                     GXCCtl = "CLIPRI_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = cmbCliPri.getInternalname() ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( cmbCliPri.getInternalname(), GXutil.rtrim( A297CliPri)) ;
         httpContext.changePostValue( edtFpgCod_Internalname, GXutil.rtrim( A497FpgCod)) ;
         httpContext.changePostValue( cmbCliNroVto.getInternalname(), GXutil.ltrim( localUtil.ntoc( A280CliNroVto, (byte)(2), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( edtCliPrd_Internalname, GXutil.rtrim( A296CliPrd)) ;
         httpContext.changePostValue( cmbCliDiaPag.getInternalname(), GXutil.rtrim( A259CliDiaPag)) ;
         httpContext.changePostValue( edtCliDtoPpg_Internalname, GXutil.ltrim( localUtil.ntoc( A262CliDtoPpg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliDto_Internalname, GXutil.ltrim( localUtil.ntoc( A6630CliDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtCliDtoGrl_Internalname, GXutil.ltrim( localUtil.ntoc( A261CliDtoGrl, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbCliRegIVA.getInternalname(), GXutil.rtrim( A299CliRegIVA)) ;
         httpContext.changePostValue( cmbCliRetI.getInternalname(), GXutil.rtrim( A8350CliRetI)) ;
         httpContext.changePostValue( cmbCliGranCon.getInternalname(), GXutil.rtrim( A6867CliGranCon)) ;
         httpContext.changePostValue( cmbCliRetIca.getInternalname(), GXutil.rtrim( A6866CliRetIca)) ;
         httpContext.changePostValue( cmbCliRetF.getInternalname(), GXutil.rtrim( A6865CliRetF)) ;
         httpContext.changePostValue( "ZT_"+"Z297CliPri_"+sGXsfl_32_idx, GXutil.rtrim( Z297CliPri)) ;
         httpContext.changePostValue( "ZT_"+"Z6630CliDto_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z6630CliDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6865CliRetF_"+sGXsfl_32_idx, GXutil.rtrim( Z6865CliRetF)) ;
         httpContext.changePostValue( "ZT_"+"Z6866CliRetIca_"+sGXsfl_32_idx, GXutil.rtrim( Z6866CliRetIca)) ;
         httpContext.changePostValue( "ZT_"+"Z6867CliGranCon_"+sGXsfl_32_idx, GXutil.rtrim( Z6867CliGranCon)) ;
         httpContext.changePostValue( "ZT_"+"Z8350CliRetI_"+sGXsfl_32_idx, GXutil.rtrim( Z8350CliRetI)) ;
         httpContext.changePostValue( "ZT_"+"Z280CliNroVto_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z280CliNroVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z296CliPrd_"+sGXsfl_32_idx, GXutil.rtrim( Z296CliPrd)) ;
         httpContext.changePostValue( "ZT_"+"Z259CliDiaPag_"+sGXsfl_32_idx, GXutil.rtrim( Z259CliDiaPag)) ;
         httpContext.changePostValue( "ZT_"+"Z261CliDtoGrl_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z261CliDtoGrl, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z262CliDtoPpg_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z262CliDtoPpg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z299CliRegIVA_"+sGXsfl_32_idx, GXutil.rtrim( Z299CliRegIVA)) ;
         httpContext.changePostValue( "ZT_"+"Z14421Clipor1_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14421Clipor1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14422Clipor2_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14422Clipor2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z497FpgCod_"+sGXsfl_32_idx, GXutil.rtrim( Z497FpgCod)) ;
         httpContext.changePostValue( "nRcdDeleted_1868_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1868_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1868_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1868 != 0 )
         {
            httpContext.changePostValue( "CLIPRI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliPri.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FPGCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFpgCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLINROVTO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliNroVto.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIPRD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPrd_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDIAPAG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliDiaPag.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDTOPPG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoPpg_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDTO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDto_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIDTOGRL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoGrl_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIREGIVA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRegIVA.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETI_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIGRANCON_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIGRANCON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETICA_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETICA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETF_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getVisible(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "CLIRETF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0L1868( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1868 = (short)(0) ;
      nIsMod_1868 = (short)(0) ;
      nRcdDeleted_1868 = (short)(0) ;
   }

   public void processLevel0L21( )
   {
      /* Save parent mode. */
      sMode21 = Gx_mode ;
      processNestedLevel0L1868( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel0L21( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0L21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tclifpg");
         if ( AnyError == 0 )
         {
            confirmValues0L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tclifpg");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0L21( )
   {
      /* Scan By routine */
      /* Using cursor T000L77 */
      pr_default.execute(75, new Object[] {A396EmprCod});
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T000L77_A252CliCod[0] ;
         n252CliCod = T000L77_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0L21( )
   {
      /* Scan next routine */
      pr_default.readNext(75);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(75) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A252CliCod = T000L77_A252CliCod[0] ;
         n252CliCod = T000L77_n252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
   }

   public void scanEnd0L21( )
   {
      pr_default.close(75);
   }

   public void afterConfirm0L21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0L21( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0L21( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0L21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0L21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0L21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0L21( )
   {
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtCliNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliNom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm0L1868( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6630CliDto = T000L3_A6630CliDto[0] ;
            Z6865CliRetF = T000L3_A6865CliRetF[0] ;
            Z6866CliRetIca = T000L3_A6866CliRetIca[0] ;
            Z6867CliGranCon = T000L3_A6867CliGranCon[0] ;
            Z8350CliRetI = T000L3_A8350CliRetI[0] ;
            Z280CliNroVto = T000L3_A280CliNroVto[0] ;
            Z296CliPrd = T000L3_A296CliPrd[0] ;
            Z259CliDiaPag = T000L3_A259CliDiaPag[0] ;
            Z261CliDtoGrl = T000L3_A261CliDtoGrl[0] ;
            Z262CliDtoPpg = T000L3_A262CliDtoPpg[0] ;
            Z299CliRegIVA = T000L3_A299CliRegIVA[0] ;
            Z14421Clipor1 = T000L3_A14421Clipor1[0] ;
            Z14422Clipor2 = T000L3_A14422Clipor2[0] ;
            Z497FpgCod = T000L3_A497FpgCod[0] ;
         }
         else
         {
            Z6630CliDto = A6630CliDto ;
            Z6865CliRetF = A6865CliRetF ;
            Z6866CliRetIca = A6866CliRetIca ;
            Z6867CliGranCon = A6867CliGranCon ;
            Z8350CliRetI = A8350CliRetI ;
            Z280CliNroVto = A280CliNroVto ;
            Z296CliPrd = A296CliPrd ;
            Z259CliDiaPag = A259CliDiaPag ;
            Z261CliDtoGrl = A261CliDtoGrl ;
            Z262CliDtoPpg = A262CliDtoPpg ;
            Z299CliRegIVA = A299CliRegIVA ;
            Z14421Clipor1 = A14421Clipor1 ;
            Z14422Clipor2 = A14422Clipor2 ;
            Z497FpgCod = A497FpgCod ;
         }
      }
      if ( GX_JID == -19 )
      {
         Z252CliCod = A252CliCod ;
         Z297CliPri = A297CliPri ;
         Z6630CliDto = A6630CliDto ;
         Z6865CliRetF = A6865CliRetF ;
         Z6866CliRetIca = A6866CliRetIca ;
         Z6867CliGranCon = A6867CliGranCon ;
         Z8350CliRetI = A8350CliRetI ;
         Z280CliNroVto = A280CliNroVto ;
         Z296CliPrd = A296CliPrd ;
         Z259CliDiaPag = A259CliDiaPag ;
         Z261CliDtoGrl = A261CliDtoGrl ;
         Z262CliDtoPpg = A262CliDtoPpg ;
         Z299CliRegIVA = A299CliRegIVA ;
         Z14421Clipor1 = A14421Clipor1 ;
         Z14422Clipor2 = A14422Clipor2 ;
         Z396EmprCod = A396EmprCod ;
         Z497FpgCod = A497FpgCod ;
      }
   }

   public void standaloneNotModal0L1868( )
   {
   }

   public void standaloneModal0L1868( )
   {
      if ( isIns( )  && (GXutil.strcmp("", A6865CliRetF)==0) && ( Gx_BScreen == 0 ) )
      {
         A6865CliRetF = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A6866CliRetIca)==0) && ( Gx_BScreen == 0 ) )
      {
         A6866CliRetIca = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A6867CliGranCon)==0) && ( Gx_BScreen == 0 ) )
      {
         A6867CliGranCon = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A8350CliRetI)==0) && ( Gx_BScreen == 0 ) )
      {
         A8350CliRetI = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         cmbCliPri.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCliPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliPri.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         cmbCliPri.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCliPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliPri.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load0L1868( )
   {
      /* Using cursor T000L78 */
      pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A297CliPri});
      if ( (pr_default.getStatus(76) != 101) )
      {
         RcdFound1868 = (short)(1) ;
         A6630CliDto = T000L78_A6630CliDto[0] ;
         A6865CliRetF = T000L78_A6865CliRetF[0] ;
         A6866CliRetIca = T000L78_A6866CliRetIca[0] ;
         A6867CliGranCon = T000L78_A6867CliGranCon[0] ;
         A8350CliRetI = T000L78_A8350CliRetI[0] ;
         A280CliNroVto = T000L78_A280CliNroVto[0] ;
         A296CliPrd = T000L78_A296CliPrd[0] ;
         A259CliDiaPag = T000L78_A259CliDiaPag[0] ;
         A261CliDtoGrl = T000L78_A261CliDtoGrl[0] ;
         A262CliDtoPpg = T000L78_A262CliDtoPpg[0] ;
         A299CliRegIVA = T000L78_A299CliRegIVA[0] ;
         A14421Clipor1 = T000L78_A14421Clipor1[0] ;
         A14422Clipor2 = T000L78_A14422Clipor2[0] ;
         A497FpgCod = T000L78_A497FpgCod[0] ;
         zm0L1868( -19) ;
      }
      pr_default.close(76);
      onLoadActions0L1868( ) ;
   }

   public void onLoadActions0L1868( )
   {
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6630CliDto)==0) && ( Gx_BScreen == 0 ) )
      {
         A6630CliDto = A262CliDtoPpg ;
      }
   }

   public void checkExtendedTable0L1868( )
   {
      nIsDirty_1868 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0L1868( ) ;
      /* Using cursor T000L4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A497FpgCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FPGCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFpgCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( isIns( )  && (DecimalUtil.compareTo(DecimalUtil.ZERO, A6630CliDto)==0) && ( Gx_BScreen == 0 ) )
      {
         nIsDirty_1868 = (short)(1) ;
         A6630CliDto = A262CliDtoPpg ;
      }
      if ( ! ( ( GXutil.strcmp(A297CliPri, "0") == 0 ) || ( GXutil.strcmp(A297CliPri, "1") == 0 ) ) )
      {
         GXCCtl = "CLIPRI_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Prioridad", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCliPri.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A299CliRegIVA, "G") == 0 ) || ( GXutil.strcmp(A299CliRegIVA, "R") == 0 ) || ( GXutil.strcmp(A299CliRegIVA, "E") == 0 ) ) )
      {
         GXCCtl = "CLIREGIVA_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Regimen IVA Cliente", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCliRegIVA.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A8350CliRetI, "S") == 0 ) || ( GXutil.strcmp(A8350CliRetI, "N") == 0 ) ) )
      {
         GXCCtl = "CLIRETI_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Retenedor IVA", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCliRetI.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A6867CliGranCon, "S") == 0 ) || ( GXutil.strcmp(A6867CliGranCon, "N") == 0 ) ) )
      {
         GXCCtl = "CLIGRANCON_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Gran Contribuyente", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCliGranCon.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A6866CliRetIca, "S") == 0 ) || ( GXutil.strcmp(A6866CliRetIca, "N") == 0 ) ) )
      {
         GXCCtl = "CLIRETICA_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Retenedor ICA", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCliRetIca.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A6865CliRetF, "S") == 0 ) || ( GXutil.strcmp(A6865CliRetF, "N") == 0 ) ) )
      {
         GXCCtl = "CLIRETF_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Retenedor Fuente", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbCliRetF.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0L1868( )
   {
      pr_default.close(2);
   }

   public void enableDisable0L1868( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          String A497FpgCod )
   {
      /* Using cursor T000L79 */
      pr_default.execute(77, new Object[] {A396EmprCod, A497FpgCod});
      if ( (pr_default.getStatus(77) == 101) )
      {
         GXCCtl = "FPGCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFpgCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( (pr_default.getStatus(77) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(77);
   }

   public void getKey0L1868( )
   {
      /* Using cursor T000L80 */
      pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A297CliPri});
      if ( (pr_default.getStatus(78) != 101) )
      {
         RcdFound1868 = (short)(1) ;
      }
      else
      {
         RcdFound1868 = (short)(0) ;
      }
      pr_default.close(78);
   }

   public void getByPrimaryKey0L1868( )
   {
      /* Using cursor T000L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A297CliPri});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T000L3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm0L1868( 19) ;
         RcdFound1868 = (short)(1) ;
         initializeNonKey0L1868( ) ;
         A297CliPri = T000L3_A297CliPri[0] ;
         A6630CliDto = T000L3_A6630CliDto[0] ;
         A6865CliRetF = T000L3_A6865CliRetF[0] ;
         A6866CliRetIca = T000L3_A6866CliRetIca[0] ;
         A6867CliGranCon = T000L3_A6867CliGranCon[0] ;
         A8350CliRetI = T000L3_A8350CliRetI[0] ;
         A280CliNroVto = T000L3_A280CliNroVto[0] ;
         A296CliPrd = T000L3_A296CliPrd[0] ;
         A259CliDiaPag = T000L3_A259CliDiaPag[0] ;
         A261CliDtoGrl = T000L3_A261CliDtoGrl[0] ;
         A262CliDtoPpg = T000L3_A262CliDtoPpg[0] ;
         A299CliRegIVA = T000L3_A299CliRegIVA[0] ;
         A14421Clipor1 = T000L3_A14421Clipor1[0] ;
         A14422Clipor2 = T000L3_A14422Clipor2[0] ;
         A497FpgCod = T000L3_A497FpgCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z297CliPri = A297CliPri ;
         sMode1868 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0L1868( ) ;
         Gx_mode = sMode1868 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1868 = (short)(0) ;
         initializeNonKey0L1868( ) ;
         sMode1868 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0L1868( ) ;
         Gx_mode = sMode1868 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0L1868( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0L1868( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000L2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A297CliPri});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIFPG"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z6630CliDto, T000L2_A6630CliDto[0]) != 0 ) || ( GXutil.strcmp(Z6865CliRetF, T000L2_A6865CliRetF[0]) != 0 ) || ( GXutil.strcmp(Z6866CliRetIca, T000L2_A6866CliRetIca[0]) != 0 ) || ( GXutil.strcmp(Z6867CliGranCon, T000L2_A6867CliGranCon[0]) != 0 ) || ( GXutil.strcmp(Z8350CliRetI, T000L2_A8350CliRetI[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z280CliNroVto != T000L2_A280CliNroVto[0] ) || ( GXutil.strcmp(Z296CliPrd, T000L2_A296CliPrd[0]) != 0 ) || ( GXutil.strcmp(Z259CliDiaPag, T000L2_A259CliDiaPag[0]) != 0 ) || ( DecimalUtil.compareTo(Z261CliDtoGrl, T000L2_A261CliDtoGrl[0]) != 0 ) || ( DecimalUtil.compareTo(Z262CliDtoPpg, T000L2_A262CliDtoPpg[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z299CliRegIVA, T000L2_A299CliRegIVA[0]) != 0 ) || ( DecimalUtil.compareTo(Z14421Clipor1, T000L2_A14421Clipor1[0]) != 0 ) || ( Z14422Clipor2 != T000L2_A14422Clipor2[0] ) || ( GXutil.strcmp(Z497FpgCod, T000L2_A497FpgCod[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z6630CliDto, T000L2_A6630CliDto[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliDto");
               GXutil.writeLogRaw("Old: ",Z6630CliDto);
               GXutil.writeLogRaw("Current: ",T000L2_A6630CliDto[0]);
            }
            if ( GXutil.strcmp(Z6865CliRetF, T000L2_A6865CliRetF[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliRetF");
               GXutil.writeLogRaw("Old: ",Z6865CliRetF);
               GXutil.writeLogRaw("Current: ",T000L2_A6865CliRetF[0]);
            }
            if ( GXutil.strcmp(Z6866CliRetIca, T000L2_A6866CliRetIca[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliRetIca");
               GXutil.writeLogRaw("Old: ",Z6866CliRetIca);
               GXutil.writeLogRaw("Current: ",T000L2_A6866CliRetIca[0]);
            }
            if ( GXutil.strcmp(Z6867CliGranCon, T000L2_A6867CliGranCon[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliGranCon");
               GXutil.writeLogRaw("Old: ",Z6867CliGranCon);
               GXutil.writeLogRaw("Current: ",T000L2_A6867CliGranCon[0]);
            }
            if ( GXutil.strcmp(Z8350CliRetI, T000L2_A8350CliRetI[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliRetI");
               GXutil.writeLogRaw("Old: ",Z8350CliRetI);
               GXutil.writeLogRaw("Current: ",T000L2_A8350CliRetI[0]);
            }
            if ( Z280CliNroVto != T000L2_A280CliNroVto[0] )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliNroVto");
               GXutil.writeLogRaw("Old: ",Z280CliNroVto);
               GXutil.writeLogRaw("Current: ",T000L2_A280CliNroVto[0]);
            }
            if ( GXutil.strcmp(Z296CliPrd, T000L2_A296CliPrd[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliPrd");
               GXutil.writeLogRaw("Old: ",Z296CliPrd);
               GXutil.writeLogRaw("Current: ",T000L2_A296CliPrd[0]);
            }
            if ( GXutil.strcmp(Z259CliDiaPag, T000L2_A259CliDiaPag[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliDiaPag");
               GXutil.writeLogRaw("Old: ",Z259CliDiaPag);
               GXutil.writeLogRaw("Current: ",T000L2_A259CliDiaPag[0]);
            }
            if ( DecimalUtil.compareTo(Z261CliDtoGrl, T000L2_A261CliDtoGrl[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliDtoGrl");
               GXutil.writeLogRaw("Old: ",Z261CliDtoGrl);
               GXutil.writeLogRaw("Current: ",T000L2_A261CliDtoGrl[0]);
            }
            if ( DecimalUtil.compareTo(Z262CliDtoPpg, T000L2_A262CliDtoPpg[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliDtoPpg");
               GXutil.writeLogRaw("Old: ",Z262CliDtoPpg);
               GXutil.writeLogRaw("Current: ",T000L2_A262CliDtoPpg[0]);
            }
            if ( GXutil.strcmp(Z299CliRegIVA, T000L2_A299CliRegIVA[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"CliRegIVA");
               GXutil.writeLogRaw("Old: ",Z299CliRegIVA);
               GXutil.writeLogRaw("Current: ",T000L2_A299CliRegIVA[0]);
            }
            if ( DecimalUtil.compareTo(Z14421Clipor1, T000L2_A14421Clipor1[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"Clipor1");
               GXutil.writeLogRaw("Old: ",Z14421Clipor1);
               GXutil.writeLogRaw("Current: ",T000L2_A14421Clipor1[0]);
            }
            if ( Z14422Clipor2 != T000L2_A14422Clipor2[0] )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"Clipor2");
               GXutil.writeLogRaw("Old: ",Z14422Clipor2);
               GXutil.writeLogRaw("Current: ",T000L2_A14422Clipor2[0]);
            }
            if ( GXutil.strcmp(Z497FpgCod, T000L2_A497FpgCod[0]) != 0 )
            {
               GXutil.writeLogln("tclifpg:[seudo value changed for attri]"+"FpgCod");
               GXutil.writeLogRaw("Old: ",Z497FpgCod);
               GXutil.writeLogRaw("Current: ",T000L2_A497FpgCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCLIFPG"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0L1868( )
   {
      beforeValidate0L1868( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L1868( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0L1868( 0) ;
         checkOptimisticConcurrency0L1868( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L1868( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0L1868( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000L81 */
                  pr_default.execute(79, new Object[] {Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A297CliPri, A6630CliDto, A6865CliRetF, A6866CliRetIca, A6867CliGranCon, A8350CliRetI, Byte.valueOf(A280CliNroVto), A296CliPrd, A259CliDiaPag, A261CliDtoGrl, A262CliDtoPpg, A299CliRegIVA, A14421Clipor1, Short.valueOf(A14422Clipor2), A396EmprCod, A497FpgCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIFPG");
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
            load0L1868( ) ;
         }
         endLevel0L1868( ) ;
      }
      closeExtendedTableCursors0L1868( ) ;
   }

   public void update0L1868( )
   {
      beforeValidate0L1868( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L1868( ) ;
      }
      if ( ( nIsMod_1868 != 0 ) || ( nIsDirty_1868 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0L1868( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0L1868( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0L1868( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T000L82 */
                     pr_default.execute(80, new Object[] {A6630CliDto, A6865CliRetF, A6866CliRetIca, A6867CliGranCon, A8350CliRetI, Byte.valueOf(A280CliNroVto), A296CliPrd, A259CliDiaPag, A261CliDtoGrl, A262CliDtoPpg, A299CliRegIVA, A14421Clipor1, Short.valueOf(A14422Clipor2), A497FpgCod, A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A297CliPri});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIFPG");
                     if ( (pr_default.getStatus(80) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCLIFPG"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0L1868( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0L1868( ) ;
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
            endLevel0L1868( ) ;
         }
      }
      closeExtendedTableCursors0L1868( ) ;
   }

   public void deferredUpdate0L1868( )
   {
   }

   public void delete0L1868( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0L1868( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L1868( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0L1868( ) ;
         afterConfirm0L1868( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0L1868( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000L83 */
               pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod), A297CliPri});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCLIFPG");
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
      sMode1868 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0L1868( ) ;
      Gx_mode = sMode1868 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0L1868( )
   {
      standaloneModal0L1868( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0L1868( )
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

   public void scanStart0L1868( )
   {
      /* Scan By routine */
      /* Using cursor T000L84 */
      pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      RcdFound1868 = (short)(0) ;
      if ( (pr_default.getStatus(82) != 101) )
      {
         RcdFound1868 = (short)(1) ;
         A297CliPri = T000L84_A297CliPri[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0L1868( )
   {
      /* Scan next routine */
      pr_default.readNext(82);
      RcdFound1868 = (short)(0) ;
      if ( (pr_default.getStatus(82) != 101) )
      {
         RcdFound1868 = (short)(1) ;
         A297CliPri = T000L84_A297CliPri[0] ;
      }
   }

   public void scanEnd0L1868( )
   {
      pr_default.close(82);
   }

   public void afterConfirm0L1868( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0L1868( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0L1868( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0L1868( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0L1868( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0L1868( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0L1868( )
   {
      cmbCliPri.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliPri.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      edtFpgCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFpgCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFpgCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliNroVto.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliNroVto.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliNroVto.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      edtCliPrd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliPrd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliPrd_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliDiaPag.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliDiaPag.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliDiaPag.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      edtCliDtoPpg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDtoPpg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDtoPpg_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDto_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtCliDtoGrl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliDtoGrl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliDtoGrl_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliRegIVA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRegIVA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRegIVA.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliRetI.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetI.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRetI.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliGranCon.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliGranCon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliGranCon.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliRetIca.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetIca.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRetIca.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      cmbCliRetF.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetF.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliRetF.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes0L1868( )
   {
   }

   public void send_integrity_lvl_hashes0L21( )
   {
   }

   public void subsflControlProps_321868( )
   {
      cmbCliPri.setInternalname( "CLIPRI_"+sGXsfl_32_idx );
      edtFpgCod_Internalname = "FPGCOD_"+sGXsfl_32_idx ;
      cmbCliNroVto.setInternalname( "CLINROVTO_"+sGXsfl_32_idx );
      edtCliPrd_Internalname = "CLIPRD_"+sGXsfl_32_idx ;
      cmbCliDiaPag.setInternalname( "CLIDIAPAG_"+sGXsfl_32_idx );
      edtCliDtoPpg_Internalname = "CLIDTOPPG_"+sGXsfl_32_idx ;
      edtCliDto_Internalname = "CLIDTO_"+sGXsfl_32_idx ;
      edtCliDtoGrl_Internalname = "CLIDTOGRL_"+sGXsfl_32_idx ;
      cmbCliRegIVA.setInternalname( "CLIREGIVA_"+sGXsfl_32_idx );
      cmbCliRetI.setInternalname( "CLIRETI_"+sGXsfl_32_idx );
      cmbCliGranCon.setInternalname( "CLIGRANCON_"+sGXsfl_32_idx );
      cmbCliRetIca.setInternalname( "CLIRETICA_"+sGXsfl_32_idx );
      cmbCliRetF.setInternalname( "CLIRETF_"+sGXsfl_32_idx );
   }

   public void subsflControlProps_fel_321868( )
   {
      cmbCliPri.setInternalname( "CLIPRI_"+sGXsfl_32_fel_idx );
      edtFpgCod_Internalname = "FPGCOD_"+sGXsfl_32_fel_idx ;
      cmbCliNroVto.setInternalname( "CLINROVTO_"+sGXsfl_32_fel_idx );
      edtCliPrd_Internalname = "CLIPRD_"+sGXsfl_32_fel_idx ;
      cmbCliDiaPag.setInternalname( "CLIDIAPAG_"+sGXsfl_32_fel_idx );
      edtCliDtoPpg_Internalname = "CLIDTOPPG_"+sGXsfl_32_fel_idx ;
      edtCliDto_Internalname = "CLIDTO_"+sGXsfl_32_fel_idx ;
      edtCliDtoGrl_Internalname = "CLIDTOGRL_"+sGXsfl_32_fel_idx ;
      cmbCliRegIVA.setInternalname( "CLIREGIVA_"+sGXsfl_32_fel_idx );
      cmbCliRetI.setInternalname( "CLIRETI_"+sGXsfl_32_fel_idx );
      cmbCliGranCon.setInternalname( "CLIGRANCON_"+sGXsfl_32_fel_idx );
      cmbCliRetIca.setInternalname( "CLIRETICA_"+sGXsfl_32_fel_idx );
      cmbCliRetF.setInternalname( "CLIRETF_"+sGXsfl_32_fel_idx );
   }

   public void addRow0L1868( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321868( ) ;
      sendRow0L1868( ) ;
   }

   public void sendRow0L1868( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "CLIPRI_" + sGXsfl_32_idx ;
      cmbCliPri.setName( GXCCtl );
      cmbCliPri.setWebtags( "" );
      cmbCliPri.addItem("0", "0", (short)(0));
      cmbCliPri.addItem("1", "1", (short)(0));
      if ( cmbCliPri.getItemCount() > 0 )
      {
         A297CliPri = cmbCliPri.getValidValue(A297CliPri) ;
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliPri,cmbCliPri.getInternalname(),GXutil.rtrim( A297CliPri),Integer.valueOf(1),cmbCliPri.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbCliPri.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliPri.setValue( GXutil.rtrim( A297CliPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliPri.getInternalname(), "Values", cmbCliPri.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFpgCod_Internalname,GXutil.rtrim( A497FpgCod),GXutil.rtrim( localUtil.format( A497FpgCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFpgCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFpgCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      if ( ( cmbCliNroVto.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CLINROVTO_" + sGXsfl_32_idx ;
         cmbCliNroVto.setName( GXCCtl );
         cmbCliNroVto.setWebtags( "" );
         cmbCliNroVto.addItem(GXutil.trim( GXutil.str( 0, 2, 0)), httpContext.getMessage( "", ""), (short)(0));
         cmbCliNroVto.addItem("0", "0", (short)(0));
         cmbCliNroVto.addItem("1", "1", (short)(0));
         cmbCliNroVto.addItem("2", "2", (short)(0));
         cmbCliNroVto.addItem("3", "3", (short)(0));
         cmbCliNroVto.addItem("4", "4", (short)(0));
         if ( cmbCliNroVto.getItemCount() > 0 )
         {
            A280CliNroVto = (byte)(GXutil.lval( cmbCliNroVto.getValidValue(GXutil.trim( GXutil.str( A280CliNroVto, 2, 0))))) ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliNroVto,cmbCliNroVto.getInternalname(),GXutil.trim( GXutil.str( A280CliNroVto, 2, 0)),Integer.valueOf(1),cmbCliNroVto.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(cmbCliNroVto.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliNroVto.setValue( GXutil.trim( GXutil.str( A280CliNroVto, 2, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliNroVto.getInternalname(), "Values", cmbCliNroVto.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliPrd_Internalname,GXutil.rtrim( A296CliPrd),GXutil.rtrim( localUtil.format( A296CliPrd, "99999")),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliPrd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliPrd_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      if ( ( cmbCliDiaPag.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CLIDIAPAG_" + sGXsfl_32_idx ;
         cmbCliDiaPag.setName( GXCCtl );
         cmbCliDiaPag.setWebtags( "" );
         cmbCliDiaPag.addItem("", httpContext.getMessage( "", ""), (short)(0));
         cmbCliDiaPag.addItem("1", "1", (short)(0));
         cmbCliDiaPag.addItem("2", "2", (short)(0));
         cmbCliDiaPag.addItem("3", "3", (short)(0));
         cmbCliDiaPag.addItem("4", "4", (short)(0));
         cmbCliDiaPag.addItem("5", "5", (short)(0));
         cmbCliDiaPag.addItem("6", "6", (short)(0));
         cmbCliDiaPag.addItem("7", "7", (short)(0));
         cmbCliDiaPag.addItem("8", "8", (short)(0));
         cmbCliDiaPag.addItem("9", "9", (short)(0));
         cmbCliDiaPag.addItem("10", "10", (short)(0));
         cmbCliDiaPag.addItem("11", "11", (short)(0));
         cmbCliDiaPag.addItem("12", "12", (short)(0));
         cmbCliDiaPag.addItem("13", "13", (short)(0));
         cmbCliDiaPag.addItem("14", "14", (short)(0));
         cmbCliDiaPag.addItem("15", "15", (short)(0));
         cmbCliDiaPag.addItem("16", "16", (short)(0));
         cmbCliDiaPag.addItem("17", "17", (short)(0));
         cmbCliDiaPag.addItem("18", "18", (short)(0));
         cmbCliDiaPag.addItem("19", "19", (short)(0));
         cmbCliDiaPag.addItem("20", "20", (short)(0));
         cmbCliDiaPag.addItem("21", "21", (short)(0));
         cmbCliDiaPag.addItem("22", "22", (short)(0));
         cmbCliDiaPag.addItem("23", "23", (short)(0));
         cmbCliDiaPag.addItem("24", "24", (short)(0));
         cmbCliDiaPag.addItem("25", "25", (short)(0));
         cmbCliDiaPag.addItem("26", "27", (short)(0));
         cmbCliDiaPag.addItem("27", "27", (short)(0));
         cmbCliDiaPag.addItem("28", "28", (short)(0));
         cmbCliDiaPag.addItem("29", "29", (short)(0));
         cmbCliDiaPag.addItem("30", "30", (short)(0));
         cmbCliDiaPag.addItem("31", "31", (short)(0));
         if ( cmbCliDiaPag.getItemCount() > 0 )
         {
            A259CliDiaPag = cmbCliDiaPag.getValidValue(A259CliDiaPag) ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliDiaPag,cmbCliDiaPag.getInternalname(),GXutil.rtrim( A259CliDiaPag),Integer.valueOf(1),cmbCliDiaPag.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbCliDiaPag.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliDiaPag.setValue( GXutil.rtrim( A259CliDiaPag) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliDiaPag.getInternalname(), "Values", cmbCliDiaPag.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliDtoPpg_Internalname,GXutil.ltrim( localUtil.ntoc( A262CliDtoPpg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliDtoPpg_Enabled!=0) ? localUtil.format( A262CliDtoPpg, "ZZ9.99") : localUtil.format( A262CliDtoPpg, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliDtoPpg_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliDtoPpg_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliDto_Internalname,GXutil.ltrim( localUtil.ntoc( A6630CliDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliDto_Enabled!=0) ? localUtil.format( A6630CliDto, "ZZ9.99") : localUtil.format( A6630CliDto, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliDto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliDto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliDtoGrl_Internalname,GXutil.ltrim( localUtil.ntoc( A261CliDtoGrl, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtCliDtoGrl_Enabled!=0) ? localUtil.format( A261CliDtoGrl, "ZZ9.99") : localUtil.format( A261CliDtoGrl, "ZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliDtoGrl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtCliDtoGrl_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      if ( ( cmbCliRegIVA.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "CLIREGIVA_" + sGXsfl_32_idx ;
         cmbCliRegIVA.setName( GXCCtl );
         cmbCliRegIVA.setWebtags( "" );
         cmbCliRegIVA.addItem("G", httpContext.getMessage( "General", ""), (short)(0));
         cmbCliRegIVA.addItem("R", httpContext.getMessage( "Repercutido", ""), (short)(0));
         cmbCliRegIVA.addItem("E", httpContext.getMessage( "Exento", ""), (short)(0));
         if ( cmbCliRegIVA.getItemCount() > 0 )
         {
            A299CliRegIVA = cmbCliRegIVA.getValidValue(A299CliRegIVA) ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliRegIVA,cmbCliRegIVA.getInternalname(),GXutil.rtrim( A299CliRegIVA),Integer.valueOf(1),cmbCliRegIVA.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbCliRegIVA.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliRegIVA.setValue( GXutil.rtrim( A299CliRegIVA) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRegIVA.getInternalname(), "Values", cmbCliRegIVA.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "CLIRETI_" + sGXsfl_32_idx ;
      cmbCliRetI.setName( GXCCtl );
      cmbCliRetI.setWebtags( "" );
      cmbCliRetI.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliRetI.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliRetI.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliRetI.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A8350CliRetI)==0) )
         {
            A8350CliRetI = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliRetI,cmbCliRetI.getInternalname(),GXutil.rtrim( A8350CliRetI),Integer.valueOf(1),cmbCliRetI.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbCliRetI.getVisible()),Integer.valueOf(cmbCliRetI.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliRetI.setValue( GXutil.rtrim( A8350CliRetI) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetI.getInternalname(), "Values", cmbCliRetI.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 43,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "CLIGRANCON_" + sGXsfl_32_idx ;
      cmbCliGranCon.setName( GXCCtl );
      cmbCliGranCon.setWebtags( "" );
      cmbCliGranCon.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliGranCon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliGranCon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliGranCon.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A6867CliGranCon)==0) )
         {
            A6867CliGranCon = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliGranCon,cmbCliGranCon.getInternalname(),GXutil.rtrim( A6867CliGranCon),Integer.valueOf(1),cmbCliGranCon.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbCliGranCon.getVisible()),Integer.valueOf(cmbCliGranCon.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliGranCon.setValue( GXutil.rtrim( A6867CliGranCon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliGranCon.getInternalname(), "Values", cmbCliGranCon.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "CLIRETICA_" + sGXsfl_32_idx ;
      cmbCliRetIca.setName( GXCCtl );
      cmbCliRetIca.setWebtags( "" );
      cmbCliRetIca.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliRetIca.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliRetIca.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliRetIca.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A6866CliRetIca)==0) )
         {
            A6866CliRetIca = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliRetIca,cmbCliRetIca.getInternalname(),GXutil.rtrim( A6866CliRetIca),Integer.valueOf(1),cmbCliRetIca.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbCliRetIca.getVisible()),Integer.valueOf(cmbCliRetIca.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliRetIca.setValue( GXutil.rtrim( A6866CliRetIca) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetIca.getInternalname(), "Values", cmbCliRetIca.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1868_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "CLIRETF_" + sGXsfl_32_idx ;
      cmbCliRetF.setName( GXCCtl );
      cmbCliRetF.setWebtags( "" );
      cmbCliRetF.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliRetF.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliRetF.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliRetF.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A6865CliRetF)==0) )
         {
            A6865CliRetF = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_level1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbCliRetF,cmbCliRetF.getInternalname(),GXutil.rtrim( A6865CliRetF),Integer.valueOf(1),cmbCliRetF.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbCliRetF.getVisible()),Integer.valueOf(cmbCliRetF.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,45);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbCliRetF.setValue( GXutil.rtrim( A6865CliRetF) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliRetF.getInternalname(), "Values", cmbCliRetF.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes0L1868( ) ;
      GXCCtl = "Z297CliPri_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z297CliPri));
      GXCCtl = "Z6630CliDto_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6630CliDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6865CliRetF_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6865CliRetF));
      GXCCtl = "Z6866CliRetIca_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6866CliRetIca));
      GXCCtl = "Z6867CliGranCon_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z6867CliGranCon));
      GXCCtl = "Z8350CliRetI_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z8350CliRetI));
      GXCCtl = "Z280CliNroVto_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z280CliNroVto, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z296CliPrd_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z296CliPrd));
      GXCCtl = "Z259CliDiaPag_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z259CliDiaPag));
      GXCCtl = "Z261CliDtoGrl_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z261CliDtoGrl, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z262CliDtoPpg_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z262CliDtoPpg, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z299CliRegIVA_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z299CliRegIVA));
      GXCCtl = "Z14421Clipor1_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14421Clipor1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14422Clipor2_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14422Clipor2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z497FpgCod_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z497FpgCod));
      GXCCtl = "nRcdDeleted_1868_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1868_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1868_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1868, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV41TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV41TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV31EmprCod));
      GXCCtl = "vCLICOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV45CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPRI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliPri.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FPGCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFpgCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINROVTO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliNroVto.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPRD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDIAPAG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliDiaPag.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDTOPPG_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoPpg_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDTO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIDTOGRL_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoGrl_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIREGIVA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRegIVA.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRETI_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRETI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIGRANCON_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIGRANCON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRETICA_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRETICA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRETF_"+sGXsfl_32_idx+"Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getVisible(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIRETF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow0L1868( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321868( ) ;
      cmbCliPri.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIPRI_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtFpgCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FPGCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCliNroVto.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLINROVTO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCliPrd_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIPRD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCliDiaPag.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIDIAPAG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtCliDtoPpg_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIDTOPPG_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliDto_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIDTO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtCliDtoGrl_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "CLIDTOGRL_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbCliRegIVA.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIREGIVA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliRetI.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETI_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliRetI.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETI_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliGranCon.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIGRANCON_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliGranCon.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIGRANCON_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliRetIca.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETICA_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliRetIca.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETICA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliRetF.setVisible( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETF_"+sGXsfl_32_idx+"Visible"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliRetF.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "CLIRETF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbCliPri.setName( cmbCliPri.getInternalname() );
      cmbCliPri.setValue( httpContext.cgiGet( cmbCliPri.getInternalname()) );
      A297CliPri = httpContext.cgiGet( cmbCliPri.getInternalname()) ;
      A497FpgCod = GXutil.upper( httpContext.cgiGet( edtFpgCod_Internalname)) ;
      cmbCliNroVto.setName( cmbCliNroVto.getInternalname() );
      cmbCliNroVto.setValue( httpContext.cgiGet( cmbCliNroVto.getInternalname()) );
      A280CliNroVto = (byte)(GXutil.lval( httpContext.cgiGet( cmbCliNroVto.getInternalname()))) ;
      A296CliPrd = httpContext.cgiGet( edtCliPrd_Internalname) ;
      cmbCliDiaPag.setName( cmbCliDiaPag.getInternalname() );
      cmbCliDiaPag.setValue( httpContext.cgiGet( cmbCliDiaPag.getInternalname()) );
      A259CliDiaPag = httpContext.cgiGet( cmbCliDiaPag.getInternalname()) ;
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliDtoPpg_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliDtoPpg_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIDTOPPG_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliDtoPpg_Internalname ;
         wbErr = true ;
         A262CliDtoPpg = DecimalUtil.ZERO ;
      }
      else
      {
         A262CliDtoPpg = localUtil.ctond( httpContext.cgiGet( edtCliDtoPpg_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliDto_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIDTO_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliDto_Internalname ;
         wbErr = true ;
         A6630CliDto = DecimalUtil.ZERO ;
      }
      else
      {
         A6630CliDto = localUtil.ctond( httpContext.cgiGet( edtCliDto_Internalname)) ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliDtoGrl_Internalname)), DecimalUtil.stringToDec("-99.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtCliDtoGrl_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
      {
         GXCCtl = "CLIDTOGRL_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliDtoGrl_Internalname ;
         wbErr = true ;
         A261CliDtoGrl = DecimalUtil.ZERO ;
      }
      else
      {
         A261CliDtoGrl = localUtil.ctond( httpContext.cgiGet( edtCliDtoGrl_Internalname)) ;
      }
      cmbCliRegIVA.setName( cmbCliRegIVA.getInternalname() );
      cmbCliRegIVA.setValue( httpContext.cgiGet( cmbCliRegIVA.getInternalname()) );
      A299CliRegIVA = httpContext.cgiGet( cmbCliRegIVA.getInternalname()) ;
      cmbCliRetI.setName( cmbCliRetI.getInternalname() );
      cmbCliRetI.setValue( httpContext.cgiGet( cmbCliRetI.getInternalname()) );
      A8350CliRetI = httpContext.cgiGet( cmbCliRetI.getInternalname()) ;
      cmbCliGranCon.setName( cmbCliGranCon.getInternalname() );
      cmbCliGranCon.setValue( httpContext.cgiGet( cmbCliGranCon.getInternalname()) );
      A6867CliGranCon = httpContext.cgiGet( cmbCliGranCon.getInternalname()) ;
      cmbCliRetIca.setName( cmbCliRetIca.getInternalname() );
      cmbCliRetIca.setValue( httpContext.cgiGet( cmbCliRetIca.getInternalname()) );
      A6866CliRetIca = httpContext.cgiGet( cmbCliRetIca.getInternalname()) ;
      cmbCliRetF.setName( cmbCliRetF.getInternalname() );
      cmbCliRetF.setValue( httpContext.cgiGet( cmbCliRetF.getInternalname()) );
      A6865CliRetF = httpContext.cgiGet( cmbCliRetF.getInternalname()) ;
      GXCCtl = "Z297CliPri_" + sGXsfl_32_idx ;
      Z297CliPri = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6630CliDto_" + sGXsfl_32_idx ;
      Z6630CliDto = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z6865CliRetF_" + sGXsfl_32_idx ;
      Z6865CliRetF = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6866CliRetIca_" + sGXsfl_32_idx ;
      Z6866CliRetIca = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6867CliGranCon_" + sGXsfl_32_idx ;
      Z6867CliGranCon = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z8350CliRetI_" + sGXsfl_32_idx ;
      Z8350CliRetI = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z280CliNroVto_" + sGXsfl_32_idx ;
      Z280CliNroVto = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z296CliPrd_" + sGXsfl_32_idx ;
      Z296CliPrd = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z259CliDiaPag_" + sGXsfl_32_idx ;
      Z259CliDiaPag = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z261CliDtoGrl_" + sGXsfl_32_idx ;
      Z261CliDtoGrl = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z262CliDtoPpg_" + sGXsfl_32_idx ;
      Z262CliDtoPpg = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z299CliRegIVA_" + sGXsfl_32_idx ;
      Z299CliRegIVA = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14421Clipor1_" + sGXsfl_32_idx ;
      Z14421Clipor1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14422Clipor2_" + sGXsfl_32_idx ;
      Z14422Clipor2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z497FpgCod_" + sGXsfl_32_idx ;
      Z497FpgCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14421Clipor1_" + sGXsfl_32_idx ;
      A14421Clipor1 = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z14422Clipor2_" + sGXsfl_32_idx ;
      A14422Clipor2 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1868_" + sGXsfl_32_idx ;
      nRcdDeleted_1868 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1868_" + sGXsfl_32_idx ;
      nRcdExists_1868 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1868_" + sGXsfl_32_idx ;
      nIsMod_1868 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defcmbCliPri_Enabled = cmbCliPri.getEnabled() ;
   }

   public void confirmValues0L0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321868( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_321868( ) ;
         httpContext.changePostValue( "Z297CliPri_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z297CliPri_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z297CliPri_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z6630CliDto_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z6630CliDto_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6630CliDto_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z6865CliRetF_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z6865CliRetF_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6865CliRetF_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z6866CliRetIca_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z6866CliRetIca_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6866CliRetIca_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z6867CliGranCon_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z6867CliGranCon_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6867CliGranCon_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z8350CliRetI_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z8350CliRetI_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z8350CliRetI_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z280CliNroVto_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z280CliNroVto_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z280CliNroVto_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z296CliPrd_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z296CliPrd_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z296CliPrd_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z259CliDiaPag_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z259CliDiaPag_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z259CliDiaPag_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z261CliDtoGrl_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z261CliDtoGrl_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z261CliDtoGrl_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z262CliDtoPpg_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z262CliDtoPpg_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z262CliDtoPpg_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z299CliRegIVA_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z299CliRegIVA_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z299CliRegIVA_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14421Clipor1_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14421Clipor1_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14421Clipor1_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14422Clipor2_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14422Clipor2_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14422Clipor2_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z497FpgCod_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z497FpgCod_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z497FpgCod_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tclifpg", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV45CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCLIFPG");
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CliNom", GXutil.rtrim( localUtil.format( A279CliNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tclifpg:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z279CliNom", GXutil.rtrim( Z279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFPGCOD_DATA", AV46FpgCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFPGCOD_DATA", AV46FpgCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV41TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV41TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV41TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV31EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV31EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV45CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPOR1", GXutil.ltrim( localUtil.ntoc( A14421Clipor1, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIPOR2", GXutil.ltrim( localUtil.ntoc( A14422Clipor2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Objectcall", GXutil.rtrim( Combo_fpgcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Cls", GXutil.rtrim( Combo_fpgcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Enabled", GXutil.booltostr( Combo_fpgcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_fpgcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Isgriditem", GXutil.booltostr( Combo_fpgcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FPGCOD_Emptyitem", GXutil.booltostr( Combo_fpgcod_Emptyitem));
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
      return formatLink("app.tclifpg", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV31EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV45CliCod,6,0))}, new String[] {"Gx_mode","EmprCod","CliCod"})  ;
   }

   public String getPgmname( )
   {
      return "TCLIFPG" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "CLIENTES FORMAS DE PAGO", "") ;
   }

   public void initializeNonKey0L21( )
   {
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      Z279CliNom = "" ;
   }

   public void initAll0L21( )
   {
      A252CliCod = 0 ;
      n252CliCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      initializeNonKey0L21( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0L1868( )
   {
      A497FpgCod = "" ;
      A280CliNroVto = (byte)(0) ;
      A296CliPrd = "" ;
      A259CliDiaPag = "" ;
      A261CliDtoGrl = DecimalUtil.ZERO ;
      A262CliDtoPpg = DecimalUtil.ZERO ;
      A299CliRegIVA = "" ;
      A14421Clipor1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A14421Clipor1", GXutil.ltrimstr( A14421Clipor1, 6, 2));
      A14422Clipor2 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14422Clipor2", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14422Clipor2), 4, 0));
      A6630CliDto = DecimalUtil.ZERO ;
      A6865CliRetF = httpContext.getMessage( "N", "") ;
      A6866CliRetIca = httpContext.getMessage( "N", "") ;
      A6867CliGranCon = httpContext.getMessage( "N", "") ;
      A8350CliRetI = httpContext.getMessage( "N", "") ;
      Z6630CliDto = DecimalUtil.ZERO ;
      Z6865CliRetF = "" ;
      Z6866CliRetIca = "" ;
      Z6867CliGranCon = "" ;
      Z8350CliRetI = "" ;
      Z280CliNroVto = (byte)(0) ;
      Z296CliPrd = "" ;
      Z259CliDiaPag = "" ;
      Z261CliDtoGrl = DecimalUtil.ZERO ;
      Z262CliDtoPpg = DecimalUtil.ZERO ;
      Z299CliRegIVA = "" ;
      Z14421Clipor1 = DecimalUtil.ZERO ;
      Z14422Clipor2 = (short)(0) ;
      Z497FpgCod = "" ;
   }

   public void initAll0L1868( )
   {
      A297CliPri = "" ;
      initializeNonKey0L1868( ) ;
   }

   public void standaloneModalInsert0L1868( )
   {
      A6865CliRetF = i6865CliRetF ;
      A6866CliRetIca = i6866CliRetIca ;
      A6867CliGranCon = i6867CliGranCon ;
      A8350CliRetI = i8350CliRetI ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165188", true, true);
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
      httpContext.AddJavascriptSource("tclifpg.js", "?2026821165189", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1868( )
   {
      cmbCliPri.setEnabled( defcmbCliPri_Enabled );
      httpContext.ajax_rsp_assign_prop("", false, cmbCliPri.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCliPri.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A297CliPri));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliPri.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A497FpgCod));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFpgCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A280CliNroVto, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliNroVto.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A296CliPrd));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliPrd_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A259CliDiaPag));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliDiaPag.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A262CliDtoPpg, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoPpg_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6630CliDto, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDto_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A261CliDtoGrl, (byte)(6), (byte)(2), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtCliDtoGrl_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A299CliRegIVA));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRegIVA.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A8350CliRetI));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetI.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A6867CliGranCon));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliGranCon.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A6866CliRetIca));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetIca.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A6865CliRetF));
      Gridlevel_level1Column.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getVisible(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbCliRetF.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      cmbCliPri.setInternalname( "CLIPRI" );
      edtFpgCod_Internalname = "FPGCOD" ;
      cmbCliNroVto.setInternalname( "CLINROVTO" );
      edtCliPrd_Internalname = "CLIPRD" ;
      cmbCliDiaPag.setInternalname( "CLIDIAPAG" );
      edtCliDtoPpg_Internalname = "CLIDTOPPG" ;
      edtCliDto_Internalname = "CLIDTO" ;
      edtCliDtoGrl_Internalname = "CLIDTOGRL" ;
      cmbCliRegIVA.setInternalname( "CLIREGIVA" );
      cmbCliRetI.setInternalname( "CLIRETI" );
      cmbCliGranCon.setInternalname( "CLIGRANCON" );
      cmbCliRetIca.setInternalname( "CLIRETICA" );
      cmbCliRetF.setInternalname( "CLIRETF" );
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_fpgcod_Internalname = "COMBO_FPGCOD" ;
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
      Combo_fpgcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "CLIENTES FORMAS DE PAGO", "") );
      cmbCliRetF.setJsonclick( "" );
      cmbCliRetIca.setJsonclick( "" );
      cmbCliGranCon.setJsonclick( "" );
      cmbCliRetI.setJsonclick( "" );
      cmbCliRegIVA.setJsonclick( "" );
      edtCliDtoGrl_Jsonclick = "" ;
      edtCliDto_Jsonclick = "" ;
      edtCliDtoPpg_Jsonclick = "" ;
      cmbCliDiaPag.setJsonclick( "" );
      edtCliPrd_Jsonclick = "" ;
      cmbCliNroVto.setJsonclick( "" );
      edtFpgCod_Jsonclick = "" ;
      cmbCliPri.setJsonclick( "" );
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_fpgcod_Titlecontrolidtoreplace = "" ;
      cmbCliRetF.setEnabled( 1 );
      cmbCliRetIca.setEnabled( 1 );
      cmbCliGranCon.setEnabled( 1 );
      cmbCliRetI.setEnabled( 1 );
      cmbCliRegIVA.setEnabled( 1 );
      edtCliDtoGrl_Enabled = 1 ;
      edtCliDto_Enabled = 1 ;
      edtCliDtoPpg_Enabled = 1 ;
      cmbCliDiaPag.setEnabled( 1 );
      edtCliPrd_Enabled = 1 ;
      cmbCliNroVto.setEnabled( 1 );
      edtFpgCod_Enabled = 1 ;
      cmbCliPri.setEnabled( 1 );
      Combo_fpgcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fpgcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_fpgcod_Cls = "ExtendedCombo" ;
      Combo_fpgcod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      cmbCliRetI.setVisible( -1 );
      cmbCliGranCon.setVisible( -1 );
      cmbCliRetIca.setVisible( -1 );
      cmbCliRetF.setVisible( -1 );
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
      subsflControlProps_321868( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0L1868( ) ;
         standaloneModal0L1868( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0L1868( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_321868( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "CLIPRI_" + sGXsfl_32_idx ;
      cmbCliPri.setName( GXCCtl );
      cmbCliPri.setWebtags( "" );
      cmbCliPri.addItem("0", "0", (short)(0));
      cmbCliPri.addItem("1", "1", (short)(0));
      if ( cmbCliPri.getItemCount() > 0 )
      {
         A297CliPri = cmbCliPri.getValidValue(A297CliPri) ;
      }
      GXCCtl = "CLINROVTO_" + sGXsfl_32_idx ;
      cmbCliNroVto.setName( GXCCtl );
      cmbCliNroVto.setWebtags( "" );
      cmbCliNroVto.addItem(GXutil.trim( GXutil.str( 0, 2, 0)), httpContext.getMessage( "", ""), (short)(0));
      cmbCliNroVto.addItem("0", "0", (short)(0));
      cmbCliNroVto.addItem("1", "1", (short)(0));
      cmbCliNroVto.addItem("2", "2", (short)(0));
      cmbCliNroVto.addItem("3", "3", (short)(0));
      cmbCliNroVto.addItem("4", "4", (short)(0));
      if ( cmbCliNroVto.getItemCount() > 0 )
      {
         A280CliNroVto = (byte)(GXutil.lval( cmbCliNroVto.getValidValue(GXutil.trim( GXutil.str( A280CliNroVto, 2, 0))))) ;
      }
      GXCCtl = "CLIDIAPAG_" + sGXsfl_32_idx ;
      cmbCliDiaPag.setName( GXCCtl );
      cmbCliDiaPag.setWebtags( "" );
      cmbCliDiaPag.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliDiaPag.addItem("1", "1", (short)(0));
      cmbCliDiaPag.addItem("2", "2", (short)(0));
      cmbCliDiaPag.addItem("3", "3", (short)(0));
      cmbCliDiaPag.addItem("4", "4", (short)(0));
      cmbCliDiaPag.addItem("5", "5", (short)(0));
      cmbCliDiaPag.addItem("6", "6", (short)(0));
      cmbCliDiaPag.addItem("7", "7", (short)(0));
      cmbCliDiaPag.addItem("8", "8", (short)(0));
      cmbCliDiaPag.addItem("9", "9", (short)(0));
      cmbCliDiaPag.addItem("10", "10", (short)(0));
      cmbCliDiaPag.addItem("11", "11", (short)(0));
      cmbCliDiaPag.addItem("12", "12", (short)(0));
      cmbCliDiaPag.addItem("13", "13", (short)(0));
      cmbCliDiaPag.addItem("14", "14", (short)(0));
      cmbCliDiaPag.addItem("15", "15", (short)(0));
      cmbCliDiaPag.addItem("16", "16", (short)(0));
      cmbCliDiaPag.addItem("17", "17", (short)(0));
      cmbCliDiaPag.addItem("18", "18", (short)(0));
      cmbCliDiaPag.addItem("19", "19", (short)(0));
      cmbCliDiaPag.addItem("20", "20", (short)(0));
      cmbCliDiaPag.addItem("21", "21", (short)(0));
      cmbCliDiaPag.addItem("22", "22", (short)(0));
      cmbCliDiaPag.addItem("23", "23", (short)(0));
      cmbCliDiaPag.addItem("24", "24", (short)(0));
      cmbCliDiaPag.addItem("25", "25", (short)(0));
      cmbCliDiaPag.addItem("26", "27", (short)(0));
      cmbCliDiaPag.addItem("27", "27", (short)(0));
      cmbCliDiaPag.addItem("28", "28", (short)(0));
      cmbCliDiaPag.addItem("29", "29", (short)(0));
      cmbCliDiaPag.addItem("30", "30", (short)(0));
      cmbCliDiaPag.addItem("31", "31", (short)(0));
      if ( cmbCliDiaPag.getItemCount() > 0 )
      {
         A259CliDiaPag = cmbCliDiaPag.getValidValue(A259CliDiaPag) ;
      }
      GXCCtl = "CLIREGIVA_" + sGXsfl_32_idx ;
      cmbCliRegIVA.setName( GXCCtl );
      cmbCliRegIVA.setWebtags( "" );
      cmbCliRegIVA.addItem("G", httpContext.getMessage( "General", ""), (short)(0));
      cmbCliRegIVA.addItem("R", httpContext.getMessage( "Repercutido", ""), (short)(0));
      cmbCliRegIVA.addItem("E", httpContext.getMessage( "Exento", ""), (short)(0));
      if ( cmbCliRegIVA.getItemCount() > 0 )
      {
         A299CliRegIVA = cmbCliRegIVA.getValidValue(A299CliRegIVA) ;
      }
      GXCCtl = "CLIRETI_" + sGXsfl_32_idx ;
      cmbCliRetI.setName( GXCCtl );
      cmbCliRetI.setWebtags( "" );
      cmbCliRetI.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliRetI.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliRetI.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliRetI.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A8350CliRetI)==0) )
         {
            A8350CliRetI = httpContext.getMessage( "N", "") ;
         }
      }
      GXCCtl = "CLIGRANCON_" + sGXsfl_32_idx ;
      cmbCliGranCon.setName( GXCCtl );
      cmbCliGranCon.setWebtags( "" );
      cmbCliGranCon.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliGranCon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliGranCon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliGranCon.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A6867CliGranCon)==0) )
         {
            A6867CliGranCon = httpContext.getMessage( "N", "") ;
         }
      }
      GXCCtl = "CLIRETICA_" + sGXsfl_32_idx ;
      cmbCliRetIca.setName( GXCCtl );
      cmbCliRetIca.setWebtags( "" );
      cmbCliRetIca.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliRetIca.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliRetIca.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliRetIca.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A6866CliRetIca)==0) )
         {
            A6866CliRetIca = httpContext.getMessage( "N", "") ;
         }
      }
      GXCCtl = "CLIRETF_" + sGXsfl_32_idx ;
      cmbCliRetF.setName( GXCCtl );
      cmbCliRetF.setWebtags( "" );
      cmbCliRetF.addItem("", httpContext.getMessage( "", ""), (short)(0));
      cmbCliRetF.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      cmbCliRetF.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      if ( cmbCliRetF.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A6865CliRetF)==0) )
         {
            A6865CliRetF = httpContext.getMessage( "N", "") ;
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

   public void valid_Fpgcod( )
   {
      /* Using cursor T000L85 */
      pr_default.execute(83, new Object[] {A396EmprCod, A497FpgCod});
      if ( (pr_default.getStatus(83) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FORPAG", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FPGCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFpgCod_Internalname ;
      }
      pr_default.close(83);
      dynload_actions( ) ;
      if ( cmbCliPri.getItemCount() > 0 )
      {
         A297CliPri = cmbCliPri.getValidValue(A297CliPri) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCliPri.setValue( GXutil.rtrim( A297CliPri) );
      }
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV31EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV45CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120L2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_CLIPRI","{handler:'valid_Clipri',iparms:[]");
      setEventMetadata("VALID_CLIPRI",",oparms:[]}");
      setEventMetadata("VALID_FPGCOD","{handler:'valid_Fpgcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A497FpgCod',fld:'FPGCOD',pic:'@!'}]");
      setEventMetadata("VALID_FPGCOD",",oparms:[]}");
      setEventMetadata("VALID_CLIDTOPPG","{handler:'valid_Clidtoppg',iparms:[]");
      setEventMetadata("VALID_CLIDTOPPG",",oparms:[]}");
      setEventMetadata("VALID_CLIREGIVA","{handler:'valid_Cliregiva',iparms:[]");
      setEventMetadata("VALID_CLIREGIVA",",oparms:[]}");
      setEventMetadata("VALID_CLIRETI","{handler:'valid_Clireti',iparms:[]");
      setEventMetadata("VALID_CLIRETI",",oparms:[]}");
      setEventMetadata("VALID_CLIGRANCON","{handler:'valid_Cligrancon',iparms:[]");
      setEventMetadata("VALID_CLIGRANCON",",oparms:[]}");
      setEventMetadata("VALID_CLIRETICA","{handler:'valid_Cliretica',iparms:[]");
      setEventMetadata("VALID_CLIRETICA",",oparms:[]}");
      setEventMetadata("VALID_CLIRETF","{handler:'valid_Cliretf',iparms:[]");
      setEventMetadata("VALID_CLIRETF",",oparms:[]}");
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
      Z297CliPri = "" ;
      Z6630CliDto = DecimalUtil.ZERO ;
      Z6865CliRetF = "" ;
      Z6866CliRetIca = "" ;
      Z6867CliGranCon = "" ;
      Z8350CliRetI = "" ;
      Z296CliPrd = "" ;
      Z259CliDiaPag = "" ;
      Z261CliDtoGrl = DecimalUtil.ZERO ;
      Z262CliDtoPpg = DecimalUtil.ZERO ;
      Z299CliRegIVA = "" ;
      Z14421Clipor1 = DecimalUtil.ZERO ;
      Z497FpgCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A497FpgCod = "" ;
      Gx_mode = "" ;
      AV31EmprCod = "" ;
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
      AV52Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_fpgcod = new com.genexus.webpanels.GXUserControl();
      AV47DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV46FpgCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1868 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A14421Clipor1 = DecimalUtil.ZERO ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_fpgcod_Objectcall = "" ;
      Combo_fpgcod_Class = "" ;
      Combo_fpgcod_Icontype = "" ;
      Combo_fpgcod_Icon = "" ;
      Combo_fpgcod_Tooltip = "" ;
      Combo_fpgcod_Selectedvalue_set = "" ;
      Combo_fpgcod_Selectedvalue_get = "" ;
      Combo_fpgcod_Selectedtext_set = "" ;
      Combo_fpgcod_Selectedtext_get = "" ;
      Combo_fpgcod_Gamoauthtoken = "" ;
      Combo_fpgcod_Ddointernalname = "" ;
      Combo_fpgcod_Titlecontrolalign = "" ;
      Combo_fpgcod_Dropdownoptionstype = "" ;
      Combo_fpgcod_Datalisttype = "" ;
      Combo_fpgcod_Datalistfixedvalues = "" ;
      Combo_fpgcod_Datalistproc = "" ;
      Combo_fpgcod_Datalistprocparametersprefix = "" ;
      Combo_fpgcod_Remoteservicesparameters = "" ;
      Combo_fpgcod_Htmltemplate = "" ;
      Combo_fpgcod_Multiplevaluestype = "" ;
      Combo_fpgcod_Loadingdata = "" ;
      Combo_fpgcod_Noresultsfound = "" ;
      Combo_fpgcod_Emptyitemtext = "" ;
      Combo_fpgcod_Onlyselectedvalues = "" ;
      Combo_fpgcod_Selectalltext = "" ;
      Combo_fpgcod_Multiplevaluesseparator = "" ;
      Combo_fpgcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode21 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A297CliPri = "" ;
      A296CliPrd = "" ;
      A259CliDiaPag = "" ;
      A262CliDtoPpg = DecimalUtil.ZERO ;
      A6630CliDto = DecimalUtil.ZERO ;
      A261CliDtoGrl = DecimalUtil.ZERO ;
      A299CliRegIVA = "" ;
      A8350CliRetI = "" ;
      A6867CliGranCon = "" ;
      A6866CliRetIca = "" ;
      A6865CliRetF = "" ;
      AV29Station = "" ;
      AV30EmprNom = "" ;
      AV26UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV41TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV42WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV48ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T000L7_A407EmprNom = new String[] {""} ;
      T000L7_n407EmprNom = new boolean[] {false} ;
      T000L8_A252CliCod = new int[1] ;
      T000L8_n252CliCod = new boolean[] {false} ;
      T000L8_A407EmprNom = new String[] {""} ;
      T000L8_n407EmprNom = new boolean[] {false} ;
      T000L8_A279CliNom = new String[] {""} ;
      T000L8_A396EmprCod = new String[] {""} ;
      T000L9_A396EmprCod = new String[] {""} ;
      T000L9_A252CliCod = new int[1] ;
      T000L9_n252CliCod = new boolean[] {false} ;
      T000L6_A252CliCod = new int[1] ;
      T000L6_n252CliCod = new boolean[] {false} ;
      T000L6_A279CliNom = new String[] {""} ;
      T000L6_A396EmprCod = new String[] {""} ;
      T000L10_A396EmprCod = new String[] {""} ;
      T000L10_A252CliCod = new int[1] ;
      T000L10_n252CliCod = new boolean[] {false} ;
      T000L11_A396EmprCod = new String[] {""} ;
      T000L11_A252CliCod = new int[1] ;
      T000L11_n252CliCod = new boolean[] {false} ;
      T000L5_A252CliCod = new int[1] ;
      T000L5_n252CliCod = new boolean[] {false} ;
      T000L5_A279CliNom = new String[] {""} ;
      T000L5_A396EmprCod = new String[] {""} ;
      T000L15_A396EmprCod = new String[] {""} ;
      T000L15_A252CliCod = new int[1] ;
      T000L15_n252CliCod = new boolean[] {false} ;
      T000L15_A6930Lb_rclin = new int[1] ;
      T000L16_A396EmprCod = new String[] {""} ;
      T000L16_A6850Tex_NPed = new int[1] ;
      T000L17_A396EmprCod = new String[] {""} ;
      T000L17_A252CliCod = new int[1] ;
      T000L17_n252CliCod = new boolean[] {false} ;
      T000L17_A829TipArtCod = new short[1] ;
      T000L17_A831TipColCod = new byte[1] ;
      T000L17_A583IntCod = new byte[1] ;
      T000L17_A5098TipDisCod = new String[] {""} ;
      T000L17_A6603Est1_anyo = new short[1] ;
      T000L17_A6604Est1_mes = new byte[1] ;
      T000L17_A6605Est1_dia = new byte[1] ;
      T000L18_A396EmprCod = new String[] {""} ;
      T000L18_A6319C_Barcod = new int[1] ;
      T000L18_A6320C_Barcodre = new byte[1] ;
      T000L18_A6321C_Barcodpa = new String[] {""} ;
      T000L18_A6322C_Reclinma = new short[1] ;
      T000L19_A396EmprCod = new String[] {""} ;
      T000L19_A6235DevEmpCod = new int[1] ;
      T000L20_A396EmprCod = new String[] {""} ;
      T000L20_A602MaqCod = new String[] {""} ;
      T000L20_A6078MaqCliCod = new int[1] ;
      T000L20_A6079MaqArtCod = new String[] {""} ;
      T000L21_A396EmprCod = new String[] {""} ;
      T000L21_A5532Lb_numero = new int[1] ;
      T000L22_A396EmprCod = new String[] {""} ;
      T000L22_A252CliCod = new int[1] ;
      T000L22_n252CliCod = new boolean[] {false} ;
      T000L22_A5503CliifLin = new short[1] ;
      T000L23_A396EmprCod = new String[] {""} ;
      T000L23_A252CliCod = new int[1] ;
      T000L23_n252CliCod = new boolean[] {false} ;
      T000L23_A5499ClieiLin = new short[1] ;
      T000L24_A396EmprCod = new String[] {""} ;
      T000L24_A252CliCod = new int[1] ;
      T000L24_n252CliCod = new boolean[] {false} ;
      T000L24_A5495ClidtLin = new short[1] ;
      T000L25_A396EmprCod = new String[] {""} ;
      T000L25_A252CliCod = new int[1] ;
      T000L25_n252CliCod = new boolean[] {false} ;
      T000L25_A5491CliedLin = new short[1] ;
      T000L26_A396EmprCod = new String[] {""} ;
      T000L26_A252CliCod = new int[1] ;
      T000L26_n252CliCod = new boolean[] {false} ;
      T000L26_A5452P_ForCod = new String[] {""} ;
      T000L27_A396EmprCod = new String[] {""} ;
      T000L27_A252CliCod = new int[1] ;
      T000L27_n252CliCod = new boolean[] {false} ;
      T000L27_A5443Mdl_Cod = new String[] {""} ;
      T000L28_A396EmprCod = new String[] {""} ;
      T000L28_A252CliCod = new int[1] ;
      T000L28_n252CliCod = new boolean[] {false} ;
      T000L28_A5436IntCodF2 = new short[1] ;
      T000L29_A396EmprCod = new String[] {""} ;
      T000L29_A252CliCod = new int[1] ;
      T000L29_n252CliCod = new boolean[] {false} ;
      T000L29_A5396IntCodFC = new byte[1] ;
      T000L29_A5434Tip_ColC = new byte[1] ;
      T000L30_A396EmprCod = new String[] {""} ;
      T000L30_A252CliCod = new int[1] ;
      T000L30_n252CliCod = new boolean[] {false} ;
      T000L30_A5428FasPreCod = new String[] {""} ;
      T000L31_A396EmprCod = new String[] {""} ;
      T000L31_A252CliCod = new int[1] ;
      T000L31_n252CliCod = new boolean[] {false} ;
      T000L31_A5398Cli_Proc = new String[] {""} ;
      T000L32_A396EmprCod = new String[] {""} ;
      T000L32_A5130PagIden = new int[1] ;
      T000L33_A396EmprCod = new String[] {""} ;
      T000L33_A5059Hl_hdr = new int[1] ;
      T000L33_A5060Hl_hdrr = new byte[1] ;
      T000L33_A5061Hl_hdrp = new String[] {""} ;
      T000L34_A396EmprCod = new String[] {""} ;
      T000L34_A252CliCod = new int[1] ;
      T000L34_n252CliCod = new boolean[] {false} ;
      T000L34_A4718DishCod = new String[] {""} ;
      T000L34_A5020TipEstCod = new byte[1] ;
      T000L34_A5022GraCod = new byte[1] ;
      T000L35_A396EmprCod = new String[] {""} ;
      T000L35_A4618EnsLCod = new int[1] ;
      T000L36_A396EmprCod = new String[] {""} ;
      T000L36_A4492HreBarCod = new int[1] ;
      T000L36_A4493HreBarReo = new byte[1] ;
      T000L36_A4494HreBarPar = new String[] {""} ;
      T000L36_A4495HreNumCie = new byte[1] ;
      T000L37_A396EmprCod = new String[] {""} ;
      T000L37_A252CliCod = new int[1] ;
      T000L37_n252CliCod = new boolean[] {false} ;
      T000L37_A4415EstCol = new String[] {""} ;
      T000L38_A396EmprCod = new String[] {""} ;
      T000L38_A4185WEBUSU = new String[] {""} ;
      T000L39_A396EmprCod = new String[] {""} ;
      T000L39_A252CliCod = new int[1] ;
      T000L39_n252CliCod = new boolean[] {false} ;
      T000L39_A4079WEBDISCOD = new String[] {""} ;
      T000L39_A4078EMPCOD = new String[] {""} ;
      T000L40_A396EmprCod = new String[] {""} ;
      T000L40_A2637HisEstHRu = new int[1] ;
      T000L40_A2636HisEstHRe = new byte[1] ;
      T000L40_A2635HisEstHPa = new String[] {""} ;
      T000L40_A2638HisEstLCo = new byte[1] ;
      T000L40_A2630HisEstCom = new String[] {""} ;
      T000L40_A2634HisEstFon = new String[] {""} ;
      T000L41_A396EmprCod = new String[] {""} ;
      T000L41_A2574GrpDibCod = new int[1] ;
      T000L42_A396EmprCod = new String[] {""} ;
      T000L42_A2558GrmDibCod = new int[1] ;
      T000L43_A396EmprCod = new String[] {""} ;
      T000L43_A2542GrcDibCod = new int[1] ;
      T000L44_A396EmprCod = new String[] {""} ;
      T000L44_A1031EmpesCod = new String[] {""} ;
      T000L44_A252CliCod = new int[1] ;
      T000L44_n252CliCod = new boolean[] {false} ;
      T000L44_A1032FonCod = new String[] {""} ;
      T000L45_A396EmprCod = new String[] {""} ;
      T000L45_A1013DibCli = new String[] {""} ;
      T000L45_A252CliCod = new int[1] ;
      T000L45_n252CliCod = new boolean[] {false} ;
      T000L45_A1014DibInt = new int[1] ;
      T000L46_A396EmprCod = new String[] {""} ;
      T000L46_A1736AlbExtCod = new long[1] ;
      T000L47_A396EmprCod = new String[] {""} ;
      T000L47_A252CliCod = new int[1] ;
      T000L47_n252CliCod = new boolean[] {false} ;
      T000L47_A3661FacProAny = new short[1] ;
      T000L47_A3662FacProSer = new String[] {""} ;
      T000L47_A3663FacProInt = new byte[1] ;
      T000L47_A3664FacProTip = new byte[1] ;
      T000L47_A3665FacProTar = new short[1] ;
      T000L48_A396EmprCod = new String[] {""} ;
      T000L48_A3646EstTinAny = new short[1] ;
      T000L48_A3647EstTinMes = new byte[1] ;
      T000L48_A3648EstTinDia = new byte[1] ;
      T000L48_A1929EstTinNr = new short[1] ;
      T000L49_A396EmprCod = new String[] {""} ;
      T000L49_A3617AlbTrnCod = new long[1] ;
      T000L50_A396EmprCod = new String[] {""} ;
      T000L50_A252CliCod = new int[1] ;
      T000L50_n252CliCod = new boolean[] {false} ;
      T000L50_A3320CliLimKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L51_A396EmprCod = new String[] {""} ;
      T000L51_A3073RepCod = new String[] {""} ;
      T000L51_A252CliCod = new int[1] ;
      T000L51_n252CliCod = new boolean[] {false} ;
      T000L52_A396EmprCod = new String[] {""} ;
      T000L52_A3061Codia = new byte[1] ;
      T000L52_A3062CoMes = new byte[1] ;
      T000L52_A3063CoAny = new short[1] ;
      T000L52_A3065CoLin = new byte[1] ;
      T000L52_A3010CoBarCod = new int[1] ;
      T000L52_A3011CoBarReo = new byte[1] ;
      T000L52_A3012CoBarPar = new String[] {""} ;
      T000L53_A396EmprCod = new String[] {""} ;
      T000L53_A2971SabFacCod = new int[1] ;
      T000L54_A396EmprCod = new String[] {""} ;
      T000L54_A2954TiDia = new byte[1] ;
      T000L54_A2955TiMes = new byte[1] ;
      T000L54_A2956TiAny = new short[1] ;
      T000L54_A2958TiLin = new byte[1] ;
      T000L54_A2959TiBarCod = new int[1] ;
      T000L54_A2960TiBarReo = new byte[1] ;
      T000L54_A2961TiBarPar = new String[] {""} ;
      T000L55_A396EmprCod = new String[] {""} ;
      T000L55_A252CliCod = new int[1] ;
      T000L55_n252CliCod = new boolean[] {false} ;
      T000L55_A2933RecTipCon = new short[1] ;
      T000L56_A396EmprCod = new String[] {""} ;
      T000L56_A252CliCod = new int[1] ;
      T000L56_n252CliCod = new boolean[] {false} ;
      T000L56_A2927RecProCod = new String[] {""} ;
      T000L57_A396EmprCod = new String[] {""} ;
      T000L57_A252CliCod = new int[1] ;
      T000L57_n252CliCod = new boolean[] {false} ;
      T000L57_A2891HMaForSer = new String[] {""} ;
      T000L57_A2892HMaForCNom = new String[] {""} ;
      T000L57_A2893HMaForCNum = new int[1] ;
      T000L57_A2894HMaTipCCod = new byte[1] ;
      T000L57_A2895HMaForNumC = new int[1] ;
      T000L57_A2897HMaColLin = new short[1] ;
      T000L57_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T000L57_A2907HmaLin = new short[1] ;
      T000L58_A396EmprCod = new String[] {""} ;
      T000L58_A252CliCod = new int[1] ;
      T000L58_n252CliCod = new boolean[] {false} ;
      T000L58_A425EstAny = new short[1] ;
      T000L58_A2755EstSerFac = new String[] {""} ;
      T000L59_A396EmprCod = new String[] {""} ;
      T000L59_A2730RecTipCo = new short[1] ;
      T000L59_A252CliCod = new int[1] ;
      T000L59_n252CliCod = new boolean[] {false} ;
      T000L60_A396EmprCod = new String[] {""} ;
      T000L60_A2720TarSec = new String[] {""} ;
      T000L60_A252CliCod = new int[1] ;
      T000L60_n252CliCod = new boolean[] {false} ;
      T000L60_A829TipArtCod = new short[1] ;
      T000L60_A831TipColCod = new byte[1] ;
      T000L61_A396EmprCod = new String[] {""} ;
      T000L61_A2382AbcTerCod = new String[] {""} ;
      T000L61_A2381AbcSec = new String[] {""} ;
      T000L61_A252CliCod = new int[1] ;
      T000L61_n252CliCod = new boolean[] {false} ;
      T000L62_A396EmprCod = new String[] {""} ;
      T000L62_A252CliCod = new int[1] ;
      T000L62_n252CliCod = new boolean[] {false} ;
      T000L62_A2308CliDesCod = new int[1] ;
      T000L63_A396EmprCod = new String[] {""} ;
      T000L63_A2268MovParCod = new String[] {""} ;
      T000L63_A252CliCod = new int[1] ;
      T000L63_n252CliCod = new boolean[] {false} ;
      T000L64_A396EmprCod = new String[] {""} ;
      T000L64_A966PartCod = new String[] {""} ;
      T000L64_A252CliCod = new int[1] ;
      T000L64_n252CliCod = new boolean[] {false} ;
      T000L65_A396EmprCod = new String[] {""} ;
      T000L65_A1387AlbPrvCod = new int[1] ;
      T000L66_A396EmprCod = new String[] {""} ;
      T000L66_A252CliCod = new int[1] ;
      T000L66_n252CliCod = new boolean[] {false} ;
      T000L66_A1213TalCod = new String[] {""} ;
      T000L67_A396EmprCod = new String[] {""} ;
      T000L67_A252CliCod = new int[1] ;
      T000L67_n252CliCod = new boolean[] {false} ;
      T000L67_A457FasCod = new String[] {""} ;
      T000L68_A396EmprCod = new String[] {""} ;
      T000L68_A539HisBarCod = new int[1] ;
      T000L68_A545HisCodReo = new byte[1] ;
      T000L68_A544HisCodPar = new String[] {""} ;
      T000L68_A833TipDefCod = new short[1] ;
      T000L69_A396EmprCod = new String[] {""} ;
      T000L69_A506HbaBarCod = new int[1] ;
      T000L69_A508HbaBarReo = new byte[1] ;
      T000L69_A507HbaBarPar = new String[] {""} ;
      T000L70_A396EmprCod = new String[] {""} ;
      T000L70_A252CliCod = new int[1] ;
      T000L70_n252CliCod = new boolean[] {false} ;
      T000L70_A494ForSer = new String[] {""} ;
      T000L70_A482ForColNom = new String[] {""} ;
      T000L70_A483ForColNum = new int[1] ;
      T000L70_A831TipColCod = new byte[1] ;
      T000L71_A396EmprCod = new String[] {""} ;
      T000L71_A252CliCod = new int[1] ;
      T000L71_n252CliCod = new boolean[] {false} ;
      T000L71_A287CliPagLin = new byte[1] ;
      T000L72_A396EmprCod = new String[] {""} ;
      T000L72_A252CliCod = new int[1] ;
      T000L72_n252CliCod = new boolean[] {false} ;
      T000L72_A266CliEnvLin = new byte[1] ;
      T000L73_A396EmprCod = new String[] {""} ;
      T000L73_A252CliCod = new int[1] ;
      T000L73_n252CliCod = new boolean[] {false} ;
      T000L73_A65ArtCod = new String[] {""} ;
      T000L74_A396EmprCod = new String[] {""} ;
      T000L74_A44AlbRecCod = new int[1] ;
      T000L75_A396EmprCod = new String[] {""} ;
      T000L75_A30AlbProCod = new long[1] ;
      T000L76_A396EmprCod = new String[] {""} ;
      T000L76_A14AlbComCod = new int[1] ;
      T000L77_A396EmprCod = new String[] {""} ;
      T000L77_A252CliCod = new int[1] ;
      T000L77_n252CliCod = new boolean[] {false} ;
      T000L78_A252CliCod = new int[1] ;
      T000L78_n252CliCod = new boolean[] {false} ;
      T000L78_A297CliPri = new String[] {""} ;
      T000L78_A6630CliDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L78_A6865CliRetF = new String[] {""} ;
      T000L78_A6866CliRetIca = new String[] {""} ;
      T000L78_A6867CliGranCon = new String[] {""} ;
      T000L78_A8350CliRetI = new String[] {""} ;
      T000L78_A280CliNroVto = new byte[1] ;
      T000L78_A296CliPrd = new String[] {""} ;
      T000L78_A259CliDiaPag = new String[] {""} ;
      T000L78_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L78_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L78_A299CliRegIVA = new String[] {""} ;
      T000L78_A14421Clipor1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L78_A14422Clipor2 = new short[1] ;
      T000L78_A396EmprCod = new String[] {""} ;
      T000L78_A497FpgCod = new String[] {""} ;
      T000L4_A396EmprCod = new String[] {""} ;
      T000L79_A396EmprCod = new String[] {""} ;
      T000L80_A396EmprCod = new String[] {""} ;
      T000L80_A252CliCod = new int[1] ;
      T000L80_n252CliCod = new boolean[] {false} ;
      T000L80_A297CliPri = new String[] {""} ;
      T000L3_A252CliCod = new int[1] ;
      T000L3_n252CliCod = new boolean[] {false} ;
      T000L3_A297CliPri = new String[] {""} ;
      T000L3_A6630CliDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L3_A6865CliRetF = new String[] {""} ;
      T000L3_A6866CliRetIca = new String[] {""} ;
      T000L3_A6867CliGranCon = new String[] {""} ;
      T000L3_A8350CliRetI = new String[] {""} ;
      T000L3_A280CliNroVto = new byte[1] ;
      T000L3_A296CliPrd = new String[] {""} ;
      T000L3_A259CliDiaPag = new String[] {""} ;
      T000L3_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L3_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L3_A299CliRegIVA = new String[] {""} ;
      T000L3_A14421Clipor1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L3_A14422Clipor2 = new short[1] ;
      T000L3_A396EmprCod = new String[] {""} ;
      T000L3_A497FpgCod = new String[] {""} ;
      T000L2_A252CliCod = new int[1] ;
      T000L2_n252CliCod = new boolean[] {false} ;
      T000L2_A297CliPri = new String[] {""} ;
      T000L2_A6630CliDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L2_A6865CliRetF = new String[] {""} ;
      T000L2_A6866CliRetIca = new String[] {""} ;
      T000L2_A6867CliGranCon = new String[] {""} ;
      T000L2_A8350CliRetI = new String[] {""} ;
      T000L2_A280CliNroVto = new byte[1] ;
      T000L2_A296CliPrd = new String[] {""} ;
      T000L2_A259CliDiaPag = new String[] {""} ;
      T000L2_A261CliDtoGrl = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L2_A262CliDtoPpg = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L2_A299CliRegIVA = new String[] {""} ;
      T000L2_A14421Clipor1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000L2_A14422Clipor2 = new short[1] ;
      T000L2_A396EmprCod = new String[] {""} ;
      T000L2_A497FpgCod = new String[] {""} ;
      T000L84_A396EmprCod = new String[] {""} ;
      T000L84_A252CliCod = new int[1] ;
      T000L84_n252CliCod = new boolean[] {false} ;
      T000L84_A297CliPri = new String[] {""} ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i6865CliRetF = "" ;
      i6866CliRetIca = "" ;
      i6867CliGranCon = "" ;
      i8350CliRetI = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      T000L85_A396EmprCod = new String[] {""} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tclifpg__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tclifpg__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tclifpg__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tclifpg__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tclifpg__default(),
         new Object[] {
             new Object[] {
            T000L2_A252CliCod, T000L2_A297CliPri, T000L2_A6630CliDto, T000L2_A6865CliRetF, T000L2_A6866CliRetIca, T000L2_A6867CliGranCon, T000L2_A8350CliRetI, T000L2_A280CliNroVto, T000L2_A296CliPrd, T000L2_A259CliDiaPag,
            T000L2_A261CliDtoGrl, T000L2_A262CliDtoPpg, T000L2_A299CliRegIVA, T000L2_A14421Clipor1, T000L2_A14422Clipor2, T000L2_A396EmprCod, T000L2_A497FpgCod
            }
            , new Object[] {
            T000L3_A252CliCod, T000L3_A297CliPri, T000L3_A6630CliDto, T000L3_A6865CliRetF, T000L3_A6866CliRetIca, T000L3_A6867CliGranCon, T000L3_A8350CliRetI, T000L3_A280CliNroVto, T000L3_A296CliPrd, T000L3_A259CliDiaPag,
            T000L3_A261CliDtoGrl, T000L3_A262CliDtoPpg, T000L3_A299CliRegIVA, T000L3_A14421Clipor1, T000L3_A14422Clipor2, T000L3_A396EmprCod, T000L3_A497FpgCod
            }
            , new Object[] {
            T000L4_A396EmprCod
            }
            , new Object[] {
            T000L5_A252CliCod, T000L5_A279CliNom, T000L5_A396EmprCod
            }
            , new Object[] {
            T000L6_A252CliCod, T000L6_A279CliNom, T000L6_A396EmprCod
            }
            , new Object[] {
            T000L7_A407EmprNom, T000L7_n407EmprNom
            }
            , new Object[] {
            T000L8_A252CliCod, T000L8_A407EmprNom, T000L8_n407EmprNom, T000L8_A279CliNom, T000L8_A396EmprCod
            }
            , new Object[] {
            T000L9_A396EmprCod, T000L9_A252CliCod
            }
            , new Object[] {
            T000L10_A396EmprCod, T000L10_A252CliCod
            }
            , new Object[] {
            T000L11_A396EmprCod, T000L11_A252CliCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000L15_A396EmprCod, T000L15_A252CliCod, T000L15_A6930Lb_rclin
            }
            , new Object[] {
            T000L16_A396EmprCod, T000L16_A6850Tex_NPed
            }
            , new Object[] {
            T000L17_A396EmprCod, T000L17_A252CliCod, T000L17_A829TipArtCod, T000L17_A831TipColCod, T000L17_A583IntCod, T000L17_A5098TipDisCod, T000L17_A6603Est1_anyo, T000L17_A6604Est1_mes, T000L17_A6605Est1_dia
            }
            , new Object[] {
            T000L18_A396EmprCod, T000L18_A6319C_Barcod, T000L18_A6320C_Barcodre, T000L18_A6321C_Barcodpa, T000L18_A6322C_Reclinma
            }
            , new Object[] {
            T000L19_A396EmprCod, T000L19_A6235DevEmpCod
            }
            , new Object[] {
            T000L20_A396EmprCod, T000L20_A602MaqCod, T000L20_A6078MaqCliCod, T000L20_A6079MaqArtCod
            }
            , new Object[] {
            T000L21_A396EmprCod, T000L21_A5532Lb_numero
            }
            , new Object[] {
            T000L22_A396EmprCod, T000L22_A252CliCod, T000L22_A5503CliifLin
            }
            , new Object[] {
            T000L23_A396EmprCod, T000L23_A252CliCod, T000L23_A5499ClieiLin
            }
            , new Object[] {
            T000L24_A396EmprCod, T000L24_A252CliCod, T000L24_A5495ClidtLin
            }
            , new Object[] {
            T000L25_A396EmprCod, T000L25_A252CliCod, T000L25_A5491CliedLin
            }
            , new Object[] {
            T000L26_A396EmprCod, T000L26_A252CliCod, T000L26_A5452P_ForCod
            }
            , new Object[] {
            T000L27_A396EmprCod, T000L27_A252CliCod, T000L27_A5443Mdl_Cod
            }
            , new Object[] {
            T000L28_A396EmprCod, T000L28_A252CliCod, T000L28_A5436IntCodF2
            }
            , new Object[] {
            T000L29_A396EmprCod, T000L29_A252CliCod, T000L29_A5396IntCodFC, T000L29_A5434Tip_ColC
            }
            , new Object[] {
            T000L30_A396EmprCod, T000L30_A252CliCod, T000L30_A5428FasPreCod
            }
            , new Object[] {
            T000L31_A396EmprCod, T000L31_A252CliCod, T000L31_A5398Cli_Proc
            }
            , new Object[] {
            T000L32_A396EmprCod, T000L32_A5130PagIden
            }
            , new Object[] {
            T000L33_A396EmprCod, T000L33_A5059Hl_hdr, T000L33_A5060Hl_hdrr, T000L33_A5061Hl_hdrp
            }
            , new Object[] {
            T000L34_A396EmprCod, T000L34_A252CliCod, T000L34_A4718DishCod, T000L34_A5020TipEstCod, T000L34_A5022GraCod
            }
            , new Object[] {
            T000L35_A396EmprCod, T000L35_A4618EnsLCod
            }
            , new Object[] {
            T000L36_A396EmprCod, T000L36_A4492HreBarCod, T000L36_A4493HreBarReo, T000L36_A4494HreBarPar, T000L36_A4495HreNumCie
            }
            , new Object[] {
            T000L37_A396EmprCod, T000L37_A252CliCod, T000L37_A4415EstCol
            }
            , new Object[] {
            T000L38_A396EmprCod, T000L38_A4185WEBUSU
            }
            , new Object[] {
            T000L39_A396EmprCod, T000L39_A252CliCod, T000L39_A4079WEBDISCOD, T000L39_A4078EMPCOD
            }
            , new Object[] {
            T000L40_A396EmprCod, T000L40_A2637HisEstHRu, T000L40_A2636HisEstHRe, T000L40_A2635HisEstHPa, T000L40_A2638HisEstLCo, T000L40_A2630HisEstCom, T000L40_A2634HisEstFon
            }
            , new Object[] {
            T000L41_A396EmprCod, T000L41_A2574GrpDibCod
            }
            , new Object[] {
            T000L42_A396EmprCod, T000L42_A2558GrmDibCod
            }
            , new Object[] {
            T000L43_A396EmprCod, T000L43_A2542GrcDibCod
            }
            , new Object[] {
            T000L44_A396EmprCod, T000L44_A1031EmpesCod, T000L44_A252CliCod, T000L44_A1032FonCod
            }
            , new Object[] {
            T000L45_A396EmprCod, T000L45_A1013DibCli, T000L45_A252CliCod, T000L45_A1014DibInt
            }
            , new Object[] {
            T000L46_A396EmprCod, T000L46_A1736AlbExtCod
            }
            , new Object[] {
            T000L47_A396EmprCod, T000L47_A252CliCod, T000L47_A3661FacProAny, T000L47_A3662FacProSer, T000L47_A3663FacProInt, T000L47_A3664FacProTip, T000L47_A3665FacProTar
            }
            , new Object[] {
            T000L48_A396EmprCod, T000L48_A3646EstTinAny, T000L48_A3647EstTinMes, T000L48_A3648EstTinDia, T000L48_A1929EstTinNr
            }
            , new Object[] {
            T000L49_A396EmprCod, T000L49_A3617AlbTrnCod
            }
            , new Object[] {
            T000L50_A396EmprCod, T000L50_A252CliCod, T000L50_A3320CliLimKgs
            }
            , new Object[] {
            T000L51_A396EmprCod, T000L51_A3073RepCod, T000L51_A252CliCod
            }
            , new Object[] {
            T000L52_A396EmprCod, T000L52_A3061Codia, T000L52_A3062CoMes, T000L52_A3063CoAny, T000L52_A3065CoLin, T000L52_A3010CoBarCod, T000L52_A3011CoBarReo, T000L52_A3012CoBarPar
            }
            , new Object[] {
            T000L53_A396EmprCod, T000L53_A2971SabFacCod
            }
            , new Object[] {
            T000L54_A396EmprCod, T000L54_A2954TiDia, T000L54_A2955TiMes, T000L54_A2956TiAny, T000L54_A2958TiLin, T000L54_A2959TiBarCod, T000L54_A2960TiBarReo, T000L54_A2961TiBarPar
            }
            , new Object[] {
            T000L55_A396EmprCod, T000L55_A252CliCod, T000L55_A2933RecTipCon
            }
            , new Object[] {
            T000L56_A396EmprCod, T000L56_A252CliCod, T000L56_A2927RecProCod
            }
            , new Object[] {
            T000L57_A396EmprCod, T000L57_A252CliCod, T000L57_A2891HMaForSer, T000L57_A2892HMaForCNom, T000L57_A2893HMaForCNum, T000L57_A2894HMaTipCCod, T000L57_A2895HMaForNumC, T000L57_A2897HMaColLin, T000L57_A2896HMaFec, T000L57_A2907HmaLin
            }
            , new Object[] {
            T000L58_A396EmprCod, T000L58_A252CliCod, T000L58_A425EstAny, T000L58_A2755EstSerFac
            }
            , new Object[] {
            T000L59_A396EmprCod, T000L59_A2730RecTipCo, T000L59_A252CliCod
            }
            , new Object[] {
            T000L60_A396EmprCod, T000L60_A2720TarSec, T000L60_A252CliCod, T000L60_A829TipArtCod, T000L60_A831TipColCod
            }
            , new Object[] {
            T000L61_A396EmprCod, T000L61_A2382AbcTerCod, T000L61_A2381AbcSec, T000L61_A252CliCod
            }
            , new Object[] {
            T000L62_A396EmprCod, T000L62_A252CliCod, T000L62_A2308CliDesCod
            }
            , new Object[] {
            T000L63_A396EmprCod, T000L63_A2268MovParCod, T000L63_A252CliCod
            }
            , new Object[] {
            T000L64_A396EmprCod, T000L64_A966PartCod, T000L64_A252CliCod
            }
            , new Object[] {
            T000L65_A396EmprCod, T000L65_A1387AlbPrvCod
            }
            , new Object[] {
            T000L66_A396EmprCod, T000L66_A252CliCod, T000L66_A1213TalCod
            }
            , new Object[] {
            T000L67_A396EmprCod, T000L67_A252CliCod, T000L67_A457FasCod
            }
            , new Object[] {
            T000L68_A396EmprCod, T000L68_A539HisBarCod, T000L68_A545HisCodReo, T000L68_A544HisCodPar, T000L68_A833TipDefCod
            }
            , new Object[] {
            T000L69_A396EmprCod, T000L69_A506HbaBarCod, T000L69_A508HbaBarReo, T000L69_A507HbaBarPar
            }
            , new Object[] {
            T000L70_A396EmprCod, T000L70_A252CliCod, T000L70_A494ForSer, T000L70_A482ForColNom, T000L70_A483ForColNum, T000L70_A831TipColCod
            }
            , new Object[] {
            T000L71_A396EmprCod, T000L71_A252CliCod, T000L71_A287CliPagLin
            }
            , new Object[] {
            T000L72_A396EmprCod, T000L72_A252CliCod, T000L72_A266CliEnvLin
            }
            , new Object[] {
            T000L73_A396EmprCod, T000L73_A252CliCod, T000L73_A65ArtCod
            }
            , new Object[] {
            T000L74_A396EmprCod, T000L74_A44AlbRecCod
            }
            , new Object[] {
            T000L75_A396EmprCod, T000L75_A30AlbProCod
            }
            , new Object[] {
            T000L76_A396EmprCod, T000L76_A14AlbComCod
            }
            , new Object[] {
            T000L77_A396EmprCod, T000L77_A252CliCod
            }
            , new Object[] {
            T000L78_A252CliCod, T000L78_A297CliPri, T000L78_A6630CliDto, T000L78_A6865CliRetF, T000L78_A6866CliRetIca, T000L78_A6867CliGranCon, T000L78_A8350CliRetI, T000L78_A280CliNroVto, T000L78_A296CliPrd, T000L78_A259CliDiaPag,
            T000L78_A261CliDtoGrl, T000L78_A262CliDtoPpg, T000L78_A299CliRegIVA, T000L78_A14421Clipor1, T000L78_A14422Clipor2, T000L78_A396EmprCod, T000L78_A497FpgCod
            }
            , new Object[] {
            T000L79_A396EmprCod
            }
            , new Object[] {
            T000L80_A396EmprCod, T000L80_A252CliCod, T000L80_A297CliPri
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000L84_A396EmprCod, T000L84_A252CliCod, T000L84_A297CliPri
            }
            , new Object[] {
            T000L85_A396EmprCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV52Pgmname = "TCLIFPG" ;
      Z8350CliRetI = httpContext.getMessage( "N", "") ;
      A8350CliRetI = httpContext.getMessage( "N", "") ;
      i8350CliRetI = httpContext.getMessage( "N", "") ;
      Z6867CliGranCon = httpContext.getMessage( "N", "") ;
      A6867CliGranCon = httpContext.getMessage( "N", "") ;
      i6867CliGranCon = httpContext.getMessage( "N", "") ;
      Z6866CliRetIca = httpContext.getMessage( "N", "") ;
      A6866CliRetIca = httpContext.getMessage( "N", "") ;
      i6866CliRetIca = httpContext.getMessage( "N", "") ;
      Z6865CliRetF = httpContext.getMessage( "N", "") ;
      A6865CliRetF = httpContext.getMessage( "N", "") ;
      i6865CliRetF = httpContext.getMessage( "N", "") ;
      Z6630CliDto = DecimalUtil.ZERO ;
      A6630CliDto = DecimalUtil.ZERO ;
   }

   private byte Z280CliNroVto ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte A280CliNroVto ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private short Z14422Clipor2 ;
   private short nRcdDeleted_1868 ;
   private short nRcdExists_1868 ;
   private short nIsMod_1868 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1868 ;
   private short RcdFound1868 ;
   private short nBlankRcdUsr1868 ;
   private short A14422Clipor2 ;
   private short RcdFound21 ;
   private short nIsDirty_21 ;
   private short nIsDirty_1868 ;
   private int wcpOAV45CliCod ;
   private int Z252CliCod ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int AV45CliCod ;
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
   private int edtavPgmname_Enabled ;
   private int edtFpgCod_Enabled ;
   private int edtCliPrd_Enabled ;
   private int edtCliDtoPpg_Enabled ;
   private int edtCliDto_Enabled ;
   private int edtCliDtoGrl_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_fpgcod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defcmbCliPri_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z6630CliDto ;
   private java.math.BigDecimal Z261CliDtoGrl ;
   private java.math.BigDecimal Z262CliDtoPpg ;
   private java.math.BigDecimal Z14421Clipor1 ;
   private java.math.BigDecimal A14421Clipor1 ;
   private java.math.BigDecimal A262CliDtoPpg ;
   private java.math.BigDecimal A6630CliDto ;
   private java.math.BigDecimal A261CliDtoGrl ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV31EmprCod ;
   private String Z396EmprCod ;
   private String Z279CliNom ;
   private String Z297CliPri ;
   private String Z6865CliRetF ;
   private String Z6866CliRetIca ;
   private String Z6867CliGranCon ;
   private String Z8350CliRetI ;
   private String Z296CliPrd ;
   private String Z259CliDiaPag ;
   private String Z299CliRegIVA ;
   private String Z497FpgCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A497FpgCod ;
   private String Gx_mode ;
   private String AV31EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
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
   private String edtavPgmname_Internalname ;
   private String AV52Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_fpgcod_Caption ;
   private String Combo_fpgcod_Cls ;
   private String Combo_fpgcod_Internalname ;
   private String sMode1868 ;
   private String edtFpgCod_Internalname ;
   private String edtCliPrd_Internalname ;
   private String edtCliDtoPpg_Internalname ;
   private String edtCliDto_Internalname ;
   private String edtCliDtoGrl_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_fpgcod_Objectcall ;
   private String Combo_fpgcod_Class ;
   private String Combo_fpgcod_Icontype ;
   private String Combo_fpgcod_Icon ;
   private String Combo_fpgcod_Tooltip ;
   private String Combo_fpgcod_Selectedvalue_set ;
   private String Combo_fpgcod_Selectedvalue_get ;
   private String Combo_fpgcod_Selectedtext_set ;
   private String Combo_fpgcod_Selectedtext_get ;
   private String Combo_fpgcod_Gamoauthtoken ;
   private String Combo_fpgcod_Ddointernalname ;
   private String Combo_fpgcod_Titlecontrolalign ;
   private String Combo_fpgcod_Dropdownoptionstype ;
   private String Combo_fpgcod_Titlecontrolidtoreplace ;
   private String Combo_fpgcod_Datalisttype ;
   private String Combo_fpgcod_Datalistfixedvalues ;
   private String Combo_fpgcod_Datalistproc ;
   private String Combo_fpgcod_Datalistprocparametersprefix ;
   private String Combo_fpgcod_Remoteservicesparameters ;
   private String Combo_fpgcod_Htmltemplate ;
   private String Combo_fpgcod_Multiplevaluestype ;
   private String Combo_fpgcod_Loadingdata ;
   private String Combo_fpgcod_Noresultsfound ;
   private String Combo_fpgcod_Emptyitemtext ;
   private String Combo_fpgcod_Onlyselectedvalues ;
   private String Combo_fpgcod_Selectalltext ;
   private String Combo_fpgcod_Multiplevaluesseparator ;
   private String Combo_fpgcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode21 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A297CliPri ;
   private String A296CliPrd ;
   private String A259CliDiaPag ;
   private String A299CliRegIVA ;
   private String A8350CliRetI ;
   private String A6867CliGranCon ;
   private String A6866CliRetIca ;
   private String A6865CliRetF ;
   private String AV29Station ;
   private String AV30EmprNom ;
   private String AV26UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtFpgCod_Jsonclick ;
   private String edtCliPrd_Jsonclick ;
   private String edtCliDtoPpg_Jsonclick ;
   private String edtCliDto_Jsonclick ;
   private String edtCliDtoGrl_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i6865CliRetF ;
   private String i6866CliRetIca ;
   private String i6867CliGranCon ;
   private String i8350CliRetI ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_fpgcod_Isgriditem ;
   private boolean Combo_fpgcod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_fpgcod_Enabled ;
   private boolean Combo_fpgcod_Visible ;
   private boolean Combo_fpgcod_Allowmultipleselection ;
   private boolean Combo_fpgcod_Hasdescription ;
   private boolean Combo_fpgcod_Includeonlyselectedoption ;
   private boolean Combo_fpgcod_Includeselectalloption ;
   private boolean Combo_fpgcod_Includeaddnewoption ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV48ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV42WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_fpgcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCliPri ;
   private HTMLChoice cmbCliNroVto ;
   private HTMLChoice cmbCliDiaPag ;
   private HTMLChoice cmbCliRegIVA ;
   private HTMLChoice cmbCliRetI ;
   private HTMLChoice cmbCliGranCon ;
   private HTMLChoice cmbCliRetIca ;
   private HTMLChoice cmbCliRetF ;
   private IDataStoreProvider pr_default ;
   private String[] T000L7_A407EmprNom ;
   private boolean[] T000L7_n407EmprNom ;
   private int[] T000L8_A252CliCod ;
   private boolean[] T000L8_n252CliCod ;
   private String[] T000L8_A407EmprNom ;
   private boolean[] T000L8_n407EmprNom ;
   private String[] T000L8_A279CliNom ;
   private String[] T000L8_A396EmprCod ;
   private String[] T000L9_A396EmprCod ;
   private int[] T000L9_A252CliCod ;
   private boolean[] T000L9_n252CliCod ;
   private int[] T000L6_A252CliCod ;
   private boolean[] T000L6_n252CliCod ;
   private String[] T000L6_A279CliNom ;
   private String[] T000L6_A396EmprCod ;
   private String[] T000L10_A396EmprCod ;
   private int[] T000L10_A252CliCod ;
   private boolean[] T000L10_n252CliCod ;
   private String[] T000L11_A396EmprCod ;
   private int[] T000L11_A252CliCod ;
   private boolean[] T000L11_n252CliCod ;
   private int[] T000L5_A252CliCod ;
   private boolean[] T000L5_n252CliCod ;
   private String[] T000L5_A279CliNom ;
   private String[] T000L5_A396EmprCod ;
   private String[] T000L15_A396EmprCod ;
   private int[] T000L15_A252CliCod ;
   private boolean[] T000L15_n252CliCod ;
   private int[] T000L15_A6930Lb_rclin ;
   private String[] T000L16_A396EmprCod ;
   private int[] T000L16_A6850Tex_NPed ;
   private String[] T000L17_A396EmprCod ;
   private int[] T000L17_A252CliCod ;
   private boolean[] T000L17_n252CliCod ;
   private short[] T000L17_A829TipArtCod ;
   private byte[] T000L17_A831TipColCod ;
   private byte[] T000L17_A583IntCod ;
   private String[] T000L17_A5098TipDisCod ;
   private short[] T000L17_A6603Est1_anyo ;
   private byte[] T000L17_A6604Est1_mes ;
   private byte[] T000L17_A6605Est1_dia ;
   private String[] T000L18_A396EmprCod ;
   private int[] T000L18_A6319C_Barcod ;
   private byte[] T000L18_A6320C_Barcodre ;
   private String[] T000L18_A6321C_Barcodpa ;
   private short[] T000L18_A6322C_Reclinma ;
   private String[] T000L19_A396EmprCod ;
   private int[] T000L19_A6235DevEmpCod ;
   private String[] T000L20_A396EmprCod ;
   private String[] T000L20_A602MaqCod ;
   private int[] T000L20_A6078MaqCliCod ;
   private String[] T000L20_A6079MaqArtCod ;
   private String[] T000L21_A396EmprCod ;
   private int[] T000L21_A5532Lb_numero ;
   private String[] T000L22_A396EmprCod ;
   private int[] T000L22_A252CliCod ;
   private boolean[] T000L22_n252CliCod ;
   private short[] T000L22_A5503CliifLin ;
   private String[] T000L23_A396EmprCod ;
   private int[] T000L23_A252CliCod ;
   private boolean[] T000L23_n252CliCod ;
   private short[] T000L23_A5499ClieiLin ;
   private String[] T000L24_A396EmprCod ;
   private int[] T000L24_A252CliCod ;
   private boolean[] T000L24_n252CliCod ;
   private short[] T000L24_A5495ClidtLin ;
   private String[] T000L25_A396EmprCod ;
   private int[] T000L25_A252CliCod ;
   private boolean[] T000L25_n252CliCod ;
   private short[] T000L25_A5491CliedLin ;
   private String[] T000L26_A396EmprCod ;
   private int[] T000L26_A252CliCod ;
   private boolean[] T000L26_n252CliCod ;
   private String[] T000L26_A5452P_ForCod ;
   private String[] T000L27_A396EmprCod ;
   private int[] T000L27_A252CliCod ;
   private boolean[] T000L27_n252CliCod ;
   private String[] T000L27_A5443Mdl_Cod ;
   private String[] T000L28_A396EmprCod ;
   private int[] T000L28_A252CliCod ;
   private boolean[] T000L28_n252CliCod ;
   private short[] T000L28_A5436IntCodF2 ;
   private String[] T000L29_A396EmprCod ;
   private int[] T000L29_A252CliCod ;
   private boolean[] T000L29_n252CliCod ;
   private byte[] T000L29_A5396IntCodFC ;
   private byte[] T000L29_A5434Tip_ColC ;
   private String[] T000L30_A396EmprCod ;
   private int[] T000L30_A252CliCod ;
   private boolean[] T000L30_n252CliCod ;
   private String[] T000L30_A5428FasPreCod ;
   private String[] T000L31_A396EmprCod ;
   private int[] T000L31_A252CliCod ;
   private boolean[] T000L31_n252CliCod ;
   private String[] T000L31_A5398Cli_Proc ;
   private String[] T000L32_A396EmprCod ;
   private int[] T000L32_A5130PagIden ;
   private String[] T000L33_A396EmprCod ;
   private int[] T000L33_A5059Hl_hdr ;
   private byte[] T000L33_A5060Hl_hdrr ;
   private String[] T000L33_A5061Hl_hdrp ;
   private String[] T000L34_A396EmprCod ;
   private int[] T000L34_A252CliCod ;
   private boolean[] T000L34_n252CliCod ;
   private String[] T000L34_A4718DishCod ;
   private byte[] T000L34_A5020TipEstCod ;
   private byte[] T000L34_A5022GraCod ;
   private String[] T000L35_A396EmprCod ;
   private int[] T000L35_A4618EnsLCod ;
   private String[] T000L36_A396EmprCod ;
   private int[] T000L36_A4492HreBarCod ;
   private byte[] T000L36_A4493HreBarReo ;
   private String[] T000L36_A4494HreBarPar ;
   private byte[] T000L36_A4495HreNumCie ;
   private String[] T000L37_A396EmprCod ;
   private int[] T000L37_A252CliCod ;
   private boolean[] T000L37_n252CliCod ;
   private String[] T000L37_A4415EstCol ;
   private String[] T000L38_A396EmprCod ;
   private String[] T000L38_A4185WEBUSU ;
   private String[] T000L39_A396EmprCod ;
   private int[] T000L39_A252CliCod ;
   private boolean[] T000L39_n252CliCod ;
   private String[] T000L39_A4079WEBDISCOD ;
   private String[] T000L39_A4078EMPCOD ;
   private String[] T000L40_A396EmprCod ;
   private int[] T000L40_A2637HisEstHRu ;
   private byte[] T000L40_A2636HisEstHRe ;
   private String[] T000L40_A2635HisEstHPa ;
   private byte[] T000L40_A2638HisEstLCo ;
   private String[] T000L40_A2630HisEstCom ;
   private String[] T000L40_A2634HisEstFon ;
   private String[] T000L41_A396EmprCod ;
   private int[] T000L41_A2574GrpDibCod ;
   private String[] T000L42_A396EmprCod ;
   private int[] T000L42_A2558GrmDibCod ;
   private String[] T000L43_A396EmprCod ;
   private int[] T000L43_A2542GrcDibCod ;
   private String[] T000L44_A396EmprCod ;
   private String[] T000L44_A1031EmpesCod ;
   private int[] T000L44_A252CliCod ;
   private boolean[] T000L44_n252CliCod ;
   private String[] T000L44_A1032FonCod ;
   private String[] T000L45_A396EmprCod ;
   private String[] T000L45_A1013DibCli ;
   private int[] T000L45_A252CliCod ;
   private boolean[] T000L45_n252CliCod ;
   private int[] T000L45_A1014DibInt ;
   private String[] T000L46_A396EmprCod ;
   private long[] T000L46_A1736AlbExtCod ;
   private String[] T000L47_A396EmprCod ;
   private int[] T000L47_A252CliCod ;
   private boolean[] T000L47_n252CliCod ;
   private short[] T000L47_A3661FacProAny ;
   private String[] T000L47_A3662FacProSer ;
   private byte[] T000L47_A3663FacProInt ;
   private byte[] T000L47_A3664FacProTip ;
   private short[] T000L47_A3665FacProTar ;
   private String[] T000L48_A396EmprCod ;
   private short[] T000L48_A3646EstTinAny ;
   private byte[] T000L48_A3647EstTinMes ;
   private byte[] T000L48_A3648EstTinDia ;
   private short[] T000L48_A1929EstTinNr ;
   private String[] T000L49_A396EmprCod ;
   private long[] T000L49_A3617AlbTrnCod ;
   private String[] T000L50_A396EmprCod ;
   private int[] T000L50_A252CliCod ;
   private boolean[] T000L50_n252CliCod ;
   private java.math.BigDecimal[] T000L50_A3320CliLimKgs ;
   private String[] T000L51_A396EmprCod ;
   private String[] T000L51_A3073RepCod ;
   private int[] T000L51_A252CliCod ;
   private boolean[] T000L51_n252CliCod ;
   private String[] T000L52_A396EmprCod ;
   private byte[] T000L52_A3061Codia ;
   private byte[] T000L52_A3062CoMes ;
   private short[] T000L52_A3063CoAny ;
   private byte[] T000L52_A3065CoLin ;
   private int[] T000L52_A3010CoBarCod ;
   private byte[] T000L52_A3011CoBarReo ;
   private String[] T000L52_A3012CoBarPar ;
   private String[] T000L53_A396EmprCod ;
   private int[] T000L53_A2971SabFacCod ;
   private String[] T000L54_A396EmprCod ;
   private byte[] T000L54_A2954TiDia ;
   private byte[] T000L54_A2955TiMes ;
   private short[] T000L54_A2956TiAny ;
   private byte[] T000L54_A2958TiLin ;
   private int[] T000L54_A2959TiBarCod ;
   private byte[] T000L54_A2960TiBarReo ;
   private String[] T000L54_A2961TiBarPar ;
   private String[] T000L55_A396EmprCod ;
   private int[] T000L55_A252CliCod ;
   private boolean[] T000L55_n252CliCod ;
   private short[] T000L55_A2933RecTipCon ;
   private String[] T000L56_A396EmprCod ;
   private int[] T000L56_A252CliCod ;
   private boolean[] T000L56_n252CliCod ;
   private String[] T000L56_A2927RecProCod ;
   private String[] T000L57_A396EmprCod ;
   private int[] T000L57_A252CliCod ;
   private boolean[] T000L57_n252CliCod ;
   private String[] T000L57_A2891HMaForSer ;
   private String[] T000L57_A2892HMaForCNom ;
   private int[] T000L57_A2893HMaForCNum ;
   private byte[] T000L57_A2894HMaTipCCod ;
   private int[] T000L57_A2895HMaForNumC ;
   private short[] T000L57_A2897HMaColLin ;
   private java.util.Date[] T000L57_A2896HMaFec ;
   private short[] T000L57_A2907HmaLin ;
   private String[] T000L58_A396EmprCod ;
   private int[] T000L58_A252CliCod ;
   private boolean[] T000L58_n252CliCod ;
   private short[] T000L58_A425EstAny ;
   private String[] T000L58_A2755EstSerFac ;
   private String[] T000L59_A396EmprCod ;
   private short[] T000L59_A2730RecTipCo ;
   private int[] T000L59_A252CliCod ;
   private boolean[] T000L59_n252CliCod ;
   private String[] T000L60_A396EmprCod ;
   private String[] T000L60_A2720TarSec ;
   private int[] T000L60_A252CliCod ;
   private boolean[] T000L60_n252CliCod ;
   private short[] T000L60_A829TipArtCod ;
   private byte[] T000L60_A831TipColCod ;
   private String[] T000L61_A396EmprCod ;
   private String[] T000L61_A2382AbcTerCod ;
   private String[] T000L61_A2381AbcSec ;
   private int[] T000L61_A252CliCod ;
   private boolean[] T000L61_n252CliCod ;
   private String[] T000L62_A396EmprCod ;
   private int[] T000L62_A252CliCod ;
   private boolean[] T000L62_n252CliCod ;
   private int[] T000L62_A2308CliDesCod ;
   private String[] T000L63_A396EmprCod ;
   private String[] T000L63_A2268MovParCod ;
   private int[] T000L63_A252CliCod ;
   private boolean[] T000L63_n252CliCod ;
   private String[] T000L64_A396EmprCod ;
   private String[] T000L64_A966PartCod ;
   private int[] T000L64_A252CliCod ;
   private boolean[] T000L64_n252CliCod ;
   private String[] T000L65_A396EmprCod ;
   private int[] T000L65_A1387AlbPrvCod ;
   private String[] T000L66_A396EmprCod ;
   private int[] T000L66_A252CliCod ;
   private boolean[] T000L66_n252CliCod ;
   private String[] T000L66_A1213TalCod ;
   private String[] T000L67_A396EmprCod ;
   private int[] T000L67_A252CliCod ;
   private boolean[] T000L67_n252CliCod ;
   private String[] T000L67_A457FasCod ;
   private String[] T000L68_A396EmprCod ;
   private int[] T000L68_A539HisBarCod ;
   private byte[] T000L68_A545HisCodReo ;
   private String[] T000L68_A544HisCodPar ;
   private short[] T000L68_A833TipDefCod ;
   private String[] T000L69_A396EmprCod ;
   private int[] T000L69_A506HbaBarCod ;
   private byte[] T000L69_A508HbaBarReo ;
   private String[] T000L69_A507HbaBarPar ;
   private String[] T000L70_A396EmprCod ;
   private int[] T000L70_A252CliCod ;
   private boolean[] T000L70_n252CliCod ;
   private String[] T000L70_A494ForSer ;
   private String[] T000L70_A482ForColNom ;
   private int[] T000L70_A483ForColNum ;
   private byte[] T000L70_A831TipColCod ;
   private String[] T000L71_A396EmprCod ;
   private int[] T000L71_A252CliCod ;
   private boolean[] T000L71_n252CliCod ;
   private byte[] T000L71_A287CliPagLin ;
   private String[] T000L72_A396EmprCod ;
   private int[] T000L72_A252CliCod ;
   private boolean[] T000L72_n252CliCod ;
   private byte[] T000L72_A266CliEnvLin ;
   private String[] T000L73_A396EmprCod ;
   private int[] T000L73_A252CliCod ;
   private boolean[] T000L73_n252CliCod ;
   private String[] T000L73_A65ArtCod ;
   private String[] T000L74_A396EmprCod ;
   private int[] T000L74_A44AlbRecCod ;
   private String[] T000L75_A396EmprCod ;
   private long[] T000L75_A30AlbProCod ;
   private String[] T000L76_A396EmprCod ;
   private int[] T000L76_A14AlbComCod ;
   private String[] T000L77_A396EmprCod ;
   private int[] T000L77_A252CliCod ;
   private boolean[] T000L77_n252CliCod ;
   private int[] T000L78_A252CliCod ;
   private boolean[] T000L78_n252CliCod ;
   private String[] T000L78_A297CliPri ;
   private java.math.BigDecimal[] T000L78_A6630CliDto ;
   private String[] T000L78_A6865CliRetF ;
   private String[] T000L78_A6866CliRetIca ;
   private String[] T000L78_A6867CliGranCon ;
   private String[] T000L78_A8350CliRetI ;
   private byte[] T000L78_A280CliNroVto ;
   private String[] T000L78_A296CliPrd ;
   private String[] T000L78_A259CliDiaPag ;
   private java.math.BigDecimal[] T000L78_A261CliDtoGrl ;
   private java.math.BigDecimal[] T000L78_A262CliDtoPpg ;
   private String[] T000L78_A299CliRegIVA ;
   private java.math.BigDecimal[] T000L78_A14421Clipor1 ;
   private short[] T000L78_A14422Clipor2 ;
   private String[] T000L78_A396EmprCod ;
   private String[] T000L78_A497FpgCod ;
   private String[] T000L4_A396EmprCod ;
   private String[] T000L79_A396EmprCod ;
   private String[] T000L80_A396EmprCod ;
   private int[] T000L80_A252CliCod ;
   private boolean[] T000L80_n252CliCod ;
   private String[] T000L80_A297CliPri ;
   private int[] T000L3_A252CliCod ;
   private boolean[] T000L3_n252CliCod ;
   private String[] T000L3_A297CliPri ;
   private java.math.BigDecimal[] T000L3_A6630CliDto ;
   private String[] T000L3_A6865CliRetF ;
   private String[] T000L3_A6866CliRetIca ;
   private String[] T000L3_A6867CliGranCon ;
   private String[] T000L3_A8350CliRetI ;
   private byte[] T000L3_A280CliNroVto ;
   private String[] T000L3_A296CliPrd ;
   private String[] T000L3_A259CliDiaPag ;
   private java.math.BigDecimal[] T000L3_A261CliDtoGrl ;
   private java.math.BigDecimal[] T000L3_A262CliDtoPpg ;
   private String[] T000L3_A299CliRegIVA ;
   private java.math.BigDecimal[] T000L3_A14421Clipor1 ;
   private short[] T000L3_A14422Clipor2 ;
   private String[] T000L3_A396EmprCod ;
   private String[] T000L3_A497FpgCod ;
   private int[] T000L2_A252CliCod ;
   private boolean[] T000L2_n252CliCod ;
   private String[] T000L2_A297CliPri ;
   private java.math.BigDecimal[] T000L2_A6630CliDto ;
   private String[] T000L2_A6865CliRetF ;
   private String[] T000L2_A6866CliRetIca ;
   private String[] T000L2_A6867CliGranCon ;
   private String[] T000L2_A8350CliRetI ;
   private byte[] T000L2_A280CliNroVto ;
   private String[] T000L2_A296CliPrd ;
   private String[] T000L2_A259CliDiaPag ;
   private java.math.BigDecimal[] T000L2_A261CliDtoGrl ;
   private java.math.BigDecimal[] T000L2_A262CliDtoPpg ;
   private String[] T000L2_A299CliRegIVA ;
   private java.math.BigDecimal[] T000L2_A14421Clipor1 ;
   private short[] T000L2_A14422Clipor2 ;
   private String[] T000L2_A396EmprCod ;
   private String[] T000L2_A497FpgCod ;
   private String[] T000L84_A396EmprCod ;
   private int[] T000L84_A252CliCod ;
   private boolean[] T000L84_n252CliCod ;
   private String[] T000L84_A297CliPri ;
   private String[] T000L85_A396EmprCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46FpgCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV40WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV41TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV47DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9[] ;
}

final  class tclifpg__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclifpg__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclifpg__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclifpg__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tclifpg__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000L2", "SELECT CliCod, CliPri, CliDto, CliRetF, CliRetIca, CliGranCon, CliRetI, CliNroVto, CliPrd, CliDiaPag, CliDtoGrl, CliDtoPpg, CliRegIVA, Clipor1, Clipor2, EmprCod, FpgCod FROM TXPCLIFPG WHERE EmprCod = ? AND CliCod = ? AND CliPri = ?  FOR UPDATE OF CliDto, CliRetF, CliRetIca, CliGranCon, CliRetI, CliNroVto, CliPrd, CliDiaPag, CliDtoGrl, CliDtoPpg, CliRegIVA, Clipor1, Clipor2, FpgCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L3", "SELECT CliCod, CliPri, CliDto, CliRetF, CliRetIca, CliGranCon, CliRetI, CliNroVto, CliPrd, CliDiaPag, CliDtoGrl, CliDtoPpg, CliRegIVA, Clipor1, Clipor2, EmprCod, FpgCod FROM TXPCLIFPG WHERE EmprCod = ? AND CliCod = ? AND CliPri = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L4", "SELECT EmprCod FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L5", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ?  FOR UPDATE OF CliNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L6", "SELECT CliCod, CliNom, EmprCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L8", "SELECT /*+ FIRST_ROWS(100) */ TM1.CliCod, T2.EmprNom, TM1.CliNom, TM1.EmprCod FROM (TXPCLIENT TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? ORDER BY TM1.EmprCod, TM1.CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod > ?) and EmprCod = ? ORDER BY EmprCod, CliCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod FROM TXPCLIENT WHERE ( CliCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, CliCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000L12", "INSERT INTO TXPCLIENT(CliCod, CliNom, EmprCod, CliNif, CliDom, CliPob, CliCp, PrvCod, CliTel1, CliTel2, CliTelex, CliFax, CliIniVac, CliFinVac, CliDes, CliEti, CliUrg, CliPer, CliRef, CliCue, CliRieCon, CliRieCir, CliRieMh, CliFecMh, CliCanRie, CliPerFac, CliAlbAgr, CliFacCop, ZonGeoCod, CliPagUli, CliTub, CliCtrl, CliValA, CliImpMin, CliAlias, CliEtiCC, CliEtiCN, CliEtiEN, CliNEti, CliObs1, CliObs2, CliDivTra, CliDivCod, CliNumEtSa, CliNumEtTi, CliObs, CliPort, CliTrnCod, CliCopAlb, CliEmail, CliNom1, CliCp2, CliTBon, CliedUl, ClidtUl, ClieiUl, CliifUl, CliTipo, CliDom2, FasExpUtl, CliIe, CliPreAlq, Lb_Linurc, CliUltMq, PMDProUlt, PMDPreLim, PMDPreMin, PMDLinUlt, CliEst, CliP1, CliP0, CliEFx, CliEEm, CliNumC, Com_ult, CliAct, CliEt1, CliEt2, CliEt3, CliEt4, Cliemf, CliKgsMn, CliUltlk, CliObsF, CliEvLast, CliEnvUli, Cod_pais, CliCEE, TpOpC, TxtObs, CodWebId, CliMailGr, CliMailPk, CliMailGrE, CliMailPkE, CliPlanUL, Lb_Linu, CliUltl, ClimailPr, CliPerPr, CliUltNPz, SEGId, CliImpMerm, CliImpReop, CliFacMtsP, CliColAb, CliValFijo, CliFactor, CliFacFm, CliFacFmt, ClimailAlb, ClimailFac, stMeivaId, CliEnergia, CliTop25, CliForfra, CliImpMnEs, CliNac) VALUES(?, ?, ?, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', 0, 0, 0, 0, ' ', ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, ' ', ' ', 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T000L13", "UPDATE TXPCLIENT SET CliNom=?  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new UpdateCursor("T000L14", "DELETE FROM TXPCLIENT  WHERE EmprCod = ? AND CliCod = ?", GX_NOMASK, "TXPCLIENT")
         ,new ForEachCursor("T000L15", "SELECT * FROM (SELECT EmprCod, CliCod, Lb_rclin FROM TXPREGCOR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L16", "SELECT * FROM (SELECT EmprCod, Tex_NPed FROM TXPTEX000 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L17", "SELECT * FROM (SELECT EmprCod, CliCod, TipArtCod, TipColCod, IntCod, TipDisCod, Est1_anyo, Est1_mes, Est1_dia FROM TXPCLTATC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L18", "SELECT * FROM (SELECT EmprCod, C_Barcod, C_Barcodre, C_Barcodpa, C_Reclinma FROM TXPRECMA1 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L19", "SELECT * FROM (SELECT EmprCod, DevEmpCod FROM TXPDEVEMP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L20", "SELECT * FROM (SELECT EmprCod, MaqCod, MaqCliCod, MaqArtCod FROM TXPConPes WHERE EmprCod = ? AND MaqCliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L21", "SELECT * FROM (SELECT EmprCod, Lb_numero FROM TXPENS001 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L22", "SELECT * FROM (SELECT EmprCod, CliCod, CliifLin FROM TXPCLIINF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L23", "SELECT * FROM (SELECT EmprCod, CliCod, ClieiLin FROM TXPCLIINE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L24", "SELECT * FROM (SELECT EmprCod, CliCod, ClidtLin FROM TXPCLIDTF WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L25", "SELECT * FROM (SELECT EmprCod, CliCod, CliedLin FROM TXPCLIDTE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L26", "SELECT * FROM (SELECT EmprCod, CliCod, P_ForCod FROM TXPPREQL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L27", "SELECT * FROM (SELECT EmprCod, CliCod, Mdl_Cod FROM TXPCLIMOD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L28", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodF2 FROM TXPCLIIN2 WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L29", "SELECT * FROM (SELECT EmprCod, CliCod, IntCodFC, Tip_ColC FROM TXPCLIINT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L30", "SELECT * FROM (SELECT EmprCod, CliCod, FasPreCod FROM TXPPREFSP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L31", "SELECT * FROM (SELECT EmprCod, CliCod, Cli_Proc FROM TXPCLIPRL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L32", "SELECT * FROM (SELECT EmprCod, PagIden FROM TXPPAGCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L33", "SELECT * FROM (SELECT EmprCod, Hl_hdr, Hl_hdrr, Hl_hdrp FROM TXPHLREOP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L34", "SELECT * FROM (SELECT EmprCod, CliCod, DishCod, TipEstCod, GraCod FROM TXPESTPRE WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L35", "SELECT * FROM (SELECT EmprCod, EnsLCod FROM TXPENSLAV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L36", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie FROM TXPHISREH WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L37", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol FROM TXPCEstCo WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L38", "SELECT * FROM (SELECT EMPRCOD, WEBUSU FROM TXPWEBUSU WHERE EMPRCOD = ? AND CLICOD = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L39", "SELECT * FROM (SELECT EmprCod, CliCod, WEBDISCOD, EMPCOD FROM TXPWeDiEm WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L40", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon FROM TXPCHISES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L41", "SELECT * FROM (SELECT EmprCod, GrpDibCod FROM TXPCGRPEQ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L42", "SELECT * FROM (SELECT EmprCod, GrmDibCod FROM TXPCGRMOL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L43", "SELECT * FROM (SELECT EmprCod, GrcDibCod FROM TXPCGRCIL WHERE EmprCod = ? AND CliCodC = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L44", "SELECT * FROM (SELECT EmprCod, EmpesCod, CliCod, FonCod FROM TXPCEMPES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L45", "SELECT * FROM (SELECT EmprCod, DibCli, CliCod, DibInt FROM TXPCDIBUJ WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L46", "SELECT * FROM (SELECT EmprCod, AlbExtCod FROM TXPCALEXT WHERE EmprAlbExt = ? AND AlbExtCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L47", "SELECT * FROM (SELECT EmprCod, CliCod, FacProAny, FacProSer, FacProInt, FacProTip, FacProTar FROM TXPFACPRO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L48", "SELECT * FROM (SELECT EmprCod, EstTinAny, EstTinMes, EstTinDia, EstTinNr FROM TXPLCONTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L49", "SELECT * FROM (SELECT EmprCod, AlbTrnCod FROM TXPALBTRA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L50", "SELECT * FROM (SELECT EmprCod, CliCod, CliLimKgs FROM TXPPREKIL WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L51", "SELECT * FROM (SELECT EmprCod, RepCod, CliCod FROM TXPCOMREP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L52", "SELECT * FROM (SELECT EmprCod, Codia, CoMes, CoAny, CoLin, CoBarCod, CoBarReo, CoBarPar FROM TXPLCOSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L53", "SELECT * FROM (SELECT EmprCod, SabFacCod FROM TXPCFACSA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L54", "SELECT * FROM (SELECT EmprCod, TiDia, TiMes, TiAny, TiLin, TiBarCod, TiBarReo, TiBarPar FROM TXPLKGSTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L55", "SELECT * FROM (SELECT EmprCod, CliCod, RecTipCon FROM TXPCRECON WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L56", "SELECT * FROM (SELECT EmprCod, CliCod, RecProCod FROM TXPCCLIPR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L57", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L58", "SELECT * FROM (SELECT EmprCod, CliCod, EstAny, EstSerFac FROM TXPCESCLI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L59", "SELECT * FROM (SELECT EmprCod, RecTipCo, CliCod FROM TXPCRECLT WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L60", "SELECT * FROM (SELECT EmprCod, TarSec, CliCod, TipArtCod, TipColCod FROM TXPCTARCO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L61", "SELECT * FROM (SELECT EmprCod, AbcTerCod, AbcSec, CliCod FROM TXPABCEXP WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L62", "SELECT * FROM (SELECT EmprCod, CliCod, CliDesCod FROM TXPCLIDES WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L63", "SELECT * FROM (SELECT EmprCod, MovParCod, CliCod FROM TXPCMOVPD WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L64", "SELECT * FROM (SELECT EmprCod, PartCod, CliCod FROM TXPCPARTI WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L65", "SELECT * FROM (SELECT EmprCod, AlbPrvCod FROM TXPCALBPV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L66", "SELECT * FROM (SELECT EmprCod, CliCod, TalCod FROM TXPCENTMA WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L67", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L68", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L69", "SELECT * FROM (SELECT EmprCod, HbaBarCod, HbaBarReo, HbaBarPar FROM TXPHISBAR WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L70", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L71", "SELECT * FROM (SELECT EmprCod, CliCod, CliPagLin FROM TXPCLIPAG WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L72", "SELECT * FROM (SELECT EmprCod, CliCod, CliEnvLin FROM TXPCLIENV WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L73", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod FROM TXPARTICU WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L74", "SELECT * FROM (SELECT EmprCod, AlbRecCod FROM TXPALBREC WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L75", "SELECT * FROM (SELECT EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprGuiRem = ? AND GuiRemCli = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L76", "SELECT * FROM (SELECT EmprCod, AlbComCod FROM TXPCALCOM WHERE EmprCod = ? AND CliCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000L77", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod FROM TXPCLIENT WHERE EmprCod = ? ORDER BY EmprCod, CliCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L78", "SELECT CliCod, CliPri, CliDto, CliRetF, CliRetIca, CliGranCon, CliRetI, CliNroVto, CliPrd, CliDiaPag, CliDtoGrl, CliDtoPpg, CliRegIVA, Clipor1, Clipor2, EmprCod, FpgCod FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? and CliPri = ? ORDER BY EmprCod, CliCod, CliPri ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L79", "SELECT EmprCod FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L80", "SELECT EmprCod, CliCod, CliPri FROM TXPCLIFPG WHERE EmprCod = ? AND CliCod = ? AND CliPri = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000L81", "INSERT INTO TXPCLIFPG(CliCod, CliPri, CliDto, CliRetF, CliRetIca, CliGranCon, CliRetI, CliNroVto, CliPrd, CliDiaPag, CliDtoGrl, CliDtoPpg, CliRegIVA, Clipor1, Clipor2, EmprCod, FpgCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCLIFPG")
         ,new UpdateCursor("T000L82", "UPDATE TXPCLIFPG SET CliDto=?, CliRetF=?, CliRetIca=?, CliGranCon=?, CliRetI=?, CliNroVto=?, CliPrd=?, CliDiaPag=?, CliDtoGrl=?, CliDtoPpg=?, CliRegIVA=?, Clipor1=?, Clipor2=?, FpgCod=?  WHERE EmprCod = ? AND CliCod = ? AND CliPri = ?", GX_NOMASK, "TXPCLIFPG")
         ,new UpdateCursor("T000L83", "DELETE FROM TXPCLIFPG  WHERE EmprCod = ? AND CliCod = ? AND CliPri = ?", GX_NOMASK, "TXPCLIFPG")
         ,new ForEachCursor("T000L84", "SELECT EmprCod, CliCod, CliPri FROM TXPCLIFPG WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod, CliPri ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000L85", "SELECT EmprCod FROM TXPFORPAG WHERE EmprCod = ? AND FpgCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((String[]) buf[16])[0] = rslt.getString(17, 2);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((String[]) buf[16])[0] = rslt.getString(17, 2);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 76 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 5);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
               ((short[]) buf[14])[0] = rslt.getShort(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 3);
               ((String[]) buf[16])[0] = rslt.getString(17, 2);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               return;
            case 83 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               stmt.setString(3, (String)parms[3], 1);
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
               stmt.setString(3, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
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
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setString(3, (String)parms[3], 1);
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
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
               stmt.setString(3, (String)parms[3], 1);
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
               stmt.setString(2, (String)parms[2], 1);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 2);
               stmt.setString(4, (String)parms[4], 1);
               stmt.setString(5, (String)parms[5], 1);
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 1);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               stmt.setString(9, (String)parms[9], 5);
               stmt.setString(10, (String)parms[10], 6);
               stmt.setBigDecimal(11, (java.math.BigDecimal)parms[11], 2);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[12], 2);
               stmt.setString(13, (String)parms[13], 1);
               stmt.setBigDecimal(14, (java.math.BigDecimal)parms[14], 2);
               stmt.setShort(15, ((Number) parms[15]).shortValue());
               stmt.setString(16, (String)parms[16], 3);
               stmt.setString(17, (String)parms[17], 2);
               return;
            case 80 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 2);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setString(7, (String)parms[6], 5);
               stmt.setString(8, (String)parms[7], 6);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[9], 2);
               stmt.setString(11, (String)parms[10], 1);
               stmt.setBigDecimal(12, (java.math.BigDecimal)parms[11], 2);
               stmt.setShort(13, ((Number) parms[12]).shortValue());
               stmt.setString(14, (String)parms[13], 2);
               stmt.setString(15, (String)parms[14], 3);
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(16, ((Number) parms[16]).intValue());
               }
               stmt.setString(17, (String)parms[17], 1);
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
               stmt.setString(3, (String)parms[3], 1);
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
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 2);
               return;
      }
   }

}

