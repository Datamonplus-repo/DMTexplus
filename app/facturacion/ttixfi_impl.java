package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttixfi_impl extends GXDataArea
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
            AV42EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
            AV43GrdTipArt = (short)(GXutil.lval( httpContext.GetPar( "GrdTipArt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GrdTipArt), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43GrdTipArt), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TIxFI", ""), (short)(0)) ;
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
      A5656Tifi_Ul = (short)(GXutil.lval( httpContext.GetPar( "Tifi_Ul"))) ;
      n5656Tifi_Ul = false ;
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

   public ttixfi_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttixfi_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttixfi_impl.class ));
   }

   public ttixfi_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipArt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipArt_Internalname, httpContext.getMessage( "Gran Tipo de Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipArt_Internalname, GXutil.ltrim( localUtil.ntoc( A4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtGrdTipArt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipArt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGrdTipArt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TTIxFI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtGrdTipDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtGrdTipDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtGrdTipDsc_Internalname, GXutil.rtrim( A4368GrdTipDsc), GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtGrdTipDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtGrdTipDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TTIxFI.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TTIxFI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TTIxFI.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TTIxFI.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV48Pgmname), GXutil.rtrim( localUtil.format( AV48Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TTIxFI.htm");
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

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount836 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_836 = (short)(1) ;
            scanStartRE836( ) ;
            while ( RcdFound836 != 0 )
            {
               init_level_properties836( ) ;
               getByPrimaryKeyRE836( ) ;
               addRowRE836( ) ;
               scanNextRE836( ) ;
            }
            scanEndRE836( ) ;
            nBlankRcdCount836 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B5656Tifi_Ul = A5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
         standaloneNotModalRE836( ) ;
         standaloneModalRE836( ) ;
         sMode836 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRowRE836( ) ;
            edtTifi_l_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_L_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTifi_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_l_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtTifi_vi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_VI_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTifi_vi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_vi_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtTifi_vf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_VF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTifi_vf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_vf_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtTifi_t_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_T_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTifi_t_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_t_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtTifi_f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_F_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTifi_f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_f_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_836 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModalRE836( ) ;
            }
            sendRowRE836( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode836 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5656Tifi_Ul = B5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount836 = (short)(5) ;
         nRcdExists_836 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStartRE836( ) ;
            while ( RcdFound836 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_32836( ) ;
               init_level_properties836( ) ;
               standaloneNotModalRE836( ) ;
               getByPrimaryKeyRE836( ) ;
               standaloneModalRE836( ) ;
               addRowRE836( ) ;
               scanNextRE836( ) ;
            }
            scanEndRE836( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode836 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_32836( ) ;
         initAllRE836( ) ;
         init_level_properties836( ) ;
         B5656Tifi_Ul = A5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
         nRcdExists_836 = (short)(0) ;
         nIsMod_836 = (short)(0) ;
         nRcdDeleted_836 = (short)(0) ;
         nBlankRcdCount836 = (short)(nBlankRcdUsr836+nBlankRcdCount836) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount836 > 0 )
         {
            standaloneNotModalRE836( ) ;
            standaloneModalRE836( ) ;
            addRowRE836( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTifi_l_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount836 = (short)(nBlankRcdCount836-1) ;
         }
         Gx_mode = sMode836 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A5656Tifi_Ul = B5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
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
      e11RE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "Z4364GrdTipArt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4368GrdTipDsc = httpContext.cgiGet( "Z4368GrdTipDsc") ;
            Z5656Tifi_Ul = (short)(localUtil.ctol( httpContext.cgiGet( "Z5656Tifi_Ul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5656Tifi_Ul = (short)(localUtil.ctol( httpContext.cgiGet( "Z5656Tifi_Ul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n5656Tifi_Ul = false ;
            O5656Tifi_Ul = (short)(localUtil.ctol( httpContext.cgiGet( "O5656Tifi_Ul"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV42EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV43GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( "vGRDTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5656Tifi_Ul = (short)(localUtil.ctol( httpContext.cgiGet( "TIFI_UL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            A4364GrdTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtGrdTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            A4368GrdTipDsc = httpContext.cgiGet( edtGrdTipDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
            AV48Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTIxFI");
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
               GXutil.writeLogError("facturacion\\ttixfi:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_RE0( ) ;
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
                        e11RE2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12RE2 ();
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
         e12RE2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllRE660( ) ;
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
         disableAttributesRE660( ) ;
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

   public void confirm_RE0( )
   {
      beforeValidateRE660( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsRE660( ) ;
         }
         else
         {
            checkExtendedTableRE660( ) ;
            closeExtendedTableCursorsRE660( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode660 = Gx_mode ;
         confirm_RE836( ) ;
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

   public void confirm_RE836( )
   {
      s5656Tifi_Ul = O5656Tifi_Ul ;
      n5656Tifi_Ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowRE836( ) ;
         if ( ( nRcdExists_836 != 0 ) || ( nIsMod_836 != 0 ) )
         {
            getKeyRE836( ) ;
            if ( ( nRcdExists_836 == 0 ) && ( nRcdDeleted_836 == 0 ) )
            {
               if ( RcdFound836 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidateRE836( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTableRE836( ) ;
                     closeExtendedTableCursorsRE836( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O5656Tifi_Ul = A5656Tifi_Ul ;
                     n5656Tifi_Ul = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
                  }
               }
               else
               {
                  GXCCtl = "TIFI_L_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTifi_l_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound836 != 0 )
               {
                  if ( nRcdDeleted_836 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKeyRE836( ) ;
                     loadRE836( ) ;
                     beforeValidateRE836( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControlsRE836( ) ;
                        O5656Tifi_Ul = A5656Tifi_Ul ;
                        n5656Tifi_Ul = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_836 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidateRE836( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTableRE836( ) ;
                           closeExtendedTableCursorsRE836( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O5656Tifi_Ul = A5656Tifi_Ul ;
                           n5656Tifi_Ul = false ;
                           httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_836 == 0 )
                  {
                     GXCCtl = "TIFI_L_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTifi_l_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTifi_l_Internalname, GXutil.ltrim( localUtil.ntoc( A5657Tifi_l, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_vi_Internalname, GXutil.ltrim( localUtil.ntoc( A5658Tifi_vi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_vf_Internalname, GXutil.ltrim( localUtil.ntoc( A5659Tifi_vf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_t_Internalname, GXutil.ltrim( localUtil.ntoc( A5660Tifi_t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_f_Internalname, GXutil.ltrim( localUtil.ntoc( A5661Tifi_f, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5657Tifi_l_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5657Tifi_l, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5658Tifi_vi_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5658Tifi_vi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5659Tifi_vf_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5659Tifi_vf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5660Tifi_t_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5660Tifi_t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5661Tifi_f_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5661Tifi_f, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_836_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_836_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_836_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_836 != 0 )
         {
            httpContext.changePostValue( "TIFI_L_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_l_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_VI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_VF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_T_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_t_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_F_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O5656Tifi_Ul = s5656Tifi_Ul ;
      n5656Tifi_Ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaptionRE0( )
   {
   }

   public void e11RE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttixfi_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = AV42EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttixfi_impl.this.AV42EmprCod = GXv_char2[0] ;
      ttixfi_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttixfi_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttixfi_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV42EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttixfi_impl.this.AV42EmprCod = GXv_char4[0] ;
      ttixfi_impl.this.AV16EmprNom = GXv_char3[0] ;
      ttixfi_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42EmprCod", AV42EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV44WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV44WWPContext = GXv_SdtWWPContext5[0] ;
      AV45TrnContext.fromxml(AV46WebSession.getValue("TrnContext"), null, null);
   }

   public void e12RE2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV45TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.facturacion.ttixfiww", new String[] {}, new String[] {}) );
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
   }

   public void zmRE660( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4368GrdTipDsc = T00RE5_A4368GrdTipDsc[0] ;
            Z5656Tifi_Ul = T00RE5_A5656Tifi_Ul[0] ;
         }
         else
         {
            Z4368GrdTipDsc = A4368GrdTipDsc ;
            Z5656Tifi_Ul = A5656Tifi_Ul ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z4368GrdTipDsc = A4368GrdTipDsc ;
         Z5656Tifi_Ul = A5656Tifi_Ul ;
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
      AV48Pgmname = "Facturacion.TTIxFI" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48Pgmname", AV48Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV42EmprCod)==0) )
      {
         A396EmprCod = AV42EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00RE6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00RE6_A407EmprNom[0] ;
      n407EmprNom = T00RE6_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV43GrdTipArt) )
      {
         A4364GrdTipArt = AV43GrdTipArt ;
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

   public void loadRE660( )
   {
      /* Using cursor T00RE7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A4368GrdTipDsc = T00RE7_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A407EmprNom = T00RE7_A407EmprNom[0] ;
         n407EmprNom = T00RE7_n407EmprNom[0] ;
         A5656Tifi_Ul = T00RE7_A5656Tifi_Ul[0] ;
         n5656Tifi_Ul = T00RE7_n5656Tifi_Ul[0] ;
         zmRE660( -8) ;
      }
      pr_default.close(5);
      onLoadActionsRE660( ) ;
   }

   public void onLoadActionsRE660( )
   {
   }

   public void checkExtendedTableRE660( )
   {
      nIsDirty_660 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursorsRE660( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyRE660( )
   {
      /* Using cursor T00RE8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound660 = (short)(1) ;
      }
      else
      {
         RcdFound660 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00RE5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zmRE660( 8) ;
         RcdFound660 = (short)(1) ;
         A4364GrdTipArt = T00RE5_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
         A4368GrdTipDsc = T00RE5_A4368GrdTipDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
         A5656Tifi_Ul = T00RE5_A5656Tifi_Ul[0] ;
         n5656Tifi_Ul = T00RE5_n5656Tifi_Ul[0] ;
         A396EmprCod = T00RE5_A396EmprCod[0] ;
         O5656Tifi_Ul = A5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         sMode660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadRE660( ) ;
         if ( AnyError == 1 )
         {
            RcdFound660 = (short)(0) ;
            initializeNonKeyRE660( ) ;
         }
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound660 = (short)(0) ;
         initializeNonKeyRE660( ) ;
         sMode660 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode660 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKeyRE660( ) ;
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
      /* Using cursor T00RE9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00RE9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00RE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00RE9_A4364GrdTipArt[0] < A4364GrdTipArt ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00RE9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00RE9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00RE9_A4364GrdTipArt[0] > A4364GrdTipArt ) ) )
         {
            A396EmprCod = T00RE9_A396EmprCod[0] ;
            A4364GrdTipArt = T00RE9_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            RcdFound660 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound660 = (short)(0) ;
      /* Using cursor T00RE10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00RE10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00RE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00RE10_A4364GrdTipArt[0] > A4364GrdTipArt ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T00RE10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00RE10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00RE10_A4364GrdTipArt[0] < A4364GrdTipArt ) ) )
         {
            A396EmprCod = T00RE10_A396EmprCod[0] ;
            A4364GrdTipArt = T00RE10_A4364GrdTipArt[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
            RcdFound660 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyRE660( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A5656Tifi_Ul = O5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
         insertRE660( ) ;
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
               A5656Tifi_Ul = O5656Tifi_Ul ;
               n5656Tifi_Ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
               delete( ) ;
               afterTrn( ) ;
            }
            else
            {
               /* Update record */
               A5656Tifi_Ul = O5656Tifi_Ul ;
               n5656Tifi_Ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
               updateRE660( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4364GrdTipArt != Z4364GrdTipArt ) )
            {
               /* Insert record */
               A5656Tifi_Ul = O5656Tifi_Ul ;
               n5656Tifi_Ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
               insertRE660( ) ;
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
                  A5656Tifi_Ul = O5656Tifi_Ul ;
                  n5656Tifi_Ul = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
                  insertRE660( ) ;
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
         A5656Tifi_Ul = O5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
         delete( ) ;
         afterTrn( ) ;
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyRE660( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00RE4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTIP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z4368GrdTipDsc, T00RE4_A4368GrdTipDsc[0]) != 0 ) || ( Z5656Tifi_Ul != T00RE4_A5656Tifi_Ul[0] ) )
         {
            if ( GXutil.strcmp(Z4368GrdTipDsc, T00RE4_A4368GrdTipDsc[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.ttixfi:[seudo value changed for attri]"+"GrdTipDsc");
               GXutil.writeLogRaw("Old: ",Z4368GrdTipDsc);
               GXutil.writeLogRaw("Current: ",T00RE4_A4368GrdTipDsc[0]);
            }
            if ( Z5656Tifi_Ul != T00RE4_A5656Tifi_Ul[0] )
            {
               GXutil.writeLogln("facturacion.ttixfi:[seudo value changed for attri]"+"Tifi_Ul");
               GXutil.writeLogRaw("Old: ",Z5656Tifi_Ul);
               GXutil.writeLogRaw("Current: ",T00RE4_A5656Tifi_Ul[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPGRDTIP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertRE660( )
   {
      beforeValidateRE660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRE660( ) ;
      }
      if ( AnyError == 0 )
      {
         zmRE660( 0) ;
         checkOptimisticConcurrencyRE660( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRE660( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertRE660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RE11 */
                  pr_default.execute(9, new Object[] {Short.valueOf(A4364GrdTipArt), A4368GrdTipDsc, Boolean.valueOf(n5656Tifi_Ul), Short.valueOf(A5656Tifi_Ul), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
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
                        processLevelRE660( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaptionRE0( ) ;
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
            loadRE660( ) ;
         }
         endLevelRE660( ) ;
      }
      closeExtendedTableCursorsRE660( ) ;
   }

   public void updateRE660( )
   {
      beforeValidateRE660( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRE660( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRE660( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRE660( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateRE660( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RE12 */
                  pr_default.execute(10, new Object[] {A4368GrdTipDsc, Boolean.valueOf(n5656Tifi_Ul), Short.valueOf(A5656Tifi_Ul), A396EmprCod, Short.valueOf(A4364GrdTipArt)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPGRDTIP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateRE660( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevelRE660( ) ;
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
         endLevelRE660( ) ;
      }
      closeExtendedTableCursorsRE660( ) ;
   }

   public void deferredUpdateRE660( )
   {
   }

   public void delete( )
   {
      beforeValidateRE660( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRE660( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsRE660( ) ;
         afterConfirmRE660( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteRE660( ) ;
            if ( AnyError == 0 )
            {
               A5656Tifi_Ul = O5656Tifi_Ul ;
               n5656Tifi_Ul = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
               scanStartRE836( ) ;
               while ( RcdFound836 != 0 )
               {
                  getByPrimaryKeyRE836( ) ;
                  deleteRE836( ) ;
                  scanNextRE836( ) ;
                  O5656Tifi_Ul = A5656Tifi_Ul ;
                  n5656Tifi_Ul = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
               }
               scanEndRE836( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RE13 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
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
      endLevelRE660( ) ;
      Gx_mode = sMode660 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsRE660( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T00RE14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Calidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00RE15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T00RE16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "COLPRE", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T00RE17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LMARCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T00RE18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRDTI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T00RE19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "GRDTAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void processNestedLevelRE836( )
   {
      s5656Tifi_Ul = O5656Tifi_Ul ;
      n5656Tifi_Ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRowRE836( ) ;
         if ( ( nRcdExists_836 != 0 ) || ( nIsMod_836 != 0 ) )
         {
            standaloneNotModalRE836( ) ;
            getKeyRE836( ) ;
            if ( ( nRcdExists_836 == 0 ) && ( nRcdDeleted_836 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insertRE836( ) ;
            }
            else
            {
               if ( RcdFound836 != 0 )
               {
                  if ( ( nRcdDeleted_836 != 0 ) && ( nRcdExists_836 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     deleteRE836( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_836 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        updateRE836( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_836 == 0 )
                  {
                     GXCCtl = "TIFI_L_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTifi_l_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O5656Tifi_Ul = A5656Tifi_Ul ;
            n5656Tifi_Ul = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
         }
         httpContext.changePostValue( edtTifi_l_Internalname, GXutil.ltrim( localUtil.ntoc( A5657Tifi_l, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_vi_Internalname, GXutil.ltrim( localUtil.ntoc( A5658Tifi_vi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_vf_Internalname, GXutil.ltrim( localUtil.ntoc( A5659Tifi_vf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_t_Internalname, GXutil.ltrim( localUtil.ntoc( A5660Tifi_t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtTifi_f_Internalname, GXutil.ltrim( localUtil.ntoc( A5661Tifi_f, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5657Tifi_l_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5657Tifi_l, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5658Tifi_vi_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5658Tifi_vi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5659Tifi_vf_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5659Tifi_vf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5660Tifi_t_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5660Tifi_t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z5661Tifi_f_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z5661Tifi_f, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_836_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_836_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_836_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_836 != 0 )
         {
            httpContext.changePostValue( "TIFI_L_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_l_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_VI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vi_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_VF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vf_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_T_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_t_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TIFI_F_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_f_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAllRE836( ) ;
      if ( AnyError != 0 )
      {
         O5656Tifi_Ul = s5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      }
      nRcdExists_836 = (short)(0) ;
      nIsMod_836 = (short)(0) ;
      nRcdDeleted_836 = (short)(0) ;
   }

   public void processLevelRE660( )
   {
      /* Save parent mode. */
      sMode660 = Gx_mode ;
      processNestedLevelRE836( ) ;
      if ( AnyError != 0 )
      {
         O5656Tifi_Ul = s5656Tifi_Ul ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode660 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T00RE20 */
      pr_default.execute(18, new Object[] {Boolean.valueOf(n5656Tifi_Ul), Short.valueOf(A5656Tifi_Ul), A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRDTIP");
   }

   public void endLevelRE660( )
   {
      pr_default.close(2);
      if ( AnyError == 0 )
      {
         beforeCompleteRE660( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.ttixfi");
         if ( AnyError == 0 )
         {
            confirmValuesRE0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.ttixfi");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartRE660( )
   {
      /* Scan By routine */
      /* Using cursor T00RE21 */
      pr_default.execute(19);
      RcdFound660 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A396EmprCod = T00RE21_A396EmprCod[0] ;
         A4364GrdTipArt = T00RE21_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextRE660( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound660 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound660 = (short)(1) ;
         A396EmprCod = T00RE21_A396EmprCod[0] ;
         A4364GrdTipArt = T00RE21_A4364GrdTipArt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      }
   }

   public void scanEndRE660( )
   {
      pr_default.close(19);
   }

   public void afterConfirmRE660( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertRE660( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateRE660( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteRE660( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteRE660( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateRE660( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesRE660( )
   {
      edtGrdTipArt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipArt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipArt_Enabled), 5, 0), true);
      edtGrdTipDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtGrdTipDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGrdTipDsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zmRE836( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z5658Tifi_vi = T00RE3_A5658Tifi_vi[0] ;
            Z5659Tifi_vf = T00RE3_A5659Tifi_vf[0] ;
            Z5660Tifi_t = T00RE3_A5660Tifi_t[0] ;
            Z5661Tifi_f = T00RE3_A5661Tifi_f[0] ;
         }
         else
         {
            Z5658Tifi_vi = A5658Tifi_vi ;
            Z5659Tifi_vf = A5659Tifi_vf ;
            Z5660Tifi_t = A5660Tifi_t ;
            Z5661Tifi_f = A5661Tifi_f ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z5657Tifi_l = A5657Tifi_l ;
         Z5658Tifi_vi = A5658Tifi_vi ;
         Z5659Tifi_vf = A5659Tifi_vf ;
         Z5660Tifi_t = A5660Tifi_t ;
         Z5661Tifi_f = A5661Tifi_f ;
      }
   }

   public void standaloneNotModalRE836( )
   {
   }

   public void standaloneModalRE836( )
   {
      if ( isIns( )  )
      {
         A5656Tifi_Ul = (short)(O5656Tifi_Ul+1) ;
         n5656Tifi_Ul = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A5657Tifi_l = A5656Tifi_Ul ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTifi_l_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTifi_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_l_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtTifi_l_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTifi_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_l_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void loadRE836( )
   {
      /* Using cursor T00RE22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound836 = (short)(1) ;
         A5658Tifi_vi = T00RE22_A5658Tifi_vi[0] ;
         n5658Tifi_vi = T00RE22_n5658Tifi_vi[0] ;
         A5659Tifi_vf = T00RE22_A5659Tifi_vf[0] ;
         n5659Tifi_vf = T00RE22_n5659Tifi_vf[0] ;
         A5660Tifi_t = T00RE22_A5660Tifi_t[0] ;
         n5660Tifi_t = T00RE22_n5660Tifi_t[0] ;
         A5661Tifi_f = T00RE22_A5661Tifi_f[0] ;
         n5661Tifi_f = T00RE22_n5661Tifi_f[0] ;
         zmRE836( -10) ;
      }
      pr_default.close(20);
      onLoadActionsRE836( ) ;
   }

   public void onLoadActionsRE836( )
   {
   }

   public void checkExtendedTableRE836( )
   {
      nIsDirty_836 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModalRE836( ) ;
   }

   public void closeExtendedTableCursorsRE836( )
   {
   }

   public void enableDisableRE836( )
   {
   }

   public void getKeyRE836( )
   {
      /* Using cursor T00RE23 */
      pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l)});
      if ( (pr_default.getStatus(21) != 101) )
      {
         RcdFound836 = (short)(1) ;
      }
      else
      {
         RcdFound836 = (short)(0) ;
      }
      pr_default.close(21);
   }

   public void getByPrimaryKeyRE836( )
   {
      /* Using cursor T00RE3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zmRE836( 10) ;
         RcdFound836 = (short)(1) ;
         initializeNonKeyRE836( ) ;
         A5657Tifi_l = T00RE3_A5657Tifi_l[0] ;
         A5658Tifi_vi = T00RE3_A5658Tifi_vi[0] ;
         n5658Tifi_vi = T00RE3_n5658Tifi_vi[0] ;
         A5659Tifi_vf = T00RE3_A5659Tifi_vf[0] ;
         n5659Tifi_vf = T00RE3_n5659Tifi_vf[0] ;
         A5660Tifi_t = T00RE3_A5660Tifi_t[0] ;
         n5660Tifi_t = T00RE3_n5660Tifi_t[0] ;
         A5661Tifi_f = T00RE3_A5661Tifi_f[0] ;
         n5661Tifi_f = T00RE3_n5661Tifi_f[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4364GrdTipArt = A4364GrdTipArt ;
         Z5657Tifi_l = A5657Tifi_l ;
         sMode836 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadRE836( ) ;
         Gx_mode = sMode836 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound836 = (short)(0) ;
         initializeNonKeyRE836( ) ;
         sMode836 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModalRE836( ) ;
         Gx_mode = sMode836 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributesRE836( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrencyRE836( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00RE2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIxFI"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z5658Tifi_vi, T00RE2_A5658Tifi_vi[0]) != 0 ) || ( DecimalUtil.compareTo(Z5659Tifi_vf, T00RE2_A5659Tifi_vf[0]) != 0 ) || ( Z5660Tifi_t != T00RE2_A5660Tifi_t[0] ) || ( DecimalUtil.compareTo(Z5661Tifi_f, T00RE2_A5661Tifi_f[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z5658Tifi_vi, T00RE2_A5658Tifi_vi[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.ttixfi:[seudo value changed for attri]"+"Tifi_vi");
               GXutil.writeLogRaw("Old: ",Z5658Tifi_vi);
               GXutil.writeLogRaw("Current: ",T00RE2_A5658Tifi_vi[0]);
            }
            if ( DecimalUtil.compareTo(Z5659Tifi_vf, T00RE2_A5659Tifi_vf[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.ttixfi:[seudo value changed for attri]"+"Tifi_vf");
               GXutil.writeLogRaw("Old: ",Z5659Tifi_vf);
               GXutil.writeLogRaw("Current: ",T00RE2_A5659Tifi_vf[0]);
            }
            if ( Z5660Tifi_t != T00RE2_A5660Tifi_t[0] )
            {
               GXutil.writeLogln("facturacion.ttixfi:[seudo value changed for attri]"+"Tifi_t");
               GXutil.writeLogRaw("Old: ",Z5660Tifi_t);
               GXutil.writeLogRaw("Current: ",T00RE2_A5660Tifi_t[0]);
            }
            if ( DecimalUtil.compareTo(Z5661Tifi_f, T00RE2_A5661Tifi_f[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.ttixfi:[seudo value changed for attri]"+"Tifi_f");
               GXutil.writeLogRaw("Old: ",Z5661Tifi_f);
               GXutil.writeLogRaw("Current: ",T00RE2_A5661Tifi_f[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIxFI"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertRE836( )
   {
      beforeValidateRE836( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRE836( ) ;
      }
      if ( AnyError == 0 )
      {
         zmRE836( 0) ;
         checkOptimisticConcurrencyRE836( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmRE836( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertRE836( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00RE24 */
                  pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l), Boolean.valueOf(n5658Tifi_vi), A5658Tifi_vi, Boolean.valueOf(n5659Tifi_vf), A5659Tifi_vf, Boolean.valueOf(n5660Tifi_t), Short.valueOf(A5660Tifi_t), Boolean.valueOf(n5661Tifi_f), A5661Tifi_f});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIxFI");
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
            loadRE836( ) ;
         }
         endLevelRE836( ) ;
      }
      closeExtendedTableCursorsRE836( ) ;
   }

   public void updateRE836( )
   {
      beforeValidateRE836( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableRE836( ) ;
      }
      if ( ( nIsMod_836 != 0 ) || ( nIsDirty_836 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrencyRE836( ) ;
            if ( AnyError == 0 )
            {
               afterConfirmRE836( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdateRE836( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T00RE25 */
                     pr_default.execute(23, new Object[] {Boolean.valueOf(n5658Tifi_vi), A5658Tifi_vi, Boolean.valueOf(n5659Tifi_vf), A5659Tifi_vf, Boolean.valueOf(n5660Tifi_t), Short.valueOf(A5660Tifi_t), Boolean.valueOf(n5661Tifi_f), A5661Tifi_f, A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIxFI");
                     if ( (pr_default.getStatus(23) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIxFI"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdateRE836( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKeyRE836( ) ;
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
            endLevelRE836( ) ;
         }
      }
      closeExtendedTableCursorsRE836( ) ;
   }

   public void deferredUpdateRE836( )
   {
   }

   public void deleteRE836( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidateRE836( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyRE836( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsRE836( ) ;
         afterConfirmRE836( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteRE836( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00RE26 */
               pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt), Short.valueOf(A5657Tifi_l)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIxFI");
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
      sMode836 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelRE836( ) ;
      Gx_mode = sMode836 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsRE836( )
   {
      standaloneModalRE836( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevelRE836( )
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

   public void scanStartRE836( )
   {
      /* Scan By routine */
      /* Using cursor T00RE27 */
      pr_default.execute(25, new Object[] {A396EmprCod, Short.valueOf(A4364GrdTipArt)});
      RcdFound836 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound836 = (short)(1) ;
         A5657Tifi_l = T00RE27_A5657Tifi_l[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNextRE836( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound836 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound836 = (short)(1) ;
         A5657Tifi_l = T00RE27_A5657Tifi_l[0] ;
      }
   }

   public void scanEndRE836( )
   {
      pr_default.close(25);
   }

   public void afterConfirmRE836( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertRE836( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateRE836( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteRE836( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteRE836( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateRE836( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesRE836( )
   {
      edtTifi_l_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTifi_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_l_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtTifi_vi_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTifi_vi_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_vi_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtTifi_vf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTifi_vf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_vf_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtTifi_t_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTifi_t_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_t_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtTifi_f_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTifi_f_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_f_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashesRE836( )
   {
   }

   public void send_integrity_lvl_hashesRE660( )
   {
   }

   public void subsflControlProps_32836( )
   {
      edtTifi_l_Internalname = "TIFI_L_"+sGXsfl_32_idx ;
      edtTifi_vi_Internalname = "TIFI_VI_"+sGXsfl_32_idx ;
      edtTifi_vf_Internalname = "TIFI_VF_"+sGXsfl_32_idx ;
      edtTifi_t_Internalname = "TIFI_T_"+sGXsfl_32_idx ;
      edtTifi_f_Internalname = "TIFI_F_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_32836( )
   {
      edtTifi_l_Internalname = "TIFI_L_"+sGXsfl_32_fel_idx ;
      edtTifi_vi_Internalname = "TIFI_VI_"+sGXsfl_32_fel_idx ;
      edtTifi_vf_Internalname = "TIFI_VF_"+sGXsfl_32_fel_idx ;
      edtTifi_t_Internalname = "TIFI_T_"+sGXsfl_32_fel_idx ;
      edtTifi_f_Internalname = "TIFI_F_"+sGXsfl_32_fel_idx ;
   }

   public void addRowRE836( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32836( ) ;
      sendRowRE836( ) ;
   }

   public void sendRowRE836( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_836_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTifi_l_Internalname,GXutil.ltrim( localUtil.ntoc( A5657Tifi_l, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5657Tifi_l), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTifi_l_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTifi_l_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_836_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTifi_vi_Internalname,GXutil.ltrim( localUtil.ntoc( A5658Tifi_vi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTifi_vi_Enabled!=0) ? localUtil.format( A5658Tifi_vi, "ZZZZ9.99999") : localUtil.format( A5658Tifi_vi, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTifi_vi_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTifi_vi_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_836_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTifi_vf_Internalname,GXutil.ltrim( localUtil.ntoc( A5659Tifi_vf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTifi_vf_Enabled!=0) ? localUtil.format( A5659Tifi_vf, "ZZZZ9.99999") : localUtil.format( A5659Tifi_vf, "ZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,35);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTifi_vf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTifi_vf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_836_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTifi_t_Internalname,GXutil.ltrim( localUtil.ntoc( A5660Tifi_t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTifi_t_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A5660Tifi_t), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A5660Tifi_t), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTifi_t_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTifi_t_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_836_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTifi_f_Internalname,GXutil.ltrim( localUtil.ntoc( A5661Tifi_f, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtTifi_f_Enabled!=0) ? localUtil.format( A5661Tifi_f, "ZZ9.9999") : localUtil.format( A5661Tifi_f, "ZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTifi_f_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTifi_f_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashesRE836( ) ;
      GXCCtl = "Z5657Tifi_l_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5657Tifi_l, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5658Tifi_vi_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5658Tifi_vi, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5659Tifi_vf_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5659Tifi_vf, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5660Tifi_t_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5660Tifi_t, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z5661Tifi_f_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z5661Tifi_f, (byte)(8), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_836_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_836_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_836_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_836, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV45TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV45TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV42EmprCod));
      GXCCtl = "vGRDTIPART_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV43GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TIFI_L_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_l_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIFI_VI_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vi_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIFI_VF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vf_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIFI_T_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_t_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIFI_F_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_f_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRowRE836( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32836( ) ;
      edtTifi_l_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_L_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTifi_vi_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_VI_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTifi_vf_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_VF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTifi_t_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_T_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtTifi_f_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TIFI_F_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTifi_l_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTifi_l_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
      {
         GXCCtl = "TIFI_L_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTifi_l_Internalname ;
         wbErr = true ;
         A5657Tifi_l = (short)(0) ;
      }
      else
      {
         A5657Tifi_l = (short)(localUtil.ctol( httpContext.cgiGet( edtTifi_l_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTifi_vi_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTifi_vi_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "TIFI_VI_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTifi_vi_Internalname ;
         wbErr = true ;
         A5658Tifi_vi = DecimalUtil.ZERO ;
         n5658Tifi_vi = false ;
      }
      else
      {
         A5658Tifi_vi = localUtil.ctond( httpContext.cgiGet( edtTifi_vi_Internalname)) ;
         n5658Tifi_vi = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTifi_vf_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTifi_vf_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
      {
         GXCCtl = "TIFI_VF_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTifi_vf_Internalname ;
         wbErr = true ;
         A5659Tifi_vf = DecimalUtil.ZERO ;
         n5659Tifi_vf = false ;
      }
      else
      {
         A5659Tifi_vf = localUtil.ctond( httpContext.cgiGet( edtTifi_vf_Internalname)) ;
         n5659Tifi_vf = false ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTifi_t_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTifi_t_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "TIFI_T_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTifi_t_Internalname ;
         wbErr = true ;
         A5660Tifi_t = (short)(0) ;
         n5660Tifi_t = false ;
      }
      else
      {
         A5660Tifi_t = (short)(localUtil.ctol( httpContext.cgiGet( edtTifi_t_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n5660Tifi_t = false ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtTifi_f_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtTifi_f_Internalname)), DecimalUtil.stringToDec("999.9999")) > 0 ) ) )
      {
         GXCCtl = "TIFI_F_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTifi_f_Internalname ;
         wbErr = true ;
         A5661Tifi_f = DecimalUtil.ZERO ;
         n5661Tifi_f = false ;
      }
      else
      {
         A5661Tifi_f = localUtil.ctond( httpContext.cgiGet( edtTifi_f_Internalname)) ;
         n5661Tifi_f = false ;
      }
      GXCCtl = "Z5657Tifi_l_" + sGXsfl_32_idx ;
      Z5657Tifi_l = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5658Tifi_vi_" + sGXsfl_32_idx ;
      Z5658Tifi_vi = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5659Tifi_vf_" + sGXsfl_32_idx ;
      Z5659Tifi_vf = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z5660Tifi_t_" + sGXsfl_32_idx ;
      Z5660Tifi_t = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z5661Tifi_f_" + sGXsfl_32_idx ;
      Z5661Tifi_f = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "nRcdDeleted_836_" + sGXsfl_32_idx ;
      nRcdDeleted_836 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_836_" + sGXsfl_32_idx ;
      nRcdExists_836 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_836_" + sGXsfl_32_idx ;
      nIsMod_836 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTifi_l_Enabled = edtTifi_l_Enabled ;
   }

   public void confirmValuesRE0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32836( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32836( ) ;
         httpContext.changePostValue( "Z5657Tifi_l_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5657Tifi_l_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5657Tifi_l_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z5658Tifi_vi_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5658Tifi_vi_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5658Tifi_vi_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z5659Tifi_vf_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5659Tifi_vf_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5659Tifi_vf_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z5660Tifi_t_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5660Tifi_t_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5660Tifi_t_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z5661Tifi_f_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z5661Tifi_f_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z5661Tifi_f_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.ttixfi", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV43GrdTipArt,4,0))}, new String[] {"Gx_mode","EmprCod","GrdTipArt"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTIxFI");
      forbiddenHiddens.add("GrdTipArt", localUtil.format( DecimalUtil.doubleToDec(A4364GrdTipArt), "ZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("GrdTipDsc", GXutil.rtrim( localUtil.format( A4368GrdTipDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\ttixfi:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4364GrdTipArt", GXutil.ltrim( localUtil.ntoc( Z4364GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4368GrdTipDsc", GXutil.rtrim( Z4368GrdTipDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5656Tifi_Ul", GXutil.ltrim( localUtil.ntoc( Z5656Tifi_Ul, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "O5656Tifi_Ul", GXutil.ltrim( localUtil.ntoc( O5656Tifi_Ul, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV45TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV45TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV45TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV42EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV42EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRDTIPART", GXutil.ltrim( localUtil.ntoc( AV43GrdTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRDTIPART", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV43GrdTipArt), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIFI_UL", GXutil.ltrim( localUtil.ntoc( A5656Tifi_Ul, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.facturacion.ttixfi", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV42EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV43GrdTipArt,4,0))}, new String[] {"Gx_mode","EmprCod","GrdTipArt"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TTIxFI" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TIxFI", "") ;
   }

   public void initializeNonKeyRE660( )
   {
      A4368GrdTipDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4368GrdTipDsc", A4368GrdTipDsc);
      A5656Tifi_Ul = (short)(0) ;
      n5656Tifi_Ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      O5656Tifi_Ul = A5656Tifi_Ul ;
      n5656Tifi_Ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
      Z4368GrdTipDsc = "" ;
      Z5656Tifi_Ul = (short)(0) ;
   }

   public void initAllRE660( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4364GrdTipArt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A4364GrdTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4364GrdTipArt), 4, 0));
      initializeNonKeyRE660( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKeyRE836( )
   {
      A5658Tifi_vi = DecimalUtil.ZERO ;
      n5658Tifi_vi = false ;
      A5659Tifi_vf = DecimalUtil.ZERO ;
      n5659Tifi_vf = false ;
      A5660Tifi_t = (short)(0) ;
      n5660Tifi_t = false ;
      A5661Tifi_f = DecimalUtil.ZERO ;
      n5661Tifi_f = false ;
      Z5658Tifi_vi = DecimalUtil.ZERO ;
      Z5659Tifi_vf = DecimalUtil.ZERO ;
      Z5660Tifi_t = (short)(0) ;
      Z5661Tifi_f = DecimalUtil.ZERO ;
   }

   public void initAllRE836( )
   {
      A5657Tifi_l = (short)(0) ;
      initializeNonKeyRE836( ) ;
   }

   public void standaloneModalInsertRE836( )
   {
      A5656Tifi_Ul = i5656Tifi_Ul ;
      n5656Tifi_Ul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A5656Tifi_Ul", GXutil.ltrimstr( DecimalUtil.doubleToDec(A5656Tifi_Ul), 3, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211655715", true, true);
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
      httpContext.AddJavascriptSource("facturacion/ttixfi.js", "?20268211655715", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties836( )
   {
      edtTifi_l_Enabled = defedtTifi_l_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTifi_l_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTifi_l_Enabled), 5, 0), !bGXsfl_32_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5657Tifi_l, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_l_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5658Tifi_vi, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vi_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5659Tifi_vf, (byte)(11), (byte)(5), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_vf_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5660Tifi_t, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_t_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5661Tifi_f, (byte)(8), (byte)(4), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTifi_f_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtGrdTipArt_Internalname = "GRDTIPART" ;
      edtGrdTipDsc_Internalname = "GRDTIPDSC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtTifi_l_Internalname = "TIFI_L" ;
      edtTifi_vi_Internalname = "TIFI_VI" ;
      edtTifi_vf_Internalname = "TIFI_VF" ;
      edtTifi_t_Internalname = "TIFI_T" ;
      edtTifi_f_Internalname = "TIFI_F" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
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
      Form.setCaption( httpContext.getMessage( "TIxFI", "") );
      edtTifi_f_Jsonclick = "" ;
      edtTifi_t_Jsonclick = "" ;
      edtTifi_vf_Jsonclick = "" ;
      edtTifi_vi_Jsonclick = "" ;
      edtTifi_l_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtTifi_f_Enabled = 1 ;
      edtTifi_t_Enabled = 1 ;
      edtTifi_vf_Enabled = 1 ;
      edtTifi_vi_Enabled = 1 ;
      edtTifi_l_Enabled = 1 ;
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
      subsflControlProps_32836( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModalRE836( ) ;
         standaloneModalRE836( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRowRE836( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32836( ) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV43GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV45TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV42EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV43GrdTipArt',fld:'vGRDTIPART',pic:'ZZZ9',hsh:true},{av:'A4364GrdTipArt',fld:'GRDTIPART',pic:'ZZZ9'},{av:'A4368GrdTipDsc',fld:'GRDTIPDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12RE2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV45TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_GRDTIPART","{handler:'valid_Grdtipart',iparms:[]");
      setEventMetadata("VALID_GRDTIPART",",oparms:[]}");
      setEventMetadata("VALID_TIFI_L","{handler:'valid_Tifi_l',iparms:[]");
      setEventMetadata("VALID_TIFI_L",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Tifi_f',iparms:[]");
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
      wcpOAV42EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4368GrdTipDsc = "" ;
      Z5658Tifi_vi = DecimalUtil.ZERO ;
      Z5659Tifi_vf = DecimalUtil.ZERO ;
      Z5661Tifi_f = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV42EmprCod = "" ;
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
      AV48Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode836 = "" ;
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
      sMode660 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A5658Tifi_vi = DecimalUtil.ZERO ;
      A5659Tifi_vf = DecimalUtil.ZERO ;
      A5661Tifi_f = DecimalUtil.ZERO ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV44WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV45TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV46WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00RE6_A407EmprNom = new String[] {""} ;
      T00RE6_n407EmprNom = new boolean[] {false} ;
      T00RE7_A4364GrdTipArt = new short[1] ;
      T00RE7_A4368GrdTipDsc = new String[] {""} ;
      T00RE7_A407EmprNom = new String[] {""} ;
      T00RE7_n407EmprNom = new boolean[] {false} ;
      T00RE7_A5656Tifi_Ul = new short[1] ;
      T00RE7_n5656Tifi_Ul = new boolean[] {false} ;
      T00RE7_A396EmprCod = new String[] {""} ;
      T00RE8_A396EmprCod = new String[] {""} ;
      T00RE8_A4364GrdTipArt = new short[1] ;
      T00RE5_A4364GrdTipArt = new short[1] ;
      T00RE5_A4368GrdTipDsc = new String[] {""} ;
      T00RE5_A5656Tifi_Ul = new short[1] ;
      T00RE5_n5656Tifi_Ul = new boolean[] {false} ;
      T00RE5_A396EmprCod = new String[] {""} ;
      T00RE9_A396EmprCod = new String[] {""} ;
      T00RE9_A4364GrdTipArt = new short[1] ;
      T00RE10_A396EmprCod = new String[] {""} ;
      T00RE10_A4364GrdTipArt = new short[1] ;
      T00RE4_A4364GrdTipArt = new short[1] ;
      T00RE4_A4368GrdTipDsc = new String[] {""} ;
      T00RE4_A5656Tifi_Ul = new short[1] ;
      T00RE4_n5656Tifi_Ul = new boolean[] {false} ;
      T00RE4_A396EmprCod = new String[] {""} ;
      T00RE14_A396EmprCod = new String[] {""} ;
      T00RE14_A4364GrdTipArt = new short[1] ;
      T00RE14_A12944FamCalID = new byte[1] ;
      T00RE15_A396EmprCod = new String[] {""} ;
      T00RE15_A4364GrdTipArt = new short[1] ;
      T00RE15_A12938GabMezID = new short[1] ;
      T00RE16_A396EmprCod = new String[] {""} ;
      T00RE16_A252CliCod = new int[1] ;
      T00RE16_A4364GrdTipArt = new short[1] ;
      T00RE16_A4365NomColor = new String[] {""} ;
      T00RE16_A4366NumColor = new int[1] ;
      T00RE16_A4367TipColor = new byte[1] ;
      T00RE16_A5740TipProd = new String[] {""} ;
      T00RE17_A396EmprCod = new String[] {""} ;
      T00RE17_A5654Mgen_com = new String[] {""} ;
      T00RE17_A4364GrdTipArt = new short[1] ;
      T00RE18_A396EmprCod = new String[] {""} ;
      T00RE18_A4364GrdTipArt = new short[1] ;
      T00RE18_A829TipArtCod = new short[1] ;
      T00RE19_A396EmprCod = new String[] {""} ;
      T00RE19_A4364GrdTipArt = new short[1] ;
      T00RE19_A4376GrdTipVal = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE21_A396EmprCod = new String[] {""} ;
      T00RE21_A4364GrdTipArt = new short[1] ;
      T00RE22_A396EmprCod = new String[] {""} ;
      T00RE22_A4364GrdTipArt = new short[1] ;
      T00RE22_A5657Tifi_l = new short[1] ;
      T00RE22_A5658Tifi_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE22_n5658Tifi_vi = new boolean[] {false} ;
      T00RE22_A5659Tifi_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE22_n5659Tifi_vf = new boolean[] {false} ;
      T00RE22_A5660Tifi_t = new short[1] ;
      T00RE22_n5660Tifi_t = new boolean[] {false} ;
      T00RE22_A5661Tifi_f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE22_n5661Tifi_f = new boolean[] {false} ;
      T00RE23_A396EmprCod = new String[] {""} ;
      T00RE23_A4364GrdTipArt = new short[1] ;
      T00RE23_A5657Tifi_l = new short[1] ;
      T00RE3_A396EmprCod = new String[] {""} ;
      T00RE3_A4364GrdTipArt = new short[1] ;
      T00RE3_A5657Tifi_l = new short[1] ;
      T00RE3_A5658Tifi_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE3_n5658Tifi_vi = new boolean[] {false} ;
      T00RE3_A5659Tifi_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE3_n5659Tifi_vf = new boolean[] {false} ;
      T00RE3_A5660Tifi_t = new short[1] ;
      T00RE3_n5660Tifi_t = new boolean[] {false} ;
      T00RE3_A5661Tifi_f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE3_n5661Tifi_f = new boolean[] {false} ;
      T00RE2_A396EmprCod = new String[] {""} ;
      T00RE2_A4364GrdTipArt = new short[1] ;
      T00RE2_A5657Tifi_l = new short[1] ;
      T00RE2_A5658Tifi_vi = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE2_n5658Tifi_vi = new boolean[] {false} ;
      T00RE2_A5659Tifi_vf = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE2_n5659Tifi_vf = new boolean[] {false} ;
      T00RE2_A5660Tifi_t = new short[1] ;
      T00RE2_n5660Tifi_t = new boolean[] {false} ;
      T00RE2_A5661Tifi_f = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00RE2_n5661Tifi_f = new boolean[] {false} ;
      T00RE27_A396EmprCod = new String[] {""} ;
      T00RE27_A4364GrdTipArt = new short[1] ;
      T00RE27_A5657Tifi_l = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.ttixfi__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.ttixfi__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.ttixfi__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.ttixfi__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.ttixfi__default(),
         new Object[] {
             new Object[] {
            T00RE2_A396EmprCod, T00RE2_A4364GrdTipArt, T00RE2_A5657Tifi_l, T00RE2_A5658Tifi_vi, T00RE2_n5658Tifi_vi, T00RE2_A5659Tifi_vf, T00RE2_n5659Tifi_vf, T00RE2_A5660Tifi_t, T00RE2_n5660Tifi_t, T00RE2_A5661Tifi_f,
            T00RE2_n5661Tifi_f
            }
            , new Object[] {
            T00RE3_A396EmprCod, T00RE3_A4364GrdTipArt, T00RE3_A5657Tifi_l, T00RE3_A5658Tifi_vi, T00RE3_n5658Tifi_vi, T00RE3_A5659Tifi_vf, T00RE3_n5659Tifi_vf, T00RE3_A5660Tifi_t, T00RE3_n5660Tifi_t, T00RE3_A5661Tifi_f,
            T00RE3_n5661Tifi_f
            }
            , new Object[] {
            T00RE4_A4364GrdTipArt, T00RE4_A4368GrdTipDsc, T00RE4_A5656Tifi_Ul, T00RE4_n5656Tifi_Ul, T00RE4_A396EmprCod
            }
            , new Object[] {
            T00RE5_A4364GrdTipArt, T00RE5_A4368GrdTipDsc, T00RE5_A5656Tifi_Ul, T00RE5_n5656Tifi_Ul, T00RE5_A396EmprCod
            }
            , new Object[] {
            T00RE6_A407EmprNom, T00RE6_n407EmprNom
            }
            , new Object[] {
            T00RE7_A4364GrdTipArt, T00RE7_A4368GrdTipDsc, T00RE7_A407EmprNom, T00RE7_n407EmprNom, T00RE7_A5656Tifi_Ul, T00RE7_n5656Tifi_Ul, T00RE7_A396EmprCod
            }
            , new Object[] {
            T00RE8_A396EmprCod, T00RE8_A4364GrdTipArt
            }
            , new Object[] {
            T00RE9_A396EmprCod, T00RE9_A4364GrdTipArt
            }
            , new Object[] {
            T00RE10_A396EmprCod, T00RE10_A4364GrdTipArt
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00RE14_A396EmprCod, T00RE14_A4364GrdTipArt, T00RE14_A12944FamCalID
            }
            , new Object[] {
            T00RE15_A396EmprCod, T00RE15_A4364GrdTipArt, T00RE15_A12938GabMezID
            }
            , new Object[] {
            T00RE16_A396EmprCod, T00RE16_A252CliCod, T00RE16_A4364GrdTipArt, T00RE16_A4365NomColor, T00RE16_A4366NumColor, T00RE16_A4367TipColor, T00RE16_A5740TipProd
            }
            , new Object[] {
            T00RE17_A396EmprCod, T00RE17_A5654Mgen_com, T00RE17_A4364GrdTipArt
            }
            , new Object[] {
            T00RE18_A396EmprCod, T00RE18_A4364GrdTipArt, T00RE18_A829TipArtCod
            }
            , new Object[] {
            T00RE19_A396EmprCod, T00RE19_A4364GrdTipArt, T00RE19_A4376GrdTipVal
            }
            , new Object[] {
            }
            , new Object[] {
            T00RE21_A396EmprCod, T00RE21_A4364GrdTipArt
            }
            , new Object[] {
            T00RE22_A396EmprCod, T00RE22_A4364GrdTipArt, T00RE22_A5657Tifi_l, T00RE22_A5658Tifi_vi, T00RE22_n5658Tifi_vi, T00RE22_A5659Tifi_vf, T00RE22_n5659Tifi_vf, T00RE22_A5660Tifi_t, T00RE22_n5660Tifi_t, T00RE22_A5661Tifi_f,
            T00RE22_n5661Tifi_f
            }
            , new Object[] {
            T00RE23_A396EmprCod, T00RE23_A4364GrdTipArt, T00RE23_A5657Tifi_l
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00RE27_A396EmprCod, T00RE27_A4364GrdTipArt, T00RE27_A5657Tifi_l
            }
         }
      );
      AV48Pgmname = "Facturacion.TTIxFI" ;
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
   private short wcpOAV43GrdTipArt ;
   private short Z4364GrdTipArt ;
   private short Z5656Tifi_Ul ;
   private short O5656Tifi_Ul ;
   private short Z5657Tifi_l ;
   private short Z5660Tifi_t ;
   private short nRcdDeleted_836 ;
   private short nRcdExists_836 ;
   private short nIsMod_836 ;
   private short AV43GrdTipArt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A5656Tifi_Ul ;
   private short A4364GrdTipArt ;
   private short nBlankRcdCount836 ;
   private short RcdFound836 ;
   private short B5656Tifi_Ul ;
   private short nBlankRcdUsr836 ;
   private short RcdFound660 ;
   private short s5656Tifi_Ul ;
   private short A5657Tifi_l ;
   private short A5660Tifi_t ;
   private short nIsDirty_660 ;
   private short nIsDirty_836 ;
   private short i5656Tifi_Ul ;
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
   private int edtTifi_l_Enabled ;
   private int edtTifi_vi_Enabled ;
   private int edtTifi_vf_Enabled ;
   private int edtTifi_t_Enabled ;
   private int edtTifi_f_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtTifi_l_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private java.math.BigDecimal Z5658Tifi_vi ;
   private java.math.BigDecimal Z5659Tifi_vf ;
   private java.math.BigDecimal Z5661Tifi_f ;
   private java.math.BigDecimal A5658Tifi_vi ;
   private java.math.BigDecimal A5659Tifi_vf ;
   private java.math.BigDecimal A5661Tifi_f ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV42EmprCod ;
   private String Z396EmprCod ;
   private String Z4368GrdTipDsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV42EmprCod ;
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
   private String edtGrdTipArt_Internalname ;
   private String edtGrdTipArt_Jsonclick ;
   private String edtGrdTipDsc_Internalname ;
   private String A4368GrdTipDsc ;
   private String edtGrdTipDsc_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
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
   private String sMode836 ;
   private String edtTifi_l_Internalname ;
   private String edtTifi_vi_Internalname ;
   private String edtTifi_vf_Internalname ;
   private String edtTifi_t_Internalname ;
   private String edtTifi_f_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode660 ;
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
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtTifi_l_Jsonclick ;
   private String edtTifi_vi_Jsonclick ;
   private String edtTifi_vf_Jsonclick ;
   private String edtTifi_t_Jsonclick ;
   private String edtTifi_f_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n5656Tifi_Ul ;
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
   private boolean returnInSub ;
   private boolean n5658Tifi_vi ;
   private boolean n5659Tifi_vf ;
   private boolean n5660Tifi_t ;
   private boolean n5661Tifi_f ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV46WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00RE6_A407EmprNom ;
   private boolean[] T00RE6_n407EmprNom ;
   private short[] T00RE7_A4364GrdTipArt ;
   private String[] T00RE7_A4368GrdTipDsc ;
   private String[] T00RE7_A407EmprNom ;
   private boolean[] T00RE7_n407EmprNom ;
   private short[] T00RE7_A5656Tifi_Ul ;
   private boolean[] T00RE7_n5656Tifi_Ul ;
   private String[] T00RE7_A396EmprCod ;
   private String[] T00RE8_A396EmprCod ;
   private short[] T00RE8_A4364GrdTipArt ;
   private short[] T00RE5_A4364GrdTipArt ;
   private String[] T00RE5_A4368GrdTipDsc ;
   private short[] T00RE5_A5656Tifi_Ul ;
   private boolean[] T00RE5_n5656Tifi_Ul ;
   private String[] T00RE5_A396EmprCod ;
   private String[] T00RE9_A396EmprCod ;
   private short[] T00RE9_A4364GrdTipArt ;
   private String[] T00RE10_A396EmprCod ;
   private short[] T00RE10_A4364GrdTipArt ;
   private short[] T00RE4_A4364GrdTipArt ;
   private String[] T00RE4_A4368GrdTipDsc ;
   private short[] T00RE4_A5656Tifi_Ul ;
   private boolean[] T00RE4_n5656Tifi_Ul ;
   private String[] T00RE4_A396EmprCod ;
   private String[] T00RE14_A396EmprCod ;
   private short[] T00RE14_A4364GrdTipArt ;
   private byte[] T00RE14_A12944FamCalID ;
   private String[] T00RE15_A396EmprCod ;
   private short[] T00RE15_A4364GrdTipArt ;
   private short[] T00RE15_A12938GabMezID ;
   private String[] T00RE16_A396EmprCod ;
   private int[] T00RE16_A252CliCod ;
   private short[] T00RE16_A4364GrdTipArt ;
   private String[] T00RE16_A4365NomColor ;
   private int[] T00RE16_A4366NumColor ;
   private byte[] T00RE16_A4367TipColor ;
   private String[] T00RE16_A5740TipProd ;
   private String[] T00RE17_A396EmprCod ;
   private String[] T00RE17_A5654Mgen_com ;
   private short[] T00RE17_A4364GrdTipArt ;
   private String[] T00RE18_A396EmprCod ;
   private short[] T00RE18_A4364GrdTipArt ;
   private short[] T00RE18_A829TipArtCod ;
   private String[] T00RE19_A396EmprCod ;
   private short[] T00RE19_A4364GrdTipArt ;
   private java.math.BigDecimal[] T00RE19_A4376GrdTipVal ;
   private String[] T00RE21_A396EmprCod ;
   private short[] T00RE21_A4364GrdTipArt ;
   private String[] T00RE22_A396EmprCod ;
   private short[] T00RE22_A4364GrdTipArt ;
   private short[] T00RE22_A5657Tifi_l ;
   private java.math.BigDecimal[] T00RE22_A5658Tifi_vi ;
   private boolean[] T00RE22_n5658Tifi_vi ;
   private java.math.BigDecimal[] T00RE22_A5659Tifi_vf ;
   private boolean[] T00RE22_n5659Tifi_vf ;
   private short[] T00RE22_A5660Tifi_t ;
   private boolean[] T00RE22_n5660Tifi_t ;
   private java.math.BigDecimal[] T00RE22_A5661Tifi_f ;
   private boolean[] T00RE22_n5661Tifi_f ;
   private String[] T00RE23_A396EmprCod ;
   private short[] T00RE23_A4364GrdTipArt ;
   private short[] T00RE23_A5657Tifi_l ;
   private String[] T00RE3_A396EmprCod ;
   private short[] T00RE3_A4364GrdTipArt ;
   private short[] T00RE3_A5657Tifi_l ;
   private java.math.BigDecimal[] T00RE3_A5658Tifi_vi ;
   private boolean[] T00RE3_n5658Tifi_vi ;
   private java.math.BigDecimal[] T00RE3_A5659Tifi_vf ;
   private boolean[] T00RE3_n5659Tifi_vf ;
   private short[] T00RE3_A5660Tifi_t ;
   private boolean[] T00RE3_n5660Tifi_t ;
   private java.math.BigDecimal[] T00RE3_A5661Tifi_f ;
   private boolean[] T00RE3_n5661Tifi_f ;
   private String[] T00RE2_A396EmprCod ;
   private short[] T00RE2_A4364GrdTipArt ;
   private short[] T00RE2_A5657Tifi_l ;
   private java.math.BigDecimal[] T00RE2_A5658Tifi_vi ;
   private boolean[] T00RE2_n5658Tifi_vi ;
   private java.math.BigDecimal[] T00RE2_A5659Tifi_vf ;
   private boolean[] T00RE2_n5659Tifi_vf ;
   private short[] T00RE2_A5660Tifi_t ;
   private boolean[] T00RE2_n5660Tifi_t ;
   private java.math.BigDecimal[] T00RE2_A5661Tifi_f ;
   private boolean[] T00RE2_n5661Tifi_f ;
   private String[] T00RE27_A396EmprCod ;
   private short[] T00RE27_A4364GrdTipArt ;
   private short[] T00RE27_A5657Tifi_l ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV44WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV45TrnContext ;
}

final  class ttixfi__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttixfi__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttixfi__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttixfi__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttixfi__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00RE2", "SELECT EmprCod, GrdTipArt, Tifi_l, Tifi_vi, Tifi_vf, Tifi_t, Tifi_f FROM TXPTIxFI WHERE EmprCod = ? AND GrdTipArt = ? AND Tifi_l = ?  FOR UPDATE OF Tifi_vi, Tifi_vf, Tifi_t, Tifi_f NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE3", "SELECT EmprCod, GrdTipArt, Tifi_l, Tifi_vi, Tifi_vf, Tifi_t, Tifi_f FROM TXPTIxFI WHERE EmprCod = ? AND GrdTipArt = ? AND Tifi_l = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE4", "SELECT GrdTipArt, GrdTipDsc, Tifi_Ul, EmprCod FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ?  FOR UPDATE OF GrdTipDsc, Tifi_Ul NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE5", "SELECT GrdTipArt, GrdTipDsc, Tifi_Ul, EmprCod FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE7", "SELECT /*+ FIRST_ROWS(100) */ TM1.GrdTipArt, TM1.GrdTipDsc, T2.EmprNom, TM1.Tifi_Ul, TM1.EmprCod FROM (TXPGRDTIP TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.GrdTipArt = ? ORDER BY TM1.EmprCod, TM1.GrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE8", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE EmprCod = ? AND GrdTipArt = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE ( EmprCod > ? or EmprCod = ? and GrdTipArt > ?) ORDER BY EmprCod, GrdTipArt) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RE10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, GrdTipArt FROM TXPGRDTIP WHERE ( EmprCod < ? or EmprCod = ? and GrdTipArt < ?) ORDER BY EmprCod DESC, GrdTipArt DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00RE11", "INSERT INTO TXPGRDTIP(GrdTipArt, GrdTipDsc, Tifi_Ul, EmprCod, GabMezUlt) VALUES(?, ?, ?, ?, 0)", GX_NOMASK, "TXPGRDTIP")
         ,new UpdateCursor("T00RE12", "UPDATE TXPGRDTIP SET GrdTipDsc=?, Tifi_Ul=?  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new UpdateCursor("T00RE13", "DELETE FROM TXPGRDTIP  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new ForEachCursor("T00RE14", "SELECT * FROM (SELECT EmprCod, GrdTipArt, FamCalID FROM TXPFAMCAL WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RE15", "SELECT * FROM (SELECT EmprCod, GrdTipArt, GabMezID FROM TXPGABMEZ WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RE16", "SELECT * FROM (SELECT EmprCod, CliCod, GrdTipArt, NomColor, NumColor, TipColor, TipProd FROM TXPCOLPRE WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RE17", "SELECT * FROM (SELECT EmprCod, Mgen_com, GrdTipArt FROM TXPLMARCO WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RE18", "SELECT * FROM (SELECT EmprCod, GrdTipArt, TipArtCod FROM TXPGRDTI1 WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00RE19", "SELECT * FROM (SELECT EmprCod, GrdTipArt, GrdTipVal FROM TXPGRDTAR WHERE EmprCod = ? AND GrdTipArt = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00RE20", "UPDATE TXPGRDTIP SET Tifi_Ul=?  WHERE EmprCod = ? AND GrdTipArt = ?", GX_NOMASK, "TXPGRDTIP")
         ,new ForEachCursor("T00RE21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, GrdTipArt FROM TXPGRDTIP ORDER BY EmprCod, GrdTipArt ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE22", "SELECT EmprCod, GrdTipArt, Tifi_l, Tifi_vi, Tifi_vf, Tifi_t, Tifi_f FROM TXPTIxFI WHERE EmprCod = ? and GrdTipArt = ? and Tifi_l = ? ORDER BY EmprCod, GrdTipArt, Tifi_l ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00RE23", "SELECT EmprCod, GrdTipArt, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? AND GrdTipArt = ? AND Tifi_l = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T00RE24", "INSERT INTO TXPTIxFI(EmprCod, GrdTipArt, Tifi_l, Tifi_vi, Tifi_vf, Tifi_t, Tifi_f) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPTIxFI")
         ,new UpdateCursor("T00RE25", "UPDATE TXPTIxFI SET Tifi_vi=?, Tifi_vf=?, Tifi_t=?, Tifi_f=?  WHERE EmprCod = ? AND GrdTipArt = ? AND Tifi_l = ?", GX_NOMASK, "TXPTIxFI")
         ,new UpdateCursor("T00RE26", "DELETE FROM TXPTIxFI  WHERE EmprCod = ? AND GrdTipArt = ? AND Tifi_l = ?", GX_NOMASK, "TXPTIxFI")
         ,new ForEachCursor("T00RE27", "SELECT EmprCod, GrdTipArt, Tifi_l FROM TXPTIxFI WHERE EmprCod = ? and GrdTipArt = ? ORDER BY EmprCod, GrdTipArt, Tifi_l ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((short[]) buf[4])[0] = rslt.getShort(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,4);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 25 :
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 30);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[3]).shortValue());
               }
               stmt.setString(4, (String)parms[4], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 30);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               stmt.setString(3, (String)parms[3], 3);
               stmt.setShort(4, ((Number) parms[4]).shortValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[4], 5);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(5, (java.math.BigDecimal)parms[6], 5);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[8]).shortValue());
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(7, (java.math.BigDecimal)parms[10], 4);
               }
               return;
            case 23 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 5);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 5);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[7], 4);
               }
               stmt.setString(5, (String)parms[8], 3);
               stmt.setShort(6, ((Number) parms[9]).shortValue());
               stmt.setShort(7, ((Number) parms[10]).shortValue());
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
      }
   }

}

