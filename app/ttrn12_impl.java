package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttrn12_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A396EmprCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_observaciones") == 0 )
      {
         gxnrgridlevel_observaciones_newrow_invoke( ) ;
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
            AV10EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
            AV35AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35AlbProCod), 10, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35AlbProCod), "ZZZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Guias (Observaciones)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_observaciones_newrow_invoke( )
   {
      nRC_GXsfl_28 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_28"))) ;
      nGXsfl_28_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_28_idx"))) ;
      sGXsfl_28_idx = httpContext.GetPar( "sGXsfl_28_idx") ;
      A914AlbPObsCon = (byte)(GXutil.lval( httpContext.GetPar( "AlbPObsCon"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      A33AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_observaciones_newrow( ) ;
      /* End function gxnrGridlevel_observaciones_newrow_invoke */
   }

   public ttrn12_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttrn12_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttrn12_impl.class ));
   }

   public ttrn12_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtAlbProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtAlbProCod_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProCod_Internalname, GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtAlbProCod_Enabled, 1, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn12.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_observaciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_observaciones( ) ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      ClassString = "Button" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnregresar_Internalname, "", httpContext.getMessage( "Regresar", ""), bttBtnregresar_Jsonclick, 5, httpContext.getMessage( "Regresar", ""), "", StyleString, ClassString, bttBtnregresar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOREGRESAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TTrn12.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn12.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TTrn12.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbPObsCon_Internalname, GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbPObsCon_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbPObsCon_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbPObsCon_Visible, edtAlbPObsCon_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn12.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtAlbProEst_Internalname, GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtAlbProEst_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9") : localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtAlbProEst_Jsonclick, 0, "Attribute", "", "", "", "", edtAlbProEst_Visible, edtAlbProEst_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TTrn12.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_observaciones( )
   {
      /*  Grid Control  */
      startgridcontrol28( ) ;
      nGXsfl_28_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount121 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_121 = (short)(1) ;
            scanStart1LO121( ) ;
            while ( RcdFound121 != 0 )
            {
               init_level_properties121( ) ;
               getByPrimaryKey1LO121( ) ;
               addRow1LO121( ) ;
               scanNext1LO121( ) ;
            }
            scanEnd1LO121( ) ;
            nBlankRcdCount121 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         standaloneNotModal1LO121( ) ;
         standaloneModal1LO121( ) ;
         sMode121 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRow1LO121( ) ;
            edtAlbPObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtAlbPObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBS_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            if ( ( nRcdExists_121 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1LO121( ) ;
            }
            sendRow1LO121( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A914AlbPObsCon = B914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount121 = (short)(5) ;
         nRcdExists_121 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1LO121( ) ;
            while ( RcdFound121 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_28121( ) ;
               init_level_properties121( ) ;
               standaloneNotModal1LO121( ) ;
               getByPrimaryKey1LO121( ) ;
               standaloneModal1LO121( ) ;
               addRow1LO121( ) ;
               scanNext1LO121( ) ;
            }
            scanEnd1LO121( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode121 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_28121( ) ;
         initAll1LO121( ) ;
         init_level_properties121( ) ;
         B914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         nRcdExists_121 = (short)(0) ;
         nIsMod_121 = (short)(0) ;
         nRcdDeleted_121 = (short)(0) ;
         nBlankRcdCount121 = (short)(nBlankRcdUsr121+nBlankRcdCount121) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount121 > 0 )
         {
            standaloneNotModal1LO121( ) ;
            standaloneModal1LO121( ) ;
            addRow1LO121( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtAlbPObsLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount121 = (short)(nBlankRcdCount121-1) ;
         }
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A914AlbPObsCon = B914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_observacionesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_observaciones", Gridlevel_observacionesContainer, subGridlevel_observaciones_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_observacionesContainerData", Gridlevel_observacionesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_observacionesContainerData"+"V", Gridlevel_observacionesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_observacionesContainerData"+"V"+"\" value='"+Gridlevel_observacionesContainer.GridValuesHidden()+"'/>") ;
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
      e111LO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z30AlbProCod = localUtil.ctol( httpContext.cgiGet( "Z30AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            Z914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "Z914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z33AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( "O914AlbPObsCon"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV10EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV35AlbProCod = localUtil.ctol( httpContext.cgiGet( "vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "ALBPROEST");
               AnyError = (short)(1) ;
               GX_FocusControl = edtAlbProEst_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A33AlbProEst = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            }
            else
            {
               A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
            }
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTrn12");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ttrn12:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A30AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV35AlbProCod) )
               {
                  A30AlbProCod = AV35AlbProCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A30AlbProCod = AV35AlbProCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
                  sMode3 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV35AlbProCod) )
                  {
                     A30AlbProCod = AV35AlbProCod ;
                     httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A30AlbProCod = AV35AlbProCod ;
                        httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
                     }
                  }
                  Gx_mode = sMode3 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound3 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1LO0( ) ;
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
                        e111LO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121LO2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOREGRESAR'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoRegresar' */
                        e131LO2 ();
                        nKeyPressed = (byte)(3) ;
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
         e121LO2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1LO3( ) ;
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
         disableAttributes1LO3( ) ;
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

   public void confirm_1LO0( )
   {
      beforeValidate1LO3( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1LO3( ) ;
         }
         else
         {
            checkExtendedTable1LO3( ) ;
            closeExtendedTableCursors1LO3( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode3 = Gx_mode ;
         confirm_1LO121( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode3 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1LO121( )
   {
      s914AlbPObsCon = O914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow1LO121( ) ;
         if ( ( nRcdExists_121 != 0 ) || ( nIsMod_121 != 0 ) )
         {
            getKey1LO121( ) ;
            if ( ( nRcdExists_121 == 0 ) && ( nRcdDeleted_121 == 0 ) )
            {
               if ( RcdFound121 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1LO121( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1LO121( ) ;
                     closeExtendedTableCursors1LO121( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O914AlbPObsCon = A914AlbPObsCon ;
                     httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                  }
               }
               else
               {
                  GXCCtl = "ALBPOBSLIN_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtAlbPObsLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound121 != 0 )
               {
                  if ( nRcdDeleted_121 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1LO121( ) ;
                     load1LO121( ) ;
                     beforeValidate1LO121( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1LO121( ) ;
                        O914AlbPObsCon = A914AlbPObsCon ;
                        httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_121 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1LO121( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1LO121( ) ;
                           closeExtendedTableCursors1LO121( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O914AlbPObsCon = A914AlbPObsCon ;
                           httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_121 == 0 )
                  {
                     GXCCtl = "ALBPOBSLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtAlbPObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPObs_Internalname, GXutil.rtrim( A916AlbPObs)) ;
         httpContext.changePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_28_idx, GXutil.rtrim( Z916AlbPObs)) ;
         httpContext.changePostValue( "nRcdDeleted_121_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_121_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_121_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N916AlbPObs_"+sGXsfl_28_idx, GXutil.rtrim( A916AlbPObs)) ;
         if ( nIsMod_121 != 0 )
         {
            httpContext.changePostValue( "ALBPOBSLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPOBS_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O914AlbPObsCon = s914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1LO0( )
   {
   }

   public void e111LO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttrn12_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV10EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttrn12_impl.this.AV10EmprCod = GXv_char2[0] ;
      ttrn12_impl.this.AV11EmprNom = GXv_char3[0] ;
      ttrn12_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10EmprCod", AV10EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV196WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV196WWPContext = GXv_SdtWWPContext5[0] ;
      AV197TrnContext.fromxml(AV198WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtAlbPObsCon_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Visible), 5, 0), true);
      edtAlbProEst_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Visible), 5, 0), true);
      /* Execute user subroutine: 'ESTA USANDO FUNCIÓN TTRN06DINAMICACALLS' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e121LO2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      AV203NombreParametro = "NombreDinamicaSiguiente" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV203NombreParametro", AV203NombreParametro);
      /* Execute user subroutine: 'USO DE FUNCIÓN TTRN06DINAMICACALLS' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV197TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ttrn12ww", new String[] {}, new String[] {}) );
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
      /*  Sending Event outputs  */
   }

   public void e131LO2( )
   {
      /* 'DoRegresar' Routine */
      returnInSub = false ;
      AV203NombreParametro = "NombreDinamicaAnterior" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV203NombreParametro", AV203NombreParametro);
      /* Execute user subroutine: 'USO DE FUNCIÓN TTRN06DINAMICACALLS' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'USO DE FUNCIÓN TTRN06DINAMICACALLS' Routine */
      returnInSub = false ;
      AV204NombreDinamica = "" ;
      AV200SdtParametroCallsJSon = AV198WebSession.getValue("TTrn06_Calls_001") ;
      AV202SdtParametroCallsCollection.fromJSonString(AV200SdtParametroCallsJSon, null);
      AV206GXV1 = 1 ;
      while ( AV206GXV1 <= AV202SdtParametroCallsCollection.size() )
      {
         AV201SdtParametroCalls = (app.SdtSdtParametroCalls)((app.SdtSdtParametroCalls)AV202SdtParametroCallsCollection.elementAt(-1+AV206GXV1));
         if ( GXutil.strcmp(AV201SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), AV203NombreParametro) == 0 )
         {
            AV204NombreDinamica = AV201SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro() ;
            if (true) break;
         }
         AV206GXV1 = (int)(AV206GXV1+1) ;
      }
      if ( ! (GXutil.strcmp("", AV204NombreDinamica)==0) )
      {
         AV198WebSession.remove("TTrn06_Calls_001");
         this.executeExternalObjectMethod("", false, "GlobalEvents", "FlujoObjeto", new Object[] {AV204NombreDinamica,AV200SdtParametroCallsJSon}, true);
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

   public void S112( )
   {
      /* 'ESTA USANDO FUNCIÓN TTRN06DINAMICACALLS' Routine */
      returnInSub = false ;
      AV204NombreDinamica = "" ;
      AV200SdtParametroCallsJSon = AV198WebSession.getValue("TTrn06_Calls_001") ;
      AV202SdtParametroCallsCollection.fromJSonString(AV200SdtParametroCallsJSon, null);
      AV207GXV2 = 1 ;
      while ( AV207GXV2 <= AV202SdtParametroCallsCollection.size() )
      {
         AV201SdtParametroCalls = (app.SdtSdtParametroCalls)((app.SdtSdtParametroCalls)AV202SdtParametroCallsCollection.elementAt(-1+AV207GXV2));
         if ( GXutil.strcmp(AV201SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Nombreparametro(), "NombreDinamica") == 0 )
         {
            AV204NombreDinamica = AV201SdtParametroCalls.getgxTv_SdtSdtParametroCalls_Valorparametro() ;
            if (true) break;
         }
         AV207GXV2 = (int)(AV207GXV2+1) ;
      }
      bttBtntrn_cancel_Visible = (((GXutil.strcmp("", AV204NombreDinamica)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_cancel_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_cancel_Visible), 5, 0), true);
      bttBtnregresar_Visible = ((!(GXutil.strcmp("", AV204NombreDinamica)==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnregresar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnregresar_Visible), 5, 0), true);
   }

   public void zm1LO3( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z914AlbPObsCon = T01LO5_A914AlbPObsCon[0] ;
            Z33AlbProEst = T01LO5_A33AlbProEst[0] ;
         }
         else
         {
            Z914AlbPObsCon = A914AlbPObsCon ;
            Z33AlbProEst = A33AlbProEst ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z914AlbPObsCon = A914AlbPObsCon ;
         Z33AlbProEst = A33AlbProEst ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         A396EmprCod = AV10EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( true )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( isUpd( )  || isDlt( )  || isIns( )  )
         {
            edtAlbProCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
         }
         else
         {
            edtAlbProCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
         }
      }
      if ( isUpd( )  || isDlt( )  || isIns( )  )
      {
         edtAlbProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV35AlbProCod) )
      {
         A30AlbProCod = AV35AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A30AlbProCod = AV35AlbProCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
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
         /* Using cursor T01LO6 */
         pr_default.execute(4, new Object[] {A396EmprCod});
         A407EmprNom = T01LO6_A407EmprNom[0] ;
         n407EmprNom = T01LO6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(4);
      }
   }

   public void load1LO3( )
   {
      /* Using cursor T01LO7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A407EmprNom = T01LO7_A407EmprNom[0] ;
         n407EmprNom = T01LO7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A914AlbPObsCon = T01LO7_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         A33AlbProEst = T01LO7_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         zm1LO3( -16) ;
      }
      pr_default.close(5);
      onLoadActions1LO3( ) ;
   }

   public void onLoadActions1LO3( )
   {
   }

   public void checkExtendedTable1LO3( )
   {
      nIsDirty_3 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T01LO6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01LO6_A407EmprNom[0] ;
      n407EmprNom = T01LO6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(4);
   }

   public void closeExtendedTableCursors1LO3( )
   {
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_17( String A396EmprCod )
   {
      /* Using cursor T01LO8 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01LO8_A407EmprNom[0] ;
      n407EmprNom = T01LO8_n407EmprNom[0] ;
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

   public void getKey1LO3( )
   {
      /* Using cursor T01LO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01LO5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1LO3( 16) ;
         RcdFound3 = (short)(1) ;
         A30AlbProCod = T01LO5_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         A914AlbPObsCon = T01LO5_A914AlbPObsCon[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         A33AlbProEst = T01LO5_A33AlbProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
         A396EmprCod = T01LO5_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         O914AlbPObsCon = A914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LO3( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey1LO3( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey1LO3( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1LO3( ) ;
      if ( RcdFound3 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01LO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01LO10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01LO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LO10_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01LO10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01LO10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LO10_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            A396EmprCod = T01LO10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = T01LO10_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T01LO11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Long.valueOf(A30AlbProCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01LO11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01LO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LO11_A30AlbProCod[0] > A30AlbProCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01LO11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01LO11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01LO11_A30AlbProCod[0] < A30AlbProCod ) ) )
         {
            A396EmprCod = T01LO11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A30AlbProCod = T01LO11_A30AlbProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1LO3( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A914AlbPObsCon = O914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1LO3( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A30AlbProCod = Z30AlbProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               update1LO3( ) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
            {
               /* Insert record */
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1LO3( ) ;
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
                  A914AlbPObsCon = O914AlbPObsCon ;
                  httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1LO3( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A30AlbProCod != Z30AlbProCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = Z30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         A914AlbPObsCon = O914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1LO3( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( Z914AlbPObsCon != T01LO4_A914AlbPObsCon[0] ) || ( Z33AlbProEst != T01LO4_A33AlbProEst[0] ) )
         {
            if ( Z914AlbPObsCon != T01LO4_A914AlbPObsCon[0] )
            {
               GXutil.writeLogln("ttrn12:[seudo value changed for attri]"+"AlbPObsCon");
               GXutil.writeLogRaw("Old: ",Z914AlbPObsCon);
               GXutil.writeLogRaw("Current: ",T01LO4_A914AlbPObsCon[0]);
            }
            if ( Z33AlbProEst != T01LO4_A33AlbProEst[0] )
            {
               GXutil.writeLogln("ttrn12:[seudo value changed for attri]"+"AlbProEst");
               GXutil.writeLogRaw("Old: ",Z33AlbProEst);
               GXutil.writeLogRaw("Current: ",T01LO4_A33AlbProEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCALPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LO3( )
   {
      beforeValidate1LO3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LO3( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LO3( 0) ;
         checkOptimisticConcurrency1LO3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LO3( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LO3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LO12 */
                  pr_default.execute(10, new Object[] {Long.valueOf(A30AlbProCod), Byte.valueOf(A914AlbPObsCon), Byte.valueOf(A33AlbProEst), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
                        processLevel1LO3( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1LO0( ) ;
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
            load1LO3( ) ;
         }
         endLevel1LO3( ) ;
      }
      closeExtendedTableCursors1LO3( ) ;
   }

   public void update1LO3( )
   {
      beforeValidate1LO3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LO3( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LO3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LO3( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1LO3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LO13 */
                  pr_default.execute(11, new Object[] {Byte.valueOf(A914AlbPObsCon), Byte.valueOf(A33AlbProEst), A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCALPRD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1LO3( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1LO3( ) ;
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
         endLevel1LO3( ) ;
      }
      closeExtendedTableCursors1LO3( ) ;
   }

   public void deferredUpdate1LO3( )
   {
   }

   public void delete( )
   {
      beforeValidate1LO3( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LO3( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LO3( ) ;
         afterConfirm1LO3( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LO3( ) ;
            if ( AnyError == 0 )
            {
               A914AlbPObsCon = O914AlbPObsCon ;
               httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               scanStart1LO121( ) ;
               while ( RcdFound121 != 0 )
               {
                  getByPrimaryKey1LO121( ) ;
                  delete1LO121( ) ;
                  scanNext1LO121( ) ;
                  O914AlbPObsCon = A914AlbPObsCon ;
                  httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
               }
               scanEnd1LO121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LO14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LO3( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LO3( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01LO15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01LO15_A407EmprNom[0] ;
         n407EmprNom = T01LO15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01LO16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Observaciones ALBARAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01LO17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Tabla Hdrs Albaran", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01LO18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CNOTRET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01LO19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBBAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevel1LO121( )
   {
      s914AlbPObsCon = O914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow1LO121( ) ;
         if ( ( nRcdExists_121 != 0 ) || ( nIsMod_121 != 0 ) )
         {
            standaloneNotModal1LO121( ) ;
            getKey1LO121( ) ;
            if ( ( nRcdExists_121 == 0 ) && ( nRcdDeleted_121 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1LO121( ) ;
            }
            else
            {
               if ( RcdFound121 != 0 )
               {
                  if ( ( nRcdDeleted_121 != 0 ) && ( nRcdExists_121 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1LO121( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_121 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1LO121( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_121 == 0 )
                  {
                     GXCCtl = "ALBPOBSLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtAlbPObsLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O914AlbPObsCon = A914AlbPObsCon ;
            httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
         }
         httpContext.changePostValue( edtAlbPObsLin_Internalname, GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtAlbPObs_Internalname, GXutil.rtrim( A916AlbPObs)) ;
         httpContext.changePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_28_idx, GXutil.rtrim( Z916AlbPObs)) ;
         httpContext.changePostValue( "nRcdDeleted_121_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_121_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_121_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "N916AlbPObs_"+sGXsfl_28_idx, GXutil.rtrim( A916AlbPObs)) ;
         if ( nIsMod_121 != 0 )
         {
            httpContext.changePostValue( "ALBPOBSLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "ALBPOBS_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1LO121( ) ;
      if ( AnyError != 0 )
      {
         O914AlbPObsCon = s914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      nRcdExists_121 = (short)(0) ;
      nIsMod_121 = (short)(0) ;
      nRcdDeleted_121 = (short)(0) ;
   }

   public void processLevel1LO3( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevel1LO121( ) ;
      if ( AnyError != 0 )
      {
         O914AlbPObsCon = s914AlbPObsCon ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01LO20 */
      pr_default.execute(18, new Object[] {Byte.valueOf(A914AlbPObsCon), A396EmprCod, Long.valueOf(A30AlbProCod)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCALPRD");
   }

   public void endLevel1LO3( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1LO3( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ttrn12");
         if ( AnyError == 0 )
         {
            confirmValues1LO0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ttrn12");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1LO3( )
   {
      /* Scan By routine */
      /* Using cursor T01LO21 */
      pr_default.execute(19);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A396EmprCod = T01LO21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01LO21_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LO3( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A396EmprCod = T01LO21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A30AlbProCod = T01LO21_A30AlbProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      }
   }

   public void scanEnd1LO3( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1LO3( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LO3( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LO3( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LO3( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LO3( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LO3( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LO3( )
   {
      edtAlbProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      edtAlbProEst_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProEst_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProEst_Enabled), 5, 0), true);
   }

   public void zm1LO121( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z916AlbPObs = T01LO3_A916AlbPObs[0] ;
         }
         else
         {
            Z916AlbPObs = A916AlbPObs ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         Z916AlbPObs = A916AlbPObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1LO121( )
   {
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      edtAlbPObsCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsCon_Enabled), 5, 0), true);
      if ( A33AlbProEst == 2 )
      {
         edtAlbPObs_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtAlbPObs_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void standaloneModal1LO121( )
   {
      if ( isIns( )  )
      {
         A914AlbPObsCon = (byte)(O914AlbPObsCon+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      }
      if ( ( A33AlbProEst == 2 ) && true /* Level */ && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro. Guia já faturou.", ""), 1, "ALBPROEST");
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbProEst_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A915AlbPObsLin = A914AlbPObsCon ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtAlbPObsLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtAlbPObsLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void load1LO121( )
   {
      /* Using cursor T01LO22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A916AlbPObs = T01LO22_A916AlbPObs[0] ;
         zm1LO121( -18) ;
      }
      pr_default.close(20);
      onLoadActions1LO121( ) ;
   }

   public void onLoadActions1LO121( )
   {
   }

   public void checkExtendedTable1LO121( )
   {
      nIsDirty_121 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1LO121( ) ;
   }

   public void closeExtendedTableCursors1LO121( )
   {
   }

   public void enableDisable1LO121( )
   {
   }

   public void getKey1LO121( )
   {
      /* Using cursor T01LO23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound121 = (short)(1) ;
      }
      else
      {
         RcdFound121 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKey1LO121( )
   {
      /* Using cursor T01LO3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1LO121( 18) ;
         RcdFound121 = (short)(1) ;
         initializeNonKey1LO121( ) ;
         A915AlbPObsLin = T01LO3_A915AlbPObsLin[0] ;
         A916AlbPObs = T01LO3_A916AlbPObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z30AlbProCod = A30AlbProCod ;
         Z915AlbPObsLin = A915AlbPObsLin ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1LO121( ) ;
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound121 = (short)(0) ;
         initializeNonKey1LO121( ) ;
         sMode121 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1LO121( ) ;
         Gx_mode = sMode121 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1LO121( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1LO121( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01LO2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z916AlbPObs, T01LO2_A916AlbPObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z916AlbPObs, T01LO2_A916AlbPObs[0]) != 0 )
            {
               GXutil.writeLogln("ttrn12:[seudo value changed for attri]"+"AlbPObs");
               GXutil.writeLogRaw("Old: ",Z916AlbPObs);
               GXutil.writeLogRaw("Current: ",T01LO2_A916AlbPObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPOBSALB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1LO121( )
   {
      beforeValidate1LO121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LO121( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1LO121( 0) ;
         checkOptimisticConcurrency1LO121( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1LO121( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1LO121( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01LO24 */
                  pr_default.execute(22, new Object[] {Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin), A916AlbPObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                  if ( (pr_default.getStatus(22) == 1) )
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
            load1LO121( ) ;
         }
         endLevel1LO121( ) ;
      }
      closeExtendedTableCursors1LO121( ) ;
   }

   public void update1LO121( )
   {
      beforeValidate1LO121( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1LO121( ) ;
      }
      if ( ( nIsMod_121 != 0 ) || ( nIsDirty_121 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1LO121( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1LO121( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1LO121( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01LO25 */
                     pr_default.execute(23, new Object[] {A916AlbPObs, A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPOBSALB"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1LO121( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1LO121( ) ;
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
            endLevel1LO121( ) ;
         }
      }
      closeExtendedTableCursors1LO121( ) ;
   }

   public void deferredUpdate1LO121( )
   {
   }

   public void delete1LO121( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1LO121( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1LO121( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1LO121( ) ;
         afterConfirm1LO121( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1LO121( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01LO26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod), Byte.valueOf(A915AlbPObsLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPOBSALB");
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
      sMode121 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1LO121( ) ;
      Gx_mode = sMode121 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1LO121( )
   {
      standaloneModal1LO121( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1LO121( )
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

   public void scanStart1LO121( )
   {
      /* Scan By routine */
      /* Using cursor T01LO27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Long.valueOf(A30AlbProCod)});
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = T01LO27_A915AlbPObsLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1LO121( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound121 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound121 = (short)(1) ;
         A915AlbPObsLin = T01LO27_A915AlbPObsLin[0] ;
      }
   }

   public void scanEnd1LO121( )
   {
      pr_default.close(25);
   }

   public void afterConfirm1LO121( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1LO121( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1LO121( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1LO121( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1LO121( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1LO121( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1LO121( )
   {
      edtAlbPObsLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtAlbPObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashes1LO121( )
   {
   }

   public void send_integrity_lvl_hashes1LO3( )
   {
   }

   public void subsflControlProps_28121( )
   {
      edtAlbPObsLin_Internalname = "ALBPOBSLIN_"+sGXsfl_28_idx ;
      edtAlbPObs_Internalname = "ALBPOBS_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_28121( )
   {
      edtAlbPObsLin_Internalname = "ALBPOBSLIN_"+sGXsfl_28_fel_idx ;
      edtAlbPObs_Internalname = "ALBPOBS_"+sGXsfl_28_fel_idx ;
   }

   public void addRow1LO121( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28121( ) ;
      sendRow1LO121( ) ;
   }

   public void sendRow1LO121( )
   {
      Gridlevel_observacionesRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_observaciones_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_observaciones_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_observaciones_Class, "") != 0 )
         {
            subGridlevel_observaciones_Linesclass = subGridlevel_observaciones_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_observaciones_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_observaciones_Backstyle = (byte)(0) ;
         subGridlevel_observaciones_Backcolor = subGridlevel_observaciones_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_observaciones_Class, "") != 0 )
         {
            subGridlevel_observaciones_Linesclass = subGridlevel_observaciones_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_observaciones_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_observaciones_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_observaciones_Class, "") != 0 )
         {
            subGridlevel_observaciones_Linesclass = subGridlevel_observaciones_Class+"Odd" ;
         }
         subGridlevel_observaciones_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_observaciones_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_observaciones_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_28_idx) % (2))) == 0 )
         {
            subGridlevel_observaciones_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_observaciones_Class, "") != 0 )
            {
               subGridlevel_observaciones_Linesclass = subGridlevel_observaciones_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_observaciones_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_observaciones_Class, "") != 0 )
            {
               subGridlevel_observaciones_Linesclass = subGridlevel_observaciones_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_121_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_observacionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPObsLin_Internalname,GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A915AlbPObsLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPObsLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbPObsLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_121_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_observacionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPObs_Internalname,GXutil.rtrim( A916AlbPObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPObs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtAlbPObs_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_observacionesRow);
      send_integrity_lvl_hashes1LO121( ) ;
      GXCCtl = "Z915AlbPObsLin_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z915AlbPObsLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z916AlbPObs_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z916AlbPObs));
      GXCCtl = "nRcdDeleted_121_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_121_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_121_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_121, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "N916AlbPObs_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A916AlbPObs));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_28_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV197TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV197TrnContext);
      }
      GXCCtl = "vNOMBREPARAMETRO_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, AV203NombreParametro);
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV10EmprCod));
      GXCCtl = "vALBPROCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV35AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBSLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPOBS_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_observacionesContainer.AddRow(Gridlevel_observacionesRow);
   }

   public void readRow1LO121( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28121( ) ;
      edtAlbPObsLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBSLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtAlbPObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "ALBPOBS_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "ALBPOBSLIN_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtAlbPObsLin_Internalname ;
         wbErr = true ;
         A915AlbPObsLin = (byte)(0) ;
      }
      else
      {
         A915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A916AlbPObs = httpContext.cgiGet( edtAlbPObs_Internalname) ;
      GXCCtl = "Z915AlbPObsLin_" + sGXsfl_28_idx ;
      Z915AlbPObsLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z916AlbPObs_" + sGXsfl_28_idx ;
      Z916AlbPObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_121_" + sGXsfl_28_idx ;
      nRcdDeleted_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_121_" + sGXsfl_28_idx ;
      nRcdExists_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_121_" + sGXsfl_28_idx ;
      nIsMod_121 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "N916AlbPObs_" + sGXsfl_28_idx ;
      N916AlbPObs = httpContext.cgiGet( GXCCtl) ;
   }

   public void assign_properties_default( )
   {
      defedtAlbPObs_Enabled = edtAlbPObs_Enabled ;
      defedtAlbPObsLin_Enabled = edtAlbPObsLin_Enabled ;
   }

   public void confirmValues1LO0( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28121( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28121( ) ;
         httpContext.changePostValue( "Z915AlbPObsLin_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z915AlbPObsLin_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z916AlbPObs_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z916AlbPObs_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z916AlbPObs_"+sGXsfl_28_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ttrn12", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35AlbProCod,10,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTrn12");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ttrn12:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z30AlbProCod", GXutil.ltrim( localUtil.ntoc( Z30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( Z914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z33AlbProEst", GXutil.ltrim( localUtil.ntoc( Z33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O914AlbPObsCon", GXutil.ltrim( localUtil.ntoc( O914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV197TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV197TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV197TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMBREPARAMETRO", AV203NombreParametro);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV10EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV35AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35AlbProCod), "ZZZZZZZZZ9")));
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
      return formatLink("app.ttrn12", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV10EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35AlbProCod,10,0))}, new String[] {"Gx_mode","EmprCod","AlbProCod"})  ;
   }

   public String getPgmname( )
   {
      return "TTrn12" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Guias (Observaciones)", "") ;
   }

   public void initializeNonKey1LO3( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A914AlbPObsCon = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      A33AlbProEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A33AlbProEst", GXutil.str( A33AlbProEst, 1, 0));
      O914AlbPObsCon = A914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
      Z914AlbPObsCon = (byte)(0) ;
      Z33AlbProEst = (byte)(0) ;
   }

   public void initAll1LO3( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A30AlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A30AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A30AlbProCod), 10, 0));
      initializeNonKey1LO3( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1LO121( )
   {
      A916AlbPObs = "" ;
      Z916AlbPObs = "" ;
   }

   public void initAll1LO121( )
   {
      A915AlbPObsLin = (byte)(0) ;
      initializeNonKey1LO121( ) ;
   }

   public void standaloneModalInsert1LO121( )
   {
      A914AlbPObsCon = i914AlbPObsCon ;
      httpContext.ajax_rsp_assign_attri("", false, "A914AlbPObsCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(A914AlbPObsCon), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211664681", true, true);
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
      httpContext.AddJavascriptSource("ttrn12.js", "?20268211664681", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties121( )
   {
      edtAlbPObs_Enabled = defedtAlbPObs_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObs_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtAlbPObsLin_Enabled = defedtAlbPObsLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPObsLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPObsLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void startgridcontrol28( )
   {
      Gridlevel_observacionesContainer.AddObjectProperty("GridName", "Gridlevel_observaciones");
      Gridlevel_observacionesContainer.AddObjectProperty("Header", subGridlevel_observaciones_Header);
      Gridlevel_observacionesContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_observacionesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_observacionesContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_observacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_observacionesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A915AlbPObsLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_observacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObsLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddColumnProperties(Gridlevel_observacionesColumn);
      Gridlevel_observacionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_observacionesColumn.AddObjectProperty("Value", GXutil.rtrim( A916AlbPObs));
      Gridlevel_observacionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtAlbPObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddColumnProperties(Gridlevel_observacionesColumn);
      Gridlevel_observacionesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_observacionesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_observaciones_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtAlbPObsLin_Internalname = "ALBPOBSLIN" ;
      edtAlbPObs_Internalname = "ALBPOBS" ;
      divTableleaflevel_observaciones_Internalname = "TABLELEAFLEVEL_OBSERVACIONES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtnregresar_Internalname = "BTNREGRESAR" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtAlbPObsCon_Internalname = "ALBPOBSCON" ;
      edtAlbProEst_Internalname = "ALBPROEST" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_observaciones_Internalname = "GRIDLEVEL_OBSERVACIONES" ;
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
      subGridlevel_observaciones_Allowcollapsing = (byte)(0) ;
      subGridlevel_observaciones_Allowselection = (byte)(0) ;
      subGridlevel_observaciones_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Guias (Observaciones)", "") );
      edtAlbPObs_Jsonclick = "" ;
      edtAlbPObsLin_Jsonclick = "" ;
      subGridlevel_observaciones_Class = "GridNoBorder WorkWith" ;
      subGridlevel_observaciones_Backcolorstyle = (byte)(0) ;
      edtAlbPObs_Enabled = 1 ;
      edtAlbPObsLin_Enabled = 1 ;
      edtAlbProEst_Jsonclick = "" ;
      edtAlbProEst_Enabled = 1 ;
      edtAlbProEst_Visible = 1 ;
      edtAlbPObsCon_Jsonclick = "" ;
      edtAlbPObsCon_Enabled = 0 ;
      edtAlbPObsCon_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtnregresar_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Enabled = 0 ;
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

   public void gxnrgridlevel_observaciones_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_28121( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1LO121( ) ;
         standaloneModal1LO121( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1LO121( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28121( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_observacionesContainer)) ;
      /* End function gxnrGridlevel_observaciones_newrow */
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
      /* Using cursor T01LO15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01LO15_A407EmprNom[0] ;
      n407EmprNom = T01LO15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV35AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV197TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV10EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV35AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121LO2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV197TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV203NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV203NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]}");
      setEventMetadata("'DOREGRESAR'","{handler:'e131LO2',iparms:[{av:'AV203NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]");
      setEventMetadata("'DOREGRESAR'",",oparms:[{av:'AV203NombreParametro',fld:'vNOMBREPARAMETRO',pic:''}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
      setEventMetadata("VALID_ALBPOBSCON","{handler:'valid_Albpobscon',iparms:[]");
      setEventMetadata("VALID_ALBPOBSCON",",oparms:[]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBPOBSLIN","{handler:'valid_Albpobslin',iparms:[]");
      setEventMetadata("VALID_ALBPOBSLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albpobs',iparms:[]");
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
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV10EmprCod = "" ;
      Z396EmprCod = "" ;
      Z916AlbPObs = "" ;
      N916AlbPObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV10EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtnregresar_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      Gridlevel_observacionesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode121 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode3 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A916AlbPObs = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV8UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV196WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV197TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV198WebSession = httpContext.getWebSession();
      AV203NombreParametro = "" ;
      AV204NombreDinamica = "" ;
      AV200SdtParametroCallsJSon = "" ;
      AV202SdtParametroCallsCollection = new GXBaseCollection<app.SdtSdtParametroCalls>(app.SdtSdtParametroCalls.class, "SdtParametroCalls", "TexplusNET", remoteHandle);
      AV201SdtParametroCalls = new app.SdtSdtParametroCalls(remoteHandle, context);
      Z407EmprNom = "" ;
      T01LO6_A407EmprNom = new String[] {""} ;
      T01LO6_n407EmprNom = new boolean[] {false} ;
      T01LO7_A30AlbProCod = new long[1] ;
      T01LO7_A407EmprNom = new String[] {""} ;
      T01LO7_n407EmprNom = new boolean[] {false} ;
      T01LO7_A914AlbPObsCon = new byte[1] ;
      T01LO7_A33AlbProEst = new byte[1] ;
      T01LO7_A396EmprCod = new String[] {""} ;
      T01LO8_A407EmprNom = new String[] {""} ;
      T01LO8_n407EmprNom = new boolean[] {false} ;
      T01LO9_A396EmprCod = new String[] {""} ;
      T01LO9_A30AlbProCod = new long[1] ;
      T01LO5_A30AlbProCod = new long[1] ;
      T01LO5_A914AlbPObsCon = new byte[1] ;
      T01LO5_A33AlbProEst = new byte[1] ;
      T01LO5_A396EmprCod = new String[] {""} ;
      T01LO10_A396EmprCod = new String[] {""} ;
      T01LO10_A30AlbProCod = new long[1] ;
      T01LO11_A396EmprCod = new String[] {""} ;
      T01LO11_A30AlbProCod = new long[1] ;
      T01LO4_A30AlbProCod = new long[1] ;
      T01LO4_A914AlbPObsCon = new byte[1] ;
      T01LO4_A33AlbProEst = new byte[1] ;
      T01LO4_A396EmprCod = new String[] {""} ;
      T01LO15_A407EmprNom = new String[] {""} ;
      T01LO15_n407EmprNom = new boolean[] {false} ;
      T01LO16_A396EmprCod = new String[] {""} ;
      T01LO16_A30AlbProCod = new long[1] ;
      T01LO16_A12185DltLinObs = new byte[1] ;
      T01LO17_A396EmprCod = new String[] {""} ;
      T01LO17_A30AlbProCod = new long[1] ;
      T01LO17_A12176DltHdr = new int[1] ;
      T01LO17_A12177DltR = new byte[1] ;
      T01LO17_A12178DltP = new String[] {""} ;
      T01LO18_A396EmprCod = new String[] {""} ;
      T01LO18_A30AlbProCod = new long[1] ;
      T01LO18_A7540Alb_NFisca = new String[] {""} ;
      T01LO19_A396EmprCod = new String[] {""} ;
      T01LO19_A30AlbProCod = new long[1] ;
      T01LO19_A129BarCod = new int[1] ;
      T01LO19_A132BarCodReo = new byte[1] ;
      T01LO19_A130BarCodPar = new String[] {""} ;
      T01LO21_A396EmprCod = new String[] {""} ;
      T01LO21_A30AlbProCod = new long[1] ;
      T01LO22_A30AlbProCod = new long[1] ;
      T01LO22_A915AlbPObsLin = new byte[1] ;
      T01LO22_A916AlbPObs = new String[] {""} ;
      T01LO22_A396EmprCod = new String[] {""} ;
      T01LO23_A396EmprCod = new String[] {""} ;
      T01LO23_A30AlbProCod = new long[1] ;
      T01LO23_A915AlbPObsLin = new byte[1] ;
      T01LO3_A30AlbProCod = new long[1] ;
      T01LO3_A915AlbPObsLin = new byte[1] ;
      T01LO3_A916AlbPObs = new String[] {""} ;
      T01LO3_A396EmprCod = new String[] {""} ;
      T01LO2_A30AlbProCod = new long[1] ;
      T01LO2_A915AlbPObsLin = new byte[1] ;
      T01LO2_A916AlbPObs = new String[] {""} ;
      T01LO2_A396EmprCod = new String[] {""} ;
      T01LO27_A396EmprCod = new String[] {""} ;
      T01LO27_A30AlbProCod = new long[1] ;
      T01LO27_A915AlbPObsLin = new byte[1] ;
      Gridlevel_observacionesRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_observaciones_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_observacionesColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ttrn12__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ttrn12__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ttrn12__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ttrn12__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ttrn12__default(),
         new Object[] {
             new Object[] {
            T01LO2_A30AlbProCod, T01LO2_A915AlbPObsLin, T01LO2_A916AlbPObs, T01LO2_A396EmprCod
            }
            , new Object[] {
            T01LO3_A30AlbProCod, T01LO3_A915AlbPObsLin, T01LO3_A916AlbPObs, T01LO3_A396EmprCod
            }
            , new Object[] {
            T01LO4_A30AlbProCod, T01LO4_A914AlbPObsCon, T01LO4_A33AlbProEst, T01LO4_A396EmprCod
            }
            , new Object[] {
            T01LO5_A30AlbProCod, T01LO5_A914AlbPObsCon, T01LO5_A33AlbProEst, T01LO5_A396EmprCod
            }
            , new Object[] {
            T01LO6_A407EmprNom, T01LO6_n407EmprNom
            }
            , new Object[] {
            T01LO7_A30AlbProCod, T01LO7_A407EmprNom, T01LO7_n407EmprNom, T01LO7_A914AlbPObsCon, T01LO7_A33AlbProEst, T01LO7_A396EmprCod
            }
            , new Object[] {
            T01LO8_A407EmprNom, T01LO8_n407EmprNom
            }
            , new Object[] {
            T01LO9_A396EmprCod, T01LO9_A30AlbProCod
            }
            , new Object[] {
            T01LO10_A396EmprCod, T01LO10_A30AlbProCod
            }
            , new Object[] {
            T01LO11_A396EmprCod, T01LO11_A30AlbProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LO15_A407EmprNom, T01LO15_n407EmprNom
            }
            , new Object[] {
            T01LO16_A396EmprCod, T01LO16_A30AlbProCod, T01LO16_A12185DltLinObs
            }
            , new Object[] {
            T01LO17_A396EmprCod, T01LO17_A30AlbProCod, T01LO17_A12176DltHdr, T01LO17_A12177DltR, T01LO17_A12178DltP
            }
            , new Object[] {
            T01LO18_A396EmprCod, T01LO18_A30AlbProCod, T01LO18_A7540Alb_NFisca
            }
            , new Object[] {
            T01LO19_A396EmprCod, T01LO19_A30AlbProCod, T01LO19_A129BarCod, T01LO19_A132BarCodReo, T01LO19_A130BarCodPar
            }
            , new Object[] {
            }
            , new Object[] {
            T01LO21_A396EmprCod, T01LO21_A30AlbProCod
            }
            , new Object[] {
            T01LO22_A30AlbProCod, T01LO22_A915AlbPObsLin, T01LO22_A916AlbPObs, T01LO22_A396EmprCod
            }
            , new Object[] {
            T01LO23_A396EmprCod, T01LO23_A30AlbProCod, T01LO23_A915AlbPObsLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01LO27_A396EmprCod, T01LO27_A30AlbProCod, T01LO27_A915AlbPObsLin
            }
         }
      );
   }

   private byte Z914AlbPObsCon ;
   private byte Z33AlbProEst ;
   private byte O914AlbPObsCon ;
   private byte Z915AlbPObsLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A914AlbPObsCon ;
   private byte Gx_BScreen ;
   private byte A33AlbProEst ;
   private byte B914AlbPObsCon ;
   private byte s914AlbPObsCon ;
   private byte A915AlbPObsLin ;
   private byte subGridlevel_observaciones_Backcolorstyle ;
   private byte subGridlevel_observaciones_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i914AlbPObsCon ;
   private byte subGridlevel_observaciones_Allowselection ;
   private byte subGridlevel_observaciones_Allowhovering ;
   private byte subGridlevel_observaciones_Allowcollapsing ;
   private byte subGridlevel_observaciones_Collapsed ;
   private short nRcdDeleted_121 ;
   private short nRcdExists_121 ;
   private short nIsMod_121 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount121 ;
   private short RcdFound121 ;
   private short nBlankRcdUsr121 ;
   private short RcdFound3 ;
   private short nIsDirty_3 ;
   private short nIsDirty_121 ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int trnEnded ;
   private int edtAlbProCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtnregresar_Visible ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtAlbPObsCon_Enabled ;
   private int edtAlbPObsCon_Visible ;
   private int edtAlbProEst_Enabled ;
   private int edtAlbProEst_Visible ;
   private int edtAlbPObsLin_Enabled ;
   private int edtAlbPObs_Enabled ;
   private int fRowAdded ;
   private int AV206GXV1 ;
   private int AV207GXV2 ;
   private int GX_JID ;
   private int subGridlevel_observaciones_Backcolor ;
   private int subGridlevel_observaciones_Allbackcolor ;
   private int defedtAlbPObs_Enabled ;
   private int defedtAlbPObsLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_observaciones_Selectedindex ;
   private int subGridlevel_observaciones_Selectioncolor ;
   private int subGridlevel_observaciones_Hoveringcolor ;
   private long wcpOAV35AlbProCod ;
   private long Z30AlbProCod ;
   private long AV35AlbProCod ;
   private long A30AlbProCod ;
   private long GRIDLEVEL_OBSERVACIONES_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV10EmprCod ;
   private String Z396EmprCod ;
   private String Z916AlbPObs ;
   private String N916AlbPObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV10EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtEmprCod_Internalname ;
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
   private String edtAlbProCod_Internalname ;
   private String TempTags ;
   private String edtAlbProCod_Jsonclick ;
   private String divTableleaflevel_observaciones_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtnregresar_Internalname ;
   private String bttBtnregresar_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtAlbPObsCon_Internalname ;
   private String edtAlbPObsCon_Jsonclick ;
   private String edtAlbProEst_Internalname ;
   private String edtAlbProEst_Jsonclick ;
   private String sMode121 ;
   private String edtAlbPObsLin_Internalname ;
   private String edtAlbPObs_Internalname ;
   private String sStyleString ;
   private String subGridlevel_observaciones_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode3 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A916AlbPObs ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV11EmprNom ;
   private String GXv_char3[] ;
   private String AV8UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_observaciones_Class ;
   private String subGridlevel_observaciones_Linesclass ;
   private String ROClassString ;
   private String edtAlbPObsLin_Jsonclick ;
   private String edtAlbPObs_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_observaciones_Header ;
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
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private String AV203NombreParametro ;
   private String AV204NombreDinamica ;
   private String AV200SdtParametroCallsJSon ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_observacionesContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_observacionesRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_observacionesColumn ;
   private com.genexus.webpanels.WebSession AV198WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01LO6_A407EmprNom ;
   private boolean[] T01LO6_n407EmprNom ;
   private long[] T01LO7_A30AlbProCod ;
   private String[] T01LO7_A407EmprNom ;
   private boolean[] T01LO7_n407EmprNom ;
   private byte[] T01LO7_A914AlbPObsCon ;
   private byte[] T01LO7_A33AlbProEst ;
   private String[] T01LO7_A396EmprCod ;
   private String[] T01LO8_A407EmprNom ;
   private boolean[] T01LO8_n407EmprNom ;
   private String[] T01LO9_A396EmprCod ;
   private long[] T01LO9_A30AlbProCod ;
   private long[] T01LO5_A30AlbProCod ;
   private byte[] T01LO5_A914AlbPObsCon ;
   private byte[] T01LO5_A33AlbProEst ;
   private String[] T01LO5_A396EmprCod ;
   private String[] T01LO10_A396EmprCod ;
   private long[] T01LO10_A30AlbProCod ;
   private String[] T01LO11_A396EmprCod ;
   private long[] T01LO11_A30AlbProCod ;
   private long[] T01LO4_A30AlbProCod ;
   private byte[] T01LO4_A914AlbPObsCon ;
   private byte[] T01LO4_A33AlbProEst ;
   private String[] T01LO4_A396EmprCod ;
   private String[] T01LO15_A407EmprNom ;
   private boolean[] T01LO15_n407EmprNom ;
   private String[] T01LO16_A396EmprCod ;
   private long[] T01LO16_A30AlbProCod ;
   private byte[] T01LO16_A12185DltLinObs ;
   private String[] T01LO17_A396EmprCod ;
   private long[] T01LO17_A30AlbProCod ;
   private int[] T01LO17_A12176DltHdr ;
   private byte[] T01LO17_A12177DltR ;
   private String[] T01LO17_A12178DltP ;
   private String[] T01LO18_A396EmprCod ;
   private long[] T01LO18_A30AlbProCod ;
   private String[] T01LO18_A7540Alb_NFisca ;
   private String[] T01LO19_A396EmprCod ;
   private long[] T01LO19_A30AlbProCod ;
   private int[] T01LO19_A129BarCod ;
   private byte[] T01LO19_A132BarCodReo ;
   private String[] T01LO19_A130BarCodPar ;
   private String[] T01LO21_A396EmprCod ;
   private long[] T01LO21_A30AlbProCod ;
   private long[] T01LO22_A30AlbProCod ;
   private byte[] T01LO22_A915AlbPObsLin ;
   private String[] T01LO22_A916AlbPObs ;
   private String[] T01LO22_A396EmprCod ;
   private String[] T01LO23_A396EmprCod ;
   private long[] T01LO23_A30AlbProCod ;
   private byte[] T01LO23_A915AlbPObsLin ;
   private long[] T01LO3_A30AlbProCod ;
   private byte[] T01LO3_A915AlbPObsLin ;
   private String[] T01LO3_A916AlbPObs ;
   private String[] T01LO3_A396EmprCod ;
   private long[] T01LO2_A30AlbProCod ;
   private byte[] T01LO2_A915AlbPObsLin ;
   private String[] T01LO2_A916AlbPObs ;
   private String[] T01LO2_A396EmprCod ;
   private String[] T01LO27_A396EmprCod ;
   private long[] T01LO27_A30AlbProCod ;
   private byte[] T01LO27_A915AlbPObsLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSdtParametroCalls> AV202SdtParametroCallsCollection ;
   private app.SdtSdtParametroCalls AV201SdtParametroCalls ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV197TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV196WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class ttrn12__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn12__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn12__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn12__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttrn12__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01LO2", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?  FOR UPDATE OF AlbPObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO3", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO4", "SELECT AlbProCod, AlbPObsCon, AlbProEst, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ?  FOR UPDATE OF AlbPObsCon, AlbProEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO5", "SELECT AlbProCod, AlbPObsCon, AlbProEst, EmprCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO7", "SELECT /*+ FIRST_ROWS(100) */ TM1.AlbProCod, T2.EmprNom, TM1.AlbPObsCon, TM1.AlbProEst, TM1.EmprCod FROM (TXPCALPRD TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.AlbProCod = ? ORDER BY TM1.EmprCod, TM1.AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO8", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE EmprCod = ? AND AlbProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( EmprCod > ? or EmprCod = ? and AlbProCod > ?) ORDER BY EmprCod, AlbProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LO11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, AlbProCod FROM TXPCALPRD WHERE ( EmprCod < ? or EmprCod = ? and AlbProCod < ?) ORDER BY EmprCod DESC, AlbProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LO12", "INSERT INTO TXPCALPRD(AlbProCod, AlbPObsCon, AlbProEst, EmprCod, AlbProPri, AlbProfch, GuiRemCli, GuiRemDom, EmprGuiRem, AlbDomEnv, TrnCod, AlbProEso, AlbProEnt, AlbSec, AlbDivTCod, AlbDivCod, AlbHorSal, AlbLocCar, AlbLocDes, AlbMat, AlbCliDes, AlbFecSal, AlbProBon, AlbProTBo, AlbMarca, AlbTipCal, AlbKilRea, AlbEnvFtp, AlbUsu, AlbOComp, AlbMarCo, AlbLic, AlbNumT, AlbDesp, AlbMotTr, AlbTipDoc, AlbCambio, AlbColCa, AlbObsCb, AlbProNroF, AlbDomEv, AlbFmd, ALbFmdc, AlbHhfm, AlbGrossT, AlbProAT, AlbTrnNm, AlbTrnDm, AlbTrnNc, AlbIvaCod, DltUltob, FpgCod, AlbPdATCUD, AlbFecAnu, AlbUsuAnu, AlbHorAnu, AlbPdSerAT, AlbPdTipAT, AlbEnvMail) VALUES(?, ?, ?, ?, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', ' ', 0, 0, ' ', 0, 0, ' ', ' ', 0, 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01LO13", "UPDATE TXPCALPRD SET AlbPObsCon=?, AlbProEst=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new UpdateCursor("T01LO14", "DELETE FROM TXPCALPRD  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01LO15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO16", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltLinObs FROM TXPDLT005 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LO17", "SELECT * FROM (SELECT EmprCod, AlbProCod, DltHdr, DltR, DltP FROM TXPDLT001 WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LO18", "SELECT * FROM (SELECT EmprCod, AlbProCod, Alb_NFisca FROM TXPCNOTRE WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01LO19", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar FROM TXPALBBAR WHERE EmprCod = ? AND AlbProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01LO20", "UPDATE TXPCALPRD SET AlbPObsCon=?  WHERE EmprCod = ? AND AlbProCod = ?", GX_NOMASK, "TXPCALPRD")
         ,new ForEachCursor("T01LO21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, AlbProCod FROM TXPCALPRD ORDER BY EmprCod, AlbProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO22", "SELECT AlbProCod, AlbPObsLin, AlbPObs, EmprCod FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? and AlbPObsLin = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01LO23", "SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01LO24", "INSERT INTO TXPOBSALB(AlbProCod, AlbPObsLin, AlbPObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01LO25", "UPDATE TXPOBSALB SET AlbPObs=?  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new UpdateCursor("T01LO26", "DELETE FROM TXPOBSALB  WHERE EmprCod = ? AND AlbProCod = ? AND AlbPObsLin = ?", GX_NOMASK, "TXPOBSALB")
         ,new ForEachCursor("T01LO27", "SELECT EmprCod, AlbProCod, AlbPObsLin FROM TXPOBSALB WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod, AlbPObsLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 20 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 11 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 18 :
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 22 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 50);
               stmt.setString(4, (String)parms[3], 3);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 50);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
      }
   }

}

