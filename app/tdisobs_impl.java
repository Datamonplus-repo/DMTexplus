package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tdisobs_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         AV38oldObs = httpContext.GetPar( "oldObs") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
         A376DisObsLin = (byte)(GXutil.lval( httpContext.GetPar( "DisObsLin"))) ;
         A377DisObsTxt = httpContext.GetPar( "DisObsTxt") ;
         AV23UsurCod = httpContext.GetPar( "UsurCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         AV26Station = httpContext.GetPar( "Station") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_12_0V40( A396EmprCod, A361DisCod, AV38oldObs, A376DisObsLin, A377DisObsTxt, AV23UsurCod, AV26Station, Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod) ;
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
            AV25EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
            AV39DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39DisCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39DisCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "OBSERVACIONES", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDisEnt_Internalname ;
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
      A378DisObsULin = (byte)(GXutil.lval( httpContext.GetPar( "DisObsULin"))) ;
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

   public tdisobs_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tdisobs_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tdisobs_impl.class ));
   }

   public tdisobs_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "TableContent15", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDisEnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDisEnt_Internalname, httpContext.getMessage( "Entregar a...", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisEnt_Internalname, GXutil.rtrim( A366DisEnt), GXutil.rtrim( localUtil.format( A366DisEnt, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisEnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDisEnt_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOBS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TDISOBS.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISOBS.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisCod_Internalname, GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A361DisCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisCod_Jsonclick, 0, "Attribute", "", "", "", "", edtDisCod_Visible, edtDisCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOBS.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreMtr_Internalname, GXutil.ltrim( localUtil.ntoc( A389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreMtr_Enabled!=0) ? localUtil.format( A389DisPreMtr, "ZZZZZZ9.99") : localUtil.format( A389DisPreMtr, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreMtr_Jsonclick, 0, "Attribute", "", "", "", "", edtDisPreMtr_Visible, edtDisPreMtr_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOBS.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisPreKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisPreKgm_Enabled!=0) ? localUtil.format( A388DisPreKgm, "ZZZZZZ9.99") : localUtil.format( A388DisPreKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisPreKgm_Jsonclick, 0, "Attribute", "", "", "", "", edtDisPreKgm_Visible, edtDisPreKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOBS.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisDto_Internalname, GXutil.ltrim( localUtil.ntoc( A7510DisDto, (byte)(8), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisDto_Enabled!=0) ? localUtil.format( A7510DisDto, "ZZ9.99 %") : localUtil.format( A7510DisDto, "ZZ9.99 %"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisDto_Jsonclick, 0, "Attribute", "", "", "", "", edtDisDto_Visible, edtDisDto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOBS.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDisObsULin_Internalname, GXutil.ltrim( localUtil.ntoc( A378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDisObsULin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A378DisObsULin), "9") : localUtil.format( DecimalUtil.doubleToDec(A378DisObsULin), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDisObsULin_Jsonclick, 0, "Attribute", "", "", "", "", edtDisObsULin_Visible, edtDisObsULin_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TDISOBS.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TDISOBS.htm");
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
         nBlankRcdCount40 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_40 = (short)(1) ;
            scanStart0V40( ) ;
            while ( RcdFound40 != 0 )
            {
               init_level_properties40( ) ;
               getByPrimaryKey0V40( ) ;
               addRow0V40( ) ;
               scanNext0V40( ) ;
            }
            scanEnd0V40( ) ;
            nBlankRcdCount40 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B378DisObsULin = A378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         standaloneNotModal0V40( ) ;
         standaloneModal0V40( ) ;
         sMode40 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRow0V40( ) ;
            edtDisObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtDisObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            if ( ( nRcdExists_40 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal0V40( ) ;
            }
            sendRow0V40( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A378DisObsULin = B378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount40 = (short)(5) ;
         nRcdExists_40 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart0V40( ) ;
            while ( RcdFound40 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_2840( ) ;
               init_level_properties40( ) ;
               standaloneNotModal0V40( ) ;
               getByPrimaryKey0V40( ) ;
               standaloneModal0V40( ) ;
               addRow0V40( ) ;
               scanNext0V40( ) ;
            }
            scanEnd0V40( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode40 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_2840( ) ;
         initAll0V40( ) ;
         init_level_properties40( ) ;
         B378DisObsULin = A378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         nRcdExists_40 = (short)(0) ;
         nIsMod_40 = (short)(0) ;
         nRcdDeleted_40 = (short)(0) ;
         nBlankRcdCount40 = (short)(nBlankRcdUsr40+nBlankRcdCount40) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount40 > 0 )
         {
            standaloneNotModal0V40( ) ;
            standaloneModal0V40( ) ;
            addRow0V40( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtDisObsLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount40 = (short)(nBlankRcdCount40-1) ;
         }
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A378DisObsULin = B378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
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
      e110V2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z361DisCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z366DisEnt = httpContext.cgiGet( "Z366DisEnt") ;
            Z389DisPreMtr = localUtil.ctond( httpContext.cgiGet( "Z389DisPreMtr")) ;
            Z388DisPreKgm = localUtil.ctond( httpContext.cgiGet( "Z388DisPreKgm")) ;
            Z7510DisDto = localUtil.ctond( httpContext.cgiGet( "Z7510DisDto")) ;
            Z378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z378DisObsULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( "O378DisObsULin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV25EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV39DisCod = (int)(localUtil.ctol( httpContext.cgiGet( "vDISCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV38oldObs = httpContext.cgiGet( "vOLDOBS") ;
            AV26Station = httpContext.cgiGet( "vSTATION") ;
            AV23UsurCod = httpContext.cgiGet( "vUSURCOD") ;
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
            A366DisEnt = httpContext.cgiGet( edtDisEnt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A361DisCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            else
            {
               A361DisCod = (int)(localUtil.ctol( httpContext.cgiGet( edtDisCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREMTR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisPreMtr_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A389DisPreMtr = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
            }
            else
            {
               A389DisPreMtr = localUtil.ctond( httpContext.cgiGet( edtDisPreMtr_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISPREKGM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisPreKgm_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A388DisPreKgm = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            }
            else
            {
               A388DisPreKgm = localUtil.ctond( httpContext.cgiGet( edtDisPreKgm_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtDisDto_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtDisDto_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DISDTO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDisDto_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7510DisDto = DecimalUtil.ZERO ;
               n7510DisDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
            }
            else
            {
               A7510DisDto = localUtil.ctond( httpContext.cgiGet( edtDisDto_Internalname)) ;
               n7510DisDto = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
            }
            A378DisObsULin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsULin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TDISOBS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tdisobs:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A361DisCod = (int)(GXutil.lval( httpContext.GetPar( "DisCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
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
                  sMode34 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode34 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound34 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_0V0( ) ;
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
                        e110V2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e120V2 ();
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
         e120V2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll0V34( ) ;
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
         disableAttributes0V34( ) ;
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

   public void confirm_0V0( )
   {
      beforeValidate0V34( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls0V34( ) ;
         }
         else
         {
            checkExtendedTable0V34( ) ;
            closeExtendedTableCursors0V34( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode34 = Gx_mode ;
         confirm_0V40( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode34 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_0V40( )
   {
      s378DisObsULin = O378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow0V40( ) ;
         if ( ( nRcdExists_40 != 0 ) || ( nIsMod_40 != 0 ) )
         {
            getKey0V40( ) ;
            if ( ( nRcdExists_40 == 0 ) && ( nRcdDeleted_40 == 0 ) )
            {
               if ( RcdFound40 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0V40( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0V40( ) ;
                     closeExtendedTableCursors0V40( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O378DisObsULin = A378DisObsULin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                  }
               }
               else
               {
                  GXCCtl = "DISOBSLIN_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDisObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound40 != 0 )
               {
                  if ( nRcdDeleted_40 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0V40( ) ;
                     load0V40( ) ;
                     beforeValidate0V40( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0V40( ) ;
                        O378DisObsULin = A378DisObsULin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_40 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0V40( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0V40( ) ;
                           closeExtendedTableCursors0V40( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O378DisObsULin = A378DisObsULin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_40 == 0 )
                  {
                     GXCCtl = "DISOBSLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtDisObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsTxt_Internalname, GXutil.rtrim( A377DisObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_28_idx, GXutil.rtrim( Z377DisObsTxt)) ;
         httpContext.changePostValue( "T377DisObsTxt_"+sGXsfl_28_idx, GXutil.rtrim( O377DisObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_40_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_40_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_40_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_40 != 0 )
         {
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O378DisObsULin = s378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0V0( )
   {
   }

   public void e110V2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV26Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tdisobs_impl.this.GXt_char1 = GXv_char2[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char4[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char2, GXv_char3, GXv_char4) ;
      tdisobs_impl.this.AV25EmprCod = GXv_char2[0] ;
      tdisobs_impl.this.AV27EmprNom = GXv_char3[0] ;
      tdisobs_impl.this.AV23UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      GXt_char1 = AV26Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tdisobs_impl.this.GXt_char1 = GXv_char4[0] ;
      AV26Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV27EmprNom ;
      GXv_char2[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV26Station, GXv_char4, GXv_char3, GXv_char2) ;
      tdisobs_impl.this.AV25EmprCod = GXv_char4[0] ;
      tdisobs_impl.this.AV27EmprNom = GXv_char3[0] ;
      tdisobs_impl.this.AV23UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprNom", AV27EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
      GXv_SdtWWPContext5[0] = AV40WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV40WWPContext = GXv_SdtWWPContext5[0] ;
      AV41TrnContext.fromxml(AV42WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtDisCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Visible), 5, 0), true);
      edtDisPreMtr_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreMtr_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreMtr_Visible), 5, 0), true);
      edtDisPreKgm_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreKgm_Visible), 5, 0), true);
      edtDisDto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDto_Visible), 5, 0), true);
      edtDisObsULin_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e120V2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
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

   public void zm0V34( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z366DisEnt = T000V5_A366DisEnt[0] ;
            Z389DisPreMtr = T000V5_A389DisPreMtr[0] ;
            Z388DisPreKgm = T000V5_A388DisPreKgm[0] ;
            Z7510DisDto = T000V5_A7510DisDto[0] ;
            Z378DisObsULin = T000V5_A378DisObsULin[0] ;
         }
         else
         {
            Z366DisEnt = A366DisEnt ;
            Z389DisPreMtr = A389DisPreMtr ;
            Z388DisPreKgm = A388DisPreKgm ;
            Z7510DisDto = A7510DisDto ;
            Z378DisObsULin = A378DisObsULin ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z361DisCod = A361DisCod ;
         Z366DisEnt = A366DisEnt ;
         Z389DisPreMtr = A389DisPreMtr ;
         Z388DisPreKgm = A388DisPreKgm ;
         Z7510DisDto = A7510DisDto ;
         Z378DisObsULin = A378DisObsULin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         A396EmprCod = AV25EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV39DisCod) )
      {
         A361DisCod = AV39DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      if ( ! (0==AV39DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      else
      {
         edtDisCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV39DisCod) )
      {
         edtDisCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
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
         /* Using cursor T000V6 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         A407EmprNom = T000V6_A407EmprNom[0] ;
         n407EmprNom = T000V6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(4);
      }
   }

   public void load0V34( )
   {
      /* Using cursor T000V7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A366DisEnt = T000V7_A366DisEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A389DisPreMtr = T000V7_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A388DisPreKgm = T000V7_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A7510DisDto = T000V7_A7510DisDto[0] ;
         n7510DisDto = T000V7_n7510DisDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
         A378DisObsULin = T000V7_A378DisObsULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         A407EmprNom = T000V7_A407EmprNom[0] ;
         n407EmprNom = T000V7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         zm0V34( -13) ;
      }
      pr_default.close(5);
      onLoadActions0V34( ) ;
   }

   public void onLoadActions0V34( )
   {
   }

   public void checkExtendedTable0V34( )
   {
      nIsDirty_34 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T000V6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T000V6_A407EmprNom[0] ;
      n407EmprNom = T000V6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors0V34( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod )
   {
      /* Using cursor T000V8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T000V8_A407EmprNom[0] ;
      n407EmprNom = T000V8_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey0V34( )
   {
      /* Using cursor T000V9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound34 = (short)(1) ;
      }
      else
      {
         RcdFound34 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000V5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm0V34( 13) ;
         RcdFound34 = (short)(1) ;
         A361DisCod = T000V5_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         A366DisEnt = T000V5_A366DisEnt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
         A389DisPreMtr = T000V5_A389DisPreMtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
         A388DisPreKgm = T000V5_A388DisPreKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
         A7510DisDto = T000V5_A7510DisDto[0] ;
         n7510DisDto = T000V5_n7510DisDto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
         A378DisObsULin = T000V5_A378DisObsULin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         A396EmprCod = T000V5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         O378DisObsULin = A378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0V34( ) ;
         if ( AnyError == 1 )
         {
            RcdFound34 = (short)(0) ;
            initializeNonKey0V34( ) ;
         }
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound34 = (short)(0) ;
         initializeNonKey0V34( ) ;
         sMode34 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode34 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey0V34( ) ;
      if ( RcdFound34 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T000V10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000V10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T000V10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000V10_A361DisCod[0] < A361DisCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000V10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T000V10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000V10_A361DisCod[0] > A361DisCod ) ) )
         {
            A396EmprCod = T000V10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T000V10_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound34 = (short)(0) ;
      /* Using cursor T000V11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A361DisCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T000V11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T000V11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000V11_A361DisCod[0] > A361DisCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T000V11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T000V11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T000V11_A361DisCod[0] < A361DisCod ) ) )
         {
            A396EmprCod = T000V11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A361DisCod = T000V11_A361DisCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
            RcdFound34 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0V34( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A378DisObsULin = O378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         GX_FocusControl = edtDisEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0V34( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound34 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A361DisCod = Z361DisCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDisEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               update0V34( ) ;
               GX_FocusControl = edtDisEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
            {
               /* Insert record */
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               GX_FocusControl = edtDisEnt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0V34( ) ;
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
                  A378DisObsULin = O378DisObsULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
                  GX_FocusControl = edtDisEnt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0V34( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A361DisCod != Z361DisCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = Z361DisCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A378DisObsULin = O378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDisEnt_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency0V34( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000V4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z366DisEnt, T000V4_A366DisEnt[0]) != 0 ) || ( DecimalUtil.compareTo(Z389DisPreMtr, T000V4_A389DisPreMtr[0]) != 0 ) || ( DecimalUtil.compareTo(Z388DisPreKgm, T000V4_A388DisPreKgm[0]) != 0 ) || ( DecimalUtil.compareTo(Z7510DisDto, T000V4_A7510DisDto[0]) != 0 ) || ( Z378DisObsULin != T000V4_A378DisObsULin[0] ) )
         {
            if ( GXutil.strcmp(Z366DisEnt, T000V4_A366DisEnt[0]) != 0 )
            {
               GXutil.writeLogln("tdisobs:[seudo value changed for attri]"+"DisEnt");
               GXutil.writeLogRaw("Old: ",Z366DisEnt);
               GXutil.writeLogRaw("Current: ",T000V4_A366DisEnt[0]);
            }
            if ( DecimalUtil.compareTo(Z389DisPreMtr, T000V4_A389DisPreMtr[0]) != 0 )
            {
               GXutil.writeLogln("tdisobs:[seudo value changed for attri]"+"DisPreMtr");
               GXutil.writeLogRaw("Old: ",Z389DisPreMtr);
               GXutil.writeLogRaw("Current: ",T000V4_A389DisPreMtr[0]);
            }
            if ( DecimalUtil.compareTo(Z388DisPreKgm, T000V4_A388DisPreKgm[0]) != 0 )
            {
               GXutil.writeLogln("tdisobs:[seudo value changed for attri]"+"DisPreKgm");
               GXutil.writeLogRaw("Old: ",Z388DisPreKgm);
               GXutil.writeLogRaw("Current: ",T000V4_A388DisPreKgm[0]);
            }
            if ( DecimalUtil.compareTo(Z7510DisDto, T000V4_A7510DisDto[0]) != 0 )
            {
               GXutil.writeLogln("tdisobs:[seudo value changed for attri]"+"DisDto");
               GXutil.writeLogRaw("Old: ",Z7510DisDto);
               GXutil.writeLogRaw("Current: ",T000V4_A7510DisDto[0]);
            }
            if ( Z378DisObsULin != T000V4_A378DisObsULin[0] )
            {
               GXutil.writeLogln("tdisobs:[seudo value changed for attri]"+"DisObsULin");
               GXutil.writeLogRaw("Old: ",Z378DisObsULin);
               GXutil.writeLogRaw("Current: ",T000V4_A378DisObsULin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDISPOS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0V34( )
   {
      beforeValidate0V34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V34( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0V34( 0) ;
         checkOptimisticConcurrency0V34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V34( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0V34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V12 */
                  pr_default.execute(10, new Object[] {Integer.valueOf(A361DisCod), A366DisEnt, A389DisPreMtr, A388DisPreKgm, Boolean.valueOf(n7510DisDto), A7510DisDto, Byte.valueOf(A378DisObsULin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
                        processLevel0V34( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption0V0( ) ;
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
            load0V34( ) ;
         }
         endLevel0V34( ) ;
      }
      closeExtendedTableCursors0V34( ) ;
   }

   public void update0V34( )
   {
      beforeValidate0V34( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V34( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V34( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V34( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0V34( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V13 */
                  pr_default.execute(11, new Object[] {A366DisEnt, A389DisPreMtr, A388DisPreKgm, Boolean.valueOf(n7510DisDto), A7510DisDto, Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDISPOS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0V34( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_int6[0] = A361DisCod ;
                     new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_int6) ;
                     tdisobs_impl.this.A396EmprCod = GXv_char4[0] ;
                     tdisobs_impl.this.A361DisCod = GXv_int6[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0V34( ) ;
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
         endLevel0V34( ) ;
      }
      closeExtendedTableCursors0V34( ) ;
   }

   public void deferredUpdate0V34( )
   {
   }

   public void delete( )
   {
      beforeValidate0V34( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V34( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0V34( ) ;
         afterConfirm0V34( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0V34( ) ;
            if ( AnyError == 0 )
            {
               A378DisObsULin = O378DisObsULin ;
               httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               scanStart0V40( ) ;
               while ( RcdFound40 != 0 )
               {
                  getByPrimaryKey0V40( ) ;
                  delete0V40( ) ;
                  scanNext0V40( ) ;
                  O378DisObsULin = A378DisObsULin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
               }
               scanEnd0V40( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
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
      sMode34 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0V34( ) ;
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0V34( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T000V15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T000V15_A407EmprNom[0] ;
         n407EmprNom = T000V15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000V16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Accesorios Tinte", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000V17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Normativas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T000V18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T000V19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISNOT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T000V20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DisPE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T000V21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISACC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T000V22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISCOM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T000V23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISREF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T000V24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T000V25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISDEF", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T000V26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISALB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void processNestedLevel0V40( )
   {
      s378DisObsULin = O378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow0V40( ) ;
         if ( ( nRcdExists_40 != 0 ) || ( nIsMod_40 != 0 ) )
         {
            standaloneNotModal0V40( ) ;
            getKey0V40( ) ;
            if ( ( nRcdExists_40 == 0 ) && ( nRcdDeleted_40 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0V40( ) ;
            }
            else
            {
               if ( RcdFound40 != 0 )
               {
                  if ( ( nRcdDeleted_40 != 0 ) && ( nRcdExists_40 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0V40( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_40 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0V40( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_40 == 0 )
                  {
                     GXCCtl = "DISOBSLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDisObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O378DisObsULin = A378DisObsULin ;
            httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
         }
         httpContext.changePostValue( edtDisObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtDisObsTxt_Internalname, GXutil.rtrim( A377DisObsTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_28_idx, GXutil.rtrim( Z377DisObsTxt)) ;
         httpContext.changePostValue( "T377DisObsTxt_"+sGXsfl_28_idx, GXutil.rtrim( O377DisObsTxt)) ;
         httpContext.changePostValue( "nRcdDeleted_40_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_40_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_40_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_40 != 0 )
         {
            httpContext.changePostValue( "DISOBSLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "DISOBSTXT_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0V40( ) ;
      if ( AnyError != 0 )
      {
         O378DisObsULin = s378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      nRcdExists_40 = (short)(0) ;
      nIsMod_40 = (short)(0) ;
      nRcdDeleted_40 = (short)(0) ;
   }

   public void processLevel0V34( )
   {
      /* Save parent mode. */
      sMode34 = Gx_mode ;
      processNestedLevel0V40( ) ;
      if ( AnyError != 0 )
      {
         O378DisObsULin = s378DisObsULin ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode34 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T000V27 */
      pr_default.execute(25, new Object[] {Byte.valueOf(A378DisObsULin), A396EmprCod, Integer.valueOf(A361DisCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISPOS");
   }

   public void endLevel0V34( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete0V34( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tdisobs");
         if ( AnyError == 0 )
         {
            confirmValues0V0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tdisobs");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0V34( )
   {
      /* Scan By routine */
      /* Using cursor T000V28 */
      pr_default.execute(26);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T000V28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T000V28_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0V34( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound34 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound34 = (short)(1) ;
         A396EmprCod = T000V28_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A361DisCod = T000V28_A361DisCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      }
   }

   public void scanEnd0V34( )
   {
      pr_default.close(26);
   }

   public void afterConfirm0V34( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0V34( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0V34( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0V34( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0V34( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0V34( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0V34( )
   {
      edtDisEnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisEnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisEnt_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtDisCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisCod_Enabled), 5, 0), true);
      edtDisPreMtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreMtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreMtr_Enabled), 5, 0), true);
      edtDisPreKgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisPreKgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisPreKgm_Enabled), 5, 0), true);
      edtDisDto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisDto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisDto_Enabled), 5, 0), true);
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm0V40( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z377DisObsTxt = T000V3_A377DisObsTxt[0] ;
         }
         else
         {
            Z377DisObsTxt = A377DisObsTxt ;
         }
      }
      if ( GX_JID == -15 )
      {
         Z361DisCod = A361DisCod ;
         Z376DisObsLin = A376DisObsLin ;
         Z377DisObsTxt = A377DisObsTxt ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal0V40( )
   {
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
      edtDisObsULin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsULin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsULin_Enabled), 5, 0), true);
   }

   public void standaloneModal0V40( )
   {
      if ( isIns( )  )
      {
         A378DisObsULin = (byte)(O378DisObsULin+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A376DisObsLin = A378DisObsULin ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtDisObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtDisObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void load0V40( )
   {
      /* Using cursor T000V29 */
      pr_default.execute(27, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(27) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A377DisObsTxt = T000V29_A377DisObsTxt[0] ;
         zm0V40( -15) ;
      }
      pr_default.close(27);
      onLoadActions0V40( ) ;
   }

   public void onLoadActions0V40( )
   {
      AV38oldObs = O377DisObsTxt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
   }

   public void checkExtendedTable0V40( )
   {
      nIsDirty_40 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal0V40( ) ;
      AV38oldObs = O377DisObsTxt ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
   }

   public void closeExtendedTableCursors0V40( )
   {
   }

   public void enableDisable0V40( )
   {
   }

   public void getKey0V40( )
   {
      /* Using cursor T000V30 */
      pr_default.execute(28, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound40 = (short)(1) ;
      }
      else
      {
         RcdFound40 = (short)(0) ;
      }
      pr_default.close(28);
   }

   public void getByPrimaryKey0V40( )
   {
      /* Using cursor T000V3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0V40( 15) ;
         RcdFound40 = (short)(1) ;
         initializeNonKey0V40( ) ;
         A376DisObsLin = T000V3_A376DisObsLin[0] ;
         A377DisObsTxt = T000V3_A377DisObsTxt[0] ;
         O377DisObsTxt = A377DisObsTxt ;
         Z396EmprCod = A396EmprCod ;
         Z361DisCod = A361DisCod ;
         Z376DisObsLin = A376DisObsLin ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load0V40( ) ;
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound40 = (short)(0) ;
         initializeNonKey0V40( ) ;
         sMode40 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0V40( ) ;
         Gx_mode = sMode40 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes0V40( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0V40( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T000V2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSERV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z377DisObsTxt, T000V2_A377DisObsTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z377DisObsTxt, T000V2_A377DisObsTxt[0]) != 0 )
            {
               GXutil.writeLogln("tdisobs:[seudo value changed for attri]"+"DisObsTxt");
               GXutil.writeLogRaw("Old: ",Z377DisObsTxt);
               GXutil.writeLogRaw("Current: ",T000V2_A377DisObsTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSERV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0V40( )
   {
      beforeValidate0V40( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V40( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0V40( 0) ;
         checkOptimisticConcurrency0V40( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0V40( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0V40( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000V31 */
                  pr_default.execute(29, new Object[] {Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin), A377DisObsTxt, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
                  if ( (pr_default.getStatus(29) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_int6[0] = A361DisCod ;
                        GXv_char3[0] = AV38oldObs ;
                        GXv_int7[0] = A376DisObsLin ;
                        GXv_char2[0] = A377DisObsTxt ;
                        GXv_char8[0] = AV23UsurCod ;
                        GXv_char9[0] = AV26Station ;
                        GXv_char10[0] = Gx_mode ;
                        new app.pprc171(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_char3, GXv_int7, GXv_char2, GXv_char8, GXv_char9, GXv_char10) ;
                        tdisobs_impl.this.A396EmprCod = GXv_char4[0] ;
                        tdisobs_impl.this.A361DisCod = GXv_int6[0] ;
                        tdisobs_impl.this.AV38oldObs = GXv_char3[0] ;
                        tdisobs_impl.this.A376DisObsLin = GXv_int7[0] ;
                        tdisobs_impl.this.A377DisObsTxt = GXv_char2[0] ;
                        tdisobs_impl.this.AV23UsurCod = GXv_char8[0] ;
                        tdisobs_impl.this.AV26Station = GXv_char9[0] ;
                        tdisobs_impl.this.Gx_mode = GXv_char10[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                        httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                        httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
                        httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
                        httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
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
            load0V40( ) ;
         }
         endLevel0V40( ) ;
      }
      closeExtendedTableCursors0V40( ) ;
   }

   public void update0V40( )
   {
      beforeValidate0V40( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0V40( ) ;
      }
      if ( ( nIsMod_40 != 0 ) || ( nIsDirty_40 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency0V40( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm0V40( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate0V40( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T000V32 */
                     pr_default.execute(30, new Object[] {A377DisObsTxt, A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
                     if ( (pr_default.getStatus(30) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSERV"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate0V40( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char10[0] = A396EmprCod ;
                        GXv_int6[0] = A361DisCod ;
                        new app.txpdisposupdateredundancy(remoteHandle, context).execute( GXv_char10, GXv_int6) ;
                        tdisobs_impl.this.A396EmprCod = GXv_char10[0] ;
                        tdisobs_impl.this.A361DisCod = GXv_int6[0] ;
                        /* Start of After( update) rules */
                        if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
                        {
                           GXv_char10[0] = A396EmprCod ;
                           GXv_int6[0] = A361DisCod ;
                           GXv_char9[0] = AV38oldObs ;
                           GXv_int7[0] = A376DisObsLin ;
                           GXv_char8[0] = A377DisObsTxt ;
                           GXv_char4[0] = AV23UsurCod ;
                           GXv_char3[0] = AV26Station ;
                           GXv_char2[0] = Gx_mode ;
                           new app.pprc171(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_char9, GXv_int7, GXv_char8, GXv_char4, GXv_char3, GXv_char2) ;
                           tdisobs_impl.this.A396EmprCod = GXv_char10[0] ;
                           tdisobs_impl.this.A361DisCod = GXv_int6[0] ;
                           tdisobs_impl.this.AV38oldObs = GXv_char9[0] ;
                           tdisobs_impl.this.A376DisObsLin = GXv_int7[0] ;
                           tdisobs_impl.this.A377DisObsTxt = GXv_char8[0] ;
                           tdisobs_impl.this.AV23UsurCod = GXv_char4[0] ;
                           tdisobs_impl.this.AV26Station = GXv_char3[0] ;
                           tdisobs_impl.this.Gx_mode = GXv_char2[0] ;
                           httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                           httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                           httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
                           httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
                           httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
                           httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        }
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey0V40( ) ;
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
            endLevel0V40( ) ;
         }
      }
      closeExtendedTableCursors0V40( ) ;
   }

   public void deferredUpdate0V40( )
   {
   }

   public void delete0V40( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0V40( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0V40( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0V40( ) ;
         afterConfirm0V40( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0V40( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000V33 */
               pr_default.execute(31, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), Byte.valueOf(A376DisObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSERV");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
                  {
                     GXv_char10[0] = A396EmprCod ;
                     GXv_int6[0] = A361DisCod ;
                     GXv_char9[0] = AV38oldObs ;
                     GXv_int7[0] = A376DisObsLin ;
                     GXv_char8[0] = A377DisObsTxt ;
                     GXv_char4[0] = AV23UsurCod ;
                     GXv_char3[0] = AV26Station ;
                     GXv_char2[0] = Gx_mode ;
                     new app.pprc171(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_char9, GXv_int7, GXv_char8, GXv_char4, GXv_char3, GXv_char2) ;
                     tdisobs_impl.this.A396EmprCod = GXv_char10[0] ;
                     tdisobs_impl.this.A361DisCod = GXv_int6[0] ;
                     tdisobs_impl.this.AV38oldObs = GXv_char9[0] ;
                     tdisobs_impl.this.A376DisObsLin = GXv_int7[0] ;
                     tdisobs_impl.this.A377DisObsTxt = GXv_char8[0] ;
                     tdisobs_impl.this.AV23UsurCod = GXv_char4[0] ;
                     tdisobs_impl.this.AV26Station = GXv_char3[0] ;
                     tdisobs_impl.this.Gx_mode = GXv_char2[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
                     httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
                     httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  }
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
      sMode40 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0V40( ) ;
      Gx_mode = sMode40 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0V40( )
   {
      standaloneModal0V40( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV38oldObs = O377DisObsTxt ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
      }
   }

   public void endLevel0V40( )
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

   public void scanStart0V40( )
   {
      /* Scan By routine */
      /* Using cursor T000V34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod)});
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A376DisObsLin = T000V34_A376DisObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0V40( )
   {
      /* Scan next routine */
      pr_default.readNext(32);
      RcdFound40 = (short)(0) ;
      if ( (pr_default.getStatus(32) != 101) )
      {
         RcdFound40 = (short)(1) ;
         A376DisObsLin = T000V34_A376DisObsLin[0] ;
      }
   }

   public void scanEnd0V40( )
   {
      pr_default.close(32);
   }

   public void afterConfirm0V40( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0V40( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0V40( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0V40( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0V40( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0V40( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0V40( )
   {
      edtDisObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtDisObsTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsTxt_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashes0V40( )
   {
   }

   public void send_integrity_lvl_hashes0V34( )
   {
   }

   public void subsflControlProps_2840( )
   {
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_28_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_2840( )
   {
      edtDisObsLin_Internalname = "DISOBSLIN_"+sGXsfl_28_fel_idx ;
      edtDisObsTxt_Internalname = "DISOBSTXT_"+sGXsfl_28_fel_idx ;
   }

   public void addRow0V40( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2840( ) ;
      sendRow0V40( ) ;
   }

   public void sendRow0V40( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_40_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "WWActionColumn" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A376DisObsLin), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsLin_Jsonclick,Integer.valueOf(0),"WWActionColumn","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_40_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisObsTxt_Internalname,GXutil.rtrim( A377DisObsTxt),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisObsTxt_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtDisObsTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes0V40( ) ;
      GXCCtl = "Z376DisObsLin_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z376DisObsLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z377DisObsTxt_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z377DisObsTxt));
      GXCCtl = "O377DisObsTxt_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( O377DisObsTxt));
      GXCCtl = "nRcdDeleted_40_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_40_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_40_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_40, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV25EmprCod));
      GXCCtl = "vDISCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV39DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISOBSTXT_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow0V40( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2840( ) ;
      edtDisObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtDisObsTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "DISOBSTXT_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
      {
         GXCCtl = "DISOBSLIN_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtDisObsLin_Internalname ;
         wbErr = true ;
         A376DisObsLin = (byte)(0) ;
      }
      else
      {
         A376DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtDisObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A377DisObsTxt = httpContext.cgiGet( edtDisObsTxt_Internalname) ;
      GXCCtl = "Z376DisObsLin_" + sGXsfl_28_idx ;
      Z376DisObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z377DisObsTxt_" + sGXsfl_28_idx ;
      Z377DisObsTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "O377DisObsTxt_" + sGXsfl_28_idx ;
      O377DisObsTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_40_" + sGXsfl_28_idx ;
      nRcdDeleted_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_40_" + sGXsfl_28_idx ;
      nRcdExists_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_40_" + sGXsfl_28_idx ;
      nIsMod_40 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtDisObsLin_Enabled = edtDisObsLin_Enabled ;
   }

   public void confirmValues0V0( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2840( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2840( ) ;
         httpContext.changePostValue( "Z376DisObsLin_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z376DisObsLin_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z376DisObsLin_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z377DisObsTxt_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z377DisObsTxt_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z377DisObsTxt_"+sGXsfl_28_idx) ;
      }
      httpContext.changePostValue( "O377DisObsTxt", httpContext.cgiGet( "T377DisObsTxt")) ;
      httpContext.deletePostValue( "T377DisObsTxt") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tdisobs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TDISOBS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tdisobs:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z361DisCod", GXutil.ltrim( localUtil.ntoc( Z361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z366DisEnt", GXutil.rtrim( Z366DisEnt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z389DisPreMtr", GXutil.ltrim( localUtil.ntoc( Z389DisPreMtr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z388DisPreKgm", GXutil.ltrim( localUtil.ntoc( Z388DisPreKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7510DisDto", GXutil.ltrim( localUtil.ntoc( Z7510DisDto, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z378DisObsULin", GXutil.ltrim( localUtil.ntoc( Z378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O378DisObsULin", GXutil.ltrim( localUtil.ntoc( O378DisObsULin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV39DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39DisCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOLDOBS", GXutil.rtrim( AV38oldObs));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV26Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV23UsurCod));
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
      return formatLink("app.tdisobs", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV39DisCod,8,0))}, new String[] {"Gx_mode","EmprCod","DisCod"})  ;
   }

   public String getPgmname( )
   {
      return "TDISOBS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "OBSERVACIONES", "") ;
   }

   public void initializeNonKey0V34( )
   {
      A366DisEnt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A366DisEnt", A366DisEnt);
      A389DisPreMtr = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A389DisPreMtr", GXutil.ltrimstr( A389DisPreMtr, 10, 2));
      A388DisPreKgm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A388DisPreKgm", GXutil.ltrimstr( A388DisPreKgm, 10, 2));
      A7510DisDto = DecimalUtil.ZERO ;
      n7510DisDto = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7510DisDto", GXutil.ltrimstr( A7510DisDto, 6, 2));
      A378DisObsULin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      O378DisObsULin = A378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
      Z366DisEnt = "" ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z7510DisDto = DecimalUtil.ZERO ;
      Z378DisObsULin = (byte)(0) ;
   }

   public void initAll0V34( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A361DisCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
      initializeNonKey0V34( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0V40( )
   {
      AV38oldObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
      A377DisObsTxt = "" ;
      O377DisObsTxt = A377DisObsTxt ;
      Z377DisObsTxt = "" ;
   }

   public void initAll0V40( )
   {
      A376DisObsLin = (byte)(0) ;
      initializeNonKey0V40( ) ;
   }

   public void standaloneModalInsert0V40( )
   {
      A378DisObsULin = i378DisObsULin ;
      httpContext.ajax_rsp_assign_attri("", false, "A378DisObsULin", GXutil.str( A378DisObsULin, 1, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165758", true, true);
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
      httpContext.AddJavascriptSource("tdisobs.js", "?2026821165758", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties40( )
   {
      edtDisObsLin_Enabled = defedtDisObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtDisObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDisObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A377DisObsTxt));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtDisObsTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtDisEnt_Internalname = "DISENT" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      edtDisObsLin_Internalname = "DISOBSLIN" ;
      edtDisObsTxt_Internalname = "DISOBSTXT" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtDisCod_Internalname = "DISCOD" ;
      edtDisPreMtr_Internalname = "DISPREMTR" ;
      edtDisPreKgm_Internalname = "DISPREKGM" ;
      edtDisDto_Internalname = "DISDTO" ;
      edtDisObsULin_Internalname = "DISOBSULIN" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "OBSERVACIONES", "") );
      edtDisObsTxt_Jsonclick = "" ;
      edtDisObsLin_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtDisObsTxt_Enabled = 1 ;
      edtDisObsLin_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtDisObsULin_Jsonclick = "" ;
      edtDisObsULin_Enabled = 0 ;
      edtDisObsULin_Visible = 1 ;
      edtDisDto_Jsonclick = "" ;
      edtDisDto_Enabled = 1 ;
      edtDisDto_Visible = 1 ;
      edtDisPreKgm_Jsonclick = "" ;
      edtDisPreKgm_Enabled = 1 ;
      edtDisPreKgm_Visible = 1 ;
      edtDisPreMtr_Jsonclick = "" ;
      edtDisPreMtr_Enabled = 1 ;
      edtDisPreMtr_Visible = 1 ;
      edtDisCod_Jsonclick = "" ;
      edtDisCod_Enabled = 1 ;
      edtDisCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDisEnt_Jsonclick = "" ;
      edtDisEnt_Enabled = 1 ;
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

   public void xc_12_0V40( String A396EmprCod ,
                           int A361DisCod ,
                           String AV38oldObs ,
                           byte A376DisObsLin ,
                           String A377DisObsTxt ,
                           String AV23UsurCod ,
                           String AV26Station ,
                           String Gx_mode )
   {
      if ( true /* Level */ && ( true /* After */ || true /* After */ || true /* After */ ) )
      {
         GXv_char10[0] = A396EmprCod ;
         GXv_int6[0] = A361DisCod ;
         GXv_char9[0] = AV38oldObs ;
         GXv_int7[0] = A376DisObsLin ;
         GXv_char8[0] = A377DisObsTxt ;
         GXv_char4[0] = AV23UsurCod ;
         GXv_char3[0] = AV26Station ;
         GXv_char2[0] = Gx_mode ;
         new app.pprc171(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_char9, GXv_int7, GXv_char8, GXv_char4, GXv_char3, GXv_char2) ;
         A396EmprCod = GXv_char10[0] ;
         A361DisCod = GXv_int6[0] ;
         AV38oldObs = GXv_char9[0] ;
         A376DisObsLin = GXv_int7[0] ;
         A377DisObsTxt = GXv_char8[0] ;
         AV23UsurCod = GXv_char4[0] ;
         AV26Station = GXv_char3[0] ;
         Gx_mode = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A361DisCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A361DisCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", AV38oldObs);
         httpContext.ajax_rsp_assign_attri("", false, "AV23UsurCod", AV23UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV26Station", AV26Station);
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV38oldObs))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A376DisObsLin, (byte)(1), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A377DisObsTxt))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV23UsurCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV26Station))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( Gx_mode))+"\"") ;
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
      subsflControlProps_2840( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0V40( ) ;
         standaloneModal0V40( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow0V40( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2840( ) ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T000V15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T000V15_A407EmprNom[0] ;
      n407EmprNom = T000V15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Disobstxt( )
   {
      AV38oldObs = O377DisObsTxt ;
      O377DisObsTxt = A377DisObsTxt ;
      O378DisObsULin = A378DisObsULin ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV38oldObs", GXutil.rtrim( AV38oldObs));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV39DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV39DisCod',fld:'vDISCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e120V2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_DISCOD","{handler:'valid_Discod',iparms:[]");
      setEventMetadata("VALID_DISCOD",",oparms:[]}");
      setEventMetadata("VALID_DISOBSULIN","{handler:'valid_Disobsulin',iparms:[]");
      setEventMetadata("VALID_DISOBSULIN",",oparms:[]}");
      setEventMetadata("VALID_DISOBSLIN","{handler:'valid_Disobslin',iparms:[]");
      setEventMetadata("VALID_DISOBSLIN",",oparms:[]}");
      setEventMetadata("VALID_DISOBSTXT","{handler:'valid_Disobstxt',iparms:[{av:'A378DisObsULin',fld:'DISOBSULIN',pic:'9'},{av:'O377DisObsTxt'},{av:'A377DisObsTxt',fld:'DISOBSTXT',pic:''},{av:'AV38oldObs',fld:'vOLDOBS',pic:''}]");
      setEventMetadata("VALID_DISOBSTXT",",oparms:[{av:'AV38oldObs',fld:'vOLDOBS',pic:''}]}");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV25EmprCod = "" ;
      Z396EmprCod = "" ;
      Z366DisEnt = "" ;
      Z389DisPreMtr = DecimalUtil.ZERO ;
      Z388DisPreKgm = DecimalUtil.ZERO ;
      Z7510DisDto = DecimalUtil.ZERO ;
      Z377DisObsTxt = "" ;
      O377DisObsTxt = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV38oldObs = "" ;
      A377DisObsTxt = "" ;
      AV23UsurCod = "" ;
      AV26Station = "" ;
      Gx_mode = "" ;
      AV25EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A366DisEnt = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A389DisPreMtr = DecimalUtil.ZERO ;
      A388DisPreKgm = DecimalUtil.ZERO ;
      A7510DisDto = DecimalUtil.ZERO ;
      A407EmprNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode40 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode34 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      T377DisObsTxt = "" ;
      AV27EmprNom = "" ;
      GXt_char1 = "" ;
      AV40WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV41TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV42WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T000V6_A407EmprNom = new String[] {""} ;
      T000V6_n407EmprNom = new boolean[] {false} ;
      T000V7_A361DisCod = new int[1] ;
      T000V7_A366DisEnt = new String[] {""} ;
      T000V7_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V7_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V7_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V7_n7510DisDto = new boolean[] {false} ;
      T000V7_A378DisObsULin = new byte[1] ;
      T000V7_A407EmprNom = new String[] {""} ;
      T000V7_n407EmprNom = new boolean[] {false} ;
      T000V7_A396EmprCod = new String[] {""} ;
      T000V8_A407EmprNom = new String[] {""} ;
      T000V8_n407EmprNom = new boolean[] {false} ;
      T000V9_A396EmprCod = new String[] {""} ;
      T000V9_A361DisCod = new int[1] ;
      T000V5_A361DisCod = new int[1] ;
      T000V5_A366DisEnt = new String[] {""} ;
      T000V5_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V5_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V5_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V5_n7510DisDto = new boolean[] {false} ;
      T000V5_A378DisObsULin = new byte[1] ;
      T000V5_A396EmprCod = new String[] {""} ;
      T000V10_A396EmprCod = new String[] {""} ;
      T000V10_A361DisCod = new int[1] ;
      T000V11_A396EmprCod = new String[] {""} ;
      T000V11_A361DisCod = new int[1] ;
      T000V4_A361DisCod = new int[1] ;
      T000V4_A366DisEnt = new String[] {""} ;
      T000V4_A389DisPreMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V4_A388DisPreKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V4_A7510DisDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T000V4_n7510DisDto = new boolean[] {false} ;
      T000V4_A378DisObsULin = new byte[1] ;
      T000V4_A396EmprCod = new String[] {""} ;
      T000V15_A407EmprNom = new String[] {""} ;
      T000V15_n407EmprNom = new boolean[] {false} ;
      T000V16_A396EmprCod = new String[] {""} ;
      T000V16_A361DisCod = new int[1] ;
      T000V16_A13376DisTraID = new String[] {""} ;
      T000V17_A396EmprCod = new String[] {""} ;
      T000V17_A361DisCod = new int[1] ;
      T000V17_A13213DisNormID = new String[] {""} ;
      T000V18_A396EmprCod = new String[] {""} ;
      T000V18_A361DisCod = new int[1] ;
      T000V18_A13081DisDGLin = new byte[1] ;
      T000V18_A13082DisDGDibCl = new String[] {""} ;
      T000V18_A13083DisDGDibIn = new int[1] ;
      T000V18_A13084DisDGComb = new String[] {""} ;
      T000V18_A13085DisDGFondo = new String[] {""} ;
      T000V19_A396EmprCod = new String[] {""} ;
      T000V19_A361DisCod = new int[1] ;
      T000V19_A7068DisNotLin = new byte[1] ;
      T000V20_A396EmprCod = new String[] {""} ;
      T000V20_A361DisCod = new int[1] ;
      T000V20_A10197ProEspCod = new String[] {""} ;
      T000V21_A396EmprCod = new String[] {""} ;
      T000V21_A361DisCod = new int[1] ;
      T000V21_A4594AccCod = new short[1] ;
      T000V22_A396EmprCod = new String[] {""} ;
      T000V22_A361DisCod = new int[1] ;
      T000V22_A2524DisComLin = new byte[1] ;
      T000V22_A1056DisComCod = new String[] {""} ;
      T000V22_A1032FonCod = new String[] {""} ;
      T000V23_A396EmprCod = new String[] {""} ;
      T000V23_A361DisCod = new int[1] ;
      T000V23_A3398DisRefBarC = new int[1] ;
      T000V23_A3399DisRefBCRe = new byte[1] ;
      T000V23_A3400DisRefBCPa = new String[] {""} ;
      T000V23_A3607DisRefBPie = new String[] {""} ;
      T000V24_A396EmprCod = new String[] {""} ;
      T000V24_A361DisCod = new int[1] ;
      T000V24_A758ProCod = new String[] {""} ;
      T000V25_A396EmprCod = new String[] {""} ;
      T000V25_A361DisCod = new int[1] ;
      T000V25_A833TipDefCod = new short[1] ;
      T000V26_A396EmprCod = new String[] {""} ;
      T000V26_A361DisCod = new int[1] ;
      T000V26_A44AlbRecCod = new int[1] ;
      T000V28_A396EmprCod = new String[] {""} ;
      T000V28_A361DisCod = new int[1] ;
      T000V29_A361DisCod = new int[1] ;
      T000V29_A376DisObsLin = new byte[1] ;
      T000V29_A377DisObsTxt = new String[] {""} ;
      T000V29_A396EmprCod = new String[] {""} ;
      T000V30_A396EmprCod = new String[] {""} ;
      T000V30_A361DisCod = new int[1] ;
      T000V30_A376DisObsLin = new byte[1] ;
      T000V3_A361DisCod = new int[1] ;
      T000V3_A376DisObsLin = new byte[1] ;
      T000V3_A377DisObsTxt = new String[] {""} ;
      T000V3_A396EmprCod = new String[] {""} ;
      T000V2_A361DisCod = new int[1] ;
      T000V2_A376DisObsLin = new byte[1] ;
      T000V2_A377DisObsTxt = new String[] {""} ;
      T000V2_A396EmprCod = new String[] {""} ;
      T000V34_A396EmprCod = new String[] {""} ;
      T000V34_A361DisCod = new int[1] ;
      T000V34_A376DisObsLin = new byte[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      GXv_char10 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_char9 = new String[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      ZV38oldObs = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tdisobs__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tdisobs__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tdisobs__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tdisobs__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tdisobs__default(),
         new Object[] {
             new Object[] {
            T000V2_A361DisCod, T000V2_A376DisObsLin, T000V2_A377DisObsTxt, T000V2_A396EmprCod
            }
            , new Object[] {
            T000V3_A361DisCod, T000V3_A376DisObsLin, T000V3_A377DisObsTxt, T000V3_A396EmprCod
            }
            , new Object[] {
            T000V4_A361DisCod, T000V4_A366DisEnt, T000V4_A389DisPreMtr, T000V4_A388DisPreKgm, T000V4_A7510DisDto, T000V4_n7510DisDto, T000V4_A378DisObsULin, T000V4_A396EmprCod
            }
            , new Object[] {
            T000V5_A361DisCod, T000V5_A366DisEnt, T000V5_A389DisPreMtr, T000V5_A388DisPreKgm, T000V5_A7510DisDto, T000V5_n7510DisDto, T000V5_A378DisObsULin, T000V5_A396EmprCod
            }
            , new Object[] {
            T000V6_A407EmprNom, T000V6_n407EmprNom
            }
            , new Object[] {
            T000V7_A361DisCod, T000V7_A366DisEnt, T000V7_A389DisPreMtr, T000V7_A388DisPreKgm, T000V7_A7510DisDto, T000V7_n7510DisDto, T000V7_A378DisObsULin, T000V7_A407EmprNom, T000V7_n407EmprNom, T000V7_A396EmprCod
            }
            , new Object[] {
            T000V8_A407EmprNom, T000V8_n407EmprNom
            }
            , new Object[] {
            T000V9_A396EmprCod, T000V9_A361DisCod
            }
            , new Object[] {
            T000V10_A396EmprCod, T000V10_A361DisCod
            }
            , new Object[] {
            T000V11_A396EmprCod, T000V11_A361DisCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000V15_A407EmprNom, T000V15_n407EmprNom
            }
            , new Object[] {
            T000V16_A396EmprCod, T000V16_A361DisCod, T000V16_A13376DisTraID
            }
            , new Object[] {
            T000V17_A396EmprCod, T000V17_A361DisCod, T000V17_A13213DisNormID
            }
            , new Object[] {
            T000V18_A396EmprCod, T000V18_A361DisCod, T000V18_A13081DisDGLin, T000V18_A13082DisDGDibCl, T000V18_A13083DisDGDibIn, T000V18_A13084DisDGComb, T000V18_A13085DisDGFondo
            }
            , new Object[] {
            T000V19_A396EmprCod, T000V19_A361DisCod, T000V19_A7068DisNotLin
            }
            , new Object[] {
            T000V20_A396EmprCod, T000V20_A361DisCod, T000V20_A10197ProEspCod
            }
            , new Object[] {
            T000V21_A396EmprCod, T000V21_A361DisCod, T000V21_A4594AccCod
            }
            , new Object[] {
            T000V22_A396EmprCod, T000V22_A361DisCod, T000V22_A2524DisComLin, T000V22_A1056DisComCod, T000V22_A1032FonCod
            }
            , new Object[] {
            T000V23_A396EmprCod, T000V23_A361DisCod, T000V23_A3398DisRefBarC, T000V23_A3399DisRefBCRe, T000V23_A3400DisRefBCPa, T000V23_A3607DisRefBPie
            }
            , new Object[] {
            T000V24_A396EmprCod, T000V24_A361DisCod, T000V24_A758ProCod
            }
            , new Object[] {
            T000V25_A396EmprCod, T000V25_A361DisCod, T000V25_A833TipDefCod
            }
            , new Object[] {
            T000V26_A396EmprCod, T000V26_A361DisCod, T000V26_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            T000V28_A396EmprCod, T000V28_A361DisCod
            }
            , new Object[] {
            T000V29_A361DisCod, T000V29_A376DisObsLin, T000V29_A377DisObsTxt, T000V29_A396EmprCod
            }
            , new Object[] {
            T000V30_A396EmprCod, T000V30_A361DisCod, T000V30_A376DisObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000V34_A396EmprCod, T000V34_A361DisCod, T000V34_A376DisObsLin
            }
         }
      );
   }

   private byte Z378DisObsULin ;
   private byte O378DisObsULin ;
   private byte Z376DisObsLin ;
   private byte GxWebError ;
   private byte A376DisObsLin ;
   private byte nKeyPressed ;
   private byte A378DisObsULin ;
   private byte Gx_BScreen ;
   private byte B378DisObsULin ;
   private byte s378DisObsULin ;
   private byte subGridlevel_level1_Backcolorstyle ;
   private byte subGridlevel_level1_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i378DisObsULin ;
   private byte subGridlevel_level1_Allowselection ;
   private byte subGridlevel_level1_Allowhovering ;
   private byte subGridlevel_level1_Allowcollapsing ;
   private byte subGridlevel_level1_Collapsed ;
   private byte GXv_int7[] ;
   private short nRcdDeleted_40 ;
   private short nRcdExists_40 ;
   private short nIsMod_40 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount40 ;
   private short RcdFound40 ;
   private short nBlankRcdUsr40 ;
   private short RcdFound34 ;
   private short nIsDirty_34 ;
   private short nIsDirty_40 ;
   private int wcpOAV39DisCod ;
   private int Z361DisCod ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int A361DisCod ;
   private int AV39DisCod ;
   private int trnEnded ;
   private int edtDisEnt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtDisCod_Visible ;
   private int edtDisCod_Enabled ;
   private int edtDisPreMtr_Enabled ;
   private int edtDisPreMtr_Visible ;
   private int edtDisPreKgm_Enabled ;
   private int edtDisPreKgm_Visible ;
   private int edtDisDto_Enabled ;
   private int edtDisDto_Visible ;
   private int edtDisObsULin_Enabled ;
   private int edtDisObsULin_Visible ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtDisObsLin_Enabled ;
   private int edtDisObsTxt_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtDisObsLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int GXv_int6[] ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z389DisPreMtr ;
   private java.math.BigDecimal Z388DisPreKgm ;
   private java.math.BigDecimal Z7510DisDto ;
   private java.math.BigDecimal A389DisPreMtr ;
   private java.math.BigDecimal A388DisPreKgm ;
   private java.math.BigDecimal A7510DisDto ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV25EmprCod ;
   private String Z396EmprCod ;
   private String Z366DisEnt ;
   private String Z377DisObsTxt ;
   private String O377DisObsTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV38oldObs ;
   private String A377DisObsTxt ;
   private String AV23UsurCod ;
   private String AV26Station ;
   private String Gx_mode ;
   private String AV25EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDisEnt_Internalname ;
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
   private String A366DisEnt ;
   private String edtDisEnt_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtDisCod_Internalname ;
   private String edtDisCod_Jsonclick ;
   private String edtDisPreMtr_Internalname ;
   private String edtDisPreMtr_Jsonclick ;
   private String edtDisPreKgm_Internalname ;
   private String edtDisPreKgm_Jsonclick ;
   private String edtDisDto_Internalname ;
   private String edtDisDto_Jsonclick ;
   private String edtDisObsULin_Internalname ;
   private String edtDisObsULin_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode40 ;
   private String edtDisObsLin_Internalname ;
   private String edtDisObsTxt_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode34 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String T377DisObsTxt ;
   private String AV27EmprNom ;
   private String GXt_char1 ;
   private String Z407EmprNom ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtDisObsLin_Jsonclick ;
   private String edtDisObsTxt_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String ZV38oldObs ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
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
   private boolean n7510DisDto ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV42WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T000V6_A407EmprNom ;
   private boolean[] T000V6_n407EmprNom ;
   private int[] T000V7_A361DisCod ;
   private String[] T000V7_A366DisEnt ;
   private java.math.BigDecimal[] T000V7_A389DisPreMtr ;
   private java.math.BigDecimal[] T000V7_A388DisPreKgm ;
   private java.math.BigDecimal[] T000V7_A7510DisDto ;
   private boolean[] T000V7_n7510DisDto ;
   private byte[] T000V7_A378DisObsULin ;
   private String[] T000V7_A407EmprNom ;
   private boolean[] T000V7_n407EmprNom ;
   private String[] T000V7_A396EmprCod ;
   private String[] T000V8_A407EmprNom ;
   private boolean[] T000V8_n407EmprNom ;
   private String[] T000V9_A396EmprCod ;
   private int[] T000V9_A361DisCod ;
   private int[] T000V5_A361DisCod ;
   private String[] T000V5_A366DisEnt ;
   private java.math.BigDecimal[] T000V5_A389DisPreMtr ;
   private java.math.BigDecimal[] T000V5_A388DisPreKgm ;
   private java.math.BigDecimal[] T000V5_A7510DisDto ;
   private boolean[] T000V5_n7510DisDto ;
   private byte[] T000V5_A378DisObsULin ;
   private String[] T000V5_A396EmprCod ;
   private String[] T000V10_A396EmprCod ;
   private int[] T000V10_A361DisCod ;
   private String[] T000V11_A396EmprCod ;
   private int[] T000V11_A361DisCod ;
   private int[] T000V4_A361DisCod ;
   private String[] T000V4_A366DisEnt ;
   private java.math.BigDecimal[] T000V4_A389DisPreMtr ;
   private java.math.BigDecimal[] T000V4_A388DisPreKgm ;
   private java.math.BigDecimal[] T000V4_A7510DisDto ;
   private boolean[] T000V4_n7510DisDto ;
   private byte[] T000V4_A378DisObsULin ;
   private String[] T000V4_A396EmprCod ;
   private String[] T000V15_A407EmprNom ;
   private boolean[] T000V15_n407EmprNom ;
   private String[] T000V16_A396EmprCod ;
   private int[] T000V16_A361DisCod ;
   private String[] T000V16_A13376DisTraID ;
   private String[] T000V17_A396EmprCod ;
   private int[] T000V17_A361DisCod ;
   private String[] T000V17_A13213DisNormID ;
   private String[] T000V18_A396EmprCod ;
   private int[] T000V18_A361DisCod ;
   private byte[] T000V18_A13081DisDGLin ;
   private String[] T000V18_A13082DisDGDibCl ;
   private int[] T000V18_A13083DisDGDibIn ;
   private String[] T000V18_A13084DisDGComb ;
   private String[] T000V18_A13085DisDGFondo ;
   private String[] T000V19_A396EmprCod ;
   private int[] T000V19_A361DisCod ;
   private byte[] T000V19_A7068DisNotLin ;
   private String[] T000V20_A396EmprCod ;
   private int[] T000V20_A361DisCod ;
   private String[] T000V20_A10197ProEspCod ;
   private String[] T000V21_A396EmprCod ;
   private int[] T000V21_A361DisCod ;
   private short[] T000V21_A4594AccCod ;
   private String[] T000V22_A396EmprCod ;
   private int[] T000V22_A361DisCod ;
   private byte[] T000V22_A2524DisComLin ;
   private String[] T000V22_A1056DisComCod ;
   private String[] T000V22_A1032FonCod ;
   private String[] T000V23_A396EmprCod ;
   private int[] T000V23_A361DisCod ;
   private int[] T000V23_A3398DisRefBarC ;
   private byte[] T000V23_A3399DisRefBCRe ;
   private String[] T000V23_A3400DisRefBCPa ;
   private String[] T000V23_A3607DisRefBPie ;
   private String[] T000V24_A396EmprCod ;
   private int[] T000V24_A361DisCod ;
   private String[] T000V24_A758ProCod ;
   private String[] T000V25_A396EmprCod ;
   private int[] T000V25_A361DisCod ;
   private short[] T000V25_A833TipDefCod ;
   private String[] T000V26_A396EmprCod ;
   private int[] T000V26_A361DisCod ;
   private int[] T000V26_A44AlbRecCod ;
   private String[] T000V28_A396EmprCod ;
   private int[] T000V28_A361DisCod ;
   private int[] T000V29_A361DisCod ;
   private byte[] T000V29_A376DisObsLin ;
   private String[] T000V29_A377DisObsTxt ;
   private String[] T000V29_A396EmprCod ;
   private String[] T000V30_A396EmprCod ;
   private int[] T000V30_A361DisCod ;
   private byte[] T000V30_A376DisObsLin ;
   private int[] T000V3_A361DisCod ;
   private byte[] T000V3_A376DisObsLin ;
   private String[] T000V3_A377DisObsTxt ;
   private String[] T000V3_A396EmprCod ;
   private int[] T000V2_A361DisCod ;
   private byte[] T000V2_A376DisObsLin ;
   private String[] T000V2_A377DisObsTxt ;
   private String[] T000V2_A396EmprCod ;
   private String[] T000V34_A396EmprCod ;
   private int[] T000V34_A361DisCod ;
   private byte[] T000V34_A376DisObsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV40WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV41TrnContext ;
}

final  class tdisobs__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisobs__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisobs__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisobs__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tdisobs__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000V2", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?  FOR UPDATE OF DisObsTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V3", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V4", "SELECT DisCod, DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ?  FOR UPDATE OF DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V5", "SELECT DisCod, DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin, EmprCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V7", "SELECT /*+ FIRST_ROWS(100) */ TM1.DisCod, TM1.DisEnt, TM1.DisPreMtr, TM1.DisPreKgm, TM1.DisDto, TM1.DisObsULin, T2.EmprNom, TM1.EmprCod FROM (TXPDISPOS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.DisCod = ? ORDER BY TM1.EmprCod, TM1.DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? AND DisCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod > ? or EmprCod = ? and DisCod > ?) ORDER BY EmprCod, DisCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DisCod FROM TXPDISPOS WHERE ( EmprCod < ? or EmprCod = ? and DisCod < ?) ORDER BY EmprCod DESC, DisCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000V12", "INSERT INTO TXPDISPOS(DisCod, DisEnt, DisPreMtr, DisPreKgm, DisDto, DisObsULin, EmprCod, DisDes, DisArtCod, DisNumPie, DisNumUni, DisUniMed, DisArtPes, PriCod, DisCliNum, DisFecCli, DisFec, DisFecEnt, DisColNom, DisColNum, DisTipCol, DisArtDsc, DisArtMat, DisArtLar, DisArtSua, DisArtAca, DisArtPle, DisArtTip, DisArtEnc, DisArtCor, DisArtOpe, DisArtTr1, DisArtPt1, DisArtTr2, DisArtPt2, DisArtTr3, DisArtPt3, DisArtRdt, DisArtUrg, DisArtUr1, DisArtPu1, DisArtUr2, DisArtPu2, DisArtUr3, DisArtPu3, DisArtAnh, DisEst, DisPieLan, DisKgmLan, DisMtrLan, DisNMtr, DisNMez, DisNumTen, MaqCodDis, PartCod, CliCod, TipConCod, DisNomCli, DisNumCli, DisEncCom, DisEncAnh, DisGraCru, DisArtAn1, DisArtAcb, DisArtAc2, DisLoc, DisPart, DisGraAca, DisRdoN, DisRdoA, DisRes, DisTipDis, DisNumBas, DisCliDes, DisManCod, DisOpeAnt, DisCodTex, DisNumTex1, DisNumTex2, DisNumLot, DisKgsLot, DisMtrLot, DisPla, DisPle2, DisNumCor, DisAncSal1, DisAncSal2, DisAncSal3, DisGraAca2, DisGraCru2, DisFac, DisManCod1, DisManCod2, DisNumTon, DisFecLan, RetCod, DisArtMer, EmpesCod, DibCli, DibInt, DisNumCol, DisObs, DisComULin, DisEnv, DisTin, DisNPzas, DisNPzasL, DisUsrCod, DisPelAnh, DisCruMts, DisCruKgs, DisCruEnr, DisLotMts, DisLotKgs, DisAcaBak, DisAcaAnh, DisAcaMar, DisMdlCod, DisTam, DisHorEnt, DisHorReg, DisDishCod, DisNroCor, DisEncCli, DibColDib, DisTipEst, DisGraCob, DisCom, DisEstTip, DisAcc, DisTipCor, DisObsGrm, DisObsAnc, DisAntp, DisAntpT, DisVolMaq, DisRbMaq, DisFacSep, DisFacGra, DisOrdSep, DisOrdGra, DisDesCol, DisGraTam, DisRec, DisMaqEst, DisExp, DisFEnt, DisDest, DisFchT, DisItem1, DisItem2, DisItem3, DisItem4, DisItem5, DisItem6, Cod_Idtx, DisFecPed, DisLotPza, DisLotMaq, DisAcaFor, DibColCol, DisDibCoCN, DibColColN, DisDibCoDN, DisUltNot, DisParCod, DisParReo, DisParPar, DisMemo1, DisMemo2, MarcaId, DisOrdComp, DisCnoEncO, Nxt_modelo, CpteId, Nxt_statio, DesaID, DptoID, Nxt_artcli, RevenID, DisPriorid, DisTpEstam, DisProdID, DisOEKOTEX, DisLineaID, DisCanalID, DisLinPrd, DisDGUltli, DisRGB, DisRdto4, DisTallUlt, DisIdtx2, DisArtDsc2, DisPrePz) VALUES(?, ?, ?, ?, ?, ?, ?, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, 0, 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', 0, 0, 0, 0, 0, ' ', ' ', 0, 0, 0, 0, 0, 0, ' ', 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, ' ', 0, 0, 0, ' ', 0, 0, ' ', 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', ' ', 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', 0, 0, ' ', 0, 0, 0, 0, ' ', ' ', 0)", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T000V13", "UPDATE TXPDISPOS SET DisEnt=?, DisPreMtr=?, DisPreKgm=?, DisDto=?, DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new UpdateCursor("T000V14", "DELETE FROM TXPDISPOS  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T000V15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V16", "SELECT * FROM (SELECT EmprCod, DisCod, DisTraID FROM TXPDISATI WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V17", "SELECT * FROM (SELECT EmprCod, DisCod, DisNormID FROM TXPDISNOR WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V18", "SELECT * FROM (SELECT EmprCod, DisCod, DisDGLin, DisDGDibCl, DisDGDibIn, DisDGComb, DisDGFondo FROM TXPDIGCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V19", "SELECT * FROM (SELECT EmprCod, DisCod, DisNotLin FROM TXPDISNOT WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V20", "SELECT * FROM (SELECT EmprCod, DisCod, ProEspCod FROM TXPDisPE WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V21", "SELECT * FROM (SELECT EmprCod, DisCod, AccCod FROM TXPDISACC WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V22", "SELECT * FROM (SELECT EmprCod, DisCod, DisComLin, DisComCod, FonCod FROM TXPDISCOM WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V23", "SELECT * FROM (SELECT EmprCod, DisCod, DisRefBarC, DisRefBCRe, DisRefBCPa, DisRefBPie FROM TXPDISREF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V24", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V25", "SELECT * FROM (SELECT EmprCod, DisCod, TipDefCod FROM TXPDISDEF WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T000V26", "SELECT * FROM (SELECT EmprCod, DisCod, AlbRecCod FROM TXPDISALB WHERE EmprCod = ? AND DisCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T000V27", "UPDATE TXPDISPOS SET DisObsULin=?  WHERE EmprCod = ? AND DisCod = ?", GX_NOMASK, "TXPDISPOS")
         ,new ForEachCursor("T000V28", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DisCod FROM TXPDISPOS ORDER BY EmprCod, DisCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V29", "SELECT DisCod, DisObsLin, DisObsTxt, EmprCod FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? and DisObsLin = ? ORDER BY EmprCod, DisCod, DisObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T000V30", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T000V31", "INSERT INTO TXPOBSERV(DisCod, DisObsLin, DisObsTxt, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSERV")
         ,new UpdateCursor("T000V32", "UPDATE TXPOBSERV SET DisObsTxt=?  WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?", GX_NOMASK, "TXPOBSERV")
         ,new UpdateCursor("T000V33", "DELETE FROM TXPOBSERV  WHERE EmprCod = ? AND DisCod = ? AND DisObsLin = ?", GX_NOMASK, "TXPOBSERV")
         ,new ForEachCursor("T000V34", "SELECT EmprCod, DisCod, DisObsLin FROM TXPOBSERV WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((byte[]) buf[6])[0] = rslt.getByte(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(8, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 9);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 27 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 60);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 32 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 40);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[5], 2);
               }
               stmt.setByte(6, ((Number) parms[6]).byteValue());
               stmt.setString(7, (String)parms[7], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setBigDecimal(2, (java.math.BigDecimal)parms[1], 2);
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 2);
               }
               stmt.setByte(5, ((Number) parms[5]).byteValue());
               stmt.setString(6, (String)parms[6], 3);
               stmt.setInt(7, ((Number) parms[7]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 25 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 29 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 3);
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
               stmt.setString(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

