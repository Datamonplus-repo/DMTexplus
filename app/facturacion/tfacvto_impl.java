package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tfacvto_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_lineas") == 0 )
      {
         gxnrgridlevel_lineas_newrow_invoke( ) ;
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
            AV27EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
            AV28FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28FacCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FacCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "VENCIMIENTOS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgridlevel_lineas_newrow_invoke( )
   {
      nRC_GXsfl_28 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_28"))) ;
      nGXsfl_28_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_28_idx"))) ;
      sGXsfl_28_idx = httpContext.GetPar( "sGXsfl_28_idx") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_lineas_newrow( ) ;
      /* End function gxnrGridlevel_lineas_newrow_invoke */
   }

   public tfacvto_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tfacvto_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tfacvto_impl.class ));
   }

   public tfacvto_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtFacCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFacCod_Internalname, httpContext.getMessage( "Nº Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFacCod_Internalname, GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFacCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtFacCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\TFACVTO.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_lineas_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_lineas( ) ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group TrnActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACVTO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACVTO.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\TFACVTO.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV32Pgmname), GXutil.rtrim( localUtil.format( AV32Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\TFACVTO.htm");
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

   public void gxdraw_gridlevel_lineas( )
   {
      /*  Grid Control  */
      startgridcontrol28( ) ;
      nGXsfl_28_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount129 = (short)(2) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_129 = (short)(1) ;
            scanStart33129( ) ;
            while ( RcdFound129 != 0 )
            {
               init_level_properties129( ) ;
               getByPrimaryKey33129( ) ;
               addRow33129( ) ;
               scanNext33129( ) ;
            }
            scanEnd33129( ) ;
            nBlankRcdCount129 = (short)(2) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal33129( ) ;
         standaloneModal33129( ) ;
         sMode129 = Gx_mode ;
         while ( nGXsfl_28_idx < nRC_GXsfl_28 )
         {
            bGXsfl_28_Refreshing = true ;
            readRow33129( ) ;
            edtFacVtoLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACVTOLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacVtoLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtFacVtoFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACVTOFCH_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacVtoFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoFch_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            edtFacVtoImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACVTOIMP_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFacVtoImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoImp_Enabled), 5, 0), !bGXsfl_28_Refreshing);
            if ( ( nRcdExists_129 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal33129( ) ;
            }
            sendRow33129( ) ;
            bGXsfl_28_Refreshing = false ;
         }
         Gx_mode = sMode129 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount129 = (short)(2) ;
         nRcdExists_129 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart33129( ) ;
            while ( RcdFound129 != 0 )
            {
               sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_28129( ) ;
               init_level_properties129( ) ;
               standaloneNotModal33129( ) ;
               getByPrimaryKey33129( ) ;
               standaloneModal33129( ) ;
               addRow33129( ) ;
               scanNext33129( ) ;
            }
            scanEnd33129( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode129 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_28129( ) ;
         initAll33129( ) ;
         init_level_properties129( ) ;
         nRcdExists_129 = (short)(0) ;
         nIsMod_129 = (short)(0) ;
         nRcdDeleted_129 = (short)(0) ;
         nBlankRcdCount129 = (short)(nBlankRcdUsr129+nBlankRcdCount129) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount129 > 0 )
         {
            standaloneNotModal33129( ) ;
            standaloneModal33129( ) ;
            addRow33129( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtFacVtoLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount129 = (short)(nBlankRcdCount129-1) ;
         }
         Gx_mode = sMode129 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_lineasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_lineas", Gridlevel_lineasContainer, subGridlevel_lineas_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lineasContainerData", Gridlevel_lineasContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_lineasContainerData"+"V", Gridlevel_lineasContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_lineasContainerData"+"V"+"\" value='"+Gridlevel_lineasContainer.GridValuesHidden()+"'/>") ;
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
      e11332 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z430FacCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_28 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_28"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV27EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV28FacCod = (int)(localUtil.ctol( httpContext.cgiGet( "vFACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A959FacVtoTip = httpContext.cgiGet( "FACVTOTIP") ;
            n959FacVtoTip = false ;
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
            Dvpanel_tableattributes_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FACCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A430FacCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            }
            else
            {
               A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            }
            AV32Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TFACVTO");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A430FacCod != Z430FacCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("facturacion\\tfacvto:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A430FacCod = (int)(GXutil.lval( httpContext.GetPar( "FacCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
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
                  sMode43 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode43 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound43 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_330( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "FACCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacCod_Internalname ;
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
                        e11332 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12332 ();
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
         e12332 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll3343( ) ;
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
         disableAttributes3343( ) ;
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

   public void confirm_330( )
   {
      beforeValidate3343( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls3343( ) ;
         }
         else
         {
            checkExtendedTable3343( ) ;
            closeExtendedTableCursors3343( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode43 = Gx_mode ;
         confirm_33129( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode43 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_33129( )
   {
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow33129( ) ;
         if ( ( nRcdExists_129 != 0 ) || ( nIsMod_129 != 0 ) )
         {
            getKey33129( ) ;
            if ( ( nRcdExists_129 == 0 ) && ( nRcdDeleted_129 == 0 ) )
            {
               if ( RcdFound129 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate33129( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable33129( ) ;
                     closeExtendedTableCursors33129( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "FACVTOLIN_" + sGXsfl_28_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFacVtoLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound129 != 0 )
               {
                  if ( nRcdDeleted_129 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey33129( ) ;
                     load33129( ) ;
                     beforeValidate33129( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls33129( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_129 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate33129( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable33129( ) ;
                           closeExtendedTableCursors33129( ) ;
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
                  if ( nRcdDeleted_129 == 0 )
                  {
                     GXCCtl = "FACVTOLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacVtoLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFacVtoLin_Internalname, GXutil.ltrim( localUtil.ntoc( A956FacVtoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacVtoFch_Internalname, localUtil.format(A957FacVtoFch, "99/99/99")) ;
         httpContext.changePostValue( edtFacVtoImp_Internalname, GXutil.ltrim( localUtil.ntoc( A958FacVtoImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z956FacVtoLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z956FacVtoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z957FacVtoFch_"+sGXsfl_28_idx, localUtil.dtoc( Z957FacVtoFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z958FacVtoImp_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z958FacVtoImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z959FacVtoTip_"+sGXsfl_28_idx, GXutil.rtrim( Z959FacVtoTip)) ;
         httpContext.changePostValue( "nRcdDeleted_129_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_129_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_129_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_129 != 0 )
         {
            httpContext.changePostValue( "FACVTOLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACVTOFCH_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACVTOIMP_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption330( )
   {
   }

   public void e11332( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV24Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tfacvto_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char2[0] = AV27EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char2, GXv_char3, GXv_char4) ;
      tfacvto_impl.this.AV27EmprCod = GXv_char2[0] ;
      tfacvto_impl.this.AV25EmprNom = GXv_char3[0] ;
      tfacvto_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_char1 = AV24Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tfacvto_impl.this.GXt_char1 = GXv_char4[0] ;
      AV24Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Station", AV24Station);
      GXv_char4[0] = AV27EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV24Station, GXv_char4, GXv_char3, GXv_char2) ;
      tfacvto_impl.this.AV27EmprCod = GXv_char4[0] ;
      tfacvto_impl.this.AV25EmprNom = GXv_char3[0] ;
      tfacvto_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27EmprCod", AV27EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprNom", AV25EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV29WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV29WWPContext = GXv_SdtWWPContext5[0] ;
      AV30TrnContext.fromxml(AV31WebSession.getValue("TrnContext"), null, null);
   }

   public void e12332( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV30TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.facturacion.tfacvtoww", new String[] {}, new String[] {}) );
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

   public void zm3343( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -6 )
      {
         Z430FacCod = A430FacCod ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV32Pgmname = "Facturacion.TFACVTO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Pgmname", AV32Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV27EmprCod)==0) )
      {
         A396EmprCod = AV27EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00336 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00336_A407EmprNom[0] ;
      n407EmprNom = T00336_n407EmprNom[0] ;
      pr_default.close(4);
      if ( ! (0==AV28FacCod) )
      {
         A430FacCod = AV28FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      if ( ! (0==AV28FacCod) )
      {
         edtFacCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFacCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV28FacCod) )
      {
         edtFacCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
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

   public void load3343( )
   {
      /* Using cursor T00337 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A407EmprNom = T00337_A407EmprNom[0] ;
         n407EmprNom = T00337_n407EmprNom[0] ;
         zm3343( -6) ;
      }
      pr_default.close(5);
      onLoadActions3343( ) ;
   }

   public void onLoadActions3343( )
   {
   }

   public void checkExtendedTable3343( )
   {
      nIsDirty_43 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors3343( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey3343( )
   {
      /* Using cursor T00338 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound43 = (short)(1) ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00335 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         zm3343( 6) ;
         RcdFound43 = (short)(1) ;
         A430FacCod = T00335_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         A396EmprCod = T00335_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z430FacCod = A430FacCod ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load3343( ) ;
         if ( AnyError == 1 )
         {
            RcdFound43 = (short)(0) ;
            initializeNonKey3343( ) ;
         }
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound43 = (short)(0) ;
         initializeNonKey3343( ) ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(3);
   }

   public void getEqualNoModal( )
   {
      getKey3343( ) ;
      if ( RcdFound43 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T00339 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00339_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T00339_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00339_A430FacCod[0] < A430FacCod ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00339_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T00339_A396EmprCod[0], A396EmprCod) == 0 ) && ( T00339_A430FacCod[0] > A430FacCod ) ) )
         {
            A396EmprCod = T00339_A396EmprCod[0] ;
            A430FacCod = T00339_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T003310 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A430FacCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T003310_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T003310_A396EmprCod[0], A396EmprCod) == 0 ) && ( T003310_A430FacCod[0] > A430FacCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T003310_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T003310_A396EmprCod[0], A396EmprCod) == 0 ) && ( T003310_A430FacCod[0] < A430FacCod ) ) )
         {
            A396EmprCod = T003310_A396EmprCod[0] ;
            A430FacCod = T003310_A430FacCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey3343( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert3343( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound43 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A430FacCod = Z430FacCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "FACCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update3343( ) ;
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtFacCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert3343( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "FACCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtFacCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtFacCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert3343( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A430FacCod != Z430FacCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A430FacCod = Z430FacCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "FACCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFacCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency3343( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00334 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(2) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCFAVEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(2) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCFAVEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert3343( )
   {
      beforeValidate3343( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3343( ) ;
      }
      if ( AnyError == 0 )
      {
         zm3343( 0) ;
         checkOptimisticConcurrency3343( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm3343( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert3343( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003311 */
                  pr_default.execute(9, new Object[] {Integer.valueOf(A430FacCod), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
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
                        processLevel3343( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption330( ) ;
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
            load3343( ) ;
         }
         endLevel3343( ) ;
      }
      closeExtendedTableCursors3343( ) ;
   }

   public void update3343( )
   {
      beforeValidate3343( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable3343( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency3343( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm3343( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate3343( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCFAVEN */
                  deferredUpdate3343( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel3343( ) ;
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
         endLevel3343( ) ;
      }
      closeExtendedTableCursors3343( ) ;
   }

   public void deferredUpdate3343( )
   {
   }

   public void delete( )
   {
      beforeValidate3343( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency3343( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls3343( ) ;
         afterConfirm3343( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete3343( ) ;
            if ( AnyError == 0 )
            {
               scanStart33129( ) ;
               while ( RcdFound129 != 0 )
               {
                  getByPrimaryKey33129( ) ;
                  delete33129( ) ;
                  scanNext33129( ) ;
               }
               scanEnd33129( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003312 */
                  pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCFAVEN");
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
      sMode43 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel3343( ) ;
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls3343( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
      if ( AnyError == 0 )
      {
         /* Using cursor T003313 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LFAVEN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void processNestedLevel33129( )
   {
      nGXsfl_28_idx = 0 ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         readRow33129( ) ;
         if ( ( nRcdExists_129 != 0 ) || ( nIsMod_129 != 0 ) )
         {
            standaloneNotModal33129( ) ;
            getKey33129( ) ;
            if ( ( nRcdExists_129 == 0 ) && ( nRcdDeleted_129 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert33129( ) ;
            }
            else
            {
               if ( RcdFound129 != 0 )
               {
                  if ( ( nRcdDeleted_129 != 0 ) && ( nRcdExists_129 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete33129( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_129 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update33129( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_129 == 0 )
                  {
                     GXCCtl = "FACVTOLIN_" + sGXsfl_28_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtFacVtoLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtFacVtoLin_Internalname, GXutil.ltrim( localUtil.ntoc( A956FacVtoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFacVtoFch_Internalname, localUtil.format(A957FacVtoFch, "99/99/99")) ;
         httpContext.changePostValue( edtFacVtoImp_Internalname, GXutil.ltrim( localUtil.ntoc( A958FacVtoImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z956FacVtoLin_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z956FacVtoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z957FacVtoFch_"+sGXsfl_28_idx, localUtil.dtoc( Z957FacVtoFch, 0, "/")) ;
         httpContext.changePostValue( "ZT_"+"Z958FacVtoImp_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( Z958FacVtoImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z959FacVtoTip_"+sGXsfl_28_idx, GXutil.rtrim( Z959FacVtoTip)) ;
         httpContext.changePostValue( "nRcdDeleted_129_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_129_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_129_"+sGXsfl_28_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_129 != 0 )
         {
            httpContext.changePostValue( "FACVTOLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACVTOFCH_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoFch_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FACVTOIMP_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoImp_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll33129( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_129 = (short)(0) ;
      nIsMod_129 = (short)(0) ;
      nRcdDeleted_129 = (short)(0) ;
   }

   public void processLevel3343( )
   {
      /* Save parent mode. */
      sMode43 = Gx_mode ;
      processNestedLevel33129( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel3343( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(2);
      }
      if ( AnyError == 0 )
      {
         beforeComplete3343( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "facturacion.tfacvto");
         if ( AnyError == 0 )
         {
            confirmValues330( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "facturacion.tfacvto");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart3343( )
   {
      /* Scan By routine */
      /* Using cursor T003314 */
      pr_default.execute(12);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T003314_A396EmprCod[0] ;
         A430FacCod = T003314_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext3343( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A396EmprCod = T003314_A396EmprCod[0] ;
         A430FacCod = T003314_A430FacCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      }
   }

   public void scanEnd3343( )
   {
      pr_default.close(12);
   }

   public void afterConfirm3343( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert3343( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate3343( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete3343( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete3343( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate3343( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes3343( )
   {
      edtFacCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacCod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm33129( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z957FacVtoFch = T00333_A957FacVtoFch[0] ;
            Z958FacVtoImp = T00333_A958FacVtoImp[0] ;
            Z959FacVtoTip = T00333_A959FacVtoTip[0] ;
         }
         else
         {
            Z957FacVtoFch = A957FacVtoFch ;
            Z958FacVtoImp = A958FacVtoImp ;
            Z959FacVtoTip = A959FacVtoTip ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z430FacCod = A430FacCod ;
         Z956FacVtoLin = A956FacVtoLin ;
         Z957FacVtoFch = A957FacVtoFch ;
         Z958FacVtoImp = A958FacVtoImp ;
         Z959FacVtoTip = A959FacVtoTip ;
         Z396EmprCod = A396EmprCod ;
      }
   }

   public void standaloneNotModal33129( )
   {
   }

   public void standaloneModal33129( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtFacVtoLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacVtoLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
      else
      {
         edtFacVtoLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFacVtoLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      }
   }

   public void load33129( )
   {
      /* Using cursor T003315 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin)});
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound129 = (short)(1) ;
         A957FacVtoFch = T003315_A957FacVtoFch[0] ;
         n957FacVtoFch = T003315_n957FacVtoFch[0] ;
         A958FacVtoImp = T003315_A958FacVtoImp[0] ;
         n958FacVtoImp = T003315_n958FacVtoImp[0] ;
         A959FacVtoTip = T003315_A959FacVtoTip[0] ;
         n959FacVtoTip = T003315_n959FacVtoTip[0] ;
         zm33129( -8) ;
      }
      pr_default.close(13);
      onLoadActions33129( ) ;
   }

   public void onLoadActions33129( )
   {
   }

   public void checkExtendedTable33129( )
   {
      nIsDirty_129 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal33129( ) ;
   }

   public void closeExtendedTableCursors33129( )
   {
   }

   public void enableDisable33129( )
   {
   }

   public void getKey33129( )
   {
      /* Using cursor T003316 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin)});
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound129 = (short)(1) ;
      }
      else
      {
         RcdFound129 = (short)(0) ;
      }
      pr_default.close(14);
   }

   public void getByPrimaryKey33129( )
   {
      /* Using cursor T00333 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm33129( 8) ;
         RcdFound129 = (short)(1) ;
         initializeNonKey33129( ) ;
         A956FacVtoLin = T00333_A956FacVtoLin[0] ;
         A957FacVtoFch = T00333_A957FacVtoFch[0] ;
         n957FacVtoFch = T00333_n957FacVtoFch[0] ;
         A958FacVtoImp = T00333_A958FacVtoImp[0] ;
         n958FacVtoImp = T00333_n958FacVtoImp[0] ;
         A959FacVtoTip = T00333_A959FacVtoTip[0] ;
         n959FacVtoTip = T00333_n959FacVtoTip[0] ;
         Z396EmprCod = A396EmprCod ;
         Z430FacCod = A430FacCod ;
         Z956FacVtoLin = A956FacVtoLin ;
         sMode129 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load33129( ) ;
         Gx_mode = sMode129 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound129 = (short)(0) ;
         initializeNonKey33129( ) ;
         sMode129 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal33129( ) ;
         Gx_mode = sMode129 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes33129( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency33129( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00332 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFACVTO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z957FacVtoFch), GXutil.resetTime(T00332_A957FacVtoFch[0])) ) || ( DecimalUtil.compareTo(Z958FacVtoImp, T00332_A958FacVtoImp[0]) != 0 ) || ( GXutil.strcmp(Z959FacVtoTip, T00332_A959FacVtoTip[0]) != 0 ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z957FacVtoFch), GXutil.resetTime(T00332_A957FacVtoFch[0])) ) )
            {
               GXutil.writeLogln("facturacion.tfacvto:[seudo value changed for attri]"+"FacVtoFch");
               GXutil.writeLogRaw("Old: ",Z957FacVtoFch);
               GXutil.writeLogRaw("Current: ",T00332_A957FacVtoFch[0]);
            }
            if ( DecimalUtil.compareTo(Z958FacVtoImp, T00332_A958FacVtoImp[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tfacvto:[seudo value changed for attri]"+"FacVtoImp");
               GXutil.writeLogRaw("Old: ",Z958FacVtoImp);
               GXutil.writeLogRaw("Current: ",T00332_A958FacVtoImp[0]);
            }
            if ( GXutil.strcmp(Z959FacVtoTip, T00332_A959FacVtoTip[0]) != 0 )
            {
               GXutil.writeLogln("facturacion.tfacvto:[seudo value changed for attri]"+"FacVtoTip");
               GXutil.writeLogRaw("Old: ",Z959FacVtoTip);
               GXutil.writeLogRaw("Current: ",T00332_A959FacVtoTip[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPFACVTO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert33129( )
   {
      beforeValidate33129( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable33129( ) ;
      }
      if ( AnyError == 0 )
      {
         zm33129( 0) ;
         checkOptimisticConcurrency33129( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm33129( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert33129( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T003317 */
                  pr_default.execute(15, new Object[] {Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin), Boolean.valueOf(n957FacVtoFch), A957FacVtoFch, Boolean.valueOf(n958FacVtoImp), A958FacVtoImp, Boolean.valueOf(n959FacVtoTip), A959FacVtoTip, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACVTO");
                  if ( (pr_default.getStatus(15) == 1) )
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
            load33129( ) ;
         }
         endLevel33129( ) ;
      }
      closeExtendedTableCursors33129( ) ;
   }

   public void update33129( )
   {
      beforeValidate33129( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable33129( ) ;
      }
      if ( ( nIsMod_129 != 0 ) || ( nIsDirty_129 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency33129( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm33129( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate33129( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T003318 */
                     pr_default.execute(16, new Object[] {Boolean.valueOf(n957FacVtoFch), A957FacVtoFch, Boolean.valueOf(n958FacVtoImp), A958FacVtoImp, Boolean.valueOf(n959FacVtoTip), A959FacVtoTip, A396EmprCod, Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACVTO");
                     if ( (pr_default.getStatus(16) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPFACVTO"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate33129( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey33129( ) ;
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
            endLevel33129( ) ;
         }
      }
      closeExtendedTableCursors33129( ) ;
   }

   public void deferredUpdate33129( )
   {
   }

   public void delete33129( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate33129( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency33129( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls33129( ) ;
         afterConfirm33129( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete33129( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T003319 */
               pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod), Byte.valueOf(A956FacVtoLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPFACVTO");
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
      sMode129 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel33129( ) ;
      Gx_mode = sMode129 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls33129( )
   {
      standaloneModal33129( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel33129( )
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

   public void scanStart33129( )
   {
      /* Scan By routine */
      /* Using cursor T003320 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A430FacCod)});
      RcdFound129 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound129 = (short)(1) ;
         A956FacVtoLin = T003320_A956FacVtoLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext33129( )
   {
      /* Scan next routine */
      pr_default.readNext(18);
      RcdFound129 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound129 = (short)(1) ;
         A956FacVtoLin = T003320_A956FacVtoLin[0] ;
      }
   }

   public void scanEnd33129( )
   {
      pr_default.close(18);
   }

   public void afterConfirm33129( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert33129( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate33129( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete33129( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete33129( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate33129( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes33129( )
   {
      edtFacVtoLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacVtoLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtFacVtoFch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacVtoFch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoFch_Enabled), 5, 0), !bGXsfl_28_Refreshing);
      edtFacVtoImp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacVtoImp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoImp_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void send_integrity_lvl_hashes33129( )
   {
   }

   public void send_integrity_lvl_hashes3343( )
   {
   }

   public void subsflControlProps_28129( )
   {
      edtFacVtoLin_Internalname = "FACVTOLIN_"+sGXsfl_28_idx ;
      edtFacVtoFch_Internalname = "FACVTOFCH_"+sGXsfl_28_idx ;
      edtFacVtoImp_Internalname = "FACVTOIMP_"+sGXsfl_28_idx ;
   }

   public void subsflControlProps_fel_28129( )
   {
      edtFacVtoLin_Internalname = "FACVTOLIN_"+sGXsfl_28_fel_idx ;
      edtFacVtoFch_Internalname = "FACVTOFCH_"+sGXsfl_28_fel_idx ;
      edtFacVtoImp_Internalname = "FACVTOIMP_"+sGXsfl_28_fel_idx ;
   }

   public void addRow33129( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28129( ) ;
      sendRow33129( ) ;
   }

   public void sendRow33129( )
   {
      Gridlevel_lineasRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_lineas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(0) ;
         subGridlevel_lineas_Backcolor = subGridlevel_lineas_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
         {
            subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
         }
         subGridlevel_lineas_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_lineas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_lineas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_28_idx) % (2))) == 0 )
         {
            subGridlevel_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
            {
               subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_lineas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_lineas_Class, "") != 0 )
            {
               subGridlevel_lineas_Linesclass = subGridlevel_lineas_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_129_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacVtoLin_Internalname,GXutil.ltrim( localUtil.ntoc( A956FacVtoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A956FacVtoLin), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacVtoLin_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacVtoLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_129_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacVtoFch_Internalname,localUtil.format(A957FacVtoFch, "99/99/99"),localUtil.format( A957FacVtoFch, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacVtoFch_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacVtoFch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_129_" + sGXsfl_28_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_28_idx + "',28)\"" ;
      ROClassString = "AttributeWidth100Porc" ;
      Gridlevel_lineasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacVtoImp_Internalname,GXutil.ltrim( localUtil.ntoc( A958FacVtoImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFacVtoImp_Enabled!=0) ? localUtil.format( A958FacVtoImp, "ZZZZZZZZZ9.99") : localUtil.format( A958FacVtoImp, "ZZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,31);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacVtoImp_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFacVtoImp_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      httpContext.ajax_sending_grid_row(Gridlevel_lineasRow);
      send_integrity_lvl_hashes33129( ) ;
      GXCCtl = "Z956FacVtoLin_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z956FacVtoLin, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z957FacVtoFch_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.dtoc( Z957FacVtoFch, 0, "/"));
      GXCCtl = "Z958FacVtoImp_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z958FacVtoImp, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z959FacVtoTip_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z959FacVtoTip));
      GXCCtl = "nRcdDeleted_129_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_129_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_129_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_129, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_28_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV30TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV30TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV27EmprCod));
      GXCCtl = "vFACCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV28FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "EMPRCOD_" + sGXsfl_28_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FACVTOLIN_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACVTOFCH_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACVTOIMP_"+sGXsfl_28_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_lineasContainer.AddRow(Gridlevel_lineasRow);
   }

   public void readRow33129( )
   {
      nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28129( ) ;
      edtFacVtoLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACVTOLIN_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacVtoFch_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACVTOFCH_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFacVtoImp_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FACVTOIMP_"+sGXsfl_28_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtFacVtoLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtFacVtoLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
      {
         GXCCtl = "FACVTOLIN_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacVtoLin_Internalname ;
         wbErr = true ;
         A956FacVtoLin = (byte)(0) ;
      }
      else
      {
         A956FacVtoLin = (byte)(localUtil.ctol( httpContext.cgiGet( edtFacVtoLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      if ( localUtil.vcdate( httpContext.cgiGet( edtFacVtoFch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
      {
         GXCCtl = "FACVTOFCH_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacVtoFch_Internalname ;
         wbErr = true ;
         A957FacVtoFch = GXutil.nullDate() ;
         n957FacVtoFch = false ;
      }
      else
      {
         A957FacVtoFch = localUtil.ctod( httpContext.cgiGet( edtFacVtoFch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
         n957FacVtoFch = false ;
      }
      if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacVtoImp_Internalname)), DecimalUtil.stringToDec("-999999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtFacVtoImp_Internalname)), DecimalUtil.stringToDec("9999999999.99")) > 0 ) ) )
      {
         GXCCtl = "FACVTOIMP_" + sGXsfl_28_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFacVtoImp_Internalname ;
         wbErr = true ;
         A958FacVtoImp = DecimalUtil.ZERO ;
         n958FacVtoImp = false ;
      }
      else
      {
         A958FacVtoImp = localUtil.ctond( httpContext.cgiGet( edtFacVtoImp_Internalname)) ;
         n958FacVtoImp = false ;
      }
      GXCCtl = "Z956FacVtoLin_" + sGXsfl_28_idx ;
      Z956FacVtoLin = (byte)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z957FacVtoFch_" + sGXsfl_28_idx ;
      Z957FacVtoFch = localUtil.ctod( httpContext.cgiGet( GXCCtl), 0) ;
      GXCCtl = "Z958FacVtoImp_" + sGXsfl_28_idx ;
      Z958FacVtoImp = localUtil.ctond( httpContext.cgiGet( GXCCtl)) ;
      GXCCtl = "Z959FacVtoTip_" + sGXsfl_28_idx ;
      Z959FacVtoTip = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z959FacVtoTip_" + sGXsfl_28_idx ;
      A959FacVtoTip = httpContext.cgiGet( GXCCtl) ;
      n959FacVtoTip = false ;
      GXCCtl = "nRcdDeleted_129_" + sGXsfl_28_idx ;
      nRcdDeleted_129 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_129_" + sGXsfl_28_idx ;
      nRcdExists_129 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_129_" + sGXsfl_28_idx ;
      nIsMod_129 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFacVtoLin_Enabled = edtFacVtoLin_Enabled ;
   }

   public void confirmValues330( )
   {
      nGXsfl_28_idx = 0 ;
      sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_28129( ) ;
      while ( nGXsfl_28_idx < nRC_GXsfl_28 )
      {
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28129( ) ;
         httpContext.changePostValue( "Z956FacVtoLin_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z956FacVtoLin_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z956FacVtoLin_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z957FacVtoFch_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z957FacVtoFch_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z957FacVtoFch_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z958FacVtoImp_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z958FacVtoImp_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z958FacVtoImp_"+sGXsfl_28_idx) ;
         httpContext.changePostValue( "Z959FacVtoTip_"+sGXsfl_28_idx, httpContext.cgiGet( "ZT_"+"Z959FacVtoTip_"+sGXsfl_28_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z959FacVtoTip_"+sGXsfl_28_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.tfacvto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV28FacCod,8,0))}, new String[] {"Gx_mode","EmprCod","FacCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TFACVTO");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\tfacvto:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z430FacCod", GXutil.ltrim( localUtil.ntoc( Z430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_28", GXutil.ltrim( localUtil.ntoc( nGXsfl_28_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV27EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFACCOD", GXutil.ltrim( localUtil.ntoc( AV28FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV28FacCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "FACVTOTIP", GXutil.rtrim( A959FacVtoTip));
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
      return formatLink("app.facturacion.tfacvto", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV27EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV28FacCod,8,0))}, new String[] {"Gx_mode","EmprCod","FacCod"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.TFACVTO" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "VENCIMIENTOS", "") ;
   }

   public void initializeNonKey3343( )
   {
   }

   public void initAll3343( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A430FacCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A430FacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A430FacCod), 8, 0));
      initializeNonKey3343( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey33129( )
   {
      A957FacVtoFch = GXutil.nullDate() ;
      n957FacVtoFch = false ;
      A958FacVtoImp = DecimalUtil.ZERO ;
      n958FacVtoImp = false ;
      A959FacVtoTip = "" ;
      n959FacVtoTip = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A959FacVtoTip", A959FacVtoTip);
      Z957FacVtoFch = GXutil.nullDate() ;
      Z958FacVtoImp = DecimalUtil.ZERO ;
      Z959FacVtoTip = "" ;
   }

   public void initAll33129( )
   {
      A956FacVtoLin = (byte)(0) ;
      initializeNonKey33129( ) ;
   }

   public void standaloneModalInsert33129( )
   {
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20269210534749", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("facturacion/tfacvto.js", "?20269210534749", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties129( )
   {
      edtFacVtoLin_Enabled = defedtFacVtoLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFacVtoLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFacVtoLin_Enabled), 5, 0), !bGXsfl_28_Refreshing);
   }

   public void startgridcontrol28( )
   {
      Gridlevel_lineasContainer.AddObjectProperty("GridName", "Gridlevel_lineas");
      Gridlevel_lineasContainer.AddObjectProperty("Header", subGridlevel_lineas_Header);
      Gridlevel_lineasContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_lineasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_lineasContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A956FacVtoLin, (byte)(2), (byte)(0), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", localUtil.format(A957FacVtoFch, "99/99/99"));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoFch_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_lineasColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A958FacVtoImp, (byte)(13), (byte)(2), ".", "")));
      Gridlevel_lineasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFacVtoImp_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddColumnProperties(Gridlevel_lineasColumn);
      Gridlevel_lineasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_lineasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_lineas_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtFacCod_Internalname = "FACCOD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtFacVtoLin_Internalname = "FACVTOLIN" ;
      edtFacVtoFch_Internalname = "FACVTOFCH" ;
      edtFacVtoImp_Internalname = "FACVTOIMP" ;
      divTableleaflevel_lineas_Internalname = "TABLELEAFLEVEL_LINEAS" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_lineas_Internalname = "GRIDLEVEL_LINEAS" ;
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
      subGridlevel_lineas_Allowcollapsing = (byte)(0) ;
      subGridlevel_lineas_Allowselection = (byte)(0) ;
      subGridlevel_lineas_Header = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "VENCIMIENTOS", "") );
      edtFacVtoImp_Jsonclick = "" ;
      edtFacVtoFch_Jsonclick = "" ;
      edtFacVtoLin_Jsonclick = "" ;
      subGridlevel_lineas_Class = "GridNoBorder WorkWith" ;
      subGridlevel_lineas_Backcolorstyle = (byte)(0) ;
      edtFacVtoImp_Enabled = 1 ;
      edtFacVtoFch_Enabled = 1 ;
      edtFacVtoLin_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFacCod_Jsonclick = "" ;
      edtFacCod_Enabled = 1 ;
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

   public void gxnrgridlevel_lineas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_28129( ) ;
      while ( nGXsfl_28_idx <= nRC_GXsfl_28 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal33129( ) ;
         standaloneModal33129( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow33129( ) ;
         nGXsfl_28_idx = (int)(nGXsfl_28_idx+1) ;
         sGXsfl_28_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_28_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_28129( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_lineasContainer)) ;
      /* End function gxnrGridlevel_lineas_newrow */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV28FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV27EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV28FacCod',fld:'vFACCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12332',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV30TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_FACCOD","{handler:'valid_Faccod',iparms:[]");
      setEventMetadata("VALID_FACCOD",",oparms:[]}");
      setEventMetadata("VALID_FACVTOLIN","{handler:'valid_Facvtolin',iparms:[]");
      setEventMetadata("VALID_FACVTOLIN",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Facvtoimp',iparms:[]");
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
      wcpOAV27EmprCod = "" ;
      Z396EmprCod = "" ;
      Z957FacVtoFch = GXutil.nullDate() ;
      Z958FacVtoImp = DecimalUtil.ZERO ;
      Z959FacVtoTip = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV27EmprCod = "" ;
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
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV32Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      Gridlevel_lineasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode129 = "" ;
      sStyleString = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A959FacVtoTip = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode43 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A957FacVtoFch = GXutil.nullDate() ;
      A958FacVtoImp = DecimalUtil.ZERO ;
      AV24Station = "" ;
      AV25EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV29WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV30TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV31WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T00336_A407EmprNom = new String[] {""} ;
      T00336_n407EmprNom = new boolean[] {false} ;
      T00337_A430FacCod = new int[1] ;
      T00337_A407EmprNom = new String[] {""} ;
      T00337_n407EmprNom = new boolean[] {false} ;
      T00337_A396EmprCod = new String[] {""} ;
      T00338_A396EmprCod = new String[] {""} ;
      T00338_A430FacCod = new int[1] ;
      T00335_A430FacCod = new int[1] ;
      T00335_A396EmprCod = new String[] {""} ;
      T00339_A396EmprCod = new String[] {""} ;
      T00339_A430FacCod = new int[1] ;
      T003310_A396EmprCod = new String[] {""} ;
      T003310_A430FacCod = new int[1] ;
      T00334_A430FacCod = new int[1] ;
      T00334_A396EmprCod = new String[] {""} ;
      T003313_A396EmprCod = new String[] {""} ;
      T003313_A430FacCod = new int[1] ;
      T003313_A446FacLin = new int[1] ;
      T003314_A396EmprCod = new String[] {""} ;
      T003314_A430FacCod = new int[1] ;
      T003315_A430FacCod = new int[1] ;
      T003315_A956FacVtoLin = new byte[1] ;
      T003315_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      T003315_n957FacVtoFch = new boolean[] {false} ;
      T003315_A958FacVtoImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T003315_n958FacVtoImp = new boolean[] {false} ;
      T003315_A959FacVtoTip = new String[] {""} ;
      T003315_n959FacVtoTip = new boolean[] {false} ;
      T003315_A396EmprCod = new String[] {""} ;
      T003316_A396EmprCod = new String[] {""} ;
      T003316_A430FacCod = new int[1] ;
      T003316_A956FacVtoLin = new byte[1] ;
      T00333_A430FacCod = new int[1] ;
      T00333_A956FacVtoLin = new byte[1] ;
      T00333_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00333_n957FacVtoFch = new boolean[] {false} ;
      T00333_A958FacVtoImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00333_n958FacVtoImp = new boolean[] {false} ;
      T00333_A959FacVtoTip = new String[] {""} ;
      T00333_n959FacVtoTip = new boolean[] {false} ;
      T00333_A396EmprCod = new String[] {""} ;
      T00332_A430FacCod = new int[1] ;
      T00332_A956FacVtoLin = new byte[1] ;
      T00332_A957FacVtoFch = new java.util.Date[] {GXutil.nullDate()} ;
      T00332_n957FacVtoFch = new boolean[] {false} ;
      T00332_A958FacVtoImp = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00332_n958FacVtoImp = new boolean[] {false} ;
      T00332_A959FacVtoTip = new String[] {""} ;
      T00332_n959FacVtoTip = new boolean[] {false} ;
      T00332_A396EmprCod = new String[] {""} ;
      T003320_A396EmprCod = new String[] {""} ;
      T003320_A430FacCod = new int[1] ;
      T003320_A956FacVtoLin = new byte[1] ;
      Gridlevel_lineasRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_lineas_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_lineasColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacvto__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacvto__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacvto__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacvto__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.tfacvto__default(),
         new Object[] {
             new Object[] {
            T00332_A430FacCod, T00332_A956FacVtoLin, T00332_A957FacVtoFch, T00332_n957FacVtoFch, T00332_A958FacVtoImp, T00332_n958FacVtoImp, T00332_A959FacVtoTip, T00332_n959FacVtoTip, T00332_A396EmprCod
            }
            , new Object[] {
            T00333_A430FacCod, T00333_A956FacVtoLin, T00333_A957FacVtoFch, T00333_n957FacVtoFch, T00333_A958FacVtoImp, T00333_n958FacVtoImp, T00333_A959FacVtoTip, T00333_n959FacVtoTip, T00333_A396EmprCod
            }
            , new Object[] {
            T00334_A430FacCod, T00334_A396EmprCod
            }
            , new Object[] {
            T00335_A430FacCod, T00335_A396EmprCod
            }
            , new Object[] {
            T00336_A407EmprNom, T00336_n407EmprNom
            }
            , new Object[] {
            T00337_A430FacCod, T00337_A407EmprNom, T00337_n407EmprNom, T00337_A396EmprCod
            }
            , new Object[] {
            T00338_A396EmprCod, T00338_A430FacCod
            }
            , new Object[] {
            T00339_A396EmprCod, T00339_A430FacCod
            }
            , new Object[] {
            T003310_A396EmprCod, T003310_A430FacCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T003313_A396EmprCod, T003313_A430FacCod, T003313_A446FacLin
            }
            , new Object[] {
            T003314_A396EmprCod, T003314_A430FacCod
            }
            , new Object[] {
            T003315_A430FacCod, T003315_A956FacVtoLin, T003315_A957FacVtoFch, T003315_n957FacVtoFch, T003315_A958FacVtoImp, T003315_n958FacVtoImp, T003315_A959FacVtoTip, T003315_n959FacVtoTip, T003315_A396EmprCod
            }
            , new Object[] {
            T003316_A396EmprCod, T003316_A430FacCod, T003316_A956FacVtoLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T003320_A396EmprCod, T003320_A430FacCod, T003320_A956FacVtoLin
            }
         }
      );
      AV32Pgmname = "Facturacion.TFACVTO" ;
   }

   private byte Z956FacVtoLin ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A956FacVtoLin ;
   private byte Gx_BScreen ;
   private byte subGridlevel_lineas_Backcolorstyle ;
   private byte subGridlevel_lineas_Backstyle ;
   private byte gxajaxcallmode ;
   private byte subGridlevel_lineas_Allowselection ;
   private byte subGridlevel_lineas_Allowhovering ;
   private byte subGridlevel_lineas_Allowcollapsing ;
   private byte subGridlevel_lineas_Collapsed ;
   private short nRcdDeleted_129 ;
   private short nRcdExists_129 ;
   private short nIsMod_129 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount129 ;
   private short RcdFound129 ;
   private short nBlankRcdUsr129 ;
   private short RcdFound43 ;
   private short nIsDirty_43 ;
   private short nIsDirty_129 ;
   private int wcpOAV28FacCod ;
   private int Z430FacCod ;
   private int nRC_GXsfl_28 ;
   private int nGXsfl_28_idx=1 ;
   private int AV28FacCod ;
   private int trnEnded ;
   private int A430FacCod ;
   private int edtFacCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtFacVtoLin_Enabled ;
   private int edtFacVtoFch_Enabled ;
   private int edtFacVtoImp_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_lineas_Backcolor ;
   private int subGridlevel_lineas_Allbackcolor ;
   private int defedtFacVtoLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_lineas_Selectedindex ;
   private int subGridlevel_lineas_Selectioncolor ;
   private int subGridlevel_lineas_Hoveringcolor ;
   private long GRIDLEVEL_LINEAS_nFirstRecordOnPage ;
   private java.math.BigDecimal Z958FacVtoImp ;
   private java.math.BigDecimal A958FacVtoImp ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV27EmprCod ;
   private String Z396EmprCod ;
   private String Z959FacVtoTip ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV27EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFacCod_Internalname ;
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
   private String TempTags ;
   private String edtFacCod_Jsonclick ;
   private String divTableleaflevel_lineas_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV32Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String sMode129 ;
   private String edtFacVtoLin_Internalname ;
   private String edtFacVtoFch_Internalname ;
   private String edtFacVtoImp_Internalname ;
   private String sStyleString ;
   private String subGridlevel_lineas_Internalname ;
   private String A396EmprCod ;
   private String A407EmprNom ;
   private String A959FacVtoTip ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode43 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String AV24Station ;
   private String AV25EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sGXsfl_28_fel_idx="0001" ;
   private String subGridlevel_lineas_Class ;
   private String subGridlevel_lineas_Linesclass ;
   private String ROClassString ;
   private String edtFacVtoLin_Jsonclick ;
   private String edtFacVtoFch_Jsonclick ;
   private String edtFacVtoImp_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_lineas_Header ;
   private java.util.Date Z957FacVtoFch ;
   private java.util.Date A957FacVtoFch ;
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
   private boolean n407EmprNom ;
   private boolean n959FacVtoTip ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean n957FacVtoFch ;
   private boolean n958FacVtoImp ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_lineasContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_lineasRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_lineasColumn ;
   private com.genexus.webpanels.WebSession AV31WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T00336_A407EmprNom ;
   private boolean[] T00336_n407EmprNom ;
   private int[] T00337_A430FacCod ;
   private String[] T00337_A407EmprNom ;
   private boolean[] T00337_n407EmprNom ;
   private String[] T00337_A396EmprCod ;
   private String[] T00338_A396EmprCod ;
   private int[] T00338_A430FacCod ;
   private int[] T00335_A430FacCod ;
   private String[] T00335_A396EmprCod ;
   private String[] T00339_A396EmprCod ;
   private int[] T00339_A430FacCod ;
   private String[] T003310_A396EmprCod ;
   private int[] T003310_A430FacCod ;
   private int[] T00334_A430FacCod ;
   private String[] T00334_A396EmprCod ;
   private String[] T003313_A396EmprCod ;
   private int[] T003313_A430FacCod ;
   private int[] T003313_A446FacLin ;
   private String[] T003314_A396EmprCod ;
   private int[] T003314_A430FacCod ;
   private int[] T003315_A430FacCod ;
   private byte[] T003315_A956FacVtoLin ;
   private java.util.Date[] T003315_A957FacVtoFch ;
   private boolean[] T003315_n957FacVtoFch ;
   private java.math.BigDecimal[] T003315_A958FacVtoImp ;
   private boolean[] T003315_n958FacVtoImp ;
   private String[] T003315_A959FacVtoTip ;
   private boolean[] T003315_n959FacVtoTip ;
   private String[] T003315_A396EmprCod ;
   private String[] T003316_A396EmprCod ;
   private int[] T003316_A430FacCod ;
   private byte[] T003316_A956FacVtoLin ;
   private int[] T00333_A430FacCod ;
   private byte[] T00333_A956FacVtoLin ;
   private java.util.Date[] T00333_A957FacVtoFch ;
   private boolean[] T00333_n957FacVtoFch ;
   private java.math.BigDecimal[] T00333_A958FacVtoImp ;
   private boolean[] T00333_n958FacVtoImp ;
   private String[] T00333_A959FacVtoTip ;
   private boolean[] T00333_n959FacVtoTip ;
   private String[] T00333_A396EmprCod ;
   private int[] T00332_A430FacCod ;
   private byte[] T00332_A956FacVtoLin ;
   private java.util.Date[] T00332_A957FacVtoFch ;
   private boolean[] T00332_n957FacVtoFch ;
   private java.math.BigDecimal[] T00332_A958FacVtoImp ;
   private boolean[] T00332_n958FacVtoImp ;
   private String[] T00332_A959FacVtoTip ;
   private boolean[] T00332_n959FacVtoTip ;
   private String[] T00332_A396EmprCod ;
   private String[] T003320_A396EmprCod ;
   private int[] T003320_A430FacCod ;
   private byte[] T003320_A956FacVtoLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV29WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV30TrnContext ;
}

final  class tfacvto__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacvto__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacvto__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacvto__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tfacvto__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00332", "SELECT FacCod, FacVtoLin, FacVtoFch, FacVtoImp, FacVtoTip, EmprCod FROM TXPFACVTO WHERE EmprCod = ? AND FacCod = ? AND FacVtoLin = ?  FOR UPDATE OF FacVtoFch, FacVtoImp, FacVtoTip NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00333", "SELECT FacCod, FacVtoLin, FacVtoFch, FacVtoImp, FacVtoTip, EmprCod FROM TXPFACVTO WHERE EmprCod = ? AND FacCod = ? AND FacVtoLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00334", "SELECT FacCod, EmprCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ?  FOR UPDATE OF FacCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00335", "SELECT FacCod, EmprCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00336", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00337", "SELECT /*+ FIRST_ROWS(100) */ TM1.FacCod, T2.EmprNom, TM1.EmprCod FROM (TXPCFAVEN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.FacCod = ? ORDER BY TM1.EmprCod, TM1.FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00338", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE EmprCod = ? AND FacCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00339", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE ( EmprCod > ? or EmprCod = ? and FacCod > ?) ORDER BY EmprCod, FacCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003310", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, FacCod FROM TXPCFAVEN WHERE ( EmprCod < ? or EmprCod = ? and FacCod < ?) ORDER BY EmprCod DESC, FacCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T003311", "INSERT INTO TXPCFAVEN(FacCod, EmprCod, FacFch, FacPri, CliCod, FacFpg, FacDtoGen, FacDtoPP, FacIVAPor, FacRECPor, FacEst, FacLiC, FacIVACod, FacCob, FacNumVto, FacPer, FacDiaPag, FacTipFac, FacRegIva, FacSerNum, FacDivTCod, FacDivCod, FacRepCod, FacDto, FacObs, Factrm, FacRect, FacRecI, FacFirma, FacHor, FacLiq1, FacLiq2, FacIva1, FacTot1, FacFirDg, FacCliPgL, FacAran, FacBrut, FacNet, FacInc, FacFre, FacExp, FacObs2, FacRecIca, FacMan, MeivaId, FacTpFra, FacEnergia, FacCostFac, FacCostMts, FacCostKgs, FacAnulada, FacFecAnul, MotAnuID, FacSFD, FacIDATe, FacMsgATe, FacIDATc, FacMsgATc, FacIDATd, FacMsgATd, FacSerAT, FacTipAT, FacEnvMail) VALUES(?, ?, TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', 0, ' ', 0, 0, 0, 0, 0, 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', ' ', 0, ' ', 0, ' ', 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), 0, 0, 0, 0, ' ', 0, ' ', 0, 0, ' ', ' ', ' ', ' ', 0, ' ', ' ', ' ', 0, 0, 0, 0, ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'))", GX_NOMASK, "TXPCFAVEN")
         ,new UpdateCursor("T003312", "DELETE FROM TXPCFAVEN  WHERE EmprCod = ? AND FacCod = ?", GX_NOMASK, "TXPCFAVEN")
         ,new ForEachCursor("T003313", "SELECT * FROM (SELECT EmprCod, FacCod, FacLin FROM TXPLFAVEN WHERE EmprCod = ? AND FacCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T003314", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, FacCod FROM TXPCFAVEN ORDER BY EmprCod, FacCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003315", "SELECT FacCod, FacVtoLin, FacVtoFch, FacVtoImp, FacVtoTip, EmprCod FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? and FacVtoLin = ? ORDER BY EmprCod, FacCod, FacVtoLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T003316", "SELECT EmprCod, FacCod, FacVtoLin FROM TXPFACVTO WHERE EmprCod = ? AND FacCod = ? AND FacVtoLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T003317", "INSERT INTO TXPFACVTO(FacCod, FacVtoLin, FacVtoFch, FacVtoImp, FacVtoTip, EmprCod) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPFACVTO")
         ,new UpdateCursor("T003318", "UPDATE TXPFACVTO SET FacVtoFch=?, FacVtoImp=?, FacVtoTip=?  WHERE EmprCod = ? AND FacCod = ? AND FacVtoLin = ?", GX_NOMASK, "TXPFACVTO")
         ,new UpdateCursor("T003319", "DELETE FROM TXPFACVTO  WHERE EmprCod = ? AND FacCod = ? AND FacVtoLin = ?", GX_NOMASK, "TXPFACVTO")
         ,new ForEachCursor("T003320", "SELECT EmprCod, FacCod, FacVtoLin FROM TXPFACVTO WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacVtoLin ",true, GX_NOMASK, false, this,3, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 3);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 15 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.DATE );
               }
               else
               {
                  stmt.setDate(3, (java.util.Date)parms[3]);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(4, (java.math.BigDecimal)parms[5], 2);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[7], 1);
               }
               stmt.setString(6, (String)parms[8], 3);
               return;
            case 16 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DATE );
               }
               else
               {
                  stmt.setDate(1, (java.util.Date)parms[1]);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(2, (java.math.BigDecimal)parms[3], 2);
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
               stmt.setInt(5, ((Number) parms[7]).intValue());
               stmt.setByte(6, ((Number) parms[8]).byteValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

