package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmrcom_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1061MRPriCod = (int)(GXutil.lval( httpContext.GetPar( "MRPriCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A396EmprCod, A1061MRPriCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_12") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1063MRComCod = (int)(GXutil.lval( httpContext.GetPar( "MRComCod"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_12( A396EmprCod, A1063MRComCod) ;
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
            AV15EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
            AV16MRPriCod = (int)(GXutil.lval( httpContext.GetPar( "MRPriCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16MRPriCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRPRICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16MRPriCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Repuestos Compatibles", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtMRPriCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      nRC_GXsfl_33 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_33"))) ;
      nGXsfl_33_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_33_idx"))) ;
      sGXsfl_33_idx = httpContext.GetPar( "sGXsfl_33_idx") ;
      edtMRComCod_Horizontalalignment = httpContext.GetNextPar( ) ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Horizontalalignment", edtMRComCod_Horizontalalignment, !bGXsfl_33_Refreshing);
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

   public tmrcom_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmrcom_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmrcom_impl.class ));
   }

   public tmrcom_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPriCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPriCod_Internalname, httpContext.getMessage( "Compatibles (Cód Principal)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPriCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1061MRPriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1061MRPriCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPriCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRPriCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TMRCom.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtMRPriNom_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtMRPriNom_Internalname, httpContext.getMessage( "Nombre Principal", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtMRPriNom_Internalname, GXutil.rtrim( A1062MRPriNom), GXutil.rtrim( localUtil.format( A1062MRPriNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtMRPriNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtMRPriNom_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRCom.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMRCom.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMRCom.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TMRCom.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV28Pgmname), GXutil.rtrim( localUtil.format( AV28Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRCom.htm");
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
      ucCombo_mrcomcod.setProperty("Caption", Combo_mrcomcod_Caption);
      ucCombo_mrcomcod.setProperty("Cls", Combo_mrcomcod_Cls);
      ucCombo_mrcomcod.setProperty("IsGridItem", Combo_mrcomcod_Isgriditem);
      ucCombo_mrcomcod.setProperty("EmptyItem", Combo_mrcomcod_Emptyitem);
      ucCombo_mrcomcod.setProperty("DropDownOptionsTitleSettingsIcons", AV21DDO_TitleSettingsIcons);
      ucCombo_mrcomcod.setProperty("DropDownOptionsData", AV20MRComCod_Data);
      ucCombo_mrcomcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_mrcomcod_Internalname, "COMBO_MRCOMCODContainer");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,56);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRCom.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TMRCom.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_level1( )
   {
      /*  Grid Control  */
      startgridcontrol33( ) ;
      nGXsfl_33_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1346 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1346 = (short)(1) ;
            scanStart16M1346( ) ;
            while ( RcdFound1346 != 0 )
            {
               init_level_properties1346( ) ;
               getByPrimaryKey16M1346( ) ;
               addRow16M1346( ) ;
               scanNext16M1346( ) ;
            }
            scanEnd16M1346( ) ;
            nBlankRcdCount1346 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal16M1346( ) ;
         standaloneModal16M1346( ) ;
         sMode1346 = Gx_mode ;
         while ( nGXsfl_33_idx < nRC_GXsfl_33 )
         {
            bGXsfl_33_Refreshing = true ;
            readRow16M1346( ) ;
            edtMRComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOMCOD_"+sGXsfl_33_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComCod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
            edtMRComCod_Horizontalalignment = httpContext.cgiGet( "MRCOMCOD_"+sGXsfl_33_idx+"Horizontalalignment") ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Horizontalalignment", edtMRComCod_Horizontalalignment, !bGXsfl_33_Refreshing);
            edtMRComNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOMNOM_"+sGXsfl_33_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMRComNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComNom_Enabled), 5, 0), !bGXsfl_33_Refreshing);
            if ( ( nRcdExists_1346 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal16M1346( ) ;
            }
            sendRow16M1346( ) ;
            bGXsfl_33_Refreshing = false ;
         }
         Gx_mode = sMode1346 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1346 = (short)(5) ;
         nRcdExists_1346 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart16M1346( ) ;
            while ( RcdFound1346 != 0 )
            {
               sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_331346( ) ;
               init_level_properties1346( ) ;
               standaloneNotModal16M1346( ) ;
               getByPrimaryKey16M1346( ) ;
               standaloneModal16M1346( ) ;
               addRow16M1346( ) ;
               scanNext16M1346( ) ;
            }
            scanEnd16M1346( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1346 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_331346( ) ;
         initAll16M1346( ) ;
         init_level_properties1346( ) ;
         nRcdExists_1346 = (short)(0) ;
         nIsMod_1346 = (short)(0) ;
         nRcdDeleted_1346 = (short)(0) ;
         nBlankRcdCount1346 = (short)(nBlankRcdUsr1346+nBlankRcdCount1346) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1346 > 0 )
         {
            standaloneNotModal16M1346( ) ;
            standaloneModal16M1346( ) ;
            addRow16M1346( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtMRComCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1346 = (short)(nBlankRcdCount1346-1) ;
         }
         Gx_mode = sMode1346 ;
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
      e1116M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV21DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMRCOMCOD_DATA"), AV20MRComCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1061MRPriCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z1061MRPriCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_33 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_33"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV16MRPriCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMRPRICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            Combo_mrcomcod_Objectcall = httpContext.cgiGet( "COMBO_MRCOMCOD_Objectcall") ;
            Combo_mrcomcod_Class = httpContext.cgiGet( "COMBO_MRCOMCOD_Class") ;
            Combo_mrcomcod_Icontype = httpContext.cgiGet( "COMBO_MRCOMCOD_Icontype") ;
            Combo_mrcomcod_Icon = httpContext.cgiGet( "COMBO_MRCOMCOD_Icon") ;
            Combo_mrcomcod_Caption = httpContext.cgiGet( "COMBO_MRCOMCOD_Caption") ;
            Combo_mrcomcod_Tooltip = httpContext.cgiGet( "COMBO_MRCOMCOD_Tooltip") ;
            Combo_mrcomcod_Cls = httpContext.cgiGet( "COMBO_MRCOMCOD_Cls") ;
            Combo_mrcomcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MRCOMCOD_Selectedvalue_set") ;
            Combo_mrcomcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MRCOMCOD_Selectedvalue_get") ;
            Combo_mrcomcod_Selectedtext_set = httpContext.cgiGet( "COMBO_MRCOMCOD_Selectedtext_set") ;
            Combo_mrcomcod_Selectedtext_get = httpContext.cgiGet( "COMBO_MRCOMCOD_Selectedtext_get") ;
            Combo_mrcomcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_MRCOMCOD_Gamoauthtoken") ;
            Combo_mrcomcod_Ddointernalname = httpContext.cgiGet( "COMBO_MRCOMCOD_Ddointernalname") ;
            Combo_mrcomcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_MRCOMCOD_Titlecontrolalign") ;
            Combo_mrcomcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MRCOMCOD_Dropdownoptionstype") ;
            Combo_mrcomcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Enabled")) ;
            Combo_mrcomcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Visible")) ;
            Combo_mrcomcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MRCOMCOD_Titlecontrolidtoreplace") ;
            Combo_mrcomcod_Datalisttype = httpContext.cgiGet( "COMBO_MRCOMCOD_Datalisttype") ;
            Combo_mrcomcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Allowmultipleselection")) ;
            Combo_mrcomcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MRCOMCOD_Datalistfixedvalues") ;
            Combo_mrcomcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Isgriditem")) ;
            Combo_mrcomcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Hasdescription")) ;
            Combo_mrcomcod_Datalistproc = httpContext.cgiGet( "COMBO_MRCOMCOD_Datalistproc") ;
            Combo_mrcomcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MRCOMCOD_Datalistprocparametersprefix") ;
            Combo_mrcomcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MRCOMCOD_Remoteservicesparameters") ;
            Combo_mrcomcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MRCOMCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_mrcomcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Includeonlyselectedoption")) ;
            Combo_mrcomcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Includeselectalloption")) ;
            Combo_mrcomcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Emptyitem")) ;
            Combo_mrcomcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MRCOMCOD_Includeaddnewoption")) ;
            Combo_mrcomcod_Htmltemplate = httpContext.cgiGet( "COMBO_MRCOMCOD_Htmltemplate") ;
            Combo_mrcomcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MRCOMCOD_Multiplevaluestype") ;
            Combo_mrcomcod_Loadingdata = httpContext.cgiGet( "COMBO_MRCOMCOD_Loadingdata") ;
            Combo_mrcomcod_Noresultsfound = httpContext.cgiGet( "COMBO_MRCOMCOD_Noresultsfound") ;
            Combo_mrcomcod_Emptyitemtext = httpContext.cgiGet( "COMBO_MRCOMCOD_Emptyitemtext") ;
            Combo_mrcomcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MRCOMCOD_Onlyselectedvalues") ;
            Combo_mrcomcod_Selectalltext = httpContext.cgiGet( "COMBO_MRCOMCOD_Selectalltext") ;
            Combo_mrcomcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MRCOMCOD_Multiplevaluesseparator") ;
            Combo_mrcomcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_MRCOMCOD_Addnewoptiontext") ;
            Combo_mrcomcod_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MRCOMCOD_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRPriCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRPriCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MRPRICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtMRPriCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1061MRPriCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
            }
            else
            {
               A1061MRPriCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRPriCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
            }
            A1062MRPriNom = httpContext.cgiGet( edtMRPriNom_Internalname) ;
            n1062MRPriNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", A1062MRPriNom);
            AV28Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMRCom");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV28Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV28Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tmrcom:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1061MRPriCod = (int)(GXutil.lval( httpContext.GetPar( "MRPriCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
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
                  sMode1345 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1345 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1345 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_16M0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "EMPRCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtEmprCod_Internalname ;
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
                        e1116M2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1216M2 ();
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
         e1216M2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll16M1345( ) ;
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
         disableAttributes16M1345( ) ;
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

   public void confirm_16M0( )
   {
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls16M1345( ) ;
         }
         else
         {
            checkExtendedTable16M1345( ) ;
            closeExtendedTableCursors16M1345( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1345 = Gx_mode ;
         confirm_16M1346( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1345 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1345 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_16M1346( )
   {
      nGXsfl_33_idx = 0 ;
      while ( nGXsfl_33_idx < nRC_GXsfl_33 )
      {
         readRow16M1346( ) ;
         if ( ( nRcdExists_1346 != 0 ) || ( nIsMod_1346 != 0 ) )
         {
            getKey16M1346( ) ;
            if ( ( nRcdExists_1346 == 0 ) && ( nRcdDeleted_1346 == 0 ) )
            {
               if ( RcdFound1346 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate16M1346( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable16M1346( ) ;
                     closeExtendedTableCursors16M1346( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "MRCOMCOD_" + sGXsfl_33_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtMRComCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1346 != 0 )
               {
                  if ( nRcdDeleted_1346 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey16M1346( ) ;
                     load16M1346( ) ;
                     beforeValidate16M1346( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls16M1346( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1346 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate16M1346( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable16M1346( ) ;
                           closeExtendedTableCursors16M1346( ) ;
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
                  if ( nRcdDeleted_1346 == 0 )
                  {
                     GXCCtl = "MRCOMCOD_" + sGXsfl_33_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRComCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1063MRComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRComNom_Internalname, GXutil.rtrim( A1064MRComNom)) ;
         httpContext.changePostValue( "ZT_"+"Z1063MRComCod_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( Z1063MRComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1346_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1346_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1346_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1346 != 0 )
         {
            httpContext.changePostValue( "MRCOMCOD_"+sGXsfl_33_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRCOMCOD_"+sGXsfl_33_idx+"Horizontalalignment", GXutil.rtrim( edtMRComCod_Horizontalalignment)) ;
            httpContext.changePostValue( "MRCOMNOM_"+sGXsfl_33_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption16M0( )
   {
   }

   public void e1116M2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmrcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV28Pgmname, (byte)(99), GXv_char2) ;
      tmrcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmrcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV11Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmrcom_impl.this.GXt_char1 = GXv_char2[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char2[0] = AV27ObtenerEmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmrcom_impl.this.AV27ObtenerEmprCod = GXv_char2[0] ;
      tmrcom_impl.this.AV14EmprNom = GXv_char3[0] ;
      tmrcom_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27ObtenerEmprCod", AV27ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV11Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmrcom_impl.this.GXt_char1 = GXv_char4[0] ;
      AV11Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11Station", AV11Station);
      GXv_char4[0] = AV15EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmrcom_impl.this.AV15EmprCod = GXv_char4[0] ;
      tmrcom_impl.this.AV14EmprNom = GXv_char3[0] ;
      tmrcom_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV17WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV17WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV21DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV21DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Combo_mrcomcod_Titlecontrolidtoreplace = edtMRComCod_Internalname ;
      ucCombo_mrcomcod.sendProperty(context, "", false, Combo_mrcomcod_Internalname, "TitleControlIdToReplace", Combo_mrcomcod_Titlecontrolidtoreplace);
      edtMRComCod_Horizontalalignment = "Left" ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Horizontalalignment", edtMRComCod_Horizontalalignment, !bGXsfl_33_Refreshing);
      /* Execute user subroutine: 'LOADCOMBOMRCOMCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV18TrnContext.fromxml(AV19WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
   }

   public void e1216M2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, httpContext.getMessage( "UPD", "")) == 0 )
      {
         httpContext.popup(formatLink("app.vistatmrcom", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16MRPriCod,8,0))}, new String[] {"EmprCod","MRPriCod"}) , new Object[] {});
      }
      else
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(4);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV18TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.tmrcomww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
      pr_default.close(4);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOMRCOMCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV20MRComCod_Data ;
      GXv_char4[0] = AV22ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.tmrcomloaddvcombo(remoteHandle, context).execute( "MRComCod", Gx_mode, AV15EmprCod, AV16MRPriCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmrcom_impl.this.AV22ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV20MRComCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   }

   public void zm16M1345( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -8 )
      {
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
         Z407EmprNom = A407EmprNom ;
         Z1062MRPriNom = A1062MRPriNom ;
      }
   }

   public void standaloneNotModal( )
   {
      AV28Pgmname = "TMRCom" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Pgmname", AV28Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV15EmprCod)==0) )
      {
         A396EmprCod = AV15EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV15EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV15EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV16MRPriCod) )
      {
         A1061MRPriCod = AV16MRPriCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
      }
      if ( ! (0==AV16MRPriCod) )
      {
         edtMRPriCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPriCod_Enabled), 5, 0), true);
      }
      else
      {
         edtMRPriCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPriCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV16MRPriCod) )
      {
         edtMRPriCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPriCod_Enabled), 5, 0), true);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T016M7 */
         pr_default.execute(5, new Object[] {A396EmprCod});
         A407EmprNom = T016M7_A407EmprNom[0] ;
         n407EmprNom = T016M7_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(5);
         /* Using cursor T016M8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
         A1062MRPriNom = T016M8_A1062MRPriNom[0] ;
         n1062MRPriNom = T016M8_n1062MRPriNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", A1062MRPriNom);
         pr_default.close(6);
      }
   }

   public void load16M1345( )
   {
      /* Using cursor T016M9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1345 = (short)(1) ;
         A407EmprNom = T016M9_A407EmprNom[0] ;
         n407EmprNom = T016M9_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A1062MRPriNom = T016M9_A1062MRPriNom[0] ;
         n1062MRPriNom = T016M9_n1062MRPriNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", A1062MRPriNom);
         zm16M1345( -8) ;
      }
      pr_default.close(7);
      onLoadActions16M1345( ) ;
   }

   public void onLoadActions16M1345( )
   {
   }

   public void checkExtendedTable16M1345( )
   {
      nIsDirty_1345 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T016M7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T016M7_A407EmprNom[0] ;
      n407EmprNom = T016M7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(5);
      /* Using cursor T016M8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRComPri", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRPRICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1062MRPriNom = T016M8_A1062MRPriNom[0] ;
      n1062MRPriNom = T016M8_n1062MRPriNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", A1062MRPriNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors16M1345( )
   {
      pr_default.close(5);
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A396EmprCod )
   {
      /* Using cursor T016M10 */
      pr_default.execute(8, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T016M10_A407EmprNom[0] ;
      n407EmprNom = T016M10_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void gxload_10( String A396EmprCod ,
                          int A1061MRPriCod )
   {
      /* Using cursor T016M11 */
      pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(9) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRComPri", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRPRICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1062MRPriNom = T016M11_A1062MRPriNom[0] ;
      n1062MRPriNom = T016M11_n1062MRPriNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", A1062MRPriNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1062MRPriNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(9) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(9);
   }

   public void getKey16M1345( )
   {
      /* Using cursor T016M12 */
      pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound1345 = (short)(1) ;
      }
      else
      {
         RcdFound1345 = (short)(0) ;
      }
      pr_default.close(10);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T016M6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm16M1345( 8) ;
         RcdFound1345 = (short)(1) ;
         A396EmprCod = T016M6_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1061MRPriCod = T016M6_A1061MRPriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
         sMode1345 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16M1345( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1345 = (short)(0) ;
            initializeNonKey16M1345( ) ;
         }
         Gx_mode = sMode1345 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1345 = (short)(0) ;
         initializeNonKey16M1345( ) ;
         sMode1345 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1345 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey16M1345( ) ;
      if ( RcdFound1345 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1345 = (short)(0) ;
      /* Using cursor T016M13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T016M13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T016M13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016M13_A1061MRPriCod[0] < A1061MRPriCod ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T016M13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T016M13_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016M13_A1061MRPriCod[0] > A1061MRPriCod ) ) )
         {
            A396EmprCod = T016M13_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1061MRPriCod = T016M13_A1061MRPriCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
            RcdFound1345 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void move_previous( )
   {
      RcdFound1345 = (short)(0) ;
      /* Using cursor T016M14 */
      pr_default.execute(12, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(12) != 101) )
      {
         while ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T016M14_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T016M14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016M14_A1061MRPriCod[0] > A1061MRPriCod ) ) )
         {
            pr_default.readNext(12);
         }
         if ( (pr_default.getStatus(12) != 101) && ( ( GXutil.strcmp(T016M14_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T016M14_A396EmprCod[0], A396EmprCod) == 0 ) && ( T016M14_A1061MRPriCod[0] < A1061MRPriCod ) ) )
         {
            A396EmprCod = T016M14_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A1061MRPriCod = T016M14_A1061MRPriCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
            RcdFound1345 = (short)(1) ;
         }
      }
      pr_default.close(12);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey16M1345( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtMRPriCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert16M1345( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1345 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A1061MRPriCod = Z1061MRPriCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtMRPriCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update16M1345( ) ;
               GX_FocusControl = edtMRPriCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtMRPriCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert16M1345( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "EMPRCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtEmprCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtMRPriCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert16M1345( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1061MRPriCod != Z1061MRPriCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1061MRPriCod = Z1061MRPriCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtMRPriCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency16M1345( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016M5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRCom"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRCom"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16M1345( )
   {
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1345( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16M1345( 0) ;
         checkOptimisticConcurrency16M1345( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16M1345( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16M1345( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016M15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom");
                  if ( (pr_default.getStatus(13) == 1) )
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
                        processLevel16M1345( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption16M0( ) ;
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
            load16M1345( ) ;
         }
         endLevel16M1345( ) ;
      }
      closeExtendedTableCursors16M1345( ) ;
   }

   public void update16M1345( )
   {
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1345( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16M1345( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16M1345( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate16M1345( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPMRCom */
                  deferredUpdate16M1345( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel16M1345( ) ;
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
         endLevel16M1345( ) ;
      }
      closeExtendedTableCursors16M1345( ) ;
   }

   public void deferredUpdate16M1345( )
   {
   }

   public void delete( )
   {
      beforeValidate16M1345( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16M1345( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16M1345( ) ;
         afterConfirm16M1345( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16M1345( ) ;
            if ( AnyError == 0 )
            {
               scanStart16M1346( ) ;
               while ( RcdFound1346 != 0 )
               {
                  getByPrimaryKey16M1346( ) ;
                  delete16M1346( ) ;
                  scanNext16M1346( ) ;
               }
               scanEnd16M1346( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016M16 */
                  pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom");
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
      sMode1345 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16M1345( ) ;
      Gx_mode = sMode1345 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16M1345( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016M17 */
         pr_default.execute(15, new Object[] {A396EmprCod});
         A407EmprNom = T016M17_A407EmprNom[0] ;
         n407EmprNom = T016M17_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(15);
         /* Using cursor T016M18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
         A1062MRPriNom = T016M18_A1062MRPriNom[0] ;
         n1062MRPriNom = T016M18_n1062MRPriNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", A1062MRPriNom);
         pr_default.close(16);
      }
   }

   public void processNestedLevel16M1346( )
   {
      nGXsfl_33_idx = 0 ;
      while ( nGXsfl_33_idx < nRC_GXsfl_33 )
      {
         readRow16M1346( ) ;
         if ( ( nRcdExists_1346 != 0 ) || ( nIsMod_1346 != 0 ) )
         {
            standaloneNotModal16M1346( ) ;
            getKey16M1346( ) ;
            if ( ( nRcdExists_1346 == 0 ) && ( nRcdDeleted_1346 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert16M1346( ) ;
            }
            else
            {
               if ( RcdFound1346 != 0 )
               {
                  if ( ( nRcdDeleted_1346 != 0 ) && ( nRcdExists_1346 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete16M1346( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1346 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update16M1346( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1346 == 0 )
                  {
                     GXCCtl = "MRCOMCOD_" + sGXsfl_33_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtMRComCod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtMRComCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1063MRComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMRComNom_Internalname, GXutil.rtrim( A1064MRComNom)) ;
         httpContext.changePostValue( "ZT_"+"Z1063MRComCod_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( Z1063MRComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdDeleted_1346_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1346_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1346_"+sGXsfl_33_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1346 != 0 )
         {
            httpContext.changePostValue( "MRCOMCOD_"+sGXsfl_33_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MRCOMCOD_"+sGXsfl_33_idx+"Horizontalalignment", GXutil.rtrim( edtMRComCod_Horizontalalignment)) ;
            httpContext.changePostValue( "MRCOMNOM_"+sGXsfl_33_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComNom_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll16M1346( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1346 = (short)(0) ;
      nIsMod_1346 = (short)(0) ;
      nRcdDeleted_1346 = (short)(0) ;
   }

   public void processLevel16M1345( )
   {
      /* Save parent mode. */
      sMode1345 = Gx_mode ;
      processNestedLevel16M1346( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1345 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel16M1345( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete16M1345( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tmrcom");
         if ( AnyError == 0 )
         {
            confirmValues16M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tmrcom");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart16M1345( )
   {
      /* Scan By routine */
      /* Using cursor T016M19 */
      pr_default.execute(17);
      RcdFound1345 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1345 = (short)(1) ;
         A396EmprCod = T016M19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1061MRPriCod = T016M19_A1061MRPriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16M1345( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1345 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1345 = (short)(1) ;
         A396EmprCod = T016M19_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A1061MRPriCod = T016M19_A1061MRPriCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
      }
   }

   public void scanEnd16M1345( )
   {
      pr_default.close(17);
   }

   public void afterConfirm16M1345( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16M1345( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16M1345( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16M1345( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16M1345( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16M1345( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16M1345( )
   {
      edtMRPriCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPriCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPriCod_Enabled), 5, 0), true);
      edtMRPriNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRPriNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRPriNom_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void zm16M1346( int GX_JID )
   {
      if ( ( GX_JID == 11 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -11 )
      {
         Z1061MRPriCod = A1061MRPriCod ;
         Z396EmprCod = A396EmprCod ;
         Z1063MRComCod = A1063MRComCod ;
         Z1064MRComNom = A1064MRComNom ;
      }
   }

   public void standaloneNotModal16M1346( )
   {
      edtMRComNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRComNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComNom_Enabled), 5, 0), !bGXsfl_33_Refreshing);
   }

   public void standaloneModal16M1346( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtMRComCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComCod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      }
      else
      {
         edtMRComCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComCod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      }
   }

   public void load16M1346( )
   {
      /* Using cursor T016M20 */
      pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound1346 = (short)(1) ;
         A1064MRComNom = T016M20_A1064MRComNom[0] ;
         n1064MRComNom = T016M20_n1064MRComNom[0] ;
         zm16M1346( -11) ;
      }
      pr_default.close(18);
      onLoadActions16M1346( ) ;
   }

   public void onLoadActions16M1346( )
   {
   }

   public void checkExtendedTable16M1346( )
   {
      nIsDirty_1346 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal16M1346( ) ;
      /* Using cursor T016M4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "MRCOMCOD_" + sGXsfl_33_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRCom", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1064MRComNom = T016M4_A1064MRComNom[0] ;
      n1064MRComNom = T016M4_n1064MRComNom[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors16M1346( )
   {
      pr_default.close(2);
   }

   public void enableDisable16M1346( )
   {
   }

   public void gxload_12( String A396EmprCod ,
                          int A1063MRComCod )
   {
      /* Using cursor T016M21 */
      pr_default.execute(19, new Object[] {A396EmprCod, Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(19) == 101) )
      {
         GXCCtl = "MRCOMCOD_" + sGXsfl_33_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRCom", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRComCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A1064MRComNom = T016M21_A1064MRComNom[0] ;
      n1064MRComNom = T016M21_n1064MRComNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A1064MRComNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(19) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(19);
   }

   public void getKey16M1346( )
   {
      /* Using cursor T016M22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound1346 = (short)(1) ;
      }
      else
      {
         RcdFound1346 = (short)(0) ;
      }
      pr_default.close(20);
   }

   public void getByPrimaryKey16M1346( )
   {
      /* Using cursor T016M3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm16M1346( 11) ;
         RcdFound1346 = (short)(1) ;
         initializeNonKey16M1346( ) ;
         A1063MRComCod = T016M3_A1063MRComCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z1061MRPriCod = A1061MRPriCod ;
         Z1063MRComCod = A1063MRComCod ;
         sMode1346 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load16M1346( ) ;
         Gx_mode = sMode1346 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1346 = (short)(0) ;
         initializeNonKey16M1346( ) ;
         sMode1346 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal16M1346( ) ;
         Gx_mode = sMode1346 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes16M1346( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency16M1346( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T016M2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMRCom1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMRCom1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert16M1346( )
   {
      beforeValidate16M1346( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1346( ) ;
      }
      if ( AnyError == 0 )
      {
         zm16M1346( 0) ;
         checkOptimisticConcurrency16M1346( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm16M1346( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert16M1346( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T016M23 */
                  pr_default.execute(21, new Object[] {Integer.valueOf(A1061MRPriCod), A396EmprCod, Integer.valueOf(A1063MRComCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom1");
                  if ( (pr_default.getStatus(21) == 1) )
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
            load16M1346( ) ;
         }
         endLevel16M1346( ) ;
      }
      closeExtendedTableCursors16M1346( ) ;
   }

   public void update16M1346( )
   {
      beforeValidate16M1346( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable16M1346( ) ;
      }
      if ( ( nIsMod_1346 != 0 ) || ( nIsDirty_1346 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency16M1346( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm16M1346( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate16M1346( ) ;
                  if ( AnyError == 0 )
                  {
                     /* No attributes to update on table TXPMRCom1 */
                     deferredUpdate16M1346( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey16M1346( ) ;
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
            endLevel16M1346( ) ;
         }
      }
      closeExtendedTableCursors16M1346( ) ;
   }

   public void deferredUpdate16M1346( )
   {
   }

   public void delete16M1346( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate16M1346( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency16M1346( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls16M1346( ) ;
         afterConfirm16M1346( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete16M1346( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T016M24 */
               pr_default.execute(22, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod), Integer.valueOf(A1063MRComCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMRCom1");
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
      sMode1346 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel16M1346( ) ;
      Gx_mode = sMode1346 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls16M1346( )
   {
      standaloneModal16M1346( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T016M25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A1063MRComCod)});
         A1064MRComNom = T016M25_A1064MRComNom[0] ;
         n1064MRComNom = T016M25_n1064MRComNom[0] ;
         pr_default.close(23);
      }
   }

   public void endLevel16M1346( )
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

   public void scanStart16M1346( )
   {
      /* Scan By routine */
      /* Using cursor T016M26 */
      pr_default.execute(24, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      RcdFound1346 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1346 = (short)(1) ;
         A1063MRComCod = T016M26_A1063MRComCod[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext16M1346( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound1346 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound1346 = (short)(1) ;
         A1063MRComCod = T016M26_A1063MRComCod[0] ;
      }
   }

   public void scanEnd16M1346( )
   {
      pr_default.close(24);
   }

   public void afterConfirm16M1346( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert16M1346( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate16M1346( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete16M1346( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete16M1346( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate16M1346( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes16M1346( )
   {
      edtMRComCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComCod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtMRComNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRComNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComNom_Enabled), 5, 0), !bGXsfl_33_Refreshing);
   }

   public void send_integrity_lvl_hashes16M1346( )
   {
   }

   public void send_integrity_lvl_hashes16M1345( )
   {
   }

   public void subsflControlProps_331346( )
   {
      edtMRComCod_Internalname = "MRCOMCOD_"+sGXsfl_33_idx ;
      edtMRComNom_Internalname = "MRCOMNOM_"+sGXsfl_33_idx ;
   }

   public void subsflControlProps_fel_331346( )
   {
      edtMRComCod_Internalname = "MRCOMCOD_"+sGXsfl_33_fel_idx ;
      edtMRComNom_Internalname = "MRCOMNOM_"+sGXsfl_33_fel_idx ;
   }

   public void addRow16M1346( )
   {
      nGXsfl_33_idx = (int)(nGXsfl_33_idx+1) ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_331346( ) ;
      sendRow16M1346( ) ;
   }

   public void sendRow16M1346( )
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
         if ( ((int)((nGXsfl_33_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1346_" + sGXsfl_33_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_33_idx + "',33)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRComCod_Internalname,GXutil.ltrim( localUtil.ntoc( A1063MRComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1063MRComCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRComCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMRComCod_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"",edtMRComCod_Horizontalalignment,Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMRComNom_Internalname,GXutil.rtrim( A1064MRComNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMRComNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(0),Integer.valueOf(edtMRComNom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(33),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes16M1346( ) ;
      GXCCtl = "Z1063MRComCod_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z1063MRComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdDeleted_1346_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1346_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1346_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1346, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vEMPRCOD_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV15EmprCod));
      GXCCtl = "vMRPRICOD_" + sGXsfl_33_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( AV16MRPriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_33_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV18TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV18TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "MRCOMCOD_"+sGXsfl_33_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MRCOMCOD_"+sGXsfl_33_idx+"Horizontalalignment", GXutil.rtrim( edtMRComCod_Horizontalalignment));
      app.GxWebStd.gx_hidden_field( httpContext, "MRCOMNOM_"+sGXsfl_33_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComNom_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow16M1346( )
   {
      nGXsfl_33_idx = (int)(nGXsfl_33_idx+1) ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_331346( ) ;
      edtMRComCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOMCOD_"+sGXsfl_33_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMRComCod_Horizontalalignment = httpContext.cgiGet( "MRCOMCOD_"+sGXsfl_33_idx+"Horizontalalignment") ;
      edtMRComNom_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MRCOMNOM_"+sGXsfl_33_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtMRComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtMRComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
      {
         GXCCtl = "MRCOMCOD_" + sGXsfl_33_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRComCod_Internalname ;
         wbErr = true ;
         A1063MRComCod = 0 ;
      }
      else
      {
         A1063MRComCod = (int)(localUtil.ctol( httpContext.cgiGet( edtMRComCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A1064MRComNom = httpContext.cgiGet( edtMRComNom_Internalname) ;
      n1064MRComNom = false ;
      GXCCtl = "Z1063MRComCod_" + sGXsfl_33_idx ;
      Z1063MRComCod = (int)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_1346_" + sGXsfl_33_idx ;
      nRcdDeleted_1346 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1346_" + sGXsfl_33_idx ;
      nRcdExists_1346 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1346_" + sGXsfl_33_idx ;
      nIsMod_1346 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtMRComNom_Enabled = edtMRComNom_Enabled ;
      defedtMRComCod_Enabled = edtMRComCod_Enabled ;
   }

   public void confirmValues16M0( )
   {
      nGXsfl_33_idx = 0 ;
      sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_331346( ) ;
      while ( nGXsfl_33_idx < nRC_GXsfl_33 )
      {
         nGXsfl_33_idx = (int)(nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_331346( ) ;
         httpContext.changePostValue( "Z1063MRComCod_"+sGXsfl_33_idx, httpContext.cgiGet( "ZT_"+"Z1063MRComCod_"+sGXsfl_33_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z1063MRComCod_"+sGXsfl_33_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tmrcom", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16MRPriCod,8,0))}, new String[] {"Gx_mode","EmprCod","MRPriCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMRCom");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV28Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tmrcom:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1061MRPriCod", GXutil.ltrim( localUtil.ntoc( Z1061MRPriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_33", GXutil.ltrim( localUtil.ntoc( nGXsfl_33_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV21DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMRCOMCOD_DATA", AV20MRComCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMRCOMCOD_DATA", AV20MRComCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV18TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV18TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV18TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMRPRICOD", GXutil.ltrim( localUtil.ntoc( AV16MRPriCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMRPRICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV16MRPriCod), "ZZZZZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOMCOD_Objectcall", GXutil.rtrim( Combo_mrcomcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOMCOD_Cls", GXutil.rtrim( Combo_mrcomcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOMCOD_Enabled", GXutil.booltostr( Combo_mrcomcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOMCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_mrcomcod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOMCOD_Isgriditem", GXutil.booltostr( Combo_mrcomcod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MRCOMCOD_Emptyitem", GXutil.booltostr( Combo_mrcomcod_Emptyitem));
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
      return formatLink("app.tmrcom", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV16MRPriCod,8,0))}, new String[] {"Gx_mode","EmprCod","MRPriCod"})  ;
   }

   public String getPgmname( )
   {
      return "TMRCom" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Repuestos Compatibles", "") ;
   }

   public void initializeNonKey16M1345( )
   {
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A1062MRPriNom = "" ;
      n1062MRPriNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", A1062MRPriNom);
   }

   public void initAll16M1345( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A1061MRPriCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1061MRPriCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1061MRPriCod), 8, 0));
      initializeNonKey16M1345( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey16M1346( )
   {
      A1064MRComNom = "" ;
      n1064MRComNom = false ;
   }

   public void initAll16M1346( )
   {
      A1063MRComCod = 0 ;
      initializeNonKey16M1346( ) ;
   }

   public void standaloneModalInsert16M1346( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20263623324256", true, true);
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
      httpContext.AddJavascriptSource("tmrcom.js", "?20263623324256", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1346( )
   {
      edtMRComNom_Enabled = defedtMRComNom_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRComNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComNom_Enabled), 5, 0), !bGXsfl_33_Refreshing);
      edtMRComCod_Enabled = defedtMRComCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtMRComCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMRComCod_Enabled), 5, 0), !bGXsfl_33_Refreshing);
   }

   public void startgridcontrol33( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1063MRComCod, (byte)(8), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Column.AddObjectProperty("Horizontalalignment", GXutil.rtrim( edtMRComCod_Horizontalalignment));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A1064MRComNom));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMRComNom_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtMRPriCod_Internalname = "MRPRICOD" ;
      edtMRPriNom_Internalname = "MRPRINOM" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtMRComCod_Internalname = "MRCOMCOD" ;
      edtMRComNom_Internalname = "MRCOMNOM" ;
      divTableleaflevel_level1_Internalname = "TABLELEAFLEVEL_LEVEL1" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_mrcomcod_Internalname = "COMBO_MRCOMCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
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
      Combo_mrcomcod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Repuestos Compatibles", "") );
      edtMRComNom_Jsonclick = "" ;
      edtMRComCod_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      Combo_mrcomcod_Titlecontrolidtoreplace = "" ;
      edtMRComNom_Enabled = 0 ;
      edtMRComCod_Enabled = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      Combo_mrcomcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_mrcomcod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_mrcomcod_Cls = "ExtendedCombo" ;
      Combo_mrcomcod_Caption = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtMRPriNom_Jsonclick = "" ;
      edtMRPriNom_Enabled = 0 ;
      edtMRPriCod_Jsonclick = "" ;
      edtMRPriCod_Enabled = 1 ;
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
      edtMRComCod_Horizontalalignment = "right" ;
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
      subsflControlProps_331346( ) ;
      while ( nGXsfl_33_idx <= nRC_GXsfl_33 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal16M1346( ) ;
         standaloneModal16M1346( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow16M1346( ) ;
         nGXsfl_33_idx = (int)(nGXsfl_33_idx+1) ;
         sGXsfl_33_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_33_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_331346( ) ;
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      n1062MRPriNom = false ;
      /* Using cursor T016M17 */
      pr_default.execute(15, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T016M17_A407EmprNom[0] ;
      n407EmprNom = T016M17_n407EmprNom[0] ;
      pr_default.close(15);
      /* Using cursor T016M18 */
      pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A1061MRPriCod)});
      if ( (pr_default.getStatus(16) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRComPri", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRPRICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A1062MRPriNom = T016M18_A1062MRPriNom[0] ;
      n1062MRPriNom = T016M18_n1062MRPriNom[0] ;
      pr_default.close(16);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A1062MRPriNom", GXutil.rtrim( A1062MRPriNom));
   }

   public void valid_Mrcomcod( )
   {
      n1064MRComNom = false ;
      /* Using cursor T016M25 */
      pr_default.execute(23, new Object[] {A396EmprCod, Integer.valueOf(A1063MRComCod)});
      if ( (pr_default.getStatus(23) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MRCom", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "MRCOMCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtMRComCod_Internalname ;
      }
      A1064MRComNom = T016M25_A1064MRComNom[0] ;
      n1064MRComNom = T016M25_n1064MRComNom[0] ;
      pr_default.close(23);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1064MRComNom", GXutil.rtrim( A1064MRComNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV16MRPriCod',fld:'vMRPRICOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV18TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV16MRPriCod',fld:'vMRPRICOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV28Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1216M2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV16MRPriCod',fld:'vMRPRICOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV18TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_MRPRICOD","{handler:'valid_Mrpricod',iparms:[]");
      setEventMetadata("VALID_MRPRICOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1061MRPriCod',fld:'MRPRICOD',pic:'ZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1062MRPriNom',fld:'MRPRINOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A1062MRPriNom',fld:'MRPRINOM',pic:''}]}");
      setEventMetadata("VALID_MRCOMCOD","{handler:'valid_Mrcomcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1063MRComCod',fld:'MRCOMCOD',pic:'ZZZZZZZ9'},{av:'A1064MRComNom',fld:'MRCOMNOM',pic:''}]");
      setEventMetadata("VALID_MRCOMCOD",",oparms:[{av:'A1064MRComNom',fld:'MRCOMNOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Mrcomnom',iparms:[]");
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
      pr_default.close(23);
      pr_default.close(15);
      pr_default.close(16);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV15EmprCod = "" ;
      Z396EmprCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV15EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A1062MRPriNom = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV28Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_mrcomcod = new com.genexus.webpanels.GXUserControl();
      AV21DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV20MRComCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A407EmprNom = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1346 = "" ;
      sStyleString = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_mrcomcod_Objectcall = "" ;
      Combo_mrcomcod_Class = "" ;
      Combo_mrcomcod_Icontype = "" ;
      Combo_mrcomcod_Icon = "" ;
      Combo_mrcomcod_Tooltip = "" ;
      Combo_mrcomcod_Selectedvalue_set = "" ;
      Combo_mrcomcod_Selectedvalue_get = "" ;
      Combo_mrcomcod_Selectedtext_set = "" ;
      Combo_mrcomcod_Selectedtext_get = "" ;
      Combo_mrcomcod_Gamoauthtoken = "" ;
      Combo_mrcomcod_Ddointernalname = "" ;
      Combo_mrcomcod_Titlecontrolalign = "" ;
      Combo_mrcomcod_Dropdownoptionstype = "" ;
      Combo_mrcomcod_Datalisttype = "" ;
      Combo_mrcomcod_Datalistfixedvalues = "" ;
      Combo_mrcomcod_Datalistproc = "" ;
      Combo_mrcomcod_Datalistprocparametersprefix = "" ;
      Combo_mrcomcod_Remoteservicesparameters = "" ;
      Combo_mrcomcod_Htmltemplate = "" ;
      Combo_mrcomcod_Multiplevaluestype = "" ;
      Combo_mrcomcod_Loadingdata = "" ;
      Combo_mrcomcod_Noresultsfound = "" ;
      Combo_mrcomcod_Emptyitemtext = "" ;
      Combo_mrcomcod_Onlyselectedvalues = "" ;
      Combo_mrcomcod_Selectalltext = "" ;
      Combo_mrcomcod_Multiplevaluesseparator = "" ;
      Combo_mrcomcod_Addnewoptiontext = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1345 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A1064MRComNom = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV11Station = "" ;
      AV27ObtenerEmprCod = "" ;
      AV14EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV17WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV18TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV22ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z1062MRPriNom = "" ;
      T016M7_A407EmprNom = new String[] {""} ;
      T016M7_n407EmprNom = new boolean[] {false} ;
      T016M8_A1062MRPriNom = new String[] {""} ;
      T016M8_n1062MRPriNom = new boolean[] {false} ;
      T016M9_A407EmprNom = new String[] {""} ;
      T016M9_n407EmprNom = new boolean[] {false} ;
      T016M9_A1062MRPriNom = new String[] {""} ;
      T016M9_n1062MRPriNom = new boolean[] {false} ;
      T016M9_A396EmprCod = new String[] {""} ;
      T016M9_A1061MRPriCod = new int[1] ;
      T016M10_A407EmprNom = new String[] {""} ;
      T016M10_n407EmprNom = new boolean[] {false} ;
      T016M11_A1062MRPriNom = new String[] {""} ;
      T016M11_n1062MRPriNom = new boolean[] {false} ;
      T016M12_A396EmprCod = new String[] {""} ;
      T016M12_A1061MRPriCod = new int[1] ;
      T016M6_A396EmprCod = new String[] {""} ;
      T016M6_A1061MRPriCod = new int[1] ;
      T016M13_A396EmprCod = new String[] {""} ;
      T016M13_A1061MRPriCod = new int[1] ;
      T016M14_A396EmprCod = new String[] {""} ;
      T016M14_A1061MRPriCod = new int[1] ;
      T016M5_A396EmprCod = new String[] {""} ;
      T016M5_A1061MRPriCod = new int[1] ;
      T016M17_A407EmprNom = new String[] {""} ;
      T016M17_n407EmprNom = new boolean[] {false} ;
      T016M18_A1062MRPriNom = new String[] {""} ;
      T016M18_n1062MRPriNom = new boolean[] {false} ;
      T016M19_A396EmprCod = new String[] {""} ;
      T016M19_A1061MRPriCod = new int[1] ;
      Z1064MRComNom = "" ;
      T016M20_A1061MRPriCod = new int[1] ;
      T016M20_A1064MRComNom = new String[] {""} ;
      T016M20_n1064MRComNom = new boolean[] {false} ;
      T016M20_A396EmprCod = new String[] {""} ;
      T016M20_A1063MRComCod = new int[1] ;
      T016M4_A1064MRComNom = new String[] {""} ;
      T016M4_n1064MRComNom = new boolean[] {false} ;
      T016M21_A1064MRComNom = new String[] {""} ;
      T016M21_n1064MRComNom = new boolean[] {false} ;
      T016M22_A396EmprCod = new String[] {""} ;
      T016M22_A1061MRPriCod = new int[1] ;
      T016M22_A1063MRComCod = new int[1] ;
      T016M3_A1061MRPriCod = new int[1] ;
      T016M3_A396EmprCod = new String[] {""} ;
      T016M3_A1063MRComCod = new int[1] ;
      T016M2_A1061MRPriCod = new int[1] ;
      T016M2_A396EmprCod = new String[] {""} ;
      T016M2_A1063MRComCod = new int[1] ;
      T016M25_A1064MRComNom = new String[] {""} ;
      T016M25_n1064MRComNom = new boolean[] {false} ;
      T016M26_A396EmprCod = new String[] {""} ;
      T016M26_A1061MRPriCod = new int[1] ;
      T016M26_A1063MRComCod = new int[1] ;
      Gridlevel_level1Row = new com.genexus.webpanels.GXWebRow();
      subGridlevel_level1_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      Gridlevel_level1Column = new com.genexus.webpanels.GXWebColumn();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tmrcom__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tmrcom__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tmrcom__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tmrcom__default(),
         new Object[] {
             new Object[] {
            T016M2_A1061MRPriCod, T016M2_A396EmprCod, T016M2_A1063MRComCod
            }
            , new Object[] {
            T016M3_A1061MRPriCod, T016M3_A396EmprCod, T016M3_A1063MRComCod
            }
            , new Object[] {
            T016M4_A1064MRComNom, T016M4_n1064MRComNom
            }
            , new Object[] {
            T016M5_A396EmprCod, T016M5_A1061MRPriCod
            }
            , new Object[] {
            T016M6_A396EmprCod, T016M6_A1061MRPriCod
            }
            , new Object[] {
            T016M7_A407EmprNom, T016M7_n407EmprNom
            }
            , new Object[] {
            T016M8_A1062MRPriNom, T016M8_n1062MRPriNom
            }
            , new Object[] {
            T016M9_A407EmprNom, T016M9_n407EmprNom, T016M9_A1062MRPriNom, T016M9_n1062MRPriNom, T016M9_A396EmprCod, T016M9_A1061MRPriCod
            }
            , new Object[] {
            T016M10_A407EmprNom, T016M10_n407EmprNom
            }
            , new Object[] {
            T016M11_A1062MRPriNom, T016M11_n1062MRPriNom
            }
            , new Object[] {
            T016M12_A396EmprCod, T016M12_A1061MRPriCod
            }
            , new Object[] {
            T016M13_A396EmprCod, T016M13_A1061MRPriCod
            }
            , new Object[] {
            T016M14_A396EmprCod, T016M14_A1061MRPriCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016M17_A407EmprNom, T016M17_n407EmprNom
            }
            , new Object[] {
            T016M18_A1062MRPriNom, T016M18_n1062MRPriNom
            }
            , new Object[] {
            T016M19_A396EmprCod, T016M19_A1061MRPriCod
            }
            , new Object[] {
            T016M20_A1061MRPriCod, T016M20_A1064MRComNom, T016M20_n1064MRComNom, T016M20_A396EmprCod, T016M20_A1063MRComCod
            }
            , new Object[] {
            T016M21_A1064MRComNom, T016M21_n1064MRComNom
            }
            , new Object[] {
            T016M22_A396EmprCod, T016M22_A1061MRPriCod, T016M22_A1063MRComCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T016M25_A1064MRComNom, T016M25_n1064MRComNom
            }
            , new Object[] {
            T016M26_A396EmprCod, T016M26_A1061MRPriCod, T016M26_A1063MRComCod
            }
         }
      );
      AV28Pgmname = "TMRCom" ;
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
   private short nRcdDeleted_1346 ;
   private short nRcdExists_1346 ;
   private short nIsMod_1346 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1346 ;
   private short RcdFound1346 ;
   private short nBlankRcdUsr1346 ;
   private short RcdFound1345 ;
   private short nIsDirty_1345 ;
   private short nIsDirty_1346 ;
   private int wcpOAV16MRPriCod ;
   private int Z1061MRPriCod ;
   private int nRC_GXsfl_33 ;
   private int nGXsfl_33_idx=1 ;
   private int Z1063MRComCod ;
   private int A1061MRPriCod ;
   private int A1063MRComCod ;
   private int AV16MRPriCod ;
   private int trnEnded ;
   private int edtMRPriCod_Enabled ;
   private int edtMRPriNom_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtMRComCod_Enabled ;
   private int edtMRComNom_Enabled ;
   private int fRowAdded ;
   private int Dvpanel_tableattributes_Gxcontroltype ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_mrcomcod_Datalistupdateminimumcharacters ;
   private int Combo_mrcomcod_Gxcontroltype ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtMRComNom_Enabled ;
   private int defedtMRComCod_Enabled ;
   private int idxLst ;
   private int subGridlevel_level1_Selectedindex ;
   private int subGridlevel_level1_Selectioncolor ;
   private int subGridlevel_level1_Hoveringcolor ;
   private long GRIDLEVEL_LEVEL1_nFirstRecordOnPage ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV15EmprCod ;
   private String Z396EmprCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV15EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtMRPriCod_Internalname ;
   private String sGXsfl_33_idx="0001" ;
   private String edtMRComCod_Horizontalalignment ;
   private String edtMRComCod_Internalname ;
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
   private String edtMRPriCod_Jsonclick ;
   private String edtMRPriNom_Internalname ;
   private String A1062MRPriNom ;
   private String edtMRPriNom_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV28Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_mrcomcod_Caption ;
   private String Combo_mrcomcod_Cls ;
   private String Combo_mrcomcod_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String sMode1346 ;
   private String edtMRComNom_Internalname ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_mrcomcod_Objectcall ;
   private String Combo_mrcomcod_Class ;
   private String Combo_mrcomcod_Icontype ;
   private String Combo_mrcomcod_Icon ;
   private String Combo_mrcomcod_Tooltip ;
   private String Combo_mrcomcod_Selectedvalue_set ;
   private String Combo_mrcomcod_Selectedvalue_get ;
   private String Combo_mrcomcod_Selectedtext_set ;
   private String Combo_mrcomcod_Selectedtext_get ;
   private String Combo_mrcomcod_Gamoauthtoken ;
   private String Combo_mrcomcod_Ddointernalname ;
   private String Combo_mrcomcod_Titlecontrolalign ;
   private String Combo_mrcomcod_Dropdownoptionstype ;
   private String Combo_mrcomcod_Titlecontrolidtoreplace ;
   private String Combo_mrcomcod_Datalisttype ;
   private String Combo_mrcomcod_Datalistfixedvalues ;
   private String Combo_mrcomcod_Datalistproc ;
   private String Combo_mrcomcod_Datalistprocparametersprefix ;
   private String Combo_mrcomcod_Remoteservicesparameters ;
   private String Combo_mrcomcod_Htmltemplate ;
   private String Combo_mrcomcod_Multiplevaluestype ;
   private String Combo_mrcomcod_Loadingdata ;
   private String Combo_mrcomcod_Noresultsfound ;
   private String Combo_mrcomcod_Emptyitemtext ;
   private String Combo_mrcomcod_Onlyselectedvalues ;
   private String Combo_mrcomcod_Selectalltext ;
   private String Combo_mrcomcod_Multiplevaluesseparator ;
   private String Combo_mrcomcod_Addnewoptiontext ;
   private String hsh ;
   private String sMode1345 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A1064MRComNom ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV11Station ;
   private String AV27ObtenerEmprCod ;
   private String AV14EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z1062MRPriNom ;
   private String Z1064MRComNom ;
   private String sGXsfl_33_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtMRComCod_Jsonclick ;
   private String edtMRComNom_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridlevel_level1_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean bGXsfl_33_Refreshing=false ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_mrcomcod_Isgriditem ;
   private boolean Combo_mrcomcod_Emptyitem ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_mrcomcod_Enabled ;
   private boolean Combo_mrcomcod_Visible ;
   private boolean Combo_mrcomcod_Allowmultipleselection ;
   private boolean Combo_mrcomcod_Hasdescription ;
   private boolean Combo_mrcomcod_Includeonlyselectedoption ;
   private boolean Combo_mrcomcod_Includeselectalloption ;
   private boolean Combo_mrcomcod_Includeaddnewoption ;
   private boolean n1062MRPriNom ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean n1064MRComNom ;
   private String AV22ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.webpanels.WebSession AV19WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_mrcomcod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T016M7_A407EmprNom ;
   private boolean[] T016M7_n407EmprNom ;
   private String[] T016M8_A1062MRPriNom ;
   private boolean[] T016M8_n1062MRPriNom ;
   private String[] T016M9_A407EmprNom ;
   private boolean[] T016M9_n407EmprNom ;
   private String[] T016M9_A1062MRPriNom ;
   private boolean[] T016M9_n1062MRPriNom ;
   private String[] T016M9_A396EmprCod ;
   private int[] T016M9_A1061MRPriCod ;
   private String[] T016M10_A407EmprNom ;
   private boolean[] T016M10_n407EmprNom ;
   private String[] T016M11_A1062MRPriNom ;
   private boolean[] T016M11_n1062MRPriNom ;
   private String[] T016M12_A396EmprCod ;
   private int[] T016M12_A1061MRPriCod ;
   private String[] T016M6_A396EmprCod ;
   private int[] T016M6_A1061MRPriCod ;
   private String[] T016M13_A396EmprCod ;
   private int[] T016M13_A1061MRPriCod ;
   private String[] T016M14_A396EmprCod ;
   private int[] T016M14_A1061MRPriCod ;
   private String[] T016M5_A396EmprCod ;
   private int[] T016M5_A1061MRPriCod ;
   private String[] T016M17_A407EmprNom ;
   private boolean[] T016M17_n407EmprNom ;
   private String[] T016M18_A1062MRPriNom ;
   private boolean[] T016M18_n1062MRPriNom ;
   private String[] T016M19_A396EmprCod ;
   private int[] T016M19_A1061MRPriCod ;
   private int[] T016M20_A1061MRPriCod ;
   private String[] T016M20_A1064MRComNom ;
   private boolean[] T016M20_n1064MRComNom ;
   private String[] T016M20_A396EmprCod ;
   private int[] T016M20_A1063MRComCod ;
   private String[] T016M4_A1064MRComNom ;
   private boolean[] T016M4_n1064MRComNom ;
   private String[] T016M21_A1064MRComNom ;
   private boolean[] T016M21_n1064MRComNom ;
   private String[] T016M22_A396EmprCod ;
   private int[] T016M22_A1061MRPriCod ;
   private int[] T016M22_A1063MRComCod ;
   private int[] T016M3_A1061MRPriCod ;
   private String[] T016M3_A396EmprCod ;
   private int[] T016M3_A1063MRComCod ;
   private int[] T016M2_A1061MRPriCod ;
   private String[] T016M2_A396EmprCod ;
   private int[] T016M2_A1063MRComCod ;
   private String[] T016M25_A1064MRComNom ;
   private boolean[] T016M25_n1064MRComNom ;
   private String[] T016M26_A396EmprCod ;
   private int[] T016M26_A1061MRPriCod ;
   private int[] T016M26_A1063MRComCod ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20MRComCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV17WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV18TrnContext ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV21DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tmrcom__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrcom__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrcom__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmrcom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T016M2", "SELECT MRPriCod, EmprCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ?  FOR UPDATE OF MRPriCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M3", "SELECT MRPriCod, EmprCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M4", "SELECT MRNom AS MRComNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M5", "SELECT EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ?  FOR UPDATE OF EmprCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M6", "SELECT EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M8", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M9", "SELECT /*+ FIRST_ROWS(100) */ T2.EmprNom, T3.MRNom AS MRPriNom, TM1.EmprCod, TM1.MRPriCod AS MRPriCod FROM ((TXPMRCom TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMREPUE T3 ON T3.EmprCod = TM1.EmprCod AND T3.MRCod = TM1.MRPriCod) WHERE TM1.EmprCod = ? and TM1.MRPriCod = ? ORDER BY TM1.EmprCod, TM1.MRPriCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M10", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M11", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M12", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRPriCod FROM TXPMRCom WHERE EmprCod = ? AND MRPriCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRPriCod FROM TXPMRCom WHERE ( EmprCod > ? or EmprCod = ? and MRPriCod > ?) ORDER BY EmprCod, MRPriCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T016M14", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, MRPriCod FROM TXPMRCom WHERE ( EmprCod < ? or EmprCod = ? and MRPriCod < ?) ORDER BY EmprCod DESC, MRPriCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T016M15", "INSERT INTO TXPMRCom(EmprCod, MRPriCod) VALUES(?, ?)", GX_NOMASK, "TXPMRCom")
         ,new UpdateCursor("T016M16", "DELETE FROM TXPMRCom  WHERE EmprCod = ? AND MRPriCod = ?", GX_NOMASK, "TXPMRCom")
         ,new ForEachCursor("T016M17", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M18", "SELECT MRNom AS MRPriNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, MRPriCod FROM TXPMRCom ORDER BY EmprCod, MRPriCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M20", "SELECT T1.MRPriCod AS MRPriCod, T2.MRNom AS MRComNom, T1.EmprCod, T1.MRComCod AS MRComCod FROM (TXPMRCom1 T1 INNER JOIN TXPMREPUE T2 ON T2.EmprCod = T1.EmprCod AND T2.MRCod = T1.MRComCod) WHERE T1.EmprCod = ? and T1.MRPriCod = ? and T1.MRComCod = ? ORDER BY T1.EmprCod, T1.MRPriCod, T1.MRComCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M21", "SELECT MRNom AS MRComNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M22", "SELECT EmprCod, MRPriCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T016M23", "INSERT INTO TXPMRCom1(MRPriCod, EmprCod, MRComCod) VALUES(?, ?, ?)", GX_NOMASK, "TXPMRCom1")
         ,new UpdateCursor("T016M24", "DELETE FROM TXPMRCom1  WHERE EmprCod = ? AND MRPriCod = ? AND MRComCod = ?", GX_NOMASK, "TXPMRCom1")
         ,new ForEachCursor("T016M25", "SELECT MRNom AS MRComNom FROM TXPMREPUE WHERE EmprCod = ? AND MRCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T016M26", "SELECT EmprCod, MRPriCod, MRComCod FROM TXPMRCom1 WHERE EmprCod = ? and MRPriCod = ? ORDER BY EmprCod, MRPriCod, MRComCod ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(3, 3);
               ((int[]) buf[5])[0] = rslt.getInt(4);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 18 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 100);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 3);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 100);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 21 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

