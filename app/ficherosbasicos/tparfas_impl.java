package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tparfas_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"PARFASCOD") == 0 )
      {
         AV33ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ParFasCod), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33ParFasCod), "ZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asaparfascod5H229( AV33ParFasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"PARFASCOD") == 0 )
      {
         A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         AV43autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asaparfascod5H229( A1664ParFasCod, AV43autonumber, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa124515H229( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel14"+"_"+"") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxasa124505H229( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel15"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel16"+"_"+"") == 0 )
      {
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_24") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A12451ParEspId = (short)(GXutil.lval( httpContext.GetPar( "ParEspId"))) ;
         n12451ParEspId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12451ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12451ParEspId), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_24( A396EmprCod, A12451ParEspId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_25") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A13203ParUndID = (short)(GXutil.lval( httpContext.GetPar( "ParUndID"))) ;
         n13203ParUndID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_25( A396EmprCod, A13203ParUndID) ;
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
            AV25EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
            AV33ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33ParFasCod), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33ParFasCod), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PARAMETROS FASES PRODUCCION", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tparfas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tparfas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tparfas_impl.class ));
   }

   public tparfas_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParFasCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParFasCod_Internalname, httpContext.getMessage( "Codigo Parametro Fase", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParFasCod_Internalname, GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1664ParFasCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParFasCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtParFasCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParFasDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParFasDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParFasDsc_Internalname, GXutil.rtrim( A1665ParFasDsc), GXutil.rtrim( localUtil.format( A1665ParFasDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParFasDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtParFasDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPARFAS.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedparundid_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockparundid_Internalname, httpContext.getMessage( "Unidad", ""), "", "", lblTextblockparundid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_parundid.setProperty("Caption", Combo_parundid_Caption);
      ucCombo_parundid.setProperty("Cls", Combo_parundid_Cls);
      ucCombo_parundid.setProperty("EmptyItem", Combo_parundid_Emptyitem);
      ucCombo_parundid.setProperty("DropDownOptionsData", AV41ParUndID_Data);
      ucCombo_parundid.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_parundid_Internalname, "COMBO_PARUNDIDContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParUndID_Internalname, httpContext.getMessage( "Unidad", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParUndID_Internalname, GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13203ParUndID), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParUndID_Jsonclick, 0, "Attribute", "", "", "", "", edtParUndID_Visible, edtParUndID_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParNVar_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParNVar_Internalname, httpContext.getMessage( "N Variable", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParNVar_Internalname, GXutil.ltrim( localUtil.ntoc( A10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtParNVar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A10584ParNVar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A10584ParNVar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParNVar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtParNVar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParTit_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParTit_Internalname, httpContext.getMessage( "Titulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParTit_Internalname, GXutil.rtrim( A10585ParTit), GXutil.rtrim( localUtil.format( A10585ParTit, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParTit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtParTit_Enabled, 0, "text", "", 15, "chr", 1, "row", 15, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, divUnnamedtable2_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divParespid_cell_Internalname, 1, 0, "px", 0, "px", divParespid_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtParEspId_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParEspId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParEspId_Internalname, httpContext.getMessage( "Id Especifiación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtParEspId_Internalname, GXutil.ltrim( localUtil.ntoc( A12451ParEspId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A12451ParEspId), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParEspId_Jsonclick, 0, "AttributeFL", "", "", "", "", edtParEspId_Visible, edtParEspId_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divParespdc_cell_Internalname, 1, 0, "px", 0, "px", divParespdc_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", edtParEspDc_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtParEspDc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtParEspDc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtParEspDc_Internalname, GXutil.rtrim( A12450ParEspDc), GXutil.rtrim( localUtil.format( A12450ParEspDc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtParEspDc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtParEspDc_Visible, edtParEspDc_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TPARFAS.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV44Pgmname), GXutil.rtrim( localUtil.format( AV44Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPARFAS.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_parundid_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboparundid_Internalname, GXutil.ltrim( localUtil.ntoc( AV42ComboParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboparundid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42ComboParUndID), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42ComboParUndID), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboparundid_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboparundid_Visible, edtavComboparundid_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TPARFAS.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      e115H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPARUNDID_DATA"), AV41ParUndID_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z1664ParFasCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z1665ParFasDsc = httpContext.cgiGet( "Z1665ParFasDsc") ;
            Z10584ParNVar = (short)(localUtil.ctol( httpContext.cgiGet( "Z10584ParNVar"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10585ParTit = httpContext.cgiGet( "Z10585ParTit") ;
            Z12451ParEspId = (short)(localUtil.ctol( httpContext.cgiGet( "Z12451ParEspId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z13203ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( "Z13203ParUndID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N12451ParEspId = (short)(localUtil.ctol( httpContext.cgiGet( "N12451ParEspId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N13203ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( "N13203ParUndID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13741ParCDsc = httpContext.cgiGet( "PARCDSC") ;
            AV25EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV33ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( "vPARFASCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV43autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV30Insert_ParEspId = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PARESPID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV31Insert_ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_PARUNDID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A13204ParUndDsc = httpContext.cgiGet( "PARUNDDSC") ;
            n13204ParUndDsc = false ;
            Combo_parundid_Objectcall = httpContext.cgiGet( "COMBO_PARUNDID_Objectcall") ;
            Combo_parundid_Class = httpContext.cgiGet( "COMBO_PARUNDID_Class") ;
            Combo_parundid_Icontype = httpContext.cgiGet( "COMBO_PARUNDID_Icontype") ;
            Combo_parundid_Icon = httpContext.cgiGet( "COMBO_PARUNDID_Icon") ;
            Combo_parundid_Caption = httpContext.cgiGet( "COMBO_PARUNDID_Caption") ;
            Combo_parundid_Tooltip = httpContext.cgiGet( "COMBO_PARUNDID_Tooltip") ;
            Combo_parundid_Cls = httpContext.cgiGet( "COMBO_PARUNDID_Cls") ;
            Combo_parundid_Selectedvalue_set = httpContext.cgiGet( "COMBO_PARUNDID_Selectedvalue_set") ;
            Combo_parundid_Selectedvalue_get = httpContext.cgiGet( "COMBO_PARUNDID_Selectedvalue_get") ;
            Combo_parundid_Selectedtext_set = httpContext.cgiGet( "COMBO_PARUNDID_Selectedtext_set") ;
            Combo_parundid_Selectedtext_get = httpContext.cgiGet( "COMBO_PARUNDID_Selectedtext_get") ;
            Combo_parundid_Gamoauthtoken = httpContext.cgiGet( "COMBO_PARUNDID_Gamoauthtoken") ;
            Combo_parundid_Ddointernalname = httpContext.cgiGet( "COMBO_PARUNDID_Ddointernalname") ;
            Combo_parundid_Titlecontrolalign = httpContext.cgiGet( "COMBO_PARUNDID_Titlecontrolalign") ;
            Combo_parundid_Dropdownoptionstype = httpContext.cgiGet( "COMBO_PARUNDID_Dropdownoptionstype") ;
            Combo_parundid_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Enabled")) ;
            Combo_parundid_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Visible")) ;
            Combo_parundid_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_PARUNDID_Titlecontrolidtoreplace") ;
            Combo_parundid_Datalisttype = httpContext.cgiGet( "COMBO_PARUNDID_Datalisttype") ;
            Combo_parundid_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Allowmultipleselection")) ;
            Combo_parundid_Datalistfixedvalues = httpContext.cgiGet( "COMBO_PARUNDID_Datalistfixedvalues") ;
            Combo_parundid_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Isgriditem")) ;
            Combo_parundid_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Hasdescription")) ;
            Combo_parundid_Datalistproc = httpContext.cgiGet( "COMBO_PARUNDID_Datalistproc") ;
            Combo_parundid_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_PARUNDID_Datalistprocparametersprefix") ;
            Combo_parundid_Remoteservicesparameters = httpContext.cgiGet( "COMBO_PARUNDID_Remoteservicesparameters") ;
            Combo_parundid_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_PARUNDID_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_parundid_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Includeonlyselectedoption")) ;
            Combo_parundid_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Includeselectalloption")) ;
            Combo_parundid_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Emptyitem")) ;
            Combo_parundid_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_PARUNDID_Includeaddnewoption")) ;
            Combo_parundid_Htmltemplate = httpContext.cgiGet( "COMBO_PARUNDID_Htmltemplate") ;
            Combo_parundid_Multiplevaluestype = httpContext.cgiGet( "COMBO_PARUNDID_Multiplevaluestype") ;
            Combo_parundid_Loadingdata = httpContext.cgiGet( "COMBO_PARUNDID_Loadingdata") ;
            Combo_parundid_Noresultsfound = httpContext.cgiGet( "COMBO_PARUNDID_Noresultsfound") ;
            Combo_parundid_Emptyitemtext = httpContext.cgiGet( "COMBO_PARUNDID_Emptyitemtext") ;
            Combo_parundid_Onlyselectedvalues = httpContext.cgiGet( "COMBO_PARUNDID_Onlyselectedvalues") ;
            Combo_parundid_Selectalltext = httpContext.cgiGet( "COMBO_PARUNDID_Selectalltext") ;
            Combo_parundid_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_PARUNDID_Multiplevaluesseparator") ;
            Combo_parundid_Addnewoptiontext = httpContext.cgiGet( "COMBO_PARUNDID_Addnewoptiontext") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARFASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A1664ParFasCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
            }
            else
            {
               A1664ParFasCod = (short)(localUtil.ctol( httpContext.cgiGet( edtParFasCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
            }
            A1665ParFasDsc = httpContext.cgiGet( edtParFasDsc_Internalname) ;
            n1665ParFasDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", A1665ParFasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParUndID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParUndID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARUNDID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParUndID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A13203ParUndID = (short)(0) ;
               n13203ParUndID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
            }
            else
            {
               A13203ParUndID = (short)(localUtil.ctol( httpContext.cgiGet( edtParUndID_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n13203ParUndID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParNVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParNVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARNVAR");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParNVar_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A10584ParNVar = (short)(0) ;
               n10584ParNVar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10584ParNVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10584ParNVar), 4, 0));
            }
            else
            {
               A10584ParNVar = (short)(localUtil.ctol( httpContext.cgiGet( edtParNVar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n10584ParNVar = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A10584ParNVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10584ParNVar), 4, 0));
            }
            A10585ParTit = httpContext.cgiGet( edtParTit_Internalname) ;
            n10585ParTit = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A10585ParTit", A10585ParTit);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtParEspId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtParEspId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "PARESPID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParEspId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12451ParEspId = (short)(0) ;
               n12451ParEspId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12451ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12451ParEspId), 4, 0));
            }
            else
            {
               A12451ParEspId = (short)(localUtil.ctol( httpContext.cgiGet( edtParEspId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n12451ParEspId = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A12451ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12451ParEspId), 4, 0));
            }
            A12450ParEspDc = httpContext.cgiGet( edtParEspDc_Internalname) ;
            n12450ParEspDc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", A12450ParEspDc);
            AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
            AV42ComboParUndID = (short)(localUtil.ctol( httpContext.cgiGet( edtavComboparundid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ComboParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboParUndID), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPARFAS");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV44Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV44Pgmname, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A1664ParFasCod != Z1664ParFasCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tparfas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A1664ParFasCod = (short)(GXutil.lval( httpContext.GetPar( "ParFasCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
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
                  sMode229 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode229 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound229 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_5H0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PARFASCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtParFasCod_Internalname ;
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
                        e115H2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e125H2 ();
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
         e125H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll5H229( ) ;
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
         disableAttributes5H229( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboparundid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboparundid_Enabled), 5, 0), true);
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

   public void confirm_5H0( )
   {
      beforeValidate5H229( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls5H229( ) ;
         }
         else
         {
            checkExtendedTable5H229( ) ;
            closeExtendedTableCursors5H229( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption5H0( )
   {
   }

   public void e115H2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tparfas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      tparfas_impl.this.A396EmprCod = GXv_char2[0] ;
      tparfas_impl.this.AV16EmprNom = GXv_char3[0] ;
      tparfas_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXt_int5 = (byte)(AV43autonumber) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int6) ;
      tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
      AV43autonumber = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43autonumber), 4, 0));
      GXt_char1 = AV22Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tparfas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Station", AV22Station);
      GXv_char4[0] = AV25EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
      tparfas_impl.this.AV25EmprCod = GXv_char4[0] ;
      tparfas_impl.this.AV16EmprNom = GXv_char3[0] ;
      tparfas_impl.this.AV17UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext7[0] = AV27WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV27WWPContext = GXv_SdtWWPContext7[0] ;
      edtParUndID_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Visible), 5, 0), true);
      AV42ComboParUndID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboParUndID), 4, 0));
      edtavComboparundid_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboparundid_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboparundid_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPARUNDID' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV28TrnContext.fromxml(AV29WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV28TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV44Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV45GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GXV1), 8, 0));
         while ( AV45GXV1 <= AV28TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV32TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV28TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV45GXV1));
            if ( GXutil.strcmp(AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ParEspId") == 0 )
            {
               AV30Insert_ParEspId = (short)(GXutil.lval( AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30Insert_ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Insert_ParEspId), 4, 0));
            }
            else if ( GXutil.strcmp(AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ParUndID") == 0 )
            {
               AV31Insert_ParUndID = (short)(GXutil.lval( AV32TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Insert_ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Insert_ParUndID), 4, 0));
               if ( ! (0==AV31Insert_ParUndID) )
               {
                  AV42ComboParUndID = AV31Insert_ParUndID ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV42ComboParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboParUndID), 4, 0));
                  Combo_parundid_Selectedvalue_set = GXutil.trim( GXutil.str( AV42ComboParUndID, 4, 0)) ;
                  ucCombo_parundid.sendProperty(context, "", false, Combo_parundid_Internalname, "SelectedValue_set", Combo_parundid_Selectedvalue_set);
                  Combo_parundid_Enabled = false ;
                  ucCombo_parundid.sendProperty(context, "", false, Combo_parundid_Internalname, "Enabled", GXutil.booltostr( Combo_parundid_Enabled));
               }
            }
            AV45GXV1 = (int)(AV45GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45GXV1), 8, 0));
         }
      }
   }

   public void e125H2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV28TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tparfasww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(4);
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divParespid_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divParespid_cell_Internalname, "Class", divParespid_cell_Class, true);
      divParespdc_cell_Class = "col-xs-12 col-sm-6 DataContentCell" ;
      httpContext.ajax_rsp_assign_prop("", false, divParespdc_cell_Internalname, "Class", divParespdc_cell_Class, true);
      if ( ( edtParEspId_Visible == ( 0 )) && ( edtParEspDc_Visible == ( 0 )) )
      {
         divUnnamedtable2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOPARUNDID' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV41ParUndID_Data ;
      GXv_char4[0] = AV36ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.ficherosbasicos.tparfasloaddvcombo(remoteHandle, context).execute( "ParUndID", Gx_mode, AV25EmprCod, AV33ParFasCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tparfas_impl.this.AV36ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV41ParUndID_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_parundid_Selectedvalue_set = AV36ComboSelectedValue ;
      ucCombo_parundid.sendProperty(context, "", false, Combo_parundid_Internalname, "SelectedValue_set", Combo_parundid_Selectedvalue_set);
      AV42ComboParUndID = (short)(GXutil.lval( AV36ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ComboParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42ComboParUndID), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_parundid_Enabled = false ;
         ucCombo_parundid.sendProperty(context, "", false, Combo_parundid_Internalname, "Enabled", GXutil.booltostr( Combo_parundid_Enabled));
      }
   }

   public void zm5H229( int GX_JID )
   {
      if ( ( GX_JID == 22 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1665ParFasDsc = T005H3_A1665ParFasDsc[0] ;
            Z10584ParNVar = T005H3_A10584ParNVar[0] ;
            Z10585ParTit = T005H3_A10585ParTit[0] ;
            Z12451ParEspId = T005H3_A12451ParEspId[0] ;
            Z13203ParUndID = T005H3_A13203ParUndID[0] ;
         }
         else
         {
            Z1665ParFasDsc = A1665ParFasDsc ;
            Z10584ParNVar = A10584ParNVar ;
            Z10585ParTit = A10585ParTit ;
            Z12451ParEspId = A12451ParEspId ;
            Z13203ParUndID = A13203ParUndID ;
         }
      }
      if ( GX_JID == -22 )
      {
         Z1664ParFasCod = A1664ParFasCod ;
         Z1665ParFasDsc = A1665ParFasDsc ;
         Z10584ParNVar = A10584ParNVar ;
         Z10585ParTit = A10585ParTit ;
         Z396EmprCod = A396EmprCod ;
         Z12451ParEspId = A12451ParEspId ;
         Z13203ParUndID = A13203ParUndID ;
         Z407EmprNom = A407EmprNom ;
         Z12450ParEspDc = A12450ParEspDc ;
         Z13204ParUndDsc = A13204ParUndDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV44Pgmname = "FicherosBasicos.TPARFAS" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44Pgmname", AV44Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV25EmprCod)==0) )
      {
         A396EmprCod = AV25EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T005H4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T005H4_A407EmprNom[0] ;
      n407EmprNom = T005H4_n407EmprNom[0] ;
      pr_default.close(2);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
      edtParEspId_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEspId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspId_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divParespid_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divParespid_cell_Internalname, "Class", divParespid_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
         tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divParespid_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divParespid_cell_Internalname, "Class", divParespid_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
      edtParEspDc_Visible = ((GXt_int5==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEspDc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspDc_Visible), 5, 0), true);
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
      if ( ! ( ( GXt_int5 == 1 ) ) )
      {
         divParespdc_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divParespdc_cell_Internalname, "Class", divParespdc_cell_Class, true);
      }
      else
      {
         GXt_int5 = (byte)(0) ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
         tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
         if ( GXt_int5 == 1 )
         {
            divParespdc_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-6 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divParespdc_cell_Internalname, "Class", divParespdc_cell_Class, true);
         }
      }
      GXt_int5 = (byte)(0) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int6) ;
      tparfas_impl.this.GXt_int5 = GXv_int6[0] ;
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int11) ;
      tparfas_impl.this.GXt_int10 = GXv_int11[0] ;
      divUnnamedtable2_Visible = ((((GXt_int5==1))||((GXt_int10==1))) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, divUnnamedtable2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divUnnamedtable2_Visible), 5, 0), true);
      if ( ! (0==AV33ParFasCod) )
      {
         A1664ParFasCod = AV33ParFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
      if ( ! (0==AV33ParFasCod) )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtParFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV33ParFasCod) )
      {
         edtParFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV30Insert_ParEspId) )
      {
         edtParEspId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParEspId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspId_Enabled), 5, 0), true);
      }
      else
      {
         edtParEspId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParEspId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspId_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV31Insert_ParUndID) )
      {
         edtParUndID_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Enabled), 5, 0), true);
      }
      else
      {
         edtParUndID_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV30Insert_ParEspId) )
      {
         A12451ParEspId = AV30Insert_ParEspId ;
         n12451ParEspId = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A12451ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12451ParEspId), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV31Insert_ParUndID) )
      {
         A13203ParUndID = AV31Insert_ParUndID ;
         n13203ParUndID = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
      }
      else
      {
         if ( (0==AV42ComboParUndID) )
         {
            A13203ParUndID = (short)(0) ;
            n13203ParUndID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
            n13203ParUndID = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
         }
         else
         {
            if ( ! (0==AV42ComboParUndID) )
            {
               A13203ParUndID = AV42ComboParUndID ;
               n13203ParUndID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
            }
         }
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
         /* Using cursor T005H5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n12451ParEspId), Short.valueOf(A12451ParEspId)});
         A12450ParEspDc = T005H5_A12450ParEspDc[0] ;
         n12450ParEspDc = T005H5_n12450ParEspDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", A12450ParEspDc);
         pr_default.close(3);
         /* Using cursor T005H6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
         A13204ParUndDsc = T005H6_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T005H6_n13204ParUndDsc[0] ;
         pr_default.close(4);
      }
   }

   public void load5H229( )
   {
      /* Using cursor T005H7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound229 = (short)(1) ;
         A407EmprNom = T005H7_A407EmprNom[0] ;
         n407EmprNom = T005H7_n407EmprNom[0] ;
         A1665ParFasDsc = T005H7_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T005H7_n1665ParFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", A1665ParFasDsc);
         A10584ParNVar = T005H7_A10584ParNVar[0] ;
         n10584ParNVar = T005H7_n10584ParNVar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10584ParNVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10584ParNVar), 4, 0));
         A10585ParTit = T005H7_A10585ParTit[0] ;
         n10585ParTit = T005H7_n10585ParTit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10585ParTit", A10585ParTit);
         A12450ParEspDc = T005H7_A12450ParEspDc[0] ;
         n12450ParEspDc = T005H7_n12450ParEspDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", A12450ParEspDc);
         A13204ParUndDsc = T005H7_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T005H7_n13204ParUndDsc[0] ;
         A12451ParEspId = T005H7_A12451ParEspId[0] ;
         n12451ParEspId = T005H7_n12451ParEspId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12451ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12451ParEspId), 4, 0));
         A13203ParUndID = T005H7_A13203ParUndID[0] ;
         n13203ParUndID = T005H7_n13203ParUndID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
         zm5H229( -22) ;
      }
      pr_default.close(5);
      onLoadActions5H229( ) ;
   }

   public void onLoadActions5H229( )
   {
      A13741ParCDsc = GXutil.trim( GXutil.str( A1664ParFasCod, 4, 0)) + "-" + GXutil.trim( A1665ParFasDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13741ParCDsc", A13741ParCDsc);
   }

   public void checkExtendedTable5H229( )
   {
      nIsDirty_229 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      nIsDirty_229 = (short)(1) ;
      A13741ParCDsc = GXutil.trim( GXutil.str( A1664ParFasCod, 4, 0)) + "-" + GXutil.trim( A1665ParFasDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13741ParCDsc", A13741ParCDsc);
      /* Using cursor T005H5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n12451ParEspId), Short.valueOf(A12451ParEspId)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12451ParEspId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Especificaciones o Codiciones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARESPID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParEspId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A12450ParEspDc = T005H5_A12450ParEspDc[0] ;
      n12450ParEspDc = T005H5_n12450ParEspDc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", A12450ParEspDc);
      pr_default.close(3);
      /* Using cursor T005H6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParUndID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A13204ParUndDsc = T005H6_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T005H6_n13204ParUndDsc[0] ;
      pr_default.close(4);
   }

   public void closeExtendedTableCursors5H229( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_24( String A396EmprCod ,
                          short A12451ParEspId )
   {
      /* Using cursor T005H8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n12451ParEspId), Short.valueOf(A12451ParEspId)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12451ParEspId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Especificaciones o Codiciones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARESPID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParEspId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A12450ParEspDc = T005H8_A12450ParEspDc[0] ;
      n12450ParEspDc = T005H8_n12450ParEspDc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", A12450ParEspDc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A12450ParEspDc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_25( String A396EmprCod ,
                          short A13203ParUndID )
   {
      /* Using cursor T005H9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParUndID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A13204ParUndDsc = T005H9_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T005H9_n13204ParUndDsc[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A13204ParUndDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey5H229( )
   {
      /* Using cursor T005H10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound229 = (short)(1) ;
      }
      else
      {
         RcdFound229 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T005H3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T005H3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm5H229( 22) ;
         RcdFound229 = (short)(1) ;
         A1664ParFasCod = T005H3_A1664ParFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         A1665ParFasDsc = T005H3_A1665ParFasDsc[0] ;
         n1665ParFasDsc = T005H3_n1665ParFasDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", A1665ParFasDsc);
         A10584ParNVar = T005H3_A10584ParNVar[0] ;
         n10584ParNVar = T005H3_n10584ParNVar[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10584ParNVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10584ParNVar), 4, 0));
         A10585ParTit = T005H3_A10585ParTit[0] ;
         n10585ParTit = T005H3_n10585ParTit[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10585ParTit", A10585ParTit);
         A12451ParEspId = T005H3_A12451ParEspId[0] ;
         n12451ParEspId = T005H3_n12451ParEspId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12451ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12451ParEspId), 4, 0));
         A13203ParUndID = T005H3_A13203ParUndID[0] ;
         n13203ParUndID = T005H3_n13203ParUndID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z1664ParFasCod = A1664ParFasCod ;
         sMode229 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load5H229( ) ;
         if ( AnyError == 1 )
         {
            RcdFound229 = (short)(0) ;
            initializeNonKey5H229( ) ;
         }
         Gx_mode = sMode229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound229 = (short)(0) ;
         initializeNonKey5H229( ) ;
         sMode229 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode229 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey5H229( ) ;
      if ( RcdFound229 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound229 = (short)(0) ;
      /* Using cursor T005H11 */
      pr_default.execute(9, new Object[] {Short.valueOf(A1664ParFasCod), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T005H11_A1664ParFasCod[0] < A1664ParFasCod ) ) && ( GXutil.strcmp(T005H11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T005H11_A1664ParFasCod[0] > A1664ParFasCod ) ) && ( GXutil.strcmp(T005H11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1664ParFasCod = T005H11_A1664ParFasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
            RcdFound229 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound229 = (short)(0) ;
      /* Using cursor T005H12 */
      pr_default.execute(10, new Object[] {Short.valueOf(A1664ParFasCod), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T005H12_A1664ParFasCod[0] > A1664ParFasCod ) ) && ( GXutil.strcmp(T005H12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T005H12_A1664ParFasCod[0] < A1664ParFasCod ) ) && ( GXutil.strcmp(T005H12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A1664ParFasCod = T005H12_A1664ParFasCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
            RcdFound229 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey5H229( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert5H229( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound229 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1664ParFasCod != Z1664ParFasCod ) )
            {
               A1664ParFasCod = Z1664ParFasCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PARFASCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update5H229( ) ;
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1664ParFasCod != Z1664ParFasCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtParFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert5H229( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PARFASCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtParFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtParFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert5H229( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A1664ParFasCod != Z1664ParFasCod ) )
      {
         A1664ParFasCod = Z1664ParFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency5H229( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T005H2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPARFAS"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z1665ParFasDsc, T005H2_A1665ParFasDsc[0]) != 0 ) || ( Z10584ParNVar != T005H2_A10584ParNVar[0] ) || ( GXutil.strcmp(Z10585ParTit, T005H2_A10585ParTit[0]) != 0 ) || ( Z12451ParEspId != T005H2_A12451ParEspId[0] ) || ( Z13203ParUndID != T005H2_A13203ParUndID[0] ) )
         {
            if ( GXutil.strcmp(Z1665ParFasDsc, T005H2_A1665ParFasDsc[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tparfas:[seudo value changed for attri]"+"ParFasDsc");
               GXutil.writeLogRaw("Old: ",Z1665ParFasDsc);
               GXutil.writeLogRaw("Current: ",T005H2_A1665ParFasDsc[0]);
            }
            if ( Z10584ParNVar != T005H2_A10584ParNVar[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tparfas:[seudo value changed for attri]"+"ParNVar");
               GXutil.writeLogRaw("Old: ",Z10584ParNVar);
               GXutil.writeLogRaw("Current: ",T005H2_A10584ParNVar[0]);
            }
            if ( GXutil.strcmp(Z10585ParTit, T005H2_A10585ParTit[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tparfas:[seudo value changed for attri]"+"ParTit");
               GXutil.writeLogRaw("Old: ",Z10585ParTit);
               GXutil.writeLogRaw("Current: ",T005H2_A10585ParTit[0]);
            }
            if ( Z12451ParEspId != T005H2_A12451ParEspId[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tparfas:[seudo value changed for attri]"+"ParEspId");
               GXutil.writeLogRaw("Old: ",Z12451ParEspId);
               GXutil.writeLogRaw("Current: ",T005H2_A12451ParEspId[0]);
            }
            if ( Z13203ParUndID != T005H2_A13203ParUndID[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tparfas:[seudo value changed for attri]"+"ParUndID");
               GXutil.writeLogRaw("Old: ",Z13203ParUndID);
               GXutil.writeLogRaw("Current: ",T005H2_A13203ParUndID[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPARFAS"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert5H229( )
   {
      beforeValidate5H229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5H229( ) ;
      }
      if ( AnyError == 0 )
      {
         zm5H229( 0) ;
         checkOptimisticConcurrency5H229( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5H229( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert5H229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005H13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A1664ParFasCod), Boolean.valueOf(n1665ParFasDsc), A1665ParFasDsc, Boolean.valueOf(n10584ParNVar), Short.valueOf(A10584ParNVar), Boolean.valueOf(n10585ParTit), A10585ParTit, A396EmprCod, Boolean.valueOf(n12451ParEspId), Short.valueOf(A12451ParEspId), Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFAS");
                  if ( (pr_default.getStatus(11) == 1) )
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
                        resetCaption5H0( ) ;
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
            load5H229( ) ;
         }
         endLevel5H229( ) ;
      }
      closeExtendedTableCursors5H229( ) ;
   }

   public void update5H229( )
   {
      beforeValidate5H229( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable5H229( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5H229( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm5H229( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate5H229( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T005H14 */
                  pr_default.execute(12, new Object[] {Boolean.valueOf(n1665ParFasDsc), A1665ParFasDsc, Boolean.valueOf(n10584ParNVar), Short.valueOf(A10584ParNVar), Boolean.valueOf(n10585ParTit), A10585ParTit, Boolean.valueOf(n12451ParEspId), Short.valueOf(A12451ParEspId), Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID), A396EmprCod, Short.valueOf(A1664ParFasCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFAS");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPARFAS"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate5H229( ) ;
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
         endLevel5H229( ) ;
      }
      closeExtendedTableCursors5H229( ) ;
   }

   public void deferredUpdate5H229( )
   {
   }

   public void delete( )
   {
      beforeValidate5H229( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency5H229( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls5H229( ) ;
         afterConfirm5H229( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete5H229( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T005H15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPARFAS");
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
      sMode229 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel5H229( ) ;
      Gx_mode = sMode229 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls5H229( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13741ParCDsc = GXutil.trim( GXutil.str( A1664ParFasCod, 4, 0)) + "-" + GXutil.trim( A1665ParFasDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13741ParCDsc", A13741ParCDsc);
         /* Using cursor T005H16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n12451ParEspId), Short.valueOf(A12451ParEspId)});
         A12450ParEspDc = T005H16_A12450ParEspDc[0] ;
         n12450ParEspDc = T005H16_n12450ParEspDc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", A12450ParEspDc);
         pr_default.close(14);
         /* Using cursor T005H17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
         A13204ParUndDsc = T005H17_A13204ParUndDsc[0] ;
         n13204ParUndDsc = T005H17_n13204ParUndDsc[0] ;
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T005H18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Valores de Parámetros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T005H19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T005H20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARAMETROS PROCESOS", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T005H21 */
         pr_default.execute(19, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CAPFM2", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T005H22 */
         pr_default.execute(20, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARTI1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T005H23 */
         pr_default.execute(21, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PARAR1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T005H24 */
         pr_default.execute(22, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISPAR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T005H25 */
         pr_default.execute(23, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametro por Fase-Serie-Clien", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T005H26 */
         pr_default.execute(24, new Object[] {A396EmprCod, Short.valueOf(A1664ParFasCod)});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Parametros por fase de la HR", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
      }
   }

   public void endLevel5H229( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete5H229( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tparfas");
         if ( AnyError == 0 )
         {
            confirmValues5H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tparfas");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart5H229( )
   {
      /* Scan By routine */
      /* Using cursor T005H27 */
      pr_default.execute(25, new Object[] {A396EmprCod});
      RcdFound229 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound229 = (short)(1) ;
         A1664ParFasCod = T005H27_A1664ParFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext5H229( )
   {
      /* Scan next routine */
      pr_default.readNext(25);
      RcdFound229 = (short)(0) ;
      if ( (pr_default.getStatus(25) != 101) )
      {
         RcdFound229 = (short)(1) ;
         A1664ParFasCod = T005H27_A1664ParFasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
   }

   public void scanEnd5H229( )
   {
      pr_default.close(25);
   }

   public void afterConfirm5H229( )
   {
      /* After Confirm Rules */
      if ( (0==A1664ParFasCod) && (0==AV43autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "PARFASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtParFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert5H229( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A1664ParFasCod) && ( AV43autonumber == 1 ) )
      {
         GXt_int12 = A1664ParFasCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.ficherosbasicos.tparfas_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int13) ;
         tparfas_impl.this.GXt_int12 = GXv_int13[0] ;
         A1664ParFasCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
   }

   public void beforeUpdate5H229( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete5H229( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete5H229( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate5H229( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes5H229( )
   {
      edtParFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasCod_Enabled), 5, 0), true);
      edtParFasDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParFasDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParFasDsc_Enabled), 5, 0), true);
      edtParUndID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParUndID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParUndID_Enabled), 5, 0), true);
      edtParNVar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParNVar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParNVar_Enabled), 5, 0), true);
      edtParTit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParTit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParTit_Enabled), 5, 0), true);
      edtParEspId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEspId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspId_Enabled), 5, 0), true);
      edtParEspDc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEspDc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspDc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboparundid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboparundid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboparundid_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes5H229( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues5H0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tparfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33ParFasCod,4,0))}, new String[] {"Gx_mode","EmprCod","ParFasCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPARFAS");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV44Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tparfas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1664ParFasCod", GXutil.ltrim( localUtil.ntoc( Z1664ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z1665ParFasDsc", GXutil.rtrim( Z1665ParFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10584ParNVar", GXutil.ltrim( localUtil.ntoc( Z10584ParNVar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10585ParTit", GXutil.rtrim( Z10585ParTit));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12451ParEspId", GXutil.ltrim( localUtil.ntoc( Z12451ParEspId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13203ParUndID", GXutil.ltrim( localUtil.ntoc( Z13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N12451ParEspId", GXutil.ltrim( localUtil.ntoc( A12451ParEspId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N13203ParUndID", GXutil.ltrim( localUtil.ntoc( A13203ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPARUNDID_DATA", AV41ParUndID_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPARUNDID_DATA", AV41ParUndID_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV28TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV28TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV28TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "PARCDSC", A13741ParCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV25EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV25EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARFASCOD", GXutil.ltrim( localUtil.ntoc( AV33ParFasCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARFASCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV33ParFasCod), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV43autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PARESPID", GXutil.ltrim( localUtil.ntoc( AV30Insert_ParEspId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_PARUNDID", GXutil.ltrim( localUtil.ntoc( AV31Insert_ParUndID, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PARUNDDSC", GXutil.rtrim( A13204ParUndDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARUNDID_Objectcall", GXutil.rtrim( Combo_parundid_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARUNDID_Cls", GXutil.rtrim( Combo_parundid_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARUNDID_Selectedvalue_set", GXutil.rtrim( Combo_parundid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARUNDID_Enabled", GXutil.booltostr( Combo_parundid_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PARUNDID_Emptyitem", GXutil.booltostr( Combo_parundid_Emptyitem));
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
      return formatLink("app.ficherosbasicos.tparfas", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV25EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV33ParFasCod,4,0))}, new String[] {"Gx_mode","EmprCod","ParFasCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TPARFAS" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PARAMETROS FASES PRODUCCION", "") ;
   }

   public void initializeNonKey5H229( )
   {
      A12451ParEspId = (short)(0) ;
      n12451ParEspId = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12451ParEspId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A12451ParEspId), 4, 0));
      A13203ParUndID = (short)(0) ;
      n13203ParUndID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13203ParUndID", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13203ParUndID), 4, 0));
      A13741ParCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13741ParCDsc", A13741ParCDsc);
      A1665ParFasDsc = "" ;
      n1665ParFasDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1665ParFasDsc", A1665ParFasDsc);
      A10584ParNVar = (short)(0) ;
      n10584ParNVar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10584ParNVar", GXutil.ltrimstr( DecimalUtil.doubleToDec(A10584ParNVar), 4, 0));
      A10585ParTit = "" ;
      n10585ParTit = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A10585ParTit", A10585ParTit);
      A12450ParEspDc = "" ;
      n12450ParEspDc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", A12450ParEspDc);
      A13204ParUndDsc = "" ;
      n13204ParUndDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13204ParUndDsc", A13204ParUndDsc);
      Z1665ParFasDsc = "" ;
      Z10584ParNVar = (short)(0) ;
      Z10585ParTit = "" ;
      Z12451ParEspId = (short)(0) ;
      Z13203ParUndID = (short)(0) ;
   }

   public void initAll5H229( )
   {
      A1664ParFasCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      initializeNonKey5H229( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165434", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tparfas.js", "?2026821165434", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtParFasCod_Internalname = "PARFASCOD" ;
      edtParFasDsc_Internalname = "PARFASDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblockparundid_Internalname = "TEXTBLOCKPARUNDID" ;
      Combo_parundid_Internalname = "COMBO_PARUNDID" ;
      edtParUndID_Internalname = "PARUNDID" ;
      divTablesplittedparundid_Internalname = "TABLESPLITTEDPARUNDID" ;
      edtParNVar_Internalname = "PARNVAR" ;
      edtParTit_Internalname = "PARTIT" ;
      edtParEspId_Internalname = "PARESPID" ;
      divParespid_cell_Internalname = "PARESPID_CELL" ;
      edtParEspDc_Internalname = "PARESPDC" ;
      divParespdc_cell_Internalname = "PARESPDC_CELL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboparundid_Internalname = "vCOMBOPARUNDID" ;
      divSectionattribute_parundid_Internalname = "SECTIONATTRIBUTE_PARUNDID" ;
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
      Form.setCaption( httpContext.getMessage( "PARAMETROS FASES PRODUCCION", "") );
      edtavComboparundid_Jsonclick = "" ;
      edtavComboparundid_Enabled = 0 ;
      edtavComboparundid_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtParEspDc_Jsonclick = "" ;
      edtParEspDc_Enabled = 0 ;
      edtParEspDc_Visible = 1 ;
      divParespdc_cell_Class = "col-xs-12 col-sm-6" ;
      edtParEspId_Jsonclick = "" ;
      edtParEspId_Enabled = 1 ;
      edtParEspId_Visible = 1 ;
      divParespid_cell_Class = "col-xs-12 col-sm-6" ;
      divUnnamedtable2_Visible = 1 ;
      edtParTit_Jsonclick = "" ;
      edtParTit_Enabled = 1 ;
      edtParNVar_Jsonclick = "" ;
      edtParNVar_Enabled = 1 ;
      edtParUndID_Jsonclick = "" ;
      edtParUndID_Enabled = 1 ;
      edtParUndID_Visible = 1 ;
      Combo_parundid_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_parundid_Cls = "ExtendedCombo AttributeFL" ;
      Combo_parundid_Enabled = GXutil.toBoolean( -1) ;
      edtParFasDsc_Jsonclick = "" ;
      edtParFasDsc_Enabled = 1 ;
      edtParFasCod_Jsonclick = "" ;
      edtParFasCod_Enabled = 1 ;
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

   public void gx5asaparfascod5H229( short AV33ParFasCod )
   {
      if ( ! (0==AV33ParFasCod) )
      {
         A1664ParFasCod = AV33ParFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asaparfascod5H229( short A1664ParFasCod ,
                                     short AV43autonumber ,
                                     String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A1664ParFasCod) && ( AV43autonumber == 1 ) )
      {
         GXt_int12 = A1664ParFasCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.ficherosbasicos.tparfas_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int13) ;
         tparfas_impl.this.GXt_int12 = GXv_int13[0] ;
         A1664ParFasCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A1664ParFasCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1664ParFasCod), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A1664ParFasCod, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa124515H229( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int11) ;
      tparfas_impl.this.GXt_int10 = GXv_int11[0] ;
      edtParEspId_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEspId_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspId_Visible), 5, 0), true);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gxasa124505H229( String A396EmprCod )
   {
      GXt_int10 = (byte)(0) ;
      GXv_int11[0] = GXt_int10 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "ARTEXT", ""), ""), GXv_int11) ;
      tparfas_impl.this.GXt_int10 = GXv_int11[0] ;
      edtParEspDc_Visible = ((GXt_int10==1) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtParEspDc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtParEspDc_Visible), 5, 0), true);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
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

   public void valid_Parundid( )
   {
      n13203ParUndID = false ;
      n13204ParUndDsc = false ;
      /* Using cursor T005H17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n13203ParUndID), Short.valueOf(A13203ParUndID)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A13203ParUndID) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "UNIDADES PARAMETROS FASES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARUNDID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParUndID_Internalname ;
         }
      }
      A13204ParUndDsc = T005H17_A13204ParUndDsc[0] ;
      n13204ParUndDsc = T005H17_n13204ParUndDsc[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13204ParUndDsc", GXutil.rtrim( A13204ParUndDsc));
   }

   public void valid_Parespid( )
   {
      n12451ParEspId = false ;
      n12450ParEspDc = false ;
      /* Using cursor T005H16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n12451ParEspId), Short.valueOf(A12451ParEspId)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A12451ParEspId) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "Especificaciones o Codiciones", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PARESPID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtParEspId_Internalname ;
         }
      }
      A12450ParEspDc = T005H16_A12450ParEspDc[0] ;
      n12450ParEspDc = T005H16_n12450ParEspDc[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A12450ParEspDc", GXutil.rtrim( A12450ParEspDc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33ParFasCod',fld:'vPARFASCOD',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV25EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV33ParFasCod',fld:'vPARFASCOD',pic:'ZZZ9',hsh:true},{av:'AV44Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e125H2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV28TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PARFASCOD","{handler:'valid_Parfascod',iparms:[]");
      setEventMetadata("VALID_PARFASCOD",",oparms:[]}");
      setEventMetadata("VALID_PARFASDSC","{handler:'valid_Parfasdsc',iparms:[]");
      setEventMetadata("VALID_PARFASDSC",",oparms:[]}");
      setEventMetadata("VALID_PARUNDID","{handler:'valid_Parundid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13203ParUndID',fld:'PARUNDID',pic:'ZZZ9'},{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''}]");
      setEventMetadata("VALID_PARUNDID",",oparms:[{av:'A13204ParUndDsc',fld:'PARUNDDSC',pic:''}]}");
      setEventMetadata("VALID_PARESPID","{handler:'valid_Parespid',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A12451ParEspId',fld:'PARESPID',pic:'ZZZ9'},{av:'A12450ParEspDc',fld:'PARESPDC',pic:''}]");
      setEventMetadata("VALID_PARESPID",",oparms:[{av:'A12450ParEspDc',fld:'PARESPDC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOPARUNDID","{handler:'validv_Comboparundid',iparms:[]");
      setEventMetadata("VALIDV_COMBOPARUNDID",",oparms:[]}");
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
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV25EmprCod = "" ;
      Z396EmprCod = "" ;
      Z1665ParFasDsc = "" ;
      Z10585ParTit = "" ;
      Combo_parundid_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV25EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A1665ParFasDsc = "" ;
      lblTextblockparundid_Jsonclick = "" ;
      ucCombo_parundid = new com.genexus.webpanels.GXUserControl();
      Combo_parundid_Caption = "" ;
      AV41ParUndID_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A10585ParTit = "" ;
      A12450ParEspDc = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV44Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A13741ParCDsc = "" ;
      A407EmprNom = "" ;
      A13204ParUndDsc = "" ;
      Combo_parundid_Objectcall = "" ;
      Combo_parundid_Class = "" ;
      Combo_parundid_Icontype = "" ;
      Combo_parundid_Icon = "" ;
      Combo_parundid_Tooltip = "" ;
      Combo_parundid_Selectedvalue_set = "" ;
      Combo_parundid_Selectedtext_set = "" ;
      Combo_parundid_Selectedtext_get = "" ;
      Combo_parundid_Gamoauthtoken = "" ;
      Combo_parundid_Ddointernalname = "" ;
      Combo_parundid_Titlecontrolalign = "" ;
      Combo_parundid_Dropdownoptionstype = "" ;
      Combo_parundid_Titlecontrolidtoreplace = "" ;
      Combo_parundid_Datalisttype = "" ;
      Combo_parundid_Datalistfixedvalues = "" ;
      Combo_parundid_Datalistproc = "" ;
      Combo_parundid_Datalistprocparametersprefix = "" ;
      Combo_parundid_Remoteservicesparameters = "" ;
      Combo_parundid_Htmltemplate = "" ;
      Combo_parundid_Multiplevaluestype = "" ;
      Combo_parundid_Loadingdata = "" ;
      Combo_parundid_Noresultsfound = "" ;
      Combo_parundid_Emptyitemtext = "" ;
      Combo_parundid_Onlyselectedvalues = "" ;
      Combo_parundid_Selectalltext = "" ;
      Combo_parundid_Multiplevaluesseparator = "" ;
      Combo_parundid_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode229 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV22Station = "" ;
      AV16EmprNom = "" ;
      AV17UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV27WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV29WebSession = httpContext.getWebSession();
      AV32TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV36ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z12450ParEspDc = "" ;
      Z13204ParUndDsc = "" ;
      T005H4_A407EmprNom = new String[] {""} ;
      T005H4_n407EmprNom = new boolean[] {false} ;
      GXv_int6 = new byte[1] ;
      T005H5_A12450ParEspDc = new String[] {""} ;
      T005H5_n12450ParEspDc = new boolean[] {false} ;
      T005H6_A13204ParUndDsc = new String[] {""} ;
      T005H6_n13204ParUndDsc = new boolean[] {false} ;
      T005H7_A1664ParFasCod = new short[1] ;
      T005H7_A407EmprNom = new String[] {""} ;
      T005H7_n407EmprNom = new boolean[] {false} ;
      T005H7_A1665ParFasDsc = new String[] {""} ;
      T005H7_n1665ParFasDsc = new boolean[] {false} ;
      T005H7_A10584ParNVar = new short[1] ;
      T005H7_n10584ParNVar = new boolean[] {false} ;
      T005H7_A10585ParTit = new String[] {""} ;
      T005H7_n10585ParTit = new boolean[] {false} ;
      T005H7_A12450ParEspDc = new String[] {""} ;
      T005H7_n12450ParEspDc = new boolean[] {false} ;
      T005H7_A13204ParUndDsc = new String[] {""} ;
      T005H7_n13204ParUndDsc = new boolean[] {false} ;
      T005H7_A396EmprCod = new String[] {""} ;
      T005H7_A12451ParEspId = new short[1] ;
      T005H7_n12451ParEspId = new boolean[] {false} ;
      T005H7_A13203ParUndID = new short[1] ;
      T005H7_n13203ParUndID = new boolean[] {false} ;
      T005H8_A12450ParEspDc = new String[] {""} ;
      T005H8_n12450ParEspDc = new boolean[] {false} ;
      T005H9_A13204ParUndDsc = new String[] {""} ;
      T005H9_n13204ParUndDsc = new boolean[] {false} ;
      T005H10_A396EmprCod = new String[] {""} ;
      T005H10_A1664ParFasCod = new short[1] ;
      T005H3_A1664ParFasCod = new short[1] ;
      T005H3_A1665ParFasDsc = new String[] {""} ;
      T005H3_n1665ParFasDsc = new boolean[] {false} ;
      T005H3_A10584ParNVar = new short[1] ;
      T005H3_n10584ParNVar = new boolean[] {false} ;
      T005H3_A10585ParTit = new String[] {""} ;
      T005H3_n10585ParTit = new boolean[] {false} ;
      T005H3_A396EmprCod = new String[] {""} ;
      T005H3_A12451ParEspId = new short[1] ;
      T005H3_n12451ParEspId = new boolean[] {false} ;
      T005H3_A13203ParUndID = new short[1] ;
      T005H3_n13203ParUndID = new boolean[] {false} ;
      T005H11_A396EmprCod = new String[] {""} ;
      T005H11_A1664ParFasCod = new short[1] ;
      T005H12_A396EmprCod = new String[] {""} ;
      T005H12_A1664ParFasCod = new short[1] ;
      T005H2_A1664ParFasCod = new short[1] ;
      T005H2_A1665ParFasDsc = new String[] {""} ;
      T005H2_n1665ParFasDsc = new boolean[] {false} ;
      T005H2_A10584ParNVar = new short[1] ;
      T005H2_n10584ParNVar = new boolean[] {false} ;
      T005H2_A10585ParTit = new String[] {""} ;
      T005H2_n10585ParTit = new boolean[] {false} ;
      T005H2_A396EmprCod = new String[] {""} ;
      T005H2_A12451ParEspId = new short[1] ;
      T005H2_n12451ParEspId = new boolean[] {false} ;
      T005H2_A13203ParUndID = new short[1] ;
      T005H2_n13203ParUndID = new boolean[] {false} ;
      T005H16_A12450ParEspDc = new String[] {""} ;
      T005H16_n12450ParEspDc = new boolean[] {false} ;
      T005H17_A13204ParUndDsc = new String[] {""} ;
      T005H17_n13204ParUndDsc = new boolean[] {false} ;
      T005H18_A396EmprCod = new String[] {""} ;
      T005H18_A129BarCod = new int[1] ;
      T005H18_A132BarCodReo = new byte[1] ;
      T005H18_A130BarCodPar = new String[] {""} ;
      T005H18_A14152MEnvOrd = new short[1] ;
      T005H18_A1664ParFasCod = new short[1] ;
      T005H19_A396EmprCod = new String[] {""} ;
      T005H19_A13026PedDGId = new int[1] ;
      T005H19_A758ProCod = new String[] {""} ;
      T005H19_A13045PedDGFasLi = new short[1] ;
      T005H19_A1664ParFasCod = new short[1] ;
      T005H20_A396EmprCod = new String[] {""} ;
      T005H20_A758ProCod = new String[] {""} ;
      T005H20_A774ProNumLin = new short[1] ;
      T005H20_A7897Dtp_Ordl = new short[1] ;
      T005H20_A1664ParFasCod = new short[1] ;
      T005H21_A396EmprCod = new String[] {""} ;
      T005H21_A252CliCod = new int[1] ;
      T005H21_A65ArtCod = new String[] {""} ;
      T005H21_A758ProCod = new String[] {""} ;
      T005H21_A9836FasCodM = new String[] {""} ;
      T005H21_A9830MaqCodC = new String[] {""} ;
      T005H21_A1664ParFasCod = new short[1] ;
      T005H22_A396EmprCod = new String[] {""} ;
      T005H22_A252CliCod = new int[1] ;
      T005H22_A65ArtCod = new String[] {""} ;
      T005H22_A7135Lin_fast = new short[1] ;
      T005H22_A1664ParFasCod = new short[1] ;
      T005H23_A396EmprCod = new String[] {""} ;
      T005H23_A252CliCod = new int[1] ;
      T005H23_A65ArtCod = new String[] {""} ;
      T005H23_A758ProCod = new String[] {""} ;
      T005H23_A6986NumLinPro = new short[1] ;
      T005H23_A1664ParFasCod = new short[1] ;
      T005H24_A396EmprCod = new String[] {""} ;
      T005H24_A361DisCod = new int[1] ;
      T005H24_A758ProCod = new String[] {""} ;
      T005H24_A368DisFasLin = new short[1] ;
      T005H24_A1664ParFasCod = new short[1] ;
      T005H25_A396EmprCod = new String[] {""} ;
      T005H25_A252CliCod = new int[1] ;
      T005H25_A65ArtCod = new String[] {""} ;
      T005H25_A758ProCod = new String[] {""} ;
      T005H25_A457FasCod = new String[] {""} ;
      T005H25_A1664ParFasCod = new short[1] ;
      T005H26_A396EmprCod = new String[] {""} ;
      T005H26_A129BarCod = new int[1] ;
      T005H26_A132BarCodReo = new byte[1] ;
      T005H26_A130BarCodPar = new String[] {""} ;
      T005H26_A758ProCod = new String[] {""} ;
      T005H26_A194BarOrdLin = new short[1] ;
      T005H26_A1664ParFasCod = new short[1] ;
      T005H27_A396EmprCod = new String[] {""} ;
      T005H27_A1664ParFasCod = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int13 = new short[1] ;
      GXv_int11 = new byte[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfas__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfas__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfas__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfas__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tparfas__default(),
         new Object[] {
             new Object[] {
            T005H2_A1664ParFasCod, T005H2_A1665ParFasDsc, T005H2_n1665ParFasDsc, T005H2_A10584ParNVar, T005H2_n10584ParNVar, T005H2_A10585ParTit, T005H2_n10585ParTit, T005H2_A396EmprCod, T005H2_A12451ParEspId, T005H2_n12451ParEspId,
            T005H2_A13203ParUndID, T005H2_n13203ParUndID
            }
            , new Object[] {
            T005H3_A1664ParFasCod, T005H3_A1665ParFasDsc, T005H3_n1665ParFasDsc, T005H3_A10584ParNVar, T005H3_n10584ParNVar, T005H3_A10585ParTit, T005H3_n10585ParTit, T005H3_A396EmprCod, T005H3_A12451ParEspId, T005H3_n12451ParEspId,
            T005H3_A13203ParUndID, T005H3_n13203ParUndID
            }
            , new Object[] {
            T005H4_A407EmprNom, T005H4_n407EmprNom
            }
            , new Object[] {
            T005H5_A12450ParEspDc, T005H5_n12450ParEspDc
            }
            , new Object[] {
            T005H6_A13204ParUndDsc, T005H6_n13204ParUndDsc
            }
            , new Object[] {
            T005H7_A1664ParFasCod, T005H7_A407EmprNom, T005H7_n407EmprNom, T005H7_A1665ParFasDsc, T005H7_n1665ParFasDsc, T005H7_A10584ParNVar, T005H7_n10584ParNVar, T005H7_A10585ParTit, T005H7_n10585ParTit, T005H7_A12450ParEspDc,
            T005H7_n12450ParEspDc, T005H7_A13204ParUndDsc, T005H7_n13204ParUndDsc, T005H7_A396EmprCod, T005H7_A12451ParEspId, T005H7_n12451ParEspId, T005H7_A13203ParUndID, T005H7_n13203ParUndID
            }
            , new Object[] {
            T005H8_A12450ParEspDc, T005H8_n12450ParEspDc
            }
            , new Object[] {
            T005H9_A13204ParUndDsc, T005H9_n13204ParUndDsc
            }
            , new Object[] {
            T005H10_A396EmprCod, T005H10_A1664ParFasCod
            }
            , new Object[] {
            T005H11_A396EmprCod, T005H11_A1664ParFasCod
            }
            , new Object[] {
            T005H12_A396EmprCod, T005H12_A1664ParFasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T005H16_A12450ParEspDc, T005H16_n12450ParEspDc
            }
            , new Object[] {
            T005H17_A13204ParUndDsc, T005H17_n13204ParUndDsc
            }
            , new Object[] {
            T005H18_A396EmprCod, T005H18_A129BarCod, T005H18_A132BarCodReo, T005H18_A130BarCodPar, T005H18_A14152MEnvOrd, T005H18_A1664ParFasCod
            }
            , new Object[] {
            T005H19_A396EmprCod, T005H19_A13026PedDGId, T005H19_A758ProCod, T005H19_A13045PedDGFasLi, T005H19_A1664ParFasCod
            }
            , new Object[] {
            T005H20_A396EmprCod, T005H20_A758ProCod, T005H20_A774ProNumLin, T005H20_A7897Dtp_Ordl, T005H20_A1664ParFasCod
            }
            , new Object[] {
            T005H21_A396EmprCod, T005H21_A252CliCod, T005H21_A65ArtCod, T005H21_A758ProCod, T005H21_A9836FasCodM, T005H21_A9830MaqCodC, T005H21_A1664ParFasCod
            }
            , new Object[] {
            T005H22_A396EmprCod, T005H22_A252CliCod, T005H22_A65ArtCod, T005H22_A7135Lin_fast, T005H22_A1664ParFasCod
            }
            , new Object[] {
            T005H23_A396EmprCod, T005H23_A252CliCod, T005H23_A65ArtCod, T005H23_A758ProCod, T005H23_A6986NumLinPro, T005H23_A1664ParFasCod
            }
            , new Object[] {
            T005H24_A396EmprCod, T005H24_A361DisCod, T005H24_A758ProCod, T005H24_A368DisFasLin, T005H24_A1664ParFasCod
            }
            , new Object[] {
            T005H25_A396EmprCod, T005H25_A252CliCod, T005H25_A65ArtCod, T005H25_A758ProCod, T005H25_A457FasCod, T005H25_A1664ParFasCod
            }
            , new Object[] {
            T005H26_A396EmprCod, T005H26_A129BarCod, T005H26_A132BarCodReo, T005H26_A130BarCodPar, T005H26_A758ProCod, T005H26_A194BarOrdLin, T005H26_A1664ParFasCod
            }
            , new Object[] {
            T005H27_A396EmprCod, T005H27_A1664ParFasCod
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV44Pgmname = "FicherosBasicos.TPARFAS" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte GXt_int10 ;
   private byte GXv_int11[] ;
   private short wcpOAV33ParFasCod ;
   private short Z1664ParFasCod ;
   private short Z10584ParNVar ;
   private short Z12451ParEspId ;
   private short Z13203ParUndID ;
   private short N12451ParEspId ;
   private short N13203ParUndID ;
   private short AV33ParFasCod ;
   private short A1664ParFasCod ;
   private short AV43autonumber ;
   private short A12451ParEspId ;
   private short A13203ParUndID ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A10584ParNVar ;
   private short AV42ComboParUndID ;
   private short AV30Insert_ParEspId ;
   private short AV31Insert_ParUndID ;
   private short RcdFound229 ;
   private short nIsDirty_229 ;
   private short GXt_int12 ;
   private short GXv_int13[] ;
   private int trnEnded ;
   private int edtParFasCod_Enabled ;
   private int edtParFasDsc_Enabled ;
   private int edtParUndID_Visible ;
   private int edtParUndID_Enabled ;
   private int edtParNVar_Enabled ;
   private int edtParTit_Enabled ;
   private int divUnnamedtable2_Visible ;
   private int edtParEspId_Visible ;
   private int edtParEspId_Enabled ;
   private int edtParEspDc_Visible ;
   private int edtParEspDc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavComboparundid_Enabled ;
   private int edtavComboparundid_Visible ;
   private int Combo_parundid_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV45GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV25EmprCod ;
   private String Z396EmprCod ;
   private String Z1665ParFasDsc ;
   private String Z10585ParTit ;
   private String Combo_parundid_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV25EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtParFasCod_Internalname ;
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
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String edtParFasCod_Jsonclick ;
   private String edtParFasDsc_Internalname ;
   private String A1665ParFasDsc ;
   private String edtParFasDsc_Jsonclick ;
   private String divTablesplittedparundid_Internalname ;
   private String lblTextblockparundid_Internalname ;
   private String lblTextblockparundid_Jsonclick ;
   private String Combo_parundid_Caption ;
   private String Combo_parundid_Cls ;
   private String Combo_parundid_Internalname ;
   private String edtParUndID_Internalname ;
   private String edtParUndID_Jsonclick ;
   private String edtParNVar_Internalname ;
   private String edtParNVar_Jsonclick ;
   private String edtParTit_Internalname ;
   private String A10585ParTit ;
   private String edtParTit_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divParespid_cell_Internalname ;
   private String divParespid_cell_Class ;
   private String edtParEspId_Internalname ;
   private String edtParEspId_Jsonclick ;
   private String divParespdc_cell_Internalname ;
   private String divParespdc_cell_Class ;
   private String edtParEspDc_Internalname ;
   private String A12450ParEspDc ;
   private String edtParEspDc_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV44Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_parundid_Internalname ;
   private String edtavComboparundid_Internalname ;
   private String edtavComboparundid_Jsonclick ;
   private String A407EmprNom ;
   private String A13204ParUndDsc ;
   private String Combo_parundid_Objectcall ;
   private String Combo_parundid_Class ;
   private String Combo_parundid_Icontype ;
   private String Combo_parundid_Icon ;
   private String Combo_parundid_Tooltip ;
   private String Combo_parundid_Selectedvalue_set ;
   private String Combo_parundid_Selectedtext_set ;
   private String Combo_parundid_Selectedtext_get ;
   private String Combo_parundid_Gamoauthtoken ;
   private String Combo_parundid_Ddointernalname ;
   private String Combo_parundid_Titlecontrolalign ;
   private String Combo_parundid_Dropdownoptionstype ;
   private String Combo_parundid_Titlecontrolidtoreplace ;
   private String Combo_parundid_Datalisttype ;
   private String Combo_parundid_Datalistfixedvalues ;
   private String Combo_parundid_Datalistproc ;
   private String Combo_parundid_Datalistprocparametersprefix ;
   private String Combo_parundid_Remoteservicesparameters ;
   private String Combo_parundid_Htmltemplate ;
   private String Combo_parundid_Multiplevaluestype ;
   private String Combo_parundid_Loadingdata ;
   private String Combo_parundid_Noresultsfound ;
   private String Combo_parundid_Emptyitemtext ;
   private String Combo_parundid_Onlyselectedvalues ;
   private String Combo_parundid_Selectalltext ;
   private String Combo_parundid_Multiplevaluesseparator ;
   private String Combo_parundid_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode229 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV22Station ;
   private String AV16EmprNom ;
   private String AV17UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z12450ParEspDc ;
   private String Z13204ParUndDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n12451ParEspId ;
   private boolean n13203ParUndID ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_parundid_Emptyitem ;
   private boolean n407EmprNom ;
   private boolean n13204ParUndDsc ;
   private boolean Combo_parundid_Enabled ;
   private boolean Combo_parundid_Visible ;
   private boolean Combo_parundid_Allowmultipleselection ;
   private boolean Combo_parundid_Isgriditem ;
   private boolean Combo_parundid_Hasdescription ;
   private boolean Combo_parundid_Includeonlyselectedoption ;
   private boolean Combo_parundid_Includeselectalloption ;
   private boolean Combo_parundid_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n1665ParFasDsc ;
   private boolean n10584ParNVar ;
   private boolean n10585ParTit ;
   private boolean n12450ParEspDc ;
   private boolean returnInSub ;
   private String A13741ParCDsc ;
   private String AV36ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV29WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_parundid ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T005H4_A407EmprNom ;
   private boolean[] T005H4_n407EmprNom ;
   private String[] T005H5_A12450ParEspDc ;
   private boolean[] T005H5_n12450ParEspDc ;
   private String[] T005H6_A13204ParUndDsc ;
   private boolean[] T005H6_n13204ParUndDsc ;
   private short[] T005H7_A1664ParFasCod ;
   private String[] T005H7_A407EmprNom ;
   private boolean[] T005H7_n407EmprNom ;
   private String[] T005H7_A1665ParFasDsc ;
   private boolean[] T005H7_n1665ParFasDsc ;
   private short[] T005H7_A10584ParNVar ;
   private boolean[] T005H7_n10584ParNVar ;
   private String[] T005H7_A10585ParTit ;
   private boolean[] T005H7_n10585ParTit ;
   private String[] T005H7_A12450ParEspDc ;
   private boolean[] T005H7_n12450ParEspDc ;
   private String[] T005H7_A13204ParUndDsc ;
   private boolean[] T005H7_n13204ParUndDsc ;
   private String[] T005H7_A396EmprCod ;
   private short[] T005H7_A12451ParEspId ;
   private boolean[] T005H7_n12451ParEspId ;
   private short[] T005H7_A13203ParUndID ;
   private boolean[] T005H7_n13203ParUndID ;
   private String[] T005H8_A12450ParEspDc ;
   private boolean[] T005H8_n12450ParEspDc ;
   private String[] T005H9_A13204ParUndDsc ;
   private boolean[] T005H9_n13204ParUndDsc ;
   private String[] T005H10_A396EmprCod ;
   private short[] T005H10_A1664ParFasCod ;
   private short[] T005H3_A1664ParFasCod ;
   private String[] T005H3_A1665ParFasDsc ;
   private boolean[] T005H3_n1665ParFasDsc ;
   private short[] T005H3_A10584ParNVar ;
   private boolean[] T005H3_n10584ParNVar ;
   private String[] T005H3_A10585ParTit ;
   private boolean[] T005H3_n10585ParTit ;
   private String[] T005H3_A396EmprCod ;
   private short[] T005H3_A12451ParEspId ;
   private boolean[] T005H3_n12451ParEspId ;
   private short[] T005H3_A13203ParUndID ;
   private boolean[] T005H3_n13203ParUndID ;
   private String[] T005H11_A396EmprCod ;
   private short[] T005H11_A1664ParFasCod ;
   private String[] T005H12_A396EmprCod ;
   private short[] T005H12_A1664ParFasCod ;
   private short[] T005H2_A1664ParFasCod ;
   private String[] T005H2_A1665ParFasDsc ;
   private boolean[] T005H2_n1665ParFasDsc ;
   private short[] T005H2_A10584ParNVar ;
   private boolean[] T005H2_n10584ParNVar ;
   private String[] T005H2_A10585ParTit ;
   private boolean[] T005H2_n10585ParTit ;
   private String[] T005H2_A396EmprCod ;
   private short[] T005H2_A12451ParEspId ;
   private boolean[] T005H2_n12451ParEspId ;
   private short[] T005H2_A13203ParUndID ;
   private boolean[] T005H2_n13203ParUndID ;
   private String[] T005H16_A12450ParEspDc ;
   private boolean[] T005H16_n12450ParEspDc ;
   private String[] T005H17_A13204ParUndDsc ;
   private boolean[] T005H17_n13204ParUndDsc ;
   private String[] T005H18_A396EmprCod ;
   private int[] T005H18_A129BarCod ;
   private byte[] T005H18_A132BarCodReo ;
   private String[] T005H18_A130BarCodPar ;
   private short[] T005H18_A14152MEnvOrd ;
   private short[] T005H18_A1664ParFasCod ;
   private String[] T005H19_A396EmprCod ;
   private int[] T005H19_A13026PedDGId ;
   private String[] T005H19_A758ProCod ;
   private short[] T005H19_A13045PedDGFasLi ;
   private short[] T005H19_A1664ParFasCod ;
   private String[] T005H20_A396EmprCod ;
   private String[] T005H20_A758ProCod ;
   private short[] T005H20_A774ProNumLin ;
   private short[] T005H20_A7897Dtp_Ordl ;
   private short[] T005H20_A1664ParFasCod ;
   private String[] T005H21_A396EmprCod ;
   private int[] T005H21_A252CliCod ;
   private String[] T005H21_A65ArtCod ;
   private String[] T005H21_A758ProCod ;
   private String[] T005H21_A9836FasCodM ;
   private String[] T005H21_A9830MaqCodC ;
   private short[] T005H21_A1664ParFasCod ;
   private String[] T005H22_A396EmprCod ;
   private int[] T005H22_A252CliCod ;
   private String[] T005H22_A65ArtCod ;
   private short[] T005H22_A7135Lin_fast ;
   private short[] T005H22_A1664ParFasCod ;
   private String[] T005H23_A396EmprCod ;
   private int[] T005H23_A252CliCod ;
   private String[] T005H23_A65ArtCod ;
   private String[] T005H23_A758ProCod ;
   private short[] T005H23_A6986NumLinPro ;
   private short[] T005H23_A1664ParFasCod ;
   private String[] T005H24_A396EmprCod ;
   private int[] T005H24_A361DisCod ;
   private String[] T005H24_A758ProCod ;
   private short[] T005H24_A368DisFasLin ;
   private short[] T005H24_A1664ParFasCod ;
   private String[] T005H25_A396EmprCod ;
   private int[] T005H25_A252CliCod ;
   private String[] T005H25_A65ArtCod ;
   private String[] T005H25_A758ProCod ;
   private String[] T005H25_A457FasCod ;
   private short[] T005H25_A1664ParFasCod ;
   private String[] T005H26_A396EmprCod ;
   private int[] T005H26_A129BarCod ;
   private byte[] T005H26_A132BarCodReo ;
   private String[] T005H26_A130BarCodPar ;
   private String[] T005H26_A758ProCod ;
   private short[] T005H26_A194BarOrdLin ;
   private short[] T005H26_A1664ParFasCod ;
   private String[] T005H27_A396EmprCod ;
   private short[] T005H27_A1664ParFasCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV41ParUndID_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV28TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV32TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV27WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class tparfas__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparfas__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparfas__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparfas__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tparfas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T005H2", "SELECT ParFasCod, ParFasDsc, ParNVar, ParTit, EmprCod, ParEspId, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ?  FOR UPDATE OF ParFasDsc, ParNVar, ParTit, ParEspId, ParUndID NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H3", "SELECT ParFasCod, ParFasDsc, ParNVar, ParTit, EmprCod, ParEspId, ParUndID FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H5", "SELECT ParEspDc FROM TXPPARESP WHERE EmprCod = ? AND ParEspId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H6", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H7", "SELECT /*+ FIRST_ROWS(100) */ TM1.ParFasCod, T2.EmprNom, TM1.ParFasDsc, TM1.ParNVar, TM1.ParTit, T3.ParEspDc, T4.ParUndDsc, TM1.EmprCod, TM1.ParEspId, TM1.ParUndID FROM (((TXPPARFAS TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPPARESP T3 ON T3.EmprCod = TM1.EmprCod AND T3.ParEspId = TM1.ParEspId) LEFT JOIN TXPPARUND T4 ON T4.EmprCod = TM1.EmprCod AND T4.ParUndID = TM1.ParUndID) WHERE TM1.EmprCod = ? and TM1.ParFasCod = ? ORDER BY TM1.EmprCod, TM1.ParFasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H8", "SELECT ParEspDc FROM TXPPARESP WHERE EmprCod = ? AND ParEspId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H9", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParFasCod FROM TXPPARFAS WHERE EmprCod = ? AND ParFasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParFasCod FROM TXPPARFAS WHERE ( ParFasCod > ?) and EmprCod = ? ORDER BY EmprCod, ParFasCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ParFasCod FROM TXPPARFAS WHERE ( ParFasCod < ?) and EmprCod = ? ORDER BY EmprCod DESC, ParFasCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T005H13", "INSERT INTO TXPPARFAS(ParFasCod, ParFasDsc, ParNVar, ParTit, EmprCod, ParEspId, ParUndID) VALUES(?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPPARFAS")
         ,new UpdateCursor("T005H14", "UPDATE TXPPARFAS SET ParFasDsc=?, ParNVar=?, ParTit=?, ParEspId=?, ParUndID=?  WHERE EmprCod = ? AND ParFasCod = ?", GX_NOMASK, "TXPPARFAS")
         ,new UpdateCursor("T005H15", "DELETE FROM TXPPARFAS  WHERE EmprCod = ? AND ParFasCod = ?", GX_NOMASK, "TXPPARFAS")
         ,new ForEachCursor("T005H16", "SELECT ParEspDc FROM TXPPARESP WHERE EmprCod = ? AND ParEspId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H17", "SELECT ParUndDsc FROM TXPPARUND WHERE EmprCod = ? AND ParUndID = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T005H18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, MEnvOrd, ParFasCod FROM TXPMPEnv WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H19", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod, PedDGFasLi, ParFasCod FROM TXPPEDDG8 WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H20", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl, ParFasCod FROM TXPDT0022 WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H21", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC, ParFasCod FROM TXPCAPFM2 WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H22", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, Lin_fast, ParFasCod FROM TXPPARTI1 WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H23", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, NumLinPro, ParFasCod FROM TXPPARAR1 WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H24", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod, DisFasLin, ParFasCod FROM TXPDISPAR WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H25", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod, FasCod, ParFasCod FROM TXPSERPAR WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H26", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, ParFasCod FROM TXPBarPar WHERE EmprCod = ? AND ParFasCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T005H27", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ParFasCod FROM TXPPARFAS WHERE EmprCod = ? ORDER BY EmprCod, ParFasCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 15);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 3);
               ((short[]) buf[8])[0] = rslt.getShort(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(7);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 15);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 50);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 15);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 3);
               ((short[]) buf[14])[0] = rslt.getShort(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(10);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 50);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 15);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               return;
            case 25 :
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 6 :
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
            case 7 :
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
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 9 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 30);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(3, ((Number) parms[4]).shortValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 15);
               }
               stmt.setString(5, (String)parms[7], 3);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[11]).shortValue());
               }
               return;
            case 12 :
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
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 15);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(4, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               stmt.setString(6, (String)parms[10], 3);
               stmt.setShort(7, ((Number) parms[11]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 14 :
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
            case 15 :
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
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

