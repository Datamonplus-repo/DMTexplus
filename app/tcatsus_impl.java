package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tcatsus_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"SUSCATID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13779SUSCDs = httpContext.GetPar( "SUSCDs") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgasuscatid1OL0( A396EmprCod, A13779SUSCDs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"SUSCATID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13779SUSCDs = httpContext.GetPar( "SUSCDs") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxsgasuscatid1OL0( A396EmprCod, A13779SUSCDs) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"SUSCATID") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         h13574SUSCatID = httpContext.GetPar( "h13574SUSCatID") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxhcasuscatid1OL1859( A396EmprCod, h13574SUSCatID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_11") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = httpContext.GetPar( "PrdNum") ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_11( A396EmprCod, A719PrdNum) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_13") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13574SUSCatID = (short)(GXutil.lval( httpContext.GetPar( "SUSCatID"))) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_13( A396EmprCod, A13574SUSCatID) ;
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
            AV34TheList = httpContext.GetPar( "TheList") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TheList", AV34TheList);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTHELIST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34TheList, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Sustancias a controlar en Thelist", ""), (short)(0)) ;
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
      nRC_GXsfl_36 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_36"))) ;
      nGXsfl_36_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_36_idx"))) ;
      sGXsfl_36_idx = httpContext.GetPar( "sGXsfl_36_idx") ;
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

   public tcatsus_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tcatsus_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tcatsus_impl.class ));
   }

   public tcatsus_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkSUSAlarma = UIFactory.getCheckbox(this);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNum_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtPrdNum_Internalname, httpContext.getMessage( "Producto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNum_Internalname, GXutil.rtrim( A719PrdNum), GXutil.rtrim( localUtil.format( A719PrdNum, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNum_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCATSUS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtPrdNom_Internalname+"\"", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtPrdNom_Internalname, GXutil.rtrim( A718PrdNom), GXutil.rtrim( localUtil.format( A718PrdNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtPrdNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtPrdNom_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCATSUS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTheList_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTheList_Internalname, httpContext.getMessage( "THELIST", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtTheList_Internalname, GXutil.rtrim( A13586TheList), GXutil.rtrim( localUtil.format( A13586TheList, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTheList_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtTheList_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TCATSUS.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCATSUS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCATSUS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TCATSUS.htm");
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
      startgridcontrol36( ) ;
      nGXsfl_36_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount1859 = (short)(5) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_1859 = (short)(1) ;
            scanStart1OL1859( ) ;
            while ( RcdFound1859 != 0 )
            {
               init_level_properties1859( ) ;
               getByPrimaryKey1OL1859( ) ;
               addRow1OL1859( ) ;
               scanNext1OL1859( ) ;
            }
            scanEnd1OL1859( ) ;
            nBlankRcdCount1859 = (short)(5) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         standaloneNotModal1OL1859( ) ;
         standaloneModal1OL1859( ) ;
         sMode1859 = Gx_mode ;
         while ( nGXsfl_36_idx < nRC_GXsfl_36 )
         {
            bGXsfl_36_Refreshing = true ;
            readRow1OL1859( ) ;
            edtSUSCatID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUSCATID_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtSUSCatID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSUSCatID_Enabled), 5, 0), !bGXsfl_36_Refreshing);
            chkSUSAlarma.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "SUSALARMA_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
            httpContext.ajax_rsp_assign_prop("", false, chkSUSAlarma.getInternalname(), "Enabled", GXutil.ltrimstr( chkSUSAlarma.getEnabled(), 5, 0), !bGXsfl_36_Refreshing);
            if ( ( nRcdExists_1859 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal1OL1859( ) ;
            }
            sendRow1OL1859( ) ;
            bGXsfl_36_Refreshing = false ;
         }
         Gx_mode = sMode1859 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount1859 = (short)(5) ;
         nRcdExists_1859 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart1OL1859( ) ;
            while ( RcdFound1859 != 0 )
            {
               sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_361859( ) ;
               init_level_properties1859( ) ;
               standaloneNotModal1OL1859( ) ;
               getByPrimaryKey1OL1859( ) ;
               standaloneModal1OL1859( ) ;
               addRow1OL1859( ) ;
               scanNext1OL1859( ) ;
            }
            scanEnd1OL1859( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode1859 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_361859( ) ;
         initAll1OL1859( ) ;
         init_level_properties1859( ) ;
         nRcdExists_1859 = (short)(0) ;
         nIsMod_1859 = (short)(0) ;
         nRcdDeleted_1859 = (short)(0) ;
         nBlankRcdCount1859 = (short)(nBlankRcdUsr1859+nBlankRcdCount1859) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount1859 > 0 )
         {
            standaloneNotModal1OL1859( ) ;
            standaloneModal1OL1859( ) ;
            addRow1OL1859( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtSUSCatID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount1859 = (short)(nBlankRcdCount1859-1) ;
         }
         Gx_mode = sMode1859 ;
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
      e111OL2 ();
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
            Z13586TheList = httpContext.cgiGet( "Z13586TheList") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_36 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_36"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV32EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV33PrdNum = httpContext.cgiGet( "vPRDNUM") ;
            AV34TheList = httpContext.cgiGet( "vTHELIST") ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A13574SUSCatID = (short)(localUtil.ctol( httpContext.cgiGet( "GXHCSUSCATID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13575SUSCatDs = httpContext.cgiGet( "SUSCATDS") ;
            n13575SUSCatDs = false ;
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
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
            A13586TheList = httpContext.cgiGet( edtTheList_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TCATSUS");
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A13586TheList, Z13586TheList) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("tcatsus:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A13586TheList = httpContext.GetPar( "TheList") ;
               httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
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
                  sMode1858 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1858 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1858 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1OL0( ) ;
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
                        e111OL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121OL2 ();
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
         e121OL2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1OL1858( ) ;
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
         disableAttributes1OL1858( ) ;
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

   public void confirm_1OL0( )
   {
      beforeValidate1OL1858( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1OL1858( ) ;
         }
         else
         {
            checkExtendedTable1OL1858( ) ;
            closeExtendedTableCursors1OL1858( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode1858 = Gx_mode ;
         confirm_1OL1859( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode1858 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode1858 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_1OL1859( )
   {
      nGXsfl_36_idx = 0 ;
      while ( nGXsfl_36_idx < nRC_GXsfl_36 )
      {
         readRow1OL1859( ) ;
         if ( ( nRcdExists_1859 != 0 ) || ( nIsMod_1859 != 0 ) )
         {
            getKey1OL1859( ) ;
            if ( ( nRcdExists_1859 == 0 ) && ( nRcdDeleted_1859 == 0 ) )
            {
               if ( RcdFound1859 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate1OL1859( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable1OL1859( ) ;
                     closeExtendedTableCursors1OL1859( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                  }
               }
               else
               {
                  GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSUSCatID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound1859 != 0 )
               {
                  if ( nRcdDeleted_1859 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey1OL1859( ) ;
                     load1OL1859( ) ;
                     beforeValidate1OL1859( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls1OL1859( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_1859 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate1OL1859( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable1OL1859( ) ;
                           closeExtendedTableCursors1OL1859( ) ;
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
                  if ( nRcdDeleted_1859 == 0 )
                  {
                     GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSUSCatID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtSUSCatID_Internalname, h13574SUSCatID) ;
         httpContext.changePostValue( chkSUSAlarma.getInternalname(), ((GXutil.strcmp(A13576SUSAlarma, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z13574SUSCatID_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( Z13574SUSCatID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13576SUSAlarma_"+sGXsfl_36_idx, GXutil.rtrim( Z13576SUSAlarma)) ;
         httpContext.changePostValue( "nRcdDeleted_1859_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1859_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1859_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1859 != 0 )
         {
            httpContext.changePostValue( "SUSCATID_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSUSCatID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUSALARMA_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkSUSAlarma.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption1OL0( )
   {
   }

   public void e111OL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tcatsus_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tcatsus_impl.this.AV32EmprCod = GXv_char2[0] ;
      tcatsus_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcatsus_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tcatsus_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV32EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tcatsus_impl.this.AV32EmprCod = GXv_char4[0] ;
      tcatsus_impl.this.AV11EmprNom = GXv_char3[0] ;
      tcatsus_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32EmprCod", AV32EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV32EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV35WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV35WWPContext = GXv_SdtWWPContext5[0] ;
      AV36TrnContext.fromxml(AV37WebSession.getValue("TrnContext"), null, null);
   }

   public void e121OL2( )
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
         callWebObject(formatLink("app.tcatsusww", new String[] {}, new String[] {}) );
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

   public void zm1OL1858( int GX_JID )
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
         Z13586TheList = A13586TheList ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z407EmprNom = A407EmprNom ;
         Z718PrdNom = A718PrdNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtTheList_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTheList_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTheList_Enabled), 5, 0), true);
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtTheList_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTheList_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTheList_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV32EmprCod)==0) )
      {
         A396EmprCod = AV32EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01OL7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01OL7_A407EmprNom[0] ;
      n407EmprNom = T01OL7_n407EmprNom[0] ;
      pr_default.close(5);
      if ( ! (GXutil.strcmp("", AV33PrdNum)==0) )
      {
         A719PrdNum = AV33PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      }
      if ( ! (GXutil.strcmp("", AV34TheList)==0) )
      {
         A13586TheList = AV34TheList ;
         httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
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
         /* Using cursor T01OL8 */
         pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01OL8_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         pr_default.close(6);
      }
   }

   public void load1OL1858( )
   {
      /* Using cursor T01OL9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1858 = (short)(1) ;
         A407EmprNom = T01OL9_A407EmprNom[0] ;
         n407EmprNom = T01OL9_n407EmprNom[0] ;
         A718PrdNom = T01OL9_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         zm1OL1858( -9) ;
      }
      pr_default.close(7);
      onLoadActions1OL1858( ) ;
   }

   public void onLoadActions1OL1858( )
   {
   }

   public void checkExtendedTable1OL1858( )
   {
      nIsDirty_1858 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01OL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01OL8_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      pr_default.close(6);
   }

   public void closeExtendedTableCursors1OL1858( )
   {
      pr_default.close(6);
   }

   public void enableDisable( )
   {
   }

   public void gxload_11( String A396EmprCod ,
                          String A719PrdNum )
   {
      /* Using cursor T01OL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(8) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A718PrdNom = T01OL10_A718PrdNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A718PrdNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey1OL1858( )
   {
      /* Using cursor T01OL11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound1858 = (short)(1) ;
      }
      else
      {
         RcdFound1858 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01OL6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm1OL1858( 9) ;
         RcdFound1858 = (short)(1) ;
         A13586TheList = T01OL6_A13586TheList[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
         A396EmprCod = T01OL6_A396EmprCod[0] ;
         A719PrdNum = T01OL6_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z13586TheList = A13586TheList ;
         sMode1858 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1OL1858( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1858 = (short)(0) ;
            initializeNonKey1OL1858( ) ;
         }
         Gx_mode = sMode1858 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1858 = (short)(0) ;
         initializeNonKey1OL1858( ) ;
         sMode1858 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1858 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey1OL1858( ) ;
      if ( RcdFound1858 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1858 = (short)(0) ;
      /* Using cursor T01OL12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A13586TheList});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01OL12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01OL12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL12_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01OL12_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01OL12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL12_A13586TheList[0], A13586TheList) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01OL12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01OL12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL12_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01OL12_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01OL12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL12_A13586TheList[0], A13586TheList) > 0 ) ) )
         {
            A396EmprCod = T01OL12_A396EmprCod[0] ;
            A719PrdNum = T01OL12_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A13586TheList = T01OL12_A13586TheList[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
            RcdFound1858 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound1858 = (short)(0) ;
      /* Using cursor T01OL13 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, A719PrdNum, A719PrdNum, A396EmprCod, A13586TheList});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01OL13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01OL13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL13_A719PrdNum[0], A719PrdNum) > 0 ) || ( GXutil.strcmp(T01OL13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01OL13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL13_A13586TheList[0], A13586TheList) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T01OL13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01OL13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL13_A719PrdNum[0], A719PrdNum) < 0 ) || ( GXutil.strcmp(T01OL13_A719PrdNum[0], A719PrdNum) == 0 ) && ( GXutil.strcmp(T01OL13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01OL13_A13586TheList[0], A13586TheList) < 0 ) ) )
         {
            A396EmprCod = T01OL13_A396EmprCod[0] ;
            A719PrdNum = T01OL13_A719PrdNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
            A13586TheList = T01OL13_A13586TheList[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
            RcdFound1858 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1OL1858( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         insert1OL1858( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1858 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A13586TheList, Z13586TheList) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A719PrdNum = Z719PrdNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
               A13586TheList = Z13586TheList ;
               httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
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
               update1OL1858( ) ;
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A13586TheList, Z13586TheList) != 0 ) )
            {
               /* Insert record */
               insert1OL1858( ) ;
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
                  insert1OL1858( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A719PrdNum, Z719PrdNum) != 0 ) || ( GXutil.strcmp(A13586TheList, Z13586TheList) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A719PrdNum = Z719PrdNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13586TheList = Z13586TheList ;
         httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
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

   public void checkOptimisticConcurrency1OL1858( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01OL5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCATSUS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(3) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCATSUS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OL1858( )
   {
      beforeValidate1OL1858( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OL1858( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OL1858( 0) ;
         checkOptimisticConcurrency1OL1858( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OL1858( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OL1858( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OL14 */
                  pr_default.execute(12, new Object[] {A13586TheList, A396EmprCod, A719PrdNum});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSUS");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel1OL1858( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption1OL0( ) ;
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
            load1OL1858( ) ;
         }
         endLevel1OL1858( ) ;
      }
      closeExtendedTableCursors1OL1858( ) ;
   }

   public void update1OL1858( )
   {
      beforeValidate1OL1858( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OL1858( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OL1858( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OL1858( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1OL1858( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table TXPCATSUS */
                  deferredUpdate1OL1858( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel1OL1858( ) ;
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
         endLevel1OL1858( ) ;
      }
      closeExtendedTableCursors1OL1858( ) ;
   }

   public void deferredUpdate1OL1858( )
   {
   }

   public void delete( )
   {
      beforeValidate1OL1858( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OL1858( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OL1858( ) ;
         afterConfirm1OL1858( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OL1858( ) ;
            if ( AnyError == 0 )
            {
               scanStart1OL1859( ) ;
               while ( RcdFound1859 != 0 )
               {
                  getByPrimaryKey1OL1859( ) ;
                  delete1OL1859( ) ;
                  scanNext1OL1859( ) ;
               }
               scanEnd1OL1859( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OL15 */
                  pr_default.execute(13, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSUS");
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
      sMode1858 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OL1858( ) ;
      Gx_mode = sMode1858 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OL1858( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01OL16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
         A718PrdNom = T01OL16_A718PrdNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
         pr_default.close(14);
      }
   }

   public void processNestedLevel1OL1859( )
   {
      nGXsfl_36_idx = 0 ;
      while ( nGXsfl_36_idx < nRC_GXsfl_36 )
      {
         readRow1OL1859( ) ;
         if ( ( nRcdExists_1859 != 0 ) || ( nIsMod_1859 != 0 ) )
         {
            standaloneNotModal1OL1859( ) ;
            getKey1OL1859( ) ;
            if ( ( nRcdExists_1859 == 0 ) && ( nRcdDeleted_1859 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert1OL1859( ) ;
            }
            else
            {
               if ( RcdFound1859 != 0 )
               {
                  if ( ( nRcdDeleted_1859 != 0 ) && ( nRcdExists_1859 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete1OL1859( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_1859 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update1OL1859( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_1859 == 0 )
                  {
                     GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSUSCatID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtSUSCatID_Internalname, h13574SUSCatID) ;
         httpContext.changePostValue( chkSUSAlarma.getInternalname(), ((GXutil.strcmp(A13576SUSAlarma, "N")==0) ? "N" : "S")) ;
         httpContext.changePostValue( "ZT_"+"Z13574SUSCatID_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( Z13574SUSCatID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z13576SUSAlarma_"+sGXsfl_36_idx, GXutil.rtrim( Z13576SUSAlarma)) ;
         httpContext.changePostValue( "nRcdDeleted_1859_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_1859_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_1859_"+sGXsfl_36_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_1859 != 0 )
         {
            httpContext.changePostValue( "SUSCATID_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSUSCatID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "SUSALARMA_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkSUSAlarma.getEnabled(), (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll1OL1859( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_1859 = (short)(0) ;
      nIsMod_1859 = (short)(0) ;
      nRcdDeleted_1859 = (short)(0) ;
   }

   public void processLevel1OL1858( )
   {
      /* Save parent mode. */
      sMode1858 = Gx_mode ;
      processNestedLevel1OL1859( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode1858 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel1OL1858( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1OL1858( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "tcatsus");
         if ( AnyError == 0 )
         {
            confirmValues1OL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "tcatsus");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1OL1858( )
   {
      /* Scan By routine */
      /* Using cursor T01OL17 */
      pr_default.execute(15);
      RcdFound1858 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1858 = (short)(1) ;
         A396EmprCod = T01OL17_A396EmprCod[0] ;
         A719PrdNum = T01OL17_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13586TheList = T01OL17_A13586TheList[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OL1858( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1858 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1858 = (short)(1) ;
         A396EmprCod = T01OL17_A396EmprCod[0] ;
         A719PrdNum = T01OL17_A719PrdNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
         A13586TheList = T01OL17_A13586TheList[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
      }
   }

   public void scanEnd1OL1858( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1OL1858( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OL1858( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OL1858( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OL1858( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OL1858( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OL1858( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OL1858( )
   {
      edtPrdNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Enabled), 5, 0), true);
      edtPrdNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Enabled), 5, 0), true);
      edtTheList_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTheList_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTheList_Enabled), 5, 0), true);
   }

   public void zm1OL1859( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z13576SUSAlarma = T01OL3_A13576SUSAlarma[0] ;
         }
         else
         {
            Z13576SUSAlarma = A13576SUSAlarma ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z719PrdNum = A719PrdNum ;
         Z13586TheList = A13586TheList ;
         Z13576SUSAlarma = A13576SUSAlarma ;
         Z396EmprCod = A396EmprCod ;
         Z13574SUSCatID = A13574SUSCatID ;
         Z13575SUSCatDs = A13575SUSCatDs ;
      }
   }

   public void standaloneNotModal1OL1859( )
   {
   }

   public void standaloneModal1OL1859( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtSUSCatID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSUSCatID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSUSCatID_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      }
      else
      {
         edtSUSCatID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSUSCatID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSUSCatID_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      }
   }

   public void load1OL1859( )
   {
      /* Using cursor T01OL18 */
      pr_default.execute(16, new Object[] {A396EmprCod, A719PrdNum, A13586TheList, Short.valueOf(A13574SUSCatID)});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1859 = (short)(1) ;
         A13575SUSCatDs = T01OL18_A13575SUSCatDs[0] ;
         n13575SUSCatDs = T01OL18_n13575SUSCatDs[0] ;
         A13576SUSAlarma = T01OL18_A13576SUSAlarma[0] ;
         n13576SUSAlarma = T01OL18_n13576SUSAlarma[0] ;
         zm1OL1859( -12) ;
      }
      pr_default.close(16);
      onLoadActions1OL1859( ) ;
   }

   public void onLoadActions1OL1859( )
   {
      /* Using cursor T01OL19 */
      pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A13574SUSCatID)});
      h13574SUSCatID = "" ;
      while ( (pr_default.getStatus(17) != 101) )
      {
         h13574SUSCatID = T01OL19_A13779SUSCDs[0] ;
         if (true) break;
      }
      pr_default.close(17);
      httpContext.ajax_rsp_assign_attri("", false, "h13574SUSCatID", h13574SUSCatID);
   }

   public void checkExtendedTable1OL1859( )
   {
      nIsDirty_1859 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal1OL1859( ) ;
      if ( (GXutil.strcmp("", h13574SUSCatID)==0) )
      {
         nIsDirty_1859 = (short)(1) ;
         A13574SUSCatID = (short)(0) ;
      }
      else
      {
         A13779SUSCDs = h13574SUSCatID ;
         /* Using cursor T01OL20 */
         pr_default.execute(18, new Object[] {A13779SUSCDs, A396EmprCod});
         A396EmprCod = T01OL20_A396EmprCod[0] ;
         A13574SUSCatID = T01OL20_A13574SUSCatID[0] ;
         A13574SUSCatID = T01OL20_A13574SUSCatID[0] ;
         if ( ! ( (pr_default.getStatus(18) == 101) ) )
         {
            pr_default.readNext(18);
            if ( ! ( (pr_default.getStatus(18) == 101) ) )
            {
               GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtSUSCatID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(18);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13574SUSCatID", h13574SUSCatID);
      if ( (GXutil.strcmp("", h13574SUSCatID)==0) )
      {
         nIsDirty_1859 = (short)(1) ;
         A13574SUSCatID = (short)(0) ;
      }
      else
      {
         A13779SUSCDs = h13574SUSCatID ;
         /* Using cursor T01OL21 */
         pr_default.execute(19, new Object[] {A13779SUSCDs, A396EmprCod});
         A13574SUSCatID = T01OL21_A13574SUSCatID[0] ;
         A13574SUSCatID = T01OL21_A13574SUSCatID[0] ;
         if ( ! ( (pr_default.getStatus(19) == 101) ) )
         {
            pr_default.readNext(19);
            if ( ! ( (pr_default.getStatus(19) == 101) ) )
            {
               GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtSUSCatID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(19);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13574SUSCatID", h13574SUSCatID);
      /* Using cursor T01OL4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Short.valueOf(A13574SUSCatID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Sustancias a controlar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSUSCatID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13575SUSCatDs = T01OL4_A13575SUSCatDs[0] ;
      n13575SUSCatDs = T01OL4_n13575SUSCatDs[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors1OL1859( )
   {
      pr_default.close(2);
   }

   public void enableDisable1OL1859( )
   {
   }

   public void gxload_13( String A396EmprCod ,
                          short A13574SUSCatID )
   {
      /* Using cursor T01OL22 */
      pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A13574SUSCatID)});
      if ( (pr_default.getStatus(20) == 101) )
      {
         GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Sustancias a controlar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtSUSCatID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A13575SUSCatDs = T01OL22_A13575SUSCatDs[0] ;
      n13575SUSCatDs = T01OL22_n13575SUSCatDs[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13575SUSCatDs))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(20) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(20);
   }

   public void getKey1OL1859( )
   {
      if ( (GXutil.strcmp("", h13574SUSCatID)==0) )
      {
         A13574SUSCatID = (short)(0) ;
      }
      else
      {
         A13779SUSCDs = h13574SUSCatID ;
         /* Using cursor T01OL23 */
         pr_default.execute(21, new Object[] {A13779SUSCDs, A396EmprCod});
         A396EmprCod = T01OL23_A396EmprCod[0] ;
         A13574SUSCatID = T01OL23_A13574SUSCatID[0] ;
         A13574SUSCatID = T01OL23_A13574SUSCatID[0] ;
         if ( ! ( (pr_default.getStatus(21) == 101) ) )
         {
            pr_default.readNext(21);
            if ( ! ( (pr_default.getStatus(21) == 101) ) )
            {
               GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
               AnyError = (short)(1) ;
               GX_FocusControl = edtSUSCatID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
         }
         pr_default.close(21);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13574SUSCatID", h13574SUSCatID);
      /* Using cursor T01OL24 */
      pr_default.execute(22, new Object[] {A396EmprCod, A719PrdNum, A13586TheList, Short.valueOf(A13574SUSCatID)});
      if ( (pr_default.getStatus(22) != 101) )
      {
         RcdFound1859 = (short)(1) ;
      }
      else
      {
         RcdFound1859 = (short)(0) ;
      }
      pr_default.close(22);
   }

   public void getByPrimaryKey1OL1859( )
   {
      /* Using cursor T01OL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A719PrdNum, A13586TheList, Short.valueOf(A13574SUSCatID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1OL1859( 12) ;
         RcdFound1859 = (short)(1) ;
         initializeNonKey1OL1859( ) ;
         A13576SUSAlarma = T01OL3_A13576SUSAlarma[0] ;
         n13576SUSAlarma = T01OL3_n13576SUSAlarma[0] ;
         A13574SUSCatID = T01OL3_A13574SUSCatID[0] ;
         Z396EmprCod = A396EmprCod ;
         Z719PrdNum = A719PrdNum ;
         Z13586TheList = A13586TheList ;
         Z13574SUSCatID = A13574SUSCatID ;
         sMode1859 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1OL1859( ) ;
         Gx_mode = sMode1859 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1859 = (short)(0) ;
         initializeNonKey1OL1859( ) ;
         sMode1859 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal1OL1859( ) ;
         Gx_mode = sMode1859 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes1OL1859( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency1OL1859( )
   {
      if ( isDlt( ) )
      {
         if ( (GXutil.strcmp("", h13574SUSCatID)==0) )
         {
            A13574SUSCatID = (short)(0) ;
         }
         else
         {
            A13779SUSCDs = h13574SUSCatID ;
            /* Using cursor T01OL25 */
            pr_default.execute(23, new Object[] {A13779SUSCDs, A396EmprCod});
            A396EmprCod = T01OL25_A396EmprCod[0] ;
            A13574SUSCatID = T01OL25_A13574SUSCatID[0] ;
            A13574SUSCatID = T01OL25_A13574SUSCatID[0] ;
            if ( ! ( (pr_default.getStatus(23) == 101) ) )
            {
               pr_default.readNext(23);
               if ( ! ( (pr_default.getStatus(23) == 101) ) )
               {
                  GXCCtl = "SUSCATID_" + sGXsfl_36_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSUSCatID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(23);
         }
         httpContext.ajax_rsp_assign_attri("", false, "h13574SUSCatID", h13574SUSCatID);
      }
      if ( ! isIns( ) )
      {
         /* Using cursor T01OL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A719PrdNum, A13586TheList, Short.valueOf(A13574SUSCatID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCATSU1"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z13576SUSAlarma, T01OL2_A13576SUSAlarma[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z13576SUSAlarma, T01OL2_A13576SUSAlarma[0]) != 0 )
            {
               GXutil.writeLogln("tcatsus:[seudo value changed for attri]"+"SUSAlarma");
               GXutil.writeLogRaw("Old: ",Z13576SUSAlarma);
               GXutil.writeLogRaw("Current: ",T01OL2_A13576SUSAlarma[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCATSU1"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1OL1859( )
   {
      beforeValidate1OL1859( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OL1859( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1OL1859( 0) ;
         checkOptimisticConcurrency1OL1859( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1OL1859( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1OL1859( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01OL26 */
                  pr_default.execute(24, new Object[] {A719PrdNum, A13586TheList, Boolean.valueOf(n13576SUSAlarma), A13576SUSAlarma, A396EmprCod, Short.valueOf(A13574SUSCatID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSU1");
                  if ( (pr_default.getStatus(24) == 1) )
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
            load1OL1859( ) ;
         }
         endLevel1OL1859( ) ;
      }
      closeExtendedTableCursors1OL1859( ) ;
   }

   public void update1OL1859( )
   {
      beforeValidate1OL1859( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1OL1859( ) ;
      }
      if ( ( nIsMod_1859 != 0 ) || ( nIsDirty_1859 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency1OL1859( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm1OL1859( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate1OL1859( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T01OL27 */
                     pr_default.execute(25, new Object[] {Boolean.valueOf(n13576SUSAlarma), A13576SUSAlarma, A396EmprCod, A719PrdNum, A13586TheList, Short.valueOf(A13574SUSCatID)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSU1");
                     if ( (pr_default.getStatus(25) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCATSU1"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate1OL1859( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey1OL1859( ) ;
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
            endLevel1OL1859( ) ;
         }
      }
      closeExtendedTableCursors1OL1859( ) ;
   }

   public void deferredUpdate1OL1859( )
   {
   }

   public void delete1OL1859( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1OL1859( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1OL1859( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1OL1859( ) ;
         afterConfirm1OL1859( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1OL1859( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01OL28 */
               pr_default.execute(26, new Object[] {A396EmprCod, A719PrdNum, A13586TheList, Short.valueOf(A13574SUSCatID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCATSU1");
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
      sMode1859 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1OL1859( ) ;
      Gx_mode = sMode1859 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1OL1859( )
   {
      standaloneModal1OL1859( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01OL29 */
         pr_default.execute(27, new Object[] {A396EmprCod, Short.valueOf(A13574SUSCatID)});
         A13575SUSCatDs = T01OL29_A13575SUSCatDs[0] ;
         n13575SUSCatDs = T01OL29_n13575SUSCatDs[0] ;
         pr_default.close(27);
      }
   }

   public void endLevel1OL1859( )
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

   public void scanStart1OL1859( )
   {
      /* Scan By routine */
      /* Using cursor T01OL30 */
      pr_default.execute(28, new Object[] {A396EmprCod, A719PrdNum, A13586TheList});
      RcdFound1859 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1859 = (short)(1) ;
         A13574SUSCatID = T01OL30_A13574SUSCatID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1OL1859( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound1859 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound1859 = (short)(1) ;
         A13574SUSCatID = T01OL30_A13574SUSCatID[0] ;
      }
   }

   public void scanEnd1OL1859( )
   {
      pr_default.close(28);
   }

   public void afterConfirm1OL1859( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1OL1859( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1OL1859( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1OL1859( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1OL1859( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1OL1859( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1OL1859( )
   {
      edtSUSCatID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSUSCatID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSUSCatID_Enabled), 5, 0), !bGXsfl_36_Refreshing);
      chkSUSAlarma.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkSUSAlarma.getInternalname(), "Enabled", GXutil.ltrimstr( chkSUSAlarma.getEnabled(), 5, 0), !bGXsfl_36_Refreshing);
   }

   public void send_integrity_lvl_hashes1OL1859( )
   {
   }

   public void send_integrity_lvl_hashes1OL1858( )
   {
   }

   public void subsflControlProps_361859( )
   {
      edtSUSCatID_Internalname = "SUSCATID_"+sGXsfl_36_idx ;
      chkSUSAlarma.setInternalname( "SUSALARMA_"+sGXsfl_36_idx );
   }

   public void subsflControlProps_fel_361859( )
   {
      edtSUSCatID_Internalname = "SUSCATID_"+sGXsfl_36_fel_idx ;
      chkSUSAlarma.setInternalname( "SUSALARMA_"+sGXsfl_36_fel_idx );
   }

   public void addRow1OL1859( )
   {
      nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_361859( ) ;
      sendRow1OL1859( ) ;
   }

   public void sendRow1OL1859( )
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
         if ( ((int)((nGXsfl_36_idx) % (2))) == 0 )
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
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1859_" + sGXsfl_36_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_36_idx + "',36)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_level1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtSUSCatID_Internalname,h13574SUSCatID,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtSUSCatID_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtSUSCatID_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Check box */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_1859_" + sGXsfl_36_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_36_idx + "',36)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      GXCCtl = "SUSALARMA_" + sGXsfl_36_idx ;
      chkSUSAlarma.setName( GXCCtl );
      chkSUSAlarma.setWebtags( "" );
      chkSUSAlarma.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkSUSAlarma.getInternalname(), "TitleCaption", chkSUSAlarma.getCaption(), !bGXsfl_36_Refreshing);
      chkSUSAlarma.setCheckedValue( "N" );
      A13576SUSAlarma = ((GXutil.strcmp(GXutil.rtrim( A13576SUSAlarma), "S")==0) ? "S" : "N") ;
      n13576SUSAlarma = false ;
      Gridlevel_level1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkSUSAlarma.getInternalname(),A13576SUSAlarma,"","",Integer.valueOf(-1),Integer.valueOf(chkSUSAlarma.getEnabled()),"S","",StyleString,ClassString,"TrnColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(38, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,38);\""});
      httpContext.ajax_sending_grid_row(Gridlevel_level1Row);
      send_integrity_lvl_hashes1OL1859( ) ;
      GXCCtl = "GXHCSUSCATID_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A13574SUSCatID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13574SUSCatID_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z13574SUSCatID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z13576SUSAlarma_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z13576SUSAlarma));
      GXCCtl = "nRcdDeleted_1859_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_1859_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_1859_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_1859, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_36_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV36TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV36TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV32EmprCod));
      GXCCtl = "vPRDNUM_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV33PrdNum));
      GXCCtl = "vTHELIST_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV34TheList));
      GXCCtl = "EMPRCOD_" + sGXsfl_36_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "SUSCATID_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtSUSCatID_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUSALARMA_"+sGXsfl_36_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( chkSUSAlarma.getEnabled(), (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_level1Container.AddRow(Gridlevel_level1Row);
   }

   public void readRow1OL1859( )
   {
      nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_361859( ) ;
      edtSUSCatID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "SUSCATID_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      chkSUSAlarma.setEnabled( (int)(localUtil.ctol( httpContext.cgiGet( "SUSALARMA_"+sGXsfl_36_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) );
      h13574SUSCatID = httpContext.cgiGet( edtSUSCatID_Internalname) ;
      A13576SUSAlarma = ((GXutil.strcmp(httpContext.cgiGet( chkSUSAlarma.getInternalname()), "S")==0) ? "S" : "N") ;
      n13576SUSAlarma = false ;
      GXCCtl = "GXHCSUSCATID_" + sGXsfl_36_idx ;
      A13574SUSCatID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13574SUSCatID_" + sGXsfl_36_idx ;
      Z13574SUSCatID = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z13576SUSAlarma_" + sGXsfl_36_idx ;
      Z13576SUSAlarma = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "nRcdDeleted_1859_" + sGXsfl_36_idx ;
      nRcdDeleted_1859 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_1859_" + sGXsfl_36_idx ;
      nRcdExists_1859 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_1859_" + sGXsfl_36_idx ;
      nIsMod_1859 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtSUSCatID_Enabled = edtSUSCatID_Enabled ;
   }

   public void confirmValues1OL0( )
   {
      nGXsfl_36_idx = 0 ;
      sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_361859( ) ;
      while ( nGXsfl_36_idx < nRC_GXsfl_36 )
      {
         nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_361859( ) ;
         httpContext.changePostValue( "Z13574SUSCatID_"+sGXsfl_36_idx, httpContext.cgiGet( "ZT_"+"Z13574SUSCatID_"+sGXsfl_36_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13574SUSCatID_"+sGXsfl_36_idx) ;
         httpContext.changePostValue( "Z13576SUSAlarma_"+sGXsfl_36_idx, httpContext.cgiGet( "ZT_"+"Z13576SUSAlarma_"+sGXsfl_36_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z13576SUSAlarma_"+sGXsfl_36_idx) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV34TheList))}, new String[] {"Gx_mode","EmprCod","PrdNum","TheList"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TCATSUS");
      forbiddenHiddens.add("PrdNum", GXutil.rtrim( localUtil.format( A719PrdNum, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("tcatsus:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z719PrdNum", GXutil.rtrim( Z719PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13586TheList", GXutil.rtrim( Z13586TheList));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_36", GXutil.ltrim( localUtil.ntoc( nGXsfl_36_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "vPRDNUM", GXutil.rtrim( AV33PrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRDNUM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33PrdNum, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTHELIST", GXutil.rtrim( AV34TheList));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTHELIST", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34TheList, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCSUSCATID", GXutil.ltrim( localUtil.ntoc( A13574SUSCatID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SUSCATDS", GXutil.rtrim( A13575SUSCatDs));
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
      return formatLink("app.tcatsus", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV32EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV33PrdNum)),GXutil.URLEncode(GXutil.rtrim(AV34TheList))}, new String[] {"Gx_mode","EmprCod","PrdNum","TheList"})  ;
   }

   public String getPgmname( )
   {
      return "TCATSUS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Sustancias a controlar en Thelist", "") ;
   }

   public void initializeNonKey1OL1858( )
   {
      A718PrdNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", A718PrdNom);
   }

   public void initAll1OL1858( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A719PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A719PrdNum", A719PrdNum);
      A13586TheList = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13586TheList", A13586TheList);
      initializeNonKey1OL1858( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey1OL1859( )
   {
      A13575SUSCatDs = "" ;
      n13575SUSCatDs = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13575SUSCatDs", A13575SUSCatDs);
      A13576SUSAlarma = "" ;
      n13576SUSAlarma = false ;
      Z13576SUSAlarma = "" ;
   }

   public void initAll1OL1859( )
   {
      h13574SUSCatID = "" ;
      initializeNonKey1OL1859( ) ;
   }

   public void standaloneModalInsert1OL1859( )
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211671444", true, true);
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
      httpContext.AddJavascriptSource("tcatsus.js", "?20268211671444", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties1859( )
   {
      edtSUSCatID_Enabled = defedtSUSCatID_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtSUSCatID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSUSCatID_Enabled), 5, 0), !bGXsfl_36_Refreshing);
   }

   public void startgridcontrol36( )
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
      Gridlevel_level1Column.AddObjectProperty("Value", h13574SUSCatID);
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtSUSCatID_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_level1Container.AddColumnProperties(Gridlevel_level1Column);
      Gridlevel_level1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_level1Column.AddObjectProperty("Value", GXutil.rtrim( A13576SUSAlarma));
      Gridlevel_level1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkSUSAlarma.getEnabled(), (byte)(5), (byte)(0), ".", "")));
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
      edtTheList_Internalname = "THELIST" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtSUSCatID_Internalname = "SUSCATID" ;
      chkSUSAlarma.setInternalname( "SUSALARMA" );
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
      Form.setCaption( httpContext.getMessage( "Sustancias a controlar en Thelist", "") );
      chkSUSAlarma.setCaption( "" );
      edtSUSCatID_Jsonclick = "" ;
      subGridlevel_level1_Class = "GridNoBorder WorkWith" ;
      subGridlevel_level1_Backcolorstyle = (byte)(0) ;
      chkSUSAlarma.setEnabled( 1 );
      edtSUSCatID_Enabled = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtTheList_Jsonclick = "" ;
      edtTheList_Enabled = 0 ;
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

   public void gxsgasuscatid1OL0( String A396EmprCod ,
                                  String A13779SUSCDs )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgasuscatid_data1OL0( A396EmprCod, A13779SUSCDs) ;
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

   protected void gxsgasuscatid_data1OL0( String A396EmprCod ,
                                          String A13779SUSCDs )
   {
      l13779SUSCDs = GXutil.concat( GXutil.rtrim( A13779SUSCDs), "%", "") ;
      /* Using cursor T01OL31 */
      pr_default.execute(29, new Object[] {A396EmprCod, l13779SUSCDs});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(29) != 101) )
      {
         gxdynajaxctrlcodr.add(T01OL31_A13779SUSCDs[0]);
         gxdynajaxctrldescr.add(T01OL31_A13779SUSCDs[0]);
         pr_default.readNext(29);
      }
      pr_default.close(29);
   }

   public void gxhcasuscatid1OL1859( String A396EmprCod ,
                                     String A13779SUSCDs )
   {
      /* Using cursor T01OL32 */
      pr_default.execute(30, new Object[] {A13779SUSCDs, A396EmprCod});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(30) != 101) )
      {
         gxhchits = (short)(gxhchits+1) ;
         if ( gxhchits > 1 )
         {
            if (true) break;
         }
         A13779SUSCDs = T01OL32_A13779SUSCDs[0] ;
         A396EmprCod = T01OL32_A396EmprCod[0] ;
         A13574SUSCatID = T01OL32_A13574SUSCatID[0] ;
         pr_default.readNext(30);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13574SUSCatID, (byte)(4), (byte)(0), ".", "")))+"\"") ;
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
      pr_default.close(30);
   }

   public void gxnrgridlevel_level1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_361859( ) ;
      while ( nGXsfl_36_idx <= nRC_GXsfl_36 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal1OL1859( ) ;
         standaloneModal1OL1859( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow1OL1859( ) ;
         nGXsfl_36_idx = (int)(nGXsfl_36_idx+1) ;
         sGXsfl_36_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_36_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_361859( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_level1Container)) ;
      /* End function gxnrGridlevel_level1_newrow */
   }

   public void init_web_controls( )
   {
      GXCCtl = "SUSALARMA_" + sGXsfl_36_idx ;
      chkSUSAlarma.setName( GXCCtl );
      chkSUSAlarma.setWebtags( "" );
      chkSUSAlarma.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkSUSAlarma.getInternalname(), "TitleCaption", chkSUSAlarma.getCaption(), !bGXsfl_36_Refreshing);
      chkSUSAlarma.setCheckedValue( "N" );
      A13576SUSAlarma = ((GXutil.strcmp(GXutil.rtrim( A13576SUSAlarma), "S")==0) ? "S" : "N") ;
      n13576SUSAlarma = false ;
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

   public void valid_Prdnum( )
   {
      /* Using cursor T01OL16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PRODUC", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PRDNUM");
         AnyError = (short)(1) ;
         GX_FocusControl = edtPrdNum_Internalname ;
      }
      A718PrdNom = T01OL16_A718PrdNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
   }

   public void valid_Suscatid( )
   {
      n13575SUSCatDs = false ;
      if ( (GXutil.strcmp("", h13574SUSCatID)==0) )
      {
         A13574SUSCatID = (short)(0) ;
      }
      else
      {
         A13779SUSCDs = h13574SUSCatID ;
         /* Using cursor T01OL33 */
         pr_default.execute(31, new Object[] {A13779SUSCDs, A396EmprCod});
         A13574SUSCatID = T01OL33_A13574SUSCatID[0] ;
         A13574SUSCatID = T01OL33_A13574SUSCatID[0] ;
         if ( ! ( (pr_default.getStatus(31) == 101) ) )
         {
            pr_default.readNext(31);
            if ( ! ( (pr_default.getStatus(31) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo-Descripcion", "")}), 1, "SUSCATID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSUSCatID_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(31);
      }
      httpContext.ajax_rsp_assign_attri("", false, "h13574SUSCatID", h13574SUSCatID);
      /* Using cursor T01OL34 */
      pr_default.execute(32, new Object[] {A396EmprCod, Short.valueOf(A13574SUSCatID)});
      if ( (pr_default.getStatus(32) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Sustancias a controlar", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SUSCATID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSUSCatID_Internalname ;
      }
      A13575SUSCatDs = T01OL34_A13575SUSCatDs[0] ;
      n13575SUSCatDs = T01OL34_n13575SUSCatDs[0] ;
      pr_default.close(32);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13574SUSCatID", GXutil.ltrim( localUtil.ntoc( A13574SUSCatID, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A13575SUSCatDs", GXutil.rtrim( A13575SUSCatDs));
      httpContext.ajax_rsp_assign_attri("", false, "h13574SUSCatID", h13574SUSCatID);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV34TheList',fld:'vTHELIST',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33PrdNum',fld:'vPRDNUM',pic:'',hsh:true},{av:'AV34TheList',fld:'vTHELIST',pic:'',hsh:true},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121OL2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV36TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("VALID_THELIST","{handler:'valid_Thelist',iparms:[]");
      setEventMetadata("VALID_THELIST",",oparms:[]}");
      setEventMetadata("VALID_SUSCATID","{handler:'valid_Suscatid',iparms:[{av:'h13574SUSCatID'},{av:'A13574SUSCatID',fld:'SUSCATID',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13575SUSCatDs',fld:'SUSCATDS',pic:''}]");
      setEventMetadata("VALID_SUSCATID",",oparms:[{av:'A13574SUSCatID',fld:'SUSCATID',pic:'ZZZ9'},{av:'A13575SUSCatDs',fld:'SUSCATDS',pic:''},{av:'h13574SUSCatID'}]}");
      setEventMetadata("NULL","{handler:'valid_Susalarma',iparms:[]");
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
      pr_default.close(32);
      pr_default.close(27);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV32EmprCod = "" ;
      wcpOAV33PrdNum = "" ;
      wcpOAV34TheList = "" ;
      Z396EmprCod = "" ;
      Z719PrdNum = "" ;
      Z13586TheList = "" ;
      Z13576SUSAlarma = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13779SUSCDs = "" ;
      h13574SUSCatID = "" ;
      A719PrdNum = "" ;
      Gx_mode = "" ;
      AV32EmprCod = "" ;
      AV33PrdNum = "" ;
      AV34TheList = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A718PrdNom = "" ;
      A13586TheList = "" ;
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      Gridlevel_level1Container = new com.genexus.webpanels.GXWebGrid(context);
      sMode1859 = "" ;
      GX_FocusControl = "" ;
      sStyleString = "" ;
      A407EmprNom = "" ;
      A13575SUSCatDs = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1858 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A13576SUSAlarma = "" ;
      AV12Station = "" ;
      AV11EmprNom = "" ;
      AV8UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV35WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV36TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV37WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z718PrdNom = "" ;
      T01OL7_A407EmprNom = new String[] {""} ;
      T01OL7_n407EmprNom = new boolean[] {false} ;
      T01OL8_A718PrdNom = new String[] {""} ;
      T01OL9_A13586TheList = new String[] {""} ;
      T01OL9_A407EmprNom = new String[] {""} ;
      T01OL9_n407EmprNom = new boolean[] {false} ;
      T01OL9_A718PrdNom = new String[] {""} ;
      T01OL9_A396EmprCod = new String[] {""} ;
      T01OL9_A719PrdNum = new String[] {""} ;
      T01OL10_A718PrdNom = new String[] {""} ;
      T01OL11_A396EmprCod = new String[] {""} ;
      T01OL11_A719PrdNum = new String[] {""} ;
      T01OL11_A13586TheList = new String[] {""} ;
      T01OL6_A13586TheList = new String[] {""} ;
      T01OL6_A396EmprCod = new String[] {""} ;
      T01OL6_A719PrdNum = new String[] {""} ;
      T01OL12_A396EmprCod = new String[] {""} ;
      T01OL12_A719PrdNum = new String[] {""} ;
      T01OL12_A13586TheList = new String[] {""} ;
      T01OL13_A396EmprCod = new String[] {""} ;
      T01OL13_A719PrdNum = new String[] {""} ;
      T01OL13_A13586TheList = new String[] {""} ;
      T01OL5_A13586TheList = new String[] {""} ;
      T01OL5_A396EmprCod = new String[] {""} ;
      T01OL5_A719PrdNum = new String[] {""} ;
      T01OL16_A718PrdNom = new String[] {""} ;
      T01OL17_A396EmprCod = new String[] {""} ;
      T01OL17_A719PrdNum = new String[] {""} ;
      T01OL17_A13586TheList = new String[] {""} ;
      Z13575SUSCatDs = "" ;
      T01OL18_A719PrdNum = new String[] {""} ;
      T01OL18_A13586TheList = new String[] {""} ;
      T01OL18_A13575SUSCatDs = new String[] {""} ;
      T01OL18_n13575SUSCatDs = new boolean[] {false} ;
      T01OL18_A13576SUSAlarma = new String[] {""} ;
      T01OL18_n13576SUSAlarma = new boolean[] {false} ;
      T01OL18_A396EmprCod = new String[] {""} ;
      T01OL18_A13574SUSCatID = new short[1] ;
      T01OL19_A13779SUSCDs = new String[] {""} ;
      T01OL19_A396EmprCod = new String[] {""} ;
      T01OL19_A13574SUSCatID = new short[1] ;
      T01OL20_A13779SUSCDs = new String[] {""} ;
      T01OL20_A396EmprCod = new String[] {""} ;
      T01OL20_A13574SUSCatID = new short[1] ;
      T01OL21_A13779SUSCDs = new String[] {""} ;
      T01OL21_A396EmprCod = new String[] {""} ;
      T01OL21_A13574SUSCatID = new short[1] ;
      T01OL4_A13575SUSCatDs = new String[] {""} ;
      T01OL4_n13575SUSCatDs = new boolean[] {false} ;
      T01OL22_A13575SUSCatDs = new String[] {""} ;
      T01OL22_n13575SUSCatDs = new boolean[] {false} ;
      T01OL23_A13779SUSCDs = new String[] {""} ;
      T01OL23_A396EmprCod = new String[] {""} ;
      T01OL23_A13574SUSCatID = new short[1] ;
      T01OL24_A396EmprCod = new String[] {""} ;
      T01OL24_A719PrdNum = new String[] {""} ;
      T01OL24_A13586TheList = new String[] {""} ;
      T01OL24_A13574SUSCatID = new short[1] ;
      T01OL3_A719PrdNum = new String[] {""} ;
      T01OL3_A13586TheList = new String[] {""} ;
      T01OL3_A13576SUSAlarma = new String[] {""} ;
      T01OL3_n13576SUSAlarma = new boolean[] {false} ;
      T01OL3_A396EmprCod = new String[] {""} ;
      T01OL3_A13574SUSCatID = new short[1] ;
      T01OL25_A13779SUSCDs = new String[] {""} ;
      T01OL25_A396EmprCod = new String[] {""} ;
      T01OL25_A13574SUSCatID = new short[1] ;
      T01OL2_A719PrdNum = new String[] {""} ;
      T01OL2_A13586TheList = new String[] {""} ;
      T01OL2_A13576SUSAlarma = new String[] {""} ;
      T01OL2_n13576SUSAlarma = new boolean[] {false} ;
      T01OL2_A396EmprCod = new String[] {""} ;
      T01OL2_A13574SUSCatID = new short[1] ;
      T01OL29_A13575SUSCatDs = new String[] {""} ;
      T01OL29_n13575SUSCatDs = new boolean[] {false} ;
      T01OL30_A396EmprCod = new String[] {""} ;
      T01OL30_A719PrdNum = new String[] {""} ;
      T01OL30_A13586TheList = new String[] {""} ;
      T01OL30_A13574SUSCatID = new short[1] ;
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
      l13779SUSCDs = "" ;
      T01OL31_A13779SUSCDs = new String[] {""} ;
      T01OL32_A13779SUSCDs = new String[] {""} ;
      T01OL32_A396EmprCod = new String[] {""} ;
      T01OL32_A13574SUSCatID = new short[1] ;
      T01OL33_A13779SUSCDs = new String[] {""} ;
      T01OL33_A396EmprCod = new String[] {""} ;
      T01OL33_A13574SUSCatID = new short[1] ;
      T01OL34_A13575SUSCatDs = new String[] {""} ;
      T01OL34_n13575SUSCatDs = new boolean[] {false} ;
      Zh13574SUSCatID = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.tcatsus__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.tcatsus__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.tcatsus__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.tcatsus__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.tcatsus__default(),
         new Object[] {
             new Object[] {
            T01OL2_A719PrdNum, T01OL2_A13586TheList, T01OL2_A13576SUSAlarma, T01OL2_n13576SUSAlarma, T01OL2_A396EmprCod, T01OL2_A13574SUSCatID
            }
            , new Object[] {
            T01OL3_A719PrdNum, T01OL3_A13586TheList, T01OL3_A13576SUSAlarma, T01OL3_n13576SUSAlarma, T01OL3_A396EmprCod, T01OL3_A13574SUSCatID
            }
            , new Object[] {
            T01OL4_A13575SUSCatDs, T01OL4_n13575SUSCatDs
            }
            , new Object[] {
            T01OL5_A13586TheList, T01OL5_A396EmprCod, T01OL5_A719PrdNum
            }
            , new Object[] {
            T01OL6_A13586TheList, T01OL6_A396EmprCod, T01OL6_A719PrdNum
            }
            , new Object[] {
            T01OL7_A407EmprNom, T01OL7_n407EmprNom
            }
            , new Object[] {
            T01OL8_A718PrdNom
            }
            , new Object[] {
            T01OL9_A13586TheList, T01OL9_A407EmprNom, T01OL9_n407EmprNom, T01OL9_A718PrdNom, T01OL9_A396EmprCod, T01OL9_A719PrdNum
            }
            , new Object[] {
            T01OL10_A718PrdNom
            }
            , new Object[] {
            T01OL11_A396EmprCod, T01OL11_A719PrdNum, T01OL11_A13586TheList
            }
            , new Object[] {
            T01OL12_A396EmprCod, T01OL12_A719PrdNum, T01OL12_A13586TheList
            }
            , new Object[] {
            T01OL13_A396EmprCod, T01OL13_A719PrdNum, T01OL13_A13586TheList
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OL16_A718PrdNom
            }
            , new Object[] {
            T01OL17_A396EmprCod, T01OL17_A719PrdNum, T01OL17_A13586TheList
            }
            , new Object[] {
            T01OL18_A719PrdNum, T01OL18_A13586TheList, T01OL18_A13575SUSCatDs, T01OL18_n13575SUSCatDs, T01OL18_A13576SUSAlarma, T01OL18_n13576SUSAlarma, T01OL18_A396EmprCod, T01OL18_A13574SUSCatID
            }
            , new Object[] {
            T01OL19_A13779SUSCDs, T01OL19_A396EmprCod, T01OL19_A13574SUSCatID
            }
            , new Object[] {
            T01OL20_A13779SUSCDs, T01OL20_A396EmprCod, T01OL20_A13574SUSCatID
            }
            , new Object[] {
            T01OL21_A13779SUSCDs, T01OL21_A396EmprCod, T01OL21_A13574SUSCatID
            }
            , new Object[] {
            T01OL22_A13575SUSCatDs, T01OL22_n13575SUSCatDs
            }
            , new Object[] {
            T01OL23_A13779SUSCDs, T01OL23_A396EmprCod, T01OL23_A13574SUSCatID
            }
            , new Object[] {
            T01OL24_A396EmprCod, T01OL24_A719PrdNum, T01OL24_A13586TheList, T01OL24_A13574SUSCatID
            }
            , new Object[] {
            T01OL25_A13779SUSCDs, T01OL25_A396EmprCod, T01OL25_A13574SUSCatID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01OL29_A13575SUSCatDs, T01OL29_n13575SUSCatDs
            }
            , new Object[] {
            T01OL30_A396EmprCod, T01OL30_A719PrdNum, T01OL30_A13586TheList, T01OL30_A13574SUSCatID
            }
            , new Object[] {
            T01OL31_A13779SUSCDs
            }
            , new Object[] {
            T01OL32_A13779SUSCDs, T01OL32_A396EmprCod, T01OL32_A13574SUSCatID
            }
            , new Object[] {
            T01OL33_A13779SUSCDs, T01OL33_A396EmprCod, T01OL33_A13574SUSCatID
            }
            , new Object[] {
            T01OL34_A13575SUSCatDs, T01OL34_n13575SUSCatDs
            }
         }
      );
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
   private short Z13574SUSCatID ;
   private short nRcdDeleted_1859 ;
   private short nRcdExists_1859 ;
   private short nIsMod_1859 ;
   private short A13574SUSCatID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount1859 ;
   private short RcdFound1859 ;
   private short nBlankRcdUsr1859 ;
   private short RcdFound1858 ;
   private short nIsDirty_1858 ;
   private short nIsDirty_1859 ;
   private short gxhchits ;
   private int nRC_GXsfl_36 ;
   private int nGXsfl_36_idx=1 ;
   private int trnEnded ;
   private int edtPrdNum_Enabled ;
   private int edtPrdNom_Enabled ;
   private int edtTheList_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtSUSCatID_Enabled ;
   private int fRowAdded ;
   private int GX_JID ;
   private int subGridlevel_level1_Backcolor ;
   private int subGridlevel_level1_Allbackcolor ;
   private int defedtSUSCatID_Enabled ;
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
   private String wcpOAV34TheList ;
   private String Z396EmprCod ;
   private String Z719PrdNum ;
   private String Z13586TheList ;
   private String Z13576SUSAlarma ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A719PrdNum ;
   private String Gx_mode ;
   private String AV32EmprCod ;
   private String AV33PrdNum ;
   private String AV34TheList ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String sGXsfl_36_idx="0001" ;
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
   private String A718PrdNom ;
   private String edtPrdNom_Jsonclick ;
   private String edtTheList_Internalname ;
   private String A13586TheList ;
   private String edtTheList_Jsonclick ;
   private String divTableleaflevel_level1_Internalname ;
   private String TempTags ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String sMode1859 ;
   private String edtSUSCatID_Internalname ;
   private String GX_FocusControl ;
   private String sStyleString ;
   private String subGridlevel_level1_Internalname ;
   private String A407EmprNom ;
   private String A13575SUSCatDs ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1858 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A13576SUSAlarma ;
   private String AV12Station ;
   private String AV11EmprNom ;
   private String AV8UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String Z718PrdNom ;
   private String Z13575SUSCatDs ;
   private String sGXsfl_36_fel_idx="0001" ;
   private String subGridlevel_level1_Class ;
   private String subGridlevel_level1_Linesclass ;
   private String ROClassString ;
   private String edtSUSCatID_Jsonclick ;
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
   private boolean bGXsfl_36_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13575SUSCatDs ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private boolean n13576SUSAlarma ;
   private String A13779SUSCDs ;
   private String h13574SUSCatID ;
   private String l13779SUSCDs ;
   private String Zh13574SUSCatID ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_level1Container ;
   private com.genexus.webpanels.GXWebRow Gridlevel_level1Row ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_level1Column ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV37WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkSUSAlarma ;
   private IDataStoreProvider pr_default ;
   private String[] T01OL7_A407EmprNom ;
   private boolean[] T01OL7_n407EmprNom ;
   private String[] T01OL8_A718PrdNom ;
   private String[] T01OL9_A13586TheList ;
   private String[] T01OL9_A407EmprNom ;
   private boolean[] T01OL9_n407EmprNom ;
   private String[] T01OL9_A718PrdNom ;
   private String[] T01OL9_A396EmprCod ;
   private String[] T01OL9_A719PrdNum ;
   private String[] T01OL10_A718PrdNom ;
   private String[] T01OL11_A396EmprCod ;
   private String[] T01OL11_A719PrdNum ;
   private String[] T01OL11_A13586TheList ;
   private String[] T01OL6_A13586TheList ;
   private String[] T01OL6_A396EmprCod ;
   private String[] T01OL6_A719PrdNum ;
   private String[] T01OL12_A396EmprCod ;
   private String[] T01OL12_A719PrdNum ;
   private String[] T01OL12_A13586TheList ;
   private String[] T01OL13_A396EmprCod ;
   private String[] T01OL13_A719PrdNum ;
   private String[] T01OL13_A13586TheList ;
   private String[] T01OL5_A13586TheList ;
   private String[] T01OL5_A396EmprCod ;
   private String[] T01OL5_A719PrdNum ;
   private String[] T01OL16_A718PrdNom ;
   private String[] T01OL17_A396EmprCod ;
   private String[] T01OL17_A719PrdNum ;
   private String[] T01OL17_A13586TheList ;
   private String[] T01OL18_A719PrdNum ;
   private String[] T01OL18_A13586TheList ;
   private String[] T01OL18_A13575SUSCatDs ;
   private boolean[] T01OL18_n13575SUSCatDs ;
   private String[] T01OL18_A13576SUSAlarma ;
   private boolean[] T01OL18_n13576SUSAlarma ;
   private String[] T01OL18_A396EmprCod ;
   private short[] T01OL18_A13574SUSCatID ;
   private String[] T01OL19_A13779SUSCDs ;
   private String[] T01OL19_A396EmprCod ;
   private short[] T01OL19_A13574SUSCatID ;
   private String[] T01OL20_A13779SUSCDs ;
   private String[] T01OL20_A396EmprCod ;
   private short[] T01OL20_A13574SUSCatID ;
   private String[] T01OL21_A13779SUSCDs ;
   private String[] T01OL21_A396EmprCod ;
   private short[] T01OL21_A13574SUSCatID ;
   private String[] T01OL4_A13575SUSCatDs ;
   private boolean[] T01OL4_n13575SUSCatDs ;
   private String[] T01OL22_A13575SUSCatDs ;
   private boolean[] T01OL22_n13575SUSCatDs ;
   private String[] T01OL23_A13779SUSCDs ;
   private String[] T01OL23_A396EmprCod ;
   private short[] T01OL23_A13574SUSCatID ;
   private String[] T01OL24_A396EmprCod ;
   private String[] T01OL24_A719PrdNum ;
   private String[] T01OL24_A13586TheList ;
   private short[] T01OL24_A13574SUSCatID ;
   private String[] T01OL3_A719PrdNum ;
   private String[] T01OL3_A13586TheList ;
   private String[] T01OL3_A13576SUSAlarma ;
   private boolean[] T01OL3_n13576SUSAlarma ;
   private String[] T01OL3_A396EmprCod ;
   private short[] T01OL3_A13574SUSCatID ;
   private String[] T01OL25_A13779SUSCDs ;
   private String[] T01OL25_A396EmprCod ;
   private short[] T01OL25_A13574SUSCatID ;
   private String[] T01OL2_A719PrdNum ;
   private String[] T01OL2_A13586TheList ;
   private String[] T01OL2_A13576SUSAlarma ;
   private boolean[] T01OL2_n13576SUSAlarma ;
   private String[] T01OL2_A396EmprCod ;
   private short[] T01OL2_A13574SUSCatID ;
   private String[] T01OL29_A13575SUSCatDs ;
   private boolean[] T01OL29_n13575SUSCatDs ;
   private String[] T01OL30_A396EmprCod ;
   private String[] T01OL30_A719PrdNum ;
   private String[] T01OL30_A13586TheList ;
   private short[] T01OL30_A13574SUSCatID ;
   private String[] T01OL31_A13779SUSCDs ;
   private String[] T01OL32_A13779SUSCDs ;
   private String[] T01OL32_A396EmprCod ;
   private short[] T01OL32_A13574SUSCatID ;
   private String[] T01OL33_A13779SUSCDs ;
   private String[] T01OL33_A396EmprCod ;
   private short[] T01OL33_A13574SUSCatID ;
   private String[] T01OL34_A13575SUSCatDs ;
   private boolean[] T01OL34_n13575SUSCatDs ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV35WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV36TrnContext ;
}

final  class tcatsus__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcatsus__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcatsus__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcatsus__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tcatsus__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01OL2", "SELECT PrdNum, TheList, SUSAlarma, EmprCod, SUSCatID FROM TXPCATSU1 WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? AND SUSCatID = ?  FOR UPDATE OF SUSAlarma NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL3", "SELECT PrdNum, TheList, SUSAlarma, EmprCod, SUSCatID FROM TXPCATSU1 WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? AND SUSCatID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL4", "SELECT SUSCatDs FROM TXPSUSTAN WHERE EmprCod = ? AND SUSCatID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL5", "SELECT TheList, EmprCod, PrdNum FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ? AND TheList = ?  FOR UPDATE OF TheList NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL6", "SELECT TheList, EmprCod, PrdNum FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL8", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL9", "SELECT /*+ FIRST_ROWS(100) */ TM1.TheList, T2.EmprNom, T3.PrdNom, TM1.EmprCod, TM1.PrdNum FROM ((TXPCATSUS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = TM1.EmprCod AND T3.PrdNum = TM1.PrdNum) WHERE TM1.EmprCod = ? and TM1.PrdNum = ? and TM1.TheList = ? ORDER BY TM1.EmprCod, TM1.PrdNum, TM1.TheList ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL10", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE ( EmprCod > ? or EmprCod = ? and PrdNum > ? or PrdNum = ? and EmprCod = ? and TheList > ?) ORDER BY EmprCod, PrdNum, TheList) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01OL13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, PrdNum, TheList FROM TXPCATSUS WHERE ( EmprCod < ? or EmprCod = ? and PrdNum < ? or PrdNum = ? and EmprCod = ? and TheList < ?) ORDER BY EmprCod DESC, PrdNum DESC, TheList DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01OL14", "INSERT INTO TXPCATSUS(TheList, EmprCod, PrdNum) VALUES(?, ?, ?)", GX_NOMASK, "TXPCATSUS")
         ,new UpdateCursor("T01OL15", "DELETE FROM TXPCATSUS  WHERE EmprCod = ? AND PrdNum = ? AND TheList = ?", GX_NOMASK, "TXPCATSUS")
         ,new ForEachCursor("T01OL16", "SELECT PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, PrdNum, TheList FROM TXPCATSUS ORDER BY EmprCod, PrdNum, TheList ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL18", "SELECT T1.PrdNum, T1.TheList, T2.SUSCatDs, T1.SUSAlarma, T1.EmprCod, T1.SUSCatID FROM (TXPCATSU1 T1 INNER JOIN TXPSUSTAN T2 ON T2.EmprCod = T1.EmprCod AND T2.SUSCatID = T1.SUSCatID) WHERE T1.EmprCod = ? and T1.PrdNum = ? and T1.TheList = ? and T1.SUSCatID = ? ORDER BY T1.EmprCod, T1.PrdNum, T1.TheList, T1.SUSCatID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL19", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs, EmprCod, SUSCatID FROM TXPSUSTAN WHERE (EmprCod = ?) AND (SUSCatID = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL20", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs, EmprCod, SUSCatID FROM TXPSUSTAN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL21", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs, EmprCod, SUSCatID FROM TXPSUSTAN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL22", "SELECT SUSCatDs FROM TXPSUSTAN WHERE EmprCod = ? AND SUSCatID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL23", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs, EmprCod, SUSCatID FROM TXPSUSTAN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL24", "SELECT EmprCod, PrdNum, TheList, SUSCatID FROM TXPCATSU1 WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? AND SUSCatID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL25", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs, EmprCod, SUSCatID FROM TXPSUSTAN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T01OL26", "INSERT INTO TXPCATSU1(PrdNum, TheList, SUSAlarma, EmprCod, SUSCatID) VALUES(?, ?, ?, ?, ?)", GX_NOMASK, "TXPCATSU1")
         ,new UpdateCursor("T01OL27", "UPDATE TXPCATSU1 SET SUSAlarma=?  WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? AND SUSCatID = ?", GX_NOMASK, "TXPCATSU1")
         ,new UpdateCursor("T01OL28", "DELETE FROM TXPCATSU1  WHERE EmprCod = ? AND PrdNum = ? AND TheList = ? AND SUSCatID = ?", GX_NOMASK, "TXPCATSU1")
         ,new ForEachCursor("T01OL29", "SELECT SUSCatDs FROM TXPSUSTAN WHERE EmprCod = ? AND SUSCatID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL30", "SELECT EmprCod, PrdNum, TheList, SUSCatID FROM TXPCATSU1 WHERE EmprCod = ? and PrdNum = ? and TheList = ? ORDER BY EmprCod, PrdNum, TheList, SUSCatID ",true, GX_NOMASK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL31", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs FROM TXPSUSTAN WHERE (EmprCod = ?) AND (UPPER(RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, '')))) like '%' || UPPER(?))) WHERE rownum <= 5 ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL32", "SELECT RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs, EmprCod, SUSCatID FROM TXPSUSTAN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL33", "SELECT /*+ FIRST_ROWS */ RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) AS SUSCDs, EmprCod, SUSCatID FROM TXPSUSTAN WHERE (RTRIM(LTRIM(SUBSTR(TO_CHAR(SUSCatID,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( SUSCatDs, ''))) = ?) AND (EmprCod = ?) ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01OL34", "SELECT SUSCatDs FROM TXPSUSTAN WHERE EmprCod = ? AND SUSCatID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((short[]) buf[5])[0] = rslt.getShort(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 4);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 26);
               ((String[]) buf[4])[0] = rslt.getString(4, 3);
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 26);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 4);
               ((String[]) buf[2])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 3);
               ((short[]) buf[7])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 27 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
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
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 31 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 32 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 4);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 4);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 6);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 23 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 4);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 1);
               }
               stmt.setString(4, (String)parms[4], 3);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 25 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               stmt.setString(4, (String)parms[4], 4);
               stmt.setShort(5, ((Number) parms[5]).shortValue());
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
            case 27 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 28 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 4);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setVarchar(2, (String)parms[1], 60);
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
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 31 :
               stmt.setVarchar(1, (String)parms[0], 60);
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

