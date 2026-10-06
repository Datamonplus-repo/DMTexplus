package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_ccdef_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"CCTCOD") == 0 )
      {
         AV8CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CCTCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CCTCod), "ZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asacctcod1VP621( AV8CCTCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"CCTCOD") == 0 )
      {
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         AV12autonumber = (short)(GXutil.lval( httpContext.GetPar( "autonumber"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12autonumber), 4, 0));
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asacctcod1VP621( A4031CCTCod, AV12autonumber, A396EmprCod) ;
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
            AV8CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CCTCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CCTCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Definición de Cont. de Calidad", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public controlcalidad_ccdef_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_ccdef_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_ccdef_impl.class ));
   }

   public controlcalidad_ccdef_impl( int remoteHandle ,
                                     ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTTpoCtr = new HTMLChoice();
      chkCCTIniFas = UIFactory.getCheckbox(this);
      chkCCTFinFas = UIFactory.getCheckbox(this);
      chkCCTSto = UIFactory.getCheckbox(this);
      chkCCTObs = UIFactory.getCheckbox(this);
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
      if ( cmbCCTTpoCtr.getItemCount() > 0 )
      {
         A4037CCTTpoCtr = cmbCCTTpoCtr.getValidValue(A4037CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      }
      A4407CCTIniFas = ((GXutil.strcmp(GXutil.rtrim( A4407CCTIniFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
      A4406CCTFinFas = ((GXutil.strcmp(GXutil.rtrim( A4406CCTFinFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      A4040CCTSto = ((GXutil.strcmp(GXutil.rtrim( A4040CCTSto), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
      A4042CCTObs = ((GXutil.strcmp(GXutil.rtrim( A4042CCTObs), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTCod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTTpoCtr.getInternalname(), httpContext.getMessage( "Tipo de Control", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTTpoCtr, cmbCCTTpoCtr.getInternalname(), GXutil.rtrim( A4037CCTTpoCtr), 1, cmbCCTTpoCtr.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTTpoCtr.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
      cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTIniFas.getInternalname(), httpContext.getMessage( "Inicio de la Fase?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTIniFas.getInternalname(), A4407CCTIniFas, "", httpContext.getMessage( "Inicio de la Fase?", ""), 1, chkCCTIniFas.getEnabled(), "S", httpContext.getMessage( "Inicio de Fase", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(39, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,39);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTFinFas.getInternalname(), httpContext.getMessage( "Final de la Fase?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTFinFas.getInternalname(), A4406CCTFinFas, "", httpContext.getMessage( "Final de la Fase?", ""), 1, chkCCTFinFas.getEnabled(), "S", httpContext.getMessage( "Final de Fase", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(42, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,42);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divCctsto_cell_Internalname, 1, 0, "px", 0, "px", divCctsto_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTSto.getInternalname(), httpContext.getMessage( "Control, para producción", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTSto.getInternalname(), A4040CCTSto, "", httpContext.getMessage( "Control, para producción", ""), chkCCTSto.getVisible(), chkCCTSto.getEnabled(), "S", httpContext.getMessage( "Paro de Producción", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(45, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,45);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divCctobs_cell_Internalname, 1, 0, "px", 0, "px", divCctobs_cell_Class, "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTObs.getInternalname(), httpContext.getMessage( "Aceptar observaciones?", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTObs.getInternalname(), A4042CCTObs, "", httpContext.getMessage( "Aceptar observaciones?", ""), chkCCTObs.getVisible(), chkCCTObs.getEnabled(), "S", httpContext.getMessage( "Observaciones", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(48, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,48);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablaupload_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTArc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTArc_Internalname, httpContext.getMessage( "Archivo de Plantilla", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTArc_Internalname, GXutil.rtrim( A4041CCTArc), GXutil.rtrim( localUtil.format( A4041CCTArc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTArc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTArc_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedlistfiles_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_listfiles_Internalname, httpContext.getMessage( "Templates", ""), "", "", lblTextblockcombo_listfiles_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_listfiles.setProperty("Caption", Combo_listfiles_Caption);
      ucCombo_listfiles.setProperty("Cls", Combo_listfiles_Cls);
      ucCombo_listfiles.setProperty("DropDownOptionsTitleSettingsIcons", AV25DDO_TitleSettingsIcons);
      ucCombo_listfiles.setProperty("DropDownOptionsData", AV32ListFiles_Data);
      ucCombo_listfiles.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_listfiles_Internalname, "COMBO_LISTFILESContainer");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV34Pgmname), GXutil.rtrim( localUtil.format( AV34Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
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
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtavListfiles_Internalname, AV31ListFiles, "", "", (short)(0), edtavListfiles_Visible, edtavListfiles_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "180", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\ControlCalidad_CCDEF.htm");
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
      e111VP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV25DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLISTFILES_DATA"), AV32ListFiles_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z4041CCTArc = httpContext.cgiGet( "Z4041CCTArc") ;
            Z4036CCTDsc = httpContext.cgiGet( "Z4036CCTDsc") ;
            Z4037CCTTpoCtr = httpContext.cgiGet( "Z4037CCTTpoCtr") ;
            Z4406CCTFinFas = httpContext.cgiGet( "Z4406CCTFinFas") ;
            Z4407CCTIniFas = httpContext.cgiGet( "Z4407CCTIniFas") ;
            Z4039CCTObl = httpContext.cgiGet( "Z4039CCTObl") ;
            Z4040CCTSto = httpContext.cgiGet( "Z4040CCTSto") ;
            Z4042CCTObs = httpContext.cgiGet( "Z4042CCTObs") ;
            Z11475CCTNotUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z11475CCTNotUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A4039CCTObl = httpContext.cgiGet( "Z4039CCTObl") ;
            A11475CCTNotUlt = (short)(localUtil.ctol( httpContext.cgiGet( "Z11475CCTNotUlt"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N4042CCTObs = httpContext.cgiGet( "N4042CCTObs") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV12autonumber = (short)(localUtil.ctol( httpContext.cgiGet( "vAUTONUMBER"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22CCTSTO = (short)(localUtil.ctol( httpContext.cgiGet( "vCCTSTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21CCTOBS = (short)(localUtil.ctol( httpContext.cgiGet( "vCCTOBS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17CCTArc = httpContext.cgiGet( "vCCTARC") ;
            A4039CCTObl = httpContext.cgiGet( "CCTOBL") ;
            A11475CCTNotUlt = (short)(localUtil.ctol( httpContext.cgiGet( "CCTNOTULT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            Combo_listfiles_Objectcall = httpContext.cgiGet( "COMBO_LISTFILES_Objectcall") ;
            Combo_listfiles_Class = httpContext.cgiGet( "COMBO_LISTFILES_Class") ;
            Combo_listfiles_Icontype = httpContext.cgiGet( "COMBO_LISTFILES_Icontype") ;
            Combo_listfiles_Icon = httpContext.cgiGet( "COMBO_LISTFILES_Icon") ;
            Combo_listfiles_Caption = httpContext.cgiGet( "COMBO_LISTFILES_Caption") ;
            Combo_listfiles_Tooltip = httpContext.cgiGet( "COMBO_LISTFILES_Tooltip") ;
            Combo_listfiles_Cls = httpContext.cgiGet( "COMBO_LISTFILES_Cls") ;
            Combo_listfiles_Selectedvalue_set = httpContext.cgiGet( "COMBO_LISTFILES_Selectedvalue_set") ;
            Combo_listfiles_Selectedvalue_get = httpContext.cgiGet( "COMBO_LISTFILES_Selectedvalue_get") ;
            Combo_listfiles_Selectedtext_set = httpContext.cgiGet( "COMBO_LISTFILES_Selectedtext_set") ;
            Combo_listfiles_Selectedtext_get = httpContext.cgiGet( "COMBO_LISTFILES_Selectedtext_get") ;
            Combo_listfiles_Gamoauthtoken = httpContext.cgiGet( "COMBO_LISTFILES_Gamoauthtoken") ;
            Combo_listfiles_Ddointernalname = httpContext.cgiGet( "COMBO_LISTFILES_Ddointernalname") ;
            Combo_listfiles_Titlecontrolalign = httpContext.cgiGet( "COMBO_LISTFILES_Titlecontrolalign") ;
            Combo_listfiles_Dropdownoptionstype = httpContext.cgiGet( "COMBO_LISTFILES_Dropdownoptionstype") ;
            Combo_listfiles_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Enabled")) ;
            Combo_listfiles_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Visible")) ;
            Combo_listfiles_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_LISTFILES_Titlecontrolidtoreplace") ;
            Combo_listfiles_Datalisttype = httpContext.cgiGet( "COMBO_LISTFILES_Datalisttype") ;
            Combo_listfiles_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Allowmultipleselection")) ;
            Combo_listfiles_Datalistfixedvalues = httpContext.cgiGet( "COMBO_LISTFILES_Datalistfixedvalues") ;
            Combo_listfiles_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Isgriditem")) ;
            Combo_listfiles_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Hasdescription")) ;
            Combo_listfiles_Datalistproc = httpContext.cgiGet( "COMBO_LISTFILES_Datalistproc") ;
            Combo_listfiles_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_LISTFILES_Datalistprocparametersprefix") ;
            Combo_listfiles_Remoteservicesparameters = httpContext.cgiGet( "COMBO_LISTFILES_Remoteservicesparameters") ;
            Combo_listfiles_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_LISTFILES_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_listfiles_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Includeonlyselectedoption")) ;
            Combo_listfiles_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Includeselectalloption")) ;
            Combo_listfiles_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Emptyitem")) ;
            Combo_listfiles_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTFILES_Includeaddnewoption")) ;
            Combo_listfiles_Htmltemplate = httpContext.cgiGet( "COMBO_LISTFILES_Htmltemplate") ;
            Combo_listfiles_Multiplevaluestype = httpContext.cgiGet( "COMBO_LISTFILES_Multiplevaluestype") ;
            Combo_listfiles_Loadingdata = httpContext.cgiGet( "COMBO_LISTFILES_Loadingdata") ;
            Combo_listfiles_Noresultsfound = httpContext.cgiGet( "COMBO_LISTFILES_Noresultsfound") ;
            Combo_listfiles_Emptyitemtext = httpContext.cgiGet( "COMBO_LISTFILES_Emptyitemtext") ;
            Combo_listfiles_Onlyselectedvalues = httpContext.cgiGet( "COMBO_LISTFILES_Onlyselectedvalues") ;
            Combo_listfiles_Selectalltext = httpContext.cgiGet( "COMBO_LISTFILES_Selectalltext") ;
            Combo_listfiles_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_LISTFILES_Multiplevaluesseparator") ;
            Combo_listfiles_Addnewoptiontext = httpContext.cgiGet( "COMBO_LISTFILES_Addnewoptiontext") ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A4031CCTCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            else
            {
               A4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCCTCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            }
            A4036CCTDsc = httpContext.cgiGet( edtCCTDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
            cmbCCTTpoCtr.setValue( httpContext.cgiGet( cmbCCTTpoCtr.getInternalname()) );
            A4037CCTTpoCtr = httpContext.cgiGet( cmbCCTTpoCtr.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
            A4407CCTIniFas = ((GXutil.strcmp(httpContext.cgiGet( chkCCTIniFas.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
            A4406CCTFinFas = ((GXutil.strcmp(httpContext.cgiGet( chkCCTFinFas.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
            A4040CCTSto = ((GXutil.strcmp(httpContext.cgiGet( chkCCTSto.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
            A4042CCTObs = ((GXutil.strcmp(httpContext.cgiGet( chkCCTObs.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
            A4041CCTArc = GXutil.upper( httpContext.cgiGet( edtCCTArc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
            AV31ListFiles = httpContext.cgiGet( edtavListfiles_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31ListFiles", AV31ListFiles);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCDEF");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("CCTObl", GXutil.rtrim( localUtil.format( A4039CCTObl, "@!")));
            forbiddenHiddens.add("CCTNotUlt", localUtil.format( DecimalUtil.doubleToDec(A11475CCTNotUlt), "ZZZ9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A4031CCTCod != Z4031CCTCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\controlcalidad_ccdef:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
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
                  sMode621 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode621 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound621 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1VP0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "CCTCOD");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtCCTCod_Internalname ;
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
                     if ( GXutil.strcmp(sEvt, "COMBO_LISTFILES.ONOPTIONCLICKED") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e121VP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e111VP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e131VP2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoUserAction1' */
                        e141VP2 ();
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
         e131VP2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1VP621( ) ;
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
         disableAttributes1VP621( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavListfiles_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListfiles_Enabled), 5, 0), true);
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

   public void confirm_1VP0( )
   {
      beforeValidate1VP621( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1VP621( ) ;
         }
         else
         {
            checkExtendedTable1VP621( ) ;
            closeExtendedTableCursors1VP621( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1VP0( )
   {
   }

   public void e111VP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidad_ccdef_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidad_ccdef_impl.this.AV7EmprCod = GXv_char2[0] ;
      controlcalidad_ccdef_impl.this.AV14EmprNom = GXv_char3[0] ;
      controlcalidad_ccdef_impl.this.AV15UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV25DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV25DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtavListfiles_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListfiles_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListfiles_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOLISTFILES' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
      GXt_int8 = (byte)(AV12autonumber) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "AUTNUM", ""), GXv_int9) ;
      controlcalidad_ccdef_impl.this.GXt_int8 = GXv_int9[0] ;
      AV12autonumber = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12autonumber", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12autonumber), 4, 0));
      GXt_int8 = (byte)(AV22CCTSTO) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CCTSTO", ""), GXv_int9) ;
      controlcalidad_ccdef_impl.this.GXt_int8 = GXv_int9[0] ;
      AV22CCTSTO = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22CCTSTO", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22CCTSTO), 4, 0));
      GXt_int8 = (byte)(AV21CCTOBS) ;
      GXv_int9[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV7EmprCod, httpContext.getMessage( "CCTOBS", ""), GXv_int9) ;
      controlcalidad_ccdef_impl.this.GXt_int8 = GXv_int9[0] ;
      AV21CCTOBS = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21CCTOBS", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21CCTOBS), 4, 0));
      GXt_char1 = AV27Folder ;
      GXv_char4[0] = AV7EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "CCTDIR", "") ;
      GXv_char2[0] = GXt_char1 ;
      new app.pexicond(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      controlcalidad_ccdef_impl.this.AV7EmprCod = GXv_char4[0] ;
      controlcalidad_ccdef_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      AV27Folder = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Folder", AV27Folder);
      AV27Folder = ((GXutil.strcmp("", AV27Folder)==0) ? httpContext.getMessage( "C:\\MODELOS\\CC", "") : AV27Folder) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Folder", AV27Folder);
      AV30lengt = (short)(GXutil.len( GXutil.trim( AV27Folder))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30lengt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30lengt), 4, 0));
      AV27Folder = ((GXutil.strcmp(GXutil.substring( AV27Folder, AV30lengt, 1), "\\")!=0) ? GXutil.trim( AV27Folder)+"\\" : AV27Folder) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Folder", AV27Folder);
      AV26Dir.setSource( AV27Folder );
      AV29i = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29i), 4, 0));
      AV36GXV2 = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36GXV2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV2), 8, 0));
      AV35GXV1 = (com.genexus.util.GXFileCollection)AV26Dir.getFiles("");
      while ( AV36GXV2 <= AV35GXV1.getItemCount() )
      {
         AV16File = (com.genexus.util.GXFile)AV35GXV1.item(AV36GXV2);
         AV29i = (short)(AV29i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29i), 4, 0));
         AV28FullPath = AV27Folder + AV16File.getName() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28FullPath", AV28FullPath);
         AV33ListFiles_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV33ListFiles_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV28FullPath );
         AV33ListFiles_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV28FullPath );
         AV32ListFiles_Data.add(AV33ListFiles_Item, 0);
         AV36GXV2 = (int)(AV36GXV2+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV2), 8, 0));
      }
   }

   public void e131VP2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.controlcalidadhtd.controlcalidad_ccdef1_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A4031CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A4036CCTDsc)),GXutil.URLEncode(GXutil.rtrim(A4037CCTTpoCtr))}, new String[] {"emprcod","CCTCod","CCTDsc","CCTTpoCtr"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.controlcalidadhtd.controlcalidad_ccdefww", new String[] {}, new String[] {}) );
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

   public void e121VP2( )
   {
      /* Combo_listfiles_Onoptionclicked Routine */
      returnInSub = false ;
      AV31ListFiles = Combo_listfiles_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ListFiles", AV31ListFiles);
      GXv_char4[0] = A4041CCTArc ;
      new app.controlcalidadhtd.cctarc(remoteHandle, context).execute( AV31ListFiles, GXv_char4) ;
      controlcalidad_ccdef_impl.this.A4041CCTArc = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      /*  Sending Event outputs  */
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      chkCCTSto.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTSto.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTSto.getVisible(), 5, 0), true);
      divCctsto_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divCctsto_cell_Internalname, "Class", divCctsto_cell_Class, true);
      chkCCTObs.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
      divCctobs_cell_Class = "Invisible" ;
      httpContext.ajax_rsp_assign_prop("", false, divCctobs_cell_Internalname, "Class", divCctobs_cell_Class, true);
   }

   public void S112( )
   {
      /* 'LOADCOMBOLISTFILES' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV32ListFiles_Data ;
      GXv_char4[0] = AV23ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.controlcalidadhtd.controlcalidad_ccdefloaddvcombo(remoteHandle, context).execute( "ListFiles", Gx_mode, AV7EmprCod, AV8CCTCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      controlcalidad_ccdef_impl.this.AV23ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV32ListFiles_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_listfiles_Selectedvalue_set = AV23ComboSelectedValue ;
      ucCombo_listfiles.sendProperty(context, "", false, Combo_listfiles_Internalname, "SelectedValue_set", Combo_listfiles_Selectedvalue_set);
      AV31ListFiles = AV23ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31ListFiles", AV31ListFiles);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_listfiles_Enabled = false ;
         ucCombo_listfiles.sendProperty(context, "", false, Combo_listfiles_Internalname, "Enabled", GXutil.booltostr( Combo_listfiles_Enabled));
      }
   }

   public void e141VP2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      AV16File.setSource( AV17CCTArc );
      httpContext.GX_msglist.addItem(AV16File.getPath());
      /*  Sending Event outputs  */
   }

   public void zm1VP621( int GX_JID )
   {
      if ( ( GX_JID == 23 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4041CCTArc = T01VP3_A4041CCTArc[0] ;
            Z4036CCTDsc = T01VP3_A4036CCTDsc[0] ;
            Z4037CCTTpoCtr = T01VP3_A4037CCTTpoCtr[0] ;
            Z4406CCTFinFas = T01VP3_A4406CCTFinFas[0] ;
            Z4407CCTIniFas = T01VP3_A4407CCTIniFas[0] ;
            Z4039CCTObl = T01VP3_A4039CCTObl[0] ;
            Z4040CCTSto = T01VP3_A4040CCTSto[0] ;
            Z4042CCTObs = T01VP3_A4042CCTObs[0] ;
            Z11475CCTNotUlt = T01VP3_A11475CCTNotUlt[0] ;
         }
         else
         {
            Z4041CCTArc = A4041CCTArc ;
            Z4036CCTDsc = A4036CCTDsc ;
            Z4037CCTTpoCtr = A4037CCTTpoCtr ;
            Z4406CCTFinFas = A4406CCTFinFas ;
            Z4407CCTIniFas = A4407CCTIniFas ;
            Z4039CCTObl = A4039CCTObl ;
            Z4040CCTSto = A4040CCTSto ;
            Z4042CCTObs = A4042CCTObs ;
            Z11475CCTNotUlt = A11475CCTNotUlt ;
         }
      }
      if ( GX_JID == -23 )
      {
         Z4031CCTCod = A4031CCTCod ;
         Z4041CCTArc = A4041CCTArc ;
         Z4036CCTDsc = A4036CCTDsc ;
         Z4037CCTTpoCtr = A4037CCTTpoCtr ;
         Z4406CCTFinFas = A4406CCTFinFas ;
         Z4407CCTIniFas = A4407CCTIniFas ;
         Z4039CCTObl = A4039CCTObl ;
         Z4040CCTSto = A4040CCTSto ;
         Z4042CCTObs = A4042CCTObs ;
         Z11475CCTNotUlt = A11475CCTNotUlt ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
      }
   }

   public void standaloneNotModal( )
   {
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         cmbCCTTpoCtr.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      }
      else
      {
         cmbCCTTpoCtr.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      }
      AV34Pgmname = "ControlCalidadHTD.ControlCalidad_CCDEF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01VP4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01VP4_A407EmprNom[0] ;
      n407EmprNom = T01VP4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV8CCTCod) )
      {
         A4031CCTCod = AV8CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      if ( ! (0==AV8CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV8CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      chkCCTSto.setVisible( ((AV22CCTSTO==1) ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTSto.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTSto.getVisible(), 5, 0), true);
      if ( ! ( ( AV22CCTSTO == 1 ) ) )
      {
         divCctsto_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divCctsto_cell_Internalname, "Class", divCctsto_cell_Class, true);
      }
      else
      {
         if ( AV22CCTSTO == 1 )
         {
            divCctsto_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divCctsto_cell_Internalname, "Class", divCctsto_cell_Class, true);
         }
      }
      if ( ! ( ( AV21CCTOBS == 1 ) ) )
      {
         divCctobs_cell_Class = httpContext.getMessage( "Invisible", "") ;
         httpContext.ajax_rsp_assign_prop("", false, divCctobs_cell_Internalname, "Class", divCctobs_cell_Class, true);
      }
      else
      {
         if ( AV21CCTOBS == 1 )
         {
            divCctobs_cell_Class = httpContext.getMessage( "col-xs-12 col-sm-2 DataContentCell", "") ;
            httpContext.ajax_rsp_assign_prop("", false, divCctobs_cell_Internalname, "Class", divCctobs_cell_Class, true);
         }
      }
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
      {
         cmbCCTTpoCtr.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
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

   public void load1VP621( )
   {
      /* Using cursor T01VP5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A4041CCTArc = T01VP5_A4041CCTArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         A407EmprNom = T01VP5_A407EmprNom[0] ;
         n407EmprNom = T01VP5_n407EmprNom[0] ;
         A4036CCTDsc = T01VP5_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01VP5_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4406CCTFinFas = T01VP5_A4406CCTFinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
         A4407CCTIniFas = T01VP5_A4407CCTIniFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
         A4039CCTObl = T01VP5_A4039CCTObl[0] ;
         A4040CCTSto = T01VP5_A4040CCTSto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
         A4042CCTObs = T01VP5_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         A11475CCTNotUlt = T01VP5_A11475CCTNotUlt[0] ;
         zm1VP621( -23) ;
      }
      pr_default.close(3);
      onLoadActions1VP621( ) ;
   }

   public void onLoadActions1VP621( )
   {
      if ( true )
      {
         chkCCTObs.setVisible( ((AV21CCTOBS==1) ? 1 : 0) );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            chkCCTObs.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               chkCCTObs.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
            }
         }
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         chkCCTObs.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      else
      {
         chkCCTObs.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
      {
         AV17CCTArc = A4041CCTArc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17CCTArc", AV17CCTArc);
      }
      if ( ! (GXutil.strcmp("", AV17CCTArc)==0) )
      {
         A4041CCTArc = AV17CCTArc ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            A4041CCTArc = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         }
      }
   }

   public void checkExtendedTable1VP621( )
   {
      nIsDirty_621 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( true )
      {
         chkCCTObs.setVisible( ((AV21CCTOBS==1) ? 1 : 0) );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
         {
            chkCCTObs.setVisible( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
            {
               chkCCTObs.setVisible( 1 );
               httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
            }
         }
      }
      if ( (GXutil.strcmp("", A4036CCTDsc)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Descripción es requerido.", ""), 1, "CCTDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (GXutil.strcmp("", A4036CCTDsc)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Descripcion invalidad", ""), 1, "CCTDSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
      {
         chkCCTObs.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      else
      {
         chkCCTObs.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
      {
         AV17CCTArc = A4041CCTArc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17CCTArc", AV17CCTArc);
      }
      if ( ! (GXutil.strcmp("", AV17CCTArc)==0) )
      {
         nIsDirty_621 = (short)(1) ;
         A4041CCTArc = AV17CCTArc ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            nIsDirty_621 = (short)(1) ;
            A4041CCTArc = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         }
      }
   }

   public void closeExtendedTableCursors1VP621( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1VP621( )
   {
      /* Using cursor T01VP6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound621 = (short)(1) ;
      }
      else
      {
         RcdFound621 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01VP3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1VP621( 23) ;
         RcdFound621 = (short)(1) ;
         A4031CCTCod = T01VP3_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4041CCTArc = T01VP3_A4041CCTArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         A4036CCTDsc = T01VP3_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01VP3_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4406CCTFinFas = T01VP3_A4406CCTFinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
         A4407CCTIniFas = T01VP3_A4407CCTIniFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
         A4039CCTObl = T01VP3_A4039CCTObl[0] ;
         A4040CCTSto = T01VP3_A4040CCTSto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
         A4042CCTObs = T01VP3_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         A11475CCTNotUlt = T01VP3_A11475CCTNotUlt[0] ;
         A396EmprCod = T01VP3_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         sMode621 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1VP621( ) ;
         if ( AnyError == 1 )
         {
            RcdFound621 = (short)(0) ;
            initializeNonKey1VP621( ) ;
         }
         Gx_mode = sMode621 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound621 = (short)(0) ;
         initializeNonKey1VP621( ) ;
         sMode621 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode621 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1VP621( ) ;
      if ( RcdFound621 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound621 = (short)(0) ;
      /* Using cursor T01VP7 */
      pr_default.execute(5, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01VP7_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VP7_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VP7_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T01VP7_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VP7_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VP7_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            A396EmprCod = T01VP7_A396EmprCod[0] ;
            A4031CCTCod = T01VP7_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound621 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound621 = (short)(0) ;
      /* Using cursor T01VP8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01VP8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01VP8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VP8_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01VP8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01VP8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01VP8_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            A396EmprCod = T01VP8_A396EmprCod[0] ;
            A4031CCTCod = T01VP8_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound621 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1VP621( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1VP621( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound621 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "CCTCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1VP621( ) ;
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtCCTCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1VP621( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "CCTCOD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtCCTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtCCTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1VP621( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1VP621( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01VP2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4041CCTArc, T01VP2_A4041CCTArc[0]) != 0 ) || ( GXutil.strcmp(Z4036CCTDsc, T01VP2_A4036CCTDsc[0]) != 0 ) || ( GXutil.strcmp(Z4037CCTTpoCtr, T01VP2_A4037CCTTpoCtr[0]) != 0 ) || ( GXutil.strcmp(Z4406CCTFinFas, T01VP2_A4406CCTFinFas[0]) != 0 ) || ( GXutil.strcmp(Z4407CCTIniFas, T01VP2_A4407CCTIniFas[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4039CCTObl, T01VP2_A4039CCTObl[0]) != 0 ) || ( GXutil.strcmp(Z4040CCTSto, T01VP2_A4040CCTSto[0]) != 0 ) || ( GXutil.strcmp(Z4042CCTObs, T01VP2_A4042CCTObs[0]) != 0 ) || ( Z11475CCTNotUlt != T01VP2_A11475CCTNotUlt[0] ) )
         {
            if ( GXutil.strcmp(Z4041CCTArc, T01VP2_A4041CCTArc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTArc");
               GXutil.writeLogRaw("Old: ",Z4041CCTArc);
               GXutil.writeLogRaw("Current: ",T01VP2_A4041CCTArc[0]);
            }
            if ( GXutil.strcmp(Z4036CCTDsc, T01VP2_A4036CCTDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTDsc");
               GXutil.writeLogRaw("Old: ",Z4036CCTDsc);
               GXutil.writeLogRaw("Current: ",T01VP2_A4036CCTDsc[0]);
            }
            if ( GXutil.strcmp(Z4037CCTTpoCtr, T01VP2_A4037CCTTpoCtr[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTTpoCtr");
               GXutil.writeLogRaw("Old: ",Z4037CCTTpoCtr);
               GXutil.writeLogRaw("Current: ",T01VP2_A4037CCTTpoCtr[0]);
            }
            if ( GXutil.strcmp(Z4406CCTFinFas, T01VP2_A4406CCTFinFas[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTFinFas");
               GXutil.writeLogRaw("Old: ",Z4406CCTFinFas);
               GXutil.writeLogRaw("Current: ",T01VP2_A4406CCTFinFas[0]);
            }
            if ( GXutil.strcmp(Z4407CCTIniFas, T01VP2_A4407CCTIniFas[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTIniFas");
               GXutil.writeLogRaw("Old: ",Z4407CCTIniFas);
               GXutil.writeLogRaw("Current: ",T01VP2_A4407CCTIniFas[0]);
            }
            if ( GXutil.strcmp(Z4039CCTObl, T01VP2_A4039CCTObl[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTObl");
               GXutil.writeLogRaw("Old: ",Z4039CCTObl);
               GXutil.writeLogRaw("Current: ",T01VP2_A4039CCTObl[0]);
            }
            if ( GXutil.strcmp(Z4040CCTSto, T01VP2_A4040CCTSto[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTSto");
               GXutil.writeLogRaw("Old: ",Z4040CCTSto);
               GXutil.writeLogRaw("Current: ",T01VP2_A4040CCTSto[0]);
            }
            if ( GXutil.strcmp(Z4042CCTObs, T01VP2_A4042CCTObs[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTObs");
               GXutil.writeLogRaw("Old: ",Z4042CCTObs);
               GXutil.writeLogRaw("Current: ",T01VP2_A4042CCTObs[0]);
            }
            if ( Z11475CCTNotUlt != T01VP2_A11475CCTNotUlt[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad_ccdef:[seudo value changed for attri]"+"CCTNotUlt");
               GXutil.writeLogRaw("Old: ",Z11475CCTNotUlt);
               GXutil.writeLogRaw("Current: ",T01VP2_A11475CCTNotUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1VP621( )
   {
      beforeValidate1VP621( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VP621( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1VP621( 0) ;
         checkOptimisticConcurrency1VP621( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VP621( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1VP621( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VP9 */
                  pr_default.execute(7, new Object[] {Integer.valueOf(A4031CCTCod), A4041CCTArc, A4036CCTDsc, A4037CCTTpoCtr, A4406CCTFinFas, A4407CCTIniFas, A4039CCTObl, A4040CCTSto, A4042CCTObs, Short.valueOf(A11475CCTNotUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
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
                        resetCaption1VP0( ) ;
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
            load1VP621( ) ;
         }
         endLevel1VP621( ) ;
      }
      closeExtendedTableCursors1VP621( ) ;
   }

   public void update1VP621( )
   {
      beforeValidate1VP621( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1VP621( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VP621( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1VP621( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1VP621( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01VP10 */
                  pr_default.execute(8, new Object[] {A4041CCTArc, A4036CCTDsc, A4037CCTTpoCtr, A4406CCTFinFas, A4407CCTIniFas, A4039CCTObl, A4040CCTSto, A4042CCTObs, Short.valueOf(A11475CCTNotUlt), A396EmprCod, Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1VP621( ) ;
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
         endLevel1VP621( ) ;
      }
      closeExtendedTableCursors1VP621( ) ;
   }

   public void deferredUpdate1VP621( )
   {
   }

   public void delete( )
   {
      beforeValidate1VP621( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1VP621( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1VP621( ) ;
         afterConfirm1VP621( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1VP621( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01VP11 */
               pr_default.execute(9, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
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
      sMode621 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1VP621( ) ;
      Gx_mode = sMode621 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1VP621( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( true )
         {
            chkCCTObs.setVisible( ((AV21CCTOBS==1) ? 1 : 0) );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
         }
         else
         {
            if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 )
            {
               chkCCTObs.setVisible( 0 );
               httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
            }
            else
            {
               if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) != 0 )
               {
                  chkCCTObs.setVisible( 1 );
                  httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Visible", GXutil.ltrimstr( chkCCTObs.getVisible(), 5, 0), true);
               }
            }
         }
         if ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( httpContext.getMessage( "D", ""), "")) == 0 )
         {
            chkCCTObs.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
         }
         else
         {
            chkCCTObs.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
         }
         if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
         {
            AV17CCTArc = A4041CCTArc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CCTArc", AV17CCTArc);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01VP12 */
         pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T01VP13 */
         pr_default.execute(11, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Controles", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T01VP14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Notificaciones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01VP15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSer1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01VP16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01VP17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCDef1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01VP18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void endLevel1VP621( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1VP621( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccdef");
         if ( AnyError == 0 )
         {
            confirmValues1VP0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad_ccdef");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1VP621( )
   {
      /* Scan By routine */
      /* Using cursor T01VP19 */
      pr_default.execute(17);
      RcdFound621 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A396EmprCod = T01VP19_A396EmprCod[0] ;
         A4031CCTCod = T01VP19_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1VP621( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound621 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A396EmprCod = T01VP19_A396EmprCod[0] ;
         A4031CCTCod = T01VP19_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void scanEnd1VP621( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1VP621( )
   {
      /* After Confirm Rules */
      if ( (0==A4031CCTCod) && (0==AV12autonumber) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido¡", ""), 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1VP621( )
   {
      /* Before Insert Rules */
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A4031CCTCod) && ( AV12autonumber == 1 ) )
      {
         GXt_int12 = A4031CCTCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.controlcalidadhtd.controlcalidad_ccdef_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int13) ;
         controlcalidad_ccdef_impl.this.GXt_int12 = GXv_int13[0] ;
         A4031CCTCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void beforeUpdate1VP621( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1VP621( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1VP621( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1VP621( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1VP621( )
   {
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      cmbCCTTpoCtr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      chkCCTIniFas.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTIniFas.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTIniFas.getEnabled(), 5, 0), true);
      chkCCTFinFas.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTFinFas.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTFinFas.getEnabled(), 5, 0), true);
      chkCCTSto.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTSto.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTSto.getEnabled(), 5, 0), true);
      chkCCTObs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1VP621( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1VP0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad_ccdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CCTCod,6,0))}, new String[] {"Gx_mode","EmprCod","CCTCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad_CCDEF");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("CCTObl", GXutil.rtrim( localUtil.format( A4039CCTObl, "@!")));
      forbiddenHiddens.add("CCTNotUlt", localUtil.format( DecimalUtil.doubleToDec(A11475CCTNotUlt), "ZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad_ccdef:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4041CCTArc", GXutil.rtrim( Z4041CCTArc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4036CCTDsc", GXutil.rtrim( Z4036CCTDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4037CCTTpoCtr", GXutil.rtrim( Z4037CCTTpoCtr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4406CCTFinFas", GXutil.rtrim( Z4406CCTFinFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4407CCTIniFas", GXutil.rtrim( Z4407CCTIniFas));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4039CCTObl", GXutil.rtrim( Z4039CCTObl));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4040CCTSto", GXutil.rtrim( Z4040CCTSto));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4042CCTObs", GXutil.rtrim( Z4042CCTObs));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11475CCTNotUlt", GXutil.ltrim( localUtil.ntoc( Z11475CCTNotUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N4042CCTObs", GXutil.rtrim( A4042CCTObs));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV25DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTFILES_DATA", AV32ListFiles_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTFILES_DATA", AV32ListFiles_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV8CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV8CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUTONUMBER", GXutil.ltrim( localUtil.ntoc( AV12autonumber, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTSTO", GXutil.ltrim( localUtil.ntoc( AV22CCTSTO, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTOBS", GXutil.ltrim( localUtil.ntoc( AV21CCTOBS, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTARC", GXutil.rtrim( AV17CCTArc));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTOBL", GXutil.rtrim( A4039CCTObl));
      app.GxWebStd.gx_hidden_field( httpContext, "CCTNOTULT", GXutil.ltrim( localUtil.ntoc( A11475CCTNotUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTFILES_Objectcall", GXutil.rtrim( Combo_listfiles_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTFILES_Cls", GXutil.rtrim( Combo_listfiles_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTFILES_Selectedvalue_set", GXutil.rtrim( Combo_listfiles_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTFILES_Enabled", GXutil.booltostr( Combo_listfiles_Enabled));
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
      return formatLink("app.controlcalidadhtd.controlcalidad_ccdef", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV8CCTCod,6,0))}, new String[] {"Gx_mode","EmprCod","CCTCod"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad_CCDEF" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Definición de Cont. de Calidad", "") ;
   }

   public void initializeNonKey1VP621( )
   {
      AV17CCTArc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCTArc", AV17CCTArc);
      A4041CCTArc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A4037CCTTpoCtr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      A4406CCTFinFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      A4407CCTIniFas = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
      A4039CCTObl = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
      A4040CCTSto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
      A4042CCTObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
      A11475CCTNotUlt = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
      Z4041CCTArc = "" ;
      Z4036CCTDsc = "" ;
      Z4037CCTTpoCtr = "" ;
      Z4406CCTFinFas = "" ;
      Z4407CCTIniFas = "" ;
      Z4039CCTObl = "" ;
      Z4040CCTSto = "" ;
      Z4042CCTObs = "" ;
      Z11475CCTNotUlt = (short)(0) ;
   }

   public void initAll1VP621( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      initializeNonKey1VP621( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116105656", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad_ccdef.js", "?202682116105656", false, true);
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
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbCCTTpoCtr.setInternalname( "CCTTPOCTR" );
      chkCCTIniFas.setInternalname( "CCTINIFAS" );
      chkCCTFinFas.setInternalname( "CCTFINFAS" );
      chkCCTSto.setInternalname( "CCTSTO" );
      divCctsto_cell_Internalname = "CCTSTO_CELL" ;
      chkCCTObs.setInternalname( "CCTOBS" );
      divCctobs_cell_Internalname = "CCTOBS_CELL" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtCCTArc_Internalname = "CCTARC" ;
      lblTextblockcombo_listfiles_Internalname = "TEXTBLOCKCOMBO_LISTFILES" ;
      Combo_listfiles_Internalname = "COMBO_LISTFILES" ;
      divTablesplittedlistfiles_Internalname = "TABLESPLITTEDLISTFILES" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTablaupload_Internalname = "TABLAUPLOAD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavListfiles_Internalname = "vLISTFILES" ;
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
      Form.setCaption( httpContext.getMessage( "Definición de Cont. de Calidad", "") );
      edtavListfiles_Enabled = 0 ;
      edtavListfiles_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      Combo_listfiles_Cls = "ExtendedCombo AttributeFL" ;
      Combo_listfiles_Caption = "" ;
      Combo_listfiles_Enabled = GXutil.toBoolean( -1) ;
      edtCCTArc_Jsonclick = "" ;
      edtCCTArc_Enabled = 0 ;
      chkCCTObs.setEnabled( 1 );
      chkCCTObs.setVisible( 1 );
      divCctobs_cell_Class = "col-xs-12 col-sm-2" ;
      chkCCTSto.setEnabled( 1 );
      chkCCTSto.setVisible( 1 );
      divCctsto_cell_Class = "col-xs-12 col-sm-2" ;
      chkCCTFinFas.setEnabled( 1 );
      chkCCTIniFas.setEnabled( 1 );
      cmbCCTTpoCtr.setJsonclick( "" );
      cmbCCTTpoCtr.setEnabled( 1 );
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Enabled = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Enabled = 1 ;
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

   public void gx5asacctcod1VP621( int AV8CCTCod )
   {
      if ( ! (0==AV8CCTCod) )
      {
         A4031CCTCod = AV8CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asacctcod1VP621( int A4031CCTCod ,
                                   short AV12autonumber ,
                                   String A396EmprCod )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && (0==A4031CCTCod) && ( AV12autonumber == 1 ) )
      {
         GXt_int12 = A4031CCTCod ;
         GXv_int13[0] = GXt_int12 ;
         new app.controlcalidadhtd.controlcalidad_ccdef_prxid(remoteHandle, context).execute( A396EmprCod, GXv_int13) ;
         controlcalidad_ccdef_impl.this.GXt_int12 = GXv_int13[0] ;
         A4031CCTCod = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), ".", "")))+"\"") ;
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
      cmbCCTTpoCtr.setName( "CCTTPOCTR" );
      cmbCCTTpoCtr.setWebtags( "" );
      cmbCCTTpoCtr.addItem("E", httpContext.getMessage( "ISO (Externo)", ""), (short)(0));
      cmbCCTTpoCtr.addItem("I", httpContext.getMessage( "Interno", ""), (short)(0));
      cmbCCTTpoCtr.addItem("D", httpContext.getMessage( "Defectos", ""), (short)(0));
      if ( cmbCCTTpoCtr.getItemCount() > 0 )
      {
         A4037CCTTpoCtr = cmbCCTTpoCtr.getValidValue(A4037CCTTpoCtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
      }
      chkCCTIniFas.setName( "CCTINIFAS" );
      chkCCTIniFas.setWebtags( "" );
      chkCCTIniFas.setCaption( httpContext.getMessage( "Inicio de Fase", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTIniFas.getInternalname(), "TitleCaption", chkCCTIniFas.getCaption(), true);
      chkCCTIniFas.setCheckedValue( "N" );
      A4407CCTIniFas = ((GXutil.strcmp(GXutil.rtrim( A4407CCTIniFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
      chkCCTFinFas.setName( "CCTFINFAS" );
      chkCCTFinFas.setWebtags( "" );
      chkCCTFinFas.setCaption( httpContext.getMessage( "Final de Fase", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTFinFas.getInternalname(), "TitleCaption", chkCCTFinFas.getCaption(), true);
      chkCCTFinFas.setCheckedValue( "N" );
      A4406CCTFinFas = ((GXutil.strcmp(GXutil.rtrim( A4406CCTFinFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      chkCCTSto.setName( "CCTSTO" );
      chkCCTSto.setWebtags( "" );
      chkCCTSto.setCaption( httpContext.getMessage( "Paro de Producción", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTSto.getInternalname(), "TitleCaption", chkCCTSto.getCaption(), true);
      chkCCTSto.setCheckedValue( "N" );
      A4040CCTSto = ((GXutil.strcmp(GXutil.rtrim( A4040CCTSto), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
      chkCCTObs.setName( "CCTOBS" );
      chkCCTObs.setWebtags( "" );
      chkCCTObs.setCaption( httpContext.getMessage( "Observaciones", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "TitleCaption", chkCCTObs.getCaption(), true);
      chkCCTObs.setCheckedValue( "N" );
      A4042CCTObs = ((GXutil.strcmp(GXutil.rtrim( A4042CCTObs), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
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

   public void valid_Cctarc( )
   {
      A4037CCTTpoCtr = cmbCCTTpoCtr.getValue() ;
      if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
      {
         AV17CCTArc = A4041CCTArc ;
      }
      if ( ! (GXutil.strcmp("", AV17CCTArc)==0) )
      {
         A4041CCTArc = AV17CCTArc ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            A4041CCTArc = "" ;
         }
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV17CCTArc", GXutil.rtrim( AV17CCTArc));
      httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", GXutil.rtrim( A4041CCTArc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4039CCTObl',fld:'CCTOBL',pic:'@!'},{av:'A11475CCTNotUlt',fld:'CCTNOTULT',pic:'ZZZ9'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e131VP2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("COMBO_LISTFILES.ONOPTIONCLICKED","{handler:'e121VP2',iparms:[{av:'Combo_listfiles_Selectedvalue_get',ctrl:'COMBO_LISTFILES',prop:'SelectedValue_get'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("COMBO_LISTFILES.ONOPTIONCLICKED",",oparms:[{av:'AV31ListFiles',fld:'vLISTFILES',pic:''},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e141VP2',iparms:[{av:'AV17CCTArc',fld:'vCCTARC',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTDSC","{handler:'valid_Cctdsc',iparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTDSC",",oparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTTPOCTR","{handler:'valid_Ccttpoctr',iparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTTPOCTR",",oparms:[{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTARC","{handler:'valid_Cctarc',iparms:[{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'AV17CCTArc',fld:'vCCTARC',pic:'@!'},{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTARC",",oparms:[{av:'AV17CCTArc',fld:'vCCTARC',pic:'@!'},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
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
      wcpOAV7EmprCod = "" ;
      Z396EmprCod = "" ;
      Z4041CCTArc = "" ;
      Z4036CCTDsc = "" ;
      Z4037CCTTpoCtr = "" ;
      Z4406CCTFinFas = "" ;
      Z4407CCTIniFas = "" ;
      Z4039CCTObl = "" ;
      Z4040CCTSto = "" ;
      Z4042CCTObs = "" ;
      N4042CCTObs = "" ;
      Combo_listfiles_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A4037CCTTpoCtr = "" ;
      A4407CCTIniFas = "" ;
      A4406CCTFinFas = "" ;
      A4040CCTSto = "" ;
      A4042CCTObs = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4036CCTDsc = "" ;
      A4041CCTArc = "" ;
      lblTextblockcombo_listfiles_Jsonclick = "" ;
      ucCombo_listfiles = new com.genexus.webpanels.GXUserControl();
      AV25DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV32ListFiles_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV34Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV31ListFiles = "" ;
      A4039CCTObl = "" ;
      AV17CCTArc = "" ;
      A407EmprNom = "" ;
      Combo_listfiles_Objectcall = "" ;
      Combo_listfiles_Class = "" ;
      Combo_listfiles_Icontype = "" ;
      Combo_listfiles_Icon = "" ;
      Combo_listfiles_Tooltip = "" ;
      Combo_listfiles_Selectedvalue_set = "" ;
      Combo_listfiles_Selectedtext_set = "" ;
      Combo_listfiles_Selectedtext_get = "" ;
      Combo_listfiles_Gamoauthtoken = "" ;
      Combo_listfiles_Ddointernalname = "" ;
      Combo_listfiles_Titlecontrolalign = "" ;
      Combo_listfiles_Dropdownoptionstype = "" ;
      Combo_listfiles_Titlecontrolidtoreplace = "" ;
      Combo_listfiles_Datalisttype = "" ;
      Combo_listfiles_Datalistfixedvalues = "" ;
      Combo_listfiles_Datalistproc = "" ;
      Combo_listfiles_Datalistprocparametersprefix = "" ;
      Combo_listfiles_Remoteservicesparameters = "" ;
      Combo_listfiles_Htmltemplate = "" ;
      Combo_listfiles_Multiplevaluestype = "" ;
      Combo_listfiles_Loadingdata = "" ;
      Combo_listfiles_Noresultsfound = "" ;
      Combo_listfiles_Emptyitemtext = "" ;
      Combo_listfiles_Onlyselectedvalues = "" ;
      Combo_listfiles_Selectalltext = "" ;
      Combo_listfiles_Multiplevaluesseparator = "" ;
      Combo_listfiles_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode621 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV13Station = "" ;
      AV14EmprNom = "" ;
      AV15UsurCod = "" ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      GXv_int9 = new byte[1] ;
      AV27Folder = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV26Dir = new com.genexus.util.GXDirectory();
      AV35GXV1 = new com.genexus.util.GXFileCollection();
      AV16File = new com.genexus.util.GXFile();
      AV28FullPath = "" ;
      AV33ListFiles_Item = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV23ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T01VP4_A407EmprNom = new String[] {""} ;
      T01VP4_n407EmprNom = new boolean[] {false} ;
      T01VP5_A4031CCTCod = new int[1] ;
      T01VP5_A4041CCTArc = new String[] {""} ;
      T01VP5_A407EmprNom = new String[] {""} ;
      T01VP5_n407EmprNom = new boolean[] {false} ;
      T01VP5_A4036CCTDsc = new String[] {""} ;
      T01VP5_A4037CCTTpoCtr = new String[] {""} ;
      T01VP5_A4406CCTFinFas = new String[] {""} ;
      T01VP5_A4407CCTIniFas = new String[] {""} ;
      T01VP5_A4039CCTObl = new String[] {""} ;
      T01VP5_A4040CCTSto = new String[] {""} ;
      T01VP5_A4042CCTObs = new String[] {""} ;
      T01VP5_A11475CCTNotUlt = new short[1] ;
      T01VP5_A396EmprCod = new String[] {""} ;
      T01VP6_A396EmprCod = new String[] {""} ;
      T01VP6_A4031CCTCod = new int[1] ;
      T01VP3_A4031CCTCod = new int[1] ;
      T01VP3_A4041CCTArc = new String[] {""} ;
      T01VP3_A4036CCTDsc = new String[] {""} ;
      T01VP3_A4037CCTTpoCtr = new String[] {""} ;
      T01VP3_A4406CCTFinFas = new String[] {""} ;
      T01VP3_A4407CCTIniFas = new String[] {""} ;
      T01VP3_A4039CCTObl = new String[] {""} ;
      T01VP3_A4040CCTSto = new String[] {""} ;
      T01VP3_A4042CCTObs = new String[] {""} ;
      T01VP3_A11475CCTNotUlt = new short[1] ;
      T01VP3_A396EmprCod = new String[] {""} ;
      T01VP7_A396EmprCod = new String[] {""} ;
      T01VP7_A4031CCTCod = new int[1] ;
      T01VP8_A396EmprCod = new String[] {""} ;
      T01VP8_A4031CCTCod = new int[1] ;
      T01VP2_A4031CCTCod = new int[1] ;
      T01VP2_A4041CCTArc = new String[] {""} ;
      T01VP2_A4036CCTDsc = new String[] {""} ;
      T01VP2_A4037CCTTpoCtr = new String[] {""} ;
      T01VP2_A4406CCTFinFas = new String[] {""} ;
      T01VP2_A4407CCTIniFas = new String[] {""} ;
      T01VP2_A4039CCTObl = new String[] {""} ;
      T01VP2_A4040CCTSto = new String[] {""} ;
      T01VP2_A4042CCTObs = new String[] {""} ;
      T01VP2_A11475CCTNotUlt = new short[1] ;
      T01VP2_A396EmprCod = new String[] {""} ;
      T01VP12_A396EmprCod = new String[] {""} ;
      T01VP12_A583IntCod = new byte[1] ;
      T01VP12_A4031CCTCod = new int[1] ;
      T01VP13_A396EmprCod = new String[] {""} ;
      T01VP13_A252CliCod = new int[1] ;
      T01VP13_A9713Tb1_Cod = new short[1] ;
      T01VP13_A11736CCArtCod = new String[] {""} ;
      T01VP13_A11748TipArtiId = new short[1] ;
      T01VP13_A11737CCColNom = new String[] {""} ;
      T01VP13_A11738CCColNum = new int[1] ;
      T01VP13_A11749CCCTc = new byte[1] ;
      T01VP13_A11750IntId = new short[1] ;
      T01VP13_A4031CCTCod = new int[1] ;
      T01VP14_A396EmprCod = new String[] {""} ;
      T01VP14_A4031CCTCod = new int[1] ;
      T01VP14_A11481CCTNotId = new short[1] ;
      T01VP15_A396EmprCod = new String[] {""} ;
      T01VP15_A252CliCod = new int[1] ;
      T01VP15_A65ArtCod = new String[] {""} ;
      T01VP15_A4058CCFColNom = new String[] {""} ;
      T01VP15_A4059CCFColNum = new int[1] ;
      T01VP15_A4031CCTCod = new int[1] ;
      T01VP16_A396EmprCod = new String[] {""} ;
      T01VP16_A457FasCod = new String[] {""} ;
      T01VP16_A4031CCTCod = new int[1] ;
      T01VP17_A396EmprCod = new String[] {""} ;
      T01VP17_A4031CCTCod = new int[1] ;
      T01VP17_A4034CCTLin = new short[1] ;
      T01VP18_A396EmprCod = new String[] {""} ;
      T01VP18_A129BarCod = new int[1] ;
      T01VP18_A132BarCodReo = new byte[1] ;
      T01VP18_A130BarCodPar = new String[] {""} ;
      T01VP18_A758ProCod = new String[] {""} ;
      T01VP18_A194BarOrdLin = new short[1] ;
      T01VP18_A4031CCTCod = new int[1] ;
      T01VP19_A396EmprCod = new String[] {""} ;
      T01VP19_A4031CCTCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXv_int13 = new int[1] ;
      ZV17CCTArc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad_ccdef__default(),
         new Object[] {
             new Object[] {
            T01VP2_A4031CCTCod, T01VP2_A4041CCTArc, T01VP2_A4036CCTDsc, T01VP2_A4037CCTTpoCtr, T01VP2_A4406CCTFinFas, T01VP2_A4407CCTIniFas, T01VP2_A4039CCTObl, T01VP2_A4040CCTSto, T01VP2_A4042CCTObs, T01VP2_A11475CCTNotUlt,
            T01VP2_A396EmprCod
            }
            , new Object[] {
            T01VP3_A4031CCTCod, T01VP3_A4041CCTArc, T01VP3_A4036CCTDsc, T01VP3_A4037CCTTpoCtr, T01VP3_A4406CCTFinFas, T01VP3_A4407CCTIniFas, T01VP3_A4039CCTObl, T01VP3_A4040CCTSto, T01VP3_A4042CCTObs, T01VP3_A11475CCTNotUlt,
            T01VP3_A396EmprCod
            }
            , new Object[] {
            T01VP4_A407EmprNom, T01VP4_n407EmprNom
            }
            , new Object[] {
            T01VP5_A4031CCTCod, T01VP5_A4041CCTArc, T01VP5_A407EmprNom, T01VP5_n407EmprNom, T01VP5_A4036CCTDsc, T01VP5_A4037CCTTpoCtr, T01VP5_A4406CCTFinFas, T01VP5_A4407CCTIniFas, T01VP5_A4039CCTObl, T01VP5_A4040CCTSto,
            T01VP5_A4042CCTObs, T01VP5_A11475CCTNotUlt, T01VP5_A396EmprCod
            }
            , new Object[] {
            T01VP6_A396EmprCod, T01VP6_A4031CCTCod
            }
            , new Object[] {
            T01VP7_A396EmprCod, T01VP7_A4031CCTCod
            }
            , new Object[] {
            T01VP8_A396EmprCod, T01VP8_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01VP12_A396EmprCod, T01VP12_A583IntCod, T01VP12_A4031CCTCod
            }
            , new Object[] {
            T01VP13_A396EmprCod, T01VP13_A252CliCod, T01VP13_A9713Tb1_Cod, T01VP13_A11736CCArtCod, T01VP13_A11748TipArtiId, T01VP13_A11737CCColNom, T01VP13_A11738CCColNum, T01VP13_A11749CCCTc, T01VP13_A11750IntId, T01VP13_A4031CCTCod
            }
            , new Object[] {
            T01VP14_A396EmprCod, T01VP14_A4031CCTCod, T01VP14_A11481CCTNotId
            }
            , new Object[] {
            T01VP15_A396EmprCod, T01VP15_A252CliCod, T01VP15_A65ArtCod, T01VP15_A4058CCFColNom, T01VP15_A4059CCFColNum, T01VP15_A4031CCTCod
            }
            , new Object[] {
            T01VP16_A396EmprCod, T01VP16_A457FasCod, T01VP16_A4031CCTCod
            }
            , new Object[] {
            T01VP17_A396EmprCod, T01VP17_A4031CCTCod, T01VP17_A4034CCTLin
            }
            , new Object[] {
            T01VP18_A396EmprCod, T01VP18_A129BarCod, T01VP18_A132BarCodReo, T01VP18_A130BarCodPar, T01VP18_A758ProCod, T01VP18_A194BarOrdLin, T01VP18_A4031CCTCod
            }
            , new Object[] {
            T01VP19_A396EmprCod, T01VP19_A4031CCTCod
            }
         }
      );
      AV34Pgmname = "ControlCalidadHTD.ControlCalidad_CCDEF" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte GXt_int8 ;
   private byte GXv_int9[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z11475CCTNotUlt ;
   private short AV12autonumber ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11475CCTNotUlt ;
   private short AV22CCTSTO ;
   private short AV21CCTOBS ;
   private short RcdFound621 ;
   private short AV30lengt ;
   private short AV29i ;
   private short nIsDirty_621 ;
   private int wcpOAV8CCTCod ;
   private int Z4031CCTCod ;
   private int AV8CCTCod ;
   private int A4031CCTCod ;
   private int trnEnded ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtCCTArc_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavListfiles_Visible ;
   private int edtavListfiles_Enabled ;
   private int Combo_listfiles_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV36GXV2 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXt_int12 ;
   private int GXv_int13[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String Z396EmprCod ;
   private String Z4041CCTArc ;
   private String Z4036CCTDsc ;
   private String Z4037CCTTpoCtr ;
   private String Z4406CCTFinFas ;
   private String Z4407CCTIniFas ;
   private String Z4039CCTObl ;
   private String Z4040CCTSto ;
   private String Z4042CCTObs ;
   private String N4042CCTObs ;
   private String Combo_listfiles_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCTCod_Internalname ;
   private String A4037CCTTpoCtr ;
   private String A4407CCTIniFas ;
   private String A4406CCTFinFas ;
   private String A4040CCTSto ;
   private String A4042CCTObs ;
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
   private String edtCCTCod_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divCctsto_cell_Internalname ;
   private String divCctsto_cell_Class ;
   private String divCctobs_cell_Internalname ;
   private String divCctobs_cell_Class ;
   private String divUnnamedtable3_Internalname ;
   private String divTablaupload_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtCCTArc_Internalname ;
   private String A4041CCTArc ;
   private String edtCCTArc_Jsonclick ;
   private String divTablesplittedlistfiles_Internalname ;
   private String lblTextblockcombo_listfiles_Internalname ;
   private String lblTextblockcombo_listfiles_Jsonclick ;
   private String Combo_listfiles_Caption ;
   private String Combo_listfiles_Cls ;
   private String Combo_listfiles_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV34Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavListfiles_Internalname ;
   private String A4039CCTObl ;
   private String AV17CCTArc ;
   private String A407EmprNom ;
   private String Combo_listfiles_Objectcall ;
   private String Combo_listfiles_Class ;
   private String Combo_listfiles_Icontype ;
   private String Combo_listfiles_Icon ;
   private String Combo_listfiles_Tooltip ;
   private String Combo_listfiles_Selectedvalue_set ;
   private String Combo_listfiles_Selectedtext_set ;
   private String Combo_listfiles_Selectedtext_get ;
   private String Combo_listfiles_Gamoauthtoken ;
   private String Combo_listfiles_Ddointernalname ;
   private String Combo_listfiles_Titlecontrolalign ;
   private String Combo_listfiles_Dropdownoptionstype ;
   private String Combo_listfiles_Titlecontrolidtoreplace ;
   private String Combo_listfiles_Datalisttype ;
   private String Combo_listfiles_Datalistfixedvalues ;
   private String Combo_listfiles_Datalistproc ;
   private String Combo_listfiles_Datalistprocparametersprefix ;
   private String Combo_listfiles_Remoteservicesparameters ;
   private String Combo_listfiles_Htmltemplate ;
   private String Combo_listfiles_Multiplevaluestype ;
   private String Combo_listfiles_Loadingdata ;
   private String Combo_listfiles_Noresultsfound ;
   private String Combo_listfiles_Emptyitemtext ;
   private String Combo_listfiles_Onlyselectedvalues ;
   private String Combo_listfiles_Selectalltext ;
   private String Combo_listfiles_Multiplevaluesseparator ;
   private String Combo_listfiles_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode621 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV13Station ;
   private String AV14EmprNom ;
   private String AV15UsurCod ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV17CCTArc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean Combo_listfiles_Enabled ;
   private boolean Combo_listfiles_Visible ;
   private boolean Combo_listfiles_Allowmultipleselection ;
   private boolean Combo_listfiles_Isgriditem ;
   private boolean Combo_listfiles_Hasdescription ;
   private boolean Combo_listfiles_Includeonlyselectedoption ;
   private boolean Combo_listfiles_Includeselectalloption ;
   private boolean Combo_listfiles_Emptyitem ;
   private boolean Combo_listfiles_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV31ListFiles ;
   private String AV27Folder ;
   private String AV28FullPath ;
   private String AV23ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_listfiles ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXDirectory AV26Dir ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCCTTpoCtr ;
   private ICheckbox chkCCTIniFas ;
   private ICheckbox chkCCTFinFas ;
   private ICheckbox chkCCTSto ;
   private ICheckbox chkCCTObs ;
   private IDataStoreProvider pr_default ;
   private String[] T01VP4_A407EmprNom ;
   private boolean[] T01VP4_n407EmprNom ;
   private int[] T01VP5_A4031CCTCod ;
   private String[] T01VP5_A4041CCTArc ;
   private String[] T01VP5_A407EmprNom ;
   private boolean[] T01VP5_n407EmprNom ;
   private String[] T01VP5_A4036CCTDsc ;
   private String[] T01VP5_A4037CCTTpoCtr ;
   private String[] T01VP5_A4406CCTFinFas ;
   private String[] T01VP5_A4407CCTIniFas ;
   private String[] T01VP5_A4039CCTObl ;
   private String[] T01VP5_A4040CCTSto ;
   private String[] T01VP5_A4042CCTObs ;
   private short[] T01VP5_A11475CCTNotUlt ;
   private String[] T01VP5_A396EmprCod ;
   private String[] T01VP6_A396EmprCod ;
   private int[] T01VP6_A4031CCTCod ;
   private int[] T01VP3_A4031CCTCod ;
   private String[] T01VP3_A4041CCTArc ;
   private String[] T01VP3_A4036CCTDsc ;
   private String[] T01VP3_A4037CCTTpoCtr ;
   private String[] T01VP3_A4406CCTFinFas ;
   private String[] T01VP3_A4407CCTIniFas ;
   private String[] T01VP3_A4039CCTObl ;
   private String[] T01VP3_A4040CCTSto ;
   private String[] T01VP3_A4042CCTObs ;
   private short[] T01VP3_A11475CCTNotUlt ;
   private String[] T01VP3_A396EmprCod ;
   private String[] T01VP7_A396EmprCod ;
   private int[] T01VP7_A4031CCTCod ;
   private String[] T01VP8_A396EmprCod ;
   private int[] T01VP8_A4031CCTCod ;
   private int[] T01VP2_A4031CCTCod ;
   private String[] T01VP2_A4041CCTArc ;
   private String[] T01VP2_A4036CCTDsc ;
   private String[] T01VP2_A4037CCTTpoCtr ;
   private String[] T01VP2_A4406CCTFinFas ;
   private String[] T01VP2_A4407CCTIniFas ;
   private String[] T01VP2_A4039CCTObl ;
   private String[] T01VP2_A4040CCTSto ;
   private String[] T01VP2_A4042CCTObs ;
   private short[] T01VP2_A11475CCTNotUlt ;
   private String[] T01VP2_A396EmprCod ;
   private String[] T01VP12_A396EmprCod ;
   private byte[] T01VP12_A583IntCod ;
   private int[] T01VP12_A4031CCTCod ;
   private String[] T01VP13_A396EmprCod ;
   private int[] T01VP13_A252CliCod ;
   private short[] T01VP13_A9713Tb1_Cod ;
   private String[] T01VP13_A11736CCArtCod ;
   private short[] T01VP13_A11748TipArtiId ;
   private String[] T01VP13_A11737CCColNom ;
   private int[] T01VP13_A11738CCColNum ;
   private byte[] T01VP13_A11749CCCTc ;
   private short[] T01VP13_A11750IntId ;
   private int[] T01VP13_A4031CCTCod ;
   private String[] T01VP14_A396EmprCod ;
   private int[] T01VP14_A4031CCTCod ;
   private short[] T01VP14_A11481CCTNotId ;
   private String[] T01VP15_A396EmprCod ;
   private int[] T01VP15_A252CliCod ;
   private String[] T01VP15_A65ArtCod ;
   private String[] T01VP15_A4058CCFColNom ;
   private int[] T01VP15_A4059CCFColNum ;
   private int[] T01VP15_A4031CCTCod ;
   private String[] T01VP16_A396EmprCod ;
   private String[] T01VP16_A457FasCod ;
   private int[] T01VP16_A4031CCTCod ;
   private String[] T01VP17_A396EmprCod ;
   private int[] T01VP17_A4031CCTCod ;
   private short[] T01VP17_A4034CCTLin ;
   private String[] T01VP18_A396EmprCod ;
   private int[] T01VP18_A129BarCod ;
   private byte[] T01VP18_A132BarCodReo ;
   private String[] T01VP18_A130BarCodPar ;
   private String[] T01VP18_A758ProCod ;
   private short[] T01VP18_A194BarOrdLin ;
   private int[] T01VP18_A4031CCTCod ;
   private String[] T01VP19_A396EmprCod ;
   private int[] T01VP19_A4031CCTCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.util.GXFile AV16File ;
   private com.genexus.util.GXFileCollection AV35GXV1 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV32ListFiles_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV25DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV33ListFiles_Item ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class controlcalidad_ccdef__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccdef__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccdef__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccdef__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad_ccdef__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01VP2", "SELECT CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ?  FOR UPDATE OF CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VP3", "SELECT CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VP4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VP5", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCTCod, TM1.CCTArc, T2.EmprNom, TM1.CCTDsc, TM1.CCTTpoCtr, TM1.CCTFinFas, TM1.CCTIniFas, TM1.CCTObl, TM1.CCTSto, TM1.CCTObs, TM1.CCTNotUlt, TM1.EmprCod FROM (TXPCCDef TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VP6", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01VP7", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE ( EmprCod > ? or EmprCod = ? and CCTCod > ?) ORDER BY EmprCod, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE ( EmprCod < ? or EmprCod = ? and CCTCod < ?) ORDER BY EmprCod DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01VP9", "INSERT INTO TXPCCDef(CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDef")
         ,new UpdateCursor("T01VP10", "UPDATE TXPCCDef SET CCTArc=?, CCTDsc=?, CCTTpoCtr=?, CCTFinFas=?, CCTIniFas=?, CCTObl=?, CCTSto=?, CCTObs=?, CCTNotUlt=?  WHERE EmprCod = ? AND CCTCod = ?", GX_NOMASK, "TXPCCDef")
         ,new UpdateCursor("T01VP11", "DELETE FROM TXPCCDef  WHERE EmprCod = ? AND CCTCod = ?", GX_NOMASK, "TXPCCDef")
         ,new ForEachCursor("T01VP12", "SELECT * FROM (SELECT EmprCod, IntCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP13", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP14", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTNotId FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP15", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod FROM TXPCCSer1 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP16", "SELECT * FROM (SELECT EmprCod, FasCod, CCTCod FROM TXPCCFas WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP17", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP18", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01VP19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCTCod FROM TXPCCDef ORDER BY EmprCod, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((short[]) buf[9])[0] = rslt.getShort(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 128);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((short[]) buf[11])[0] = rslt.getShort(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 16);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((short[]) buf[8])[0] = rslt.getShort(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 128);
               stmt.setString(3, (String)parms[2], 30);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setString(11, (String)parms[10], 3);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 128);
               stmt.setString(2, (String)parms[1], 30);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setString(7, (String)parms[6], 1);
               stmt.setString(8, (String)parms[7], 1);
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

