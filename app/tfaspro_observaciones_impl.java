package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfaspro_observaciones_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_fasnum") == 0 )
      {
         gxnrgridlevel_fasnum_newrow_invoke( ) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8FasCod = httpContext.GetPar( "FasCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8FasCod", AV8FasCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FasCod, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Observaciones", ""), (short)(0)) ;
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

   public void gxnrgridlevel_fasnum_newrow_invoke( )
   {
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      A471FasUltLin = (byte)(GXutil.lval( httpContext.GetPar( "FasUltLin"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_fasnum_newrow( ) ;
      /* End function gxnrGridlevel_fasnum_newrow_invoke */
   }

   public tfaspro_observaciones_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfaspro_observaciones_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfaspro_observaciones_impl.class ));
   }

   public tfaspro_observaciones_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tfaspro_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasDsc_Internalname, GXutil.rtrim( A460FasDsc), GXutil.rtrim( localUtil.format( A460FasDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFasDsc_Enabled, 0, "text", "", 28, "chr", 1, "row", 28, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tfaspro_Observaciones.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-6 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_fasnum_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_fasnum( ) ;
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tfaspro_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tfaspro_Observaciones.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Tfaspro_Observaciones.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Tfaspro_Observaciones.htm");
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
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_fasnum( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount46 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_46 = (short)(1) ;
            scanStart1UJ46( ) ;
            while ( RcdFound46 != 0 )
            {
               init_level_properties46( ) ;
               getByPrimaryKey1UJ46( ) ;
               addRow1UJ46( ) ;
               scanNext1UJ46( ) ;
            }
            scanEnd1UJ46( ) ;
            nBlankRcdCount46 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B471FasUltLin = A471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
         standaloneNotModal1UJ46( ) ;
         standaloneModal1UJ46( ) ;
         sMode46 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow1UJ46( ) ;
            edtFasNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASOBS_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasObs_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_46 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UJ46( ) ;
            }
            sendRow1UJ46( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A471FasUltLin = B471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount46 = (short)(5) ;
         nRcdExists_46 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UJ46( ) ;
            while ( RcdFound46 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_3246( ) ;
               init_level_properties46( ) ;
               standaloneNotModal1UJ46( ) ;
               getByPrimaryKey1UJ46( ) ;
               standaloneModal1UJ46( ) ;
               addRow1UJ46( ) ;
               scanNext1UJ46( ) ;
            }
            scanEnd1UJ46( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode46 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_3246( ) ;
         initAll1UJ46( ) ;
         init_level_properties46( ) ;
         B471FasUltLin = A471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
         nRcdExists_46 = (short)(0) ;
         nIsMod_46 = (short)(0) ;
         nRcdDeleted_46 = (short)(0) ;
         nBlankRcdCount46 = (short)(nBlankRcdUsr46+nBlankRcdCount46) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount46 > 0 )
         {
            standaloneNotModal1UJ46( ) ;
            standaloneModal1UJ46( ) ;
            addRow1UJ46( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtFasObs_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount46 = (short)(nBlankRcdCount46-1) ;
         }
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A471FasUltLin = B471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_fasnumContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_fasnum", Gridlevel_fasnumContainer, subGridlevel_fasnum_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_fasnumContainerData", Gridlevel_fasnumContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_fasnumContainerData"+"V", Gridlevel_fasnumContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_fasnumContainerData"+"V"+"\" value='"+Gridlevel_fasnumContainer.GridValuesHidden()+"'/>") ;
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
      e111UJ2 ();
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
            Z460FasDsc = httpContext.cgiGet( "Z460FasDsc") ;
            Z471FasUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z471FasUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A471FasUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "Z471FasUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O471FasUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "O471FasUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8FasCod = httpContext.cgiGet( "vFASCOD") ;
            A471FasUltLin = (byte)(localUtil.ctol( httpContext.cgiGet( "FASULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            n457FasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Tfaspro_Observaciones");
            A457FasCod = httpContext.cgiGet( edtFasCod_Internalname) ;
            n457FasCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
            forbiddenHiddens.add("FasDsc", GXutil.rtrim( localUtil.format( A460FasDsc, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tfaspro_observaciones:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A457FasCod = httpContext.GetPar( "FasCod") ;
               n457FasCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
                  sMode45 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode45 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound45 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UJ0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FASCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFasCod_Internalname ;
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
                        e111UJ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UJ2 ();
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
         e121UJ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UJ45( ) ;
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
         disableAttributes1UJ45( ) ;
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

   public void confirm_1UJ0( )
   {
      beforeValidate1UJ45( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UJ45( ) ;
         }
         else
         {
            checkExtendedTable1UJ45( ) ;
            closeExtendedTableCursors1UJ45( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode45 = Gx_mode ;
         confirm_1UJ46( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode45 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1UJ46( )
   {
      s471FasUltLin = O471FasUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1UJ46( ) ;
         if ( ( nRcdExists_46 != 0 ) || ( nIsMod_46 != 0 ) )
         {
            getKey1UJ46( ) ;
            if ( ( nRcdExists_46 == 0 ) && ( nRcdDeleted_46 == 0 ) )
            {
               if ( RcdFound46 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UJ46( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UJ46( ) ;
                     closeExtendedTableCursors1UJ46( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O471FasUltLin = A471FasUltLin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
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
               if ( RcdFound46 != 0 )
               {
                  if ( nRcdDeleted_46 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UJ46( ) ;
                     load1UJ46( ) ;
                     beforeValidate1UJ46( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UJ46( ) ;
                        O471FasUltLin = A471FasUltLin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_46 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UJ46( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UJ46( ) ;
                           closeExtendedTableCursors1UJ46( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O471FasUltLin = A471FasUltLin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_46 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtFasNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A463FasNumLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasObs_Internalname, GXutil.rtrim( A465FasObs)) ;
         httpContext.changePostValue( "ZT_"+"Z463FasNumLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z463FasNumLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z465FasObs_"+sGXsfl_32_idx, GXutil.rtrim( Z465FasObs)) ;
         httpContext.changePostValue( "nRcdDeleted_46_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_46_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_46_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_46 != 0 )
         {
            httpContext.changePostValue( "FASNUMLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASOBS_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O471FasUltLin = s471FasUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UJ0( )
   {
   }

   public void e111UJ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfaspro_observaciones_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfaspro_observaciones_impl.this.AV7EmprCod = GXv_char2[0] ;
      tfaspro_observaciones_impl.this.AV15Emprnom = GXv_char3[0] ;
      tfaspro_observaciones_impl.this.AV16Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Emprnom", AV15Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usurcod", AV16Usurcod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
   }

   public void e121UJ2( )
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

   public void zm1UJ45( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z460FasDsc = T01UJ5_A460FasDsc[0] ;
            Z471FasUltLin = T01UJ5_A471FasUltLin[0] ;
         }
         else
         {
            Z460FasDsc = A460FasDsc ;
            Z471FasUltLin = A471FasUltLin ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z457FasCod = A457FasCod ;
         Z460FasDsc = A460FasDsc ;
         Z471FasUltLin = A471FasUltLin ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      AV13Pgmname = "Tfaspro_Observaciones" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UJ6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UJ6_A407EmprNom[0] ;
      n407EmprNom = T01UJ6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (GXutil.strcmp("", AV8FasCod)==0) )
      {
         A457FasCod = AV8FasCod ;
         n457FasCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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

   public void load1UJ45( )
   {
      /* Using cursor T01UJ7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A460FasDsc = T01UJ7_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A407EmprNom = T01UJ7_A407EmprNom[0] ;
         n407EmprNom = T01UJ7_n407EmprNom[0] ;
         A471FasUltLin = T01UJ7_A471FasUltLin[0] ;
         zm1UJ45( -9) ;
      }
      pr_default.close(5);
      onLoadActions1UJ45( ) ;
   }

   public void onLoadActions1UJ45( )
   {
   }

   public void checkExtendedTable1UJ45( )
   {
      nIsDirty_45 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1UJ45( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1UJ45( )
   {
      /* Using cursor T01UJ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UJ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1UJ45( 9) ;
         RcdFound45 = (short)(1) ;
         A457FasCod = T01UJ5_A457FasCod[0] ;
         n457FasCod = T01UJ5_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A460FasDsc = T01UJ5_A460FasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
         A471FasUltLin = T01UJ5_A471FasUltLin[0] ;
         A396EmprCod = T01UJ5_A396EmprCod[0] ;
         O471FasUltLin = A471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UJ45( ) ;
         if ( AnyError == 1 )
         {
            RcdFound45 = (short)(0) ;
            initializeNonKey1UJ45( ) ;
         }
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKey1UJ45( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1UJ45( ) ;
      if ( RcdFound45 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T01UJ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UJ9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UJ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UJ9_A457FasCod[0], A457FasCod) < 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UJ9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UJ9_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UJ9_A457FasCod[0], A457FasCod) > 0 ) ) )
         {
            A396EmprCod = T01UJ9_A396EmprCod[0] ;
            A457FasCod = T01UJ9_A457FasCod[0] ;
            n457FasCod = T01UJ9_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T01UJ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UJ10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UJ10_A457FasCod[0], A457FasCod) > 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UJ10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UJ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UJ10_A457FasCod[0], A457FasCod) < 0 ) ) )
         {
            A396EmprCod = T01UJ10_A396EmprCod[0] ;
            A457FasCod = T01UJ10_A457FasCod[0] ;
            n457FasCod = T01UJ10_n457FasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UJ45( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A471FasUltLin = O471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
         insert1UJ45( ) ;
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
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
               A471FasUltLin = O471FasUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A471FasUltLin = O471FasUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
               update1UJ45( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
            {
               /* Insert record */
               A471FasUltLin = O471FasUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
               insert1UJ45( ) ;
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
                  /* Insert record */
                  A471FasUltLin = O471FasUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
                  insert1UJ45( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A457FasCod, Z457FasCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
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
         A471FasUltLin = O471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UJ45( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UJ4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z460FasDsc, T01UJ4_A460FasDsc[0]) != 0 ) || ( Z471FasUltLin != T01UJ4_A471FasUltLin[0] ) )
         {
            if ( GXutil.strcmp(Z460FasDsc, T01UJ4_A460FasDsc[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro_observaciones:[seudo value changed for attri]"+"FasDsc");
               GXutil.writeLogRaw("Old: ",Z460FasDsc);
               GXutil.writeLogRaw("Current: ",T01UJ4_A460FasDsc[0]);
            }
            if ( Z471FasUltLin != T01UJ4_A471FasUltLin[0] )
            {
               GXutil.writeLogln("tfaspro_observaciones:[seudo value changed for attri]"+"FasUltLin");
               GXutil.writeLogRaw("Old: ",Z471FasUltLin);
               GXutil.writeLogRaw("Current: ",T01UJ4_A471FasUltLin[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASPRO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UJ45( )
   {
      beforeValidate1UJ45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UJ45( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UJ45( 0) ;
         checkOptimisticConcurrency1UJ45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UJ45( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UJ45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UJ11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, A460FasDsc, Byte.valueOf(A471FasUltLin), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
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
                        processLevel1UJ45( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UJ0( ) ;
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
            load1UJ45( ) ;
         }
         endLevel1UJ45( ) ;
      }
      closeExtendedTableCursors1UJ45( ) ;
   }

   public void update1UJ45( )
   {
      beforeValidate1UJ45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UJ45( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UJ45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UJ45( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UJ45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UJ12 */
                  pr_default.execute(10, new Object[] {A460FasDsc, Byte.valueOf(A471FasUltLin), A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASPRO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UJ45( ) ;
                  if ( AnyError == 0 )
                  {
                     GXv_char4[0] = A396EmprCod ;
                     GXv_char3[0] = A457FasCod ;
                     new app.txpfasproupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                     tfaspro_observaciones_impl.this.A396EmprCod = GXv_char4[0] ;
                     tfaspro_observaciones_impl.this.A457FasCod = GXv_char3[0] ;
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UJ45( ) ;
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
         endLevel1UJ45( ) ;
      }
      closeExtendedTableCursors1UJ45( ) ;
   }

   public void deferredUpdate1UJ45( )
   {
   }

   public void delete( )
   {
      beforeValidate1UJ45( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UJ45( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UJ45( ) ;
         afterConfirm1UJ45( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UJ45( ) ;
            if ( AnyError == 0 )
            {
               A471FasUltLin = O471FasUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
               scanStart1UJ46( ) ;
               while ( RcdFound46 != 0 )
               {
                  getByPrimaryKey1UJ46( ) ;
                  delete1UJ46( ) ;
                  scanNext1UJ46( ) ;
                  O471FasUltLin = A471FasUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
               }
               scanEnd1UJ46( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UJ13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
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
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UJ45( ) ;
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UJ45( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01UJ14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {""}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01UJ15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01UJ16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COSTA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01UJ17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01UJ18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01UJ19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "AVI001", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01UJ20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFSMQ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01UJ21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARFSS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01UJ22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ArtPrd", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01UJ23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASMUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01UJ24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EXHDPZ", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01UJ25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALAPFA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01UJ26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERECL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01UJ27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01UJ28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01UJ29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FASES (TERMINALES BROS)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01UJ30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXPER", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01UJ31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01UJ32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALBFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01UJ33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01UJ34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01UJ35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01UJ36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARFAS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
      }
   }

   public void processNestedLevel1UJ46( )
   {
      s471FasUltLin = O471FasUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1UJ46( ) ;
         if ( ( nRcdExists_46 != 0 ) || ( nIsMod_46 != 0 ) )
         {
            standaloneNotModal1UJ46( ) ;
            getKey1UJ46( ) ;
            if ( ( nRcdExists_46 == 0 ) && ( nRcdDeleted_46 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UJ46( ) ;
            }
            else
            {
               if ( RcdFound46 != 0 )
               {
                  if ( ( nRcdDeleted_46 != 0 ) && ( nRcdExists_46 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UJ46( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_46 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UJ46( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_46 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
            O471FasUltLin = A471FasUltLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
         }
         httpContext.changePostValue( edtFasNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A463FasNumLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasObs_Internalname, GXutil.rtrim( A465FasObs)) ;
         httpContext.changePostValue( "ZT_"+"Z463FasNumLin_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z463FasNumLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z465FasObs_"+sGXsfl_32_idx, GXutil.rtrim( Z465FasObs)) ;
         httpContext.changePostValue( "nRcdDeleted_46_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_46_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_46_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_46 != 0 )
         {
            httpContext.changePostValue( "FASNUMLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASOBS_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasObs_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UJ46( ) ;
      if ( AnyError != 0 )
      {
         O471FasUltLin = s471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      }
      nRcdExists_46 = (short)(0) ;
      nIsMod_46 = (short)(0) ;
      nRcdDeleted_46 = (short)(0) ;
   }

   public void processLevel1UJ45( )
   {
      /* Save parent mode. */
      sMode45 = Gx_mode ;
      processNestedLevel1UJ46( ) ;
      if ( AnyError != 0 )
      {
         O471FasUltLin = s471FasUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T01UJ37 */
      pr_default.execute(35, new Object[] {Byte.valueOf(A471FasUltLin), A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASPRO");
   }

   public void endLevel1UJ45( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeComplete1UJ45( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tfaspro_observaciones");
         if ( AnyError == 0 )
         {
            confirmValues1UJ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tfaspro_observaciones");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UJ45( )
   {
      /* Scan By routine */
      /* Using cursor T01UJ38 */
      pr_default.execute(36);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A396EmprCod = T01UJ38_A396EmprCod[0] ;
         A457FasCod = T01UJ38_A457FasCod[0] ;
         n457FasCod = T01UJ38_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UJ45( )
   {
      /* Scan next routine */
      pr_default.readNext(36);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(36) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A396EmprCod = T01UJ38_A396EmprCod[0] ;
         A457FasCod = T01UJ38_A457FasCod[0] ;
         n457FasCod = T01UJ38_n457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
   }

   public void scanEnd1UJ45( )
   {
      pr_default.close(36);
   }

   public void afterConfirm1UJ45( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UJ45( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UJ45( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UJ45( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UJ45( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UJ45( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UJ45( )
   {
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1UJ46( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z465FasObs = T01UJ3_A465FasObs[0] ;
         }
         else
         {
            Z465FasObs = A465FasObs ;
         }
      }
      if ( GX_JID == -11 )
      {
         Z457FasCod = A457FasCod ;
         Z463FasNumLin = A463FasNumLin ;
         Z465FasObs = A465FasObs ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1UJ46( )
   {
      edtFasNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModal1UJ46( )
   {
      if ( isIns( )  )
      {
         A471FasUltLin = (byte)(O471FasUltLin+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A463FasNumLin = A471FasUltLin ;
      }
   }

   public void load1UJ46( )
   {
      /* Using cursor T01UJ39 */
      pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Byte.valueOf(A463FasNumLin)});
      if ( (pr_default.getStatus(37) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A465FasObs = T01UJ39_A465FasObs[0] ;
         zm1UJ46( -11) ;
      }
      pr_default.close(37);
      onLoadActions1UJ46( ) ;
   }

   public void onLoadActions1UJ46( )
   {
   }

   public void checkExtendedTable1UJ46( )
   {
      nIsDirty_46 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1UJ46( ) ;
   }

   public void closeExtendedTableCursors1UJ46( )
   {
   }

   public void enableDisable1UJ46( )
   {
   }

   public void getKey1UJ46( )
   {
      /* Using cursor T01UJ40 */
      pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Byte.valueOf(A463FasNumLin)});
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound46 = (short)(1) ;
      }
      else
      {
         RcdFound46 = (short)(0) ;
      }
      pr_default.close(38);
   }

   public void getByPrimaryKey1UJ46( )
   {
      /* Using cursor T01UJ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Byte.valueOf(A463FasNumLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UJ46( 11) ;
         RcdFound46 = (short)(1) ;
         initializeNonKey1UJ46( ) ;
         A463FasNumLin = T01UJ3_A463FasNumLin[0] ;
         A465FasObs = T01UJ3_A465FasObs[0] ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z463FasNumLin = A463FasNumLin ;
         sMode46 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UJ46( ) ;
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound46 = (short)(0) ;
         initializeNonKey1UJ46( ) ;
         sMode46 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UJ46( ) ;
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UJ46( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UJ46( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UJ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Byte.valueOf(A463FasNumLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z465FasObs, T01UJ2_A465FasObs[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z465FasObs, T01UJ2_A465FasObs[0]) != 0 )
            {
               GXutil.writeLogln("tfaspro_observaciones:[seudo value changed for attri]"+"FasObs");
               GXutil.writeLogRaw("Old: ",Z465FasObs);
               GXutil.writeLogRaw("Current: ",T01UJ2_A465FasObs[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFASLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UJ46( )
   {
      beforeValidate1UJ46( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UJ46( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UJ46( 0) ;
         checkOptimisticConcurrency1UJ46( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UJ46( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UJ46( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UJ41 */
                  pr_default.execute(39, new Object[] {Boolean.valueOf(n457FasCod), A457FasCod, Byte.valueOf(A463FasNumLin), A465FasObs, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASLIN");
                  if ( (pr_default.getStatus(39) == 1) )
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
            load1UJ46( ) ;
         }
         endLevel1UJ46( ) ;
      }
      closeExtendedTableCursors1UJ46( ) ;
   }

   public void update1UJ46( )
   {
      beforeValidate1UJ46( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UJ46( ) ;
      }
      if ( ( nIsMod_46 != 0 ) || ( nIsDirty_46 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UJ46( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UJ46( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UJ46( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UJ42 */
                     pr_default.execute(40, new Object[] {A465FasObs, A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Byte.valueOf(A463FasNumLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASLIN");
                     if ( (pr_default.getStatus(40) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFASLIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UJ46( ) ;
                     if ( AnyError == 0 )
                     {
                        GXv_char4[0] = A396EmprCod ;
                        GXv_char3[0] = A457FasCod ;
                        new app.txpfasproupdateredundancy(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
                        tfaspro_observaciones_impl.this.A396EmprCod = GXv_char4[0] ;
                        tfaspro_observaciones_impl.this.A457FasCod = GXv_char3[0] ;
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UJ46( ) ;
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
            endLevel1UJ46( ) ;
         }
      }
      closeExtendedTableCursors1UJ46( ) ;
   }

   public void deferredUpdate1UJ46( )
   {
   }

   public void delete1UJ46( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UJ46( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UJ46( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UJ46( ) ;
         afterConfirm1UJ46( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UJ46( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UJ43 */
               pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod, Byte.valueOf(A463FasNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFASLIN");
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
      sMode46 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UJ46( ) ;
      Gx_mode = sMode46 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UJ46( )
   {
      standaloneModal1UJ46( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1UJ46( )
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

   public void scanStart1UJ46( )
   {
      /* Scan By routine */
      /* Using cursor T01UJ44 */
      pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n457FasCod), A457FasCod});
      RcdFound46 = (short)(0) ;
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A463FasNumLin = T01UJ44_A463FasNumLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UJ46( )
   {
      /* Scan next routine */
      pr_default.readNext(42);
      RcdFound46 = (short)(0) ;
      if ( (pr_default.getStatus(42) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A463FasNumLin = T01UJ44_A463FasNumLin[0] ;
      }
   }

   public void scanEnd1UJ46( )
   {
      pr_default.close(42);
   }

   public void afterConfirm1UJ46( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UJ46( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UJ46( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UJ46( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UJ46( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UJ46( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UJ46( )
   {
      edtFasNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtFasObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasObs_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes1UJ46( )
   {
   }

   public void send_integrity_lvl_hashes1UJ45( )
   {
   }

   public void subsflControlProps_3246( )
   {
      edtFasNumLin_Internalname = "FASNUMLIN_"+sGXsfl_32_idx ;
      edtFasObs_Internalname = "FASOBS_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_3246( )
   {
      edtFasNumLin_Internalname = "FASNUMLIN_"+sGXsfl_32_fel_idx ;
      edtFasObs_Internalname = "FASOBS_"+sGXsfl_32_fel_idx ;
   }

   public void addRow1UJ46( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3246( ) ;
      sendRow1UJ46( ) ;
   }

   public void sendRow1UJ46( )
   {
      Gridlevel_fasnumRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_fasnum_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_fasnum_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_fasnum_Class, "") != 0 )
         {
            subGridlevel_fasnum_Linesclass = subGridlevel_fasnum_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_fasnum_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_fasnum_Backstyle = (byte)(0) ;
         subGridlevel_fasnum_Backcolor = subGridlevel_fasnum_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_fasnum_Class, "") != 0 )
         {
            subGridlevel_fasnum_Linesclass = subGridlevel_fasnum_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_fasnum_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_fasnum_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_fasnum_Class, "") != 0 )
         {
            subGridlevel_fasnum_Linesclass = subGridlevel_fasnum_Class+"Odd" ;
         }
         subGridlevel_fasnum_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_fasnum_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_fasnum_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
         {
            subGridlevel_fasnum_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_fasnum_Class, "") != 0 )
            {
               subGridlevel_fasnum_Linesclass = subGridlevel_fasnum_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_fasnum_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_fasnum_Class, "") != 0 )
            {
               subGridlevel_fasnum_Linesclass = subGridlevel_fasnum_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_fasnumRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumLin_Internalname,GXutil.ltrim( localUtil.ntoc( A463FasNumLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasNumLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A463FasNumLin), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A463FasNumLin), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasNumLin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_46_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_fasnumRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasObs_Internalname,GXutil.rtrim( A465FasObs),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasObs_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasObs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(70),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_fasnumRow);
      send_integrity_lvl_hashes1UJ46( ) ;
      GXCCtl = "Z463FasNumLin_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z463FasNumLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z465FasObs_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z465FasObs));
      GXCCtl = "nRcdDeleted_46_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_46_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_46_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_46, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7EmprCod));
      GXCCtl = "vFASCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV8FasCod));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASNUMLIN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASOBS_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_fasnumContainer.AddRow(Gridlevel_fasnumRow);
   }

   public void readRow1UJ46( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3246( ) ;
      edtFasNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMLIN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasObs_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASOBS_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A463FasNumLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtFasNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A465FasObs = httpContext.cgiGet( edtFasObs_Internalname) ;
      GXCCtl = "Z463FasNumLin_" + sGXsfl_32_idx ;
      Z463FasNumLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z465FasObs_" + sGXsfl_32_idx ;
      Z465FasObs = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_46_" + sGXsfl_32_idx ;
      nRcdDeleted_46 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_46_" + sGXsfl_32_idx ;
      nRcdExists_46 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_46_" + sGXsfl_32_idx ;
      nIsMod_46 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFasNumLin_Enabled = edtFasNumLin_Enabled ;
   }

   public void confirmValues1UJ0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_3246( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3246( ) ;
         httpContext.changePostValue( "Z463FasNumLin_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z463FasNumLin_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z463FasNumLin_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z465FasObs_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z465FasObs_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z465FasObs_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tfaspro_observaciones", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8FasCod))}, new String[] {"Gx_mode","EmprCod","FasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Tfaspro_Observaciones");
      forbiddenHiddens.add("FasCod", GXutil.rtrim( localUtil.format( A457FasCod, "@!")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("FasDsc", GXutil.rtrim( localUtil.format( A460FasDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tfaspro_observaciones:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z460FasDsc", GXutil.rtrim( Z460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z471FasUltLin", GXutil.ltrim( localUtil.ntoc( Z471FasUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O471FasUltLin", GXutil.ltrim( localUtil.ntoc( O471FasUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFASCOD", GXutil.rtrim( AV8FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8FasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "FASULTLIN", GXutil.ltrim( localUtil.ntoc( A471FasUltLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Objectcall", GXutil.rtrim( Datamonjs_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Enabled", GXutil.booltostr( Datamonjs_Enabled));
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
      return formatLink("app.tfaspro_observaciones", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8FasCod))}, new String[] {"Gx_mode","EmprCod","FasCod"})  ;
   }

   public String getPgmname( )
   {
      return "Tfaspro_Observaciones" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Observaciones", "") ;
   }

   public void initializeNonKey1UJ45( )
   {
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A471FasUltLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      O471FasUltLin = A471FasUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
      Z460FasDsc = "" ;
      Z471FasUltLin = (byte)(0) ;
   }

   public void initAll1UJ45( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A457FasCod = "" ;
      n457FasCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      initializeNonKey1UJ45( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UJ46( )
   {
      A465FasObs = "" ;
      Z465FasObs = "" ;
   }

   public void initAll1UJ46( )
   {
      A463FasNumLin = (byte)(0) ;
      initializeNonKey1UJ46( ) ;
   }

   public void standaloneModalInsert1UJ46( )
   {
      A471FasUltLin = i471FasUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A471FasUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A471FasUltLin), 2, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116103083", true, true);
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
      httpContext.AddJavascriptSource("tfaspro_observaciones.js", "?202682116103083", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties46( )
   {
      edtFasNumLin_Enabled = defedtFasNumLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumLin_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
   {
      Gridlevel_fasnumContainer.AddObjectProperty("GridName", "Gridlevel_fasnum");
      Gridlevel_fasnumContainer.AddObjectProperty("Header", subGridlevel_fasnum_Header);
      Gridlevel_fasnumContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_fasnumContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_fasnumContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_fasnumColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasnumColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A463FasNumLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_fasnumColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddColumnProperties(Gridlevel_fasnumColumn);
      Gridlevel_fasnumColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_fasnumColumn.AddObjectProperty("Value", GXutil.rtrim( A465FasObs));
      Gridlevel_fasnumColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasObs_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddColumnProperties(Gridlevel_fasnumColumn);
      Gridlevel_fasnumContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_fasnumContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_fasnum_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtFasNumLin_Internalname = "FASNUMLIN" ;
      edtFasObs_Internalname = "FASOBS" ;
      divTableleaflevel_fasnum_Internalname = "TABLELEAFLEVEL_FASNUM" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_fasnum_Internalname = "GRIDLEVEL_FASNUM" ;
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
      subGridlevel_fasnum_Allowcollapsing = (byte)(0) ;
      subGridlevel_fasnum_Allowselection = (byte)(0) ;
      subGridlevel_fasnum_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Observaciones", "") );
      edtFasObs_Jsonclick = "" ;
      edtFasNumLin_Jsonclick = "" ;
      subGridlevel_fasnum_Class = "GridNoBorder WorkWith" ;
      subGridlevel_fasnum_Backcolorstyle = (byte)(0) ;
      edtFasObs_Enabled = 1 ;
      edtFasNumLin_Enabled = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFasDsc_Jsonclick = "" ;
      edtFasDsc_Enabled = 0 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 0 ;
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

   public void gxnrgridlevel_fasnum_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_3246( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UJ46( ) ;
         standaloneModal1UJ46( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UJ46( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_3246( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_fasnumContainer)) ;
      /* End function gxnrGridlevel_fasnum_newrow */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8FasCod',fld:'vFASCOD',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8FasCod',fld:'vFASCOD',pic:'@!',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UJ2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_FASNUMLIN","{handler:'valid_Fasnumlin',iparms:[]");
      setEventMetadata("VALID_FASNUMLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Fasobs',iparms:[]");
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
      wcpOAV7EmprCod = "" ;
      wcpOAV8FasCod = "" ;
      Z396EmprCod = "" ;
      Z457FasCod = "" ;
      Z460FasDsc = "" ;
      Z465FasObs = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV8FasCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A457FasCod = "" ;
      A460FasDsc = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV13Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_fasnumContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode46 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode45 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A465FasObs = "" ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV15Emprnom = "" ;
      AV16Usurcod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T01UJ6_A407EmprNom = new String[] {""} ;
      T01UJ6_n407EmprNom = new boolean[] {false} ;
      T01UJ7_A457FasCod = new String[] {""} ;
      T01UJ7_n457FasCod = new boolean[] {false} ;
      T01UJ7_A460FasDsc = new String[] {""} ;
      T01UJ7_A407EmprNom = new String[] {""} ;
      T01UJ7_n407EmprNom = new boolean[] {false} ;
      T01UJ7_A471FasUltLin = new byte[1] ;
      T01UJ7_A396EmprCod = new String[] {""} ;
      T01UJ8_A396EmprCod = new String[] {""} ;
      T01UJ8_A457FasCod = new String[] {""} ;
      T01UJ8_n457FasCod = new boolean[] {false} ;
      T01UJ5_A457FasCod = new String[] {""} ;
      T01UJ5_n457FasCod = new boolean[] {false} ;
      T01UJ5_A460FasDsc = new String[] {""} ;
      T01UJ5_A471FasUltLin = new byte[1] ;
      T01UJ5_A396EmprCod = new String[] {""} ;
      T01UJ9_A396EmprCod = new String[] {""} ;
      T01UJ9_A457FasCod = new String[] {""} ;
      T01UJ9_n457FasCod = new boolean[] {false} ;
      T01UJ10_A396EmprCod = new String[] {""} ;
      T01UJ10_A457FasCod = new String[] {""} ;
      T01UJ10_n457FasCod = new boolean[] {false} ;
      T01UJ4_A457FasCod = new String[] {""} ;
      T01UJ4_n457FasCod = new boolean[] {false} ;
      T01UJ4_A460FasDsc = new String[] {""} ;
      T01UJ4_A471FasUltLin = new byte[1] ;
      T01UJ4_A396EmprCod = new String[] {""} ;
      T01UJ14_A396EmprCod = new String[] {""} ;
      T01UJ14_A129BarCod = new int[1] ;
      T01UJ14_A132BarCodReo = new byte[1] ;
      T01UJ14_A130BarCodPar = new String[] {""} ;
      T01UJ14_A14152MEnvOrd = new short[1] ;
      T01UJ15_A396EmprCod = new String[] {""} ;
      T01UJ15_A13026PedDGId = new int[1] ;
      T01UJ15_A758ProCod = new String[] {""} ;
      T01UJ15_A13045PedDGFasLi = new short[1] ;
      T01UJ16_A396EmprCod = new String[] {""} ;
      T01UJ16_A6882Tas_num = new int[1] ;
      T01UJ16_A6922Tas_lin = new short[1] ;
      T01UJ17_A396EmprCod = new String[] {""} ;
      T01UJ17_A11604PArtId = new int[1] ;
      T01UJ17_A11611PAFOrd = new short[1] ;
      T01UJ18_A396EmprCod = new String[] {""} ;
      T01UJ18_A11278Regc_c1 = new String[] {""} ;
      T01UJ18_A457FasCod = new String[] {""} ;
      T01UJ18_n457FasCod = new boolean[] {false} ;
      T01UJ19_A396EmprCod = new String[] {""} ;
      T01UJ19_A1131AviNumero = new long[1] ;
      T01UJ19_A457FasCod = new String[] {""} ;
      T01UJ19_n457FasCod = new boolean[] {false} ;
      T01UJ20_A396EmprCod = new String[] {""} ;
      T01UJ20_A457FasCod = new String[] {""} ;
      T01UJ20_n457FasCod = new boolean[] {false} ;
      T01UJ20_A9832MaqCodF = new String[] {""} ;
      T01UJ21_A396EmprCod = new String[] {""} ;
      T01UJ21_A457FasCod = new String[] {""} ;
      T01UJ21_n457FasCod = new boolean[] {false} ;
      T01UJ21_A9723Cod_par = new short[1] ;
      T01UJ22_A396EmprCod = new String[] {""} ;
      T01UJ22_A457FasCod = new String[] {""} ;
      T01UJ22_n457FasCod = new boolean[] {false} ;
      T01UJ22_A8096FasArtTip = new short[1] ;
      T01UJ22_A7730FasArtInt = new byte[1] ;
      T01UJ22_A7731FasArtSeg = new String[] {""} ;
      T01UJ23_A396EmprCod = new String[] {""} ;
      T01UJ23_A6633NumOrd = new short[1] ;
      T01UJ23_A457FasCod = new String[] {""} ;
      T01UJ23_n457FasCod = new boolean[] {false} ;
      T01UJ24_A396EmprCod = new String[] {""} ;
      T01UJ24_A2253SalExtAlb = new int[1] ;
      T01UJ24_A6248SalExNln = new short[1] ;
      T01UJ25_A396EmprCod = new String[] {""} ;
      T01UJ25_A457FasCod = new String[] {""} ;
      T01UJ25_n457FasCod = new boolean[] {false} ;
      T01UJ25_A5703Hh_FLin = new short[1] ;
      T01UJ26_A396EmprCod = new String[] {""} ;
      T01UJ26_A4744RecPreCod = new int[1] ;
      T01UJ27_A396EmprCod = new String[] {""} ;
      T01UJ27_A457FasCod = new String[] {""} ;
      T01UJ27_n457FasCod = new boolean[] {false} ;
      T01UJ27_A4650FasForLin = new short[1] ;
      T01UJ28_A396EmprCod = new String[] {""} ;
      T01UJ28_A457FasCod = new String[] {""} ;
      T01UJ28_n457FasCod = new boolean[] {false} ;
      T01UJ28_A4031CCTCod = new int[1] ;
      T01UJ29_A396EmprCod = new String[] {""} ;
      T01UJ29_A457FasCod = new String[] {""} ;
      T01UJ29_n457FasCod = new boolean[] {false} ;
      T01UJ29_A3635FasTerCod = new byte[1] ;
      T01UJ30_A396EmprCod = new String[] {""} ;
      T01UJ30_A2406ExhAlbCod = new int[1] ;
      T01UJ30_A129BarCod = new int[1] ;
      T01UJ30_A132BarCodReo = new byte[1] ;
      T01UJ30_A130BarCodPar = new String[] {""} ;
      T01UJ31_A396EmprCod = new String[] {""} ;
      T01UJ31_A2253SalExtAlb = new int[1] ;
      T01UJ31_A129BarCod = new int[1] ;
      T01UJ31_A132BarCodReo = new byte[1] ;
      T01UJ31_A130BarCodPar = new String[] {""} ;
      T01UJ32_A396EmprCod = new String[] {""} ;
      T01UJ32_A30AlbProCod = new long[1] ;
      T01UJ32_A129BarCod = new int[1] ;
      T01UJ32_A132BarCodReo = new byte[1] ;
      T01UJ32_A130BarCodPar = new String[] {""} ;
      T01UJ32_A1240GuiFasLin = new short[1] ;
      T01UJ33_A396EmprCod = new String[] {""} ;
      T01UJ33_A758ProCod = new String[] {""} ;
      T01UJ33_A774ProNumLin = new short[1] ;
      T01UJ34_A396EmprCod = new String[] {""} ;
      T01UJ34_A252CliCod = new int[1] ;
      T01UJ34_A457FasCod = new String[] {""} ;
      T01UJ34_n457FasCod = new boolean[] {false} ;
      T01UJ35_A396EmprCod = new String[] {""} ;
      T01UJ35_A361DisCod = new int[1] ;
      T01UJ35_A758ProCod = new String[] {""} ;
      T01UJ35_A368DisFasLin = new short[1] ;
      T01UJ36_A396EmprCod = new String[] {""} ;
      T01UJ36_A129BarCod = new int[1] ;
      T01UJ36_A132BarCodReo = new byte[1] ;
      T01UJ36_A130BarCodPar = new String[] {""} ;
      T01UJ36_A758ProCod = new String[] {""} ;
      T01UJ36_A194BarOrdLin = new short[1] ;
      T01UJ38_A396EmprCod = new String[] {""} ;
      T01UJ38_A457FasCod = new String[] {""} ;
      T01UJ38_n457FasCod = new boolean[] {false} ;
      T01UJ39_A457FasCod = new String[] {""} ;
      T01UJ39_n457FasCod = new boolean[] {false} ;
      T01UJ39_A463FasNumLin = new byte[1] ;
      T01UJ39_A465FasObs = new String[] {""} ;
      T01UJ39_A396EmprCod = new String[] {""} ;
      T01UJ40_A396EmprCod = new String[] {""} ;
      T01UJ40_A457FasCod = new String[] {""} ;
      T01UJ40_n457FasCod = new boolean[] {false} ;
      T01UJ40_A463FasNumLin = new byte[1] ;
      T01UJ3_A457FasCod = new String[] {""} ;
      T01UJ3_n457FasCod = new boolean[] {false} ;
      T01UJ3_A463FasNumLin = new byte[1] ;
      T01UJ3_A465FasObs = new String[] {""} ;
      T01UJ3_A396EmprCod = new String[] {""} ;
      T01UJ2_A457FasCod = new String[] {""} ;
      T01UJ2_n457FasCod = new boolean[] {false} ;
      T01UJ2_A463FasNumLin = new byte[1] ;
      T01UJ2_A465FasObs = new String[] {""} ;
      T01UJ2_A396EmprCod = new String[] {""} ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      T01UJ44_A396EmprCod = new String[] {""} ;
      T01UJ44_A457FasCod = new String[] {""} ;
      T01UJ44_n457FasCod = new boolean[] {false} ;
      T01UJ44_A463FasNumLin = new byte[1] ;
      Gridlevel_fasnumRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_fasnum_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_fasnumColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tfaspro_observaciones__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tfaspro_observaciones__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tfaspro_observaciones__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tfaspro_observaciones__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tfaspro_observaciones__default(),
         new Object[] {
             new Object[] {
            T01UJ2_A457FasCod, T01UJ2_A463FasNumLin, T01UJ2_A465FasObs, T01UJ2_A396EmprCod
            }
            , new Object[] {
            T01UJ3_A457FasCod, T01UJ3_A463FasNumLin, T01UJ3_A465FasObs, T01UJ3_A396EmprCod
            }
            , new Object[] {
            T01UJ4_A457FasCod, T01UJ4_A460FasDsc, T01UJ4_A471FasUltLin, T01UJ4_A396EmprCod
            }
            , new Object[] {
            T01UJ5_A457FasCod, T01UJ5_A460FasDsc, T01UJ5_A471FasUltLin, T01UJ5_A396EmprCod
            }
            , new Object[] {
            T01UJ6_A407EmprNom, T01UJ6_n407EmprNom
            }
            , new Object[] {
            T01UJ7_A457FasCod, T01UJ7_A460FasDsc, T01UJ7_A407EmprNom, T01UJ7_n407EmprNom, T01UJ7_A471FasUltLin, T01UJ7_A396EmprCod
            }
            , new Object[] {
            T01UJ8_A396EmprCod, T01UJ8_A457FasCod
            }
            , new Object[] {
            T01UJ9_A396EmprCod, T01UJ9_A457FasCod
            }
            , new Object[] {
            T01UJ10_A396EmprCod, T01UJ10_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UJ14_A396EmprCod, T01UJ14_A129BarCod, T01UJ14_A132BarCodReo, T01UJ14_A130BarCodPar, T01UJ14_A14152MEnvOrd
            }
            , new Object[] {
            T01UJ15_A396EmprCod, T01UJ15_A13026PedDGId, T01UJ15_A758ProCod, T01UJ15_A13045PedDGFasLi
            }
            , new Object[] {
            T01UJ16_A396EmprCod, T01UJ16_A6882Tas_num, T01UJ16_A6922Tas_lin
            }
            , new Object[] {
            T01UJ17_A396EmprCod, T01UJ17_A11604PArtId, T01UJ17_A11611PAFOrd
            }
            , new Object[] {
            T01UJ18_A396EmprCod, T01UJ18_A11278Regc_c1, T01UJ18_A457FasCod
            }
            , new Object[] {
            T01UJ19_A396EmprCod, T01UJ19_A1131AviNumero, T01UJ19_A457FasCod
            }
            , new Object[] {
            T01UJ20_A396EmprCod, T01UJ20_A457FasCod, T01UJ20_A9832MaqCodF
            }
            , new Object[] {
            T01UJ21_A396EmprCod, T01UJ21_A457FasCod, T01UJ21_A9723Cod_par
            }
            , new Object[] {
            T01UJ22_A396EmprCod, T01UJ22_A457FasCod, T01UJ22_A8096FasArtTip, T01UJ22_A7730FasArtInt, T01UJ22_A7731FasArtSeg
            }
            , new Object[] {
            T01UJ23_A396EmprCod, T01UJ23_A6633NumOrd, T01UJ23_A457FasCod
            }
            , new Object[] {
            T01UJ24_A396EmprCod, T01UJ24_A2253SalExtAlb, T01UJ24_A6248SalExNln
            }
            , new Object[] {
            T01UJ25_A396EmprCod, T01UJ25_A457FasCod, T01UJ25_A5703Hh_FLin
            }
            , new Object[] {
            T01UJ26_A396EmprCod, T01UJ26_A4744RecPreCod
            }
            , new Object[] {
            T01UJ27_A396EmprCod, T01UJ27_A457FasCod, T01UJ27_A4650FasForLin
            }
            , new Object[] {
            T01UJ28_A396EmprCod, T01UJ28_A457FasCod, T01UJ28_A4031CCTCod
            }
            , new Object[] {
            T01UJ29_A396EmprCod, T01UJ29_A457FasCod, T01UJ29_A3635FasTerCod
            }
            , new Object[] {
            T01UJ30_A396EmprCod, T01UJ30_A2406ExhAlbCod, T01UJ30_A129BarCod, T01UJ30_A132BarCodReo, T01UJ30_A130BarCodPar
            }
            , new Object[] {
            T01UJ31_A396EmprCod, T01UJ31_A2253SalExtAlb, T01UJ31_A129BarCod, T01UJ31_A132BarCodReo, T01UJ31_A130BarCodPar
            }
            , new Object[] {
            T01UJ32_A396EmprCod, T01UJ32_A30AlbProCod, T01UJ32_A129BarCod, T01UJ32_A132BarCodReo, T01UJ32_A130BarCodPar, T01UJ32_A1240GuiFasLin
            }
            , new Object[] {
            T01UJ33_A396EmprCod, T01UJ33_A758ProCod, T01UJ33_A774ProNumLin
            }
            , new Object[] {
            T01UJ34_A396EmprCod, T01UJ34_A252CliCod, T01UJ34_A457FasCod
            }
            , new Object[] {
            T01UJ35_A396EmprCod, T01UJ35_A361DisCod, T01UJ35_A758ProCod, T01UJ35_A368DisFasLin
            }
            , new Object[] {
            T01UJ36_A396EmprCod, T01UJ36_A129BarCod, T01UJ36_A132BarCodReo, T01UJ36_A130BarCodPar, T01UJ36_A758ProCod, T01UJ36_A194BarOrdLin
            }
            , new Object[] {
            }
            , new Object[] {
            T01UJ38_A396EmprCod, T01UJ38_A457FasCod
            }
            , new Object[] {
            T01UJ39_A457FasCod, T01UJ39_A463FasNumLin, T01UJ39_A465FasObs, T01UJ39_A396EmprCod
            }
            , new Object[] {
            T01UJ40_A396EmprCod, T01UJ40_A457FasCod, T01UJ40_A463FasNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UJ44_A396EmprCod, T01UJ44_A457FasCod, T01UJ44_A463FasNumLin
            }
         }
      );
      AV13Pgmname = "Tfaspro_Observaciones" ;
   }

   private byte Z471FasUltLin ;
   private byte O471FasUltLin ;
   private byte Z463FasNumLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A471FasUltLin ;
   private byte Gx_BScreen ;
   private byte B471FasUltLin ;
   private byte s471FasUltLin ;
   private byte A463FasNumLin ;
   private byte subGridlevel_fasnum_Backcolorstyle ;
   private byte subGridlevel_fasnum_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i471FasUltLin ;
   private byte subGridlevel_fasnum_Allowselection ;
   private byte subGridlevel_fasnum_Allowhovering ;
   private byte subGridlevel_fasnum_Allowcollapsing ;
   private byte subGridlevel_fasnum_Collapsed ;
   private short nRcdDeleted_46 ;
   private short nRcdExists_46 ;
   private short nIsMod_46 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount46 ;
   private short RcdFound46 ;
   private short nBlankRcdUsr46 ;
   private short RcdFound45 ;
   private short nIsDirty_45 ;
   private short nIsDirty_46 ;
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
   private int edtavPgmname_Enabled ;
   private int edtFasNumLin_Enabled ;
   private int edtFasObs_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_fasnum_Backcolor ;
   private int subGridlevel_fasnum_Allbackcolor ;
   private int defedtFasNumLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_fasnum_Selectedindex ;
   private int subGridlevel_fasnum_Selectioncolor ;
   private int subGridlevel_fasnum_Hoveringcolor ;
   private long GRIDLEVEL_FASNUM_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8FasCod ;
   private String Z396EmprCod ;
   private String Z457FasCod ;
   private String Z460FasDsc ;
   private String Z465FasObs ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV8FasCod ;
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
   private String edtFasCod_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Jsonclick ;
   private String divTableleaflevel_fasnum_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV13Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode46 ;
   private String edtFasNumLin_Internalname ;
   private String edtFasObs_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_fasnum_Internalname ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode45 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A465FasObs ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String AV16Usurcod ;
   private String Z407EmprNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_fasnum_Class ;
   private String subGridlevel_fasnum_Linesclass ;
   private String ROClassString ;
   private String edtFasNumLin_Jsonclick ;
   private String edtFasObs_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_fasnum_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n457FasCod ;
   private boolean returnInSub ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_fasnumContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_fasnumRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_fasnumColumn ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UJ6_A407EmprNom ;
   private boolean[] T01UJ6_n407EmprNom ;
   private String[] T01UJ7_A457FasCod ;
   private boolean[] T01UJ7_n457FasCod ;
   private String[] T01UJ7_A460FasDsc ;
   private String[] T01UJ7_A407EmprNom ;
   private boolean[] T01UJ7_n407EmprNom ;
   private byte[] T01UJ7_A471FasUltLin ;
   private String[] T01UJ7_A396EmprCod ;
   private String[] T01UJ8_A396EmprCod ;
   private String[] T01UJ8_A457FasCod ;
   private boolean[] T01UJ8_n457FasCod ;
   private String[] T01UJ5_A457FasCod ;
   private boolean[] T01UJ5_n457FasCod ;
   private String[] T01UJ5_A460FasDsc ;
   private byte[] T01UJ5_A471FasUltLin ;
   private String[] T01UJ5_A396EmprCod ;
   private String[] T01UJ9_A396EmprCod ;
   private String[] T01UJ9_A457FasCod ;
   private boolean[] T01UJ9_n457FasCod ;
   private String[] T01UJ10_A396EmprCod ;
   private String[] T01UJ10_A457FasCod ;
   private boolean[] T01UJ10_n457FasCod ;
   private String[] T01UJ4_A457FasCod ;
   private boolean[] T01UJ4_n457FasCod ;
   private String[] T01UJ4_A460FasDsc ;
   private byte[] T01UJ4_A471FasUltLin ;
   private String[] T01UJ4_A396EmprCod ;
   private String[] T01UJ14_A396EmprCod ;
   private int[] T01UJ14_A129BarCod ;
   private byte[] T01UJ14_A132BarCodReo ;
   private String[] T01UJ14_A130BarCodPar ;
   private short[] T01UJ14_A14152MEnvOrd ;
   private String[] T01UJ15_A396EmprCod ;
   private int[] T01UJ15_A13026PedDGId ;
   private String[] T01UJ15_A758ProCod ;
   private short[] T01UJ15_A13045PedDGFasLi ;
   private String[] T01UJ16_A396EmprCod ;
   private int[] T01UJ16_A6882Tas_num ;
   private short[] T01UJ16_A6922Tas_lin ;
   private String[] T01UJ17_A396EmprCod ;
   private int[] T01UJ17_A11604PArtId ;
   private short[] T01UJ17_A11611PAFOrd ;
   private String[] T01UJ18_A396EmprCod ;
   private String[] T01UJ18_A11278Regc_c1 ;
   private String[] T01UJ18_A457FasCod ;
   private boolean[] T01UJ18_n457FasCod ;
   private String[] T01UJ19_A396EmprCod ;
   private long[] T01UJ19_A1131AviNumero ;
   private String[] T01UJ19_A457FasCod ;
   private boolean[] T01UJ19_n457FasCod ;
   private String[] T01UJ20_A396EmprCod ;
   private String[] T01UJ20_A457FasCod ;
   private boolean[] T01UJ20_n457FasCod ;
   private String[] T01UJ20_A9832MaqCodF ;
   private String[] T01UJ21_A396EmprCod ;
   private String[] T01UJ21_A457FasCod ;
   private boolean[] T01UJ21_n457FasCod ;
   private short[] T01UJ21_A9723Cod_par ;
   private String[] T01UJ22_A396EmprCod ;
   private String[] T01UJ22_A457FasCod ;
   private boolean[] T01UJ22_n457FasCod ;
   private short[] T01UJ22_A8096FasArtTip ;
   private byte[] T01UJ22_A7730FasArtInt ;
   private String[] T01UJ22_A7731FasArtSeg ;
   private String[] T01UJ23_A396EmprCod ;
   private short[] T01UJ23_A6633NumOrd ;
   private String[] T01UJ23_A457FasCod ;
   private boolean[] T01UJ23_n457FasCod ;
   private String[] T01UJ24_A396EmprCod ;
   private int[] T01UJ24_A2253SalExtAlb ;
   private short[] T01UJ24_A6248SalExNln ;
   private String[] T01UJ25_A396EmprCod ;
   private String[] T01UJ25_A457FasCod ;
   private boolean[] T01UJ25_n457FasCod ;
   private short[] T01UJ25_A5703Hh_FLin ;
   private String[] T01UJ26_A396EmprCod ;
   private int[] T01UJ26_A4744RecPreCod ;
   private String[] T01UJ27_A396EmprCod ;
   private String[] T01UJ27_A457FasCod ;
   private boolean[] T01UJ27_n457FasCod ;
   private short[] T01UJ27_A4650FasForLin ;
   private String[] T01UJ28_A396EmprCod ;
   private String[] T01UJ28_A457FasCod ;
   private boolean[] T01UJ28_n457FasCod ;
   private int[] T01UJ28_A4031CCTCod ;
   private String[] T01UJ29_A396EmprCod ;
   private String[] T01UJ29_A457FasCod ;
   private boolean[] T01UJ29_n457FasCod ;
   private byte[] T01UJ29_A3635FasTerCod ;
   private String[] T01UJ30_A396EmprCod ;
   private int[] T01UJ30_A2406ExhAlbCod ;
   private int[] T01UJ30_A129BarCod ;
   private byte[] T01UJ30_A132BarCodReo ;
   private String[] T01UJ30_A130BarCodPar ;
   private String[] T01UJ31_A396EmprCod ;
   private int[] T01UJ31_A2253SalExtAlb ;
   private int[] T01UJ31_A129BarCod ;
   private byte[] T01UJ31_A132BarCodReo ;
   private String[] T01UJ31_A130BarCodPar ;
   private String[] T01UJ32_A396EmprCod ;
   private long[] T01UJ32_A30AlbProCod ;
   private int[] T01UJ32_A129BarCod ;
   private byte[] T01UJ32_A132BarCodReo ;
   private String[] T01UJ32_A130BarCodPar ;
   private short[] T01UJ32_A1240GuiFasLin ;
   private String[] T01UJ33_A396EmprCod ;
   private String[] T01UJ33_A758ProCod ;
   private short[] T01UJ33_A774ProNumLin ;
   private String[] T01UJ34_A396EmprCod ;
   private int[] T01UJ34_A252CliCod ;
   private String[] T01UJ34_A457FasCod ;
   private boolean[] T01UJ34_n457FasCod ;
   private String[] T01UJ35_A396EmprCod ;
   private int[] T01UJ35_A361DisCod ;
   private String[] T01UJ35_A758ProCod ;
   private short[] T01UJ35_A368DisFasLin ;
   private String[] T01UJ36_A396EmprCod ;
   private int[] T01UJ36_A129BarCod ;
   private byte[] T01UJ36_A132BarCodReo ;
   private String[] T01UJ36_A130BarCodPar ;
   private String[] T01UJ36_A758ProCod ;
   private short[] T01UJ36_A194BarOrdLin ;
   private String[] T01UJ38_A396EmprCod ;
   private String[] T01UJ38_A457FasCod ;
   private boolean[] T01UJ38_n457FasCod ;
   private String[] T01UJ39_A457FasCod ;
   private boolean[] T01UJ39_n457FasCod ;
   private byte[] T01UJ39_A463FasNumLin ;
   private String[] T01UJ39_A465FasObs ;
   private String[] T01UJ39_A396EmprCod ;
   private String[] T01UJ40_A396EmprCod ;
   private String[] T01UJ40_A457FasCod ;
   private boolean[] T01UJ40_n457FasCod ;
   private byte[] T01UJ40_A463FasNumLin ;
   private String[] T01UJ3_A457FasCod ;
   private boolean[] T01UJ3_n457FasCod ;
   private byte[] T01UJ3_A463FasNumLin ;
   private String[] T01UJ3_A465FasObs ;
   private String[] T01UJ3_A396EmprCod ;
   private String[] T01UJ2_A457FasCod ;
   private boolean[] T01UJ2_n457FasCod ;
   private byte[] T01UJ2_A463FasNumLin ;
   private String[] T01UJ2_A465FasObs ;
   private String[] T01UJ2_A396EmprCod ;
   private String[] T01UJ44_A396EmprCod ;
   private String[] T01UJ44_A457FasCod ;
   private boolean[] T01UJ44_n457FasCod ;
   private byte[] T01UJ44_A463FasNumLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
}

final  class tfaspro_observaciones__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro_observaciones__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro_observaciones__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro_observaciones__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfaspro_observaciones__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UJ2", "SELECT FasCod, FasNumLin, FasObs, EmprCod FROM TXPFASLIN WHERE EmprCod = ? AND FasCod = ? AND FasNumLin = ?  FOR UPDATE OF FasObs NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ3", "SELECT FasCod, FasNumLin, FasObs, EmprCod FROM TXPFASLIN WHERE EmprCod = ? AND FasCod = ? AND FasNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ4", "SELECT FasCod, FasDsc, FasUltLin, EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ?  FOR UPDATE OF FasDsc, FasUltLin NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ5", "SELECT FasCod, FasDsc, FasUltLin, EmprCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ7", "SELECT /*+ FIRST_ROWS(100) */ TM1.FasCod, TM1.FasDsc, T2.EmprNom, TM1.FasUltLin, TM1.EmprCod FROM (TXPFASPRO TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.FasCod = ? ORDER BY TM1.EmprCod, TM1.FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE ( EmprCod > ? or EmprCod = ? and FasCod > ?) ORDER BY EmprCod, FasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FasCod FROM TXPFASPRO WHERE ( EmprCod < ? or EmprCod = ? and FasCod < ?) ORDER BY EmprCod DESC, FasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UJ11", "INSERT INTO TXPFASPRO(FasCod, FasDsc, FasUltLin, EmprCod, MaqCod, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasEstamp, FasCC, FasCara, FasUltFor, FasProDsc, FasDsc2, FasUltForL, FasValMtr, FasAcab, FasPreMC, FasProCtb, FasGral, FasFact, FasTExt, Hh_FUltL, FasDec2, FasTip, SecCodF, FasTpp, FasTog, FasFGp, FasUnpLt, FasOpeIns, FasPesInt, FasSigla, Tip_CodFas, FasObl, FasRbCost, FasTpCost, FasH2OReh, FasPreObl, FasPesExp, FasObsF, FasCrgNor, FasCrgOpt, FasOpeTip, FasGrupo, FasNorma, FasCarda, FasActiva, FasSalida, FastoVtx, FasMtsAnc, FasInsAlb, FasTubos, FasStki, FasCops, FasClsHdr, FasStkT, FasPrefj, FasFinHdr, FasDivTime) VALUES(?, ?, ?, ?, ' ', 0, 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, 0, ' ', 0, ' ', ' ', ' ', ' ', 0, 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', 0, ' ', 0, 0, ' ', 0, ' ', ' ', 0, 0, 0, 0, ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ')", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T01UJ12", "UPDATE TXPFASPRO SET FasDsc=?, FasUltLin=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new UpdateCursor("T01UJ13", "DELETE FROM TXPFASPRO  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new ForEachCursor("T01UJ14", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd FROM TXPMEnv WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ15", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi FROM TXPPEDDG5 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ16", "SELECT * FROM (SELECT EmprCod, Tas_num, Tas_lin FROM TXPCOSTA1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ17", "SELECT * FROM (SELECT EmprCod, PArtId, PAFOrd FROM TXPPedAFa WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ18", "SELECT * FROM (SELECT EmprCod, Regc_c1, FasCod FROM TXPREGC02 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ19", "SELECT * FROM (SELECT EmprCod, AviNumero, FasCod FROM TXPAVI001 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ20", "SELECT * FROM (SELECT EmprCod, FasCod, MaqCodF FROM TXPPARFSM WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ21", "SELECT * FROM (SELECT EmprCod, FasCod, Cod_par FROM TXPPARFSS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ22", "SELECT * FROM (SELECT EmprCod, FasCod, FasArtTip, FasArtInt, FasArtSeg FROM TXPArtPrd WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ23", "SELECT * FROM (SELECT EmprCod, NumOrd, FasCod FROM TXPFASMUS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ24", "SELECT * FROM (SELECT EmprCod, SalExtAlb, SalExNln FROM TXPEXHDPZ WHERE EmprCod = ? AND FasCodn = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ25", "SELECT * FROM (SELECT EmprCod, FasCod, Hh_FLin FROM TXPALAPFA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ26", "SELECT * FROM (SELECT EmprCod, RecPreCod FROM TXPPREREC WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ27", "SELECT * FROM (SELECT EmprCod, FasCod, FasForLin FROM TXPFASPR1 WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ28", "SELECT * FROM (SELECT EmprCod, FasCod, CCTCod FROM TXPCCFas WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ29", "SELECT * FROM (SELECT EmprCod, FasCod, FasTerCod FROM TXPFASTER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ30", "SELECT * FROM (SELECT EmprCod, ExhAlbCod, BarCod, BarCodReo, BarCodPar FROM TXPLEXPER WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ31", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ32", "SELECT * FROM (SELECT EmprCod, AlbProCod, BarCod, BarCodReo, BarCodPar, GuiFasLin FROM TXPALBFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ33", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ34", "SELECT * FROM (SELECT EmprCod, CliCod, FasCod FROM TXPPREFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ35", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin FROM TXPDISFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UJ36", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin FROM TXPBARFAS WHERE EmprCod = ? AND FasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UJ37", "UPDATE TXPFASPRO SET FasUltLin=?  WHERE EmprCod = ? AND FasCod = ?", GX_NOMASK, "TXPFASPRO")
         ,new ForEachCursor("T01UJ38", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FasCod FROM TXPFASPRO ORDER BY EmprCod, FasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ39", "SELECT FasCod, FasNumLin, FasObs, EmprCod FROM TXPFASLIN WHERE EmprCod = ? and FasCod = ? and FasNumLin = ? ORDER BY EmprCod, FasCod, FasNumLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UJ40", "SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ? AND FasCod = ? AND FasNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UJ41", "INSERT INTO TXPFASLIN(FasCod, FasNumLin, FasObs, EmprCod) VALUES(?, ?, ?, ?)", GX_NOMASK, "TXPFASLIN")
         ,new UpdateCursor("T01UJ42", "UPDATE TXPFASLIN SET FasObs=?  WHERE EmprCod = ? AND FasCod = ? AND FasNumLin = ?", GX_NOMASK, "TXPFASLIN")
         ,new UpdateCursor("T01UJ43", "DELETE FROM TXPFASLIN  WHERE EmprCod = ? AND FasCod = ? AND FasNumLin = ?", GX_NOMASK, "TXPFASLIN")
         ,new ForEachCursor("T01UJ44", "SELECT EmprCod, FasCod, FasNumLin FROM TXPFASLIN WHERE EmprCod = ? and FasCod = ? ORDER BY EmprCod, FasCod, FasNumLin ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 70);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 70);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 28);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 15);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 70);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 2 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 8);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 8);
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 8);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setString(2, (String)parms[2], 28);
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 28);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 8);
               }
               return;
            case 11 :
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
            case 12 :
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
            case 13 :
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
               stmt.setByte(1, ((Number) parms[0]).byteValue());
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 8);
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 39 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 8);
               }
               stmt.setByte(2, ((Number) parms[2]).byteValue());
               stmt.setString(3, (String)parms[3], 70);
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 70);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 8);
               }
               stmt.setByte(4, ((Number) parms[4]).byteValue());
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
               stmt.setByte(3, ((Number) parms[3]).byteValue());
               return;
            case 42 :
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
   }

}

