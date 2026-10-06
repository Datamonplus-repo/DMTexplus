package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tlotprd_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_lotefecha") == 0 )
      {
         gxnrgridlevel_lotefecha_newrow_invoke( ) ;
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
            A396EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            A719PrdNum = httpContext.GetPar( "PrdNum") ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
            A718PrdNom = httpContext.GetPar( "PrdNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A718PrdNom, ""))));
            AV32LotePed = (int)(GXutil.lval( httpContext.GetPar( "LotePed"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32LotePed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32LotePed), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEPED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32LotePed), "ZZZZZZZ9")));
            AV33LoteFec = localUtil.parseDateParm( httpContext.GetPar( "LoteFec")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33LoteFec", localUtil.format(AV33LoteFec, "99/99/99"));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEFEC", getSecureSignedToken( "", AV33LoteFec));
            AV48LoteNEmb = (short)(GXutil.lval( httpContext.GetPar( "LoteNEmb"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48LoteNEmb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48LoteNEmb), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTENEMB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48LoteNEmb), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", ""), (short)(0)) ;
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

   public void gxnrgridlevel_lotefecha_newrow_invoke( )
   {
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      AV48LoteNEmb = (short)(GXutil.lval( httpContext.GetPar( "LoteNEmb"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV32LotePed = (int)(GXutil.lval( httpContext.GetPar( "LotePed"))) ;
      AV33LoteFec = localUtil.parseDateParm( httpContext.GetPar( "LoteFec")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_lotefecha_newrow( ) ;
      /* End function gxnrGridlevel_lotefecha_newrow_invoke */
   }

   public tlotprd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tlotprd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tlotprd_impl.class ));
   }

   public tlotprd_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbLoteCtf = new HTMLChoice();
      cmbLoteCon = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TLOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNom_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TLOTPRD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_lotefecha_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_lotefecha( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TLOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TLOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TLOTPRD.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV50Pgmname), GXutil.rtrim( localUtil.format( AV50Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TLOTPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      ucGridlevel_lotefecha_titlescategories.setProperty("GridTitlesCategories", Gridlevel_lotefecha_titlescategories_Gridtitlescategories);
      ucGridlevel_lotefecha_titlescategories.render(context, "dvelop.gridtitlescategories", Gridlevel_lotefecha_titlescategories_Internalname, "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIESContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_lotefecha( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1632 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1632 = (short)(1) ;
            scanStart1H31632( ) ;
            while ( RcdFound1632 != 0 )
            {
               init_level_properties1632( ) ;
               getByPrimaryKey1H31632( ) ;
               addRow1H31632( ) ;
               scanNext1H31632( ) ;
            }
            scanEnd1H31632( ) ;
            nBlankRcdCount1632 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1H31632( ) ;
         standaloneModal1H31632( ) ;
         sMode1632 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow1H31632( ) ;
            edtLoteFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTEFEC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtLoteID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTEID_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtLoteNEmb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTENEMB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLoteNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteNEmb_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtLotePed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTEPED_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            cmbLoteCtf.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LOTECTF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbLoteCtf.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLoteCtf.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            cmbLoteCon.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LOTECON_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbLoteCon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLoteCon.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            edtLoteCtfNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTECTFNM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNm_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtLoteCtfNF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTECTFNF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNF_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_1632 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1H31632( ) ;
            }
            sendRow1H31632( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1632 = (short)(1) ;
         nRcdExists_1632 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1H31632( ) ;
            while ( RcdFound1632 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_321632( ) ;
               init_level_properties1632( ) ;
               standaloneNotModal1H31632( ) ;
               getByPrimaryKey1H31632( ) ;
               standaloneModal1H31632( ) ;
               addRow1H31632( ) ;
               scanNext1H31632( ) ;
            }
            scanEnd1H31632( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1632 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_321632( ) ;
         initAll1H31632( ) ;
         init_level_properties1632( ) ;
         nRcdExists_1632 = (short)(0) ;
         nIsMod_1632 = (short)(0) ;
         nRcdDeleted_1632 = (short)(0) ;
         nBlankRcdCount1632 = (short)(nBlankRcdUsr1632+nBlankRcdCount1632) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1632 > 0 )
         {
            standaloneNotModal1H31632( ) ;
            standaloneModal1H31632( ) ;
            addRow1H31632( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtLoteFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1632 = (short)(nBlankRcdCount1632-1) ;
         }
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_lotefechaContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_lotefecha", Gridlevel_lotefechaContainer, subGridlevel_lotefecha_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lotefechaContainerData", Gridlevel_lotefechaContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lotefechaContainerData"+"V", Gridlevel_lotefechaContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_lotefechaContainerData"+"V"+"\" value='"+Gridlevel_lotefechaContainer.GridValuesHidden()+"'/>") ;
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
      e111H32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z719PrdNum = httpContext.cgiGet( "Z719PrdNum") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N396EmprCod = httpContext.cgiGet( "N396EmprCod") ;
            AV46EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32LotePed = (int)(localUtil.ctol( httpContext.cgiGet( "vLOTEPED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV48LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( "vLOTENEMB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV33LoteFec = localUtil.ctod( httpContext.cgiGet( "vLOTEFEC"), 0) ;
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
            Gridlevel_lotefecha_titlescategories_Objectcall = httpContext.cgiGet( "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Objectcall") ;
            Gridlevel_lotefecha_titlescategories_Class = httpContext.cgiGet( "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Class") ;
            Gridlevel_lotefecha_titlescategories_Enabled = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Enabled")) ;
            Gridlevel_lotefecha_titlescategories_Gridinternalname = httpContext.cgiGet( "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Gridinternalname") ;
            Gridlevel_lotefecha_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Gridtitlescategories") ;
            Gridlevel_lotefecha_titlescategories_Visible = GXutil.strtobool( httpContext.cgiGet( "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Visible")) ;
            /* Read variables values. */
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A718PrdNom, ""))));
            AV50Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TLOTPRD");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\tlotprd:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
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
                  sMode29 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode29 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound29 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1H30( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PRDNUM");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdNum_Internalname ;
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
                        e111H32 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121H32 ();
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
         e121H32 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1H329( ) ;
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
         disableAttributes1H329( ) ;
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

   public void confirm_1H30( )
   {
      beforeValidate1H329( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1H329( ) ;
         }
         else
         {
            checkExtendedTable1H329( ) ;
            closeExtendedTableCursors1H329( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_1H31632( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode29 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1H31632( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1H31632( ) ;
         if ( ( nRcdExists_1632 != 0 ) || ( nIsMod_1632 != 0 ) )
         {
            getKey1H31632( ) ;
            if ( ( nRcdExists_1632 == 0 ) && ( nRcdDeleted_1632 == 0 ) )
            {
               if ( RcdFound1632 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1H31632( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1H31632( ) ;
                     closeExtendedTableCursors1H31632( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "LOTEFEC_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtLoteFec_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1632 != 0 )
               {
                  if ( nRcdDeleted_1632 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1H31632( ) ;
                     load1H31632( ) ;
                     beforeValidate1H31632( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1H31632( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1632 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1H31632( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1H31632( ) ;
                           closeExtendedTableCursors1H31632( ) ;
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
                  if ( nRcdDeleted_1632 == 0 )
                  {
                     GXCCtl = "LOTEFEC_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLoteFec_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLoteFec_Internalname, localUtil.format(A11665LoteFec, "99/99/99")) ;
         httpContext.changePostValue( edtLoteID_Internalname, GXutil.rtrim( A11664LoteID)) ;
         httpContext.changePostValue( edtLoteNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLotePed_Internalname, GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbLoteCtf.getInternalname(), GXutil.rtrim( A11667LoteCtf)) ;
         httpContext.changePostValue( cmbLoteCon.getInternalname(), GXutil.rtrim( A11668LoteCon)) ;
         httpContext.changePostValue( edtLoteCtfNm_Internalname, GXutil.rtrim( A11711LoteCtfNm)) ;
         httpContext.changePostValue( edtLoteCtfNF_Internalname, GXutil.rtrim( A12352LoteCtfNF)) ;
         httpContext.changePostValue( "ZT_"+"Z11664LoteID_"+sGXsfl_32_idx, GXutil.rtrim( Z11664LoteID)) ;
         httpContext.changePostValue( "ZT_"+"Z11665LoteFec_"+sGXsfl_32_idx, localUtil.dtoc( Z11665LoteFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z11667LoteCtf_"+sGXsfl_32_idx, GXutil.rtrim( Z11667LoteCtf)) ;
         httpContext.changePostValue( "ZT_"+"Z11668LoteCon_"+sGXsfl_32_idx, GXutil.rtrim( Z11668LoteCon)) ;
         httpContext.changePostValue( "ZT_"+"Z11666LotePed_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14017LoteNEmb_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11711LoteCtfNm_"+sGXsfl_32_idx, GXutil.rtrim( Z11711LoteCtfNm)) ;
         httpContext.changePostValue( "ZT_"+"Z12352LoteCtfNF_"+sGXsfl_32_idx, GXutil.rtrim( Z12352LoteCtfNF)) ;
         httpContext.changePostValue( "nRcdDeleted_1632_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1632_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1632_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1632 != 0 )
         {
            httpContext.changePostValue( "LOTEFEC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTEID_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTENEMB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteNEmb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTEPED_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLotePed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECTF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCtf.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCon.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECTFNM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECTFNF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1H30( )
   {
   }

   public void e111H32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tlotprd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tlotprd_impl.this.A396EmprCod = GXv_char2[0] ;
      tlotprd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tlotprd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tlotprd_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV46EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tlotprd_impl.this.AV46EmprCod = GXv_char4[0] ;
      tlotprd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tlotprd_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46EmprCod", AV46EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV42WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV42WWPContext = GXv_SdtWWPContext5[0] ;
      AV43TrnContext.fromxml(AV44WebSession.getValue("TrnContext"), null, null);
      Gridlevel_lotefecha_titlescategories_Gridinternalname = subGridlevel_lotefecha_Internalname ;
      ucGridlevel_lotefecha_titlescategories.sendProperty(context, "", false, Gridlevel_lotefecha_titlescategories_Internalname, "GridInternalName", Gridlevel_lotefecha_titlescategories_Gridinternalname);
   }

   public void e121H32( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV43TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.stocksquimicos.tlotprdww", new String[] {}, new String[] {"EmprCod","PrdNum","PrdNom"}) );
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

   public void zm1H329( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -14 )
      {
         Z719PrdNum = A719PrdNum ;
         Z718PrdNom = A718PrdNom ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      AV50Pgmname = "StocksQuimicos.TLOTPRD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50Pgmname", AV50Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      /* Using cursor T01H36 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01H36_A407EmprNom[0] ;
      n407EmprNom = T01H36_n407EmprNom[0] ;
      pr_default.close(4);
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

   public void load1H329( )
   {
      /* Using cursor T01H37 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T01H37_A407EmprNom[0] ;
         n407EmprNom = T01H37_n407EmprNom[0] ;
         zm1H329( -14) ;
      }
      pr_default.close(5);
      onLoadActions1H329( ) ;
   }

   public void onLoadActions1H329( )
   {
   }

   public void checkExtendedTable1H329( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1H329( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1H329( )
   {
      /* Using cursor T01H38 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01H35 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01H35_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01H35_A718PrdNom[0], A718PrdNom) == 0 ) && ( GXutil.strcmp(T01H35_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H329( 14) ;
         RcdFound29 = (short)(1) ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1H329( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1H329( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1H329( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1H329( ) ;
      if ( RcdFound29 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01H39 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01H39_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01H39_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01H39_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( GXutil.strcmp(T01H39_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01H39_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01H39_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01H310 */
      pr_default.execute(8, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01H310_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01H310_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01H310_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( GXutil.strcmp(T01H310_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01H310_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01H310_A718PrdNom[0], A718PrdNom) == 0 ) )
         {
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1H329( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1H329( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PRDNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtPrdNum_Internalname ;
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
               update1H329( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               /* Insert record */
               insert1H329( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PRDNUM");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdNum_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insert1H329( ) ;
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
      if ( isIns( ) || isUpd( ) || isDlt( ) )
      {
         if ( AnyError == 0 )
         {
            httpContext.nUserReturn = (byte)(1) ;
         }
      }
   }

   public void btn_delete( )
   {
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
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

   public void checkOptimisticConcurrency1H329( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01H34 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H329( )
   {
      beforeValidate1H329( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H329( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H329( 0) ;
         checkOptimisticConcurrency1H329( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H329( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H329( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H311 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel1H329( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
                           {
                              if ( AnyError == 0 )
                              {
                                 httpContext.nUserReturn = (byte)(1) ;
                              }
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
         else
         {
            load1H329( ) ;
         }
         endLevel1H329( ) ;
      }
      closeExtendedTableCursors1H329( ) ;
   }

   public void update1H329( )
   {
      beforeValidate1H329( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H329( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H329( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H329( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1H329( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H312 */
                  pr_default.execute(10, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1H329( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1H329( ) ;
                        if ( AnyError == 0 )
                        {
                           if ( isIns( ) || isUpd( ) || isDlt( ) )
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
         endLevel1H329( ) ;
      }
      closeExtendedTableCursors1H329( ) ;
   }

   public void deferredUpdate1H329( )
   {
   }

   public void delete( )
   {
      beforeValidate1H329( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H329( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H329( ) ;
         afterConfirm1H329( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H329( ) ;
            if ( AnyError == 0 )
            {
               scanStart1H31632( ) ;
               while ( RcdFound1632 != 0 )
               {
                  getByPrimaryKey1H31632( ) ;
                  delete1H31632( ) ;
                  scanNext1H31632( ) ;
               }
               scanEnd1H31632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H313 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( AnyError == 0 )
                  {
                     /* Start of After( delete) rules */
                     /* End of After( delete) rules */
                     if ( AnyError == 0 )
                     {
                        if ( isIns( ) || isUpd( ) || isDlt( ) )
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H329( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H329( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01H314 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01H315 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01H316 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01H317 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01H318 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01H319 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01H320 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01H321 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01H322 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01H323 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01H324 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01H325 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01H326 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01H327 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01H328 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01H329 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01H330 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01H331 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01H332 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01H333 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01H334 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01H335 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01H336 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01H337 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01H338 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01H339 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01H340 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01H341 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01H342 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01H343 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01H344 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01H345 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01H346 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01H347 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01H348 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01H349 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01H350 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01H351 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01H352 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01H353 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01H354 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01H355 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01H356 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01H357 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01H358 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01H359 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01H360 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01H361 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01H362 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01H363 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01H364 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01H365 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01H366 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01H367 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01H368 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01H369 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01H370 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01H371 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01H372 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01H373 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01H374 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01H375 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01H376 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01H377 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01H378 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01H379 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01H380 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01H381 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01H382 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01H383 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01H384 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01H385 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
      }
   }

   public void processNestedLevel1H31632( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1H31632( ) ;
         if ( ( nRcdExists_1632 != 0 ) || ( nIsMod_1632 != 0 ) )
         {
            standaloneNotModal1H31632( ) ;
            getKey1H31632( ) ;
            if ( ( nRcdExists_1632 == 0 ) && ( nRcdDeleted_1632 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1H31632( ) ;
            }
            else
            {
               if ( RcdFound1632 != 0 )
               {
                  if ( ( nRcdDeleted_1632 != 0 ) && ( nRcdExists_1632 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1H31632( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1632 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1H31632( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1632 == 0 )
                  {
                     GXCCtl = "LOTEFEC_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtLoteFec_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtLoteFec_Internalname, localUtil.format(A11665LoteFec, "99/99/99")) ;
         httpContext.changePostValue( edtLoteID_Internalname, GXutil.rtrim( A11664LoteID)) ;
         httpContext.changePostValue( edtLoteNEmb_Internalname, GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtLotePed_Internalname, GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( cmbLoteCtf.getInternalname(), GXutil.rtrim( A11667LoteCtf)) ;
         httpContext.changePostValue( cmbLoteCon.getInternalname(), GXutil.rtrim( A11668LoteCon)) ;
         httpContext.changePostValue( edtLoteCtfNm_Internalname, GXutil.rtrim( A11711LoteCtfNm)) ;
         httpContext.changePostValue( edtLoteCtfNF_Internalname, GXutil.rtrim( A12352LoteCtfNF)) ;
         httpContext.changePostValue( "ZT_"+"Z11664LoteID_"+sGXsfl_32_idx, GXutil.rtrim( Z11664LoteID)) ;
         httpContext.changePostValue( "ZT_"+"Z11665LoteFec_"+sGXsfl_32_idx, localUtil.dtoc( Z11665LoteFec, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z11667LoteCtf_"+sGXsfl_32_idx, GXutil.rtrim( Z11667LoteCtf)) ;
         httpContext.changePostValue( "ZT_"+"Z11668LoteCon_"+sGXsfl_32_idx, GXutil.rtrim( Z11668LoteCon)) ;
         httpContext.changePostValue( "ZT_"+"Z11666LotePed_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z14017LoteNEmb_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z11711LoteCtfNm_"+sGXsfl_32_idx, GXutil.rtrim( Z11711LoteCtfNm)) ;
         httpContext.changePostValue( "ZT_"+"Z12352LoteCtfNF_"+sGXsfl_32_idx, GXutil.rtrim( Z12352LoteCtfNF)) ;
         httpContext.changePostValue( "nRcdDeleted_1632_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1632_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1632_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1632 != 0 )
         {
            httpContext.changePostValue( "LOTEFEC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteFec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTEID_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTENEMB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteNEmb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTEPED_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLotePed_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECTF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCtf.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCon.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECTFNM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "LOTECTFNF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNF_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1H31632( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1632 = (short)(0) ;
      nIsMod_1632 = (short)(0) ;
      nRcdDeleted_1632 = (short)(0) ;
   }

   public void processLevel1H329( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1H31632( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1H329( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1H329( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.tlotprd");
         if ( AnyError == 0 )
         {
            confirmValues1H30( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.tlotprd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1H329( )
   {
      /* Scan By routine */
      /* Using cursor T01H386 */
      pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom});
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H329( )
   {
      /* Scan next routine */
      pr_default.readNext(84);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
   }

   public void scanEnd1H329( )
   {
      pr_default.close(84);
   }

   public void afterConfirm1H329( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1H329( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H329( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H329( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H329( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H329( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H329( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1H31632( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11667LoteCtf = T01H33_A11667LoteCtf[0] ;
            Z11668LoteCon = T01H33_A11668LoteCon[0] ;
            Z11666LotePed = T01H33_A11666LotePed[0] ;
            Z14017LoteNEmb = T01H33_A14017LoteNEmb[0] ;
            Z11711LoteCtfNm = T01H33_A11711LoteCtfNm[0] ;
            Z12352LoteCtfNF = T01H33_A12352LoteCtfNF[0] ;
         }
         else
         {
            Z11667LoteCtf = A11667LoteCtf ;
            Z11668LoteCon = A11668LoteCon ;
            Z11666LotePed = A11666LotePed ;
            Z14017LoteNEmb = A14017LoteNEmb ;
            Z11711LoteCtfNm = A11711LoteCtfNm ;
            Z12352LoteCtfNF = A12352LoteCtfNF ;
         }
      }
      if ( GX_JID == -16 )
      {
         Z719PrdNum = A719PrdNum ;
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         Z11667LoteCtf = A11667LoteCtf ;
         Z11668LoteCon = A11668LoteCon ;
         Z11666LotePed = A11666LotePed ;
         Z14017LoteNEmb = A14017LoteNEmb ;
         Z11711LoteCtfNm = A11711LoteCtfNm ;
         Z12352LoteCtfNF = A12352LoteCtfNF ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1H31632( )
   {
      if ( ( AV32LotePed > 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         edtLotePed_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtLotePed_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( AV32LotePed > 0 ) )
      {
         A11665LoteFec = AV33LoteFec ;
      }
   }

   public void standaloneModal1H31632( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         A14017LoteNEmb = AV48LoteNEmb ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         A11666LotePed = AV32LotePed ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A11667LoteCtf)==0) && ( Gx_BScreen == 0 ) )
      {
         A11667LoteCtf = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( isIns( )  && (GXutil.strcmp("", A11668LoteCon)==0) && ( Gx_BScreen == 0 ) )
      {
         A11668LoteCon = httpContext.getMessage( httpContext.getMessage( "N", ""), "") ;
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLoteID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtLoteID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtLoteFec_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtLoteFec_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
      }
   }

   public void load1H31632( )
   {
      /* Using cursor T01H387 */
      pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A11667LoteCtf = T01H387_A11667LoteCtf[0] ;
         A11668LoteCon = T01H387_A11668LoteCon[0] ;
         A11666LotePed = T01H387_A11666LotePed[0] ;
         A14017LoteNEmb = T01H387_A14017LoteNEmb[0] ;
         A11711LoteCtfNm = T01H387_A11711LoteCtfNm[0] ;
         A12352LoteCtfNF = T01H387_A12352LoteCtfNF[0] ;
         zm1H31632( -16) ;
      }
      pr_default.close(85);
      onLoadActions1H31632( ) ;
   }

   public void onLoadActions1H31632( )
   {
   }

   public void checkExtendedTable1H31632( )
   {
      nIsDirty_1632 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal1H31632( ) ;
      if ( ( GXutil.strcmp(A11664LoteID, " ") == 0 ) && true /* After */ )
      {
         GXCCtl = "LOTEID_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "N Lote incorrecto", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLoteID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A11667LoteCtf, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A11667LoteCtf, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         GXCCtl = "LOTECTF_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto,, solo puede ser S o N", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbLoteCtf.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A11668LoteCon, httpContext.getMessage( "S", "")) == 0 ) || ( GXutil.strcmp(A11668LoteCon, httpContext.getMessage( "N", "")) == 0 ) ) )
      {
         GXCCtl = "LOTECON_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Valor incorrecto,, solo puede ser S o N", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = cmbLoteCon.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1H31632( )
   {
   }

   public void enableDisable1H31632( )
   {
   }

   public void getKey1H31632( )
   {
      /* Using cursor T01H388 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1632 = (short)(1) ;
      }
      else
      {
         RcdFound1632 = (short)(0) ;
      }
      pr_default.close(86);
   }

   public void getByPrimaryKey1H31632( )
   {
      /* Using cursor T01H33 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01H33_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01H33_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1H31632( 16) ;
         RcdFound1632 = (short)(1) ;
         initializeNonKey1H31632( ) ;
         A11664LoteID = T01H33_A11664LoteID[0] ;
         A11665LoteFec = T01H33_A11665LoteFec[0] ;
         A11667LoteCtf = T01H33_A11667LoteCtf[0] ;
         A11668LoteCon = T01H33_A11668LoteCon[0] ;
         A11666LotePed = T01H33_A11666LotePed[0] ;
         A14017LoteNEmb = T01H33_A14017LoteNEmb[0] ;
         A11711LoteCtfNm = T01H33_A11711LoteCtfNm[0] ;
         A12352LoteCtfNF = T01H33_A12352LoteCtfNF[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z11664LoteID = A11664LoteID ;
         Z11665LoteFec = A11665LoteFec ;
         sMode1632 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1H31632( ) ;
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1632 = (short)(0) ;
         initializeNonKey1H31632( ) ;
         sMode1632 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1H31632( ) ;
         Gx_mode = sMode1632 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1H31632( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1H31632( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01H32 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11667LoteCtf, T01H32_A11667LoteCtf[0]) != 0 ) || ( GXutil.strcmp(Z11668LoteCon, T01H32_A11668LoteCon[0]) != 0 ) || ( Z11666LotePed != T01H32_A11666LotePed[0] ) || ( Z14017LoteNEmb != T01H32_A14017LoteNEmb[0] ) || ( GXutil.strcmp(Z11711LoteCtfNm, T01H32_A11711LoteCtfNm[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z12352LoteCtfNF, T01H32_A12352LoteCtfNF[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z11667LoteCtf, T01H32_A11667LoteCtf[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.tlotprd:[seudo value changed for attri]"+"LoteCtf");
               GXutil.writeLogRaw("Old: ",Z11667LoteCtf);
               GXutil.writeLogRaw("Current: ",T01H32_A11667LoteCtf[0]);
            }
            if ( GXutil.strcmp(Z11668LoteCon, T01H32_A11668LoteCon[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.tlotprd:[seudo value changed for attri]"+"LoteCon");
               GXutil.writeLogRaw("Old: ",Z11668LoteCon);
               GXutil.writeLogRaw("Current: ",T01H32_A11668LoteCon[0]);
            }
            if ( Z11666LotePed != T01H32_A11666LotePed[0] )
            {
               GXutil.writeLogln("stocksquimicos.tlotprd:[seudo value changed for attri]"+"LotePed");
               GXutil.writeLogRaw("Old: ",Z11666LotePed);
               GXutil.writeLogRaw("Current: ",T01H32_A11666LotePed[0]);
            }
            if ( Z14017LoteNEmb != T01H32_A14017LoteNEmb[0] )
            {
               GXutil.writeLogln("stocksquimicos.tlotprd:[seudo value changed for attri]"+"LoteNEmb");
               GXutil.writeLogRaw("Old: ",Z14017LoteNEmb);
               GXutil.writeLogRaw("Current: ",T01H32_A14017LoteNEmb[0]);
            }
            if ( GXutil.strcmp(Z11711LoteCtfNm, T01H32_A11711LoteCtfNm[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.tlotprd:[seudo value changed for attri]"+"LoteCtfNm");
               GXutil.writeLogRaw("Old: ",Z11711LoteCtfNm);
               GXutil.writeLogRaw("Current: ",T01H32_A11711LoteCtfNm[0]);
            }
            if ( GXutil.strcmp(Z12352LoteCtfNF, T01H32_A12352LoteCtfNF[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.tlotprd:[seudo value changed for attri]"+"LoteCtfNF");
               GXutil.writeLogRaw("Old: ",Z12352LoteCtfNF);
               GXutil.writeLogRaw("Current: ",T01H32_A12352LoteCtfNF[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLOTPRD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1H31632( )
   {
      beforeValidate1H31632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H31632( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1H31632( 0) ;
         checkOptimisticConcurrency1H31632( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1H31632( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1H31632( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01H389 */
                  pr_default.execute(87, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec, A11667LoteCtf, A11668LoteCon, Integer.valueOf(A11666LotePed), Short.valueOf(A14017LoteNEmb), A11711LoteCtfNm, A12352LoteCtfNF, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
                  if ( (pr_default.getStatus(87) == 1) )
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
            load1H31632( ) ;
         }
         endLevel1H31632( ) ;
      }
      closeExtendedTableCursors1H31632( ) ;
   }

   public void update1H31632( )
   {
      beforeValidate1H31632( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1H31632( ) ;
      }
      if ( ( nIsMod_1632 != 0 ) || ( nIsDirty_1632 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1H31632( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1H31632( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1H31632( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01H390 */
                     pr_default.execute(88, new Object[] {A11667LoteCtf, A11668LoteCon, Integer.valueOf(A11666LotePed), Short.valueOf(A14017LoteNEmb), A11711LoteCtfNm, A12352LoteCtfNF, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
                     if ( (pr_default.getStatus(88) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLOTPRD"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1H31632( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1H31632( ) ;
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
            endLevel1H31632( ) ;
         }
      }
      closeExtendedTableCursors1H31632( ) ;
   }

   public void deferredUpdate1H31632( )
   {
   }

   public void delete1H31632( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1H31632( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1H31632( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1H31632( ) ;
         afterConfirm1H31632( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1H31632( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01H391 */
               pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, A11664LoteID, A11665LoteFec});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLOTPRD");
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
      sMode1632 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1H31632( ) ;
      Gx_mode = sMode1632 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1H31632( )
   {
      standaloneModal1H31632( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1H31632( )
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

   public void scanStart1H31632( )
   {
      /* Scan By routine */
      /* Using cursor T01H392 */
      pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A11664LoteID = T01H392_A11664LoteID[0] ;
         A11665LoteFec = T01H392_A11665LoteFec[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1H31632( )
   {
      /* Scan next routine */
      pr_default.readNext(90);
      RcdFound1632 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound1632 = (short)(1) ;
         A11664LoteID = T01H392_A11664LoteID[0] ;
         A11665LoteFec = T01H392_A11665LoteFec[0] ;
      }
   }

   public void scanEnd1H31632( )
   {
      pr_default.close(90);
   }

   public void afterConfirm1H31632( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1H31632( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1H31632( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1H31632( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1H31632( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1H31632( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1H31632( )
   {
      edtLoteFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtLoteID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtLoteNEmb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteNEmb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteNEmb_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtLotePed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      cmbLoteCtf.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCtf.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLoteCtf.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      cmbLoteCon.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCon.getInternalname(), "Enabled", GXutil.ltrimstr( cmbLoteCon.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
      edtLoteCtfNm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNm_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtLoteCtfNF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteCtfNF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteCtfNF_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes1H31632( )
   {
   }

   public void send_integrity_lvl_hashes1H329( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A718PrdNom, ""))));
   }

   public void subsflControlProps_321632( )
   {
      edtLoteFec_Internalname = "LOTEFEC_"+sGXsfl_32_idx ;
      edtLoteID_Internalname = "LOTEID_"+sGXsfl_32_idx ;
      edtLoteNEmb_Internalname = "LOTENEMB_"+sGXsfl_32_idx ;
      edtLotePed_Internalname = "LOTEPED_"+sGXsfl_32_idx ;
      cmbLoteCtf.setInternalname( "LOTECTF_"+sGXsfl_32_idx );
      cmbLoteCon.setInternalname( "LOTECON_"+sGXsfl_32_idx );
      edtLoteCtfNm_Internalname = "LOTECTFNM_"+sGXsfl_32_idx ;
      edtLoteCtfNF_Internalname = "LOTECTFNF_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_321632( )
   {
      edtLoteFec_Internalname = "LOTEFEC_"+sGXsfl_32_fel_idx ;
      edtLoteID_Internalname = "LOTEID_"+sGXsfl_32_fel_idx ;
      edtLoteNEmb_Internalname = "LOTENEMB_"+sGXsfl_32_fel_idx ;
      edtLotePed_Internalname = "LOTEPED_"+sGXsfl_32_fel_idx ;
      cmbLoteCtf.setInternalname( "LOTECTF_"+sGXsfl_32_fel_idx );
      cmbLoteCon.setInternalname( "LOTECON_"+sGXsfl_32_fel_idx );
      edtLoteCtfNm_Internalname = "LOTECTFNM_"+sGXsfl_32_fel_idx ;
      edtLoteCtfNF_Internalname = "LOTECTFNF_"+sGXsfl_32_fel_idx ;
   }

   public void addRow1H31632( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321632( ) ;
      sendRow1H31632( ) ;
   }

   public void sendRow1H31632( )
   {
      Gridlevel_lotefechaRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_lotefecha_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_lotefecha_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_lotefecha_Class, "") != 0 )
         {
            subGridlevel_lotefecha_Linesclass = subGridlevel_lotefecha_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_lotefecha_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_lotefecha_Backstyle = (byte)(0) ;
         subGridlevel_lotefecha_Backcolor = subGridlevel_lotefecha_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_lotefecha_Class, "") != 0 )
         {
            subGridlevel_lotefecha_Linesclass = subGridlevel_lotefecha_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_lotefecha_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_lotefecha_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_lotefecha_Class, "") != 0 )
         {
            subGridlevel_lotefecha_Linesclass = subGridlevel_lotefecha_Class+"Odd" ;
         }
         subGridlevel_lotefecha_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_lotefecha_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_lotefecha_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
         {
            subGridlevel_lotefecha_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lotefecha_Class, "") != 0 )
            {
               subGridlevel_lotefecha_Linesclass = subGridlevel_lotefecha_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_lotefecha_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lotefecha_Class, "") != 0 )
            {
               subGridlevel_lotefecha_Linesclass = subGridlevel_lotefecha_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lotefechaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteFec_Internalname,localUtil.format(A11665LoteFec, "99/99/99"),localUtil.format( A11665LoteFec, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLoteFec_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lotefechaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteID_Internalname,GXutil.rtrim( A11664LoteID),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLoteID_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lotefechaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteNEmb_Internalname,GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtLoteNEmb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14017LoteNEmb), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteNEmb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLoteNEmb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lotefechaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLotePed_Internalname,GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11666LotePed), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLotePed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLotePed_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "LOTECTF_" + sGXsfl_32_idx ;
      cmbLoteCtf.setName( GXCCtl );
      cmbLoteCtf.setWebtags( "" );
      cmbLoteCtf.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbLoteCtf.addItem("N", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbLoteCtf.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11667LoteCtf)==0) )
         {
            A11667LoteCtf = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_lotefechaRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLoteCtf,cmbLoteCtf.getInternalname(),GXutil.rtrim( A11667LoteCtf),Integer.valueOf(1),cmbLoteCtf.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbLoteCtf.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbLoteCtf.setValue( GXutil.rtrim( A11667LoteCtf) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCtf.getInternalname(), "Values", cmbLoteCtf.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      GXCCtl = "LOTECON_" + sGXsfl_32_idx ;
      cmbLoteCon.setName( GXCCtl );
      cmbLoteCon.setWebtags( "" );
      cmbLoteCon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbLoteCon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbLoteCon.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11668LoteCon)==0) )
         {
            A11668LoteCon = httpContext.getMessage( "N", "") ;
         }
      }
      /* ComboBox */
      Gridlevel_lotefechaRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbLoteCon,cmbLoteCon.getInternalname(),GXutil.rtrim( A11668LoteCon),Integer.valueOf(1),cmbLoteCon.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbLoteCon.getEnabled()),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbLoteCon.setValue( GXutil.rtrim( A11668LoteCon) );
      httpContext.ajax_rsp_assign_prop("", false, cmbLoteCon.getInternalname(), "Values", cmbLoteCon.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lotefechaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteCtfNm_Internalname,GXutil.rtrim( A11711LoteCtfNm),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteCtfNm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLoteCtfNm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1632_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_lotefechaRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtLoteCtfNF_Internalname,GXutil.rtrim( A12352LoteCtfNF),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtLoteCtfNF_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtLoteCtfNF_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_lotefechaRow);
      send_integrity_lvl_hashes1H31632( ) ;
      GXCCtl = "Z11664LoteID_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11664LoteID));
      GXCCtl = "Z11665LoteFec_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z11665LoteFec, 0, "/"));
      GXCCtl = "Z11667LoteCtf_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11667LoteCtf));
      GXCCtl = "Z11668LoteCon_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11668LoteCon));
      GXCCtl = "Z11666LotePed_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z11666LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z14017LoteNEmb_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z14017LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z11711LoteCtfNm_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z11711LoteCtfNm));
      GXCCtl = "Z12352LoteCtfNF_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12352LoteCtfNF));
      GXCCtl = "nRcdDeleted_1632_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1632_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1632_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1632, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV43TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV43TrnContext);
      }
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "vLOTEPED_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV32LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vLOTEFEC_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( AV33LoteFec, 0, "/"));
      GXCCtl = "vLOTENEMB_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV48LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTEFEC_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTEID_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTENEMB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteNEmb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTEPED_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLotePed_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTECTF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCtf.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTECON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCon.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTECTFNM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LOTECTFNF_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNF_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_lotefechaContainer.AddRow(Gridlevel_lotefechaRow);
   }

   public void readRow1H31632( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321632( ) ;
      edtLoteFec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTEFEC_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLoteID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTEID_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLoteNEmb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTENEMB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLotePed_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTEPED_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbLoteCtf.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LOTECTF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      cmbLoteCon.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "LOTECON_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      edtLoteCtfNm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTECTFNM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtLoteCtfNF_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "LOTECTFNF_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( localUtil.vcdate( httpContext.cgiGet( edtLoteFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "LOTEFEC_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLoteFec_Internalname ;
         wbErr = true ;
         A11665LoteFec = GXutil.nullDate() ;
      }
      else
      {
         A11665LoteFec = localUtil.ctod( httpContext.cgiGet( edtLoteFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
      }
      A11664LoteID = httpContext.cgiGet( edtLoteID_Internalname) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "LOTENEMB_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLoteNEmb_Internalname ;
         wbErr = true ;
         A14017LoteNEmb = (short)(0) ;
      }
      else
      {
         A14017LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( edtLoteNEmb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "LOTEPED_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtLotePed_Internalname ;
         wbErr = true ;
         A11666LotePed = 0 ;
      }
      else
      {
         A11666LotePed = (int)(localUtil.ctol( httpContext.cgiGet( edtLotePed_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      cmbLoteCtf.setName( cmbLoteCtf.getInternalname() );
      cmbLoteCtf.setValue( httpContext.cgiGet( cmbLoteCtf.getInternalname()) );
      A11667LoteCtf = httpContext.cgiGet( cmbLoteCtf.getInternalname()) ;
      cmbLoteCon.setName( cmbLoteCon.getInternalname() );
      cmbLoteCon.setValue( httpContext.cgiGet( cmbLoteCon.getInternalname()) );
      A11668LoteCon = httpContext.cgiGet( cmbLoteCon.getInternalname()) ;
      A11711LoteCtfNm = httpContext.cgiGet( edtLoteCtfNm_Internalname) ;
      A12352LoteCtfNF = httpContext.cgiGet( edtLoteCtfNF_Internalname) ;
      GXCCtl = "Z11664LoteID_" + sGXsfl_32_idx ;
      Z11664LoteID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11665LoteFec_" + sGXsfl_32_idx ;
      Z11665LoteFec = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z11667LoteCtf_" + sGXsfl_32_idx ;
      Z11667LoteCtf = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11668LoteCon_" + sGXsfl_32_idx ;
      Z11668LoteCon = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z11666LotePed_" + sGXsfl_32_idx ;
      Z11666LotePed = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z14017LoteNEmb_" + sGXsfl_32_idx ;
      Z14017LoteNEmb = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z11711LoteCtfNm_" + sGXsfl_32_idx ;
      Z11711LoteCtfNm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z12352LoteCtfNF_" + sGXsfl_32_idx ;
      Z12352LoteCtfNF = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1632_" + sGXsfl_32_idx ;
      nRcdDeleted_1632 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1632_" + sGXsfl_32_idx ;
      nRcdExists_1632 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1632_" + sGXsfl_32_idx ;
      nIsMod_1632 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtLotePed_Enabled = edtLotePed_Enabled ;
      defedtLoteID_Enabled = edtLoteID_Enabled ;
      defedtLoteFec_Enabled = edtLoteFec_Enabled ;
   }

   public void confirmValues1H30( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321632( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_321632( ) ;
         httpContext.changePostValue( "Z11664LoteID_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11664LoteID_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11664LoteID_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z11665LoteFec_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11665LoteFec_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11665LoteFec_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z11667LoteCtf_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11667LoteCtf_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11667LoteCtf_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z11668LoteCon_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11668LoteCon_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11668LoteCon_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z11666LotePed_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11666LotePed_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11666LotePed_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14017LoteNEmb_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14017LoteNEmb_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14017LoteNEmb_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z11711LoteCtfNm_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z11711LoteCtfNm_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z11711LoteCtfNm_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z12352LoteCtfNF_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z12352LoteCtfNF_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12352LoteCtfNF_"+sGXsfl_32_idx) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.tlotprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(AV32LotePed,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV33LoteFec)),GXutil.URLEncode(GXutil.ltrimstr(AV48LoteNEmb,4,0))}, new String[] {"Gx_mode","EmprCod","PrdNum","PrdNom","LotePed","LoteFec","LoteNEmb"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A719PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A718PrdNom, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TLOTPRD");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\tlotprd:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N396EmprCod", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_N396EmprCod", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV43TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV43TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV43TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV46EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTEPED", GXutil.ltrim( localUtil.ntoc( AV32LotePed, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEPED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32LotePed), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTENEMB", GXutil.ltrim( localUtil.ntoc( AV48LoteNEmb, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTENEMB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48LoteNEmb), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLOTEFEC", localUtil.dtoc( AV33LoteFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLOTEFEC", getSecureSignedToken( "", AV33LoteFec));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Objectcall", GXutil.rtrim( Gridlevel_lotefecha_titlescategories_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Enabled", GXutil.booltostr( Gridlevel_lotefecha_titlescategories_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Gridlevel_lotefecha_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Gridlevel_lotefecha_titlescategories_Gridtitlescategories));
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
      return formatLink("app.stocksquimicos.tlotprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(AV32LotePed,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV33LoteFec)),GXutil.URLEncode(GXutil.ltrimstr(AV48LoteNEmb,4,0))}, new String[] {"Gx_mode","EmprCod","PrdNum","PrdNom","LotePed","LoteFec","LoteNEmb"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.TLOTPRD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "") ;
   }

   public void initializeNonKey1H329( )
   {
   }

   public void initAll1H329( )
   {
      initializeNonKey1H329( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1H31632( )
   {
      A11666LotePed = 0 ;
      A14017LoteNEmb = (short)(0) ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      A11667LoteCtf = httpContext.getMessage( "N", "") ;
      A11668LoteCon = httpContext.getMessage( "N", "") ;
      Z11667LoteCtf = "" ;
      Z11668LoteCon = "" ;
      Z11666LotePed = 0 ;
      Z14017LoteNEmb = (short)(0) ;
      Z11711LoteCtfNm = "" ;
      Z12352LoteCtfNF = "" ;
   }

   public void initAll1H31632( )
   {
      A11664LoteID = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      initializeNonKey1H31632( ) ;
   }

   public void standaloneModalInsert1H31632( )
   {
      A11667LoteCtf = i11667LoteCtf ;
      A11668LoteCon = i11668LoteCon ;
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211663422", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/tlotprd.js", "?20268211663423", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1632( )
   {
      edtLotePed_Enabled = defedtLotePed_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLotePed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLotePed_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtLoteID_Enabled = defedtLoteID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteID_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtLoteFec_Enabled = defedtLoteFec_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtLoteFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtLoteFec_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
   {
      Gridlevel_lotefechaContainer.AddObjectProperty("GridName", "Gridlevel_lotefecha");
      Gridlevel_lotefechaContainer.AddObjectProperty("Header", subGridlevel_lotefecha_Header);
      Gridlevel_lotefechaContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_lotefechaContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_lotefechaContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", localUtil.format(A11665LoteFec, "99/99/99"));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteFec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", GXutil.rtrim( A11664LoteID));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14017LoteNEmb, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteNEmb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11666LotePed, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLotePed_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", GXutil.rtrim( A11667LoteCtf));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCtf.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", GXutil.rtrim( A11668LoteCon));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbLoteCon.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", GXutil.rtrim( A11711LoteCtfNm));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lotefechaColumn.AddObjectProperty("Value", GXutil.rtrim( A12352LoteCtfNF));
      Gridlevel_lotefechaColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtLoteCtfNF_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddColumnProperties(Gridlevel_lotefechaColumn);
      Gridlevel_lotefechaContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lotefechaContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_lotefecha_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtLoteFec_Internalname = "LOTEFEC" ;
      edtLoteID_Internalname = "LOTEID" ;
      edtLoteNEmb_Internalname = "LOTENEMB" ;
      edtLotePed_Internalname = "LOTEPED" ;
      cmbLoteCtf.setInternalname( "LOTECTF" );
      cmbLoteCon.setInternalname( "LOTECON" );
      edtLoteCtfNm_Internalname = "LOTECTFNM" ;
      edtLoteCtfNF_Internalname = "LOTECTFNF" ;
      divTableleaflevel_lotefecha_Internalname = "TABLELEAFLEVEL_LOTEFECHA" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Gridlevel_lotefecha_titlescategories_Internalname = "GRIDLEVEL_LOTEFECHA_TITLESCATEGORIES" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_lotefecha_Internalname = "GRIDLEVEL_LOTEFECHA" ;
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
      subGridlevel_lotefecha_Allowcollapsing = (byte)(0) ;
      subGridlevel_lotefecha_Allowselection = (byte)(0) ;
      subGridlevel_lotefecha_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "") );
      edtLoteCtfNF_Jsonclick = "" ;
      edtLoteCtfNm_Jsonclick = "" ;
      cmbLoteCon.setJsonclick( "" );
      cmbLoteCtf.setJsonclick( "" );
      edtLotePed_Jsonclick = "" ;
      edtLoteNEmb_Jsonclick = "" ;
      edtLoteID_Jsonclick = "" ;
      edtLoteFec_Jsonclick = "" ;
      subGridlevel_lotefecha_Class = "GridNoBorder WorkWith" ;
      subGridlevel_lotefecha_Backcolorstyle = (byte)(0) ;
      edtLoteCtfNF_Enabled = 1 ;
      edtLoteCtfNm_Enabled = 1 ;
      cmbLoteCon.setEnabled( 1 );
      cmbLoteCtf.setEnabled( 1 );
      edtLotePed_Enabled = 1 ;
      edtLoteNEmb_Enabled = 1 ;
      edtLoteID_Enabled = 1 ;
      edtLoteFec_Enabled = 1 ;
      Gridlevel_lotefecha_titlescategories_Gridtitlescategories = ";Lote;Lote;;;;;;" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNom_Enabled = 0 ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Enabled = 0 ;
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

   public void gxnrgridlevel_lotefecha_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_321632( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1H31632( ) ;
         standaloneModal1H31632( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1H31632( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_321632( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_lotefechaContainer)) ;
      /* End function gxnrGridlevel_lotefecha_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "LOTECTF_" + sGXsfl_32_idx ;
      cmbLoteCtf.setName( GXCCtl );
      cmbLoteCtf.setWebtags( "" );
      cmbLoteCtf.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbLoteCtf.addItem("N", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbLoteCtf.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11667LoteCtf)==0) )
         {
            A11667LoteCtf = httpContext.getMessage( "N", "") ;
         }
      }
      GXCCtl = "LOTECON_" + sGXsfl_32_idx ;
      cmbLoteCon.setName( GXCCtl );
      cmbLoteCon.setWebtags( "" );
      cmbLoteCon.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbLoteCon.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbLoteCon.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11668LoteCon)==0) )
         {
            A11668LoteCon = httpContext.getMessage( "N", "") ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'A718PrdNom',fld:'PRDNOM',pic:'',hsh:true},{av:'AV32LotePed',fld:'vLOTEPED',pic:'ZZZZZZZ9',hsh:true},{av:'AV33LoteFec',fld:'vLOTEFEC',pic:'',hsh:true},{av:'AV48LoteNEmb',fld:'vLOTENEMB',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV43TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32LotePed',fld:'vLOTEPED',pic:'ZZZZZZZ9',hsh:true},{av:'AV48LoteNEmb',fld:'vLOTENEMB',pic:'ZZZ9',hsh:true},{av:'AV33LoteFec',fld:'vLOTEFEC',pic:'',hsh:true},{av:'A718PrdNom',fld:'PRDNOM',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121H32',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV43TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_LOTEFEC","{handler:'valid_Lotefec',iparms:[]");
      setEventMetadata("VALID_LOTEFEC",",oparms:[]}");
      setEventMetadata("VALID_LOTEID","{handler:'valid_Loteid',iparms:[]");
      setEventMetadata("VALID_LOTEID",",oparms:[]}");
      setEventMetadata("VALID_LOTECTF","{handler:'valid_Lotectf',iparms:[]");
      setEventMetadata("VALID_LOTECTF",",oparms:[]}");
      setEventMetadata("VALID_LOTECON","{handler:'valid_Lotecon',iparms:[]");
      setEventMetadata("VALID_LOTECON",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Lotectfnf',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOA719PrdNum = "" ;
      wcpOA718PrdNom = "" ;
      wcpOAV33LoteFec = GXutil.nullDate() ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z11664LoteID = "" ;
      Z11665LoteFec = GXutil.nullDate() ;
      Z11667LoteCtf = "" ;
      Z11668LoteCon = "" ;
      Z11711LoteCtfNm = "" ;
      Z12352LoteCtfNF = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      AV33LoteFec = GXutil.nullDate() ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV50Pgmname = "" ;
      ucGridlevel_lotefecha_titlescategories = new com.genexus.webpanels.GXUserControl();
      Gridlevel_lotefechaContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode1632 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      AV46EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Gridlevel_lotefecha_titlescategories_Objectcall = "" ;
      Gridlevel_lotefecha_titlescategories_Class = "" ;
      Gridlevel_lotefecha_titlescategories_Gridinternalname = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode29 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A11665LoteFec = GXutil.nullDate() ;
      A11664LoteID = "" ;
      A11667LoteCtf = "" ;
      A11668LoteCon = "" ;
      A11711LoteCtfNm = "" ;
      A12352LoteCtfNF = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV42WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV43TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV44WebSession = httpContext.getWebSession();
      Z718PrdNom = "" ;
      Z407EmprNom = "" ;
      T01H36_A407EmprNom = new String[] {""} ;
      T01H36_n407EmprNom = new boolean[] {false} ;
      T01H37_A719PrdNum = new String[] {""} ;
      T01H37_n719PrdNum = new boolean[] {false} ;
      T01H37_A718PrdNom = new String[] {""} ;
      T01H37_A407EmprNom = new String[] {""} ;
      T01H37_n407EmprNom = new boolean[] {false} ;
      T01H37_A396EmprCod = new String[] {""} ;
      T01H38_A396EmprCod = new String[] {""} ;
      T01H38_A719PrdNum = new String[] {""} ;
      T01H38_n719PrdNum = new boolean[] {false} ;
      T01H35_A719PrdNum = new String[] {""} ;
      T01H35_n719PrdNum = new boolean[] {false} ;
      T01H35_A718PrdNom = new String[] {""} ;
      T01H35_A396EmprCod = new String[] {""} ;
      T01H39_A396EmprCod = new String[] {""} ;
      T01H39_A719PrdNum = new String[] {""} ;
      T01H39_n719PrdNum = new boolean[] {false} ;
      T01H39_A718PrdNom = new String[] {""} ;
      T01H310_A396EmprCod = new String[] {""} ;
      T01H310_A719PrdNum = new String[] {""} ;
      T01H310_n719PrdNum = new boolean[] {false} ;
      T01H310_A718PrdNom = new String[] {""} ;
      T01H34_A719PrdNum = new String[] {""} ;
      T01H34_n719PrdNum = new boolean[] {false} ;
      T01H34_A718PrdNom = new String[] {""} ;
      T01H34_A396EmprCod = new String[] {""} ;
      T01H314_A396EmprCod = new String[] {""} ;
      T01H314_A719PrdNum = new String[] {""} ;
      T01H314_n719PrdNum = new boolean[] {false} ;
      T01H314_A13217NormaID = new String[] {""} ;
      T01H315_A396EmprCod = new String[] {""} ;
      T01H315_A719PrdNum = new String[] {""} ;
      T01H315_n719PrdNum = new boolean[] {false} ;
      T01H315_A13586TheList = new String[] {""} ;
      T01H316_A396EmprCod = new String[] {""} ;
      T01H316_A5532Lb_numero = new int[1] ;
      T01H316_A5555Lb_opcion = new String[] {""} ;
      T01H316_A13460Lb_linCP = new short[1] ;
      T01H316_A13458Lb_TipCP = new String[] {""} ;
      T01H317_A396EmprCod = new String[] {""} ;
      T01H317_A13418AlbProID = new int[1] ;
      T01H317_A13442AlbProLine = new short[1] ;
      T01H318_A396EmprCod = new String[] {""} ;
      T01H318_A13324LDESID = new int[1] ;
      T01H318_A13333LDESNPeque = new String[] {""} ;
      T01H318_A13337LDESComb = new String[] {""} ;
      T01H318_A13339LDESFondo = new String[] {""} ;
      T01H318_A13342LDESLinea = new short[1] ;
      T01H319_A396EmprCod = new String[] {""} ;
      T01H319_A13312Lb_NLab = new int[1] ;
      T01H319_A13305Lb_IDVeces = new short[1] ;
      T01H319_A13306Lb_LinID = new short[1] ;
      T01H320_A396EmprCod = new String[] {""} ;
      T01H320_A12673LavMqId = new int[1] ;
      T01H320_A12692LavMqLnPq = new short[1] ;
      T01H320_A12681LavMqLn = new short[1] ;
      T01H321_A396EmprCod = new String[] {""} ;
      T01H321_A719PrdNum = new String[] {""} ;
      T01H321_n719PrdNum = new boolean[] {false} ;
      T01H321_A9713Tb1_Cod = new short[1] ;
      T01H322_A396EmprCod = new String[] {""} ;
      T01H322_A12236PrdNumD = new String[] {""} ;
      T01H322_A719PrdNum = new String[] {""} ;
      T01H322_n719PrdNum = new boolean[] {false} ;
      T01H323_A396EmprCod = new String[] {""} ;
      T01H323_A12225DocDisID = new long[1] ;
      T01H323_A12226LinDisID = new short[1] ;
      T01H324_A396EmprCod = new String[] {""} ;
      T01H324_A12225DocDisID = new long[1] ;
      T01H325_A396EmprCod = new String[] {""} ;
      T01H325_A12205OrdenCID = new long[1] ;
      T01H325_A12206OrdenCLnId = new short[1] ;
      T01H326_A396EmprCod = new String[] {""} ;
      T01H326_A4850DevComCod = new int[1] ;
      T01H326_A719PrdNum = new String[] {""} ;
      T01H326_n719PrdNum = new boolean[] {false} ;
      T01H327_A396EmprCod = new String[] {""} ;
      T01H327_A252CliCod = new int[1] ;
      T01H327_A494ForSer = new String[] {""} ;
      T01H327_A482ForColNom = new String[] {""} ;
      T01H327_A483ForColNum = new int[1] ;
      T01H327_A831TipColCod = new byte[1] ;
      T01H327_A3571EnsCod = new String[] {""} ;
      T01H327_A3582EnsLin = new short[1] ;
      T01H328_A396EmprCod = new String[] {""} ;
      T01H328_A129BarCod = new int[1] ;
      T01H328_A132BarCodReo = new byte[1] ;
      T01H328_A130BarCodPar = new String[] {""} ;
      T01H328_A4075recestncol = new byte[1] ;
      T01H328_A4076recestnpro = new byte[1] ;
      T01H328_A4108recestlin = new short[1] ;
      T01H329_A396EmprCod = new String[] {""} ;
      T01H329_A4052EstNumFor = new int[1] ;
      T01H329_A4053EstNumCol = new byte[1] ;
      T01H329_A4090EstEspLin = new byte[1] ;
      T01H330_A396EmprCod = new String[] {""} ;
      T01H330_A4052EstNumFor = new int[1] ;
      T01H330_A4053EstNumCol = new byte[1] ;
      T01H330_A4084EstProLin = new byte[1] ;
      T01H331_A396EmprCod = new String[] {""} ;
      T01H331_A11644TransferId = new long[1] ;
      T01H331_A11653TransferLn = new int[1] ;
      T01H332_A396EmprCod = new String[] {""} ;
      T01H332_A11634TaesId = new String[] {""} ;
      T01H332_A11637TaesLn = new short[1] ;
      T01H332_A11641TaesLnP = new short[1] ;
      T01H333_A396EmprCod = new String[] {""} ;
      T01H333_A719PrdNum = new String[] {""} ;
      T01H333_n719PrdNum = new boolean[] {false} ;
      T01H333_A11329H_stklin = new long[1] ;
      T01H334_A396EmprCod = new String[] {""} ;
      T01H334_A11270Pot_num = new int[1] ;
      T01H334_A11271Pot_lin = new short[1] ;
      T01H335_A396EmprCod = new String[] {""} ;
      T01H335_A719PrdNum = new String[] {""} ;
      T01H335_n719PrdNum = new boolean[] {false} ;
      T01H335_A11199PrdNcasC = new String[] {""} ;
      T01H336_A396EmprCod = new String[] {""} ;
      T01H336_A719PrdNum = new String[] {""} ;
      T01H336_n719PrdNum = new boolean[] {false} ;
      T01H336_A11197CFraseR = new String[] {""} ;
      T01H337_A396EmprCod = new String[] {""} ;
      T01H337_A10243Jt_codigo = new short[1] ;
      T01H337_A10246Jt_ord = new short[1] ;
      T01H338_A396EmprCod = new String[] {""} ;
      T01H338_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01H338_A10238Bny_lin = new short[1] ;
      T01H339_A396EmprCod = new String[] {""} ;
      T01H339_A129BarCod = new int[1] ;
      T01H339_A132BarCodReo = new byte[1] ;
      T01H339_A130BarCodPar = new String[] {""} ;
      T01H339_A758ProCod = new String[] {""} ;
      T01H339_A194BarOrdLin = new short[1] ;
      T01H339_A719PrdNum = new String[] {""} ;
      T01H339_n719PrdNum = new boolean[] {false} ;
      T01H340_A396EmprCod = new String[] {""} ;
      T01H340_A719PrdNum = new String[] {""} ;
      T01H340_n719PrdNum = new boolean[] {false} ;
      T01H340_A9735Cod_Rgo = new String[] {""} ;
      T01H341_A396EmprCod = new String[] {""} ;
      T01H341_A719PrdNum = new String[] {""} ;
      T01H341_n719PrdNum = new boolean[] {false} ;
      T01H341_A9711Ct_codigo = new short[1] ;
      T01H342_A396EmprCod = new String[] {""} ;
      T01H342_A9652OeNum = new long[1] ;
      T01H342_A9653OeHdr = new int[1] ;
      T01H342_A9654OeHdrr = new byte[1] ;
      T01H342_A9655OeHdrp = new String[] {""} ;
      T01H342_A9656OeLinC = new byte[1] ;
      T01H342_A9657OeComb = new String[] {""} ;
      T01H342_A9658Oefondo = new String[] {""} ;
      T01H342_A9659OeMolCil = new byte[1] ;
      T01H342_A9686OePasLin = new short[1] ;
      T01H342_A9694OePasPLi = new short[1] ;
      T01H343_A396EmprCod = new String[] {""} ;
      T01H343_A9652OeNum = new long[1] ;
      T01H343_A9653OeHdr = new int[1] ;
      T01H343_A9654OeHdrr = new byte[1] ;
      T01H343_A9655OeHdrp = new String[] {""} ;
      T01H343_A9656OeLinC = new byte[1] ;
      T01H343_A9657OeComb = new String[] {""} ;
      T01H343_A9658Oefondo = new String[] {""} ;
      T01H343_A9659OeMolCil = new byte[1] ;
      T01H343_A9677OeMolLin = new byte[1] ;
      T01H344_A396EmprCod = new String[] {""} ;
      T01H344_A9578Pas_Num = new int[1] ;
      T01H344_A719PrdNum = new String[] {""} ;
      T01H344_n719PrdNum = new boolean[] {false} ;
      T01H345_A396EmprCod = new String[] {""} ;
      T01H345_A719PrdNum = new String[] {""} ;
      T01H345_n719PrdNum = new boolean[] {false} ;
      T01H345_A8908CC_AlmCod = new byte[1] ;
      T01H346_A396EmprCod = new String[] {""} ;
      T01H346_A719PrdNum = new String[] {""} ;
      T01H346_n719PrdNum = new boolean[] {false} ;
      T01H346_A8661Almc_Ln = new int[1] ;
      T01H347_A396EmprCod = new String[] {""} ;
      T01H347_A719PrdNum = new String[] {""} ;
      T01H347_n719PrdNum = new boolean[] {false} ;
      T01H347_A8648Mat_PrdN = new String[] {""} ;
      T01H348_A396EmprCod = new String[] {""} ;
      T01H348_A8585Pet_cod = new long[1] ;
      T01H348_A719PrdNum = new String[] {""} ;
      T01H348_n719PrdNum = new boolean[] {false} ;
      T01H349_A396EmprCod = new String[] {""} ;
      T01H349_A719PrdNum = new String[] {""} ;
      T01H349_n719PrdNum = new boolean[] {false} ;
      T01H349_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01H350_A396EmprCod = new String[] {""} ;
      T01H350_A719PrdNum = new String[] {""} ;
      T01H350_n719PrdNum = new boolean[] {false} ;
      T01H350_A8366PrdAnyo = new short[1] ;
      T01H350_A8360PrdProv = new int[1] ;
      T01H351_A396EmprCod = new String[] {""} ;
      T01H351_A252CliCod = new int[1] ;
      T01H351_A494ForSer = new String[] {""} ;
      T01H351_A482ForColNom = new String[] {""} ;
      T01H351_A483ForColNum = new int[1] ;
      T01H351_A831TipColCod = new byte[1] ;
      T01H351_A7797Sim_lin = new short[1] ;
      T01H352_A396EmprCod = new String[] {""} ;
      T01H352_A7163Vir_Codigo = new int[1] ;
      T01H352_A719PrdNum = new String[] {""} ;
      T01H352_n719PrdNum = new boolean[] {false} ;
      T01H353_A396EmprCod = new String[] {""} ;
      T01H353_A6310Lb_TaAuxC = new String[] {""} ;
      T01H353_A6313lb_TaAuxL = new short[1] ;
      T01H353_A6378Lb_TauxLP = new short[1] ;
      T01H354_A396EmprCod = new String[] {""} ;
      T01H354_A6290PreCoNum = new int[1] ;
      T01H354_A719PrdNum = new String[] {""} ;
      T01H354_n719PrdNum = new boolean[] {false} ;
      T01H355_A396EmprCod = new String[] {""} ;
      T01H355_A719PrdNum = new String[] {""} ;
      T01H355_n719PrdNum = new boolean[] {false} ;
      T01H355_A6158PrdPrv = new int[1] ;
      T01H356_A396EmprCod = new String[] {""} ;
      T01H356_A719PrdNum = new String[] {""} ;
      T01H356_n719PrdNum = new boolean[] {false} ;
      T01H356_A5973PrdSusNum = new String[] {""} ;
      T01H357_A396EmprCod = new String[] {""} ;
      T01H357_A5612Lb_CodGru = new String[] {""} ;
      T01H357_A5615Lb_LinGru = new short[1] ;
      T01H358_A396EmprCod = new String[] {""} ;
      T01H358_A5532Lb_numero = new int[1] ;
      T01H358_A5555Lb_opcion = new String[] {""} ;
      T01H358_A5560Lb_LineaPr = new short[1] ;
      T01H359_A396EmprCod = new String[] {""} ;
      T01H359_A5532Lb_numero = new int[1] ;
      T01H359_A5555Lb_opcion = new String[] {""} ;
      T01H359_A5557Lb_LineaC = new short[1] ;
      T01H360_A396EmprCod = new String[] {""} ;
      T01H360_A5145SobCod = new int[1] ;
      T01H360_A719PrdNum = new String[] {""} ;
      T01H360_n719PrdNum = new boolean[] {false} ;
      T01H361_A396EmprCod = new String[] {""} ;
      T01H361_A4744RecPreCod = new int[1] ;
      T01H361_A4762RecPreLin = new short[1] ;
      T01H361_A4763RecPreNli = new short[1] ;
      T01H362_A396EmprCod = new String[] {""} ;
      T01H362_A4492HreBarCod = new int[1] ;
      T01H362_A4493HreBarReo = new byte[1] ;
      T01H362_A4494HreBarPar = new String[] {""} ;
      T01H362_A4495HreNumCie = new byte[1] ;
      T01H362_A4545HreLinMaq = new short[1] ;
      T01H362_A4550HreLinPro = new byte[1] ;
      T01H362_A4557HreRecLin = new short[1] ;
      T01H363_A396EmprCod = new String[] {""} ;
      T01H363_A4492HreBarCod = new int[1] ;
      T01H363_A4493HreBarReo = new byte[1] ;
      T01H363_A4494HreBarPar = new String[] {""} ;
      T01H363_A4495HreNumCie = new byte[1] ;
      T01H363_A4508HreLinMAL = new short[1] ;
      T01H363_A4509HreNumAny = new byte[1] ;
      T01H363_A719PrdNum = new String[] {""} ;
      T01H363_n719PrdNum = new boolean[] {false} ;
      T01H364_A396EmprCod = new String[] {""} ;
      T01H364_A252CliCod = new int[1] ;
      T01H364_A4415EstCol = new String[] {""} ;
      T01H364_A4416EstColLin = new short[1] ;
      T01H365_A396EmprCod = new String[] {""} ;
      T01H365_A129BarCod = new int[1] ;
      T01H365_A132BarCodReo = new byte[1] ;
      T01H365_A130BarCodPar = new String[] {""} ;
      T01H365_A2524DisComLin = new byte[1] ;
      T01H365_A1056DisComCod = new String[] {""} ;
      T01H365_A1032FonCod = new String[] {""} ;
      T01H365_A2124RecMolCod = new byte[1] ;
      T01H365_A2672RecPasLin = new short[1] ;
      T01H365_A2675RecPasPLi = new short[1] ;
      T01H366_A396EmprCod = new String[] {""} ;
      T01H366_A129BarCod = new int[1] ;
      T01H366_A132BarCodReo = new byte[1] ;
      T01H366_A130BarCodPar = new String[] {""} ;
      T01H366_A2524DisComLin = new byte[1] ;
      T01H366_A1056DisComCod = new String[] {""} ;
      T01H366_A1032FonCod = new String[] {""} ;
      T01H366_A2124RecMolCod = new byte[1] ;
      T01H366_A2126RecMolLin = new byte[1] ;
      T01H367_A396EmprCod = new String[] {""} ;
      T01H367_A2107PasCod = new String[] {""} ;
      T01H367_A719PrdNum = new String[] {""} ;
      T01H367_n719PrdNum = new boolean[] {false} ;
      T01H368_A396EmprCod = new String[] {""} ;
      T01H368_A2637HisEstHRu = new int[1] ;
      T01H368_A2636HisEstHRe = new byte[1] ;
      T01H368_A2635HisEstHPa = new String[] {""} ;
      T01H368_A2638HisEstLCo = new byte[1] ;
      T01H368_A2630HisEstCom = new String[] {""} ;
      T01H368_A2634HisEstFon = new String[] {""} ;
      T01H368_A719PrdNum = new String[] {""} ;
      T01H368_n719PrdNum = new boolean[] {false} ;
      T01H369_A396EmprCod = new String[] {""} ;
      T01H369_A252CliCod = new int[1] ;
      T01H369_A2141SerEst = new String[] {""} ;
      T01H369_A1013DibCli = new String[] {""} ;
      T01H369_A1014DibInt = new int[1] ;
      T01H369_A2074ColCom = new String[] {""} ;
      T01H369_A2078ColFon = new String[] {""} ;
      T01H369_A2098MolCod = new byte[1] ;
      T01H369_A2535ForPrdLin = new short[1] ;
      T01H370_A396EmprCod = new String[] {""} ;
      T01H370_A719PrdNum = new String[] {""} ;
      T01H370_n719PrdNum = new boolean[] {false} ;
      T01H370_A3342CCStkLin = new long[1] ;
      T01H371_A396EmprCod = new String[] {""} ;
      T01H371_A252CliCod = new int[1] ;
      T01H371_A2891HMaForSer = new String[] {""} ;
      T01H371_A2892HMaForCNom = new String[] {""} ;
      T01H371_A2893HMaForCNum = new int[1] ;
      T01H371_A2894HMaTipCCod = new byte[1] ;
      T01H371_A2895HMaForNumC = new int[1] ;
      T01H371_A2897HMaColLin = new short[1] ;
      T01H371_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H371_A2907HmaLin = new short[1] ;
      T01H372_A396EmprCod = new String[] {""} ;
      T01H372_A129BarCod = new int[1] ;
      T01H372_A132BarCodReo = new byte[1] ;
      T01H372_A130BarCodPar = new String[] {""} ;
      T01H372_A2808RecLinMAL = new short[1] ;
      T01H372_A1377RecNumAny = new byte[1] ;
      T01H372_A719PrdNum = new String[] {""} ;
      T01H372_n719PrdNum = new boolean[] {false} ;
      T01H373_A396EmprCod = new String[] {""} ;
      T01H373_A129BarCod = new int[1] ;
      T01H373_A132BarCodReo = new byte[1] ;
      T01H373_A130BarCodPar = new String[] {""} ;
      T01H373_A2804RecLinMaq = new short[1] ;
      T01H373_A1273RecLinPro = new byte[1] ;
      T01H373_A811RecLin = new short[1] ;
      T01H374_A396EmprCod = new String[] {""} ;
      T01H374_A129BarCod = new int[1] ;
      T01H374_A132BarCodReo = new byte[1] ;
      T01H374_A130BarCodPar = new String[] {""} ;
      T01H374_A2494BarDosPro = new String[] {""} ;
      T01H374_A719PrdNum = new String[] {""} ;
      T01H374_n719PrdNum = new boolean[] {false} ;
      T01H375_A396EmprCod = new String[] {""} ;
      T01H375_A1314EnsLabCod = new int[1] ;
      T01H375_A1317EnsLabLin = new short[1] ;
      T01H376_A396EmprCod = new String[] {""} ;
      T01H376_A910Workstat = new String[] {""} ;
      T01H376_A887EscMLin = new int[1] ;
      T01H377_A396EmprCod = new String[] {""} ;
      T01H377_A859CumCodCont = new int[1] ;
      T01H377_A719PrdNum = new String[] {""} ;
      T01H377_n719PrdNum = new boolean[] {false} ;
      T01H378_A396EmprCod = new String[] {""} ;
      T01H378_A719PrdNum = new String[] {""} ;
      T01H378_n719PrdNum = new boolean[] {false} ;
      T01H378_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H379_A396EmprCod = new String[] {""} ;
      T01H379_A486ForNumCol = new int[1] ;
      T01H379_A715PrdLin = new short[1] ;
      T01H380_A396EmprCod = new String[] {""} ;
      T01H380_A719PrdNum = new String[] {""} ;
      T01H380_n719PrdNum = new boolean[] {false} ;
      T01H380_A681PrdAny = new short[1] ;
      T01H381_A396EmprCod = new String[] {""} ;
      T01H381_A719PrdNum = new String[] {""} ;
      T01H381_n719PrdNum = new boolean[] {false} ;
      T01H381_A688PrdComCod = new String[] {""} ;
      T01H382_A396EmprCod = new String[] {""} ;
      T01H382_A719PrdNum = new String[] {""} ;
      T01H382_n719PrdNum = new boolean[] {false} ;
      T01H382_A680PrdAltNum = new String[] {""} ;
      T01H383_A396EmprCod = new String[] {""} ;
      T01H383_A658PedCod = new int[1] ;
      T01H383_A719PrdNum = new String[] {""} ;
      T01H383_n719PrdNum = new boolean[] {false} ;
      T01H384_A396EmprCod = new String[] {""} ;
      T01H384_A486ForNumCol = new int[1] ;
      T01H384_A309ColLin = new short[1] ;
      T01H385_A396EmprCod = new String[] {""} ;
      T01H385_A719PrdNum = new String[] {""} ;
      T01H385_n719PrdNum = new boolean[] {false} ;
      T01H385_A647NumCon = new int[1] ;
      T01H386_A396EmprCod = new String[] {""} ;
      T01H386_A719PrdNum = new String[] {""} ;
      T01H386_n719PrdNum = new boolean[] {false} ;
      T01H387_A719PrdNum = new String[] {""} ;
      T01H387_n719PrdNum = new boolean[] {false} ;
      T01H387_A11664LoteID = new String[] {""} ;
      T01H387_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H387_A11667LoteCtf = new String[] {""} ;
      T01H387_A11668LoteCon = new String[] {""} ;
      T01H387_A11666LotePed = new int[1] ;
      T01H387_A14017LoteNEmb = new short[1] ;
      T01H387_A11711LoteCtfNm = new String[] {""} ;
      T01H387_A12352LoteCtfNF = new String[] {""} ;
      T01H387_A396EmprCod = new String[] {""} ;
      T01H388_A396EmprCod = new String[] {""} ;
      T01H388_A719PrdNum = new String[] {""} ;
      T01H388_n719PrdNum = new boolean[] {false} ;
      T01H388_A11664LoteID = new String[] {""} ;
      T01H388_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H33_A719PrdNum = new String[] {""} ;
      T01H33_n719PrdNum = new boolean[] {false} ;
      T01H33_A11664LoteID = new String[] {""} ;
      T01H33_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H33_A11667LoteCtf = new String[] {""} ;
      T01H33_A11668LoteCon = new String[] {""} ;
      T01H33_A11666LotePed = new int[1] ;
      T01H33_A14017LoteNEmb = new short[1] ;
      T01H33_A11711LoteCtfNm = new String[] {""} ;
      T01H33_A12352LoteCtfNF = new String[] {""} ;
      T01H33_A396EmprCod = new String[] {""} ;
      T01H32_A719PrdNum = new String[] {""} ;
      T01H32_n719PrdNum = new boolean[] {false} ;
      T01H32_A11664LoteID = new String[] {""} ;
      T01H32_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01H32_A11667LoteCtf = new String[] {""} ;
      T01H32_A11668LoteCon = new String[] {""} ;
      T01H32_A11666LotePed = new int[1] ;
      T01H32_A14017LoteNEmb = new short[1] ;
      T01H32_A11711LoteCtfNm = new String[] {""} ;
      T01H32_A12352LoteCtfNF = new String[] {""} ;
      T01H32_A396EmprCod = new String[] {""} ;
      T01H392_A396EmprCod = new String[] {""} ;
      T01H392_A719PrdNum = new String[] {""} ;
      T01H392_n719PrdNum = new boolean[] {false} ;
      T01H392_A11664LoteID = new String[] {""} ;
      T01H392_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      Gridlevel_lotefechaRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_lotefecha_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11667LoteCtf = "" ;
      i11668LoteCon = "" ;
      Gridlevel_lotefechaColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tlotprd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tlotprd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tlotprd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tlotprd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.tlotprd__default(),
         new Object[] {
             new Object[] {
            T01H32_A719PrdNum, T01H32_A11664LoteID, T01H32_A11665LoteFec, T01H32_A11667LoteCtf, T01H32_A11668LoteCon, T01H32_A11666LotePed, T01H32_A14017LoteNEmb, T01H32_A11711LoteCtfNm, T01H32_A12352LoteCtfNF, T01H32_A396EmprCod
            }
            , new Object[] {
            T01H33_A719PrdNum, T01H33_A11664LoteID, T01H33_A11665LoteFec, T01H33_A11667LoteCtf, T01H33_A11668LoteCon, T01H33_A11666LotePed, T01H33_A14017LoteNEmb, T01H33_A11711LoteCtfNm, T01H33_A12352LoteCtfNF, T01H33_A396EmprCod
            }
            , new Object[] {
            T01H34_A719PrdNum, T01H34_A718PrdNom, T01H34_A396EmprCod
            }
            , new Object[] {
            T01H35_A719PrdNum, T01H35_A718PrdNom, T01H35_A396EmprCod
            }
            , new Object[] {
            T01H36_A407EmprNom, T01H36_n407EmprNom
            }
            , new Object[] {
            T01H37_A719PrdNum, T01H37_A718PrdNom, T01H37_A407EmprNom, T01H37_n407EmprNom, T01H37_A396EmprCod
            }
            , new Object[] {
            T01H38_A396EmprCod, T01H38_A719PrdNum
            }
            , new Object[] {
            T01H39_A396EmprCod, T01H39_A719PrdNum, T01H39_A718PrdNom
            }
            , new Object[] {
            T01H310_A396EmprCod, T01H310_A719PrdNum, T01H310_A718PrdNom
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01H314_A396EmprCod, T01H314_A719PrdNum, T01H314_A13217NormaID
            }
            , new Object[] {
            T01H315_A396EmprCod, T01H315_A719PrdNum, T01H315_A13586TheList
            }
            , new Object[] {
            T01H316_A396EmprCod, T01H316_A5532Lb_numero, T01H316_A5555Lb_opcion, T01H316_A13460Lb_linCP, T01H316_A13458Lb_TipCP
            }
            , new Object[] {
            T01H317_A396EmprCod, T01H317_A13418AlbProID, T01H317_A13442AlbProLine
            }
            , new Object[] {
            T01H318_A396EmprCod, T01H318_A13324LDESID, T01H318_A13333LDESNPeque, T01H318_A13337LDESComb, T01H318_A13339LDESFondo, T01H318_A13342LDESLinea
            }
            , new Object[] {
            T01H319_A396EmprCod, T01H319_A13312Lb_NLab, T01H319_A13305Lb_IDVeces, T01H319_A13306Lb_LinID
            }
            , new Object[] {
            T01H320_A396EmprCod, T01H320_A12673LavMqId, T01H320_A12692LavMqLnPq, T01H320_A12681LavMqLn
            }
            , new Object[] {
            T01H321_A396EmprCod, T01H321_A719PrdNum, T01H321_A9713Tb1_Cod
            }
            , new Object[] {
            T01H322_A396EmprCod, T01H322_A12236PrdNumD, T01H322_A719PrdNum
            }
            , new Object[] {
            T01H323_A396EmprCod, T01H323_A12225DocDisID, T01H323_A12226LinDisID
            }
            , new Object[] {
            T01H324_A396EmprCod, T01H324_A12225DocDisID
            }
            , new Object[] {
            T01H325_A396EmprCod, T01H325_A12205OrdenCID, T01H325_A12206OrdenCLnId
            }
            , new Object[] {
            T01H326_A396EmprCod, T01H326_A4850DevComCod, T01H326_A719PrdNum
            }
            , new Object[] {
            T01H327_A396EmprCod, T01H327_A252CliCod, T01H327_A494ForSer, T01H327_A482ForColNom, T01H327_A483ForColNum, T01H327_A831TipColCod, T01H327_A3571EnsCod, T01H327_A3582EnsLin
            }
            , new Object[] {
            T01H328_A396EmprCod, T01H328_A129BarCod, T01H328_A132BarCodReo, T01H328_A130BarCodPar, T01H328_A4075recestncol, T01H328_A4076recestnpro, T01H328_A4108recestlin
            }
            , new Object[] {
            T01H329_A396EmprCod, T01H329_A4052EstNumFor, T01H329_A4053EstNumCol, T01H329_A4090EstEspLin
            }
            , new Object[] {
            T01H330_A396EmprCod, T01H330_A4052EstNumFor, T01H330_A4053EstNumCol, T01H330_A4084EstProLin
            }
            , new Object[] {
            T01H331_A396EmprCod, T01H331_A11644TransferId, T01H331_A11653TransferLn
            }
            , new Object[] {
            T01H332_A396EmprCod, T01H332_A11634TaesId, T01H332_A11637TaesLn, T01H332_A11641TaesLnP
            }
            , new Object[] {
            T01H333_A396EmprCod, T01H333_A719PrdNum, T01H333_A11329H_stklin
            }
            , new Object[] {
            T01H334_A396EmprCod, T01H334_A11270Pot_num, T01H334_A11271Pot_lin
            }
            , new Object[] {
            T01H335_A396EmprCod, T01H335_A719PrdNum, T01H335_A11199PrdNcasC
            }
            , new Object[] {
            T01H336_A396EmprCod, T01H336_A719PrdNum, T01H336_A11197CFraseR
            }
            , new Object[] {
            T01H337_A396EmprCod, T01H337_A10243Jt_codigo, T01H337_A10246Jt_ord
            }
            , new Object[] {
            T01H338_A396EmprCod, T01H338_A10236Bny_dia, T01H338_A10238Bny_lin
            }
            , new Object[] {
            T01H339_A396EmprCod, T01H339_A129BarCod, T01H339_A132BarCodReo, T01H339_A130BarCodPar, T01H339_A758ProCod, T01H339_A194BarOrdLin, T01H339_A719PrdNum
            }
            , new Object[] {
            T01H340_A396EmprCod, T01H340_A719PrdNum, T01H340_A9735Cod_Rgo
            }
            , new Object[] {
            T01H341_A396EmprCod, T01H341_A719PrdNum, T01H341_A9711Ct_codigo
            }
            , new Object[] {
            T01H342_A396EmprCod, T01H342_A9652OeNum, T01H342_A9653OeHdr, T01H342_A9654OeHdrr, T01H342_A9655OeHdrp, T01H342_A9656OeLinC, T01H342_A9657OeComb, T01H342_A9658Oefondo, T01H342_A9659OeMolCil, T01H342_A9686OePasLin,
            T01H342_A9694OePasPLi
            }
            , new Object[] {
            T01H343_A396EmprCod, T01H343_A9652OeNum, T01H343_A9653OeHdr, T01H343_A9654OeHdrr, T01H343_A9655OeHdrp, T01H343_A9656OeLinC, T01H343_A9657OeComb, T01H343_A9658Oefondo, T01H343_A9659OeMolCil, T01H343_A9677OeMolLin
            }
            , new Object[] {
            T01H344_A396EmprCod, T01H344_A9578Pas_Num, T01H344_A719PrdNum
            }
            , new Object[] {
            T01H345_A396EmprCod, T01H345_A719PrdNum, T01H345_A8908CC_AlmCod
            }
            , new Object[] {
            T01H346_A396EmprCod, T01H346_A719PrdNum, T01H346_A8661Almc_Ln
            }
            , new Object[] {
            T01H347_A396EmprCod, T01H347_A719PrdNum, T01H347_A8648Mat_PrdN
            }
            , new Object[] {
            T01H348_A396EmprCod, T01H348_A8585Pet_cod, T01H348_A719PrdNum
            }
            , new Object[] {
            T01H349_A396EmprCod, T01H349_A719PrdNum, T01H349_A8577RecFecHr
            }
            , new Object[] {
            T01H350_A396EmprCod, T01H350_A719PrdNum, T01H350_A8366PrdAnyo, T01H350_A8360PrdProv
            }
            , new Object[] {
            T01H351_A396EmprCod, T01H351_A252CliCod, T01H351_A494ForSer, T01H351_A482ForColNom, T01H351_A483ForColNum, T01H351_A831TipColCod, T01H351_A7797Sim_lin
            }
            , new Object[] {
            T01H352_A396EmprCod, T01H352_A7163Vir_Codigo, T01H352_A719PrdNum
            }
            , new Object[] {
            T01H353_A396EmprCod, T01H353_A6310Lb_TaAuxC, T01H353_A6313lb_TaAuxL, T01H353_A6378Lb_TauxLP
            }
            , new Object[] {
            T01H354_A396EmprCod, T01H354_A6290PreCoNum, T01H354_A719PrdNum
            }
            , new Object[] {
            T01H355_A396EmprCod, T01H355_A719PrdNum, T01H355_A6158PrdPrv
            }
            , new Object[] {
            T01H356_A396EmprCod, T01H356_A719PrdNum, T01H356_A5973PrdSusNum
            }
            , new Object[] {
            T01H357_A396EmprCod, T01H357_A5612Lb_CodGru, T01H357_A5615Lb_LinGru
            }
            , new Object[] {
            T01H358_A396EmprCod, T01H358_A5532Lb_numero, T01H358_A5555Lb_opcion, T01H358_A5560Lb_LineaPr
            }
            , new Object[] {
            T01H359_A396EmprCod, T01H359_A5532Lb_numero, T01H359_A5555Lb_opcion, T01H359_A5557Lb_LineaC
            }
            , new Object[] {
            T01H360_A396EmprCod, T01H360_A5145SobCod, T01H360_A719PrdNum
            }
            , new Object[] {
            T01H361_A396EmprCod, T01H361_A4744RecPreCod, T01H361_A4762RecPreLin, T01H361_A4763RecPreNli
            }
            , new Object[] {
            T01H362_A396EmprCod, T01H362_A4492HreBarCod, T01H362_A4493HreBarReo, T01H362_A4494HreBarPar, T01H362_A4495HreNumCie, T01H362_A4545HreLinMaq, T01H362_A4550HreLinPro, T01H362_A4557HreRecLin
            }
            , new Object[] {
            T01H363_A396EmprCod, T01H363_A4492HreBarCod, T01H363_A4493HreBarReo, T01H363_A4494HreBarPar, T01H363_A4495HreNumCie, T01H363_A4508HreLinMAL, T01H363_A4509HreNumAny, T01H363_A719PrdNum
            }
            , new Object[] {
            T01H364_A396EmprCod, T01H364_A252CliCod, T01H364_A4415EstCol, T01H364_A4416EstColLin
            }
            , new Object[] {
            T01H365_A396EmprCod, T01H365_A129BarCod, T01H365_A132BarCodReo, T01H365_A130BarCodPar, T01H365_A2524DisComLin, T01H365_A1056DisComCod, T01H365_A1032FonCod, T01H365_A2124RecMolCod, T01H365_A2672RecPasLin, T01H365_A2675RecPasPLi
            }
            , new Object[] {
            T01H366_A396EmprCod, T01H366_A129BarCod, T01H366_A132BarCodReo, T01H366_A130BarCodPar, T01H366_A2524DisComLin, T01H366_A1056DisComCod, T01H366_A1032FonCod, T01H366_A2124RecMolCod, T01H366_A2126RecMolLin
            }
            , new Object[] {
            T01H367_A396EmprCod, T01H367_A2107PasCod, T01H367_A719PrdNum
            }
            , new Object[] {
            T01H368_A396EmprCod, T01H368_A2637HisEstHRu, T01H368_A2636HisEstHRe, T01H368_A2635HisEstHPa, T01H368_A2638HisEstLCo, T01H368_A2630HisEstCom, T01H368_A2634HisEstFon, T01H368_A719PrdNum
            }
            , new Object[] {
            T01H369_A396EmprCod, T01H369_A252CliCod, T01H369_A2141SerEst, T01H369_A1013DibCli, T01H369_A1014DibInt, T01H369_A2074ColCom, T01H369_A2078ColFon, T01H369_A2098MolCod, T01H369_A2535ForPrdLin
            }
            , new Object[] {
            T01H370_A396EmprCod, T01H370_A719PrdNum, T01H370_A3342CCStkLin
            }
            , new Object[] {
            T01H371_A396EmprCod, T01H371_A252CliCod, T01H371_A2891HMaForSer, T01H371_A2892HMaForCNom, T01H371_A2893HMaForCNum, T01H371_A2894HMaTipCCod, T01H371_A2895HMaForNumC, T01H371_A2897HMaColLin, T01H371_A2896HMaFec, T01H371_A2907HmaLin
            }
            , new Object[] {
            T01H372_A396EmprCod, T01H372_A129BarCod, T01H372_A132BarCodReo, T01H372_A130BarCodPar, T01H372_A2808RecLinMAL, T01H372_A1377RecNumAny, T01H372_A719PrdNum
            }
            , new Object[] {
            T01H373_A396EmprCod, T01H373_A129BarCod, T01H373_A132BarCodReo, T01H373_A130BarCodPar, T01H373_A2804RecLinMaq, T01H373_A1273RecLinPro, T01H373_A811RecLin
            }
            , new Object[] {
            T01H374_A396EmprCod, T01H374_A129BarCod, T01H374_A132BarCodReo, T01H374_A130BarCodPar, T01H374_A2494BarDosPro, T01H374_A719PrdNum
            }
            , new Object[] {
            T01H375_A396EmprCod, T01H375_A1314EnsLabCod, T01H375_A1317EnsLabLin
            }
            , new Object[] {
            T01H376_A396EmprCod, T01H376_A910Workstat, T01H376_A887EscMLin
            }
            , new Object[] {
            T01H377_A396EmprCod, T01H377_A859CumCodCont, T01H377_A719PrdNum
            }
            , new Object[] {
            T01H378_A396EmprCod, T01H378_A719PrdNum, T01H378_A810RecFec
            }
            , new Object[] {
            T01H379_A396EmprCod, T01H379_A486ForNumCol, T01H379_A715PrdLin
            }
            , new Object[] {
            T01H380_A396EmprCod, T01H380_A719PrdNum, T01H380_A681PrdAny
            }
            , new Object[] {
            T01H381_A396EmprCod, T01H381_A719PrdNum, T01H381_A688PrdComCod
            }
            , new Object[] {
            T01H382_A396EmprCod, T01H382_A719PrdNum, T01H382_A680PrdAltNum
            }
            , new Object[] {
            T01H383_A396EmprCod, T01H383_A658PedCod, T01H383_A719PrdNum
            }
            , new Object[] {
            T01H384_A396EmprCod, T01H384_A486ForNumCol, T01H384_A309ColLin
            }
            , new Object[] {
            T01H385_A396EmprCod, T01H385_A719PrdNum, T01H385_A647NumCon
            }
            , new Object[] {
            T01H386_A396EmprCod, T01H386_A719PrdNum
            }
            , new Object[] {
            T01H387_A719PrdNum, T01H387_A11664LoteID, T01H387_A11665LoteFec, T01H387_A11667LoteCtf, T01H387_A11668LoteCon, T01H387_A11666LotePed, T01H387_A14017LoteNEmb, T01H387_A11711LoteCtfNm, T01H387_A12352LoteCtfNF, T01H387_A396EmprCod
            }
            , new Object[] {
            T01H388_A396EmprCod, T01H388_A719PrdNum, T01H388_A11664LoteID, T01H388_A11665LoteFec
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01H392_A396EmprCod, T01H392_A719PrdNum, T01H392_A11664LoteID, T01H392_A11665LoteFec
            }
         }
      );
      Z718PrdNom = "" ;
      A718PrdNom = "" ;
      Z719PrdNum = "" ;
      n719PrdNum = false ;
      A719PrdNum = "" ;
      n719PrdNum = false ;
      Z396EmprCod = "" ;
      N396EmprCod = "" ;
      A396EmprCod = "" ;
      AV50Pgmname = "StocksQuimicos.TLOTPRD" ;
      Z11668LoteCon = httpContext.getMessage( "N", "") ;
      A11668LoteCon = httpContext.getMessage( "N", "") ;
      i11668LoteCon = httpContext.getMessage( "N", "") ;
      Z11667LoteCtf = httpContext.getMessage( "N", "") ;
      A11667LoteCtf = httpContext.getMessage( "N", "") ;
      i11667LoteCtf = httpContext.getMessage( "N", "") ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_lotefecha_Backcolorstyle ;
   private byte subGridlevel_lotefecha_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_lotefecha_Allowselection ;
   private byte subGridlevel_lotefecha_Allowhovering ;
   private byte subGridlevel_lotefecha_Allowcollapsing ;
   private byte subGridlevel_lotefecha_Collapsed ;
   private short wcpOAV48LoteNEmb ;
   private short Z14017LoteNEmb ;
   private short nRcdDeleted_1632 ;
   private short nRcdExists_1632 ;
   private short nIsMod_1632 ;
   private short AV48LoteNEmb ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1632 ;
   private short RcdFound1632 ;
   private short nBlankRcdUsr1632 ;
   private short RcdFound29 ;
   private short A14017LoteNEmb ;
   private short nIsDirty_29 ;
   private short nIsDirty_1632 ;
   private int wcpOAV32LotePed ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int Z11666LotePed ;
   private int AV32LotePed ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtLoteFec_Enabled ;
   private int edtLoteID_Enabled ;
   private int edtLoteNEmb_Enabled ;
   private int edtLotePed_Enabled ;
   private int edtLoteCtfNm_Enabled ;
   private int edtLoteCtfNF_Enabled ;
   private int fRowAdded ;
   private int A11666LotePed ;
   private int GX_JID ;
   private int subGridlevel_lotefecha_Backcolor ;
   private int subGridlevel_lotefecha_Allbackcolor ;
   private int defedtLotePed_Enabled ;
   private int defedtLoteID_Enabled ;
   private int defedtLoteFec_Enabled ;
   private int idxLst ;
   private int subGridlevel_lotefecha_Selectedindex ;
   private int subGridlevel_lotefecha_Selectioncolor ;
   private int subGridlevel_lotefecha_Hoveringcolor ;
   private long GRIDLEVEL_LOTEFECHA_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOA396EmprCod ;
   private String wcpOA719PrdNum ;
   private String wcpOA718PrdNom ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String N396EmprCod ;
   private String Z11664LoteID ;
   private String Z11667LoteCtf ;
   private String Z11668LoteCon ;
   private String Z11711LoteCtfNm ;
   private String Z12352LoteCtfNF ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String A718PrdNom ;
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
   private String edtPrdNum_Internalname ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String edtPrdNom_Jsonclick ;
   private String divTableleaflevel_lotefecha_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV50Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridlevel_lotefecha_titlescategories_Gridtitlescategories ;
   private String Gridlevel_lotefecha_titlescategories_Internalname ;
   private String sMode1632 ;
   private String edtLoteFec_Internalname ;
   private String edtLoteID_Internalname ;
   private String edtLoteNEmb_Internalname ;
   private String edtLotePed_Internalname ;
   private String edtLoteCtfNm_Internalname ;
   private String edtLoteCtfNF_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_lotefecha_Internalname ;
   private String AV46EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Gridlevel_lotefecha_titlescategories_Objectcall ;
   private String Gridlevel_lotefecha_titlescategories_Class ;
   private String Gridlevel_lotefecha_titlescategories_Gridinternalname ;
   private String hsh ;
   private String sMode29 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A11664LoteID ;
   private String A11667LoteCtf ;
   private String A11668LoteCon ;
   private String A11711LoteCtfNm ;
   private String A12352LoteCtfNF ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z718PrdNom ;
   private String Z407EmprNom ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_lotefecha_Class ;
   private String subGridlevel_lotefecha_Linesclass ;
   private String ROClassString ;
   private String edtLoteFec_Jsonclick ;
   private String edtLoteID_Jsonclick ;
   private String edtLoteNEmb_Jsonclick ;
   private String edtLotePed_Jsonclick ;
   private String edtLoteCtfNm_Jsonclick ;
   private String edtLoteCtfNF_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11667LoteCtf ;
   private String i11668LoteCon ;
   private String subGridlevel_lotefecha_Header ;
   private java.util.Date wcpOAV33LoteFec ;
   private java.util.Date Z11665LoteFec ;
   private java.util.Date AV33LoteFec ;
   private java.util.Date A11665LoteFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n719PrdNum ;
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
   private boolean Gridlevel_lotefecha_titlescategories_Enabled ;
   private boolean Gridlevel_lotefecha_titlescategories_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_lotefechaContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_lotefechaRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_lotefechaColumn ;
   private com.genexus.webpanels.WebSession AV44WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucGridlevel_lotefecha_titlescategories ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbLoteCtf ;
   private HTMLChoice cmbLoteCon ;
   private IDataStoreProvider pr_default ;
   private String[] T01H36_A407EmprNom ;
   private boolean[] T01H36_n407EmprNom ;
   private String[] T01H37_A719PrdNum ;
   private boolean[] T01H37_n719PrdNum ;
   private String[] T01H37_A718PrdNom ;
   private String[] T01H37_A407EmprNom ;
   private boolean[] T01H37_n407EmprNom ;
   private String[] T01H37_A396EmprCod ;
   private String[] T01H38_A396EmprCod ;
   private String[] T01H38_A719PrdNum ;
   private boolean[] T01H38_n719PrdNum ;
   private String[] T01H35_A719PrdNum ;
   private boolean[] T01H35_n719PrdNum ;
   private String[] T01H35_A718PrdNom ;
   private String[] T01H35_A396EmprCod ;
   private String[] T01H39_A396EmprCod ;
   private String[] T01H39_A719PrdNum ;
   private boolean[] T01H39_n719PrdNum ;
   private String[] T01H39_A718PrdNom ;
   private String[] T01H310_A396EmprCod ;
   private String[] T01H310_A719PrdNum ;
   private boolean[] T01H310_n719PrdNum ;
   private String[] T01H310_A718PrdNom ;
   private String[] T01H34_A719PrdNum ;
   private boolean[] T01H34_n719PrdNum ;
   private String[] T01H34_A718PrdNom ;
   private String[] T01H34_A396EmprCod ;
   private String[] T01H314_A396EmprCod ;
   private String[] T01H314_A719PrdNum ;
   private boolean[] T01H314_n719PrdNum ;
   private String[] T01H314_A13217NormaID ;
   private String[] T01H315_A396EmprCod ;
   private String[] T01H315_A719PrdNum ;
   private boolean[] T01H315_n719PrdNum ;
   private String[] T01H315_A13586TheList ;
   private String[] T01H316_A396EmprCod ;
   private int[] T01H316_A5532Lb_numero ;
   private String[] T01H316_A5555Lb_opcion ;
   private short[] T01H316_A13460Lb_linCP ;
   private String[] T01H316_A13458Lb_TipCP ;
   private String[] T01H317_A396EmprCod ;
   private int[] T01H317_A13418AlbProID ;
   private short[] T01H317_A13442AlbProLine ;
   private String[] T01H318_A396EmprCod ;
   private int[] T01H318_A13324LDESID ;
   private String[] T01H318_A13333LDESNPeque ;
   private String[] T01H318_A13337LDESComb ;
   private String[] T01H318_A13339LDESFondo ;
   private short[] T01H318_A13342LDESLinea ;
   private String[] T01H319_A396EmprCod ;
   private int[] T01H319_A13312Lb_NLab ;
   private short[] T01H319_A13305Lb_IDVeces ;
   private short[] T01H319_A13306Lb_LinID ;
   private String[] T01H320_A396EmprCod ;
   private int[] T01H320_A12673LavMqId ;
   private short[] T01H320_A12692LavMqLnPq ;
   private short[] T01H320_A12681LavMqLn ;
   private String[] T01H321_A396EmprCod ;
   private String[] T01H321_A719PrdNum ;
   private boolean[] T01H321_n719PrdNum ;
   private short[] T01H321_A9713Tb1_Cod ;
   private String[] T01H322_A396EmprCod ;
   private String[] T01H322_A12236PrdNumD ;
   private String[] T01H322_A719PrdNum ;
   private boolean[] T01H322_n719PrdNum ;
   private String[] T01H323_A396EmprCod ;
   private long[] T01H323_A12225DocDisID ;
   private short[] T01H323_A12226LinDisID ;
   private String[] T01H324_A396EmprCod ;
   private long[] T01H324_A12225DocDisID ;
   private String[] T01H325_A396EmprCod ;
   private long[] T01H325_A12205OrdenCID ;
   private short[] T01H325_A12206OrdenCLnId ;
   private String[] T01H326_A396EmprCod ;
   private int[] T01H326_A4850DevComCod ;
   private String[] T01H326_A719PrdNum ;
   private boolean[] T01H326_n719PrdNum ;
   private String[] T01H327_A396EmprCod ;
   private int[] T01H327_A252CliCod ;
   private String[] T01H327_A494ForSer ;
   private String[] T01H327_A482ForColNom ;
   private int[] T01H327_A483ForColNum ;
   private byte[] T01H327_A831TipColCod ;
   private String[] T01H327_A3571EnsCod ;
   private short[] T01H327_A3582EnsLin ;
   private String[] T01H328_A396EmprCod ;
   private int[] T01H328_A129BarCod ;
   private byte[] T01H328_A132BarCodReo ;
   private String[] T01H328_A130BarCodPar ;
   private byte[] T01H328_A4075recestncol ;
   private byte[] T01H328_A4076recestnpro ;
   private short[] T01H328_A4108recestlin ;
   private String[] T01H329_A396EmprCod ;
   private int[] T01H329_A4052EstNumFor ;
   private byte[] T01H329_A4053EstNumCol ;
   private byte[] T01H329_A4090EstEspLin ;
   private String[] T01H330_A396EmprCod ;
   private int[] T01H330_A4052EstNumFor ;
   private byte[] T01H330_A4053EstNumCol ;
   private byte[] T01H330_A4084EstProLin ;
   private String[] T01H331_A396EmprCod ;
   private long[] T01H331_A11644TransferId ;
   private int[] T01H331_A11653TransferLn ;
   private String[] T01H332_A396EmprCod ;
   private String[] T01H332_A11634TaesId ;
   private short[] T01H332_A11637TaesLn ;
   private short[] T01H332_A11641TaesLnP ;
   private String[] T01H333_A396EmprCod ;
   private String[] T01H333_A719PrdNum ;
   private boolean[] T01H333_n719PrdNum ;
   private long[] T01H333_A11329H_stklin ;
   private String[] T01H334_A396EmprCod ;
   private int[] T01H334_A11270Pot_num ;
   private short[] T01H334_A11271Pot_lin ;
   private String[] T01H335_A396EmprCod ;
   private String[] T01H335_A719PrdNum ;
   private boolean[] T01H335_n719PrdNum ;
   private String[] T01H335_A11199PrdNcasC ;
   private String[] T01H336_A396EmprCod ;
   private String[] T01H336_A719PrdNum ;
   private boolean[] T01H336_n719PrdNum ;
   private String[] T01H336_A11197CFraseR ;
   private String[] T01H337_A396EmprCod ;
   private short[] T01H337_A10243Jt_codigo ;
   private short[] T01H337_A10246Jt_ord ;
   private String[] T01H338_A396EmprCod ;
   private java.util.Date[] T01H338_A10236Bny_dia ;
   private short[] T01H338_A10238Bny_lin ;
   private String[] T01H339_A396EmprCod ;
   private int[] T01H339_A129BarCod ;
   private byte[] T01H339_A132BarCodReo ;
   private String[] T01H339_A130BarCodPar ;
   private String[] T01H339_A758ProCod ;
   private short[] T01H339_A194BarOrdLin ;
   private String[] T01H339_A719PrdNum ;
   private boolean[] T01H339_n719PrdNum ;
   private String[] T01H340_A396EmprCod ;
   private String[] T01H340_A719PrdNum ;
   private boolean[] T01H340_n719PrdNum ;
   private String[] T01H340_A9735Cod_Rgo ;
   private String[] T01H341_A396EmprCod ;
   private String[] T01H341_A719PrdNum ;
   private boolean[] T01H341_n719PrdNum ;
   private short[] T01H341_A9711Ct_codigo ;
   private String[] T01H342_A396EmprCod ;
   private long[] T01H342_A9652OeNum ;
   private int[] T01H342_A9653OeHdr ;
   private byte[] T01H342_A9654OeHdrr ;
   private String[] T01H342_A9655OeHdrp ;
   private byte[] T01H342_A9656OeLinC ;
   private String[] T01H342_A9657OeComb ;
   private String[] T01H342_A9658Oefondo ;
   private byte[] T01H342_A9659OeMolCil ;
   private short[] T01H342_A9686OePasLin ;
   private short[] T01H342_A9694OePasPLi ;
   private String[] T01H343_A396EmprCod ;
   private long[] T01H343_A9652OeNum ;
   private int[] T01H343_A9653OeHdr ;
   private byte[] T01H343_A9654OeHdrr ;
   private String[] T01H343_A9655OeHdrp ;
   private byte[] T01H343_A9656OeLinC ;
   private String[] T01H343_A9657OeComb ;
   private String[] T01H343_A9658Oefondo ;
   private byte[] T01H343_A9659OeMolCil ;
   private byte[] T01H343_A9677OeMolLin ;
   private String[] T01H344_A396EmprCod ;
   private int[] T01H344_A9578Pas_Num ;
   private String[] T01H344_A719PrdNum ;
   private boolean[] T01H344_n719PrdNum ;
   private String[] T01H345_A396EmprCod ;
   private String[] T01H345_A719PrdNum ;
   private boolean[] T01H345_n719PrdNum ;
   private byte[] T01H345_A8908CC_AlmCod ;
   private String[] T01H346_A396EmprCod ;
   private String[] T01H346_A719PrdNum ;
   private boolean[] T01H346_n719PrdNum ;
   private int[] T01H346_A8661Almc_Ln ;
   private String[] T01H347_A396EmprCod ;
   private String[] T01H347_A719PrdNum ;
   private boolean[] T01H347_n719PrdNum ;
   private String[] T01H347_A8648Mat_PrdN ;
   private String[] T01H348_A396EmprCod ;
   private long[] T01H348_A8585Pet_cod ;
   private String[] T01H348_A719PrdNum ;
   private boolean[] T01H348_n719PrdNum ;
   private String[] T01H349_A396EmprCod ;
   private String[] T01H349_A719PrdNum ;
   private boolean[] T01H349_n719PrdNum ;
   private java.util.Date[] T01H349_A8577RecFecHr ;
   private String[] T01H350_A396EmprCod ;
   private String[] T01H350_A719PrdNum ;
   private boolean[] T01H350_n719PrdNum ;
   private short[] T01H350_A8366PrdAnyo ;
   private int[] T01H350_A8360PrdProv ;
   private String[] T01H351_A396EmprCod ;
   private int[] T01H351_A252CliCod ;
   private String[] T01H351_A494ForSer ;
   private String[] T01H351_A482ForColNom ;
   private int[] T01H351_A483ForColNum ;
   private byte[] T01H351_A831TipColCod ;
   private short[] T01H351_A7797Sim_lin ;
   private String[] T01H352_A396EmprCod ;
   private int[] T01H352_A7163Vir_Codigo ;
   private String[] T01H352_A719PrdNum ;
   private boolean[] T01H352_n719PrdNum ;
   private String[] T01H353_A396EmprCod ;
   private String[] T01H353_A6310Lb_TaAuxC ;
   private short[] T01H353_A6313lb_TaAuxL ;
   private short[] T01H353_A6378Lb_TauxLP ;
   private String[] T01H354_A396EmprCod ;
   private int[] T01H354_A6290PreCoNum ;
   private String[] T01H354_A719PrdNum ;
   private boolean[] T01H354_n719PrdNum ;
   private String[] T01H355_A396EmprCod ;
   private String[] T01H355_A719PrdNum ;
   private boolean[] T01H355_n719PrdNum ;
   private int[] T01H355_A6158PrdPrv ;
   private String[] T01H356_A396EmprCod ;
   private String[] T01H356_A719PrdNum ;
   private boolean[] T01H356_n719PrdNum ;
   private String[] T01H356_A5973PrdSusNum ;
   private String[] T01H357_A396EmprCod ;
   private String[] T01H357_A5612Lb_CodGru ;
   private short[] T01H357_A5615Lb_LinGru ;
   private String[] T01H358_A396EmprCod ;
   private int[] T01H358_A5532Lb_numero ;
   private String[] T01H358_A5555Lb_opcion ;
   private short[] T01H358_A5560Lb_LineaPr ;
   private String[] T01H359_A396EmprCod ;
   private int[] T01H359_A5532Lb_numero ;
   private String[] T01H359_A5555Lb_opcion ;
   private short[] T01H359_A5557Lb_LineaC ;
   private String[] T01H360_A396EmprCod ;
   private int[] T01H360_A5145SobCod ;
   private String[] T01H360_A719PrdNum ;
   private boolean[] T01H360_n719PrdNum ;
   private String[] T01H361_A396EmprCod ;
   private int[] T01H361_A4744RecPreCod ;
   private short[] T01H361_A4762RecPreLin ;
   private short[] T01H361_A4763RecPreNli ;
   private String[] T01H362_A396EmprCod ;
   private int[] T01H362_A4492HreBarCod ;
   private byte[] T01H362_A4493HreBarReo ;
   private String[] T01H362_A4494HreBarPar ;
   private byte[] T01H362_A4495HreNumCie ;
   private short[] T01H362_A4545HreLinMaq ;
   private byte[] T01H362_A4550HreLinPro ;
   private short[] T01H362_A4557HreRecLin ;
   private String[] T01H363_A396EmprCod ;
   private int[] T01H363_A4492HreBarCod ;
   private byte[] T01H363_A4493HreBarReo ;
   private String[] T01H363_A4494HreBarPar ;
   private byte[] T01H363_A4495HreNumCie ;
   private short[] T01H363_A4508HreLinMAL ;
   private byte[] T01H363_A4509HreNumAny ;
   private String[] T01H363_A719PrdNum ;
   private boolean[] T01H363_n719PrdNum ;
   private String[] T01H364_A396EmprCod ;
   private int[] T01H364_A252CliCod ;
   private String[] T01H364_A4415EstCol ;
   private short[] T01H364_A4416EstColLin ;
   private String[] T01H365_A396EmprCod ;
   private int[] T01H365_A129BarCod ;
   private byte[] T01H365_A132BarCodReo ;
   private String[] T01H365_A130BarCodPar ;
   private byte[] T01H365_A2524DisComLin ;
   private String[] T01H365_A1056DisComCod ;
   private String[] T01H365_A1032FonCod ;
   private byte[] T01H365_A2124RecMolCod ;
   private short[] T01H365_A2672RecPasLin ;
   private short[] T01H365_A2675RecPasPLi ;
   private String[] T01H366_A396EmprCod ;
   private int[] T01H366_A129BarCod ;
   private byte[] T01H366_A132BarCodReo ;
   private String[] T01H366_A130BarCodPar ;
   private byte[] T01H366_A2524DisComLin ;
   private String[] T01H366_A1056DisComCod ;
   private String[] T01H366_A1032FonCod ;
   private byte[] T01H366_A2124RecMolCod ;
   private byte[] T01H366_A2126RecMolLin ;
   private String[] T01H367_A396EmprCod ;
   private String[] T01H367_A2107PasCod ;
   private String[] T01H367_A719PrdNum ;
   private boolean[] T01H367_n719PrdNum ;
   private String[] T01H368_A396EmprCod ;
   private int[] T01H368_A2637HisEstHRu ;
   private byte[] T01H368_A2636HisEstHRe ;
   private String[] T01H368_A2635HisEstHPa ;
   private byte[] T01H368_A2638HisEstLCo ;
   private String[] T01H368_A2630HisEstCom ;
   private String[] T01H368_A2634HisEstFon ;
   private String[] T01H368_A719PrdNum ;
   private boolean[] T01H368_n719PrdNum ;
   private String[] T01H369_A396EmprCod ;
   private int[] T01H369_A252CliCod ;
   private String[] T01H369_A2141SerEst ;
   private String[] T01H369_A1013DibCli ;
   private int[] T01H369_A1014DibInt ;
   private String[] T01H369_A2074ColCom ;
   private String[] T01H369_A2078ColFon ;
   private byte[] T01H369_A2098MolCod ;
   private short[] T01H369_A2535ForPrdLin ;
   private String[] T01H370_A396EmprCod ;
   private String[] T01H370_A719PrdNum ;
   private boolean[] T01H370_n719PrdNum ;
   private long[] T01H370_A3342CCStkLin ;
   private String[] T01H371_A396EmprCod ;
   private int[] T01H371_A252CliCod ;
   private String[] T01H371_A2891HMaForSer ;
   private String[] T01H371_A2892HMaForCNom ;
   private int[] T01H371_A2893HMaForCNum ;
   private byte[] T01H371_A2894HMaTipCCod ;
   private int[] T01H371_A2895HMaForNumC ;
   private short[] T01H371_A2897HMaColLin ;
   private java.util.Date[] T01H371_A2896HMaFec ;
   private short[] T01H371_A2907HmaLin ;
   private String[] T01H372_A396EmprCod ;
   private int[] T01H372_A129BarCod ;
   private byte[] T01H372_A132BarCodReo ;
   private String[] T01H372_A130BarCodPar ;
   private short[] T01H372_A2808RecLinMAL ;
   private byte[] T01H372_A1377RecNumAny ;
   private String[] T01H372_A719PrdNum ;
   private boolean[] T01H372_n719PrdNum ;
   private String[] T01H373_A396EmprCod ;
   private int[] T01H373_A129BarCod ;
   private byte[] T01H373_A132BarCodReo ;
   private String[] T01H373_A130BarCodPar ;
   private short[] T01H373_A2804RecLinMaq ;
   private byte[] T01H373_A1273RecLinPro ;
   private short[] T01H373_A811RecLin ;
   private String[] T01H374_A396EmprCod ;
   private int[] T01H374_A129BarCod ;
   private byte[] T01H374_A132BarCodReo ;
   private String[] T01H374_A130BarCodPar ;
   private String[] T01H374_A2494BarDosPro ;
   private String[] T01H374_A719PrdNum ;
   private boolean[] T01H374_n719PrdNum ;
   private String[] T01H375_A396EmprCod ;
   private int[] T01H375_A1314EnsLabCod ;
   private short[] T01H375_A1317EnsLabLin ;
   private String[] T01H376_A396EmprCod ;
   private String[] T01H376_A910Workstat ;
   private int[] T01H376_A887EscMLin ;
   private String[] T01H377_A396EmprCod ;
   private int[] T01H377_A859CumCodCont ;
   private String[] T01H377_A719PrdNum ;
   private boolean[] T01H377_n719PrdNum ;
   private String[] T01H378_A396EmprCod ;
   private String[] T01H378_A719PrdNum ;
   private boolean[] T01H378_n719PrdNum ;
   private java.util.Date[] T01H378_A810RecFec ;
   private String[] T01H379_A396EmprCod ;
   private int[] T01H379_A486ForNumCol ;
   private short[] T01H379_A715PrdLin ;
   private String[] T01H380_A396EmprCod ;
   private String[] T01H380_A719PrdNum ;
   private boolean[] T01H380_n719PrdNum ;
   private short[] T01H380_A681PrdAny ;
   private String[] T01H381_A396EmprCod ;
   private String[] T01H381_A719PrdNum ;
   private boolean[] T01H381_n719PrdNum ;
   private String[] T01H381_A688PrdComCod ;
   private String[] T01H382_A396EmprCod ;
   private String[] T01H382_A719PrdNum ;
   private boolean[] T01H382_n719PrdNum ;
   private String[] T01H382_A680PrdAltNum ;
   private String[] T01H383_A396EmprCod ;
   private int[] T01H383_A658PedCod ;
   private String[] T01H383_A719PrdNum ;
   private boolean[] T01H383_n719PrdNum ;
   private String[] T01H384_A396EmprCod ;
   private int[] T01H384_A486ForNumCol ;
   private short[] T01H384_A309ColLin ;
   private String[] T01H385_A396EmprCod ;
   private String[] T01H385_A719PrdNum ;
   private boolean[] T01H385_n719PrdNum ;
   private int[] T01H385_A647NumCon ;
   private String[] T01H386_A396EmprCod ;
   private String[] T01H386_A719PrdNum ;
   private boolean[] T01H386_n719PrdNum ;
   private String[] T01H387_A719PrdNum ;
   private boolean[] T01H387_n719PrdNum ;
   private String[] T01H387_A11664LoteID ;
   private java.util.Date[] T01H387_A11665LoteFec ;
   private String[] T01H387_A11667LoteCtf ;
   private String[] T01H387_A11668LoteCon ;
   private int[] T01H387_A11666LotePed ;
   private short[] T01H387_A14017LoteNEmb ;
   private String[] T01H387_A11711LoteCtfNm ;
   private String[] T01H387_A12352LoteCtfNF ;
   private String[] T01H387_A396EmprCod ;
   private String[] T01H388_A396EmprCod ;
   private String[] T01H388_A719PrdNum ;
   private boolean[] T01H388_n719PrdNum ;
   private String[] T01H388_A11664LoteID ;
   private java.util.Date[] T01H388_A11665LoteFec ;
   private String[] T01H33_A719PrdNum ;
   private boolean[] T01H33_n719PrdNum ;
   private String[] T01H33_A11664LoteID ;
   private java.util.Date[] T01H33_A11665LoteFec ;
   private String[] T01H33_A11667LoteCtf ;
   private String[] T01H33_A11668LoteCon ;
   private int[] T01H33_A11666LotePed ;
   private short[] T01H33_A14017LoteNEmb ;
   private String[] T01H33_A11711LoteCtfNm ;
   private String[] T01H33_A12352LoteCtfNF ;
   private String[] T01H33_A396EmprCod ;
   private String[] T01H32_A719PrdNum ;
   private boolean[] T01H32_n719PrdNum ;
   private String[] T01H32_A11664LoteID ;
   private java.util.Date[] T01H32_A11665LoteFec ;
   private String[] T01H32_A11667LoteCtf ;
   private String[] T01H32_A11668LoteCon ;
   private int[] T01H32_A11666LotePed ;
   private short[] T01H32_A14017LoteNEmb ;
   private String[] T01H32_A11711LoteCtfNm ;
   private String[] T01H32_A12352LoteCtfNF ;
   private String[] T01H32_A396EmprCod ;
   private String[] T01H392_A396EmprCod ;
   private String[] T01H392_A719PrdNum ;
   private boolean[] T01H392_n719PrdNum ;
   private String[] T01H392_A11664LoteID ;
   private java.util.Date[] T01H392_A11665LoteFec ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV42WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV43TrnContext ;
}

final  class tlotprd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlotprd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlotprd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlotprd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tlotprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01H32", "SELECT PrdNum, LoteID, LoteFec, LoteCtf, LoteCon, LotePed, LoteNEmb, LoteCtfNm, LoteCtfNF, EmprCod FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?  FOR UPDATE OF LoteCtf, LoteCon, LotePed, LoteNEmb, LoteCtfNm, LoteCtfNF NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H33", "SELECT PrdNum, LoteID, LoteFec, LoteCtf, LoteCon, LotePed, LoteNEmb, LoteCtfNm, LoteCtfNF, EmprCod FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H34", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H35", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H36", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H37", "SELECT /*+ FIRST_ROWS(1) */ TM1.PrdNum, TM1.PrdNom, T2.EmprNom, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.PrdNom = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H38", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H39", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? and PrdNom = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H310", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, PrdNom FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? and PrdNom = ? ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01H311", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01H312", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01H313", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01H314", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H315", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H316", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H317", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H318", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H319", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H320", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H321", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H322", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H323", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H324", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H325", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H326", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H327", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H328", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H329", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H330", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H331", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H332", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H333", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H334", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H335", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H336", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H337", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H338", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H339", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H340", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H341", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H342", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H343", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H344", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H345", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H346", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H347", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H348", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H349", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H350", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H351", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H352", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H353", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H354", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H355", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H356", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H357", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H358", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H359", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H360", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H361", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H362", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H363", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H364", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H365", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H366", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H367", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H368", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H369", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H370", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H371", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H372", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H373", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H374", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H375", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H376", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H377", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H378", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H379", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H380", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H381", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H382", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H383", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H384", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H385", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H386", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? and PrdNom = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01H387", "SELECT PrdNum, LoteID, LoteFec, LoteCtf, LoteCon, LotePed, LoteNEmb, LoteCtfNm, LoteCtfNF, EmprCod FROM TXPLOTPRD WHERE EmprCod = ? and PrdNum = ? and LoteID = ? and LoteFec = ? ORDER BY EmprCod, PrdNum, LoteID, LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01H388", "SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01H389", "INSERT INTO TXPLOTPRD(PrdNum, LoteID, LoteFec, LoteCtf, LoteCon, LotePed, LoteNEmb, LoteCtfNm, LoteCtfNF, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01H390", "UPDATE TXPLOTPRD SET LoteCtf=?, LoteCon=?, LotePed=?, LoteNEmb=?, LoteCtfNm=?, LoteCtfNF=?  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new UpdateCursor("T01H391", "DELETE FROM TXPLOTPRD  WHERE EmprCod = ? AND PrdNum = ? AND LoteID = ? AND LoteFec = ?", GX_NOMASK, "TXPLOTPRD")
         ,new ForEachCursor("T01H392", "SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, LoteID, LoteFec ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 50);
               ((String[]) buf[8])[0] = rslt.getString(9, 50);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 50);
               ((String[]) buf[8])[0] = rslt.getString(9, 50);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 41 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 12);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               return;
            case 42 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 57 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 58 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 64 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 65 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               return;
            case 68 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 69 :
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
            case 70 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 50);
               ((String[]) buf[8])[0] = rslt.getString(9, 50);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
      }
      getresults90( cursor, rslt, buf) ;
   }

   public void getresults90( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               stmt.setString(3, (String)parms[3], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 26);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 39 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 40 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 41 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 42 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 43 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 44 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 45 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 46 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 47 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 48 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 49 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 50 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 51 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 52 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 53 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 54 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 55 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 56 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 57 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 58 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 59 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 61 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 62 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 63 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 64 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 65 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 66 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 67 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 68 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 69 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 70 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 71 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 72 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 73 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 74 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 75 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 76 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 77 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 78 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 79 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 80 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 81 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 82 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 83 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 84 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 86 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
            case 87 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 26);
               stmt.setDate(3, (java.util.Date)parms[3]);
               stmt.setString(4, (String)parms[4], 1);
               stmt.setString(5, (String)parms[5], 1);
               stmt.setInt(6, ((Number) parms[6]).intValue());
               stmt.setShort(7, ((Number) parms[7]).shortValue());
               stmt.setString(8, (String)parms[8], 50);
               stmt.setString(9, (String)parms[9], 50);
               stmt.setString(10, (String)parms[10], 3);
               return;
            case 88 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 50);
               stmt.setString(6, (String)parms[5], 50);
               stmt.setString(7, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[8], 6);
               }
               stmt.setString(9, (String)parms[9], 26);
               stmt.setDate(10, (java.util.Date)parms[10]);
               return;
            case 89 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setString(3, (String)parms[3], 26);
               stmt.setDate(4, (java.util.Date)parms[4]);
               return;
      }
      setparameters90( cursor, stmt, parms) ;
   }

   public void setparameters90( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 90 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
      }
   }

}

