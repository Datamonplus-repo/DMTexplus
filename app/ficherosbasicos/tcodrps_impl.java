package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcodrps_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"RPS_COD") == 0 )
      {
         AV28Rps_Cod = (short)(GXutil.lval( httpContext.GetPar( "Rps_Cod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRPS_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Rps_Cod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asarps_codXF991( AV28Rps_Cod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"RPS_COD") == 0 )
      {
         A7000Rps_Cod = (short)(GXutil.lval( httpContext.GetPar( "Rps_Cod"))) ;
         n7000Rps_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         AV32autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asarps_codXF991( A7000Rps_Cod, AV32autonumber, A396EmprCod) ;
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
            AV28Rps_Cod = (short)(GXutil.lval( httpContext.GetPar( "Rps_Cod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Rps_Cod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRPS_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Rps_Cod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Tipos de Responsabilidades", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtRps_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tcodrps_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcodrps_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcodrps_impl.class ));
   }

   public tcodrps_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRps_Cod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRps_Cod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRps_Cod_Internalname, GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7000Rps_Cod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRps_Cod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRps_Cod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TCODRPS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtRps_Dsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtRps_Dsc_Internalname, httpContext.getMessage( " Responsabilidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtRps_Dsc_Internalname, GXutil.rtrim( A7001Rps_Dsc), GXutil.rtrim( localUtil.format( A7001Rps_Dsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,26);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRps_Dsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRps_Dsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TCODRPS.htm");
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
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCODRPS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCODRPS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TCODRPS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtRps_DscID_Internalname, A13817Rps_DscID, GXutil.rtrim( localUtil.format( A13817Rps_DscID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRps_DscID_Jsonclick, 0, "Attribute", "", "", "", "", edtRps_DscID_Visible, edtRps_DscID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TCODRPS.htm");
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
      e11XF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z7000Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( "Z7000Rps_Cod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7001Rps_Dsc = httpContext.cgiGet( "Z7001Rps_Dsc") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV26EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV28Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( "vRPS_COD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtRps_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtRps_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "RPS_COD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRps_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7000Rps_Cod = (short)(0) ;
               n7000Rps_Cod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
            }
            else
            {
               A7000Rps_Cod = (short)(localUtil.ctol( httpContext.cgiGet( edtRps_Cod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n7000Rps_Cod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
            }
            A7001Rps_Dsc = httpContext.cgiGet( edtRps_Dsc_Internalname) ;
            n7001Rps_Dsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
            A13817Rps_DscID = httpContext.cgiGet( edtRps_DscID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13817Rps_DscID", A13817Rps_DscID);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCODRPS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A7000Rps_Cod != Z7000Rps_Cod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tcodrps:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A7000Rps_Cod = (short)(GXutil.lval( httpContext.GetPar( "Rps_Cod"))) ;
               n7000Rps_Cod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
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
                  sMode991 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode991 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound991 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_XF0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "RPS_COD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtRps_Cod_Internalname ;
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
                        e11XF2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12XF2 ();
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
         e12XF2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAllXF991( ) ;
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
         disableAttributesXF991( ) ;
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

   public void confirm_XF0( )
   {
      beforeValidateXF991( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControlsXF991( ) ;
         }
         else
         {
            checkExtendedTableXF991( ) ;
            closeExtendedTableCursorsXF991( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaptionXF0( )
   {
   }

   public void e11XF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcodrps_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcodrps_impl.this.A396EmprCod = GXv_char2[0] ;
      tcodrps_impl.this.AV25EmprNom = GXv_char3[0] ;
      tcodrps_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXt_int5 = (byte)(AV32autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tcodrps_impl.this.GXt_int5 = GXv_int6[0] ;
      AV32autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32autonumber), 4, 0));
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tcodrps_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char4[0] = AV26EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tcodrps_impl.this.AV26EmprCod = GXv_char4[0] ;
      tcodrps_impl.this.AV25EmprNom = GXv_char3[0] ;
      tcodrps_impl.this.AV21UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprCod", AV26EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      GXv_SdtWWPContext7[0] = AV29WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV29WWPContext = GXv_SdtWWPContext7[0] ;
      AV30TrnContext.fromxml(AV31WebSession.getValue("TrnContext"), null, null);
      edtRps_DscID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRps_DscID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_DscID_Visible), 5, 0), true);
   }

   public void e12XF2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV30TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tcodrpsww", new String[] {}, new String[] {}) );
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

   public void zmXF991( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7001Rps_Dsc = T00XF3_A7001Rps_Dsc[0] ;
         }
         else
         {
            Z7001Rps_Dsc = A7001Rps_Dsc ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z7000Rps_Cod = A7000Rps_Cod ;
         Z7001Rps_Dsc = A7001Rps_Dsc ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV26EmprCod)==0) )
      {
         A396EmprCod = AV26EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00XF4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00XF4_A407EmprNom[0] ;
      n407EmprNom = T00XF4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV28Rps_Cod) )
      {
         A7000Rps_Cod = AV28Rps_Cod ;
         n7000Rps_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      }
      if ( ! (0==AV28Rps_Cod) )
      {
         edtRps_Cod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRps_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Cod_Enabled), 5, 0), true);
      }
      else
      {
         edtRps_Cod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRps_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Cod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV28Rps_Cod) )
      {
         edtRps_Cod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtRps_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Cod_Enabled), 5, 0), true);
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

   public void loadXF991( )
   {
      /* Using cursor T00XF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound991 = (short)(1) ;
         A407EmprNom = T00XF5_A407EmprNom[0] ;
         n407EmprNom = T00XF5_n407EmprNom[0] ;
         A7001Rps_Dsc = T00XF5_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = T00XF5_n7001Rps_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
         zmXF991( -9) ;
      }
      pr_default.close(3);
      onLoadActionsXF991( ) ;
   }

   public void onLoadActionsXF991( )
   {
      A13817Rps_DscID = GXutil.trim( GXutil.str( A7000Rps_Cod, 4, 0)) + "-" + GXutil.trim( A7001Rps_Dsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13817Rps_DscID", A13817Rps_DscID);
   }

   public void checkExtendedTableXF991( )
   {
      nIsDirty_991 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_991 = (short)(1) ;
      A13817Rps_DscID = GXutil.trim( GXutil.str( A7000Rps_Cod, 4, 0)) + "-" + GXutil.trim( A7001Rps_Dsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13817Rps_DscID", A13817Rps_DscID);
   }

   public void closeExtendedTableCursorsXF991( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKeyXF991( )
   {
      /* Using cursor T00XF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound991 = (short)(1) ;
      }
      else
      {
         RcdFound991 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00XF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T00XF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zmXF991( 9) ;
         RcdFound991 = (short)(1) ;
         A7000Rps_Cod = T00XF3_A7000Rps_Cod[0] ;
         n7000Rps_Cod = T00XF3_n7000Rps_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         A7001Rps_Dsc = T00XF3_A7001Rps_Dsc[0] ;
         n7001Rps_Dsc = T00XF3_n7001Rps_Dsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
         Z396EmprCod = A396EmprCod ;
         Z7000Rps_Cod = A7000Rps_Cod ;
         sMode991 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         loadXF991( ) ;
         if ( AnyError == 1 )
         {
            RcdFound991 = (short)(0) ;
            initializeNonKeyXF991( ) ;
         }
         Gx_mode = sMode991 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound991 = (short)(0) ;
         initializeNonKeyXF991( ) ;
         sMode991 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode991 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKeyXF991( ) ;
      if ( RcdFound991 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound991 = (short)(0) ;
      /* Using cursor T00XF7 */
      pr_default.execute(5, new Object[] {Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod), A396EmprCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00XF7_A7000Rps_Cod[0] < A7000Rps_Cod ) ) && ( GXutil.strcmp(T00XF7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00XF7_A7000Rps_Cod[0] > A7000Rps_Cod ) ) && ( GXutil.strcmp(T00XF7_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A7000Rps_Cod = T00XF7_A7000Rps_Cod[0] ;
            n7000Rps_Cod = T00XF7_n7000Rps_Cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
            RcdFound991 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound991 = (short)(0) ;
      /* Using cursor T00XF8 */
      pr_default.execute(6, new Object[] {Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod), A396EmprCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T00XF8_A7000Rps_Cod[0] > A7000Rps_Cod ) ) && ( GXutil.strcmp(T00XF8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T00XF8_A7000Rps_Cod[0] < A7000Rps_Cod ) ) && ( GXutil.strcmp(T00XF8_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A7000Rps_Cod = T00XF8_A7000Rps_Cod[0] ;
            n7000Rps_Cod = T00XF8_n7000Rps_Cod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
            RcdFound991 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKeyXF991( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtRps_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insertXF991( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound991 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7000Rps_Cod != Z7000Rps_Cod ) )
            {
               A7000Rps_Cod = Z7000Rps_Cod ;
               n7000Rps_Cod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "RPS_COD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtRps_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtRps_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               updateXF991( ) ;
               GX_FocusControl = edtRps_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7000Rps_Cod != Z7000Rps_Cod ) )
            {
               /* Insert record */
               GX_FocusControl = edtRps_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insertXF991( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "RPS_COD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtRps_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtRps_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insertXF991( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A7000Rps_Cod != Z7000Rps_Cod ) )
      {
         A7000Rps_Cod = Z7000Rps_Cod ;
         n7000Rps_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "RPS_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRps_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtRps_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrencyXF991( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00XF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCODRPS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z7001Rps_Dsc, T00XF2_A7001Rps_Dsc[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z7001Rps_Dsc, T00XF2_A7001Rps_Dsc[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tcodrps:[seudo value changed for attri]"+"Rps_Dsc");
               GXutil.writeLogRaw("Old: ",Z7001Rps_Dsc);
               GXutil.writeLogRaw("Current: ",T00XF2_A7001Rps_Dsc[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCODRPS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insertXF991( )
   {
      beforeValidateXF991( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXF991( ) ;
      }
      if ( AnyError == 0 )
      {
         zmXF991( 0) ;
         checkOptimisticConcurrencyXF991( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXF991( ) ;
            if ( AnyError == 0 )
            {
               beforeInsertXF991( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XF9 */
                  pr_default.execute(7, new Object[] {Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod), Boolean.valueOf(n7001Rps_Dsc), A7001Rps_Dsc, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODRPS");
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
                        resetCaptionXF0( ) ;
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
            loadXF991( ) ;
         }
         endLevelXF991( ) ;
      }
      closeExtendedTableCursorsXF991( ) ;
   }

   public void updateXF991( )
   {
      beforeValidateXF991( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTableXF991( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXF991( ) ;
         if ( AnyError == 0 )
         {
            afterConfirmXF991( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdateXF991( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00XF10 */
                  pr_default.execute(8, new Object[] {Boolean.valueOf(n7001Rps_Dsc), A7001Rps_Dsc, A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODRPS");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCODRPS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdateXF991( ) ;
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
         endLevelXF991( ) ;
      }
      closeExtendedTableCursorsXF991( ) ;
   }

   public void deferredUpdateXF991( )
   {
   }

   public void delete( )
   {
      beforeValidateXF991( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrencyXF991( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControlsXF991( ) ;
         afterConfirmXF991( ) ;
         if ( AnyError == 0 )
         {
            beforeDeleteXF991( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T00XF11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCODRPS");
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
      sMode991 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevelXF991( ) ;
      Gx_mode = sMode991 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControlsXF991( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13817Rps_DscID = GXutil.trim( GXutil.str( A7000Rps_Cod, 4, 0)) + "-" + GXutil.trim( A7001Rps_Dsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13817Rps_DscID", A13817Rps_DscID);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T00XF12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "No Conformidades", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T00XF13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n7000Rps_Cod), Short.valueOf(A7000Rps_Cod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevelXF991( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeCompleteXF991( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tcodrps");
         if ( AnyError == 0 )
         {
            confirmValuesXF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tcodrps");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStartXF991( )
   {
      /* Scan By routine */
      /* Using cursor T00XF14 */
      pr_default.execute(12, new Object[] {A396EmprCod});
      RcdFound991 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound991 = (short)(1) ;
         A7000Rps_Cod = T00XF14_A7000Rps_Cod[0] ;
         n7000Rps_Cod = T00XF14_n7000Rps_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNextXF991( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound991 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound991 = (short)(1) ;
         A7000Rps_Cod = T00XF14_A7000Rps_Cod[0] ;
         n7000Rps_Cod = T00XF14_n7000Rps_Cod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      }
   }

   public void scanEndXF991( )
   {
      pr_default.close(12);
   }

   public void afterConfirmXF991( )
   {
      /* After Confirm Rules */
      if ( (0==A7000Rps_Cod) && (0==AV32autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "RPS_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtRps_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsertXF991( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A7000Rps_Cod) && ( AV32autonumber == 1 ) )
      {
         GXt_int8 = A7000Rps_Cod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.tcodprd_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         tcodrps_impl.this.GXt_int8 = GXv_int9[0] ;
         A7000Rps_Cod = GXt_int8 ;
         n7000Rps_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      }
   }

   public void beforeUpdateXF991( )
   {
      /* Before Update Rules */
   }

   public void beforeDeleteXF991( )
   {
      /* Before Delete Rules */
   }

   public void beforeCompleteXF991( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidateXF991( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributesXF991( )
   {
      edtRps_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRps_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Cod_Enabled), 5, 0), true);
      edtRps_Dsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRps_Dsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_Dsc_Enabled), 5, 0), true);
      edtRps_DscID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtRps_DscID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRps_DscID_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashesXF991( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValuesXF0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tcodrps", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV28Rps_Cod,4,0))}, new String[] {"Gx_mode","EmprCod","Rps_Cod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCODRPS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tcodrps:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7000Rps_Cod", GXutil.ltrim( localUtil.ntoc( Z7000Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7001Rps_Dsc", GXutil.rtrim( Z7001Rps_Dsc));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV30TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV30TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV30TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV26EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV26EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRPS_COD", GXutil.ltrim( localUtil.ntoc( AV28Rps_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vRPS_COD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28Rps_Cod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV32autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ficherosbasicos.tcodrps", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV26EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV28Rps_Cod,4,0))}, new String[] {"Gx_mode","EmprCod","Rps_Cod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TCODRPS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Tipos de Responsabilidades", "") ;
   }

   public void initializeNonKeyXF991( )
   {
      A13817Rps_DscID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13817Rps_DscID", A13817Rps_DscID);
      A7001Rps_Dsc = "" ;
      n7001Rps_Dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7001Rps_Dsc", A7001Rps_Dsc);
      Z7001Rps_Dsc = "" ;
   }

   public void initAllXF991( )
   {
      A7000Rps_Cod = (short)(0) ;
      n7000Rps_Cod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      initializeNonKeyXF991( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821166198", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tcodrps.js", "?2026821166199", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtRps_Cod_Internalname = "RPS_COD" ;
      edtRps_Dsc_Internalname = "RPS_DSC" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtRps_DscID_Internalname = "RPS_DSCID" ;
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
      Form.setCaption( httpContext.getMessage( "Tipos de Responsabilidades", "") );
      edtRps_DscID_Jsonclick = "" ;
      edtRps_DscID_Enabled = 0 ;
      edtRps_DscID_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtRps_Dsc_Jsonclick = "" ;
      edtRps_Dsc_Enabled = 1 ;
      edtRps_Cod_Jsonclick = "" ;
      edtRps_Cod_Enabled = 1 ;
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

   public void gx3asarps_codXF991( short AV28Rps_Cod )
   {
      if ( ! (0==AV28Rps_Cod) )
      {
         A7000Rps_Cod = AV28Rps_Cod ;
         n7000Rps_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asarps_codXF991( short A7000Rps_Cod ,
                                   short AV32autonumber ,
                                   String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A7000Rps_Cod) && ( AV32autonumber == 1 ) )
      {
         GXt_int8 = A7000Rps_Cod ;
         GXv_int9[0] = GXt_int8 ;
         new app.ficherosbasicos.tcodprd_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int9) ;
         tcodrps_impl.this.GXt_int8 = GXv_int9[0] ;
         A7000Rps_Cod = GXt_int8 ;
         n7000Rps_Cod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A7000Rps_Cod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7000Rps_Cod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A7000Rps_Cod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV26EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV28Rps_Cod',fld:'vRPS_COD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12XF2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_RPS_COD","{handler:'valid_Rps_cod',iparms:[]");
      setEventMetadata("VALID_RPS_COD",",oparms:[]}");
      setEventMetadata("VALID_RPS_DSC","{handler:'valid_Rps_dsc',iparms:[]");
      setEventMetadata("VALID_RPS_DSC",",oparms:[]}");
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
      Z396EmprCod = "" ;
      Z7001Rps_Dsc = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV26EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A7001Rps_Dsc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A13817Rps_DscID = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode991 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV24Station = "" ;
      AV25EmprNom = "" ;
      AV21UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV29WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV30TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV31WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00XF4_A407EmprNom = new String[] {""} ;
      T00XF4_n407EmprNom = new boolean[] {false} ;
      T00XF5_A7000Rps_Cod = new short[1] ;
      T00XF5_n7000Rps_Cod = new boolean[] {false} ;
      T00XF5_A407EmprNom = new String[] {""} ;
      T00XF5_n407EmprNom = new boolean[] {false} ;
      T00XF5_A7001Rps_Dsc = new String[] {""} ;
      T00XF5_n7001Rps_Dsc = new boolean[] {false} ;
      T00XF5_A396EmprCod = new String[] {""} ;
      T00XF6_A396EmprCod = new String[] {""} ;
      T00XF6_A7000Rps_Cod = new short[1] ;
      T00XF6_n7000Rps_Cod = new boolean[] {false} ;
      T00XF3_A7000Rps_Cod = new short[1] ;
      T00XF3_n7000Rps_Cod = new boolean[] {false} ;
      T00XF3_A7001Rps_Dsc = new String[] {""} ;
      T00XF3_n7001Rps_Dsc = new boolean[] {false} ;
      T00XF3_A396EmprCod = new String[] {""} ;
      T00XF7_A396EmprCod = new String[] {""} ;
      T00XF7_A7000Rps_Cod = new short[1] ;
      T00XF7_n7000Rps_Cod = new boolean[] {false} ;
      T00XF8_A396EmprCod = new String[] {""} ;
      T00XF8_A7000Rps_Cod = new short[1] ;
      T00XF8_n7000Rps_Cod = new boolean[] {false} ;
      T00XF2_A7000Rps_Cod = new short[1] ;
      T00XF2_n7000Rps_Cod = new boolean[] {false} ;
      T00XF2_A7001Rps_Dsc = new String[] {""} ;
      T00XF2_n7001Rps_Dsc = new boolean[] {false} ;
      T00XF2_A396EmprCod = new String[] {""} ;
      T00XF12_A396EmprCod = new String[] {""} ;
      T00XF12_A13137NCHdr = new int[1] ;
      T00XF12_A13138NCHdrr = new byte[1] ;
      T00XF12_A13139NCHdrp = new String[] {""} ;
      T00XF13_A396EmprCod = new String[] {""} ;
      T00XF13_A539HisBarCod = new int[1] ;
      T00XF13_A545HisCodReo = new byte[1] ;
      T00XF13_A544HisCodPar = new String[] {""} ;
      T00XF13_A833TipDefCod = new short[1] ;
      T00XF14_A396EmprCod = new String[] {""} ;
      T00XF14_A7000Rps_Cod = new short[1] ;
      T00XF14_n7000Rps_Cod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int9 = new short[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tcodrps__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tcodrps__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tcodrps__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tcodrps__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tcodrps__default(),
         new Object[] {
             new Object[] {
            T00XF2_A7000Rps_Cod, T00XF2_A7001Rps_Dsc, T00XF2_n7001Rps_Dsc, T00XF2_A396EmprCod
            }
            , new Object[] {
            T00XF3_A7000Rps_Cod, T00XF3_A7001Rps_Dsc, T00XF3_n7001Rps_Dsc, T00XF3_A396EmprCod
            }
            , new Object[] {
            T00XF4_A407EmprNom, T00XF4_n407EmprNom
            }
            , new Object[] {
            T00XF5_A7000Rps_Cod, T00XF5_A407EmprNom, T00XF5_n407EmprNom, T00XF5_A7001Rps_Dsc, T00XF5_n7001Rps_Dsc, T00XF5_A396EmprCod
            }
            , new Object[] {
            T00XF6_A396EmprCod, T00XF6_A7000Rps_Cod
            }
            , new Object[] {
            T00XF7_A396EmprCod, T00XF7_A7000Rps_Cod
            }
            , new Object[] {
            T00XF8_A396EmprCod, T00XF8_A7000Rps_Cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T00XF12_A396EmprCod, T00XF12_A13137NCHdr, T00XF12_A13138NCHdrr, T00XF12_A13139NCHdrp
            }
            , new Object[] {
            T00XF13_A396EmprCod, T00XF13_A539HisBarCod, T00XF13_A545HisCodReo, T00XF13_A544HisCodPar, T00XF13_A833TipDefCod
            }
            , new Object[] {
            T00XF14_A396EmprCod, T00XF14_A7000Rps_Cod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV28Rps_Cod ;
   private short Z7000Rps_Cod ;
   private short AV28Rps_Cod ;
   private short A7000Rps_Cod ;
   private short AV32autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound991 ;
   private short nIsDirty_991 ;
   private short GXt_int8 ;
   private short GXv_int9[] ;
   private int trnEnded ;
   private int edtRps_Cod_Enabled ;
   private int edtRps_Dsc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtRps_DscID_Visible ;
   private int edtRps_DscID_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV26EmprCod ;
   private String Z396EmprCod ;
   private String Z7001Rps_Dsc ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV26EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtRps_Cod_Internalname ;
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
   private String edtRps_Cod_Jsonclick ;
   private String edtRps_Dsc_Internalname ;
   private String A7001Rps_Dsc ;
   private String edtRps_Dsc_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtRps_DscID_Internalname ;
   private String edtRps_DscID_Jsonclick ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode991 ;
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
   private boolean n7000Rps_Cod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n7001Rps_Dsc ;
   private boolean returnInSub ;
   private String A13817Rps_DscID ;
   private com.genexus.webpanels.WebSession AV31WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00XF4_A407EmprNom ;
   private boolean[] T00XF4_n407EmprNom ;
   private short[] T00XF5_A7000Rps_Cod ;
   private boolean[] T00XF5_n7000Rps_Cod ;
   private String[] T00XF5_A407EmprNom ;
   private boolean[] T00XF5_n407EmprNom ;
   private String[] T00XF5_A7001Rps_Dsc ;
   private boolean[] T00XF5_n7001Rps_Dsc ;
   private String[] T00XF5_A396EmprCod ;
   private String[] T00XF6_A396EmprCod ;
   private short[] T00XF6_A7000Rps_Cod ;
   private boolean[] T00XF6_n7000Rps_Cod ;
   private short[] T00XF3_A7000Rps_Cod ;
   private boolean[] T00XF3_n7000Rps_Cod ;
   private String[] T00XF3_A7001Rps_Dsc ;
   private boolean[] T00XF3_n7001Rps_Dsc ;
   private String[] T00XF3_A396EmprCod ;
   private String[] T00XF7_A396EmprCod ;
   private short[] T00XF7_A7000Rps_Cod ;
   private boolean[] T00XF7_n7000Rps_Cod ;
   private String[] T00XF8_A396EmprCod ;
   private short[] T00XF8_A7000Rps_Cod ;
   private boolean[] T00XF8_n7000Rps_Cod ;
   private short[] T00XF2_A7000Rps_Cod ;
   private boolean[] T00XF2_n7000Rps_Cod ;
   private String[] T00XF2_A7001Rps_Dsc ;
   private boolean[] T00XF2_n7001Rps_Dsc ;
   private String[] T00XF2_A396EmprCod ;
   private String[] T00XF12_A396EmprCod ;
   private int[] T00XF12_A13137NCHdr ;
   private byte[] T00XF12_A13138NCHdrr ;
   private String[] T00XF12_A13139NCHdrp ;
   private String[] T00XF13_A396EmprCod ;
   private int[] T00XF13_A539HisBarCod ;
   private byte[] T00XF13_A545HisCodReo ;
   private String[] T00XF13_A544HisCodPar ;
   private short[] T00XF13_A833TipDefCod ;
   private String[] T00XF14_A396EmprCod ;
   private short[] T00XF14_A7000Rps_Cod ;
   private boolean[] T00XF14_n7000Rps_Cod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV29WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV30TrnContext ;
}

final  class tcodrps__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodrps__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodrps__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodrps__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcodrps__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00XF2", "SELECT Rps_Cod, Rps_Dsc, EmprCod FROM TXPCODRPS WHERE EmprCod = ? AND Rps_Cod = ?  FOR UPDATE OF Rps_Dsc NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XF3", "SELECT Rps_Cod, Rps_Dsc, EmprCod FROM TXPCODRPS WHERE EmprCod = ? AND Rps_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XF4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XF5", "SELECT /*+ FIRST_ROWS(100) */ TM1.Rps_Cod, T2.EmprNom, TM1.Rps_Dsc, TM1.EmprCod FROM (TXPCODRPS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.Rps_Cod = ? ORDER BY TM1.EmprCod, TM1.Rps_Cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XF6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, Rps_Cod FROM TXPCODRPS WHERE EmprCod = ? AND Rps_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00XF7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Rps_Cod FROM TXPCODRPS WHERE ( Rps_Cod > ?) and EmprCod = ? ORDER BY EmprCod, Rps_Cod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XF8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, Rps_Cod FROM TXPCODRPS WHERE ( Rps_Cod < ?) and EmprCod = ? ORDER BY EmprCod DESC, Rps_Cod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T00XF9", "INSERT INTO TXPCODRPS(Rps_Cod, Rps_Dsc, EmprCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPCODRPS")
         ,new UpdateCursor("T00XF10", "UPDATE TXPCODRPS SET Rps_Dsc=?  WHERE EmprCod = ? AND Rps_Cod = ?", GX_NOMASK, "TXPCODRPS")
         ,new UpdateCursor("T00XF11", "DELETE FROM TXPCODRPS  WHERE EmprCod = ? AND Rps_Cod = ?", GX_NOMASK, "TXPCODRPS")
         ,new ForEachCursor("T00XF12", "SELECT * FROM (SELECT EmprCod, NCHdr, NCHdrr, NCHdrp FROM TXPNOCONF WHERE EmprCod = ? AND Rps_Cod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XF13", "SELECT * FROM (SELECT EmprCod, HisBarCod, HisCodReo, HisCodPar, TipDefCod FROM TXPHISREO WHERE EmprCod = ? AND Rps_Cod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T00XF14", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, Rps_Cod FROM TXPCODRPS WHERE EmprCod = ? ORDER BY EmprCod, Rps_Cod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
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
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 5 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 6 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 40);
               }
               stmt.setString(3, (String)parms[4], 3);
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 40);
               }
               stmt.setString(2, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[2]).shortValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

