package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ttipmov_impl extends GXDataArea
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
            AV26EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
            AV27TipMovCc = httpContext.GetPar( "TipMovCc") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TipMovCc", AV27TipMovCc);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPMOVCC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27TipMovCc, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "TIPOS MOVIM. C.C. STOCKS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public ttipmov_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ttipmov_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ttipmov_impl.class ));
   }

   public ttipmov_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipMovCc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipMovCc_Internalname, httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCc_Internalname, GXutil.rtrim( A3345TipMovCc), GXutil.rtrim( localUtil.format( A3345TipMovCc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipMovCc_Enabled, 1, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TTIPMOV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTipMovCn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTipMovCn_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCn_Internalname, GXutil.rtrim( A3346TipMovCn), GXutil.rtrim( localUtil.format( A3346TipMovCn, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTipMovCn_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TTIPMOV.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TTIPMOV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TTIPMOV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\TTIPMOV.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV31Pgmname), GXutil.rtrim( localUtil.format( AV31Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TTIPMOV.htm");
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
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipMovCnID_Internalname, A13836TipMovCnID, GXutil.rtrim( localUtil.format( A13836TipMovCnID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipMovCnID_Jsonclick, 0, "Attribute", "", "", "", "", edtTipMovCnID_Visible, edtTipMovCnID_Enabled, 0, "text", "", 35, "chr", 1, "row", 35, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\TTIPMOV.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e11BY2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z3345TipMovCc = httpContext.cgiGet( "Z3345TipMovCc") ;
            Z3346TipMovCn = httpContext.cgiGet( "Z3346TipMovCn") ;
            Z7062TipMovRec = httpContext.cgiGet( "Z7062TipMovRec") ;
            Z7063TipMovEst = httpContext.cgiGet( "Z7063TipMovEst") ;
            A7062TipMovRec = httpContext.cgiGet( "Z7062TipMovRec") ;
            n7062TipMovRec = false ;
            A7063TipMovEst = httpContext.cgiGet( "Z7063TipMovEst") ;
            n7063TipMovEst = false ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV26EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV27TipMovCc = httpContext.cgiGet( "vTIPMOVCC") ;
            A7062TipMovRec = httpContext.cgiGet( "TIPMOVREC") ;
            A7063TipMovEst = httpContext.cgiGet( "TIPMOVEST") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
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
            A3345TipMovCc = httpContext.cgiGet( edtTipMovCc_Internalname) ;
            n3345TipMovCc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
            A3346TipMovCn = httpContext.cgiGet( edtTipMovCn_Internalname) ;
            n3346TipMovCn = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
            AV31Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
            A13836TipMovCnID = httpContext.cgiGet( edtTipMovCnID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13836TipMovCnID", A13836TipMovCnID);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TTIPMOV");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("TipMovRec", GXutil.rtrim( localUtil.format( A7062TipMovRec, "")));
            forbiddenHiddens.add("TipMovEst", GXutil.rtrim( localUtil.format( A7063TipMovEst, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A3345TipMovCc, Z3345TipMovCc) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("stocksquimicos\\ttipmov:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
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
               A3345TipMovCc = httpContext.GetPar( "TipMovCc") ;
               n3345TipMovCc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
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
                  sMode485 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode485 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound485 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_BY0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "TIPMOVCC");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTipMovCc_Internalname ;
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
                        e11BY2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12BY2 ();
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
         e12BY2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllBY485( ) ;
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
         disableAttributesBY485( ) ;
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

   public void confirm_BY0( )
   {
      beforeValidateBY485( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsBY485( ) ;
         }
         else
         {
            checkExtendedTableBY485( ) ;
            closeExtendedTableCursorsBY485( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionBY0( )
   {
   }

   public void e11BY2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      ttipmov_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      ttipmov_impl.this.A396EmprCod = GXv_char2[0] ;
      ttipmov_impl.this.AV25EmprNom = GXv_char3[0] ;
      ttipmov_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      ttipmov_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char4[0] = AV26EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      ttipmov_impl.this.AV26EmprCod = GXv_char4[0] ;
      ttipmov_impl.this.AV25EmprNom = GXv_char3[0] ;
      ttipmov_impl.this.AV21UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXv_SdtWWPContext5[0] = AV28WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV28WWPContext = GXv_SdtWWPContext5[0] ;
      AV29TrnContext.fromxml(AV30WebSession.getValue("TrnContext"), null, null);
      edtTipMovCnID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCnID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCnID_Visible), 5, 0), true);
   }

   public void e12BY2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV29TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.stocksquimicos.ttipmovww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zmBY485( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z3346TipMovCn = T00BY3_A3346TipMovCn[0] ;
            Z7062TipMovRec = T00BY3_A7062TipMovRec[0] ;
            Z7063TipMovEst = T00BY3_A7063TipMovEst[0] ;
         }
         else
         {
            Z3346TipMovCn = A3346TipMovCn ;
            Z7062TipMovRec = A7062TipMovRec ;
            Z7063TipMovEst = A7063TipMovEst ;
         }
      }
      if ( GX_JID == -7 )
      {
         Z3345TipMovCc = A3345TipMovCc ;
         Z3346TipMovCn = A3346TipMovCn ;
         Z7062TipMovRec = A7062TipMovRec ;
         Z7063TipMovEst = A7063TipMovEst ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV31Pgmname = "StocksQuimicos.TTIPMOV" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Pgmname", AV31Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV26EmprCod)==0) )
      {
         A396EmprCod = AV26EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00BY4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00BY4_A407EmprNom[0] ;
      n407EmprNom = T00BY4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV27TipMovCc)==0) )
      {
         A3345TipMovCc = AV27TipMovCc ;
         n3345TipMovCc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
      }
      if ( ! (GXutil.strcmp("", AV27TipMovCc)==0) )
      {
         edtTipMovCc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), true);
      }
      else
      {
         edtTipMovCc_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV27TipMovCc)==0) )
      {
         edtTipMovCc_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), true);
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

   public void loadBY485( )
   {
      /* Using cursor T00BY5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound485 = (short)(1) ;
         A407EmprNom = T00BY5_A407EmprNom[0] ;
         n407EmprNom = T00BY5_n407EmprNom[0] ;
         A3346TipMovCn = T00BY5_A3346TipMovCn[0] ;
         n3346TipMovCn = T00BY5_n3346TipMovCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
         A7062TipMovRec = T00BY5_A7062TipMovRec[0] ;
         n7062TipMovRec = T00BY5_n7062TipMovRec[0] ;
         A7063TipMovEst = T00BY5_A7063TipMovEst[0] ;
         n7063TipMovEst = T00BY5_n7063TipMovEst[0] ;
         zmBY485( -7) ;
      }
      pr_default.close(3);
      onLoadActionsBY485( ) ;
   }

   public void onLoadActionsBY485( )
   {
      A13836TipMovCnID = GXutil.trim( A3345TipMovCc) + "-" + GXutil.trim( A3346TipMovCn) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13836TipMovCnID", A13836TipMovCnID);
   }

   public void checkExtendedTableBY485( )
   {
      nIsDirty_485 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_485 = (short)(1) ;
      A13836TipMovCnID = GXutil.trim( A3345TipMovCc) + "-" + GXutil.trim( A3346TipMovCn) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13836TipMovCnID", A13836TipMovCnID);
   }

   public void closeExtendedTableCursorsBY485( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyBY485( )
   {
      /* Using cursor T00BY6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound485 = (short)(1) ;
      }
      else
      {
         RcdFound485 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00BY3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00BY3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmBY485( 7) ;
         RcdFound485 = (short)(1) ;
         A3345TipMovCc = T00BY3_A3345TipMovCc[0] ;
         n3345TipMovCc = T00BY3_n3345TipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         A3346TipMovCn = T00BY3_A3346TipMovCn[0] ;
         n3346TipMovCn = T00BY3_n3346TipMovCn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
         A7062TipMovRec = T00BY3_A7062TipMovRec[0] ;
         n7062TipMovRec = T00BY3_n7062TipMovRec[0] ;
         A7063TipMovEst = T00BY3_A7063TipMovEst[0] ;
         n7063TipMovEst = T00BY3_n7063TipMovEst[0] ;
         Z396EmprCod = A396EmprCod ;
         Z3345TipMovCc = A3345TipMovCc ;
         sMode485 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadBY485( ) ;
         if ( AnyError == 1 )
         {
            RcdFound485 = (short)(0) ;
            initializeNonKeyBY485( ) ;
         }
         Gx_mode = sMode485 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound485 = (short)(0) ;
         initializeNonKeyBY485( ) ;
         sMode485 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode485 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyBY485( ) ;
      if ( RcdFound485 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound485 = (short)(0) ;
      /* Using cursor T00BY7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00BY7_A3345TipMovCc[0], A3345TipMovCc) < 0 ) ) && ( GXutil.strcmp(T00BY7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00BY7_A3345TipMovCc[0], A3345TipMovCc) > 0 ) ) && ( GXutil.strcmp(T00BY7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3345TipMovCc = T00BY7_A3345TipMovCc[0] ;
            n3345TipMovCc = T00BY7_n3345TipMovCc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
            RcdFound485 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound485 = (short)(0) ;
      /* Using cursor T00BY8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00BY8_A3345TipMovCc[0], A3345TipMovCc) > 0 ) ) && ( GXutil.strcmp(T00BY8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00BY8_A3345TipMovCc[0], A3345TipMovCc) < 0 ) ) && ( GXutil.strcmp(T00BY8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A3345TipMovCc = T00BY8_A3345TipMovCc[0] ;
            n3345TipMovCc = T00BY8_n3345TipMovCc[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
            RcdFound485 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyBY485( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertBY485( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound485 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A3345TipMovCc, Z3345TipMovCc) != 0 ) )
            {
               A3345TipMovCc = Z3345TipMovCc ;
               n3345TipMovCc = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TIPMOVCC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipMovCc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTipMovCc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateBY485( ) ;
               GX_FocusControl = edtTipMovCc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A3345TipMovCc, Z3345TipMovCc) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtTipMovCc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertBY485( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TIPMOVCC");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTipMovCc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtTipMovCc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertBY485( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A3345TipMovCc, Z3345TipMovCc) != 0 ) )
      {
         A3345TipMovCc = Z3345TipMovCc ;
         n3345TipMovCc = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TIPMOVCC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTipMovCc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyBY485( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00BY2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPMOV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z3346TipMovCn, T00BY2_A3346TipMovCn[0]) != 0 ) || ( GXutil.strcmp(Z7062TipMovRec, T00BY2_A7062TipMovRec[0]) != 0 ) || ( GXutil.strcmp(Z7063TipMovEst, T00BY2_A7063TipMovEst[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z3346TipMovCn, T00BY2_A3346TipMovCn[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.ttipmov:[seudo value changed for attri]"+"TipMovCn");
               GXutil.writeLogRaw("Old: ",Z3346TipMovCn);
               GXutil.writeLogRaw("Current: ",T00BY2_A3346TipMovCn[0]);
            }
            if ( GXutil.strcmp(Z7062TipMovRec, T00BY2_A7062TipMovRec[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.ttipmov:[seudo value changed for attri]"+"TipMovRec");
               GXutil.writeLogRaw("Old: ",Z7062TipMovRec);
               GXutil.writeLogRaw("Current: ",T00BY2_A7062TipMovRec[0]);
            }
            if ( GXutil.strcmp(Z7063TipMovEst, T00BY2_A7063TipMovEst[0]) != 0 )
            {
               GXutil.writeLogln("stocksquimicos.ttipmov:[seudo value changed for attri]"+"TipMovEst");
               GXutil.writeLogRaw("Old: ",Z7063TipMovEst);
               GXutil.writeLogRaw("Current: ",T00BY2_A7063TipMovEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPTIPMOV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertBY485( )
   {
      beforeValidateBY485( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBY485( ) ;
      }
      if ( AnyError == 0 )
      {
         zmBY485( 0) ;
         checkOptimisticConcurrencyBY485( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBY485( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertBY485( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BY9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n3345TipMovCc), A3345TipMovCc, Boolean.valueOf(n3346TipMovCn), A3346TipMovCn, Boolean.valueOf(n7062TipMovRec), A7062TipMovRec, Boolean.valueOf(n7063TipMovEst), A7063TipMovEst, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPMOV");
                  if ( (pr_default.getStatus(7) == 1) )
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
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaptionBY0( ) ;
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
            loadBY485( ) ;
         }
         endLevelBY485( ) ;
      }
      closeExtendedTableCursorsBY485( ) ;
   }

   public void updateBY485( )
   {
      beforeValidateBY485( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableBY485( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBY485( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmBY485( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateBY485( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00BY10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n3346TipMovCn), A3346TipMovCn, Boolean.valueOf(n7062TipMovRec), A7062TipMovRec, Boolean.valueOf(n7063TipMovEst), A7063TipMovEst, A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPMOV");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPTIPMOV"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateBY485( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
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
         endLevelBY485( ) ;
      }
      closeExtendedTableCursorsBY485( ) ;
   }

   public void deferredUpdateBY485( )
   {
   }

   public void delete( )
   {
      beforeValidateBY485( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyBY485( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsBY485( ) ;
         afterConfirmBY485( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteBY485( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00BY11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPTIPMOV");
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
      sMode485 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelBY485( ) ;
      Gx_mode = sMode485 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsBY485( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13836TipMovCnID = GXutil.trim( A3345TipMovCc) + "-" + GXutil.trim( A3346TipMovCn) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13836TipMovCnID", A13836TipMovCnID);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00BY12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00BY13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T00BY14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCALM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T00BY15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n3345TipMovCc), A3345TipMovCc});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevelBY485( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteBY485( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.ttipmov");
         if ( AnyError == 0 )
         {
            confirmValuesBY0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.ttipmov");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartBY485( )
   {
      /* Scan By routine */
      /* Using cursor T00BY16 */
      pr_default.execute(14, new Object[] {A396EmprCod});
      RcdFound485 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound485 = (short)(1) ;
         A3345TipMovCc = T00BY16_A3345TipMovCc[0] ;
         n3345TipMovCc = T00BY16_n3345TipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
      }
      /* Load Subordinate Levels */
   }

   public void scanNextBY485( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound485 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound485 = (short)(1) ;
         A3345TipMovCc = T00BY16_A3345TipMovCc[0] ;
         n3345TipMovCc = T00BY16_n3345TipMovCc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
      }
   }

   public void scanEndBY485( )
   {
      pr_default.close(14);
   }

   public void afterConfirmBY485( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsertBY485( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdateBY485( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteBY485( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteBY485( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateBY485( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesBY485( )
   {
      edtTipMovCc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCc_Enabled), 5, 0), true);
      edtTipMovCn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCn_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtTipMovCnID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipMovCnID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipMovCnID_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesBY485( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesBY0( )
   {
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.ttipmov", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV27TipMovCc))}, new String[] {"Gx_mode","EmprCod","TipMovCc"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TTIPMOV");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("TipMovRec", GXutil.rtrim( localUtil.format( A7062TipMovRec, "")));
      forbiddenHiddens.add("TipMovEst", GXutil.rtrim( localUtil.format( A7063TipMovEst, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("stocksquimicos\\ttipmov:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3345TipMovCc", GXutil.rtrim( Z3345TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z3346TipMovCn", GXutil.rtrim( Z3346TipMovCn));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7062TipMovRec", GXutil.rtrim( Z7062TipMovRec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7063TipMovEst", GXutil.rtrim( Z7063TipMovEst));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV29TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV29TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV29TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPMOVCC", GXutil.rtrim( AV27TipMovCc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPMOVCC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27TipMovCc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPMOVREC", GXutil.rtrim( A7062TipMovRec));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPMOVEST", GXutil.rtrim( A7063TipMovEst));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
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
      return formatLink("app.stocksquimicos.ttipmov", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV27TipMovCc))}, new String[] {"Gx_mode","EmprCod","TipMovCc"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.TTIPMOV" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "TIPOS MOVIM. C.C. STOCKS", "") ;
   }

   public void initializeNonKeyBY485( )
   {
      A13836TipMovCnID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13836TipMovCnID", A13836TipMovCnID);
      A3346TipMovCn = "" ;
      n3346TipMovCn = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3346TipMovCn", A3346TipMovCn);
      A7062TipMovRec = "" ;
      n7062TipMovRec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7062TipMovRec", A7062TipMovRec);
      A7063TipMovEst = "" ;
      n7063TipMovEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7063TipMovEst", A7063TipMovEst);
      Z3346TipMovCn = "" ;
      Z7062TipMovRec = "" ;
      Z7063TipMovEst = "" ;
   }

   public void initAllBY485( )
   {
      A3345TipMovCc = "" ;
      n3345TipMovCc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A3345TipMovCc", A3345TipMovCc);
      initializeNonKeyBY485( ) ;
   }

   public void standaloneModalInsert( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211654522", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/ttipmov.js", "?20268211654522", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtTipMovCc_Internalname = "TIPMOVCC" ;
      edtTipMovCn_Internalname = "TIPMOVCN" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtTipMovCnID_Internalname = "TIPMOVCNID" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "TIPOS MOVIM. C.C. STOCKS", "") );
      edtTipMovCnID_Jsonclick = "" ;
      edtTipMovCnID_Enabled = 0 ;
      edtTipMovCnID_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTipMovCn_Jsonclick = "" ;
      edtTipMovCn_Enabled = 1 ;
      edtTipMovCc_Jsonclick = "" ;
      edtTipMovCc_Enabled = 1 ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV27TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV29TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV27TipMovCc',fld:'vTIPMOVCC',pic:'',hsh:true},{av:'A7062TipMovRec',fld:'TIPMOVREC',pic:''},{av:'A7063TipMovEst',fld:'TIPMOVEST',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12BY2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV29TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_TIPMOVCC","{handler:'valid_Tipmovcc',iparms:[]");
      setEventMetadata("VALID_TIPMOVCC",",oparms:[]}");
      setEventMetadata("VALID_TIPMOVCN","{handler:'valid_Tipmovcn',iparms:[]");
      setEventMetadata("VALID_TIPMOVCN",",oparms:[]}");
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
      wcpOAV26EmprCod = "" ;
      wcpOAV27TipMovCc = "" ;
      Z396EmprCod = "" ;
      Z3345TipMovCc = "" ;
      Z3346TipMovCn = "" ;
      Z7062TipMovRec = "" ;
      Z7063TipMovEst = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV26EmprCod = "" ;
      AV27TipMovCc = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A3345TipMovCc = "" ;
      A3346TipMovCn = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV31Pgmname = "" ;
      A13836TipMovCnID = "" ;
      A7062TipMovRec = "" ;
      A7063TipMovEst = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode485 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV24Station = "" ;
      AV25EmprNom = "" ;
      AV21UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV28WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV29TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV30WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00BY4_A407EmprNom = new String[] {""} ;
      T00BY4_n407EmprNom = new boolean[] {false} ;
      T00BY5_A3345TipMovCc = new String[] {""} ;
      T00BY5_n3345TipMovCc = new boolean[] {false} ;
      T00BY5_A407EmprNom = new String[] {""} ;
      T00BY5_n407EmprNom = new boolean[] {false} ;
      T00BY5_A3346TipMovCn = new String[] {""} ;
      T00BY5_n3346TipMovCn = new boolean[] {false} ;
      T00BY5_A7062TipMovRec = new String[] {""} ;
      T00BY5_n7062TipMovRec = new boolean[] {false} ;
      T00BY5_A7063TipMovEst = new String[] {""} ;
      T00BY5_n7063TipMovEst = new boolean[] {false} ;
      T00BY5_A396EmprCod = new String[] {""} ;
      T00BY6_A396EmprCod = new String[] {""} ;
      T00BY6_A3345TipMovCc = new String[] {""} ;
      T00BY6_n3345TipMovCc = new boolean[] {false} ;
      T00BY3_A3345TipMovCc = new String[] {""} ;
      T00BY3_n3345TipMovCc = new boolean[] {false} ;
      T00BY3_A3346TipMovCn = new String[] {""} ;
      T00BY3_n3346TipMovCn = new boolean[] {false} ;
      T00BY3_A7062TipMovRec = new String[] {""} ;
      T00BY3_n7062TipMovRec = new boolean[] {false} ;
      T00BY3_A7063TipMovEst = new String[] {""} ;
      T00BY3_n7063TipMovEst = new boolean[] {false} ;
      T00BY3_A396EmprCod = new String[] {""} ;
      T00BY7_A396EmprCod = new String[] {""} ;
      T00BY7_A3345TipMovCc = new String[] {""} ;
      T00BY7_n3345TipMovCc = new boolean[] {false} ;
      T00BY8_A396EmprCod = new String[] {""} ;
      T00BY8_A3345TipMovCc = new String[] {""} ;
      T00BY8_n3345TipMovCc = new boolean[] {false} ;
      T00BY2_A3345TipMovCc = new String[] {""} ;
      T00BY2_n3345TipMovCc = new boolean[] {false} ;
      T00BY2_A3346TipMovCn = new String[] {""} ;
      T00BY2_n3346TipMovCn = new boolean[] {false} ;
      T00BY2_A7062TipMovRec = new String[] {""} ;
      T00BY2_n7062TipMovRec = new boolean[] {false} ;
      T00BY2_A7063TipMovEst = new String[] {""} ;
      T00BY2_n7063TipMovEst = new boolean[] {false} ;
      T00BY2_A396EmprCod = new String[] {""} ;
      T00BY12_A396EmprCod = new String[] {""} ;
      T00BY12_A719PrdNum = new String[] {""} ;
      T00BY12_A11329H_stklin = new long[1] ;
      T00BY13_A396EmprCod = new String[] {""} ;
      T00BY13_A2107PasCod = new String[] {""} ;
      T00BY13_A9593Pas_LinM = new int[1] ;
      T00BY14_A396EmprCod = new String[] {""} ;
      T00BY14_A719PrdNum = new String[] {""} ;
      T00BY14_A8911CC_Lin = new long[1] ;
      T00BY15_A396EmprCod = new String[] {""} ;
      T00BY15_A719PrdNum = new String[] {""} ;
      T00BY15_A3342CCStkLin = new long[1] ;
      T00BY16_A396EmprCod = new String[] {""} ;
      T00BY16_A3345TipMovCc = new String[] {""} ;
      T00BY16_n3345TipMovCc = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipmov__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipmov__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipmov__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipmov__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.ttipmov__default(),
         new Object[] {
             new Object[] {
            T00BY2_A3345TipMovCc, T00BY2_A3346TipMovCn, T00BY2_n3346TipMovCn, T00BY2_A7062TipMovRec, T00BY2_n7062TipMovRec, T00BY2_A7063TipMovEst, T00BY2_n7063TipMovEst, T00BY2_A396EmprCod
            }
            , new Object[] {
            T00BY3_A3345TipMovCc, T00BY3_A3346TipMovCn, T00BY3_n3346TipMovCn, T00BY3_A7062TipMovRec, T00BY3_n7062TipMovRec, T00BY3_A7063TipMovEst, T00BY3_n7063TipMovEst, T00BY3_A396EmprCod
            }
            , new Object[] {
            T00BY4_A407EmprNom, T00BY4_n407EmprNom
            }
            , new Object[] {
            T00BY5_A3345TipMovCc, T00BY5_A407EmprNom, T00BY5_n407EmprNom, T00BY5_A3346TipMovCn, T00BY5_n3346TipMovCn, T00BY5_A7062TipMovRec, T00BY5_n7062TipMovRec, T00BY5_A7063TipMovEst, T00BY5_n7063TipMovEst, T00BY5_A396EmprCod
            }
            , new Object[] {
            T00BY6_A396EmprCod, T00BY6_A3345TipMovCc
            }
            , new Object[] {
            T00BY7_A396EmprCod, T00BY7_A3345TipMovCc
            }
            , new Object[] {
            T00BY8_A396EmprCod, T00BY8_A3345TipMovCc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00BY12_A396EmprCod, T00BY12_A719PrdNum, T00BY12_A11329H_stklin
            }
            , new Object[] {
            T00BY13_A396EmprCod, T00BY13_A2107PasCod, T00BY13_A9593Pas_LinM
            }
            , new Object[] {
            T00BY14_A396EmprCod, T00BY14_A719PrdNum, T00BY14_A8911CC_Lin
            }
            , new Object[] {
            T00BY15_A396EmprCod, T00BY15_A719PrdNum, T00BY15_A3342CCStkLin
            }
            , new Object[] {
            T00BY16_A396EmprCod, T00BY16_A3345TipMovCc
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV31Pgmname = "StocksQuimicos.TTIPMOV" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound485 ;
   private short nIsDirty_485 ;
   private int trnEnded ;
   private int edtTipMovCc_Enabled ;
   private int edtTipMovCn_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtTipMovCnID_Visible ;
   private int edtTipMovCnID_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV26EmprCod ;
   private String wcpOAV27TipMovCc ;
   private String Z396EmprCod ;
   private String Z3345TipMovCc ;
   private String Z3346TipMovCn ;
   private String Z7062TipMovRec ;
   private String Z7063TipMovEst ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV26EmprCod ;
   private String AV27TipMovCc ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTipMovCc_Internalname ;
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
   private String A3345TipMovCc ;
   private String edtTipMovCc_Jsonclick ;
   private String edtTipMovCn_Internalname ;
   private String A3346TipMovCn ;
   private String edtTipMovCn_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV31Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtTipMovCnID_Internalname ;
   private String edtTipMovCnID_Jsonclick ;
   private String A7062TipMovRec ;
   private String A7063TipMovEst ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode485 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV24Station ;
   private String AV25EmprNom ;
   private String AV21UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n7062TipMovRec ;
   private boolean n7063TipMovEst ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n3345TipMovCc ;
   private boolean n3346TipMovCn ;
   private boolean returnInSub ;
   private String A13836TipMovCnID ;
   private com.genexus.webpanels.WebSession AV30WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00BY4_A407EmprNom ;
   private boolean[] T00BY4_n407EmprNom ;
   private String[] T00BY5_A3345TipMovCc ;
   private boolean[] T00BY5_n3345TipMovCc ;
   private String[] T00BY5_A407EmprNom ;
   private boolean[] T00BY5_n407EmprNom ;
   private String[] T00BY5_A3346TipMovCn ;
   private boolean[] T00BY5_n3346TipMovCn ;
   private String[] T00BY5_A7062TipMovRec ;
   private boolean[] T00BY5_n7062TipMovRec ;
   private String[] T00BY5_A7063TipMovEst ;
   private boolean[] T00BY5_n7063TipMovEst ;
   private String[] T00BY5_A396EmprCod ;
   private String[] T00BY6_A396EmprCod ;
   private String[] T00BY6_A3345TipMovCc ;
   private boolean[] T00BY6_n3345TipMovCc ;
   private String[] T00BY3_A3345TipMovCc ;
   private boolean[] T00BY3_n3345TipMovCc ;
   private String[] T00BY3_A3346TipMovCn ;
   private boolean[] T00BY3_n3346TipMovCn ;
   private String[] T00BY3_A7062TipMovRec ;
   private boolean[] T00BY3_n7062TipMovRec ;
   private String[] T00BY3_A7063TipMovEst ;
   private boolean[] T00BY3_n7063TipMovEst ;
   private String[] T00BY3_A396EmprCod ;
   private String[] T00BY7_A396EmprCod ;
   private String[] T00BY7_A3345TipMovCc ;
   private boolean[] T00BY7_n3345TipMovCc ;
   private String[] T00BY8_A396EmprCod ;
   private String[] T00BY8_A3345TipMovCc ;
   private boolean[] T00BY8_n3345TipMovCc ;
   private String[] T00BY2_A3345TipMovCc ;
   private boolean[] T00BY2_n3345TipMovCc ;
   private String[] T00BY2_A3346TipMovCn ;
   private boolean[] T00BY2_n3346TipMovCn ;
   private String[] T00BY2_A7062TipMovRec ;
   private boolean[] T00BY2_n7062TipMovRec ;
   private String[] T00BY2_A7063TipMovEst ;
   private boolean[] T00BY2_n7063TipMovEst ;
   private String[] T00BY2_A396EmprCod ;
   private String[] T00BY12_A396EmprCod ;
   private String[] T00BY12_A719PrdNum ;
   private long[] T00BY12_A11329H_stklin ;
   private String[] T00BY13_A396EmprCod ;
   private String[] T00BY13_A2107PasCod ;
   private int[] T00BY13_A9593Pas_LinM ;
   private String[] T00BY14_A396EmprCod ;
   private String[] T00BY14_A719PrdNum ;
   private long[] T00BY14_A8911CC_Lin ;
   private String[] T00BY15_A396EmprCod ;
   private String[] T00BY15_A719PrdNum ;
   private long[] T00BY15_A3342CCStkLin ;
   private String[] T00BY16_A396EmprCod ;
   private String[] T00BY16_A3345TipMovCc ;
   private boolean[] T00BY16_n3345TipMovCc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV28WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV29TrnContext ;
}

final  class ttipmov__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipmov__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipmov__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipmov__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class ttipmov__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00BY2", "SELECT TipMovCc, TipMovCn, TipMovRec, TipMovEst, EmprCod FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ?  FOR UPDATE OF TipMovCn, TipMovRec, TipMovEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BY3", "SELECT TipMovCc, TipMovCn, TipMovRec, TipMovEst, EmprCod FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BY4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BY5", "SELECT /*+ FIRST_ROWS(100) */ TM1.TipMovCc, T2.EmprNom, TM1.TipMovCn, TM1.TipMovRec, TM1.TipMovEst, TM1.EmprCod FROM (TXPTIPMOV TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.TipMovCc = ? ORDER BY TM1.EmprCod, TM1.TipMovCc ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BY6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipMovCc FROM TXPTIPMOV WHERE EmprCod = ? AND TipMovCc = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00BY7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipMovCc FROM TXPTIPMOV WHERE ( TipMovCc > ?) and EmprCod = ? ORDER BY EmprCod, TipMovCc) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00BY8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, TipMovCc FROM TXPTIPMOV WHERE ( TipMovCc < ?) and EmprCod = ? ORDER BY EmprCod DESC, TipMovCc DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00BY9", "INSERT INTO TXPTIPMOV(TipMovCc, TipMovCn, TipMovRec, TipMovEst, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPTIPMOV")
         ,new UpdateCursor("T00BY10", "UPDATE TXPTIPMOV SET TipMovCn=?, TipMovRec=?, TipMovEst=?  WHERE EmprCod = ? AND TipMovCc = ?", GX_NOMASK, "TXPTIPMOV")
         ,new UpdateCursor("T00BY11", "DELETE FROM TXPTIPMOV  WHERE EmprCod = ? AND TipMovCc = ?", GX_NOMASK, "TXPTIPMOV")
         ,new ForEachCursor("T00BY12", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND TipMovCc = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00BY13", "SELECT * FROM (SELECT EmprCod, PasCod, Pas_LinM FROM TXPCCPAST WHERE EmprCod = ? AND TipMovCc = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00BY14", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_Lin FROM TXPCCALM WHERE EmprCod = ? AND TipMovCc = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00BY15", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND TipMovCc = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00BY16", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, TipMovCc FROM TXPTIPMOV WHERE EmprCod = ? ORDER BY EmprCod, TipMovCc ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 2);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
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
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               stmt.setString(5, (String)parms[8], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 1);
               }
               stmt.setString(4, (String)parms[6], 3);
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[8], 2);
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
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
                  stmt.setString(2, (String)parms[2], 2);
               }
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

