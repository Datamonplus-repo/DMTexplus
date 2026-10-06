package app.menus ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class mnuop_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_opciones") == 0 )
      {
         gxnrgridlevel_opciones_newrow_invoke( ) ;
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
            AV7MnuId = httpContext.GetPar( "MnuId") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7MnuId", AV7MnuId);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMNUID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7MnuId, "@!"))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Opciones del Menu", ""), (short)(0)) ;
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

   public void gxnrgridlevel_opciones_newrow_invoke( )
   {
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_opciones_newrow( ) ;
      /* End function gxnrGridlevel_opciones_newrow_invoke */
   }

   public mnuop_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public mnuop_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( mnuop_impl.class ));
   }

   public mnuop_impl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbMnuSit = new HTMLChoice();
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuId_Internalname, httpContext.getMessage( "ID", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuId_Internalname, GXutil.rtrim( A945MnuId), GXutil.rtrim( localUtil.format( A945MnuId, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMnuId_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Menus\\MNUOP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMnuTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMnuTxt_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMnuTxt_Internalname, GXutil.rtrim( A951MnuTxt), GXutil.rtrim( localUtil.format( A951MnuTxt, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMnuTxt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMnuTxt_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Menus\\MNUOP.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_opciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_opciones( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Menus\\MNUOP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Menus\\MNUOP.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Menus\\MNUOP.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV15Pgmname), GXutil.rtrim( localUtil.format( AV15Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Menus\\MNUOP.htm");
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

   public void gxdraw_gridlevel_opciones( )
   {
      /*  Grid Control  */
      startgridcontrol32( ) ;
      nGXsfl_32_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount125 = (short)(0) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_125 = (short)(1) ;
            scanStart1UH125( ) ;
            while ( RcdFound125 != 0 )
            {
               init_level_properties125( ) ;
               getByPrimaryKey1UH125( ) ;
               addRow1UH125( ) ;
               scanNext1UH125( ) ;
            }
            scanEnd1UH125( ) ;
            nBlankRcdCount125 = (short)(0) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1UH125( ) ;
         standaloneModal1UH125( ) ;
         sMode125 = Gx_mode ;
         while ( nGXsfl_32_idx < nRC_GXsfl_32 )
         {
            bGXsfl_32_Refreshing = true ;
            readRow1UH125( ) ;
            edtMnuOp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUOP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtMnuPgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgm_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtMnuPgmTpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTPO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTpo_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtMnuPgmTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTXT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTxt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtMnuPgmWeb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMWEB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmWeb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmWeb_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            edtMnuIcon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUICON_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMnuIcon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuIcon_Enabled), 5, 0), !bGXsfl_32_Refreshing);
            cmbMnuSit.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MNUSIT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, cmbMnuSit.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMnuSit.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
            if ( ( nRcdExists_125 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1UH125( ) ;
            }
            sendRow1UH125( ) ;
            bGXsfl_32_Refreshing = false ;
         }
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount125 = (short)(0) ;
         nRcdExists_125 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1UH125( ) ;
            while ( RcdFound125 != 0 )
            {
               sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_32125( ) ;
               init_level_properties125( ) ;
               standaloneNotModal1UH125( ) ;
               getByPrimaryKey1UH125( ) ;
               standaloneModal1UH125( ) ;
               addRow1UH125( ) ;
               scanNext1UH125( ) ;
            }
            scanEnd1UH125( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode125 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_32125( ) ;
         initAll1UH125( ) ;
         init_level_properties125( ) ;
         nRcdExists_125 = (short)(0) ;
         nIsMod_125 = (short)(0) ;
         nRcdDeleted_125 = (short)(0) ;
         nBlankRcdCount125 = (short)(nBlankRcdUsr125+nBlankRcdCount125) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount125 > 0 )
         {
            standaloneNotModal1UH125( ) ;
            standaloneModal1UH125( ) ;
            addRow1UH125( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMnuPgmWeb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount125 = (short)(nBlankRcdCount125-1) ;
         }
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_opcionesContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_opciones", Gridlevel_opcionesContainer, subGridlevel_opciones_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_opcionesContainerData", Gridlevel_opcionesContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_opcionesContainerData"+"V", Gridlevel_opcionesContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_opcionesContainerData"+"V"+"\" value='"+Gridlevel_opcionesContainer.GridValuesHidden()+"'/>") ;
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
      e111UH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z945MnuId = httpContext.cgiGet( "Z945MnuId") ;
            Z951MnuTxt = httpContext.cgiGet( "Z951MnuTxt") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7MnuId = httpContext.cgiGet( "vMNUID") ;
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
            A945MnuId = GXutil.upper( httpContext.cgiGet( edtMnuId_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            A951MnuTxt = httpContext.cgiGet( edtMnuTxt_Internalname) ;
            n951MnuTxt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
            AV15Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"MNUOP");
            A945MnuId = httpContext.cgiGet( edtMnuId_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            forbiddenHiddens.add("MnuId", GXutil.rtrim( localUtil.format( A945MnuId, "@!")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            A951MnuTxt = httpContext.cgiGet( edtMnuTxt_Internalname) ;
            n951MnuTxt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
            forbiddenHiddens.add("MnuTxt", GXutil.rtrim( localUtil.format( A951MnuTxt, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("menus\\mnuop:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A945MnuId = httpContext.GetPar( "MnuId") ;
               httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
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
                  sMode124 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode124 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound124 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UH0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "MNUID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMnuId_Internalname ;
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
                        e111UH2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UH2 ();
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
         e121UH2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UH124( ) ;
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
         disableAttributes1UH124( ) ;
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

   public void confirm_1UH0( )
   {
      beforeValidate1UH124( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UH124( ) ;
         }
         else
         {
            checkExtendedTable1UH124( ) ;
            closeExtendedTableCursors1UH124( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode124 = Gx_mode ;
         confirm_1UH125( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode124 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode124 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1UH125( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1UH125( ) ;
         if ( ( nRcdExists_125 != 0 ) || ( nIsMod_125 != 0 ) )
         {
            getKey1UH125( ) ;
            if ( ( nRcdExists_125 == 0 ) && ( nRcdDeleted_125 == 0 ) )
            {
               if ( RcdFound125 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1UH125( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1UH125( ) ;
                     closeExtendedTableCursors1UH125( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
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
               if ( RcdFound125 != 0 )
               {
                  if ( nRcdDeleted_125 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1UH125( ) ;
                     load1UH125( ) ;
                     beforeValidate1UH125( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1UH125( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_125 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1UH125( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1UH125( ) ;
                           closeExtendedTableCursors1UH125( ) ;
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
                  if ( nRcdDeleted_125 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtMnuOp_Internalname, GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMnuPgm_Internalname, GXutil.rtrim( A947MnuPgm)) ;
         httpContext.changePostValue( edtMnuPgmTpo_Internalname, GXutil.rtrim( A948MnuPgmTpo)) ;
         httpContext.changePostValue( edtMnuPgmTxt_Internalname, GXutil.rtrim( A949MnuPgmTxt)) ;
         httpContext.changePostValue( edtMnuPgmWeb_Internalname, A14286MnuPgmWeb) ;
         httpContext.changePostValue( edtMnuIcon_Internalname, A14293MnuIcon) ;
         httpContext.changePostValue( cmbMnuSit.getInternalname(), GXutil.rtrim( A14294MnuSit)) ;
         httpContext.changePostValue( "ZT_"+"Z946MnuOp_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z947MnuPgm_"+sGXsfl_32_idx, GXutil.rtrim( Z947MnuPgm)) ;
         httpContext.changePostValue( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_32_idx, GXutil.rtrim( Z948MnuPgmTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z14293MnuIcon_"+sGXsfl_32_idx, Z14293MnuIcon) ;
         httpContext.changePostValue( "ZT_"+"Z14294MnuSit_"+sGXsfl_32_idx, GXutil.rtrim( Z14294MnuSit)) ;
         httpContext.changePostValue( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_32_idx, GXutil.rtrim( Z949MnuPgmTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z14286MnuPgmWeb_"+sGXsfl_32_idx, Z14286MnuPgmWeb) ;
         httpContext.changePostValue( "nRcdDeleted_125_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_125_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_125_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_125 != 0 )
         {
            httpContext.changePostValue( "MNUOP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTPO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTXT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMWEB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmWeb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUICON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuIcon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUSIT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMnuSit.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1UH0( )
   {
   }

   public void e111UH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      mnuop_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char2[0] = AV12EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      mnuop_impl.this.AV12EmprCod = GXv_char2[0] ;
      mnuop_impl.this.AV13EmprNom = GXv_char3[0] ;
      mnuop_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12EmprCod", AV12EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprNom", AV13EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
      GXv_SdtWWPContext5[0] = AV8WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV8WWPContext = GXv_SdtWWPContext5[0] ;
      AV9TrnContext.fromxml(AV10WebSession.getValue("TrnContext"), null, null);
   }

   public void e121UH2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void zm1UH124( int GX_JID )
   {
      if ( ( GX_JID == 9 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z951MnuTxt = T01UH5_A951MnuTxt[0] ;
         }
         else
         {
            Z951MnuTxt = A951MnuTxt ;
         }
      }
      if ( GX_JID == -9 )
      {
         Z945MnuId = A945MnuId ;
         Z951MnuTxt = A951MnuTxt ;
      }
   }

   public void standaloneNotModal( )
   {
      edtMnuId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuId_Enabled), 5, 0), true);
      edtMnuTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuTxt_Enabled), 5, 0), true);
      AV15Pgmname = "Menus.MNUOP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Pgmname", AV15Pgmname);
      edtMnuId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuId_Enabled), 5, 0), true);
      edtMnuTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuTxt_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7MnuId)==0) )
      {
         A945MnuId = AV7MnuId ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      }
   }

   public void standaloneModal( )
   {
      if ( isDlt( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Funcion no permitida", ""), 1, "");
         AnyError = (short)(1) ;
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
   }

   public void load1UH124( )
   {
      /* Using cursor T01UH6 */
      pr_default.execute(4, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound124 = (short)(1) ;
         A951MnuTxt = T01UH6_A951MnuTxt[0] ;
         n951MnuTxt = T01UH6_n951MnuTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
         zm1UH124( -9) ;
      }
      pr_default.close(4);
      onLoadActions1UH124( ) ;
   }

   public void onLoadActions1UH124( )
   {
   }

   public void checkExtendedTable1UH124( )
   {
      nIsDirty_124 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors1UH124( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1UH124( )
   {
      /* Using cursor T01UH7 */
      pr_default.execute(5, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound124 = (short)(1) ;
      }
      else
      {
         RcdFound124 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UH5 */
      pr_default.execute(3, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm1UH124( 9) ;
         RcdFound124 = (short)(1) ;
         A945MnuId = T01UH5_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         A951MnuTxt = T01UH5_A951MnuTxt[0] ;
         n951MnuTxt = T01UH5_n951MnuTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
         Z945MnuId = A945MnuId ;
         sMode124 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UH124( ) ;
         if ( AnyError == 1 )
         {
            RcdFound124 = (short)(0) ;
            initializeNonKey1UH124( ) ;
         }
         Gx_mode = sMode124 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound124 = (short)(0) ;
         initializeNonKey1UH124( ) ;
         sMode124 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode124 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey1UH124( ) ;
      if ( RcdFound124 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound124 = (short)(0) ;
      /* Using cursor T01UH8 */
      pr_default.execute(6, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01UH8_A945MnuId[0], A945MnuId) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01UH8_A945MnuId[0], A945MnuId) > 0 ) ) )
         {
            A945MnuId = T01UH8_A945MnuId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            RcdFound124 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound124 = (short)(0) ;
      /* Using cursor T01UH9 */
      pr_default.execute(7, new Object[] {A945MnuId});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UH9_A945MnuId[0], A945MnuId) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UH9_A945MnuId[0], A945MnuId) < 0 ) ) )
         {
            A945MnuId = T01UH9_A945MnuId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
            RcdFound124 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UH124( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1UH124( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound124 == 1 )
         {
            if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
            {
               A945MnuId = Z945MnuId ;
               httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "MNUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMnuId_Internalname ;
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
               update1UH124( ) ;
            }
         }
         else
         {
            if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
            {
               /* Insert record */
               insert1UH124( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "MNUID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMnuId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  insert1UH124( ) ;
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
      if ( GXutil.strcmp(A945MnuId, Z945MnuId) != 0 )
      {
         A945MnuId = Z945MnuId ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "MNUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMnuId_Internalname ;
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

   public void checkOptimisticConcurrency1UH124( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UH4 */
         pr_default.execute(2, new Object[] {A945MnuId});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUCAB"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) || ( GXutil.strcmp(Z951MnuTxt, T01UH4_A951MnuTxt[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z951MnuTxt, T01UH4_A951MnuTxt[0]) != 0 )
            {
               GXutil.writeLogln("menus.mnuop:[seudo value changed for attri]"+"MnuTxt");
               GXutil.writeLogRaw("Old: ",Z951MnuTxt);
               GXutil.writeLogRaw("Current: ",T01UH4_A951MnuTxt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMNUCAB"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UH124( )
   {
      beforeValidate1UH124( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UH124( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UH124( 0) ;
         checkOptimisticConcurrency1UH124( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UH124( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UH124( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UH10 */
                  pr_default.execute(8, new Object[] {A945MnuId, Boolean.valueOf(n951MnuTxt), A951MnuTxt});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUCAB");
                  if ( (pr_default.getStatus(8) == 1) )
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
                        processLevel1UH124( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1UH0( ) ;
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
            load1UH124( ) ;
         }
         endLevel1UH124( ) ;
      }
      closeExtendedTableCursors1UH124( ) ;
   }

   public void update1UH124( )
   {
      beforeValidate1UH124( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UH124( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UH124( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UH124( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UH124( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UH11 */
                  pr_default.execute(9, new Object[] {Boolean.valueOf(n951MnuTxt), A951MnuTxt, A945MnuId});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUCAB");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUCAB"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UH124( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1UH124( ) ;
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
         endLevel1UH124( ) ;
      }
      closeExtendedTableCursors1UH124( ) ;
   }

   public void deferredUpdate1UH124( )
   {
   }

   public void delete( )
   {
      beforeValidate1UH124( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UH124( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UH124( ) ;
         afterConfirm1UH124( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UH124( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UH12 */
               pr_default.execute(10, new Object[] {A945MnuId});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUCAB");
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
      sMode124 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UH124( ) ;
      Gx_mode = sMode124 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UH124( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void processNestedLevel1UH125( )
   {
      nGXsfl_32_idx = 0 ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         readRow1UH125( ) ;
         if ( ( nRcdExists_125 != 0 ) || ( nIsMod_125 != 0 ) )
         {
            standaloneNotModal1UH125( ) ;
            getKey1UH125( ) ;
            if ( ( nRcdExists_125 == 0 ) && ( nRcdDeleted_125 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1UH125( ) ;
            }
            else
            {
               if ( RcdFound125 != 0 )
               {
                  if ( ( nRcdDeleted_125 != 0 ) && ( nRcdExists_125 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1UH125( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_125 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1UH125( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_125 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         httpContext.changePostValue( edtMnuOp_Internalname, GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMnuPgm_Internalname, GXutil.rtrim( A947MnuPgm)) ;
         httpContext.changePostValue( edtMnuPgmTpo_Internalname, GXutil.rtrim( A948MnuPgmTpo)) ;
         httpContext.changePostValue( edtMnuPgmTxt_Internalname, GXutil.rtrim( A949MnuPgmTxt)) ;
         httpContext.changePostValue( edtMnuPgmWeb_Internalname, A14286MnuPgmWeb) ;
         httpContext.changePostValue( edtMnuIcon_Internalname, A14293MnuIcon) ;
         httpContext.changePostValue( cmbMnuSit.getInternalname(), GXutil.rtrim( A14294MnuSit)) ;
         httpContext.changePostValue( "ZT_"+"Z946MnuOp_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z947MnuPgm_"+sGXsfl_32_idx, GXutil.rtrim( Z947MnuPgm)) ;
         httpContext.changePostValue( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_32_idx, GXutil.rtrim( Z948MnuPgmTpo)) ;
         httpContext.changePostValue( "ZT_"+"Z14293MnuIcon_"+sGXsfl_32_idx, Z14293MnuIcon) ;
         httpContext.changePostValue( "ZT_"+"Z14294MnuSit_"+sGXsfl_32_idx, GXutil.rtrim( Z14294MnuSit)) ;
         httpContext.changePostValue( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_32_idx, GXutil.rtrim( Z949MnuPgmTxt)) ;
         httpContext.changePostValue( "ZT_"+"Z14286MnuPgmWeb_"+sGXsfl_32_idx, Z14286MnuPgmWeb) ;
         httpContext.changePostValue( "nRcdDeleted_125_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_125_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_125_"+sGXsfl_32_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_125 != 0 )
         {
            httpContext.changePostValue( "MNUOP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTPO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMTXT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUPGMWEB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmWeb_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUICON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuIcon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MNUSIT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMnuSit.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1UH125( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_125 = (short)(0) ;
      nIsMod_125 = (short)(0) ;
      nRcdDeleted_125 = (short)(0) ;
   }

   public void processLevel1UH124( )
   {
      /* Save parent mode. */
      sMode124 = Gx_mode ;
      processNestedLevel1UH125( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode124 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1UH124( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UH124( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "menus.mnuop");
         if ( AnyError == 0 )
         {
            confirmValues1UH0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "menus.mnuop");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UH124( )
   {
      /* Scan By routine */
      /* Using cursor T01UH13 */
      pr_default.execute(11);
      RcdFound124 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound124 = (short)(1) ;
         A945MnuId = T01UH13_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UH124( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound124 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound124 = (short)(1) ;
         A945MnuId = T01UH13_A945MnuId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      }
   }

   public void scanEnd1UH124( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1UH124( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UH124( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UH124( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UH124( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UH124( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UH124( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UH124( )
   {
      edtMnuId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuId_Enabled), 5, 0), true);
      edtMnuTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuTxt_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm1UH125( int GX_JID )
   {
      if ( ( GX_JID == 10 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z947MnuPgm = T01UH3_A947MnuPgm[0] ;
            Z948MnuPgmTpo = T01UH3_A948MnuPgmTpo[0] ;
            Z14293MnuIcon = T01UH3_A14293MnuIcon[0] ;
            Z14294MnuSit = T01UH3_A14294MnuSit[0] ;
            Z949MnuPgmTxt = T01UH3_A949MnuPgmTxt[0] ;
            Z14286MnuPgmWeb = T01UH3_A14286MnuPgmWeb[0] ;
         }
         else
         {
            Z947MnuPgm = A947MnuPgm ;
            Z948MnuPgmTpo = A948MnuPgmTpo ;
            Z14293MnuIcon = A14293MnuIcon ;
            Z14294MnuSit = A14294MnuSit ;
            Z949MnuPgmTxt = A949MnuPgmTxt ;
            Z14286MnuPgmWeb = A14286MnuPgmWeb ;
         }
      }
      if ( GX_JID == -10 )
      {
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         Z947MnuPgm = A947MnuPgm ;
         Z948MnuPgmTpo = A948MnuPgmTpo ;
         Z14293MnuIcon = A14293MnuIcon ;
         Z14294MnuSit = A14294MnuSit ;
         Z949MnuPgmTxt = A949MnuPgmTxt ;
         Z14286MnuPgmWeb = A14286MnuPgmWeb ;
      }
   }

   public void standaloneNotModal1UH125( )
   {
      edtMnuOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgm_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgmTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTpo_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgmTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTxt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void standaloneModal1UH125( )
   {
   }

   public void load1UH125( )
   {
      /* Using cursor T01UH14 */
      pr_default.execute(12, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A947MnuPgm = T01UH14_A947MnuPgm[0] ;
         A948MnuPgmTpo = T01UH14_A948MnuPgmTpo[0] ;
         A14293MnuIcon = T01UH14_A14293MnuIcon[0] ;
         n14293MnuIcon = T01UH14_n14293MnuIcon[0] ;
         A14294MnuSit = T01UH14_A14294MnuSit[0] ;
         A949MnuPgmTxt = T01UH14_A949MnuPgmTxt[0] ;
         A14286MnuPgmWeb = T01UH14_A14286MnuPgmWeb[0] ;
         zm1UH125( -10) ;
      }
      pr_default.close(12);
      onLoadActions1UH125( ) ;
   }

   public void onLoadActions1UH125( )
   {
   }

   public void checkExtendedTable1UH125( )
   {
      nIsDirty_125 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1UH125( ) ;
   }

   public void closeExtendedTableCursors1UH125( )
   {
   }

   public void enableDisable1UH125( )
   {
   }

   public void getKey1UH125( )
   {
      /* Using cursor T01UH15 */
      pr_default.execute(13, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound125 = (short)(1) ;
      }
      else
      {
         RcdFound125 = (short)(0) ;
      }
      pr_default.close(13);
   }

   public void getByPrimaryKey1UH125( )
   {
      /* Using cursor T01UH3 */
      pr_default.execute(1, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UH125( 10) ;
         RcdFound125 = (short)(1) ;
         initializeNonKey1UH125( ) ;
         A946MnuOp = T01UH3_A946MnuOp[0] ;
         A947MnuPgm = T01UH3_A947MnuPgm[0] ;
         A948MnuPgmTpo = T01UH3_A948MnuPgmTpo[0] ;
         A14293MnuIcon = T01UH3_A14293MnuIcon[0] ;
         n14293MnuIcon = T01UH3_n14293MnuIcon[0] ;
         A14294MnuSit = T01UH3_A14294MnuSit[0] ;
         A949MnuPgmTxt = T01UH3_A949MnuPgmTxt[0] ;
         A14286MnuPgmWeb = T01UH3_A14286MnuPgmWeb[0] ;
         Z945MnuId = A945MnuId ;
         Z946MnuOp = A946MnuOp ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UH125( ) ;
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound125 = (short)(0) ;
         initializeNonKey1UH125( ) ;
         sMode125 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1UH125( ) ;
         Gx_mode = sMode125 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1UH125( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1UH125( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UH2 */
         pr_default.execute(0, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z947MnuPgm, T01UH2_A947MnuPgm[0]) != 0 ) || ( GXutil.strcmp(Z948MnuPgmTpo, T01UH2_A948MnuPgmTpo[0]) != 0 ) || ( GXutil.strcmp(Z14293MnuIcon, T01UH2_A14293MnuIcon[0]) != 0 ) || ( GXutil.strcmp(Z14294MnuSit, T01UH2_A14294MnuSit[0]) != 0 ) || ( GXutil.strcmp(Z949MnuPgmTxt, T01UH2_A949MnuPgmTxt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z14286MnuPgmWeb, T01UH2_A14286MnuPgmWeb[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z947MnuPgm, T01UH2_A947MnuPgm[0]) != 0 )
            {
               GXutil.writeLogln("menus.mnuop:[seudo value changed for attri]"+"MnuPgm");
               GXutil.writeLogRaw("Old: ",Z947MnuPgm);
               GXutil.writeLogRaw("Current: ",T01UH2_A947MnuPgm[0]);
            }
            if ( GXutil.strcmp(Z948MnuPgmTpo, T01UH2_A948MnuPgmTpo[0]) != 0 )
            {
               GXutil.writeLogln("menus.mnuop:[seudo value changed for attri]"+"MnuPgmTpo");
               GXutil.writeLogRaw("Old: ",Z948MnuPgmTpo);
               GXutil.writeLogRaw("Current: ",T01UH2_A948MnuPgmTpo[0]);
            }
            if ( GXutil.strcmp(Z14293MnuIcon, T01UH2_A14293MnuIcon[0]) != 0 )
            {
               GXutil.writeLogln("menus.mnuop:[seudo value changed for attri]"+"MnuIcon");
               GXutil.writeLogRaw("Old: ",Z14293MnuIcon);
               GXutil.writeLogRaw("Current: ",T01UH2_A14293MnuIcon[0]);
            }
            if ( GXutil.strcmp(Z14294MnuSit, T01UH2_A14294MnuSit[0]) != 0 )
            {
               GXutil.writeLogln("menus.mnuop:[seudo value changed for attri]"+"MnuSit");
               GXutil.writeLogRaw("Old: ",Z14294MnuSit);
               GXutil.writeLogRaw("Current: ",T01UH2_A14294MnuSit[0]);
            }
            if ( GXutil.strcmp(Z949MnuPgmTxt, T01UH2_A949MnuPgmTxt[0]) != 0 )
            {
               GXutil.writeLogln("menus.mnuop:[seudo value changed for attri]"+"MnuPgmTxt");
               GXutil.writeLogRaw("Old: ",Z949MnuPgmTxt);
               GXutil.writeLogRaw("Current: ",T01UH2_A949MnuPgmTxt[0]);
            }
            if ( GXutil.strcmp(Z14286MnuPgmWeb, T01UH2_A14286MnuPgmWeb[0]) != 0 )
            {
               GXutil.writeLogln("menus.mnuop:[seudo value changed for attri]"+"MnuPgmWeb");
               GXutil.writeLogRaw("Old: ",Z14286MnuPgmWeb);
               GXutil.writeLogRaw("Current: ",T01UH2_A14286MnuPgmWeb[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMNUOP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UH125( )
   {
      beforeValidate1UH125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UH125( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UH125( 0) ;
         checkOptimisticConcurrency1UH125( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UH125( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UH125( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UH16 */
                  pr_default.execute(14, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp), A947MnuPgm, A948MnuPgmTpo, Boolean.valueOf(n14293MnuIcon), A14293MnuIcon, A14294MnuSit, A949MnuPgmTxt, A14286MnuPgmWeb});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
                  if ( (pr_default.getStatus(14) == 1) )
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
            load1UH125( ) ;
         }
         endLevel1UH125( ) ;
      }
      closeExtendedTableCursors1UH125( ) ;
   }

   public void update1UH125( )
   {
      beforeValidate1UH125( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UH125( ) ;
      }
      if ( ( nIsMod_125 != 0 ) || ( nIsDirty_125 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1UH125( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1UH125( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1UH125( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01UH17 */
                     pr_default.execute(15, new Object[] {A947MnuPgm, A948MnuPgmTpo, Boolean.valueOf(n14293MnuIcon), A14293MnuIcon, A14294MnuSit, A949MnuPgmTxt, A14286MnuPgmWeb, A945MnuId, Byte.valueOf(A946MnuOp)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
                     if ( (pr_default.getStatus(15) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMNUOP"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1UH125( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1UH125( ) ;
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
            endLevel1UH125( ) ;
         }
      }
      closeExtendedTableCursors1UH125( ) ;
   }

   public void deferredUpdate1UH125( )
   {
   }

   public void delete1UH125( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1UH125( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UH125( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UH125( ) ;
         afterConfirm1UH125( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UH125( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UH18 */
               pr_default.execute(16, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMNUOP");
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
      sMode125 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UH125( ) ;
      Gx_mode = sMode125 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UH125( )
   {
      standaloneModal1UH125( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T01UH19 */
         pr_default.execute(17, new Object[] {A945MnuId, Byte.valueOf(A946MnuOp)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OPCGRU", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
      }
   }

   public void endLevel1UH125( )
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

   public void scanStart1UH125( )
   {
      /* Scan By routine */
      /* Using cursor T01UH20 */
      pr_default.execute(18, new Object[] {A945MnuId});
      RcdFound125 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A946MnuOp = T01UH20_A946MnuOp[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UH125( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound125 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound125 = (short)(1) ;
         A946MnuOp = T01UH20_A946MnuOp[0] ;
      }
   }

   public void scanEnd1UH125( )
   {
      pr_default.close(18);
   }

   public void afterConfirm1UH125( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UH125( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UH125( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UH125( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UH125( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UH125( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UH125( )
   {
      edtMnuOp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgm_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgmTpo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTpo_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgmTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTxt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgmWeb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmWeb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmWeb_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuIcon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuIcon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuIcon_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      cmbMnuSit.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbMnuSit.getInternalname(), "Enabled", GXutil.ltrimstr( cmbMnuSit.getEnabled(), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void send_integrity_lvl_hashes1UH125( )
   {
   }

   public void send_integrity_lvl_hashes1UH124( )
   {
   }

   public void subsflControlProps_32125( )
   {
      edtMnuOp_Internalname = "MNUOP_"+sGXsfl_32_idx ;
      edtMnuPgm_Internalname = "MNUPGM_"+sGXsfl_32_idx ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO_"+sGXsfl_32_idx ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT_"+sGXsfl_32_idx ;
      edtMnuPgmWeb_Internalname = "MNUPGMWEB_"+sGXsfl_32_idx ;
      edtMnuIcon_Internalname = "MNUICON_"+sGXsfl_32_idx ;
      cmbMnuSit.setInternalname( "MNUSIT_"+sGXsfl_32_idx );
   }

   public void subsflControlProps_fel_32125( )
   {
      edtMnuOp_Internalname = "MNUOP_"+sGXsfl_32_fel_idx ;
      edtMnuPgm_Internalname = "MNUPGM_"+sGXsfl_32_fel_idx ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO_"+sGXsfl_32_fel_idx ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT_"+sGXsfl_32_fel_idx ;
      edtMnuPgmWeb_Internalname = "MNUPGMWEB_"+sGXsfl_32_fel_idx ;
      edtMnuIcon_Internalname = "MNUICON_"+sGXsfl_32_fel_idx ;
      cmbMnuSit.setInternalname( "MNUSIT_"+sGXsfl_32_fel_idx );
   }

   public void addRow1UH125( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32125( ) ;
      sendRow1UH125( ) ;
   }

   public void sendRow1UH125( )
   {
      Gridlevel_opcionesRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_opciones_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_opciones_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_opciones_Class, "") != 0 )
         {
            subGridlevel_opciones_Linesclass = subGridlevel_opciones_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_opciones_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_opciones_Backstyle = (byte)(0) ;
         subGridlevel_opciones_Backcolor = subGridlevel_opciones_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_opciones_Class, "") != 0 )
         {
            subGridlevel_opciones_Linesclass = subGridlevel_opciones_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_opciones_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_opciones_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_opciones_Class, "") != 0 )
         {
            subGridlevel_opciones_Linesclass = subGridlevel_opciones_Class+"Odd" ;
         }
         subGridlevel_opciones_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_opciones_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_opciones_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
         {
            subGridlevel_opciones_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_opciones_Class, "") != 0 )
            {
               subGridlevel_opciones_Linesclass = subGridlevel_opciones_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_opciones_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_opciones_Class, "") != 0 )
            {
               subGridlevel_opciones_Linesclass = subGridlevel_opciones_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_opcionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuOp_Internalname,GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtMnuOp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9") : localUtil.format( DecimalUtil.doubleToDec(A946MnuOp), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuOp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMnuOp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_opcionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgm_Internalname,GXutil.rtrim( A947MnuPgm),GXutil.rtrim( localUtil.format( A947MnuPgm, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMnuPgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_opcionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmTpo_Internalname,GXutil.rtrim( A948MnuPgmTpo),GXutil.rtrim( localUtil.format( A948MnuPgmTpo, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmTpo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMnuPgmTpo_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_opcionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmTxt_Internalname,GXutil.rtrim( A949MnuPgmTxt),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmTxt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMnuPgmTxt_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_125_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_opcionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuPgmWeb_Internalname,A14286MnuPgmWeb,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuPgmWeb_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMnuPgmWeb_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_125_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_opcionesRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMnuIcon_Internalname,A14293MnuIcon,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMnuIcon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMnuIcon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_125_" + sGXsfl_32_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_32_idx + "',32)\"" ;
      if ( ( cmbMnuSit.getItemCount() == 0 ) && isAjaxCallMode( ) )
      {
         GXCCtl = "MNUSIT_" + sGXsfl_32_idx ;
         cmbMnuSit.setName( GXCCtl );
         cmbMnuSit.setWebtags( "" );
         cmbMnuSit.addItem("T", httpContext.getMessage( "Activo", ""), (short)(0));
         cmbMnuSit.addItem("F", httpContext.getMessage( "Inactivo", ""), (short)(0));
         if ( cmbMnuSit.getItemCount() > 0 )
         {
            A14294MnuSit = cmbMnuSit.getValidValue(A14294MnuSit) ;
         }
      }
      /* ComboBox */
      Gridlevel_opcionesRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbMnuSit,cmbMnuSit.getInternalname(),GXutil.rtrim( A14294MnuSit),Integer.valueOf(1),cmbMnuSit.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(cmbMnuSit.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","TrnColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"","",Boolean.valueOf(true),Integer.valueOf(0)});
      cmbMnuSit.setValue( GXutil.rtrim( A14294MnuSit) );
      httpContext.ajax_rsp_assign_prop("", false, cmbMnuSit.getInternalname(), "Values", cmbMnuSit.ToJavascriptSource(), !bGXsfl_32_Refreshing);
      httpContext.ajax_sending_grid_row(Gridlevel_opcionesRow);
      send_integrity_lvl_hashes1UH125( ) ;
      GXCCtl = "Z946MnuOp_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z946MnuOp, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z947MnuPgm_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z947MnuPgm));
      GXCCtl = "Z948MnuPgmTpo_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z948MnuPgmTpo));
      GXCCtl = "Z14293MnuIcon_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14293MnuIcon);
      GXCCtl = "Z14294MnuSit_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z14294MnuSit));
      GXCCtl = "Z949MnuPgmTxt_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z949MnuPgmTxt));
      GXCCtl = "Z14286MnuPgmWeb_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, Z14286MnuPgmWeb);
      GXCCtl = "nRcdDeleted_125_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_125_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_125_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_125, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vMNUID_" + sGXsfl_32_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV7MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUOP_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGM_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGMTPO_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGMTXT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUPGMWEB_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmWeb_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUICON_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuIcon_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MNUSIT_"+sGXsfl_32_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( cmbMnuSit.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_opcionesContainer.AddRow(Gridlevel_opcionesRow);
   }

   public void readRow1UH125( )
   {
      nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32125( ) ;
      edtMnuOp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUOP_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPgm_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGM_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPgmTpo_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTPO_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPgmTxt_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMTXT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuPgmWeb_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUPGMWEB_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMnuIcon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MNUICON_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      cmbMnuSit.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "MNUSIT_"+sGXsfl_32_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      A946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( edtMnuOp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      A947MnuPgm = GXutil.upper( httpContext.cgiGet( edtMnuPgm_Internalname)) ;
      A948MnuPgmTpo = GXutil.upper( httpContext.cgiGet( edtMnuPgmTpo_Internalname)) ;
      A949MnuPgmTxt = httpContext.cgiGet( edtMnuPgmTxt_Internalname) ;
      A14286MnuPgmWeb = httpContext.cgiGet( edtMnuPgmWeb_Internalname) ;
      A14293MnuIcon = httpContext.cgiGet( edtMnuIcon_Internalname) ;
      n14293MnuIcon = false ;
      cmbMnuSit.setName( cmbMnuSit.getInternalname() );
      cmbMnuSit.setValue( httpContext.cgiGet( cmbMnuSit.getInternalname()) );
      A14294MnuSit = httpContext.cgiGet( cmbMnuSit.getInternalname()) ;
      GXCCtl = "Z946MnuOp_" + sGXsfl_32_idx ;
      Z946MnuOp = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z947MnuPgm_" + sGXsfl_32_idx ;
      Z947MnuPgm = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z948MnuPgmTpo_" + sGXsfl_32_idx ;
      Z948MnuPgmTpo = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14293MnuIcon_" + sGXsfl_32_idx ;
      Z14293MnuIcon = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14294MnuSit_" + sGXsfl_32_idx ;
      Z14294MnuSit = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z949MnuPgmTxt_" + sGXsfl_32_idx ;
      Z949MnuPgmTxt = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z14286MnuPgmWeb_" + sGXsfl_32_idx ;
      Z14286MnuPgmWeb = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_125_" + sGXsfl_32_idx ;
      nRcdDeleted_125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_125_" + sGXsfl_32_idx ;
      nRcdExists_125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_125_" + sGXsfl_32_idx ;
      nIsMod_125 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMnuPgmTxt_Enabled = edtMnuPgmTxt_Enabled ;
      defedtMnuPgmTpo_Enabled = edtMnuPgmTpo_Enabled ;
      defedtMnuPgm_Enabled = edtMnuPgm_Enabled ;
      defedtMnuOp_Enabled = edtMnuOp_Enabled ;
   }

   public void confirmValues1UH0( )
   {
      nGXsfl_32_idx = 0 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_32125( ) ;
      while ( nGXsfl_32_idx < nRC_GXsfl_32 )
      {
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32125( ) ;
         httpContext.changePostValue( "Z946MnuOp_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z946MnuOp_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z946MnuOp_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z947MnuPgm_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z947MnuPgm_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z947MnuPgm_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z948MnuPgmTpo_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z948MnuPgmTpo_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14293MnuIcon_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14293MnuIcon_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14293MnuIcon_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14294MnuSit_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14294MnuSit_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14294MnuSit_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z949MnuPgmTxt_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z949MnuPgmTxt_"+sGXsfl_32_idx) ;
         httpContext.changePostValue( "Z14286MnuPgmWeb_"+sGXsfl_32_idx, httpContext.cgiGet( "ZT_"+"Z14286MnuPgmWeb_"+sGXsfl_32_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z14286MnuPgmWeb_"+sGXsfl_32_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.menus.mnuop", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7MnuId))}, new String[] {"Gx_mode","MnuId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"MNUOP");
      forbiddenHiddens.add("MnuId", GXutil.rtrim( localUtil.format( A945MnuId, "@!")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("MnuTxt", GXutil.rtrim( localUtil.format( A951MnuTxt, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("menus\\mnuop:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z945MnuId", GXutil.rtrim( Z945MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z951MnuTxt", GXutil.rtrim( Z951MnuTxt));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nGXsfl_32_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMNUID", GXutil.rtrim( AV7MnuId));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMNUID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7MnuId, "@!"))));
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
      return formatLink("app.menus.mnuop", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7MnuId))}, new String[] {"Gx_mode","MnuId"})  ;
   }

   public String getPgmname( )
   {
      return "Menus.MNUOP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Opciones del Menu", "") ;
   }

   public void initializeNonKey1UH124( )
   {
      A951MnuTxt = "" ;
      n951MnuTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A951MnuTxt", A951MnuTxt);
      Z951MnuTxt = "" ;
   }

   public void initAll1UH124( )
   {
      A945MnuId = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A945MnuId", A945MnuId);
      initializeNonKey1UH124( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1UH125( )
   {
      A947MnuPgm = "" ;
      A948MnuPgmTpo = "" ;
      A14293MnuIcon = "" ;
      n14293MnuIcon = false ;
      A14294MnuSit = "" ;
      A949MnuPgmTxt = "" ;
      A14286MnuPgmWeb = "" ;
      Z947MnuPgm = "" ;
      Z948MnuPgmTpo = "" ;
      Z14293MnuIcon = "" ;
      Z14294MnuSit = "" ;
      Z949MnuPgmTxt = "" ;
      Z14286MnuPgmWeb = "" ;
   }

   public void initAll1UH125( )
   {
      A946MnuOp = (byte)(0) ;
      initializeNonKey1UH125( ) ;
   }

   public void standaloneModalInsert1UH125( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610385", true, true);
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
      httpContext.AddJavascriptSource("menus/mnuop.js", "?20268211610385", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties125( )
   {
      edtMnuPgmTxt_Enabled = defedtMnuPgmTxt_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTxt_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgmTpo_Enabled = defedtMnuPgmTpo_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgmTpo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgmTpo_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuPgm_Enabled = defedtMnuPgm_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuPgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuPgm_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      edtMnuOp_Enabled = defedtMnuOp_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMnuOp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMnuOp_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void startgridcontrol32( )
   {
      Gridlevel_opcionesContainer.AddObjectProperty("GridName", "Gridlevel_opciones");
      Gridlevel_opcionesContainer.AddObjectProperty("Header", subGridlevel_opciones_Header);
      Gridlevel_opcionesContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_opcionesContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_opcionesContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_opcionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_opcionesColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A946MnuOp, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_opcionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuOp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddColumnProperties(Gridlevel_opcionesColumn);
      Gridlevel_opcionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_opcionesColumn.AddObjectProperty("Value", GXutil.rtrim( A947MnuPgm));
      Gridlevel_opcionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgm_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddColumnProperties(Gridlevel_opcionesColumn);
      Gridlevel_opcionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_opcionesColumn.AddObjectProperty("Value", GXutil.rtrim( A948MnuPgmTpo));
      Gridlevel_opcionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTpo_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddColumnProperties(Gridlevel_opcionesColumn);
      Gridlevel_opcionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_opcionesColumn.AddObjectProperty("Value", GXutil.rtrim( A949MnuPgmTxt));
      Gridlevel_opcionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmTxt_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddColumnProperties(Gridlevel_opcionesColumn);
      Gridlevel_opcionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_opcionesColumn.AddObjectProperty("Value", A14286MnuPgmWeb);
      Gridlevel_opcionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuPgmWeb_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddColumnProperties(Gridlevel_opcionesColumn);
      Gridlevel_opcionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_opcionesColumn.AddObjectProperty("Value", A14293MnuIcon);
      Gridlevel_opcionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMnuIcon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddColumnProperties(Gridlevel_opcionesColumn);
      Gridlevel_opcionesColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_opcionesColumn.AddObjectProperty("Value", GXutil.rtrim( A14294MnuSit));
      Gridlevel_opcionesColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbMnuSit.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddColumnProperties(Gridlevel_opcionesColumn);
      Gridlevel_opcionesContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_opcionesContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_opciones_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtMnuId_Internalname = "MNUID" ;
      edtMnuTxt_Internalname = "MNUTXT" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMnuOp_Internalname = "MNUOP" ;
      edtMnuPgm_Internalname = "MNUPGM" ;
      edtMnuPgmTpo_Internalname = "MNUPGMTPO" ;
      edtMnuPgmTxt_Internalname = "MNUPGMTXT" ;
      edtMnuPgmWeb_Internalname = "MNUPGMWEB" ;
      edtMnuIcon_Internalname = "MNUICON" ;
      cmbMnuSit.setInternalname( "MNUSIT" );
      divTableleaflevel_opciones_Internalname = "TABLELEAFLEVEL_OPCIONES" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_opciones_Internalname = "GRIDLEVEL_OPCIONES" ;
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
      subGridlevel_opciones_Allowcollapsing = (byte)(0) ;
      subGridlevel_opciones_Allowselection = (byte)(0) ;
      subGridlevel_opciones_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Opciones del Menu", "") );
      cmbMnuSit.setJsonclick( "" );
      edtMnuIcon_Jsonclick = "" ;
      edtMnuPgmWeb_Jsonclick = "" ;
      edtMnuPgmTxt_Jsonclick = "" ;
      edtMnuPgmTpo_Jsonclick = "" ;
      edtMnuPgm_Jsonclick = "" ;
      edtMnuOp_Jsonclick = "" ;
      subGridlevel_opciones_Class = "GridNoBorder WorkWith" ;
      subGridlevel_opciones_Backcolorstyle = (byte)(0) ;
      cmbMnuSit.setEnabled( 1 );
      edtMnuIcon_Enabled = 1 ;
      edtMnuPgmWeb_Enabled = 1 ;
      edtMnuPgmTxt_Enabled = 0 ;
      edtMnuPgmTpo_Enabled = 0 ;
      edtMnuPgm_Enabled = 0 ;
      edtMnuOp_Enabled = 0 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtMnuTxt_Jsonclick = "" ;
      edtMnuTxt_Enabled = 0 ;
      edtMnuId_Jsonclick = "" ;
      edtMnuId_Enabled = 0 ;
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

   public void gxnrgridlevel_opciones_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_32125( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1UH125( ) ;
         standaloneModal1UH125( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1UH125( ) ;
         nGXsfl_32_idx = (int)(nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_32125( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_opcionesContainer)) ;
      /* End function gxnrGridlevel_opciones_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "MNUSIT_" + sGXsfl_32_idx ;
      cmbMnuSit.setName( GXCCtl );
      cmbMnuSit.setWebtags( "" );
      cmbMnuSit.addItem("T", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbMnuSit.addItem("F", httpContext.getMessage( "Inactivo", ""), (short)(0));
      if ( cmbMnuSit.getItemCount() > 0 )
      {
         A14294MnuSit = cmbMnuSit.getValidValue(A14294MnuSit) ;
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7MnuId',fld:'vMNUID',pic:'@!',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7MnuId',fld:'vMNUID',pic:'@!',hsh:true},{av:'A945MnuId',fld:'MNUID',pic:'@!'},{av:'A951MnuTxt',fld:'MNUTXT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UH2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MNUID","{handler:'valid_Mnuid',iparms:[]");
      setEventMetadata("VALID_MNUID",",oparms:[]}");
      setEventMetadata("VALID_MNUOP","{handler:'valid_Mnuop',iparms:[]");
      setEventMetadata("VALID_MNUOP",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Mnusit',iparms:[]");
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
      wcpOAV7MnuId = "" ;
      Z945MnuId = "" ;
      Z951MnuTxt = "" ;
      Z947MnuPgm = "" ;
      Z948MnuPgmTpo = "" ;
      Z14293MnuIcon = "" ;
      Z14294MnuSit = "" ;
      Z949MnuPgmTxt = "" ;
      Z14286MnuPgmWeb = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV7MnuId = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A945MnuId = "" ;
      A951MnuTxt = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV15Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_opcionesContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode125 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode124 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      A947MnuPgm = "" ;
      A948MnuPgmTpo = "" ;
      A949MnuPgmTxt = "" ;
      A14286MnuPgmWeb = "" ;
      A14293MnuIcon = "" ;
      A14294MnuSit = "" ;
      AV11Station = "" ;
      GXt_char1 = "" ;
      AV12EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV8WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV9TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV10WebSession = httpContext.getWebSession();
      T01UH6_A945MnuId = new String[] {""} ;
      T01UH6_A951MnuTxt = new String[] {""} ;
      T01UH6_n951MnuTxt = new boolean[] {false} ;
      T01UH7_A945MnuId = new String[] {""} ;
      T01UH5_A945MnuId = new String[] {""} ;
      T01UH5_A951MnuTxt = new String[] {""} ;
      T01UH5_n951MnuTxt = new boolean[] {false} ;
      T01UH8_A945MnuId = new String[] {""} ;
      T01UH9_A945MnuId = new String[] {""} ;
      T01UH4_A945MnuId = new String[] {""} ;
      T01UH4_A951MnuTxt = new String[] {""} ;
      T01UH4_n951MnuTxt = new boolean[] {false} ;
      T01UH13_A945MnuId = new String[] {""} ;
      T01UH14_A945MnuId = new String[] {""} ;
      T01UH14_A946MnuOp = new byte[1] ;
      T01UH14_A947MnuPgm = new String[] {""} ;
      T01UH14_A948MnuPgmTpo = new String[] {""} ;
      T01UH14_A14293MnuIcon = new String[] {""} ;
      T01UH14_n14293MnuIcon = new boolean[] {false} ;
      T01UH14_A14294MnuSit = new String[] {""} ;
      T01UH14_A949MnuPgmTxt = new String[] {""} ;
      T01UH14_A14286MnuPgmWeb = new String[] {""} ;
      T01UH15_A945MnuId = new String[] {""} ;
      T01UH15_A946MnuOp = new byte[1] ;
      T01UH3_A945MnuId = new String[] {""} ;
      T01UH3_A946MnuOp = new byte[1] ;
      T01UH3_A947MnuPgm = new String[] {""} ;
      T01UH3_A948MnuPgmTpo = new String[] {""} ;
      T01UH3_A14293MnuIcon = new String[] {""} ;
      T01UH3_n14293MnuIcon = new boolean[] {false} ;
      T01UH3_A14294MnuSit = new String[] {""} ;
      T01UH3_A949MnuPgmTxt = new String[] {""} ;
      T01UH3_A14286MnuPgmWeb = new String[] {""} ;
      T01UH2_A945MnuId = new String[] {""} ;
      T01UH2_A946MnuOp = new byte[1] ;
      T01UH2_A947MnuPgm = new String[] {""} ;
      T01UH2_A948MnuPgmTpo = new String[] {""} ;
      T01UH2_A14293MnuIcon = new String[] {""} ;
      T01UH2_n14293MnuIcon = new boolean[] {false} ;
      T01UH2_A14294MnuSit = new String[] {""} ;
      T01UH2_A949MnuPgmTxt = new String[] {""} ;
      T01UH2_A14286MnuPgmWeb = new String[] {""} ;
      T01UH19_A945MnuId = new String[] {""} ;
      T01UH19_A946MnuOp = new byte[1] ;
      T01UH19_A943GrpId = new String[] {""} ;
      T01UH20_A945MnuId = new String[] {""} ;
      T01UH20_A946MnuOp = new byte[1] ;
      Gridlevel_opcionesRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_opciones_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_opcionesColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.menus.mnuop__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.menus.mnuop__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.menus.mnuop__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.menus.mnuop__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.menus.mnuop__default(),
         new Object[] {
             new Object[] {
            T01UH2_A945MnuId, T01UH2_A946MnuOp, T01UH2_A947MnuPgm, T01UH2_A948MnuPgmTpo, T01UH2_A14293MnuIcon, T01UH2_n14293MnuIcon, T01UH2_A14294MnuSit, T01UH2_A949MnuPgmTxt, T01UH2_A14286MnuPgmWeb
            }
            , new Object[] {
            T01UH3_A945MnuId, T01UH3_A946MnuOp, T01UH3_A947MnuPgm, T01UH3_A948MnuPgmTpo, T01UH3_A14293MnuIcon, T01UH3_n14293MnuIcon, T01UH3_A14294MnuSit, T01UH3_A949MnuPgmTxt, T01UH3_A14286MnuPgmWeb
            }
            , new Object[] {
            T01UH4_A945MnuId, T01UH4_A951MnuTxt, T01UH4_n951MnuTxt
            }
            , new Object[] {
            T01UH5_A945MnuId, T01UH5_A951MnuTxt, T01UH5_n951MnuTxt
            }
            , new Object[] {
            T01UH6_A945MnuId, T01UH6_A951MnuTxt, T01UH6_n951MnuTxt
            }
            , new Object[] {
            T01UH7_A945MnuId
            }
            , new Object[] {
            T01UH8_A945MnuId
            }
            , new Object[] {
            T01UH9_A945MnuId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UH13_A945MnuId
            }
            , new Object[] {
            T01UH14_A945MnuId, T01UH14_A946MnuOp, T01UH14_A947MnuPgm, T01UH14_A948MnuPgmTpo, T01UH14_A14293MnuIcon, T01UH14_n14293MnuIcon, T01UH14_A14294MnuSit, T01UH14_A949MnuPgmTxt, T01UH14_A14286MnuPgmWeb
            }
            , new Object[] {
            T01UH15_A945MnuId, T01UH15_A946MnuOp
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UH19_A945MnuId, T01UH19_A946MnuOp, T01UH19_A943GrpId
            }
            , new Object[] {
            T01UH20_A945MnuId, T01UH20_A946MnuOp
            }
         }
      );
      AV15Pgmname = "Menus.MNUOP" ;
   }

   private byte Z946MnuOp ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A946MnuOp ;
   private byte Gx_BScreen ;
   private byte subGridlevel_opciones_Backcolorstyle ;
   private byte subGridlevel_opciones_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_opciones_Allowselection ;
   private byte subGridlevel_opciones_Allowhovering ;
   private byte subGridlevel_opciones_Allowcollapsing ;
   private byte subGridlevel_opciones_Collapsed ;
   private short nRcdDeleted_125 ;
   private short nRcdExists_125 ;
   private short nIsMod_125 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount125 ;
   private short RcdFound125 ;
   private short nBlankRcdUsr125 ;
   private short RcdFound124 ;
   private short nIsDirty_124 ;
   private short nIsDirty_125 ;
   private int nRC_GXsfl_32 ;
   private int nGXsfl_32_idx=1 ;
   private int trnEnded ;
   private int edtMnuId_Enabled ;
   private int edtMnuTxt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtMnuOp_Enabled ;
   private int edtMnuPgm_Enabled ;
   private int edtMnuPgmTpo_Enabled ;
   private int edtMnuPgmTxt_Enabled ;
   private int edtMnuPgmWeb_Enabled ;
   private int edtMnuIcon_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_opciones_Backcolor ;
   private int subGridlevel_opciones_Allbackcolor ;
   private int defedtMnuPgmTxt_Enabled ;
   private int defedtMnuPgmTpo_Enabled ;
   private int defedtMnuPgm_Enabled ;
   private int defedtMnuOp_Enabled ;
   private int idxLst ;
   private int subGridlevel_opciones_Selectedindex ;
   private int subGridlevel_opciones_Selectioncolor ;
   private int subGridlevel_opciones_Hoveringcolor ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7MnuId ;
   private String Z945MnuId ;
   private String Z951MnuTxt ;
   private String Z947MnuPgm ;
   private String Z948MnuPgmTpo ;
   private String Z14294MnuSit ;
   private String Z949MnuPgmTxt ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV7MnuId ;
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
   private String edtMnuId_Internalname ;
   private String A945MnuId ;
   private String edtMnuId_Jsonclick ;
   private String edtMnuTxt_Internalname ;
   private String A951MnuTxt ;
   private String edtMnuTxt_Jsonclick ;
   private String divTableleaflevel_opciones_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV15Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode125 ;
   private String edtMnuOp_Internalname ;
   private String edtMnuPgm_Internalname ;
   private String edtMnuPgmTpo_Internalname ;
   private String edtMnuPgmTxt_Internalname ;
   private String edtMnuPgmWeb_Internalname ;
   private String edtMnuIcon_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_opciones_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode124 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String A947MnuPgm ;
   private String A948MnuPgmTpo ;
   private String A949MnuPgmTxt ;
   private String A14294MnuSit ;
   private String AV11Station ;
   private String GXt_char1 ;
   private String AV12EmprCod ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGridlevel_opciones_Class ;
   private String subGridlevel_opciones_Linesclass ;
   private String ROClassString ;
   private String edtMnuOp_Jsonclick ;
   private String edtMnuPgm_Jsonclick ;
   private String edtMnuPgmTpo_Jsonclick ;
   private String edtMnuPgmTxt_Jsonclick ;
   private String edtMnuPgmWeb_Jsonclick ;
   private String edtMnuIcon_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_opciones_Header ;
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
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n951MnuTxt ;
   private boolean returnInSub ;
   private boolean n14293MnuIcon ;
   private boolean Gx_longc ;
   private String Z14293MnuIcon ;
   private String Z14286MnuPgmWeb ;
   private String A14286MnuPgmWeb ;
   private String A14293MnuIcon ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_opcionesContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_opcionesRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_opcionesColumn ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbMnuSit ;
   private IDataStoreProvider pr_default ;
   private String[] T01UH6_A945MnuId ;
   private String[] T01UH6_A951MnuTxt ;
   private boolean[] T01UH6_n951MnuTxt ;
   private String[] T01UH7_A945MnuId ;
   private String[] T01UH5_A945MnuId ;
   private String[] T01UH5_A951MnuTxt ;
   private boolean[] T01UH5_n951MnuTxt ;
   private String[] T01UH8_A945MnuId ;
   private String[] T01UH9_A945MnuId ;
   private String[] T01UH4_A945MnuId ;
   private String[] T01UH4_A951MnuTxt ;
   private boolean[] T01UH4_n951MnuTxt ;
   private String[] T01UH13_A945MnuId ;
   private String[] T01UH14_A945MnuId ;
   private byte[] T01UH14_A946MnuOp ;
   private String[] T01UH14_A947MnuPgm ;
   private String[] T01UH14_A948MnuPgmTpo ;
   private String[] T01UH14_A14293MnuIcon ;
   private boolean[] T01UH14_n14293MnuIcon ;
   private String[] T01UH14_A14294MnuSit ;
   private String[] T01UH14_A949MnuPgmTxt ;
   private String[] T01UH14_A14286MnuPgmWeb ;
   private String[] T01UH15_A945MnuId ;
   private byte[] T01UH15_A946MnuOp ;
   private String[] T01UH3_A945MnuId ;
   private byte[] T01UH3_A946MnuOp ;
   private String[] T01UH3_A947MnuPgm ;
   private String[] T01UH3_A948MnuPgmTpo ;
   private String[] T01UH3_A14293MnuIcon ;
   private boolean[] T01UH3_n14293MnuIcon ;
   private String[] T01UH3_A14294MnuSit ;
   private String[] T01UH3_A949MnuPgmTxt ;
   private String[] T01UH3_A14286MnuPgmWeb ;
   private String[] T01UH2_A945MnuId ;
   private byte[] T01UH2_A946MnuOp ;
   private String[] T01UH2_A947MnuPgm ;
   private String[] T01UH2_A948MnuPgmTpo ;
   private String[] T01UH2_A14293MnuIcon ;
   private boolean[] T01UH2_n14293MnuIcon ;
   private String[] T01UH2_A14294MnuSit ;
   private String[] T01UH2_A949MnuPgmTxt ;
   private String[] T01UH2_A14286MnuPgmWeb ;
   private String[] T01UH19_A945MnuId ;
   private byte[] T01UH19_A946MnuOp ;
   private String[] T01UH19_A943GrpId ;
   private String[] T01UH20_A945MnuId ;
   private byte[] T01UH20_A946MnuOp ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV8WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV9TrnContext ;
}

final  class mnuop__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mnuop__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mnuop__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mnuop__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class mnuop__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UH2", "SELECT MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuIcon, MnuSit, MnuPgmTxt, MnuPgmWeb FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ?  FOR UPDATE OF MnuPgm, MnuPgmTpo, MnuIcon, MnuSit, MnuPgmTxt, MnuPgmWeb NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH3", "SELECT MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuIcon, MnuSit, MnuPgmTxt, MnuPgmWeb FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH4", "SELECT MnuId, MnuTxt FROM TXPMNUCAB WHERE MnuId = ?  FOR UPDATE OF MnuTxt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH5", "SELECT MnuId, MnuTxt FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH6", "SELECT /*+ FIRST_ROWS(100) */ TM1.MnuId, TM1.MnuTxt FROM TXPMNUCAB TM1 WHERE TM1.MnuId = ? ORDER BY TM1.MnuId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH7", "SELECT /*+ FIRST_ROWS(1) */ MnuId FROM TXPMNUCAB WHERE MnuId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MnuId FROM TXPMNUCAB WHERE ( MnuId > ?) ORDER BY MnuId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UH9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ MnuId FROM TXPMNUCAB WHERE ( MnuId < ?) ORDER BY MnuId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UH10", "INSERT INTO TXPMNUCAB(MnuId, MnuTxt) VALUES(?, ?)", GX_NOMASK, "TXPMNUCAB")
         ,new UpdateCursor("T01UH11", "UPDATE TXPMNUCAB SET MnuTxt=?  WHERE MnuId = ?", GX_NOMASK, "TXPMNUCAB")
         ,new UpdateCursor("T01UH12", "DELETE FROM TXPMNUCAB  WHERE MnuId = ?", GX_NOMASK, "TXPMNUCAB")
         ,new ForEachCursor("T01UH13", "SELECT /*+ FIRST_ROWS(100) */ MnuId FROM TXPMNUCAB ORDER BY MnuId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH14", "SELECT MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuIcon, MnuSit, MnuPgmTxt, MnuPgmWeb FROM TXPMNUOP WHERE MnuId = ? and MnuOp = ? ORDER BY MnuId, MnuOp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UH15", "SELECT MnuId, MnuOp FROM TXPMNUOP WHERE MnuId = ? AND MnuOp = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01UH16", "INSERT INTO TXPMNUOP(MnuId, MnuOp, MnuPgm, MnuPgmTpo, MnuIcon, MnuSit, MnuPgmTxt, MnuPgmWeb) VALUES(?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("T01UH17", "UPDATE TXPMNUOP SET MnuPgm=?, MnuPgmTpo=?, MnuIcon=?, MnuSit=?, MnuPgmTxt=?, MnuPgmWeb=?  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new UpdateCursor("T01UH18", "DELETE FROM TXPMNUOP  WHERE MnuId = ? AND MnuOp = ?", GX_NOMASK, "TXPMNUOP")
         ,new ForEachCursor("T01UH19", "SELECT * FROM (SELECT MnuId, MnuOp, GrpId FROM TXPOPCGRU WHERE MnuId = ? AND MnuOp = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UH20", "SELECT MnuId, MnuOp FROM TXPMNUOP WHERE MnuId = ? ORDER BY MnuId, MnuOp ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getVarchar(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 30);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 10);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
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
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 8);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               return;
            case 9 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 30);
               }
               stmt.setString(2, (String)parms[2], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 1);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 100);
               }
               stmt.setString(6, (String)parms[6], 1);
               stmt.setString(7, (String)parms[7], 30);
               stmt.setVarchar(8, (String)parms[8], 200, false);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 1);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               stmt.setString(4, (String)parms[4], 1);
               stmt.setString(5, (String)parms[5], 30);
               stmt.setVarchar(6, (String)parms[6], 200, false);
               stmt.setString(7, (String)parms[7], 8);
               stmt.setByte(8, ((Number) parms[8]).byteValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 8);
               return;
      }
   }

}

