package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tnprovprd_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"PRDPNOM") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6158PrdPrv = (int)(GXutil.lval( httpContext.GetPar( "PrdPrv"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaprdpnom1O4898( A396EmprCod, A6158PrdPrv) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_proveedores") == 0 )
      {
         gxnrgridlevel_proveedores_newrow_invoke( ) ;
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
            AV34PrdNum = httpContext.GetPar( "PrdNum") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34PrdNum", AV34PrdNum);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34PrdNum, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "n Proveedores 1 Producto", ""), (short)(0)) ;
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

   public void gxnrgridlevel_proveedores_newrow_invoke( )
   {
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      edtPrdPrv_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Horizontalalignment", edtPrdPrv_Horizontalalignment, !bGXsfl_32_Refreshing);
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_proveedores_newrow( ) ;
      /* End function gxnrGridlevel_proveedores_newrow_invoke */
   }

   public tnprovprd_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tnprovprd_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tnprovprd_impl.class ));
   }

   public tnprovprd_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRD.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRD.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_proveedores_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_proveedores( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TnPROVPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TnPROVPRD.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TnPROVPRD.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV40Pgmname), GXutil.rtrim( localUtil.format( AV40Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TnPROVPRD.htm");
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
      ucCombo_prdprv.setProperty("Caption", Combo_prdprv_Caption);
      ucCombo_prdprv.setProperty("Cls", Combo_prdprv_Cls);
      ucCombo_prdprv.setProperty("IsGridItem", Combo_prdprv_Isgriditem);
      ucCombo_prdprv.setProperty("DropDownOptionsData", AV38PrdPrv_Data);
      ucCombo_prdprv.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdprv_Internalname, "COMBO_PRDPRVContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_proveedores( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount898 = (short)(1) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_898 = (short)(1) ;
            scanStart1O4898( ) ;
            while ( RcdFound898 != 0 )
            {
               init_level_properties898( ) ;
               getByPrimaryKey1O4898( ) ;
               addRow1O4898( ) ;
               scanNext1O4898( ) ;
            }
            scanEnd1O4898( ) ;
            nBlankRcdCount898 = (short)(1) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1O4898( ) ;
         standaloneModal1O4898( ) ;
         sMode898 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow1O4898( ) ;
            edtPrdPrv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPRV_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrv_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtPrdPrv_Horizontalalignment = httpContext.cgiGet( "PRDPRV_"+sGXsfl_32_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Horizontalalignment", edtPrdPrv_Horizontalalignment, !bGXsfl_32_Refreshing);
            edtPrdPrea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdPrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrea_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtPrdRefn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDREFN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtPrdRefn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_898 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1O4898( ) ;
            }
            sendRow1O4898( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode898 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount898 = (short)(1) ;
         nRcdExists_898 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1O4898( ) ;
            while ( RcdFound898 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_32898( ) ;
               init_level_properties898( ) ;
               standaloneNotModal1O4898( ) ;
               getByPrimaryKey1O4898( ) ;
               standaloneModal1O4898( ) ;
               addRow1O4898( ) ;
               scanNext1O4898( ) ;
            }
            scanEnd1O4898( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode898 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_32898( ) ;
         initAll1O4898( ) ;
         init_level_properties898( ) ;
         nRcdExists_898 = (short)(0) ;
         nIsMod_898 = (short)(0) ;
         nRcdDeleted_898 = (short)(0) ;
         nBlankRcdCount898 = (short)(nBlankRcdUsr898+nBlankRcdCount898) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount898 > 0 )
         {
            standaloneNotModal1O4898( ) ;
            standaloneModal1O4898( ) ;
            addRow1O4898( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtPrdPrv_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount898 = (short)(nBlankRcdCount898-1) ;
         }
         Gx_mode = sMode898 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_proveedoresContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_proveedores", Gridlevel_proveedoresContainer, subGridlevel_proveedores_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_proveedoresContainerData", Gridlevel_proveedoresContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_proveedoresContainerData"+"V", Gridlevel_proveedoresContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_proveedoresContainerData"+"V"+"\" value='"+Gridlevel_proveedoresContainer.GridValuesHidden()+"'/>") ;
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
      e111O42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDPRV_DATA"), AV38PrdPrv_Data);
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
            AV34PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A6159PrdPNom = httpContext.cgiGet( "PRDPNOM") ;
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
            Combo_prdprv_Objectcall = httpContext.cgiGet( "COMBO_PRDPRV_Objectcall") ;
            Combo_prdprv_Class = httpContext.cgiGet( "COMBO_PRDPRV_Class") ;
            Combo_prdprv_Icontype = httpContext.cgiGet( "COMBO_PRDPRV_Icontype") ;
            Combo_prdprv_Icon = httpContext.cgiGet( "COMBO_PRDPRV_Icon") ;
            Combo_prdprv_Caption = httpContext.cgiGet( "COMBO_PRDPRV_Caption") ;
            Combo_prdprv_Tooltip = httpContext.cgiGet( "COMBO_PRDPRV_Tooltip") ;
            Combo_prdprv_Cls = httpContext.cgiGet( "COMBO_PRDPRV_Cls") ;
            Combo_prdprv_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDPRV_Selectedvalue_set") ;
            Combo_prdprv_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDPRV_Selectedvalue_get") ;
            Combo_prdprv_Selectedtext_set = httpContext.cgiGet( "COMBO_PRDPRV_Selectedtext_set") ;
            Combo_prdprv_Selectedtext_get = httpContext.cgiGet( "COMBO_PRDPRV_Selectedtext_get") ;
            Combo_prdprv_Gamoauthtoken = httpContext.cgiGet( "COMBO_PRDPRV_Gamoauthtoken") ;
            Combo_prdprv_Ddointernalname = httpContext.cgiGet( "COMBO_PRDPRV_Ddointernalname") ;
            Combo_prdprv_Titlecontrolalign = httpContext.cgiGet( "COMBO_PRDPRV_Titlecontrolalign") ;
            Combo_prdprv_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PRDPRV_Dropdownoptionstype") ;
            Combo_prdprv_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Enabled")) ;
            Combo_prdprv_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Visible")) ;
            Combo_prdprv_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PRDPRV_Titlecontrolidtoreplace") ;
            Combo_prdprv_Datalisttype = httpContext.cgiGet( "COMBO_PRDPRV_Datalisttype") ;
            Combo_prdprv_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Allowmultipleselection")) ;
            Combo_prdprv_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PRDPRV_Datalistfixedvalues") ;
            Combo_prdprv_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Isgriditem")) ;
            Combo_prdprv_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Hasdescription")) ;
            Combo_prdprv_Datalistproc = httpContext.cgiGet( "COMBO_PRDPRV_Datalistproc") ;
            Combo_prdprv_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PRDPRV_Datalistprocparametersprefix") ;
            Combo_prdprv_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PRDPRV_Remoteservicesparameters") ;
            Combo_prdprv_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PRDPRV_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_prdprv_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Includeonlyselectedoption")) ;
            Combo_prdprv_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Includeselectalloption")) ;
            Combo_prdprv_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Emptyitem")) ;
            Combo_prdprv_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDPRV_Includeaddnewoption")) ;
            Combo_prdprv_Htmltemplate = httpContext.cgiGet( "COMBO_PRDPRV_Htmltemplate") ;
            Combo_prdprv_Multiplevaluestype = httpContext.cgiGet( "COMBO_PRDPRV_Multiplevaluestype") ;
            Combo_prdprv_Loadingdata = httpContext.cgiGet( "COMBO_PRDPRV_Loadingdata") ;
            Combo_prdprv_Noresultsfound = httpContext.cgiGet( "COMBO_PRDPRV_Noresultsfound") ;
            Combo_prdprv_Emptyitemtext = httpContext.cgiGet( "COMBO_PRDPRV_Emptyitemtext") ;
            Combo_prdprv_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PRDPRV_Onlyselectedvalues") ;
            Combo_prdprv_Selectalltext = httpContext.cgiGet( "COMBO_PRDPRV_Selectalltext") ;
            Combo_prdprv_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PRDPRV_Multiplevaluesseparator") ;
            Combo_prdprv_Addnewoptiontext = httpContext.cgiGet( "COMBO_PRDPRV_Addnewoptiontext") ;
            /* Read variables values. */
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            n719PrdNum = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            AV40Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TnPROVPRD");
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
               GXutil.writeLogError("tnprovprd:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1O40( ) ;
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
                        e111O42 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121O42 ();
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
         e121O42 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1O429( ) ;
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
         disableAttributes1O429( ) ;
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

   public void confirm_1O40( )
   {
      beforeValidate1O429( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1O429( ) ;
         }
         else
         {
            checkExtendedTable1O429( ) ;
            closeExtendedTableCursors1O429( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode29 = Gx_mode ;
         confirm_1O4898( ) ;
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

   public void confirm_1O4898( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1O4898( ) ;
         if ( ( nRcdExists_898 != 0 ) || ( nIsMod_898 != 0 ) )
         {
            getKey1O4898( ) ;
            if ( ( nRcdExists_898 == 0 ) && ( nRcdDeleted_898 == 0 ) )
            {
               if ( RcdFound898 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1O4898( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1O4898( ) ;
                     closeExtendedTableCursors1O4898( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "PRDPRV_" + sGXsfl_32_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtPrdPrv_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound898 != 0 )
               {
                  if ( nRcdDeleted_898 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1O4898( ) ;
                     load1O4898( ) ;
                     beforeValidate1O4898( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1O4898( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_898 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1O4898( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1O4898( ) ;
                           closeExtendedTableCursors1O4898( ) ;
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
                  if ( nRcdDeleted_898 == 0 )
                  {
                     GXCCtl = "PRDPRV_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdPrv_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A6158PrdPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPrea_Internalname, GXutil.ltrim( localUtil.ntoc( A7240PrdPrea, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdRefn_Internalname, GXutil.rtrim( A10121PrdRefn)) ;
         httpContext.changePostValue( "ZT_"+"Z6158PrdPrv_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z6158PrdPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7240PrdPrea_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z7240PrdPrea, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10121PrdRefn_"+sGXsfl_32_idx, GXutil.rtrim( Z10121PrdRefn)) ;
         httpContext.changePostValue( "nRcdDeleted_898_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_898_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_898_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_898 != 0 )
         {
            httpContext.changePostValue( "PRDPRV_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPRV_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtPrdPrv_Horizontalalignment)) ;
            httpContext.changePostValue( "PRDPREA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDREFN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRefn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1O40( )
   {
   }

   public void e111O42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tnprovprd_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tnprovprd_impl.this.A396EmprCod = GXv_char2[0] ;
      tnprovprd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tnprovprd_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tnprovprd_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tnprovprd_impl.this.AV32EmprCod = GXv_char4[0] ;
      tnprovprd_impl.this.AV11EmprNom = GXv_char3[0] ;
      tnprovprd_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV35WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_prdprv_Titlecontrolidtoreplace = edtPrdPrv_Internalname ;
      ucCombo_prdprv.sendProperty(context, "", false, Combo_prdprv_Internalname, "TitleControlIdToReplace", Combo_prdprv_Titlecontrolidtoreplace);
      edtPrdPrv_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Horizontalalignment", edtPrdPrv_Horizontalalignment, !bGXsfl_32_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOPRDPRV' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e121O42( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV36TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         callWebObject(formatLink("app.tnprovprdww", new String[] {}, new String[] {}) );
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

   public void S112( )
   {
      /* 'LOADCOMBOPRDPRV' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV38PrdPrv_Data ;
      GXv_char4[0] = AV39ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.tnprovprdloaddvcombo(remoteHandle, context).execute( "PrdPrv", Gx_mode, AV32EmprCod, AV34PrdNum, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tnprovprd_impl.this.AV39ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV38PrdPrv_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm1O429( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z718PrdNom = T01O45_A718PrdNom[0] ;
         }
         else
         {
            Z718PrdNom = A718PrdNom ;
         }
      }
      if ( GX_JID == -8 )
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
      AV40Pgmname = "TnPROVPRD" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40Pgmname", AV40Pgmname);
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
      /* Using cursor T01O46 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01O46_A407EmprNom[0] ;
      n407EmprNom = T01O46_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (GXutil.strcmp("", AV34PrdNum)==0) )
      {
         A719PrdNum = AV34PrdNum ;
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

   public void load1O429( )
   {
      /* Using cursor T01O47 */
      pr_default.execute(5, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A407EmprNom = T01O47_A407EmprNom[0] ;
         n407EmprNom = T01O47_n407EmprNom[0] ;
         A718PrdNom = T01O47_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         zm1O429( -8) ;
      }
      pr_default.close(5);
      onLoadActions1O429( ) ;
   }

   public void onLoadActions1O429( )
   {
   }

   public void checkExtendedTable1O429( )
   {
      nIsDirty_29 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1O429( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1O429( )
   {
      /* Using cursor T01O48 */
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
      /* Using cursor T01O45 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      if ( (pr_default.getStatus(3) != 101) && ( GXutil.strcmp(T01O45_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O429( 8) ;
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01O45_A719PrdNum[0] ;
         n719PrdNum = T01O45_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A718PrdNom = T01O45_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1O429( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey1O429( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey1O429( ) ;
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
      getKey1O429( ) ;
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
      /* Using cursor T01O49 */
      pr_default.execute(7, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01O49_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T01O49_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01O49_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T01O49_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01O49_A719PrdNum[0] ;
            n719PrdNum = T01O49_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T01O410 */
      pr_default.execute(8, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, A396EmprCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01O410_A719PrdNum[0], A719PrdNum) > 0 ) ) && ( GXutil.strcmp(T01O410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01O410_A719PrdNum[0], A719PrdNum) < 0 ) ) && ( GXutil.strcmp(T01O410_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A719PrdNum = T01O410_A719PrdNum[0] ;
            n719PrdNum = T01O410_n719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1O429( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1O429( ) ;
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
               update1O429( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) )
            {
               /* Insert record */
               insert1O429( ) ;
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
                  insert1O429( ) ;
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

   public void checkOptimisticConcurrency1O429( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O44 */
         pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z718PrdNom, T01O44_A718PrdNom[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z718PrdNom, T01O44_A718PrdNom[0]) != 0 )
            {
               GXutil.writeLogln("tnprovprd:[seudo value changed for attri]"+"PrdNom");
               GXutil.writeLogRaw("Old: ",Z718PrdNom);
               GXutil.writeLogRaw("Current: ",T01O44_A718PrdNom[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPRODUC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O429( )
   {
      beforeValidate1O429( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O429( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O429( 0) ;
         checkOptimisticConcurrency1O429( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O429( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O429( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O411 */
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
                        processLevel1O429( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1O40( ) ;
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
            load1O429( ) ;
         }
         endLevel1O429( ) ;
      }
      closeExtendedTableCursors1O429( ) ;
   }

   public void update1O429( )
   {
      beforeValidate1O429( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O429( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O429( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O429( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1O429( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O412 */
                  pr_default.execute(10, new Object[] {A718PrdNom, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPRODUC");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPRODUC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1O429( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1O429( ) ;
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
         endLevel1O429( ) ;
      }
      closeExtendedTableCursors1O429( ) ;
   }

   public void deferredUpdate1O429( )
   {
   }

   public void delete( )
   {
      beforeValidate1O429( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O429( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O429( ) ;
         afterConfirm1O429( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O429( ) ;
            if ( AnyError == 0 )
            {
               scanStart1O4898( ) ;
               while ( RcdFound898 != 0 )
               {
                  getByPrimaryKey1O4898( ) ;
                  delete1O4898( ) ;
                  scanNext1O4898( ) ;
               }
               scanEnd1O4898( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O413 */
                  pr_default.execute(11, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
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
      endLevel1O429( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O429( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01O414 */
         pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PrdNor", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01O415 */
         pr_default.execute(13, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Sustancias a controlar en Thelist", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01O416 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Colorantes o Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01O417 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01O418 */
         pr_default.execute(16, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Pastas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01O419 */
         pr_default.execute(17, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01O420 */
         pr_default.execute(18, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01O421 */
         pr_default.execute(19, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01O422 */
         pr_default.execute(20, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01O423 */
         pr_default.execute(21, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01O424 */
         pr_default.execute(22, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Disolucion Quimicos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01O425 */
         pr_default.execute(23, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Detalle Productos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T01O426 */
         pr_default.execute(24, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LOTES PRODUCTOS QUIMICOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T01O427 */
         pr_default.execute(25, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DEVOLUCION COMPRAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T01O428 */
         pr_default.execute(26, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LINEAS ENSAYO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
         /* Using cursor T01O429 */
         pr_default.execute(27, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(27) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "lreest", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(27);
         /* Using cursor T01O430 */
         pr_default.execute(28, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(28) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas Productos Especiales Es", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(28);
         /* Using cursor T01O431 */
         pr_default.execute(29, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(29) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Lineas productos estampacion", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(29);
         /* Using cursor T01O432 */
         pr_default.execute(30, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(30) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(30);
         /* Using cursor T01O433 */
         pr_default.execute(31, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(31) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(31);
         /* Using cursor T01O434 */
         pr_default.execute(32, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(32) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO MOV PRODUCTOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(32);
         /* Using cursor T01O435 */
         pr_default.execute(33, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(33) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(33);
         /* Using cursor T01O436 */
         pr_default.execute(34, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(34) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(34);
         /* Using cursor T01O437 */
         pr_default.execute(35, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(35) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(35);
         /* Using cursor T01O438 */
         pr_default.execute(36, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "JOTA01", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T01O439 */
         pr_default.execute(37, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BANYO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
         /* Using cursor T01O440 */
         pr_default.execute(38, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(38) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ZEPHYR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(38);
         /* Using cursor T01O441 */
         pr_default.execute(39, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(39) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDTB2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(39);
         /* Using cursor T01O442 */
         pr_default.execute(40, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(40) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDCERTI", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(40);
         /* Using cursor T01O443 */
         pr_default.execute(41, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(41) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE4", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(41);
         /* Using cursor T01O444 */
         pr_default.execute(42, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(42) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISOE2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(42);
         /* Using cursor T01O445 */
         pr_default.execute(43, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(43) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MAKEP1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(43);
         /* Using cursor T01O446 */
         pr_default.execute(44, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(44) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALMC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(44);
         /* Using cursor T01O447 */
         pr_default.execute(45, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(45) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMCONS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(45);
         /* Using cursor T01O448 */
         pr_default.execute(46, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(46) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MATPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(46);
         /* Using cursor T01O449 */
         pr_default.execute(47, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(47) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PETCC1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(47);
         /* Using cursor T01O450 */
         pr_default.execute(48, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(48) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INVPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(48);
         /* Using cursor T01O451 */
         pr_default.execute(49, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(49) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "INSEST", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(49);
         /* Using cursor T01O452 */
         pr_default.execute(50, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(50) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "FORLISs", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(50);
         /* Using cursor T01O453 */
         pr_default.execute(51, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(51) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ALMVI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(51);
         /* Using cursor T01O454 */
         pr_default.execute(52, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(52) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENS007", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(52);
         /* Using cursor T01O455 */
         pr_default.execute(53, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(53) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRESO1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(53);
         /* Using cursor T01O456 */
         pr_default.execute(54, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(54) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDSUS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(54);
         /* Using cursor T01O457 */
         pr_default.execute(55, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(55) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSPR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(55);
         /* Using cursor T01O458 */
         pr_default.execute(56, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(56) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS004", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(56);
         /* Using cursor T01O459 */
         pr_default.execute(57, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(57) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPENS003", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(57);
         /* Using cursor T01O460 */
         pr_default.execute(58, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(58) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "EstSo1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(58);
         /* Using cursor T01O461 */
         pr_default.execute(59, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(59) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRERLN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(59);
         /* Using cursor T01O462 */
         pr_default.execute(60, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(60) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISTORICO RECETAS (Lineas)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(60);
         /* Using cursor T01O463 */
         pr_default.execute(61, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(61) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISREA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(61);
         /* Using cursor T01O464 */
         pr_default.execute(62, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(62) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Formula Color Estampación", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(62);
         /* Using cursor T01O465 */
         pr_default.execute(63, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(63) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECDEP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(63);
         /* Using cursor T01O466 */
         pr_default.execute(64, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(64) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPRD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(64);
         /* Using cursor T01O467 */
         pr_default.execute(65, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(65) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPASTA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(65);
         /* Using cursor T01O468 */
         pr_default.execute(66, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(66) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISCOL", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(66);
         /* Using cursor T01O469 */
         pr_default.execute(67, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(67) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECPR2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(67);
         /* Using cursor T01O470 */
         pr_default.execute(68, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(68) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSTKS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(68);
         /* Using cursor T01O471 */
         pr_default.execute(69, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(69) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "HISMAC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(69);
         /* Using cursor T01O472 */
         pr_default.execute(70, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(70) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LANYAD", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(70);
         /* Using cursor T01O473 */
         pr_default.execute(71, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(71) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LRECET", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(71);
         /* Using cursor T01O474 */
         pr_default.execute(72, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(72) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARDOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(72);
         /* Using cursor T01O475 */
         pr_default.execute(73, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(73) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LENLAB", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(73);
         /* Using cursor T01O476 */
         pr_default.execute(74, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(74) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ESCMAN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(74);
         /* Using cursor T01O477 */
         pr_default.execute(75, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(75) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "TXPLCUMCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(75);
         /* Using cursor T01O478 */
         pr_default.execute(76, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(76) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "RECUEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(76);
         /* Using cursor T01O479 */
         pr_default.execute(77, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(77) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRFOR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(77);
         /* Using cursor T01O480 */
         pr_default.execute(78, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(78) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CPRDES", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(78);
         /* Using cursor T01O481 */
         pr_default.execute(79, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(79) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPRDCO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(79);
         /* Using cursor T01O482 */
         pr_default.execute(80, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(80) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PRDALT", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(80);
         /* Using cursor T01O483 */
         pr_default.execute(81, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(81) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LPEDID", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(81);
         /* Using cursor T01O484 */
         pr_default.execute(82, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(82) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LDFORM", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(82);
         /* Using cursor T01O485 */
         pr_default.execute(83, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
         if ( (pr_default.getStatus(83) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DETCON", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(83);
      }
   }

   public void processNestedLevel1O4898( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1O4898( ) ;
         if ( ( nRcdExists_898 != 0 ) || ( nIsMod_898 != 0 ) )
         {
            standaloneNotModal1O4898( ) ;
            getKey1O4898( ) ;
            if ( ( nRcdExists_898 == 0 ) && ( nRcdDeleted_898 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1O4898( ) ;
            }
            else
            {
               if ( RcdFound898 != 0 )
               {
                  if ( ( nRcdDeleted_898 != 0 ) && ( nRcdExists_898 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1O4898( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_898 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1O4898( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_898 == 0 )
                  {
                     GXCCtl = "PRDPRV_" + sGXsfl_32_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtPrdPrv_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtPrdPrv_Internalname, GXutil.ltrim( localUtil.ntoc( A6158PrdPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdPrea_Internalname, GXutil.ltrim( localUtil.ntoc( A7240PrdPrea, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtPrdRefn_Internalname, GXutil.rtrim( A10121PrdRefn)) ;
         httpContext.changePostValue( "ZT_"+"Z6158PrdPrv_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z6158PrdPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z7240PrdPrea_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z7240PrdPrea, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z10121PrdRefn_"+sGXsfl_32_idx, GXutil.rtrim( Z10121PrdRefn)) ;
         httpContext.changePostValue( "nRcdDeleted_898_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_898_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_898_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_898 != 0 )
         {
            httpContext.changePostValue( "PRDPRV_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrv_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDPRV_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtPrdPrv_Horizontalalignment)) ;
            httpContext.changePostValue( "PRDPREA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrea_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "PRDREFN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRefn_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1O4898( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_898 = (short)(0) ;
      nIsMod_898 = (short)(0) ;
      nRcdDeleted_898 = (short)(0) ;
   }

   public void processLevel1O429( )
   {
      /* Save parent mode. */
      sMode29 = Gx_mode ;
      processNestedLevel1O4898( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1O429( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1O429( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tnprovprd");
         if ( AnyError == 0 )
         {
            confirmValues1O40( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tnprovprd");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1O429( )
   {
      /* Scan By routine */
      /* Using cursor T01O486 */
      pr_default.execute(84, new Object[] {A396EmprCod});
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01O486_A719PrdNum[0] ;
         n719PrdNum = T01O486_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O429( )
   {
      /* Scan next routine */
      pr_default.readNext(84);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(84) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A719PrdNum = T01O486_A719PrdNum[0] ;
         n719PrdNum = T01O486_n719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
   }

   public void scanEnd1O429( )
   {
      pr_default.close(84);
   }

   public void afterConfirm1O429( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1O429( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O429( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O429( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O429( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O429( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O429( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1O4898( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z7240PrdPrea = T01O43_A7240PrdPrea[0] ;
            Z10121PrdRefn = T01O43_A10121PrdRefn[0] ;
         }
         else
         {
            Z7240PrdPrea = A7240PrdPrea ;
            Z10121PrdRefn = A10121PrdRefn ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z719PrdNum = A719PrdNum ;
         Z6158PrdPrv = A6158PrdPrv ;
         Z7240PrdPrea = A7240PrdPrea ;
         Z10121PrdRefn = A10121PrdRefn ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal1O4898( )
   {
   }

   public void standaloneModal1O4898( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtPrdPrv_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrv_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
      else
      {
         edtPrdPrv_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrv_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      }
   }

   public void load1O4898( )
   {
      /* Using cursor T01O487 */
      pr_default.execute(85, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A6158PrdPrv)});
      if ( (pr_default.getStatus(85) != 101) )
      {
         RcdFound898 = (short)(1) ;
         A7240PrdPrea = T01O487_A7240PrdPrea[0] ;
         A10121PrdRefn = T01O487_A10121PrdRefn[0] ;
         zm1O4898( -10) ;
      }
      pr_default.close(85);
      onLoadActions1O4898( ) ;
   }

   public void onLoadActions1O4898( )
   {
      GXt_char1 = A6159PrdPNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A6158PrdPrv ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      tnprovprd_impl.this.A396EmprCod = GXv_char4[0] ;
      tnprovprd_impl.this.A6158PrdPrv = GXv_int8[0] ;
      tnprovprd_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6159PrdPNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6159PrdPNom", A6159PrdPNom);
   }

   public void checkExtendedTable1O4898( )
   {
      nIsDirty_898 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1O4898( ) ;
      nIsDirty_898 = (short)(1) ;
      GXt_char1 = A6159PrdPNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A6158PrdPrv ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      tnprovprd_impl.this.A396EmprCod = GXv_char4[0] ;
      tnprovprd_impl.this.A6158PrdPrv = GXv_int8[0] ;
      tnprovprd_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6159PrdPNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6159PrdPNom", A6159PrdPNom);
   }

   public void closeExtendedTableCursors1O4898( )
   {
   }

   public void enableDisable1O4898( )
   {
   }

   public void getKey1O4898( )
   {
      /* Using cursor T01O488 */
      pr_default.execute(86, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A6158PrdPrv)});
      if ( (pr_default.getStatus(86) != 101) )
      {
         RcdFound898 = (short)(1) ;
      }
      else
      {
         RcdFound898 = (short)(0) ;
      }
      pr_default.close(86);
   }

   public void getByPrimaryKey1O4898( )
   {
      /* Using cursor T01O43 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A6158PrdPrv)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01O43_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1O4898( 10) ;
         RcdFound898 = (short)(1) ;
         initializeNonKey1O4898( ) ;
         A6158PrdPrv = T01O43_A6158PrdPrv[0] ;
         A7240PrdPrea = T01O43_A7240PrdPrea[0] ;
         A10121PrdRefn = T01O43_A10121PrdRefn[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z6158PrdPrv = A6158PrdPrv ;
         sMode898 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1O4898( ) ;
         Gx_mode = sMode898 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound898 = (short)(0) ;
         initializeNonKey1O4898( ) ;
         sMode898 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1O4898( ) ;
         Gx_mode = sMode898 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1O4898( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1O4898( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01O42 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A6158PrdPrv)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROPRV"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( DecimalUtil.compareTo(Z7240PrdPrea, T01O42_A7240PrdPrea[0]) != 0 ) || ( GXutil.strcmp(Z10121PrdRefn, T01O42_A10121PrdRefn[0]) != 0 ) )
         {
            if ( DecimalUtil.compareTo(Z7240PrdPrea, T01O42_A7240PrdPrea[0]) != 0 )
            {
               GXutil.writeLogln("tnprovprd:[seudo value changed for attri]"+"PrdPrea");
               GXutil.writeLogRaw("Old: ",Z7240PrdPrea);
               GXutil.writeLogRaw("Current: ",T01O42_A7240PrdPrea[0]);
            }
            if ( GXutil.strcmp(Z10121PrdRefn, T01O42_A10121PrdRefn[0]) != 0 )
            {
               GXutil.writeLogln("tnprovprd:[seudo value changed for attri]"+"PrdRefn");
               GXutil.writeLogRaw("Old: ",Z10121PrdRefn);
               GXutil.writeLogRaw("Current: ",T01O42_A10121PrdRefn[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROPRV"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1O4898( )
   {
      beforeValidate1O4898( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O4898( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1O4898( 0) ;
         checkOptimisticConcurrency1O4898( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1O4898( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1O4898( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01O489 */
                  pr_default.execute(87, new Object[] {Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A6158PrdPrv), A7240PrdPrea, A10121PrdRefn, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
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
            load1O4898( ) ;
         }
         endLevel1O4898( ) ;
      }
      closeExtendedTableCursors1O4898( ) ;
   }

   public void update1O4898( )
   {
      beforeValidate1O4898( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1O4898( ) ;
      }
      if ( ( nIsMod_898 != 0 ) || ( nIsDirty_898 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1O4898( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1O4898( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1O4898( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01O490 */
                     pr_default.execute(88, new Object[] {A7240PrdPrea, A10121PrdRefn, A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A6158PrdPrv)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
                     if ( (pr_default.getStatus(88) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROPRV"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1O4898( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1O4898( ) ;
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
            endLevel1O4898( ) ;
         }
      }
      closeExtendedTableCursors1O4898( ) ;
   }

   public void deferredUpdate1O4898( )
   {
   }

   public void delete1O4898( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1O4898( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1O4898( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1O4898( ) ;
         afterConfirm1O4898( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1O4898( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01O491 */
               pr_default.execute(89, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum, Integer.valueOf(A6158PrdPrv)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROPRV");
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
      sMode898 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1O4898( ) ;
      Gx_mode = sMode898 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1O4898( )
   {
      standaloneModal1O4898( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         GXt_char1 = A6159PrdPNom ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A6158PrdPrv ;
         GXv_char3[0] = GXt_char1 ;
         new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
         tnprovprd_impl.this.A396EmprCod = GXv_char4[0] ;
         tnprovprd_impl.this.A6158PrdPrv = GXv_int8[0] ;
         tnprovprd_impl.this.GXt_char1 = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A6159PrdPNom = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, "A6159PrdPNom", A6159PrdPNom);
      }
   }

   public void endLevel1O4898( )
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

   public void scanStart1O4898( )
   {
      /* Scan By routine */
      /* Using cursor T01O492 */
      pr_default.execute(90, new Object[] {A396EmprCod, Boolean.valueOf(n719PrdNum), A719PrdNum});
      RcdFound898 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound898 = (short)(1) ;
         A6158PrdPrv = T01O492_A6158PrdPrv[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1O4898( )
   {
      /* Scan next routine */
      pr_default.readNext(90);
      RcdFound898 = (short)(0) ;
      if ( (pr_default.getStatus(90) != 101) )
      {
         RcdFound898 = (short)(1) ;
         A6158PrdPrv = T01O492_A6158PrdPrv[0] ;
      }
   }

   public void scanEnd1O4898( )
   {
      pr_default.close(90);
   }

   public void afterConfirm1O4898( )
   {
      /* After Confirm Rules */
      if ( ( A6158PrdPrv == 0 ) && true /* After */ )
      {
         GXCCtl = "PRDPRV_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo Nulo", ""), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdPrv_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1O4898( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1O4898( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1O4898( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1O4898( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1O4898( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1O4898( )
   {
      edtPrdPrv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrv_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtPrdPrea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPrea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrea_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtPrdRefn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdRefn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdRefn_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes1O4898( )
   {
   }

   public void send_integrity_lvl_hashes1O429( )
   {
   }

   public void subsflControlProps_32898( )
   {
      edtPrdPrv_Internalname = "PRDPRV_"+sGXsfl_32_idx ;
      edtPrdPrea_Internalname = "PRDPREA_"+sGXsfl_32_idx ;
      edtPrdRefn_Internalname = "PRDREFN_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_32898( )
   {
      edtPrdPrv_Internalname = "PRDPRV_"+sGXsfl_32_fel_idx ;
      edtPrdPrea_Internalname = "PRDPREA_"+sGXsfl_32_fel_idx ;
      edtPrdRefn_Internalname = "PRDREFN_"+sGXsfl_32_fel_idx ;
   }

   public void addRow1O4898( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32898( ) ;
      sendRow1O4898( ) ;
   }

   public void sendRow1O4898( )
   {
      Gridlevel_proveedoresRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_proveedores_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_proveedores_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_proveedores_Class, "") != 0 )
         {
            subGridlevel_proveedores_Linesclass = subGridlevel_proveedores_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_proveedores_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_proveedores_Backstyle = (byte)(0) ;
         subGridlevel_proveedores_Backcolor = subGridlevel_proveedores_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_proveedores_Class, "") != 0 )
         {
            subGridlevel_proveedores_Linesclass = subGridlevel_proveedores_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_proveedores_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_proveedores_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_proveedores_Class, "") != 0 )
         {
            subGridlevel_proveedores_Linesclass = subGridlevel_proveedores_Class+"Odd" ;
         }
         subGridlevel_proveedores_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_proveedores_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_proveedores_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
         {
            subGridlevel_proveedores_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_proveedores_Class, "") != 0 )
            {
               subGridlevel_proveedores_Linesclass = subGridlevel_proveedores_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_proveedores_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_proveedores_Class, "") != 0 )
            {
               subGridlevel_proveedores_Linesclass = subGridlevel_proveedores_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_898_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_proveedoresRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPrv_Internalname,GXutil.ltrim( localUtil.ntoc( A6158PrdPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A6158PrdPrv), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPrv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdPrv_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtPrdPrv_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_898_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_proveedoresRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPrea_Internalname,GXutil.ltrim( localUtil.ntoc( A7240PrdPrea, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtPrdPrea_Enabled!=0) ? localUtil.format( A7240PrdPrea, "ZZZZZZZ9.99999") : localUtil.format( A7240PrdPrea, "ZZZZZZZ9.99999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdPrea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdPrea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_898_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_proveedoresRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRefn_Internalname,GXutil.rtrim( A10121PrdRefn),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,35);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRefn_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtPrdRefn_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_proveedoresRow);
      send_integrity_lvl_hashes1O4898( ) ;
      GXCCtl = "Z6158PrdPrv_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6158PrdPrv, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z7240PrdPrea_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z7240PrdPrea, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z10121PrdRefn_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z10121PrdRefn));
      GXCCtl = "nRcdDeleted_898_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_898_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_898_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_898, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_32_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV36TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vPRDNUM_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34PrdNum));
      GXCCtl = "EMPRCOD_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPRV_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrv_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPRV_"+sGXsfl_32_idx+"Horizontalalignment", GXutil.rtrim( edtPrdPrv_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREA_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrea_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDREFN_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRefn_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_proveedoresContainer.AddRow(Gridlevel_proveedoresRow);
   }

   public void readRow1O4898( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32898( ) ;
      edtPrdPrv_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPRV_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdPrv_Horizontalalignment = httpContext.cgiGet( "PRDPRV_"+sGXsfl_32_idx+"Horizontalalignment") ;
      edtPrdPrea_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDPREA_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtPrdRefn_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRDREFN_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtPrdPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
      {
         GXCCtl = "PRDPRV_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdPrv_Internalname ;
         wbErr = true ;
         A6158PrdPrv = 0 ;
      }
      else
      {
         A6158PrdPrv = (int)(localUtil.ctol( httpContext.cgiGet( edtPrdPrv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( ( ( localUtil.ctond( httpContext.cgiGet( edtPrdPrea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtPrdPrea_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
      {
         GXCCtl = "PRDPREA_" + sGXsfl_32_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdPrea_Internalname ;
         wbErr = true ;
         A7240PrdPrea = DecimalUtil.ZERO ;
      }
      else
      {
         A7240PrdPrea = localUtil.ctond( httpContext.cgiGet( edtPrdPrea_Internalname)) ;
      }
      A10121PrdRefn = httpContext.cgiGet( edtPrdRefn_Internalname) ;
      GXCCtl = "Z6158PrdPrv_" + sGXsfl_32_idx ;
      Z6158PrdPrv = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z7240PrdPrea_" + sGXsfl_32_idx ;
      Z7240PrdPrea = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z10121PrdRefn_" + sGXsfl_32_idx ;
      Z10121PrdRefn = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_898_" + sGXsfl_32_idx ;
      nRcdDeleted_898 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_898_" + sGXsfl_32_idx ;
      nRcdExists_898 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_898_" + sGXsfl_32_idx ;
      nIsMod_898 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtPrdPrv_Enabled = edtPrdPrv_Enabled ;
   }

   public void confirmValues1O40( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32898( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32898( ) ;
         httpContext.changePostValue( "Z6158PrdPrv_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z6158PrdPrv_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6158PrdPrv_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z7240PrdPrea_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z7240PrdPrea_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z7240PrdPrea_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z10121PrdRefn_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z10121PrdRefn_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z10121PrdRefn_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tnprovprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TnPROVPRD");
      forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("PrdNom", GXutil.rtrim( localUtil.format( A718PrdNom, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tnprovprd:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDPRV_DATA", AV38PrdPrv_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDPRV_DATA", AV38PrdPrv_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV36TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV36TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV32EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV34PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPNOM", GXutil.rtrim( A6159PrdPNom));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDPRV_Objectcall", GXutil.rtrim( Combo_prdprv_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDPRV_Cls", GXutil.rtrim( Combo_prdprv_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDPRV_Enabled", GXutil.booltostr( Combo_prdprv_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDPRV_Titlecontrolidtoreplace", GXutil.rtrim( Combo_prdprv_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDPRV_Isgriditem", GXutil.booltostr( Combo_prdprv_Isgriditem));
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
      return formatLink("app.tnprovprd", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV34PrdNum))}, new String[] {"Gx_mode","EmprCod","PrdNum"})  ;
   }

   public String getPgmname( )
   {
      return "TnPROVPRD" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "n Proveedores 1 Producto", "") ;
   }

   public void initializeNonKey1O429( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      Z718PrdNom = "" ;
   }

   public void initAll1O429( )
   {
      A719PrdNum = "" ;
      n719PrdNum = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      initializeNonKey1O429( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1O4898( )
   {
      A6159PrdPNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6159PrdPNom", A6159PrdPNom);
      A7240PrdPrea = DecimalUtil.ZERO ;
      A10121PrdRefn = "" ;
      Z7240PrdPrea = DecimalUtil.ZERO ;
      Z10121PrdRefn = "" ;
   }

   public void initAll1O4898( )
   {
      A6158PrdPrv = 0 ;
      initializeNonKey1O4898( ) ;
   }

   public void standaloneModalInsert1O4898( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211672243", true, true);
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
      httpContext.AddJavascriptSource("tnprovprd.js", "?20268211672243", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties898( )
   {
      edtPrdPrv_Enabled = defedtPrdPrv_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdPrv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPrv_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
   {
      Gridlevel_proveedoresContainer.AddObjectProperty("GridName", "Gridlevel_proveedores");
      Gridlevel_proveedoresContainer.AddObjectProperty("Header", subGridlevel_proveedores_Header);
      Gridlevel_proveedoresContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_proveedoresContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_proveedoresContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_proveedoresColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_proveedoresColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A6158PrdPrv, (byte)(6), (byte)(0), ".", "")));
      Gridlevel_proveedoresColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrv_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_proveedoresColumn.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtPrdPrv_Horizontalalignment));
      Gridlevel_proveedoresContainer.AddColumnProperties(Gridlevel_proveedoresColumn);
      Gridlevel_proveedoresColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_proveedoresColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7240PrdPrea, (byte)(14), (byte)(5), ".", "")));
      Gridlevel_proveedoresColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdPrea_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddColumnProperties(Gridlevel_proveedoresColumn);
      Gridlevel_proveedoresColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_proveedoresColumn.AddObjectProperty("Value", GXutil.rtrim( A10121PrdRefn));
      Gridlevel_proveedoresColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtPrdRefn_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddColumnProperties(Gridlevel_proveedoresColumn);
      Gridlevel_proveedoresContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_proveedoresContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_proveedores_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtPrdPrv_Internalname = "PRDPRV" ;
      edtPrdPrea_Internalname = "PRDPREA" ;
      edtPrdRefn_Internalname = "PRDREFN" ;
      divTableleaflevel_proveedores_Internalname = "TABLELEAFLEVEL_PROVEEDORES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_prdprv_Internalname = "COMBO_PRDPRV" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_proveedores_Internalname = "GRIDLEVEL_PROVEEDORES" ;
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
      subGridlevel_proveedores_Allowcollapsing = (byte)(0) ;
      subGridlevel_proveedores_Allowselection = (byte)(0) ;
      subGridlevel_proveedores_Header = "" ;
      Combo_prdprv_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "n Proveedores 1 Producto", "") );
      edtPrdRefn_Jsonclick = "" ;
      edtPrdPrea_Jsonclick = "" ;
      edtPrdPrv_Jsonclick = "" ;
      subGridlevel_proveedores_Class = "GridNoBorder WorkWith" ;
      subGridlevel_proveedores_Backcolorstyle = (byte)(0) ;
      Combo_prdprv_Titlecontrolidtoreplace = "" ;
      edtPrdRefn_Enabled = 1 ;
      edtPrdPrea_Enabled = 1 ;
      edtPrdPrv_Enabled = 1 ;
      Combo_prdprv_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_prdprv_Cls = "ExtendedCombo" ;
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
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      edtPrdPrv_Horizontalalignment = "right" ;
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

   public void gx6asaprdpnom1O4898( String A396EmprCod ,
                                    int A6158PrdPrv )
   {
      GXt_char1 = A6159PrdPNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A6158PrdPrv ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      tnprovprd_impl.this.A396EmprCod = GXv_char4[0] ;
      tnprovprd_impl.this.A6158PrdPrv = GXv_int8[0] ;
      tnprovprd_impl.this.GXt_char1 = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A6159PrdPNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "A6159PrdPNom", A6159PrdPNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A6159PrdPNom))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxnrgridlevel_proveedores_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_32898( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1O4898( ) ;
         standaloneModal1O4898( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1O4898( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32898( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_proveedoresContainer)) ;
      /* End function gxnrGridlevel_proveedores_newrow */
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

   public void valid_Prdprv( )
   {
      GXt_char1 = A6159PrdPNom ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int8[0] = A6158PrdPrv ;
      GXv_char3[0] = GXt_char1 ;
      new app.pprvnom(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3) ;
      tnprovprd_impl.this.A396EmprCod = GXv_char4[0] ;
      tnprovprd_impl.this.A6158PrdPrv = GXv_int8[0] ;
      tnprovprd_impl.this.GXt_char1 = GXv_char3[0] ;
      A6159PrdPNom = GXt_char1 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A6159PrdPNom", GXutil.rtrim( A6159PrdPNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34PrdNum',fld:'vPRDNUM',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV34PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121O42',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDPRV","{handler:'valid_Prdprv',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A6158PrdPrv',fld:'PRDPRV',pic:'ZZZZZ9'},{av:'A6159PrdPNom',fld:'PRDPNOM',pic:''}]");
      setEventMetadata("VALID_PRDPRV",",oparms:[{av:'A6159PrdPNom',fld:'PRDPNOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Prdrefn',iparms:[]");
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
      wcpOAV32EmprCod = "" ;
      wcpOAV34PrdNum = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z718PrdNom = "" ;
      Z7240PrdPrea = DecimalUtil.ZERO ;
      Z10121PrdRefn = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV34PrdNum = "" ;
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
      AV40Pgmname = "" ;
      ucCombo_prdprv = new com.genexus.webpanels.GXUserControl();
      Combo_prdprv_Caption = "" ;
      AV38PrdPrv_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_proveedoresContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode898 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A6159PrdPNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Combo_prdprv_Objectcall = "" ;
      Combo_prdprv_Class = "" ;
      Combo_prdprv_Icontype = "" ;
      Combo_prdprv_Icon = "" ;
      Combo_prdprv_Tooltip = "" ;
      Combo_prdprv_Selectedvalue_set = "" ;
      Combo_prdprv_Selectedvalue_get = "" ;
      Combo_prdprv_Selectedtext_set = "" ;
      Combo_prdprv_Selectedtext_get = "" ;
      Combo_prdprv_Gamoauthtoken = "" ;
      Combo_prdprv_Ddointernalname = "" ;
      Combo_prdprv_Titlecontrolalign = "" ;
      Combo_prdprv_Dropdownoptionstype = "" ;
      Combo_prdprv_Datalisttype = "" ;
      Combo_prdprv_Datalistfixedvalues = "" ;
      Combo_prdprv_Datalistproc = "" ;
      Combo_prdprv_Datalistprocparametersprefix = "" ;
      Combo_prdprv_Remoteservicesparameters = "" ;
      Combo_prdprv_Htmltemplate = "" ;
      Combo_prdprv_Multiplevaluestype = "" ;
      Combo_prdprv_Loadingdata = "" ;
      Combo_prdprv_Noresultsfound = "" ;
      Combo_prdprv_Emptyitemtext = "" ;
      Combo_prdprv_Onlyselectedvalues = "" ;
      Combo_prdprv_Selectalltext = "" ;
      Combo_prdprv_Multiplevaluesseparator = "" ;
      Combo_prdprv_Addnewoptiontext = "" ;
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
      A7240PrdPrea = DecimalUtil.ZERO ;
      A10121PrdRefn = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV39ComboSelectedValue = "" ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01O46_A407EmprNom = new String[] {""} ;
      T01O46_n407EmprNom = new boolean[] {false} ;
      T01O47_A719PrdNum = new String[] {""} ;
      T01O47_n719PrdNum = new boolean[] {false} ;
      T01O47_A407EmprNom = new String[] {""} ;
      T01O47_n407EmprNom = new boolean[] {false} ;
      T01O47_A718PrdNom = new String[] {""} ;
      T01O47_A396EmprCod = new String[] {""} ;
      T01O48_A396EmprCod = new String[] {""} ;
      T01O48_A719PrdNum = new String[] {""} ;
      T01O48_n719PrdNum = new boolean[] {false} ;
      T01O45_A719PrdNum = new String[] {""} ;
      T01O45_n719PrdNum = new boolean[] {false} ;
      T01O45_A718PrdNom = new String[] {""} ;
      T01O45_A396EmprCod = new String[] {""} ;
      T01O49_A396EmprCod = new String[] {""} ;
      T01O49_A719PrdNum = new String[] {""} ;
      T01O49_n719PrdNum = new boolean[] {false} ;
      T01O410_A396EmprCod = new String[] {""} ;
      T01O410_A719PrdNum = new String[] {""} ;
      T01O410_n719PrdNum = new boolean[] {false} ;
      T01O44_A719PrdNum = new String[] {""} ;
      T01O44_n719PrdNum = new boolean[] {false} ;
      T01O44_A718PrdNom = new String[] {""} ;
      T01O44_A396EmprCod = new String[] {""} ;
      T01O414_A396EmprCod = new String[] {""} ;
      T01O414_A719PrdNum = new String[] {""} ;
      T01O414_n719PrdNum = new boolean[] {false} ;
      T01O414_A13217NormaID = new String[] {""} ;
      T01O415_A396EmprCod = new String[] {""} ;
      T01O415_A719PrdNum = new String[] {""} ;
      T01O415_n719PrdNum = new boolean[] {false} ;
      T01O415_A13586TheList = new String[] {""} ;
      T01O416_A396EmprCod = new String[] {""} ;
      T01O416_A5532Lb_numero = new int[1] ;
      T01O416_A5555Lb_opcion = new String[] {""} ;
      T01O416_A13460Lb_linCP = new short[1] ;
      T01O416_A13458Lb_TipCP = new String[] {""} ;
      T01O417_A396EmprCod = new String[] {""} ;
      T01O417_A13418AlbProID = new int[1] ;
      T01O417_A13442AlbProLine = new short[1] ;
      T01O418_A396EmprCod = new String[] {""} ;
      T01O418_A13324LDESID = new int[1] ;
      T01O418_A13333LDESNPeque = new String[] {""} ;
      T01O418_A13337LDESComb = new String[] {""} ;
      T01O418_A13339LDESFondo = new String[] {""} ;
      T01O418_A13342LDESLinea = new short[1] ;
      T01O419_A396EmprCod = new String[] {""} ;
      T01O419_A13312Lb_NLab = new int[1] ;
      T01O419_A13305Lb_IDVeces = new short[1] ;
      T01O419_A13306Lb_LinID = new short[1] ;
      T01O420_A396EmprCod = new String[] {""} ;
      T01O420_A12673LavMqId = new int[1] ;
      T01O420_A12692LavMqLnPq = new short[1] ;
      T01O420_A12681LavMqLn = new short[1] ;
      T01O421_A396EmprCod = new String[] {""} ;
      T01O421_A719PrdNum = new String[] {""} ;
      T01O421_n719PrdNum = new boolean[] {false} ;
      T01O421_A9713Tb1_Cod = new short[1] ;
      T01O422_A396EmprCod = new String[] {""} ;
      T01O422_A12236PrdNumD = new String[] {""} ;
      T01O422_A719PrdNum = new String[] {""} ;
      T01O422_n719PrdNum = new boolean[] {false} ;
      T01O423_A396EmprCod = new String[] {""} ;
      T01O423_A12225DocDisID = new long[1] ;
      T01O423_A12226LinDisID = new short[1] ;
      T01O424_A396EmprCod = new String[] {""} ;
      T01O424_A12225DocDisID = new long[1] ;
      T01O425_A396EmprCod = new String[] {""} ;
      T01O425_A12205OrdenCID = new long[1] ;
      T01O425_A12206OrdenCLnId = new short[1] ;
      T01O426_A396EmprCod = new String[] {""} ;
      T01O426_A719PrdNum = new String[] {""} ;
      T01O426_n719PrdNum = new boolean[] {false} ;
      T01O426_A11664LoteID = new String[] {""} ;
      T01O426_A11665LoteFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01O427_A396EmprCod = new String[] {""} ;
      T01O427_A4850DevComCod = new int[1] ;
      T01O427_A719PrdNum = new String[] {""} ;
      T01O427_n719PrdNum = new boolean[] {false} ;
      T01O428_A396EmprCod = new String[] {""} ;
      T01O428_A252CliCod = new int[1] ;
      T01O428_A494ForSer = new String[] {""} ;
      T01O428_A482ForColNom = new String[] {""} ;
      T01O428_A483ForColNum = new int[1] ;
      T01O428_A831TipColCod = new byte[1] ;
      T01O428_A3571EnsCod = new String[] {""} ;
      T01O428_A3582EnsLin = new short[1] ;
      T01O429_A396EmprCod = new String[] {""} ;
      T01O429_A129BarCod = new int[1] ;
      T01O429_A132BarCodReo = new byte[1] ;
      T01O429_A130BarCodPar = new String[] {""} ;
      T01O429_A4075recestncol = new byte[1] ;
      T01O429_A4076recestnpro = new byte[1] ;
      T01O429_A4108recestlin = new short[1] ;
      T01O430_A396EmprCod = new String[] {""} ;
      T01O430_A4052EstNumFor = new int[1] ;
      T01O430_A4053EstNumCol = new byte[1] ;
      T01O430_A4090EstEspLin = new byte[1] ;
      T01O431_A396EmprCod = new String[] {""} ;
      T01O431_A4052EstNumFor = new int[1] ;
      T01O431_A4053EstNumCol = new byte[1] ;
      T01O431_A4084EstProLin = new byte[1] ;
      T01O432_A396EmprCod = new String[] {""} ;
      T01O432_A11644TransferId = new long[1] ;
      T01O432_A11653TransferLn = new int[1] ;
      T01O433_A396EmprCod = new String[] {""} ;
      T01O433_A11634TaesId = new String[] {""} ;
      T01O433_A11637TaesLn = new short[1] ;
      T01O433_A11641TaesLnP = new short[1] ;
      T01O434_A396EmprCod = new String[] {""} ;
      T01O434_A719PrdNum = new String[] {""} ;
      T01O434_n719PrdNum = new boolean[] {false} ;
      T01O434_A11329H_stklin = new long[1] ;
      T01O435_A396EmprCod = new String[] {""} ;
      T01O435_A11270Pot_num = new int[1] ;
      T01O435_A11271Pot_lin = new short[1] ;
      T01O436_A396EmprCod = new String[] {""} ;
      T01O436_A719PrdNum = new String[] {""} ;
      T01O436_n719PrdNum = new boolean[] {false} ;
      T01O436_A11199PrdNcasC = new String[] {""} ;
      T01O437_A396EmprCod = new String[] {""} ;
      T01O437_A719PrdNum = new String[] {""} ;
      T01O437_n719PrdNum = new boolean[] {false} ;
      T01O437_A11197CFraseR = new String[] {""} ;
      T01O438_A396EmprCod = new String[] {""} ;
      T01O438_A10243Jt_codigo = new short[1] ;
      T01O438_A10246Jt_ord = new short[1] ;
      T01O439_A396EmprCod = new String[] {""} ;
      T01O439_A10236Bny_dia = new java.util.Date[] {GXutil.nullDate()} ;
      T01O439_A10238Bny_lin = new short[1] ;
      T01O440_A396EmprCod = new String[] {""} ;
      T01O440_A129BarCod = new int[1] ;
      T01O440_A132BarCodReo = new byte[1] ;
      T01O440_A130BarCodPar = new String[] {""} ;
      T01O440_A758ProCod = new String[] {""} ;
      T01O440_A194BarOrdLin = new short[1] ;
      T01O440_A719PrdNum = new String[] {""} ;
      T01O440_n719PrdNum = new boolean[] {false} ;
      T01O441_A396EmprCod = new String[] {""} ;
      T01O441_A719PrdNum = new String[] {""} ;
      T01O441_n719PrdNum = new boolean[] {false} ;
      T01O441_A9735Cod_Rgo = new String[] {""} ;
      T01O442_A396EmprCod = new String[] {""} ;
      T01O442_A719PrdNum = new String[] {""} ;
      T01O442_n719PrdNum = new boolean[] {false} ;
      T01O442_A9711Ct_codigo = new short[1] ;
      T01O443_A396EmprCod = new String[] {""} ;
      T01O443_A9652OeNum = new long[1] ;
      T01O443_A9653OeHdr = new int[1] ;
      T01O443_A9654OeHdrr = new byte[1] ;
      T01O443_A9655OeHdrp = new String[] {""} ;
      T01O443_A9656OeLinC = new byte[1] ;
      T01O443_A9657OeComb = new String[] {""} ;
      T01O443_A9658Oefondo = new String[] {""} ;
      T01O443_A9659OeMolCil = new byte[1] ;
      T01O443_A9686OePasLin = new short[1] ;
      T01O443_A9694OePasPLi = new short[1] ;
      T01O444_A396EmprCod = new String[] {""} ;
      T01O444_A9652OeNum = new long[1] ;
      T01O444_A9653OeHdr = new int[1] ;
      T01O444_A9654OeHdrr = new byte[1] ;
      T01O444_A9655OeHdrp = new String[] {""} ;
      T01O444_A9656OeLinC = new byte[1] ;
      T01O444_A9657OeComb = new String[] {""} ;
      T01O444_A9658Oefondo = new String[] {""} ;
      T01O444_A9659OeMolCil = new byte[1] ;
      T01O444_A9677OeMolLin = new byte[1] ;
      T01O445_A396EmprCod = new String[] {""} ;
      T01O445_A9578Pas_Num = new int[1] ;
      T01O445_A719PrdNum = new String[] {""} ;
      T01O445_n719PrdNum = new boolean[] {false} ;
      T01O446_A396EmprCod = new String[] {""} ;
      T01O446_A719PrdNum = new String[] {""} ;
      T01O446_n719PrdNum = new boolean[] {false} ;
      T01O446_A8908CC_AlmCod = new byte[1] ;
      T01O447_A396EmprCod = new String[] {""} ;
      T01O447_A719PrdNum = new String[] {""} ;
      T01O447_n719PrdNum = new boolean[] {false} ;
      T01O447_A8661Almc_Ln = new int[1] ;
      T01O448_A396EmprCod = new String[] {""} ;
      T01O448_A719PrdNum = new String[] {""} ;
      T01O448_n719PrdNum = new boolean[] {false} ;
      T01O448_A8648Mat_PrdN = new String[] {""} ;
      T01O449_A396EmprCod = new String[] {""} ;
      T01O449_A8585Pet_cod = new long[1] ;
      T01O449_A719PrdNum = new String[] {""} ;
      T01O449_n719PrdNum = new boolean[] {false} ;
      T01O450_A396EmprCod = new String[] {""} ;
      T01O450_A719PrdNum = new String[] {""} ;
      T01O450_n719PrdNum = new boolean[] {false} ;
      T01O450_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      T01O451_A396EmprCod = new String[] {""} ;
      T01O451_A719PrdNum = new String[] {""} ;
      T01O451_n719PrdNum = new boolean[] {false} ;
      T01O451_A8366PrdAnyo = new short[1] ;
      T01O451_A8360PrdProv = new int[1] ;
      T01O452_A396EmprCod = new String[] {""} ;
      T01O452_A252CliCod = new int[1] ;
      T01O452_A494ForSer = new String[] {""} ;
      T01O452_A482ForColNom = new String[] {""} ;
      T01O452_A483ForColNum = new int[1] ;
      T01O452_A831TipColCod = new byte[1] ;
      T01O452_A7797Sim_lin = new short[1] ;
      T01O453_A396EmprCod = new String[] {""} ;
      T01O453_A7163Vir_Codigo = new int[1] ;
      T01O453_A719PrdNum = new String[] {""} ;
      T01O453_n719PrdNum = new boolean[] {false} ;
      T01O454_A396EmprCod = new String[] {""} ;
      T01O454_A6310Lb_TaAuxC = new String[] {""} ;
      T01O454_A6313lb_TaAuxL = new short[1] ;
      T01O454_A6378Lb_TauxLP = new short[1] ;
      T01O455_A396EmprCod = new String[] {""} ;
      T01O455_A6290PreCoNum = new int[1] ;
      T01O455_A719PrdNum = new String[] {""} ;
      T01O455_n719PrdNum = new boolean[] {false} ;
      T01O456_A396EmprCod = new String[] {""} ;
      T01O456_A719PrdNum = new String[] {""} ;
      T01O456_n719PrdNum = new boolean[] {false} ;
      T01O456_A5973PrdSusNum = new String[] {""} ;
      T01O457_A396EmprCod = new String[] {""} ;
      T01O457_A5612Lb_CodGru = new String[] {""} ;
      T01O457_A5615Lb_LinGru = new short[1] ;
      T01O458_A396EmprCod = new String[] {""} ;
      T01O458_A5532Lb_numero = new int[1] ;
      T01O458_A5555Lb_opcion = new String[] {""} ;
      T01O458_A5560Lb_LineaPr = new short[1] ;
      T01O459_A396EmprCod = new String[] {""} ;
      T01O459_A5532Lb_numero = new int[1] ;
      T01O459_A5555Lb_opcion = new String[] {""} ;
      T01O459_A5557Lb_LineaC = new short[1] ;
      T01O460_A396EmprCod = new String[] {""} ;
      T01O460_A5145SobCod = new int[1] ;
      T01O460_A719PrdNum = new String[] {""} ;
      T01O460_n719PrdNum = new boolean[] {false} ;
      T01O461_A396EmprCod = new String[] {""} ;
      T01O461_A4744RecPreCod = new int[1] ;
      T01O461_A4762RecPreLin = new short[1] ;
      T01O461_A4763RecPreNli = new short[1] ;
      T01O462_A396EmprCod = new String[] {""} ;
      T01O462_A4492HreBarCod = new int[1] ;
      T01O462_A4493HreBarReo = new byte[1] ;
      T01O462_A4494HreBarPar = new String[] {""} ;
      T01O462_A4495HreNumCie = new byte[1] ;
      T01O462_A4545HreLinMaq = new short[1] ;
      T01O462_A4550HreLinPro = new byte[1] ;
      T01O462_A4557HreRecLin = new short[1] ;
      T01O463_A396EmprCod = new String[] {""} ;
      T01O463_A4492HreBarCod = new int[1] ;
      T01O463_A4493HreBarReo = new byte[1] ;
      T01O463_A4494HreBarPar = new String[] {""} ;
      T01O463_A4495HreNumCie = new byte[1] ;
      T01O463_A4508HreLinMAL = new short[1] ;
      T01O463_A4509HreNumAny = new byte[1] ;
      T01O463_A719PrdNum = new String[] {""} ;
      T01O463_n719PrdNum = new boolean[] {false} ;
      T01O464_A396EmprCod = new String[] {""} ;
      T01O464_A252CliCod = new int[1] ;
      T01O464_A4415EstCol = new String[] {""} ;
      T01O464_A4416EstColLin = new short[1] ;
      T01O465_A396EmprCod = new String[] {""} ;
      T01O465_A129BarCod = new int[1] ;
      T01O465_A132BarCodReo = new byte[1] ;
      T01O465_A130BarCodPar = new String[] {""} ;
      T01O465_A2524DisComLin = new byte[1] ;
      T01O465_A1056DisComCod = new String[] {""} ;
      T01O465_A1032FonCod = new String[] {""} ;
      T01O465_A2124RecMolCod = new byte[1] ;
      T01O465_A2672RecPasLin = new short[1] ;
      T01O465_A2675RecPasPLi = new short[1] ;
      T01O466_A396EmprCod = new String[] {""} ;
      T01O466_A129BarCod = new int[1] ;
      T01O466_A132BarCodReo = new byte[1] ;
      T01O466_A130BarCodPar = new String[] {""} ;
      T01O466_A2524DisComLin = new byte[1] ;
      T01O466_A1056DisComCod = new String[] {""} ;
      T01O466_A1032FonCod = new String[] {""} ;
      T01O466_A2124RecMolCod = new byte[1] ;
      T01O466_A2126RecMolLin = new byte[1] ;
      T01O467_A396EmprCod = new String[] {""} ;
      T01O467_A2107PasCod = new String[] {""} ;
      T01O467_A719PrdNum = new String[] {""} ;
      T01O467_n719PrdNum = new boolean[] {false} ;
      T01O468_A396EmprCod = new String[] {""} ;
      T01O468_A2637HisEstHRu = new int[1] ;
      T01O468_A2636HisEstHRe = new byte[1] ;
      T01O468_A2635HisEstHPa = new String[] {""} ;
      T01O468_A2638HisEstLCo = new byte[1] ;
      T01O468_A2630HisEstCom = new String[] {""} ;
      T01O468_A2634HisEstFon = new String[] {""} ;
      T01O468_A719PrdNum = new String[] {""} ;
      T01O468_n719PrdNum = new boolean[] {false} ;
      T01O469_A396EmprCod = new String[] {""} ;
      T01O469_A252CliCod = new int[1] ;
      T01O469_A2141SerEst = new String[] {""} ;
      T01O469_A1013DibCli = new String[] {""} ;
      T01O469_A1014DibInt = new int[1] ;
      T01O469_A2074ColCom = new String[] {""} ;
      T01O469_A2078ColFon = new String[] {""} ;
      T01O469_A2098MolCod = new byte[1] ;
      T01O469_A2535ForPrdLin = new short[1] ;
      T01O470_A396EmprCod = new String[] {""} ;
      T01O470_A719PrdNum = new String[] {""} ;
      T01O470_n719PrdNum = new boolean[] {false} ;
      T01O470_A3342CCStkLin = new long[1] ;
      T01O471_A396EmprCod = new String[] {""} ;
      T01O471_A252CliCod = new int[1] ;
      T01O471_A2891HMaForSer = new String[] {""} ;
      T01O471_A2892HMaForCNom = new String[] {""} ;
      T01O471_A2893HMaForCNum = new int[1] ;
      T01O471_A2894HMaTipCCod = new byte[1] ;
      T01O471_A2895HMaForNumC = new int[1] ;
      T01O471_A2897HMaColLin = new short[1] ;
      T01O471_A2896HMaFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01O471_A2907HmaLin = new short[1] ;
      T01O472_A396EmprCod = new String[] {""} ;
      T01O472_A129BarCod = new int[1] ;
      T01O472_A132BarCodReo = new byte[1] ;
      T01O472_A130BarCodPar = new String[] {""} ;
      T01O472_A2808RecLinMAL = new short[1] ;
      T01O472_A1377RecNumAny = new byte[1] ;
      T01O472_A719PrdNum = new String[] {""} ;
      T01O472_n719PrdNum = new boolean[] {false} ;
      T01O473_A396EmprCod = new String[] {""} ;
      T01O473_A129BarCod = new int[1] ;
      T01O473_A132BarCodReo = new byte[1] ;
      T01O473_A130BarCodPar = new String[] {""} ;
      T01O473_A2804RecLinMaq = new short[1] ;
      T01O473_A1273RecLinPro = new byte[1] ;
      T01O473_A811RecLin = new short[1] ;
      T01O474_A396EmprCod = new String[] {""} ;
      T01O474_A129BarCod = new int[1] ;
      T01O474_A132BarCodReo = new byte[1] ;
      T01O474_A130BarCodPar = new String[] {""} ;
      T01O474_A2494BarDosPro = new String[] {""} ;
      T01O474_A719PrdNum = new String[] {""} ;
      T01O474_n719PrdNum = new boolean[] {false} ;
      T01O475_A396EmprCod = new String[] {""} ;
      T01O475_A1314EnsLabCod = new int[1] ;
      T01O475_A1317EnsLabLin = new short[1] ;
      T01O476_A396EmprCod = new String[] {""} ;
      T01O476_A910Workstat = new String[] {""} ;
      T01O476_A887EscMLin = new int[1] ;
      T01O477_A396EmprCod = new String[] {""} ;
      T01O477_A859CumCodCont = new int[1] ;
      T01O477_A719PrdNum = new String[] {""} ;
      T01O477_n719PrdNum = new boolean[] {false} ;
      T01O478_A396EmprCod = new String[] {""} ;
      T01O478_A719PrdNum = new String[] {""} ;
      T01O478_n719PrdNum = new boolean[] {false} ;
      T01O478_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01O479_A396EmprCod = new String[] {""} ;
      T01O479_A486ForNumCol = new int[1] ;
      T01O479_A715PrdLin = new short[1] ;
      T01O480_A396EmprCod = new String[] {""} ;
      T01O480_A719PrdNum = new String[] {""} ;
      T01O480_n719PrdNum = new boolean[] {false} ;
      T01O480_A681PrdAny = new short[1] ;
      T01O481_A396EmprCod = new String[] {""} ;
      T01O481_A719PrdNum = new String[] {""} ;
      T01O481_n719PrdNum = new boolean[] {false} ;
      T01O481_A688PrdComCod = new String[] {""} ;
      T01O482_A396EmprCod = new String[] {""} ;
      T01O482_A719PrdNum = new String[] {""} ;
      T01O482_n719PrdNum = new boolean[] {false} ;
      T01O482_A680PrdAltNum = new String[] {""} ;
      T01O483_A396EmprCod = new String[] {""} ;
      T01O483_A658PedCod = new int[1] ;
      T01O483_A719PrdNum = new String[] {""} ;
      T01O483_n719PrdNum = new boolean[] {false} ;
      T01O484_A396EmprCod = new String[] {""} ;
      T01O484_A486ForNumCol = new int[1] ;
      T01O484_A309ColLin = new short[1] ;
      T01O485_A396EmprCod = new String[] {""} ;
      T01O485_A719PrdNum = new String[] {""} ;
      T01O485_n719PrdNum = new boolean[] {false} ;
      T01O485_A647NumCon = new int[1] ;
      T01O486_A396EmprCod = new String[] {""} ;
      T01O486_A719PrdNum = new String[] {""} ;
      T01O486_n719PrdNum = new boolean[] {false} ;
      T01O487_A719PrdNum = new String[] {""} ;
      T01O487_n719PrdNum = new boolean[] {false} ;
      T01O487_A6158PrdPrv = new int[1] ;
      T01O487_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O487_A10121PrdRefn = new String[] {""} ;
      T01O487_A396EmprCod = new String[] {""} ;
      T01O488_A396EmprCod = new String[] {""} ;
      T01O488_A719PrdNum = new String[] {""} ;
      T01O488_n719PrdNum = new boolean[] {false} ;
      T01O488_A6158PrdPrv = new int[1] ;
      T01O43_A719PrdNum = new String[] {""} ;
      T01O43_n719PrdNum = new boolean[] {false} ;
      T01O43_A6158PrdPrv = new int[1] ;
      T01O43_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O43_A10121PrdRefn = new String[] {""} ;
      T01O43_A396EmprCod = new String[] {""} ;
      T01O42_A719PrdNum = new String[] {""} ;
      T01O42_n719PrdNum = new boolean[] {false} ;
      T01O42_A6158PrdPrv = new int[1] ;
      T01O42_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01O42_A10121PrdRefn = new String[] {""} ;
      T01O42_A396EmprCod = new String[] {""} ;
      T01O492_A396EmprCod = new String[] {""} ;
      T01O492_A719PrdNum = new String[] {""} ;
      T01O492_n719PrdNum = new boolean[] {false} ;
      T01O492_A6158PrdPrv = new int[1] ;
      Gridlevel_proveedoresRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_proveedores_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_proveedoresColumn = new com.genexus.webpanels.GXWebColumn();
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      Z6159PrdPNom = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tnprovprd__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tnprovprd__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tnprovprd__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tnprovprd__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tnprovprd__default(),
         new Object[] {
             new Object[] {
            T01O42_A719PrdNum, T01O42_A6158PrdPrv, T01O42_A7240PrdPrea, T01O42_A10121PrdRefn, T01O42_A396EmprCod
            }
            , new Object[] {
            T01O43_A719PrdNum, T01O43_A6158PrdPrv, T01O43_A7240PrdPrea, T01O43_A10121PrdRefn, T01O43_A396EmprCod
            }
            , new Object[] {
            T01O44_A719PrdNum, T01O44_A718PrdNom, T01O44_A396EmprCod
            }
            , new Object[] {
            T01O45_A719PrdNum, T01O45_A718PrdNom, T01O45_A396EmprCod
            }
            , new Object[] {
            T01O46_A407EmprNom, T01O46_n407EmprNom
            }
            , new Object[] {
            T01O47_A719PrdNum, T01O47_A407EmprNom, T01O47_n407EmprNom, T01O47_A718PrdNom, T01O47_A396EmprCod
            }
            , new Object[] {
            T01O48_A396EmprCod, T01O48_A719PrdNum
            }
            , new Object[] {
            T01O49_A396EmprCod, T01O49_A719PrdNum
            }
            , new Object[] {
            T01O410_A396EmprCod, T01O410_A719PrdNum
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O414_A396EmprCod, T01O414_A719PrdNum, T01O414_A13217NormaID
            }
            , new Object[] {
            T01O415_A396EmprCod, T01O415_A719PrdNum, T01O415_A13586TheList
            }
            , new Object[] {
            T01O416_A396EmprCod, T01O416_A5532Lb_numero, T01O416_A5555Lb_opcion, T01O416_A13460Lb_linCP, T01O416_A13458Lb_TipCP
            }
            , new Object[] {
            T01O417_A396EmprCod, T01O417_A13418AlbProID, T01O417_A13442AlbProLine
            }
            , new Object[] {
            T01O418_A396EmprCod, T01O418_A13324LDESID, T01O418_A13333LDESNPeque, T01O418_A13337LDESComb, T01O418_A13339LDESFondo, T01O418_A13342LDESLinea
            }
            , new Object[] {
            T01O419_A396EmprCod, T01O419_A13312Lb_NLab, T01O419_A13305Lb_IDVeces, T01O419_A13306Lb_LinID
            }
            , new Object[] {
            T01O420_A396EmprCod, T01O420_A12673LavMqId, T01O420_A12692LavMqLnPq, T01O420_A12681LavMqLn
            }
            , new Object[] {
            T01O421_A396EmprCod, T01O421_A719PrdNum, T01O421_A9713Tb1_Cod
            }
            , new Object[] {
            T01O422_A396EmprCod, T01O422_A12236PrdNumD, T01O422_A719PrdNum
            }
            , new Object[] {
            T01O423_A396EmprCod, T01O423_A12225DocDisID, T01O423_A12226LinDisID
            }
            , new Object[] {
            T01O424_A396EmprCod, T01O424_A12225DocDisID
            }
            , new Object[] {
            T01O425_A396EmprCod, T01O425_A12205OrdenCID, T01O425_A12206OrdenCLnId
            }
            , new Object[] {
            T01O426_A396EmprCod, T01O426_A719PrdNum, T01O426_A11664LoteID, T01O426_A11665LoteFec
            }
            , new Object[] {
            T01O427_A396EmprCod, T01O427_A4850DevComCod, T01O427_A719PrdNum
            }
            , new Object[] {
            T01O428_A396EmprCod, T01O428_A252CliCod, T01O428_A494ForSer, T01O428_A482ForColNom, T01O428_A483ForColNum, T01O428_A831TipColCod, T01O428_A3571EnsCod, T01O428_A3582EnsLin
            }
            , new Object[] {
            T01O429_A396EmprCod, T01O429_A129BarCod, T01O429_A132BarCodReo, T01O429_A130BarCodPar, T01O429_A4075recestncol, T01O429_A4076recestnpro, T01O429_A4108recestlin
            }
            , new Object[] {
            T01O430_A396EmprCod, T01O430_A4052EstNumFor, T01O430_A4053EstNumCol, T01O430_A4090EstEspLin
            }
            , new Object[] {
            T01O431_A396EmprCod, T01O431_A4052EstNumFor, T01O431_A4053EstNumCol, T01O431_A4084EstProLin
            }
            , new Object[] {
            T01O432_A396EmprCod, T01O432_A11644TransferId, T01O432_A11653TransferLn
            }
            , new Object[] {
            T01O433_A396EmprCod, T01O433_A11634TaesId, T01O433_A11637TaesLn, T01O433_A11641TaesLnP
            }
            , new Object[] {
            T01O434_A396EmprCod, T01O434_A719PrdNum, T01O434_A11329H_stklin
            }
            , new Object[] {
            T01O435_A396EmprCod, T01O435_A11270Pot_num, T01O435_A11271Pot_lin
            }
            , new Object[] {
            T01O436_A396EmprCod, T01O436_A719PrdNum, T01O436_A11199PrdNcasC
            }
            , new Object[] {
            T01O437_A396EmprCod, T01O437_A719PrdNum, T01O437_A11197CFraseR
            }
            , new Object[] {
            T01O438_A396EmprCod, T01O438_A10243Jt_codigo, T01O438_A10246Jt_ord
            }
            , new Object[] {
            T01O439_A396EmprCod, T01O439_A10236Bny_dia, T01O439_A10238Bny_lin
            }
            , new Object[] {
            T01O440_A396EmprCod, T01O440_A129BarCod, T01O440_A132BarCodReo, T01O440_A130BarCodPar, T01O440_A758ProCod, T01O440_A194BarOrdLin, T01O440_A719PrdNum
            }
            , new Object[] {
            T01O441_A396EmprCod, T01O441_A719PrdNum, T01O441_A9735Cod_Rgo
            }
            , new Object[] {
            T01O442_A396EmprCod, T01O442_A719PrdNum, T01O442_A9711Ct_codigo
            }
            , new Object[] {
            T01O443_A396EmprCod, T01O443_A9652OeNum, T01O443_A9653OeHdr, T01O443_A9654OeHdrr, T01O443_A9655OeHdrp, T01O443_A9656OeLinC, T01O443_A9657OeComb, T01O443_A9658Oefondo, T01O443_A9659OeMolCil, T01O443_A9686OePasLin,
            T01O443_A9694OePasPLi
            }
            , new Object[] {
            T01O444_A396EmprCod, T01O444_A9652OeNum, T01O444_A9653OeHdr, T01O444_A9654OeHdrr, T01O444_A9655OeHdrp, T01O444_A9656OeLinC, T01O444_A9657OeComb, T01O444_A9658Oefondo, T01O444_A9659OeMolCil, T01O444_A9677OeMolLin
            }
            , new Object[] {
            T01O445_A396EmprCod, T01O445_A9578Pas_Num, T01O445_A719PrdNum
            }
            , new Object[] {
            T01O446_A396EmprCod, T01O446_A719PrdNum, T01O446_A8908CC_AlmCod
            }
            , new Object[] {
            T01O447_A396EmprCod, T01O447_A719PrdNum, T01O447_A8661Almc_Ln
            }
            , new Object[] {
            T01O448_A396EmprCod, T01O448_A719PrdNum, T01O448_A8648Mat_PrdN
            }
            , new Object[] {
            T01O449_A396EmprCod, T01O449_A8585Pet_cod, T01O449_A719PrdNum
            }
            , new Object[] {
            T01O450_A396EmprCod, T01O450_A719PrdNum, T01O450_A8577RecFecHr
            }
            , new Object[] {
            T01O451_A396EmprCod, T01O451_A719PrdNum, T01O451_A8366PrdAnyo, T01O451_A8360PrdProv
            }
            , new Object[] {
            T01O452_A396EmprCod, T01O452_A252CliCod, T01O452_A494ForSer, T01O452_A482ForColNom, T01O452_A483ForColNum, T01O452_A831TipColCod, T01O452_A7797Sim_lin
            }
            , new Object[] {
            T01O453_A396EmprCod, T01O453_A7163Vir_Codigo, T01O453_A719PrdNum
            }
            , new Object[] {
            T01O454_A396EmprCod, T01O454_A6310Lb_TaAuxC, T01O454_A6313lb_TaAuxL, T01O454_A6378Lb_TauxLP
            }
            , new Object[] {
            T01O455_A396EmprCod, T01O455_A6290PreCoNum, T01O455_A719PrdNum
            }
            , new Object[] {
            T01O456_A396EmprCod, T01O456_A719PrdNum, T01O456_A5973PrdSusNum
            }
            , new Object[] {
            T01O457_A396EmprCod, T01O457_A5612Lb_CodGru, T01O457_A5615Lb_LinGru
            }
            , new Object[] {
            T01O458_A396EmprCod, T01O458_A5532Lb_numero, T01O458_A5555Lb_opcion, T01O458_A5560Lb_LineaPr
            }
            , new Object[] {
            T01O459_A396EmprCod, T01O459_A5532Lb_numero, T01O459_A5555Lb_opcion, T01O459_A5557Lb_LineaC
            }
            , new Object[] {
            T01O460_A396EmprCod, T01O460_A5145SobCod, T01O460_A719PrdNum
            }
            , new Object[] {
            T01O461_A396EmprCod, T01O461_A4744RecPreCod, T01O461_A4762RecPreLin, T01O461_A4763RecPreNli
            }
            , new Object[] {
            T01O462_A396EmprCod, T01O462_A4492HreBarCod, T01O462_A4493HreBarReo, T01O462_A4494HreBarPar, T01O462_A4495HreNumCie, T01O462_A4545HreLinMaq, T01O462_A4550HreLinPro, T01O462_A4557HreRecLin
            }
            , new Object[] {
            T01O463_A396EmprCod, T01O463_A4492HreBarCod, T01O463_A4493HreBarReo, T01O463_A4494HreBarPar, T01O463_A4495HreNumCie, T01O463_A4508HreLinMAL, T01O463_A4509HreNumAny, T01O463_A719PrdNum
            }
            , new Object[] {
            T01O464_A396EmprCod, T01O464_A252CliCod, T01O464_A4415EstCol, T01O464_A4416EstColLin
            }
            , new Object[] {
            T01O465_A396EmprCod, T01O465_A129BarCod, T01O465_A132BarCodReo, T01O465_A130BarCodPar, T01O465_A2524DisComLin, T01O465_A1056DisComCod, T01O465_A1032FonCod, T01O465_A2124RecMolCod, T01O465_A2672RecPasLin, T01O465_A2675RecPasPLi
            }
            , new Object[] {
            T01O466_A396EmprCod, T01O466_A129BarCod, T01O466_A132BarCodReo, T01O466_A130BarCodPar, T01O466_A2524DisComLin, T01O466_A1056DisComCod, T01O466_A1032FonCod, T01O466_A2124RecMolCod, T01O466_A2126RecMolLin
            }
            , new Object[] {
            T01O467_A396EmprCod, T01O467_A2107PasCod, T01O467_A719PrdNum
            }
            , new Object[] {
            T01O468_A396EmprCod, T01O468_A2637HisEstHRu, T01O468_A2636HisEstHRe, T01O468_A2635HisEstHPa, T01O468_A2638HisEstLCo, T01O468_A2630HisEstCom, T01O468_A2634HisEstFon, T01O468_A719PrdNum
            }
            , new Object[] {
            T01O469_A396EmprCod, T01O469_A252CliCod, T01O469_A2141SerEst, T01O469_A1013DibCli, T01O469_A1014DibInt, T01O469_A2074ColCom, T01O469_A2078ColFon, T01O469_A2098MolCod, T01O469_A2535ForPrdLin
            }
            , new Object[] {
            T01O470_A396EmprCod, T01O470_A719PrdNum, T01O470_A3342CCStkLin
            }
            , new Object[] {
            T01O471_A396EmprCod, T01O471_A252CliCod, T01O471_A2891HMaForSer, T01O471_A2892HMaForCNom, T01O471_A2893HMaForCNum, T01O471_A2894HMaTipCCod, T01O471_A2895HMaForNumC, T01O471_A2897HMaColLin, T01O471_A2896HMaFec, T01O471_A2907HmaLin
            }
            , new Object[] {
            T01O472_A396EmprCod, T01O472_A129BarCod, T01O472_A132BarCodReo, T01O472_A130BarCodPar, T01O472_A2808RecLinMAL, T01O472_A1377RecNumAny, T01O472_A719PrdNum
            }
            , new Object[] {
            T01O473_A396EmprCod, T01O473_A129BarCod, T01O473_A132BarCodReo, T01O473_A130BarCodPar, T01O473_A2804RecLinMaq, T01O473_A1273RecLinPro, T01O473_A811RecLin
            }
            , new Object[] {
            T01O474_A396EmprCod, T01O474_A129BarCod, T01O474_A132BarCodReo, T01O474_A130BarCodPar, T01O474_A2494BarDosPro, T01O474_A719PrdNum
            }
            , new Object[] {
            T01O475_A396EmprCod, T01O475_A1314EnsLabCod, T01O475_A1317EnsLabLin
            }
            , new Object[] {
            T01O476_A396EmprCod, T01O476_A910Workstat, T01O476_A887EscMLin
            }
            , new Object[] {
            T01O477_A396EmprCod, T01O477_A859CumCodCont, T01O477_A719PrdNum
            }
            , new Object[] {
            T01O478_A396EmprCod, T01O478_A719PrdNum, T01O478_A810RecFec
            }
            , new Object[] {
            T01O479_A396EmprCod, T01O479_A486ForNumCol, T01O479_A715PrdLin
            }
            , new Object[] {
            T01O480_A396EmprCod, T01O480_A719PrdNum, T01O480_A681PrdAny
            }
            , new Object[] {
            T01O481_A396EmprCod, T01O481_A719PrdNum, T01O481_A688PrdComCod
            }
            , new Object[] {
            T01O482_A396EmprCod, T01O482_A719PrdNum, T01O482_A680PrdAltNum
            }
            , new Object[] {
            T01O483_A396EmprCod, T01O483_A658PedCod, T01O483_A719PrdNum
            }
            , new Object[] {
            T01O484_A396EmprCod, T01O484_A486ForNumCol, T01O484_A309ColLin
            }
            , new Object[] {
            T01O485_A396EmprCod, T01O485_A719PrdNum, T01O485_A647NumCon
            }
            , new Object[] {
            T01O486_A396EmprCod, T01O486_A719PrdNum
            }
            , new Object[] {
            T01O487_A719PrdNum, T01O487_A6158PrdPrv, T01O487_A7240PrdPrea, T01O487_A10121PrdRefn, T01O487_A396EmprCod
            }
            , new Object[] {
            T01O488_A396EmprCod, T01O488_A719PrdNum, T01O488_A6158PrdPrv
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01O492_A396EmprCod, T01O492_A719PrdNum, T01O492_A6158PrdPrv
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV40Pgmname = "TnPROVPRD" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte subGridlevel_proveedores_Backcolorstyle ;
   private byte subGridlevel_proveedores_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_proveedores_Allowselection ;
   private byte subGridlevel_proveedores_Allowhovering ;
   private byte subGridlevel_proveedores_Allowcollapsing ;
   private byte subGridlevel_proveedores_Collapsed ;
   private short nRcdDeleted_898 ;
   private short nRcdExists_898 ;
   private short nIsMod_898 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount898 ;
   private short RcdFound898 ;
   private short nBlankRcdUsr898 ;
   private short RcdFound29 ;
   private short nIsDirty_29 ;
   private short nIsDirty_898 ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int Z6158PrdPrv ;
   private int A6158PrdPrv ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtPrdPrv_Enabled ;
   private int edtPrdPrea_Enabled ;
   private int edtPrdRefn_Enabled ;
   private int fRowAdded ;
   private int Combo_prdprv_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_proveedores_Backcolor ;
   private int subGridlevel_proveedores_Allbackcolor ;
   private int defedtPrdPrv_Enabled ;
   private int idxLst ;
   private int subGridlevel_proveedores_Selectedindex ;
   private int subGridlevel_proveedores_Selectioncolor ;
   private int subGridlevel_proveedores_Hoveringcolor ;
   private int GXv_int8[] ;
   private long GRIDLEVEL_PROVEEDORES_nFirstRecordOnPage ;
   private java.math.BigDecimal Z7240PrdPrea ;
   private java.math.BigDecimal A7240PrdPrea ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV32EmprCod ;
   private String wcpOAV34PrdNum ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z718PrdNom ;
   private String Z10121PrdRefn ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV34PrdNum ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_32_idx="0001" ;
   private String edtPrdPrv_Horizontalalignment ;
   private String edtPrdPrv_Internalname ;
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
   private String divTableleaflevel_proveedores_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV40Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_prdprv_Caption ;
   private String Combo_prdprv_Cls ;
   private String Combo_prdprv_Internalname ;
   private String sMode898 ;
   private String edtPrdPrea_Internalname ;
   private String edtPrdRefn_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_proveedores_Internalname ;
   private String A407EmprNom ;
   private String A6159PrdPNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Combo_prdprv_Objectcall ;
   private String Combo_prdprv_Class ;
   private String Combo_prdprv_Icontype ;
   private String Combo_prdprv_Icon ;
   private String Combo_prdprv_Tooltip ;
   private String Combo_prdprv_Selectedvalue_set ;
   private String Combo_prdprv_Selectedvalue_get ;
   private String Combo_prdprv_Selectedtext_set ;
   private String Combo_prdprv_Selectedtext_get ;
   private String Combo_prdprv_Gamoauthtoken ;
   private String Combo_prdprv_Ddointernalname ;
   private String Combo_prdprv_Titlecontrolalign ;
   private String Combo_prdprv_Dropdownoptionstype ;
   private String Combo_prdprv_Titlecontrolidtoreplace ;
   private String Combo_prdprv_Datalisttype ;
   private String Combo_prdprv_Datalistfixedvalues ;
   private String Combo_prdprv_Datalistproc ;
   private String Combo_prdprv_Datalistprocparametersprefix ;
   private String Combo_prdprv_Remoteservicesparameters ;
   private String Combo_prdprv_Htmltemplate ;
   private String Combo_prdprv_Multiplevaluestype ;
   private String Combo_prdprv_Loadingdata ;
   private String Combo_prdprv_Noresultsfound ;
   private String Combo_prdprv_Emptyitemtext ;
   private String Combo_prdprv_Onlyselectedvalues ;
   private String Combo_prdprv_Selectalltext ;
   private String Combo_prdprv_Multiplevaluesseparator ;
   private String Combo_prdprv_Addnewoptiontext ;
   private String hsh ;
   private String sMode29 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A10121PrdRefn ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_proveedores_Class ;
   private String subGridlevel_proveedores_Linesclass ;
   private String ROClassString ;
   private String edtPrdPrv_Jsonclick ;
   private String edtPrdPrea_Jsonclick ;
   private String edtPrdRefn_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_proveedores_Header ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String Z6159PrdPNom ;
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
   private boolean Combo_prdprv_Isgriditem ;
   private boolean n407EmprNom ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Combo_prdprv_Enabled ;
   private boolean Combo_prdprv_Visible ;
   private boolean Combo_prdprv_Allowmultipleselection ;
   private boolean Combo_prdprv_Hasdescription ;
   private boolean Combo_prdprv_Includeonlyselectedoption ;
   private boolean Combo_prdprv_Includeselectalloption ;
   private boolean Combo_prdprv_Emptyitem ;
   private boolean Combo_prdprv_Includeaddnewoption ;
   private boolean n719PrdNum ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String AV39ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_proveedoresContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_proveedoresRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_proveedoresColumn ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdprv ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01O46_A407EmprNom ;
   private boolean[] T01O46_n407EmprNom ;
   private String[] T01O47_A719PrdNum ;
   private boolean[] T01O47_n719PrdNum ;
   private String[] T01O47_A407EmprNom ;
   private boolean[] T01O47_n407EmprNom ;
   private String[] T01O47_A718PrdNom ;
   private String[] T01O47_A396EmprCod ;
   private String[] T01O48_A396EmprCod ;
   private String[] T01O48_A719PrdNum ;
   private boolean[] T01O48_n719PrdNum ;
   private String[] T01O45_A719PrdNum ;
   private boolean[] T01O45_n719PrdNum ;
   private String[] T01O45_A718PrdNom ;
   private String[] T01O45_A396EmprCod ;
   private String[] T01O49_A396EmprCod ;
   private String[] T01O49_A719PrdNum ;
   private boolean[] T01O49_n719PrdNum ;
   private String[] T01O410_A396EmprCod ;
   private String[] T01O410_A719PrdNum ;
   private boolean[] T01O410_n719PrdNum ;
   private String[] T01O44_A719PrdNum ;
   private boolean[] T01O44_n719PrdNum ;
   private String[] T01O44_A718PrdNom ;
   private String[] T01O44_A396EmprCod ;
   private String[] T01O414_A396EmprCod ;
   private String[] T01O414_A719PrdNum ;
   private boolean[] T01O414_n719PrdNum ;
   private String[] T01O414_A13217NormaID ;
   private String[] T01O415_A396EmprCod ;
   private String[] T01O415_A719PrdNum ;
   private boolean[] T01O415_n719PrdNum ;
   private String[] T01O415_A13586TheList ;
   private String[] T01O416_A396EmprCod ;
   private int[] T01O416_A5532Lb_numero ;
   private String[] T01O416_A5555Lb_opcion ;
   private short[] T01O416_A13460Lb_linCP ;
   private String[] T01O416_A13458Lb_TipCP ;
   private String[] T01O417_A396EmprCod ;
   private int[] T01O417_A13418AlbProID ;
   private short[] T01O417_A13442AlbProLine ;
   private String[] T01O418_A396EmprCod ;
   private int[] T01O418_A13324LDESID ;
   private String[] T01O418_A13333LDESNPeque ;
   private String[] T01O418_A13337LDESComb ;
   private String[] T01O418_A13339LDESFondo ;
   private short[] T01O418_A13342LDESLinea ;
   private String[] T01O419_A396EmprCod ;
   private int[] T01O419_A13312Lb_NLab ;
   private short[] T01O419_A13305Lb_IDVeces ;
   private short[] T01O419_A13306Lb_LinID ;
   private String[] T01O420_A396EmprCod ;
   private int[] T01O420_A12673LavMqId ;
   private short[] T01O420_A12692LavMqLnPq ;
   private short[] T01O420_A12681LavMqLn ;
   private String[] T01O421_A396EmprCod ;
   private String[] T01O421_A719PrdNum ;
   private boolean[] T01O421_n719PrdNum ;
   private short[] T01O421_A9713Tb1_Cod ;
   private String[] T01O422_A396EmprCod ;
   private String[] T01O422_A12236PrdNumD ;
   private String[] T01O422_A719PrdNum ;
   private boolean[] T01O422_n719PrdNum ;
   private String[] T01O423_A396EmprCod ;
   private long[] T01O423_A12225DocDisID ;
   private short[] T01O423_A12226LinDisID ;
   private String[] T01O424_A396EmprCod ;
   private long[] T01O424_A12225DocDisID ;
   private String[] T01O425_A396EmprCod ;
   private long[] T01O425_A12205OrdenCID ;
   private short[] T01O425_A12206OrdenCLnId ;
   private String[] T01O426_A396EmprCod ;
   private String[] T01O426_A719PrdNum ;
   private boolean[] T01O426_n719PrdNum ;
   private String[] T01O426_A11664LoteID ;
   private java.util.Date[] T01O426_A11665LoteFec ;
   private String[] T01O427_A396EmprCod ;
   private int[] T01O427_A4850DevComCod ;
   private String[] T01O427_A719PrdNum ;
   private boolean[] T01O427_n719PrdNum ;
   private String[] T01O428_A396EmprCod ;
   private int[] T01O428_A252CliCod ;
   private String[] T01O428_A494ForSer ;
   private String[] T01O428_A482ForColNom ;
   private int[] T01O428_A483ForColNum ;
   private byte[] T01O428_A831TipColCod ;
   private String[] T01O428_A3571EnsCod ;
   private short[] T01O428_A3582EnsLin ;
   private String[] T01O429_A396EmprCod ;
   private int[] T01O429_A129BarCod ;
   private byte[] T01O429_A132BarCodReo ;
   private String[] T01O429_A130BarCodPar ;
   private byte[] T01O429_A4075recestncol ;
   private byte[] T01O429_A4076recestnpro ;
   private short[] T01O429_A4108recestlin ;
   private String[] T01O430_A396EmprCod ;
   private int[] T01O430_A4052EstNumFor ;
   private byte[] T01O430_A4053EstNumCol ;
   private byte[] T01O430_A4090EstEspLin ;
   private String[] T01O431_A396EmprCod ;
   private int[] T01O431_A4052EstNumFor ;
   private byte[] T01O431_A4053EstNumCol ;
   private byte[] T01O431_A4084EstProLin ;
   private String[] T01O432_A396EmprCod ;
   private long[] T01O432_A11644TransferId ;
   private int[] T01O432_A11653TransferLn ;
   private String[] T01O433_A396EmprCod ;
   private String[] T01O433_A11634TaesId ;
   private short[] T01O433_A11637TaesLn ;
   private short[] T01O433_A11641TaesLnP ;
   private String[] T01O434_A396EmprCod ;
   private String[] T01O434_A719PrdNum ;
   private boolean[] T01O434_n719PrdNum ;
   private long[] T01O434_A11329H_stklin ;
   private String[] T01O435_A396EmprCod ;
   private int[] T01O435_A11270Pot_num ;
   private short[] T01O435_A11271Pot_lin ;
   private String[] T01O436_A396EmprCod ;
   private String[] T01O436_A719PrdNum ;
   private boolean[] T01O436_n719PrdNum ;
   private String[] T01O436_A11199PrdNcasC ;
   private String[] T01O437_A396EmprCod ;
   private String[] T01O437_A719PrdNum ;
   private boolean[] T01O437_n719PrdNum ;
   private String[] T01O437_A11197CFraseR ;
   private String[] T01O438_A396EmprCod ;
   private short[] T01O438_A10243Jt_codigo ;
   private short[] T01O438_A10246Jt_ord ;
   private String[] T01O439_A396EmprCod ;
   private java.util.Date[] T01O439_A10236Bny_dia ;
   private short[] T01O439_A10238Bny_lin ;
   private String[] T01O440_A396EmprCod ;
   private int[] T01O440_A129BarCod ;
   private byte[] T01O440_A132BarCodReo ;
   private String[] T01O440_A130BarCodPar ;
   private String[] T01O440_A758ProCod ;
   private short[] T01O440_A194BarOrdLin ;
   private String[] T01O440_A719PrdNum ;
   private boolean[] T01O440_n719PrdNum ;
   private String[] T01O441_A396EmprCod ;
   private String[] T01O441_A719PrdNum ;
   private boolean[] T01O441_n719PrdNum ;
   private String[] T01O441_A9735Cod_Rgo ;
   private String[] T01O442_A396EmprCod ;
   private String[] T01O442_A719PrdNum ;
   private boolean[] T01O442_n719PrdNum ;
   private short[] T01O442_A9711Ct_codigo ;
   private String[] T01O443_A396EmprCod ;
   private long[] T01O443_A9652OeNum ;
   private int[] T01O443_A9653OeHdr ;
   private byte[] T01O443_A9654OeHdrr ;
   private String[] T01O443_A9655OeHdrp ;
   private byte[] T01O443_A9656OeLinC ;
   private String[] T01O443_A9657OeComb ;
   private String[] T01O443_A9658Oefondo ;
   private byte[] T01O443_A9659OeMolCil ;
   private short[] T01O443_A9686OePasLin ;
   private short[] T01O443_A9694OePasPLi ;
   private String[] T01O444_A396EmprCod ;
   private long[] T01O444_A9652OeNum ;
   private int[] T01O444_A9653OeHdr ;
   private byte[] T01O444_A9654OeHdrr ;
   private String[] T01O444_A9655OeHdrp ;
   private byte[] T01O444_A9656OeLinC ;
   private String[] T01O444_A9657OeComb ;
   private String[] T01O444_A9658Oefondo ;
   private byte[] T01O444_A9659OeMolCil ;
   private byte[] T01O444_A9677OeMolLin ;
   private String[] T01O445_A396EmprCod ;
   private int[] T01O445_A9578Pas_Num ;
   private String[] T01O445_A719PrdNum ;
   private boolean[] T01O445_n719PrdNum ;
   private String[] T01O446_A396EmprCod ;
   private String[] T01O446_A719PrdNum ;
   private boolean[] T01O446_n719PrdNum ;
   private byte[] T01O446_A8908CC_AlmCod ;
   private String[] T01O447_A396EmprCod ;
   private String[] T01O447_A719PrdNum ;
   private boolean[] T01O447_n719PrdNum ;
   private int[] T01O447_A8661Almc_Ln ;
   private String[] T01O448_A396EmprCod ;
   private String[] T01O448_A719PrdNum ;
   private boolean[] T01O448_n719PrdNum ;
   private String[] T01O448_A8648Mat_PrdN ;
   private String[] T01O449_A396EmprCod ;
   private long[] T01O449_A8585Pet_cod ;
   private String[] T01O449_A719PrdNum ;
   private boolean[] T01O449_n719PrdNum ;
   private String[] T01O450_A396EmprCod ;
   private String[] T01O450_A719PrdNum ;
   private boolean[] T01O450_n719PrdNum ;
   private java.util.Date[] T01O450_A8577RecFecHr ;
   private String[] T01O451_A396EmprCod ;
   private String[] T01O451_A719PrdNum ;
   private boolean[] T01O451_n719PrdNum ;
   private short[] T01O451_A8366PrdAnyo ;
   private int[] T01O451_A8360PrdProv ;
   private String[] T01O452_A396EmprCod ;
   private int[] T01O452_A252CliCod ;
   private String[] T01O452_A494ForSer ;
   private String[] T01O452_A482ForColNom ;
   private int[] T01O452_A483ForColNum ;
   private byte[] T01O452_A831TipColCod ;
   private short[] T01O452_A7797Sim_lin ;
   private String[] T01O453_A396EmprCod ;
   private int[] T01O453_A7163Vir_Codigo ;
   private String[] T01O453_A719PrdNum ;
   private boolean[] T01O453_n719PrdNum ;
   private String[] T01O454_A396EmprCod ;
   private String[] T01O454_A6310Lb_TaAuxC ;
   private short[] T01O454_A6313lb_TaAuxL ;
   private short[] T01O454_A6378Lb_TauxLP ;
   private String[] T01O455_A396EmprCod ;
   private int[] T01O455_A6290PreCoNum ;
   private String[] T01O455_A719PrdNum ;
   private boolean[] T01O455_n719PrdNum ;
   private String[] T01O456_A396EmprCod ;
   private String[] T01O456_A719PrdNum ;
   private boolean[] T01O456_n719PrdNum ;
   private String[] T01O456_A5973PrdSusNum ;
   private String[] T01O457_A396EmprCod ;
   private String[] T01O457_A5612Lb_CodGru ;
   private short[] T01O457_A5615Lb_LinGru ;
   private String[] T01O458_A396EmprCod ;
   private int[] T01O458_A5532Lb_numero ;
   private String[] T01O458_A5555Lb_opcion ;
   private short[] T01O458_A5560Lb_LineaPr ;
   private String[] T01O459_A396EmprCod ;
   private int[] T01O459_A5532Lb_numero ;
   private String[] T01O459_A5555Lb_opcion ;
   private short[] T01O459_A5557Lb_LineaC ;
   private String[] T01O460_A396EmprCod ;
   private int[] T01O460_A5145SobCod ;
   private String[] T01O460_A719PrdNum ;
   private boolean[] T01O460_n719PrdNum ;
   private String[] T01O461_A396EmprCod ;
   private int[] T01O461_A4744RecPreCod ;
   private short[] T01O461_A4762RecPreLin ;
   private short[] T01O461_A4763RecPreNli ;
   private String[] T01O462_A396EmprCod ;
   private int[] T01O462_A4492HreBarCod ;
   private byte[] T01O462_A4493HreBarReo ;
   private String[] T01O462_A4494HreBarPar ;
   private byte[] T01O462_A4495HreNumCie ;
   private short[] T01O462_A4545HreLinMaq ;
   private byte[] T01O462_A4550HreLinPro ;
   private short[] T01O462_A4557HreRecLin ;
   private String[] T01O463_A396EmprCod ;
   private int[] T01O463_A4492HreBarCod ;
   private byte[] T01O463_A4493HreBarReo ;
   private String[] T01O463_A4494HreBarPar ;
   private byte[] T01O463_A4495HreNumCie ;
   private short[] T01O463_A4508HreLinMAL ;
   private byte[] T01O463_A4509HreNumAny ;
   private String[] T01O463_A719PrdNum ;
   private boolean[] T01O463_n719PrdNum ;
   private String[] T01O464_A396EmprCod ;
   private int[] T01O464_A252CliCod ;
   private String[] T01O464_A4415EstCol ;
   private short[] T01O464_A4416EstColLin ;
   private String[] T01O465_A396EmprCod ;
   private int[] T01O465_A129BarCod ;
   private byte[] T01O465_A132BarCodReo ;
   private String[] T01O465_A130BarCodPar ;
   private byte[] T01O465_A2524DisComLin ;
   private String[] T01O465_A1056DisComCod ;
   private String[] T01O465_A1032FonCod ;
   private byte[] T01O465_A2124RecMolCod ;
   private short[] T01O465_A2672RecPasLin ;
   private short[] T01O465_A2675RecPasPLi ;
   private String[] T01O466_A396EmprCod ;
   private int[] T01O466_A129BarCod ;
   private byte[] T01O466_A132BarCodReo ;
   private String[] T01O466_A130BarCodPar ;
   private byte[] T01O466_A2524DisComLin ;
   private String[] T01O466_A1056DisComCod ;
   private String[] T01O466_A1032FonCod ;
   private byte[] T01O466_A2124RecMolCod ;
   private byte[] T01O466_A2126RecMolLin ;
   private String[] T01O467_A396EmprCod ;
   private String[] T01O467_A2107PasCod ;
   private String[] T01O467_A719PrdNum ;
   private boolean[] T01O467_n719PrdNum ;
   private String[] T01O468_A396EmprCod ;
   private int[] T01O468_A2637HisEstHRu ;
   private byte[] T01O468_A2636HisEstHRe ;
   private String[] T01O468_A2635HisEstHPa ;
   private byte[] T01O468_A2638HisEstLCo ;
   private String[] T01O468_A2630HisEstCom ;
   private String[] T01O468_A2634HisEstFon ;
   private String[] T01O468_A719PrdNum ;
   private boolean[] T01O468_n719PrdNum ;
   private String[] T01O469_A396EmprCod ;
   private int[] T01O469_A252CliCod ;
   private String[] T01O469_A2141SerEst ;
   private String[] T01O469_A1013DibCli ;
   private int[] T01O469_A1014DibInt ;
   private String[] T01O469_A2074ColCom ;
   private String[] T01O469_A2078ColFon ;
   private byte[] T01O469_A2098MolCod ;
   private short[] T01O469_A2535ForPrdLin ;
   private String[] T01O470_A396EmprCod ;
   private String[] T01O470_A719PrdNum ;
   private boolean[] T01O470_n719PrdNum ;
   private long[] T01O470_A3342CCStkLin ;
   private String[] T01O471_A396EmprCod ;
   private int[] T01O471_A252CliCod ;
   private String[] T01O471_A2891HMaForSer ;
   private String[] T01O471_A2892HMaForCNom ;
   private int[] T01O471_A2893HMaForCNum ;
   private byte[] T01O471_A2894HMaTipCCod ;
   private int[] T01O471_A2895HMaForNumC ;
   private short[] T01O471_A2897HMaColLin ;
   private java.util.Date[] T01O471_A2896HMaFec ;
   private short[] T01O471_A2907HmaLin ;
   private String[] T01O472_A396EmprCod ;
   private int[] T01O472_A129BarCod ;
   private byte[] T01O472_A132BarCodReo ;
   private String[] T01O472_A130BarCodPar ;
   private short[] T01O472_A2808RecLinMAL ;
   private byte[] T01O472_A1377RecNumAny ;
   private String[] T01O472_A719PrdNum ;
   private boolean[] T01O472_n719PrdNum ;
   private String[] T01O473_A396EmprCod ;
   private int[] T01O473_A129BarCod ;
   private byte[] T01O473_A132BarCodReo ;
   private String[] T01O473_A130BarCodPar ;
   private short[] T01O473_A2804RecLinMaq ;
   private byte[] T01O473_A1273RecLinPro ;
   private short[] T01O473_A811RecLin ;
   private String[] T01O474_A396EmprCod ;
   private int[] T01O474_A129BarCod ;
   private byte[] T01O474_A132BarCodReo ;
   private String[] T01O474_A130BarCodPar ;
   private String[] T01O474_A2494BarDosPro ;
   private String[] T01O474_A719PrdNum ;
   private boolean[] T01O474_n719PrdNum ;
   private String[] T01O475_A396EmprCod ;
   private int[] T01O475_A1314EnsLabCod ;
   private short[] T01O475_A1317EnsLabLin ;
   private String[] T01O476_A396EmprCod ;
   private String[] T01O476_A910Workstat ;
   private int[] T01O476_A887EscMLin ;
   private String[] T01O477_A396EmprCod ;
   private int[] T01O477_A859CumCodCont ;
   private String[] T01O477_A719PrdNum ;
   private boolean[] T01O477_n719PrdNum ;
   private String[] T01O478_A396EmprCod ;
   private String[] T01O478_A719PrdNum ;
   private boolean[] T01O478_n719PrdNum ;
   private java.util.Date[] T01O478_A810RecFec ;
   private String[] T01O479_A396EmprCod ;
   private int[] T01O479_A486ForNumCol ;
   private short[] T01O479_A715PrdLin ;
   private String[] T01O480_A396EmprCod ;
   private String[] T01O480_A719PrdNum ;
   private boolean[] T01O480_n719PrdNum ;
   private short[] T01O480_A681PrdAny ;
   private String[] T01O481_A396EmprCod ;
   private String[] T01O481_A719PrdNum ;
   private boolean[] T01O481_n719PrdNum ;
   private String[] T01O481_A688PrdComCod ;
   private String[] T01O482_A396EmprCod ;
   private String[] T01O482_A719PrdNum ;
   private boolean[] T01O482_n719PrdNum ;
   private String[] T01O482_A680PrdAltNum ;
   private String[] T01O483_A396EmprCod ;
   private int[] T01O483_A658PedCod ;
   private String[] T01O483_A719PrdNum ;
   private boolean[] T01O483_n719PrdNum ;
   private String[] T01O484_A396EmprCod ;
   private int[] T01O484_A486ForNumCol ;
   private short[] T01O484_A309ColLin ;
   private String[] T01O485_A396EmprCod ;
   private String[] T01O485_A719PrdNum ;
   private boolean[] T01O485_n719PrdNum ;
   private int[] T01O485_A647NumCon ;
   private String[] T01O486_A396EmprCod ;
   private String[] T01O486_A719PrdNum ;
   private boolean[] T01O486_n719PrdNum ;
   private String[] T01O487_A719PrdNum ;
   private boolean[] T01O487_n719PrdNum ;
   private int[] T01O487_A6158PrdPrv ;
   private java.math.BigDecimal[] T01O487_A7240PrdPrea ;
   private String[] T01O487_A10121PrdRefn ;
   private String[] T01O487_A396EmprCod ;
   private String[] T01O488_A396EmprCod ;
   private String[] T01O488_A719PrdNum ;
   private boolean[] T01O488_n719PrdNum ;
   private int[] T01O488_A6158PrdPrv ;
   private String[] T01O43_A719PrdNum ;
   private boolean[] T01O43_n719PrdNum ;
   private int[] T01O43_A6158PrdPrv ;
   private java.math.BigDecimal[] T01O43_A7240PrdPrea ;
   private String[] T01O43_A10121PrdRefn ;
   private String[] T01O43_A396EmprCod ;
   private String[] T01O42_A719PrdNum ;
   private boolean[] T01O42_n719PrdNum ;
   private int[] T01O42_A6158PrdPrv ;
   private java.math.BigDecimal[] T01O42_A7240PrdPrea ;
   private String[] T01O42_A10121PrdRefn ;
   private String[] T01O42_A396EmprCod ;
   private String[] T01O492_A396EmprCod ;
   private String[] T01O492_A719PrdNum ;
   private boolean[] T01O492_n719PrdNum ;
   private int[] T01O492_A6158PrdPrv ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV38PrdPrv_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class tnprovprd__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnprovprd__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnprovprd__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnprovprd__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tnprovprd__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01O42", "SELECT PrdNum, PrdPrv, PrdPrea, PrdRefn, EmprCod FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ? AND PrdPrv = ?  FOR UPDATE OF PrdPrea, PrdRefn NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O43", "SELECT PrdNum, PrdPrv, PrdPrea, PrdRefn, EmprCod FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ? AND PrdPrv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O44", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ?  FOR UPDATE OF PrdNom NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O45", "SELECT PrdNum, PrdNom, EmprCod FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O46", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O47", "SELECT /*+ FIRST_ROWS(100) */ TM1.PrdNum, T2.EmprNom, TM1.PrdNom, TM1.EmprCod FROM (TXPPRODUC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? ORDER BY TM1.EmprCod, TM1.PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O48", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O49", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( PrdNum > ?) and EmprCod = ? ORDER BY EmprCod, PrdNum) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O410", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum FROM TXPPRODUC WHERE ( PrdNum < ?) and EmprCod = ? ORDER BY EmprCod DESC, PrdNum DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01O411", "INSERT INTO TXPPRODUC(PrdNum, PrdNom, EmprCod, PrvNum, PrdExiAlm, PrdPreAct, PrdDetPar, ValCod, PrdFulEnt, PrdCanPen, PrdRotRea, PrdPreMed, PrdRec, PrdPreAnt, PrdFecPre, MovEspULin, PrdExiCC, PrdUltDCC, PrdUltECC, PrdUltCCC, PrdExiCCP, PrdDifCC, PrdFacCon, PrdConDia, PrdStkMinU, PrdStkMinD, PrdDiaRot, PrdPlaEnt, MetCod, PrdLotMin, PrdNumUco, PrdCanRes, PrdFulPed, PrdFulCC, PrdConCC, PrdDscTec, PrdUniCom, PrdUniCon, PrdRefPrv, PrdSus, PrdCalNec, PrdSit, TipDtoCod, PrdValStk, DifValStk, PrdFecEnt, PrdPosX, PrdPosY, PrdTip, PrdDqo, PrdRev, PrdTnq, CCStKULin, PrdUMeFo, PrdNom2, PrdNum2, PrdObs, PrdPreAc2, PrdDensS, PrdConcS, PrdSalM, PrdSolub, PrdNumCent, TipPrdCod, PrdNumct1, PrdNumct2, PrdHorMad, PrdPreRef, Mat_Lts, PrdExiAlmc, Almc_Ult, PrdAltAct, PrdPesCon, PrdPesTerm, CC_Ultln, PrdSal, SubFamCod, PrdInc, PrdComp, PrdAox, PrdNCAS, PrdFT, PrdFFT, PrdHS, PrdFHS, PrdReach, PrdOkotex, PrdColIdx, PrdLote, PrdRTM, PrdCtw1, PrdCtw2, PrdCtw3, PrdNroCAS, PrdGots, PrdHm, PrdConct, PrdEINECS, PrdFuncion, PrdNmQu, PrdEqLP, PrdConc, PrdCtw4, PrdList, PrdFabId, PrdLoteOb, PrdRGB, PrdZDHC, PrdTHELIST, PrdUbicaci, PrdCantAtM, PrdGruFamI, PrdMatSeca, AlmPrdID, PrdLoteFch, PrdFTdoc, PrdFSdoc, PrdGRS, LocUtiID, ForAlmID, UltLinEnt, PrdFibra, PrdCosto, PrdZDHCId) VALUES(?, ?, ?, 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, ' ', 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, ' ', 0, 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, ' ', 0, ' ', 0, 0, 0, ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, ' ', 0, ' ', 0, ' ', ' ', 0, ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', 0, 0, 0, ' ', 0, ' ')", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01O412", "UPDATE TXPPRODUC SET PrdNom=?  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new UpdateCursor("T01O413", "DELETE FROM TXPPRODUC  WHERE EmprCod = ? AND PrdNum = ?", GX_NOMASK, "TXPPRODUC")
         ,new ForEachCursor("T01O414", "SELECT * FROM (SELECT EmprCod, PrdNum, NormaID FROM TXPPrdNor WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O415", "SELECT * FROM (SELECT EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O416", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_linCP, Lb_TipCP FROM TXPENS304 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O417", "SELECT * FROM (SELECT EmprCod, AlbProID, AlbProLine FROM TXPLALPRO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O418", "SELECT * FROM (SELECT EmprCod, LDESID, LDESNPeque, LDESComb, LDESFondo, LDESLinea FROM TXPLDES04 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O419", "SELECT * FROM (SELECT EmprCod, Lb_NLab, Lb_IDVeces, Lb_LinID FROM TXPENDT02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O420", "SELECT * FROM (SELECT EmprCod, LavMqId, LavMqLnPq, LavMqLn FROM TXPLAVMQ2 WHERE EmprCod = ? AND LavMqPrd = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O421", "SELECT * FROM (SELECT EmprCod, PrdNum, Tb1_Cod FROM TXPCdnEnc WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O422", "SELECT * FROM (SELECT EmprCod, PrdNumD, PrdNum FROM TXPPRDDI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O423", "SELECT * FROM (SELECT EmprCod, DocDisID, LinDisID FROM TXPDisPq1 WHERE EmprCod = ? AND PrdDisQu = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O424", "SELECT * FROM (SELECT EmprCod, DocDisID FROM TXPDisPqu WHERE EmprCod = ? AND PrdDisQ = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O425", "SELECT * FROM (SELECT EmprCod, OrdenCID, OrdenCLnId FROM TXPIngQu1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O426", "SELECT * FROM (SELECT EmprCod, PrdNum, LoteID, LoteFec FROM TXPLOTPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O427", "SELECT * FROM (SELECT EmprCod, DevComCod, PrdNum FROM TXPDEVLCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O428", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, EnsCod, EnsLin FROM TXPENSLIN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O429", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, recestncol, recestnpro, recestlin FROM TXPlreest WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O430", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstEspLin FROM TXPLcoprv WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O431", "SELECT * FROM (SELECT EmprCod, EstNumFor, EstNumCol, EstProLin FROM TXPLcocol WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O432", "SELECT * FROM (SELECT EmprCod, TransferId, TransferLn FROM TXPTRF001 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O433", "SELECT * FROM (SELECT EmprCod, TaesId, TaesLn, TaesLnP FROM TXPTAES02 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O434", "SELECT * FROM (SELECT EmprCod, PrdNum, H_stklin FROM TXPHCCSTK WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O435", "SELECT * FROM (SELECT EmprCod, Pot_num, Pot_lin FROM TXPRECPO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O436", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdNcasC FROM TXPPRDNCA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O437", "SELECT * FROM (SELECT EmprCod, PrdNum, CFraseR FROM TXPPRDFRR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O438", "SELECT * FROM (SELECT EmprCod, Jt_codigo, Jt_ord FROM TXPJOTA01 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O439", "SELECT * FROM (SELECT EmprCod, Bny_dia, Bny_lin FROM TXPBANYO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O440", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, PrdNum FROM TXPZEPHYR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O441", "SELECT * FROM (SELECT EmprCod, PrdNum, Cod_Rgo FROM TXPPRDTB2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O442", "SELECT * FROM (SELECT EmprCod, PrdNum, Ct_codigo FROM TXPPRDCER WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O443", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OePasLin, OePasPLi FROM TXPHISOE4 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O444", "SELECT * FROM (SELECT EmprCod, OeNum, OeHdr, OeHdrr, OeHdrp, OeLinC, OeComb, Oefondo, OeMolCil, OeMolLin FROM TXPHISOE2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O445", "SELECT * FROM (SELECT EmprCod, Pas_Num, PrdNum FROM TXPMAKEP1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O446", "SELECT * FROM (SELECT EmprCod, PrdNum, CC_AlmCod FROM TXPPRDALM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O447", "SELECT * FROM (SELECT EmprCod, PrdNum, Almc_Ln FROM TXPALMCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O448", "SELECT * FROM (SELECT EmprCod, PrdNum, Mat_PrdN FROM TXPMATPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O449", "SELECT * FROM (SELECT EmprCod, Pet_cod, PrdNum FROM TXPPETCC1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O450", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O451", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAnyo, PrdProv FROM TXPINSEST WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O452", "SELECT * FROM (SELECT EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, Sim_lin FROM TXPFORLIS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O453", "SELECT * FROM (SELECT EmprCod, Vir_Codigo, PrdNum FROM TXPALMVI1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O454", "SELECT * FROM (SELECT EmprCod, Lb_TaAuxC, lb_TaAuxL, Lb_TauxLP FROM TXPENS007 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O455", "SELECT * FROM (SELECT EmprCod, PreCoNum, PrdNum FROM TXPPRESO1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O456", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdSusNum FROM TXPPRDSUS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O457", "SELECT * FROM (SELECT EmprCod, Lb_CodGru, Lb_LinGru FROM TXPENSPR1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O458", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaPr FROM TXPENS004 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O459", "SELECT * FROM (SELECT EmprCod, Lb_numero, Lb_opcion, Lb_LineaC FROM TXPENS003 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O460", "SELECT * FROM (SELECT EmprCod, SobCod, PrdNum FROM TXPEstSo1 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O461", "SELECT * FROM (SELECT EmprCod, RecPreCod, RecPreLin, RecPreNli FROM TXPPRERLN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O462", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMaq, HreLinPro, HreRecLin FROM TXPHISLRE WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O463", "SELECT * FROM (SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreLinMAL, HreNumAny, PrdNum FROM TXPHISREA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O464", "SELECT * FROM (SELECT EmprCod, CliCod, EstCol, EstColLin FROM TXPLEstCo WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O465", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecPasLin, RecPasPLi FROM TXPRECDEP WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O466", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, DisComLin, DisComCod, FonCod, RecMolCod, RecMolLin FROM TXPRECPRD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O467", "SELECT * FROM (SELECT EmprCod, PasCod, PrdNum FROM TXPLPASTA WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O468", "SELECT * FROM (SELECT EmprCod, HisEstHRu, HisEstHRe, HisEstHPa, HisEstLCo, HisEstCom, HisEstFon, PrdNum FROM TXPHISCOL WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O469", "SELECT * FROM (SELECT EmprCod, CliCod, SerEst, DibCli, DibInt, ColCom, ColFon, MolCod, ForPrdLin FROM TXPRECPR2 WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O470", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O471", "SELECT * FROM (SELECT EmprCod, CliCod, HMaForSer, HMaForCNom, HMaForCNum, HMaTipCCod, HMaForNumC, HMaColLin, HMaFec, HmaLin FROM TXPHISMAC WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O472", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMAL, RecNumAny, PrdNum FROM TXPLANYAD WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O473", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin FROM TXPLRECET WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O474", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarDosPro, PrdNum FROM TXPBARDOS WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O475", "SELECT * FROM (SELECT EmprCod, EnsLabCod, EnsLabLin FROM TXPLENLAB WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O476", "SELECT * FROM (SELECT EmprCod, Workstat, EscMLin FROM TXPESCMAN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O477", "SELECT * FROM (SELECT EmprCod, CumCodCont, PrdNum FROM TXPLCUMCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O478", "SELECT * FROM (SELECT EmprCod, PrdNum, RecFec FROM TXPRECUEN WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O479", "SELECT * FROM (SELECT EmprCod, ForNumCol, PrdLin FROM TXPLPRFOR WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O480", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAny FROM TXPCPRDES WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O481", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdComCod FROM TXPLPRDCO WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O482", "SELECT * FROM (SELECT EmprCod, PrdNum, PrdAltNum FROM TXPPRDALT WHERE EmprCod = ? AND PrdAltNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O483", "SELECT * FROM (SELECT EmprCod, PedCod, PrdNum FROM TXPLPEDID WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O484", "SELECT * FROM (SELECT EmprCod, ForNumCol, ColLin FROM TXPLDFORM WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O485", "SELECT * FROM (SELECT EmprCod, PrdNum, NumCon FROM TXPDETCON WHERE EmprCod = ? AND PrdNum = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01O486", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum FROM TXPPRODUC WHERE EmprCod = ? ORDER BY EmprCod, PrdNum ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O487", "SELECT PrdNum, PrdPrv, PrdPrea, PrdRefn, EmprCod FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? and PrdPrv = ? ORDER BY EmprCod, PrdNum, PrdPrv ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01O488", "SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? AND PrdNum = ? AND PrdPrv = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01O489", "INSERT INTO TXPPROPRV(PrdNum, PrdPrv, PrdPrea, PrdRefn, EmprCod) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPPROPRV")
         ,new UpdateCursor("T01O490", "UPDATE TXPPROPRV SET PrdPrea=?, PrdRefn=?  WHERE EmprCod = ? AND PrdNum = ? AND PrdPrv = ?", GX_NOMASK, "TXPPROPRV")
         ,new UpdateCursor("T01O491", "DELETE FROM TXPPROPRV  WHERE EmprCod = ? AND PrdNum = ? AND PrdPrv = ?", GX_NOMASK, "TXPPROPRV")
         ,new ForEachCursor("T01O492", "SELECT EmprCod, PrdNum, PrdPrv FROM TXPPROPRV WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum, PrdPrv ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               return;
            case 86 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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
               stmt.setInt(2, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[3], 5);
               stmt.setString(4, (String)parms[4], 30);
               stmt.setString(5, (String)parms[5], 3);
               return;
            case 88 :
               stmt.setBigDecimal(1, (java.math.BigDecimal)parms[0], 5);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 3);
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 6);
               }
               stmt.setInt(5, ((Number) parms[5]).intValue());
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
               stmt.setInt(3, ((Number) parms[3]).intValue());
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

