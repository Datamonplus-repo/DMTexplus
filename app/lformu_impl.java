package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class lformu_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_27") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A764ProForCod = httpContext.GetPar( "ProForCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_27( A396EmprCod, A764ProForCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_28") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = httpContext.GetPar( "ForSer") ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = httpContext.GetPar( "ForColNom") ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_28( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod) ;
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
            AV7EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
            AV8CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CliCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
            AV9ForSer = httpContext.GetPar( "ForSer") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ForSer", AV9ForSer);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ForSer, ""))));
            AV10ForColNom = httpContext.GetPar( "ForColNom") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10ForColNom", AV10ForColNom);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ForColNom, ""))));
            AV11ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11ForColNum), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ForColNum), "ZZZZZ9")));
            AV12TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12TipColCod), 2, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
            AV13ProForL = (short)(GXutil.lval( httpContext.GetPar( "ProForL"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13ProForL), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13ProForL), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Procesos Quimicos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public lformu_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public lformu_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( lformu_impl.class ));
   }

   public lformu_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForL_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForL_Internalname, "#", " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForL_Internalname, GXutil.ltrim( localUtil.ntoc( A1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForL_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForL_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForL_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedproforcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockproforcod_Internalname, httpContext.getMessage( "Proceso", ""), "", "", lblTextblockproforcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_proforcod.setProperty("Caption", Combo_proforcod_Caption);
      ucCombo_proforcod.setProperty("Cls", Combo_proforcod_Cls);
      ucCombo_proforcod.setProperty("EmptyItem", Combo_proforcod_Emptyitem);
      ucCombo_proforcod.setProperty("DropDownOptionsData", AV19ProForCod_Data);
      ucCombo_proforcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_proforcod_Internalname, "COMBO_PROFORCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForCod_Internalname, GXutil.rtrim( A764ProForCod), GXutil.rtrim( localUtil.format( A764ProForCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForCod_Jsonclick, 0, "Attribute", "", "", "", "", edtProForCod_Visible, edtProForCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForFR_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForFR_Internalname, httpContext.getMessage( "Rb/Fab", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForFR_Internalname, GXutil.rtrim( A6549ProForFR), GXutil.rtrim( localUtil.format( A6549ProForFR, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForFR_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForFR_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProFoNPrg_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProFoNPrg_Internalname, httpContext.getMessage( "Nº Programa", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProFoNPrg_Internalname, GXutil.ltrim( localUtil.ntoc( A7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProFoNPrg_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A7802ProFoNPrg), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A7802ProFoNPrg), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProFoNPrg_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProFoNPrg_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProForrbn_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProForrbn_Internalname, httpContext.getMessage( "Rb", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForrbn_Internalname, GXutil.ltrim( localUtil.ntoc( A8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForrbn_Enabled!=0) ? localUtil.format( A8656ProForrbn, "ZZ9.99") : localUtil.format( A8656ProForrbn, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForrbn_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProForrbn_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_LFORMU.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_proforcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboproforcod_Internalname, GXutil.rtrim( AV21ComboProForCod), GXutil.rtrim( localUtil.format( AV21ComboProForCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboproforcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboproforcod_Visible, edtavComboproforcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForSer_Internalname, GXutil.rtrim( A494ForSer), GXutil.rtrim( localUtil.format( A494ForSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForSer_Jsonclick, 0, "Attribute", "", "", "", "", edtForSer_Visible, edtForSer_Enabled, 1, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNom_Internalname, GXutil.rtrim( A482ForColNom), GXutil.rtrim( localUtil.format( A482ForColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNom_Jsonclick, 0, "Attribute", "", "", "", "", edtForColNom_Visible, edtForColNom_Enabled, 1, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtForColNum_Internalname, GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtForColNum_Jsonclick, 0, "Attribute", "", "", "", "", edtForColNum_Visible, edtForColNum_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTipColCod_Internalname, GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTipColCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTipColCod_Visible, edtTipColCod_Enabled, 1, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForDsc_Internalname, GXutil.rtrim( A766ProForDsc), GXutil.rtrim( localUtil.format( A766ProForDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtProForDsc_Visible, edtProForDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForVol_Internalname, GXutil.ltrim( localUtil.ntoc( A9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForVol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A9704ProForVol), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A9704ProForVol), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForVol_Jsonclick, 0, "Attribute", "", "", "", "", edtProForVol_Visible, edtProForVol_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForMq_Internalname, GXutil.rtrim( A9707ProForMq), GXutil.rtrim( localUtil.format( A9707ProForMq, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForMq_Jsonclick, 0, "Attribute", "", "", "", "", edtProForMq_Visible, edtProForMq_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForH2O_Internalname, GXutil.ltrim( localUtil.ntoc( A10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProForH2O_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10542ProForH2O), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10542ProForH2O), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForH2O_Jsonclick, 0, "Attribute", "", "", "", "", edtProForH2O_Visible, edtProForH2O_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_LFORMU.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProForAct_Internalname, GXutil.rtrim( A13133ProForAct), GXutil.rtrim( localUtil.format( A13133ProForAct, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProForAct_Jsonclick, 0, "Attribute", "", "", "", "", edtProForAct_Visible, edtProForAct_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_LFORMU.htm");
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
      e111QM2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPROFORCOD_DATA"), AV19ProForCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z494ForSer = httpContext.cgiGet( "Z494ForSer") ;
            Z482ForColNom = httpContext.cgiGet( "Z482ForColNom") ;
            Z483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "Z483ForColNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "Z831TipColCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( "Z1160ProForL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6549ProForFR = httpContext.cgiGet( "Z6549ProForFR") ;
            Z7802ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( "Z7802ProFoNPrg"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8656ProForrbn = localUtil.ctond( httpContext.cgiGet( "Z8656ProForrbn")) ;
            Z9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( "Z9704ProForVol"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9707ProForMq = httpContext.cgiGet( "Z9707ProForMq") ;
            Z10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( "Z10542ProForH2O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z764ProForCod = httpContext.cgiGet( "Z764ProForCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N764ProForCod = httpContext.cgiGet( "N764ProForCod") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV9ForSer = httpContext.cgiGet( "vFORSER") ;
            AV10ForColNom = httpContext.cgiGet( "vFORCOLNOM") ;
            AV11ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( "vFORCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( "vTIPCOLCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13ProForL = (short)(localUtil.ctol( httpContext.cgiGet( "vPROFORL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Insert_ProForCod = httpContext.cgiGet( "vINSERT_PROFORCOD") ;
            A2838ForRelBan = localUtil.ctond( httpContext.cgiGet( "FORRELBAN")) ;
            n2838ForRelBan = false ;
            Combo_proforcod_Objectcall = httpContext.cgiGet( "COMBO_PROFORCOD_Objectcall") ;
            Combo_proforcod_Class = httpContext.cgiGet( "COMBO_PROFORCOD_Class") ;
            Combo_proforcod_Icontype = httpContext.cgiGet( "COMBO_PROFORCOD_Icontype") ;
            Combo_proforcod_Icon = httpContext.cgiGet( "COMBO_PROFORCOD_Icon") ;
            Combo_proforcod_Caption = httpContext.cgiGet( "COMBO_PROFORCOD_Caption") ;
            Combo_proforcod_Tooltip = httpContext.cgiGet( "COMBO_PROFORCOD_Tooltip") ;
            Combo_proforcod_Cls = httpContext.cgiGet( "COMBO_PROFORCOD_Cls") ;
            Combo_proforcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_set") ;
            Combo_proforcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedvalue_get") ;
            Combo_proforcod_Selectedtext_set = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_set") ;
            Combo_proforcod_Selectedtext_get = httpContext.cgiGet( "COMBO_PROFORCOD_Selectedtext_get") ;
            Combo_proforcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_PROFORCOD_Gamoauthtoken") ;
            Combo_proforcod_Ddointernalname = httpContext.cgiGet( "COMBO_PROFORCOD_Ddointernalname") ;
            Combo_proforcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolalign") ;
            Combo_proforcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PROFORCOD_Dropdownoptionstype") ;
            Combo_proforcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Enabled")) ;
            Combo_proforcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Visible")) ;
            Combo_proforcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PROFORCOD_Titlecontrolidtoreplace") ;
            Combo_proforcod_Datalisttype = httpContext.cgiGet( "COMBO_PROFORCOD_Datalisttype") ;
            Combo_proforcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Allowmultipleselection")) ;
            Combo_proforcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistfixedvalues") ;
            Combo_proforcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Isgriditem")) ;
            Combo_proforcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Hasdescription")) ;
            Combo_proforcod_Datalistproc = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistproc") ;
            Combo_proforcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PROFORCOD_Datalistprocparametersprefix") ;
            Combo_proforcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PROFORCOD_Remoteservicesparameters") ;
            Combo_proforcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PROFORCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_proforcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeonlyselectedoption")) ;
            Combo_proforcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeselectalloption")) ;
            Combo_proforcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitem")) ;
            Combo_proforcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PROFORCOD_Includeaddnewoption")) ;
            Combo_proforcod_Htmltemplate = httpContext.cgiGet( "COMBO_PROFORCOD_Htmltemplate") ;
            Combo_proforcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluestype") ;
            Combo_proforcod_Loadingdata = httpContext.cgiGet( "COMBO_PROFORCOD_Loadingdata") ;
            Combo_proforcod_Noresultsfound = httpContext.cgiGet( "COMBO_PROFORCOD_Noresultsfound") ;
            Combo_proforcod_Emptyitemtext = httpContext.cgiGet( "COMBO_PROFORCOD_Emptyitemtext") ;
            Combo_proforcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PROFORCOD_Onlyselectedvalues") ;
            Combo_proforcod_Selectalltext = httpContext.cgiGet( "COMBO_PROFORCOD_Selectalltext") ;
            Combo_proforcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PROFORCOD_Multiplevaluesseparator") ;
            Combo_proforcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_PROFORCOD_Addnewoptiontext") ;
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
            Barradeprogreso_Objectcall = httpContext.cgiGet( "BARRADEPROGRESO_Objectcall") ;
            Barradeprogreso_Class = httpContext.cgiGet( "BARRADEPROGRESO_Class") ;
            Barradeprogreso_Enabled = GXutil.strtobool( httpContext.cgiGet( "BARRADEPROGRESO_Enabled")) ;
            Barradeprogreso_Height = httpContext.cgiGet( "BARRADEPROGRESO_Height") ;
            Barradeprogreso_Width = httpContext.cgiGet( "BARRADEPROGRESO_Width") ;
            Barradeprogreso_Visible = GXutil.strtobool( httpContext.cgiGet( "BARRADEPROGRESO_Visible")) ;
            /* Read variables values. */
            A1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
            A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
            A6549ProForFR = httpContext.cgiGet( edtProForFR_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6549ProForFR", A6549ProForFR);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFONPRG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProFoNPrg_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A7802ProFoNPrg = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A7802ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7802ProFoNPrg), 5, 0));
            }
            else
            {
               A7802ProFoNPrg = (int)(localUtil.ctol( httpContext.cgiGet( edtProFoNPrg_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A7802ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7802ProFoNPrg), 5, 0));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORRBN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForrbn_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A8656ProForrbn = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, "A8656ProForrbn", GXutil.ltrimstr( A8656ProForrbn, 6, 2));
            }
            else
            {
               A8656ProForrbn = localUtil.ctond( httpContext.cgiGet( edtProForrbn_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8656ProForrbn", GXutil.ltrimstr( A8656ProForrbn, 6, 2));
            }
            AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
            AV21ComboProForCod = httpContext.cgiGet( edtavComboproforcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21ComboProForCod", AV21ComboProForCod);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CLICOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCliCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252CliCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            else
            {
               A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            }
            A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "FORCOLNUM");
               AnyError = (short)(1) ;
               GX_FocusControl = edtForColNum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A483ForColNum = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            }
            else
            {
               A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TIPCOLCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTipColCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A831TipColCod = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            else
            {
               A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            }
            A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORVOL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForVol_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A9704ProForVol = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A9704ProForVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9704ProForVol), 5, 0));
            }
            else
            {
               A9704ProForVol = (int)(localUtil.ctol( httpContext.cgiGet( edtProForVol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A9704ProForVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9704ProForVol), 5, 0));
            }
            A9707ProForMq = httpContext.cgiGet( edtProForMq_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A9707ProForMq", A9707ProForMq);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProForH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProForH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PROFORH2O");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProForH2O_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10542ProForH2O = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
            }
            else
            {
               A10542ProForH2O = (short)(localUtil.ctol( httpContext.cgiGet( edtProForH2O_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
            }
            A13133ProForAct = httpContext.cgiGet( edtProForAct_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"LFORMU");
            A1160ProForL = (short)(localUtil.ctol( httpContext.cgiGet( edtProForL_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
            forbiddenHiddens.add("ProForL", localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV27Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( A1160ProForL != Z1160ProForL ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("lformu:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = httpContext.GetPar( "ForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = httpContext.GetPar( "ForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = (int)(GXutil.lval( httpContext.GetPar( "ForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = (byte)(GXutil.lval( httpContext.GetPar( "TipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A1160ProForL = (short)(GXutil.lval( httpContext.GetPar( "ProForL"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
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
                  sMode154 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode154 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound154 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1QM0( ) ;
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
                        e111QM2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121QM2 ();
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
         e121QM2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1QM154( ) ;
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
         disableAttributes1QM154( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforcod_Enabled), 5, 0), true);
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

   public void confirm_1QM0( )
   {
      beforeValidate1QM154( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1QM154( ) ;
         }
         else
         {
            checkExtendedTable1QM154( ) ;
            closeExtendedTableCursors1QM154( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1QM0( )
   {
   }

   public void e111QM2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      lformu_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22Station, ""))));
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      lformu_impl.this.AV7EmprCod = GXv_char2[0] ;
      lformu_impl.this.AV23EmprNom = GXv_char3[0] ;
      lformu_impl.this.AV24UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprNom", AV23EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV24UsurCod", AV24UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24UsurCod, "@!"))));
      GXv_SdtWWPContext5[0] = AV14WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV14WWPContext = GXv_SdtWWPContext5[0] ;
      edtProForCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Visible), 5, 0), true);
      AV21ComboProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboProForCod", AV21ComboProForCod);
      edtavComboproforcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPROFORCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV15TrnContext.fromxml(AV16WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV15TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV27Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV28GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GXV1), 8, 0));
         while ( AV28GXV1 <= AV15TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV18TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV15TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV28GXV1));
            if ( GXutil.strcmp(AV18TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ProForCod") == 0 )
            {
               AV17Insert_ProForCod = AV18TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_ProForCod", AV17Insert_ProForCod);
               if ( ! (GXutil.strcmp("", AV17Insert_ProForCod)==0) )
               {
                  AV21ComboProForCod = AV17Insert_ProForCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV21ComboProForCod", AV21ComboProForCod);
                  Combo_proforcod_Selectedvalue_set = AV21ComboProForCod ;
                  ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
                  Combo_proforcod_Enabled = false ;
                  ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "Enabled", GXutil.booltostr( Combo_proforcod_Enabled));
               }
            }
            AV28GXV1 = (int)(AV28GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      edtForSer_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Visible), 5, 0), true);
      edtForColNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Visible), 5, 0), true);
      edtForColNum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Visible), 5, 0), true);
      edtTipColCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Visible), 5, 0), true);
      edtProForDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Visible), 5, 0), true);
      edtProForVol_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForVol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForVol_Visible), 5, 0), true);
      edtProForMq_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMq_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMq_Visible), 5, 0), true);
      edtProForH2O_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForH2O_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForH2O_Visible), 5, 0), true);
      edtProForAct_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAct_Visible), 5, 0), true);
      GXt_int6 = (byte)(AV25MForEq) ;
      GXv_int7[0] = GXt_int6 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "MFOREQ", ""), GXv_int7) ;
      lformu_impl.this.GXt_int6 = GXv_int7[0] ;
      AV25MForEq = GXt_int6 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25MForEq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25MForEq), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25MForEq), "ZZZ9")));
   }

   public void e121QM2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, AV24UsurCod, AV22Station) ;
      if ( AV25MForEq == 1 )
      {
         GXv_char4[0] = A396EmprCod ;
         GXv_int8[0] = A252CliCod ;
         GXv_char3[0] = A494ForSer ;
         GXv_char2[0] = A482ForColNom ;
         GXv_int9[0] = A483ForColNum ;
         GXv_int7[0] = A831TipColCod ;
         new app.gestionlaboratorio.pmforeq(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_int9, GXv_int7) ;
         lformu_impl.this.A396EmprCod = GXv_char4[0] ;
         lformu_impl.this.A252CliCod = GXv_int8[0] ;
         lformu_impl.this.A494ForSer = GXv_char3[0] ;
         lformu_impl.this.A482ForColNom = GXv_char2[0] ;
         lformu_impl.this.A483ForColNum = GXv_int9[0] ;
         lformu_impl.this.A831TipColCod = GXv_int7[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      new app.formulaciontinte.reorganizoforultlin(remoteHandle, context).execute( A396EmprCod, A252CliCod, A494ForSer, A482ForColNom, A483ForColNum, A831TipColCod, AV24UsurCod, AV22Station) ;
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char4[0] = A396EmprCod ;
      GXv_int9[0] = A252CliCod ;
      GXv_char3[0] = A494ForSer ;
      GXv_char2[0] = A482ForColNom ;
      GXv_int8[0] = A483ForColNum ;
      GXv_int7[0] = A831TipColCod ;
      GXv_decimal10[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int11[0] = (int)(DecimalUtil.decToDouble(A2838ForRelBan)) ;
      GXv_char12[0] = " " ;
      GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int9, GXv_char3, GXv_char2, GXv_int8, GXv_int7, GXv_decimal10, GXv_int11, GXv_char12, GXv_decimal13) ;
      lformu_impl.this.A396EmprCod = GXv_char4[0] ;
      lformu_impl.this.A252CliCod = GXv_int9[0] ;
      lformu_impl.this.A494ForSer = GXv_char3[0] ;
      lformu_impl.this.A482ForColNom = GXv_char2[0] ;
      lformu_impl.this.A483ForColNum = GXv_int8[0] ;
      lformu_impl.this.A831TipColCod = GXv_int7[0] ;
      lformu_impl.this.A2838ForRelBan = DecimalUtil.doubleToDec(GXv_int11[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
      GXv_char12[0] = A396EmprCod ;
      GXv_char4[0] = AV22Station ;
      GXv_decimal13[0] = AV26Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char12, GXv_char4, GXv_decimal13) ;
      lformu_impl.this.A396EmprCod = GXv_char12[0] ;
      lformu_impl.this.AV22Station = GXv_char4[0] ;
      lformu_impl.this.AV26Valor_cor = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22Station, ""))));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Valor_cor", GXutil.ltrimstr( AV26Valor_cor, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV26Valor_cor, "ZZZZ9.99999")));
      GXv_char12[0] = A396EmprCod ;
      GXv_int11[0] = A252CliCod ;
      GXv_char4[0] = A494ForSer ;
      GXv_char3[0] = A482ForColNom ;
      GXv_int9[0] = A483ForColNum ;
      GXv_int7[0] = A831TipColCod ;
      GXv_decimal13[0] = AV26Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char12, GXv_int11, GXv_char4, GXv_char3, GXv_int9, GXv_int7, GXv_decimal13) ;
      lformu_impl.this.A396EmprCod = GXv_char12[0] ;
      lformu_impl.this.A252CliCod = GXv_int11[0] ;
      lformu_impl.this.A494ForSer = GXv_char4[0] ;
      lformu_impl.this.A482ForColNom = GXv_char3[0] ;
      lformu_impl.this.A483ForColNum = GXv_int9[0] ;
      lformu_impl.this.A831TipColCod = GXv_int7[0] ;
      lformu_impl.this.AV26Valor_cor = GXv_decimal13[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Valor_cor", GXutil.ltrimstr( AV26Valor_cor, 11, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV26Valor_cor, "ZZZZ9.99999")));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV26Valor_cor, 11, 5) );
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LOADCOMBOPROFORCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = AV19ProForCod_Data ;
      GXv_char12[0] = AV20ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item15[0] = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      new app.lformuloaddvcombo(remoteHandle, context).execute( "ProForCod", Gx_mode, AV7EmprCod, AV8CliCod, AV9ForSer, AV10ForColNom, AV11ForColNum, AV12TipColCod, AV13ProForL, GXv_char12, GXv_objcol_SdtDVB_SDTComboData_Item15) ;
      lformu_impl.this.AV20ComboSelectedValue = GXv_char12[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = GXv_objcol_SdtDVB_SDTComboData_Item15[0] ;
      AV19ProForCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item14 ;
      Combo_proforcod_Selectedvalue_set = AV20ComboSelectedValue ;
      ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "SelectedValue_set", Combo_proforcod_Selectedvalue_set);
      AV21ComboProForCod = AV20ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ComboProForCod", AV21ComboProForCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_proforcod_Enabled = false ;
         ucCombo_proforcod.sendProperty(context, "", false, Combo_proforcod_Internalname, "Enabled", GXutil.booltostr( Combo_proforcod_Enabled));
      }
   }

   public void zm1QM154( int GX_JID )
   {
      if ( ( GX_JID == 26 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6549ProForFR = T01QM3_A6549ProForFR[0] ;
            Z7802ProFoNPrg = T01QM3_A7802ProFoNPrg[0] ;
            Z8656ProForrbn = T01QM3_A8656ProForrbn[0] ;
            Z9704ProForVol = T01QM3_A9704ProForVol[0] ;
            Z9707ProForMq = T01QM3_A9707ProForMq[0] ;
            Z10542ProForH2O = T01QM3_A10542ProForH2O[0] ;
            Z764ProForCod = T01QM3_A764ProForCod[0] ;
         }
         else
         {
            Z6549ProForFR = A6549ProForFR ;
            Z7802ProFoNPrg = A7802ProFoNPrg ;
            Z8656ProForrbn = A8656ProForrbn ;
            Z9704ProForVol = A9704ProForVol ;
            Z9707ProForMq = A9707ProForMq ;
            Z10542ProForH2O = A10542ProForH2O ;
            Z764ProForCod = A764ProForCod ;
         }
      }
      if ( GX_JID == -26 )
      {
         Z1160ProForL = A1160ProForL ;
         Z6549ProForFR = A6549ProForFR ;
         Z7802ProFoNPrg = A7802ProFoNPrg ;
         Z8656ProForrbn = A8656ProForrbn ;
         Z9704ProForVol = A9704ProForVol ;
         Z9707ProForMq = A9707ProForMq ;
         Z10542ProForH2O = A10542ProForH2O ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z764ProForCod = A764ProForCod ;
         Z831TipColCod = A831TipColCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z2838ForRelBan = A2838ForRelBan ;
         Z766ProForDsc = A766ProForDsc ;
         Z13133ProForAct = A13133ProForAct ;
      }
   }

   public void standaloneNotModal( )
   {
      edtProForL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), true);
      AV27Pgmname = "LFORMU" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      edtProForL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CliCod) )
      {
         A252CliCod = AV8CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9ForSer)==0) )
      {
         A494ForSer = AV9ForSer ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      }
      if ( ! (GXutil.strcmp("", AV9ForSer)==0) )
      {
         edtForSer_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      }
      else
      {
         edtForSer_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV9ForSer)==0) )
      {
         edtForSer_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10ForColNom)==0) )
      {
         A482ForColNom = AV10ForColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      }
      if ( ! (GXutil.strcmp("", AV10ForColNom)==0) )
      {
         edtForColNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      }
      else
      {
         edtForColNom_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV10ForColNom)==0) )
      {
         edtForColNom_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11ForColNum) )
      {
         A483ForColNum = AV11ForColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      }
      if ( ! (0==AV11ForColNum) )
      {
         edtForColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      }
      else
      {
         edtForColNum_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      }
      if ( ! (0==AV11ForColNum) )
      {
         edtForColNum_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12TipColCod) )
      {
         A831TipColCod = AV12TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      }
      if ( ! (0==AV12TipColCod) )
      {
         edtTipColCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTipColCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV12TipColCod) )
      {
         edtTipColCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13ProForL) )
      {
         A1160ProForL = AV13ProForL ;
         httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV17Insert_ProForCod)==0) )
      {
         edtProForCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProForCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV17Insert_ProForCod)==0) )
      {
         A764ProForCod = AV17Insert_ProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      }
      else
      {
         A764ProForCod = AV21ComboProForCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01QM5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         A2838ForRelBan = T01QM5_A2838ForRelBan[0] ;
         n2838ForRelBan = T01QM5_n2838ForRelBan[0] ;
         pr_default.close(3);
         /* Using cursor T01QM4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01QM4_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A13133ProForAct = T01QM4_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         pr_default.close(2);
      }
   }

   public void load1QM154( )
   {
      /* Using cursor T01QM6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A2838ForRelBan = T01QM6_A2838ForRelBan[0] ;
         n2838ForRelBan = T01QM6_n2838ForRelBan[0] ;
         A766ProForDsc = T01QM6_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A6549ProForFR = T01QM6_A6549ProForFR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6549ProForFR", A6549ProForFR);
         A7802ProFoNPrg = T01QM6_A7802ProFoNPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7802ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7802ProFoNPrg), 5, 0));
         A8656ProForrbn = T01QM6_A8656ProForrbn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8656ProForrbn", GXutil.ltrimstr( A8656ProForrbn, 6, 2));
         A9704ProForVol = T01QM6_A9704ProForVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9704ProForVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9704ProForVol), 5, 0));
         A9707ProForMq = T01QM6_A9707ProForMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9707ProForMq", A9707ProForMq);
         A10542ProForH2O = T01QM6_A10542ProForH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
         A13133ProForAct = T01QM6_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         A764ProForCod = T01QM6_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         zm1QM154( -26) ;
      }
      pr_default.close(4);
      onLoadActions1QM154( ) ;
   }

   public void onLoadActions1QM154( )
   {
   }

   public void checkExtendedTable1QM154( )
   {
      nIsDirty_154 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01QM4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01QM4_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A13133ProForAct = T01QM4_A13133ProForAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      pr_default.close(2);
      /* Using cursor T01QM5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2838ForRelBan = T01QM5_A2838ForRelBan[0] ;
      n2838ForRelBan = T01QM5_n2838ForRelBan[0] ;
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1QM154( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_27( String A396EmprCod ,
                          String A764ProForCod )
   {
      /* Using cursor T01QM7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A766ProForDsc = T01QM7_A766ProForDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A13133ProForAct = T01QM7_A13133ProForAct[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A766ProForDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13133ProForAct))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_28( String A396EmprCod ,
                          int A252CliCod ,
                          String A494ForSer ,
                          String A482ForColNom ,
                          int A483ForColNum ,
                          byte A831TipColCod )
   {
      /* Using cursor T01QM8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2838ForRelBan = T01QM8_A2838ForRelBan[0] ;
      n2838ForRelBan = T01QM8_n2838ForRelBan[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1QM154( )
   {
      /* Using cursor T01QM9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound154 = (short)(1) ;
      }
      else
      {
         RcdFound154 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01QM3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1QM154( 26) ;
         RcdFound154 = (short)(1) ;
         A1160ProForL = T01QM3_A1160ProForL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
         A6549ProForFR = T01QM3_A6549ProForFR[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6549ProForFR", A6549ProForFR);
         A7802ProFoNPrg = T01QM3_A7802ProFoNPrg[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7802ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7802ProFoNPrg), 5, 0));
         A8656ProForrbn = T01QM3_A8656ProForrbn[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8656ProForrbn", GXutil.ltrimstr( A8656ProForrbn, 6, 2));
         A9704ProForVol = T01QM3_A9704ProForVol[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9704ProForVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9704ProForVol), 5, 0));
         A9707ProForMq = T01QM3_A9707ProForMq[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9707ProForMq", A9707ProForMq);
         A10542ProForH2O = T01QM3_A10542ProForH2O[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
         A396EmprCod = T01QM3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01QM3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A764ProForCod = T01QM3_A764ProForCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
         A831TipColCod = T01QM3_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A494ForSer = T01QM3_A494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01QM3_A482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01QM3_A483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z494ForSer = A494ForSer ;
         Z482ForColNom = A482ForColNom ;
         Z483ForColNum = A483ForColNum ;
         Z831TipColCod = A831TipColCod ;
         Z1160ProForL = A1160ProForL ;
         sMode154 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1QM154( ) ;
         if ( AnyError == 1 )
         {
            RcdFound154 = (short)(0) ;
            initializeNonKey1QM154( ) ;
         }
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound154 = (short)(0) ;
         initializeNonKey1QM154( ) ;
         sMode154 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode154 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1QM154( ) ;
      if ( RcdFound154 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound154 = (short)(0) ;
      /* Using cursor T01QM10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A494ForSer, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, A482ForColNom, A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A483ForColNum), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A252CliCod[0] < A252CliCod ) || ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A483ForColNum[0] < A483ForColNum ) || ( T01QM10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A831TipColCod[0] < A831TipColCod ) || ( T01QM10_A831TipColCod[0] == A831TipColCod ) && ( T01QM10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A1160ProForL[0] < A1160ProForL ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A252CliCod[0] > A252CliCod ) || ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A483ForColNum[0] > A483ForColNum ) || ( T01QM10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A831TipColCod[0] > A831TipColCod ) || ( T01QM10_A831TipColCod[0] == A831TipColCod ) && ( T01QM10_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM10_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM10_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM10_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM10_A1160ProForL[0] > A1160ProForL ) ) )
         {
            A396EmprCod = T01QM10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01QM10_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01QM10_A494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01QM10_A482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01QM10_A483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01QM10_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A1160ProForL = T01QM10_A1160ProForL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
            RcdFound154 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound154 = (short)(0) ;
      /* Using cursor T01QM11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A252CliCod), Integer.valueOf(A252CliCod), A396EmprCod, A494ForSer, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, A482ForColNom, A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Integer.valueOf(A483ForColNum), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Byte.valueOf(A831TipColCod), Byte.valueOf(A831TipColCod), Integer.valueOf(A483ForColNum), A482ForColNom, A494ForSer, Integer.valueOf(A252CliCod), A396EmprCod, Short.valueOf(A1160ProForL)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A252CliCod[0] > A252CliCod ) || ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) > 0 ) || ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) > 0 ) || ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A483ForColNum[0] > A483ForColNum ) || ( T01QM11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A831TipColCod[0] > A831TipColCod ) || ( T01QM11_A831TipColCod[0] == A831TipColCod ) && ( T01QM11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A1160ProForL[0] > A1160ProForL ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A252CliCod[0] < A252CliCod ) || ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) < 0 ) || ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) < 0 ) || ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A483ForColNum[0] < A483ForColNum ) || ( T01QM11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A831TipColCod[0] < A831TipColCod ) || ( T01QM11_A831TipColCod[0] == A831TipColCod ) && ( T01QM11_A483ForColNum[0] == A483ForColNum ) && ( GXutil.strcmp(T01QM11_A482ForColNom[0], A482ForColNom) == 0 ) && ( GXutil.strcmp(T01QM11_A494ForSer[0], A494ForSer) == 0 ) && ( T01QM11_A252CliCod[0] == A252CliCod ) && ( GXutil.strcmp(T01QM11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01QM11_A1160ProForL[0] < A1160ProForL ) ) )
         {
            A396EmprCod = T01QM11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = T01QM11_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A494ForSer = T01QM11_A494ForSer[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
            A482ForColNom = T01QM11_A482ForColNom[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
            A483ForColNum = T01QM11_A483ForColNum[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
            A831TipColCod = T01QM11_A831TipColCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
            A1160ProForL = T01QM11_A1160ProForL[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
            RcdFound154 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1QM154( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1QM154( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound154 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( A1160ProForL != Z1160ProForL ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A252CliCod = Z252CliCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
               A494ForSer = Z494ForSer ;
               httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
               A482ForColNom = Z482ForColNom ;
               httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
               A483ForColNum = Z483ForColNum ;
               httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
               A831TipColCod = Z831TipColCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
               A1160ProForL = Z1160ProForL ;
               httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1QM154( ) ;
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( A1160ProForL != Z1160ProForL ) )
            {
               /* Insert record */
               GX_FocusControl = edtProForCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1QM154( ) ;
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
                  GX_FocusControl = edtProForCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1QM154( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A252CliCod != Z252CliCod ) || ( GXutil.strcmp(A494ForSer, Z494ForSer) != 0 ) || ( GXutil.strcmp(A482ForColNom, Z482ForColNom) != 0 ) || ( A483ForColNum != Z483ForColNum ) || ( A831TipColCod != Z831TipColCod ) || ( A1160ProForL != Z1160ProForL ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = Z252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = Z494ForSer ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = Z482ForColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = Z483ForColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = Z831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1160ProForL = Z1160ProForL ;
         httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProForCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1QM154( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01QM2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFORMU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z6549ProForFR, T01QM2_A6549ProForFR[0]) != 0 ) || ( Z7802ProFoNPrg != T01QM2_A7802ProFoNPrg[0] ) || ( DecimalUtil.compareTo(Z8656ProForrbn, T01QM2_A8656ProForrbn[0]) != 0 ) || ( Z9704ProForVol != T01QM2_A9704ProForVol[0] ) || ( GXutil.strcmp(Z9707ProForMq, T01QM2_A9707ProForMq[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10542ProForH2O != T01QM2_A10542ProForH2O[0] ) || ( GXutil.strcmp(Z764ProForCod, T01QM2_A764ProForCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z6549ProForFR, T01QM2_A6549ProForFR[0]) != 0 )
            {
               GXutil.writeLogln("lformu:[seudo value changed for attri]"+"ProForFR");
               GXutil.writeLogRaw("Old: ",Z6549ProForFR);
               GXutil.writeLogRaw("Current: ",T01QM2_A6549ProForFR[0]);
            }
            if ( Z7802ProFoNPrg != T01QM2_A7802ProFoNPrg[0] )
            {
               GXutil.writeLogln("lformu:[seudo value changed for attri]"+"ProFoNPrg");
               GXutil.writeLogRaw("Old: ",Z7802ProFoNPrg);
               GXutil.writeLogRaw("Current: ",T01QM2_A7802ProFoNPrg[0]);
            }
            if ( DecimalUtil.compareTo(Z8656ProForrbn, T01QM2_A8656ProForrbn[0]) != 0 )
            {
               GXutil.writeLogln("lformu:[seudo value changed for attri]"+"ProForrbn");
               GXutil.writeLogRaw("Old: ",Z8656ProForrbn);
               GXutil.writeLogRaw("Current: ",T01QM2_A8656ProForrbn[0]);
            }
            if ( Z9704ProForVol != T01QM2_A9704ProForVol[0] )
            {
               GXutil.writeLogln("lformu:[seudo value changed for attri]"+"ProForVol");
               GXutil.writeLogRaw("Old: ",Z9704ProForVol);
               GXutil.writeLogRaw("Current: ",T01QM2_A9704ProForVol[0]);
            }
            if ( GXutil.strcmp(Z9707ProForMq, T01QM2_A9707ProForMq[0]) != 0 )
            {
               GXutil.writeLogln("lformu:[seudo value changed for attri]"+"ProForMq");
               GXutil.writeLogRaw("Old: ",Z9707ProForMq);
               GXutil.writeLogRaw("Current: ",T01QM2_A9707ProForMq[0]);
            }
            if ( Z10542ProForH2O != T01QM2_A10542ProForH2O[0] )
            {
               GXutil.writeLogln("lformu:[seudo value changed for attri]"+"ProForH2O");
               GXutil.writeLogRaw("Old: ",Z10542ProForH2O);
               GXutil.writeLogRaw("Current: ",T01QM2_A10542ProForH2O[0]);
            }
            if ( GXutil.strcmp(Z764ProForCod, T01QM2_A764ProForCod[0]) != 0 )
            {
               GXutil.writeLogln("lformu:[seudo value changed for attri]"+"ProForCod");
               GXutil.writeLogRaw("Old: ",Z764ProForCod);
               GXutil.writeLogRaw("Current: ",T01QM2_A764ProForCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPLFORMU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1QM154( )
   {
      beforeValidate1QM154( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QM154( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1QM154( 0) ;
         checkOptimisticConcurrency1QM154( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QM154( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1QM154( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QM12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A1160ProForL), A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Integer.valueOf(A9704ProForVol), A9707ProForMq, Short.valueOf(A10542ProForH2O), A396EmprCod, Integer.valueOf(A252CliCod), A764ProForCod, Byte.valueOf(A831TipColCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1QM0( ) ;
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
            load1QM154( ) ;
         }
         endLevel1QM154( ) ;
      }
      closeExtendedTableCursors1QM154( ) ;
   }

   public void update1QM154( )
   {
      beforeValidate1QM154( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1QM154( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QM154( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1QM154( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1QM154( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01QM13 */
                  pr_default.execute(11, new Object[] {A6549ProForFR, Integer.valueOf(A7802ProFoNPrg), A8656ProForrbn, Integer.valueOf(A9704ProForVol), A9707ProForMq, Short.valueOf(A10542ProForH2O), A764ProForCod, A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPLFORMU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1QM154( ) ;
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
         endLevel1QM154( ) ;
      }
      closeExtendedTableCursors1QM154( ) ;
   }

   public void deferredUpdate1QM154( )
   {
   }

   public void delete( )
   {
      beforeValidate1QM154( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1QM154( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1QM154( ) ;
         afterConfirm1QM154( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1QM154( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01QM14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod), Short.valueOf(A1160ProForL)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLFORMU");
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
      sMode154 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1QM154( ) ;
      Gx_mode = sMode154 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1QM154( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01QM15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
         A2838ForRelBan = T01QM15_A2838ForRelBan[0] ;
         n2838ForRelBan = T01QM15_n2838ForRelBan[0] ;
         pr_default.close(13);
         /* Using cursor T01QM16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A764ProForCod});
         A766ProForDsc = T01QM16_A766ProForDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
         A13133ProForAct = T01QM16_A13133ProForAct[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
         pr_default.close(14);
      }
   }

   public void endLevel1QM154( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1QM154( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "lformu");
         if ( AnyError == 0 )
         {
            confirmValues1QM0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "lformu");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1QM154( )
   {
      /* Scan By routine */
      /* Using cursor T01QM17 */
      pr_default.execute(15);
      RcdFound154 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A396EmprCod = T01QM17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01QM17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01QM17_A494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01QM17_A482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01QM17_A483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01QM17_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1160ProForL = T01QM17_A1160ProForL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1QM154( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound154 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound154 = (short)(1) ;
         A396EmprCod = T01QM17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = T01QM17_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A494ForSer = T01QM17_A494ForSer[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
         A482ForColNom = T01QM17_A482ForColNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
         A483ForColNum = T01QM17_A483ForColNum[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
         A831TipColCod = T01QM17_A831TipColCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
         A1160ProForL = T01QM17_A1160ProForL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
      }
   }

   public void scanEnd1QM154( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1QM154( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1QM154( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1QM154( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1QM154( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1QM154( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1QM154( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1QM154( )
   {
      edtProForL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForL_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForL_Enabled), 5, 0), true);
      edtProForCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForCod_Enabled), 5, 0), true);
      edtProForFR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForFR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForFR_Enabled), 5, 0), true);
      edtProFoNPrg_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProFoNPrg_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProFoNPrg_Enabled), 5, 0), true);
      edtProForrbn_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForrbn_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForrbn_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboproforcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboproforcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboproforcod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtForSer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForSer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForSer_Enabled), 5, 0), true);
      edtForColNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNom_Enabled), 5, 0), true);
      edtForColNum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtForColNum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtForColNum_Enabled), 5, 0), true);
      edtTipColCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTipColCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTipColCod_Enabled), 5, 0), true);
      edtProForDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForDsc_Enabled), 5, 0), true);
      edtProForVol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForVol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForVol_Enabled), 5, 0), true);
      edtProForMq_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForMq_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForMq_Enabled), 5, 0), true);
      edtProForH2O_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForH2O_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForH2O_Enabled), 5, 0), true);
      edtProForAct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProForAct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProForAct_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1QM154( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1QM0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.lformu", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ForSer)),GXutil.URLEncode(GXutil.rtrim(AV10ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV11ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13ProForL,4,0))}, new String[] {"Gx_mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ProForL"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"LFORMU");
      forbiddenHiddens.add("ProForL", localUtil.format( DecimalUtil.doubleToDec(A1160ProForL), "ZZZ9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV27Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("lformu:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z494ForSer", GXutil.rtrim( Z494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "Z482ForColNom", GXutil.rtrim( Z482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "Z483ForColNum", GXutil.ltrim( localUtil.ntoc( Z483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z831TipColCod", GXutil.ltrim( localUtil.ntoc( Z831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1160ProForL", GXutil.ltrim( localUtil.ntoc( Z1160ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6549ProForFR", GXutil.rtrim( Z6549ProForFR));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7802ProFoNPrg", GXutil.ltrim( localUtil.ntoc( Z7802ProFoNPrg, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8656ProForrbn", GXutil.ltrim( localUtil.ntoc( Z8656ProForrbn, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9704ProForVol", GXutil.ltrim( localUtil.ntoc( Z9704ProForVol, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9707ProForMq", GXutil.rtrim( Z9707ProForMq));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10542ProForH2O", GXutil.ltrim( localUtil.ntoc( Z10542ProForH2O, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z764ProForCod", GXutil.rtrim( Z764ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N764ProForCod", GXutil.rtrim( A764ProForCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPROFORCOD_DATA", AV19ProForCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPROFORCOD_DATA", AV19ProForCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV24UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV24UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV22Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV22Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMFOREQ", GXutil.ltrim( localUtil.ntoc( AV25MForEq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMFOREQ", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25MForEq), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV26Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVALOR_COR", getSecureSignedToken( "", localUtil.format( AV26Valor_cor, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV8CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV9ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV9ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV10ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV10ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV11ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV11ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV12TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV12TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROFORL", GXutil.ltrim( localUtil.ntoc( AV13ProForL, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROFORL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13ProForL), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PROFORCOD", GXutil.rtrim( AV17Insert_ProForCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FORRELBAN", GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Objectcall", GXutil.rtrim( Combo_proforcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Cls", GXutil.rtrim( Combo_proforcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Selectedvalue_set", GXutil.rtrim( Combo_proforcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Enabled", GXutil.booltostr( Combo_proforcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PROFORCOD_Emptyitem", GXutil.booltostr( Combo_proforcod_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "BARRADEPROGRESO_Objectcall", GXutil.rtrim( Barradeprogreso_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRADEPROGRESO_Enabled", GXutil.booltostr( Barradeprogreso_Enabled));
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
      return formatLink("app.lformu", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9ForSer)),GXutil.URLEncode(GXutil.rtrim(AV10ForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV11ForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12TipColCod,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13ProForL,4,0))}, new String[] {"Gx_mode","EmprCod","CliCod","ForSer","ForColNom","ForColNum","TipColCod","ProForL"})  ;
   }

   public String getPgmname( )
   {
      return "LFORMU" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Procesos Quimicos", "") ;
   }

   public void initializeNonKey1QM154( )
   {
      A764ProForCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A764ProForCod", A764ProForCod);
      A2838ForRelBan = DecimalUtil.ZERO ;
      n2838ForRelBan = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrimstr( A2838ForRelBan, 7, 2));
      A766ProForDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", A766ProForDsc);
      A6549ProForFR = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6549ProForFR", A6549ProForFR);
      A7802ProFoNPrg = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7802ProFoNPrg", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7802ProFoNPrg), 5, 0));
      A8656ProForrbn = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A8656ProForrbn", GXutil.ltrimstr( A8656ProForrbn, 6, 2));
      A9704ProForVol = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A9704ProForVol", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9704ProForVol), 5, 0));
      A9707ProForMq = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A9707ProForMq", A9707ProForMq);
      A10542ProForH2O = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10542ProForH2O", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10542ProForH2O), 4, 0));
      A13133ProForAct = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", A13133ProForAct);
      Z6549ProForFR = "" ;
      Z7802ProFoNPrg = 0 ;
      Z8656ProForrbn = DecimalUtil.ZERO ;
      Z9704ProForVol = 0 ;
      Z9707ProForMq = "" ;
      Z10542ProForH2O = (short)(0) ;
      Z764ProForCod = "" ;
   }

   public void initAll1QM154( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A494ForSer = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A494ForSer", A494ForSer);
      A482ForColNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A482ForColNom", A482ForColNom);
      A483ForColNum = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A483ForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(A483ForColNum), 6, 0));
      A831TipColCod = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A831TipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A831TipColCod), 2, 0));
      A1160ProForL = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1160ProForL", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1160ProForL), 4, 0));
      initializeNonKey1QM154( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821169617", true, true);
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
      httpContext.AddJavascriptSource("lformu.js", "?2026821169617", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtProForL_Internalname = "PROFORL" ;
      lblTextblockproforcod_Internalname = "TEXTBLOCKPROFORCOD" ;
      Combo_proforcod_Internalname = "COMBO_PROFORCOD" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      divTablesplittedproforcod_Internalname = "TABLESPLITTEDPROFORCOD" ;
      edtProForFR_Internalname = "PROFORFR" ;
      edtProFoNPrg_Internalname = "PROFONPRG" ;
      edtProForrbn_Internalname = "PROFORRBN" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboproforcod_Internalname = "vCOMBOPROFORCOD" ;
      divSectionattribute_proforcod_Internalname = "SECTIONATTRIBUTE_PROFORCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtForSer_Internalname = "FORSER" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      edtProForVol_Internalname = "PROFORVOL" ;
      edtProForMq_Internalname = "PROFORMQ" ;
      edtProForH2O_Internalname = "PROFORH2O" ;
      edtProForAct_Internalname = "PROFORACT" ;
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
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Procesos Quimicos", "") );
      edtProForAct_Jsonclick = "" ;
      edtProForAct_Enabled = 0 ;
      edtProForAct_Visible = 1 ;
      edtProForH2O_Jsonclick = "" ;
      edtProForH2O_Enabled = 1 ;
      edtProForH2O_Visible = 1 ;
      edtProForMq_Jsonclick = "" ;
      edtProForMq_Enabled = 1 ;
      edtProForMq_Visible = 1 ;
      edtProForVol_Jsonclick = "" ;
      edtProForVol_Enabled = 1 ;
      edtProForVol_Visible = 1 ;
      edtProForDsc_Jsonclick = "" ;
      edtProForDsc_Enabled = 0 ;
      edtProForDsc_Visible = 1 ;
      edtTipColCod_Jsonclick = "" ;
      edtTipColCod_Enabled = 1 ;
      edtTipColCod_Visible = 1 ;
      edtForColNum_Jsonclick = "" ;
      edtForColNum_Enabled = 1 ;
      edtForColNum_Visible = 1 ;
      edtForColNom_Jsonclick = "" ;
      edtForColNom_Enabled = 1 ;
      edtForColNom_Visible = 1 ;
      edtForSer_Jsonclick = "" ;
      edtForSer_Enabled = 1 ;
      edtForSer_Visible = 1 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavComboproforcod_Jsonclick = "" ;
      edtavComboproforcod_Enabled = 0 ;
      edtavComboproforcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProForrbn_Jsonclick = "" ;
      edtProForrbn_Enabled = 1 ;
      edtProFoNPrg_Jsonclick = "" ;
      edtProFoNPrg_Enabled = 1 ;
      edtProForFR_Jsonclick = "" ;
      edtProForFR_Enabled = 1 ;
      edtProForCod_Jsonclick = "" ;
      edtProForCod_Enabled = 1 ;
      edtProForCod_Visible = 1 ;
      Combo_proforcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_proforcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_proforcod_Enabled = GXutil.toBoolean( -1) ;
      edtProForL_Jsonclick = "" ;
      edtProForL_Enabled = 0 ;
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

   public void valid_Tipcolcod( )
   {
      n2838ForRelBan = false ;
      /* Using cursor T01QM15 */
      pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A494ForSer, A482ForColNom, Integer.valueOf(A483ForColNum), Byte.valueOf(A831TipColCod)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CFORMU", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TIPCOLCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A2838ForRelBan = T01QM15_A2838ForRelBan[0] ;
      n2838ForRelBan = T01QM15_n2838ForRelBan[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2838ForRelBan", GXutil.ltrim( localUtil.ntoc( A2838ForRelBan, (byte)(7), (byte)(2), ".", "")));
   }

   public void valid_Proforcod( )
   {
      /* Using cursor T01QM16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A764ProForCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CPROFO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROFORCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A766ProForDsc = T01QM16_A766ProForDsc[0] ;
      A13133ProForAct = T01QM16_A13133ProForAct[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A766ProForDsc", GXutil.rtrim( A766ProForDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A13133ProForAct", GXutil.rtrim( A13133ProForAct));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ForSer',fld:'vFORSER',pic:'',hsh:true},{av:'AV10ForColNom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV11ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV13ProForL',fld:'vPROFORL',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV24UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV22Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV25MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'AV26Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'AV9ForSer',fld:'vFORSER',pic:'',hsh:true},{av:'AV10ForColNom',fld:'vFORCOLNOM',pic:'',hsh:true},{av:'AV11ForColNum',fld:'vFORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV12TipColCod',fld:'vTIPCOLCOD',pic:'Z9',hsh:true},{av:'AV13ProForL',fld:'vPROFORL',pic:'ZZZ9',hsh:true},{av:'A1160ProForL',fld:'PROFORL',pic:'ZZZ9'},{av:'AV27Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121QM2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'AV24UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV22Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV25MForEq',fld:'vMFOREQ',pic:'ZZZ9',hsh:true},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'AV26Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'},{av:'AV26Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999',hsh:true},{av:'AV22Station',fld:'vSTATION',pic:'',hsh:true}]}");
      setEventMetadata("VALID_PROFORL","{handler:'valid_Proforl',iparms:[]");
      setEventMetadata("VALID_PROFORL",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[{av:'A766ProForDsc',fld:'PROFORDSC',pic:''},{av:'A13133ProForAct',fld:'PROFORACT',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPROFORCOD","{handler:'validv_Comboproforcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOPROFORCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_FORSER","{handler:'valid_Forser',iparms:[]");
      setEventMetadata("VALID_FORSER",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNOM","{handler:'valid_Forcolnom',iparms:[]");
      setEventMetadata("VALID_FORCOLNOM",",oparms:[]}");
      setEventMetadata("VALID_FORCOLNUM","{handler:'valid_Forcolnum',iparms:[]");
      setEventMetadata("VALID_FORCOLNUM",",oparms:[]}");
      setEventMetadata("VALID_TIPCOLCOD","{handler:'valid_Tipcolcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:''},{av:'A482ForColNom',fld:'FORCOLNOM',pic:''},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9'},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9'},{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'}]");
      setEventMetadata("VALID_TIPCOLCOD",",oparms:[{av:'A2838ForRelBan',fld:'FORRELBAN',pic:'ZZZ9.99'}]}");
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
      pr_default.close(14);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV9ForSer = "" ;
      wcpOAV10ForColNom = "" ;
      Z396EmprCod = "" ;
      Z494ForSer = "" ;
      Z482ForColNom = "" ;
      Z6549ProForFR = "" ;
      Z8656ProForrbn = DecimalUtil.ZERO ;
      Z9707ProForMq = "" ;
      Z764ProForCod = "" ;
      N764ProForCod = "" ;
      Combo_proforcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A494ForSer = "" ;
      A482ForColNom = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV9ForSer = "" ;
      AV10ForColNom = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      lblTextblockproforcod_Jsonclick = "" ;
      ucCombo_proforcod = new com.genexus.webpanels.GXUserControl();
      Combo_proforcod_Caption = "" ;
      AV19ProForCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      A6549ProForFR = "" ;
      A8656ProForrbn = DecimalUtil.ZERO ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV27Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      AV21ComboProForCod = "" ;
      A766ProForDsc = "" ;
      A9707ProForMq = "" ;
      A13133ProForAct = "" ;
      AV17Insert_ProForCod = "" ;
      A2838ForRelBan = DecimalUtil.ZERO ;
      Combo_proforcod_Objectcall = "" ;
      Combo_proforcod_Class = "" ;
      Combo_proforcod_Icontype = "" ;
      Combo_proforcod_Icon = "" ;
      Combo_proforcod_Tooltip = "" ;
      Combo_proforcod_Selectedvalue_set = "" ;
      Combo_proforcod_Selectedtext_set = "" ;
      Combo_proforcod_Selectedtext_get = "" ;
      Combo_proforcod_Gamoauthtoken = "" ;
      Combo_proforcod_Ddointernalname = "" ;
      Combo_proforcod_Titlecontrolalign = "" ;
      Combo_proforcod_Dropdownoptionstype = "" ;
      Combo_proforcod_Titlecontrolidtoreplace = "" ;
      Combo_proforcod_Datalisttype = "" ;
      Combo_proforcod_Datalistfixedvalues = "" ;
      Combo_proforcod_Datalistproc = "" ;
      Combo_proforcod_Datalistprocparametersprefix = "" ;
      Combo_proforcod_Remoteservicesparameters = "" ;
      Combo_proforcod_Htmltemplate = "" ;
      Combo_proforcod_Multiplevaluestype = "" ;
      Combo_proforcod_Loadingdata = "" ;
      Combo_proforcod_Noresultsfound = "" ;
      Combo_proforcod_Emptyitemtext = "" ;
      Combo_proforcod_Onlyselectedvalues = "" ;
      Combo_proforcod_Selectalltext = "" ;
      Combo_proforcod_Multiplevaluesseparator = "" ;
      Combo_proforcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Barradeprogreso_Objectcall = "" ;
      Barradeprogreso_Class = "" ;
      Barradeprogreso_Height = "" ;
      Barradeprogreso_Width = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode154 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      GXt_char1 = "" ;
      AV23EmprNom = "" ;
      AV24UsurCod = "" ;
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV15TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16WebSession = httpContext.getWebSession();
      AV18TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXv_char2 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      AV26Valor_cor = DecimalUtil.ZERO ;
      GXv_int11 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_int9 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXt_objcol_SdtDVB_SDTComboData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV20ComboSelectedValue = "" ;
      GXv_char12 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item15 = new GXBaseCollection[1] ;
      Z2838ForRelBan = DecimalUtil.ZERO ;
      Z766ProForDsc = "" ;
      Z13133ProForAct = "" ;
      T01QM5_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QM5_n2838ForRelBan = new boolean[] {false} ;
      T01QM4_A766ProForDsc = new String[] {""} ;
      T01QM4_A13133ProForAct = new String[] {""} ;
      T01QM6_A1160ProForL = new short[1] ;
      T01QM6_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QM6_n2838ForRelBan = new boolean[] {false} ;
      T01QM6_A766ProForDsc = new String[] {""} ;
      T01QM6_A6549ProForFR = new String[] {""} ;
      T01QM6_A7802ProFoNPrg = new int[1] ;
      T01QM6_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QM6_A9704ProForVol = new int[1] ;
      T01QM6_A9707ProForMq = new String[] {""} ;
      T01QM6_A10542ProForH2O = new short[1] ;
      T01QM6_A13133ProForAct = new String[] {""} ;
      T01QM6_A396EmprCod = new String[] {""} ;
      T01QM6_A252CliCod = new int[1] ;
      T01QM6_A764ProForCod = new String[] {""} ;
      T01QM6_A831TipColCod = new byte[1] ;
      T01QM6_A494ForSer = new String[] {""} ;
      T01QM6_A482ForColNom = new String[] {""} ;
      T01QM6_A483ForColNum = new int[1] ;
      T01QM7_A766ProForDsc = new String[] {""} ;
      T01QM7_A13133ProForAct = new String[] {""} ;
      T01QM8_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QM8_n2838ForRelBan = new boolean[] {false} ;
      T01QM9_A396EmprCod = new String[] {""} ;
      T01QM9_A252CliCod = new int[1] ;
      T01QM9_A494ForSer = new String[] {""} ;
      T01QM9_A482ForColNom = new String[] {""} ;
      T01QM9_A483ForColNum = new int[1] ;
      T01QM9_A831TipColCod = new byte[1] ;
      T01QM9_A1160ProForL = new short[1] ;
      T01QM3_A1160ProForL = new short[1] ;
      T01QM3_A6549ProForFR = new String[] {""} ;
      T01QM3_A7802ProFoNPrg = new int[1] ;
      T01QM3_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QM3_A9704ProForVol = new int[1] ;
      T01QM3_A9707ProForMq = new String[] {""} ;
      T01QM3_A10542ProForH2O = new short[1] ;
      T01QM3_A396EmprCod = new String[] {""} ;
      T01QM3_A252CliCod = new int[1] ;
      T01QM3_A764ProForCod = new String[] {""} ;
      T01QM3_A831TipColCod = new byte[1] ;
      T01QM3_A494ForSer = new String[] {""} ;
      T01QM3_A482ForColNom = new String[] {""} ;
      T01QM3_A483ForColNum = new int[1] ;
      T01QM10_A396EmprCod = new String[] {""} ;
      T01QM10_A252CliCod = new int[1] ;
      T01QM10_A494ForSer = new String[] {""} ;
      T01QM10_A482ForColNom = new String[] {""} ;
      T01QM10_A483ForColNum = new int[1] ;
      T01QM10_A831TipColCod = new byte[1] ;
      T01QM10_A1160ProForL = new short[1] ;
      T01QM11_A396EmprCod = new String[] {""} ;
      T01QM11_A252CliCod = new int[1] ;
      T01QM11_A494ForSer = new String[] {""} ;
      T01QM11_A482ForColNom = new String[] {""} ;
      T01QM11_A483ForColNum = new int[1] ;
      T01QM11_A831TipColCod = new byte[1] ;
      T01QM11_A1160ProForL = new short[1] ;
      T01QM2_A1160ProForL = new short[1] ;
      T01QM2_A6549ProForFR = new String[] {""} ;
      T01QM2_A7802ProFoNPrg = new int[1] ;
      T01QM2_A8656ProForrbn = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QM2_A9704ProForVol = new int[1] ;
      T01QM2_A9707ProForMq = new String[] {""} ;
      T01QM2_A10542ProForH2O = new short[1] ;
      T01QM2_A396EmprCod = new String[] {""} ;
      T01QM2_A252CliCod = new int[1] ;
      T01QM2_A764ProForCod = new String[] {""} ;
      T01QM2_A831TipColCod = new byte[1] ;
      T01QM2_A494ForSer = new String[] {""} ;
      T01QM2_A482ForColNom = new String[] {""} ;
      T01QM2_A483ForColNum = new int[1] ;
      T01QM15_A2838ForRelBan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01QM15_n2838ForRelBan = new boolean[] {false} ;
      T01QM16_A766ProForDsc = new String[] {""} ;
      T01QM16_A13133ProForAct = new String[] {""} ;
      T01QM17_A396EmprCod = new String[] {""} ;
      T01QM17_A252CliCod = new int[1] ;
      T01QM17_A494ForSer = new String[] {""} ;
      T01QM17_A482ForColNom = new String[] {""} ;
      T01QM17_A483ForColNum = new int[1] ;
      T01QM17_A831TipColCod = new byte[1] ;
      T01QM17_A1160ProForL = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.lformu__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.lformu__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.lformu__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.lformu__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.lformu__default(),
         new Object[] {
             new Object[] {
            T01QM2_A1160ProForL, T01QM2_A6549ProForFR, T01QM2_A7802ProFoNPrg, T01QM2_A8656ProForrbn, T01QM2_A9704ProForVol, T01QM2_A9707ProForMq, T01QM2_A10542ProForH2O, T01QM2_A396EmprCod, T01QM2_A252CliCod, T01QM2_A764ProForCod,
            T01QM2_A831TipColCod, T01QM2_A494ForSer, T01QM2_A482ForColNom, T01QM2_A483ForColNum
            }
            , new Object[] {
            T01QM3_A1160ProForL, T01QM3_A6549ProForFR, T01QM3_A7802ProFoNPrg, T01QM3_A8656ProForrbn, T01QM3_A9704ProForVol, T01QM3_A9707ProForMq, T01QM3_A10542ProForH2O, T01QM3_A396EmprCod, T01QM3_A252CliCod, T01QM3_A764ProForCod,
            T01QM3_A831TipColCod, T01QM3_A494ForSer, T01QM3_A482ForColNom, T01QM3_A483ForColNum
            }
            , new Object[] {
            T01QM4_A766ProForDsc, T01QM4_A13133ProForAct
            }
            , new Object[] {
            T01QM5_A2838ForRelBan, T01QM5_n2838ForRelBan
            }
            , new Object[] {
            T01QM6_A1160ProForL, T01QM6_A2838ForRelBan, T01QM6_n2838ForRelBan, T01QM6_A766ProForDsc, T01QM6_A6549ProForFR, T01QM6_A7802ProFoNPrg, T01QM6_A8656ProForrbn, T01QM6_A9704ProForVol, T01QM6_A9707ProForMq, T01QM6_A10542ProForH2O,
            T01QM6_A13133ProForAct, T01QM6_A396EmprCod, T01QM6_A252CliCod, T01QM6_A764ProForCod, T01QM6_A831TipColCod, T01QM6_A494ForSer, T01QM6_A482ForColNom, T01QM6_A483ForColNum
            }
            , new Object[] {
            T01QM7_A766ProForDsc, T01QM7_A13133ProForAct
            }
            , new Object[] {
            T01QM8_A2838ForRelBan, T01QM8_n2838ForRelBan
            }
            , new Object[] {
            T01QM9_A396EmprCod, T01QM9_A252CliCod, T01QM9_A494ForSer, T01QM9_A482ForColNom, T01QM9_A483ForColNum, T01QM9_A831TipColCod, T01QM9_A1160ProForL
            }
            , new Object[] {
            T01QM10_A396EmprCod, T01QM10_A252CliCod, T01QM10_A494ForSer, T01QM10_A482ForColNom, T01QM10_A483ForColNum, T01QM10_A831TipColCod, T01QM10_A1160ProForL
            }
            , new Object[] {
            T01QM11_A396EmprCod, T01QM11_A252CliCod, T01QM11_A494ForSer, T01QM11_A482ForColNom, T01QM11_A483ForColNum, T01QM11_A831TipColCod, T01QM11_A1160ProForL
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01QM15_A2838ForRelBan, T01QM15_n2838ForRelBan
            }
            , new Object[] {
            T01QM16_A766ProForDsc, T01QM16_A13133ProForAct
            }
            , new Object[] {
            T01QM17_A396EmprCod, T01QM17_A252CliCod, T01QM17_A494ForSer, T01QM17_A482ForColNom, T01QM17_A483ForColNum, T01QM17_A831TipColCod, T01QM17_A1160ProForL
            }
         }
      );
      AV27Pgmname = "LFORMU" ;
   }

   private byte wcpOAV12TipColCod ;
   private byte Z831TipColCod ;
   private byte GxWebError ;
   private byte A831TipColCod ;
   private byte AV12TipColCod ;
   private byte nKeyPressed ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV13ProForL ;
   private short Z1160ProForL ;
   private short Z10542ProForH2O ;
   private short AV13ProForL ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A1160ProForL ;
   private short A10542ProForH2O ;
   private short RcdFound154 ;
   private short AV25MForEq ;
   private short nIsDirty_154 ;
   private int wcpOAV8CliCod ;
   private int wcpOAV11ForColNum ;
   private int Z252CliCod ;
   private int Z483ForColNum ;
   private int Z7802ProFoNPrg ;
   private int Z9704ProForVol ;
   private int A252CliCod ;
   private int A483ForColNum ;
   private int AV8CliCod ;
   private int AV11ForColNum ;
   private int trnEnded ;
   private int edtProForL_Enabled ;
   private int edtProForCod_Visible ;
   private int edtProForCod_Enabled ;
   private int edtProForFR_Enabled ;
   private int A7802ProFoNPrg ;
   private int edtProFoNPrg_Enabled ;
   private int edtProForrbn_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboproforcod_Visible ;
   private int edtavComboproforcod_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtForSer_Visible ;
   private int edtForSer_Enabled ;
   private int edtForColNom_Visible ;
   private int edtForColNom_Enabled ;
   private int edtForColNum_Visible ;
   private int edtForColNum_Enabled ;
   private int edtTipColCod_Visible ;
   private int edtTipColCod_Enabled ;
   private int edtProForDsc_Visible ;
   private int edtProForDsc_Enabled ;
   private int A9704ProForVol ;
   private int edtProForVol_Enabled ;
   private int edtProForVol_Visible ;
   private int edtProForMq_Visible ;
   private int edtProForMq_Enabled ;
   private int edtProForH2O_Enabled ;
   private int edtProForH2O_Visible ;
   private int edtProForAct_Visible ;
   private int edtProForAct_Enabled ;
   private int Combo_proforcod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV28GXV1 ;
   private int GXv_int8[] ;
   private int GXv_int11[] ;
   private int GXv_int9[] ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal Z8656ProForrbn ;
   private java.math.BigDecimal A8656ProForrbn ;
   private java.math.BigDecimal A2838ForRelBan ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal AV26Valor_cor ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal Z2838ForRelBan ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV9ForSer ;
   private String wcpOAV10ForColNom ;
   private String Z396EmprCod ;
   private String Z494ForSer ;
   private String Z482ForColNom ;
   private String Z6549ProForFR ;
   private String Z9707ProForMq ;
   private String Z764ProForCod ;
   private String N764ProForCod ;
   private String Combo_proforcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A494ForSer ;
   private String A482ForColNom ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV9ForSer ;
   private String AV10ForColNom ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProForCod_Internalname ;
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
   private String edtProForL_Internalname ;
   private String edtProForL_Jsonclick ;
   private String divTablesplittedproforcod_Internalname ;
   private String lblTextblockproforcod_Internalname ;
   private String lblTextblockproforcod_Jsonclick ;
   private String Combo_proforcod_Caption ;
   private String Combo_proforcod_Cls ;
   private String Combo_proforcod_Internalname ;
   private String TempTags ;
   private String edtProForCod_Jsonclick ;
   private String edtProForFR_Internalname ;
   private String A6549ProForFR ;
   private String edtProForFR_Jsonclick ;
   private String edtProFoNPrg_Internalname ;
   private String edtProFoNPrg_Jsonclick ;
   private String edtProForrbn_Internalname ;
   private String edtProForrbn_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV27Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_proforcod_Internalname ;
   private String edtavComboproforcod_Internalname ;
   private String AV21ComboProForCod ;
   private String edtavComboproforcod_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String edtForSer_Internalname ;
   private String edtForSer_Jsonclick ;
   private String edtForColNom_Internalname ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Internalname ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Internalname ;
   private String edtTipColCod_Jsonclick ;
   private String edtProForDsc_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Jsonclick ;
   private String edtProForVol_Internalname ;
   private String edtProForVol_Jsonclick ;
   private String edtProForMq_Internalname ;
   private String A9707ProForMq ;
   private String edtProForMq_Jsonclick ;
   private String edtProForH2O_Internalname ;
   private String edtProForH2O_Jsonclick ;
   private String edtProForAct_Internalname ;
   private String A13133ProForAct ;
   private String edtProForAct_Jsonclick ;
   private String AV17Insert_ProForCod ;
   private String Combo_proforcod_Objectcall ;
   private String Combo_proforcod_Class ;
   private String Combo_proforcod_Icontype ;
   private String Combo_proforcod_Icon ;
   private String Combo_proforcod_Tooltip ;
   private String Combo_proforcod_Selectedvalue_set ;
   private String Combo_proforcod_Selectedtext_set ;
   private String Combo_proforcod_Selectedtext_get ;
   private String Combo_proforcod_Gamoauthtoken ;
   private String Combo_proforcod_Ddointernalname ;
   private String Combo_proforcod_Titlecontrolalign ;
   private String Combo_proforcod_Dropdownoptionstype ;
   private String Combo_proforcod_Titlecontrolidtoreplace ;
   private String Combo_proforcod_Datalisttype ;
   private String Combo_proforcod_Datalistfixedvalues ;
   private String Combo_proforcod_Datalistproc ;
   private String Combo_proforcod_Datalistprocparametersprefix ;
   private String Combo_proforcod_Remoteservicesparameters ;
   private String Combo_proforcod_Htmltemplate ;
   private String Combo_proforcod_Multiplevaluestype ;
   private String Combo_proforcod_Loadingdata ;
   private String Combo_proforcod_Noresultsfound ;
   private String Combo_proforcod_Emptyitemtext ;
   private String Combo_proforcod_Onlyselectedvalues ;
   private String Combo_proforcod_Selectalltext ;
   private String Combo_proforcod_Multiplevaluesseparator ;
   private String Combo_proforcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Barradeprogreso_Objectcall ;
   private String Barradeprogreso_Class ;
   private String Barradeprogreso_Height ;
   private String Barradeprogreso_Width ;
   private String hsh ;
   private String sMode154 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String GXt_char1 ;
   private String AV23EmprNom ;
   private String AV24UsurCod ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char12[] ;
   private String Z766ProForDsc ;
   private String Z13133ProForAct ;
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
   private boolean Combo_proforcod_Emptyitem ;
   private boolean n2838ForRelBan ;
   private boolean Combo_proforcod_Enabled ;
   private boolean Combo_proforcod_Visible ;
   private boolean Combo_proforcod_Allowmultipleselection ;
   private boolean Combo_proforcod_Isgriditem ;
   private boolean Combo_proforcod_Hasdescription ;
   private boolean Combo_proforcod_Includeonlyselectedoption ;
   private boolean Combo_proforcod_Includeselectalloption ;
   private boolean Combo_proforcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Barradeprogreso_Enabled ;
   private boolean Barradeprogreso_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV20ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_proforcod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.math.BigDecimal[] T01QM5_A2838ForRelBan ;
   private boolean[] T01QM5_n2838ForRelBan ;
   private String[] T01QM4_A766ProForDsc ;
   private String[] T01QM4_A13133ProForAct ;
   private short[] T01QM6_A1160ProForL ;
   private java.math.BigDecimal[] T01QM6_A2838ForRelBan ;
   private boolean[] T01QM6_n2838ForRelBan ;
   private String[] T01QM6_A766ProForDsc ;
   private String[] T01QM6_A6549ProForFR ;
   private int[] T01QM6_A7802ProFoNPrg ;
   private java.math.BigDecimal[] T01QM6_A8656ProForrbn ;
   private int[] T01QM6_A9704ProForVol ;
   private String[] T01QM6_A9707ProForMq ;
   private short[] T01QM6_A10542ProForH2O ;
   private String[] T01QM6_A13133ProForAct ;
   private String[] T01QM6_A396EmprCod ;
   private int[] T01QM6_A252CliCod ;
   private String[] T01QM6_A764ProForCod ;
   private byte[] T01QM6_A831TipColCod ;
   private String[] T01QM6_A494ForSer ;
   private String[] T01QM6_A482ForColNom ;
   private int[] T01QM6_A483ForColNum ;
   private String[] T01QM7_A766ProForDsc ;
   private String[] T01QM7_A13133ProForAct ;
   private java.math.BigDecimal[] T01QM8_A2838ForRelBan ;
   private boolean[] T01QM8_n2838ForRelBan ;
   private String[] T01QM9_A396EmprCod ;
   private int[] T01QM9_A252CliCod ;
   private String[] T01QM9_A494ForSer ;
   private String[] T01QM9_A482ForColNom ;
   private int[] T01QM9_A483ForColNum ;
   private byte[] T01QM9_A831TipColCod ;
   private short[] T01QM9_A1160ProForL ;
   private short[] T01QM3_A1160ProForL ;
   private String[] T01QM3_A6549ProForFR ;
   private int[] T01QM3_A7802ProFoNPrg ;
   private java.math.BigDecimal[] T01QM3_A8656ProForrbn ;
   private int[] T01QM3_A9704ProForVol ;
   private String[] T01QM3_A9707ProForMq ;
   private short[] T01QM3_A10542ProForH2O ;
   private String[] T01QM3_A396EmprCod ;
   private int[] T01QM3_A252CliCod ;
   private String[] T01QM3_A764ProForCod ;
   private byte[] T01QM3_A831TipColCod ;
   private String[] T01QM3_A494ForSer ;
   private String[] T01QM3_A482ForColNom ;
   private int[] T01QM3_A483ForColNum ;
   private String[] T01QM10_A396EmprCod ;
   private int[] T01QM10_A252CliCod ;
   private String[] T01QM10_A494ForSer ;
   private String[] T01QM10_A482ForColNom ;
   private int[] T01QM10_A483ForColNum ;
   private byte[] T01QM10_A831TipColCod ;
   private short[] T01QM10_A1160ProForL ;
   private String[] T01QM11_A396EmprCod ;
   private int[] T01QM11_A252CliCod ;
   private String[] T01QM11_A494ForSer ;
   private String[] T01QM11_A482ForColNom ;
   private int[] T01QM11_A483ForColNum ;
   private byte[] T01QM11_A831TipColCod ;
   private short[] T01QM11_A1160ProForL ;
   private short[] T01QM2_A1160ProForL ;
   private String[] T01QM2_A6549ProForFR ;
   private int[] T01QM2_A7802ProFoNPrg ;
   private java.math.BigDecimal[] T01QM2_A8656ProForrbn ;
   private int[] T01QM2_A9704ProForVol ;
   private String[] T01QM2_A9707ProForMq ;
   private short[] T01QM2_A10542ProForH2O ;
   private String[] T01QM2_A396EmprCod ;
   private int[] T01QM2_A252CliCod ;
   private String[] T01QM2_A764ProForCod ;
   private byte[] T01QM2_A831TipColCod ;
   private String[] T01QM2_A494ForSer ;
   private String[] T01QM2_A482ForColNom ;
   private int[] T01QM2_A483ForColNum ;
   private java.math.BigDecimal[] T01QM15_A2838ForRelBan ;
   private boolean[] T01QM15_n2838ForRelBan ;
   private String[] T01QM16_A766ProForDsc ;
   private String[] T01QM16_A13133ProForAct ;
   private String[] T01QM17_A396EmprCod ;
   private int[] T01QM17_A252CliCod ;
   private String[] T01QM17_A494ForSer ;
   private String[] T01QM17_A482ForColNom ;
   private int[] T01QM17_A483ForColNum ;
   private byte[] T01QM17_A831TipColCod ;
   private short[] T01QM17_A1160ProForL ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV19ProForCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV15TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV18TrnContextAtt ;
}

final  class lformu__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lformu__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lformu__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lformu__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class lformu__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01QM2", "SELECT ProForL, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, EmprCod, CliCod, ProForCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?  FOR UPDATE OF ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, ProForCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM3", "SELECT ProForL, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, EmprCod, CliCod, ProForCod, TipColCod, ForSer, ForColNom, ForColNum FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM4", "SELECT ProForDsc, ProForAct FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM5", "SELECT ForRelBan FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM6", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProForL, T2.ForRelBan, T3.ProForDsc, TM1.ProForFR, TM1.ProFoNPrg, TM1.ProForrbn, TM1.ProForVol, TM1.ProForMq, TM1.ProForH2O, T3.ProForAct, TM1.EmprCod, TM1.CliCod, TM1.ProForCod, TM1.TipColCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum FROM ((TXPLFORMU TM1 INNER JOIN TXPCFORMU T2 ON T2.EmprCod = TM1.EmprCod AND T2.CliCod = TM1.CliCod AND T2.ForSer = TM1.ForSer AND T2.ForColNom = TM1.ForColNom AND T2.ForColNum = TM1.ForColNum AND T2.TipColCod = TM1.TipColCod) INNER JOIN TXPCPROFO T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProForCod = TM1.ProForCod) WHERE TM1.EmprCod = ? and TM1.CliCod = ? and TM1.ForSer = ? and TM1.ForColNom = ? and TM1.ForColNum = ? and TM1.TipColCod = ? and TM1.ProForL = ? ORDER BY TM1.EmprCod, TM1.CliCod, TM1.ForSer, TM1.ForColNom, TM1.ForColNum, TM1.TipColCod, TM1.ProForL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM7", "SELECT ProForDsc, ProForAct FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM8", "SELECT ForRelBan FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE ( EmprCod > ? or EmprCod = ? and CliCod > ? or CliCod = ? and EmprCod = ? and ForSer > ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom > ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum > ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod > ? or TipColCod = ? and ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ProForL > ?) ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01QM11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU WHERE ( EmprCod < ? or EmprCod = ? and CliCod < ? or CliCod = ? and EmprCod = ? and ForSer < ? or ForSer = ? and CliCod = ? and EmprCod = ? and ForColNom < ? or ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ForColNum < ? or ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and TipColCod < ? or TipColCod = ? and ForColNum = ? and ForColNom = ? and ForSer = ? and CliCod = ? and EmprCod = ? and ProForL < ?) ORDER BY EmprCod DESC, CliCod DESC, ForSer DESC, ForColNom DESC, ForColNum DESC, TipColCod DESC, ProForL DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01QM12", "INSERT INTO TXPLFORMU(ProForL, ProForFR, ProFoNPrg, ProForrbn, ProForVol, ProForMq, ProForH2O, EmprCod, CliCod, ProForCod, TipColCod, ForSer, ForColNom, ForColNum, ProforFabs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0)", GX_NOMASK, "TXPLFORMU")
         ,new UpdateCursor("T01QM13", "UPDATE TXPLFORMU SET ProForFR=?, ProFoNPrg=?, ProForrbn=?, ProForVol=?, ProForMq=?, ProForH2O=?, ProForCod=?  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK, "TXPLFORMU")
         ,new UpdateCursor("T01QM14", "DELETE FROM TXPLFORMU  WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? AND ProForL = ?", GX_NOMASK, "TXPLFORMU")
         ,new ForEachCursor("T01QM15", "SELECT ForRelBan FROM TXPCFORMU WHERE EmprCod = ? AND CliCod = ? AND ForSer = ? AND ForColNom = ? AND ForColNum = ? AND TipColCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM16", "SELECT ProForDsc, ProForAct FROM TXPCPROFO WHERE EmprCod = ? AND ProForCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01QM17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL FROM TXPLFORMU ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod, ProForL ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 6);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 16);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((int[]) buf[13])[0] = rslt.getInt(14);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 3 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((int[]) buf[5])[0] = rslt.getInt(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,2);
               ((int[]) buf[7])[0] = rslt.getInt(7);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((byte[]) buf[14])[0] = rslt.getByte(14);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 13);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 6 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 13 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
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
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 13);
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 16);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setString(6, (String)parms[5], 16);
               stmt.setString(7, (String)parms[6], 16);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 13);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setString(12, (String)parms[11], 16);
               stmt.setInt(13, ((Number) parms[12]).intValue());
               stmt.setString(14, (String)parms[13], 3);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setString(17, (String)parms[16], 13);
               stmt.setString(18, (String)parms[17], 16);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               stmt.setString(20, (String)parms[19], 3);
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setString(24, (String)parms[23], 13);
               stmt.setString(25, (String)parms[24], 16);
               stmt.setInt(26, ((Number) parms[25]).intValue());
               stmt.setString(27, (String)parms[26], 3);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 2);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setString(6, (String)parms[5], 6);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 6);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 16);
               stmt.setString(13, (String)parms[12], 13);
               stmt.setInt(14, ((Number) parms[13]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setBigDecimal(3, (java.math.BigDecimal)parms[2], 2);
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 6);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 6);
               stmt.setString(8, (String)parms[7], 3);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setString(10, (String)parms[9], 16);
               stmt.setString(11, (String)parms[10], 13);
               stmt.setInt(12, ((Number) parms[11]).intValue());
               stmt.setByte(13, ((Number) parms[12]).byteValue());
               stmt.setShort(14, ((Number) parms[13]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 13);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

