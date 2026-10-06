package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproces_lineas_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A396EmprCod, A457FasCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod, A758ProCod) ;
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
            AV8ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ProCod", AV8ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ProCod, ""))));
            AV9ProNumLin = (short)(GXutil.lval( httpContext.GetPar( "ProNumLin"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9ProNumLin), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRONUMLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9ProNumLin), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Fases (Proceso)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tproces_lineas_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tproces_lineas_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_lineas_trn_impl.class ));
   }

   public tproces_lineas_trn_impl( int remoteHandle ,
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProNumLin_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProNumLin_Internalname, httpContext.getMessage( "Linea", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtProNumLin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProNumLin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProNumLin_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedfascod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockfascod_Internalname, httpContext.getMessage( "Fase", ""), "", "", lblTextblockfascod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
      ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
      ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
      ucCombo_fascod.setProperty("DropDownOptionsData", AV15FasCod_Data);
      ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtFasCod_Internalname, httpContext.getMessage( "Codigo Fase", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtFasCod_Internalname, GXutil.rtrim( A457FasCod), GXutil.rtrim( localUtil.format( A457FasCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtFasCod_Jsonclick, 0, "Attribute", "", "", "", "", edtFasCod_Visible, edtFasCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV18Pgmname), GXutil.rtrim( localUtil.format( AV18Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_fascod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombofascod_Internalname, GXutil.rtrim( AV17ComboFasCod), GXutil.rtrim( localUtil.format( AV17ComboFasCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombofascod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombofascod_Visible, edtavCombofascod_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_Lineas_TRN.htm");
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
      e111UL2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV15FasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z774ProNumLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( "Z6437ProUltFP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z457FasCod = httpContext.cgiGet( "Z457FasCod") ;
            A6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( "Z6437ProUltFP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N457FasCod = httpContext.cgiGet( "N457FasCod") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8ProCod = httpContext.cgiGet( "vPROCOD") ;
            AV9ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( "vPRONUMLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV13Insert_FasCod = httpContext.cgiGet( "vINSERT_FASCOD") ;
            A6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( "PROULTFP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A460FasDsc = httpContext.cgiGet( "FASDSC") ;
            A459FasDec = localUtil.ctond( httpContext.cgiGet( "FASDEC")) ;
            n459FasDec = false ;
            A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n469FasPreSal = false ;
            A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n468FasPrePie = false ;
            A472FasVelPro = localUtil.ctond( httpContext.cgiGet( "FASVELPRO")) ;
            n472FasVelPro = false ;
            A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n464FasNumPas = false ;
            A456FasActTin = httpContext.cgiGet( "FASACTTIN") ;
            n456FasActTin = false ;
            A458FasCon = httpContext.cgiGet( "FASCON") ;
            n458FasCon = false ;
            A4286FasForMul = httpContext.cgiGet( "FASFORMUL") ;
            n4286FasForMul = false ;
            A4299FasConPla = httpContext.cgiGet( "FASCONPLA") ;
            n4299FasConPla = false ;
            A4903FasAcab = httpContext.cgiGet( "FASACAB") ;
            n4903FasAcab = false ;
            A602MaqCod = httpContext.cgiGet( "MAQCOD") ;
            n602MaqCod = false ;
            Combo_fascod_Objectcall = httpContext.cgiGet( "COMBO_FASCOD_Objectcall") ;
            Combo_fascod_Class = httpContext.cgiGet( "COMBO_FASCOD_Class") ;
            Combo_fascod_Icontype = httpContext.cgiGet( "COMBO_FASCOD_Icontype") ;
            Combo_fascod_Icon = httpContext.cgiGet( "COMBO_FASCOD_Icon") ;
            Combo_fascod_Caption = httpContext.cgiGet( "COMBO_FASCOD_Caption") ;
            Combo_fascod_Tooltip = httpContext.cgiGet( "COMBO_FASCOD_Tooltip") ;
            Combo_fascod_Cls = httpContext.cgiGet( "COMBO_FASCOD_Cls") ;
            Combo_fascod_Selectedvalue_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_set") ;
            Combo_fascod_Selectedvalue_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedvalue_get") ;
            Combo_fascod_Selectedtext_set = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_set") ;
            Combo_fascod_Selectedtext_get = httpContext.cgiGet( "COMBO_FASCOD_Selectedtext_get") ;
            Combo_fascod_Gamoauthtoken = httpContext.cgiGet( "COMBO_FASCOD_Gamoauthtoken") ;
            Combo_fascod_Ddointernalname = httpContext.cgiGet( "COMBO_FASCOD_Ddointernalname") ;
            Combo_fascod_Titlecontrolalign = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolalign") ;
            Combo_fascod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_FASCOD_Dropdownoptionstype") ;
            Combo_fascod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Enabled")) ;
            Combo_fascod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Visible")) ;
            Combo_fascod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_FASCOD_Titlecontrolidtoreplace") ;
            Combo_fascod_Datalisttype = httpContext.cgiGet( "COMBO_FASCOD_Datalisttype") ;
            Combo_fascod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Allowmultipleselection")) ;
            Combo_fascod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_FASCOD_Datalistfixedvalues") ;
            Combo_fascod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Isgriditem")) ;
            Combo_fascod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Hasdescription")) ;
            Combo_fascod_Datalistproc = httpContext.cgiGet( "COMBO_FASCOD_Datalistproc") ;
            Combo_fascod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_FASCOD_Datalistprocparametersprefix") ;
            Combo_fascod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_FASCOD_Remoteservicesparameters") ;
            Combo_fascod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_FASCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_fascod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeonlyselectedoption")) ;
            Combo_fascod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeselectalloption")) ;
            Combo_fascod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Emptyitem")) ;
            Combo_fascod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_FASCOD_Includeaddnewoption")) ;
            Combo_fascod_Htmltemplate = httpContext.cgiGet( "COMBO_FASCOD_Htmltemplate") ;
            Combo_fascod_Multiplevaluestype = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluestype") ;
            Combo_fascod_Loadingdata = httpContext.cgiGet( "COMBO_FASCOD_Loadingdata") ;
            Combo_fascod_Noresultsfound = httpContext.cgiGet( "COMBO_FASCOD_Noresultsfound") ;
            Combo_fascod_Emptyitemtext = httpContext.cgiGet( "COMBO_FASCOD_Emptyitemtext") ;
            Combo_fascod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_FASCOD_Onlyselectedvalues") ;
            Combo_fascod_Selectalltext = httpContext.cgiGet( "COMBO_FASCOD_Selectalltext") ;
            Combo_fascod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_FASCOD_Multiplevaluesseparator") ;
            Combo_fascod_Addnewoptiontext = httpContext.cgiGet( "COMBO_FASCOD_Addnewoptiontext") ;
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
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
            AV18Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
            AV17ComboFasCod = GXutil.upper( httpContext.cgiGet( edtavCombofascod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17ComboFasCod", AV17ComboFasCod);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TProces_Lineas_TRN");
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            forbiddenHiddens.add("ProCod", GXutil.rtrim( localUtil.format( A758ProCod, "")));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV18Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV18Pgmname, "")));
            forbiddenHiddens.add("ProUltFP", localUtil.format( DecimalUtil.doubleToDec(A6437ProUltFP), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tproces_lineas_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A758ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A774ProNumLin = (short)(GXutil.lval( httpContext.GetPar( "ProNumLin"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
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
                  sMode88 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode88 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound88 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UL0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "PROCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProCod_Internalname ;
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
                        e111UL2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UL2 ();
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
         e121UL2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UL88( ) ;
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
         disableAttributes1UL88( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Enabled), 5, 0), true);
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

   public void confirm_1UL0( )
   {
      beforeValidate1UL88( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UL88( ) ;
         }
         else
         {
            checkExtendedTable1UL88( ) ;
            closeExtendedTableCursors1UL88( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UL0( )
   {
   }

   public void e111UL2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tproces_lineas_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19Station", AV19Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV20Emprnom ;
      GXv_char4[0] = AV21Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      tproces_lineas_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      tproces_lineas_trn_impl.this.AV20Emprnom = GXv_char3[0] ;
      tproces_lineas_trn_impl.this.AV21Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Emprnom", AV20Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV21Usurcod", AV21Usurcod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      edtFasCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Visible), 5, 0), true);
      AV17ComboFasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboFasCod", AV17ComboFasCod);
      edtavCombofascod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV11TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV18Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV22GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         while ( AV22GXV1 <= AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV14TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV11TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV22GXV1));
            if ( GXutil.strcmp(AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "FasCod") == 0 )
            {
               AV13Insert_FasCod = AV14TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13Insert_FasCod", AV13Insert_FasCod);
               if ( ! (GXutil.strcmp("", AV13Insert_FasCod)==0) )
               {
                  AV17ComboFasCod = AV13Insert_FasCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV17ComboFasCod", AV17ComboFasCod);
                  Combo_fascod_Selectedvalue_set = AV17ComboFasCod ;
                  ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
                  Combo_fascod_Enabled = false ;
                  ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "Enabled", GXutil.booltostr( Combo_fascod_Enabled));
               }
            }
            AV22GXV1 = (int)(AV22GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GXV1), 8, 0));
         }
      }
   }

   public void e121UL2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(3);
      pr_default.close(2);
      pr_default.close(1);
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADCOMBOFASCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV15FasCod_Data ;
      GXv_char4[0] = AV16ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.ficherosbasicos.tproces_lineas_trnloaddvcombo(remoteHandle, context).execute( "FasCod", Gx_mode, AV7EmprCod, AV8ProCod, AV9ProNumLin, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tproces_lineas_trn_impl.this.AV16ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV15FasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      Combo_fascod_Selectedvalue_set = AV16ComboSelectedValue ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "SelectedValue_set", Combo_fascod_Selectedvalue_set);
      AV17ComboFasCod = AV16ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17ComboFasCod", AV17ComboFasCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_fascod_Enabled = false ;
         ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      }
   }

   public void zm1UL88( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6437ProUltFP = T01UL3_A6437ProUltFP[0] ;
            Z457FasCod = T01UL3_A457FasCod[0] ;
         }
         else
         {
            Z6437ProUltFP = A6437ProUltFP ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z774ProNumLin = A774ProNumLin ;
         Z6437ProUltFP = A6437ProUltFP ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z460FasDsc = A460FasDsc ;
         Z459FasDec = A459FasDec ;
         Z469FasPreSal = A469FasPreSal ;
         Z468FasPrePie = A468FasPrePie ;
         Z472FasVelPro = A472FasVelPro ;
         Z464FasNumPas = A464FasNumPas ;
         Z456FasActTin = A456FasActTin ;
         Z458FasCon = A458FasCon ;
         Z4286FasForMul = A4286FasForMul ;
         Z4299FasConPla = A4299FasConPla ;
         Z4903FasAcab = A4903FasAcab ;
         Z602MaqCod = A602MaqCod ;
      }
   }

   public void standaloneNotModal( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), true);
      AV18Pgmname = "FicherosBasicos.TProces_Lineas_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Pgmname", AV18Pgmname);
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV8ProCod)==0) )
      {
         A758ProCod = AV8ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (0==AV9ProNumLin) )
      {
         A774ProNumLin = AV9ProNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_FasCod)==0) )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV13Insert_FasCod)==0) )
      {
         A457FasCod = AV13Insert_FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      }
      else
      {
         A457FasCod = AV17ComboFasCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
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
         /* Using cursor T01UL5 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01UL5_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(3);
         /* Using cursor T01UL4 */
         pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01UL4_A460FasDsc[0] ;
         A459FasDec = T01UL4_A459FasDec[0] ;
         n459FasDec = T01UL4_n459FasDec[0] ;
         A469FasPreSal = T01UL4_A469FasPreSal[0] ;
         n469FasPreSal = T01UL4_n469FasPreSal[0] ;
         A468FasPrePie = T01UL4_A468FasPrePie[0] ;
         n468FasPrePie = T01UL4_n468FasPrePie[0] ;
         A472FasVelPro = T01UL4_A472FasVelPro[0] ;
         n472FasVelPro = T01UL4_n472FasVelPro[0] ;
         A464FasNumPas = T01UL4_A464FasNumPas[0] ;
         n464FasNumPas = T01UL4_n464FasNumPas[0] ;
         A456FasActTin = T01UL4_A456FasActTin[0] ;
         n456FasActTin = T01UL4_n456FasActTin[0] ;
         A458FasCon = T01UL4_A458FasCon[0] ;
         n458FasCon = T01UL4_n458FasCon[0] ;
         A4286FasForMul = T01UL4_A4286FasForMul[0] ;
         n4286FasForMul = T01UL4_n4286FasForMul[0] ;
         A4299FasConPla = T01UL4_A4299FasConPla[0] ;
         n4299FasConPla = T01UL4_n4299FasConPla[0] ;
         A4903FasAcab = T01UL4_A4903FasAcab[0] ;
         n4903FasAcab = T01UL4_n4903FasAcab[0] ;
         A602MaqCod = T01UL4_A602MaqCod[0] ;
         n602MaqCod = T01UL4_n602MaqCod[0] ;
         pr_default.close(2);
      }
   }

   public void load1UL88( )
   {
      /* Using cursor T01UL6 */
      pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A759ProDsc = T01UL6_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A460FasDsc = T01UL6_A460FasDsc[0] ;
         A459FasDec = T01UL6_A459FasDec[0] ;
         n459FasDec = T01UL6_n459FasDec[0] ;
         A469FasPreSal = T01UL6_A469FasPreSal[0] ;
         n469FasPreSal = T01UL6_n469FasPreSal[0] ;
         A468FasPrePie = T01UL6_A468FasPrePie[0] ;
         n468FasPrePie = T01UL6_n468FasPrePie[0] ;
         A472FasVelPro = T01UL6_A472FasVelPro[0] ;
         n472FasVelPro = T01UL6_n472FasVelPro[0] ;
         A464FasNumPas = T01UL6_A464FasNumPas[0] ;
         n464FasNumPas = T01UL6_n464FasNumPas[0] ;
         A456FasActTin = T01UL6_A456FasActTin[0] ;
         n456FasActTin = T01UL6_n456FasActTin[0] ;
         A458FasCon = T01UL6_A458FasCon[0] ;
         n458FasCon = T01UL6_n458FasCon[0] ;
         A4286FasForMul = T01UL6_A4286FasForMul[0] ;
         n4286FasForMul = T01UL6_n4286FasForMul[0] ;
         A4299FasConPla = T01UL6_A4299FasConPla[0] ;
         n4299FasConPla = T01UL6_n4299FasConPla[0] ;
         A4903FasAcab = T01UL6_A4903FasAcab[0] ;
         n4903FasAcab = T01UL6_n4903FasAcab[0] ;
         A6437ProUltFP = T01UL6_A6437ProUltFP[0] ;
         A457FasCod = T01UL6_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A602MaqCod = T01UL6_A602MaqCod[0] ;
         n602MaqCod = T01UL6_n602MaqCod[0] ;
         zm1UL88( -13) ;
      }
      pr_default.close(4);
      onLoadActions1UL88( ) ;
   }

   public void onLoadActions1UL88( )
   {
   }

   public void checkExtendedTable1UL88( )
   {
      nIsDirty_88 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01UL4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01UL4_A460FasDsc[0] ;
      A459FasDec = T01UL4_A459FasDec[0] ;
      n459FasDec = T01UL4_n459FasDec[0] ;
      A469FasPreSal = T01UL4_A469FasPreSal[0] ;
      n469FasPreSal = T01UL4_n469FasPreSal[0] ;
      A468FasPrePie = T01UL4_A468FasPrePie[0] ;
      n468FasPrePie = T01UL4_n468FasPrePie[0] ;
      A472FasVelPro = T01UL4_A472FasVelPro[0] ;
      n472FasVelPro = T01UL4_n472FasVelPro[0] ;
      A464FasNumPas = T01UL4_A464FasNumPas[0] ;
      n464FasNumPas = T01UL4_n464FasNumPas[0] ;
      A456FasActTin = T01UL4_A456FasActTin[0] ;
      n456FasActTin = T01UL4_n456FasActTin[0] ;
      A458FasCon = T01UL4_A458FasCon[0] ;
      n458FasCon = T01UL4_n458FasCon[0] ;
      A4286FasForMul = T01UL4_A4286FasForMul[0] ;
      n4286FasForMul = T01UL4_n4286FasForMul[0] ;
      A4299FasConPla = T01UL4_A4299FasConPla[0] ;
      n4299FasConPla = T01UL4_n4299FasConPla[0] ;
      A4903FasAcab = T01UL4_A4903FasAcab[0] ;
      n4903FasAcab = T01UL4_n4903FasAcab[0] ;
      A602MaqCod = T01UL4_A602MaqCod[0] ;
      n602MaqCod = T01UL4_n602MaqCod[0] ;
      pr_default.close(2);
      /* Using cursor T01UL5 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01UL5_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1UL88( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T01UL7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T01UL7_A460FasDsc[0] ;
      A459FasDec = T01UL7_A459FasDec[0] ;
      n459FasDec = T01UL7_n459FasDec[0] ;
      A469FasPreSal = T01UL7_A469FasPreSal[0] ;
      n469FasPreSal = T01UL7_n469FasPreSal[0] ;
      A468FasPrePie = T01UL7_A468FasPrePie[0] ;
      n468FasPrePie = T01UL7_n468FasPrePie[0] ;
      A472FasVelPro = T01UL7_A472FasVelPro[0] ;
      n472FasVelPro = T01UL7_n472FasVelPro[0] ;
      A464FasNumPas = T01UL7_A464FasNumPas[0] ;
      n464FasNumPas = T01UL7_n464FasNumPas[0] ;
      A456FasActTin = T01UL7_A456FasActTin[0] ;
      n456FasActTin = T01UL7_n456FasActTin[0] ;
      A458FasCon = T01UL7_A458FasCon[0] ;
      n458FasCon = T01UL7_n458FasCon[0] ;
      A4286FasForMul = T01UL7_A4286FasForMul[0] ;
      n4286FasForMul = T01UL7_n4286FasForMul[0] ;
      A4299FasConPla = T01UL7_A4299FasConPla[0] ;
      n4299FasConPla = T01UL7_n4299FasConPla[0] ;
      A4903FasAcab = T01UL7_A4903FasAcab[0] ;
      n4903FasAcab = T01UL7_n4903FasAcab[0] ;
      A602MaqCod = T01UL7_A602MaqCod[0] ;
      n602MaqCod = T01UL7_n602MaqCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4299FasConPla))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_15( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01UL8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A759ProDsc = T01UL8_A759ProDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A759ProDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1UL88( )
   {
      /* Using cursor T01UL9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound88 = (short)(1) ;
      }
      else
      {
         RcdFound88 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UL3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UL88( 13) ;
         RcdFound88 = (short)(1) ;
         A774ProNumLin = T01UL3_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         A6437ProUltFP = T01UL3_A6437ProUltFP[0] ;
         A396EmprCod = T01UL3_A396EmprCod[0] ;
         A457FasCod = T01UL3_A457FasCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
         A758ProCod = T01UL3_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UL88( ) ;
         if ( AnyError == 1 )
         {
            RcdFound88 = (short)(0) ;
            initializeNonKey1UL88( ) ;
         }
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound88 = (short)(0) ;
         initializeNonKey1UL88( ) ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UL88( ) ;
      if ( RcdFound88 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound88 = (short)(0) ;
      /* Using cursor T01UL10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A758ProCod, A758ProCod, A396EmprCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UL10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UL10_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01UL10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01UL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UL10_A774ProNumLin[0] < A774ProNumLin ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UL10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UL10_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01UL10_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01UL10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UL10_A774ProNumLin[0] > A774ProNumLin ) ) )
         {
            A396EmprCod = T01UL10_A396EmprCod[0] ;
            A758ProCod = T01UL10_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = T01UL10_A774ProNumLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            RcdFound88 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound88 = (short)(0) ;
      /* Using cursor T01UL11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, A758ProCod, A758ProCod, A396EmprCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UL11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UL11_A758ProCod[0], A758ProCod) > 0 ) || ( GXutil.strcmp(T01UL11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01UL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UL11_A774ProNumLin[0] > A774ProNumLin ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UL11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UL11_A758ProCod[0], A758ProCod) < 0 ) || ( GXutil.strcmp(T01UL11_A758ProCod[0], A758ProCod) == 0 ) && ( GXutil.strcmp(T01UL11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UL11_A774ProNumLin[0] < A774ProNumLin ) ) )
         {
            A396EmprCod = T01UL11_A396EmprCod[0] ;
            A758ProCod = T01UL11_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A774ProNumLin = T01UL11_A774ProNumLin[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
            RcdFound88 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UL88( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UL88( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound88 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               A774ProNumLin = Z774ProNumLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UL88( ) ;
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
            {
               /* Insert record */
               GX_FocusControl = edtFasCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UL88( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "PROCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtFasCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UL88( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) || ( A774ProNumLin != Z774ProNumLin ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = Z774ProNumLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UL88( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UL2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6437ProUltFP != T01UL2_A6437ProUltFP[0] ) || ( GXutil.strcmp(Z457FasCod, T01UL2_A457FasCod[0]) != 0 ) )
         {
            if ( Z6437ProUltFP != T01UL2_A6437ProUltFP[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_lineas_trn:[seudo value changed for attri]"+"ProUltFP");
               GXutil.writeLogRaw("Old: ",Z6437ProUltFP);
               GXutil.writeLogRaw("Current: ",T01UL2_A6437ProUltFP[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T01UL2_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_lineas_trn:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T01UL2_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UL88( )
   {
      beforeValidate1UL88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UL88( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UL88( 0) ;
         checkOptimisticConcurrency1UL88( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UL88( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UL88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UL12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A774ProNumLin), Short.valueOf(A6437ProUltFP), A396EmprCod, A457FasCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
                        resetCaption1UL0( ) ;
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
            load1UL88( ) ;
         }
         endLevel1UL88( ) ;
      }
      closeExtendedTableCursors1UL88( ) ;
   }

   public void update1UL88( )
   {
      beforeValidate1UL88( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UL88( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UL88( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UL88( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UL88( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UL13 */
                  pr_default.execute(11, new Object[] {Short.valueOf(A6437ProUltFP), A457FasCod, A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UL88( ) ;
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
         endLevel1UL88( ) ;
      }
      closeExtendedTableCursors1UL88( ) ;
   }

   public void deferredUpdate1UL88( )
   {
   }

   public void delete( )
   {
      beforeValidate1UL88( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UL88( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UL88( ) ;
         afterConfirm1UL88( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UL88( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UL14 */
               pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
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
      sMode88 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UL88( ) ;
      Gx_mode = sMode88 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UL88( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01UL15 */
         pr_default.execute(13, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T01UL15_A460FasDsc[0] ;
         A459FasDec = T01UL15_A459FasDec[0] ;
         n459FasDec = T01UL15_n459FasDec[0] ;
         A469FasPreSal = T01UL15_A469FasPreSal[0] ;
         n469FasPreSal = T01UL15_n469FasPreSal[0] ;
         A468FasPrePie = T01UL15_A468FasPrePie[0] ;
         n468FasPrePie = T01UL15_n468FasPrePie[0] ;
         A472FasVelPro = T01UL15_A472FasVelPro[0] ;
         n472FasVelPro = T01UL15_n472FasVelPro[0] ;
         A464FasNumPas = T01UL15_A464FasNumPas[0] ;
         n464FasNumPas = T01UL15_n464FasNumPas[0] ;
         A456FasActTin = T01UL15_A456FasActTin[0] ;
         n456FasActTin = T01UL15_n456FasActTin[0] ;
         A458FasCon = T01UL15_A458FasCon[0] ;
         n458FasCon = T01UL15_n458FasCon[0] ;
         A4286FasForMul = T01UL15_A4286FasForMul[0] ;
         n4286FasForMul = T01UL15_n4286FasForMul[0] ;
         A4299FasConPla = T01UL15_A4299FasConPla[0] ;
         n4299FasConPla = T01UL15_n4299FasConPla[0] ;
         A4903FasAcab = T01UL15_A4903FasAcab[0] ;
         n4903FasAcab = T01UL15_n4903FasAcab[0] ;
         A602MaqCod = T01UL15_A602MaqCod[0] ;
         n602MaqCod = T01UL15_n602MaqCod[0] ;
         pr_default.close(13);
         /* Using cursor T01UL16 */
         pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod});
         A759ProDsc = T01UL16_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UL17 */
         pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT002", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01UL18 */
         pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void endLevel1UL88( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UL88( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tproces_lineas_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UL0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tproces_lineas_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UL88( )
   {
      /* Scan By routine */
      /* Using cursor T01UL19 */
      pr_default.execute(17);
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A396EmprCod = T01UL19_A396EmprCod[0] ;
         A758ProCod = T01UL19_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = T01UL19_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UL88( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A396EmprCod = T01UL19_A396EmprCod[0] ;
         A758ProCod = T01UL19_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A774ProNumLin = T01UL19_A774ProNumLin[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      }
   }

   public void scanEnd1UL88( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1UL88( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1UL88( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UL88( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UL88( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UL88( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UL88( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UL88( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), true);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombofascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombofascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombofascod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UL88( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UL0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tproces_lineas_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9ProNumLin,4,0))}, new String[] {"Gx_mode","EmprCod","ProCod","ProNumLin"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TProces_Lineas_TRN");
      forbiddenHiddens.add("ProCod", GXutil.rtrim( localUtil.format( A758ProCod, "")));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV18Pgmname, "")));
      forbiddenHiddens.add("ProUltFP", localUtil.format( DecimalUtil.doubleToDec(A6437ProUltFP), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tproces_lineas_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z774ProNumLin", GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6437ProUltFP", GXutil.ltrim( localUtil.ntoc( Z6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z457FasCod", GXutil.rtrim( Z457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N457FasCod", GXutil.rtrim( A457FasCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV15FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV15FasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV8ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRONUMLIN", GXutil.ltrim( localUtil.ntoc( AV9ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRONUMLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9ProNumLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_FASCOD", GXutil.rtrim( AV13Insert_FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PROULTFP", GXutil.ltrim( localUtil.ntoc( A6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPRESAL", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREPIE", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASVELPRO", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASNUMPAS", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN", GXutil.rtrim( A456FasActTin));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON", GXutil.rtrim( A458FasCon));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL", GXutil.rtrim( A4286FasForMul));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCONPLA", GXutil.rtrim( A4299FasConPla));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACAB", GXutil.rtrim( A4903FasAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Objectcall", GXutil.rtrim( Combo_fascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Selectedvalue_set", GXutil.rtrim( Combo_fascod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
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
      return formatLink("app.ficherosbasicos.tproces_lineas_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8ProCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9ProNumLin,4,0))}, new String[] {"Gx_mode","EmprCod","ProCod","ProNumLin"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TProces_Lineas_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Fases (Proceso)", "") ;
   }

   public void initializeNonKey1UL88( )
   {
      A457FasCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A457FasCod", A457FasCod);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A602MaqCod = "" ;
      n602MaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", A602MaqCod);
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrimstr( A459FasDec, 5, 1));
      A469FasPreSal = (short)(0) ;
      n469FasPreSal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrimstr( DecimalUtil.doubleToDec(A469FasPreSal), 4, 0));
      A468FasPrePie = (short)(0) ;
      n468FasPrePie = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A468FasPrePie), 4, 0));
      A472FasVelPro = DecimalUtil.ZERO ;
      n472FasVelPro = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrimstr( A472FasVelPro, 5, 1));
      A464FasNumPas = (short)(0) ;
      n464FasNumPas = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrimstr( DecimalUtil.doubleToDec(A464FasNumPas), 3, 0));
      A456FasActTin = "" ;
      n456FasActTin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", A456FasActTin);
      A458FasCon = "" ;
      n458FasCon = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", A458FasCon);
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", A4286FasForMul);
      A4299FasConPla = "" ;
      n4299FasConPla = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", A4299FasConPla);
      A4903FasAcab = "" ;
      n4903FasAcab = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", A4903FasAcab);
      A6437ProUltFP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
      Z6437ProUltFP = (short)(0) ;
      Z457FasCod = "" ;
   }

   public void initAll1UL88( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      A774ProNumLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A774ProNumLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A774ProNumLin), 4, 0));
      initializeNonKey1UL88( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116103388", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tproces_lineas_trn.js", "?202682116103388", false, true);
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
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtProNumLin_Internalname = "PRONUMLIN" ;
      lblTextblockfascod_Internalname = "TEXTBLOCKFASCOD" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      edtFasCod_Internalname = "FASCOD" ;
      divTablesplittedfascod_Internalname = "TABLESPLITTEDFASCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombofascod_Internalname = "vCOMBOFASCOD" ;
      divSectionattribute_fascod_Internalname = "SECTIONATTRIBUTE_FASCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Fases (Proceso)", "") );
      edtavCombofascod_Jsonclick = "" ;
      edtavCombofascod_Enabled = 0 ;
      edtavCombofascod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtFasCod_Jsonclick = "" ;
      edtFasCod_Enabled = 1 ;
      edtFasCod_Visible = 1 ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_fascod_Enabled = GXutil.toBoolean( -1) ;
      edtProNumLin_Jsonclick = "" ;
      edtProNumLin_Enabled = 0 ;
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 0 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 0 ;
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

   public void valid_Procod( )
   {
      /* Using cursor T01UL16 */
      pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "PROCES", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
      }
      A759ProDsc = T01UL16_A759ProDsc[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", GXutil.rtrim( A759ProDsc));
   }

   public void valid_Fascod( )
   {
      n459FasDec = false ;
      n469FasPreSal = false ;
      n468FasPrePie = false ;
      n472FasVelPro = false ;
      n464FasNumPas = false ;
      n456FasActTin = false ;
      n458FasCon = false ;
      n4286FasForMul = false ;
      n4299FasConPla = false ;
      n4903FasAcab = false ;
      n602MaqCod = false ;
      /* Using cursor T01UL15 */
      pr_default.execute(13, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T01UL15_A460FasDsc[0] ;
      A459FasDec = T01UL15_A459FasDec[0] ;
      n459FasDec = T01UL15_n459FasDec[0] ;
      A469FasPreSal = T01UL15_A469FasPreSal[0] ;
      n469FasPreSal = T01UL15_n469FasPreSal[0] ;
      A468FasPrePie = T01UL15_A468FasPrePie[0] ;
      n468FasPrePie = T01UL15_n468FasPrePie[0] ;
      A472FasVelPro = T01UL15_A472FasVelPro[0] ;
      n472FasVelPro = T01UL15_n472FasVelPro[0] ;
      A464FasNumPas = T01UL15_A464FasNumPas[0] ;
      n464FasNumPas = T01UL15_n464FasNumPas[0] ;
      A456FasActTin = T01UL15_A456FasActTin[0] ;
      n456FasActTin = T01UL15_n456FasActTin[0] ;
      A458FasCon = T01UL15_A458FasCon[0] ;
      n458FasCon = T01UL15_n458FasCon[0] ;
      A4286FasForMul = T01UL15_A4286FasForMul[0] ;
      n4286FasForMul = T01UL15_n4286FasForMul[0] ;
      A4299FasConPla = T01UL15_A4299FasConPla[0] ;
      n4299FasConPla = T01UL15_n4299FasConPla[0] ;
      A4903FasAcab = T01UL15_A4903FasAcab[0] ;
      n4903FasAcab = T01UL15_n4903FasAcab[0] ;
      A602MaqCod = T01UL15_A602MaqCod[0] ;
      n602MaqCod = T01UL15_n602MaqCod[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", GXutil.rtrim( A460FasDsc));
      httpContext.ajax_rsp_assign_attri("", false, "A459FasDec", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A469FasPreSal", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A468FasPrePie", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A472FasVelPro", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A464FasNumPas", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      httpContext.ajax_rsp_assign_attri("", false, "A456FasActTin", GXutil.rtrim( A456FasActTin));
      httpContext.ajax_rsp_assign_attri("", false, "A458FasCon", GXutil.rtrim( A458FasCon));
      httpContext.ajax_rsp_assign_attri("", false, "A4286FasForMul", GXutil.rtrim( A4286FasForMul));
      httpContext.ajax_rsp_assign_attri("", false, "A4299FasConPla", GXutil.rtrim( A4299FasConPla));
      httpContext.ajax_rsp_assign_attri("", false, "A4903FasAcab", GXutil.rtrim( A4903FasAcab));
      httpContext.ajax_rsp_assign_attri("", false, "A602MaqCod", GXutil.rtrim( A602MaqCod));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV9ProNumLin',fld:'vPRONUMLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'AV9ProNumLin',fld:'vPRONUMLIN',pic:'ZZZ9',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV18Pgmname',fld:'vPGMNAME',pic:''},{av:'A6437ProUltFP',fld:'PROULTFP',pic:'ZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UL2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A759ProDsc',fld:'PRODSC',pic:''}]}");
      setEventMetadata("VALID_PRONUMLIN","{handler:'valid_Pronumlin',iparms:[]");
      setEventMetadata("VALID_PRONUMLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]}");
      setEventMetadata("VALIDV_COMBOFASCOD","{handler:'validv_Combofascod',iparms:[]");
      setEventMetadata("VALIDV_COMBOFASCOD",",oparms:[]}");
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
      pr_default.close(13);
      pr_default.close(14);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV7EmprCod = "" ;
      wcpOAV8ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z457FasCod = "" ;
      N457FasCod = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV8ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      A759ProDsc = "" ;
      lblTextblockfascod_Jsonclick = "" ;
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      Combo_fascod_Caption = "" ;
      AV15FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      TempTags = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV18Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV17ComboFasCod = "" ;
      AV13Insert_FasCod = "" ;
      A460FasDsc = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A4903FasAcab = "" ;
      A602MaqCod = "" ;
      Combo_fascod_Objectcall = "" ;
      Combo_fascod_Class = "" ;
      Combo_fascod_Icontype = "" ;
      Combo_fascod_Icon = "" ;
      Combo_fascod_Tooltip = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedtext_set = "" ;
      Combo_fascod_Selectedtext_get = "" ;
      Combo_fascod_Gamoauthtoken = "" ;
      Combo_fascod_Ddointernalname = "" ;
      Combo_fascod_Titlecontrolalign = "" ;
      Combo_fascod_Dropdownoptionstype = "" ;
      Combo_fascod_Titlecontrolidtoreplace = "" ;
      Combo_fascod_Datalisttype = "" ;
      Combo_fascod_Datalistfixedvalues = "" ;
      Combo_fascod_Datalistproc = "" ;
      Combo_fascod_Datalistprocparametersprefix = "" ;
      Combo_fascod_Remoteservicesparameters = "" ;
      Combo_fascod_Htmltemplate = "" ;
      Combo_fascod_Multiplevaluestype = "" ;
      Combo_fascod_Loadingdata = "" ;
      Combo_fascod_Noresultsfound = "" ;
      Combo_fascod_Emptyitemtext = "" ;
      Combo_fascod_Onlyselectedvalues = "" ;
      Combo_fascod_Selectalltext = "" ;
      Combo_fascod_Multiplevaluesseparator = "" ;
      Combo_fascod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode88 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV20Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV21Usurcod = "" ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      AV14TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV16ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z759ProDsc = "" ;
      Z460FasDsc = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z4286FasForMul = "" ;
      Z4299FasConPla = "" ;
      Z4903FasAcab = "" ;
      Z602MaqCod = "" ;
      T01UL5_A759ProDsc = new String[] {""} ;
      T01UL4_A460FasDsc = new String[] {""} ;
      T01UL4_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL4_n459FasDec = new boolean[] {false} ;
      T01UL4_A469FasPreSal = new short[1] ;
      T01UL4_n469FasPreSal = new boolean[] {false} ;
      T01UL4_A468FasPrePie = new short[1] ;
      T01UL4_n468FasPrePie = new boolean[] {false} ;
      T01UL4_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL4_n472FasVelPro = new boolean[] {false} ;
      T01UL4_A464FasNumPas = new short[1] ;
      T01UL4_n464FasNumPas = new boolean[] {false} ;
      T01UL4_A456FasActTin = new String[] {""} ;
      T01UL4_n456FasActTin = new boolean[] {false} ;
      T01UL4_A458FasCon = new String[] {""} ;
      T01UL4_n458FasCon = new boolean[] {false} ;
      T01UL4_A4286FasForMul = new String[] {""} ;
      T01UL4_n4286FasForMul = new boolean[] {false} ;
      T01UL4_A4299FasConPla = new String[] {""} ;
      T01UL4_n4299FasConPla = new boolean[] {false} ;
      T01UL4_A4903FasAcab = new String[] {""} ;
      T01UL4_n4903FasAcab = new boolean[] {false} ;
      T01UL4_A602MaqCod = new String[] {""} ;
      T01UL4_n602MaqCod = new boolean[] {false} ;
      T01UL6_A774ProNumLin = new short[1] ;
      T01UL6_A759ProDsc = new String[] {""} ;
      T01UL6_A460FasDsc = new String[] {""} ;
      T01UL6_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL6_n459FasDec = new boolean[] {false} ;
      T01UL6_A469FasPreSal = new short[1] ;
      T01UL6_n469FasPreSal = new boolean[] {false} ;
      T01UL6_A468FasPrePie = new short[1] ;
      T01UL6_n468FasPrePie = new boolean[] {false} ;
      T01UL6_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL6_n472FasVelPro = new boolean[] {false} ;
      T01UL6_A464FasNumPas = new short[1] ;
      T01UL6_n464FasNumPas = new boolean[] {false} ;
      T01UL6_A456FasActTin = new String[] {""} ;
      T01UL6_n456FasActTin = new boolean[] {false} ;
      T01UL6_A458FasCon = new String[] {""} ;
      T01UL6_n458FasCon = new boolean[] {false} ;
      T01UL6_A4286FasForMul = new String[] {""} ;
      T01UL6_n4286FasForMul = new boolean[] {false} ;
      T01UL6_A4299FasConPla = new String[] {""} ;
      T01UL6_n4299FasConPla = new boolean[] {false} ;
      T01UL6_A4903FasAcab = new String[] {""} ;
      T01UL6_n4903FasAcab = new boolean[] {false} ;
      T01UL6_A6437ProUltFP = new short[1] ;
      T01UL6_A396EmprCod = new String[] {""} ;
      T01UL6_A457FasCod = new String[] {""} ;
      T01UL6_A758ProCod = new String[] {""} ;
      T01UL6_A602MaqCod = new String[] {""} ;
      T01UL6_n602MaqCod = new boolean[] {false} ;
      T01UL7_A460FasDsc = new String[] {""} ;
      T01UL7_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL7_n459FasDec = new boolean[] {false} ;
      T01UL7_A469FasPreSal = new short[1] ;
      T01UL7_n469FasPreSal = new boolean[] {false} ;
      T01UL7_A468FasPrePie = new short[1] ;
      T01UL7_n468FasPrePie = new boolean[] {false} ;
      T01UL7_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL7_n472FasVelPro = new boolean[] {false} ;
      T01UL7_A464FasNumPas = new short[1] ;
      T01UL7_n464FasNumPas = new boolean[] {false} ;
      T01UL7_A456FasActTin = new String[] {""} ;
      T01UL7_n456FasActTin = new boolean[] {false} ;
      T01UL7_A458FasCon = new String[] {""} ;
      T01UL7_n458FasCon = new boolean[] {false} ;
      T01UL7_A4286FasForMul = new String[] {""} ;
      T01UL7_n4286FasForMul = new boolean[] {false} ;
      T01UL7_A4299FasConPla = new String[] {""} ;
      T01UL7_n4299FasConPla = new boolean[] {false} ;
      T01UL7_A4903FasAcab = new String[] {""} ;
      T01UL7_n4903FasAcab = new boolean[] {false} ;
      T01UL7_A602MaqCod = new String[] {""} ;
      T01UL7_n602MaqCod = new boolean[] {false} ;
      T01UL8_A759ProDsc = new String[] {""} ;
      T01UL9_A396EmprCod = new String[] {""} ;
      T01UL9_A758ProCod = new String[] {""} ;
      T01UL9_A774ProNumLin = new short[1] ;
      T01UL3_A774ProNumLin = new short[1] ;
      T01UL3_A6437ProUltFP = new short[1] ;
      T01UL3_A396EmprCod = new String[] {""} ;
      T01UL3_A457FasCod = new String[] {""} ;
      T01UL3_A758ProCod = new String[] {""} ;
      T01UL10_A396EmprCod = new String[] {""} ;
      T01UL10_A758ProCod = new String[] {""} ;
      T01UL10_A774ProNumLin = new short[1] ;
      T01UL11_A396EmprCod = new String[] {""} ;
      T01UL11_A758ProCod = new String[] {""} ;
      T01UL11_A774ProNumLin = new short[1] ;
      T01UL2_A774ProNumLin = new short[1] ;
      T01UL2_A6437ProUltFP = new short[1] ;
      T01UL2_A396EmprCod = new String[] {""} ;
      T01UL2_A457FasCod = new String[] {""} ;
      T01UL2_A758ProCod = new String[] {""} ;
      T01UL15_A460FasDsc = new String[] {""} ;
      T01UL15_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL15_n459FasDec = new boolean[] {false} ;
      T01UL15_A469FasPreSal = new short[1] ;
      T01UL15_n469FasPreSal = new boolean[] {false} ;
      T01UL15_A468FasPrePie = new short[1] ;
      T01UL15_n468FasPrePie = new boolean[] {false} ;
      T01UL15_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UL15_n472FasVelPro = new boolean[] {false} ;
      T01UL15_A464FasNumPas = new short[1] ;
      T01UL15_n464FasNumPas = new boolean[] {false} ;
      T01UL15_A456FasActTin = new String[] {""} ;
      T01UL15_n456FasActTin = new boolean[] {false} ;
      T01UL15_A458FasCon = new String[] {""} ;
      T01UL15_n458FasCon = new boolean[] {false} ;
      T01UL15_A4286FasForMul = new String[] {""} ;
      T01UL15_n4286FasForMul = new boolean[] {false} ;
      T01UL15_A4299FasConPla = new String[] {""} ;
      T01UL15_n4299FasConPla = new boolean[] {false} ;
      T01UL15_A4903FasAcab = new String[] {""} ;
      T01UL15_n4903FasAcab = new boolean[] {false} ;
      T01UL15_A602MaqCod = new String[] {""} ;
      T01UL15_n602MaqCod = new boolean[] {false} ;
      T01UL16_A759ProDsc = new String[] {""} ;
      T01UL17_A396EmprCod = new String[] {""} ;
      T01UL17_A758ProCod = new String[] {""} ;
      T01UL17_A774ProNumLin = new short[1] ;
      T01UL17_A7897Dtp_Ordl = new short[1] ;
      T01UL18_A396EmprCod = new String[] {""} ;
      T01UL18_A758ProCod = new String[] {""} ;
      T01UL18_A774ProNumLin = new short[1] ;
      T01UL18_A6438ProFsaL = new short[1] ;
      T01UL19_A396EmprCod = new String[] {""} ;
      T01UL19_A758ProCod = new String[] {""} ;
      T01UL19_A774ProNumLin = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_trn__default(),
         new Object[] {
             new Object[] {
            T01UL2_A774ProNumLin, T01UL2_A6437ProUltFP, T01UL2_A396EmprCod, T01UL2_A457FasCod, T01UL2_A758ProCod
            }
            , new Object[] {
            T01UL3_A774ProNumLin, T01UL3_A6437ProUltFP, T01UL3_A396EmprCod, T01UL3_A457FasCod, T01UL3_A758ProCod
            }
            , new Object[] {
            T01UL4_A460FasDsc, T01UL4_A459FasDec, T01UL4_n459FasDec, T01UL4_A469FasPreSal, T01UL4_n469FasPreSal, T01UL4_A468FasPrePie, T01UL4_n468FasPrePie, T01UL4_A472FasVelPro, T01UL4_n472FasVelPro, T01UL4_A464FasNumPas,
            T01UL4_n464FasNumPas, T01UL4_A456FasActTin, T01UL4_n456FasActTin, T01UL4_A458FasCon, T01UL4_n458FasCon, T01UL4_A4286FasForMul, T01UL4_n4286FasForMul, T01UL4_A4299FasConPla, T01UL4_n4299FasConPla, T01UL4_A4903FasAcab,
            T01UL4_n4903FasAcab, T01UL4_A602MaqCod, T01UL4_n602MaqCod
            }
            , new Object[] {
            T01UL5_A759ProDsc
            }
            , new Object[] {
            T01UL6_A774ProNumLin, T01UL6_A759ProDsc, T01UL6_A460FasDsc, T01UL6_A459FasDec, T01UL6_n459FasDec, T01UL6_A469FasPreSal, T01UL6_n469FasPreSal, T01UL6_A468FasPrePie, T01UL6_n468FasPrePie, T01UL6_A472FasVelPro,
            T01UL6_n472FasVelPro, T01UL6_A464FasNumPas, T01UL6_n464FasNumPas, T01UL6_A456FasActTin, T01UL6_n456FasActTin, T01UL6_A458FasCon, T01UL6_n458FasCon, T01UL6_A4286FasForMul, T01UL6_n4286FasForMul, T01UL6_A4299FasConPla,
            T01UL6_n4299FasConPla, T01UL6_A4903FasAcab, T01UL6_n4903FasAcab, T01UL6_A6437ProUltFP, T01UL6_A396EmprCod, T01UL6_A457FasCod, T01UL6_A758ProCod, T01UL6_A602MaqCod, T01UL6_n602MaqCod
            }
            , new Object[] {
            T01UL7_A460FasDsc, T01UL7_A459FasDec, T01UL7_n459FasDec, T01UL7_A469FasPreSal, T01UL7_n469FasPreSal, T01UL7_A468FasPrePie, T01UL7_n468FasPrePie, T01UL7_A472FasVelPro, T01UL7_n472FasVelPro, T01UL7_A464FasNumPas,
            T01UL7_n464FasNumPas, T01UL7_A456FasActTin, T01UL7_n456FasActTin, T01UL7_A458FasCon, T01UL7_n458FasCon, T01UL7_A4286FasForMul, T01UL7_n4286FasForMul, T01UL7_A4299FasConPla, T01UL7_n4299FasConPla, T01UL7_A4903FasAcab,
            T01UL7_n4903FasAcab, T01UL7_A602MaqCod, T01UL7_n602MaqCod
            }
            , new Object[] {
            T01UL8_A759ProDsc
            }
            , new Object[] {
            T01UL9_A396EmprCod, T01UL9_A758ProCod, T01UL9_A774ProNumLin
            }
            , new Object[] {
            T01UL10_A396EmprCod, T01UL10_A758ProCod, T01UL10_A774ProNumLin
            }
            , new Object[] {
            T01UL11_A396EmprCod, T01UL11_A758ProCod, T01UL11_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UL15_A460FasDsc, T01UL15_A459FasDec, T01UL15_n459FasDec, T01UL15_A469FasPreSal, T01UL15_n469FasPreSal, T01UL15_A468FasPrePie, T01UL15_n468FasPrePie, T01UL15_A472FasVelPro, T01UL15_n472FasVelPro, T01UL15_A464FasNumPas,
            T01UL15_n464FasNumPas, T01UL15_A456FasActTin, T01UL15_n456FasActTin, T01UL15_A458FasCon, T01UL15_n458FasCon, T01UL15_A4286FasForMul, T01UL15_n4286FasForMul, T01UL15_A4299FasConPla, T01UL15_n4299FasConPla, T01UL15_A4903FasAcab,
            T01UL15_n4903FasAcab, T01UL15_A602MaqCod, T01UL15_n602MaqCod
            }
            , new Object[] {
            T01UL16_A759ProDsc
            }
            , new Object[] {
            T01UL17_A396EmprCod, T01UL17_A758ProCod, T01UL17_A774ProNumLin, T01UL17_A7897Dtp_Ordl
            }
            , new Object[] {
            T01UL18_A396EmprCod, T01UL18_A758ProCod, T01UL18_A774ProNumLin, T01UL18_A6438ProFsaL
            }
            , new Object[] {
            T01UL19_A396EmprCod, T01UL19_A758ProCod, T01UL19_A774ProNumLin
            }
         }
      );
      AV18Pgmname = "FicherosBasicos.TProces_Lineas_TRN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV9ProNumLin ;
   private short Z774ProNumLin ;
   private short Z6437ProUltFP ;
   private short AV9ProNumLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A774ProNumLin ;
   private short A6437ProUltFP ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short RcdFound88 ;
   private short Z469FasPreSal ;
   private short Z468FasPrePie ;
   private short Z464FasNumPas ;
   private short nIsDirty_88 ;
   private int trnEnded ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProNumLin_Enabled ;
   private int edtFasCod_Visible ;
   private int edtFasCod_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombofascod_Visible ;
   private int edtavCombofascod_Enabled ;
   private int Combo_fascod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV22GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z457FasCod ;
   private String N457FasCod ;
   private String Combo_fascod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV8ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtFasCod_Internalname ;
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
   private String edtProCod_Internalname ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String edtProNumLin_Internalname ;
   private String edtProNumLin_Jsonclick ;
   private String divTablesplittedfascod_Internalname ;
   private String lblTextblockfascod_Internalname ;
   private String lblTextblockfascod_Jsonclick ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Internalname ;
   private String TempTags ;
   private String edtFasCod_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV18Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_fascod_Internalname ;
   private String edtavCombofascod_Internalname ;
   private String AV17ComboFasCod ;
   private String edtavCombofascod_Jsonclick ;
   private String AV13Insert_FasCod ;
   private String A460FasDsc ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String A4903FasAcab ;
   private String A602MaqCod ;
   private String Combo_fascod_Objectcall ;
   private String Combo_fascod_Class ;
   private String Combo_fascod_Icontype ;
   private String Combo_fascod_Icon ;
   private String Combo_fascod_Tooltip ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Selectedtext_set ;
   private String Combo_fascod_Selectedtext_get ;
   private String Combo_fascod_Gamoauthtoken ;
   private String Combo_fascod_Ddointernalname ;
   private String Combo_fascod_Titlecontrolalign ;
   private String Combo_fascod_Dropdownoptionstype ;
   private String Combo_fascod_Titlecontrolidtoreplace ;
   private String Combo_fascod_Datalisttype ;
   private String Combo_fascod_Datalistfixedvalues ;
   private String Combo_fascod_Datalistproc ;
   private String Combo_fascod_Datalistprocparametersprefix ;
   private String Combo_fascod_Remoteservicesparameters ;
   private String Combo_fascod_Htmltemplate ;
   private String Combo_fascod_Multiplevaluestype ;
   private String Combo_fascod_Loadingdata ;
   private String Combo_fascod_Noresultsfound ;
   private String Combo_fascod_Emptyitemtext ;
   private String Combo_fascod_Onlyselectedvalues ;
   private String Combo_fascod_Selectalltext ;
   private String Combo_fascod_Multiplevaluesseparator ;
   private String Combo_fascod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode88 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV20Emprnom ;
   private String GXv_char3[] ;
   private String AV21Usurcod ;
   private String GXv_char4[] ;
   private String Z759ProDsc ;
   private String Z460FasDsc ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z4286FasForMul ;
   private String Z4299FasConPla ;
   private String Z4903FasAcab ;
   private String Z602MaqCod ;
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
   private boolean Combo_fascod_Emptyitem ;
   private boolean n459FasDec ;
   private boolean n469FasPreSal ;
   private boolean n468FasPrePie ;
   private boolean n472FasVelPro ;
   private boolean n464FasNumPas ;
   private boolean n456FasActTin ;
   private boolean n458FasCon ;
   private boolean n4286FasForMul ;
   private boolean n4299FasConPla ;
   private boolean n4903FasAcab ;
   private boolean n602MaqCod ;
   private boolean Combo_fascod_Enabled ;
   private boolean Combo_fascod_Visible ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Isgriditem ;
   private boolean Combo_fascod_Hasdescription ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Includeselectalloption ;
   private boolean Combo_fascod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private String AV16ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] T01UL5_A759ProDsc ;
   private String[] T01UL4_A460FasDsc ;
   private java.math.BigDecimal[] T01UL4_A459FasDec ;
   private boolean[] T01UL4_n459FasDec ;
   private short[] T01UL4_A469FasPreSal ;
   private boolean[] T01UL4_n469FasPreSal ;
   private short[] T01UL4_A468FasPrePie ;
   private boolean[] T01UL4_n468FasPrePie ;
   private java.math.BigDecimal[] T01UL4_A472FasVelPro ;
   private boolean[] T01UL4_n472FasVelPro ;
   private short[] T01UL4_A464FasNumPas ;
   private boolean[] T01UL4_n464FasNumPas ;
   private String[] T01UL4_A456FasActTin ;
   private boolean[] T01UL4_n456FasActTin ;
   private String[] T01UL4_A458FasCon ;
   private boolean[] T01UL4_n458FasCon ;
   private String[] T01UL4_A4286FasForMul ;
   private boolean[] T01UL4_n4286FasForMul ;
   private String[] T01UL4_A4299FasConPla ;
   private boolean[] T01UL4_n4299FasConPla ;
   private String[] T01UL4_A4903FasAcab ;
   private boolean[] T01UL4_n4903FasAcab ;
   private String[] T01UL4_A602MaqCod ;
   private boolean[] T01UL4_n602MaqCod ;
   private short[] T01UL6_A774ProNumLin ;
   private String[] T01UL6_A759ProDsc ;
   private String[] T01UL6_A460FasDsc ;
   private java.math.BigDecimal[] T01UL6_A459FasDec ;
   private boolean[] T01UL6_n459FasDec ;
   private short[] T01UL6_A469FasPreSal ;
   private boolean[] T01UL6_n469FasPreSal ;
   private short[] T01UL6_A468FasPrePie ;
   private boolean[] T01UL6_n468FasPrePie ;
   private java.math.BigDecimal[] T01UL6_A472FasVelPro ;
   private boolean[] T01UL6_n472FasVelPro ;
   private short[] T01UL6_A464FasNumPas ;
   private boolean[] T01UL6_n464FasNumPas ;
   private String[] T01UL6_A456FasActTin ;
   private boolean[] T01UL6_n456FasActTin ;
   private String[] T01UL6_A458FasCon ;
   private boolean[] T01UL6_n458FasCon ;
   private String[] T01UL6_A4286FasForMul ;
   private boolean[] T01UL6_n4286FasForMul ;
   private String[] T01UL6_A4299FasConPla ;
   private boolean[] T01UL6_n4299FasConPla ;
   private String[] T01UL6_A4903FasAcab ;
   private boolean[] T01UL6_n4903FasAcab ;
   private short[] T01UL6_A6437ProUltFP ;
   private String[] T01UL6_A396EmprCod ;
   private String[] T01UL6_A457FasCod ;
   private String[] T01UL6_A758ProCod ;
   private String[] T01UL6_A602MaqCod ;
   private boolean[] T01UL6_n602MaqCod ;
   private String[] T01UL7_A460FasDsc ;
   private java.math.BigDecimal[] T01UL7_A459FasDec ;
   private boolean[] T01UL7_n459FasDec ;
   private short[] T01UL7_A469FasPreSal ;
   private boolean[] T01UL7_n469FasPreSal ;
   private short[] T01UL7_A468FasPrePie ;
   private boolean[] T01UL7_n468FasPrePie ;
   private java.math.BigDecimal[] T01UL7_A472FasVelPro ;
   private boolean[] T01UL7_n472FasVelPro ;
   private short[] T01UL7_A464FasNumPas ;
   private boolean[] T01UL7_n464FasNumPas ;
   private String[] T01UL7_A456FasActTin ;
   private boolean[] T01UL7_n456FasActTin ;
   private String[] T01UL7_A458FasCon ;
   private boolean[] T01UL7_n458FasCon ;
   private String[] T01UL7_A4286FasForMul ;
   private boolean[] T01UL7_n4286FasForMul ;
   private String[] T01UL7_A4299FasConPla ;
   private boolean[] T01UL7_n4299FasConPla ;
   private String[] T01UL7_A4903FasAcab ;
   private boolean[] T01UL7_n4903FasAcab ;
   private String[] T01UL7_A602MaqCod ;
   private boolean[] T01UL7_n602MaqCod ;
   private String[] T01UL8_A759ProDsc ;
   private String[] T01UL9_A396EmprCod ;
   private String[] T01UL9_A758ProCod ;
   private short[] T01UL9_A774ProNumLin ;
   private short[] T01UL3_A774ProNumLin ;
   private short[] T01UL3_A6437ProUltFP ;
   private String[] T01UL3_A396EmprCod ;
   private String[] T01UL3_A457FasCod ;
   private String[] T01UL3_A758ProCod ;
   private String[] T01UL10_A396EmprCod ;
   private String[] T01UL10_A758ProCod ;
   private short[] T01UL10_A774ProNumLin ;
   private String[] T01UL11_A396EmprCod ;
   private String[] T01UL11_A758ProCod ;
   private short[] T01UL11_A774ProNumLin ;
   private short[] T01UL2_A774ProNumLin ;
   private short[] T01UL2_A6437ProUltFP ;
   private String[] T01UL2_A396EmprCod ;
   private String[] T01UL2_A457FasCod ;
   private String[] T01UL2_A758ProCod ;
   private String[] T01UL15_A460FasDsc ;
   private java.math.BigDecimal[] T01UL15_A459FasDec ;
   private boolean[] T01UL15_n459FasDec ;
   private short[] T01UL15_A469FasPreSal ;
   private boolean[] T01UL15_n469FasPreSal ;
   private short[] T01UL15_A468FasPrePie ;
   private boolean[] T01UL15_n468FasPrePie ;
   private java.math.BigDecimal[] T01UL15_A472FasVelPro ;
   private boolean[] T01UL15_n472FasVelPro ;
   private short[] T01UL15_A464FasNumPas ;
   private boolean[] T01UL15_n464FasNumPas ;
   private String[] T01UL15_A456FasActTin ;
   private boolean[] T01UL15_n456FasActTin ;
   private String[] T01UL15_A458FasCon ;
   private boolean[] T01UL15_n458FasCon ;
   private String[] T01UL15_A4286FasForMul ;
   private boolean[] T01UL15_n4286FasForMul ;
   private String[] T01UL15_A4299FasConPla ;
   private boolean[] T01UL15_n4299FasConPla ;
   private String[] T01UL15_A4903FasAcab ;
   private boolean[] T01UL15_n4903FasAcab ;
   private String[] T01UL15_A602MaqCod ;
   private boolean[] T01UL15_n602MaqCod ;
   private String[] T01UL16_A759ProDsc ;
   private String[] T01UL17_A396EmprCod ;
   private String[] T01UL17_A758ProCod ;
   private short[] T01UL17_A774ProNumLin ;
   private short[] T01UL17_A7897Dtp_Ordl ;
   private String[] T01UL18_A396EmprCod ;
   private String[] T01UL18_A758ProCod ;
   private short[] T01UL18_A774ProNumLin ;
   private short[] T01UL18_A6438ProFsaL ;
   private String[] T01UL19_A396EmprCod ;
   private String[] T01UL19_A758ProCod ;
   private short[] T01UL19_A774ProNumLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV15FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV14TrnContextAtt ;
}

final  class tproces_lineas_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_lineas_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_lineas_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_lineas_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_lineas_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UL2", "SELECT ProNumLin, ProUltFP, EmprCod, FasCod, ProCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?  FOR UPDATE OF ProUltFP, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL3", "SELECT ProNumLin, ProUltFP, EmprCod, FasCod, ProCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL4", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL5", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL6", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProNumLin, T2.ProDsc, T3.FasDsc, T3.FasDec, T3.FasPreSal, T3.FasPrePie, T3.FasVelPro, T3.FasNumPas, T3.FasActTin, T3.FasCon, T3.FasForMul, T3.FasConPla, T3.FasAcab, TM1.ProUltFP, TM1.EmprCod, TM1.FasCod, TM1.ProCod, T3.MaqCod FROM ((TXPPROLIN TM1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = TM1.EmprCod AND T2.ProCod = TM1.ProCod) INNER JOIN TXPFASPRO T3 ON T3.EmprCod = TM1.EmprCod AND T3.FasCod = TM1.FasCod) WHERE TM1.EmprCod = ? and TM1.ProCod = ? and TM1.ProNumLin = ? ORDER BY TM1.EmprCod, TM1.ProCod, TM1.ProNumLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL7", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL8", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE ( EmprCod > ? or EmprCod = ? and ProCod > ? or ProCod = ? and EmprCod = ? and ProNumLin > ?) ORDER BY EmprCod, ProCod, ProNumLin) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UL11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE ( EmprCod < ? or EmprCod = ? and ProCod < ? or ProCod = ? and EmprCod = ? and ProNumLin < ?) ORDER BY EmprCod DESC, ProCod DESC, ProNumLin DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UL12", "INSERT INTO TXPPROLIN(ProNumLin, ProUltFP, EmprCod, FasCod, ProCod, ProFasNot, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0)", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T01UL13", "UPDATE TXPPROLIN SET ProUltFP=?, FasCod=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T01UL14", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new ForEachCursor("T01UL15", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL16", "SELECT ProDsc FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UL17", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UL18", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UL19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod, ProNumLin FROM TXPPROLIN ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 28);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(7,1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14);
               ((String[]) buf[24])[0] = rslt.getString(15, 3);
               ((String[]) buf[25])[0] = rslt.getString(16, 8);
               ((String[]) buf[26])[0] = rslt.getString(17, 8);
               ((String[]) buf[27])[0] = rslt.getString(18, 6);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 28);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,1);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((short[]) buf[9])[0] = rslt.getShort(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(9, 1);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 40);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 11 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 15 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

