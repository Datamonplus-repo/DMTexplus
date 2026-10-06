package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tgrdtip_lineas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action6") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A829TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
         AV7Existe = httpContext.GetPar( "Existe") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Existe", AV7Existe);
         AV8GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GrdTipArt), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8GrdTipArt), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_6_1UM662( A396EmprCod, A829TipArtCod, AV7Existe, AV8GrdTipArt) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A829TipArtCod = (short)(GXutil.lval( httpContext.GetPar( "TipArtCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A829TipArtCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_tipart") == 0 )
      {
         gxnrgridlevel_tipart_newrow_invoke( ) ;
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
            AV9EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
            AV8GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GrdTipArt), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8GrdTipArt), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Lineas ( Gran Familia)", ""), (short)(0)) ;
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

   public void gxnrgridlevel_tipart_newrow_invoke( )
   {
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      edtTipArtCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Horizontalalignment", edtTipArtCod_Horizontalalignment, !bGXsfl_32_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_tipart_newrow( ) ;
      /* End function gxnrGridlevel_tipart_newrow_invoke */
   }

   public tgrdtip_lineas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tgrdtip_lineas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tgrdtip_lineas_impl.class ));
   }

   public tgrdtip_lineas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipArt_Internalname, httpContext.getMessage( "Gran Tipo de Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrdTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipArt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGrdTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\Tgrdtip_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipDsc_Internalname, GXutil.rtrim( A4368GrdTipDsc), GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGrdTipDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\Tgrdtip_lineas.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_tipart_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_tipart( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\Tgrdtip_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\Tgrdtip_lineas.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\Tgrdtip_lineas.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV18Pgmname), GXutil.rtrim( localUtil.format( AV18Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\Tgrdtip_lineas.htm");
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
      ucCombo_tipartcod.setProperty("Caption", Combo_tipartcod_Caption);
      ucCombo_tipartcod.setProperty("Cls", Combo_tipartcod_Cls);
      ucCombo_tipartcod.setProperty("IsGridItem", Combo_tipartcod_Isgriditem);
      ucCombo_tipartcod.setProperty("EmptyItem", Combo_tipartcod_Emptyitem);
      ucCombo_tipartcod.setProperty("DropDownOptionsData", AV13TipArtCod_Data);
      ucCombo_tipartcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tipartcod_Internalname, "COMBO_TIPARTCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_tipart( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount662 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_662 = (short)(1) ;
            scanStart1UM662( ) ;
            while ( RcdFound662 != 0 )
            {
               init_level_properties662( ) ;
               getByPrimaryKey1UM662( ) ;
               addRow1UM662( ) ;
               scanNext1UM662( ) ;
            }
            scanEnd1UM662( ) ;
            nBlankRcdCount662 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1UM662( ) ;
         standaloneModal1UM662( ) ;
         sMode662 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow1UM662( ) ;
            edtTipArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtTipArtCod_Horizontalalignment = httpContext.cgiGet( "TIPARTCOD_"+sGXsfl_32_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Horizontalalignment", edtTipArtCod_Horizontalalignment, !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_662 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UM662( ) ;
            }
            sendRow1UM662( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode662 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount662 = (short)(5) ;
         nRcdExists_662 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UM662( ) ;
            while ( RcdFound662 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_32662( ) ;
               init_level_properties662( ) ;
               standaloneNotModal1UM662( ) ;
               getByPrimaryKey1UM662( ) ;
               standaloneModal1UM662( ) ;
               addRow1UM662( ) ;
               scanNext1UM662( ) ;
            }
            scanEnd1UM662( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode662 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_32662( ) ;
         initAll1UM662( ) ;
         init_level_properties662( ) ;
         nRcdExists_662 = (short)(0) ;
         nIsMod_662 = (short)(0) ;
         nRcdDeleted_662 = (short)(0) ;
         nBlankRcdCount662 = (short)(nBlankRcdUsr662+nBlankRcdCount662) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount662 > 0 )
         {
            standaloneNotModal1UM662( ) ;
            standaloneModal1UM662( ) ;
            addRow1UM662( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTipArtCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount662 = (short)(nBlankRcdCount662-1) ;
         }
         Gx_mode = sMode662 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_tipartContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_tipart", Gridlevel_tipartContainer, subGridlevel_tipart_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_tipartContainerData", Gridlevel_tipartContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_tipartContainerData"+"V", Gridlevel_tipartContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_tipartContainerData"+"V"+"\" value='"+Gridlevel_tipartContainer.GridValuesHidden()+"'/>") ;
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
      e111UM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTIPARTCOD_DATA"), AV13TipArtCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4364GrdTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4368GrdTipDsc = httpContext.cgiGet( "Z4368GrdTipDsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "vGRDTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            AV7Existe = httpContext.cgiGet( "vEXISTE") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A830TipArtDsc = httpContext.cgiGet( "TIPARTDSC") ;
            n830TipArtDsc = false ;
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
            Combo_tipartcod_Objectcall = httpContext.cgiGet( "COMBO_TIPARTCOD_Objectcall") ;
            Combo_tipartcod_Class = httpContext.cgiGet( "COMBO_TIPARTCOD_Class") ;
            Combo_tipartcod_Icontype = httpContext.cgiGet( "COMBO_TIPARTCOD_Icontype") ;
            Combo_tipartcod_Icon = httpContext.cgiGet( "COMBO_TIPARTCOD_Icon") ;
            Combo_tipartcod_Caption = httpContext.cgiGet( "COMBO_TIPARTCOD_Caption") ;
            Combo_tipartcod_Tooltip = httpContext.cgiGet( "COMBO_TIPARTCOD_Tooltip") ;
            Combo_tipartcod_Cls = httpContext.cgiGet( "COMBO_TIPARTCOD_Cls") ;
            Combo_tipartcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TIPARTCOD_Selectedvalue_set") ;
            Combo_tipartcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TIPARTCOD_Selectedvalue_get") ;
            Combo_tipartcod_Selectedtext_set = httpContext.cgiGet( "COMBO_TIPARTCOD_Selectedtext_set") ;
            Combo_tipartcod_Selectedtext_get = httpContext.cgiGet( "COMBO_TIPARTCOD_Selectedtext_get") ;
            Combo_tipartcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TIPARTCOD_Gamoauthtoken") ;
            Combo_tipartcod_Ddointernalname = httpContext.cgiGet( "COMBO_TIPARTCOD_Ddointernalname") ;
            Combo_tipartcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TIPARTCOD_Titlecontrolalign") ;
            Combo_tipartcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TIPARTCOD_Dropdownoptionstype") ;
            Combo_tipartcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Enabled")) ;
            Combo_tipartcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Visible")) ;
            Combo_tipartcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TIPARTCOD_Titlecontrolidtoreplace") ;
            Combo_tipartcod_Datalisttype = httpContext.cgiGet( "COMBO_TIPARTCOD_Datalisttype") ;
            Combo_tipartcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Allowmultipleselection")) ;
            Combo_tipartcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TIPARTCOD_Datalistfixedvalues") ;
            Combo_tipartcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Isgriditem")) ;
            Combo_tipartcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Hasdescription")) ;
            Combo_tipartcod_Datalistproc = httpContext.cgiGet( "COMBO_TIPARTCOD_Datalistproc") ;
            Combo_tipartcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TIPARTCOD_Datalistprocparametersprefix") ;
            Combo_tipartcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TIPARTCOD_Remoteservicesparameters") ;
            Combo_tipartcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TIPARTCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_tipartcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Includeonlyselectedoption")) ;
            Combo_tipartcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Includeselectalloption")) ;
            Combo_tipartcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Emptyitem")) ;
            Combo_tipartcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TIPARTCOD_Includeaddnewoption")) ;
            Combo_tipartcod_Htmltemplate = httpContext.cgiGet( "COMBO_TIPARTCOD_Htmltemplate") ;
            Combo_tipartcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TIPARTCOD_Multiplevaluestype") ;
            Combo_tipartcod_Loadingdata = httpContext.cgiGet( "COMBO_TIPARTCOD_Loadingdata") ;
            Combo_tipartcod_Noresultsfound = httpContext.cgiGet( "COMBO_TIPARTCOD_Noresultsfound") ;
            Combo_tipartcod_Emptyitemtext = httpContext.cgiGet( "COMBO_TIPARTCOD_Emptyitemtext") ;
            Combo_tipartcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TIPARTCOD_Onlyselectedvalues") ;
            Combo_tipartcod_Selectalltext = httpContext.cgiGet( "COMBO_TIPARTCOD_Selectalltext") ;
            Combo_tipartcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TIPARTCOD_Multiplevaluesseparator") ;
            Combo_tipartcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TIPARTCOD_Addnewoptiontext") ;
            /* Read variables values. */
            A4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4368GrdTipDsc = httpContext.cgiGet( edtGrdTipDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
            AV18Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"Tgrdtip_lineas");
            A4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            forbiddenHiddens.add("GrdTipArt", localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A4368GrdTipDsc = httpContext.cgiGet( edtGrdTipDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
            forbiddenHiddens.add("GrdTipDsc", GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A4364GrdTipArt != Z4364GrdTipArt ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tgrdtip_lineas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A4364GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
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
                  sMode660 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode660 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound660 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UM0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "GRDTIPART");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtGrdTipArt_Internalname ;
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
                        e111UM2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UM2 ();
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
         e121UM2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UM660( ) ;
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
         disableAttributes1UM660( ) ;
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

   public void confirm_1UM0( )
   {
      beforeValidate1UM660( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UM660( ) ;
         }
         else
         {
            checkExtendedTable1UM660( ) ;
            closeExtendedTableCursors1UM660( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode660 = Gx_mode ;
         confirm_1UM662( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode660 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1UM662( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1UM662( ) ;
         if ( ( nRcdExists_662 != 0 ) || ( nIsMod_662 != 0 ) )
         {
            getKey1UM662( ) ;
            if ( ( nRcdExists_662 == 0 ) && ( nRcdDeleted_662 == 0 ) )
            {
               if ( RcdFound662 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UM662( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UM662( ) ;
                     closeExtendedTableCursors1UM662( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TIPARTCOD_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipArtCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound662 != 0 )
               {
                  if ( nRcdDeleted_662 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UM662( ) ;
                     load1UM662( ) ;
                     beforeValidate1UM662( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UM662( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_662 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UM662( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UM662( ) ;
                           closeExtendedTableCursors1UM662( ) ;
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
                  if ( nRcdDeleted_662 == 0 )
                  {
                     GXCCtl = "TIPARTCOD_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipArtCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTipArtCod_Internalname, GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z829TipArtCod_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_662_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_662_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_662_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_662 != 0 )
         {
            httpContext.changePostValue( "TIPARTCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTCOD_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtTipArtCod_Horizontalalignment)) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UM0( )
   {
   }

   public void e111UM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tgrdtip_lineas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Station", AV15Station);
      GXv_char2[0] = AV9EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      tgrdtip_lineas_impl.this.AV9EmprCod = GXv_char2[0] ;
      tgrdtip_lineas_impl.this.AV16EmprNom = GXv_char3[0] ;
      tgrdtip_lineas_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9EmprCod", AV9EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_tipartcod_Titlecontrolidtoreplace = edtTipArtCod_Internalname ;
      ucCombo_tipartcod.sendProperty(context, "", false, Combo_tipartcod_Internalname, "TitleControlIdToReplace", Combo_tipartcod_Titlecontrolidtoreplace);
      edtTipArtCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Horizontalalignment", edtTipArtCod_Horizontalalignment, !bGXsfl_32_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOTIPARTCOD' */
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
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
   }

   public void e121UM2( )
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

   public void S112( )
   {
      /* 'LOADCOMBOTIPARTCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV13TipArtCod_Data ;
      GXv_char4[0] = AV14ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.ficherosbasicos.tgrdtip_lineasloaddvcombo(remoteHandle, context).execute( "TipArtCod", Gx_mode, AV9EmprCod, AV8GrdTipArt, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tgrdtip_lineas_impl.this.AV14ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV13TipArtCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1UM660( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4368GrdTipDsc = T01UM6_A4368GrdTipDsc[0] ;
         }
         else
         {
            Z4368GrdTipDsc = A4368GrdTipDsc ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z4368GrdTipDsc = A4368GrdTipDsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      AV18Pgmname = "FicherosBasicos.Tgrdtip_lineas" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV9EmprCod)==0) )
      {
         A396EmprCod = AV9EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UM7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UM7_A407EmprNom[0] ;
      n407EmprNom = T01UM7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (0==AV8GrdTipArt) )
      {
         A4364GrdTipArt = AV8GrdTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
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

   public void load1UM660( )
   {
      /* Using cursor T01UM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A407EmprNom = T01UM8_A407EmprNom[0] ;
         n407EmprNom = T01UM8_n407EmprNom[0] ;
         A4368GrdTipDsc = T01UM8_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         zm1UM660( -8) ;
      }
      pr_default.close(6);
      onLoadActions1UM660( ) ;
   }

   public void onLoadActions1UM660( )
   {
   }

   public void checkExtendedTable1UM660( )
   {
      nIsDirty_660 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1UM660( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1UM660( )
   {
      /* Using cursor T01UM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound660 = (short)(1) ;
      }
      else
      {
         RcdFound660 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1UM660( 8) ;
         RcdFound660 = (short)(1) ;
         A4364GrdTipArt = T01UM6_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4368GrdTipDsc = T01UM6_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A396EmprCod = T01UM6_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         sMode660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UM660( ) ;
         if ( AnyError == 1 )
         {
            RcdFound660 = (short)(0) ;
            initializeNonKey1UM660( ) ;
         }
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound660 = (short)(0) ;
         initializeNonKey1UM660( ) ;
         sMode660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1UM660( ) ;
      if ( RcdFound660 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound660 = (short)(0) ;
      /* Using cursor T01UM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UM10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UM10_A4364GrdTipArt[0] < A4364GrdTipArt ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UM10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UM10_A4364GrdTipArt[0] > A4364GrdTipArt ) ) )
         {
            A396EmprCod = T01UM10_A396EmprCod[0] ;
            A4364GrdTipArt = T01UM10_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            RcdFound660 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound660 = (short)(0) ;
      /* Using cursor T01UM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UM11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UM11_A4364GrdTipArt[0] > A4364GrdTipArt ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UM11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UM11_A4364GrdTipArt[0] < A4364GrdTipArt ) ) )
         {
            A396EmprCod = T01UM11_A396EmprCod[0] ;
            A4364GrdTipArt = T01UM11_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            RcdFound660 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UM660( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1UM660( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound660 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4364GrdTipArt = Z4364GrdTipArt ;
               httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "GRDTIPART");
               AnyError = (short)(1) ;
               GX_FocusControl = edtGrdTipArt_Internalname ;
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
               update1UM660( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
            {
               /* Insert record */
               insert1UM660( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "GRDTIPART");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtGrdTipArt_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insert1UM660( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4364GrdTipArt = Z4364GrdTipArt ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "GRDTIPART");
         AnyError = (short)(1) ;
         GX_FocusControl = edtGrdTipArt_Internalname ;
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

   public void checkOptimisticConcurrency1UM660( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTIP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z4368GrdTipDsc, T01UM5_A4368GrdTipDsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z4368GrdTipDsc, T01UM5_A4368GrdTipDsc[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tgrdtip_lineas:[seudo value changed for attri]"+"GrdTipDsc");
               GXutil.writeLogRaw("Old: ",Z4368GrdTipDsc);
               GXutil.writeLogRaw("Current: ",T01UM5_A4368GrdTipDsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRDTIP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UM660( )
   {
      beforeValidate1UM660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UM660( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UM660( 0) ;
         checkOptimisticConcurrency1UM660( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UM660( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UM660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UM12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A4364GrdTipArt), A4368GrdTipDsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
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
                        processLevel1UM660( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UM0( ) ;
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
            load1UM660( ) ;
         }
         endLevel1UM660( ) ;
      }
      closeExtendedTableCursors1UM660( ) ;
   }

   public void update1UM660( )
   {
      beforeValidate1UM660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UM660( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UM660( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UM660( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UM660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UM13 */
                  pr_default.execute(11, new Object[] {A4368GrdTipDsc, A396EmprCod, Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTIP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UM660( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UM660( ) ;
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
         endLevel1UM660( ) ;
      }
      closeExtendedTableCursors1UM660( ) ;
   }

   public void deferredUpdate1UM660( )
   {
   }

   public void delete( )
   {
      beforeValidate1UM660( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UM660( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UM660( ) ;
         afterConfirm1UM660( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UM660( ) ;
            if ( AnyError == 0 )
            {
               scanStart1UM662( ) ;
               while ( RcdFound662 != 0 )
               {
                  getByPrimaryKey1UM662( ) ;
                  delete1UM662( ) ;
                  scanNext1UM662( ) ;
               }
               scanEnd1UM662( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UM14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
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
      sMode660 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UM660( ) ;
      Gx_mode = sMode660 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UM660( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01UM15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01UM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01UM17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COLPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01UM18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TIxFI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01UM19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01UM20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRDTAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void processNestedLevel1UM662( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1UM662( ) ;
         if ( ( nRcdExists_662 != 0 ) || ( nIsMod_662 != 0 ) )
         {
            standaloneNotModal1UM662( ) ;
            getKey1UM662( ) ;
            if ( ( nRcdExists_662 == 0 ) && ( nRcdDeleted_662 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UM662( ) ;
            }
            else
            {
               if ( RcdFound662 != 0 )
               {
                  if ( ( nRcdDeleted_662 != 0 ) && ( nRcdExists_662 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UM662( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_662 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UM662( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_662 == 0 )
                  {
                     GXCCtl = "TIPARTCOD_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipArtCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTipArtCod_Internalname, GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z829TipArtCod_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_662_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_662_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_662_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_662 != 0 )
         {
            httpContext.changePostValue( "TIPARTCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIPARTCOD_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtTipArtCod_Horizontalalignment)) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UM662( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_662 = (short)(0) ;
      nIsMod_662 = (short)(0) ;
      nRcdDeleted_662 = (short)(0) ;
   }

   public void processLevel1UM660( )
   {
      /* Save parent mode. */
      sMode660 = Gx_mode ;
      processNestedLevel1UM662( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode660 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1UM660( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UM660( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tgrdtip_lineas");
         if ( AnyError == 0 )
         {
            confirmValues1UM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tgrdtip_lineas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UM660( )
   {
      /* Scan By routine */
      /* Using cursor T01UM21 */
      pr_default.execute(19);
      RcdFound660 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A396EmprCod = T01UM21_A396EmprCod[0] ;
         A4364GrdTipArt = T01UM21_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UM660( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound660 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A396EmprCod = T01UM21_A396EmprCod[0] ;
         A4364GrdTipArt = T01UM21_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      }
   }

   public void scanEnd1UM660( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1UM660( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UM660( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UM660( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UM660( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UM660( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UM660( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UM660( )
   {
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1UM662( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -10 )
      {
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z396EmprCod = A396EmprCod ;
         Z829TipArtCod = A829TipArtCod ;
         Z830TipArtDsc = A830TipArtDsc ;
      }
   }

   public void standaloneNotModal1UM662( )
   {
   }

   public void standaloneModal1UM662( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTipArtCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtTipArtCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void load1UM662( )
   {
      /* Using cursor T01UM22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound662 = (short)(1) ;
         A830TipArtDsc = T01UM22_A830TipArtDsc[0] ;
         n830TipArtDsc = T01UM22_n830TipArtDsc[0] ;
         zm1UM662( -10) ;
      }
      pr_default.close(20);
      onLoadActions1UM662( ) ;
   }

   public void onLoadActions1UM662( )
   {
   }

   public void checkExtendedTable1UM662( )
   {
      nIsDirty_662 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1UM662( ) ;
      /* Using cursor T01UM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TIPARTCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A830TipArtDsc = T01UM4_A830TipArtDsc[0] ;
      n830TipArtDsc = T01UM4_n830TipArtDsc[0] ;
      pr_default.close(2);
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A829TipArtCod ;
         GXv_char3[0] = AV7Existe ;
         GXv_int9[0] = AV8GrdTipArt ;
         new app.pgtipctl(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_int9) ;
         tgrdtip_lineas_impl.this.A396EmprCod = GXv_char4[0] ;
         tgrdtip_lineas_impl.this.A829TipArtCod = GXv_int8[0] ;
         tgrdtip_lineas_impl.this.AV7Existe = GXv_char3[0] ;
         tgrdtip_lineas_impl.this.AV8GrdTipArt = GXv_int9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7Existe", AV7Existe);
         httpContext.ajax_rsp_assign_attri("", false, "AV8GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GrdTipArt), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8GrdTipArt), "ZZZ9")));
      }
      if ( ( GXutil.strcmp(AV7Existe, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ && ( AV8GrdTipArt != A4364GrdTipArt ) && ! (0==A829TipArtCod) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         GXCCtl = "TIPARTCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo de Artículo pertenece a otra familia, ", "")+GXutil.str( AV8GrdTipArt, 4, 0), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1UM662( )
   {
      pr_default.close(2);
   }

   public void enableDisable1UM662( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          short A829TipArtCod )
   {
      /* Using cursor T01UM23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(21) == 101) )
      {
         GXCCtl = "TIPARTCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A830TipArtDsc = T01UM23_A830TipArtDsc[0] ;
      n830TipArtDsc = T01UM23_n830TipArtDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A830TipArtDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(21) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(21);
   }

   public void getKey1UM662( )
   {
      /* Using cursor T01UM24 */
      pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound662 = (short)(1) ;
      }
      else
      {
         RcdFound662 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1UM662( )
   {
      /* Using cursor T01UM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UM662( 10) ;
         RcdFound662 = (short)(1) ;
         initializeNonKey1UM662( ) ;
         A829TipArtCod = T01UM3_A829TipArtCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z829TipArtCod = A829TipArtCod ;
         sMode662 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UM662( ) ;
         Gx_mode = sMode662 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound662 = (short)(0) ;
         initializeNonKey1UM662( ) ;
         sMode662 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UM662( ) ;
         Gx_mode = sMode662 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UM662( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UM662( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A829TipArtCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTI1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRDTI1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UM662( )
   {
      beforeValidate1UM662( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UM662( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UM662( 0) ;
         checkOptimisticConcurrency1UM662( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UM662( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UM662( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UM25 */
                  pr_default.execute(23, new Object[] {Short.valueOf(A4364GrdTipArt), A396EmprCod, Short.valueOf(A829TipArtCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTI1");
                  if ( (pr_default.getStatus(23) == 1) )
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
            load1UM662( ) ;
         }
         endLevel1UM662( ) ;
      }
      closeExtendedTableCursors1UM662( ) ;
   }

   public void update1UM662( )
   {
      beforeValidate1UM662( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UM662( ) ;
      }
      if ( ( nIsMod_662 != 0 ) || ( nIsDirty_662 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UM662( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UM662( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UM662( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPGRDTI1 */
                     deferredUpdate1UM662( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UM662( ) ;
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
            endLevel1UM662( ) ;
         }
      }
      closeExtendedTableCursors1UM662( ) ;
   }

   public void deferredUpdate1UM662( )
   {
   }

   public void delete1UM662( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UM662( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UM662( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UM662( ) ;
         afterConfirm1UM662( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UM662( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UM26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A829TipArtCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTI1");
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
      sMode662 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UM662( ) ;
      Gx_mode = sMode662 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UM662( )
   {
      standaloneModal1UM662( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UM27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
         A830TipArtDsc = T01UM27_A830TipArtDsc[0] ;
         n830TipArtDsc = T01UM27_n830TipArtDsc[0] ;
         pr_default.close(25);
      }
   }

   public void endLevel1UM662( )
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

   public void scanStart1UM662( )
   {
      /* Scan By routine */
      /* Using cursor T01UM28 */
      pr_default.execute(26, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      RcdFound662 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound662 = (short)(1) ;
         A829TipArtCod = T01UM28_A829TipArtCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UM662( )
   {
      /* Scan next routine */
      pr_default.readNext(26);
      RcdFound662 = (short)(0) ;
      if ( (pr_default.getStatus(26) != 101) )
      {
         RcdFound662 = (short)(1) ;
         A829TipArtCod = T01UM28_A829TipArtCod[0] ;
      }
   }

   public void scanEnd1UM662( )
   {
      pr_default.close(26);
   }

   public void afterConfirm1UM662( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UM662( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UM662( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UM662( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UM662( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UM662( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UM662( )
   {
      edtTipArtCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes1UM662( )
   {
   }

   public void send_integrity_lvl_hashes1UM660( )
   {
   }

   public void subsflControlProps_32662( )
   {
      edtTipArtCod_Internalname = "TIPARTCOD_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_32662( )
   {
      edtTipArtCod_Internalname = "TIPARTCOD_"+sGXsfl_32_fel_idx ;
   }

   public void addRow1UM662( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32662( ) ;
      sendRow1UM662( ) ;
   }

   public void sendRow1UM662( )
   {
      Gridlevel_tipartRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_tipart_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_tipart_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_tipart_Class, "") != 0 )
         {
            subGridlevel_tipart_Linesclass = subGridlevel_tipart_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_tipart_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_tipart_Backstyle = (byte)(0) ;
         subGridlevel_tipart_Backcolor = subGridlevel_tipart_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_tipart_Class, "") != 0 )
         {
            subGridlevel_tipart_Linesclass = subGridlevel_tipart_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_tipart_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_tipart_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_tipart_Class, "") != 0 )
         {
            subGridlevel_tipart_Linesclass = subGridlevel_tipart_Class+"Odd" ;
         }
         subGridlevel_tipart_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_tipart_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_tipart_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
         {
            subGridlevel_tipart_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_tipart_Class, "") != 0 )
            {
               subGridlevel_tipart_Linesclass = subGridlevel_tipart_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_tipart_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_tipart_Class, "") != 0 )
            {
               subGridlevel_tipart_Linesclass = subGridlevel_tipart_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_662_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_tipartRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipArtCod_Internalname,GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A829TipArtCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipArtCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTipArtCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtTipArtCod_Horizontalalignment,Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_tipartRow);
      send_integrity_lvl_hashes1UM662( ) ;
      GXCCtl = "Z829TipArtCod_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z829TipArtCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_662_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_662_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_662_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_662, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV9EmprCod));
      GXCCtl = "vGRDTIPART_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV8GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTCOD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTCOD_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtTipArtCod_Horizontalalignment));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_tipartContainer.AddRow(Gridlevel_tipartRow);
   }

   public void readRow1UM662( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32662( ) ;
      edtTipArtCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIPARTCOD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTipArtCod_Horizontalalignment = httpContext.cgiGet( "TIPARTCOD_"+sGXsfl_32_idx+"Horizontalalignment") ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TIPARTCOD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
         wbErr = true ;
         A829TipArtCod = (short)(0) ;
      }
      else
      {
         A829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTipArtCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      GXCCtl = "Z829TipArtCod_" + sGXsfl_32_idx ;
      Z829TipArtCod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_662_" + sGXsfl_32_idx ;
      nRcdDeleted_662 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_662_" + sGXsfl_32_idx ;
      nRcdExists_662 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_662_" + sGXsfl_32_idx ;
      nIsMod_662 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTipArtCod_Enabled = edtTipArtCod_Enabled ;
   }

   public void confirmValues1UM0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32662( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32662( ) ;
         httpContext.changePostValue( "Z829TipArtCod_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z829TipArtCod_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z829TipArtCod_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tgrdtip_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8GrdTipArt,4,0))}, new String[] {"Gx_mode","EmprCod","GrdTipArt"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"Tgrdtip_lineas");
      forbiddenHiddens.add("GrdTipArt", localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("GrdTipDsc", GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tgrdtip_lineas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4368GrdTipDsc", GXutil.rtrim( Z4368GrdTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTIPARTCOD_DATA", AV13TipArtCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTIPARTCOD_DATA", AV13TipArtCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV9EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRDTIPART", GXutil.ltrim( localUtil.ntoc( AV8GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8GrdTipArt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTE", GXutil.rtrim( AV7Existe));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPARTDSC", GXutil.rtrim( A830TipArtDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD_Objectcall", GXutil.rtrim( Combo_tipartcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD_Cls", GXutil.rtrim( Combo_tipartcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD_Enabled", GXutil.booltostr( Combo_tipartcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_tipartcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD_Isgriditem", GXutil.booltostr( Combo_tipartcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TIPARTCOD_Emptyitem", GXutil.booltostr( Combo_tipartcod_Emptyitem));
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
      return formatLink("app.ficherosbasicos.tgrdtip_lineas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV9EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8GrdTipArt,4,0))}, new String[] {"Gx_mode","EmprCod","GrdTipArt"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.Tgrdtip_lineas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Lineas ( Gran Familia)", "") ;
   }

   public void initializeNonKey1UM660( )
   {
      A4368GrdTipDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      Z4368GrdTipDsc = "" ;
   }

   public void initAll1UM660( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4364GrdTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      initializeNonKey1UM660( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UM662( )
   {
      AV7Existe = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Existe", AV7Existe);
      A830TipArtDsc = "" ;
      n830TipArtDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", A830TipArtDsc);
   }

   public void initAll1UM662( )
   {
      A829TipArtCod = (short)(0) ;
      initializeNonKey1UM662( ) ;
   }

   public void standaloneModalInsert1UM662( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102647", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tgrdtip_lineas.js", "?202682116102648", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties662( )
   {
      edtTipArtCod_Enabled = defedtTipArtCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipArtCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipArtCod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
   {
      Gridlevel_tipartContainer.AddObjectProperty("GridName", "Gridlevel_tipart");
      Gridlevel_tipartContainer.AddObjectProperty("Header", subGridlevel_tipart_Header);
      Gridlevel_tipartContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_tipartContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_tipartContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_tipartColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_tipartColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipartColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTipArtCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_tipartColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtTipArtCod_Horizontalalignment));
      Gridlevel_tipartContainer.AddColumnProperties(Gridlevel_tipartColumn);
      Gridlevel_tipartContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_tipartContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_tipart_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtGrdTipArt_Internalname = "GRDTIPART" ;
      edtGrdTipDsc_Internalname = "GRDTIPDSC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtTipArtCod_Internalname = "TIPARTCOD" ;
      divTableleaflevel_tipart_Internalname = "TABLELEAFLEVEL_TIPART" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_tipartcod_Internalname = "COMBO_TIPARTCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_tipart_Internalname = "GRIDLEVEL_TIPART" ;
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
      subGridlevel_tipart_Allowcollapsing = (byte)(0) ;
      subGridlevel_tipart_Allowselection = (byte)(0) ;
      subGridlevel_tipart_Header = "" ;
      Combo_tipartcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Lineas ( Gran Familia)", "") );
      edtTipArtCod_Jsonclick = "" ;
      subGridlevel_tipart_Class = "GridNoBorder WorkWith" ;
      subGridlevel_tipart_Backcolorstyle = (byte)(0) ;
      Combo_tipartcod_Titlecontrolidtoreplace = "" ;
      edtTipArtCod_Enabled = 1 ;
      Combo_tipartcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_tipartcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_tipartcod_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtGrdTipDsc_Jsonclick = "" ;
      edtGrdTipDsc_Enabled = 0 ;
      edtGrdTipArt_Jsonclick = "" ;
      edtGrdTipArt_Enabled = 0 ;
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
      edtTipArtCod_Horizontalalignment = "right" ;
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

   public void xc_6_1UM662( String A396EmprCod ,
                            short A829TipArtCod ,
                            String AV7Existe ,
                            short AV8GrdTipArt )
   {
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A829TipArtCod ;
         GXv_char3[0] = AV7Existe ;
         GXv_int8[0] = AV8GrdTipArt ;
         new app.pgtipctl(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_int8) ;
         A396EmprCod = GXv_char4[0] ;
         A829TipArtCod = GXv_int9[0] ;
         AV7Existe = GXv_char3[0] ;
         AV8GrdTipArt = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7Existe", AV7Existe);
         httpContext.ajax_rsp_assign_attri("", false, "AV8GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GrdTipArt), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8GrdTipArt), "ZZZ9")));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A396EmprCod))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( AV7Existe))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( AV8GrdTipArt, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_tipart_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_32662( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UM662( ) ;
         standaloneModal1UM662( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UM662( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32662( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_tipartContainer)) ;
      /* End function gxnrGridlevel_tipart_newrow */
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

   public void valid_Tipartcod( )
   {
      n830TipArtDsc = false ;
      /* Using cursor T01UM27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A829TipArtCod)});
      if ( (pr_default.getStatus(25) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TIPART", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
      }
      A830TipArtDsc = T01UM27_A830TipArtDsc[0] ;
      n830TipArtDsc = T01UM27_n830TipArtDsc[0] ;
      pr_default.close(25);
      if ( true /* After */ )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int9[0] = A829TipArtCod ;
         GXv_char3[0] = AV7Existe ;
         GXv_int8[0] = AV8GrdTipArt ;
         new app.pgtipctl(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_int8) ;
         tgrdtip_lineas_impl.this.A396EmprCod = GXv_char4[0] ;
         A396EmprCod = this.A396EmprCod ;
         tgrdtip_lineas_impl.this.A829TipArtCod = GXv_int9[0] ;
         A829TipArtCod = this.A829TipArtCod ;
         tgrdtip_lineas_impl.this.AV7Existe = GXv_char3[0] ;
         AV7Existe = this.AV7Existe ;
         tgrdtip_lineas_impl.this.AV8GrdTipArt = GXv_int8[0] ;
         AV8GrdTipArt = this.AV8GrdTipArt ;
      }
      if ( ( GXutil.strcmp(AV7Existe, httpContext.getMessage( "S", "")) == 0 ) && true /* After */ && ( AV8GrdTipArt != A4364GrdTipArt ) && ! (0==A829TipArtCod) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Tipo de Artículo pertenece a otra familia, ", "")+GXutil.str( AV8GrdTipArt, 4, 0), 1, "TIPARTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipArtCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A830TipArtDsc", GXutil.rtrim( A830TipArtDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", GXutil.rtrim( A396EmprCod));
      httpContext.ajax_rsp_assign_attri("", false, "A829TipArtCod", GXutil.ltrim( localUtil.ntoc( A829TipArtCod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "AV7Existe", GXutil.rtrim( AV7Existe));
      httpContext.ajax_rsp_assign_attri("", false, "AV8GrdTipArt", GXutil.ltrim( localUtil.ntoc( AV8GrdTipArt, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV9EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UM2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_GRDTIPART","{handler:'valid_Grdtipart',iparms:[]");
      setEventMetadata("VALID_GRDTIPART",",oparms:[]}");
      setEventMetadata("VALID_TIPARTCOD","{handler:'valid_Tipartcod',iparms:[{av:'AV8GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''},{av:'AV7Existe',fld:'vEXISTE',pic:''}]");
      setEventMetadata("VALID_TIPARTCOD",",oparms:[{av:'A830TipArtDsc',fld:'TIPARTDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A829TipArtCod',fld:'TIPARTCOD',pic:'ZZZ9'},{av:'AV7Existe',fld:'vEXISTE',pic:''},{av:'AV8GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9'}]}");
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
      pr_default.close(25);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV9EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4368GrdTipDsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      AV7Existe = "" ;
      Gx_mode = "" ;
      AV9EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A4368GrdTipDsc = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV18Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_tipartcod = new com.genexus.webpanels.GXUserControl();
      Combo_tipartcod_Caption = "" ;
      AV13TipArtCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_tipartContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode662 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A830TipArtDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_tipartcod_Objectcall = "" ;
      Combo_tipartcod_Class = "" ;
      Combo_tipartcod_Icontype = "" ;
      Combo_tipartcod_Icon = "" ;
      Combo_tipartcod_Tooltip = "" ;
      Combo_tipartcod_Selectedvalue_set = "" ;
      Combo_tipartcod_Selectedvalue_get = "" ;
      Combo_tipartcod_Selectedtext_set = "" ;
      Combo_tipartcod_Selectedtext_get = "" ;
      Combo_tipartcod_Gamoauthtoken = "" ;
      Combo_tipartcod_Ddointernalname = "" ;
      Combo_tipartcod_Titlecontrolalign = "" ;
      Combo_tipartcod_Dropdownoptionstype = "" ;
      Combo_tipartcod_Datalisttype = "" ;
      Combo_tipartcod_Datalistfixedvalues = "" ;
      Combo_tipartcod_Datalistproc = "" ;
      Combo_tipartcod_Datalistprocparametersprefix = "" ;
      Combo_tipartcod_Remoteservicesparameters = "" ;
      Combo_tipartcod_Htmltemplate = "" ;
      Combo_tipartcod_Multiplevaluestype = "" ;
      Combo_tipartcod_Loadingdata = "" ;
      Combo_tipartcod_Noresultsfound = "" ;
      Combo_tipartcod_Emptyitemtext = "" ;
      Combo_tipartcod_Onlyselectedvalues = "" ;
      Combo_tipartcod_Selectalltext = "" ;
      Combo_tipartcod_Multiplevaluesseparator = "" ;
      Combo_tipartcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode660 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV14ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01UM7_A407EmprNom = new String[] {""} ;
      T01UM7_n407EmprNom = new boolean[] {false} ;
      T01UM8_A4364GrdTipArt = new short[1] ;
      T01UM8_A407EmprNom = new String[] {""} ;
      T01UM8_n407EmprNom = new boolean[] {false} ;
      T01UM8_A4368GrdTipDsc = new String[] {""} ;
      T01UM8_A396EmprCod = new String[] {""} ;
      T01UM9_A396EmprCod = new String[] {""} ;
      T01UM9_A4364GrdTipArt = new short[1] ;
      T01UM6_A4364GrdTipArt = new short[1] ;
      T01UM6_A4368GrdTipDsc = new String[] {""} ;
      T01UM6_A396EmprCod = new String[] {""} ;
      T01UM10_A396EmprCod = new String[] {""} ;
      T01UM10_A4364GrdTipArt = new short[1] ;
      T01UM11_A396EmprCod = new String[] {""} ;
      T01UM11_A4364GrdTipArt = new short[1] ;
      T01UM5_A4364GrdTipArt = new short[1] ;
      T01UM5_A4368GrdTipDsc = new String[] {""} ;
      T01UM5_A396EmprCod = new String[] {""} ;
      T01UM15_A396EmprCod = new String[] {""} ;
      T01UM15_A4364GrdTipArt = new short[1] ;
      T01UM15_A12944FamCalID = new byte[1] ;
      T01UM16_A396EmprCod = new String[] {""} ;
      T01UM16_A4364GrdTipArt = new short[1] ;
      T01UM16_A12938GabMezID = new short[1] ;
      T01UM17_A396EmprCod = new String[] {""} ;
      T01UM17_A252CliCod = new int[1] ;
      T01UM17_A4364GrdTipArt = new short[1] ;
      T01UM17_A4365NomColor = new String[] {""} ;
      T01UM17_A4366NumColor = new int[1] ;
      T01UM17_A4367TipColor = new byte[1] ;
      T01UM17_A5740TipProd = new String[] {""} ;
      T01UM18_A396EmprCod = new String[] {""} ;
      T01UM18_A4364GrdTipArt = new short[1] ;
      T01UM18_A5657Tifi_l = new short[1] ;
      T01UM19_A396EmprCod = new String[] {""} ;
      T01UM19_A5654Mgen_com = new String[] {""} ;
      T01UM19_A4364GrdTipArt = new short[1] ;
      T01UM20_A396EmprCod = new String[] {""} ;
      T01UM20_A4364GrdTipArt = new short[1] ;
      T01UM20_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UM21_A396EmprCod = new String[] {""} ;
      T01UM21_A4364GrdTipArt = new short[1] ;
      Z830TipArtDsc = "" ;
      T01UM22_A4364GrdTipArt = new short[1] ;
      T01UM22_A830TipArtDsc = new String[] {""} ;
      T01UM22_n830TipArtDsc = new boolean[] {false} ;
      T01UM22_A396EmprCod = new String[] {""} ;
      T01UM22_A829TipArtCod = new short[1] ;
      T01UM4_A830TipArtDsc = new String[] {""} ;
      T01UM4_n830TipArtDsc = new boolean[] {false} ;
      T01UM23_A830TipArtDsc = new String[] {""} ;
      T01UM23_n830TipArtDsc = new boolean[] {false} ;
      T01UM24_A396EmprCod = new String[] {""} ;
      T01UM24_A4364GrdTipArt = new short[1] ;
      T01UM24_A829TipArtCod = new short[1] ;
      T01UM3_A4364GrdTipArt = new short[1] ;
      T01UM3_A396EmprCod = new String[] {""} ;
      T01UM3_A829TipArtCod = new short[1] ;
      T01UM2_A4364GrdTipArt = new short[1] ;
      T01UM2_A396EmprCod = new String[] {""} ;
      T01UM2_A829TipArtCod = new short[1] ;
      T01UM27_A830TipArtDsc = new String[] {""} ;
      T01UM27_n830TipArtDsc = new boolean[] {false} ;
      T01UM28_A396EmprCod = new String[] {""} ;
      T01UM28_A4364GrdTipArt = new short[1] ;
      T01UM28_A829TipArtCod = new short[1] ;
      Gridlevel_tipartRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_tipart_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_tipartColumn = new com.genexus.webpanels.GXWebColumn();
      GXv_char4 = new String[1] ;
      GXv_int9 = new short[1] ;
      GXv_char3 = new String[1] ;
      GXv_int8 = new short[1] ;
      ZV7Existe = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tgrdtip_lineas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tgrdtip_lineas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tgrdtip_lineas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tgrdtip_lineas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tgrdtip_lineas__default(),
         new Object[] {
             new Object[] {
            T01UM2_A4364GrdTipArt, T01UM2_A396EmprCod, T01UM2_A829TipArtCod
            }
            , new Object[] {
            T01UM3_A4364GrdTipArt, T01UM3_A396EmprCod, T01UM3_A829TipArtCod
            }
            , new Object[] {
            T01UM4_A830TipArtDsc, T01UM4_n830TipArtDsc
            }
            , new Object[] {
            T01UM5_A4364GrdTipArt, T01UM5_A4368GrdTipDsc, T01UM5_A396EmprCod
            }
            , new Object[] {
            T01UM6_A4364GrdTipArt, T01UM6_A4368GrdTipDsc, T01UM6_A396EmprCod
            }
            , new Object[] {
            T01UM7_A407EmprNom, T01UM7_n407EmprNom
            }
            , new Object[] {
            T01UM8_A4364GrdTipArt, T01UM8_A407EmprNom, T01UM8_n407EmprNom, T01UM8_A4368GrdTipDsc, T01UM8_A396EmprCod
            }
            , new Object[] {
            T01UM9_A396EmprCod, T01UM9_A4364GrdTipArt
            }
            , new Object[] {
            T01UM10_A396EmprCod, T01UM10_A4364GrdTipArt
            }
            , new Object[] {
            T01UM11_A396EmprCod, T01UM11_A4364GrdTipArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UM15_A396EmprCod, T01UM15_A4364GrdTipArt, T01UM15_A12944FamCalID
            }
            , new Object[] {
            T01UM16_A396EmprCod, T01UM16_A4364GrdTipArt, T01UM16_A12938GabMezID
            }
            , new Object[] {
            T01UM17_A396EmprCod, T01UM17_A252CliCod, T01UM17_A4364GrdTipArt, T01UM17_A4365NomColor, T01UM17_A4366NumColor, T01UM17_A4367TipColor, T01UM17_A5740TipProd
            }
            , new Object[] {
            T01UM18_A396EmprCod, T01UM18_A4364GrdTipArt, T01UM18_A5657Tifi_l
            }
            , new Object[] {
            T01UM19_A396EmprCod, T01UM19_A5654Mgen_com, T01UM19_A4364GrdTipArt
            }
            , new Object[] {
            T01UM20_A396EmprCod, T01UM20_A4364GrdTipArt, T01UM20_A4376GrdTipVal
            }
            , new Object[] {
            T01UM21_A396EmprCod, T01UM21_A4364GrdTipArt
            }
            , new Object[] {
            T01UM22_A4364GrdTipArt, T01UM22_A830TipArtDsc, T01UM22_n830TipArtDsc, T01UM22_A396EmprCod, T01UM22_A829TipArtCod
            }
            , new Object[] {
            T01UM23_A830TipArtDsc, T01UM23_n830TipArtDsc
            }
            , new Object[] {
            T01UM24_A396EmprCod, T01UM24_A4364GrdTipArt, T01UM24_A829TipArtCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UM27_A830TipArtDsc, T01UM27_n830TipArtDsc
            }
            , new Object[] {
            T01UM28_A396EmprCod, T01UM28_A4364GrdTipArt, T01UM28_A829TipArtCod
            }
         }
      );
      AV18Pgmname = "FicherosBasicos.Tgrdtip_lineas" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_tipart_Backcolorstyle ;
   private byte subGridlevel_tipart_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_tipart_Allowselection ;
   private byte subGridlevel_tipart_Allowhovering ;
   private byte subGridlevel_tipart_Allowcollapsing ;
   private byte subGridlevel_tipart_Collapsed ;
   private short wcpOAV8GrdTipArt ;
   private short Z4364GrdTipArt ;
   private short Z829TipArtCod ;
   private short nRcdDeleted_662 ;
   private short nRcdExists_662 ;
   private short nIsMod_662 ;
   private short A829TipArtCod ;
   private short AV8GrdTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A4364GrdTipArt ;
   private short nBlankRcdCount662 ;
   private short RcdFound662 ;
   private short nBlankRcdUsr662 ;
   private short RcdFound660 ;
   private short nIsDirty_660 ;
   private short nIsDirty_662 ;
   private short GXv_int9[] ;
   private short GXv_int8[] ;
   private short ZV8GrdTipArt ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int trnEnded ;
   private int edtGrdTipArt_Enabled ;
   private int edtGrdTipDsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtTipArtCod_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_tipartcod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_tipart_Backcolor ;
   private int subGridlevel_tipart_Allbackcolor ;
   private int defedtTipArtCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_tipart_Selectedindex ;
   private int subGridlevel_tipart_Selectioncolor ;
   private int subGridlevel_tipart_Hoveringcolor ;
   private long GRIDLEVEL_TIPART_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV9EmprCod ;
   private String Z396EmprCod ;
   private String Z4368GrdTipDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String AV7Existe ;
   private String Gx_mode ;
   private String AV9EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_32_idx="0001" ;
   private String edtTipArtCod_Horizontalalignment ;
   private String edtTipArtCod_Internalname ;
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
   private String edtGrdTipArt_Internalname ;
   private String edtGrdTipArt_Jsonclick ;
   private String edtGrdTipDsc_Internalname ;
   private String A4368GrdTipDsc ;
   private String edtGrdTipDsc_Jsonclick ;
   private String divTableleaflevel_tipart_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV18Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_tipartcod_Caption ;
   private String Combo_tipartcod_Cls ;
   private String Combo_tipartcod_Internalname ;
   private String sMode662 ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_tipart_Internalname ;
   private String A407EmprNom ;
   private String A830TipArtDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_tipartcod_Objectcall ;
   private String Combo_tipartcod_Class ;
   private String Combo_tipartcod_Icontype ;
   private String Combo_tipartcod_Icon ;
   private String Combo_tipartcod_Tooltip ;
   private String Combo_tipartcod_Selectedvalue_set ;
   private String Combo_tipartcod_Selectedvalue_get ;
   private String Combo_tipartcod_Selectedtext_set ;
   private String Combo_tipartcod_Selectedtext_get ;
   private String Combo_tipartcod_Gamoauthtoken ;
   private String Combo_tipartcod_Ddointernalname ;
   private String Combo_tipartcod_Titlecontrolalign ;
   private String Combo_tipartcod_Dropdownoptionstype ;
   private String Combo_tipartcod_Titlecontrolidtoreplace ;
   private String Combo_tipartcod_Datalisttype ;
   private String Combo_tipartcod_Datalistfixedvalues ;
   private String Combo_tipartcod_Datalistproc ;
   private String Combo_tipartcod_Datalistprocparametersprefix ;
   private String Combo_tipartcod_Remoteservicesparameters ;
   private String Combo_tipartcod_Htmltemplate ;
   private String Combo_tipartcod_Multiplevaluestype ;
   private String Combo_tipartcod_Loadingdata ;
   private String Combo_tipartcod_Noresultsfound ;
   private String Combo_tipartcod_Emptyitemtext ;
   private String Combo_tipartcod_Onlyselectedvalues ;
   private String Combo_tipartcod_Selectalltext ;
   private String Combo_tipartcod_Multiplevaluesseparator ;
   private String Combo_tipartcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode660 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String Z407EmprNom ;
   private String Z830TipArtDsc ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_tipart_Class ;
   private String subGridlevel_tipart_Linesclass ;
   private String ROClassString ;
   private String edtTipArtCod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_tipart_Header ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String ZV7Existe ;
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
   private boolean Combo_tipartcod_Isgriditem ;
   private boolean Combo_tipartcod_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n830TipArtDsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_tipartcod_Enabled ;
   private boolean Combo_tipartcod_Visible ;
   private boolean Combo_tipartcod_Allowmultipleselection ;
   private boolean Combo_tipartcod_Hasdescription ;
   private boolean Combo_tipartcod_Includeonlyselectedoption ;
   private boolean Combo_tipartcod_Includeselectalloption ;
   private boolean Combo_tipartcod_Includeaddnewoption ;
   private boolean returnInSub ;
   private String AV14ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_tipartContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_tipartRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_tipartColumn ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_tipartcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UM7_A407EmprNom ;
   private boolean[] T01UM7_n407EmprNom ;
   private short[] T01UM8_A4364GrdTipArt ;
   private String[] T01UM8_A407EmprNom ;
   private boolean[] T01UM8_n407EmprNom ;
   private String[] T01UM8_A4368GrdTipDsc ;
   private String[] T01UM8_A396EmprCod ;
   private String[] T01UM9_A396EmprCod ;
   private short[] T01UM9_A4364GrdTipArt ;
   private short[] T01UM6_A4364GrdTipArt ;
   private String[] T01UM6_A4368GrdTipDsc ;
   private String[] T01UM6_A396EmprCod ;
   private String[] T01UM10_A396EmprCod ;
   private short[] T01UM10_A4364GrdTipArt ;
   private String[] T01UM11_A396EmprCod ;
   private short[] T01UM11_A4364GrdTipArt ;
   private short[] T01UM5_A4364GrdTipArt ;
   private String[] T01UM5_A4368GrdTipDsc ;
   private String[] T01UM5_A396EmprCod ;
   private String[] T01UM15_A396EmprCod ;
   private short[] T01UM15_A4364GrdTipArt ;
   private byte[] T01UM15_A12944FamCalID ;
   private String[] T01UM16_A396EmprCod ;
   private short[] T01UM16_A4364GrdTipArt ;
   private short[] T01UM16_A12938GabMezID ;
   private String[] T01UM17_A396EmprCod ;
   private int[] T01UM17_A252CliCod ;
   private short[] T01UM17_A4364GrdTipArt ;
   private String[] T01UM17_A4365NomColor ;
   private int[] T01UM17_A4366NumColor ;
   private byte[] T01UM17_A4367TipColor ;
   private String[] T01UM17_A5740TipProd ;
   private String[] T01UM18_A396EmprCod ;
   private short[] T01UM18_A4364GrdTipArt ;
   private short[] T01UM18_A5657Tifi_l ;
   private String[] T01UM19_A396EmprCod ;
   private String[] T01UM19_A5654Mgen_com ;
   private short[] T01UM19_A4364GrdTipArt ;
   private String[] T01UM20_A396EmprCod ;
   private short[] T01UM20_A4364GrdTipArt ;
   private java.math.BigDecimal[] T01UM20_A4376GrdTipVal ;
   private String[] T01UM21_A396EmprCod ;
   private short[] T01UM21_A4364GrdTipArt ;
   private short[] T01UM22_A4364GrdTipArt ;
   private String[] T01UM22_A830TipArtDsc ;
   private boolean[] T01UM22_n830TipArtDsc ;
   private String[] T01UM22_A396EmprCod ;
   private short[] T01UM22_A829TipArtCod ;
   private String[] T01UM4_A830TipArtDsc ;
   private boolean[] T01UM4_n830TipArtDsc ;
   private String[] T01UM23_A830TipArtDsc ;
   private boolean[] T01UM23_n830TipArtDsc ;
   private String[] T01UM24_A396EmprCod ;
   private short[] T01UM24_A4364GrdTipArt ;
   private short[] T01UM24_A829TipArtCod ;
   private short[] T01UM3_A4364GrdTipArt ;
   private String[] T01UM3_A396EmprCod ;
   private short[] T01UM3_A829TipArtCod ;
   private short[] T01UM2_A4364GrdTipArt ;
   private String[] T01UM2_A396EmprCod ;
   private short[] T01UM2_A829TipArtCod ;
   private String[] T01UM27_A830TipArtDsc ;
   private boolean[] T01UM27_n830TipArtDsc ;
   private String[] T01UM28_A396EmprCod ;
   private short[] T01UM28_A4364GrdTipArt ;
   private short[] T01UM28_A829TipArtCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV13TipArtCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
}

final  class tgrdtip_lineas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtip_lineas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtip_lineas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtip_lineas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tgrdtip_lineas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UM2", "SELECT GrdTipArt, EmprCod, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? AND GrdTipArt = ? AND TipArtCod = ?  FOR UPDATE OF GrdTipArt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM3", "SELECT GrdTipArt, EmprCod, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? AND GrdTipArt = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM4", "SELECT TipArtDsc FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM5", "SELECT GrdTipArt, GrdTipDsc, EmprCod FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ?  FOR UPDATE OF GrdTipDsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM6", "SELECT GrdTipArt, GrdTipDsc, EmprCod FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM8", "SELECT /*+ FIRST_ROWS(100) */ TM1.GrdTipArt, T2.EmprNom, TM1.GrdTipDsc, TM1.EmprCod FROM (TXPGRDTIP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.GrdTipArt = ? ORDER BY TM1.EmprCod, TM1.GrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE ( EmprCod > ? or EmprCod = ? and GrdTipArt > ?) ORDER BY EmprCod, GrdTipArt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UM11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE ( EmprCod < ? or EmprCod = ? and GrdTipArt < ?) ORDER BY EmprCod DESC, GrdTipArt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UM12", "INSERT INTO TXPGRDTIP(GrdTipArt, GrdTipDsc, EmprCod, Tifi_Ul, GabMezUlt) VALUES(?, ?, ?, 0, 0)", GX_NOMASK, "TXPGRDTIP")
         ,new UpdateCursor("T01UM13", "UPDATE TXPGRDTIP SET GrdTipDsc=?  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new UpdateCursor("T01UM14", "DELETE FROM TXPGRDTIP  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new ForEachCursor("T01UM15", "SELECT * FROM (SELECT EmprCod, GrdTipArt, FamCalID FROM TXPFAMCAL WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UM16", "SELECT * FROM (SELECT EmprCod, GrdTipArt, GabMezID FROM TXPGABMEZ WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UM17", "SELECT * FROM (SELECT EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd FROM TXPCOLPRE WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UM18", "SELECT * FROM (SELECT EmprCod, GrdTipArt, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UM19", "SELECT * FROM (SELECT EmprCod, Mgen_com, GrdTipArt FROM TXPLMARCO WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UM20", "SELECT * FROM (SELECT EmprCod, GrdTipArt, GrdTipVal FROM TXPGRDTAR WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UM21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, GrdTipArt FROM TXPGRDTIP ORDER BY EmprCod, GrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM22", "SELECT T1.GrdTipArt, T2.TipArtDsc, T1.EmprCod, T1.TipArtCod FROM (TXPGRDTI1 T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.GrdTipArt = ? and T1.TipArtCod = ? ORDER BY T1.EmprCod, T1.GrdTipArt, T1.TipArtCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM23", "SELECT TipArtDsc FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM24", "SELECT EmprCod, GrdTipArt, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? AND GrdTipArt = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UM25", "INSERT INTO TXPGRDTI1(GrdTipArt, EmprCod, TipArtCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPGRDTI1")
         ,new UpdateCursor("T01UM26", "DELETE FROM TXPGRDTI1  WHERE EmprCod = ? AND GrdTipArt = ? AND TipArtCod = ?", GX_NOMASK, "TXPGRDTI1")
         ,new ForEachCursor("T01UM27", "SELECT TipArtDsc FROM TXPTIPART WHERE EmprCod = ? AND TipArtCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UM28", "SELECT EmprCod, GrdTipArt, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, TipArtCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 20 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 3);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 30);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 23 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

