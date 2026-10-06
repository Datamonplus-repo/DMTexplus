package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlcalidadnotificacion_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_16") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_16( A396EmprCod, A4031CCTCod) ;
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
            AV7CCTCod = (int)(GXutil.lval( httpContext.GetPar( "CCTCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CCTCod), 6, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCTCod), "ZZZZZ9")));
            AV8EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
            AV9CCTNotId = (short)(GXutil.lval( httpContext.GetPar( "CCTNotId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CCTNotId), 4, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTNOTID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CCTNotId), "ZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Control Calidad Notificacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtCCTNotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public controlcalidadnotificacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlcalidadnotificacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlcalidadnotificacion_impl.class ));
   }

   public controlcalidadnotificacion_impl( int remoteHandle ,
                                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbCCTNotEvt = new HTMLChoice();
      cmbCCTNotAdj = new HTMLChoice();
      cmbCCTNotDst = new HTMLChoice();
      dynCCTNotUsr = new HTMLChoice();
      chkCCTNotStp = UIFactory.getCheckbox(this);
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
      if ( cmbCCTNotEvt.getItemCount() > 0 )
      {
         A11477CCTNotEvt = cmbCCTNotEvt.getValidValue(A11477CCTNotEvt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11477CCTNotEvt", A11477CCTNotEvt);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTNotEvt.setValue( GXutil.rtrim( A11477CCTNotEvt) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotEvt.getInternalname(), "Values", cmbCCTNotEvt.ToJavascriptSource(), true);
      }
      if ( cmbCCTNotAdj.getItemCount() > 0 )
      {
         A11525CCTNotAdj = (byte)(GXutil.lval( cmbCCTNotAdj.getValidValue(GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11525CCTNotAdj", GXutil.str( A11525CCTNotAdj, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTNotAdj.setValue( GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotAdj.getInternalname(), "Values", cmbCCTNotAdj.ToJavascriptSource(), true);
      }
      if ( cmbCCTNotDst.getItemCount() > 0 )
      {
         A11478CCTNotDst = cmbCCTNotDst.getValidValue(A11478CCTNotDst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11478CCTNotDst", A11478CCTNotDst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbCCTNotDst.setValue( GXutil.rtrim( A11478CCTNotDst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotDst.getInternalname(), "Values", cmbCCTNotDst.ToJavascriptSource(), true);
      }
      if ( dynCCTNotUsr.getItemCount() > 0 )
      {
         A11479CCTNotUsr = dynCCTNotUsr.getValidValue(A11479CCTNotUsr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11479CCTNotUsr", A11479CCTNotUsr);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         dynCCTNotUsr.setValue( GXutil.rtrim( A11479CCTNotUsr) );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Values", dynCCTNotUsr.ToJavascriptSource(), true);
      }
      A12733CCTNotStp = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A12733CCTNotStp, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12733CCTNotStp", GXutil.str( A12733CCTNotStp, 1, 0));
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTNotId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTNotId_Internalname, httpContext.getMessage( "Notificaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTNotId_Internalname, GXutil.ltrim( localUtil.ntoc( A11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11481CCTNotId), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTNotId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTNotId_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTNotEvt.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTNotEvt.getInternalname(), httpContext.getMessage( "Evento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTNotEvt, cmbCCTNotEvt.getInternalname(), GXutil.rtrim( A11477CCTNotEvt), 1, cmbCCTNotEvt.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTNotEvt.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      cmbCCTNotEvt.setValue( GXutil.rtrim( A11477CCTNotEvt) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotEvt.getInternalname(), "Values", cmbCCTNotEvt.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTNotAdj.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTNotAdj.getInternalname(), httpContext.getMessage( "Adjunto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTNotAdj, cmbCCTNotAdj.getInternalname(), GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0)), 1, cmbCCTNotAdj.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbCCTNotAdj.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      cmbCCTNotAdj.setValue( GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotAdj.getInternalname(), "Values", cmbCCTNotAdj.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbCCTNotDst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbCCTNotDst.getInternalname(), httpContext.getMessage( "Destinatario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbCCTNotDst, cmbCCTNotDst.getInternalname(), GXutil.rtrim( A11478CCTNotDst), 1, cmbCCTNotDst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbCCTNotDst.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      cmbCCTNotDst.setValue( GXutil.rtrim( A11478CCTNotDst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotDst.getInternalname(), "Values", cmbCCTNotDst.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+dynCCTNotUsr.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, dynCCTNotUsr.getInternalname(), httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, dynCCTNotUsr, dynCCTNotUsr.getInternalname(), GXutil.rtrim( A11479CCTNotUsr), 1, dynCCTNotUsr.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, dynCCTNotUsr.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "", true, (byte)(0), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      dynCCTNotUsr.setValue( GXutil.rtrim( A11479CCTNotUsr) );
      httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Values", dynCCTNotUsr.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTNotEml_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTNotEml_Internalname, httpContext.getMessage( "e-mail", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTNotEml_Internalname, GXutil.rtrim( A11480CCTNotEml), GXutil.rtrim( localUtil.format( A11480CCTNotEml, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTNotEml_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCCTNotEml_Enabled, 1, "text", "", 80, "chr", 1, "row", 120, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTNotAsu_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTNotAsu_Internalname, httpContext.getMessage( "Asunto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCCTNotAsu_Internalname, A11523CCTNotAsu, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,53);\"", (short)(0), 1, edtCCTNotAsu_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 1, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
      /* Table start */
      sStyleString = "" ;
      app.GxWebStd.gx_table_start( httpContext, tblTabletext_Internalname, tblTabletext_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
      httpContext.writeText( "<tr>") ;
      httpContext.writeText( "<td>") ;
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockinfo_Internalname, lblTextblockinfo_Caption, "", "", lblTextblockinfo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      httpContext.writeText( "</td>") ;
      httpContext.writeText( "</tr>") ;
      /* End of table */
      httpContext.writeText( "</table>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkCCTNotStp.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, chkCCTNotStp.getInternalname(), httpContext.getMessage( "Bloquear FASE", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Check box */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_checkbox_ctrl( httpContext, chkCCTNotStp.getInternalname(), GXutil.str( A12733CCTNotStp, 1, 0), "", httpContext.getMessage( "Bloquear FASE", ""), 1, chkCCTNotStp.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(65, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtCCTNotTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCCTNotTxt_Internalname, httpContext.getMessage( "Encabezado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtCCTNotTxt_Internalname, A11524CCTNotTxt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", (short)(0), 1, edtCCTNotTxt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV13Pgmname), GXutil.rtrim( localUtil.format( AV13Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
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
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTCod_Internalname, GXutil.ltrim( localUtil.ntoc( A4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4031CCTCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTCod_Visible, edtCCTCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtCCTDsc_Internalname, GXutil.rtrim( A4036CCTDsc), GXutil.rtrim( localUtil.format( A4036CCTDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCCTDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtCCTDsc_Visible, edtCCTDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\ControlCalidadNotificacion.htm");
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
      e111SZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z4031CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z4031CCTCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11481CCTNotId = (short)(localUtil.ctol( httpContext.cgiGet( "Z11481CCTNotId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11477CCTNotEvt = httpContext.cgiGet( "Z11477CCTNotEvt") ;
            Z11478CCTNotDst = httpContext.cgiGet( "Z11478CCTNotDst") ;
            Z11479CCTNotUsr = httpContext.cgiGet( "Z11479CCTNotUsr") ;
            Z11480CCTNotEml = httpContext.cgiGet( "Z11480CCTNotEml") ;
            Z11523CCTNotAsu = httpContext.cgiGet( "Z11523CCTNotAsu") ;
            Z11524CCTNotTxt = httpContext.cgiGet( "Z11524CCTNotTxt") ;
            Z11525CCTNotAdj = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11525CCTNotAdj"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z12733CCTNotStp = (byte)(localUtil.ctol( httpContext.cgiGet( "Z12733CCTNotStp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N11479CCTNotUsr = httpContext.cgiGet( "N11479CCTNotUsr") ;
            N11480CCTNotEml = httpContext.cgiGet( "N11480CCTNotEml") ;
            AV7CCTCod = (int)(localUtil.ctol( httpContext.cgiGet( "vCCTCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV9CCTNotId = (short)(localUtil.ctol( httpContext.cgiGet( "vCCTNOTID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtCCTNotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtCCTNotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTNOTID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtCCTNotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11481CCTNotId = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
            }
            else
            {
               A11481CCTNotId = (short)(localUtil.ctol( httpContext.cgiGet( edtCCTNotId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
            }
            cmbCCTNotEvt.setValue( httpContext.cgiGet( cmbCCTNotEvt.getInternalname()) );
            A11477CCTNotEvt = httpContext.cgiGet( cmbCCTNotEvt.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11477CCTNotEvt", A11477CCTNotEvt);
            cmbCCTNotAdj.setValue( httpContext.cgiGet( cmbCCTNotAdj.getInternalname()) );
            A11525CCTNotAdj = (byte)(GXutil.lval( httpContext.cgiGet( cmbCCTNotAdj.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11525CCTNotAdj", GXutil.str( A11525CCTNotAdj, 1, 0));
            cmbCCTNotDst.setValue( httpContext.cgiGet( cmbCCTNotDst.getInternalname()) );
            A11478CCTNotDst = httpContext.cgiGet( cmbCCTNotDst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11478CCTNotDst", A11478CCTNotDst);
            dynCCTNotUsr.setValue( httpContext.cgiGet( dynCCTNotUsr.getInternalname()) );
            A11479CCTNotUsr = httpContext.cgiGet( dynCCTNotUsr.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11479CCTNotUsr", A11479CCTNotUsr);
            A11480CCTNotEml = httpContext.cgiGet( edtCCTNotEml_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11480CCTNotEml", A11480CCTNotEml);
            A11523CCTNotAsu = httpContext.cgiGet( edtCCTNotAsu_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11523CCTNotAsu", A11523CCTNotAsu);
            if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkCCTNotStp.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkCCTNotStp.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "CCTNOTSTP");
               AnyError = (short)(1) ;
               GX_FocusControl = chkCCTNotStp.getInternalname() ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A12733CCTNotStp = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12733CCTNotStp", GXutil.str( A12733CCTNotStp, 1, 0));
            }
            else
            {
               A12733CCTNotStp = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkCCTNotStp.getInternalname()), "1")==0) ? 1 : 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12733CCTNotStp", GXutil.str( A12733CCTNotStp, 1, 0));
            }
            A11524CCTNotTxt = httpContext.cgiGet( edtCCTNotTxt_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11524CCTNotTxt", A11524CCTNotTxt);
            AV13Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
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
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadNotificacion");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11481CCTNotId != Z11481CCTNotId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("controlcalidadhtd\\controlcalidadnotificacion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A11481CCTNotId = (short)(GXutil.lval( httpContext.GetPar( "CCTNotId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
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
                  sMode1529 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1529 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1529 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1SZ0( ) ;
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
                        e111SZ2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121SZ2 ();
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
         e121SZ2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1SZ1529( ) ;
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
         disableAttributes1SZ1529( ) ;
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

   public void confirm_1SZ0( )
   {
      beforeValidate1SZ1529( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1SZ1529( ) ;
         }
         else
         {
            checkExtendedTable1SZ1529( ) ;
            closeExtendedTableCursors1SZ1529( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1SZ0( )
   {
   }

   public void e111SZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV14Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlcalidadnotificacion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV14Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Station", AV14Station);
      GXv_char2[0] = AV8EmprCod ;
      GXv_char3[0] = AV15Emprnom ;
      GXv_char4[0] = AV16Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV14Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlcalidadnotificacion_impl.this.AV8EmprCod = GXv_char2[0] ;
      controlcalidadnotificacion_impl.this.AV15Emprnom = GXv_char3[0] ;
      controlcalidadnotificacion_impl.this.AV16Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV15Emprnom", AV15Emprnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV16Usurcod", AV16Usurcod);
      GXv_SdtWWPContext5[0] = AV10WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV10WWPContext = GXv_SdtWWPContext5[0] ;
      AV11TrnContext.fromxml(AV12WebSession.getValue("TrnContext"), null, null);
      edtCCTCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Visible), 5, 0), true);
      edtCCTDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Visible), 5, 0), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      lblTextblockinfo_Caption = httpContext.getMessage( "<span style=\"word-wrap:break-word;\">Nota: en el asunto y el encabezado del mail se puede usar:<br/> #HDR -> Nro de HDR, #Cliente -> Nombre Cliente, #Resultado -> Aprobado/Rechazado<span>", "") ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblockinfo_Internalname, "Caption", lblTextblockinfo_Caption, true);
   }

   public void e121SZ2( )
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

   public void zm1SZ1529( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11477CCTNotEvt = T01SZ3_A11477CCTNotEvt[0] ;
            Z11478CCTNotDst = T01SZ3_A11478CCTNotDst[0] ;
            Z11479CCTNotUsr = T01SZ3_A11479CCTNotUsr[0] ;
            Z11480CCTNotEml = T01SZ3_A11480CCTNotEml[0] ;
            Z11523CCTNotAsu = T01SZ3_A11523CCTNotAsu[0] ;
            Z11524CCTNotTxt = T01SZ3_A11524CCTNotTxt[0] ;
            Z11525CCTNotAdj = T01SZ3_A11525CCTNotAdj[0] ;
            Z12733CCTNotStp = T01SZ3_A12733CCTNotStp[0] ;
         }
         else
         {
            Z11477CCTNotEvt = A11477CCTNotEvt ;
            Z11478CCTNotDst = A11478CCTNotDst ;
            Z11479CCTNotUsr = A11479CCTNotUsr ;
            Z11480CCTNotEml = A11480CCTNotEml ;
            Z11523CCTNotAsu = A11523CCTNotAsu ;
            Z11524CCTNotTxt = A11524CCTNotTxt ;
            Z11525CCTNotAdj = A11525CCTNotAdj ;
            Z12733CCTNotStp = A12733CCTNotStp ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z11481CCTNotId = A11481CCTNotId ;
         Z11477CCTNotEvt = A11477CCTNotEvt ;
         Z11478CCTNotDst = A11478CCTNotDst ;
         Z11479CCTNotUsr = A11479CCTNotUsr ;
         Z11480CCTNotEml = A11480CCTNotEml ;
         Z11523CCTNotAsu = A11523CCTNotAsu ;
         Z11524CCTNotTxt = A11524CCTNotTxt ;
         Z11525CCTNotAdj = A11525CCTNotAdj ;
         Z12733CCTNotStp = A12733CCTNotStp ;
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z407EmprNom = A407EmprNom ;
         Z4036CCTDsc = A4036CCTDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      AV13Pgmname = "ControlCalidadHTD.ControlCalidadNotificacion" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Pgmname", AV13Pgmname);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (0==AV7CCTCod) )
      {
         A4031CCTCod = AV7CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      }
      if ( ! (0==AV7CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV7CCTCod) )
      {
         edtCCTCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         A396EmprCod = AV8EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9CCTNotId) )
      {
         A11481CCTNotId = AV9CCTNotId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
      }
      if ( ! (0==AV9CCTNotId) )
      {
         edtCCTNotId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTNotId_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), true);
      }
      if ( ! (0==AV9CCTNotId) )
      {
         edtCCTNotId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), true);
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
         /* Using cursor T01SZ4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T01SZ4_A407EmprNom[0] ;
         n407EmprNom = T01SZ4_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(2);
         /* Using cursor T01SZ5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01SZ5_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         pr_default.close(3);
      }
   }

   public void load1SZ1529( )
   {
      /* Using cursor T01SZ6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1529 = (short)(1) ;
         A4036CCTDsc = T01SZ6_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         A407EmprNom = T01SZ6_A407EmprNom[0] ;
         n407EmprNom = T01SZ6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A11477CCTNotEvt = T01SZ6_A11477CCTNotEvt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11477CCTNotEvt", A11477CCTNotEvt);
         A11478CCTNotDst = T01SZ6_A11478CCTNotDst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11478CCTNotDst", A11478CCTNotDst);
         A11479CCTNotUsr = T01SZ6_A11479CCTNotUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11479CCTNotUsr", A11479CCTNotUsr);
         A11480CCTNotEml = T01SZ6_A11480CCTNotEml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11480CCTNotEml", A11480CCTNotEml);
         A11523CCTNotAsu = T01SZ6_A11523CCTNotAsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11523CCTNotAsu", A11523CCTNotAsu);
         A11524CCTNotTxt = T01SZ6_A11524CCTNotTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11524CCTNotTxt", A11524CCTNotTxt);
         A11525CCTNotAdj = T01SZ6_A11525CCTNotAdj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11525CCTNotAdj", GXutil.str( A11525CCTNotAdj, 1, 0));
         A12733CCTNotStp = T01SZ6_A12733CCTNotStp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12733CCTNotStp", GXutil.str( A12733CCTNotStp, 1, 0));
         zm1SZ1529( -14) ;
      }
      pr_default.close(4);
      onLoadActions1SZ1529( ) ;
   }

   public void onLoadActions1SZ1529( )
   {
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "U", ""), "")) != 0 )
      {
         dynCCTNotUsr.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), true);
      }
      else
      {
         dynCCTNotUsr.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), true);
      }
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) != 0 )
      {
         edtCCTNotEml_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTNotEml_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), true);
      }
   }

   public void checkExtendedTable1SZ1529( )
   {
      nIsDirty_1529 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      /* Using cursor T01SZ4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SZ4_A407EmprNom[0] ;
      n407EmprNom = T01SZ4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T01SZ5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01SZ5_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      pr_default.close(3);
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "U", ""), "")) != 0 )
      {
         dynCCTNotUsr.setEnabled( 0 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), true);
      }
      else
      {
         dynCCTNotUsr.setEnabled( 1 );
         httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), true);
      }
      if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) != 0 )
      {
         edtCCTNotEml_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), true);
      }
      else
      {
         edtCCTNotEml_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), true);
      }
   }

   public void closeExtendedTableCursors1SZ1529( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod )
   {
      /* Using cursor T01SZ7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T01SZ7_A407EmprNom[0] ;
      n407EmprNom = T01SZ7_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A407EmprNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void gxload_16( String A396EmprCod ,
                          int A4031CCTCod )
   {
      /* Using cursor T01SZ8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A4036CCTDsc = T01SZ8_A4036CCTDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4036CCTDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey1SZ1529( )
   {
      /* Using cursor T01SZ9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1529 = (short)(1) ;
      }
      else
      {
         RcdFound1529 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01SZ3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1SZ1529( 14) ;
         RcdFound1529 = (short)(1) ;
         A11481CCTNotId = T01SZ3_A11481CCTNotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
         A11477CCTNotEvt = T01SZ3_A11477CCTNotEvt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11477CCTNotEvt", A11477CCTNotEvt);
         A11478CCTNotDst = T01SZ3_A11478CCTNotDst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11478CCTNotDst", A11478CCTNotDst);
         A11479CCTNotUsr = T01SZ3_A11479CCTNotUsr[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11479CCTNotUsr", A11479CCTNotUsr);
         A11480CCTNotEml = T01SZ3_A11480CCTNotEml[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11480CCTNotEml", A11480CCTNotEml);
         A11523CCTNotAsu = T01SZ3_A11523CCTNotAsu[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11523CCTNotAsu", A11523CCTNotAsu);
         A11524CCTNotTxt = T01SZ3_A11524CCTNotTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11524CCTNotTxt", A11524CCTNotTxt);
         A11525CCTNotAdj = T01SZ3_A11525CCTNotAdj[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11525CCTNotAdj", GXutil.str( A11525CCTNotAdj, 1, 0));
         A12733CCTNotStp = T01SZ3_A12733CCTNotStp[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12733CCTNotStp", GXutil.str( A12733CCTNotStp, 1, 0));
         A396EmprCod = T01SZ3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SZ3_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         Z396EmprCod = A396EmprCod ;
         Z4031CCTCod = A4031CCTCod ;
         Z11481CCTNotId = A11481CCTNotId ;
         sMode1529 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1SZ1529( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1529 = (short)(0) ;
            initializeNonKey1SZ1529( ) ;
         }
         Gx_mode = sMode1529 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1529 = (short)(0) ;
         initializeNonKey1SZ1529( ) ;
         sMode1529 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1529 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1SZ1529( ) ;
      if ( RcdFound1529 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1529 = (short)(0) ;
      /* Using cursor T01SZ10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SZ10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ10_A4031CCTCod[0] < A4031CCTCod ) || ( T01SZ10_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ10_A11481CCTNotId[0] < A11481CCTNotId ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01SZ10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ10_A4031CCTCod[0] > A4031CCTCod ) || ( T01SZ10_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SZ10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ10_A11481CCTNotId[0] > A11481CCTNotId ) ) )
         {
            A396EmprCod = T01SZ10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SZ10_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A11481CCTNotId = T01SZ10_A11481CCTNotId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
            RcdFound1529 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1529 = (short)(0) ;
      /* Using cursor T01SZ11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A4031CCTCod), Integer.valueOf(A4031CCTCod), A396EmprCod, Short.valueOf(A11481CCTNotId)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01SZ11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01SZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ11_A4031CCTCod[0] > A4031CCTCod ) || ( T01SZ11_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ11_A11481CCTNotId[0] > A11481CCTNotId ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01SZ11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01SZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ11_A4031CCTCod[0] < A4031CCTCod ) || ( T01SZ11_A4031CCTCod[0] == A4031CCTCod ) && ( GXutil.strcmp(T01SZ11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01SZ11_A11481CCTNotId[0] < A11481CCTNotId ) ) )
         {
            A396EmprCod = T01SZ11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A4031CCTCod = T01SZ11_A4031CCTCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
            A11481CCTNotId = T01SZ11_A11481CCTNotId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
            RcdFound1529 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1SZ1529( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtCCTNotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1SZ1529( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1529 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11481CCTNotId != Z11481CCTNotId ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A4031CCTCod = Z4031CCTCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
               A11481CCTNotId = Z11481CCTNotId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtCCTNotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1SZ1529( ) ;
               GX_FocusControl = edtCCTNotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11481CCTNotId != Z11481CCTNotId ) )
            {
               /* Insert record */
               GX_FocusControl = edtCCTNotId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1SZ1529( ) ;
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
                  GX_FocusControl = edtCCTNotId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1SZ1529( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A4031CCTCod != Z4031CCTCod ) || ( A11481CCTNotId != Z11481CCTNotId ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = Z4031CCTCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11481CCTNotId = Z11481CCTNotId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtCCTNotId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1SZ1529( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01SZ2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDefN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z11477CCTNotEvt, T01SZ2_A11477CCTNotEvt[0]) != 0 ) || ( GXutil.strcmp(Z11478CCTNotDst, T01SZ2_A11478CCTNotDst[0]) != 0 ) || ( GXutil.strcmp(Z11479CCTNotUsr, T01SZ2_A11479CCTNotUsr[0]) != 0 ) || ( GXutil.strcmp(Z11480CCTNotEml, T01SZ2_A11480CCTNotEml[0]) != 0 ) || ( GXutil.strcmp(Z11523CCTNotAsu, T01SZ2_A11523CCTNotAsu[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11524CCTNotTxt, T01SZ2_A11524CCTNotTxt[0]) != 0 ) || ( Z11525CCTNotAdj != T01SZ2_A11525CCTNotAdj[0] ) || ( Z12733CCTNotStp != T01SZ2_A12733CCTNotStp[0] ) )
         {
            if ( GXutil.strcmp(Z11477CCTNotEvt, T01SZ2_A11477CCTNotEvt[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotEvt");
               GXutil.writeLogRaw("Old: ",Z11477CCTNotEvt);
               GXutil.writeLogRaw("Current: ",T01SZ2_A11477CCTNotEvt[0]);
            }
            if ( GXutil.strcmp(Z11478CCTNotDst, T01SZ2_A11478CCTNotDst[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotDst");
               GXutil.writeLogRaw("Old: ",Z11478CCTNotDst);
               GXutil.writeLogRaw("Current: ",T01SZ2_A11478CCTNotDst[0]);
            }
            if ( GXutil.strcmp(Z11479CCTNotUsr, T01SZ2_A11479CCTNotUsr[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotUsr");
               GXutil.writeLogRaw("Old: ",Z11479CCTNotUsr);
               GXutil.writeLogRaw("Current: ",T01SZ2_A11479CCTNotUsr[0]);
            }
            if ( GXutil.strcmp(Z11480CCTNotEml, T01SZ2_A11480CCTNotEml[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotEml");
               GXutil.writeLogRaw("Old: ",Z11480CCTNotEml);
               GXutil.writeLogRaw("Current: ",T01SZ2_A11480CCTNotEml[0]);
            }
            if ( GXutil.strcmp(Z11523CCTNotAsu, T01SZ2_A11523CCTNotAsu[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotAsu");
               GXutil.writeLogRaw("Old: ",Z11523CCTNotAsu);
               GXutil.writeLogRaw("Current: ",T01SZ2_A11523CCTNotAsu[0]);
            }
            if ( GXutil.strcmp(Z11524CCTNotTxt, T01SZ2_A11524CCTNotTxt[0]) != 0 )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotTxt");
               GXutil.writeLogRaw("Old: ",Z11524CCTNotTxt);
               GXutil.writeLogRaw("Current: ",T01SZ2_A11524CCTNotTxt[0]);
            }
            if ( Z11525CCTNotAdj != T01SZ2_A11525CCTNotAdj[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotAdj");
               GXutil.writeLogRaw("Old: ",Z11525CCTNotAdj);
               GXutil.writeLogRaw("Current: ",T01SZ2_A11525CCTNotAdj[0]);
            }
            if ( Z12733CCTNotStp != T01SZ2_A12733CCTNotStp[0] )
            {
               GXutil.writeLogln("controlcalidadhtd.controlcalidadnotificacion:[seudo value changed for attri]"+"CCTNotStp");
               GXutil.writeLogRaw("Old: ",Z12733CCTNotStp);
               GXutil.writeLogRaw("Current: ",T01SZ2_A12733CCTNotStp[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCCDefN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1SZ1529( )
   {
      beforeValidate1SZ1529( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SZ1529( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1SZ1529( 0) ;
         checkOptimisticConcurrency1SZ1529( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SZ1529( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1SZ1529( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SZ12 */
                  pr_default.execute(10, new Object[] {Short.valueOf(A11481CCTNotId), A11477CCTNotEvt, A11478CCTNotDst, A11479CCTNotUsr, A11480CCTNotEml, A11523CCTNotAsu, A11524CCTNotTxt, Byte.valueOf(A11525CCTNotAdj), Byte.valueOf(A12733CCTNotStp), A396EmprCod, Integer.valueOf(A4031CCTCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDefN");
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
                        resetCaption1SZ0( ) ;
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
            load1SZ1529( ) ;
         }
         endLevel1SZ1529( ) ;
      }
      closeExtendedTableCursors1SZ1529( ) ;
   }

   public void update1SZ1529( )
   {
      beforeValidate1SZ1529( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1SZ1529( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SZ1529( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1SZ1529( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1SZ1529( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01SZ13 */
                  pr_default.execute(11, new Object[] {A11477CCTNotEvt, A11478CCTNotDst, A11479CCTNotUsr, A11480CCTNotEml, A11523CCTNotAsu, A11524CCTNotTxt, Byte.valueOf(A11525CCTNotAdj), Byte.valueOf(A12733CCTNotStp), A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDefN");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCCDefN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1SZ1529( ) ;
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
         endLevel1SZ1529( ) ;
      }
      closeExtendedTableCursors1SZ1529( ) ;
   }

   public void deferredUpdate1SZ1529( )
   {
   }

   public void delete( )
   {
      beforeValidate1SZ1529( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1SZ1529( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1SZ1529( ) ;
         afterConfirm1SZ1529( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1SZ1529( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01SZ14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod), Short.valueOf(A11481CCTNotId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCCDefN");
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
      sMode1529 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1SZ1529( ) ;
      Gx_mode = sMode1529 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1SZ1529( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T01SZ15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T01SZ15_A407EmprNom[0] ;
         n407EmprNom = T01SZ15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         /* Using cursor T01SZ16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
         A4036CCTDsc = T01SZ16_A4036CCTDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
         pr_default.close(14);
         if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "U", ""), "")) != 0 )
         {
            dynCCTNotUsr.setEnabled( 0 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), true);
         }
         else
         {
            dynCCTNotUsr.setEnabled( 1 );
            httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), true);
         }
         if ( GXutil.strcmp(A11478CCTNotDst, httpContext.getMessage( httpContext.getMessage( "M", ""), "")) != 0 )
         {
            edtCCTNotEml_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), true);
         }
         else
         {
            edtCCTNotEml_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), true);
         }
      }
   }

   public void endLevel1SZ1529( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1SZ1529( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidadnotificacion");
         if ( AnyError == 0 )
         {
            confirmValues1SZ0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "controlcalidadhtd.controlcalidadnotificacion");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1SZ1529( )
   {
      /* Scan By routine */
      /* Using cursor T01SZ17 */
      pr_default.execute(15);
      RcdFound1529 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1529 = (short)(1) ;
         A396EmprCod = T01SZ17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SZ17_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11481CCTNotId = T01SZ17_A11481CCTNotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1SZ1529( )
   {
      /* Scan next routine */
      pr_default.readNext(15);
      RcdFound1529 = (short)(0) ;
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound1529 = (short)(1) ;
         A396EmprCod = T01SZ17_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A4031CCTCod = T01SZ17_A4031CCTCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
         A11481CCTNotId = T01SZ17_A11481CCTNotId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
      }
   }

   public void scanEnd1SZ1529( )
   {
      pr_default.close(15);
   }

   public void afterConfirm1SZ1529( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1SZ1529( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1SZ1529( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1SZ1529( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1SZ1529( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1SZ1529( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1SZ1529( )
   {
      edtCCTNotId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotId_Enabled), 5, 0), true);
      cmbCCTNotEvt.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotEvt.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotEvt.getEnabled(), 5, 0), true);
      cmbCCTNotAdj.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotAdj.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotAdj.getEnabled(), 5, 0), true);
      cmbCCTNotDst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbCCTNotDst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbCCTNotDst.getEnabled(), 5, 0), true);
      dynCCTNotUsr.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, dynCCTNotUsr.getInternalname(), "Enabled", GXutil.ltrimstr( dynCCTNotUsr.getEnabled(), 5, 0), true);
      edtCCTNotEml_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotEml_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotEml_Enabled), 5, 0), true);
      edtCCTNotAsu_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotAsu_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotAsu_Enabled), 5, 0), true);
      chkCCTNotStp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTNotStp.getInternalname(), "Enabled", GXutil.ltrimstr( chkCCTNotStp.getEnabled(), 5, 0), true);
      edtCCTNotTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTNotTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTNotTxt_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtCCTCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTCod_Enabled), 5, 0), true);
      edtCCTDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCCTDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCCTDsc_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1SZ1529( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1SZ0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.controlcalidadnotificacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTNotId,4,0))}, new String[] {"Gx_mode","CCTCod","EmprCod","CCTNotId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"ControlCalidadNotificacion");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\controlcalidadnotificacion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4031CCTCod", GXutil.ltrim( localUtil.ntoc( Z4031CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11481CCTNotId", GXutil.ltrim( localUtil.ntoc( Z11481CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11477CCTNotEvt", GXutil.rtrim( Z11477CCTNotEvt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11478CCTNotDst", GXutil.rtrim( Z11478CCTNotDst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11479CCTNotUsr", GXutil.rtrim( Z11479CCTNotUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11480CCTNotEml", GXutil.rtrim( Z11480CCTNotEml));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11523CCTNotAsu", Z11523CCTNotAsu);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11524CCTNotTxt", Z11524CCTNotTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z11525CCTNotAdj", GXutil.ltrim( localUtil.ntoc( Z11525CCTNotAdj, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z12733CCTNotStp", GXutil.ltrim( localUtil.ntoc( Z12733CCTNotStp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N11479CCTNotUsr", GXutil.rtrim( A11479CCTNotUsr));
      app.GxWebStd.gx_hidden_field( httpContext, "N11480CCTNotEml", GXutil.rtrim( A11480CCTNotEml));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTCOD", GXutil.ltrim( localUtil.ntoc( AV7CCTCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV7CCTCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCTNOTID", GXutil.ltrim( localUtil.ntoc( AV9CCTNotId, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCTNOTID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV9CCTNotId), "ZZZ9")));
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
      return formatLink("app.controlcalidadhtd.controlcalidadnotificacion", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV7CCTCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV9CCTNotId,4,0))}, new String[] {"Gx_mode","CCTCod","EmprCod","CCTNotId"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.ControlCalidadNotificacion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control Calidad Notificacion", "") ;
   }

   public void initializeNonKey1SZ1529( )
   {
      A4036CCTDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", A4036CCTDsc);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A11477CCTNotEvt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11477CCTNotEvt", A11477CCTNotEvt);
      A11478CCTNotDst = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11478CCTNotDst", A11478CCTNotDst);
      A11479CCTNotUsr = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11479CCTNotUsr", A11479CCTNotUsr);
      A11480CCTNotEml = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11480CCTNotEml", A11480CCTNotEml);
      A11523CCTNotAsu = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11523CCTNotAsu", A11523CCTNotAsu);
      A11524CCTNotTxt = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11524CCTNotTxt", A11524CCTNotTxt);
      A11525CCTNotAdj = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11525CCTNotAdj", GXutil.str( A11525CCTNotAdj, 1, 0));
      A12733CCTNotStp = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12733CCTNotStp", GXutil.str( A12733CCTNotStp, 1, 0));
      Z11477CCTNotEvt = "" ;
      Z11478CCTNotDst = "" ;
      Z11479CCTNotUsr = "" ;
      Z11480CCTNotEml = "" ;
      Z11523CCTNotAsu = "" ;
      Z11524CCTNotTxt = "" ;
      Z11525CCTNotAdj = (byte)(0) ;
      Z12733CCTNotStp = (byte)(0) ;
   }

   public void initAll1SZ1529( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A4031CCTCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A4031CCTCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A4031CCTCod), 6, 0));
      A11481CCTNotId = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11481CCTNotId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11481CCTNotId), 4, 0));
      initializeNonKey1SZ1529( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211693962", true, true);
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
      httpContext.AddJavascriptSource("controlcalidadhtd/controlcalidadnotificacion.js", "?20268211693963", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtCCTNotId_Internalname = "CCTNOTID" ;
      cmbCCTNotEvt.setInternalname( "CCTNOTEVT" );
      cmbCCTNotAdj.setInternalname( "CCTNOTADJ" );
      cmbCCTNotDst.setInternalname( "CCTNOTDST" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      dynCCTNotUsr.setInternalname( "CCTNOTUSR" );
      edtCCTNotEml_Internalname = "CCTNOTEML" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtCCTNotAsu_Internalname = "CCTNOTASU" ;
      lblTextblockinfo_Internalname = "TEXTBLOCKINFO" ;
      tblTabletext_Internalname = "TABLETEXT" ;
      chkCCTNotStp.setInternalname( "CCTNOTSTP" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtCCTNotTxt_Internalname = "CCTNOTTXT" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtCCTCod_Internalname = "CCTCOD" ;
      edtCCTDsc_Internalname = "CCTDSC" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
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
      Form.setCaption( httpContext.getMessage( "Control Calidad Notificacion", "") );
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtCCTDsc_Jsonclick = "" ;
      edtCCTDsc_Enabled = 0 ;
      edtCCTDsc_Visible = 1 ;
      edtCCTCod_Jsonclick = "" ;
      edtCCTCod_Enabled = 1 ;
      edtCCTCod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtCCTNotTxt_Enabled = 1 ;
      chkCCTNotStp.setEnabled( 1 );
      lblTextblockinfo_Caption = "" ;
      edtCCTNotAsu_Enabled = 1 ;
      edtCCTNotEml_Jsonclick = "" ;
      edtCCTNotEml_Enabled = 1 ;
      dynCCTNotUsr.setJsonclick( "" );
      dynCCTNotUsr.setEnabled( 1 );
      cmbCCTNotDst.setJsonclick( "" );
      cmbCCTNotDst.setEnabled( 1 );
      cmbCCTNotAdj.setJsonclick( "" );
      cmbCCTNotAdj.setEnabled( 1 );
      cmbCCTNotEvt.setJsonclick( "" );
      cmbCCTNotEvt.setEnabled( 1 );
      edtCCTNotId_Jsonclick = "" ;
      edtCCTNotId_Enabled = 1 ;
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

   public void gxdlacctnotusr1SZ1( )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxdlacctnotusr_data1SZ1( ) ;
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

   public void gxacctnotusr_html1SZ1( )
   {
      String gxdynajaxvalue;
      gxdlacctnotusr_data1SZ1( ) ;
      gxdynajaxindex = 1 ;
      if ( ! ( gxdyncontrolsrefreshing && httpContext.isAjaxRequest( ) ) )
      {
         dynCCTNotUsr.removeAllItems();
      }
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         gxdynajaxvalue = gxdynajaxctrlcodr.item(gxdynajaxindex) ;
         dynCCTNotUsr.addItem(gxdynajaxvalue, gxdynajaxctrldescr.item(gxdynajaxindex), (short)(0));
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
      }
   }

   protected void gxdlacctnotusr_data1SZ1( )
   {
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      /* Using cursor T01SZ18 */
      pr_default.execute(16);
      while ( (pr_default.getStatus(16) != 101) )
      {
         gxdynajaxctrlcodr.add(GXutil.rtrim( T01SZ18_A850UsurCod[0]));
         gxdynajaxctrldescr.add(GXutil.rtrim( T01SZ18_A854UsurNom[0]));
         pr_default.readNext(16);
      }
      pr_default.close(16);
   }

   public void init_web_controls( )
   {
      cmbCCTNotEvt.setName( "CCTNOTEVT" );
      cmbCCTNotEvt.setWebtags( "" );
      cmbCCTNotEvt.addItem("E", httpContext.getMessage( "Si falla validación", ""), (short)(0));
      cmbCCTNotEvt.addItem("O", httpContext.getMessage( "Si esta todo Ok", ""), (short)(0));
      cmbCCTNotEvt.addItem("S", httpContext.getMessage( "Siempre", ""), (short)(0));
      if ( cmbCCTNotEvt.getItemCount() > 0 )
      {
         A11477CCTNotEvt = cmbCCTNotEvt.getValidValue(A11477CCTNotEvt) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11477CCTNotEvt", A11477CCTNotEvt);
      }
      cmbCCTNotAdj.setName( "CCTNOTADJ" );
      cmbCCTNotAdj.setWebtags( "" );
      cmbCCTNotAdj.addItem("0", httpContext.getMessage( "Datos en Mensaje", ""), (short)(0));
      cmbCCTNotAdj.addItem("1", httpContext.getMessage( "Datos en Adjunto", ""), (short)(0));
      if ( cmbCCTNotAdj.getItemCount() > 0 )
      {
         A11525CCTNotAdj = (byte)(GXutil.lval( cmbCCTNotAdj.getValidValue(GXutil.trim( GXutil.str( A11525CCTNotAdj, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11525CCTNotAdj", GXutil.str( A11525CCTNotAdj, 1, 0));
      }
      cmbCCTNotDst.setName( "CCTNOTDST" );
      cmbCCTNotDst.setWebtags( "" );
      cmbCCTNotDst.addItem("C", httpContext.getMessage( "Cliente", ""), (short)(0));
      cmbCCTNotDst.addItem("V", httpContext.getMessage( "Vendedor", ""), (short)(0));
      cmbCCTNotDst.addItem("U", httpContext.getMessage( "Usuario", ""), (short)(0));
      cmbCCTNotDst.addItem("M", httpContext.getMessage( "email específico", ""), (short)(0));
      if ( cmbCCTNotDst.getItemCount() > 0 )
      {
         A11478CCTNotDst = cmbCCTNotDst.getValidValue(A11478CCTNotDst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11478CCTNotDst", A11478CCTNotDst);
      }
      dynCCTNotUsr.setName( "CCTNOTUSR" );
      dynCCTNotUsr.setWebtags( "" );
      dynCCTNotUsr.removeAllItems();
      /* Using cursor T01SZ19 */
      pr_default.execute(17);
      while ( (pr_default.getStatus(17) != 101) )
      {
         dynCCTNotUsr.addItem(T01SZ19_A850UsurCod[0], T01SZ19_A854UsurNom[0], (short)(0));
         pr_default.readNext(17);
      }
      pr_default.close(17);
      if ( dynCCTNotUsr.getItemCount() > 0 )
      {
         A11479CCTNotUsr = dynCCTNotUsr.getValidValue(A11479CCTNotUsr) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11479CCTNotUsr", A11479CCTNotUsr);
      }
      chkCCTNotStp.setName( "CCTNOTSTP" );
      chkCCTNotStp.setWebtags( "" );
      chkCCTNotStp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCCTNotStp.getInternalname(), "TitleCaption", chkCCTNotStp.getCaption(), true);
      chkCCTNotStp.setCheckedValue( "0" );
      A12733CCTNotStp = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( A12733CCTNotStp, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "A12733CCTNotStp", GXutil.str( A12733CCTNotStp, 1, 0));
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
      A11479CCTNotUsr = dynCCTNotUsr.getValue() ;
      n407EmprNom = false ;
      /* Using cursor T01SZ15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T01SZ15_A407EmprNom[0] ;
      n407EmprNom = T01SZ15_n407EmprNom[0] ;
      pr_default.close(13);
      /* Using cursor T01SZ16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A4031CCTCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CCDef", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CCTCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A4036CCTDsc = T01SZ16_A4036CCTDsc[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
      httpContext.ajax_rsp_assign_attri("", false, "A4036CCTDsc", GXutil.rtrim( A4036CCTDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9CCTNotId',fld:'vCCTNOTID',pic:'ZZZ9',hsh:true},{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7CCTCod',fld:'vCCTCOD',pic:'ZZZZZ9',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV9CCTNotId',fld:'vCCTNOTID',pic:'ZZZ9',hsh:true},{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]}");
      setEventMetadata("AFTER TRN","{handler:'e121SZ2',iparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]");
      setEventMetadata("AFTER TRN",",oparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]}");
      setEventMetadata("VALID_CCTNOTID","{handler:'valid_Cctnotid',iparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]");
      setEventMetadata("VALID_CCTNOTID",",oparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]}");
      setEventMetadata("VALID_CCTNOTDST","{handler:'valid_Cctnotdst',iparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]");
      setEventMetadata("VALID_CCTNOTDST",",oparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]}");
      setEventMetadata("VALID_CCTCOD","{handler:'valid_Cctcod',iparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]");
      setEventMetadata("VALID_CCTCOD",",oparms:[{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A4031CCTCod',fld:'CCTCOD',pic:'ZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A4036CCTDsc',fld:'CCTDSC',pic:''},{av:'dynCCTNotUsr'},{av:'A11479CCTNotUsr',fld:'CCTNOTUSR',pic:''},{av:'A12733CCTNotStp',fld:'CCTNOTSTP',pic:'9'}]}");
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
      wcpOAV8EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11477CCTNotEvt = "" ;
      Z11478CCTNotDst = "" ;
      Z11479CCTNotUsr = "" ;
      Z11480CCTNotEml = "" ;
      Z11523CCTNotAsu = "" ;
      Z11524CCTNotTxt = "" ;
      N11479CCTNotUsr = "" ;
      N11480CCTNotEml = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV8EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11477CCTNotEvt = "" ;
      A11478CCTNotDst = "" ;
      A11479CCTNotUsr = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11480CCTNotEml = "" ;
      A11523CCTNotAsu = "" ;
      sStyleString = "" ;
      lblTextblockinfo_Jsonclick = "" ;
      A11524CCTNotTxt = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV13Pgmname = "" ;
      A4036CCTDsc = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1529 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV14Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV15Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV16Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV10WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV11TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV12WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      Z4036CCTDsc = "" ;
      T01SZ4_A407EmprNom = new String[] {""} ;
      T01SZ4_n407EmprNom = new boolean[] {false} ;
      T01SZ5_A4036CCTDsc = new String[] {""} ;
      T01SZ6_A11481CCTNotId = new short[1] ;
      T01SZ6_A4036CCTDsc = new String[] {""} ;
      T01SZ6_A407EmprNom = new String[] {""} ;
      T01SZ6_n407EmprNom = new boolean[] {false} ;
      T01SZ6_A11477CCTNotEvt = new String[] {""} ;
      T01SZ6_A11478CCTNotDst = new String[] {""} ;
      T01SZ6_A11479CCTNotUsr = new String[] {""} ;
      T01SZ6_A11480CCTNotEml = new String[] {""} ;
      T01SZ6_A11523CCTNotAsu = new String[] {""} ;
      T01SZ6_A11524CCTNotTxt = new String[] {""} ;
      T01SZ6_A11525CCTNotAdj = new byte[1] ;
      T01SZ6_A12733CCTNotStp = new byte[1] ;
      T01SZ6_A396EmprCod = new String[] {""} ;
      T01SZ6_A4031CCTCod = new int[1] ;
      T01SZ7_A407EmprNom = new String[] {""} ;
      T01SZ7_n407EmprNom = new boolean[] {false} ;
      T01SZ8_A4036CCTDsc = new String[] {""} ;
      T01SZ9_A396EmprCod = new String[] {""} ;
      T01SZ9_A4031CCTCod = new int[1] ;
      T01SZ9_A11481CCTNotId = new short[1] ;
      T01SZ3_A11481CCTNotId = new short[1] ;
      T01SZ3_A11477CCTNotEvt = new String[] {""} ;
      T01SZ3_A11478CCTNotDst = new String[] {""} ;
      T01SZ3_A11479CCTNotUsr = new String[] {""} ;
      T01SZ3_A11480CCTNotEml = new String[] {""} ;
      T01SZ3_A11523CCTNotAsu = new String[] {""} ;
      T01SZ3_A11524CCTNotTxt = new String[] {""} ;
      T01SZ3_A11525CCTNotAdj = new byte[1] ;
      T01SZ3_A12733CCTNotStp = new byte[1] ;
      T01SZ3_A396EmprCod = new String[] {""} ;
      T01SZ3_A4031CCTCod = new int[1] ;
      T01SZ10_A396EmprCod = new String[] {""} ;
      T01SZ10_A4031CCTCod = new int[1] ;
      T01SZ10_A11481CCTNotId = new short[1] ;
      T01SZ11_A396EmprCod = new String[] {""} ;
      T01SZ11_A4031CCTCod = new int[1] ;
      T01SZ11_A11481CCTNotId = new short[1] ;
      T01SZ2_A11481CCTNotId = new short[1] ;
      T01SZ2_A11477CCTNotEvt = new String[] {""} ;
      T01SZ2_A11478CCTNotDst = new String[] {""} ;
      T01SZ2_A11479CCTNotUsr = new String[] {""} ;
      T01SZ2_A11480CCTNotEml = new String[] {""} ;
      T01SZ2_A11523CCTNotAsu = new String[] {""} ;
      T01SZ2_A11524CCTNotTxt = new String[] {""} ;
      T01SZ2_A11525CCTNotAdj = new byte[1] ;
      T01SZ2_A12733CCTNotStp = new byte[1] ;
      T01SZ2_A396EmprCod = new String[] {""} ;
      T01SZ2_A4031CCTCod = new int[1] ;
      T01SZ15_A407EmprNom = new String[] {""} ;
      T01SZ15_n407EmprNom = new boolean[] {false} ;
      T01SZ16_A4036CCTDsc = new String[] {""} ;
      T01SZ17_A396EmprCod = new String[] {""} ;
      T01SZ17_A4031CCTCod = new int[1] ;
      T01SZ17_A11481CCTNotId = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      T01SZ18_A850UsurCod = new String[] {""} ;
      T01SZ18_A854UsurNom = new String[] {""} ;
      T01SZ18_n854UsurNom = new boolean[] {false} ;
      T01SZ19_A850UsurCod = new String[] {""} ;
      T01SZ19_A854UsurNom = new String[] {""} ;
      T01SZ19_n854UsurNom = new boolean[] {false} ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadnotificacion__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadnotificacion__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadnotificacion__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadnotificacion__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.controlcalidadnotificacion__default(),
         new Object[] {
             new Object[] {
            T01SZ2_A11481CCTNotId, T01SZ2_A11477CCTNotEvt, T01SZ2_A11478CCTNotDst, T01SZ2_A11479CCTNotUsr, T01SZ2_A11480CCTNotEml, T01SZ2_A11523CCTNotAsu, T01SZ2_A11524CCTNotTxt, T01SZ2_A11525CCTNotAdj, T01SZ2_A12733CCTNotStp, T01SZ2_A396EmprCod,
            T01SZ2_A4031CCTCod
            }
            , new Object[] {
            T01SZ3_A11481CCTNotId, T01SZ3_A11477CCTNotEvt, T01SZ3_A11478CCTNotDst, T01SZ3_A11479CCTNotUsr, T01SZ3_A11480CCTNotEml, T01SZ3_A11523CCTNotAsu, T01SZ3_A11524CCTNotTxt, T01SZ3_A11525CCTNotAdj, T01SZ3_A12733CCTNotStp, T01SZ3_A396EmprCod,
            T01SZ3_A4031CCTCod
            }
            , new Object[] {
            T01SZ4_A407EmprNom, T01SZ4_n407EmprNom
            }
            , new Object[] {
            T01SZ5_A4036CCTDsc
            }
            , new Object[] {
            T01SZ6_A11481CCTNotId, T01SZ6_A4036CCTDsc, T01SZ6_A407EmprNom, T01SZ6_n407EmprNom, T01SZ6_A11477CCTNotEvt, T01SZ6_A11478CCTNotDst, T01SZ6_A11479CCTNotUsr, T01SZ6_A11480CCTNotEml, T01SZ6_A11523CCTNotAsu, T01SZ6_A11524CCTNotTxt,
            T01SZ6_A11525CCTNotAdj, T01SZ6_A12733CCTNotStp, T01SZ6_A396EmprCod, T01SZ6_A4031CCTCod
            }
            , new Object[] {
            T01SZ7_A407EmprNom, T01SZ7_n407EmprNom
            }
            , new Object[] {
            T01SZ8_A4036CCTDsc
            }
            , new Object[] {
            T01SZ9_A396EmprCod, T01SZ9_A4031CCTCod, T01SZ9_A11481CCTNotId
            }
            , new Object[] {
            T01SZ10_A396EmprCod, T01SZ10_A4031CCTCod, T01SZ10_A11481CCTNotId
            }
            , new Object[] {
            T01SZ11_A396EmprCod, T01SZ11_A4031CCTCod, T01SZ11_A11481CCTNotId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01SZ15_A407EmprNom, T01SZ15_n407EmprNom
            }
            , new Object[] {
            T01SZ16_A4036CCTDsc
            }
            , new Object[] {
            T01SZ17_A396EmprCod, T01SZ17_A4031CCTCod, T01SZ17_A11481CCTNotId
            }
            , new Object[] {
            T01SZ18_A850UsurCod, T01SZ18_A854UsurNom, T01SZ18_n854UsurNom
            }
            , new Object[] {
            T01SZ19_A850UsurCod, T01SZ19_A854UsurNom, T01SZ19_n854UsurNom
            }
         }
      );
      AV13Pgmname = "ControlCalidadHTD.ControlCalidadNotificacion" ;
   }

   private byte Z11525CCTNotAdj ;
   private byte Z12733CCTNotStp ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11525CCTNotAdj ;
   private byte A12733CCTNotStp ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short wcpOAV9CCTNotId ;
   private short Z11481CCTNotId ;
   private short AV9CCTNotId ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A11481CCTNotId ;
   private short RcdFound1529 ;
   private short nIsDirty_1529 ;
   private int wcpOAV7CCTCod ;
   private int Z4031CCTCod ;
   private int A4031CCTCod ;
   private int AV7CCTCod ;
   private int trnEnded ;
   private int edtCCTNotId_Enabled ;
   private int edtCCTNotEml_Enabled ;
   private int edtCCTNotAsu_Enabled ;
   private int edtCCTNotTxt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtCCTCod_Visible ;
   private int edtCCTCod_Enabled ;
   private int edtCCTDsc_Visible ;
   private int edtCCTDsc_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private int gxdynajaxindex ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV8EmprCod ;
   private String Z396EmprCod ;
   private String Z11477CCTNotEvt ;
   private String Z11478CCTNotDst ;
   private String Z11479CCTNotUsr ;
   private String Z11480CCTNotEml ;
   private String N11479CCTNotUsr ;
   private String N11480CCTNotEml ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV8EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtCCTNotId_Internalname ;
   private String A11477CCTNotEvt ;
   private String A11478CCTNotDst ;
   private String A11479CCTNotUsr ;
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
   private String edtCCTNotId_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtCCTNotEml_Internalname ;
   private String A11480CCTNotEml ;
   private String edtCCTNotEml_Jsonclick ;
   private String edtCCTNotAsu_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String sStyleString ;
   private String tblTabletext_Internalname ;
   private String lblTextblockinfo_Internalname ;
   private String lblTextblockinfo_Caption ;
   private String lblTextblockinfo_Jsonclick ;
   private String edtCCTNotTxt_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV13Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtCCTCod_Internalname ;
   private String edtCCTCod_Jsonclick ;
   private String edtCCTDsc_Internalname ;
   private String A4036CCTDsc ;
   private String edtCCTDsc_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String hsh ;
   private String sMode1529 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV14Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV15Emprnom ;
   private String GXv_char3[] ;
   private String AV16Usurcod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z4036CCTDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
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
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean n407EmprNom ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private boolean gxdyncontrolsrefreshing ;
   private String Z11523CCTNotAsu ;
   private String Z11524CCTNotTxt ;
   private String A11523CCTNotAsu ;
   private String A11524CCTNotTxt ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.WebSession AV12WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbCCTNotEvt ;
   private HTMLChoice cmbCCTNotAdj ;
   private HTMLChoice cmbCCTNotDst ;
   private HTMLChoice dynCCTNotUsr ;
   private ICheckbox chkCCTNotStp ;
   private IDataStoreProvider pr_default ;
   private String[] T01SZ4_A407EmprNom ;
   private boolean[] T01SZ4_n407EmprNom ;
   private String[] T01SZ5_A4036CCTDsc ;
   private short[] T01SZ6_A11481CCTNotId ;
   private String[] T01SZ6_A4036CCTDsc ;
   private String[] T01SZ6_A407EmprNom ;
   private boolean[] T01SZ6_n407EmprNom ;
   private String[] T01SZ6_A11477CCTNotEvt ;
   private String[] T01SZ6_A11478CCTNotDst ;
   private String[] T01SZ6_A11479CCTNotUsr ;
   private String[] T01SZ6_A11480CCTNotEml ;
   private String[] T01SZ6_A11523CCTNotAsu ;
   private String[] T01SZ6_A11524CCTNotTxt ;
   private byte[] T01SZ6_A11525CCTNotAdj ;
   private byte[] T01SZ6_A12733CCTNotStp ;
   private String[] T01SZ6_A396EmprCod ;
   private int[] T01SZ6_A4031CCTCod ;
   private String[] T01SZ7_A407EmprNom ;
   private boolean[] T01SZ7_n407EmprNom ;
   private String[] T01SZ8_A4036CCTDsc ;
   private String[] T01SZ9_A396EmprCod ;
   private int[] T01SZ9_A4031CCTCod ;
   private short[] T01SZ9_A11481CCTNotId ;
   private short[] T01SZ3_A11481CCTNotId ;
   private String[] T01SZ3_A11477CCTNotEvt ;
   private String[] T01SZ3_A11478CCTNotDst ;
   private String[] T01SZ3_A11479CCTNotUsr ;
   private String[] T01SZ3_A11480CCTNotEml ;
   private String[] T01SZ3_A11523CCTNotAsu ;
   private String[] T01SZ3_A11524CCTNotTxt ;
   private byte[] T01SZ3_A11525CCTNotAdj ;
   private byte[] T01SZ3_A12733CCTNotStp ;
   private String[] T01SZ3_A396EmprCod ;
   private int[] T01SZ3_A4031CCTCod ;
   private String[] T01SZ10_A396EmprCod ;
   private int[] T01SZ10_A4031CCTCod ;
   private short[] T01SZ10_A11481CCTNotId ;
   private String[] T01SZ11_A396EmprCod ;
   private int[] T01SZ11_A4031CCTCod ;
   private short[] T01SZ11_A11481CCTNotId ;
   private short[] T01SZ2_A11481CCTNotId ;
   private String[] T01SZ2_A11477CCTNotEvt ;
   private String[] T01SZ2_A11478CCTNotDst ;
   private String[] T01SZ2_A11479CCTNotUsr ;
   private String[] T01SZ2_A11480CCTNotEml ;
   private String[] T01SZ2_A11523CCTNotAsu ;
   private String[] T01SZ2_A11524CCTNotTxt ;
   private byte[] T01SZ2_A11525CCTNotAdj ;
   private byte[] T01SZ2_A12733CCTNotStp ;
   private String[] T01SZ2_A396EmprCod ;
   private int[] T01SZ2_A4031CCTCod ;
   private String[] T01SZ15_A407EmprNom ;
   private boolean[] T01SZ15_n407EmprNom ;
   private String[] T01SZ16_A4036CCTDsc ;
   private String[] T01SZ17_A396EmprCod ;
   private int[] T01SZ17_A4031CCTCod ;
   private short[] T01SZ17_A11481CCTNotId ;
   private String[] T01SZ18_A850UsurCod ;
   private String[] T01SZ18_A854UsurNom ;
   private boolean[] T01SZ18_n854UsurNom ;
   private String[] T01SZ19_A850UsurCod ;
   private String[] T01SZ19_A854UsurNom ;
   private boolean[] T01SZ19_n854UsurNom ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV10WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV11TrnContext ;
}

final  class controlcalidadnotificacion__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadnotificacion__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadnotificacion__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadnotificacion__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class controlcalidadnotificacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01SZ2", "SELECT CCTNotId, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj, CCTNotStp, EmprCod, CCTCod FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ?  FOR UPDATE OF CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj, CCTNotStp NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ3", "SELECT CCTNotId, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj, CCTNotStp, EmprCod, CCTCod FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ5", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ6", "SELECT /*+ FIRST_ROWS(100) */ TM1.CCTNotId, T3.CCTDsc, T2.EmprNom, TM1.CCTNotEvt, TM1.CCTNotDst, TM1.CCTNotUsr, TM1.CCTNotEml, TM1.CCTNotAsu, TM1.CCTNotTxt, TM1.CCTNotAdj, TM1.CCTNotStp, TM1.EmprCod, TM1.CCTCod FROM ((TXPCCDefN TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCCDef T3 ON T3.EmprCod = TM1.EmprCod AND T3.CCTCod = TM1.CCTCod) WHERE TM1.EmprCod = ? and TM1.CCTCod = ? and TM1.CCTNotId = ? ORDER BY TM1.EmprCod, TM1.CCTCod, TM1.CCTNotId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ8", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTNotId FROM TXPCCDefN WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTNotId FROM TXPCCDefN WHERE ( EmprCod > ? or EmprCod = ? and CCTCod > ? or CCTCod = ? and EmprCod = ? and CCTNotId > ?) ORDER BY EmprCod, CCTCod, CCTNotId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01SZ11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, CCTCod, CCTNotId FROM TXPCCDefN WHERE ( EmprCod < ? or EmprCod = ? and CCTCod < ? or CCTCod = ? and EmprCod = ? and CCTNotId < ?) ORDER BY EmprCod DESC, CCTCod DESC, CCTNotId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01SZ12", "INSERT INTO TXPCCDefN(CCTNotId, CCTNotEvt, CCTNotDst, CCTNotUsr, CCTNotEml, CCTNotAsu, CCTNotTxt, CCTNotAdj, CCTNotStp, EmprCod, CCTCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCCDefN")
         ,new UpdateCursor("T01SZ13", "UPDATE TXPCCDefN SET CCTNotEvt=?, CCTNotDst=?, CCTNotUsr=?, CCTNotEml=?, CCTNotAsu=?, CCTNotTxt=?, CCTNotAdj=?, CCTNotStp=?  WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ?", GX_NOMASK, "TXPCCDefN")
         ,new UpdateCursor("T01SZ14", "DELETE FROM TXPCCDefN  WHERE EmprCod = ? AND CCTCod = ? AND CCTNotId = ?", GX_NOMASK, "TXPCCDefN")
         ,new ForEachCursor("T01SZ15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ16", "SELECT CCTDsc FROM TXPCCDef WHERE EmprCod = ? AND CCTCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ17", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, CCTCod, CCTNotId FROM TXPCCDefN ORDER BY EmprCod, CCTCod, CCTNotId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ18", "SELECT UsurCod, UsurNom FROM TXPUSUARI ORDER BY UsurNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01SZ19", "SELECT UsurCod, UsurNom FROM TXPUSUARI ORDER BY UsurNom ",true, GX_NOMASK, false, this,0, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 120);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 120);
               ((String[]) buf[5])[0] = rslt.getVarchar(6);
               ((String[]) buf[6])[0] = rslt.getVarchar(7);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((String[]) buf[6])[0] = rslt.getString(6, 8);
               ((String[]) buf[7])[0] = rslt.getString(7, 120);
               ((String[]) buf[8])[0] = rslt.getVarchar(8);
               ((String[]) buf[9])[0] = rslt.getVarchar(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((byte[]) buf[11])[0] = rslt.getByte(11);
               ((String[]) buf[12])[0] = rslt.getString(12, 3);
               ((int[]) buf[13])[0] = rslt.getInt(13);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 35);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 3);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 10 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 120);
               stmt.setVarchar(6, (String)parms[5], 200, false);
               stmt.setVarchar(7, (String)parms[6], 2000, false);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 3);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 1);
               stmt.setString(2, (String)parms[1], 1);
               stmt.setString(3, (String)parms[2], 8);
               stmt.setString(4, (String)parms[3], 120);
               stmt.setVarchar(5, (String)parms[4], 200, false);
               stmt.setVarchar(6, (String)parms[5], 2000, false);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

