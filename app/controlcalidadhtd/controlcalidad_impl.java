package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidad_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_20") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod) ;
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
            AV15EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
            AV14CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CCTCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CCTCod), "ZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control Calidad", ""), (short)(0)) ;
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

   public controlcalidad_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidad_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidad_impl.class ));
   }

   public controlcalidad_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTTpoCtr = new HTMLChoice();
      chkCCTFinFas = UIFactory.getCheckbox(this);
      chkCCTIniFas = UIFactory.getCheckbox(this);
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
      A4406CCTFinFas = ((GXutil.strcmp(GXutil.rtrim( A4406CCTFinFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      A4407CCTIniFas = ((GXutil.strcmp(GXutil.rtrim( A4407CCTIniFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV34Pgmname), GXutil.rtrim( localUtil.format( AV34Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTCod_Internalname, httpContext.getMessage( "Código", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTDsc_Internalname, httpContext.getMessage( "Descripción del Test", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablefases_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTTpoCtr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTTpoCtr.getInternalname(), httpContext.getMessage( "Tipo de Control", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTTpoCtr, cmbCCTTpoCtr.getInternalname(), GXutil.rtrim( A4037CCTTpoCtr), 1, cmbCCTTpoCtr.getJsonclick(), 7, "'"+""+"'"+",false,"+"'"+"e111sx621_client"+"'", "char", "", 1, cmbCCTTpoCtr.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      cmbCCTTpoCtr.setValue( GXutil.rtrim( A4037CCTTpoCtr) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Values", cmbCCTTpoCtr.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTFinFas.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTFinFas.getInternalname(), httpContext.getMessage( "Final de la Fase?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTFinFas.getInternalname(), A4406CCTFinFas, "", httpContext.getMessage( "Final de la Fase?", ""), 1, chkCCTFinFas.getEnabled(), "S", httpContext.getMessage( "Final de Fase", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(44, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,44);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTIniFas.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTIniFas.getInternalname(), httpContext.getMessage( "Inicio de la Fase?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTIniFas.getInternalname(), A4407CCTIniFas, "", httpContext.getMessage( "Inicio de la Fase?", ""), 1, chkCCTIniFas.getEnabled(), "S", httpContext.getMessage( "Inicio de Fase", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(48, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,48);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTSto.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTSto.getInternalname(), httpContext.getMessage( "Paro de Produccion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTSto.getInternalname(), A4040CCTSto, "", httpContext.getMessage( "Paro de Produccion", ""), 1, chkCCTSto.getEnabled(), "S", httpContext.getMessage( "Paro de Producción", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(52, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,52);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", chkCCTObs.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTObs.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTObs.getInternalname(), httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTObs.getInternalname(), A4042CCTObs, "", httpContext.getMessage( "Observaciones", ""), chkCCTObs.getVisible(), chkCCTObs.getEnabled(), "S", httpContext.getMessage( "Observaciones", ""), StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(56, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,56);\"");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablaupload_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-8", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctarc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtavCctarc_Internalname, httpContext.getMessage( "Archivo de Plantilla", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCctarc_Internalname, GXutil.rtrim( AV13CCTArc), GXutil.rtrim( localUtil.format( AV13CCTArc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctarc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctarc_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucUpload.setProperty("AutoUpload", Upload_Autoupload);
      ucUpload.setProperty("HideAdditionalButtons", Upload_Hideadditionalbuttons);
      ucUpload.setProperty("TooltipText", Upload_Tooltiptext);
      ucUpload.setProperty("MaxNumberOfFiles", Upload_Maxnumberoffiles);
      ucUpload.setProperty("AutoDisableAddingFiles", Upload_Autodisableaddingfiles);
      ucUpload.setProperty("UploadedFiles", AV25UploadedFiles);
      ucUpload.setProperty("FailedFiles", AV17FailedFiles);
      ucUpload.render(context, "fileupload", Upload_Internalname, "UPLOADContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction1_Internalname, "", httpContext.getMessage( "Visualizar", ""), bttBtnuseraction1_Jsonclick, 5, httpContext.getMessage( "Visualizar", ""), "", StyleString, ClassString, bttBtnuseraction1_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "TEste", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "TEST", ""), "", StyleString, ClassString, bttBtnconfirmar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121sx621_client"+"'", TempTags, "", 2, "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblCctarc_txt_Internalname, httpContext.getMessage( "Cctarc_txt", ""), "", "", lblCctarc_txt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_ControlCalidadHTD\\ControlCalidad.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidad.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTObl_Internalname, GXutil.rtrim( A4039CCTObl), GXutil.rtrim( localUtil.format( A4039CCTObl, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,97);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTObl_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTObl_Visible, edtCCTObl_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "Booleano", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTNotUlt_Internalname, GXutil.ltrim( localUtil.ntoc( A11475CCTNotUlt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCCTNotUlt_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11475CCTNotUlt), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A11475CCTNotUlt), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTNotUlt_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTNotUlt_Visible, edtCCTNotUlt_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTArc_Internalname, GXutil.rtrim( A4041CCTArc), GXutil.rtrim( localUtil.format( A4041CCTArc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTArc_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTArc_Visible, edtCCTArc_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidad.htm");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tbody>") ;
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
      /* User Defined Control */
      ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
      ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
      ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
      ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
      ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
      ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
      ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
      ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
      httpContext.writeText( "</div>") ;
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      httpContext.writeText( "</tbody>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
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
      e131SX2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPLOADEDFILES"), AV25UploadedFiles);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFAILEDFILES"), AV17FailedFiles);
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
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N4042CCTObs = httpContext.cgiGet( "N4042CCTObs") ;
            AV32outCCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vOUTCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV8AuxEmprCod = httpContext.cgiGet( "vAUXEMPRCOD") ;
            AV14CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Upload_Objectcall = httpContext.cgiGet( "UPLOAD_Objectcall") ;
            Upload_Enabled = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Enabled")) ;
            Upload_Class = httpContext.cgiGet( "UPLOAD_Class") ;
            Upload_Autoupload = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autoupload")) ;
            Upload_Hideadditionalbuttons = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Hideadditionalbuttons")) ;
            Upload_Tooltiptext = httpContext.cgiGet( "UPLOAD_Tooltiptext") ;
            Upload_Enableuploadedfilecanceling = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Enableuploadedfilecanceling")) ;
            Upload_Disableimageresize = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Disableimageresize")) ;
            Upload_Maxfilesize = (int)(localUtil.ctol( httpContext.cgiGet( "UPLOAD_Maxfilesize"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Upload_Maxnumberoffiles = (int)(localUtil.ctol( httpContext.cgiGet( "UPLOAD_Maxnumberoffiles"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Upload_Autodisableaddingfiles = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autodisableaddingfiles")) ;
            Upload_Acceptedfiletypes = httpContext.cgiGet( "UPLOAD_Acceptedfiletypes") ;
            Upload_Customfiletypes = httpContext.cgiGet( "UPLOAD_Customfiletypes") ;
            Upload_Visible = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Visible")) ;
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
            Dvelop_confirmpanel_btnconfirmar_Objectcall = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Objectcall") ;
            Dvelop_confirmpanel_btnconfirmar_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Enabled")) ;
            Dvelop_confirmpanel_btnconfirmar_Width = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Width") ;
            Dvelop_confirmpanel_btnconfirmar_Height = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Height") ;
            Dvelop_confirmpanel_btnconfirmar_Class = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Class") ;
            Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
            Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
            Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
            Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
            Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
            Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
            Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
            Dvelop_confirmpanel_btnconfirmar_Comment = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Comment") ;
            Dvelop_confirmpanel_btnconfirmar_Bodytype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Bodytype") ;
            Dvelop_confirmpanel_btnconfirmar_Bodycontentinternalname = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Bodycontentinternalname") ;
            Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
            Dvelop_confirmpanel_btnconfirmar_Texttype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Texttype") ;
            Dvelop_confirmpanel_btnconfirmar_Visible = GXutil.strtobool( httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Visible")) ;
            /* Read variables values. */
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
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
            A4406CCTFinFas = ((GXutil.strcmp(httpContext.cgiGet( chkCCTFinFas.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
            A4407CCTIniFas = ((GXutil.strcmp(httpContext.cgiGet( chkCCTIniFas.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
            A4040CCTSto = ((GXutil.strcmp(httpContext.cgiGet( chkCCTSto.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
            A4042CCTObs = ((GXutil.strcmp(httpContext.cgiGet( chkCCTObs.getInternalname()), "S")==0) ? "S" : "N") ;
            httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
            AV13CCTArc = GXutil.upper( httpContext.cgiGet( edtavCctarc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A4039CCTObl = GXutil.upper( httpContext.cgiGet( edtCCTObl_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTNotUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTNotUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTNOTULT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTNotUlt_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11475CCTNotUlt = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
            }
            else
            {
               A11475CCTNotUlt = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTNotUlt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
            }
            A4041CCTArc = GXutil.upper( httpContext.cgiGet( edtCCTArc_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\controlcalidad:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                        confirm_1SX0( ) ;
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
                     if ( GXutil.strcmp(sEvt, "UPLOAD.UPLOADCOMPLETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        e141SX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "START") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: Start */
                        e131SX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e151SX2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: 'DoUserAction1' */
                        e161SX2 ();
                        nKeyPressed = (byte)(3) ;
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
         e151SX2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SX621( ) ;
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
         disableAttributes1SX621( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctarc_Enabled), 5, 0), true);
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

   public void confirm_1SX0( )
   {
      beforeValidate1SX621( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SX621( ) ;
         }
         else
         {
            checkExtendedTable1SX621( ) ;
            closeExtendedTableCursors1SX621( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SX0( )
   {
   }

   public void e131SX2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV29Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidad_impl.this.GXt_char1 = GXv_char2[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char2[0] = AV8AuxEmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidad_impl.this.AV8AuxEmprCod = GXv_char2[0] ;
      controlcalidad_impl.this.AV16EmprNom = GXv_char3[0] ;
      controlcalidad_impl.this.AV26UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8AuxEmprCod", AV8AuxEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXt_char1 = AV20Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char4) ;
      controlcalidad_impl.this.GXt_char1 = GXv_char4[0] ;
      AV20Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Lit0", AV20Lit0);
      GXt_char1 = AV21Lit1 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$NOMBRE1", ""), (byte)(99), GXv_char4) ;
      controlcalidad_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Lit1", AV21Lit1);
      GXt_char1 = AV22LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char4) ;
      controlcalidad_impl.this.GXt_char1 = GXv_char4[0] ;
      AV22LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22LitFe", AV22LitFe);
      AV11CCLPicInf = httpContext.getMessage( "Se debe ingresar un Valor para MASCARA", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11CCLPicInf", AV11CCLPicInf);
      GXt_char1 = AV12CCLPicSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidad_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12CCLPicSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12CCLPicSup", AV12CCLPicSup);
      AV9CCLArrInf = httpContext.getMessage( "Se debe ingresar un Valor para MASCARA", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9CCLArrInf", AV9CCLArrInf);
      GXt_char1 = AV10CCLArrSup ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "CCDPICSUP", ""), (byte)(99), GXv_char4) ;
      controlcalidad_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10CCLArrSup = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10CCLArrSup", AV10CCLArrSup);
      new app.controlcalidadhtd.pccvarnew(remoteHandle, context).execute( ) ;
      GXt_int5 = AV23TestCC ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV8AuxEmprCod, httpContext.getMessage( "TSTCCH", ""), GXv_int6) ;
      controlcalidad_impl.this.GXt_int5 = GXv_int6[0] ;
      AV23TestCC = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23TestCC", GXutil.str( AV23TestCC, 1, 0));
      GXt_char1 = AV29Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      controlcalidad_impl.this.GXt_char1 = GXv_char4[0] ;
      AV29Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Station", AV29Station);
      GXv_char4[0] = AV15EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char2[0] = AV26UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV29Station, GXv_char4, GXv_char3, GXv_char2) ;
      controlcalidad_impl.this.AV15EmprCod = GXv_char4[0] ;
      controlcalidad_impl.this.AV16EmprNom = GXv_char3[0] ;
      controlcalidad_impl.this.AV26UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV26UsurCod", AV26UsurCod);
      GXv_SdtWWPContext7[0] = AV28WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV28WWPContext = GXv_SdtWWPContext7[0] ;
      AV24TrnContext.fromxml(AV27WebSession.getValue("TrnContext"), null, null);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtCCTObl_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTObl_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObl_Visible), 5, 0), true);
      edtCCTNotUlt_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Visible), 5, 0), true);
      edtCCTArc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Visible), 5, 0), true);
   }

   public void e151SX2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         AV32outCCTCod = A4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32outCCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32outCCTCod), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32outCCTCod), "ZZZZZ9")));
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer", "Confirm", "", new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV24TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.controlcalidadhtd.controlcalidadww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      if ( ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e161SX2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      AV33File.setSource( AV13CCTArc );
      httpContext.GX_msglist.addItem(AV33File.getPath());
      /*  Sending Event outputs  */
   }

   public void e141SX2( )
   {
      /* Upload_Uploadcomplete Routine */
      returnInSub = false ;
      AV35GXV1 = 1 ;
      while ( AV35GXV1 <= AV25UploadedFiles.size() )
      {
         AV19FileUploadfile = (app.SdtFileUploadData)((app.SdtFileUploadData)AV25UploadedFiles.elementAt(-1+AV35GXV1));
         AV7Archivo = AV19FileUploadfile.getgxTv_SdtFileUploadData_File() ;
         AV36Archivo_GXI = com.genexus.GXDbFile.getUriFromFile( "", "", AV19FileUploadfile.getgxTv_SdtFileUploadData_File()) ;
         AV35GXV1 = (int)(AV35GXV1+1) ;
      }
      AV13CCTArc = AV36Archivo_GXI ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
      /*  Sending Event outputs  */
   }

   public void zm1SX621( int GX_JID )
   {
      if ( ( GX_JID == 19 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z4041CCTArc = T01SX3_A4041CCTArc[0] ;
            Z4036CCTDsc = T01SX3_A4036CCTDsc[0] ;
            Z4037CCTTpoCtr = T01SX3_A4037CCTTpoCtr[0] ;
            Z4406CCTFinFas = T01SX3_A4406CCTFinFas[0] ;
            Z4407CCTIniFas = T01SX3_A4407CCTIniFas[0] ;
            Z4039CCTObl = T01SX3_A4039CCTObl[0] ;
            Z4040CCTSto = T01SX3_A4040CCTSto[0] ;
            Z4042CCTObs = T01SX3_A4042CCTObs[0] ;
            Z11475CCTNotUlt = T01SX3_A11475CCTNotUlt[0] ;
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
      if ( GX_JID == -19 )
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
      AV34Pgmname = "ControlCalidadHTD.ControlCalidad" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
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
      if ( ! (0==AV14CCTCod) )
      {
         A4031CCTCod = AV14CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      if ( ! (0==AV14CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV14CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV15EmprCod)==0) )
      {
         A396EmprCod = AV15EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV8AuxEmprCod)==0) )
         {
            A396EmprCod = AV8AuxEmprCod ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         }
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
         /* Using cursor T01SX4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T01SX4_A407EmprNom[0] ;
         n407EmprNom = T01SX4_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(2);
      }
   }

   public void load1SX621( )
   {
      /* Using cursor T01SX5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A4041CCTArc = T01SX5_A4041CCTArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         A407EmprNom = T01SX5_A407EmprNom[0] ;
         n407EmprNom = T01SX5_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A4036CCTDsc = T01SX5_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01SX5_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4406CCTFinFas = T01SX5_A4406CCTFinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
         A4407CCTIniFas = T01SX5_A4407CCTIniFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
         A4039CCTObl = T01SX5_A4039CCTObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
         A4040CCTSto = T01SX5_A4040CCTSto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
         A4042CCTObs = T01SX5_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         A11475CCTNotUlt = T01SX5_A11475CCTNotUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         zm1SX621( -19) ;
      }
      pr_default.close(3);
      onLoadActions1SX621( ) ;
   }

   public void onLoadActions1SX621( )
   {
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
      if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
      {
         AV13CCTArc = A4041CCTArc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
      }
      if ( ! (GXutil.strcmp("", AV13CCTArc)==0) )
      {
         A4041CCTArc = AV13CCTArc ;
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

   public void checkExtendedTable1SX621( )
   {
      nIsDirty_621 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SX4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SX4_A407EmprNom[0] ;
      n407EmprNom = T01SX4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      if ( (0==A4031CCTCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Código es requerido.", ""), 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( (0==A4031CCTCod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Es necessario ingresar un código", ""), 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ingresar Numero de Línea = 1 a 2", ""), 1, "CCTDSC");
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
      if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
      {
         AV13CCTArc = A4041CCTArc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
      }
      if ( ! (GXutil.strcmp("", AV13CCTArc)==0) )
      {
         nIsDirty_621 = (short)(1) ;
         A4041CCTArc = AV13CCTArc ;
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

   public void closeExtendedTableCursors1SX621( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_20( String A396EmprCod )
   {
      /* Using cursor T01SX6 */
      pr_default.execute(4, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SX6_A407EmprNom[0] ;
      n407EmprNom = T01SX6_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(4) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(4);
   }

   public void getKey1SX621( )
   {
      /* Using cursor T01SX7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound621 = (short)(1) ;
      }
      else
      {
         RcdFound621 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SX3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SX621( 19) ;
         RcdFound621 = (short)(1) ;
         A4031CCTCod = T01SX3_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A4041CCTArc = T01SX3_A4041CCTArc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
         A4036CCTDsc = T01SX3_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A4037CCTTpoCtr = T01SX3_A4037CCTTpoCtr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4037CCTTpoCtr", A4037CCTTpoCtr);
         A4406CCTFinFas = T01SX3_A4406CCTFinFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
         A4407CCTIniFas = T01SX3_A4407CCTIniFas[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
         A4039CCTObl = T01SX3_A4039CCTObl[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4039CCTObl", A4039CCTObl);
         A4040CCTSto = T01SX3_A4040CCTSto[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4040CCTSto", A4040CCTSto);
         A4042CCTObs = T01SX3_A4042CCTObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4042CCTObs", A4042CCTObs);
         A11475CCTNotUlt = T01SX3_A11475CCTNotUlt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11475CCTNotUlt", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11475CCTNotUlt), 4, 0));
         A396EmprCod = T01SX3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         sMode621 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SX621( ) ;
         if ( AnyError == 1 )
         {
            RcdFound621 = (short)(0) ;
            initializeNonKey1SX621( ) ;
         }
         Gx_mode = sMode621 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound621 = (short)(0) ;
         initializeNonKey1SX621( ) ;
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
      getKey1SX621( ) ;
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
      /* Using cursor T01SX8 */
      pr_default.execute(6, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01SX8_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SX8_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T01SX8_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SX8_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SX8_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            A396EmprCod = T01SX8_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SX8_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound621 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound621 = (short)(0) ;
      /* Using cursor T01SX9 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01SX9_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SX9_A4031CCTCod[0] > A4031CCTCod ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01SX9_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SX9_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SX9_A4031CCTCod[0] < A4031CCTCod ) ) )
         {
            A396EmprCod = T01SX9_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SX9_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            RcdFound621 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SX621( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCTCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SX621( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
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
               update1SX621( ) ;
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
               insert1SX621( ) ;
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
                  GX_FocusControl = edtCCTCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SX621( ) ;
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
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
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

   public void checkOptimisticConcurrency1SX621( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SX2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z4041CCTArc, T01SX2_A4041CCTArc[0]) != 0 ) || ( GXutil.strcmp(Z4036CCTDsc, T01SX2_A4036CCTDsc[0]) != 0 ) || ( GXutil.strcmp(Z4037CCTTpoCtr, T01SX2_A4037CCTTpoCtr[0]) != 0 ) || ( GXutil.strcmp(Z4406CCTFinFas, T01SX2_A4406CCTFinFas[0]) != 0 ) || ( GXutil.strcmp(Z4407CCTIniFas, T01SX2_A4407CCTIniFas[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z4039CCTObl, T01SX2_A4039CCTObl[0]) != 0 ) || ( GXutil.strcmp(Z4040CCTSto, T01SX2_A4040CCTSto[0]) != 0 ) || ( GXutil.strcmp(Z4042CCTObs, T01SX2_A4042CCTObs[0]) != 0 ) || ( Z11475CCTNotUlt != T01SX2_A11475CCTNotUlt[0] ) )
         {
            if ( GXutil.strcmp(Z4041CCTArc, T01SX2_A4041CCTArc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTArc");
               GXutil.writeLogRaw("Old: ",Z4041CCTArc);
               GXutil.writeLogRaw("Current: ",T01SX2_A4041CCTArc[0]);
            }
            if ( GXutil.strcmp(Z4036CCTDsc, T01SX2_A4036CCTDsc[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTDsc");
               GXutil.writeLogRaw("Old: ",Z4036CCTDsc);
               GXutil.writeLogRaw("Current: ",T01SX2_A4036CCTDsc[0]);
            }
            if ( GXutil.strcmp(Z4037CCTTpoCtr, T01SX2_A4037CCTTpoCtr[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTTpoCtr");
               GXutil.writeLogRaw("Old: ",Z4037CCTTpoCtr);
               GXutil.writeLogRaw("Current: ",T01SX2_A4037CCTTpoCtr[0]);
            }
            if ( GXutil.strcmp(Z4406CCTFinFas, T01SX2_A4406CCTFinFas[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTFinFas");
               GXutil.writeLogRaw("Old: ",Z4406CCTFinFas);
               GXutil.writeLogRaw("Current: ",T01SX2_A4406CCTFinFas[0]);
            }
            if ( GXutil.strcmp(Z4407CCTIniFas, T01SX2_A4407CCTIniFas[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTIniFas");
               GXutil.writeLogRaw("Old: ",Z4407CCTIniFas);
               GXutil.writeLogRaw("Current: ",T01SX2_A4407CCTIniFas[0]);
            }
            if ( GXutil.strcmp(Z4039CCTObl, T01SX2_A4039CCTObl[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTObl");
               GXutil.writeLogRaw("Old: ",Z4039CCTObl);
               GXutil.writeLogRaw("Current: ",T01SX2_A4039CCTObl[0]);
            }
            if ( GXutil.strcmp(Z4040CCTSto, T01SX2_A4040CCTSto[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTSto");
               GXutil.writeLogRaw("Old: ",Z4040CCTSto);
               GXutil.writeLogRaw("Current: ",T01SX2_A4040CCTSto[0]);
            }
            if ( GXutil.strcmp(Z4042CCTObs, T01SX2_A4042CCTObs[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTObs");
               GXutil.writeLogRaw("Old: ",Z4042CCTObs);
               GXutil.writeLogRaw("Current: ",T01SX2_A4042CCTObs[0]);
            }
            if ( Z11475CCTNotUlt != T01SX2_A11475CCTNotUlt[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidad:[seudo value changed for attri]"+"CCTNotUlt");
               GXutil.writeLogRaw("Old: ",Z11475CCTNotUlt);
               GXutil.writeLogRaw("Current: ",T01SX2_A11475CCTNotUlt[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDef"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SX621( )
   {
      beforeValidate1SX621( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SX621( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SX621( 0) ;
         checkOptimisticConcurrency1SX621( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SX621( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SX621( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SX10 */
                  pr_default.execute(8, new Object[] {Integer.valueOf(A4031CCTCod), A4041CCTArc, A4036CCTDsc, A4037CCTTpoCtr, A4406CCTFinFas, A4407CCTIniFas, A4039CCTObl, A4040CCTSto, A4042CCTObs, Short.valueOf(A11475CCTNotUlt), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
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
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption1SX0( ) ;
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
            load1SX621( ) ;
         }
         endLevel1SX621( ) ;
      }
      closeExtendedTableCursors1SX621( ) ;
   }

   public void update1SX621( )
   {
      beforeValidate1SX621( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SX621( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SX621( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SX621( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SX621( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SX11 */
                  pr_default.execute(9, new Object[] {A4041CCTArc, A4036CCTDsc, A4037CCTTpoCtr, A4406CCTFinFas, A4407CCTIniFas, A4039CCTObl, A4040CCTSto, A4042CCTObs, Short.valueOf(A11475CCTNotUlt), A396EmprCod, Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDef");
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDef"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SX621( ) ;
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
         endLevel1SX621( ) ;
      }
      closeExtendedTableCursors1SX621( ) ;
   }

   public void deferredUpdate1SX621( )
   {
   }

   public void delete( )
   {
      beforeValidate1SX621( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SX621( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SX621( ) ;
         afterConfirm1SX621( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SX621( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SX12 */
               pr_default.execute(10, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
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
      endLevel1SX621( ) ;
      Gx_mode = sMode621 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SX621( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SX13 */
         pr_default.execute(11, new Object[] {A396EmprCod});
         A407EmprNom = T01SX13_A407EmprNom[0] ;
         n407EmprNom = T01SX13_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(11);
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
         if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
         {
            AV13CCTArc = A4041CCTArc ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
         }
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01SX14 */
         pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T01SX15 */
         pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Controles", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01SX16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Notificaciones", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01SX17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCSer1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01SX18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCFas", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01SX19 */
         pr_default.execute(17, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CCDef1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01SX20 */
         pr_default.execute(18, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "CC", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
      }
   }

   public void endLevel1SX621( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SX621( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad");
         if ( AnyError == 0 )
         {
            confirmValues1SX0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidad");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SX621( )
   {
      /* Scan By routine */
      /* Using cursor T01SX21 */
      pr_default.execute(19);
      RcdFound621 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A396EmprCod = T01SX21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SX21_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SX621( )
   {
      /* Scan next routine */
      pr_default.readNext(19);
      RcdFound621 = (short)(0) ;
      if ( (pr_default.getStatus(19) != 101) )
      {
         RcdFound621 = (short)(1) ;
         A396EmprCod = T01SX21_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SX21_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
   }

   public void scanEnd1SX621( )
   {
      pr_default.close(19);
   }

   public void afterConfirm1SX621( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SX621( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SX621( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SX621( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SX621( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SX621( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SX621( )
   {
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      cmbCCTTpoCtr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTTpoCtr.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTTpoCtr.getEnabled(), 5, 0), true);
      chkCCTFinFas.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTFinFas.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTFinFas.getEnabled(), 5, 0), true);
      chkCCTIniFas.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTIniFas.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTIniFas.getEnabled(), 5, 0), true);
      chkCCTSto.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTSto.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTSto.getEnabled(), 5, 0), true);
      chkCCTObs.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTObs.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTObs.getEnabled(), 5, 0), true);
      edtavCctarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctarc_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtCCTObl_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTObl_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTObl_Enabled), 5, 0), true);
      edtCCTNotUlt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotUlt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotUlt_Enabled), 5, 0), true);
      edtCCTArc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTArc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTArc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SX621( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SX0( )
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
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidad", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCTCod,6,0))}, new String[] {"Gx_mode","EmprCod","CCTCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidad");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidad:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPLOADEDFILES", AV25UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPLOADEDFILES", AV25UploadedFiles);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFAILEDFILES", AV17FailedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFAILEDFILES", AV17FailedFiles);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV24TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV24TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV24TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "vOUTCCTCOD", GXutil.ltrim( localUtil.ntoc( AV32outCCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOUTCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32outCCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_GXI", AV36Archivo_GXI);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vAUXEMPRCOD", GXutil.rtrim( AV8AuxEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV14CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Objectcall", GXutil.rtrim( Upload_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Enabled", GXutil.booltostr( Upload_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autoupload", GXutil.booltostr( Upload_Autoupload));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Hideadditionalbuttons", GXutil.booltostr( Upload_Hideadditionalbuttons));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Tooltiptext", GXutil.rtrim( Upload_Tooltiptext));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Maxnumberoffiles", GXutil.ltrim( localUtil.ntoc( Upload_Maxnumberoffiles, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autodisableaddingfiles", GXutil.booltostr( Upload_Autodisableaddingfiles));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Objectcall", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Enabled", GXutil.booltostr( Dvelop_confirmpanel_btnconfirmar_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
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
      return formatLink("app.controlcalidadhtd.controlcalidad", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14CCTCod,6,0))}, new String[] {"Gx_mode","EmprCod","CCTCod"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidad" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control Calidad", "") ;
   }

   public void initializeNonKey1SX621( )
   {
      AV13CCTArc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
      A4041CCTArc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", A4041CCTArc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
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

   public void initAll1SX621( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      initializeNonKey1SX621( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("FileUpload/fileupload.min.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693939", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidad.js", "?20268211693939", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavPgmname_Internalname = "vPGMNAME" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      cmbCCTTpoCtr.setInternalname( "CCTTPOCTR" );
      chkCCTFinFas.setInternalname( "CCTFINFAS" );
      chkCCTIniFas.setInternalname( "CCTINIFAS" );
      chkCCTSto.setInternalname( "CCTSTO" );
      chkCCTObs.setInternalname( "CCTOBS" );
      divTablefases_Internalname = "TABLEFASES" ;
      edtavCctarc_Internalname = "vCCTARC" ;
      Upload_Internalname = "UPLOAD" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnuseraction1_Internalname = "BTNUSERACTION1" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divTablaupload_Internalname = "TABLAUPLOAD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      lblCctarc_txt_Internalname = "CCTARC_TXT" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtCCTObl_Internalname = "CCTOBL" ;
      edtCCTNotUlt_Internalname = "CCTNOTULT" ;
      edtCCTArc_Internalname = "CCTARC" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      Form.setCaption( httpContext.getMessage( "Control Calidad", "") );
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Quieres agregar variables a este controle de calidade ?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = httpContext.getMessage( "Aviso", "") ;
      edtCCTArc_Jsonclick = "" ;
      edtCCTArc_Enabled = 0 ;
      edtCCTArc_Visible = 1 ;
      edtCCTNotUlt_Jsonclick = "" ;
      edtCCTNotUlt_Enabled = 1 ;
      edtCCTNotUlt_Visible = 1 ;
      edtCCTObl_Jsonclick = "" ;
      edtCCTObl_Enabled = 1 ;
      edtCCTObl_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      bttBtnconfirmar_Visible = 1 ;
      bttBtnuseraction1_Visible = 1 ;
      Upload_Autodisableaddingfiles = GXutil.toBoolean( 0) ;
      Upload_Maxnumberoffiles = 1 ;
      Upload_Tooltiptext = "Enviar el modelo" ;
      Upload_Hideadditionalbuttons = GXutil.toBoolean( -1) ;
      Upload_Autoupload = GXutil.toBoolean( -1) ;
      edtavCctarc_Jsonclick = "" ;
      edtavCctarc_Enabled = 0 ;
      chkCCTObs.setEnabled( 1 );
      chkCCTObs.setVisible( 1 );
      chkCCTSto.setEnabled( 1 );
      chkCCTIniFas.setEnabled( 1 );
      chkCCTFinFas.setEnabled( 1 );
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
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      chkCCTFinFas.setName( "CCTFINFAS" );
      chkCCTFinFas.setWebtags( "" );
      chkCCTFinFas.setCaption( httpContext.getMessage( "Final de Fase", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTFinFas.getInternalname(), "TitleCaption", chkCCTFinFas.getCaption(), true);
      chkCCTFinFas.setCheckedValue( "N" );
      A4406CCTFinFas = ((GXutil.strcmp(GXutil.rtrim( A4406CCTFinFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4406CCTFinFas", A4406CCTFinFas);
      chkCCTIniFas.setName( "CCTINIFAS" );
      chkCCTIniFas.setWebtags( "" );
      chkCCTIniFas.setCaption( httpContext.getMessage( "Inicio de Fase", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTIniFas.getInternalname(), "TitleCaption", chkCCTIniFas.getCaption(), true);
      chkCCTIniFas.setCheckedValue( "N" );
      A4407CCTIniFas = ((GXutil.strcmp(GXutil.rtrim( A4407CCTIniFas), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "A4407CCTIniFas", A4407CCTIniFas);
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T01SX13 */
      pr_default.execute(11, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SX13_A407EmprNom[0] ;
      n407EmprNom = T01SX13_n407EmprNom[0] ;
      pr_default.close(11);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void validv_Cctarc( )
   {
      A4037CCTTpoCtr = cmbCCTTpoCtr.getValue() ;
      if ( ! (GXutil.strcmp("", AV13CCTArc)==0) )
      {
         A4041CCTArc = AV13CCTArc ;
      }
      else
      {
         if ( ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "I", "")) == 0 ) || ( GXutil.strcmp(A4037CCTTpoCtr, httpContext.getMessage( "D", "")) == 0 ) )
         {
            A4041CCTArc = "" ;
         }
      }
      if ( ! (GXutil.strcmp("", A4041CCTArc)==0) )
      {
         AV13CCTArc = A4041CCTArc ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A4041CCTArc", GXutil.rtrim( A4041CCTArc));
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", GXutil.rtrim( AV13CCTArc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV24TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV32outCCTCod',fld:'vOUTCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV14CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("AFTER TRN","{handler:'e151SX2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'AV24TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'AV32outCCTCod',fld:'vOUTCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121SX621',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e161SX2',iparms:[{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("CCTTPOCTR.CLICK","{handler:'e111SX621',iparms:[{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("CCTTPOCTR.CLICK",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE","{handler:'e141SX2',iparms:[{av:'AV25UploadedFiles',fld:'vUPLOADEDFILES',pic:''},{av:'AV36Archivo_GXI',fld:'vARCHIVO_GXI',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE",",oparms:[{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTDSC","{handler:'valid_Cctdsc',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTDSC",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTTPOCTR","{handler:'valid_Ccttpoctr',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTTPOCTR",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALIDV_CCTARC","{handler:'validv_Cctarc',iparms:[{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'},{av:'cmbCCTTpoCtr'},{av:'A4037CCTTpoCtr',fld:'CCTTPOCTR',pic:''},{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALIDV_CCTARC",",oparms:[{av:'A4041CCTArc',fld:'CCTARC',pic:'@!'},{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
      setEventMetadata("VALID_CCTARC","{handler:'valid_Cctarc',iparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]");
      setEventMetadata("VALID_CCTARC",",oparms:[{av:'A4406CCTFinFas',fld:'CCTFINFAS',pic:'@!'},{av:'A4407CCTIniFas',fld:'CCTINIFAS',pic:'@!'},{av:'A4040CCTSto',fld:'CCTSTO',pic:'@!'},{av:'A4042CCTObs',fld:'CCTOBS',pic:'@!'}]}");
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
      pr_default.close(11);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV15EmprCod = "" ;
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
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
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
      A4037CCTTpoCtr = "" ;
      A4406CCTFinFas = "" ;
      A4407CCTIniFas = "" ;
      A4040CCTSto = "" ;
      A4042CCTObs = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV34Pgmname = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A4036CCTDsc = "" ;
      AV13CCTArc = "" ;
      ucUpload = new com.genexus.webpanels.GXUserControl();
      AV25UploadedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      AV17FailedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      bttBtnuseraction1_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      lblCctarc_txt_Jsonclick = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      A407EmprNom = "" ;
      A4039CCTObl = "" ;
      A4041CCTArc = "" ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      AV8AuxEmprCod = "" ;
      Upload_Objectcall = "" ;
      Upload_Class = "" ;
      Upload_Acceptedfiletypes = "" ;
      Upload_Customfiletypes = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvelop_confirmpanel_btnconfirmar_Objectcall = "" ;
      Dvelop_confirmpanel_btnconfirmar_Width = "" ;
      Dvelop_confirmpanel_btnconfirmar_Height = "" ;
      Dvelop_confirmpanel_btnconfirmar_Class = "" ;
      Dvelop_confirmpanel_btnconfirmar_Comment = "" ;
      Dvelop_confirmpanel_btnconfirmar_Bodytype = "" ;
      Dvelop_confirmpanel_btnconfirmar_Bodycontentinternalname = "" ;
      Dvelop_confirmpanel_btnconfirmar_Texttype = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode621 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV29Station = "" ;
      AV16EmprNom = "" ;
      AV26UsurCod = "" ;
      AV20Lit0 = "" ;
      AV21Lit1 = "" ;
      AV22LitFe = "" ;
      AV11CCLPicInf = "" ;
      AV12CCLPicSup = "" ;
      AV9CCLArrInf = "" ;
      AV10CCLArrSup = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV28WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV24TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV27WebSession = httpContext.getWebSession();
      AV33File = new com.genexus.util.GXFile();
      AV19FileUploadfile = new app.SdtFileUploadData(remoteHandle, context);
      AV7Archivo = "" ;
      AV36Archivo_GXI = "" ;
      Z407EmprNom = "" ;
      T01SX4_A407EmprNom = new String[] {""} ;
      T01SX4_n407EmprNom = new boolean[] {false} ;
      T01SX5_A4031CCTCod = new int[1] ;
      T01SX5_A4041CCTArc = new String[] {""} ;
      T01SX5_A407EmprNom = new String[] {""} ;
      T01SX5_n407EmprNom = new boolean[] {false} ;
      T01SX5_A4036CCTDsc = new String[] {""} ;
      T01SX5_A4037CCTTpoCtr = new String[] {""} ;
      T01SX5_A4406CCTFinFas = new String[] {""} ;
      T01SX5_A4407CCTIniFas = new String[] {""} ;
      T01SX5_A4039CCTObl = new String[] {""} ;
      T01SX5_A4040CCTSto = new String[] {""} ;
      T01SX5_A4042CCTObs = new String[] {""} ;
      T01SX5_A11475CCTNotUlt = new short[1] ;
      T01SX5_A396EmprCod = new String[] {""} ;
      T01SX6_A407EmprNom = new String[] {""} ;
      T01SX6_n407EmprNom = new boolean[] {false} ;
      T01SX7_A396EmprCod = new String[] {""} ;
      T01SX7_A4031CCTCod = new int[1] ;
      T01SX3_A4031CCTCod = new int[1] ;
      T01SX3_A4041CCTArc = new String[] {""} ;
      T01SX3_A4036CCTDsc = new String[] {""} ;
      T01SX3_A4037CCTTpoCtr = new String[] {""} ;
      T01SX3_A4406CCTFinFas = new String[] {""} ;
      T01SX3_A4407CCTIniFas = new String[] {""} ;
      T01SX3_A4039CCTObl = new String[] {""} ;
      T01SX3_A4040CCTSto = new String[] {""} ;
      T01SX3_A4042CCTObs = new String[] {""} ;
      T01SX3_A11475CCTNotUlt = new short[1] ;
      T01SX3_A396EmprCod = new String[] {""} ;
      T01SX8_A396EmprCod = new String[] {""} ;
      T01SX8_A4031CCTCod = new int[1] ;
      T01SX9_A396EmprCod = new String[] {""} ;
      T01SX9_A4031CCTCod = new int[1] ;
      T01SX2_A4031CCTCod = new int[1] ;
      T01SX2_A4041CCTArc = new String[] {""} ;
      T01SX2_A4036CCTDsc = new String[] {""} ;
      T01SX2_A4037CCTTpoCtr = new String[] {""} ;
      T01SX2_A4406CCTFinFas = new String[] {""} ;
      T01SX2_A4407CCTIniFas = new String[] {""} ;
      T01SX2_A4039CCTObl = new String[] {""} ;
      T01SX2_A4040CCTSto = new String[] {""} ;
      T01SX2_A4042CCTObs = new String[] {""} ;
      T01SX2_A11475CCTNotUlt = new short[1] ;
      T01SX2_A396EmprCod = new String[] {""} ;
      T01SX13_A407EmprNom = new String[] {""} ;
      T01SX13_n407EmprNom = new boolean[] {false} ;
      T01SX14_A396EmprCod = new String[] {""} ;
      T01SX14_A583IntCod = new byte[1] ;
      T01SX14_A4031CCTCod = new int[1] ;
      T01SX15_A396EmprCod = new String[] {""} ;
      T01SX15_A252CliCod = new int[1] ;
      T01SX15_A9713Tb1_Cod = new short[1] ;
      T01SX15_A11736CCArtCod = new String[] {""} ;
      T01SX15_A11748TipArtiId = new short[1] ;
      T01SX15_A11737CCColNom = new String[] {""} ;
      T01SX15_A11738CCColNum = new int[1] ;
      T01SX15_A11749CCCTc = new byte[1] ;
      T01SX15_A11750IntId = new short[1] ;
      T01SX15_A4031CCTCod = new int[1] ;
      T01SX16_A396EmprCod = new String[] {""} ;
      T01SX16_A4031CCTCod = new int[1] ;
      T01SX16_A11481CCTNotId = new short[1] ;
      T01SX17_A396EmprCod = new String[] {""} ;
      T01SX17_A252CliCod = new int[1] ;
      T01SX17_A65ArtCod = new String[] {""} ;
      T01SX17_A4058CCFColNom = new String[] {""} ;
      T01SX17_A4059CCFColNum = new int[1] ;
      T01SX17_A4031CCTCod = new int[1] ;
      T01SX18_A396EmprCod = new String[] {""} ;
      T01SX18_A457FasCod = new String[] {""} ;
      T01SX18_A4031CCTCod = new int[1] ;
      T01SX19_A396EmprCod = new String[] {""} ;
      T01SX19_A4031CCTCod = new int[1] ;
      T01SX19_A4034CCTLin = new short[1] ;
      T01SX20_A396EmprCod = new String[] {""} ;
      T01SX20_A129BarCod = new int[1] ;
      T01SX20_A132BarCodReo = new byte[1] ;
      T01SX20_A130BarCodPar = new String[] {""} ;
      T01SX20_A758ProCod = new String[] {""} ;
      T01SX20_A194BarOrdLin = new short[1] ;
      T01SX20_A4031CCTCod = new int[1] ;
      T01SX21_A396EmprCod = new String[] {""} ;
      T01SX21_A4031CCTCod = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV13CCTArc = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidad__default(),
         new Object[] {
             new Object[] {
            T01SX2_A4031CCTCod, T01SX2_A4041CCTArc, T01SX2_A4036CCTDsc, T01SX2_A4037CCTTpoCtr, T01SX2_A4406CCTFinFas, T01SX2_A4407CCTIniFas, T01SX2_A4039CCTObl, T01SX2_A4040CCTSto, T01SX2_A4042CCTObs, T01SX2_A11475CCTNotUlt,
            T01SX2_A396EmprCod
            }
            , new Object[] {
            T01SX3_A4031CCTCod, T01SX3_A4041CCTArc, T01SX3_A4036CCTDsc, T01SX3_A4037CCTTpoCtr, T01SX3_A4406CCTFinFas, T01SX3_A4407CCTIniFas, T01SX3_A4039CCTObl, T01SX3_A4040CCTSto, T01SX3_A4042CCTObs, T01SX3_A11475CCTNotUlt,
            T01SX3_A396EmprCod
            }
            , new Object[] {
            T01SX4_A407EmprNom, T01SX4_n407EmprNom
            }
            , new Object[] {
            T01SX5_A4031CCTCod, T01SX5_A4041CCTArc, T01SX5_A407EmprNom, T01SX5_n407EmprNom, T01SX5_A4036CCTDsc, T01SX5_A4037CCTTpoCtr, T01SX5_A4406CCTFinFas, T01SX5_A4407CCTIniFas, T01SX5_A4039CCTObl, T01SX5_A4040CCTSto,
            T01SX5_A4042CCTObs, T01SX5_A11475CCTNotUlt, T01SX5_A396EmprCod
            }
            , new Object[] {
            T01SX6_A407EmprNom, T01SX6_n407EmprNom
            }
            , new Object[] {
            T01SX7_A396EmprCod, T01SX7_A4031CCTCod
            }
            , new Object[] {
            T01SX8_A396EmprCod, T01SX8_A4031CCTCod
            }
            , new Object[] {
            T01SX9_A396EmprCod, T01SX9_A4031CCTCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SX13_A407EmprNom, T01SX13_n407EmprNom
            }
            , new Object[] {
            T01SX14_A396EmprCod, T01SX14_A583IntCod, T01SX14_A4031CCTCod
            }
            , new Object[] {
            T01SX15_A396EmprCod, T01SX15_A252CliCod, T01SX15_A9713Tb1_Cod, T01SX15_A11736CCArtCod, T01SX15_A11748TipArtiId, T01SX15_A11737CCColNom, T01SX15_A11738CCColNum, T01SX15_A11749CCCTc, T01SX15_A11750IntId, T01SX15_A4031CCTCod
            }
            , new Object[] {
            T01SX16_A396EmprCod, T01SX16_A4031CCTCod, T01SX16_A11481CCTNotId
            }
            , new Object[] {
            T01SX17_A396EmprCod, T01SX17_A252CliCod, T01SX17_A65ArtCod, T01SX17_A4058CCFColNom, T01SX17_A4059CCFColNum, T01SX17_A4031CCTCod
            }
            , new Object[] {
            T01SX18_A396EmprCod, T01SX18_A457FasCod, T01SX18_A4031CCTCod
            }
            , new Object[] {
            T01SX19_A396EmprCod, T01SX19_A4031CCTCod, T01SX19_A4034CCTLin
            }
            , new Object[] {
            T01SX20_A396EmprCod, T01SX20_A129BarCod, T01SX20_A132BarCodReo, T01SX20_A130BarCodPar, T01SX20_A758ProCod, T01SX20_A194BarOrdLin, T01SX20_A4031CCTCod
            }
            , new Object[] {
            T01SX21_A396EmprCod, T01SX21_A4031CCTCod
            }
         }
      );
      AV34Pgmname = "ControlCalidadHTD.ControlCalidad" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte AV23TestCC ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short Z11475CCTNotUlt ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11475CCTNotUlt ;
   private short RcdFound621 ;
   private short nIsDirty_621 ;
   private int wcpOAV14CCTCod ;
   private int Z4031CCTCod ;
   private int AV14CCTCod ;
   private int trnEnded ;
   private int edtavPgmname_Enabled ;
   private int A4031CCTCod ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Enabled ;
   private int edtavCctarc_Enabled ;
   private int Upload_Maxnumberoffiles ;
   private int bttBtnuseraction1_Visible ;
   private int bttBtnconfirmar_Visible ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtCCTObl_Visible ;
   private int edtCCTObl_Enabled ;
   private int edtCCTNotUlt_Enabled ;
   private int edtCCTNotUlt_Visible ;
   private int edtCCTArc_Visible ;
   private int edtCCTArc_Enabled ;
   private int AV32outCCTCod ;
   private int Upload_Maxfilesize ;
   private int AV35GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV15EmprCod ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
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
   private String edtCCTCod_Internalname ;
   private String A4037CCTTpoCtr ;
   private String A4406CCTFinFas ;
   private String A4407CCTIniFas ;
   private String A4040CCTSto ;
   private String A4042CCTObs ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String edtavPgmname_Internalname ;
   private String AV34Pgmname ;
   private String edtavPgmname_Jsonclick ;
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
   private String divTablefases_Internalname ;
   private String divTablaupload_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavCctarc_Internalname ;
   private String AV13CCTArc ;
   private String edtavCctarc_Jsonclick ;
   private String Upload_Tooltiptext ;
   private String Upload_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnuseraction1_Internalname ;
   private String bttBtnuseraction1_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String lblCctarc_txt_Internalname ;
   private String lblCctarc_txt_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtCCTObl_Internalname ;
   private String A4039CCTObl ;
   private String edtCCTObl_Jsonclick ;
   private String edtCCTNotUlt_Internalname ;
   private String edtCCTNotUlt_Jsonclick ;
   private String edtCCTArc_Internalname ;
   private String A4041CCTArc ;
   private String edtCCTArc_Jsonclick ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String AV8AuxEmprCod ;
   private String Upload_Objectcall ;
   private String Upload_Class ;
   private String Upload_Acceptedfiletypes ;
   private String Upload_Customfiletypes ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvelop_confirmpanel_btnconfirmar_Objectcall ;
   private String Dvelop_confirmpanel_btnconfirmar_Width ;
   private String Dvelop_confirmpanel_btnconfirmar_Height ;
   private String Dvelop_confirmpanel_btnconfirmar_Class ;
   private String Dvelop_confirmpanel_btnconfirmar_Comment ;
   private String Dvelop_confirmpanel_btnconfirmar_Bodytype ;
   private String Dvelop_confirmpanel_btnconfirmar_Bodycontentinternalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Texttype ;
   private String hsh ;
   private String sMode621 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV29Station ;
   private String AV16EmprNom ;
   private String AV26UsurCod ;
   private String AV20Lit0 ;
   private String AV21Lit1 ;
   private String AV22LitFe ;
   private String AV11CCLPicInf ;
   private String AV12CCLPicSup ;
   private String AV9CCLArrInf ;
   private String AV10CCLArrSup ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV13CCTArc ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Upload_Autoupload ;
   private boolean Upload_Hideadditionalbuttons ;
   private boolean Upload_Autodisableaddingfiles ;
   private boolean Upload_Enabled ;
   private boolean Upload_Enableuploadedfilecanceling ;
   private boolean Upload_Disableimageresize ;
   private boolean Upload_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvelop_confirmpanel_btnconfirmar_Enabled ;
   private boolean Dvelop_confirmpanel_btnconfirmar_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String AV36Archivo_GXI ;
   private String AV7Archivo ;
   private com.genexus.webpanels.WebSession AV27WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucUpload ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.util.GXFile AV33File ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCCTTpoCtr ;
   private ICheckbox chkCCTFinFas ;
   private ICheckbox chkCCTIniFas ;
   private ICheckbox chkCCTSto ;
   private ICheckbox chkCCTObs ;
   private IDataStoreProvider pr_default ;
   private String[] T01SX4_A407EmprNom ;
   private boolean[] T01SX4_n407EmprNom ;
   private int[] T01SX5_A4031CCTCod ;
   private String[] T01SX5_A4041CCTArc ;
   private String[] T01SX5_A407EmprNom ;
   private boolean[] T01SX5_n407EmprNom ;
   private String[] T01SX5_A4036CCTDsc ;
   private String[] T01SX5_A4037CCTTpoCtr ;
   private String[] T01SX5_A4406CCTFinFas ;
   private String[] T01SX5_A4407CCTIniFas ;
   private String[] T01SX5_A4039CCTObl ;
   private String[] T01SX5_A4040CCTSto ;
   private String[] T01SX5_A4042CCTObs ;
   private short[] T01SX5_A11475CCTNotUlt ;
   private String[] T01SX5_A396EmprCod ;
   private String[] T01SX6_A407EmprNom ;
   private boolean[] T01SX6_n407EmprNom ;
   private String[] T01SX7_A396EmprCod ;
   private int[] T01SX7_A4031CCTCod ;
   private int[] T01SX3_A4031CCTCod ;
   private String[] T01SX3_A4041CCTArc ;
   private String[] T01SX3_A4036CCTDsc ;
   private String[] T01SX3_A4037CCTTpoCtr ;
   private String[] T01SX3_A4406CCTFinFas ;
   private String[] T01SX3_A4407CCTIniFas ;
   private String[] T01SX3_A4039CCTObl ;
   private String[] T01SX3_A4040CCTSto ;
   private String[] T01SX3_A4042CCTObs ;
   private short[] T01SX3_A11475CCTNotUlt ;
   private String[] T01SX3_A396EmprCod ;
   private String[] T01SX8_A396EmprCod ;
   private int[] T01SX8_A4031CCTCod ;
   private String[] T01SX9_A396EmprCod ;
   private int[] T01SX9_A4031CCTCod ;
   private int[] T01SX2_A4031CCTCod ;
   private String[] T01SX2_A4041CCTArc ;
   private String[] T01SX2_A4036CCTDsc ;
   private String[] T01SX2_A4037CCTTpoCtr ;
   private String[] T01SX2_A4406CCTFinFas ;
   private String[] T01SX2_A4407CCTIniFas ;
   private String[] T01SX2_A4039CCTObl ;
   private String[] T01SX2_A4040CCTSto ;
   private String[] T01SX2_A4042CCTObs ;
   private short[] T01SX2_A11475CCTNotUlt ;
   private String[] T01SX2_A396EmprCod ;
   private String[] T01SX13_A407EmprNom ;
   private boolean[] T01SX13_n407EmprNom ;
   private String[] T01SX14_A396EmprCod ;
   private byte[] T01SX14_A583IntCod ;
   private int[] T01SX14_A4031CCTCod ;
   private String[] T01SX15_A396EmprCod ;
   private int[] T01SX15_A252CliCod ;
   private short[] T01SX15_A9713Tb1_Cod ;
   private String[] T01SX15_A11736CCArtCod ;
   private short[] T01SX15_A11748TipArtiId ;
   private String[] T01SX15_A11737CCColNom ;
   private int[] T01SX15_A11738CCColNum ;
   private byte[] T01SX15_A11749CCCTc ;
   private short[] T01SX15_A11750IntId ;
   private int[] T01SX15_A4031CCTCod ;
   private String[] T01SX16_A396EmprCod ;
   private int[] T01SX16_A4031CCTCod ;
   private short[] T01SX16_A11481CCTNotId ;
   private String[] T01SX17_A396EmprCod ;
   private int[] T01SX17_A252CliCod ;
   private String[] T01SX17_A65ArtCod ;
   private String[] T01SX17_A4058CCFColNom ;
   private int[] T01SX17_A4059CCFColNum ;
   private int[] T01SX17_A4031CCTCod ;
   private String[] T01SX18_A396EmprCod ;
   private String[] T01SX18_A457FasCod ;
   private int[] T01SX18_A4031CCTCod ;
   private String[] T01SX19_A396EmprCod ;
   private int[] T01SX19_A4031CCTCod ;
   private short[] T01SX19_A4034CCTLin ;
   private String[] T01SX20_A396EmprCod ;
   private int[] T01SX20_A129BarCod ;
   private byte[] T01SX20_A132BarCodReo ;
   private String[] T01SX20_A130BarCodPar ;
   private String[] T01SX20_A758ProCod ;
   private short[] T01SX20_A194BarOrdLin ;
   private int[] T01SX20_A4031CCTCod ;
   private String[] T01SX21_A396EmprCod ;
   private int[] T01SX21_A4031CCTCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtFileUploadData> AV25UploadedFiles ;
   private GXBaseCollection<app.SdtFileUploadData> AV17FailedFiles ;
   private app.SdtFileUploadData AV19FileUploadfile ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV24TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV28WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class controlcalidad__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidad__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SX2", "SELECT CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ?  FOR UPDATE OF CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SX3", "SELECT CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SX4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SX5", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCTCod, TM1.CCTArc, T2.EmprNom, TM1.CCTDsc, TM1.CCTTpoCtr, TM1.CCTFinFas, TM1.CCTIniFas, TM1.CCTObl, TM1.CCTSto, TM1.CCTObs, TM1.CCTNotUlt, TM1.EmprCod FROM (TXPCCDef TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) WHERE TM1.EmprCod = ? and TM1.CCTCod = ? ORDER BY TM1.EmprCod, TM1.CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SX6", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SX7", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SX8", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE ( EmprCod > ? or EmprCod = ? and CCTCod > ?) ORDER BY EmprCod, CCTCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX9", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod FROM TXPCCDef WHERE ( EmprCod < ? or EmprCod = ? and CCTCod < ?) ORDER BY EmprCod DESC, CCTCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SX10", "INSERT INTO TXPCCDef(CCTCod, CCTArc, CCTDsc, CCTTpoCtr, CCTFinFas, CCTIniFas, CCTObl, CCTSto, CCTObs, CCTNotUlt, EmprCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDef")
         ,new UpdateCursor("T01SX11", "UPDATE TXPCCDef SET CCTArc=?, CCTDsc=?, CCTTpoCtr=?, CCTFinFas=?, CCTIniFas=?, CCTObl=?, CCTSto=?, CCTObs=?, CCTNotUlt=?  WHERE EmprCod = ? AND CCTCod = ?", GX_NOMASK, "TXPCCDef")
         ,new UpdateCursor("T01SX12", "DELETE FROM TXPCCDef  WHERE EmprCod = ? AND CCTCod = ?", GX_NOMASK, "TXPCCDef")
         ,new ForEachCursor("T01SX13", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SX14", "SELECT * FROM (SELECT EmprCod, IntCod, CCTCod FROM TXPPddCtr WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX15", "SELECT * FROM (SELECT EmprCod, CliCod, Tb1_Cod, CCArtCod, TipArtiId, CCColNom, CCColNum, CCCTc, IntId, CCTCod FROM TXPCCCno5 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX16", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTNotId FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX17", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, CCFColNom, CCFColNum, CCTCod FROM TXPCCSer1 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX18", "SELECT * FROM (SELECT EmprCod, FasCod, CCTCod FROM TXPCCFas WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX19", "SELECT * FROM (SELECT EmprCod, CCTCod, CCTLin FROM TXPCCDef1 WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX20", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod, BarOrdLin, CCTCod FROM TXPCC WHERE EmprCod = ? AND CCTCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SX21", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCTCod FROM TXPCCDef ORDER BY EmprCod, CCTCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 13 :
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
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 13);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 19 :
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 8 :
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
            case 9 :
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
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
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
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

