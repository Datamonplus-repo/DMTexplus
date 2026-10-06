package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcdnenc_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TB1_COD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13785Tb1_codDsc = httpContext.GetPar( "Tb1_codDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatb1_cod1KI0( A396EmprCod, A13785Tb1_codDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"TB1_COD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13785Tb1_codDsc = httpContext.GetPar( "Tb1_codDsc") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgatb1_cod1KI0( A396EmprCod, A13785Tb1_codDsc) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"TB1_COD") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h9713Tb1_Cod = httpContext.GetPar( "h9713Tb1_Cod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcatb1_cod1KI1732( A396EmprCod, h9713Tb1_Cod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9713Tb1_Cod = (short)(GXutil.lval( httpContext.GetPar( "Tb1_Cod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A9713Tb1_Cod) ;
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
            AV32EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
            AV33PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33PrdNum", AV33PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33PrdNum, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos que NO se pueden utilizar en Cuardeno de Encargos", ""), (short)(0)) ;
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

   public tcdnenc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcdnenc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcdnenc_impl.class ));
   }

   public tcdnenc_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCdnEnc.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCdnEnc.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCdnEnc.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCdnEnc.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCdnEnc.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         nBlankRcdCount1732 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1732 = (short)(1) ;
            scanStart1KI1732( ) ;
            while ( RcdFound1732 != 0 )
            {
               init_level_properties1732( ) ;
               getByPrimaryKey1KI1732( ) ;
               addRow1KI1732( ) ;
               scanNext1KI1732( ) ;
            }
            scanEnd1KI1732( ) ;
            nBlankRcdCount1732 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1KI1732( ) ;
         standaloneModal1KI1732( ) ;
         sMode1732 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow1KI1732( ) ;
            edtTb1_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TB1_COD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_1732 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1KI1732( ) ;
            }
            sendRow1KI1732( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode1732 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1732 = (short)(5) ;
         nRcdExists_1732 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1KI1732( ) ;
            while ( RcdFound1732 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_321732( ) ;
               init_level_properties1732( ) ;
               standaloneNotModal1KI1732( ) ;
               getByPrimaryKey1KI1732( ) ;
               standaloneModal1KI1732( ) ;
               addRow1KI1732( ) ;
               scanNext1KI1732( ) ;
            }
            scanEnd1KI1732( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1732 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_321732( ) ;
         initAll1KI1732( ) ;
         init_level_properties1732( ) ;
         nRcdExists_1732 = (short)(0) ;
         nIsMod_1732 = (short)(0) ;
         nRcdDeleted_1732 = (short)(0) ;
         nBlankRcdCount1732 = (short)(nBlankRcdUsr1732+nBlankRcdCount1732) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1732 > 0 )
         {
            standaloneNotModal1KI1732( ) ;
            standaloneModal1KI1732( ) ;
            addRow1KI1732( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTb1_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1732 = (short)(nBlankRcdCount1732-1) ;
         }
         Gx_mode = sMode1732 ;
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
      e111KI2 ();
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
            Z718PrdNom = httpContext.cgiGet( "Z718PrdNom") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV33PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A9713Tb1_Cod = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCTB1_COD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A9715Tb1_Dsc = httpContext.cgiGet( "TB1_DSC") ;
            n9715Tb1_Dsc = false ;
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
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCdnEnc");
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            forbiddenHiddens.add("PrdNom", GXutil.rtrim( localUtil.format( A718PrdNom, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tcdnenc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A719PrdNum = httpContext.GetPar( "PrdNum") ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
                        confirm_1KI0( ) ;
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
                        e111KI2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121KI2 ();
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
         e121KI2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1KI29( ) ;
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
         disableAttributes1KI29( ) ;
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

   public void confirm_1KI0( )
   {
      beforeValidate1KI29( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1KI29( ) ;
         }
         else
         {
            checkExtendedTable1KI29( ) ;
            closeExtendedTableCursors1KI29( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_1KI1732( ) ;
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

   public void confirm_1KI1732( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1KI1732( ) ;
         if ( ( nRcdExists_1732 != 0 ) || ( nIsMod_1732 != 0 ) )
         {
            getKey1KI1732( ) ;
            if ( ( nRcdExists_1732 == 0 ) && ( nRcdDeleted_1732 == 0 ) )
            {
               if ( RcdFound1732 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1KI1732( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1KI1732( ) ;
                     closeExtendedTableCursors1KI1732( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1732 != 0 )
               {
                  if ( nRcdDeleted_1732 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1KI1732( ) ;
                     load1KI1732( ) ;
                     beforeValidate1KI1732( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1KI1732( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1732 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1KI1732( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1KI1732( ) ;
                           closeExtendedTableCursors1KI1732( ) ;
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
                  if ( nRcdDeleted_1732 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTb1_Cod_Internalname, h9713Tb1_Cod) ;
         httpContext.changePostValue( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1732_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1732_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1732_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1732 != 0 )
         {
            httpContext.changePostValue( "TB1_COD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1KI0( )
   {
   }

   public void e111KI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcdnenc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcdnenc_impl.this.A396EmprCod = GXv_char2[0] ;
      tcdnenc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcdnenc_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tcdnenc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tcdnenc_impl.this.AV32EmprCod = GXv_char4[0] ;
      tcdnenc_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcdnenc_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV34WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV34WWPContext = GXv_SdtWWPContext5[0] ;
      AV35TrnContext.fromxml(AV36WebSession.getValue("TrnContext"), null, null);
   }

   public void e121KI2( )
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

   public void zm1KI29( int GX_JID )
   {
      if ( ( GX_JID == 7 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T01KI6_A718PrdNom[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
         }
      }
      if ( GX_JID == -7 )
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
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01KI7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01KI7_A407EmprNom[0] ;
      n407EmprNom = T01KI7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV33PrdNum)==0) )
      {
         A719PrdNum = AV33PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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

   public void load1KI29( )
   {
      /* Using cursor T01KI8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T01KI8_A407EmprNom[0] ;
         n407EmprNom = T01KI8_n407EmprNom[0] ;
         A718PrdNom = T01KI8_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         zm1KI29( -7) ;
      }
      pr_default.close(6);
      onLoadActions1KI29( ) ;
   }

   public void onLoadActions1KI29( )
   {
   }

   public void checkExtendedTable1KI29( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1KI29( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1KI29( )
   {
      /* Using cursor T01KI9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01KI6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(4) != 101) && ( GXutil.strcmp(T01KI6_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KI29( 7) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01KI6_A719PrdNum[0] ;
         n719PrdNum = T01KI6_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T01KI6_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1KI29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1KI29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1KI29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1KI29( ) ;
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
      /* Using cursor T01KI10 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01KI10_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T01KI10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01KI10_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T01KI10_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01KI10_A719PrdNum[0] ;
            n719PrdNum = T01KI10_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01KI11 */
      pr_default.execute(9, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KI11_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T01KI11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01KI11_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T01KI11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01KI11_A719PrdNum[0] ;
            n719PrdNum = T01KI11_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1KI29( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1KI29( ) ;
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
               A719PrdNum = Z719PrdNum ;
               n719PrdNum = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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
               update1KI29( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               /* Insert record */
               insert1KI29( ) ;
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
                  insert1KI29( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
      {
         A719PrdNum = Z719PrdNum ;
         n719PrdNum = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
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

   public void checkOptimisticConcurrency1KI29( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01KI5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) || ( GXutil.strcmp(Z718PrdNom, T01KI5_A718PrdNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01KI5_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tcdnenc:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01KI5_A718PrdNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KI29( )
   {
      beforeValidate1KI29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KI29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KI29( 0) ;
         checkOptimisticConcurrency1KI29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KI29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KI29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KI12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A718PrdNom, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
                        processLevel1KI29( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1KI0( ) ;
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
            load1KI29( ) ;
         }
         endLevel1KI29( ) ;
      }
      closeExtendedTableCursors1KI29( ) ;
   }

   public void update1KI29( )
   {
      beforeValidate1KI29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KI29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KI29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KI29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1KI29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KI13 */
                  pr_default.execute(11, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1KI29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1KI29( ) ;
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
         endLevel1KI29( ) ;
      }
      closeExtendedTableCursors1KI29( ) ;
   }

   public void deferredUpdate1KI29( )
   {
   }

   public void delete( )
   {
      beforeValidate1KI29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KI29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KI29( ) ;
         afterConfirm1KI29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KI29( ) ;
            if ( AnyError == 0 )
            {
               scanStart1KI1732( ) ;
               while ( RcdFound1732 != 0 )
               {
                  getByPrimaryKey1KI1732( ) ;
                  delete1KI1732( ) ;
                  scanNext1KI1732( ) ;
               }
               scanEnd1KI1732( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KI14 */
                  pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KI29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KI29( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01KI15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01KI16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01KI17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01KI18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01KI19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01KI20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01KI21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01KI22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01KI23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01KI24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01KI25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01KI26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01KI27 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01KI28 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01KI29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01KI30 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01KI31 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01KI32 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01KI33 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01KI34 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01KI35 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01KI36 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01KI37 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01KI38 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01KI39 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01KI40 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01KI41 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01KI42 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01KI43 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01KI44 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01KI45 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01KI46 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01KI47 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01KI48 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01KI49 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01KI50 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01KI51 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01KI52 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01KI53 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01KI54 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01KI55 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01KI56 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROPRV", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01KI57 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01KI58 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01KI59 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01KI60 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01KI61 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01KI62 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01KI63 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01KI64 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01KI65 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01KI66 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01KI67 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01KI68 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01KI69 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01KI70 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01KI71 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01KI72 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01KI73 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01KI74 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01KI75 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01KI76 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01KI77 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01KI78 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01KI79 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01KI80 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01KI81 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01KI82 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01KI83 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01KI84 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01KI85 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
         /* Using cursor T01KI86 */
         pr_default.execute(84, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(84) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(84);
      }
   }

   public void processNestedLevel1KI1732( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1KI1732( ) ;
         if ( ( nRcdExists_1732 != 0 ) || ( nIsMod_1732 != 0 ) )
         {
            standaloneNotModal1KI1732( ) ;
            getKey1KI1732( ) ;
            if ( ( nRcdExists_1732 == 0 ) && ( nRcdDeleted_1732 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1KI1732( ) ;
            }
            else
            {
               if ( RcdFound1732 != 0 )
               {
                  if ( ( nRcdDeleted_1732 != 0 ) && ( nRcdExists_1732 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1KI1732( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1732 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1KI1732( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1732 == 0 )
                  {
                     GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTb1_Cod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTb1_Cod_Internalname, h9713Tb1_Cod) ;
         httpContext.changePostValue( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1732_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1732_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1732_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1732 != 0 )
         {
            httpContext.changePostValue( "TB1_COD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1KI1732( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1732 = (short)(0) ;
      nIsMod_1732 = (short)(0) ;
      nRcdDeleted_1732 = (short)(0) ;
   }

   public void processLevel1KI29( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1KI1732( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1KI29( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1KI29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcdnenc");
         if ( AnyError == 0 )
         {
            confirmValues1KI0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcdnenc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1KI29( )
   {
      /* Scan By routine */
      /* Using cursor T01KI87 */
      pr_default.execute(85, new Object[] {A396EmprCod});
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01KI87_A719PrdNum[0] ;
         n719PrdNum = T01KI87_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KI29( )
   {
      /* Scan next routine */
      pr_default.readNext(85);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01KI87_A719PrdNum[0] ;
         n719PrdNum = T01KI87_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1KI29( )
   {
      pr_default.close(85);
   }

   public void afterConfirm1KI29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KI29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KI29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KI29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KI29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KI29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KI29( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
   }

   public void zm1KI1732( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -9 )
      {
         Z719PrdNum = A719PrdNum ;
         Z396EmprCod = A396EmprCod ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         Z9715Tb1_Dsc = A9715Tb1_Dsc ;
      }
   }

   public void standaloneNotModal1KI1732( )
   {
   }

   public void standaloneModal1KI1732( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTb1_Cod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtTb1_Cod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void load1KI1732( )
   {
      /* Using cursor T01KI88 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound1732 = (short)(1) ;
         A9715Tb1_Dsc = T01KI88_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = T01KI88_n9715Tb1_Dsc[0] ;
         zm1KI1732( -9) ;
      }
      pr_default.close(86);
      onLoadActions1KI1732( ) ;
   }

   public void onLoadActions1KI1732( )
   {
      /* Using cursor T01KI89 */
      pr_default.execute(87, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      h9713Tb1_Cod = "" ;
      while ( (pr_default.getStatus(87) != 101) )
      {
         h9713Tb1_Cod = T01KI89_A13785Tb1_codDsc[0] ;
         if (true) break;
      }
      pr_default.close(87);
      httpContext.ajax_rsp_assign_attri("", false, "h9713Tb1_Cod", h9713Tb1_Cod);
   }

   public void checkExtendedTable1KI1732( )
   {
      nIsDirty_1732 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1KI1732( ) ;
      if ( (GXutil.strcmp("", h9713Tb1_Cod)==0) )
      {
         nIsDirty_1732 = (short)(1) ;
         A9713Tb1_Cod = (short)(0) ;
      }
      else
      {
         A13785Tb1_codDsc = h9713Tb1_Cod ;
         /* Using cursor T01KI90 */
         pr_default.execute(88, new Object[] {A13785Tb1_codDsc, A396EmprCod});
         A396EmprCod = T01KI90_A396EmprCod[0] ;
         A9713Tb1_Cod = T01KI90_A9713Tb1_Cod[0] ;
         A9713Tb1_Cod = T01KI90_A9713Tb1_Cod[0] ;
         if ( ! ( (pr_default.getStatus(88) == 101) ) )
         {
            pr_default.readNext(88);
            if ( ! ( (pr_default.getStatus(88) == 101) ) )
            {
               GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTb1_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(88);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9713Tb1_Cod", h9713Tb1_Cod);
      if ( (GXutil.strcmp("", h9713Tb1_Cod)==0) )
      {
         nIsDirty_1732 = (short)(1) ;
         A9713Tb1_Cod = (short)(0) ;
      }
      else
      {
         A13785Tb1_codDsc = h9713Tb1_Cod ;
         /* Using cursor T01KI91 */
         pr_default.execute(89, new Object[] {A13785Tb1_codDsc, A396EmprCod});
         A9713Tb1_Cod = T01KI91_A9713Tb1_Cod[0] ;
         A9713Tb1_Cod = T01KI91_A9713Tb1_Cod[0] ;
         if ( ! ( (pr_default.getStatus(89) == 101) ) )
         {
            pr_default.readNext(89);
            if ( ! ( (pr_default.getStatus(89) == 101) ) )
            {
               GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTb1_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(89);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9713Tb1_Cod", h9713Tb1_Cod);
      /* Using cursor T01KI4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTb1_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9715Tb1_Dsc = T01KI4_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01KI4_n9715Tb1_Dsc[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1KI1732( )
   {
      pr_default.close(2);
   }

   public void enableDisable1KI1732( )
   {
   }

   public void gxload_10( String A396EmprCod ,
                          short A9713Tb1_Cod )
   {
      /* Using cursor T01KI92 */
      pr_default.execute(90, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(90) == 101) )
      {
         GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtTb1_Cod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9715Tb1_Dsc = T01KI92_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01KI92_n9715Tb1_Dsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9715Tb1_Dsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(90) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(90);
   }

   public void getKey1KI1732( )
   {
      if ( (GXutil.strcmp("", h9713Tb1_Cod)==0) )
      {
         A9713Tb1_Cod = (short)(0) ;
      }
      else
      {
         A13785Tb1_codDsc = h9713Tb1_Cod ;
         /* Using cursor T01KI93 */
         pr_default.execute(91, new Object[] {A13785Tb1_codDsc, A396EmprCod});
         A396EmprCod = T01KI93_A396EmprCod[0] ;
         A9713Tb1_Cod = T01KI93_A9713Tb1_Cod[0] ;
         A9713Tb1_Cod = T01KI93_A9713Tb1_Cod[0] ;
         if ( ! ( (pr_default.getStatus(91) == 101) ) )
         {
            pr_default.readNext(91);
            if ( ! ( (pr_default.getStatus(91) == 101) ) )
            {
               GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtTb1_Cod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(91);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9713Tb1_Cod", h9713Tb1_Cod);
      /* Using cursor T01KI94 */
      pr_default.execute(92, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(92) != 101) )
      {
         RcdFound1732 = (short)(1) ;
      }
      else
      {
         RcdFound1732 = (short)(0) ;
      }
      pr_default.close(92);
   }

   public void getByPrimaryKey1KI1732( )
   {
      /* Using cursor T01KI3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01KI3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1KI1732( 9) ;
         RcdFound1732 = (short)(1) ;
         initializeNonKey1KI1732( ) ;
         A9713Tb1_Cod = T01KI3_A9713Tb1_Cod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z9713Tb1_Cod = A9713Tb1_Cod ;
         sMode1732 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1KI1732( ) ;
         Gx_mode = sMode1732 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1732 = (short)(0) ;
         initializeNonKey1KI1732( ) ;
         sMode1732 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1KI1732( ) ;
         Gx_mode = sMode1732 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1KI1732( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1KI1732( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h9713Tb1_Cod)==0) )
         {
            A9713Tb1_Cod = (short)(0) ;
         }
         else
         {
            A13785Tb1_codDsc = h9713Tb1_Cod ;
            /* Using cursor T01KI95 */
            pr_default.execute(93, new Object[] {A13785Tb1_codDsc, A396EmprCod});
            A396EmprCod = T01KI95_A396EmprCod[0] ;
            A9713Tb1_Cod = T01KI95_A9713Tb1_Cod[0] ;
            A9713Tb1_Cod = T01KI95_A9713Tb1_Cod[0] ;
            if ( ! ( (pr_default.getStatus(93) == 101) ) )
            {
               pr_default.readNext(93);
               if ( ! ( (pr_default.getStatus(93) == 101) ) )
               {
                  GXCCtl = "TB1_COD_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTb1_Cod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(93);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h9713Tb1_Cod", h9713Tb1_Cod);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01KI2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCdnEnc"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCdnEnc"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1KI1732( )
   {
      beforeValidate1KI1732( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KI1732( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1KI1732( 0) ;
         checkOptimisticConcurrency1KI1732( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1KI1732( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1KI1732( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01KI96 */
                  pr_default.execute(94, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCdnEnc");
                  if ( (pr_default.getStatus(94) == 1) )
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
            load1KI1732( ) ;
         }
         endLevel1KI1732( ) ;
      }
      closeExtendedTableCursors1KI1732( ) ;
   }

   public void update1KI1732( )
   {
      beforeValidate1KI1732( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1KI1732( ) ;
      }
      if ( ( nIsMod_1732 != 0 ) || ( nIsDirty_1732 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1KI1732( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1KI1732( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1KI1732( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPCdnEnc */
                     deferredUpdate1KI1732( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1KI1732( ) ;
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
            endLevel1KI1732( ) ;
         }
      }
      closeExtendedTableCursors1KI1732( ) ;
   }

   public void deferredUpdate1KI1732( )
   {
   }

   public void delete1KI1732( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1KI1732( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1KI1732( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1KI1732( ) ;
         afterConfirm1KI1732( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1KI1732( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01KI97 */
               pr_default.execute(95, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Short.valueOf(A9713Tb1_Cod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCdnEnc");
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
      sMode1732 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1KI1732( ) ;
      Gx_mode = sMode1732 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1KI1732( )
   {
      standaloneModal1KI1732( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01KI98 */
         pr_default.execute(96, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
         A9715Tb1_Dsc = T01KI98_A9715Tb1_Dsc[0] ;
         n9715Tb1_Dsc = T01KI98_n9715Tb1_Dsc[0] ;
         pr_default.close(96);
      }
   }

   public void endLevel1KI1732( )
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

   public void scanStart1KI1732( )
   {
      /* Scan By routine */
      /* Using cursor T01KI99 */
      pr_default.execute(97, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound1732 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound1732 = (short)(1) ;
         A9713Tb1_Cod = T01KI99_A9713Tb1_Cod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1KI1732( )
   {
      /* Scan next routine */
      pr_default.readNext(97);
      RcdFound1732 = (short)(0) ;
      if ( (pr_default.getStatus(97) != 101) )
      {
         RcdFound1732 = (short)(1) ;
         A9713Tb1_Cod = T01KI99_A9713Tb1_Cod[0] ;
      }
   }

   public void scanEnd1KI1732( )
   {
      pr_default.close(97);
   }

   public void afterConfirm1KI1732( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1KI1732( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1KI1732( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1KI1732( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1KI1732( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1KI1732( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1KI1732( )
   {
      edtTb1_Cod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes1KI1732( )
   {
   }

   public void send_integrity_lvl_hashes1KI29( )
   {
   }

   public void subsflControlProps_321732( )
   {
      edtTb1_Cod_Internalname = "TB1_COD_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_321732( )
   {
      edtTb1_Cod_Internalname = "TB1_COD_"+sGXsfl_32_fel_idx ;
   }

   public void addRow1KI1732( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321732( ) ;
      sendRow1KI1732( ) ;
   }

   public void sendRow1KI1732( )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1732_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTb1_Cod_Internalname,h9713Tb1_Cod,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTb1_Cod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtTb1_Cod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(90),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1KI1732( ) ;
      GXCCtl = "GXHCTB1_COD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z9713Tb1_Cod_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1732_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1732_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1732_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1732, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vPRDNUM_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33PrdNum));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "TB1_COD_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1KI1732( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321732( ) ;
      edtTb1_Cod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TB1_COD_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      h9713Tb1_Cod = httpContext.cgiGet( edtTb1_Cod_Internalname) ;
      GXCCtl = "GXHCTB1_COD_" + sGXsfl_32_idx ;
      A9713Tb1_Cod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z9713Tb1_Cod_" + sGXsfl_32_idx ;
      Z9713Tb1_Cod = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1732_" + sGXsfl_32_idx ;
      nRcdDeleted_1732 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1732_" + sGXsfl_32_idx ;
      nRcdExists_1732 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1732_" + sGXsfl_32_idx ;
      nIsMod_1732 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtTb1_Cod_Enabled = edtTb1_Cod_Enabled ;
   }

   public void confirmValues1KI0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_321732( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_321732( ) ;
         httpContext.changePostValue( "Z9713Tb1_Cod_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z9713Tb1_Cod_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcdnenc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCdnEnc");
      forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("PrdNom", GXutil.rtrim( localUtil.format( A718PrdNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tcdnenc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z718PrdNom", GXutil.rtrim( Z718PrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV33PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCTB1_COD", GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TB1_DSC", GXutil.rtrim( A9715Tb1_Dsc));
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
      return formatLink("app.tcdnenc", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"})  ;
   }

   public String getPgmname( )
   {
      return "TCdnEnc" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos que NO se pueden utilizar en Cuardeno de Encargos", "") ;
   }

   public void initializeNonKey1KI29( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      Z718PrdNom = "" ;
   }

   public void initAll1KI29( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1KI29( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1KI1732( )
   {
      A9715Tb1_Dsc = "" ;
      n9715Tb1_Dsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", A9715Tb1_Dsc);
   }

   public void initAll1KI1732( )
   {
      h9713Tb1_Cod = "" ;
      initializeNonKey1KI1732( ) ;
   }

   public void standaloneModalInsert1KI1732( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211664366", true, true);
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
      httpContext.AddJavascriptSource("tcdnenc.js", "?20268211664366", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1732( )
   {
      edtTb1_Cod_Enabled = defedtTb1_Cod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtTb1_Cod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTb1_Cod_Enabled), 5, 0), !bGXsfl_32_Refreshing);
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
      Gridlevel_level1Column.AddObjectProperty("Value", h9713Tb1_Cod);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTb1_Cod_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtTb1_Cod_Internalname = "TB1_COD" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
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
      Form.setCaption( httpContext.getMessage( "Productos que NO se pueden utilizar en Cuardeno de Encargos", "") );
      edtTb1_Cod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      edtTb1_Cod_Enabled = 1 ;
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

   public void gxsgatb1_cod1KI0( String A396EmprCod ,
                                 String A13785Tb1_codDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgatb1_cod_data1KI0( A396EmprCod, A13785Tb1_codDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgatb1_cod_data1KI0( String A396EmprCod ,
                                         String A13785Tb1_codDsc )
   {
      l13785Tb1_codDsc = GXutil.concat( GXutil.rtrim( A13785Tb1_codDsc), "%", "") ;
      /* Using cursor T01KI100 */
      pr_default.execute(98, new Object[] {A396EmprCod, l13785Tb1_codDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(98) != 101) )
      {
         gxdynajaxctrlcodr.add(T01KI100_A13785Tb1_codDsc[0]);
         gxdynajaxctrldescr.add(T01KI100_A13785Tb1_codDsc[0]);
         pr_default.readNext(98);
      }
      pr_default.close(98);
   }

   public void gxhcatb1_cod1KI1732( String A396EmprCod ,
                                    String A13785Tb1_codDsc )
   {
      /* Using cursor T01KI101 */
      pr_default.execute(99, new Object[] {A13785Tb1_codDsc, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(99) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13785Tb1_codDsc = T01KI101_A13785Tb1_codDsc[0] ;
         A396EmprCod = T01KI101_A396EmprCod[0] ;
         A9713Tb1_Cod = T01KI101_A9713Tb1_Cod[0] ;
         pr_default.readNext(99);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(99);
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_321732( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1KI1732( ) ;
         standaloneModal1KI1732( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1KI1732( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_321732( ) ;
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

   public void valid_Tb1_cod( )
   {
      n9715Tb1_Dsc = false ;
      if ( (GXutil.strcmp("", h9713Tb1_Cod)==0) )
      {
         A9713Tb1_Cod = (short)(0) ;
      }
      else
      {
         A13785Tb1_codDsc = h9713Tb1_Cod ;
         /* Using cursor T01KI102 */
         pr_default.execute(100, new Object[] {A13785Tb1_codDsc, A396EmprCod});
         A9713Tb1_Cod = T01KI102_A9713Tb1_Cod[0] ;
         A9713Tb1_Cod = T01KI102_A9713Tb1_Cod[0] ;
         if ( ! ( (pr_default.getStatus(100) == 101) ) )
         {
            pr_default.readNext(100);
            if ( ! ( (pr_default.getStatus(100) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "TB1_COD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTb1_Cod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(100);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h9713Tb1_Cod", h9713Tb1_Cod);
      /* Using cursor T01KI103 */
      pr_default.execute(101, new Object[] {A396EmprCod, Short.valueOf(A9713Tb1_Cod)});
      if ( (pr_default.getStatus(101) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TABLE1", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TB1_COD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTb1_Cod_Internalname ;
      }
      A9715Tb1_Dsc = T01KI103_A9715Tb1_Dsc[0] ;
      n9715Tb1_Dsc = T01KI103_n9715Tb1_Dsc[0] ;
      pr_default.close(101);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9713Tb1_Cod", GXutil.ltrim( localUtil.ntoc( A9713Tb1_Cod, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A9715Tb1_Dsc", GXutil.rtrim( A9715Tb1_Dsc));
      httpContext.ajax_rsp_assign_attri("", false, "h9713Tb1_Cod", h9713Tb1_Cod);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33PrdNum',fld:'vPRDNUM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121KI2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_TB1_COD","{handler:'valid_Tb1_cod',iparms:[{av:'h9713Tb1_Cod'},{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9715Tb1_Dsc',fld:'TB1_DSC',pic:''}]");
      setEventMetadata("VALID_TB1_COD",",oparms:[{av:'A9713Tb1_Cod',fld:'TB1_COD',pic:'ZZZ9'},{av:'A9715Tb1_Dsc',fld:'TB1_DSC',pic:''},{av:'h9713Tb1_Cod'}]}");
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
      pr_default.close(101);
      pr_default.close(96);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV33PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13785Tb1_codDsc = "" ;
      h9713Tb1_Cod = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV33PrdNum = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1732 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A9715Tb1_Dsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
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
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV34WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T01KI7_A407EmprNom = new String[] {""} ;
      T01KI7_n407EmprNom = new boolean[] {false} ;
      T01KI8_A719PrdNum = new String[] {""} ;
      T01KI8_n719PrdNum = new boolean[] {false} ;
      T01KI8_A407EmprNom = new String[] {""} ;
      T01KI8_n407EmprNom = new boolean[] {false} ;
      T01KI8_A718PrdNom = new String[] {""} ;
      T01KI8_A396EmprCod = new String[] {""} ;
      T01KI9_A396EmprCod = new String[] {""} ;
      T01KI9_A719PrdNum = new String[] {""} ;
      T01KI9_n719PrdNum = new boolean[] {false} ;
      T01KI6_A719PrdNum = new String[] {""} ;
      T01KI6_n719PrdNum = new boolean[] {false} ;
      T01KI6_A718PrdNom = new String[] {""} ;
      T01KI6_A396EmprCod = new String[] {""} ;
      T01KI10_A396EmprCod = new String[] {""} ;
      T01KI10_A719PrdNum = new String[] {""} ;
      T01KI10_n719PrdNum = new boolean[] {false} ;
      T01KI11_A396EmprCod = new String[] {""} ;
      T01KI11_A719PrdNum = new String[] {""} ;
      T01KI11_n719PrdNum = new boolean[] {false} ;
      T01KI5_A719PrdNum = new String[] {""} ;
      T01KI5_n719PrdNum = new boolean[] {false} ;
      T01KI5_A718PrdNom = new String[] {""} ;
      T01KI5_A396EmprCod = new String[] {""} ;
      T01KI15_A396EmprCod = new String[] {""} ;
      T01KI15_A719PrdNum = new String[] {""} ;
      T01KI15_n719PrdNum = new boolean[] {false} ;
      T01KI15_A13217NormaID = new String[] {""} ;
      T01KI16_A396EmprCod = new String[] {""} ;
      T01KI16_A719PrdNum = new String[] {""} ;
      T01KI16_n719PrdNum = new boolean[] {false} ;
      T01KI16_A13586TheList = new String[] {""} ;
      T01KI17_A396EmprCod = new String[] {""} ;
      T01KI17_A5532Lb_numero = new int[1] ;
      T01KI17_A5555Lb_opcion = new String[] {""} ;
      T01KI17_A13460Lb_linCP = new short[1] ;
      T01KI17_A13458Lb_TipCP = new String[] {""} ;
      T01KI18_A396EmprCod = new String[] {""} ;
      T01KI18_A13418AlbProID = new int[1] ;
      T01KI18_A13442AlbProLine = new short[1] ;
      T01KI19_A396EmprCod = new String[] {""} ;
      T01KI19_A13324LDESID = new int[1] ;
      T01KI19_A13333LDESNPeque = new String[] {""} ;
      T01KI19_A13337LDESComb = new String[] {""} ;
      T01KI19_A13339LDESFondo = new String[] {""} ;
      T01KI19_A13342LDESLinea = new short[1] ;
      T01KI20_A396EmprCod = new String[] {""} ;
      T01KI20_A13312Lb_NLab = new int[1] ;
      T01KI20_A13305Lb_IDVeces = new short[1] ;
      T01KI20_A13306Lb_LinID = new short[1] ;
      T01KI21_A396EmprCod = new String[] {""} ;
      T01KI21_A12673LavMqId = new int[1] ;
      T01KI21_A12692LavMqLnPq = new short[1] ;
      T01KI21_A12681LavMqLn = new short[1] ;
      T01KI22_A396EmprCod = new String[] {""} ;
      T01KI22_A12236PrdNumD = new String[] {""} ;
      T01KI22_A719PrdNum = new String[] {""} ;
      T01KI22_n719PrdNum = new boolean[] {false} ;
      T01KI23_A396EmprCod = new String[] {""} ;
      T01KI23_A12225DocDisID = new long[1] ;
      T01KI23_A12226LinDisID = new short[1] ;
      T01KI24_A396EmprCod = new String[] {""} ;
      T01KI24_A12225DocDisID = new long[1] ;
      T01KI25_A396EmprCod = new String[] {""} ;
      T01KI25_A12205OrdenCID = new long[1] ;
      T01KI25_A12206OrdenCLnId = new short[1] ;
      T01KI26_A396EmprCod = new String[] {""} ;
      T01KI26_A719PrdNum = new String[] {""} ;
      T01KI26_n719PrdNum = new boolean[] {false} ;
      T01KI26_A11664LoteID = new String[] {""} ;
      T01KI26_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01KI27_A396EmprCod = new String[] {""} ;
      T01KI27_A4850DevComCod = new int[1] ;
      T01KI27_A719PrdNum = new String[] {""} ;
      T01KI27_n719PrdNum = new boolean[] {false} ;
      T01KI28_A396EmprCod = new String[] {""} ;
      T01KI28_A252CliCod = new int[1] ;
      T01KI28_A494ForSer = new String[] {""} ;
      T01KI28_A482ForColNom = new String[] {""} ;
      T01KI28_A483ForColNum = new int[1] ;
      T01KI28_A831TipColCod = new byte[1] ;
      T01KI28_A3571EnsCod = new String[] {""} ;
      T01KI28_A3582EnsLin = new short[1] ;
      T01KI29_A396EmprCod = new String[] {""} ;
      T01KI29_A129BarCod = new int[1] ;
      T01KI29_A132BarCodReo = new byte[1] ;
      T01KI29_A130BarCodPar = new String[] {""} ;
      T01KI29_A4075recestncol = new byte[1] ;
      T01KI29_A4076recestnpro = new byte[1] ;
      T01KI29_A4108recestlin = new short[1] ;
      T01KI30_A396EmprCod = new String[] {""} ;
      T01KI30_A4052EstNumFor = new int[1] ;
      T01KI30_A4053EstNumCol = new byte[1] ;
      T01KI30_A4090EstEspLin = new byte[1] ;
      T01KI31_A396EmprCod = new String[] {""} ;
      T01KI31_A4052EstNumFor = new int[1] ;
      T01KI31_A4053EstNumCol = new byte[1] ;
      T01KI31_A4084EstProLin = new byte[1] ;
      T01KI32_A396EmprCod = new String[] {""} ;
      T01KI32_A11644TransferId = new long[1] ;
      T01KI32_A11653TransferLn = new int[1] ;
      T01KI33_A396EmprCod = new String[] {""} ;
      T01KI33_A11634TaesId = new String[] {""} ;
      T01KI33_A11637TaesLn = new short[1] ;
      T01KI33_A11641TaesLnP = new short[1] ;
      T01KI34_A396EmprCod = new String[] {""} ;
      T01KI34_A719PrdNum = new String[] {""} ;
      T01KI34_n719PrdNum = new boolean[] {false} ;
      T01KI34_A11329H_stklin = new long[1] ;
      T01KI35_A396EmprCod = new String[] {""} ;
      T01KI35_A11270Pot_num = new int[1] ;
      T01KI35_A11271Pot_lin = new short[1] ;
      T01KI36_A396EmprCod = new String[] {""} ;
      T01KI36_A719PrdNum = new String[] {""} ;
      T01KI36_n719PrdNum = new boolean[] {false} ;
      T01KI36_A11199PrdNcasC = new String[] {""} ;
      T01KI37_A396EmprCod = new String[] {""} ;
      T01KI37_A719PrdNum = new String[] {""} ;
      T01KI37_n719PrdNum = new boolean[] {false} ;
      T01KI37_A11197CFraseR = new String[] {""} ;
      T01KI38_A396EmprCod = new String[] {""} ;
      T01KI38_A10243Jt_codigo = new short[1] ;
      T01KI38_A10246Jt_ord = new short[1] ;
      T01KI39_A396EmprCod = new String[] {""} ;
      T01KI39_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01KI39_A10238Bny_lin = new short[1] ;
      T01KI40_A396EmprCod = new String[] {""} ;
      T01KI40_A129BarCod = new int[1] ;
      T01KI40_A132BarCodReo = new byte[1] ;
      T01KI40_A130BarCodPar = new String[] {""} ;
      T01KI40_A758ProCod = new String[] {""} ;
      T01KI40_A194BarOrdLin = new short[1] ;
      T01KI40_A719PrdNum = new String[] {""} ;
      T01KI40_n719PrdNum = new boolean[] {false} ;
      T01KI41_A396EmprCod = new String[] {""} ;
      T01KI41_A719PrdNum = new String[] {""} ;
      T01KI41_n719PrdNum = new boolean[] {false} ;
      T01KI41_A9735Cod_Rgo = new String[] {""} ;
      T01KI42_A396EmprCod = new String[] {""} ;
      T01KI42_A719PrdNum = new String[] {""} ;
      T01KI42_n719PrdNum = new boolean[] {false} ;
      T01KI42_A9711Ct_codigo = new short[1] ;
      T01KI43_A396EmprCod = new String[] {""} ;
      T01KI43_A9652OeNum = new long[1] ;
      T01KI43_A9653OeHdr = new int[1] ;
      T01KI43_A9654OeHdrr = new byte[1] ;
      T01KI43_A9655OeHdrp = new String[] {""} ;
      T01KI43_A9656OeLinC = new byte[1] ;
      T01KI43_A9657OeComb = new String[] {""} ;
      T01KI43_A9658Oefondo = new String[] {""} ;
      T01KI43_A9659OeMolCil = new byte[1] ;
      T01KI43_A9686OePasLin = new short[1] ;
      T01KI43_A9694OePasPLi = new short[1] ;
      T01KI44_A396EmprCod = new String[] {""} ;
      T01KI44_A9652OeNum = new long[1] ;
      T01KI44_A9653OeHdr = new int[1] ;
      T01KI44_A9654OeHdrr = new byte[1] ;
      T01KI44_A9655OeHdrp = new String[] {""} ;
      T01KI44_A9656OeLinC = new byte[1] ;
      T01KI44_A9657OeComb = new String[] {""} ;
      T01KI44_A9658Oefondo = new String[] {""} ;
      T01KI44_A9659OeMolCil = new byte[1] ;
      T01KI44_A9677OeMolLin = new byte[1] ;
      T01KI45_A396EmprCod = new String[] {""} ;
      T01KI45_A9578Pas_Num = new int[1] ;
      T01KI45_A719PrdNum = new String[] {""} ;
      T01KI45_n719PrdNum = new boolean[] {false} ;
      T01KI46_A396EmprCod = new String[] {""} ;
      T01KI46_A719PrdNum = new String[] {""} ;
      T01KI46_n719PrdNum = new boolean[] {false} ;
      T01KI46_A8908CC_AlmCod = new byte[1] ;
      T01KI47_A396EmprCod = new String[] {""} ;
      T01KI47_A719PrdNum = new String[] {""} ;
      T01KI47_n719PrdNum = new boolean[] {false} ;
      T01KI47_A8661Almc_Ln = new int[1] ;
      T01KI48_A396EmprCod = new String[] {""} ;
      T01KI48_A719PrdNum = new String[] {""} ;
      T01KI48_n719PrdNum = new boolean[] {false} ;
      T01KI48_A8648Mat_PrdN = new String[] {""} ;
      T01KI49_A396EmprCod = new String[] {""} ;
      T01KI49_A8585Pet_cod = new long[1] ;
      T01KI49_A719PrdNum = new String[] {""} ;
      T01KI49_n719PrdNum = new boolean[] {false} ;
      T01KI50_A396EmprCod = new String[] {""} ;
      T01KI50_A719PrdNum = new String[] {""} ;
      T01KI50_n719PrdNum = new boolean[] {false} ;
      T01KI50_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01KI51_A396EmprCod = new String[] {""} ;
      T01KI51_A719PrdNum = new String[] {""} ;
      T01KI51_n719PrdNum = new boolean[] {false} ;
      T01KI51_A8366PrdAnyo = new short[1] ;
      T01KI51_A8360PrdProv = new int[1] ;
      T01KI52_A396EmprCod = new String[] {""} ;
      T01KI52_A252CliCod = new int[1] ;
      T01KI52_A494ForSer = new String[] {""} ;
      T01KI52_A482ForColNom = new String[] {""} ;
      T01KI52_A483ForColNum = new int[1] ;
      T01KI52_A831TipColCod = new byte[1] ;
      T01KI52_A7797Sim_lin = new short[1] ;
      T01KI53_A396EmprCod = new String[] {""} ;
      T01KI53_A7163Vir_Codigo = new int[1] ;
      T01KI53_A719PrdNum = new String[] {""} ;
      T01KI53_n719PrdNum = new boolean[] {false} ;
      T01KI54_A396EmprCod = new String[] {""} ;
      T01KI54_A6310Lb_TaAuxC = new String[] {""} ;
      T01KI54_A6313lb_TaAuxL = new short[1] ;
      T01KI54_A6378Lb_TauxLP = new short[1] ;
      T01KI55_A396EmprCod = new String[] {""} ;
      T01KI55_A6290PreCoNum = new int[1] ;
      T01KI55_A719PrdNum = new String[] {""} ;
      T01KI55_n719PrdNum = new boolean[] {false} ;
      T01KI56_A396EmprCod = new String[] {""} ;
      T01KI56_A719PrdNum = new String[] {""} ;
      T01KI56_n719PrdNum = new boolean[] {false} ;
      T01KI56_A6158PrdPrv = new int[1] ;
      T01KI57_A396EmprCod = new String[] {""} ;
      T01KI57_A719PrdNum = new String[] {""} ;
      T01KI57_n719PrdNum = new boolean[] {false} ;
      T01KI57_A5973PrdSusNum = new String[] {""} ;
      T01KI58_A396EmprCod = new String[] {""} ;
      T01KI58_A5612Lb_CodGru = new String[] {""} ;
      T01KI58_A5615Lb_LinGru = new short[1] ;
      T01KI59_A396EmprCod = new String[] {""} ;
      T01KI59_A5532Lb_numero = new int[1] ;
      T01KI59_A5555Lb_opcion = new String[] {""} ;
      T01KI59_A5560Lb_LineaPr = new short[1] ;
      T01KI60_A396EmprCod = new String[] {""} ;
      T01KI60_A5532Lb_numero = new int[1] ;
      T01KI60_A5555Lb_opcion = new String[] {""} ;
      T01KI60_A5557Lb_LineaC = new short[1] ;
      T01KI61_A396EmprCod = new String[] {""} ;
      T01KI61_A5145SobCod = new int[1] ;
      T01KI61_A719PrdNum = new String[] {""} ;
      T01KI61_n719PrdNum = new boolean[] {false} ;
      T01KI62_A396EmprCod = new String[] {""} ;
      T01KI62_A4744RecPreCod = new int[1] ;
      T01KI62_A4762RecPreLin = new short[1] ;
      T01KI62_A4763RecPreNli = new short[1] ;
      T01KI63_A396EmprCod = new String[] {""} ;
      T01KI63_A4492HreBarCod = new int[1] ;
      T01KI63_A4493HreBarReo = new byte[1] ;
      T01KI63_A4494HreBarPar = new String[] {""} ;
      T01KI63_A4495HreNumCie = new byte[1] ;
      T01KI63_A4545HreLinMaq = new short[1] ;
      T01KI63_A4550HreLinPro = new byte[1] ;
      T01KI63_A4557HreRecLin = new short[1] ;
      T01KI64_A396EmprCod = new String[] {""} ;
      T01KI64_A4492HreBarCod = new int[1] ;
      T01KI64_A4493HreBarReo = new byte[1] ;
      T01KI64_A4494HreBarPar = new String[] {""} ;
      T01KI64_A4495HreNumCie = new byte[1] ;
      T01KI64_A4508HreLinMAL = new short[1] ;
      T01KI64_A4509HreNumAny = new byte[1] ;
      T01KI64_A719PrdNum = new String[] {""} ;
      T01KI64_n719PrdNum = new boolean[] {false} ;
      T01KI65_A396EmprCod = new String[] {""} ;
      T01KI65_A252CliCod = new int[1] ;
      T01KI65_A4415EstCol = new String[] {""} ;
      T01KI65_A4416EstColLin = new short[1] ;
      T01KI66_A396EmprCod = new String[] {""} ;
      T01KI66_A129BarCod = new int[1] ;
      T01KI66_A132BarCodReo = new byte[1] ;
      T01KI66_A130BarCodPar = new String[] {""} ;
      T01KI66_A2524DisComLin = new byte[1] ;
      T01KI66_A1056DisComCod = new String[] {""} ;
      T01KI66_A1032FonCod = new String[] {""} ;
      T01KI66_A2124RecMolCod = new byte[1] ;
      T01KI66_A2672RecPasLin = new short[1] ;
      T01KI66_A2675RecPasPLi = new short[1] ;
      T01KI67_A396EmprCod = new String[] {""} ;
      T01KI67_A129BarCod = new int[1] ;
      T01KI67_A132BarCodReo = new byte[1] ;
      T01KI67_A130BarCodPar = new String[] {""} ;
      T01KI67_A2524DisComLin = new byte[1] ;
      T01KI67_A1056DisComCod = new String[] {""} ;
      T01KI67_A1032FonCod = new String[] {""} ;
      T01KI67_A2124RecMolCod = new byte[1] ;
      T01KI67_A2126RecMolLin = new byte[1] ;
      T01KI68_A396EmprCod = new String[] {""} ;
      T01KI68_A2107PasCod = new String[] {""} ;
      T01KI68_A719PrdNum = new String[] {""} ;
      T01KI68_n719PrdNum = new boolean[] {false} ;
      T01KI69_A396EmprCod = new String[] {""} ;
      T01KI69_A2637HisEstHRu = new int[1] ;
      T01KI69_A2636HisEstHRe = new byte[1] ;
      T01KI69_A2635HisEstHPa = new String[] {""} ;
      T01KI69_A2638HisEstLCo = new byte[1] ;
      T01KI69_A2630HisEstCom = new String[] {""} ;
      T01KI69_A2634HisEstFon = new String[] {""} ;
      T01KI69_A719PrdNum = new String[] {""} ;
      T01KI69_n719PrdNum = new boolean[] {false} ;
      T01KI70_A396EmprCod = new String[] {""} ;
      T01KI70_A252CliCod = new int[1] ;
      T01KI70_A2141SerEst = new String[] {""} ;
      T01KI70_A1013DibCli = new String[] {""} ;
      T01KI70_A1014DibInt = new int[1] ;
      T01KI70_A2074ColCom = new String[] {""} ;
      T01KI70_A2078ColFon = new String[] {""} ;
      T01KI70_A2098MolCod = new byte[1] ;
      T01KI70_A2535ForPrdLin = new short[1] ;
      T01KI71_A396EmprCod = new String[] {""} ;
      T01KI71_A719PrdNum = new String[] {""} ;
      T01KI71_n719PrdNum = new boolean[] {false} ;
      T01KI71_A3342CCStkLin = new long[1] ;
      T01KI72_A396EmprCod = new String[] {""} ;
      T01KI72_A252CliCod = new int[1] ;
      T01KI72_A2891HMaForSer = new String[] {""} ;
      T01KI72_A2892HMaForCNom = new String[] {""} ;
      T01KI72_A2893HMaForCNum = new int[1] ;
      T01KI72_A2894HMaTipCCod = new byte[1] ;
      T01KI72_A2895HMaForNumC = new int[1] ;
      T01KI72_A2897HMaColLin = new short[1] ;
      T01KI72_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01KI72_A2907HmaLin = new short[1] ;
      T01KI73_A396EmprCod = new String[] {""} ;
      T01KI73_A129BarCod = new int[1] ;
      T01KI73_A132BarCodReo = new byte[1] ;
      T01KI73_A130BarCodPar = new String[] {""} ;
      T01KI73_A2808RecLinMAL = new short[1] ;
      T01KI73_A1377RecNumAny = new byte[1] ;
      T01KI73_A719PrdNum = new String[] {""} ;
      T01KI73_n719PrdNum = new boolean[] {false} ;
      T01KI74_A396EmprCod = new String[] {""} ;
      T01KI74_A129BarCod = new int[1] ;
      T01KI74_A132BarCodReo = new byte[1] ;
      T01KI74_A130BarCodPar = new String[] {""} ;
      T01KI74_A2804RecLinMaq = new short[1] ;
      T01KI74_A1273RecLinPro = new byte[1] ;
      T01KI74_A811RecLin = new short[1] ;
      T01KI75_A396EmprCod = new String[] {""} ;
      T01KI75_A129BarCod = new int[1] ;
      T01KI75_A132BarCodReo = new byte[1] ;
      T01KI75_A130BarCodPar = new String[] {""} ;
      T01KI75_A2494BarDosPro = new String[] {""} ;
      T01KI75_A719PrdNum = new String[] {""} ;
      T01KI75_n719PrdNum = new boolean[] {false} ;
      T01KI76_A396EmprCod = new String[] {""} ;
      T01KI76_A1314EnsLabCod = new int[1] ;
      T01KI76_A1317EnsLabLin = new short[1] ;
      T01KI77_A396EmprCod = new String[] {""} ;
      T01KI77_A910Workstat = new String[] {""} ;
      T01KI77_A887EscMLin = new int[1] ;
      T01KI78_A396EmprCod = new String[] {""} ;
      T01KI78_A859CumCodCont = new int[1] ;
      T01KI78_A719PrdNum = new String[] {""} ;
      T01KI78_n719PrdNum = new boolean[] {false} ;
      T01KI79_A396EmprCod = new String[] {""} ;
      T01KI79_A719PrdNum = new String[] {""} ;
      T01KI79_n719PrdNum = new boolean[] {false} ;
      T01KI79_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01KI80_A396EmprCod = new String[] {""} ;
      T01KI80_A486ForNumCol = new int[1] ;
      T01KI80_A715PrdLin = new short[1] ;
      T01KI81_A396EmprCod = new String[] {""} ;
      T01KI81_A719PrdNum = new String[] {""} ;
      T01KI81_n719PrdNum = new boolean[] {false} ;
      T01KI81_A681PrdAny = new short[1] ;
      T01KI82_A396EmprCod = new String[] {""} ;
      T01KI82_A719PrdNum = new String[] {""} ;
      T01KI82_n719PrdNum = new boolean[] {false} ;
      T01KI82_A688PrdComCod = new String[] {""} ;
      T01KI83_A396EmprCod = new String[] {""} ;
      T01KI83_A719PrdNum = new String[] {""} ;
      T01KI83_n719PrdNum = new boolean[] {false} ;
      T01KI83_A680PrdAltNum = new String[] {""} ;
      T01KI84_A396EmprCod = new String[] {""} ;
      T01KI84_A658PedCod = new int[1] ;
      T01KI84_A719PrdNum = new String[] {""} ;
      T01KI84_n719PrdNum = new boolean[] {false} ;
      T01KI85_A396EmprCod = new String[] {""} ;
      T01KI85_A486ForNumCol = new int[1] ;
      T01KI85_A309ColLin = new short[1] ;
      T01KI86_A396EmprCod = new String[] {""} ;
      T01KI86_A719PrdNum = new String[] {""} ;
      T01KI86_n719PrdNum = new boolean[] {false} ;
      T01KI86_A647NumCon = new int[1] ;
      T01KI87_A396EmprCod = new String[] {""} ;
      T01KI87_A719PrdNum = new String[] {""} ;
      T01KI87_n719PrdNum = new boolean[] {false} ;
      Z9715Tb1_Dsc = "" ;
      T01KI88_A719PrdNum = new String[] {""} ;
      T01KI88_n719PrdNum = new boolean[] {false} ;
      T01KI88_A9715Tb1_Dsc = new String[] {""} ;
      T01KI88_n9715Tb1_Dsc = new boolean[] {false} ;
      T01KI88_A396EmprCod = new String[] {""} ;
      T01KI88_A9713Tb1_Cod = new short[1] ;
      T01KI89_A13785Tb1_codDsc = new String[] {""} ;
      T01KI89_A396EmprCod = new String[] {""} ;
      T01KI89_A9713Tb1_Cod = new short[1] ;
      T01KI90_A13785Tb1_codDsc = new String[] {""} ;
      T01KI90_A396EmprCod = new String[] {""} ;
      T01KI90_A9713Tb1_Cod = new short[1] ;
      T01KI91_A13785Tb1_codDsc = new String[] {""} ;
      T01KI91_A396EmprCod = new String[] {""} ;
      T01KI91_A9713Tb1_Cod = new short[1] ;
      T01KI4_A9715Tb1_Dsc = new String[] {""} ;
      T01KI4_n9715Tb1_Dsc = new boolean[] {false} ;
      T01KI92_A9715Tb1_Dsc = new String[] {""} ;
      T01KI92_n9715Tb1_Dsc = new boolean[] {false} ;
      T01KI93_A13785Tb1_codDsc = new String[] {""} ;
      T01KI93_A396EmprCod = new String[] {""} ;
      T01KI93_A9713Tb1_Cod = new short[1] ;
      T01KI94_A396EmprCod = new String[] {""} ;
      T01KI94_A719PrdNum = new String[] {""} ;
      T01KI94_n719PrdNum = new boolean[] {false} ;
      T01KI94_A9713Tb1_Cod = new short[1] ;
      T01KI3_A719PrdNum = new String[] {""} ;
      T01KI3_n719PrdNum = new boolean[] {false} ;
      T01KI3_A396EmprCod = new String[] {""} ;
      T01KI3_A9713Tb1_Cod = new short[1] ;
      T01KI95_A13785Tb1_codDsc = new String[] {""} ;
      T01KI95_A396EmprCod = new String[] {""} ;
      T01KI95_A9713Tb1_Cod = new short[1] ;
      T01KI2_A719PrdNum = new String[] {""} ;
      T01KI2_n719PrdNum = new boolean[] {false} ;
      T01KI2_A396EmprCod = new String[] {""} ;
      T01KI2_A9713Tb1_Cod = new short[1] ;
      T01KI98_A9715Tb1_Dsc = new String[] {""} ;
      T01KI98_n9715Tb1_Dsc = new boolean[] {false} ;
      T01KI99_A396EmprCod = new String[] {""} ;
      T01KI99_A719PrdNum = new String[] {""} ;
      T01KI99_n719PrdNum = new boolean[] {false} ;
      T01KI99_A9713Tb1_Cod = new short[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      l13785Tb1_codDsc = "" ;
      T01KI100_A13785Tb1_codDsc = new String[] {""} ;
      T01KI101_A13785Tb1_codDsc = new String[] {""} ;
      T01KI101_A396EmprCod = new String[] {""} ;
      T01KI101_A9713Tb1_Cod = new short[1] ;
      T01KI102_A13785Tb1_codDsc = new String[] {""} ;
      T01KI102_A396EmprCod = new String[] {""} ;
      T01KI102_A9713Tb1_Cod = new short[1] ;
      T01KI103_A9715Tb1_Dsc = new String[] {""} ;
      T01KI103_n9715Tb1_Dsc = new boolean[] {false} ;
      Zh9713Tb1_Cod = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcdnenc__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcdnenc__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcdnenc__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcdnenc__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcdnenc__default(),
         new Object[] {
             new Object[] {
            T01KI2_A719PrdNum, T01KI2_A396EmprCod, T01KI2_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI3_A719PrdNum, T01KI3_A396EmprCod, T01KI3_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI4_A9715Tb1_Dsc, T01KI4_n9715Tb1_Dsc
            }
            , new Object[] {
            T01KI5_A719PrdNum, T01KI5_A718PrdNom, T01KI5_A396EmprCod
            }
            , new Object[] {
            T01KI6_A719PrdNum, T01KI6_A718PrdNom, T01KI6_A396EmprCod
            }
            , new Object[] {
            T01KI7_A407EmprNom, T01KI7_n407EmprNom
            }
            , new Object[] {
            T01KI8_A719PrdNum, T01KI8_A407EmprNom, T01KI8_n407EmprNom, T01KI8_A718PrdNom, T01KI8_A396EmprCod
            }
            , new Object[] {
            T01KI9_A396EmprCod, T01KI9_A719PrdNum
            }
            , new Object[] {
            T01KI10_A396EmprCod, T01KI10_A719PrdNum
            }
            , new Object[] {
            T01KI11_A396EmprCod, T01KI11_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KI15_A396EmprCod, T01KI15_A719PrdNum, T01KI15_A13217NormaID
            }
            , new Object[] {
            T01KI16_A396EmprCod, T01KI16_A719PrdNum, T01KI16_A13586TheList
            }
            , new Object[] {
            T01KI17_A396EmprCod, T01KI17_A5532Lb_numero, T01KI17_A5555Lb_opcion, T01KI17_A13460Lb_linCP, T01KI17_A13458Lb_TipCP
            }
            , new Object[] {
            T01KI18_A396EmprCod, T01KI18_A13418AlbProID, T01KI18_A13442AlbProLine
            }
            , new Object[] {
            T01KI19_A396EmprCod, T01KI19_A13324LDESID, T01KI19_A13333LDESNPeque, T01KI19_A13337LDESComb, T01KI19_A13339LDESFondo, T01KI19_A13342LDESLinea
            }
            , new Object[] {
            T01KI20_A396EmprCod, T01KI20_A13312Lb_NLab, T01KI20_A13305Lb_IDVeces, T01KI20_A13306Lb_LinID
            }
            , new Object[] {
            T01KI21_A396EmprCod, T01KI21_A12673LavMqId, T01KI21_A12692LavMqLnPq, T01KI21_A12681LavMqLn
            }
            , new Object[] {
            T01KI22_A396EmprCod, T01KI22_A12236PrdNumD, T01KI22_A719PrdNum
            }
            , new Object[] {
            T01KI23_A396EmprCod, T01KI23_A12225DocDisID, T01KI23_A12226LinDisID
            }
            , new Object[] {
            T01KI24_A396EmprCod, T01KI24_A12225DocDisID
            }
            , new Object[] {
            T01KI25_A396EmprCod, T01KI25_A12205OrdenCID, T01KI25_A12206OrdenCLnId
            }
            , new Object[] {
            T01KI26_A396EmprCod, T01KI26_A719PrdNum, T01KI26_A11664LoteID, T01KI26_A11665LoteFec
            }
            , new Object[] {
            T01KI27_A396EmprCod, T01KI27_A4850DevComCod, T01KI27_A719PrdNum
            }
            , new Object[] {
            T01KI28_A396EmprCod, T01KI28_A252CliCod, T01KI28_A494ForSer, T01KI28_A482ForColNom, T01KI28_A483ForColNum, T01KI28_A831TipColCod, T01KI28_A3571EnsCod, T01KI28_A3582EnsLin
            }
            , new Object[] {
            T01KI29_A396EmprCod, T01KI29_A129BarCod, T01KI29_A132BarCodReo, T01KI29_A130BarCodPar, T01KI29_A4075recestncol, T01KI29_A4076recestnpro, T01KI29_A4108recestlin
            }
            , new Object[] {
            T01KI30_A396EmprCod, T01KI30_A4052EstNumFor, T01KI30_A4053EstNumCol, T01KI30_A4090EstEspLin
            }
            , new Object[] {
            T01KI31_A396EmprCod, T01KI31_A4052EstNumFor, T01KI31_A4053EstNumCol, T01KI31_A4084EstProLin
            }
            , new Object[] {
            T01KI32_A396EmprCod, T01KI32_A11644TransferId, T01KI32_A11653TransferLn
            }
            , new Object[] {
            T01KI33_A396EmprCod, T01KI33_A11634TaesId, T01KI33_A11637TaesLn, T01KI33_A11641TaesLnP
            }
            , new Object[] {
            T01KI34_A396EmprCod, T01KI34_A719PrdNum, T01KI34_A11329H_stklin
            }
            , new Object[] {
            T01KI35_A396EmprCod, T01KI35_A11270Pot_num, T01KI35_A11271Pot_lin
            }
            , new Object[] {
            T01KI36_A396EmprCod, T01KI36_A719PrdNum, T01KI36_A11199PrdNcasC
            }
            , new Object[] {
            T01KI37_A396EmprCod, T01KI37_A719PrdNum, T01KI37_A11197CFraseR
            }
            , new Object[] {
            T01KI38_A396EmprCod, T01KI38_A10243Jt_codigo, T01KI38_A10246Jt_ord
            }
            , new Object[] {
            T01KI39_A396EmprCod, T01KI39_A10236Bny_dia, T01KI39_A10238Bny_lin
            }
            , new Object[] {
            T01KI40_A396EmprCod, T01KI40_A129BarCod, T01KI40_A132BarCodReo, T01KI40_A130BarCodPar, T01KI40_A758ProCod, T01KI40_A194BarOrdLin, T01KI40_A719PrdNum
            }
            , new Object[] {
            T01KI41_A396EmprCod, T01KI41_A719PrdNum, T01KI41_A9735Cod_Rgo
            }
            , new Object[] {
            T01KI42_A396EmprCod, T01KI42_A719PrdNum, T01KI42_A9711Ct_codigo
            }
            , new Object[] {
            T01KI43_A396EmprCod, T01KI43_A9652OeNum, T01KI43_A9653OeHdr, T01KI43_A9654OeHdrr, T01KI43_A9655OeHdrp, T01KI43_A9656OeLinC, T01KI43_A9657OeComb, T01KI43_A9658Oefondo, T01KI43_A9659OeMolCil, T01KI43_A9686OePasLin,
            T01KI43_A9694OePasPLi
            }
            , new Object[] {
            T01KI44_A396EmprCod, T01KI44_A9652OeNum, T01KI44_A9653OeHdr, T01KI44_A9654OeHdrr, T01KI44_A9655OeHdrp, T01KI44_A9656OeLinC, T01KI44_A9657OeComb, T01KI44_A9658Oefondo, T01KI44_A9659OeMolCil, T01KI44_A9677OeMolLin
            }
            , new Object[] {
            T01KI45_A396EmprCod, T01KI45_A9578Pas_Num, T01KI45_A719PrdNum
            }
            , new Object[] {
            T01KI46_A396EmprCod, T01KI46_A719PrdNum, T01KI46_A8908CC_AlmCod
            }
            , new Object[] {
            T01KI47_A396EmprCod, T01KI47_A719PrdNum, T01KI47_A8661Almc_Ln
            }
            , new Object[] {
            T01KI48_A396EmprCod, T01KI48_A719PrdNum, T01KI48_A8648Mat_PrdN
            }
            , new Object[] {
            T01KI49_A396EmprCod, T01KI49_A8585Pet_cod, T01KI49_A719PrdNum
            }
            , new Object[] {
            T01KI50_A396EmprCod, T01KI50_A719PrdNum, T01KI50_A8577RecFecHr
            }
            , new Object[] {
            T01KI51_A396EmprCod, T01KI51_A719PrdNum, T01KI51_A8366PrdAnyo, T01KI51_A8360PrdProv
            }
            , new Object[] {
            T01KI52_A396EmprCod, T01KI52_A252CliCod, T01KI52_A494ForSer, T01KI52_A482ForColNom, T01KI52_A483ForColNum, T01KI52_A831TipColCod, T01KI52_A7797Sim_lin
            }
            , new Object[] {
            T01KI53_A396EmprCod, T01KI53_A7163Vir_Codigo, T01KI53_A719PrdNum
            }
            , new Object[] {
            T01KI54_A396EmprCod, T01KI54_A6310Lb_TaAuxC, T01KI54_A6313lb_TaAuxL, T01KI54_A6378Lb_TauxLP
            }
            , new Object[] {
            T01KI55_A396EmprCod, T01KI55_A6290PreCoNum, T01KI55_A719PrdNum
            }
            , new Object[] {
            T01KI56_A396EmprCod, T01KI56_A719PrdNum, T01KI56_A6158PrdPrv
            }
            , new Object[] {
            T01KI57_A396EmprCod, T01KI57_A719PrdNum, T01KI57_A5973PrdSusNum
            }
            , new Object[] {
            T01KI58_A396EmprCod, T01KI58_A5612Lb_CodGru, T01KI58_A5615Lb_LinGru
            }
            , new Object[] {
            T01KI59_A396EmprCod, T01KI59_A5532Lb_numero, T01KI59_A5555Lb_opcion, T01KI59_A5560Lb_LineaPr
            }
            , new Object[] {
            T01KI60_A396EmprCod, T01KI60_A5532Lb_numero, T01KI60_A5555Lb_opcion, T01KI60_A5557Lb_LineaC
            }
            , new Object[] {
            T01KI61_A396EmprCod, T01KI61_A5145SobCod, T01KI61_A719PrdNum
            }
            , new Object[] {
            T01KI62_A396EmprCod, T01KI62_A4744RecPreCod, T01KI62_A4762RecPreLin, T01KI62_A4763RecPreNli
            }
            , new Object[] {
            T01KI63_A396EmprCod, T01KI63_A4492HreBarCod, T01KI63_A4493HreBarReo, T01KI63_A4494HreBarPar, T01KI63_A4495HreNumCie, T01KI63_A4545HreLinMaq, T01KI63_A4550HreLinPro, T01KI63_A4557HreRecLin
            }
            , new Object[] {
            T01KI64_A396EmprCod, T01KI64_A4492HreBarCod, T01KI64_A4493HreBarReo, T01KI64_A4494HreBarPar, T01KI64_A4495HreNumCie, T01KI64_A4508HreLinMAL, T01KI64_A4509HreNumAny, T01KI64_A719PrdNum
            }
            , new Object[] {
            T01KI65_A396EmprCod, T01KI65_A252CliCod, T01KI65_A4415EstCol, T01KI65_A4416EstColLin
            }
            , new Object[] {
            T01KI66_A396EmprCod, T01KI66_A129BarCod, T01KI66_A132BarCodReo, T01KI66_A130BarCodPar, T01KI66_A2524DisComLin, T01KI66_A1056DisComCod, T01KI66_A1032FonCod, T01KI66_A2124RecMolCod, T01KI66_A2672RecPasLin, T01KI66_A2675RecPasPLi
            }
            , new Object[] {
            T01KI67_A396EmprCod, T01KI67_A129BarCod, T01KI67_A132BarCodReo, T01KI67_A130BarCodPar, T01KI67_A2524DisComLin, T01KI67_A1056DisComCod, T01KI67_A1032FonCod, T01KI67_A2124RecMolCod, T01KI67_A2126RecMolLin
            }
            , new Object[] {
            T01KI68_A396EmprCod, T01KI68_A2107PasCod, T01KI68_A719PrdNum
            }
            , new Object[] {
            T01KI69_A396EmprCod, T01KI69_A2637HisEstHRu, T01KI69_A2636HisEstHRe, T01KI69_A2635HisEstHPa, T01KI69_A2638HisEstLCo, T01KI69_A2630HisEstCom, T01KI69_A2634HisEstFon, T01KI69_A719PrdNum
            }
            , new Object[] {
            T01KI70_A396EmprCod, T01KI70_A252CliCod, T01KI70_A2141SerEst, T01KI70_A1013DibCli, T01KI70_A1014DibInt, T01KI70_A2074ColCom, T01KI70_A2078ColFon, T01KI70_A2098MolCod, T01KI70_A2535ForPrdLin
            }
            , new Object[] {
            T01KI71_A396EmprCod, T01KI71_A719PrdNum, T01KI71_A3342CCStkLin
            }
            , new Object[] {
            T01KI72_A396EmprCod, T01KI72_A252CliCod, T01KI72_A2891HMaForSer, T01KI72_A2892HMaForCNom, T01KI72_A2893HMaForCNum, T01KI72_A2894HMaTipCCod, T01KI72_A2895HMaForNumC, T01KI72_A2897HMaColLin, T01KI72_A2896HMaFec, T01KI72_A2907HmaLin
            }
            , new Object[] {
            T01KI73_A396EmprCod, T01KI73_A129BarCod, T01KI73_A132BarCodReo, T01KI73_A130BarCodPar, T01KI73_A2808RecLinMAL, T01KI73_A1377RecNumAny, T01KI73_A719PrdNum
            }
            , new Object[] {
            T01KI74_A396EmprCod, T01KI74_A129BarCod, T01KI74_A132BarCodReo, T01KI74_A130BarCodPar, T01KI74_A2804RecLinMaq, T01KI74_A1273RecLinPro, T01KI74_A811RecLin
            }
            , new Object[] {
            T01KI75_A396EmprCod, T01KI75_A129BarCod, T01KI75_A132BarCodReo, T01KI75_A130BarCodPar, T01KI75_A2494BarDosPro, T01KI75_A719PrdNum
            }
            , new Object[] {
            T01KI76_A396EmprCod, T01KI76_A1314EnsLabCod, T01KI76_A1317EnsLabLin
            }
            , new Object[] {
            T01KI77_A396EmprCod, T01KI77_A910Workstat, T01KI77_A887EscMLin
            }
            , new Object[] {
            T01KI78_A396EmprCod, T01KI78_A859CumCodCont, T01KI78_A719PrdNum
            }
            , new Object[] {
            T01KI79_A396EmprCod, T01KI79_A719PrdNum, T01KI79_A810RecFec
            }
            , new Object[] {
            T01KI80_A396EmprCod, T01KI80_A486ForNumCol, T01KI80_A715PrdLin
            }
            , new Object[] {
            T01KI81_A396EmprCod, T01KI81_A719PrdNum, T01KI81_A681PrdAny
            }
            , new Object[] {
            T01KI82_A396EmprCod, T01KI82_A719PrdNum, T01KI82_A688PrdComCod
            }
            , new Object[] {
            T01KI83_A396EmprCod, T01KI83_A719PrdNum, T01KI83_A680PrdAltNum
            }
            , new Object[] {
            T01KI84_A396EmprCod, T01KI84_A658PedCod, T01KI84_A719PrdNum
            }
            , new Object[] {
            T01KI85_A396EmprCod, T01KI85_A486ForNumCol, T01KI85_A309ColLin
            }
            , new Object[] {
            T01KI86_A396EmprCod, T01KI86_A719PrdNum, T01KI86_A647NumCon
            }
            , new Object[] {
            T01KI87_A396EmprCod, T01KI87_A719PrdNum
            }
            , new Object[] {
            T01KI88_A719PrdNum, T01KI88_A9715Tb1_Dsc, T01KI88_n9715Tb1_Dsc, T01KI88_A396EmprCod, T01KI88_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI89_A13785Tb1_codDsc, T01KI89_A396EmprCod, T01KI89_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI90_A13785Tb1_codDsc, T01KI90_A396EmprCod, T01KI90_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI91_A13785Tb1_codDsc, T01KI91_A396EmprCod, T01KI91_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI92_A9715Tb1_Dsc, T01KI92_n9715Tb1_Dsc
            }
            , new Object[] {
            T01KI93_A13785Tb1_codDsc, T01KI93_A396EmprCod, T01KI93_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI94_A396EmprCod, T01KI94_A719PrdNum, T01KI94_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI95_A13785Tb1_codDsc, T01KI95_A396EmprCod, T01KI95_A9713Tb1_Cod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01KI98_A9715Tb1_Dsc, T01KI98_n9715Tb1_Dsc
            }
            , new Object[] {
            T01KI99_A396EmprCod, T01KI99_A719PrdNum, T01KI99_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI100_A13785Tb1_codDsc
            }
            , new Object[] {
            T01KI101_A13785Tb1_codDsc, T01KI101_A396EmprCod, T01KI101_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI102_A13785Tb1_codDsc, T01KI102_A396EmprCod, T01KI102_A9713Tb1_Cod
            }
            , new Object[] {
            T01KI103_A9715Tb1_Dsc, T01KI103_n9715Tb1_Dsc
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
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
   private short Z9713Tb1_Cod ;
   private short nRcdDeleted_1732 ;
   private short nRcdExists_1732 ;
   private short nIsMod_1732 ;
   private short A9713Tb1_Cod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1732 ;
   private short RcdFound1732 ;
   private short nBlankRcdUsr1732 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_1732 ;
   private short gxhchits ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtTb1_Cod_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtTb1_Cod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private int gxdynajaxindex ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV33PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV33PrdNum ;
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
   private String A719PrdNum ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode1732 ;
   private String edtTb1_Cod_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A9715Tb1_Dsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode29 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z9715Tb1_Dsc ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtTb1_Cod_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private String gxwrpcisep ;
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
   private boolean n9715Tb1_Dsc ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private String A13785Tb1_codDsc ;
   private String h9713Tb1_Cod ;
   private String l13785Tb1_codDsc ;
   private String Zh9713Tb1_Cod ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV36WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01KI7_A407EmprNom ;
   private boolean[] T01KI7_n407EmprNom ;
   private String[] T01KI8_A719PrdNum ;
   private boolean[] T01KI8_n719PrdNum ;
   private String[] T01KI8_A407EmprNom ;
   private boolean[] T01KI8_n407EmprNom ;
   private String[] T01KI8_A718PrdNom ;
   private String[] T01KI8_A396EmprCod ;
   private String[] T01KI9_A396EmprCod ;
   private String[] T01KI9_A719PrdNum ;
   private boolean[] T01KI9_n719PrdNum ;
   private String[] T01KI6_A719PrdNum ;
   private boolean[] T01KI6_n719PrdNum ;
   private String[] T01KI6_A718PrdNom ;
   private String[] T01KI6_A396EmprCod ;
   private String[] T01KI10_A396EmprCod ;
   private String[] T01KI10_A719PrdNum ;
   private boolean[] T01KI10_n719PrdNum ;
   private String[] T01KI11_A396EmprCod ;
   private String[] T01KI11_A719PrdNum ;
   private boolean[] T01KI11_n719PrdNum ;
   private String[] T01KI5_A719PrdNum ;
   private boolean[] T01KI5_n719PrdNum ;
   private String[] T01KI5_A718PrdNom ;
   private String[] T01KI5_A396EmprCod ;
   private String[] T01KI15_A396EmprCod ;
   private String[] T01KI15_A719PrdNum ;
   private boolean[] T01KI15_n719PrdNum ;
   private String[] T01KI15_A13217NormaID ;
   private String[] T01KI16_A396EmprCod ;
   private String[] T01KI16_A719PrdNum ;
   private boolean[] T01KI16_n719PrdNum ;
   private String[] T01KI16_A13586TheList ;
   private String[] T01KI17_A396EmprCod ;
   private int[] T01KI17_A5532Lb_numero ;
   private String[] T01KI17_A5555Lb_opcion ;
   private short[] T01KI17_A13460Lb_linCP ;
   private String[] T01KI17_A13458Lb_TipCP ;
   private String[] T01KI18_A396EmprCod ;
   private int[] T01KI18_A13418AlbProID ;
   private short[] T01KI18_A13442AlbProLine ;
   private String[] T01KI19_A396EmprCod ;
   private int[] T01KI19_A13324LDESID ;
   private String[] T01KI19_A13333LDESNPeque ;
   private String[] T01KI19_A13337LDESComb ;
   private String[] T01KI19_A13339LDESFondo ;
   private short[] T01KI19_A13342LDESLinea ;
   private String[] T01KI20_A396EmprCod ;
   private int[] T01KI20_A13312Lb_NLab ;
   private short[] T01KI20_A13305Lb_IDVeces ;
   private short[] T01KI20_A13306Lb_LinID ;
   private String[] T01KI21_A396EmprCod ;
   private int[] T01KI21_A12673LavMqId ;
   private short[] T01KI21_A12692LavMqLnPq ;
   private short[] T01KI21_A12681LavMqLn ;
   private String[] T01KI22_A396EmprCod ;
   private String[] T01KI22_A12236PrdNumD ;
   private String[] T01KI22_A719PrdNum ;
   private boolean[] T01KI22_n719PrdNum ;
   private String[] T01KI23_A396EmprCod ;
   private long[] T01KI23_A12225DocDisID ;
   private short[] T01KI23_A12226LinDisID ;
   private String[] T01KI24_A396EmprCod ;
   private long[] T01KI24_A12225DocDisID ;
   private String[] T01KI25_A396EmprCod ;
   private long[] T01KI25_A12205OrdenCID ;
   private short[] T01KI25_A12206OrdenCLnId ;
   private String[] T01KI26_A396EmprCod ;
   private String[] T01KI26_A719PrdNum ;
   private boolean[] T01KI26_n719PrdNum ;
   private String[] T01KI26_A11664LoteID ;
   private java.util.Date[] T01KI26_A11665LoteFec ;
   private String[] T01KI27_A396EmprCod ;
   private int[] T01KI27_A4850DevComCod ;
   private String[] T01KI27_A719PrdNum ;
   private boolean[] T01KI27_n719PrdNum ;
   private String[] T01KI28_A396EmprCod ;
   private int[] T01KI28_A252CliCod ;
   private String[] T01KI28_A494ForSer ;
   private String[] T01KI28_A482ForColNom ;
   private int[] T01KI28_A483ForColNum ;
   private byte[] T01KI28_A831TipColCod ;
   private String[] T01KI28_A3571EnsCod ;
   private short[] T01KI28_A3582EnsLin ;
   private String[] T01KI29_A396EmprCod ;
   private int[] T01KI29_A129BarCod ;
   private byte[] T01KI29_A132BarCodReo ;
   private String[] T01KI29_A130BarCodPar ;
   private byte[] T01KI29_A4075recestncol ;
   private byte[] T01KI29_A4076recestnpro ;
   private short[] T01KI29_A4108recestlin ;
   private String[] T01KI30_A396EmprCod ;
   private int[] T01KI30_A4052EstNumFor ;
   private byte[] T01KI30_A4053EstNumCol ;
   private byte[] T01KI30_A4090EstEspLin ;
   private String[] T01KI31_A396EmprCod ;
   private int[] T01KI31_A4052EstNumFor ;
   private byte[] T01KI31_A4053EstNumCol ;
   private byte[] T01KI31_A4084EstProLin ;
   private String[] T01KI32_A396EmprCod ;
   private long[] T01KI32_A11644TransferId ;
   private int[] T01KI32_A11653TransferLn ;
   private String[] T01KI33_A396EmprCod ;
   private String[] T01KI33_A11634TaesId ;
   private short[] T01KI33_A11637TaesLn ;
   private short[] T01KI33_A11641TaesLnP ;
   private String[] T01KI34_A396EmprCod ;
   private String[] T01KI34_A719PrdNum ;
   private boolean[] T01KI34_n719PrdNum ;
   private long[] T01KI34_A11329H_stklin ;
   private String[] T01KI35_A396EmprCod ;
   private int[] T01KI35_A11270Pot_num ;
   private short[] T01KI35_A11271Pot_lin ;
   private String[] T01KI36_A396EmprCod ;
   private String[] T01KI36_A719PrdNum ;
   private boolean[] T01KI36_n719PrdNum ;
   private String[] T01KI36_A11199PrdNcasC ;
   private String[] T01KI37_A396EmprCod ;
   private String[] T01KI37_A719PrdNum ;
   private boolean[] T01KI37_n719PrdNum ;
   private String[] T01KI37_A11197CFraseR ;
   private String[] T01KI38_A396EmprCod ;
   private short[] T01KI38_A10243Jt_codigo ;
   private short[] T01KI38_A10246Jt_ord ;
   private String[] T01KI39_A396EmprCod ;
   private java.util.Date[] T01KI39_A10236Bny_dia ;
   private short[] T01KI39_A10238Bny_lin ;
   private String[] T01KI40_A396EmprCod ;
   private int[] T01KI40_A129BarCod ;
   private byte[] T01KI40_A132BarCodReo ;
   private String[] T01KI40_A130BarCodPar ;
   private String[] T01KI40_A758ProCod ;
   private short[] T01KI40_A194BarOrdLin ;
   private String[] T01KI40_A719PrdNum ;
   private boolean[] T01KI40_n719PrdNum ;
   private String[] T01KI41_A396EmprCod ;
   private String[] T01KI41_A719PrdNum ;
   private boolean[] T01KI41_n719PrdNum ;
   private String[] T01KI41_A9735Cod_Rgo ;
   private String[] T01KI42_A396EmprCod ;
   private String[] T01KI42_A719PrdNum ;
   private boolean[] T01KI42_n719PrdNum ;
   private short[] T01KI42_A9711Ct_codigo ;
   private String[] T01KI43_A396EmprCod ;
   private long[] T01KI43_A9652OeNum ;
   private int[] T01KI43_A9653OeHdr ;
   private byte[] T01KI43_A9654OeHdrr ;
   private String[] T01KI43_A9655OeHdrp ;
   private byte[] T01KI43_A9656OeLinC ;
   private String[] T01KI43_A9657OeComb ;
   private String[] T01KI43_A9658Oefondo ;
   private byte[] T01KI43_A9659OeMolCil ;
   private short[] T01KI43_A9686OePasLin ;
   private short[] T01KI43_A9694OePasPLi ;
   private String[] T01KI44_A396EmprCod ;
   private long[] T01KI44_A9652OeNum ;
   private int[] T01KI44_A9653OeHdr ;
   private byte[] T01KI44_A9654OeHdrr ;
   private String[] T01KI44_A9655OeHdrp ;
   private byte[] T01KI44_A9656OeLinC ;
   private String[] T01KI44_A9657OeComb ;
   private String[] T01KI44_A9658Oefondo ;
   private byte[] T01KI44_A9659OeMolCil ;
   private byte[] T01KI44_A9677OeMolLin ;
   private String[] T01KI45_A396EmprCod ;
   private int[] T01KI45_A9578Pas_Num ;
   private String[] T01KI45_A719PrdNum ;
   private boolean[] T01KI45_n719PrdNum ;
   private String[] T01KI46_A396EmprCod ;
   private String[] T01KI46_A719PrdNum ;
   private boolean[] T01KI46_n719PrdNum ;
   private byte[] T01KI46_A8908CC_AlmCod ;
   private String[] T01KI47_A396EmprCod ;
   private String[] T01KI47_A719PrdNum ;
   private boolean[] T01KI47_n719PrdNum ;
   private int[] T01KI47_A8661Almc_Ln ;
   private String[] T01KI48_A396EmprCod ;
   private String[] T01KI48_A719PrdNum ;
   private boolean[] T01KI48_n719PrdNum ;
   private String[] T01KI48_A8648Mat_PrdN ;
   private String[] T01KI49_A396EmprCod ;
   private long[] T01KI49_A8585Pet_cod ;
   private String[] T01KI49_A719PrdNum ;
   private boolean[] T01KI49_n719PrdNum ;
   private String[] T01KI50_A396EmprCod ;
   private String[] T01KI50_A719PrdNum ;
   private boolean[] T01KI50_n719PrdNum ;
   private java.util.Date[] T01KI50_A8577RecFecHr ;
   private String[] T01KI51_A396EmprCod ;
   private String[] T01KI51_A719PrdNum ;
   private boolean[] T01KI51_n719PrdNum ;
   private short[] T01KI51_A8366PrdAnyo ;
   private int[] T01KI51_A8360PrdProv ;
   private String[] T01KI52_A396EmprCod ;
   private int[] T01KI52_A252CliCod ;
   private String[] T01KI52_A494ForSer ;
   private String[] T01KI52_A482ForColNom ;
   private int[] T01KI52_A483ForColNum ;
   private byte[] T01KI52_A831TipColCod ;
   private short[] T01KI52_A7797Sim_lin ;
   private String[] T01KI53_A396EmprCod ;
   private int[] T01KI53_A7163Vir_Codigo ;
   private String[] T01KI53_A719PrdNum ;
   private boolean[] T01KI53_n719PrdNum ;
   private String[] T01KI54_A396EmprCod ;
   private String[] T01KI54_A6310Lb_TaAuxC ;
   private short[] T01KI54_A6313lb_TaAuxL ;
   private short[] T01KI54_A6378Lb_TauxLP ;
   private String[] T01KI55_A396EmprCod ;
   private int[] T01KI55_A6290PreCoNum ;
   private String[] T01KI55_A719PrdNum ;
   private boolean[] T01KI55_n719PrdNum ;
   private String[] T01KI56_A396EmprCod ;
   private String[] T01KI56_A719PrdNum ;
   private boolean[] T01KI56_n719PrdNum ;
   private int[] T01KI56_A6158PrdPrv ;
   private String[] T01KI57_A396EmprCod ;
   private String[] T01KI57_A719PrdNum ;
   private boolean[] T01KI57_n719PrdNum ;
   private String[] T01KI57_A5973PrdSusNum ;
   private String[] T01KI58_A396EmprCod ;
   private String[] T01KI58_A5612Lb_CodGru ;
   private short[] T01KI58_A5615Lb_LinGru ;
   private String[] T01KI59_A396EmprCod ;
   private int[] T01KI59_A5532Lb_numero ;
   private String[] T01KI59_A5555Lb_opcion ;
   private short[] T01KI59_A5560Lb_LineaPr ;
   private String[] T01KI60_A396EmprCod ;
   private int[] T01KI60_A5532Lb_numero ;
   private String[] T01KI60_A5555Lb_opcion ;
   private short[] T01KI60_A5557Lb_LineaC ;
   private String[] T01KI61_A396EmprCod ;
   private int[] T01KI61_A5145SobCod ;
   private String[] T01KI61_A719PrdNum ;
   private boolean[] T01KI61_n719PrdNum ;
   private String[] T01KI62_A396EmprCod ;
   private int[] T01KI62_A4744RecPreCod ;
   private short[] T01KI62_A4762RecPreLin ;
   private short[] T01KI62_A4763RecPreNli ;
   private String[] T01KI63_A396EmprCod ;
   private int[] T01KI63_A4492HreBarCod ;
   private byte[] T01KI63_A4493HreBarReo ;
   private String[] T01KI63_A4494HreBarPar ;
   private byte[] T01KI63_A4495HreNumCie ;
   private short[] T01KI63_A4545HreLinMaq ;
   private byte[] T01KI63_A4550HreLinPro ;
   private short[] T01KI63_A4557HreRecLin ;
   private String[] T01KI64_A396EmprCod ;
   private int[] T01KI64_A4492HreBarCod ;
   private byte[] T01KI64_A4493HreBarReo ;
   private String[] T01KI64_A4494HreBarPar ;
   private byte[] T01KI64_A4495HreNumCie ;
   private short[] T01KI64_A4508HreLinMAL ;
   private byte[] T01KI64_A4509HreNumAny ;
   private String[] T01KI64_A719PrdNum ;
   private boolean[] T01KI64_n719PrdNum ;
   private String[] T01KI65_A396EmprCod ;
   private int[] T01KI65_A252CliCod ;
   private String[] T01KI65_A4415EstCol ;
   private short[] T01KI65_A4416EstColLin ;
   private String[] T01KI66_A396EmprCod ;
   private int[] T01KI66_A129BarCod ;
   private byte[] T01KI66_A132BarCodReo ;
   private String[] T01KI66_A130BarCodPar ;
   private byte[] T01KI66_A2524DisComLin ;
   private String[] T01KI66_A1056DisComCod ;
   private String[] T01KI66_A1032FonCod ;
   private byte[] T01KI66_A2124RecMolCod ;
   private short[] T01KI66_A2672RecPasLin ;
   private short[] T01KI66_A2675RecPasPLi ;
   private String[] T01KI67_A396EmprCod ;
   private int[] T01KI67_A129BarCod ;
   private byte[] T01KI67_A132BarCodReo ;
   private String[] T01KI67_A130BarCodPar ;
   private byte[] T01KI67_A2524DisComLin ;
   private String[] T01KI67_A1056DisComCod ;
   private String[] T01KI67_A1032FonCod ;
   private byte[] T01KI67_A2124RecMolCod ;
   private byte[] T01KI67_A2126RecMolLin ;
   private String[] T01KI68_A396EmprCod ;
   private String[] T01KI68_A2107PasCod ;
   private String[] T01KI68_A719PrdNum ;
   private boolean[] T01KI68_n719PrdNum ;
   private String[] T01KI69_A396EmprCod ;
   private int[] T01KI69_A2637HisEstHRu ;
   private byte[] T01KI69_A2636HisEstHRe ;
   private String[] T01KI69_A2635HisEstHPa ;
   private byte[] T01KI69_A2638HisEstLCo ;
   private String[] T01KI69_A2630HisEstCom ;
   private String[] T01KI69_A2634HisEstFon ;
   private String[] T01KI69_A719PrdNum ;
   private boolean[] T01KI69_n719PrdNum ;
   private String[] T01KI70_A396EmprCod ;
   private int[] T01KI70_A252CliCod ;
   private String[] T01KI70_A2141SerEst ;
   private String[] T01KI70_A1013DibCli ;
   private int[] T01KI70_A1014DibInt ;
   private String[] T01KI70_A2074ColCom ;
   private String[] T01KI70_A2078ColFon ;
   private byte[] T01KI70_A2098MolCod ;
   private short[] T01KI70_A2535ForPrdLin ;
   private String[] T01KI71_A396EmprCod ;
   private String[] T01KI71_A719PrdNum ;
   private boolean[] T01KI71_n719PrdNum ;
   private long[] T01KI71_A3342CCStkLin ;
   private String[] T01KI72_A396EmprCod ;
   private int[] T01KI72_A252CliCod ;
   private String[] T01KI72_A2891HMaForSer ;
   private String[] T01KI72_A2892HMaForCNom ;
   private int[] T01KI72_A2893HMaForCNum ;
   private byte[] T01KI72_A2894HMaTipCCod ;
   private int[] T01KI72_A2895HMaForNumC ;
   private short[] T01KI72_A2897HMaColLin ;
   private java.util.Date[] T01KI72_A2896HMaFec ;
   private short[] T01KI72_A2907HmaLin ;
   private String[] T01KI73_A396EmprCod ;
   private int[] T01KI73_A129BarCod ;
   private byte[] T01KI73_A132BarCodReo ;
   private String[] T01KI73_A130BarCodPar ;
   private short[] T01KI73_A2808RecLinMAL ;
   private byte[] T01KI73_A1377RecNumAny ;
   private String[] T01KI73_A719PrdNum ;
   private boolean[] T01KI73_n719PrdNum ;
   private String[] T01KI74_A396EmprCod ;
   private int[] T01KI74_A129BarCod ;
   private byte[] T01KI74_A132BarCodReo ;
   private String[] T01KI74_A130BarCodPar ;
   private short[] T01KI74_A2804RecLinMaq ;
   private byte[] T01KI74_A1273RecLinPro ;
   private short[] T01KI74_A811RecLin ;
   private String[] T01KI75_A396EmprCod ;
   private int[] T01KI75_A129BarCod ;
   private byte[] T01KI75_A132BarCodReo ;
   private String[] T01KI75_A130BarCodPar ;
   private String[] T01KI75_A2494BarDosPro ;
   private String[] T01KI75_A719PrdNum ;
   private boolean[] T01KI75_n719PrdNum ;
   private String[] T01KI76_A396EmprCod ;
   private int[] T01KI76_A1314EnsLabCod ;
   private short[] T01KI76_A1317EnsLabLin ;
   private String[] T01KI77_A396EmprCod ;
   private String[] T01KI77_A910Workstat ;
   private int[] T01KI77_A887EscMLin ;
   private String[] T01KI78_A396EmprCod ;
   private int[] T01KI78_A859CumCodCont ;
   private String[] T01KI78_A719PrdNum ;
   private boolean[] T01KI78_n719PrdNum ;
   private String[] T01KI79_A396EmprCod ;
   private String[] T01KI79_A719PrdNum ;
   private boolean[] T01KI79_n719PrdNum ;
   private java.util.Date[] T01KI79_A810RecFec ;
   private String[] T01KI80_A396EmprCod ;
   private int[] T01KI80_A486ForNumCol ;
   private short[] T01KI80_A715PrdLin ;
   private String[] T01KI81_A396EmprCod ;
   private String[] T01KI81_A719PrdNum ;
   private boolean[] T01KI81_n719PrdNum ;
   private short[] T01KI81_A681PrdAny ;
   private String[] T01KI82_A396EmprCod ;
   private String[] T01KI82_A719PrdNum ;
   private boolean[] T01KI82_n719PrdNum ;
   private String[] T01KI82_A688PrdComCod ;
   private String[] T01KI83_A396EmprCod ;
   private String[] T01KI83_A719PrdNum ;
   private boolean[] T01KI83_n719PrdNum ;
   private String[] T01KI83_A680PrdAltNum ;
   private String[] T01KI84_A396EmprCod ;
   private int[] T01KI84_A658PedCod ;
   private String[] T01KI84_A719PrdNum ;
   private boolean[] T01KI84_n719PrdNum ;
   private String[] T01KI85_A396EmprCod ;
   private int[] T01KI85_A486ForNumCol ;
   private short[] T01KI85_A309ColLin ;
   private String[] T01KI86_A396EmprCod ;
   private String[] T01KI86_A719PrdNum ;
   private boolean[] T01KI86_n719PrdNum ;
   private int[] T01KI86_A647NumCon ;
   private String[] T01KI87_A396EmprCod ;
   private String[] T01KI87_A719PrdNum ;
   private boolean[] T01KI87_n719PrdNum ;
   private String[] T01KI88_A719PrdNum ;
   private boolean[] T01KI88_n719PrdNum ;
   private String[] T01KI88_A9715Tb1_Dsc ;
   private boolean[] T01KI88_n9715Tb1_Dsc ;
   private String[] T01KI88_A396EmprCod ;
   private short[] T01KI88_A9713Tb1_Cod ;
   private String[] T01KI89_A13785Tb1_codDsc ;
   private String[] T01KI89_A396EmprCod ;
   private short[] T01KI89_A9713Tb1_Cod ;
   private String[] T01KI90_A13785Tb1_codDsc ;
   private String[] T01KI90_A396EmprCod ;
   private short[] T01KI90_A9713Tb1_Cod ;
   private String[] T01KI91_A13785Tb1_codDsc ;
   private String[] T01KI91_A396EmprCod ;
   private short[] T01KI91_A9713Tb1_Cod ;
   private String[] T01KI4_A9715Tb1_Dsc ;
   private boolean[] T01KI4_n9715Tb1_Dsc ;
   private String[] T01KI92_A9715Tb1_Dsc ;
   private boolean[] T01KI92_n9715Tb1_Dsc ;
   private String[] T01KI93_A13785Tb1_codDsc ;
   private String[] T01KI93_A396EmprCod ;
   private short[] T01KI93_A9713Tb1_Cod ;
   private String[] T01KI94_A396EmprCod ;
   private String[] T01KI94_A719PrdNum ;
   private boolean[] T01KI94_n719PrdNum ;
   private short[] T01KI94_A9713Tb1_Cod ;
   private String[] T01KI3_A719PrdNum ;
   private boolean[] T01KI3_n719PrdNum ;
   private String[] T01KI3_A396EmprCod ;
   private short[] T01KI3_A9713Tb1_Cod ;
   private String[] T01KI95_A13785Tb1_codDsc ;
   private String[] T01KI95_A396EmprCod ;
   private short[] T01KI95_A9713Tb1_Cod ;
   private String[] T01KI2_A719PrdNum ;
   private boolean[] T01KI2_n719PrdNum ;
   private String[] T01KI2_A396EmprCod ;
   private short[] T01KI2_A9713Tb1_Cod ;
   private String[] T01KI98_A9715Tb1_Dsc ;
   private boolean[] T01KI98_n9715Tb1_Dsc ;
   private String[] T01KI99_A396EmprCod ;
   private String[] T01KI99_A719PrdNum ;
   private boolean[] T01KI99_n719PrdNum ;
   private short[] T01KI99_A9713Tb1_Cod ;
   private String[] T01KI100_A13785Tb1_codDsc ;
   private String[] T01KI101_A13785Tb1_codDsc ;
   private String[] T01KI101_A396EmprCod ;
   private short[] T01KI101_A9713Tb1_Cod ;
   private String[] T01KI102_A13785Tb1_codDsc ;
   private String[] T01KI102_A396EmprCod ;
   private short[] T01KI102_A9713Tb1_Cod ;
   private String[] T01KI103_A9715Tb1_Dsc ;
   private boolean[] T01KI103_n9715Tb1_Dsc ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV34WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV35TrnContext ;
}

final  class tcdnenc__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcdnenc__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcdnenc__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcdnenc__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcdnenc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01KI2", "SELECT PrdNum, EmprCod, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ? AND Tb1_Cod = ?  FOR UPDATE OF PrdNum NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI3", "SELECT PrdNum, EmprCod, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI4", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI5", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI6", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI8", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( PrdNum > ?) and EmprCod = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( PrdNum < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01KI12", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01KI13", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01KI14", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01KI15", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI16", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI17", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI18", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI19", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI20", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI21", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI22", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI23", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI24", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI25", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI26", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI27", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI28", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI29", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI30", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI31", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI32", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI33", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI34", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI35", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI36", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI37", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI38", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI39", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI40", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI41", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI42", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI43", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI44", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI45", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI46", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI47", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI48", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI49", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI50", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI51", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI52", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI53", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI54", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI55", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI56", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI57", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI58", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI59", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI60", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI61", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI62", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI63", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI64", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI65", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI66", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI67", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI68", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI69", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI70", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI71", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI72", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI73", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI74", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI75", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI76", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI77", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI78", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI79", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI80", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI81", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI82", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI83", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI84", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI85", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI86", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01KI87", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI88", "SELECT T1.PrdNum, T2.Tb1_Dsc, T1.EmprCod, T1.Tb1_Cod FROM (TXPCdnEnc T1 INNER JOIN TXPTABLE1 T2 ON T2.EmprCod = T1.EmprCod AND T2.Tb1_Cod = T1.Tb1_Cod) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.Tb1_Cod = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.Tb1_Cod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI89", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc, EmprCod, Tb1_Cod FROM TXPTABLE1 WHERE (EmprCod = ?) AND (Tb1_Cod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI90", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc, EmprCod, Tb1_Cod FROM TXPTABLE1 WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI91", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc, EmprCod, Tb1_Cod FROM TXPTABLE1 WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI92", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI93", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc, EmprCod, Tb1_Cod FROM TXPTABLE1 WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI94", "SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI95", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc, EmprCod, Tb1_Cod FROM TXPTABLE1 WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01KI96", "INSERT INTO TXPCdnEnc(PrdNum, EmprCod, Tb1_Cod) VALUES(?, ?, ?)", GX_NOMASK, "TXPCdnEnc")
         ,new UpdateCursor("T01KI97", "DELETE FROM TXPCdnEnc  WHERE EmprCod = ? AND PrdNum = ? AND Tb1_Cod = ?", GX_NOMASK, "TXPCdnEnc")
         ,new ForEachCursor("T01KI98", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI99", "SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, Tb1_Cod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI100", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc FROM TXPTABLE1 WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, '')))) like '%' || UPPER(?))) WHERE rownum <= 40 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI101", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc, EmprCod, Tb1_Cod FROM TXPTABLE1 WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI102", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) AS Tb1_codDsc, EmprCod, Tb1_Cod FROM TXPTABLE1 WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(Tb1_Cod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( Tb1_Dsc, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01KI103", "SELECT Tb1_Dsc FROM TXPTABLE1 WHERE EmprCod = ? AND Tb1_Cod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 26);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 12);
               ((String[]) buf[3])[0] = rslt.getString(4, 12);
               ((String[]) buf[4])[0] = rslt.getString(5, 12);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 26);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
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
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 33 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 34 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 35 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 38 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 39 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 40 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((short[]) buf[10])[0] = rslt.getShort(11);
               return;
            case 42 :
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
            case 43 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 44 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 45 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 46 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 47 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 48 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               return;
            case 49 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 50 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 51 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 52 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 53 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 54 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 55 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 56 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 59 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 61 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
            case 62 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 63 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((short[]) buf[3])[0] = rslt.getShort(4);
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
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               return;
            case 65 :
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
            case 66 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 67 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 12);
               ((String[]) buf[6])[0] = rslt.getString(7, 12);
               ((String[]) buf[7])[0] = rslt.getString(8, 6);
               return;
            case 68 :
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
            case 69 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               return;
            case 70 :
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
            case 71 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 72 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 73 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 6);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               return;
            case 74 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 75 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 10);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 76 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 77 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               return;
            case 78 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 79 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 80 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 81 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 82 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 83 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 84 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 85 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 80);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((short[]) buf[4])[0] = rslt.getShort(4);
               return;
            case 87 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 88 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 89 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 91 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 92 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 93 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 96 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 97 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 98 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 99 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 100 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 101 :
               ((String[]) buf[0])[0] = rslt.getString(1, 80);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
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
               return;
            case 8 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
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
               stmt.setString(2, (String)parms[2], 3);
               return;
            case 10 :
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
            case 11 :
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
               return;
            case 85 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 87 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 88 :
               stmt.setVarchar(1, (String)parms[0], 90);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 89 :
               stmt.setVarchar(1, (String)parms[0], 90);
               stmt.setString(2, (String)parms[1], 3);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 91 :
               stmt.setVarchar(1, (String)parms[0], 90);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 92 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 93 :
               stmt.setVarchar(1, (String)parms[0], 90);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 94 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 6);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 95 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               stmt.setShort(3, ((Number) parms[3]).shortValue());
               return;
            case 96 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 97 :
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
            case 98 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 90);
               return;
            case 99 :
               stmt.setVarchar(1, (String)parms[0], 90);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 100 :
               stmt.setVarchar(1, (String)parms[0], 90);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 101 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

