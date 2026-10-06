package app.mantenimientomaquina ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tmsolic_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"SMCOD") == 0 )
      {
         AV13SMCod = (int)(GXutil.lval( httpContext.GetPar( "SMCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13SMCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13SMCod), "ZZZZZZZ9")));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asasmcod13X1241( AV13SMCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"SMCOD") == 0 )
      {
         Gx_mode = httpContext.GetPar( "Mode") ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asasmcod13X1241( Gx_mode, A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_21") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_21( A396EmprCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9520SMMaqCod = httpContext.GetPar( "SMMaqCod") ;
         n9520SMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9520SMMaqCod", A9520SMMaqCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A9520SMMaqCod) ;
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
            AV14EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14EmprCod", AV14EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14EmprCod, "@!"))));
            AV13SMCod = (int)(GXutil.lval( httpContext.GetPar( "SMCod"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13SMCod), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13SMCod), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Solicitudes de Mantenimiento", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSMDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tmsolic_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tmsolic_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tmsolic_impl.class ));
   }

   public tmsolic_impl( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbSMCal = new HTMLChoice();
      cmbSMEst = new HTMLChoice();
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
      if ( cmbSMCal.getItemCount() > 0 )
      {
         A9524SMCal = (byte)(GXutil.lval( cmbSMCal.getValidValue(GXutil.trim( GXutil.str( A9524SMCal, 1, 0))))) ;
         n9524SMCal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9524SMCal", GXutil.str( A9524SMCal, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbSMCal.setValue( GXutil.trim( GXutil.str( A9524SMCal, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSMCal.getInternalname(), "Values", cmbSMCal.ToJavascriptSource(), true);
      }
      if ( cmbSMEst.getItemCount() > 0 )
      {
         A9522SMEst = cmbSMEst.getValidValue(A9522SMEst) ;
         n9522SMEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbSMEst.setValue( GXutil.rtrim( A9522SMEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSMEst.getInternalname(), "Values", cmbSMEst.ToJavascriptSource(), true);
      }
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMCod_Internalname, httpContext.getMessage( "Solicitud", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMCod_Internalname, GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A9428SMCod), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSMCod_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMDsc_Internalname, GXutil.rtrim( A9517SMDsc), GXutil.rtrim( localUtil.format( A9517SMDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSMDsc_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMPri_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMPri_Internalname, httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMPri_Internalname, GXutil.ltrim( localUtil.ntoc( A11534SMPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSMPri_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A11534SMPri), "9") : localUtil.format( DecimalUtil.doubleToDec(A11534SMPri), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMPri_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSMPri_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMFchCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMFchCre_Internalname, httpContext.getMessage( "Fecha de Creación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtSMFchCre_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMFchCre_Internalname, localUtil.ttoc( A9518SMFchCre, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A9518SMFchCre, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMFchCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSMFchCre_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSMFchCre_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSMFchCre_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMUsuCre_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMUsuCre_Internalname, httpContext.getMessage( "Creación Usuario", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMUsuCre_Internalname, GXutil.rtrim( A9519SMUsuCre), GXutil.rtrim( localUtil.format( A9519SMUsuCre, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMUsuCre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSMUsuCre_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedsmmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocksmmaqcod_Internalname, httpContext.getMessage( "Máquina", ""), "", "", lblTextblocksmmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_smmaqcod.setProperty("Caption", Combo_smmaqcod_Caption);
      ucCombo_smmaqcod.setProperty("Cls", Combo_smmaqcod_Cls);
      ucCombo_smmaqcod.setProperty("EmptyItem", Combo_smmaqcod_Emptyitem);
      ucCombo_smmaqcod.setProperty("DropDownOptionsTitleSettingsIcons", AV23DDO_TitleSettingsIcons);
      ucCombo_smmaqcod.setProperty("DropDownOptionsData", AV22SMMaqCod_Data);
      ucCombo_smmaqcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_smmaqcod_Internalname, "COMBO_SMMAQCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMMaqCod_Internalname, httpContext.getMessage( "Máquina", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMMaqCod_Internalname, GXutil.rtrim( A9520SMMaqCod), GXutil.rtrim( localUtil.format( A9520SMMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMMaqCod_Jsonclick, 0, "Attribute", "", "", "", "", edtSMMaqCod_Visible, edtSMMaqCod_Enabled, 1, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbSMCal.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbSMCal.getInternalname(), httpContext.getMessage( "Calificación", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbSMCal, cmbSMCal.getInternalname(), GXutil.trim( GXutil.str( A9524SMCal, 1, 0)), 1, cmbSMCal.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbSMCal.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMSolic.htm");
      cmbSMCal.setValue( GXutil.trim( GXutil.str( A9524SMCal, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMCal.getInternalname(), "Values", cmbSMCal.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbSMEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbSMEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbSMEst, cmbSMEst.getInternalname(), GXutil.rtrim( A9522SMEst), 1, cmbSMEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbSMEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_MantenimientoMaquina\\TMSolic.htm");
      cmbSMEst.setValue( GXutil.rtrim( A9522SMEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMEst.getInternalname(), "Values", cmbSMEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSMTxt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSMTxt_Internalname, httpContext.getMessage( "Texto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 71,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtSMTxt_Internalname, A9523SMTxt, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,71);\"", (short)(0), 1, edtSMTxt_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_MantenimientoMaquina\\TMSolic.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_MantenimientoMaquina\\TMSolic.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV27Pgmname), GXutil.rtrim( localUtil.format( AV27Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_smmaqcod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombosmmaqcod_Internalname, GXutil.rtrim( AV25ComboSMMaqCod), GXutil.rtrim( localUtil.format( AV25ComboSMMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombosmmaqcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombosmmaqcod_Visible, edtavCombosmmaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,93);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, edtEmprCod_Enabled, 1, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtEmprNom_Internalname, GXutil.rtrim( A407EmprNom), GXutil.rtrim( localUtil.format( A407EmprNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprNom_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprNom_Visible, edtEmprNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSMMaqDsc_Internalname, GXutil.rtrim( A9521SMMaqDsc), GXutil.rtrim( localUtil.format( A9521SMMaqDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSMMaqDsc_Jsonclick, 0, "Attribute", "", "", "", "", edtSMMaqDsc_Visible, edtSMMaqDsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MantenimientoMaquina\\TMSolic.htm");
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
      e1113X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV23DDO_TitleSettingsIcons);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSMMAQCOD_DATA"), AV22SMMaqCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z9428SMCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9517SMDsc = httpContext.cgiGet( "Z9517SMDsc") ;
            Z9518SMFchCre = localUtil.ctot( httpContext.cgiGet( "Z9518SMFchCre"), 0) ;
            Z9519SMUsuCre = httpContext.cgiGet( "Z9519SMUsuCre") ;
            Z9522SMEst = httpContext.cgiGet( "Z9522SMEst") ;
            Z9523SMTxt = httpContext.cgiGet( "Z9523SMTxt") ;
            Z9524SMCal = (byte)(localUtil.ctol( httpContext.cgiGet( "Z9524SMCal"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11534SMPri = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11534SMPri"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z9520SMMaqCod = httpContext.cgiGet( "Z9520SMMaqCod") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N9520SMMaqCod = httpContext.cgiGet( "N9520SMMaqCod") ;
            AV14EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13SMCod = (int)(localUtil.ctol( httpContext.cgiGet( "vSMCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV15Insert_SMMaqCod = httpContext.cgiGet( "vINSERT_SMMAQCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV8UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            Combo_smmaqcod_Objectcall = httpContext.cgiGet( "COMBO_SMMAQCOD_Objectcall") ;
            Combo_smmaqcod_Class = httpContext.cgiGet( "COMBO_SMMAQCOD_Class") ;
            Combo_smmaqcod_Icontype = httpContext.cgiGet( "COMBO_SMMAQCOD_Icontype") ;
            Combo_smmaqcod_Icon = httpContext.cgiGet( "COMBO_SMMAQCOD_Icon") ;
            Combo_smmaqcod_Caption = httpContext.cgiGet( "COMBO_SMMAQCOD_Caption") ;
            Combo_smmaqcod_Tooltip = httpContext.cgiGet( "COMBO_SMMAQCOD_Tooltip") ;
            Combo_smmaqcod_Cls = httpContext.cgiGet( "COMBO_SMMAQCOD_Cls") ;
            Combo_smmaqcod_Selectedvalue_set = httpContext.cgiGet( "COMBO_SMMAQCOD_Selectedvalue_set") ;
            Combo_smmaqcod_Selectedvalue_get = httpContext.cgiGet( "COMBO_SMMAQCOD_Selectedvalue_get") ;
            Combo_smmaqcod_Selectedtext_set = httpContext.cgiGet( "COMBO_SMMAQCOD_Selectedtext_set") ;
            Combo_smmaqcod_Selectedtext_get = httpContext.cgiGet( "COMBO_SMMAQCOD_Selectedtext_get") ;
            Combo_smmaqcod_Gamoauthtoken = httpContext.cgiGet( "COMBO_SMMAQCOD_Gamoauthtoken") ;
            Combo_smmaqcod_Ddointernalname = httpContext.cgiGet( "COMBO_SMMAQCOD_Ddointernalname") ;
            Combo_smmaqcod_Titlecontrolalign = httpContext.cgiGet( "COMBO_SMMAQCOD_Titlecontrolalign") ;
            Combo_smmaqcod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_SMMAQCOD_Dropdownoptionstype") ;
            Combo_smmaqcod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Enabled")) ;
            Combo_smmaqcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Visible")) ;
            Combo_smmaqcod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_SMMAQCOD_Titlecontrolidtoreplace") ;
            Combo_smmaqcod_Datalisttype = httpContext.cgiGet( "COMBO_SMMAQCOD_Datalisttype") ;
            Combo_smmaqcod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Allowmultipleselection")) ;
            Combo_smmaqcod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_SMMAQCOD_Datalistfixedvalues") ;
            Combo_smmaqcod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Isgriditem")) ;
            Combo_smmaqcod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Hasdescription")) ;
            Combo_smmaqcod_Datalistproc = httpContext.cgiGet( "COMBO_SMMAQCOD_Datalistproc") ;
            Combo_smmaqcod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_SMMAQCOD_Datalistprocparametersprefix") ;
            Combo_smmaqcod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_SMMAQCOD_Remoteservicesparameters") ;
            Combo_smmaqcod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_SMMAQCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_smmaqcod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Includeonlyselectedoption")) ;
            Combo_smmaqcod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Includeselectalloption")) ;
            Combo_smmaqcod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Emptyitem")) ;
            Combo_smmaqcod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_SMMAQCOD_Includeaddnewoption")) ;
            Combo_smmaqcod_Htmltemplate = httpContext.cgiGet( "COMBO_SMMAQCOD_Htmltemplate") ;
            Combo_smmaqcod_Multiplevaluestype = httpContext.cgiGet( "COMBO_SMMAQCOD_Multiplevaluestype") ;
            Combo_smmaqcod_Loadingdata = httpContext.cgiGet( "COMBO_SMMAQCOD_Loadingdata") ;
            Combo_smmaqcod_Noresultsfound = httpContext.cgiGet( "COMBO_SMMAQCOD_Noresultsfound") ;
            Combo_smmaqcod_Emptyitemtext = httpContext.cgiGet( "COMBO_SMMAQCOD_Emptyitemtext") ;
            Combo_smmaqcod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_SMMAQCOD_Onlyselectedvalues") ;
            Combo_smmaqcod_Selectalltext = httpContext.cgiGet( "COMBO_SMMAQCOD_Selectalltext") ;
            Combo_smmaqcod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_SMMAQCOD_Multiplevaluesseparator") ;
            Combo_smmaqcod_Addnewoptiontext = httpContext.cgiGet( "COMBO_SMMAQCOD_Addnewoptiontext") ;
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
            A9428SMCod = (int)(localUtil.ctol( httpContext.cgiGet( edtSMCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n9428SMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            A9517SMDsc = httpContext.cgiGet( edtSMDsc_Internalname) ;
            n9517SMDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9517SMDsc", A9517SMDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SMPRI");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSMPri_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11534SMPri = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11534SMPri", GXutil.str( A11534SMPri, 1, 0));
            }
            else
            {
               A11534SMPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtSMPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11534SMPri", GXutil.str( A11534SMPri, 1, 0));
            }
            A9518SMFchCre = localUtil.ctot( httpContext.cgiGet( edtSMFchCre_Internalname)) ;
            n9518SMFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9518SMFchCre", localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A9519SMUsuCre = GXutil.upper( httpContext.cgiGet( edtSMUsuCre_Internalname)) ;
            n9519SMUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9519SMUsuCre", A9519SMUsuCre);
            A9520SMMaqCod = httpContext.cgiGet( edtSMMaqCod_Internalname) ;
            n9520SMMaqCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9520SMMaqCod", A9520SMMaqCod);
            cmbSMCal.setValue( httpContext.cgiGet( cmbSMCal.getInternalname()) );
            A9524SMCal = (byte)(GXutil.lval( httpContext.cgiGet( cmbSMCal.getInternalname()))) ;
            n9524SMCal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9524SMCal", GXutil.str( A9524SMCal, 1, 0));
            cmbSMEst.setValue( httpContext.cgiGet( cmbSMEst.getInternalname()) );
            A9522SMEst = httpContext.cgiGet( cmbSMEst.getInternalname()) ;
            n9522SMEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
            A9523SMTxt = httpContext.cgiGet( edtSMTxt_Internalname) ;
            n9523SMTxt = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9523SMTxt", A9523SMTxt);
            AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
            AV25ComboSMMaqCod = httpContext.cgiGet( edtavCombosmmaqcod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25ComboSMMaqCod", AV25ComboSMMaqCod);
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
            n407EmprNom = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
            A9521SMMaqDsc = httpContext.cgiGet( edtSMMaqDsc_Internalname) ;
            n9521SMMaqDsc = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", A9521SMMaqDsc);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TMSolic");
            A9518SMFchCre = localUtil.ctot( httpContext.cgiGet( edtSMFchCre_Internalname)) ;
            n9518SMFchCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9518SMFchCre", localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("SMFchCre", localUtil.format( A9518SMFchCre, "99/99/99 99:99"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV27Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV27Pgmname, "")));
            A9519SMUsuCre = httpContext.cgiGet( edtSMUsuCre_Internalname) ;
            n9519SMUsuCre = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9519SMUsuCre", A9519SMUsuCre);
            forbiddenHiddens.add("SMUsuCre", GXutil.rtrim( localUtil.format( A9519SMUsuCre, "@!")));
            A9522SMEst = httpContext.cgiGet( cmbSMEst.getInternalname()) ;
            n9522SMEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
            forbiddenHiddens.add("SMEst", GXutil.rtrim( localUtil.format( A9522SMEst, "")));
            A9524SMCal = (byte)(GXutil.lval( httpContext.cgiGet( cmbSMCal.getInternalname()))) ;
            n9524SMCal = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9524SMCal", GXutil.str( A9524SMCal, 1, 0));
            forbiddenHiddens.add("SMCal", localUtil.format( DecimalUtil.doubleToDec(A9524SMCal), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9428SMCod != Z9428SMCod ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("mantenimientomaquina\\tmsolic:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A9428SMCod = (int)(GXutil.lval( httpContext.GetPar( "SMCod"))) ;
               n9428SMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
               getEqualNoModal( ) ;
               if ( ! (0==AV13SMCod) )
               {
                  A9428SMCod = AV13SMCod ;
                  n9428SMCod = false ;
                  httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
               }
               else
               {
                  if ( ! isIns( )  )
                  {
                     A9428SMCod = AV13SMCod ;
                     n9428SMCod = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
                  }
               }
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               disable_std_buttons( ) ;
               standaloneModal( ) ;
            }
            else
            {
               if ( isDsp( ) )
               {
                  sMode1241 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  if ( ! (0==AV13SMCod) )
                  {
                     A9428SMCod = AV13SMCod ;
                     n9428SMCod = false ;
                     httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
                  }
                  else
                  {
                     if ( ! isIns( )  )
                     {
                        A9428SMCod = AV13SMCod ;
                        n9428SMCod = false ;
                        httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
                     }
                  }
                  Gx_mode = sMode1241 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1241 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_13X0( ) ;
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
                        e1113X2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e1213X2 ();
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
         e1213X2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll13X1241( ) ;
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
         disableAttributes13X1241( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombosmmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombosmmaqcod_Enabled), 5, 0), true);
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

   public void confirm_13X0( )
   {
      beforeValidate13X1241( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls13X1241( ) ;
         }
         else
         {
            checkExtendedTable13X1241( ) ;
            closeExtendedTableCursors13X1241( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption13X0( )
   {
   }

   public void e1113X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV7Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      tmsolic_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit0 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit0", AV7Lit0);
      GXt_char1 = AV10Lit1 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV27Pgmname, (byte)(99), GXv_char2) ;
      tmsolic_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Lit1 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Lit1", AV10Lit1);
      GXt_char1 = AV9LitFe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      tmsolic_impl.this.GXt_char1 = GXv_char2[0] ;
      AV9LitFe = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9LitFe", AV9LitFe);
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tmsolic_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV21ObtenerEmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tmsolic_impl.this.AV21ObtenerEmprCod = GXv_char2[0] ;
      tmsolic_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmsolic_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21ObtenerEmprCod", AV21ObtenerEmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXt_char1 = AV12Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      tmsolic_impl.this.GXt_char1 = GXv_char4[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char4[0] = AV14EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char4, GXv_char3, GXv_char2) ;
      tmsolic_impl.this.AV14EmprCod = GXv_char4[0] ;
      tmsolic_impl.this.AV11EmprNom = GXv_char3[0] ;
      tmsolic_impl.this.AV8UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprCod", AV14EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV11EmprNom", AV11EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      GXv_SdtWWPContext5[0] = AV19WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV19WWPContext = GXv_SdtWWPContext5[0] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV23DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV23DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtSMMaqCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMMaqCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqCod_Visible), 5, 0), true);
      AV25ComboSMMaqCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboSMMaqCod", AV25ComboSMMaqCod);
      edtavCombosmmaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombosmmaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombosmmaqcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOSMMAQCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV16TrnContext.fromxml(AV18WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV16TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV27Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV28GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GXV1), 8, 0));
         while ( AV28GXV1 <= AV16TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV17TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV16TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV28GXV1));
            if ( GXutil.strcmp(AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "SMMaqCod") == 0 )
            {
               AV15Insert_SMMaqCod = AV17TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue() ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Insert_SMMaqCod", AV15Insert_SMMaqCod);
               if ( ! (GXutil.strcmp("", AV15Insert_SMMaqCod)==0) )
               {
                  AV25ComboSMMaqCod = AV15Insert_SMMaqCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV25ComboSMMaqCod", AV25ComboSMMaqCod);
                  Combo_smmaqcod_Selectedvalue_set = AV25ComboSMMaqCod ;
                  ucCombo_smmaqcod.sendProperty(context, "", false, Combo_smmaqcod_Internalname, "SelectedValue_set", Combo_smmaqcod_Selectedvalue_set);
                  Combo_smmaqcod_Enabled = false ;
                  ucCombo_smmaqcod.sendProperty(context, "", false, Combo_smmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_smmaqcod_Enabled));
               }
            }
            AV28GXV1 = (int)(AV28GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28GXV1), 8, 0));
         }
      }
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtEmprNom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Visible), 5, 0), true);
      edtSMMaqDsc_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMMaqDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqDsc_Visible), 5, 0), true);
   }

   public void e1213X2( )
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
      /* 'LOADCOMBOSMMAQCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV22SMMaqCod_Data ;
      GXv_char4[0] = AV24ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.mantenimientomaquina.tmsolicloaddvcombo(remoteHandle, context).execute( "SMMaqCod", Gx_mode, AV14EmprCod, AV13SMCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      tmsolic_impl.this.AV24ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV22SMMaqCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_smmaqcod_Selectedvalue_set = AV24ComboSelectedValue ;
      ucCombo_smmaqcod.sendProperty(context, "", false, Combo_smmaqcod_Internalname, "SelectedValue_set", Combo_smmaqcod_Selectedvalue_set);
      AV25ComboSMMaqCod = AV24ComboSelectedValue ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25ComboSMMaqCod", AV25ComboSMMaqCod);
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_smmaqcod_Enabled = false ;
         ucCombo_smmaqcod.sendProperty(context, "", false, Combo_smmaqcod_Internalname, "Enabled", GXutil.booltostr( Combo_smmaqcod_Enabled));
      }
   }

   public void zm13X1241( int GX_JID )
   {
      if ( ( GX_JID == 20 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z9517SMDsc = T013X3_A9517SMDsc[0] ;
            Z9518SMFchCre = T013X3_A9518SMFchCre[0] ;
            Z9519SMUsuCre = T013X3_A9519SMUsuCre[0] ;
            Z9522SMEst = T013X3_A9522SMEst[0] ;
            Z9523SMTxt = T013X3_A9523SMTxt[0] ;
            Z9524SMCal = T013X3_A9524SMCal[0] ;
            Z11534SMPri = T013X3_A11534SMPri[0] ;
            Z9520SMMaqCod = T013X3_A9520SMMaqCod[0] ;
         }
         else
         {
            Z9517SMDsc = A9517SMDsc ;
            Z9518SMFchCre = A9518SMFchCre ;
            Z9519SMUsuCre = A9519SMUsuCre ;
            Z9522SMEst = A9522SMEst ;
            Z9523SMTxt = A9523SMTxt ;
            Z9524SMCal = A9524SMCal ;
            Z11534SMPri = A11534SMPri ;
            Z9520SMMaqCod = A9520SMMaqCod ;
         }
      }
      if ( GX_JID == -20 )
      {
         Z9428SMCod = A9428SMCod ;
         Z9517SMDsc = A9517SMDsc ;
         Z9518SMFchCre = A9518SMFchCre ;
         Z9519SMUsuCre = A9519SMUsuCre ;
         Z9522SMEst = A9522SMEst ;
         Z9523SMTxt = A9523SMTxt ;
         Z9524SMCal = A9524SMCal ;
         Z11534SMPri = A11534SMPri ;
         Z396EmprCod = A396EmprCod ;
         Z9520SMMaqCod = A9520SMMaqCod ;
         Z407EmprNom = A407EmprNom ;
         Z9521SMMaqDsc = A9521SMMaqDsc ;
      }
   }

   public void standaloneNotModal( )
   {
      edtSMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMFchCre_Enabled), 5, 0), true);
      edtSMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMUsuCre_Enabled), 5, 0), true);
      cmbSMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSMEst.getEnabled(), 5, 0), true);
      cmbSMCal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMCal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSMCal.getEnabled(), 5, 0), true);
      AV27Pgmname = "MantenimientoMaquina.TMSolic" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Pgmname", AV27Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      edtSMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      edtSMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMFchCre_Enabled), 5, 0), true);
      edtSMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMUsuCre_Enabled), 5, 0), true);
      cmbSMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSMEst.getEnabled(), 5, 0), true);
      cmbSMCal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMCal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSMCal.getEnabled(), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV14EmprCod)==0) )
      {
         A396EmprCod = AV14EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      if ( ! (GXutil.strcmp("", AV14EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      else
      {
         edtEmprCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV14EmprCod)==0) )
      {
         edtEmprCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      }
      if ( ! (0==AV13SMCod) )
      {
         edtSMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      }
      else
      {
         if ( true )
         {
            edtSMCod_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
         }
         else
         {
            edtSMCod_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV13SMCod) )
      {
         edtSMCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_SMMaqCod)==0) )
      {
         edtSMMaqCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqCod_Enabled), 5, 0), true);
      }
      else
      {
         edtSMMaqCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (GXutil.strcmp("", AV15Insert_SMMaqCod)==0) )
      {
         A9520SMMaqCod = AV15Insert_SMMaqCod ;
         n9520SMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9520SMMaqCod", A9520SMMaqCod);
      }
      else
      {
         A9520SMMaqCod = AV25ComboSMMaqCod ;
         n9520SMMaqCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9520SMMaqCod", A9520SMMaqCod);
      }
      if ( ! (0==AV13SMCod) )
      {
         A9428SMCod = AV13SMCod ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9428SMCod = AV13SMCod ;
            n9428SMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.nullDate(), A9518SMFchCre) && ( Gx_BScreen == 0 ) )
      {
         A9518SMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
         n9518SMFchCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9518SMFchCre", localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      }
      if ( isIns( )  && (GXutil.strcmp("", A9519SMUsuCre)==0) && ( Gx_BScreen == 0 ) )
      {
         A9519SMUsuCre = AV8UsurCod ;
         n9519SMUsuCre = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9519SMUsuCre", A9519SMUsuCre);
      }
      if ( isIns( )  && (GXutil.strcmp("", A9522SMEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A9522SMEst = httpContext.getMessage( httpContext.getMessage( "P", ""), "") ;
         n9522SMEst = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T013X4 */
         pr_default.execute(2, new Object[] {A396EmprCod});
         A407EmprNom = T013X4_A407EmprNom[0] ;
         n407EmprNom = T013X4_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(2);
         /* Using cursor T013X5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n9520SMMaqCod), A9520SMMaqCod});
         A9521SMMaqDsc = T013X5_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = T013X5_n9521SMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", A9521SMMaqDsc);
         pr_default.close(3);
      }
   }

   public void load13X1241( )
   {
      /* Using cursor T013X6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound1241 = (short)(1) ;
         A407EmprNom = T013X6_A407EmprNom[0] ;
         n407EmprNom = T013X6_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         A9517SMDsc = T013X6_A9517SMDsc[0] ;
         n9517SMDsc = T013X6_n9517SMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9517SMDsc", A9517SMDsc);
         A9518SMFchCre = T013X6_A9518SMFchCre[0] ;
         n9518SMFchCre = T013X6_n9518SMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9518SMFchCre", localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9519SMUsuCre = T013X6_A9519SMUsuCre[0] ;
         n9519SMUsuCre = T013X6_n9519SMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9519SMUsuCre", A9519SMUsuCre);
         A9521SMMaqDsc = T013X6_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = T013X6_n9521SMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", A9521SMMaqDsc);
         A9522SMEst = T013X6_A9522SMEst[0] ;
         n9522SMEst = T013X6_n9522SMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
         A9523SMTxt = T013X6_A9523SMTxt[0] ;
         n9523SMTxt = T013X6_n9523SMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9523SMTxt", A9523SMTxt);
         A9524SMCal = T013X6_A9524SMCal[0] ;
         n9524SMCal = T013X6_n9524SMCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9524SMCal", GXutil.str( A9524SMCal, 1, 0));
         A11534SMPri = T013X6_A11534SMPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11534SMPri", GXutil.str( A11534SMPri, 1, 0));
         A9520SMMaqCod = T013X6_A9520SMMaqCod[0] ;
         n9520SMMaqCod = T013X6_n9520SMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9520SMMaqCod", A9520SMMaqCod);
         zm13X1241( -20) ;
      }
      pr_default.close(4);
      onLoadActions13X1241( ) ;
   }

   public void onLoadActions13X1241( )
   {
   }

   public void checkExtendedTable13X1241( )
   {
      nIsDirty_1241 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      /* Using cursor T013X4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013X4_A407EmprNom[0] ;
      n407EmprNom = T013X4_n407EmprNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      pr_default.close(2);
      /* Using cursor T013X5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n9520SMMaqCod), A9520SMMaqCod});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9521SMMaqDsc = T013X5_A9521SMMaqDsc[0] ;
      n9521SMMaqDsc = T013X5_n9521SMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", A9521SMMaqDsc);
      pr_default.close(3);
   }

   public void closeExtendedTableCursors13X1241( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_21( String A396EmprCod )
   {
      /* Using cursor T013X7 */
      pr_default.execute(5, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A407EmprNom = T013X7_A407EmprNom[0] ;
      n407EmprNom = T013X7_n407EmprNom[0] ;
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

   public void gxload_22( String A396EmprCod ,
                          String A9520SMMaqCod )
   {
      /* Using cursor T013X8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n9520SMMaqCod), A9520SMMaqCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A9521SMMaqDsc = T013X8_A9521SMMaqDsc[0] ;
      n9521SMMaqDsc = T013X8_n9521SMMaqDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", A9521SMMaqDsc);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A9521SMMaqDsc))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void getKey13X1241( )
   {
      /* Using cursor T013X9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound1241 = (short)(1) ;
      }
      else
      {
         RcdFound1241 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T013X3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm13X1241( 20) ;
         RcdFound1241 = (short)(1) ;
         A9428SMCod = T013X3_A9428SMCod[0] ;
         n9428SMCod = T013X3_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         A9517SMDsc = T013X3_A9517SMDsc[0] ;
         n9517SMDsc = T013X3_n9517SMDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9517SMDsc", A9517SMDsc);
         A9518SMFchCre = T013X3_A9518SMFchCre[0] ;
         n9518SMFchCre = T013X3_n9518SMFchCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9518SMFchCre", localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A9519SMUsuCre = T013X3_A9519SMUsuCre[0] ;
         n9519SMUsuCre = T013X3_n9519SMUsuCre[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9519SMUsuCre", A9519SMUsuCre);
         A9522SMEst = T013X3_A9522SMEst[0] ;
         n9522SMEst = T013X3_n9522SMEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
         A9523SMTxt = T013X3_A9523SMTxt[0] ;
         n9523SMTxt = T013X3_n9523SMTxt[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9523SMTxt", A9523SMTxt);
         A9524SMCal = T013X3_A9524SMCal[0] ;
         n9524SMCal = T013X3_n9524SMCal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9524SMCal", GXutil.str( A9524SMCal, 1, 0));
         A11534SMPri = T013X3_A11534SMPri[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11534SMPri", GXutil.str( A11534SMPri, 1, 0));
         A396EmprCod = T013X3_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9520SMMaqCod = T013X3_A9520SMMaqCod[0] ;
         n9520SMMaqCod = T013X3_n9520SMMaqCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9520SMMaqCod", A9520SMMaqCod);
         Z396EmprCod = A396EmprCod ;
         Z9428SMCod = A9428SMCod ;
         sMode1241 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load13X1241( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1241 = (short)(0) ;
            initializeNonKey13X1241( ) ;
         }
         Gx_mode = sMode1241 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1241 = (short)(0) ;
         initializeNonKey13X1241( ) ;
         sMode1241 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1241 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey13X1241( ) ;
      if ( RcdFound1241 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1241 = (short)(0) ;
      /* Using cursor T013X10 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T013X10_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013X10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013X10_A9428SMCod[0] < A9428SMCod ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T013X10_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013X10_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013X10_A9428SMCod[0] > A9428SMCod ) ) )
         {
            A396EmprCod = T013X10_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9428SMCod = T013X10_A9428SMCod[0] ;
            n9428SMCod = T013X10_n9428SMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            RcdFound1241 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound1241 = (short)(0) ;
      /* Using cursor T013X11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T013X11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T013X11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013X11_A9428SMCod[0] > A9428SMCod ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T013X11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T013X11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T013X11_A9428SMCod[0] < A9428SMCod ) ) )
         {
            A396EmprCod = T013X11_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A9428SMCod = T013X11_A9428SMCod[0] ;
            n9428SMCod = T013X11_n9428SMCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
            RcdFound1241 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey13X1241( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSMDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert13X1241( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1241 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9428SMCod != Z9428SMCod ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A9428SMCod = Z9428SMCod ;
               n9428SMCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "EMPRCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtEmprCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSMDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update13X1241( ) ;
               GX_FocusControl = edtSMDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9428SMCod != Z9428SMCod ) )
            {
               /* Insert record */
               GX_FocusControl = edtSMDsc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert13X1241( ) ;
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
                  GX_FocusControl = edtSMDsc_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert13X1241( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A9428SMCod != Z9428SMCod ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = Z9428SMCod ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSMDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency13X1241( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T013X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMSOLIC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z9517SMDsc, T013X2_A9517SMDsc[0]) != 0 ) || !( GXutil.dateCompare(Z9518SMFchCre, T013X2_A9518SMFchCre[0]) ) || ( GXutil.strcmp(Z9519SMUsuCre, T013X2_A9519SMUsuCre[0]) != 0 ) || ( GXutil.strcmp(Z9522SMEst, T013X2_A9522SMEst[0]) != 0 ) || ( GXutil.strcmp(Z9523SMTxt, T013X2_A9523SMTxt[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z9524SMCal != T013X2_A9524SMCal[0] ) || ( Z11534SMPri != T013X2_A11534SMPri[0] ) || ( GXutil.strcmp(Z9520SMMaqCod, T013X2_A9520SMMaqCod[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z9517SMDsc, T013X2_A9517SMDsc[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMDsc");
               GXutil.writeLogRaw("Old: ",Z9517SMDsc);
               GXutil.writeLogRaw("Current: ",T013X2_A9517SMDsc[0]);
            }
            if ( !( GXutil.dateCompare(Z9518SMFchCre, T013X2_A9518SMFchCre[0]) ) )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMFchCre");
               GXutil.writeLogRaw("Old: ",Z9518SMFchCre);
               GXutil.writeLogRaw("Current: ",T013X2_A9518SMFchCre[0]);
            }
            if ( GXutil.strcmp(Z9519SMUsuCre, T013X2_A9519SMUsuCre[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMUsuCre");
               GXutil.writeLogRaw("Old: ",Z9519SMUsuCre);
               GXutil.writeLogRaw("Current: ",T013X2_A9519SMUsuCre[0]);
            }
            if ( GXutil.strcmp(Z9522SMEst, T013X2_A9522SMEst[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMEst");
               GXutil.writeLogRaw("Old: ",Z9522SMEst);
               GXutil.writeLogRaw("Current: ",T013X2_A9522SMEst[0]);
            }
            if ( GXutil.strcmp(Z9523SMTxt, T013X2_A9523SMTxt[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMTxt");
               GXutil.writeLogRaw("Old: ",Z9523SMTxt);
               GXutil.writeLogRaw("Current: ",T013X2_A9523SMTxt[0]);
            }
            if ( Z9524SMCal != T013X2_A9524SMCal[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMCal");
               GXutil.writeLogRaw("Old: ",Z9524SMCal);
               GXutil.writeLogRaw("Current: ",T013X2_A9524SMCal[0]);
            }
            if ( Z11534SMPri != T013X2_A11534SMPri[0] )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMPri");
               GXutil.writeLogRaw("Old: ",Z11534SMPri);
               GXutil.writeLogRaw("Current: ",T013X2_A11534SMPri[0]);
            }
            if ( GXutil.strcmp(Z9520SMMaqCod, T013X2_A9520SMMaqCod[0]) != 0 )
            {
               GXutil.writeLogln("mantenimientomaquina.tmsolic:[seudo value changed for attri]"+"SMMaqCod");
               GXutil.writeLogRaw("Old: ",Z9520SMMaqCod);
               GXutil.writeLogRaw("Current: ",T013X2_A9520SMMaqCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPMSOLIC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert13X1241( )
   {
      beforeValidate13X1241( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13X1241( ) ;
      }
      if ( AnyError == 0 )
      {
         zm13X1241( 0) ;
         checkOptimisticConcurrency13X1241( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13X1241( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert13X1241( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013X12 */
                  pr_default.execute(10, new Object[] {Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod), Boolean.valueOf(n9517SMDsc), A9517SMDsc, Boolean.valueOf(n9518SMFchCre), A9518SMFchCre, Boolean.valueOf(n9519SMUsuCre), A9519SMUsuCre, Boolean.valueOf(n9522SMEst), A9522SMEst, Boolean.valueOf(n9523SMTxt), A9523SMTxt, Boolean.valueOf(n9524SMCal), Byte.valueOf(A9524SMCal), Byte.valueOf(A11534SMPri), A396EmprCod, Boolean.valueOf(n9520SMMaqCod), A9520SMMaqCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
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
                        resetCaption13X0( ) ;
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
            load13X1241( ) ;
         }
         endLevel13X1241( ) ;
      }
      closeExtendedTableCursors13X1241( ) ;
   }

   public void update13X1241( )
   {
      beforeValidate13X1241( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable13X1241( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13X1241( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm13X1241( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate13X1241( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T013X13 */
                  pr_default.execute(11, new Object[] {Boolean.valueOf(n9517SMDsc), A9517SMDsc, Boolean.valueOf(n9518SMFchCre), A9518SMFchCre, Boolean.valueOf(n9519SMUsuCre), A9519SMUsuCre, Boolean.valueOf(n9522SMEst), A9522SMEst, Boolean.valueOf(n9523SMTxt), A9523SMTxt, Boolean.valueOf(n9524SMCal), Byte.valueOf(A9524SMCal), Byte.valueOf(A11534SMPri), Boolean.valueOf(n9520SMMaqCod), A9520SMMaqCod, A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPMSOLIC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate13X1241( ) ;
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
         endLevel13X1241( ) ;
      }
      closeExtendedTableCursors13X1241( ) ;
   }

   public void deferredUpdate13X1241( )
   {
   }

   public void delete( )
   {
      beforeValidate13X1241( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency13X1241( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls13X1241( ) ;
         afterConfirm13X1241( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete13X1241( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T013X14 */
               pr_default.execute(12, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMSOLIC");
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
      sMode1241 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel13X1241( ) ;
      Gx_mode = sMode1241 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls13X1241( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T013X15 */
         pr_default.execute(13, new Object[] {A396EmprCod});
         A407EmprNom = T013X15_A407EmprNom[0] ;
         n407EmprNom = T013X15_n407EmprNom[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
         pr_default.close(13);
         /* Using cursor T013X16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n9520SMMaqCod), A9520SMMaqCod});
         A9521SMMaqDsc = T013X16_A9521SMMaqDsc[0] ;
         n9521SMMaqDsc = T013X16_n9521SMMaqDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", A9521SMMaqDsc);
         pr_default.close(14);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T013X17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n9428SMCod), Integer.valueOf(A9428SMCod)});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "MOrdenes", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
      }
   }

   public void endLevel13X1241( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete13X1241( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmsolic");
         if ( AnyError == 0 )
         {
            confirmValues13X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "mantenimientomaquina.tmsolic");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart13X1241( )
   {
      /* Scan By routine */
      /* Using cursor T013X18 */
      pr_default.execute(16);
      RcdFound1241 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1241 = (short)(1) ;
         A396EmprCod = T013X18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013X18_A9428SMCod[0] ;
         n9428SMCod = T013X18_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext13X1241( )
   {
      /* Scan next routine */
      pr_default.readNext(16);
      RcdFound1241 = (short)(0) ;
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound1241 = (short)(1) ;
         A396EmprCod = T013X18_A396EmprCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A9428SMCod = T013X18_A9428SMCod[0] ;
         n9428SMCod = T013X18_n9428SMCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
   }

   public void scanEnd13X1241( )
   {
      pr_default.close(16);
   }

   public void afterConfirm13X1241( )
   {
      /* After Confirm Rules */
      if ( isIns( )  && true /* After */ )
      {
         GXt_int10 = A9428SMCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTSOL", ""), ""), GXv_int11) ;
         tmsolic_impl.this.GXt_int10 = GXv_int11[0] ;
         A9428SMCod = GXt_int10 ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
   }

   public void beforeInsert13X1241( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate13X1241( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete13X1241( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete13X1241( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate13X1241( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes13X1241( )
   {
      edtSMCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMCod_Enabled), 5, 0), true);
      edtSMDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMDsc_Enabled), 5, 0), true);
      edtSMPri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMPri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMPri_Enabled), 5, 0), true);
      edtSMFchCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMFchCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMFchCre_Enabled), 5, 0), true);
      edtSMUsuCre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMUsuCre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMUsuCre_Enabled), 5, 0), true);
      edtSMMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqCod_Enabled), 5, 0), true);
      cmbSMCal.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMCal.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSMCal.getEnabled(), 5, 0), true);
      cmbSMEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSMEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSMEst.getEnabled(), 5, 0), true);
      edtSMTxt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMTxt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMTxt_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombosmmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombosmmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombosmmaqcod_Enabled), 5, 0), true);
      edtEmprCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Enabled), 5, 0), true);
      edtEmprNom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprNom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprNom_Enabled), 5, 0), true);
      edtSMMaqDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSMMaqDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSMMaqDsc_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes13X1241( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues13X0( )
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV14EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13SMCod,8,0))}, new String[] {"Gx_mode","EmprCod","SMCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TMSolic");
      forbiddenHiddens.add("SMFchCre", localUtil.format( A9518SMFchCre, "99/99/99 99:99"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV27Pgmname, "")));
      forbiddenHiddens.add("SMUsuCre", GXutil.rtrim( localUtil.format( A9519SMUsuCre, "@!")));
      forbiddenHiddens.add("SMEst", GXutil.rtrim( localUtil.format( A9522SMEst, "")));
      forbiddenHiddens.add("SMCal", localUtil.format( DecimalUtil.doubleToDec(A9524SMCal), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("mantenimientomaquina\\tmsolic:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9428SMCod", GXutil.ltrim( localUtil.ntoc( Z9428SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9517SMDsc", GXutil.rtrim( Z9517SMDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9518SMFchCre", localUtil.ttoc( Z9518SMFchCre, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9519SMUsuCre", GXutil.rtrim( Z9519SMUsuCre));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9522SMEst", GXutil.rtrim( Z9522SMEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9523SMTxt", Z9523SMTxt);
      app.GxWebStd.gx_hidden_field( httpContext, "Z9524SMCal", GXutil.ltrim( localUtil.ntoc( Z9524SMCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11534SMPri", GXutil.ltrim( localUtil.ntoc( Z11534SMPri, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z9520SMMaqCod", GXutil.rtrim( Z9520SMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N9520SMMaqCod", GXutil.rtrim( A9520SMMaqCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV23DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSMMAQCOD_DATA", AV22SMMaqCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSMMAQCOD_DATA", AV22SMMaqCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV14EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV14EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSMCOD", GXutil.ltrim( localUtil.ntoc( AV13SMCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSMCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13SMCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_SMMAQCOD", GXutil.rtrim( AV15Insert_SMMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SMMAQCOD_Objectcall", GXutil.rtrim( Combo_smmaqcod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SMMAQCOD_Cls", GXutil.rtrim( Combo_smmaqcod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SMMAQCOD_Selectedvalue_set", GXutil.rtrim( Combo_smmaqcod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SMMAQCOD_Enabled", GXutil.booltostr( Combo_smmaqcod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_SMMAQCOD_Emptyitem", GXutil.booltostr( Combo_smmaqcod_Emptyitem));
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
      return formatLink("app.mantenimientomaquina.tmsolic", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV14EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13SMCod,8,0))}, new String[] {"Gx_mode","EmprCod","SMCod"})  ;
   }

   public String getPgmname( )
   {
      return "MantenimientoMaquina.TMSolic" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Solicitudes de Mantenimiento", "") ;
   }

   public void initializeNonKey13X1241( )
   {
      A9520SMMaqCod = "" ;
      n9520SMMaqCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9520SMMaqCod", A9520SMMaqCod);
      A407EmprNom = "" ;
      n407EmprNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", A407EmprNom);
      A9517SMDsc = "" ;
      n9517SMDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9517SMDsc", A9517SMDsc);
      A9521SMMaqDsc = "" ;
      n9521SMMaqDsc = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", A9521SMMaqDsc);
      A9523SMTxt = "" ;
      n9523SMTxt = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9523SMTxt", A9523SMTxt);
      A9524SMCal = (byte)(0) ;
      n9524SMCal = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9524SMCal", GXutil.str( A9524SMCal, 1, 0));
      A11534SMPri = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11534SMPri", GXutil.str( A11534SMPri, 1, 0));
      A9518SMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9518SMFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9518SMFchCre", localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9519SMUsuCre = AV8UsurCod ;
      n9519SMUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9519SMUsuCre", A9519SMUsuCre);
      A9522SMEst = httpContext.getMessage( "P", "") ;
      n9522SMEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
      Z9517SMDsc = "" ;
      Z9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9519SMUsuCre = "" ;
      Z9522SMEst = "" ;
      Z9523SMTxt = "" ;
      Z9524SMCal = (byte)(0) ;
      Z11534SMPri = (byte)(0) ;
      Z9520SMMaqCod = "" ;
   }

   public void initAll13X1241( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A9428SMCod = 0 ;
      n9428SMCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      initializeNonKey13X1241( ) ;
   }

   public void standaloneModalInsert( )
   {
      A9518SMFchCre = i9518SMFchCre ;
      n9518SMFchCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9518SMFchCre", localUtil.ttoc( A9518SMFchCre, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A9519SMUsuCre = i9519SMUsuCre ;
      n9519SMUsuCre = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9519SMUsuCre", A9519SMUsuCre);
      A9522SMEst = i9522SMEst ;
      n9522SMEst = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211661155", true, true);
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
      httpContext.AddJavascriptSource("mantenimientomaquina/tmsolic.js", "?20268211661155", false, true);
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
      edtSMCod_Internalname = "SMCOD" ;
      edtSMDsc_Internalname = "SMDSC" ;
      edtSMPri_Internalname = "SMPRI" ;
      edtSMFchCre_Internalname = "SMFCHCRE" ;
      edtSMUsuCre_Internalname = "SMUSUCRE" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblocksmmaqcod_Internalname = "TEXTBLOCKSMMAQCOD" ;
      Combo_smmaqcod_Internalname = "COMBO_SMMAQCOD" ;
      edtSMMaqCod_Internalname = "SMMAQCOD" ;
      divTablesplittedsmmaqcod_Internalname = "TABLESPLITTEDSMMAQCOD" ;
      cmbSMCal.setInternalname( "SMCAL" );
      cmbSMEst.setInternalname( "SMEST" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtSMTxt_Internalname = "SMTXT" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombosmmaqcod_Internalname = "vCOMBOSMMAQCOD" ;
      divSectionattribute_smmaqcod_Internalname = "SECTIONATTRIBUTE_SMMAQCOD" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtSMMaqDsc_Internalname = "SMMAQDSC" ;
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
      Form.setCaption( httpContext.getMessage( "Solicitudes de Mantenimiento", "") );
      edtSMMaqDsc_Jsonclick = "" ;
      edtSMMaqDsc_Enabled = 0 ;
      edtSMMaqDsc_Visible = 1 ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprNom_Enabled = 0 ;
      edtEmprNom_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Enabled = 1 ;
      edtEmprCod_Visible = 1 ;
      edtavCombosmmaqcod_Jsonclick = "" ;
      edtavCombosmmaqcod_Enabled = 0 ;
      edtavCombosmmaqcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtSMTxt_Enabled = 1 ;
      cmbSMEst.setJsonclick( "" );
      cmbSMEst.setEnabled( 0 );
      cmbSMCal.setJsonclick( "" );
      cmbSMCal.setEnabled( 0 );
      edtSMMaqCod_Jsonclick = "" ;
      edtSMMaqCod_Enabled = 1 ;
      edtSMMaqCod_Visible = 1 ;
      Combo_smmaqcod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_smmaqcod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_smmaqcod_Caption = "" ;
      Combo_smmaqcod_Enabled = GXutil.toBoolean( -1) ;
      edtSMUsuCre_Jsonclick = "" ;
      edtSMUsuCre_Enabled = 0 ;
      edtSMFchCre_Jsonclick = "" ;
      edtSMFchCre_Enabled = 0 ;
      edtSMPri_Jsonclick = "" ;
      edtSMPri_Enabled = 1 ;
      edtSMDsc_Jsonclick = "" ;
      edtSMDsc_Enabled = 1 ;
      edtSMCod_Jsonclick = "" ;
      edtSMCod_Enabled = 0 ;
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

   public void gx5asasmcod13X1241( int AV13SMCod )
   {
      if ( ! (0==AV13SMCod) )
      {
         A9428SMCod = AV13SMCod ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
      else
      {
         if ( ! isIns( )  )
         {
            A9428SMCod = AV13SMCod ;
            n9428SMCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
         }
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx6asasmcod13X1241( String Gx_mode ,
                                   String A396EmprCod )
   {
      if ( isIns( )  && true /* After */ )
      {
         GXt_int10 = A9428SMCod ;
         GXv_int11[0] = GXt_int10 ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( httpContext.getMessage( "MNTSOL", ""), ""), GXv_int11) ;
         tmsolic_impl.this.GXt_int10 = GXv_int11[0] ;
         A9428SMCod = GXt_int10 ;
         n9428SMCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9428SMCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A9428SMCod), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A9428SMCod, (byte)(8), (byte)(0), ".", "")))+"\"") ;
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
      cmbSMCal.setName( "SMCAL" );
      cmbSMCal.setWebtags( "" );
      cmbSMCal.addItem("1", httpContext.getMessage( "Pesima", ""), (short)(0));
      cmbSMCal.addItem("2", httpContext.getMessage( "Mala", ""), (short)(0));
      cmbSMCal.addItem("3", httpContext.getMessage( "Aceptable", ""), (short)(0));
      cmbSMCal.addItem("4", httpContext.getMessage( "Satisfactorio", ""), (short)(0));
      cmbSMCal.addItem("5", httpContext.getMessage( "Excelente", ""), (short)(0));
      if ( cmbSMCal.getItemCount() > 0 )
      {
         A9524SMCal = (byte)(GXutil.lval( cmbSMCal.getValidValue(GXutil.trim( GXutil.str( A9524SMCal, 1, 0))))) ;
         n9524SMCal = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A9524SMCal", GXutil.str( A9524SMCal, 1, 0));
      }
      cmbSMEst.setName( "SMEST" );
      cmbSMEst.setWebtags( "" );
      cmbSMEst.addItem("P", httpContext.getMessage( "Pendiente Generación", ""), (short)(0));
      cmbSMEst.addItem("G", httpContext.getMessage( "Generada", ""), (short)(0));
      cmbSMEst.addItem("A", httpContext.getMessage( "Anulada", ""), (short)(0));
      cmbSMEst.addItem("C", httpContext.getMessage( "Pendiente Calificacion", ""), (short)(0));
      cmbSMEst.addItem("T", httpContext.getMessage( "Terminada", ""), (short)(0));
      if ( cmbSMEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A9522SMEst)==0) )
         {
            A9522SMEst = httpContext.getMessage( "P", "") ;
            n9522SMEst = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A9522SMEst", A9522SMEst);
         }
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

   public void valid_Emprcod( )
   {
      n407EmprNom = false ;
      /* Using cursor T013X15 */
      pr_default.execute(13, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A407EmprNom = T013X15_A407EmprNom[0] ;
      n407EmprNom = T013X15_n407EmprNom[0] ;
      pr_default.close(13);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A407EmprNom", GXutil.rtrim( A407EmprNom));
   }

   public void valid_Smmaqcod( )
   {
      n9520SMMaqCod = false ;
      n9521SMMaqDsc = false ;
      /* Using cursor T013X16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n9520SMMaqCod), A9520SMMaqCod});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "MSMaq", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "SMMAQCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtEmprCod_Internalname ;
      }
      A9521SMMaqDsc = T013X16_A9521SMMaqDsc[0] ;
      n9521SMMaqDsc = T013X16_n9521SMMaqDsc[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A9521SMMaqDsc", GXutil.rtrim( A9521SMMaqDsc));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13SMCod',fld:'vSMCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13SMCod',fld:'vSMCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A9518SMFchCre',fld:'SMFCHCRE',pic:'99/99/99 99:99'},{av:'AV27Pgmname',fld:'vPGMNAME',pic:''},{av:'A9519SMUsuCre',fld:'SMUSUCRE',pic:'@!'},{av:'cmbSMEst'},{av:'A9522SMEst',fld:'SMEST',pic:''},{av:'cmbSMCal'},{av:'A9524SMCal',fld:'SMCAL',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e1213X2',iparms:[]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_SMCOD","{handler:'valid_Smcod',iparms:[]");
      setEventMetadata("VALID_SMCOD",",oparms:[]}");
      setEventMetadata("VALID_SMMAQCOD","{handler:'valid_Smmaqcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9520SMMaqCod',fld:'SMMAQCOD',pic:''},{av:'A9521SMMaqDsc',fld:'SMMAQDSC',pic:''}]");
      setEventMetadata("VALID_SMMAQCOD",",oparms:[{av:'A9521SMMaqDsc',fld:'SMMAQDSC',pic:''}]}");
      setEventMetadata("VALIDV_COMBOSMMAQCOD","{handler:'validv_Combosmmaqcod',iparms:[]");
      setEventMetadata("VALIDV_COMBOSMMAQCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[{av:'A407EmprNom',fld:'EMPRNOM',pic:''}]}");
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
      wcpOAV14EmprCod = "" ;
      Z396EmprCod = "" ;
      Z9517SMDsc = "" ;
      Z9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      Z9519SMUsuCre = "" ;
      Z9522SMEst = "" ;
      Z9523SMTxt = "" ;
      Z9520SMMaqCod = "" ;
      N9520SMMaqCod = "" ;
      Combo_smmaqcod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A396EmprCod = "" ;
      A9520SMMaqCod = "" ;
      AV14EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A9522SMEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A9517SMDsc = "" ;
      A9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      A9519SMUsuCre = "" ;
      lblTextblocksmmaqcod_Jsonclick = "" ;
      ucCombo_smmaqcod = new com.genexus.webpanels.GXUserControl();
      AV23DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV22SMMaqCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A9523SMTxt = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV27Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV25ComboSMMaqCod = "" ;
      A407EmprNom = "" ;
      A9521SMMaqDsc = "" ;
      AV15Insert_SMMaqCod = "" ;
      AV8UsurCod = "" ;
      Combo_smmaqcod_Objectcall = "" ;
      Combo_smmaqcod_Class = "" ;
      Combo_smmaqcod_Icontype = "" ;
      Combo_smmaqcod_Icon = "" ;
      Combo_smmaqcod_Tooltip = "" ;
      Combo_smmaqcod_Selectedvalue_set = "" ;
      Combo_smmaqcod_Selectedtext_set = "" ;
      Combo_smmaqcod_Selectedtext_get = "" ;
      Combo_smmaqcod_Gamoauthtoken = "" ;
      Combo_smmaqcod_Ddointernalname = "" ;
      Combo_smmaqcod_Titlecontrolalign = "" ;
      Combo_smmaqcod_Dropdownoptionstype = "" ;
      Combo_smmaqcod_Titlecontrolidtoreplace = "" ;
      Combo_smmaqcod_Datalisttype = "" ;
      Combo_smmaqcod_Datalistfixedvalues = "" ;
      Combo_smmaqcod_Datalistproc = "" ;
      Combo_smmaqcod_Datalistprocparametersprefix = "" ;
      Combo_smmaqcod_Remoteservicesparameters = "" ;
      Combo_smmaqcod_Htmltemplate = "" ;
      Combo_smmaqcod_Multiplevaluestype = "" ;
      Combo_smmaqcod_Loadingdata = "" ;
      Combo_smmaqcod_Noresultsfound = "" ;
      Combo_smmaqcod_Emptyitemtext = "" ;
      Combo_smmaqcod_Onlyselectedvalues = "" ;
      Combo_smmaqcod_Selectalltext = "" ;
      Combo_smmaqcod_Multiplevaluesseparator = "" ;
      Combo_smmaqcod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1241 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV7Lit0 = "" ;
      AV10Lit1 = "" ;
      AV9LitFe = "" ;
      AV12Station = "" ;
      AV21ObtenerEmprCod = "" ;
      AV11EmprNom = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV19WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV16TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV18WebSession = httpContext.getWebSession();
      AV17TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV24ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z9521SMMaqDsc = "" ;
      T013X4_A407EmprNom = new String[] {""} ;
      T013X4_n407EmprNom = new boolean[] {false} ;
      T013X5_A9521SMMaqDsc = new String[] {""} ;
      T013X5_n9521SMMaqDsc = new boolean[] {false} ;
      T013X6_A9428SMCod = new int[1] ;
      T013X6_n9428SMCod = new boolean[] {false} ;
      T013X6_A407EmprNom = new String[] {""} ;
      T013X6_n407EmprNom = new boolean[] {false} ;
      T013X6_A9517SMDsc = new String[] {""} ;
      T013X6_n9517SMDsc = new boolean[] {false} ;
      T013X6_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013X6_n9518SMFchCre = new boolean[] {false} ;
      T013X6_A9519SMUsuCre = new String[] {""} ;
      T013X6_n9519SMUsuCre = new boolean[] {false} ;
      T013X6_A9521SMMaqDsc = new String[] {""} ;
      T013X6_n9521SMMaqDsc = new boolean[] {false} ;
      T013X6_A9522SMEst = new String[] {""} ;
      T013X6_n9522SMEst = new boolean[] {false} ;
      T013X6_A9523SMTxt = new String[] {""} ;
      T013X6_n9523SMTxt = new boolean[] {false} ;
      T013X6_A9524SMCal = new byte[1] ;
      T013X6_n9524SMCal = new boolean[] {false} ;
      T013X6_A11534SMPri = new byte[1] ;
      T013X6_A396EmprCod = new String[] {""} ;
      T013X6_A9520SMMaqCod = new String[] {""} ;
      T013X6_n9520SMMaqCod = new boolean[] {false} ;
      T013X7_A407EmprNom = new String[] {""} ;
      T013X7_n407EmprNom = new boolean[] {false} ;
      T013X8_A9521SMMaqDsc = new String[] {""} ;
      T013X8_n9521SMMaqDsc = new boolean[] {false} ;
      T013X9_A396EmprCod = new String[] {""} ;
      T013X9_A9428SMCod = new int[1] ;
      T013X9_n9428SMCod = new boolean[] {false} ;
      T013X3_A9428SMCod = new int[1] ;
      T013X3_n9428SMCod = new boolean[] {false} ;
      T013X3_A9517SMDsc = new String[] {""} ;
      T013X3_n9517SMDsc = new boolean[] {false} ;
      T013X3_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013X3_n9518SMFchCre = new boolean[] {false} ;
      T013X3_A9519SMUsuCre = new String[] {""} ;
      T013X3_n9519SMUsuCre = new boolean[] {false} ;
      T013X3_A9522SMEst = new String[] {""} ;
      T013X3_n9522SMEst = new boolean[] {false} ;
      T013X3_A9523SMTxt = new String[] {""} ;
      T013X3_n9523SMTxt = new boolean[] {false} ;
      T013X3_A9524SMCal = new byte[1] ;
      T013X3_n9524SMCal = new boolean[] {false} ;
      T013X3_A11534SMPri = new byte[1] ;
      T013X3_A396EmprCod = new String[] {""} ;
      T013X3_A9520SMMaqCod = new String[] {""} ;
      T013X3_n9520SMMaqCod = new boolean[] {false} ;
      T013X10_A396EmprCod = new String[] {""} ;
      T013X10_A9428SMCod = new int[1] ;
      T013X10_n9428SMCod = new boolean[] {false} ;
      T013X11_A396EmprCod = new String[] {""} ;
      T013X11_A9428SMCod = new int[1] ;
      T013X11_n9428SMCod = new boolean[] {false} ;
      T013X2_A9428SMCod = new int[1] ;
      T013X2_n9428SMCod = new boolean[] {false} ;
      T013X2_A9517SMDsc = new String[] {""} ;
      T013X2_n9517SMDsc = new boolean[] {false} ;
      T013X2_A9518SMFchCre = new java.util.Date[] {GXutil.nullDate()} ;
      T013X2_n9518SMFchCre = new boolean[] {false} ;
      T013X2_A9519SMUsuCre = new String[] {""} ;
      T013X2_n9519SMUsuCre = new boolean[] {false} ;
      T013X2_A9522SMEst = new String[] {""} ;
      T013X2_n9522SMEst = new boolean[] {false} ;
      T013X2_A9523SMTxt = new String[] {""} ;
      T013X2_n9523SMTxt = new boolean[] {false} ;
      T013X2_A9524SMCal = new byte[1] ;
      T013X2_n9524SMCal = new boolean[] {false} ;
      T013X2_A11534SMPri = new byte[1] ;
      T013X2_A396EmprCod = new String[] {""} ;
      T013X2_A9520SMMaqCod = new String[] {""} ;
      T013X2_n9520SMMaqCod = new boolean[] {false} ;
      T013X15_A407EmprNom = new String[] {""} ;
      T013X15_n407EmprNom = new boolean[] {false} ;
      T013X16_A9521SMMaqDsc = new String[] {""} ;
      T013X16_n9521SMMaqDsc = new boolean[] {false} ;
      T013X17_A396EmprCod = new String[] {""} ;
      T013X17_A9425OMCod = new int[1] ;
      T013X18_A396EmprCod = new String[] {""} ;
      T013X18_A9428SMCod = new int[1] ;
      T013X18_n9428SMCod = new boolean[] {false} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i9518SMFchCre = GXutil.resetTime( GXutil.nullDate() );
      i9519SMUsuCre = "" ;
      i9522SMEst = "" ;
      GXv_int11 = new int[1] ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolic__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolic__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolic__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolic__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.mantenimientomaquina.tmsolic__default(),
         new Object[] {
             new Object[] {
            T013X2_A9428SMCod, T013X2_A9517SMDsc, T013X2_n9517SMDsc, T013X2_A9518SMFchCre, T013X2_n9518SMFchCre, T013X2_A9519SMUsuCre, T013X2_n9519SMUsuCre, T013X2_A9522SMEst, T013X2_n9522SMEst, T013X2_A9523SMTxt,
            T013X2_n9523SMTxt, T013X2_A9524SMCal, T013X2_n9524SMCal, T013X2_A11534SMPri, T013X2_A396EmprCod, T013X2_A9520SMMaqCod, T013X2_n9520SMMaqCod
            }
            , new Object[] {
            T013X3_A9428SMCod, T013X3_A9517SMDsc, T013X3_n9517SMDsc, T013X3_A9518SMFchCre, T013X3_n9518SMFchCre, T013X3_A9519SMUsuCre, T013X3_n9519SMUsuCre, T013X3_A9522SMEst, T013X3_n9522SMEst, T013X3_A9523SMTxt,
            T013X3_n9523SMTxt, T013X3_A9524SMCal, T013X3_n9524SMCal, T013X3_A11534SMPri, T013X3_A396EmprCod, T013X3_A9520SMMaqCod, T013X3_n9520SMMaqCod
            }
            , new Object[] {
            T013X4_A407EmprNom, T013X4_n407EmprNom
            }
            , new Object[] {
            T013X5_A9521SMMaqDsc, T013X5_n9521SMMaqDsc
            }
            , new Object[] {
            T013X6_A9428SMCod, T013X6_A407EmprNom, T013X6_n407EmprNom, T013X6_A9517SMDsc, T013X6_n9517SMDsc, T013X6_A9518SMFchCre, T013X6_n9518SMFchCre, T013X6_A9519SMUsuCre, T013X6_n9519SMUsuCre, T013X6_A9521SMMaqDsc,
            T013X6_n9521SMMaqDsc, T013X6_A9522SMEst, T013X6_n9522SMEst, T013X6_A9523SMTxt, T013X6_n9523SMTxt, T013X6_A9524SMCal, T013X6_n9524SMCal, T013X6_A11534SMPri, T013X6_A396EmprCod, T013X6_A9520SMMaqCod,
            T013X6_n9520SMMaqCod
            }
            , new Object[] {
            T013X7_A407EmprNom, T013X7_n407EmprNom
            }
            , new Object[] {
            T013X8_A9521SMMaqDsc, T013X8_n9521SMMaqDsc
            }
            , new Object[] {
            T013X9_A396EmprCod, T013X9_A9428SMCod
            }
            , new Object[] {
            T013X10_A396EmprCod, T013X10_A9428SMCod
            }
            , new Object[] {
            T013X11_A396EmprCod, T013X11_A9428SMCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T013X15_A407EmprNom, T013X15_n407EmprNom
            }
            , new Object[] {
            T013X16_A9521SMMaqDsc, T013X16_n9521SMMaqDsc
            }
            , new Object[] {
            T013X17_A396EmprCod, T013X17_A9425OMCod
            }
            , new Object[] {
            T013X18_A396EmprCod, T013X18_A9428SMCod
            }
         }
      );
      AV27Pgmname = "MantenimientoMaquina.TMSolic" ;
      Z9522SMEst = httpContext.getMessage( "P", "") ;
      n9522SMEst = false ;
      A9522SMEst = httpContext.getMessage( "P", "") ;
      n9522SMEst = false ;
      i9522SMEst = httpContext.getMessage( "P", "") ;
      n9522SMEst = false ;
      Z9519SMUsuCre = "" ;
      n9519SMUsuCre = false ;
      A9519SMUsuCre = "" ;
      n9519SMUsuCre = false ;
      i9519SMUsuCre = "" ;
      n9519SMUsuCre = false ;
      Z9518SMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9518SMFchCre = false ;
      A9518SMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9518SMFchCre = false ;
      i9518SMFchCre = GXutil.serverNow( context, remoteHandle, pr_default) ;
      n9518SMFchCre = false ;
   }

   private byte Z9524SMCal ;
   private byte Z11534SMPri ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A9524SMCal ;
   private byte A11534SMPri ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound1241 ;
   private short nIsDirty_1241 ;
   private int wcpOAV13SMCod ;
   private int Z9428SMCod ;
   private int AV13SMCod ;
   private int trnEnded ;
   private int A9428SMCod ;
   private int edtSMCod_Enabled ;
   private int edtSMDsc_Enabled ;
   private int edtSMPri_Enabled ;
   private int edtSMFchCre_Enabled ;
   private int edtSMUsuCre_Enabled ;
   private int edtSMMaqCod_Visible ;
   private int edtSMMaqCod_Enabled ;
   private int edtSMTxt_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombosmmaqcod_Visible ;
   private int edtavCombosmmaqcod_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtEmprCod_Enabled ;
   private int edtEmprNom_Visible ;
   private int edtEmprNom_Enabled ;
   private int edtSMMaqDsc_Visible ;
   private int edtSMMaqDsc_Enabled ;
   private int Combo_smmaqcod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV28GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXt_int10 ;
   private int GXv_int11[] ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV14EmprCod ;
   private String Z396EmprCod ;
   private String Z9517SMDsc ;
   private String Z9519SMUsuCre ;
   private String Z9522SMEst ;
   private String Z9520SMMaqCod ;
   private String N9520SMMaqCod ;
   private String Combo_smmaqcod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String A396EmprCod ;
   private String A9520SMMaqCod ;
   private String AV14EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtSMDsc_Internalname ;
   private String A9522SMEst ;
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
   private String edtSMCod_Internalname ;
   private String TempTags ;
   private String edtSMCod_Jsonclick ;
   private String A9517SMDsc ;
   private String edtSMDsc_Jsonclick ;
   private String edtSMPri_Internalname ;
   private String edtSMPri_Jsonclick ;
   private String edtSMFchCre_Internalname ;
   private String edtSMFchCre_Jsonclick ;
   private String edtSMUsuCre_Internalname ;
   private String A9519SMUsuCre ;
   private String edtSMUsuCre_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedsmmaqcod_Internalname ;
   private String lblTextblocksmmaqcod_Internalname ;
   private String lblTextblocksmmaqcod_Jsonclick ;
   private String Combo_smmaqcod_Caption ;
   private String Combo_smmaqcod_Cls ;
   private String Combo_smmaqcod_Internalname ;
   private String edtSMMaqCod_Internalname ;
   private String edtSMMaqCod_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtSMTxt_Internalname ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_smmaqcod_Internalname ;
   private String edtavCombosmmaqcod_Internalname ;
   private String AV25ComboSMMaqCod ;
   private String edtavCombosmmaqcod_Jsonclick ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Jsonclick ;
   private String edtSMMaqDsc_Internalname ;
   private String A9521SMMaqDsc ;
   private String edtSMMaqDsc_Jsonclick ;
   private String AV15Insert_SMMaqCod ;
   private String AV8UsurCod ;
   private String Combo_smmaqcod_Objectcall ;
   private String Combo_smmaqcod_Class ;
   private String Combo_smmaqcod_Icontype ;
   private String Combo_smmaqcod_Icon ;
   private String Combo_smmaqcod_Tooltip ;
   private String Combo_smmaqcod_Selectedvalue_set ;
   private String Combo_smmaqcod_Selectedtext_set ;
   private String Combo_smmaqcod_Selectedtext_get ;
   private String Combo_smmaqcod_Gamoauthtoken ;
   private String Combo_smmaqcod_Ddointernalname ;
   private String Combo_smmaqcod_Titlecontrolalign ;
   private String Combo_smmaqcod_Dropdownoptionstype ;
   private String Combo_smmaqcod_Titlecontrolidtoreplace ;
   private String Combo_smmaqcod_Datalisttype ;
   private String Combo_smmaqcod_Datalistfixedvalues ;
   private String Combo_smmaqcod_Datalistproc ;
   private String Combo_smmaqcod_Datalistprocparametersprefix ;
   private String Combo_smmaqcod_Remoteservicesparameters ;
   private String Combo_smmaqcod_Htmltemplate ;
   private String Combo_smmaqcod_Multiplevaluestype ;
   private String Combo_smmaqcod_Loadingdata ;
   private String Combo_smmaqcod_Noresultsfound ;
   private String Combo_smmaqcod_Emptyitemtext ;
   private String Combo_smmaqcod_Onlyselectedvalues ;
   private String Combo_smmaqcod_Selectalltext ;
   private String Combo_smmaqcod_Multiplevaluesseparator ;
   private String Combo_smmaqcod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1241 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV7Lit0 ;
   private String AV10Lit1 ;
   private String AV9LitFe ;
   private String AV12Station ;
   private String AV21ObtenerEmprCod ;
   private String AV11EmprNom ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z9521SMMaqDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i9519SMUsuCre ;
   private String i9522SMEst ;
   private java.util.Date Z9518SMFchCre ;
   private java.util.Date A9518SMFchCre ;
   private java.util.Date i9518SMFchCre ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n9520SMMaqCod ;
   private boolean wbErr ;
   private boolean n9524SMCal ;
   private boolean n9522SMEst ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_smmaqcod_Emptyitem ;
   private boolean Combo_smmaqcod_Enabled ;
   private boolean Combo_smmaqcod_Visible ;
   private boolean Combo_smmaqcod_Allowmultipleselection ;
   private boolean Combo_smmaqcod_Isgriditem ;
   private boolean Combo_smmaqcod_Hasdescription ;
   private boolean Combo_smmaqcod_Includeonlyselectedoption ;
   private boolean Combo_smmaqcod_Includeselectalloption ;
   private boolean Combo_smmaqcod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean n9428SMCod ;
   private boolean n9517SMDsc ;
   private boolean n9518SMFchCre ;
   private boolean n9519SMUsuCre ;
   private boolean n9523SMTxt ;
   private boolean n407EmprNom ;
   private boolean n9521SMMaqDsc ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z9523SMTxt ;
   private String A9523SMTxt ;
   private String AV24ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV18WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_smmaqcod ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbSMCal ;
   private HTMLChoice cmbSMEst ;
   private IDataStoreProvider pr_default ;
   private String[] T013X4_A407EmprNom ;
   private boolean[] T013X4_n407EmprNom ;
   private String[] T013X5_A9521SMMaqDsc ;
   private boolean[] T013X5_n9521SMMaqDsc ;
   private int[] T013X6_A9428SMCod ;
   private boolean[] T013X6_n9428SMCod ;
   private String[] T013X6_A407EmprNom ;
   private boolean[] T013X6_n407EmprNom ;
   private String[] T013X6_A9517SMDsc ;
   private boolean[] T013X6_n9517SMDsc ;
   private java.util.Date[] T013X6_A9518SMFchCre ;
   private boolean[] T013X6_n9518SMFchCre ;
   private String[] T013X6_A9519SMUsuCre ;
   private boolean[] T013X6_n9519SMUsuCre ;
   private String[] T013X6_A9521SMMaqDsc ;
   private boolean[] T013X6_n9521SMMaqDsc ;
   private String[] T013X6_A9522SMEst ;
   private boolean[] T013X6_n9522SMEst ;
   private String[] T013X6_A9523SMTxt ;
   private boolean[] T013X6_n9523SMTxt ;
   private byte[] T013X6_A9524SMCal ;
   private boolean[] T013X6_n9524SMCal ;
   private byte[] T013X6_A11534SMPri ;
   private String[] T013X6_A396EmprCod ;
   private String[] T013X6_A9520SMMaqCod ;
   private boolean[] T013X6_n9520SMMaqCod ;
   private String[] T013X7_A407EmprNom ;
   private boolean[] T013X7_n407EmprNom ;
   private String[] T013X8_A9521SMMaqDsc ;
   private boolean[] T013X8_n9521SMMaqDsc ;
   private String[] T013X9_A396EmprCod ;
   private int[] T013X9_A9428SMCod ;
   private boolean[] T013X9_n9428SMCod ;
   private int[] T013X3_A9428SMCod ;
   private boolean[] T013X3_n9428SMCod ;
   private String[] T013X3_A9517SMDsc ;
   private boolean[] T013X3_n9517SMDsc ;
   private java.util.Date[] T013X3_A9518SMFchCre ;
   private boolean[] T013X3_n9518SMFchCre ;
   private String[] T013X3_A9519SMUsuCre ;
   private boolean[] T013X3_n9519SMUsuCre ;
   private String[] T013X3_A9522SMEst ;
   private boolean[] T013X3_n9522SMEst ;
   private String[] T013X3_A9523SMTxt ;
   private boolean[] T013X3_n9523SMTxt ;
   private byte[] T013X3_A9524SMCal ;
   private boolean[] T013X3_n9524SMCal ;
   private byte[] T013X3_A11534SMPri ;
   private String[] T013X3_A396EmprCod ;
   private String[] T013X3_A9520SMMaqCod ;
   private boolean[] T013X3_n9520SMMaqCod ;
   private String[] T013X10_A396EmprCod ;
   private int[] T013X10_A9428SMCod ;
   private boolean[] T013X10_n9428SMCod ;
   private String[] T013X11_A396EmprCod ;
   private int[] T013X11_A9428SMCod ;
   private boolean[] T013X11_n9428SMCod ;
   private int[] T013X2_A9428SMCod ;
   private boolean[] T013X2_n9428SMCod ;
   private String[] T013X2_A9517SMDsc ;
   private boolean[] T013X2_n9517SMDsc ;
   private java.util.Date[] T013X2_A9518SMFchCre ;
   private boolean[] T013X2_n9518SMFchCre ;
   private String[] T013X2_A9519SMUsuCre ;
   private boolean[] T013X2_n9519SMUsuCre ;
   private String[] T013X2_A9522SMEst ;
   private boolean[] T013X2_n9522SMEst ;
   private String[] T013X2_A9523SMTxt ;
   private boolean[] T013X2_n9523SMTxt ;
   private byte[] T013X2_A9524SMCal ;
   private boolean[] T013X2_n9524SMCal ;
   private byte[] T013X2_A11534SMPri ;
   private String[] T013X2_A396EmprCod ;
   private String[] T013X2_A9520SMMaqCod ;
   private boolean[] T013X2_n9520SMMaqCod ;
   private String[] T013X15_A407EmprNom ;
   private boolean[] T013X15_n407EmprNom ;
   private String[] T013X16_A9521SMMaqDsc ;
   private boolean[] T013X16_n9521SMMaqDsc ;
   private String[] T013X17_A396EmprCod ;
   private int[] T013X17_A9425OMCod ;
   private String[] T013X18_A396EmprCod ;
   private int[] T013X18_A9428SMCod ;
   private boolean[] T013X18_n9428SMCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV22SMMaqCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV16TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV17TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV19WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV23DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
}

final  class tmsolic__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmsolic__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmsolic__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmsolic__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tmsolic__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T013X2", "SELECT SMCod, SMDsc, SMFchCre, SMUsuCre, SMEst, SMTxt, SMCal, SMPri, EmprCod, SMMaqCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ?  FOR UPDATE OF SMDsc, SMFchCre, SMUsuCre, SMEst, SMTxt, SMCal, SMPri, SMMaqCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X3", "SELECT SMCod, SMDsc, SMFchCre, SMUsuCre, SMEst, SMTxt, SMCal, SMPri, EmprCod, SMMaqCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X5", "SELECT MaqDsc AS SMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X6", "SELECT /*+ FIRST_ROWS(100) */ TM1.SMCod, T2.EmprNom, TM1.SMDsc, TM1.SMFchCre, TM1.SMUsuCre, T3.MaqDsc AS SMMaqDsc, TM1.SMEst, TM1.SMTxt, TM1.SMCal, TM1.SMPri, TM1.EmprCod, TM1.SMMaqCod AS SMMaqCod FROM ((TXPMSOLIC TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN TXPMAQUIN T3 ON T3.EmprCod = TM1.EmprCod AND T3.MaqCod = TM1.SMMaqCod) WHERE TM1.EmprCod = ? and TM1.SMCod = ? ORDER BY TM1.EmprCod, TM1.SMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X7", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X8", "SELECT MaqDsc AS SMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X9", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SMCod FROM TXPMSOLIC WHERE EmprCod = ? AND SMCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X10", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SMCod FROM TXPMSOLIC WHERE ( EmprCod > ? or EmprCod = ? and SMCod > ?) ORDER BY EmprCod, SMCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013X11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SMCod FROM TXPMSOLIC WHERE ( EmprCod < ? or EmprCod = ? and SMCod < ?) ORDER BY EmprCod DESC, SMCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T013X12", "INSERT INTO TXPMSOLIC(SMCod, SMDsc, SMFchCre, SMUsuCre, SMEst, SMTxt, SMCal, SMPri, EmprCod, SMMaqCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPMSOLIC")
         ,new UpdateCursor("T013X13", "UPDATE TXPMSOLIC SET SMDsc=?, SMFchCre=?, SMUsuCre=?, SMEst=?, SMTxt=?, SMCal=?, SMPri=?, SMMaqCod=?  WHERE EmprCod = ? AND SMCod = ?", GX_NOMASK, "TXPMSOLIC")
         ,new UpdateCursor("T013X14", "DELETE FROM TXPMSOLIC  WHERE EmprCod = ? AND SMCod = ?", GX_NOMASK, "TXPMSOLIC")
         ,new ForEachCursor("T013X15", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X16", "SELECT MaqDsc AS SMMaqDsc FROM TXPMAQUIN WHERE EmprCod = ? AND MaqCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T013X17", "SELECT * FROM (SELECT EmprCod, OMCod FROM TXPMORDEN WHERE EmprCod = ? AND SMCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T013X18", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SMCod FROM TXPMSOLIC ORDER BY EmprCod, SMCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((String[]) buf[15])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((byte[]) buf[11])[0] = rslt.getByte(7);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8);
               ((String[]) buf[14])[0] = rslt.getString(9, 3);
               ((String[]) buf[15])[0] = rslt.getString(10, 6);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(5, 8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 16);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((byte[]) buf[15])[0] = rslt.getByte(9);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((byte[]) buf[17])[0] = rslt.getByte(10);
               ((String[]) buf[18])[0] = rslt.getString(11, 3);
               ((String[]) buf[19])[0] = rslt.getString(12, 6);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 16 :
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
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(3, ((Number) parms[3]).intValue());
               }
               return;
            case 10 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 30);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 8);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 1);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 2000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               stmt.setByte(8, ((Number) parms[14]).byteValue());
               stmt.setString(9, (String)parms[15], 3);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(10, (String)parms[17], 6);
               }
               return;
            case 11 :
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
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[5], 8);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 2000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
               }
               stmt.setByte(7, ((Number) parms[12]).byteValue());
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[14], 6);
               }
               stmt.setString(9, (String)parms[15], 3);
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[17]).intValue());
               }
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 14 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
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
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               return;
      }
   }

}

