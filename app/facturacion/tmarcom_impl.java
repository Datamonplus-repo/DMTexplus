package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmarcom_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A4364GrdTipArt) ;
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
            AV41EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
            AV42Mgen_com = httpContext.GetPar( "Mgen_com") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42Mgen_com", AV42Mgen_com);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMGEN_COM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42Mgen_com, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Margem Comercialiçao", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = cmbMgen_com.getInternalname() ;
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
      edtGrdTipArt_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Horizontalalignment", edtGrdTipArt_Horizontalalignment, !bGXsfl_28_Refreshing);
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

   public tmarcom_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmarcom_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmarcom_impl.class ));
   }

   public tmarcom_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMgen_com = new HTMLChoice();
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
      if ( cmbMgen_com.getItemCount() > 0 )
      {
         A5654Mgen_com = cmbMgen_com.getValidValue(A5654Mgen_com) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMgen_com.setValue( GXutil.rtrim( A5654Mgen_com) );
         httpContext.ajax_rsp_assign_prop("", false, cmbMgen_com.getInternalname(), "Values", cmbMgen_com.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbMgen_com.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbMgen_com.getInternalname(), httpContext.getMessage( "Margem Comercialiçao", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbMgen_com, cmbMgen_com.getInternalname(), GXutil.rtrim( A5654Mgen_com), 1, cmbMgen_com.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbMgen_com.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "", true, (byte)(0), "HLP_Facturacion\\TMARCOM.htm");
      cmbMgen_com.setValue( GXutil.rtrim( A5654Mgen_com) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMgen_com.getInternalname(), "Values", cmbMgen_com.ToJavascriptSource(), true);
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TMARCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TMARCOM.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TMARCOM.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV48Pgmname), GXutil.rtrim( localUtil.format( AV48Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TMARCOM.htm");
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
      ucCombo_grdtipart.setProperty("Caption", Combo_grdtipart_Caption);
      ucCombo_grdtipart.setProperty("Cls", Combo_grdtipart_Cls);
      ucCombo_grdtipart.setProperty("IsGridItem", Combo_grdtipart_Isgriditem);
      ucCombo_grdtipart.setProperty("EmptyItem", Combo_grdtipart_Emptyitem);
      ucCombo_grdtipart.setProperty("DropDownOptionsData", AV46GrdTipArt_Data);
      ucCombo_grdtipart.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_grdtipart_Internalname, "COMBO_GRDTIPARTContainer");
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
         nBlankRcdCount835 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_835 = (short)(1) ;
            scanStartRD835( ) ;
            while ( RcdFound835 != 0 )
            {
               init_level_properties835( ) ;
               getByPrimaryKeyRD835( ) ;
               addRowRD835( ) ;
               scanNextRD835( ) ;
            }
            scanEndRD835( ) ;
            nBlankRcdCount835 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModalRD835( ) ;
         standaloneModalRD835( ) ;
         sMode835 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRowRD835( ) ;
            edtGrdTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRDTIPART_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtGrdTipArt_Horizontalalignment = httpContext.cgiGet( "GRDTIPART_"+sGXsfl_28_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Horizontalalignment", edtGrdTipArt_Horizontalalignment, !bGXsfl_28_Refreshing);
            edtMgen_val_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MGEN_VAL_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMgen_val_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMgen_val_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            if ( ( nRcdExists_835 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalRD835( ) ;
            }
            sendRowRD835( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode835 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount835 = (short)(5) ;
         nRcdExists_835 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartRD835( ) ;
            while ( RcdFound835 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_28835( ) ;
               init_level_properties835( ) ;
               standaloneNotModalRD835( ) ;
               getByPrimaryKeyRD835( ) ;
               standaloneModalRD835( ) ;
               addRowRD835( ) ;
               scanNextRD835( ) ;
            }
            scanEndRD835( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode835 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_28835( ) ;
         initAllRD835( ) ;
         init_level_properties835( ) ;
         nRcdExists_835 = (short)(0) ;
         nIsMod_835 = (short)(0) ;
         nRcdDeleted_835 = (short)(0) ;
         nBlankRcdCount835 = (short)(nBlankRcdUsr835+nBlankRcdCount835) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount835 > 0 )
         {
            standaloneNotModalRD835( ) ;
            standaloneModalRD835( ) ;
            addRowRD835( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtGrdTipArt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount835 = (short)(nBlankRcdCount835-1) ;
         }
         Gx_mode = sMode835 ;
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
      e11RD2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGRDTIPART_DATA"), AV46GrdTipArt_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z5654Mgen_com = httpContext.cgiGet( "Z5654Mgen_com") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV41EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV42Mgen_com = httpContext.cgiGet( "vMGEN_COM") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A4368GrdTipDsc = httpContext.cgiGet( "GRDTIPDSC") ;
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
            Combo_grdtipart_Objectcall = httpContext.cgiGet( "COMBO_GRDTIPART_Objectcall") ;
            Combo_grdtipart_Class = httpContext.cgiGet( "COMBO_GRDTIPART_Class") ;
            Combo_grdtipart_Icontype = httpContext.cgiGet( "COMBO_GRDTIPART_Icontype") ;
            Combo_grdtipart_Icon = httpContext.cgiGet( "COMBO_GRDTIPART_Icon") ;
            Combo_grdtipart_Caption = httpContext.cgiGet( "COMBO_GRDTIPART_Caption") ;
            Combo_grdtipart_Tooltip = httpContext.cgiGet( "COMBO_GRDTIPART_Tooltip") ;
            Combo_grdtipart_Cls = httpContext.cgiGet( "COMBO_GRDTIPART_Cls") ;
            Combo_grdtipart_Selectedvalue_set = httpContext.cgiGet( "COMBO_GRDTIPART_Selectedvalue_set") ;
            Combo_grdtipart_Selectedvalue_get = httpContext.cgiGet( "COMBO_GRDTIPART_Selectedvalue_get") ;
            Combo_grdtipart_Selectedtext_set = httpContext.cgiGet( "COMBO_GRDTIPART_Selectedtext_set") ;
            Combo_grdtipart_Selectedtext_get = httpContext.cgiGet( "COMBO_GRDTIPART_Selectedtext_get") ;
            Combo_grdtipart_Gamoauthtoken = httpContext.cgiGet( "COMBO_GRDTIPART_Gamoauthtoken") ;
            Combo_grdtipart_Ddointernalname = httpContext.cgiGet( "COMBO_GRDTIPART_Ddointernalname") ;
            Combo_grdtipart_Titlecontrolalign = httpContext.cgiGet( "COMBO_GRDTIPART_Titlecontrolalign") ;
            Combo_grdtipart_Dropdownoptionstype = httpContext.cgiGet( "COMBO_GRDTIPART_Dropdownoptionstype") ;
            Combo_grdtipart_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Enabled")) ;
            Combo_grdtipart_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Visible")) ;
            Combo_grdtipart_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_GRDTIPART_Titlecontrolidtoreplace") ;
            Combo_grdtipart_Datalisttype = httpContext.cgiGet( "COMBO_GRDTIPART_Datalisttype") ;
            Combo_grdtipart_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Allowmultipleselection")) ;
            Combo_grdtipart_Datalistfixedvalues = httpContext.cgiGet( "COMBO_GRDTIPART_Datalistfixedvalues") ;
            Combo_grdtipart_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Isgriditem")) ;
            Combo_grdtipart_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Hasdescription")) ;
            Combo_grdtipart_Datalistproc = httpContext.cgiGet( "COMBO_GRDTIPART_Datalistproc") ;
            Combo_grdtipart_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_GRDTIPART_Datalistprocparametersprefix") ;
            Combo_grdtipart_Remoteservicesparameters = httpContext.cgiGet( "COMBO_GRDTIPART_Remoteservicesparameters") ;
            Combo_grdtipart_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_GRDTIPART_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_grdtipart_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Includeonlyselectedoption")) ;
            Combo_grdtipart_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Includeselectalloption")) ;
            Combo_grdtipart_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Emptyitem")) ;
            Combo_grdtipart_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_GRDTIPART_Includeaddnewoption")) ;
            Combo_grdtipart_Htmltemplate = httpContext.cgiGet( "COMBO_GRDTIPART_Htmltemplate") ;
            Combo_grdtipart_Multiplevaluestype = httpContext.cgiGet( "COMBO_GRDTIPART_Multiplevaluestype") ;
            Combo_grdtipart_Loadingdata = httpContext.cgiGet( "COMBO_GRDTIPART_Loadingdata") ;
            Combo_grdtipart_Noresultsfound = httpContext.cgiGet( "COMBO_GRDTIPART_Noresultsfound") ;
            Combo_grdtipart_Emptyitemtext = httpContext.cgiGet( "COMBO_GRDTIPART_Emptyitemtext") ;
            Combo_grdtipart_Onlyselectedvalues = httpContext.cgiGet( "COMBO_GRDTIPART_Onlyselectedvalues") ;
            Combo_grdtipart_Selectalltext = httpContext.cgiGet( "COMBO_GRDTIPART_Selectalltext") ;
            Combo_grdtipart_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_GRDTIPART_Multiplevaluesseparator") ;
            Combo_grdtipart_Addnewoptiontext = httpContext.cgiGet( "COMBO_GRDTIPART_Addnewoptiontext") ;
            /* Read variables values. */
            cmbMgen_com.setName( cmbMgen_com.getInternalname() );
            cmbMgen_com.setValue( httpContext.cgiGet( cmbMgen_com.getInternalname()) );
            A5654Mgen_com = httpContext.cgiGet( cmbMgen_com.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
            AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMARCOM");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A5654Mgen_com, Z5654Mgen_com) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\tmarcom:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A5654Mgen_com = httpContext.GetPar( "Mgen_com") ;
               httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
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
                  sMode834 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode834 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound834 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_RD0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MGEN_COM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = cmbMgen_com.getInternalname() ;
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
                        e11RD2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12RD2 ();
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
         e12RD2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllRD834( ) ;
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
         disableAttributesRD834( ) ;
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

   public void confirm_RD0( )
   {
      beforeValidateRD834( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsRD834( ) ;
         }
         else
         {
            checkExtendedTableRD834( ) ;
            closeExtendedTableCursorsRD834( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode834 = Gx_mode ;
         confirm_RD835( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode834 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode834 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_RD835( )
   {
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRowRD835( ) ;
         if ( ( nRcdExists_835 != 0 ) || ( nIsMod_835 != 0 ) )
         {
            getKeyRD835( ) ;
            if ( ( nRcdExists_835 == 0 ) && ( nRcdDeleted_835 == 0 ) )
            {
               if ( RcdFound835 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateRD835( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableRD835( ) ;
                     closeExtendedTableCursorsRD835( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "GRDTIPART_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGrdTipArt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound835 != 0 )
               {
                  if ( nRcdDeleted_835 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyRD835( ) ;
                     loadRD835( ) ;
                     beforeValidateRD835( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsRD835( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_835 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateRD835( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableRD835( ) ;
                           closeExtendedTableCursorsRD835( ) ;
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
                  if ( nRcdDeleted_835 == 0 )
                  {
                     GXCCtl = "GRDTIPART_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrdTipArt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtGrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMgen_val_Internalname, GXutil.ltrim( localUtil.ntoc( A5655Mgen_val, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4364GrdTipArt_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5655Mgen_val_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z5655Mgen_val, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_835_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_835_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_835_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_835 != 0 )
         {
            httpContext.changePostValue( "GRDTIPART_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrdTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRDTIPART_"+sGXsfl_28_idx+"Horizontalalignment", GXutil.rtrim( edtGrdTipArt_Horizontalalignment)) ;
            httpContext.changePostValue( "MGEN_VAL_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMgen_val_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionRD0( )
   {
   }

   public void e11RD2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmarcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV41EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmarcom_impl.this.AV41EmprCod = GXv_char2[0] ;
      tmarcom_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmarcom_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmarcom_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV41EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmarcom_impl.this.AV41EmprCod = GXv_char4[0] ;
      tmarcom_impl.this.AV16EmprNom = GXv_char3[0] ;
      tmarcom_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV43WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV43WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_grdtipart_Titlecontrolidtoreplace = edtGrdTipArt_Internalname ;
      ucCombo_grdtipart.sendProperty(context, "", false, Combo_grdtipart_Internalname, "TitleControlIdToReplace", Combo_grdtipart_Titlecontrolidtoreplace);
      edtGrdTipArt_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Horizontalalignment", edtGrdTipArt_Horizontalalignment, !bGXsfl_28_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOGRDTIPART' */
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
      AV44TrnContext.fromxml(AV45WebSession.getValue("TrnContext"), null, null);
   }

   public void e12RD2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV44TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.facturacion.tmarcomww", new String[] {}, new String[] {}) );
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
      /* 'LOADCOMBOGRDTIPART' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV46GrdTipArt_Data ;
      GXv_char4[0] = AV47ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.facturacion.tmarcomloaddvcombo(remoteHandle, context).execute( "GrdTipArt", Gx_mode, AV41EmprCod, AV42Mgen_com, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tmarcom_impl.this.AV47ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV46GrdTipArt_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zmRD834( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -7 )
      {
         Z5654Mgen_com = A5654Mgen_com ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV48Pgmname = "Facturacion.TMARCOM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV41EmprCod)==0) )
      {
         A396EmprCod = AV41EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00RD7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00RD7_A407EmprNom[0] ;
      n407EmprNom = T00RD7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV42Mgen_com)==0) )
      {
         A5654Mgen_com = AV42Mgen_com ;
         httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
      }
      if ( ! (GXutil.strcmp("", AV42Mgen_com)==0) )
      {
         cmbMgen_com.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbMgen_com.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMgen_com.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbMgen_com.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbMgen_com.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMgen_com.getEnabled(), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV42Mgen_com)==0) )
      {
         cmbMgen_com.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbMgen_com.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMgen_com.getEnabled(), 5, 0), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void loadRD834( )
   {
      /* Using cursor T00RD8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A5654Mgen_com});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound834 = (short)(1) ;
         A407EmprNom = T00RD8_A407EmprNom[0] ;
         n407EmprNom = T00RD8_n407EmprNom[0] ;
         zmRD834( -7) ;
      }
      pr_default.close(6);
      onLoadActionsRD834( ) ;
   }

   public void onLoadActionsRD834( )
   {
   }

   public void checkExtendedTableRD834( )
   {
      nIsDirty_834 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ( GXutil.strcmp(A5654Mgen_com, "I") != 0 ) && ( GXutil.strcmp(A5654Mgen_com, "E") != 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Solo esta permitido I=Interna, E=Externa", ""), 1, "MGEN_COM");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMgen_com.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursorsRD834( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyRD834( )
   {
      /* Using cursor T00RD9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A5654Mgen_com});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound834 = (short)(1) ;
      }
      else
      {
         RcdFound834 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00RD6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A5654Mgen_com});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zmRD834( 7) ;
         RcdFound834 = (short)(1) ;
         A5654Mgen_com = T00RD6_A5654Mgen_com[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
         A396EmprCod = T00RD6_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5654Mgen_com = A5654Mgen_com ;
         sMode834 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadRD834( ) ;
         if ( AnyError == 1 )
         {
            RcdFound834 = (short)(0) ;
            initializeNonKeyRD834( ) ;
         }
         Gx_mode = sMode834 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound834 = (short)(0) ;
         initializeNonKeyRD834( ) ;
         sMode834 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode834 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKeyRD834( ) ;
      if ( RcdFound834 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound834 = (short)(0) ;
      /* Using cursor T00RD10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A5654Mgen_com});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00RD10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RD10_A5654Mgen_com[0], A5654Mgen_com) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00RD10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00RD10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RD10_A5654Mgen_com[0], A5654Mgen_com) > 0 ) ) )
         {
            A396EmprCod = T00RD10_A396EmprCod[0] ;
            A5654Mgen_com = T00RD10_A5654Mgen_com[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
            RcdFound834 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound834 = (short)(0) ;
      /* Using cursor T00RD11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A5654Mgen_com});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00RD11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RD11_A5654Mgen_com[0], A5654Mgen_com) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T00RD11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00RD11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T00RD11_A5654Mgen_com[0], A5654Mgen_com) < 0 ) ) )
         {
            A396EmprCod = T00RD11_A396EmprCod[0] ;
            A5654Mgen_com = T00RD11_A5654Mgen_com[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
            RcdFound834 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyRD834( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = cmbMgen_com.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertRD834( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound834 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5654Mgen_com, Z5654Mgen_com) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A5654Mgen_com = Z5654Mgen_com ;
               httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MGEN_COM");
               AnyError = (short)(1) ;
               GX_FocusControl = cmbMgen_com.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = cmbMgen_com.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateRD834( ) ;
               GX_FocusControl = cmbMgen_com.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5654Mgen_com, Z5654Mgen_com) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = cmbMgen_com.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertRD834( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MGEN_COM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = cmbMgen_com.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = cmbMgen_com.getInternalname() ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertRD834( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A5654Mgen_com, Z5654Mgen_com) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A5654Mgen_com = Z5654Mgen_com ;
         httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MGEN_COM");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbMgen_com.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = cmbMgen_com.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyRD834( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00RD5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A5654Mgen_com});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMARCOM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMARCOM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertRD834( )
   {
      beforeValidateRD834( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRD834( ) ;
      }
      if ( AnyError == 0 )
      {
         zmRD834( 0) ;
         checkOptimisticConcurrencyRD834( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRD834( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertRD834( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RD12 */
                  pr_default.execute(10, new Object[] {A5654Mgen_com, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMARCOM");
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
                        processLevelRD834( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionRD0( ) ;
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
            loadRD834( ) ;
         }
         endLevelRD834( ) ;
      }
      closeExtendedTableCursorsRD834( ) ;
   }

   public void updateRD834( )
   {
      beforeValidateRD834( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRD834( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRD834( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRD834( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateRD834( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMARCOM */
                  deferredUpdateRD834( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelRD834( ) ;
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
         endLevelRD834( ) ;
      }
      closeExtendedTableCursorsRD834( ) ;
   }

   public void deferredUpdateRD834( )
   {
   }

   public void delete( )
   {
      beforeValidateRD834( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRD834( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsRD834( ) ;
         afterConfirmRD834( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteRD834( ) ;
            if ( AnyError == 0 )
            {
               scanStartRD835( ) ;
               while ( RcdFound835 != 0 )
               {
                  getByPrimaryKeyRD835( ) ;
                  deleteRD835( ) ;
                  scanNextRD835( ) ;
               }
               scanEndRD835( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RD13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, A5654Mgen_com});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMARCOM");
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
      sMode834 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelRD834( ) ;
      Gx_mode = sMode834 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsRD834( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevelRD835( )
   {
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRowRD835( ) ;
         if ( ( nRcdExists_835 != 0 ) || ( nIsMod_835 != 0 ) )
         {
            standaloneNotModalRD835( ) ;
            getKeyRD835( ) ;
            if ( ( nRcdExists_835 == 0 ) && ( nRcdDeleted_835 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertRD835( ) ;
            }
            else
            {
               if ( RcdFound835 != 0 )
               {
                  if ( ( nRcdDeleted_835 != 0 ) && ( nRcdExists_835 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteRD835( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_835 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateRD835( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_835 == 0 )
                  {
                     GXCCtl = "GRDTIPART_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrdTipArt_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtGrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMgen_val_Internalname, GXutil.ltrim( localUtil.ntoc( A5655Mgen_val, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z4364GrdTipArt_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5655Mgen_val_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z5655Mgen_val, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_835_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_835_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_835_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_835 != 0 )
         {
            httpContext.changePostValue( "GRDTIPART_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrdTipArt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "GRDTIPART_"+sGXsfl_28_idx+"Horizontalalignment", GXutil.rtrim( edtGrdTipArt_Horizontalalignment)) ;
            httpContext.changePostValue( "MGEN_VAL_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMgen_val_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllRD835( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_835 = (short)(0) ;
      nIsMod_835 = (short)(0) ;
      nRcdDeleted_835 = (short)(0) ;
   }

   public void processLevelRD834( )
   {
      /* Save parent mode. */
      sMode834 = Gx_mode ;
      processNestedLevelRD835( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode834 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevelRD834( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteRD834( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tmarcom");
         if ( AnyError == 0 )
         {
            confirmValuesRD0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tmarcom");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartRD834( )
   {
      /* Scan By routine */
      /* Using cursor T00RD14 */
      pr_default.execute(12);
      RcdFound834 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound834 = (short)(1) ;
         A396EmprCod = T00RD14_A396EmprCod[0] ;
         A5654Mgen_com = T00RD14_A5654Mgen_com[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextRD834( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound834 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound834 = (short)(1) ;
         A396EmprCod = T00RD14_A396EmprCod[0] ;
         A5654Mgen_com = T00RD14_A5654Mgen_com[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
      }
   }

   public void scanEndRD834( )
   {
      pr_default.close(12);
   }

   public void afterConfirmRD834( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertRD834( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateRD834( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteRD834( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteRD834( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateRD834( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesRD834( )
   {
      cmbMgen_com.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMgen_com.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMgen_com.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zmRD835( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5655Mgen_val = T00RD3_A5655Mgen_val[0] ;
         }
         else
         {
            Z5655Mgen_val = A5655Mgen_val ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z5654Mgen_com = A5654Mgen_com ;
         Z5655Mgen_val = A5655Mgen_val ;
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z4368GrdTipDsc = A4368GrdTipDsc ;
      }
   }

   public void standaloneNotModalRD835( )
   {
   }

   public void standaloneModalRD835( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtGrdTipArt_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtGrdTipArt_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void loadRD835( )
   {
      /* Using cursor T00RD15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound835 = (short)(1) ;
         A4368GrdTipDsc = T00RD15_A4368GrdTipDsc[0] ;
         A5655Mgen_val = T00RD15_A5655Mgen_val[0] ;
         n5655Mgen_val = T00RD15_n5655Mgen_val[0] ;
         zmRD835( -9) ;
      }
      pr_default.close(13);
      onLoadActionsRD835( ) ;
   }

   public void onLoadActionsRD835( )
   {
   }

   public void checkExtendedTableRD835( )
   {
      nIsDirty_835 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModalRD835( ) ;
      /* Using cursor T00RD4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "GRDTIPART_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T00RD4_A4368GrdTipDsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursorsRD835( )
   {
      pr_default.close(2);
   }

   public void enableDisableRD835( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          short A4364GrdTipArt )
   {
      /* Using cursor T00RD16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         GXCCtl = "GRDTIPART_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4368GrdTipDsc = T00RD16_A4368GrdTipDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4368GrdTipDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(14) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(14);
   }

   public void getKeyRD835( )
   {
      /* Using cursor T00RD17 */
      pr_default.execute(15, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound835 = (short)(1) ;
      }
      else
      {
         RcdFound835 = (short)(0) ;
      }
      pr_default.close(15);
   }

   public void getByPrimaryKeyRD835( )
   {
      /* Using cursor T00RD3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmRD835( 9) ;
         RcdFound835 = (short)(1) ;
         initializeNonKeyRD835( ) ;
         A5655Mgen_val = T00RD3_A5655Mgen_val[0] ;
         n5655Mgen_val = T00RD3_n5655Mgen_val[0] ;
         A4364GrdTipArt = T00RD3_A4364GrdTipArt[0] ;
         Z396EmprCod = A396EmprCod ;
         Z5654Mgen_com = A5654Mgen_com ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         sMode835 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadRD835( ) ;
         Gx_mode = sMode835 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound835 = (short)(0) ;
         initializeNonKeyRD835( ) ;
         sMode835 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalRD835( ) ;
         Gx_mode = sMode835 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesRD835( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyRD835( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00RD2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMARCO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5655Mgen_val, T00RD2_A5655Mgen_val[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5655Mgen_val, T00RD2_A5655Mgen_val[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tmarcom:[seudo value changed for attri]"+"Mgen_val");
               GXutil.writeLogRaw("Old: ",Z5655Mgen_val);
               GXutil.writeLogRaw("Current: ",T00RD2_A5655Mgen_val[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLMARCO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertRD835( )
   {
      beforeValidateRD835( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRD835( ) ;
      }
      if ( AnyError == 0 )
      {
         zmRD835( 0) ;
         checkOptimisticConcurrencyRD835( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRD835( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertRD835( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RD18 */
                  pr_default.execute(16, new Object[] {A5654Mgen_com, Boolean.valueOf(n5655Mgen_val), A5655Mgen_val, A396EmprCod, Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMARCO");
                  if ( (pr_default.getStatus(16) == 1) )
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
            loadRD835( ) ;
         }
         endLevelRD835( ) ;
      }
      closeExtendedTableCursorsRD835( ) ;
   }

   public void updateRD835( )
   {
      beforeValidateRD835( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRD835( ) ;
      }
      if ( ( nIsMod_835 != 0 ) || ( nIsDirty_835 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyRD835( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmRD835( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateRD835( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00RD19 */
                     pr_default.execute(17, new Object[] {Boolean.valueOf(n5655Mgen_val), A5655Mgen_val, A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMARCO");
                     if ( (pr_default.getStatus(17) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLMARCO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateRD835( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyRD835( ) ;
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
            endLevelRD835( ) ;
         }
      }
      closeExtendedTableCursorsRD835( ) ;
   }

   public void deferredUpdateRD835( )
   {
   }

   public void deleteRD835( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateRD835( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRD835( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsRD835( ) ;
         afterConfirmRD835( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteRD835( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00RD20 */
               pr_default.execute(18, new Object[] {A396EmprCod, A5654Mgen_com, Short.valueOf(A4364GrdTipArt)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMARCO");
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
      sMode835 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelRD835( ) ;
      Gx_mode = sMode835 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsRD835( )
   {
      standaloneModalRD835( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T00RD21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         A4368GrdTipDsc = T00RD21_A4368GrdTipDsc[0] ;
         pr_default.close(19);
      }
   }

   public void endLevelRD835( )
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

   public void scanStartRD835( )
   {
      /* Scan By routine */
      /* Using cursor T00RD22 */
      pr_default.execute(20, new Object[] {A396EmprCod, A5654Mgen_com});
      RcdFound835 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound835 = (short)(1) ;
         A4364GrdTipArt = T00RD22_A4364GrdTipArt[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextRD835( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound835 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound835 = (short)(1) ;
         A4364GrdTipArt = T00RD22_A4364GrdTipArt[0] ;
      }
   }

   public void scanEndRD835( )
   {
      pr_default.close(20);
   }

   public void afterConfirmRD835( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertRD835( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateRD835( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteRD835( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteRD835( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateRD835( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesRD835( )
   {
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtMgen_val_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMgen_val_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMgen_val_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashesRD835( )
   {
   }

   public void send_integrity_lvl_hashesRD834( )
   {
   }

   public void subsflControlProps_28835( )
   {
      edtGrdTipArt_Internalname = "GRDTIPART_"+sGXsfl_28_idx ;
      edtMgen_val_Internalname = "MGEN_VAL_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_28835( )
   {
      edtGrdTipArt_Internalname = "GRDTIPART_"+sGXsfl_28_fel_idx ;
      edtMgen_val_Internalname = "MGEN_VAL_"+sGXsfl_28_fel_idx ;
   }

   public void addRowRD835( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28835( ) ;
      sendRowRD835( ) ;
   }

   public void sendRowRD835( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_835_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGrdTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGrdTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtGrdTipArt_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtGrdTipArt_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_835_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMgen_val_Internalname,GXutil.ltrim( localUtil.ntoc( A5655Mgen_val, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMgen_val_Enabled!=0) ? localUtil.format( A5655Mgen_val, "ZZ9.999") : localUtil.format( A5655Mgen_val, "ZZ9.999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMgen_val_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMgen_val_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesRD835( ) ;
      GXCCtl = "Z4364GrdTipArt_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5655Mgen_val_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5655Mgen_val, (byte)(7), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_835_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_835_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_835_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_835, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_28_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV44TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV44TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV41EmprCod));
      GXCCtl = "vMGEN_COM_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42Mgen_com));
      GXCCtl = "EMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GRDTIPART_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtGrdTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRDTIPART_"+sGXsfl_28_idx+"Horizontalalignment", GXutil.rtrim( edtGrdTipArt_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "MGEN_VAL_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMgen_val_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowRD835( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28835( ) ;
      edtGrdTipArt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "GRDTIPART_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtGrdTipArt_Horizontalalignment = httpContext.cgiGet( "GRDTIPART_"+sGXsfl_28_idx+"Horizontalalignment") ;
      edtMgen_val_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MGEN_VAL_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "GRDTIPART_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
         wbErr = true ;
         A4364GrdTipArt = (short)(0) ;
      }
      else
      {
         A4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtMgen_val_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtMgen_val_Internalname)), DecimalUtil.stringToDec("999.999")) > 0 ) ) )
      {
         GXCCtl = "MGEN_VAL_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMgen_val_Internalname ;
         wbErr = true ;
         A5655Mgen_val = DecimalUtil.ZERO ;
         n5655Mgen_val = false ;
      }
      else
      {
         A5655Mgen_val = localUtil.ctond( httpContext.cgiGet( edtMgen_val_Internalname)) ;
         n5655Mgen_val = false ;
      }
      GXCCtl = "Z4364GrdTipArt_" + sGXsfl_28_idx ;
      Z4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5655Mgen_val_" + sGXsfl_28_idx ;
      Z5655Mgen_val = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_835_" + sGXsfl_28_idx ;
      nRcdDeleted_835 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_835_" + sGXsfl_28_idx ;
      nRcdExists_835 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_835_" + sGXsfl_28_idx ;
      nIsMod_835 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtGrdTipArt_Enabled = edtGrdTipArt_Enabled ;
   }

   public void confirmValuesRD0( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28835( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28835( ) ;
         httpContext.changePostValue( "Z4364GrdTipArt_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z4364GrdTipArt_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z4364GrdTipArt_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z5655Mgen_val_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z5655Mgen_val_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5655Mgen_val_"+sGXsfl_28_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tmarcom", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV42Mgen_com))}, new String[] {"Gx_mode","EmprCod","Mgen_com"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMARCOM");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tmarcom:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5654Mgen_com", GXutil.rtrim( Z5654Mgen_com));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRDTIPART_DATA", AV46GrdTipArt_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRDTIPART_DATA", AV46GrdTipArt_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV44TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV44TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV44TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV41EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMGEN_COM", GXutil.rtrim( AV42Mgen_com));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMGEN_COM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42Mgen_com, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GRDTIPDSC", GXutil.rtrim( A4368GrdTipDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRDTIPART_Objectcall", GXutil.rtrim( Combo_grdtipart_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRDTIPART_Cls", GXutil.rtrim( Combo_grdtipart_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRDTIPART_Enabled", GXutil.booltostr( Combo_grdtipart_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRDTIPART_Titlecontrolidtoreplace", GXutil.rtrim( Combo_grdtipart_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRDTIPART_Isgriditem", GXutil.booltostr( Combo_grdtipart_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_GRDTIPART_Emptyitem", GXutil.booltostr( Combo_grdtipart_Emptyitem));
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
      return formatLink("app.facturacion.tmarcom", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV42Mgen_com))}, new String[] {"Gx_mode","EmprCod","Mgen_com"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TMARCOM" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Margem Comercialiçao", "") ;
   }

   public void initializeNonKeyRD834( )
   {
   }

   public void initAllRD834( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A5654Mgen_com = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
      initializeNonKeyRD834( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyRD835( )
   {
      A4368GrdTipDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      A5655Mgen_val = DecimalUtil.ZERO ;
      n5655Mgen_val = false ;
      Z5655Mgen_val = DecimalUtil.ZERO ;
   }

   public void initAllRD835( )
   {
      A4364GrdTipArt = (short)(0) ;
      initializeNonKeyRD835( ) ;
   }

   public void standaloneModalInsertRD835( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655485", true, true);
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
      httpContext.AddJavascriptSource("facturacion/tmarcom.js", "?20268211655485", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties835( )
   {
      edtGrdTipArt_Enabled = defedtGrdTipArt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtGrdTipArt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtGrdTipArt_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5655Mgen_val, (byte)(7), (byte)(3), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMgen_val_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      cmbMgen_com.setInternalname( "MGEN_COM" );
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtGrdTipArt_Internalname = "GRDTIPART" ;
      edtMgen_val_Internalname = "MGEN_VAL" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_grdtipart_Internalname = "COMBO_GRDTIPART" ;
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
      Combo_grdtipart_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Margem Comercialiçao", "") );
      edtMgen_val_Jsonclick = "" ;
      edtGrdTipArt_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_grdtipart_Titlecontrolidtoreplace = "" ;
      edtMgen_val_Enabled = 1 ;
      edtGrdTipArt_Enabled = 1 ;
      Combo_grdtipart_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_grdtipart_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_grdtipart_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      cmbMgen_com.setJsonclick( "" );
      cmbMgen_com.setEnabled( 1 );
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
      edtGrdTipArt_Horizontalalignment = "right" ;
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
      subsflControlProps_28835( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalRD835( ) ;
         standaloneModalRD835( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowRD835( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28835( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      cmbMgen_com.setName( "MGEN_COM" );
      cmbMgen_com.setWebtags( "" );
      cmbMgen_com.addItem("I", httpContext.getMessage( "Interna", ""), (short)(0));
      cmbMgen_com.addItem("E", httpContext.getMessage( "Externa", ""), (short)(0));
      if ( cmbMgen_com.getItemCount() > 0 )
      {
         A5654Mgen_com = cmbMgen_com.getValidValue(A5654Mgen_com) ;
         httpContext.ajax_rsp_assign_attri("", false, "A5654Mgen_com", A5654Mgen_com);
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

   public void valid_Grdtipart( )
   {
      /* Using cursor T00RD21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "GRDTIP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
      }
      A4368GrdTipDsc = T00RD21_A4368GrdTipDsc[0] ;
      pr_default.close(19);
      dynload_actions( ) ;
      if ( cmbMgen_com.getItemCount() > 0 )
      {
         A5654Mgen_com = cmbMgen_com.getValidValue(A5654Mgen_com) ;
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbMgen_com.setValue( GXutil.rtrim( A5654Mgen_com) );
      }
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", GXutil.rtrim( A4368GrdTipDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV42Mgen_com',fld:'vMGEN_COM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV42Mgen_com',fld:'vMGEN_COM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12RD2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV44TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MGEN_COM","{handler:'valid_Mgen_com',iparms:[]");
      setEventMetadata("VALID_MGEN_COM",",oparms:[]}");
      setEventMetadata("VALID_GRDTIPART","{handler:'valid_Grdtipart',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''}]");
      setEventMetadata("VALID_GRDTIPART",",oparms:[{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mgen_val',iparms:[]");
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
      pr_default.close(19);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV41EmprCod = "" ;
      wcpOAV42Mgen_com = "" ;
      Z396EmprCod = "" ;
      Z5654Mgen_com = "" ;
      Z5655Mgen_val = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV41EmprCod = "" ;
      AV42Mgen_com = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A5654Mgen_com = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV48Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_grdtipart = new com.genexus.webpanels.GXUserControl();
      Combo_grdtipart_Caption = "" ;
      AV46GrdTipArt_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode835 = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A4368GrdTipDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_grdtipart_Objectcall = "" ;
      Combo_grdtipart_Class = "" ;
      Combo_grdtipart_Icontype = "" ;
      Combo_grdtipart_Icon = "" ;
      Combo_grdtipart_Tooltip = "" ;
      Combo_grdtipart_Selectedvalue_set = "" ;
      Combo_grdtipart_Selectedvalue_get = "" ;
      Combo_grdtipart_Selectedtext_set = "" ;
      Combo_grdtipart_Selectedtext_get = "" ;
      Combo_grdtipart_Gamoauthtoken = "" ;
      Combo_grdtipart_Ddointernalname = "" ;
      Combo_grdtipart_Titlecontrolalign = "" ;
      Combo_grdtipart_Dropdownoptionstype = "" ;
      Combo_grdtipart_Datalisttype = "" ;
      Combo_grdtipart_Datalistfixedvalues = "" ;
      Combo_grdtipart_Datalistproc = "" ;
      Combo_grdtipart_Datalistprocparametersprefix = "" ;
      Combo_grdtipart_Remoteservicesparameters = "" ;
      Combo_grdtipart_Htmltemplate = "" ;
      Combo_grdtipart_Multiplevaluestype = "" ;
      Combo_grdtipart_Loadingdata = "" ;
      Combo_grdtipart_Noresultsfound = "" ;
      Combo_grdtipart_Emptyitemtext = "" ;
      Combo_grdtipart_Onlyselectedvalues = "" ;
      Combo_grdtipart_Selectalltext = "" ;
      Combo_grdtipart_Multiplevaluesseparator = "" ;
      Combo_grdtipart_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode834 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A5655Mgen_val = DecimalUtil.ZERO ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV43WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV44TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV45WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV47ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T00RD7_A407EmprNom = new String[] {""} ;
      T00RD7_n407EmprNom = new boolean[] {false} ;
      T00RD8_A5654Mgen_com = new String[] {""} ;
      T00RD8_A407EmprNom = new String[] {""} ;
      T00RD8_n407EmprNom = new boolean[] {false} ;
      T00RD8_A396EmprCod = new String[] {""} ;
      T00RD9_A396EmprCod = new String[] {""} ;
      T00RD9_A5654Mgen_com = new String[] {""} ;
      T00RD6_A5654Mgen_com = new String[] {""} ;
      T00RD6_A396EmprCod = new String[] {""} ;
      T00RD10_A396EmprCod = new String[] {""} ;
      T00RD10_A5654Mgen_com = new String[] {""} ;
      T00RD11_A396EmprCod = new String[] {""} ;
      T00RD11_A5654Mgen_com = new String[] {""} ;
      T00RD5_A5654Mgen_com = new String[] {""} ;
      T00RD5_A396EmprCod = new String[] {""} ;
      T00RD14_A396EmprCod = new String[] {""} ;
      T00RD14_A5654Mgen_com = new String[] {""} ;
      Z4368GrdTipDsc = "" ;
      T00RD15_A5654Mgen_com = new String[] {""} ;
      T00RD15_A4368GrdTipDsc = new String[] {""} ;
      T00RD15_A5655Mgen_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RD15_n5655Mgen_val = new boolean[] {false} ;
      T00RD15_A396EmprCod = new String[] {""} ;
      T00RD15_A4364GrdTipArt = new short[1] ;
      T00RD4_A4368GrdTipDsc = new String[] {""} ;
      T00RD16_A4368GrdTipDsc = new String[] {""} ;
      T00RD17_A396EmprCod = new String[] {""} ;
      T00RD17_A5654Mgen_com = new String[] {""} ;
      T00RD17_A4364GrdTipArt = new short[1] ;
      T00RD3_A5654Mgen_com = new String[] {""} ;
      T00RD3_A5655Mgen_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RD3_n5655Mgen_val = new boolean[] {false} ;
      T00RD3_A396EmprCod = new String[] {""} ;
      T00RD3_A4364GrdTipArt = new short[1] ;
      T00RD2_A5654Mgen_com = new String[] {""} ;
      T00RD2_A5655Mgen_val = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RD2_n5655Mgen_val = new boolean[] {false} ;
      T00RD2_A396EmprCod = new String[] {""} ;
      T00RD2_A4364GrdTipArt = new short[1] ;
      T00RD21_A4368GrdTipDsc = new String[] {""} ;
      T00RD22_A396EmprCod = new String[] {""} ;
      T00RD22_A5654Mgen_com = new String[] {""} ;
      T00RD22_A4364GrdTipArt = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmarcom__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmarcom__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmarcom__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmarcom__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tmarcom__default(),
         new Object[] {
             new Object[] {
            T00RD2_A5654Mgen_com, T00RD2_A5655Mgen_val, T00RD2_n5655Mgen_val, T00RD2_A396EmprCod, T00RD2_A4364GrdTipArt
            }
            , new Object[] {
            T00RD3_A5654Mgen_com, T00RD3_A5655Mgen_val, T00RD3_n5655Mgen_val, T00RD3_A396EmprCod, T00RD3_A4364GrdTipArt
            }
            , new Object[] {
            T00RD4_A4368GrdTipDsc
            }
            , new Object[] {
            T00RD5_A5654Mgen_com, T00RD5_A396EmprCod
            }
            , new Object[] {
            T00RD6_A5654Mgen_com, T00RD6_A396EmprCod
            }
            , new Object[] {
            T00RD7_A407EmprNom, T00RD7_n407EmprNom
            }
            , new Object[] {
            T00RD8_A5654Mgen_com, T00RD8_A407EmprNom, T00RD8_n407EmprNom, T00RD8_A396EmprCod
            }
            , new Object[] {
            T00RD9_A396EmprCod, T00RD9_A5654Mgen_com
            }
            , new Object[] {
            T00RD10_A396EmprCod, T00RD10_A5654Mgen_com
            }
            , new Object[] {
            T00RD11_A396EmprCod, T00RD11_A5654Mgen_com
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00RD14_A396EmprCod, T00RD14_A5654Mgen_com
            }
            , new Object[] {
            T00RD15_A5654Mgen_com, T00RD15_A4368GrdTipDsc, T00RD15_A5655Mgen_val, T00RD15_n5655Mgen_val, T00RD15_A396EmprCod, T00RD15_A4364GrdTipArt
            }
            , new Object[] {
            T00RD16_A4368GrdTipDsc
            }
            , new Object[] {
            T00RD17_A396EmprCod, T00RD17_A5654Mgen_com, T00RD17_A4364GrdTipArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00RD21_A4368GrdTipDsc
            }
            , new Object[] {
            T00RD22_A396EmprCod, T00RD22_A5654Mgen_com, T00RD22_A4364GrdTipArt
            }
         }
      );
      AV48Pgmname = "Facturacion.TMARCOM" ;
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
   private short Z4364GrdTipArt ;
   private short nRcdDeleted_835 ;
   private short nRcdExists_835 ;
   private short nIsMod_835 ;
   private short A4364GrdTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount835 ;
   private short RcdFound835 ;
   private short nBlankRcdUsr835 ;
   private short RcdFound834 ;
   private short nIsDirty_834 ;
   private short nIsDirty_835 ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int trnEnded ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtGrdTipArt_Enabled ;
   private int edtMgen_val_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_grdtipart_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtGrdTipArt_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5655Mgen_val ;
   private java.math.BigDecimal A5655Mgen_val ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV41EmprCod ;
   private String wcpOAV42Mgen_com ;
   private String Z396EmprCod ;
   private String Z5654Mgen_com ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV41EmprCod ;
   private String AV42Mgen_com ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String sGXsfl_28_idx="0001" ;
   private String edtGrdTipArt_Horizontalalignment ;
   private String edtGrdTipArt_Internalname ;
   private String A5654Mgen_com ;
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
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV48Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_grdtipart_Caption ;
   private String Combo_grdtipart_Cls ;
   private String Combo_grdtipart_Internalname ;
   private String sMode835 ;
   private String edtMgen_val_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A4368GrdTipDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_grdtipart_Objectcall ;
   private String Combo_grdtipart_Class ;
   private String Combo_grdtipart_Icontype ;
   private String Combo_grdtipart_Icon ;
   private String Combo_grdtipart_Tooltip ;
   private String Combo_grdtipart_Selectedvalue_set ;
   private String Combo_grdtipart_Selectedvalue_get ;
   private String Combo_grdtipart_Selectedtext_set ;
   private String Combo_grdtipart_Selectedtext_get ;
   private String Combo_grdtipart_Gamoauthtoken ;
   private String Combo_grdtipart_Ddointernalname ;
   private String Combo_grdtipart_Titlecontrolalign ;
   private String Combo_grdtipart_Dropdownoptionstype ;
   private String Combo_grdtipart_Titlecontrolidtoreplace ;
   private String Combo_grdtipart_Datalisttype ;
   private String Combo_grdtipart_Datalistfixedvalues ;
   private String Combo_grdtipart_Datalistproc ;
   private String Combo_grdtipart_Datalistprocparametersprefix ;
   private String Combo_grdtipart_Remoteservicesparameters ;
   private String Combo_grdtipart_Htmltemplate ;
   private String Combo_grdtipart_Multiplevaluestype ;
   private String Combo_grdtipart_Loadingdata ;
   private String Combo_grdtipart_Noresultsfound ;
   private String Combo_grdtipart_Emptyitemtext ;
   private String Combo_grdtipart_Onlyselectedvalues ;
   private String Combo_grdtipart_Selectalltext ;
   private String Combo_grdtipart_Multiplevaluesseparator ;
   private String Combo_grdtipart_Addnewoptiontext ;
   private String hsh ;
   private String sMode834 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z4368GrdTipDsc ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtGrdTipArt_Jsonclick ;
   private String edtMgen_val_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_28_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_grdtipart_Isgriditem ;
   private boolean Combo_grdtipart_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_grdtipart_Enabled ;
   private boolean Combo_grdtipart_Visible ;
   private boolean Combo_grdtipart_Allowmultipleselection ;
   private boolean Combo_grdtipart_Hasdescription ;
   private boolean Combo_grdtipart_Includeonlyselectedoption ;
   private boolean Combo_grdtipart_Includeselectalloption ;
   private boolean Combo_grdtipart_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean n5655Mgen_val ;
   private String AV47ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV45WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_grdtipart ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMgen_com ;
   private IDataStoreProvider pr_default ;
   private String[] T00RD7_A407EmprNom ;
   private boolean[] T00RD7_n407EmprNom ;
   private String[] T00RD8_A5654Mgen_com ;
   private String[] T00RD8_A407EmprNom ;
   private boolean[] T00RD8_n407EmprNom ;
   private String[] T00RD8_A396EmprCod ;
   private String[] T00RD9_A396EmprCod ;
   private String[] T00RD9_A5654Mgen_com ;
   private String[] T00RD6_A5654Mgen_com ;
   private String[] T00RD6_A396EmprCod ;
   private String[] T00RD10_A396EmprCod ;
   private String[] T00RD10_A5654Mgen_com ;
   private String[] T00RD11_A396EmprCod ;
   private String[] T00RD11_A5654Mgen_com ;
   private String[] T00RD5_A5654Mgen_com ;
   private String[] T00RD5_A396EmprCod ;
   private String[] T00RD14_A396EmprCod ;
   private String[] T00RD14_A5654Mgen_com ;
   private String[] T00RD15_A5654Mgen_com ;
   private String[] T00RD15_A4368GrdTipDsc ;
   private java.math.BigDecimal[] T00RD15_A5655Mgen_val ;
   private boolean[] T00RD15_n5655Mgen_val ;
   private String[] T00RD15_A396EmprCod ;
   private short[] T00RD15_A4364GrdTipArt ;
   private String[] T00RD4_A4368GrdTipDsc ;
   private String[] T00RD16_A4368GrdTipDsc ;
   private String[] T00RD17_A396EmprCod ;
   private String[] T00RD17_A5654Mgen_com ;
   private short[] T00RD17_A4364GrdTipArt ;
   private String[] T00RD3_A5654Mgen_com ;
   private java.math.BigDecimal[] T00RD3_A5655Mgen_val ;
   private boolean[] T00RD3_n5655Mgen_val ;
   private String[] T00RD3_A396EmprCod ;
   private short[] T00RD3_A4364GrdTipArt ;
   private String[] T00RD2_A5654Mgen_com ;
   private java.math.BigDecimal[] T00RD2_A5655Mgen_val ;
   private boolean[] T00RD2_n5655Mgen_val ;
   private String[] T00RD2_A396EmprCod ;
   private short[] T00RD2_A4364GrdTipArt ;
   private String[] T00RD21_A4368GrdTipDsc ;
   private String[] T00RD22_A396EmprCod ;
   private String[] T00RD22_A5654Mgen_com ;
   private short[] T00RD22_A4364GrdTipArt ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV46GrdTipArt_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV43WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV44TrnContext ;
}

final  class tmarcom__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmarcom__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmarcom__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmarcom__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmarcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00RD2", "SELECT Mgen_com, Mgen_val, EmprCod, GrdTipArt FROM TXPLMARCO WHERE EmprCod = ? AND Mgen_com = ? AND GrdTipArt = ?  FOR UPDATE OF Mgen_val NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD3", "SELECT Mgen_com, Mgen_val, EmprCod, GrdTipArt FROM TXPLMARCO WHERE EmprCod = ? AND Mgen_com = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD4", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD5", "SELECT Mgen_com, EmprCod FROM TXPMARCOM WHERE EmprCod = ? AND Mgen_com = ?  FOR UPDATE OF Mgen_com NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD6", "SELECT Mgen_com, EmprCod FROM TXPMARCOM WHERE EmprCod = ? AND Mgen_com = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD8", "SELECT /*+ FIRST_ROWS(100) */ TM1.Mgen_com, T2.EmprNom, TM1.EmprCod FROM (TXPMARCOM TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Mgen_com = ? ORDER BY TM1.EmprCod, TM1.Mgen_com ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mgen_com FROM TXPMARCOM WHERE EmprCod = ? AND Mgen_com = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mgen_com FROM TXPMARCOM WHERE ( EmprCod > ? or EmprCod = ? and Mgen_com > ?) ORDER BY EmprCod, Mgen_com) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RD11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Mgen_com FROM TXPMARCOM WHERE ( EmprCod < ? or EmprCod = ? and Mgen_com < ?) ORDER BY EmprCod DESC, Mgen_com DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00RD12", "INSERT INTO TXPMARCOM(Mgen_com, EmprCod) VALUES(?, ?)", GX_NOMASK, "TXPMARCOM")
         ,new UpdateCursor("T00RD13", "DELETE FROM TXPMARCOM  WHERE EmprCod = ? AND Mgen_com = ?", GX_NOMASK, "TXPMARCOM")
         ,new ForEachCursor("T00RD14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Mgen_com FROM TXPMARCOM ORDER BY EmprCod, Mgen_com ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD15", "SELECT T1.Mgen_com, T2.GrdTipDsc, T1.Mgen_val, T1.EmprCod, T1.GrdTipArt FROM (TXPLMARCO T1 INNER JOIN TXPGRDTIP T2 ON T2.EmprCod = T1.EmprCod AND T2.GrdTipArt = T1.GrdTipArt) WHERE T1.EmprCod = ? and T1.Mgen_com = ? and T1.GrdTipArt = ? ORDER BY T1.EmprCod, T1.Mgen_com, T1.GrdTipArt ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD16", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD17", "SELECT EmprCod, Mgen_com, GrdTipArt FROM TXPLMARCO WHERE EmprCod = ? AND Mgen_com = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00RD18", "INSERT INTO TXPLMARCO(Mgen_com, Mgen_val, EmprCod, GrdTipArt) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPLMARCO")
         ,new UpdateCursor("T00RD19", "UPDATE TXPLMARCO SET Mgen_val=?  WHERE EmprCod = ? AND Mgen_com = ? AND GrdTipArt = ?", GX_NOMASK, "TXPLMARCO")
         ,new UpdateCursor("T00RD20", "DELETE FROM TXPLMARCO  WHERE EmprCod = ? AND Mgen_com = ? AND GrdTipArt = ?", GX_NOMASK, "TXPLMARCO")
         ,new ForEachCursor("T00RD21", "SELECT GrdTipDsc FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RD22", "SELECT EmprCod, Mgen_com, GrdTipArt FROM TXPLMARCO WHERE EmprCod = ? and Mgen_com = ? ORDER BY EmprCod, Mgen_com, GrdTipArt ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,3);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
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
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 1);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 1);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[2], 3);
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 17 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 3);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 1);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 1);
               return;
      }
   }

}

