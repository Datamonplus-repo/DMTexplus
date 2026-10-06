package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devoluciontejido_1_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action33") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_33_1TF1633( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action38") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_38_1TF1633( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"DEVCRULINE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asadevcruline1TF1633( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"DEVCRUFECA") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asadevcrufeca1TF1633( A396EmprCod, A11669DevCruId) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_42") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_42( A396EmprCod, A252CliCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_43") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A840TrnCod = (short)(GXutil.lval( httpContext.GetPar( "TrnCod"))) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_43( A396EmprCod, A840TrnCod) ;
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
            AV16EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
            AV17DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17DevCruId), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17DevCruId), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Devolucion Tejido (cabecera)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public devoluciontejido_1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devoluciontejido_1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_1_impl.class ));
   }

   public devoluciontejido_1_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbDevCruEnvA = new HTMLChoice();
      cmbDevCruAT = new HTMLChoice();
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
      if ( cmbDevCruEnvA.getItemCount() > 0 )
      {
         A11679DevCruEnvA = (byte)(GXutil.lval( cmbDevCruEnvA.getValidValue(GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDevCruEnvA.setValue( GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEnvA.getInternalname(), "Values", cmbDevCruEnvA.ToJavascriptSource(), true);
      }
      if ( cmbDevCruAT.getItemCount() > 0 )
      {
         A11681DevCruAT = cmbDevCruAT.getValidValue(A11681DevCruAT) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbDevCruAT.setValue( GXutil.rtrim( A11681DevCruAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbDevCruAT.getInternalname(), "Values", cmbDevCruAT.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruId_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruId_Internalname, GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruId_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruFec_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtDevCruFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFec_Internalname, localUtil.format(A11670DevCruFec, "99/99/99"), localUtil.format( A11670DevCruFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruFecA_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruFecA_Internalname, httpContext.getMessage( "Data Guia Ant.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruFecA_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruFecA_Internalname, localUtil.format(A14394DevCruFecA, "99/99/99"), localUtil.format( A14394DevCruFecA, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruFecA_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruFecA_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruFecA_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruFecA_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_clicod.setProperty("Caption", Combo_clicod_Caption);
      ucCombo_clicod.setProperty("Cls", Combo_clicod_Cls);
      ucCombo_clicod.setProperty("EmptyItem", Combo_clicod_Emptyitem);
      ucCombo_clicod.setProperty("DropDownOptionsData", AV24CliCod_Data);
      ucCombo_clicod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicod_Internalname, "COMBO_CLICODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, edtCliCod_Enabled, 1, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV27TrnCod_Data);
      ucCombo_trncod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_trncod_Internalname, "COMBO_TRNCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtTrnCod_Internalname, httpContext.getMessage( "Codigo Transportista", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruMat_Internalname, httpContext.getMessage( "Matricula", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruMat_Internalname, GXutil.rtrim( A11672DevCruMat), GXutil.rtrim( localUtil.format( A11672DevCruMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruSal_Internalname, httpContext.getMessage( "Data-Hora Saida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruSal_Internalname, localUtil.ttoc( A11673DevCruSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11673DevCruSal, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruSal_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      httpContext.writeTextNL( "</div>") ;
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtDevCruObs_Internalname, A11682DevCruObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,73);\"", (short)(0), 1, edtDevCruObs_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruLine_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruLine_Internalname, httpContext.getMessage( "Lineas?", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruLine_Internalname, GXutil.ltrim( localUtil.ntoc( A14395DevCruLine, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtDevCruLine_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14395DevCruLine), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14395DevCruLine), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruLine_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruLine_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
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
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* User Defined Control */
      ucDvpanel_unnamedtable1.setProperty("Width", Dvpanel_unnamedtable1_Width);
      ucDvpanel_unnamedtable1.setProperty("AutoWidth", Dvpanel_unnamedtable1_Autowidth);
      ucDvpanel_unnamedtable1.setProperty("AutoHeight", Dvpanel_unnamedtable1_Autoheight);
      ucDvpanel_unnamedtable1.setProperty("Cls", Dvpanel_unnamedtable1_Cls);
      ucDvpanel_unnamedtable1.setProperty("Title", Dvpanel_unnamedtable1_Title);
      ucDvpanel_unnamedtable1.setProperty("Collapsible", Dvpanel_unnamedtable1_Collapsible);
      ucDvpanel_unnamedtable1.setProperty("Collapsed", Dvpanel_unnamedtable1_Collapsed);
      ucDvpanel_unnamedtable1.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable1_Showcollapseicon);
      ucDvpanel_unnamedtable1.setProperty("IconPosition", Dvpanel_unnamedtable1_Iconposition);
      ucDvpanel_unnamedtable1.setProperty("AutoScroll", Dvpanel_unnamedtable1_Autoscroll);
      ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbDevCruEnvA.getInternalname(), httpContext.getMessage( "Estado envio AT", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDevCruEnvA, cmbDevCruEnvA.getInternalname(), GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0)), 1, cmbDevCruEnvA.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbDevCruEnvA.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      cmbDevCruEnvA.setValue( GXutil.trim( GXutil.str( A11679DevCruEnvA, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEnvA.getInternalname(), "Values", cmbDevCruEnvA.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruAtId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruAtId_Internalname, httpContext.getMessage( "Codigo AT", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruAtId_Internalname, GXutil.rtrim( A11680DevCruAtId), GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruAtId_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruAtId_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbDevCruAT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbDevCruAT.getInternalname(), httpContext.getMessage( "A/M", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbDevCruAT, cmbDevCruAT.getInternalname(), GXutil.rtrim( A11681DevCruAT), 1, cmbDevCruAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbDevCruAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      cmbDevCruAT.setValue( GXutil.rtrim( A11681DevCruAT) );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruAT.getInternalname(), "Values", cmbDevCruAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruDtSy_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruDtSy_Internalname, httpContext.getMessage( "Data System Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtDevCruDtSy_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruDtSy_Internalname, localUtil.ttoc( A11676DevCruDtSy, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruDtSy_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruDtSy_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtDevCruDtSy_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtDevCruDtSy_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevCruATCU_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevCruATCU_Internalname, httpContext.getMessage( "ATCUD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevCruATCU_Internalname, GXutil.rtrim( A13983DevCruATCU), GXutil.rtrim( localUtil.format( A13983DevCruATCU, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevCruATCU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevCruATCU_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtDevFirma4d_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtDevFirma4d_Internalname, httpContext.getMessage( "Hash", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtDevFirma4d_Internalname, GXutil.rtrim( A14375DevFirma4d), GXutil.rtrim( localUtil.format( A14375DevFirma4d, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtDevFirma4d_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtDevFirma4d_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV34Pgmname), GXutil.rtrim( localUtil.format( AV34Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_clicod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavComboclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV26ComboCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavComboclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26ComboCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26ComboCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavComboclicod_Jsonclick, 0, "Attribute", "", "", "", "", edtavComboclicod_Visible, edtavComboclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV28ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV28ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV28ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_1.htm");
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
      e111TF2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICOD_DATA"), AV24CliCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV27TrnCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "Z11669DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11670DevCruFec = localUtil.ctod( httpContext.cgiGet( "Z11670DevCruFec"), 0) ;
            Z11673DevCruSal = localUtil.ctot( httpContext.cgiGet( "Z11673DevCruSal"), 0) ;
            Z11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11671DevCruEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11672DevCruMat = httpContext.cgiGet( "Z11672DevCruMat") ;
            Z11674DevCruHash = httpContext.cgiGet( "Z11674DevCruHash") ;
            Z11675DevCruDesc = httpContext.cgiGet( "Z11675DevCruDesc") ;
            Z11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( "Z11676DevCruDtSy"), 0) ;
            Z11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "Z11677DevCruGros")) ;
            Z11678DevCruStt = httpContext.cgiGet( "Z11678DevCruStt") ;
            Z11679DevCruEnvA = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11679DevCruEnvA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z11680DevCruAtId = httpContext.cgiGet( "Z11680DevCruAtId") ;
            Z11681DevCruAT = httpContext.cgiGet( "Z11681DevCruAT") ;
            Z11682DevCruObs = httpContext.cgiGet( "Z11682DevCruObs") ;
            Z13983DevCruATCU = httpContext.cgiGet( "Z13983DevCruATCU") ;
            Z13984DevCruSerA = httpContext.cgiGet( "Z13984DevCruSerA") ;
            Z13985DevCruTipA = httpContext.cgiGet( "Z13985DevCruTipA") ;
            Z252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "Z252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z11671DevCruEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11674DevCruHash = httpContext.cgiGet( "Z11674DevCruHash") ;
            A11675DevCruDesc = httpContext.cgiGet( "Z11675DevCruDesc") ;
            A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "Z11677DevCruGros")) ;
            A11678DevCruStt = httpContext.cgiGet( "Z11678DevCruStt") ;
            A13984DevCruSerA = httpContext.cgiGet( "Z13984DevCruSerA") ;
            A13985DevCruTipA = httpContext.cgiGet( "Z13985DevCruTipA") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "N252CliCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A11674DevCruHash = httpContext.cgiGet( "DEVCRUHASH") ;
            AV16EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV17DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV21Insert_CliCod = (int)(localUtil.ctol( httpContext.cgiGet( "vINSERT_CLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV22Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV29Clicod = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11678DevCruStt = httpContext.cgiGet( "DEVCRUSTT") ;
            AV7FirmaD = (short)(localUtil.ctol( httpContext.cgiGet( "vFIRMAD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV35Pgmdesc = httpContext.cgiGet( "vPGMDESC") ;
            A13984DevCruSerA = httpContext.cgiGet( "DEVCRUSERA") ;
            A13985DevCruTipA = httpContext.cgiGet( "DEVCRUTIPA") ;
            A11671DevCruEst = (byte)(localUtil.ctol( httpContext.cgiGet( "DEVCRUEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A11675DevCruDesc = httpContext.cgiGet( "DEVCRUDESC") ;
            A11677DevCruGros = localUtil.ctond( httpContext.cgiGet( "DEVCRUGROS")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A279CliNom = httpContext.cgiGet( "CLINOM") ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            Combo_clicod_Objectcall = httpContext.cgiGet( "COMBO_CLICOD_Objectcall") ;
            Combo_clicod_Class = httpContext.cgiGet( "COMBO_CLICOD_Class") ;
            Combo_clicod_Icontype = httpContext.cgiGet( "COMBO_CLICOD_Icontype") ;
            Combo_clicod_Icon = httpContext.cgiGet( "COMBO_CLICOD_Icon") ;
            Combo_clicod_Caption = httpContext.cgiGet( "COMBO_CLICOD_Caption") ;
            Combo_clicod_Tooltip = httpContext.cgiGet( "COMBO_CLICOD_Tooltip") ;
            Combo_clicod_Cls = httpContext.cgiGet( "COMBO_CLICOD_Cls") ;
            Combo_clicod_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_set") ;
            Combo_clicod_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedvalue_get") ;
            Combo_clicod_Selectedtext_set = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_set") ;
            Combo_clicod_Selectedtext_get = httpContext.cgiGet( "COMBO_CLICOD_Selectedtext_get") ;
            Combo_clicod_Gamoauthtoken = httpContext.cgiGet( "COMBO_CLICOD_Gamoauthtoken") ;
            Combo_clicod_Ddointernalname = httpContext.cgiGet( "COMBO_CLICOD_Ddointernalname") ;
            Combo_clicod_Titlecontrolalign = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolalign") ;
            Combo_clicod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_CLICOD_Dropdownoptionstype") ;
            Combo_clicod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Enabled")) ;
            Combo_clicod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Visible")) ;
            Combo_clicod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_CLICOD_Titlecontrolidtoreplace") ;
            Combo_clicod_Datalisttype = httpContext.cgiGet( "COMBO_CLICOD_Datalisttype") ;
            Combo_clicod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Allowmultipleselection")) ;
            Combo_clicod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_CLICOD_Datalistfixedvalues") ;
            Combo_clicod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Isgriditem")) ;
            Combo_clicod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Hasdescription")) ;
            Combo_clicod_Datalistproc = httpContext.cgiGet( "COMBO_CLICOD_Datalistproc") ;
            Combo_clicod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_CLICOD_Datalistprocparametersprefix") ;
            Combo_clicod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_CLICOD_Remoteservicesparameters") ;
            Combo_clicod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_CLICOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_clicod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeonlyselectedoption")) ;
            Combo_clicod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeselectalloption")) ;
            Combo_clicod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Emptyitem")) ;
            Combo_clicod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICOD_Includeaddnewoption")) ;
            Combo_clicod_Htmltemplate = httpContext.cgiGet( "COMBO_CLICOD_Htmltemplate") ;
            Combo_clicod_Multiplevaluestype = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluestype") ;
            Combo_clicod_Loadingdata = httpContext.cgiGet( "COMBO_CLICOD_Loadingdata") ;
            Combo_clicod_Noresultsfound = httpContext.cgiGet( "COMBO_CLICOD_Noresultsfound") ;
            Combo_clicod_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICOD_Emptyitemtext") ;
            Combo_clicod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_CLICOD_Onlyselectedvalues") ;
            Combo_clicod_Selectalltext = httpContext.cgiGet( "COMBO_CLICOD_Selectalltext") ;
            Combo_clicod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_CLICOD_Multiplevaluesseparator") ;
            Combo_clicod_Addnewoptiontext = httpContext.cgiGet( "COMBO_CLICOD_Addnewoptiontext") ;
            Combo_trncod_Objectcall = httpContext.cgiGet( "COMBO_TRNCOD_Objectcall") ;
            Combo_trncod_Class = httpContext.cgiGet( "COMBO_TRNCOD_Class") ;
            Combo_trncod_Icontype = httpContext.cgiGet( "COMBO_TRNCOD_Icontype") ;
            Combo_trncod_Icon = httpContext.cgiGet( "COMBO_TRNCOD_Icon") ;
            Combo_trncod_Caption = httpContext.cgiGet( "COMBO_TRNCOD_Caption") ;
            Combo_trncod_Tooltip = httpContext.cgiGet( "COMBO_TRNCOD_Tooltip") ;
            Combo_trncod_Cls = httpContext.cgiGet( "COMBO_TRNCOD_Cls") ;
            Combo_trncod_Selectedvalue_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_set") ;
            Combo_trncod_Selectedvalue_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedvalue_get") ;
            Combo_trncod_Selectedtext_set = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_set") ;
            Combo_trncod_Selectedtext_get = httpContext.cgiGet( "COMBO_TRNCOD_Selectedtext_get") ;
            Combo_trncod_Gamoauthtoken = httpContext.cgiGet( "COMBO_TRNCOD_Gamoauthtoken") ;
            Combo_trncod_Ddointernalname = httpContext.cgiGet( "COMBO_TRNCOD_Ddointernalname") ;
            Combo_trncod_Titlecontrolalign = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolalign") ;
            Combo_trncod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_TRNCOD_Dropdownoptionstype") ;
            Combo_trncod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Enabled")) ;
            Combo_trncod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Visible")) ;
            Combo_trncod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_TRNCOD_Titlecontrolidtoreplace") ;
            Combo_trncod_Datalisttype = httpContext.cgiGet( "COMBO_TRNCOD_Datalisttype") ;
            Combo_trncod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Allowmultipleselection")) ;
            Combo_trncod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Datalistfixedvalues") ;
            Combo_trncod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Isgriditem")) ;
            Combo_trncod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Hasdescription")) ;
            Combo_trncod_Datalistproc = httpContext.cgiGet( "COMBO_TRNCOD_Datalistproc") ;
            Combo_trncod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_TRNCOD_Datalistprocparametersprefix") ;
            Combo_trncod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_TRNCOD_Remoteservicesparameters") ;
            Combo_trncod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_TRNCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_trncod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeonlyselectedoption")) ;
            Combo_trncod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeselectalloption")) ;
            Combo_trncod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Emptyitem")) ;
            Combo_trncod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_TRNCOD_Includeaddnewoption")) ;
            Combo_trncod_Htmltemplate = httpContext.cgiGet( "COMBO_TRNCOD_Htmltemplate") ;
            Combo_trncod_Multiplevaluestype = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluestype") ;
            Combo_trncod_Loadingdata = httpContext.cgiGet( "COMBO_TRNCOD_Loadingdata") ;
            Combo_trncod_Noresultsfound = httpContext.cgiGet( "COMBO_TRNCOD_Noresultsfound") ;
            Combo_trncod_Emptyitemtext = httpContext.cgiGet( "COMBO_TRNCOD_Emptyitemtext") ;
            Combo_trncod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_TRNCOD_Onlyselectedvalues") ;
            Combo_trncod_Selectalltext = httpContext.cgiGet( "COMBO_TRNCOD_Selectalltext") ;
            Combo_trncod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_TRNCOD_Multiplevaluesseparator") ;
            Combo_trncod_Addnewoptiontext = httpContext.cgiGet( "COMBO_TRNCOD_Addnewoptiontext") ;
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
            Dvpanel_unnamedtable1_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Objectcall") ;
            Dvpanel_unnamedtable1_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Class") ;
            Dvpanel_unnamedtable1_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Enabled")) ;
            Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
            Dvpanel_unnamedtable1_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Height") ;
            Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
            Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
            Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
            Dvpanel_unnamedtable1_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showheader")) ;
            Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
            Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
            Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
            Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
            Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
            Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
            Dvpanel_unnamedtable1_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Visible")) ;
            Datamonjs_Objectcall = httpContext.cgiGet( "DATAMONJS_Objectcall") ;
            Datamonjs_Class = httpContext.cgiGet( "DATAMONJS_Class") ;
            Datamonjs_Enabled = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Enabled")) ;
            Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
            Datamonjs_Visible = GXutil.strtobool( httpContext.cgiGet( "DATAMONJS_Visible")) ;
            Datamonjs_Gxcontroltype = (int)(localUtil.ctol( httpContext.cgiGet( "DATAMONJS_Gxcontroltype"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11669DevCruId = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            else
            {
               A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruId_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtDevCruFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "DEVCRUFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11670DevCruFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            }
            else
            {
               A11670DevCruFec = localUtil.ctod( httpContext.cgiGet( edtDevCruFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
            }
            A14394DevCruFecA = localUtil.ctod( httpContext.cgiGet( edtDevCruFecA_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TRNCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTrnCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A840TrnCod = (short)(0) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            else
            {
               A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
            A11672DevCruMat = httpContext.cgiGet( edtDevCruMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
            A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A11682DevCruObs = httpContext.cgiGet( edtDevCruObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
            A14395DevCruLine = (short)(localUtil.ctol( httpContext.cgiGet( edtDevCruLine_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14395DevCruLine), 4, 0));
            cmbDevCruEnvA.setValue( httpContext.cgiGet( cmbDevCruEnvA.getInternalname()) );
            A11679DevCruEnvA = (byte)(GXutil.lval( httpContext.cgiGet( cmbDevCruEnvA.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
            A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
            cmbDevCruAT.setValue( httpContext.cgiGet( cmbDevCruAT.getInternalname()) );
            A11681DevCruAT = httpContext.cgiGet( cmbDevCruAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A13983DevCruATCU = httpContext.cgiGet( edtDevCruATCU_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
            A14375DevFirma4d = httpContext.cgiGet( edtDevFirma4d_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14375DevFirma4d", A14375DevFirma4d);
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
            AV26ComboCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavComboclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ComboCliCod), 6, 0));
            AV28ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboTrnCod), 4, 0));
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_1");
            A11679DevCruEnvA = (byte)(GXutil.lval( httpContext.cgiGet( cmbDevCruEnvA.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
            forbiddenHiddens.add("DevCruEnvA", localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV34Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV34Pgmname, "")));
            A11673DevCruSal = localUtil.ctot( httpContext.cgiGet( edtDevCruSal_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("DevCruSal", localUtil.format( A11673DevCruSal, "99/99/99 99:99"));
            forbiddenHiddens.add("DevCruEst", localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"));
            forbiddenHiddens.add("DevCruHash", GXutil.rtrim( localUtil.format( A11674DevCruHash, "")));
            forbiddenHiddens.add("DevCruDesc", GXutil.rtrim( localUtil.format( A11675DevCruDesc, "")));
            A11676DevCruDtSy = localUtil.ctot( httpContext.cgiGet( edtDevCruDtSy_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
            forbiddenHiddens.add("DevCruGros", localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99"));
            forbiddenHiddens.add("DevCruStt", GXutil.rtrim( localUtil.format( A11678DevCruStt, "")));
            A11680DevCruAtId = httpContext.cgiGet( edtDevCruAtId_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
            forbiddenHiddens.add("DevCruAtId", GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")));
            A11681DevCruAT = httpContext.cgiGet( cmbDevCruAT.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
            forbiddenHiddens.add("DevCruAT", GXutil.rtrim( localUtil.format( A11681DevCruAT, "")));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A11669DevCruId != Z11669DevCruId ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("almacensindetalle\\devoluciontejido_1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
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
                  sMode1633 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode1633 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound1633 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1TF0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "DEVCRUID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtDevCruId_Internalname ;
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
                        e111TF2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121TF2 ();
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
         e121TF2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1TF1633( ) ;
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
         disableAttributes1TF1633( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
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

   public void confirm_1TF0( )
   {
      beforeValidate1TF1633( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1TF1633( ) ;
         }
         else
         {
            checkExtendedTable1TF1633( ) ;
            closeExtendedTableCursors1TF1633( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1TF0( )
   {
   }

   public void e111TF2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      devoluciontejido_1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      devoluciontejido_1_impl.this.A396EmprCod = GXv_char2[0] ;
      devoluciontejido_1_impl.this.AV14EmprNom = GXv_char3[0] ;
      devoluciontejido_1_impl.this.AV15UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXt_int5 = (byte)(AV7FirmaD) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int6) ;
      devoluciontejido_1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV7FirmaD = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7FirmaD), 4, 0));
      GXt_int5 = (byte)(AV8Ws) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "WSDM", ""), GXv_int6) ;
      devoluciontejido_1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV8Ws = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Ws", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Ws), 4, 0));
      GXt_int5 = (byte)(AV9Modhh) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "UPDHHS", ""), GXv_int6) ;
      devoluciontejido_1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV9Modhh = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Modhh", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Modhh), 4, 0));
      GXt_int5 = (byte)(AV10Reg000) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "REG000", ""), GXv_int6) ;
      devoluciontejido_1_impl.this.GXt_int5 = GXv_int6[0] ;
      AV10Reg000 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Reg000", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Reg000), 4, 0));
      GXt_int7 = AV11copias ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "DEVEND", ""), GXv_int8) ;
      devoluciontejido_1_impl.this.GXt_int7 = GXv_int8[0] ;
      AV11copias = (short)(GXt_int7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11copias), 4, 0));
      AV11copias = (short)(((0==AV11copias) ? 1 : AV11copias)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11copias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11copias), 4, 0));
      AV12Copias2 = AV11copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12Copias2), 4, 0));
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      devoluciontejido_1_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char4[0] = AV16EmprCod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      devoluciontejido_1_impl.this.AV16EmprCod = GXv_char4[0] ;
      devoluciontejido_1_impl.this.AV14EmprNom = GXv_char3[0] ;
      devoluciontejido_1_impl.this.AV15UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprNom", AV14EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      GXv_SdtWWPContext9[0] = AV18WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV18WWPContext = GXv_SdtWWPContext9[0] ;
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV28ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      AV26ComboCliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ComboCliCod), 6, 0));
      edtavComboclicod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICOD' */
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
      /* Execute user subroutine: 'LOADCOMBOTRNCOD' */
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
      AV19TrnContext.fromxml(AV20WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV19TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV34Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV36GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         while ( AV36GXV1 <= AV19TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV23TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV19TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV36GXV1));
            if ( GXutil.strcmp(AV23TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "CliCod") == 0 )
            {
               AV21Insert_CliCod = (int)(GXutil.lval( AV23TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Insert_CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Insert_CliCod), 6, 0));
               if ( ! (0==AV21Insert_CliCod) )
               {
                  AV26ComboCliCod = AV21Insert_CliCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ComboCliCod), 6, 0));
                  Combo_clicod_Selectedvalue_set = GXutil.trim( GXutil.str( AV26ComboCliCod, 6, 0)) ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
                  Combo_clicod_Enabled = false ;
                  ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV23TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV22Insert_TrnCod = (short)(GXutil.lval( AV23TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22Insert_TrnCod), 4, 0));
               if ( ! (0==AV22Insert_TrnCod) )
               {
                  AV28ComboTrnCod = AV22Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV28ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            AV36GXV1 = (int)(AV36GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GXV1), 8, 0));
         }
      }
   }

   public void e121TF2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_8", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A11669DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A11670DevCruFec)),GXutil.URLEncode(GXutil.ltrimstr(A11679DevCruEnvA,1,0)),GXutil.URLEncode(GXutil.rtrim(A11680DevCruAtId)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A11676DevCruDtSy))}, new String[] {"EmprCod","DevCruId","DevCruFec","DevCruEnvA","DevCruAtId","CliCod","DevCruDtSys"}) , new Object[] {});
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
      if ( 1 == 0 )
      {
         if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV19TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
         {
            callWebObject(formatLink("app.almacensindetalle.devoluciontejido_1ww", new String[] {}, new String[] {}) );
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
   }

   public void S122( )
   {
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV27TrnCod_Data ;
      GXv_char4[0] = AV25ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.almacensindetalle.devoluciontejido_1loaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV16EmprCod, AV17DevCruId, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      devoluciontejido_1_impl.this.AV25ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV27TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_trncod_Selectedvalue_set = AV25ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV28ComboTrnCod = (short)(GXutil.lval( AV25ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = AV24CliCod_Data ;
      GXv_char4[0] = AV25ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item11[0] = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      new app.almacensindetalle.devoluciontejido_1loaddvcombo(remoteHandle, context).execute( "CliCod", Gx_mode, AV16EmprCod, AV17DevCruId, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item11) ;
      devoluciontejido_1_impl.this.AV25ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = GXv_objcol_SdtDVB_SDTComboData_Item11[0] ;
      AV24CliCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item10 ;
      Combo_clicod_Selectedvalue_set = AV25ComboSelectedValue ;
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "SelectedValue_set", Combo_clicod_Selectedvalue_set);
      AV26ComboCliCod = (int)(GXutil.lval( AV25ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ComboCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ComboCliCod), 6, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
   }

   public void zm1TF1633( int GX_JID )
   {
      if ( ( GX_JID == 40 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z11670DevCruFec = T01TF3_A11670DevCruFec[0] ;
            Z11673DevCruSal = T01TF3_A11673DevCruSal[0] ;
            Z11671DevCruEst = T01TF3_A11671DevCruEst[0] ;
            Z11672DevCruMat = T01TF3_A11672DevCruMat[0] ;
            Z11674DevCruHash = T01TF3_A11674DevCruHash[0] ;
            Z11675DevCruDesc = T01TF3_A11675DevCruDesc[0] ;
            Z11676DevCruDtSy = T01TF3_A11676DevCruDtSy[0] ;
            Z11677DevCruGros = T01TF3_A11677DevCruGros[0] ;
            Z11678DevCruStt = T01TF3_A11678DevCruStt[0] ;
            Z11679DevCruEnvA = T01TF3_A11679DevCruEnvA[0] ;
            Z11680DevCruAtId = T01TF3_A11680DevCruAtId[0] ;
            Z11681DevCruAT = T01TF3_A11681DevCruAT[0] ;
            Z11682DevCruObs = T01TF3_A11682DevCruObs[0] ;
            Z13983DevCruATCU = T01TF3_A13983DevCruATCU[0] ;
            Z13984DevCruSerA = T01TF3_A13984DevCruSerA[0] ;
            Z13985DevCruTipA = T01TF3_A13985DevCruTipA[0] ;
            Z252CliCod = T01TF3_A252CliCod[0] ;
            Z840TrnCod = T01TF3_A840TrnCod[0] ;
         }
         else
         {
            Z11670DevCruFec = A11670DevCruFec ;
            Z11673DevCruSal = A11673DevCruSal ;
            Z11671DevCruEst = A11671DevCruEst ;
            Z11672DevCruMat = A11672DevCruMat ;
            Z11674DevCruHash = A11674DevCruHash ;
            Z11675DevCruDesc = A11675DevCruDesc ;
            Z11676DevCruDtSy = A11676DevCruDtSy ;
            Z11677DevCruGros = A11677DevCruGros ;
            Z11678DevCruStt = A11678DevCruStt ;
            Z11679DevCruEnvA = A11679DevCruEnvA ;
            Z11680DevCruAtId = A11680DevCruAtId ;
            Z11681DevCruAT = A11681DevCruAT ;
            Z11682DevCruObs = A11682DevCruObs ;
            Z13983DevCruATCU = A13983DevCruATCU ;
            Z13984DevCruSerA = A13984DevCruSerA ;
            Z13985DevCruTipA = A13985DevCruTipA ;
            Z252CliCod = A252CliCod ;
            Z840TrnCod = A840TrnCod ;
         }
      }
      if ( GX_JID == -40 )
      {
         Z11669DevCruId = A11669DevCruId ;
         Z11670DevCruFec = A11670DevCruFec ;
         Z11673DevCruSal = A11673DevCruSal ;
         Z11671DevCruEst = A11671DevCruEst ;
         Z11672DevCruMat = A11672DevCruMat ;
         Z11674DevCruHash = A11674DevCruHash ;
         Z11675DevCruDesc = A11675DevCruDesc ;
         Z11676DevCruDtSy = A11676DevCruDtSy ;
         Z11677DevCruGros = A11677DevCruGros ;
         Z11678DevCruStt = A11678DevCruStt ;
         Z11679DevCruEnvA = A11679DevCruEnvA ;
         Z11680DevCruAtId = A11680DevCruAtId ;
         Z11681DevCruAT = A11681DevCruAT ;
         Z11682DevCruObs = A11682DevCruObs ;
         Z13983DevCruATCU = A13983DevCruATCU ;
         Z13984DevCruSerA = A13984DevCruSerA ;
         Z13985DevCruTipA = A13985DevCruTipA ;
         Z396EmprCod = A396EmprCod ;
         Z252CliCod = A252CliCod ;
         Z840TrnCod = A840TrnCod ;
         Z407EmprNom = A407EmprNom ;
         Z279CliNom = A279CliNom ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbDevCruEnvA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEnvA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDevCruEnvA.getEnabled(), 5, 0), true);
      edtDevCruAtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Enabled), 5, 0), true);
      cmbDevCruAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDevCruAT.getEnabled(), 5, 0), true);
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      edtDevCruATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruATCU_Enabled), 5, 0), true);
      edtDevCruSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSal_Enabled), 5, 0), true);
      edtDevCruFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFecA_Enabled), 5, 0), true);
      AV35Pgmdesc = httpContext.getMessage( "Devolucion Tejido (cabecera)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Pgmdesc", AV35Pgmdesc);
      AV34Pgmname = "AlmacenSinDetalle.DevolucionTejido_1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Pgmname", AV34Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbDevCruEnvA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEnvA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDevCruEnvA.getEnabled(), 5, 0), true);
      edtDevCruAtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Enabled), 5, 0), true);
      cmbDevCruAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDevCruAT.getEnabled(), 5, 0), true);
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      edtDevCruATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruATCU_Enabled), 5, 0), true);
      edtDevCruSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSal_Enabled), 5, 0), true);
      edtDevCruFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFecA_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV16EmprCod)==0) )
      {
         A396EmprCod = AV16EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01TF4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01TF4_A407EmprNom[0] ;
      n407EmprNom = T01TF4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV17DevCruId) )
      {
         A11669DevCruId = AV17DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      if ( ! (0==AV17DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            edtDevCruId_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
         }
         else
         {
            edtDevCruId_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV17DevCruId) )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV21Insert_CliCod) )
      {
         edtCliCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      else
      {
         edtCliCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV22Insert_TrnCod) )
      {
         edtTrnCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
      else
      {
         edtTrnCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      }
   }

   public void standaloneModal( )
   {
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV21Insert_CliCod) )
      {
         A252CliCod = AV21Insert_CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      else
      {
         A252CliCod = AV26ComboCliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV22Insert_TrnCod) )
      {
         A840TrnCod = AV22Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV28ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            n840TrnCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV28ComboTrnCod) )
            {
               A840TrnCod = AV28ComboTrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         edtDevCruId_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A11670DevCruFec)) && ( Gx_BScreen == 0 ) )
      {
         A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11680DevCruAtId)==0) && ( Gx_BScreen == 0 ) )
      {
         A11680DevCruAtId = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      }
      if ( isIns( )  && (0==A11679DevCruEnvA) && ( Gx_BScreen == 0 ) )
      {
         A11679DevCruEnvA = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A11681DevCruAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A11681DevCruAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      }
      if ( isIns( )  && (GXutil.strcmp("", A11678DevCruStt)==0) && ( Gx_BScreen == 0 ) )
      {
         A11678DevCruStt = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_int12 = A14395DevCruLine ;
         GXv_int13[0] = GXt_int12 ;
         new app.almacensindetalle.devoluciontejido_lineas(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_int13) ;
         devoluciontejido_1_impl.this.GXt_int12 = GXv_int13[0] ;
         A14395DevCruLine = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14395DevCruLine), 4, 0));
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14395DevCruLine > 0 ) )
         {
            Combo_clicod_Enabled = false ;
            ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
         }
         GXt_date14 = A14394DevCruFecA ;
         GXv_date15[0] = GXt_date14 ;
         new app.almacensindetalle.devoluciontejido_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_date15) ;
         devoluciontejido_1_impl.this.GXt_date14 = GXv_date15[0] ;
         A14394DevCruFecA = GXt_date14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
         /* Using cursor T01TF5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TF5_A279CliNom[0] ;
         pr_default.close(3);
         if ( true /* After */ )
         {
            AV29Clicod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicod), 6, 0));
         }
         /* Using cursor T01TF6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01TF6_A841TrnNom[0] ;
         n841TrnNom = T01TF6_n841TrnNom[0] ;
         pr_default.close(4);
      }
   }

   public void load1TF1633( )
   {
      /* Using cursor T01TF7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A407EmprNom = T01TF7_A407EmprNom[0] ;
         n407EmprNom = T01TF7_n407EmprNom[0] ;
         A11670DevCruFec = T01TF7_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = T01TF7_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A279CliNom = T01TF7_A279CliNom[0] ;
         A841TrnNom = T01TF7_A841TrnNom[0] ;
         n841TrnNom = T01TF7_n841TrnNom[0] ;
         A11671DevCruEst = T01TF7_A11671DevCruEst[0] ;
         A11672DevCruMat = T01TF7_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01TF7_A11674DevCruHash[0] ;
         A11675DevCruDesc = T01TF7_A11675DevCruDesc[0] ;
         A11676DevCruDtSy = T01TF7_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01TF7_A11677DevCruGros[0] ;
         A11678DevCruStt = T01TF7_A11678DevCruStt[0] ;
         A11679DevCruEnvA = T01TF7_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01TF7_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01TF7_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01TF7_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A13983DevCruATCU = T01TF7_A13983DevCruATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
         A13984DevCruSerA = T01TF7_A13984DevCruSerA[0] ;
         A13985DevCruTipA = T01TF7_A13985DevCruTipA[0] ;
         A252CliCod = T01TF7_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01TF7_A840TrnCod[0] ;
         n840TrnCod = T01TF7_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         zm1TF1633( -40) ;
      }
      pr_default.close(5);
      onLoadActions1TF1633( ) ;
   }

   public void onLoadActions1TF1633( )
   {
      if ( true /* After */ )
      {
         AV29Clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicod), 6, 0));
      }
      A14375DevFirma4d = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14375DevFirma4d", A14375DevFirma4d);
      GXt_int12 = A14395DevCruLine ;
      GXv_int13[0] = GXt_int12 ;
      new app.almacensindetalle.devoluciontejido_lineas(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_int13) ;
      devoluciontejido_1_impl.this.GXt_int12 = GXv_int13[0] ;
      A14395DevCruLine = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14395DevCruLine), 4, 0));
      if ( ( GXutil.strcmp(sMode1633, "INS") != 0 ) && ( A14395DevCruLine > 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
      GXt_date14 = A14394DevCruFecA ;
      GXv_date15[0] = GXt_date14 ;
      new app.almacensindetalle.devoluciontejido_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_date15) ;
      devoluciontejido_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14394DevCruFecA = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
   }

   public void checkExtendedTable1TF1633( )
   {
      nIsDirty_1633 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( ( AV7FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14394DevCruFecA)) && GXutil.resetTime(A11670DevCruFec).before( GXutil.resetTime( A14394DevCruFecA )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Data documento ", "")+GXutil.trim( localUtil.dtoc( A11670DevCruFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+httpContext.getMessage( ", inferior a Data Doc. Ant. ", "")+GXutil.trim( localUtil.dtoc( A14394DevCruFecA, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), 1, "DEVCRUFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( true /* After */ )
      {
         AV29Clicod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicod), 6, 0));
      }
      nIsDirty_1633 = (short)(1) ;
      A14375DevFirma4d = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14375DevFirma4d", A14375DevFirma4d);
      /* Using cursor T01TF5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TF5_A279CliNom[0] ;
      pr_default.close(3);
      /* Using cursor T01TF6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01TF6_A841TrnNom[0] ;
      n841TrnNom = T01TF6_n841TrnNom[0] ;
      pr_default.close(4);
      nIsDirty_1633 = (short)(1) ;
      GXt_int12 = A14395DevCruLine ;
      GXv_int13[0] = GXt_int12 ;
      new app.almacensindetalle.devoluciontejido_lineas(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_int13) ;
      devoluciontejido_1_impl.this.GXt_int12 = GXv_int13[0] ;
      A14395DevCruLine = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14395DevCruLine), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14395DevCruLine > 0 ) )
      {
         Combo_clicod_Enabled = false ;
         ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      }
      nIsDirty_1633 = (short)(1) ;
      GXt_date14 = A14394DevCruFecA ;
      GXv_date15[0] = GXt_date14 ;
      new app.almacensindetalle.devoluciontejido_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_date15) ;
      devoluciontejido_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14394DevCruFecA = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
   }

   public void closeExtendedTableCursors1TF1633( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_42( String A396EmprCod ,
                          int A252CliCod )
   {
      /* Using cursor T01TF8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A279CliNom = T01TF8_A279CliNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279CliNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_43( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01TF9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01TF9_A841TrnNom[0] ;
      n841TrnNom = T01TF9_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1TF1633( )
   {
      /* Using cursor T01TF10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound1633 = (short)(1) ;
      }
      else
      {
         RcdFound1633 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01TF3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
      if ( (pr_default.getStatus(1) != 101) && ( GXutil.strcmp(T01TF3_A396EmprCod[0], A396EmprCod) == 0 ) )
      {
         zm1TF1633( 40) ;
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01TF3_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         A11670DevCruFec = T01TF3_A11670DevCruFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
         A11673DevCruSal = T01TF3_A11673DevCruSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11671DevCruEst = T01TF3_A11671DevCruEst[0] ;
         A11672DevCruMat = T01TF3_A11672DevCruMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
         A11674DevCruHash = T01TF3_A11674DevCruHash[0] ;
         A11675DevCruDesc = T01TF3_A11675DevCruDesc[0] ;
         A11676DevCruDtSy = T01TF3_A11676DevCruDtSy[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A11677DevCruGros = T01TF3_A11677DevCruGros[0] ;
         A11678DevCruStt = T01TF3_A11678DevCruStt[0] ;
         A11679DevCruEnvA = T01TF3_A11679DevCruEnvA[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         A11680DevCruAtId = T01TF3_A11680DevCruAtId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
         A11681DevCruAT = T01TF3_A11681DevCruAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
         A11682DevCruObs = T01TF3_A11682DevCruObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
         A13983DevCruATCU = T01TF3_A13983DevCruATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
         A13984DevCruSerA = T01TF3_A13984DevCruSerA[0] ;
         A13985DevCruTipA = T01TF3_A13985DevCruTipA[0] ;
         A252CliCod = T01TF3_A252CliCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A840TrnCod = T01TF3_A840TrnCod[0] ;
         n840TrnCod = T01TF3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z11669DevCruId = A11669DevCruId ;
         sMode1633 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1TF1633( ) ;
         if ( AnyError == 1 )
         {
            RcdFound1633 = (short)(0) ;
            initializeNonKey1TF1633( ) ;
         }
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound1633 = (short)(0) ;
         initializeNonKey1TF1633( ) ;
         sMode1633 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode1633 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1TF1633( ) ;
      if ( RcdFound1633 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound1633 = (short)(0) ;
      /* Using cursor T01TF11 */
      pr_default.execute(9, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T01TF11_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01TF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T01TF11_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01TF11_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01TF11_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound1633 = (short)(0) ;
      /* Using cursor T01TF12 */
      pr_default.execute(10, new Object[] {Integer.valueOf(A11669DevCruId), A396EmprCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( T01TF12_A11669DevCruId[0] > A11669DevCruId ) ) && ( GXutil.strcmp(T01TF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( T01TF12_A11669DevCruId[0] < A11669DevCruId ) ) && ( GXutil.strcmp(T01TF12_A396EmprCod[0], A396EmprCod) == 0 ) )
         {
            A11669DevCruId = T01TF12_A11669DevCruId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
            RcdFound1633 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1TF1633( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1TF1633( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound1633 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
            {
               A11669DevCruId = Z11669DevCruId ;
               httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "DEVCRUID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1TF1633( ) ;
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
            {
               /* Insert record */
               GX_FocusControl = edtDevCruId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1TF1633( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "DEVCRUID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtDevCruId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1TF1633( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A11669DevCruId != Z11669DevCruId ) )
      {
         A11669DevCruId = Z11669DevCruId ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtDevCruId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1TF1633( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01TF2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01TF2_A11670DevCruFec[0])) ) || !( GXutil.dateCompare(Z11673DevCruSal, T01TF2_A11673DevCruSal[0]) ) || ( Z11671DevCruEst != T01TF2_A11671DevCruEst[0] ) || ( GXutil.strcmp(Z11672DevCruMat, T01TF2_A11672DevCruMat[0]) != 0 ) || ( GXutil.strcmp(Z11674DevCruHash, T01TF2_A11674DevCruHash[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11675DevCruDesc, T01TF2_A11675DevCruDesc[0]) != 0 ) || !( GXutil.dateCompare(Z11676DevCruDtSy, T01TF2_A11676DevCruDtSy[0]) ) || ( DecimalUtil.compareTo(Z11677DevCruGros, T01TF2_A11677DevCruGros[0]) != 0 ) || ( GXutil.strcmp(Z11678DevCruStt, T01TF2_A11678DevCruStt[0]) != 0 ) || ( Z11679DevCruEnvA != T01TF2_A11679DevCruEnvA[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z11680DevCruAtId, T01TF2_A11680DevCruAtId[0]) != 0 ) || ( GXutil.strcmp(Z11681DevCruAT, T01TF2_A11681DevCruAT[0]) != 0 ) || ( GXutil.strcmp(Z11682DevCruObs, T01TF2_A11682DevCruObs[0]) != 0 ) || ( GXutil.strcmp(Z13983DevCruATCU, T01TF2_A13983DevCruATCU[0]) != 0 ) || ( GXutil.strcmp(Z13984DevCruSerA, T01TF2_A13984DevCruSerA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z13985DevCruTipA, T01TF2_A13985DevCruTipA[0]) != 0 ) || ( Z252CliCod != T01TF2_A252CliCod[0] ) || ( Z840TrnCod != T01TF2_A840TrnCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11670DevCruFec), GXutil.resetTime(T01TF2_A11670DevCruFec[0])) ) )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruFec");
               GXutil.writeLogRaw("Old: ",Z11670DevCruFec);
               GXutil.writeLogRaw("Current: ",T01TF2_A11670DevCruFec[0]);
            }
            if ( !( GXutil.dateCompare(Z11673DevCruSal, T01TF2_A11673DevCruSal[0]) ) )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruSal");
               GXutil.writeLogRaw("Old: ",Z11673DevCruSal);
               GXutil.writeLogRaw("Current: ",T01TF2_A11673DevCruSal[0]);
            }
            if ( Z11671DevCruEst != T01TF2_A11671DevCruEst[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruEst");
               GXutil.writeLogRaw("Old: ",Z11671DevCruEst);
               GXutil.writeLogRaw("Current: ",T01TF2_A11671DevCruEst[0]);
            }
            if ( GXutil.strcmp(Z11672DevCruMat, T01TF2_A11672DevCruMat[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruMat");
               GXutil.writeLogRaw("Old: ",Z11672DevCruMat);
               GXutil.writeLogRaw("Current: ",T01TF2_A11672DevCruMat[0]);
            }
            if ( GXutil.strcmp(Z11674DevCruHash, T01TF2_A11674DevCruHash[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruHash");
               GXutil.writeLogRaw("Old: ",Z11674DevCruHash);
               GXutil.writeLogRaw("Current: ",T01TF2_A11674DevCruHash[0]);
            }
            if ( GXutil.strcmp(Z11675DevCruDesc, T01TF2_A11675DevCruDesc[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruDesc");
               GXutil.writeLogRaw("Old: ",Z11675DevCruDesc);
               GXutil.writeLogRaw("Current: ",T01TF2_A11675DevCruDesc[0]);
            }
            if ( !( GXutil.dateCompare(Z11676DevCruDtSy, T01TF2_A11676DevCruDtSy[0]) ) )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruDtSy");
               GXutil.writeLogRaw("Old: ",Z11676DevCruDtSy);
               GXutil.writeLogRaw("Current: ",T01TF2_A11676DevCruDtSy[0]);
            }
            if ( DecimalUtil.compareTo(Z11677DevCruGros, T01TF2_A11677DevCruGros[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruGros");
               GXutil.writeLogRaw("Old: ",Z11677DevCruGros);
               GXutil.writeLogRaw("Current: ",T01TF2_A11677DevCruGros[0]);
            }
            if ( GXutil.strcmp(Z11678DevCruStt, T01TF2_A11678DevCruStt[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruStt");
               GXutil.writeLogRaw("Old: ",Z11678DevCruStt);
               GXutil.writeLogRaw("Current: ",T01TF2_A11678DevCruStt[0]);
            }
            if ( Z11679DevCruEnvA != T01TF2_A11679DevCruEnvA[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruEnvA");
               GXutil.writeLogRaw("Old: ",Z11679DevCruEnvA);
               GXutil.writeLogRaw("Current: ",T01TF2_A11679DevCruEnvA[0]);
            }
            if ( GXutil.strcmp(Z11680DevCruAtId, T01TF2_A11680DevCruAtId[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruAtId");
               GXutil.writeLogRaw("Old: ",Z11680DevCruAtId);
               GXutil.writeLogRaw("Current: ",T01TF2_A11680DevCruAtId[0]);
            }
            if ( GXutil.strcmp(Z11681DevCruAT, T01TF2_A11681DevCruAT[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruAT");
               GXutil.writeLogRaw("Old: ",Z11681DevCruAT);
               GXutil.writeLogRaw("Current: ",T01TF2_A11681DevCruAT[0]);
            }
            if ( GXutil.strcmp(Z11682DevCruObs, T01TF2_A11682DevCruObs[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruObs");
               GXutil.writeLogRaw("Old: ",Z11682DevCruObs);
               GXutil.writeLogRaw("Current: ",T01TF2_A11682DevCruObs[0]);
            }
            if ( GXutil.strcmp(Z13983DevCruATCU, T01TF2_A13983DevCruATCU[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruATCU");
               GXutil.writeLogRaw("Old: ",Z13983DevCruATCU);
               GXutil.writeLogRaw("Current: ",T01TF2_A13983DevCruATCU[0]);
            }
            if ( GXutil.strcmp(Z13984DevCruSerA, T01TF2_A13984DevCruSerA[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruSerA");
               GXutil.writeLogRaw("Old: ",Z13984DevCruSerA);
               GXutil.writeLogRaw("Current: ",T01TF2_A13984DevCruSerA[0]);
            }
            if ( GXutil.strcmp(Z13985DevCruTipA, T01TF2_A13985DevCruTipA[0]) != 0 )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"DevCruTipA");
               GXutil.writeLogRaw("Old: ",Z13985DevCruTipA);
               GXutil.writeLogRaw("Current: ",T01TF2_A13985DevCruTipA[0]);
            }
            if ( Z252CliCod != T01TF2_A252CliCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"CliCod");
               GXutil.writeLogRaw("Old: ",Z252CliCod);
               GXutil.writeLogRaw("Current: ",T01TF2_A252CliCod[0]);
            }
            if ( Z840TrnCod != T01TF2_A840TrnCod[0] )
            {
               GXutil.writeLogln("almacensindetalle.devoluciontejido_1:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01TF2_A840TrnCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPDEVCRU"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1TF1633( )
   {
      beforeValidate1TF1633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TF1633( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1TF1633( 0) ;
         checkOptimisticConcurrency1TF1633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TF1633( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1TF1633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TF13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A11669DevCruId), A11670DevCruFec, A11673DevCruSal, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, A13983DevCruATCU, A13984DevCruSerA, A13985DevCruTipA, A396EmprCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
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
                        resetCaption1TF0( ) ;
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
            load1TF1633( ) ;
         }
         endLevel1TF1633( ) ;
      }
      closeExtendedTableCursors1TF1633( ) ;
   }

   public void update1TF1633( )
   {
      beforeValidate1TF1633( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1TF1633( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TF1633( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1TF1633( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1TF1633( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01TF14 */
                  pr_default.execute(12, new Object[] {A11670DevCruFec, A11673DevCruSal, Byte.valueOf(A11671DevCruEst), A11672DevCruMat, A11674DevCruHash, A11675DevCruDesc, A11676DevCruDtSy, A11677DevCruGros, A11678DevCruStt, Byte.valueOf(A11679DevCruEnvA), A11680DevCruAtId, A11681DevCruAT, A11682DevCruObs, A13983DevCruATCU, A13984DevCruSerA, A13985DevCruTipA, Integer.valueOf(A252CliCod), Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), A396EmprCod, Integer.valueOf(A11669DevCruId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPDEVCRU"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1TF1633( ) ;
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
         endLevel1TF1633( ) ;
      }
      closeExtendedTableCursors1TF1633( ) ;
   }

   public void deferredUpdate1TF1633( )
   {
   }

   public void delete( )
   {
      beforeValidate1TF1633( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1TF1633( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1TF1633( ) ;
         afterConfirm1TF1633( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1TF1633( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01TF15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDEVCRU");
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
      sMode1633 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1TF1633( ) ;
      Gx_mode = sMode1633 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1TF1633( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( ( AV7FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "");
            AnyError = (short)(1) ;
         }
         if ( true /* After */ )
         {
            AV29Clicod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicod), 6, 0));
         }
         A14375DevFirma4d = GXutil.substring( A11674DevCruHash, 1, 1) + GXutil.substring( A11674DevCruHash, 11, 1) + GXutil.substring( A11674DevCruHash, 21, 1) + GXutil.substring( A11674DevCruHash, 31, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14375DevFirma4d", A14375DevFirma4d);
         /* Using cursor T01TF16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
         A279CliNom = T01TF16_A279CliNom[0] ;
         pr_default.close(14);
         /* Using cursor T01TF17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01TF17_A841TrnNom[0] ;
         n841TrnNom = T01TF17_n841TrnNom[0] ;
         pr_default.close(15);
         GXt_int12 = A14395DevCruLine ;
         GXv_int13[0] = GXt_int12 ;
         new app.almacensindetalle.devoluciontejido_lineas(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_int13) ;
         devoluciontejido_1_impl.this.GXt_int12 = GXv_int13[0] ;
         A14395DevCruLine = GXt_int12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14395DevCruLine), 4, 0));
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14395DevCruLine > 0 ) )
         {
            Combo_clicod_Enabled = false ;
            ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
         }
         GXt_date14 = A14394DevCruFecA ;
         GXv_date15[0] = GXt_date14 ;
         new app.almacensindetalle.devoluciontejido_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_date15) ;
         devoluciontejido_1_impl.this.GXt_date14 = GXv_date15[0] ;
         A14394DevCruFecA = GXt_date14 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01TF18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A11669DevCruId)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void endLevel1TF1633( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1TF1633( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_1");
         if ( AnyError == 0 )
         {
            confirmValues1TF0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "almacensindetalle.devoluciontejido_1");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1TF1633( )
   {
      /* Scan By routine */
      /* Using cursor T01TF19 */
      pr_default.execute(17, new Object[] {A396EmprCod});
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01TF19_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1TF1633( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound1633 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound1633 = (short)(1) ;
         A11669DevCruId = T01TF19_A11669DevCruId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void scanEnd1TF1633( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1TF1633( )
   {
      /* After Confirm Rules */
      if ( (0==A252CliCod) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO valido", ""), 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int8[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         devoluciontejido_1_impl.this.A11669DevCruId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
   }

   public void beforeInsert1TF1633( )
   {
      /* Before Insert Rules */
      GXv_char4[0] = A13983DevCruATCU ;
      GXv_char3[0] = A13984DevCruSerA ;
      GXv_char2[0] = A13985DevCruTipA ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, "022400", GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV34Pgmname)+"."+GXutil.trim( AV35Pgmdesc)) ;
      devoluciontejido_1_impl.this.A13983DevCruATCU = GXv_char4[0] ;
      devoluciontejido_1_impl.this.A13984DevCruSerA = GXv_char3[0] ;
      devoluciontejido_1_impl.this.A13985DevCruTipA = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
      if ( (GXutil.strcmp("", A13983DevCruATCU)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta codigo ATCUD", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void beforeUpdate1TF1633( )
   {
      /* Before Update Rules */
      GXv_char4[0] = A13983DevCruATCU ;
      GXv_char3[0] = A13984DevCruSerA ;
      GXv_char2[0] = A13985DevCruTipA ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, "022400", GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV34Pgmname)+"."+GXutil.trim( AV35Pgmdesc)) ;
      devoluciontejido_1_impl.this.A13983DevCruATCU = GXv_char4[0] ;
      devoluciontejido_1_impl.this.A13984DevCruSerA = GXv_char3[0] ;
      devoluciontejido_1_impl.this.A13985DevCruTipA = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
      if ( (GXutil.strcmp("", A13983DevCruATCU)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta codigo ATCUD", ""), 1, "");
         AnyError = (short)(1) ;
      }
      if ( (0==A840TrnCod) )
      {
         A840TrnCod = (short)(0) ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
   }

   public void beforeDelete1TF1633( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1TF1633( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1TF1633( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1TF1633( )
   {
      edtDevCruId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruId_Enabled), 5, 0), true);
      edtDevCruFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFec_Enabled), 5, 0), true);
      edtDevCruFecA_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruFecA_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruFecA_Enabled), 5, 0), true);
      edtCliCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtDevCruMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruMat_Enabled), 5, 0), true);
      edtDevCruSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruSal_Enabled), 5, 0), true);
      edtDevCruObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruObs_Enabled), 5, 0), true);
      edtDevCruLine_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruLine_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruLine_Enabled), 5, 0), true);
      cmbDevCruEnvA.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruEnvA.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDevCruEnvA.getEnabled(), 5, 0), true);
      edtDevCruAtId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruAtId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruAtId_Enabled), 5, 0), true);
      cmbDevCruAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbDevCruAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbDevCruAT.getEnabled(), 5, 0), true);
      edtDevCruDtSy_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruDtSy_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruDtSy_Enabled), 5, 0), true);
      edtDevCruATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevCruATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruATCU_Enabled), 5, 0), true);
      edtDevFirma4d_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtDevFirma4d_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevFirma4d_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavComboclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavComboclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavComboclicod_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1TF1633( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1TF0( )
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.devoluciontejido_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_1");
      forbiddenHiddens.add("DevCruEnvA", localUtil.format( DecimalUtil.doubleToDec(A11679DevCruEnvA), "9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV34Pgmname, "")));
      forbiddenHiddens.add("DevCruSal", localUtil.format( A11673DevCruSal, "99/99/99 99:99"));
      forbiddenHiddens.add("DevCruEst", localUtil.format( DecimalUtil.doubleToDec(A11671DevCruEst), "9"));
      forbiddenHiddens.add("DevCruHash", GXutil.rtrim( localUtil.format( A11674DevCruHash, "")));
      forbiddenHiddens.add("DevCruDesc", GXutil.rtrim( localUtil.format( A11675DevCruDesc, "")));
      forbiddenHiddens.add("DevCruDtSy", localUtil.format( A11676DevCruDtSy, "99/99/99 99:99"));
      forbiddenHiddens.add("DevCruGros", localUtil.format( A11677DevCruGros, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("DevCruStt", GXutil.rtrim( localUtil.format( A11678DevCruStt, "")));
      forbiddenHiddens.add("DevCruAtId", GXutil.rtrim( localUtil.format( A11680DevCruAtId, "")));
      forbiddenHiddens.add("DevCruAT", GXutil.rtrim( localUtil.format( A11681DevCruAT, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\devoluciontejido_1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11669DevCruId", GXutil.ltrim( localUtil.ntoc( Z11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11670DevCruFec", localUtil.dtoc( Z11670DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11673DevCruSal", localUtil.ttoc( Z11673DevCruSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11671DevCruEst", GXutil.ltrim( localUtil.ntoc( Z11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11672DevCruMat", GXutil.rtrim( Z11672DevCruMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11674DevCruHash", GXutil.rtrim( Z11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11675DevCruDesc", GXutil.rtrim( Z11675DevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11676DevCruDtSy", localUtil.ttoc( Z11676DevCruDtSy, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11677DevCruGros", GXutil.ltrim( localUtil.ntoc( Z11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11678DevCruStt", GXutil.rtrim( Z11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11679DevCruEnvA", GXutil.ltrim( localUtil.ntoc( Z11679DevCruEnvA, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11680DevCruAtId", GXutil.rtrim( Z11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11681DevCruAT", GXutil.rtrim( Z11681DevCruAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11682DevCruObs", Z11682DevCruObs);
      app.GxWebStd.gx_hidden_field( httpContext, "Z13983DevCruATCU", GXutil.rtrim( Z13983DevCruATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13984DevCruSerA", GXutil.rtrim( Z13984DevCruSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13985DevCruTipA", GXutil.rtrim( Z13985DevCruTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z252CliCod", GXutil.ltrim( localUtil.ntoc( Z252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N252CliCod", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICOD_DATA", AV24CliCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICOD_DATA", AV24CliCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV27TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV27TrnCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV19TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV19TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV19TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUHASH", GXutil.rtrim( A11674DevCruHash));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV17DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_CLICOD", GXutil.ltrim( localUtil.ntoc( AV21Insert_CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV22Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV29Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSTT", GXutil.rtrim( A11678DevCruStt));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV7FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV35Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSERA", GXutil.rtrim( A13984DevCruSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUTIPA", GXutil.rtrim( A13985DevCruTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUEST", GXutil.ltrim( localUtil.ntoc( A11671DevCruEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUDESC", GXutil.rtrim( A11675DevCruDesc));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUGROS", GXutil.ltrim( localUtil.ntoc( A11677DevCruGros, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Objectcall", GXutil.rtrim( Combo_clicod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Cls", GXutil.rtrim( Combo_clicod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Selectedvalue_set", GXutil.rtrim( Combo_clicod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICOD_Emptyitem", GXutil.booltostr( Combo_clicod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable1_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Enabled", GXutil.booltostr( Dvpanel_unnamedtable1_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      return formatLink("app.almacensindetalle.devoluciontejido_1", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV16EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV17DevCruId,8,0))}, new String[] {"Gx_mode","EmprCod","DevCruId"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.DevolucionTejido_1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Devolucion Tejido (cabecera)", "") ;
   }

   public void initializeNonKey1TF1633( )
   {
      A252CliCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      AV29Clicod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29Clicod), 6, 0));
      A14375DevFirma4d = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14375DevFirma4d", A14375DevFirma4d);
      A14394DevCruFecA = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
      A14395DevCruLine = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14395DevCruLine), 4, 0));
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11673DevCruSal", localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A279CliNom = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A11671DevCruEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11671DevCruEst", GXutil.str( A11671DevCruEst, 1, 0));
      A11672DevCruMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11672DevCruMat", A11672DevCruMat);
      A11674DevCruHash = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11674DevCruHash", A11674DevCruHash);
      A11675DevCruDesc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11675DevCruDesc", A11675DevCruDesc);
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A11676DevCruDtSy", localUtil.ttoc( A11676DevCruDtSy, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A11677DevCruGros = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A11677DevCruGros", GXutil.ltrimstr( A11677DevCruGros, 13, 2));
      A11682DevCruObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A11682DevCruObs", A11682DevCruObs);
      A13983DevCruATCU = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
      A13984DevCruSerA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
      A13985DevCruTipA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
      A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11678DevCruStt = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
      A11679DevCruEnvA = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11680DevCruAtId = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11681DevCruAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11671DevCruEst = (byte)(0) ;
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11679DevCruEnvA = (byte)(0) ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z13983DevCruATCU = "" ;
      Z13984DevCruSerA = "" ;
      Z13985DevCruTipA = "" ;
      Z252CliCod = 0 ;
      Z840TrnCod = (short)(0) ;
   }

   public void initAll1TF1633( )
   {
      A11669DevCruId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      initializeNonKey1TF1633( ) ;
   }

   public void standaloneModalInsert( )
   {
      A11670DevCruFec = i11670DevCruFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A11670DevCruFec", localUtil.format(A11670DevCruFec, "99/99/99"));
      A11680DevCruAtId = i11680DevCruAtId ;
      httpContext.ajax_rsp_assign_attri("", false, "A11680DevCruAtId", A11680DevCruAtId);
      A11679DevCruEnvA = i11679DevCruEnvA ;
      httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
      A11681DevCruAT = i11681DevCruAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
      A11678DevCruStt = i11678DevCruStt ;
      httpContext.ajax_rsp_assign_attri("", false, "A11678DevCruStt", A11678DevCruStt);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211610679", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/devoluciontejido_1.js", "?20268211610679", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtDevCruId_Internalname = "DEVCRUID" ;
      edtDevCruFec_Internalname = "DEVCRUFEC" ;
      edtDevCruFecA_Internalname = "DEVCRUFECA" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      Combo_clicod_Internalname = "COMBO_CLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divTablesplittedclicod_Internalname = "TABLESPLITTEDCLICOD" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtDevCruMat_Internalname = "DEVCRUMAT" ;
      edtDevCruSal_Internalname = "DEVCRUSAL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtDevCruObs_Internalname = "DEVCRUOBS" ;
      edtDevCruLine_Internalname = "DEVCRULINE" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      cmbDevCruEnvA.setInternalname( "DEVCRUENVA" );
      edtDevCruAtId_Internalname = "DEVCRUATID" ;
      cmbDevCruAT.setInternalname( "DEVCRUAT" );
      edtDevCruDtSy_Internalname = "DEVCRUDTSY" ;
      edtDevCruATCU_Internalname = "DEVCRUATCU" ;
      edtDevFirma4d_Internalname = "DEVFIRMA4D" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavComboclicod_Internalname = "vCOMBOCLICOD" ;
      divSectionattribute_clicod_Internalname = "SECTIONATTRIBUTE_CLICOD" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
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
      Form.setCaption( httpContext.getMessage( "Devolucion Tejido (cabecera)", "") );
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavComboclicod_Jsonclick = "" ;
      edtavComboclicod_Enabled = 0 ;
      edtavComboclicod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtDevFirma4d_Jsonclick = "" ;
      edtDevFirma4d_Enabled = 0 ;
      edtDevCruATCU_Jsonclick = "" ;
      edtDevCruATCU_Enabled = 0 ;
      edtDevCruDtSy_Jsonclick = "" ;
      edtDevCruDtSy_Enabled = 0 ;
      cmbDevCruAT.setJsonclick( "" );
      cmbDevCruAT.setEnabled( 0 );
      edtDevCruAtId_Jsonclick = "" ;
      edtDevCruAtId_Enabled = 0 ;
      cmbDevCruEnvA.setJsonclick( "" );
      cmbDevCruEnvA.setEnabled( 0 );
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "AT", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      edtDevCruLine_Jsonclick = "" ;
      edtDevCruLine_Enabled = 0 ;
      edtDevCruObs_Enabled = 1 ;
      edtDevCruSal_Jsonclick = "" ;
      edtDevCruSal_Enabled = 0 ;
      edtDevCruMat_Jsonclick = "" ;
      edtDevCruMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 1 ;
      edtCliCod_Visible = 1 ;
      Combo_clicod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicod_Enabled = GXutil.toBoolean( -1) ;
      edtDevCruFecA_Jsonclick = "" ;
      edtDevCruFecA_Enabled = 0 ;
      edtDevCruFec_Jsonclick = "" ;
      edtDevCruFec_Enabled = 1 ;
      edtDevCruId_Jsonclick = "" ;
      edtDevCruId_Enabled = 1 ;
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

   public void gx3asadevcruline1TF1633( String A396EmprCod ,
                                        int A11669DevCruId )
   {
      GXt_int12 = A14395DevCruLine ;
      GXv_int13[0] = GXt_int12 ;
      new app.almacensindetalle.devoluciontejido_lineas(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_int13) ;
      devoluciontejido_1_impl.this.GXt_int12 = GXv_int13[0] ;
      A14395DevCruLine = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14395DevCruLine), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14395DevCruLine, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asadevcrufeca1TF1633( String A396EmprCod ,
                                        int A11669DevCruId )
   {
      GXt_date14 = A14394DevCruFecA ;
      GXv_date15[0] = GXt_date14 ;
      new app.almacensindetalle.devoluciontejido_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_date15) ;
      devoluciontejido_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14394DevCruFecA = GXt_date14 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A14394DevCruFecA, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_33_1TF1633( String A396EmprCod ,
                              int A11669DevCruId )
   {
      if ( (0==A11669DevCruId) && true /* After */ )
      {
         GXv_int8[0] = A11669DevCruId ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, "022400", GXv_int8) ;
         A11669DevCruId = GXv_int8[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11669DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A11669DevCruId), 8, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_38_1TF1633( )
   {
      GXv_char4[0] = A13983DevCruATCU ;
      GXv_char3[0] = A13984DevCruSerA ;
      GXv_char2[0] = A13985DevCruTipA ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, "022400", GXv_char4, GXv_char3, GXv_char2, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV34Pgmname)+"."+GXutil.trim( AV35Pgmdesc)) ;
      A13983DevCruATCU = GXv_char4[0] ;
      A13984DevCruSerA = GXv_char3[0] ;
      A13985DevCruTipA = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A13983DevCruATCU", A13983DevCruATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A13984DevCruSerA", A13984DevCruSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A13985DevCruTipA", A13985DevCruTipA);
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
      cmbDevCruEnvA.setName( "DEVCRUENVA" );
      cmbDevCruEnvA.setWebtags( "" );
      cmbDevCruEnvA.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbDevCruEnvA.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
      if ( cmbDevCruEnvA.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A11679DevCruEnvA) )
         {
            A11679DevCruEnvA = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A11679DevCruEnvA", GXutil.str( A11679DevCruEnvA, 1, 0));
         }
      }
      cmbDevCruAT.setName( "DEVCRUAT" );
      cmbDevCruAT.setWebtags( "" );
      cmbDevCruAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbDevCruAT.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      if ( cmbDevCruAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A11681DevCruAT)==0) )
         {
            A11681DevCruAT = " " ;
            httpContext.ajax_rsp_assign_attri("", false, "A11681DevCruAT", A11681DevCruAT);
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

   public void valid_Devcruid( )
   {
      GXt_int12 = A14395DevCruLine ;
      GXv_int13[0] = GXt_int12 ;
      new app.almacensindetalle.devoluciontejido_lineas(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_int13) ;
      devoluciontejido_1_impl.this.GXt_int12 = GXv_int13[0] ;
      A14395DevCruLine = GXt_int12 ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14395DevCruLine > 0 ) )
      {
         Combo_clicod_Enabled = false ;
      }
      GXt_date14 = A14394DevCruFecA ;
      GXv_date15[0] = GXt_date14 ;
      new app.almacensindetalle.devoluciontejido_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A11669DevCruId, GXv_date15) ;
      devoluciontejido_1_impl.this.GXt_date14 = GXv_date15[0] ;
      A14394DevCruFecA = GXt_date14 ;
      if ( ( GXutil.strcmp(A11678DevCruStt, httpContext.getMessage( "A", "")) == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA", ""), 1, "DEVCRUID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruId_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14395DevCruLine", GXutil.ltrim( localUtil.ntoc( A14395DevCruLine, (byte)(4), (byte)(0), ".", "")));
      ucCombo_clicod.sendProperty(context, "", false, Combo_clicod_Internalname, "Enabled", GXutil.booltostr( Combo_clicod_Enabled));
      httpContext.ajax_rsp_assign_attri("", false, "A14394DevCruFecA", localUtil.format(A14394DevCruFecA, "99/99/99"));
   }

   public void valid_Clicod( )
   {
      /* Using cursor T01TF16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "CLIENT", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "CLICOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtCliCod_Internalname ;
      }
      A279CliNom = T01TF16_A279CliNom[0] ;
      pr_default.close(14);
      if ( true /* After */ )
      {
         AV29Clicod = A252CliCod ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", GXutil.rtrim( A279CliNom));
      httpContext.ajax_rsp_assign_attri("", false, "AV29Clicod", GXutil.ltrim( localUtil.ntoc( AV29Clicod, (byte)(6), (byte)(0), ".", "")));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01TF17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01TF17_A841TrnNom[0] ;
      n841TrnNom = T01TF17_n841TrnNom[0] ;
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
   }

   public void valid_Devcruatid( )
   {
      if ( ( AV7FirmaD == 1 ) && ( GXutil.strcmp(A11680DevCruAtId, " ") != 0 ) && ( isDlt( )  || isUpd( )  ) && true /* Level */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Comunicada AT", ""), 1, "DEVCRUATID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtDevCruAtId_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV17DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV19TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV17DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'cmbDevCruEnvA'},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'AV34Pgmname',fld:'vPGMNAME',pic:''},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'},{av:'A11671DevCruEst',fld:'DEVCRUEST',pic:'9'},{av:'A11674DevCruHash',fld:'DEVCRUHASH',pic:''},{av:'A11675DevCruDesc',fld:'DEVCRUDESC',pic:''},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A11677DevCruGros',fld:'DEVCRUGROS',pic:'ZZZZZZZZZ9.99'},{av:'A11678DevCruStt',fld:'DEVCRUSTT',pic:''},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'cmbDevCruAT'},{av:'A11681DevCruAT',fld:'DEVCRUAT',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121TF2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11670DevCruFec',fld:'DEVCRUFEC',pic:''},{av:'cmbDevCruEnvA'},{av:'A11679DevCruEnvA',fld:'DEVCRUENVA',pic:'9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'AV19TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUID","{handler:'valid_Devcruid',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A14395DevCruLine',fld:'DEVCRULINE',pic:'ZZZ9'},{av:'A14394DevCruFecA',fld:'DEVCRUFECA',pic:''}]");
      setEventMetadata("VALID_DEVCRUID",",oparms:[{av:'A14395DevCruLine',fld:'DEVCRULINE',pic:'ZZZ9'},{av:'Combo_clicod_Enabled',ctrl:'COMBO_CLICOD',prop:'Enabled'},{av:'A14394DevCruFecA',fld:'DEVCRUFECA',pic:''}]}");
      setEventMetadata("VALID_DEVCRUFEC","{handler:'valid_Devcrufec',iparms:[]");
      setEventMetadata("VALID_DEVCRUFEC",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV29Clicod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALID_CLICOD",",oparms:[{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV29Clicod',fld:'vCLICOD',pic:'ZZZZZ9'}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_DEVCRULINE","{handler:'valid_Devcruline',iparms:[]");
      setEventMetadata("VALID_DEVCRULINE",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUATID","{handler:'valid_Devcruatid',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7FirmaD',fld:'vFIRMAD',pic:'ZZZ9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''}]");
      setEventMetadata("VALID_DEVCRUATID",",oparms:[]}");
      setEventMetadata("VALID_DEVCRUATCU","{handler:'valid_Devcruatcu',iparms:[]");
      setEventMetadata("VALID_DEVCRUATCU",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOCLICOD","{handler:'validv_Comboclicod',iparms:[]");
      setEventMetadata("VALIDV_COMBOCLICOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
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
      wcpOAV16EmprCod = "" ;
      Z396EmprCod = "" ;
      Z11670DevCruFec = GXutil.nullDate() ;
      Z11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      Z11672DevCruMat = "" ;
      Z11674DevCruHash = "" ;
      Z11675DevCruDesc = "" ;
      Z11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      Z11677DevCruGros = DecimalUtil.ZERO ;
      Z11678DevCruStt = "" ;
      Z11680DevCruAtId = "" ;
      Z11681DevCruAT = "" ;
      Z11682DevCruObs = "" ;
      Z13983DevCruATCU = "" ;
      Z13984DevCruSerA = "" ;
      Z13985DevCruTipA = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_clicod_Selectedvalue_get = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Gx_mode = "" ;
      AV16EmprCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A11681DevCruAT = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A11670DevCruFec = GXutil.nullDate() ;
      A14394DevCruFecA = GXutil.nullDate() ;
      lblTextblockclicod_Jsonclick = "" ;
      ucCombo_clicod = new com.genexus.webpanels.GXUserControl();
      Combo_clicod_Caption = "" ;
      AV24CliCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV27TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A11672DevCruMat = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11682DevCruObs = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      A11680DevCruAtId = "" ;
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A13983DevCruATCU = "" ;
      A14375DevFirma4d = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV34Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A11674DevCruHash = "" ;
      A11675DevCruDesc = "" ;
      A11677DevCruGros = DecimalUtil.ZERO ;
      A11678DevCruStt = "" ;
      A13984DevCruSerA = "" ;
      A13985DevCruTipA = "" ;
      AV35Pgmdesc = "" ;
      A407EmprNom = "" ;
      A279CliNom = "" ;
      A841TrnNom = "" ;
      Combo_clicod_Objectcall = "" ;
      Combo_clicod_Class = "" ;
      Combo_clicod_Icontype = "" ;
      Combo_clicod_Icon = "" ;
      Combo_clicod_Tooltip = "" ;
      Combo_clicod_Selectedvalue_set = "" ;
      Combo_clicod_Selectedtext_set = "" ;
      Combo_clicod_Selectedtext_get = "" ;
      Combo_clicod_Gamoauthtoken = "" ;
      Combo_clicod_Ddointernalname = "" ;
      Combo_clicod_Titlecontrolalign = "" ;
      Combo_clicod_Dropdownoptionstype = "" ;
      Combo_clicod_Titlecontrolidtoreplace = "" ;
      Combo_clicod_Datalisttype = "" ;
      Combo_clicod_Datalistfixedvalues = "" ;
      Combo_clicod_Datalistproc = "" ;
      Combo_clicod_Datalistprocparametersprefix = "" ;
      Combo_clicod_Remoteservicesparameters = "" ;
      Combo_clicod_Htmltemplate = "" ;
      Combo_clicod_Multiplevaluestype = "" ;
      Combo_clicod_Loadingdata = "" ;
      Combo_clicod_Noresultsfound = "" ;
      Combo_clicod_Emptyitemtext = "" ;
      Combo_clicod_Onlyselectedvalues = "" ;
      Combo_clicod_Selectalltext = "" ;
      Combo_clicod_Multiplevaluesseparator = "" ;
      Combo_clicod_Addnewoptiontext = "" ;
      Combo_trncod_Objectcall = "" ;
      Combo_trncod_Class = "" ;
      Combo_trncod_Icontype = "" ;
      Combo_trncod_Icon = "" ;
      Combo_trncod_Tooltip = "" ;
      Combo_trncod_Selectedvalue_set = "" ;
      Combo_trncod_Selectedtext_set = "" ;
      Combo_trncod_Selectedtext_get = "" ;
      Combo_trncod_Gamoauthtoken = "" ;
      Combo_trncod_Ddointernalname = "" ;
      Combo_trncod_Titlecontrolalign = "" ;
      Combo_trncod_Dropdownoptionstype = "" ;
      Combo_trncod_Titlecontrolidtoreplace = "" ;
      Combo_trncod_Datalisttype = "" ;
      Combo_trncod_Datalistfixedvalues = "" ;
      Combo_trncod_Datalistproc = "" ;
      Combo_trncod_Datalistprocparametersprefix = "" ;
      Combo_trncod_Remoteservicesparameters = "" ;
      Combo_trncod_Htmltemplate = "" ;
      Combo_trncod_Multiplevaluestype = "" ;
      Combo_trncod_Loadingdata = "" ;
      Combo_trncod_Noresultsfound = "" ;
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Onlyselectedvalues = "" ;
      Combo_trncod_Selectalltext = "" ;
      Combo_trncod_Multiplevaluesseparator = "" ;
      Combo_trncod_Addnewoptiontext = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Dvpanel_unnamedtable1_Objectcall = "" ;
      Dvpanel_unnamedtable1_Class = "" ;
      Dvpanel_unnamedtable1_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode1633 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV13Station = "" ;
      AV14EmprNom = "" ;
      AV15UsurCod = "" ;
      GXv_int6 = new byte[1] ;
      GXt_char1 = "" ;
      AV18WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV19TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV20WebSession = httpContext.getWebSession();
      AV23TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV25ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item11 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      Z279CliNom = "" ;
      Z841TrnNom = "" ;
      T01TF4_A407EmprNom = new String[] {""} ;
      T01TF4_n407EmprNom = new boolean[] {false} ;
      T01TF5_A279CliNom = new String[] {""} ;
      T01TF6_A841TrnNom = new String[] {""} ;
      T01TF6_n841TrnNom = new boolean[] {false} ;
      T01TF7_A11669DevCruId = new int[1] ;
      T01TF7_A407EmprNom = new String[] {""} ;
      T01TF7_n407EmprNom = new boolean[] {false} ;
      T01TF7_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF7_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF7_A279CliNom = new String[] {""} ;
      T01TF7_A841TrnNom = new String[] {""} ;
      T01TF7_n841TrnNom = new boolean[] {false} ;
      T01TF7_A11671DevCruEst = new byte[1] ;
      T01TF7_A11672DevCruMat = new String[] {""} ;
      T01TF7_A11674DevCruHash = new String[] {""} ;
      T01TF7_A11675DevCruDesc = new String[] {""} ;
      T01TF7_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF7_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TF7_A11678DevCruStt = new String[] {""} ;
      T01TF7_A11679DevCruEnvA = new byte[1] ;
      T01TF7_A11680DevCruAtId = new String[] {""} ;
      T01TF7_A11681DevCruAT = new String[] {""} ;
      T01TF7_A11682DevCruObs = new String[] {""} ;
      T01TF7_A13983DevCruATCU = new String[] {""} ;
      T01TF7_A13984DevCruSerA = new String[] {""} ;
      T01TF7_A13985DevCruTipA = new String[] {""} ;
      T01TF7_A396EmprCod = new String[] {""} ;
      T01TF7_A252CliCod = new int[1] ;
      T01TF7_A840TrnCod = new short[1] ;
      T01TF7_n840TrnCod = new boolean[] {false} ;
      T01TF8_A279CliNom = new String[] {""} ;
      T01TF9_A841TrnNom = new String[] {""} ;
      T01TF9_n841TrnNom = new boolean[] {false} ;
      T01TF10_A396EmprCod = new String[] {""} ;
      T01TF10_A11669DevCruId = new int[1] ;
      T01TF3_A11669DevCruId = new int[1] ;
      T01TF3_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF3_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF3_A11671DevCruEst = new byte[1] ;
      T01TF3_A11672DevCruMat = new String[] {""} ;
      T01TF3_A11674DevCruHash = new String[] {""} ;
      T01TF3_A11675DevCruDesc = new String[] {""} ;
      T01TF3_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF3_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TF3_A11678DevCruStt = new String[] {""} ;
      T01TF3_A11679DevCruEnvA = new byte[1] ;
      T01TF3_A11680DevCruAtId = new String[] {""} ;
      T01TF3_A11681DevCruAT = new String[] {""} ;
      T01TF3_A11682DevCruObs = new String[] {""} ;
      T01TF3_A13983DevCruATCU = new String[] {""} ;
      T01TF3_A13984DevCruSerA = new String[] {""} ;
      T01TF3_A13985DevCruTipA = new String[] {""} ;
      T01TF3_A396EmprCod = new String[] {""} ;
      T01TF3_A252CliCod = new int[1] ;
      T01TF3_A840TrnCod = new short[1] ;
      T01TF3_n840TrnCod = new boolean[] {false} ;
      T01TF11_A396EmprCod = new String[] {""} ;
      T01TF11_A11669DevCruId = new int[1] ;
      T01TF12_A396EmprCod = new String[] {""} ;
      T01TF12_A11669DevCruId = new int[1] ;
      T01TF2_A11669DevCruId = new int[1] ;
      T01TF2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF2_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF2_A11671DevCruEst = new byte[1] ;
      T01TF2_A11672DevCruMat = new String[] {""} ;
      T01TF2_A11674DevCruHash = new String[] {""} ;
      T01TF2_A11675DevCruDesc = new String[] {""} ;
      T01TF2_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      T01TF2_A11677DevCruGros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01TF2_A11678DevCruStt = new String[] {""} ;
      T01TF2_A11679DevCruEnvA = new byte[1] ;
      T01TF2_A11680DevCruAtId = new String[] {""} ;
      T01TF2_A11681DevCruAT = new String[] {""} ;
      T01TF2_A11682DevCruObs = new String[] {""} ;
      T01TF2_A13983DevCruATCU = new String[] {""} ;
      T01TF2_A13984DevCruSerA = new String[] {""} ;
      T01TF2_A13985DevCruTipA = new String[] {""} ;
      T01TF2_A396EmprCod = new String[] {""} ;
      T01TF2_A252CliCod = new int[1] ;
      T01TF2_A840TrnCod = new short[1] ;
      T01TF2_n840TrnCod = new boolean[] {false} ;
      T01TF16_A279CliNom = new String[] {""} ;
      T01TF17_A841TrnNom = new String[] {""} ;
      T01TF17_n841TrnNom = new boolean[] {false} ;
      T01TF18_A396EmprCod = new String[] {""} ;
      T01TF18_A11669DevCruId = new int[1] ;
      T01TF18_A44AlbRecCod = new int[1] ;
      T01TF19_A396EmprCod = new String[] {""} ;
      T01TF19_A11669DevCruId = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i11670DevCruFec = GXutil.nullDate() ;
      i11680DevCruAtId = "" ;
      i11681DevCruAT = "" ;
      i11678DevCruStt = "" ;
      GXv_int8 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_int13 = new short[1] ;
      GXt_date14 = GXutil.nullDate() ;
      GXv_date15 = new java.util.Date[1] ;
      Z14394DevCruFecA = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_1__default(),
         new Object[] {
             new Object[] {
            T01TF2_A11669DevCruId, T01TF2_A11670DevCruFec, T01TF2_A11673DevCruSal, T01TF2_A11671DevCruEst, T01TF2_A11672DevCruMat, T01TF2_A11674DevCruHash, T01TF2_A11675DevCruDesc, T01TF2_A11676DevCruDtSy, T01TF2_A11677DevCruGros, T01TF2_A11678DevCruStt,
            T01TF2_A11679DevCruEnvA, T01TF2_A11680DevCruAtId, T01TF2_A11681DevCruAT, T01TF2_A11682DevCruObs, T01TF2_A13983DevCruATCU, T01TF2_A13984DevCruSerA, T01TF2_A13985DevCruTipA, T01TF2_A396EmprCod, T01TF2_A252CliCod, T01TF2_A840TrnCod,
            T01TF2_n840TrnCod
            }
            , new Object[] {
            T01TF3_A11669DevCruId, T01TF3_A11670DevCruFec, T01TF3_A11673DevCruSal, T01TF3_A11671DevCruEst, T01TF3_A11672DevCruMat, T01TF3_A11674DevCruHash, T01TF3_A11675DevCruDesc, T01TF3_A11676DevCruDtSy, T01TF3_A11677DevCruGros, T01TF3_A11678DevCruStt,
            T01TF3_A11679DevCruEnvA, T01TF3_A11680DevCruAtId, T01TF3_A11681DevCruAT, T01TF3_A11682DevCruObs, T01TF3_A13983DevCruATCU, T01TF3_A13984DevCruSerA, T01TF3_A13985DevCruTipA, T01TF3_A396EmprCod, T01TF3_A252CliCod, T01TF3_A840TrnCod,
            T01TF3_n840TrnCod
            }
            , new Object[] {
            T01TF4_A407EmprNom, T01TF4_n407EmprNom
            }
            , new Object[] {
            T01TF5_A279CliNom
            }
            , new Object[] {
            T01TF6_A841TrnNom, T01TF6_n841TrnNom
            }
            , new Object[] {
            T01TF7_A11669DevCruId, T01TF7_A407EmprNom, T01TF7_n407EmprNom, T01TF7_A11670DevCruFec, T01TF7_A11673DevCruSal, T01TF7_A279CliNom, T01TF7_A841TrnNom, T01TF7_n841TrnNom, T01TF7_A11671DevCruEst, T01TF7_A11672DevCruMat,
            T01TF7_A11674DevCruHash, T01TF7_A11675DevCruDesc, T01TF7_A11676DevCruDtSy, T01TF7_A11677DevCruGros, T01TF7_A11678DevCruStt, T01TF7_A11679DevCruEnvA, T01TF7_A11680DevCruAtId, T01TF7_A11681DevCruAT, T01TF7_A11682DevCruObs, T01TF7_A13983DevCruATCU,
            T01TF7_A13984DevCruSerA, T01TF7_A13985DevCruTipA, T01TF7_A396EmprCod, T01TF7_A252CliCod, T01TF7_A840TrnCod, T01TF7_n840TrnCod
            }
            , new Object[] {
            T01TF8_A279CliNom
            }
            , new Object[] {
            T01TF9_A841TrnNom, T01TF9_n841TrnNom
            }
            , new Object[] {
            T01TF10_A396EmprCod, T01TF10_A11669DevCruId
            }
            , new Object[] {
            T01TF11_A396EmprCod, T01TF11_A11669DevCruId
            }
            , new Object[] {
            T01TF12_A396EmprCod, T01TF12_A11669DevCruId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01TF16_A279CliNom
            }
            , new Object[] {
            T01TF17_A841TrnNom, T01TF17_n841TrnNom
            }
            , new Object[] {
            T01TF18_A396EmprCod, T01TF18_A11669DevCruId, T01TF18_A44AlbRecCod
            }
            , new Object[] {
            T01TF19_A396EmprCod, T01TF19_A11669DevCruId
            }
         }
      );
      Z396EmprCod = "" ;
      A396EmprCod = "" ;
      AV35Pgmdesc = httpContext.getMessage( "Devolucion Tejido (cabecera)", "") ;
      AV34Pgmname = "AlmacenSinDetalle.DevolucionTejido_1" ;
      Z11678DevCruStt = " " ;
      A11678DevCruStt = " " ;
      i11678DevCruStt = " " ;
      Z11681DevCruAT = " " ;
      A11681DevCruAT = " " ;
      i11681DevCruAT = " " ;
      Z11679DevCruEnvA = (byte)(0) ;
      A11679DevCruEnvA = (byte)(0) ;
      i11679DevCruEnvA = (byte)(0) ;
      Z11680DevCruAtId = " " ;
      A11680DevCruAtId = " " ;
      i11680DevCruAtId = " " ;
      Z11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      A11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
      i11670DevCruFec = GXutil.serverDate( context, remoteHandle, pr_default) ;
   }

   private byte Z11671DevCruEst ;
   private byte Z11679DevCruEnvA ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A11679DevCruEnvA ;
   private byte A11671DevCruEst ;
   private byte Gx_BScreen ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte gxajaxcallmode ;
   private byte i11679DevCruEnvA ;
   private short Z840TrnCod ;
   private short N840TrnCod ;
   private short A840TrnCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14395DevCruLine ;
   private short AV28ComboTrnCod ;
   private short AV22Insert_TrnCod ;
   private short AV7FirmaD ;
   private short RcdFound1633 ;
   private short AV8Ws ;
   private short AV9Modhh ;
   private short AV10Reg000 ;
   private short AV11copias ;
   private short AV12Copias2 ;
   private short nIsDirty_1633 ;
   private short GXt_int12 ;
   private short GXv_int13[] ;
   private short Z14395DevCruLine ;
   private int wcpOAV17DevCruId ;
   private int Z11669DevCruId ;
   private int Z252CliCod ;
   private int N252CliCod ;
   private int A11669DevCruId ;
   private int A252CliCod ;
   private int AV17DevCruId ;
   private int trnEnded ;
   private int edtDevCruId_Enabled ;
   private int edtDevCruFec_Enabled ;
   private int edtDevCruFecA_Enabled ;
   private int edtCliCod_Visible ;
   private int edtCliCod_Enabled ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtDevCruMat_Enabled ;
   private int edtDevCruSal_Enabled ;
   private int edtDevCruObs_Enabled ;
   private int edtDevCruLine_Enabled ;
   private int edtDevCruAtId_Enabled ;
   private int edtDevCruDtSy_Enabled ;
   private int edtDevCruATCU_Enabled ;
   private int edtDevFirma4d_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV26ComboCliCod ;
   private int edtavComboclicod_Enabled ;
   private int edtavComboclicod_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int AV21Insert_CliCod ;
   private int AV29Clicod ;
   private int Combo_clicod_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int GXt_int7 ;
   private int AV36GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int8[] ;
   private int ZV29Clicod ;
   private java.math.BigDecimal Z11677DevCruGros ;
   private java.math.BigDecimal A11677DevCruGros ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV16EmprCod ;
   private String Z396EmprCod ;
   private String Z11672DevCruMat ;
   private String Z11674DevCruHash ;
   private String Z11675DevCruDesc ;
   private String Z11678DevCruStt ;
   private String Z11680DevCruAtId ;
   private String Z11681DevCruAT ;
   private String Z13983DevCruATCU ;
   private String Z13984DevCruSerA ;
   private String Z13985DevCruTipA ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_clicod_Selectedvalue_get ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String Gx_mode ;
   private String AV16EmprCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtDevCruId_Internalname ;
   private String A11681DevCruAT ;
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
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String edtDevCruId_Jsonclick ;
   private String edtDevCruFec_Internalname ;
   private String edtDevCruFec_Jsonclick ;
   private String edtDevCruFecA_Internalname ;
   private String edtDevCruFecA_Jsonclick ;
   private String divTablesplittedclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String Combo_clicod_Caption ;
   private String Combo_clicod_Cls ;
   private String Combo_clicod_Internalname ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtDevCruMat_Internalname ;
   private String A11672DevCruMat ;
   private String edtDevCruMat_Jsonclick ;
   private String edtDevCruSal_Internalname ;
   private String edtDevCruSal_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtDevCruObs_Internalname ;
   private String edtDevCruLine_Internalname ;
   private String edtDevCruLine_Jsonclick ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtDevCruAtId_Internalname ;
   private String A11680DevCruAtId ;
   private String edtDevCruAtId_Jsonclick ;
   private String edtDevCruDtSy_Internalname ;
   private String edtDevCruDtSy_Jsonclick ;
   private String edtDevCruATCU_Internalname ;
   private String A13983DevCruATCU ;
   private String edtDevCruATCU_Jsonclick ;
   private String edtDevFirma4d_Internalname ;
   private String A14375DevFirma4d ;
   private String edtDevFirma4d_Jsonclick ;
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
   private String divSectionattribute_clicod_Internalname ;
   private String edtavComboclicod_Internalname ;
   private String edtavComboclicod_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String A11674DevCruHash ;
   private String A11675DevCruDesc ;
   private String A11678DevCruStt ;
   private String A13984DevCruSerA ;
   private String A13985DevCruTipA ;
   private String AV35Pgmdesc ;
   private String A407EmprNom ;
   private String A279CliNom ;
   private String A841TrnNom ;
   private String Combo_clicod_Objectcall ;
   private String Combo_clicod_Class ;
   private String Combo_clicod_Icontype ;
   private String Combo_clicod_Icon ;
   private String Combo_clicod_Tooltip ;
   private String Combo_clicod_Selectedvalue_set ;
   private String Combo_clicod_Selectedtext_set ;
   private String Combo_clicod_Selectedtext_get ;
   private String Combo_clicod_Gamoauthtoken ;
   private String Combo_clicod_Ddointernalname ;
   private String Combo_clicod_Titlecontrolalign ;
   private String Combo_clicod_Dropdownoptionstype ;
   private String Combo_clicod_Titlecontrolidtoreplace ;
   private String Combo_clicod_Datalisttype ;
   private String Combo_clicod_Datalistfixedvalues ;
   private String Combo_clicod_Datalistproc ;
   private String Combo_clicod_Datalistprocparametersprefix ;
   private String Combo_clicod_Remoteservicesparameters ;
   private String Combo_clicod_Htmltemplate ;
   private String Combo_clicod_Multiplevaluestype ;
   private String Combo_clicod_Loadingdata ;
   private String Combo_clicod_Noresultsfound ;
   private String Combo_clicod_Emptyitemtext ;
   private String Combo_clicod_Onlyselectedvalues ;
   private String Combo_clicod_Selectalltext ;
   private String Combo_clicod_Multiplevaluesseparator ;
   private String Combo_clicod_Addnewoptiontext ;
   private String Combo_trncod_Objectcall ;
   private String Combo_trncod_Class ;
   private String Combo_trncod_Icontype ;
   private String Combo_trncod_Icon ;
   private String Combo_trncod_Tooltip ;
   private String Combo_trncod_Selectedvalue_set ;
   private String Combo_trncod_Selectedtext_set ;
   private String Combo_trncod_Selectedtext_get ;
   private String Combo_trncod_Gamoauthtoken ;
   private String Combo_trncod_Ddointernalname ;
   private String Combo_trncod_Titlecontrolalign ;
   private String Combo_trncod_Dropdownoptionstype ;
   private String Combo_trncod_Titlecontrolidtoreplace ;
   private String Combo_trncod_Datalisttype ;
   private String Combo_trncod_Datalistfixedvalues ;
   private String Combo_trncod_Datalistproc ;
   private String Combo_trncod_Datalistprocparametersprefix ;
   private String Combo_trncod_Remoteservicesparameters ;
   private String Combo_trncod_Htmltemplate ;
   private String Combo_trncod_Multiplevaluestype ;
   private String Combo_trncod_Loadingdata ;
   private String Combo_trncod_Noresultsfound ;
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Onlyselectedvalues ;
   private String Combo_trncod_Selectalltext ;
   private String Combo_trncod_Multiplevaluesseparator ;
   private String Combo_trncod_Addnewoptiontext ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Dvpanel_unnamedtable1_Objectcall ;
   private String Dvpanel_unnamedtable1_Class ;
   private String Dvpanel_unnamedtable1_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode1633 ;
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
   private String Z407EmprNom ;
   private String Z279CliNom ;
   private String Z841TrnNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i11680DevCruAtId ;
   private String i11681DevCruAT ;
   private String i11678DevCruStt ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private java.util.Date Z11673DevCruSal ;
   private java.util.Date Z11676DevCruDtSy ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date Z11670DevCruFec ;
   private java.util.Date A11670DevCruFec ;
   private java.util.Date A14394DevCruFecA ;
   private java.util.Date i11670DevCruFec ;
   private java.util.Date GXt_date14 ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date Z14394DevCruFecA ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n840TrnCod ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_clicod_Emptyitem ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean Combo_clicod_Enabled ;
   private boolean Combo_clicod_Visible ;
   private boolean Combo_clicod_Allowmultipleselection ;
   private boolean Combo_clicod_Isgriditem ;
   private boolean Combo_clicod_Hasdescription ;
   private boolean Combo_clicod_Includeonlyselectedoption ;
   private boolean Combo_clicod_Includeselectalloption ;
   private boolean Combo_clicod_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Dvpanel_unnamedtable1_Enabled ;
   private boolean Dvpanel_unnamedtable1_Showheader ;
   private boolean Dvpanel_unnamedtable1_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String Z11682DevCruObs ;
   private String A11682DevCruObs ;
   private String AV25ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV20WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicod ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbDevCruEnvA ;
   private HTMLChoice cmbDevCruAT ;
   private IDataStoreProvider pr_default ;
   private String[] T01TF4_A407EmprNom ;
   private boolean[] T01TF4_n407EmprNom ;
   private String[] T01TF5_A279CliNom ;
   private String[] T01TF6_A841TrnNom ;
   private boolean[] T01TF6_n841TrnNom ;
   private int[] T01TF7_A11669DevCruId ;
   private String[] T01TF7_A407EmprNom ;
   private boolean[] T01TF7_n407EmprNom ;
   private java.util.Date[] T01TF7_A11670DevCruFec ;
   private java.util.Date[] T01TF7_A11673DevCruSal ;
   private String[] T01TF7_A279CliNom ;
   private String[] T01TF7_A841TrnNom ;
   private boolean[] T01TF7_n841TrnNom ;
   private byte[] T01TF7_A11671DevCruEst ;
   private String[] T01TF7_A11672DevCruMat ;
   private String[] T01TF7_A11674DevCruHash ;
   private String[] T01TF7_A11675DevCruDesc ;
   private java.util.Date[] T01TF7_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01TF7_A11677DevCruGros ;
   private String[] T01TF7_A11678DevCruStt ;
   private byte[] T01TF7_A11679DevCruEnvA ;
   private String[] T01TF7_A11680DevCruAtId ;
   private String[] T01TF7_A11681DevCruAT ;
   private String[] T01TF7_A11682DevCruObs ;
   private String[] T01TF7_A13983DevCruATCU ;
   private String[] T01TF7_A13984DevCruSerA ;
   private String[] T01TF7_A13985DevCruTipA ;
   private String[] T01TF7_A396EmprCod ;
   private int[] T01TF7_A252CliCod ;
   private short[] T01TF7_A840TrnCod ;
   private boolean[] T01TF7_n840TrnCod ;
   private String[] T01TF8_A279CliNom ;
   private String[] T01TF9_A841TrnNom ;
   private boolean[] T01TF9_n841TrnNom ;
   private String[] T01TF10_A396EmprCod ;
   private int[] T01TF10_A11669DevCruId ;
   private int[] T01TF3_A11669DevCruId ;
   private java.util.Date[] T01TF3_A11670DevCruFec ;
   private java.util.Date[] T01TF3_A11673DevCruSal ;
   private byte[] T01TF3_A11671DevCruEst ;
   private String[] T01TF3_A11672DevCruMat ;
   private String[] T01TF3_A11674DevCruHash ;
   private String[] T01TF3_A11675DevCruDesc ;
   private java.util.Date[] T01TF3_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01TF3_A11677DevCruGros ;
   private String[] T01TF3_A11678DevCruStt ;
   private byte[] T01TF3_A11679DevCruEnvA ;
   private String[] T01TF3_A11680DevCruAtId ;
   private String[] T01TF3_A11681DevCruAT ;
   private String[] T01TF3_A11682DevCruObs ;
   private String[] T01TF3_A13983DevCruATCU ;
   private String[] T01TF3_A13984DevCruSerA ;
   private String[] T01TF3_A13985DevCruTipA ;
   private String[] T01TF3_A396EmprCod ;
   private int[] T01TF3_A252CliCod ;
   private short[] T01TF3_A840TrnCod ;
   private boolean[] T01TF3_n840TrnCod ;
   private String[] T01TF11_A396EmprCod ;
   private int[] T01TF11_A11669DevCruId ;
   private String[] T01TF12_A396EmprCod ;
   private int[] T01TF12_A11669DevCruId ;
   private int[] T01TF2_A11669DevCruId ;
   private java.util.Date[] T01TF2_A11670DevCruFec ;
   private java.util.Date[] T01TF2_A11673DevCruSal ;
   private byte[] T01TF2_A11671DevCruEst ;
   private String[] T01TF2_A11672DevCruMat ;
   private String[] T01TF2_A11674DevCruHash ;
   private String[] T01TF2_A11675DevCruDesc ;
   private java.util.Date[] T01TF2_A11676DevCruDtSy ;
   private java.math.BigDecimal[] T01TF2_A11677DevCruGros ;
   private String[] T01TF2_A11678DevCruStt ;
   private byte[] T01TF2_A11679DevCruEnvA ;
   private String[] T01TF2_A11680DevCruAtId ;
   private String[] T01TF2_A11681DevCruAT ;
   private String[] T01TF2_A11682DevCruObs ;
   private String[] T01TF2_A13983DevCruATCU ;
   private String[] T01TF2_A13984DevCruSerA ;
   private String[] T01TF2_A13985DevCruTipA ;
   private String[] T01TF2_A396EmprCod ;
   private int[] T01TF2_A252CliCod ;
   private short[] T01TF2_A840TrnCod ;
   private boolean[] T01TF2_n840TrnCod ;
   private String[] T01TF16_A279CliNom ;
   private String[] T01TF17_A841TrnNom ;
   private boolean[] T01TF17_n841TrnNom ;
   private String[] T01TF18_A396EmprCod ;
   private int[] T01TF18_A11669DevCruId ;
   private int[] T01TF18_A44AlbRecCod ;
   private String[] T01TF19_A396EmprCod ;
   private int[] T01TF19_A11669DevCruId ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV24CliCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV27TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV19TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV23TrnContextAtt ;
   private app.wwpbaseobjects.SdtWWPContext AV18WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class devoluciontejido_1__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_1__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_1__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_1__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class devoluciontejido_1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01TF2", "SELECT DevCruId, DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ?  FOR UPDATE OF DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, CliCod, TrnCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF3", "SELECT DevCruId, DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, EmprCod, CliCod, TrnCod FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF5", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF6", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF7", "SELECT /*+ FIRST_ROWS(100) */ TM1.DevCruId, T2.EmprNom, TM1.DevCruFec, TM1.DevCruSal, T3.CliNom, T4.TrnNom, TM1.DevCruEst, TM1.DevCruMat, TM1.DevCruHash, TM1.DevCruDesc, TM1.DevCruDtSy, TM1.DevCruGros, TM1.DevCruStt, TM1.DevCruEnvA, TM1.DevCruAtId, TM1.DevCruAT, TM1.DevCruObs, TM1.DevCruATCU, TM1.DevCruSerA, TM1.DevCruTipA, TM1.EmprCod, TM1.CliCod, TM1.TrnCod FROM (((TXPDEVCRU TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = TM1.EmprCod AND T3.CliCod = TM1.CliCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.DevCruId = ? ORDER BY TM1.EmprCod, TM1.DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF8", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF9", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? AND DevCruId = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId > ?) and EmprCod = ? ORDER BY EmprCod, DevCruId) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TF12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE ( DevCruId < ?) and EmprCod = ? ORDER BY EmprCod DESC, DevCruId DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01TF13", "INSERT INTO TXPDEVCRU(DevCruId, DevCruFec, DevCruSal, DevCruEst, DevCruMat, DevCruHash, DevCruDesc, DevCruDtSy, DevCruGros, DevCruStt, DevCruEnvA, DevCruAtId, DevCruAT, DevCruObs, DevCruATCU, DevCruSerA, DevCruTipA, EmprCod, CliCod, TrnCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01TF14", "UPDATE TXPDEVCRU SET DevCruFec=?, DevCruSal=?, DevCruEst=?, DevCruMat=?, DevCruHash=?, DevCruDesc=?, DevCruDtSy=?, DevCruGros=?, DevCruStt=?, DevCruEnvA=?, DevCruAtId=?, DevCruAT=?, DevCruObs=?, DevCruATCU=?, DevCruSerA=?, DevCruTipA=?, CliCod=?, TrnCod=?  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new UpdateCursor("T01TF15", "DELETE FROM TXPDEVCRU  WHERE EmprCod = ? AND DevCruId = ?", GX_NOMASK, "TXPDEVCRU")
         ,new ForEachCursor("T01TF16", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF17", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01TF18", "SELECT * FROM (SELECT EmprCod, DevCruId, AlbRecCod FROM TXPDEVCR1 WHERE EmprCod = ? AND DevCruId = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01TF19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, DevCruId FROM TXPDEVCRU WHERE EmprCod = ? ORDER BY EmprCod, DevCruId ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 300);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 4);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 200);
               ((String[]) buf[6])[0] = rslt.getString(7, 300);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,2);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((byte[]) buf[10])[0] = rslt.getByte(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 20);
               ((String[]) buf[12])[0] = rslt.getString(13, 1);
               ((String[]) buf[13])[0] = rslt.getVarchar(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 20);
               ((String[]) buf[15])[0] = rslt.getString(16, 20);
               ((String[]) buf[16])[0] = rslt.getString(17, 4);
               ((String[]) buf[17])[0] = rslt.getString(18, 3);
               ((int[]) buf[18])[0] = rslt.getInt(19);
               ((short[]) buf[19])[0] = rslt.getShort(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(3);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 30);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((byte[]) buf[8])[0] = rslt.getByte(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 20);
               ((String[]) buf[10])[0] = rslt.getString(9, 200);
               ((String[]) buf[11])[0] = rslt.getString(10, 300);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(11);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(12,2);
               ((String[]) buf[14])[0] = rslt.getString(13, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(14);
               ((String[]) buf[16])[0] = rslt.getString(15, 20);
               ((String[]) buf[17])[0] = rslt.getString(16, 1);
               ((String[]) buf[18])[0] = rslt.getVarchar(17);
               ((String[]) buf[19])[0] = rslt.getString(18, 20);
               ((String[]) buf[20])[0] = rslt.getString(19, 20);
               ((String[]) buf[21])[0] = rslt.getString(20, 4);
               ((String[]) buf[22])[0] = rslt.getString(21, 3);
               ((int[]) buf[23])[0] = rslt.getInt(22);
               ((short[]) buf[24])[0] = rslt.getShort(23);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 10 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setString(2, (String)parms[1], 3);
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 20);
               stmt.setString(6, (String)parms[5], 200);
               stmt.setString(7, (String)parms[6], 300);
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setBigDecimal(9, (java.math.BigDecimal)parms[8], 2);
               stmt.setString(10, (String)parms[9], 1);
               stmt.setByte(11, ((Number) parms[10]).byteValue());
               stmt.setString(12, (String)parms[11], 20);
               stmt.setString(13, (String)parms[12], 1);
               stmt.setVarchar(14, (String)parms[13], 200, false);
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 20);
               stmt.setString(17, (String)parms[16], 4);
               stmt.setString(18, (String)parms[17], 3);
               stmt.setInt(19, ((Number) parms[18]).intValue());
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(20, ((Number) parms[20]).shortValue());
               }
               return;
            case 12 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 20);
               stmt.setString(5, (String)parms[4], 200);
               stmt.setString(6, (String)parms[5], 300);
               stmt.setDateTime(7, (java.util.Date)parms[6], false);
               stmt.setBigDecimal(8, (java.math.BigDecimal)parms[7], 2);
               stmt.setString(9, (String)parms[8], 1);
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               stmt.setString(11, (String)parms[10], 20);
               stmt.setString(12, (String)parms[11], 1);
               stmt.setVarchar(13, (String)parms[12], 200, false);
               stmt.setString(14, (String)parms[13], 20);
               stmt.setString(15, (String)parms[14], 20);
               stmt.setString(16, (String)parms[15], 4);
               stmt.setInt(17, ((Number) parms[16]).intValue());
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(18, ((Number) parms[18]).shortValue());
               }
               stmt.setString(19, (String)parms[19], 3);
               stmt.setInt(20, ((Number) parms[20]).intValue());
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

