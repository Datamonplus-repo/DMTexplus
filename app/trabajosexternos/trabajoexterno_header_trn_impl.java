package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_header_trn_impl extends GXDataArea
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action40") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_40_1UR305( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxJX_Action43") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         xc_43_1UR305( ) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel3"+"_"+"SALLINEASE") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx3asasallinease1UR305( A396EmprCod, A2253SalExtAlb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"SALFECANT") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asasalfecant1UR305( A396EmprCod, A2253SalExtAlb) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel5"+"_"+"MANNOM_O") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A7370ManCod_o = (short)(GXutil.lval( httpContext.GetPar( "ManCod_o"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A7370ManCod_o", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7370ManCod_o), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx5asamannom_o1UR305( A396EmprCod, A7370ManCod_o) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_47") == 0 )
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
         gxload_47( A396EmprCod, A840TrnCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_48") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2248ManCod = (short)(GXutil.lval( httpContext.GetPar( "ManCod"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_48( A396EmprCod, A2248ManCod) ;
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
            AV8EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
            AV13SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13SalExtAlb), 8, 0));
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13SalExtAlb), "ZZZZZZZ9")));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Trabajo Externo (Header)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public trabajoexterno_header_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_header_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_header_trn_impl.class ));
   }

   public trabajoexterno_header_trn_impl( int remoteHandle ,
                                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbSalEnvAT = new HTMLChoice();
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
      if ( cmbSalEnvAT.getItemCount() > 0 )
      {
         A10741SalEnvAT = (byte)(GXutil.lval( cmbSalEnvAT.getValidValue(GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbSalEnvAT.setValue( GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbSalEnvAT.getInternalname(), "Values", cmbSalEnvAT.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtAlb_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtAlb_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAlb_Internalname, GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2253SalExtAlb), "ZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAlb_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtAlb_Enabled, 1, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtFec_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtFec_Internalname, httpContext.getMessage( "Data", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSalExtFec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtFec_Internalname, localUtil.format(A2256SalExtFec, "99/99/99"), localUtil.format( A2256SalExtFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtFec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtFec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalExtFec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalExtFec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalFecAnt_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalFecAnt_Internalname, httpContext.getMessage( "Data Ant.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtSalFecAnt_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalFecAnt_Internalname, localUtil.format(A14397SalFecAnt, "99/99/99"), localUtil.format( A14397SalFecAnt, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFecAnt_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalFecAnt_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalFecAnt_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalFecAnt_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedmancod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmancod_Internalname, httpContext.getMessage( "Manufacturador", ""), "", "", lblTextblockmancod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_mancod.setProperty("Caption", Combo_mancod_Caption);
      ucCombo_mancod.setProperty("Cls", Combo_mancod_Cls);
      ucCombo_mancod.setProperty("EmptyItem", Combo_mancod_Emptyitem);
      ucCombo_mancod.setProperty("DropDownOptionsData", AV23ManCod_Data);
      ucCombo_mancod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_mancod_Internalname, "COMBO_MANCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 Invisible", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtManCod_Internalname, httpContext.getMessage( "Codigo Manufacturador", ""), "col-sm-3 AttributeLabel", 0, true, "");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtManCod_Internalname, GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A2248ManCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,43);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtManCod_Jsonclick, 0, "Attribute", "", "", "", "", edtManCod_Visible, edtManCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop ExtendedComboCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTablesplittedtrncod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
      /* Text block */
      app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktrncod_Internalname, httpContext.getMessage( "Transportista", ""), "", "", lblTextblocktrncod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* User Defined Control */
      ucCombo_trncod.setProperty("Caption", Combo_trncod_Caption);
      ucCombo_trncod.setProperty("Cls", Combo_trncod_Cls);
      ucCombo_trncod.setProperty("EmptyItemText", Combo_trncod_Emptyitemtext);
      ucCombo_trncod.setProperty("DropDownOptionsData", AV20TrnCod_Data);
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtTrnCod_Internalname, GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtTrnCod_Jsonclick, 0, "Attribute", "", "", "", "", edtTrnCod_Visible, edtTrnCod_Enabled, 1, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtMat_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtMat_Internalname, httpContext.getMessage( "Matricula", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtMat_Internalname, GXutil.rtrim( A6397SalExtMat), GXutil.rtrim( localUtil.format( A6397SalExtMat, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtMat_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtMat_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalFecSal_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalFecSal_Internalname, httpContext.getMessage( "Fecha Salida", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtSalFecSal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalFecSal_Internalname, localUtil.format(A14398SalFecSal, "99/99/99"), localUtil.format( A14398SalFecSal, "99/99/99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFecSal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalFecSal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalFecSal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalFecSal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtHor_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtHor_Internalname, httpContext.getMessage( "Hora Salida", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtHor_Internalname, GXutil.rtrim( A6396SalExtHor), GXutil.rtrim( localUtil.format( A6396SalExtHor, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtHor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtHor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtFen_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtFen_Internalname, httpContext.getMessage( "Fecha Entrega", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
      httpContext.writeText( "<div id=\""+edtSalExtFen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtFen_Internalname, localUtil.format(A11299SalExtFen, "99/99/99"), localUtil.format( A11299SalExtFen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtFen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtFen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalExtFen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalExtFen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtObs_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtObs_Internalname, httpContext.getMessage( "Observaciones", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      ClassString = "AttributeFL" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtSalExtObs_Internalname, A3554SalExtObs, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,81);\"", (short)(0), 1, edtSalExtObs_Enabled, 0, 40, "chr", 2, "row", (byte)(0), StyleString, ClassString, "", "", "9999", 1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalLineasE_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalLineasE_Internalname, httpContext.getMessage( "Lineas?", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalLineasE_Internalname, GXutil.ltrim( localUtil.ntoc( A14402SalLineasE, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalLineasE_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A14402SalLineasE), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A14402SalLineasE), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalLineasE_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalLineasE_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
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
      /* User Defined Control */
      ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
      ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
      ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
      ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
      ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
      ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
      ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
      ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
      ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
      ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
      ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
      httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbSalEnvAT.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbSalEnvAT.getInternalname(), httpContext.getMessage( "Envio AT", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbSalEnvAT, cmbSalEnvAT.getInternalname(), GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0)), 1, cmbSalEnvAT.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbSalEnvAT.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      cmbSalEnvAT.setValue( GXutil.trim( GXutil.str( A10741SalEnvAT, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalEnvAT.getInternalname(), "Values", cmbSalEnvAT.ToJavascriptSource(), true);
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalCodeID_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalCodeID_Internalname, httpContext.getMessage( "Codigo AT", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalCodeID_Internalname, GXutil.rtrim( A10742SalCodeID), GXutil.rtrim( localUtil.format( A10742SalCodeID, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalCodeID_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalCodeID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtAT_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtAT_Internalname, httpContext.getMessage( "A/M", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtAT_Internalname, GXutil.rtrim( A10767SalExtAT), GXutil.rtrim( localUtil.format( A10767SalExtAT, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtAT_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtAT_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalFhh_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalFhh_Internalname, httpContext.getMessage( "Data System Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      httpContext.writeText( "<div id=\""+edtSalFhh_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalFhh_Internalname, localUtil.ttoc( A10076SalFhh, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( A10076SalFhh, "99/99/99 99:99"), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFhh_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalFhh_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_bitmap( httpContext, edtSalFhh_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtSalFhh_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      httpContext.writeTextNL( "</div>") ;
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalExtATCU_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalExtATCU_Internalname, httpContext.getMessage( "ATCUD", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtATCU_Internalname, GXutil.rtrim( A14348SalExtATCU), GXutil.rtrim( localUtil.format( A14348SalExtATCU, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtATCU_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalExtATCU_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell DscTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtSalFirma4d_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtSalFirma4d_Internalname, httpContext.getMessage( "Hash", ""), " AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalFirma4d_Internalname, GXutil.rtrim( A14373SalFirma4d), GXutil.rtrim( localUtil.format( A14373SalFirma4d, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalFirma4d_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtSalFirma4d_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      httpContext.writeText( "</div>") ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 120,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV36Pgmname), GXutil.rtrim( localUtil.format( AV36Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
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
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_mancod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombomancod_Internalname, GXutil.ltrim( localUtil.ntoc( AV24ComboManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombomancod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24ComboManCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24ComboManCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCombomancod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombomancod_Visible, edtavCombomancod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divSectionattribute_trncod_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtavCombotrncod_Internalname, GXutil.ltrim( localUtil.ntoc( AV22ComboTrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCombotrncod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22ComboTrnCod), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV22ComboTrnCod), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", httpContext.getMessage( "Codigo Transportista", ""), "", edtavCombotrncod_Jsonclick, 0, "Attribute", "", "", "", "", edtavCombotrncod_Visible, edtavCombotrncod_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalGrossT_Internalname, GXutil.ltrim( localUtil.ntoc( A10078SalGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtSalGrossT_Enabled!=0) ? localUtil.format( A10078SalGrossT, "ZZZZZZZZZ9.99") : localUtil.format( A10078SalGrossT, "ZZZZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalGrossT_Jsonclick, 0, "Attribute", "", "", "", "", edtSalGrossT_Visible, edtSalGrossT_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      /* Multiple line edit */
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      app.GxWebStd.gx_html_textarea( httpContext, edtSalFmd_Internalname, GXutil.rtrim( A10077SalFmd), "", "", (short)(0), edtSalFmd_Visible, edtSalFmd_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalExtSec_Internalname, GXutil.rtrim( A2254SalExtSec), GXutil.rtrim( localUtil.format( A2254SalExtSec, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalExtSec_Jsonclick, 0, "Attribute", "", "", "", "", edtSalExtSec_Visible, edtSalExtSec_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
      /* Single line edit */
      app.GxWebStd.gx_single_line_edit( httpContext, edtSalSts_Internalname, GXutil.rtrim( A10080SalSts), GXutil.rtrim( localUtil.format( A10080SalSts, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtSalSts_Jsonclick, 0, "Attribute", "", "", "", "", edtSalSts_Visible, edtSalSts_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Header_TRN.htm");
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
      e111UR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANCOD_DATA"), AV23ManCod_Data);
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRNCOD_DATA"), AV20TrnCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "Z2253SalExtAlb"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2256SalExtFec = localUtil.ctod( httpContext.cgiGet( "Z2256SalExtFec"), 0) ;
            Z2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2257SalExtEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2258SalExtLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2254SalExtSec = httpContext.cgiGet( "Z2254SalExtSec") ;
            Z6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( "Z6247SalExUln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14398SalFecSal = localUtil.ctod( httpContext.cgiGet( "Z14398SalFecSal"), 0) ;
            Z6396SalExtHor = httpContext.cgiGet( "Z6396SalExtHor") ;
            Z6397SalExtMat = httpContext.cgiGet( "Z6397SalExtMat") ;
            Z7368SalExtUsu = httpContext.cgiGet( "Z7368SalExtUsu") ;
            Z7369SalExtRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z7369SalExtRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7370ManCod_o = (short)(localUtil.ctol( httpContext.cgiGet( "Z7370ManCod_o"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z8655SalFecEnt = localUtil.ctod( httpContext.cgiGet( "Z8655SalFecEnt"), 0) ;
            Z11299SalExtFen = localUtil.ctod( httpContext.cgiGet( "Z11299SalExtFen"), 0) ;
            Z10767SalExtAT = httpContext.cgiGet( "Z10767SalExtAT") ;
            Z10742SalCodeID = httpContext.cgiGet( "Z10742SalCodeID") ;
            Z10741SalEnvAT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z10741SalEnvAT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z10080SalSts = httpContext.cgiGet( "Z10080SalSts") ;
            Z10079SalFmdD = httpContext.cgiGet( "Z10079SalFmdD") ;
            Z10078SalGrossT = localUtil.ctond( httpContext.cgiGet( "Z10078SalGrossT")) ;
            Z10077SalFmd = httpContext.cgiGet( "Z10077SalFmd") ;
            Z10076SalFhh = localUtil.ctot( httpContext.cgiGet( "Z10076SalFhh"), 0) ;
            Z13244SalExtPre1 = localUtil.ctond( httpContext.cgiGet( "Z13244SalExtPre1")) ;
            Z14348SalExtATCU = httpContext.cgiGet( "Z14348SalExtATCU") ;
            Z14349SalExtSerA = httpContext.cgiGet( "Z14349SalExtSerA") ;
            Z14350SalExtTipA = httpContext.cgiGet( "Z14350SalExtTipA") ;
            Z840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "Z2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2257SalExtEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( "Z2258SalExtLis"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( "Z6247SalExUln"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7368SalExtUsu = httpContext.cgiGet( "Z7368SalExtUsu") ;
            A7369SalExtRec = (int)(localUtil.ctol( httpContext.cgiGet( "Z7369SalExtRec"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7370ManCod_o = (short)(localUtil.ctol( httpContext.cgiGet( "Z7370ManCod_o"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8655SalFecEnt = localUtil.ctod( httpContext.cgiGet( "Z8655SalFecEnt"), 0) ;
            A10079SalFmdD = httpContext.cgiGet( "Z10079SalFmdD") ;
            A13244SalExtPre1 = localUtil.ctond( httpContext.cgiGet( "Z13244SalExtPre1")) ;
            A14349SalExtSerA = httpContext.cgiGet( "Z14349SalExtSerA") ;
            A14350SalExtTipA = httpContext.cgiGet( "Z14350SalExtTipA") ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            N2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "N2248ManCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            N840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "N840TrnCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            A7370ManCod_o = (short)(localUtil.ctol( httpContext.cgiGet( "MANCOD_O"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7371ManNom_o = httpContext.cgiGet( "MANNOM_O") ;
            AV8EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            AV13SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( "vSALEXTALB"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV17Insert_ManCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_MANCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV18Insert_TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( "vINSERT_TRNCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2257SalExtEst = (byte)(localUtil.ctol( httpContext.cgiGet( "SALEXTEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2258SalExtLis = (byte)(localUtil.ctol( httpContext.cgiGet( "SALEXTLIS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV7UsurCod = httpContext.cgiGet( "vUSURCOD") ;
            A7368SalExtUsu = httpContext.cgiGet( "SALEXTUSU") ;
            AV37Pgmdesc = httpContext.cgiGet( "vPGMDESC") ;
            A14349SalExtSerA = httpContext.cgiGet( "SALEXTSERA") ;
            A14350SalExtTipA = httpContext.cgiGet( "SALEXTTIPA") ;
            A6247SalExUln = (short)(localUtil.ctol( httpContext.cgiGet( "SALEXULN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7369SalExtRec = (int)(localUtil.ctol( httpContext.cgiGet( "SALEXTREC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A8655SalFecEnt = localUtil.ctod( httpContext.cgiGet( "SALFECENT"), 0) ;
            A10079SalFmdD = httpContext.cgiGet( "SALFMDD") ;
            A13244SalExtPre1 = localUtil.ctond( httpContext.cgiGet( "SALEXTPRE1")) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A841TrnNom = httpContext.cgiGet( "TRNNOM") ;
            n841TrnNom = false ;
            A2249ManNom = httpContext.cgiGet( "MANNOM") ;
            n2249ManNom = false ;
            Combo_mancod_Objectcall = httpContext.cgiGet( "COMBO_MANCOD_Objectcall") ;
            Combo_mancod_Class = httpContext.cgiGet( "COMBO_MANCOD_Class") ;
            Combo_mancod_Icontype = httpContext.cgiGet( "COMBO_MANCOD_Icontype") ;
            Combo_mancod_Icon = httpContext.cgiGet( "COMBO_MANCOD_Icon") ;
            Combo_mancod_Caption = httpContext.cgiGet( "COMBO_MANCOD_Caption") ;
            Combo_mancod_Tooltip = httpContext.cgiGet( "COMBO_MANCOD_Tooltip") ;
            Combo_mancod_Cls = httpContext.cgiGet( "COMBO_MANCOD_Cls") ;
            Combo_mancod_Selectedvalue_set = httpContext.cgiGet( "COMBO_MANCOD_Selectedvalue_set") ;
            Combo_mancod_Selectedvalue_get = httpContext.cgiGet( "COMBO_MANCOD_Selectedvalue_get") ;
            Combo_mancod_Selectedtext_set = httpContext.cgiGet( "COMBO_MANCOD_Selectedtext_set") ;
            Combo_mancod_Selectedtext_get = httpContext.cgiGet( "COMBO_MANCOD_Selectedtext_get") ;
            Combo_mancod_Gamoauthtoken = httpContext.cgiGet( "COMBO_MANCOD_Gamoauthtoken") ;
            Combo_mancod_Ddointernalname = httpContext.cgiGet( "COMBO_MANCOD_Ddointernalname") ;
            Combo_mancod_Titlecontrolalign = httpContext.cgiGet( "COMBO_MANCOD_Titlecontrolalign") ;
            Combo_mancod_Dropdownoptionstype = httpContext.cgiGet( "COMBO_MANCOD_Dropdownoptionstype") ;
            Combo_mancod_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Enabled")) ;
            Combo_mancod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Visible")) ;
            Combo_mancod_Titlecontrolidtoreplace = httpContext.cgiGet( "COMBO_MANCOD_Titlecontrolidtoreplace") ;
            Combo_mancod_Datalisttype = httpContext.cgiGet( "COMBO_MANCOD_Datalisttype") ;
            Combo_mancod_Allowmultipleselection = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Allowmultipleselection")) ;
            Combo_mancod_Datalistfixedvalues = httpContext.cgiGet( "COMBO_MANCOD_Datalistfixedvalues") ;
            Combo_mancod_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Isgriditem")) ;
            Combo_mancod_Hasdescription = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Hasdescription")) ;
            Combo_mancod_Datalistproc = httpContext.cgiGet( "COMBO_MANCOD_Datalistproc") ;
            Combo_mancod_Datalistprocparametersprefix = httpContext.cgiGet( "COMBO_MANCOD_Datalistprocparametersprefix") ;
            Combo_mancod_Remoteservicesparameters = httpContext.cgiGet( "COMBO_MANCOD_Remoteservicesparameters") ;
            Combo_mancod_Datalistupdateminimumcharacters = (int)(localUtil.ctol( httpContext.cgiGet( "COMBO_MANCOD_Datalistupdateminimumcharacters"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Combo_mancod_Includeonlyselectedoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Includeonlyselectedoption")) ;
            Combo_mancod_Includeselectalloption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Includeselectalloption")) ;
            Combo_mancod_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Emptyitem")) ;
            Combo_mancod_Includeaddnewoption = GXutil.strtobool( httpContext.cgiGet( "COMBO_MANCOD_Includeaddnewoption")) ;
            Combo_mancod_Htmltemplate = httpContext.cgiGet( "COMBO_MANCOD_Htmltemplate") ;
            Combo_mancod_Multiplevaluestype = httpContext.cgiGet( "COMBO_MANCOD_Multiplevaluestype") ;
            Combo_mancod_Loadingdata = httpContext.cgiGet( "COMBO_MANCOD_Loadingdata") ;
            Combo_mancod_Noresultsfound = httpContext.cgiGet( "COMBO_MANCOD_Noresultsfound") ;
            Combo_mancod_Emptyitemtext = httpContext.cgiGet( "COMBO_MANCOD_Emptyitemtext") ;
            Combo_mancod_Onlyselectedvalues = httpContext.cgiGet( "COMBO_MANCOD_Onlyselectedvalues") ;
            Combo_mancod_Selectalltext = httpContext.cgiGet( "COMBO_MANCOD_Selectalltext") ;
            Combo_mancod_Multiplevaluesseparator = httpContext.cgiGet( "COMBO_MANCOD_Multiplevaluesseparator") ;
            Combo_mancod_Addnewoptiontext = httpContext.cgiGet( "COMBO_MANCOD_Addnewoptiontext") ;
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
            Dvpanel_unnamedtable4_Objectcall = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Objectcall") ;
            Dvpanel_unnamedtable4_Class = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Class") ;
            Dvpanel_unnamedtable4_Enabled = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Enabled")) ;
            Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
            Dvpanel_unnamedtable4_Height = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Height") ;
            Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
            Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
            Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
            Dvpanel_unnamedtable4_Showheader = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showheader")) ;
            Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
            Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
            Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
            Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
            Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
            Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
            Dvpanel_unnamedtable4_Visible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Visible")) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "SALEXTALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2253SalExtAlb = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            }
            else
            {
               A2253SalExtAlb = (int)(localUtil.ctol( httpContext.cgiGet( edtSalExtAlb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            }
            if ( localUtil.vcdate( httpContext.cgiGet( edtSalExtFec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SALEXTFEC");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtFec_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2256SalExtFec = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            }
            else
            {
               A2256SalExtFec = localUtil.ctod( httpContext.cgiGet( edtSalExtFec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
            }
            A14397SalFecAnt = localUtil.ctod( httpContext.cgiGet( edtSalFecAnt_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "MANCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtManCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A2248ManCod = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
            }
            else
            {
               A2248ManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtManCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
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
            A6397SalExtMat = httpContext.cgiGet( edtSalExtMat_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
            A14398SalFecSal = localUtil.ctod( httpContext.cgiGet( edtSalFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14398SalFecSal", localUtil.format(A14398SalFecSal, "99/99/99"));
            A6396SalExtHor = httpContext.cgiGet( edtSalExtHor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
            if ( localUtil.vcdate( httpContext.cgiGet( edtSalExtFen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "SALEXTFEN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtFen_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A11299SalExtFen = GXutil.nullDate() ;
               httpContext.ajax_rsp_assign_attri("", false, "A11299SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
            }
            else
            {
               A11299SalExtFen = localUtil.ctod( httpContext.cgiGet( edtSalExtFen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A11299SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
            }
            A3554SalExtObs = httpContext.cgiGet( edtSalExtObs_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
            A14402SalLineasE = (short)(localUtil.ctol( httpContext.cgiGet( edtSalLineasE_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14402SalLineasE), 4, 0));
            cmbSalEnvAT.setValue( httpContext.cgiGet( cmbSalEnvAT.getInternalname()) );
            A10741SalEnvAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbSalEnvAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
            A10742SalCodeID = httpContext.cgiGet( edtSalCodeID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
            A10767SalExtAT = httpContext.cgiGet( edtSalExtAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
            A10076SalFhh = localUtil.ctot( httpContext.cgiGet( edtSalFhh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            A14348SalExtATCU = httpContext.cgiGet( edtSalExtATCU_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14348SalExtATCU", A14348SalExtATCU);
            A14373SalFirma4d = httpContext.cgiGet( edtSalFirma4d_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14373SalFirma4d", A14373SalFirma4d);
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            AV24ComboManCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombomancod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24ComboManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ComboManCod), 4, 0));
            AV22ComboTrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavCombotrncod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ComboTrnCod), 4, 0));
            A10078SalGrossT = localUtil.ctond( httpContext.cgiGet( edtSalGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
            A10077SalFmd = httpContext.cgiGet( edtSalFmd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
            A2254SalExtSec = httpContext.cgiGet( edtSalExtSec_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
            A10080SalSts = httpContext.cgiGet( edtSalSts_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Header_TRN");
            A10741SalEnvAT = (byte)(GXutil.lval( httpContext.cgiGet( cmbSalEnvAT.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
            forbiddenHiddens.add("SalEnvAT", localUtil.format( DecimalUtil.doubleToDec(A10741SalEnvAT), "9"));
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            AV36Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
            forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
            forbiddenHiddens.add("SalExtEst", localUtil.format( DecimalUtil.doubleToDec(A2257SalExtEst), "9"));
            forbiddenHiddens.add("SalExtLis", localUtil.format( DecimalUtil.doubleToDec(A2258SalExtLis), "9"));
            forbiddenHiddens.add("SalExUln", localUtil.format( DecimalUtil.doubleToDec(A6247SalExUln), "ZZZ9"));
            A14398SalFecSal = localUtil.ctod( httpContext.cgiGet( edtSalFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14398SalFecSal", localUtil.format(A14398SalFecSal, "99/99/99"));
            forbiddenHiddens.add("SalFecSal", localUtil.format(A14398SalFecSal, "99/99/99"));
            A6396SalExtHor = httpContext.cgiGet( edtSalExtHor_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
            forbiddenHiddens.add("SalExtHor", GXutil.rtrim( localUtil.format( A6396SalExtHor, "")));
            forbiddenHiddens.add("SalExtUsu", GXutil.rtrim( localUtil.format( A7368SalExtUsu, "@!")));
            forbiddenHiddens.add("SalExtRec", localUtil.format( DecimalUtil.doubleToDec(A7369SalExtRec), "ZZZZZ9"));
            forbiddenHiddens.add("ManCod_o", localUtil.format( DecimalUtil.doubleToDec(A7370ManCod_o), "ZZZ9"));
            forbiddenHiddens.add("SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
            A10767SalExtAT = httpContext.cgiGet( edtSalExtAT_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
            forbiddenHiddens.add("SalExtAT", GXutil.rtrim( localUtil.format( A10767SalExtAT, "")));
            A10742SalCodeID = httpContext.cgiGet( edtSalCodeID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
            forbiddenHiddens.add("SalCodeID", GXutil.rtrim( localUtil.format( A10742SalCodeID, "")));
            A10080SalSts = httpContext.cgiGet( edtSalSts_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
            forbiddenHiddens.add("SalSts", GXutil.rtrim( localUtil.format( A10080SalSts, "")));
            forbiddenHiddens.add("SalFmdD", GXutil.rtrim( localUtil.format( A10079SalFmdD, "")));
            A10078SalGrossT = localUtil.ctond( httpContext.cgiGet( edtSalGrossT_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
            forbiddenHiddens.add("SalGrossT", localUtil.format( A10078SalGrossT, "ZZZZZZZZZ9.99"));
            A10077SalFmd = httpContext.cgiGet( edtSalFmd_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
            forbiddenHiddens.add("SalFmd", GXutil.rtrim( localUtil.format( A10077SalFmd, "")));
            A10076SalFhh = localUtil.ctot( httpContext.cgiGet( edtSalFhh_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            forbiddenHiddens.add("SalFhh", localUtil.format( A10076SalFhh, "99/99/99 99:99"));
            forbiddenHiddens.add("SalExtPre1", localUtil.format( A13244SalExtPre1, "ZZZZZZ9.99999"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( A2253SalExtAlb != Z2253SalExtAlb ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("trabajosexternos\\trabajoexterno_header_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
               A2253SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
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
                  sMode305 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode305 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound305 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UR0( ) ;
                        if ( AnyError == 0 )
                        {
                           GX_FocusControl = bttBtntrn_enter_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        }
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noinsert"), 1, "SALEXTALB");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtSalExtAlb_Internalname ;
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
                        e111UR2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UR2 ();
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
         e121UR2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UR305( ) ;
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
         disableAttributes1UR305( ) ;
      }
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomancod_Enabled), 5, 0), true);
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

   public void confirm_1UR0( )
   {
      beforeValidate1UR305( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UR305( ) ;
         }
         else
         {
            checkExtendedTable1UR305( ) ;
            closeExtendedTableCursors1UR305( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UR0( )
   {
   }

   public void e111UR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = (byte)(AV9FirmaD) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int2) ;
      trabajoexterno_header_trn_impl.this.GXt_int1 = GXv_int2[0] ;
      AV9FirmaD = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9FirmaD), 4, 0));
      GXt_int1 = (byte)(AV10Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV8EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      trabajoexterno_header_trn_impl.this.GXt_int1 = GXv_int2[0] ;
      AV10Moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Moda21), 4, 0));
      GXt_char3 = AV25Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      trabajoexterno_header_trn_impl.this.GXt_char3 = GXv_char4[0] ;
      AV25Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25Station", AV25Station);
      GXv_char4[0] = AV8EmprCod ;
      GXv_char5[0] = AV26EmprNom ;
      GXv_char6[0] = AV7UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV25Station, GXv_char4, GXv_char5, GXv_char6) ;
      trabajoexterno_header_trn_impl.this.AV8EmprCod = GXv_char4[0] ;
      trabajoexterno_header_trn_impl.this.AV26EmprNom = GXv_char5[0] ;
      trabajoexterno_header_trn_impl.this.AV7UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8EmprCod", AV8EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV26EmprNom", AV26EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7UsurCod", AV7UsurCod);
      GXv_SdtWWPContext7[0] = AV14WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV14WWPContext = GXv_SdtWWPContext7[0] ;
      edtTrnCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Visible), 5, 0), true);
      AV22ComboTrnCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ComboTrnCod), 4, 0));
      edtavCombotrncod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Visible), 5, 0), true);
      edtManCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Visible), 5, 0), true);
      AV24ComboManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ComboManCod), 4, 0));
      edtavCombomancod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomancod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomancod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOMANCOD' */
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
      AV15TrnContext.fromxml(AV16WebSession.getValue("TrnContext"), null, null);
      if ( ( GXutil.strcmp(AV15TrnContext.getgxTv_SdtWWPTransactionContext_Transactionname(), AV36Pgmname) == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) )
      {
         AV38GXV1 = 1 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GXV1), 8, 0));
         while ( AV38GXV1 <= AV15TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().size() )
         {
            AV19TrnContextAtt = (app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)((app.wwpbaseobjects.SdtWWPTransactionContext_Attribute)AV15TrnContext.getgxTv_SdtWWPTransactionContext_Attributes().elementAt(-1+AV38GXV1));
            if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "ManCod") == 0 )
            {
               AV17Insert_ManCod = (short)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Insert_ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Insert_ManCod), 4, 0));
               if ( ! (0==AV17Insert_ManCod) )
               {
                  AV24ComboManCod = AV17Insert_ManCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24ComboManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ComboManCod), 4, 0));
                  Combo_mancod_Selectedvalue_set = GXutil.trim( GXutil.str( AV24ComboManCod, 4, 0)) ;
                  ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "SelectedValue_set", Combo_mancod_Selectedvalue_set);
                  Combo_mancod_Enabled = false ;
                  ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "Enabled", GXutil.booltostr( Combo_mancod_Enabled));
               }
            }
            else if ( GXutil.strcmp(AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributename(), "TrnCod") == 0 )
            {
               AV18Insert_TrnCod = (short)(GXutil.lval( AV19TrnContextAtt.getgxTv_SdtWWPTransactionContext_Attribute_Attributevalue())) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18Insert_TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Insert_TrnCod), 4, 0));
               if ( ! (0==AV18Insert_TrnCod) )
               {
                  AV22ComboTrnCod = AV18Insert_TrnCod ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV22ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ComboTrnCod), 4, 0));
                  Combo_trncod_Selectedvalue_set = GXutil.trim( GXutil.str( AV22ComboTrnCod, 4, 0)) ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
                  Combo_trncod_Enabled = false ;
                  ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
               }
            }
            AV38GXV1 = (int)(AV38GXV1+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38GXV1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GXV1), 8, 0));
         }
      }
      edtSalGrossT_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalGrossT_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalGrossT_Visible), 5, 0), true);
      edtSalFmd_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmd_Visible), 5, 0), true);
      edtSalExtSec_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtSec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtSec_Visible), 5, 0), true);
      edtSalSts_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalSts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalSts_Visible), 5, 0), true);
   }

   public void e121UR2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) || ( GXutil.strcmp(Gx_mode, "UPD") == 0 ) )
      {
         httpContext.popup(formatLink("app.trabajoexterno_detail__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A2253SalExtAlb,8,0)),GXutil.URLEncode(GXutil.formatDateParm(A2256SalExtFec)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10076SalFhh)),GXutil.URLEncode(GXutil.ltrimstr(A2248ManCod,4,0)),GXutil.URLEncode(GXutil.rtrim(A2249ManNom)),GXutil.URLEncode(GXutil.rtrim(A10742SalCodeID)),GXutil.URLEncode(GXutil.ltrimstr(A10741SalEnvAT,1,0)),GXutil.URLEncode(GXutil.rtrim(AV29Hash)),GXutil.URLEncode(GXutil.booltostr(AV31ok)),GXutil.URLEncode(GXutil.rtrim(AV33Messages_json))}, new String[] {"Emprcod","SalExtAlb","SalExtFec","SalFhh","ManCod","ManNom","SalCodeID","SalEnvAT","HashIN","okIN","Messages_jsonIN"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV15TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.trabajosexternos.trabajoexterno_header_trnww", new String[] {}, new String[] {}) );
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
      /* 'LOADCOMBOTRNCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV20TrnCod_Data ;
      GXv_char6[0] = AV21ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.trabajosexternos.trabajoexterno_header_trnloaddvcombo(remoteHandle, context).execute( "TrnCod", Gx_mode, AV8EmprCod, AV13SalExtAlb, GXv_char6, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      trabajoexterno_header_trn_impl.this.AV21ComboSelectedValue = GXv_char6[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV20TrnCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_trncod_Selectedvalue_set = AV21ComboSelectedValue ;
      ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "SelectedValue_set", Combo_trncod_Selectedvalue_set);
      AV22ComboTrnCod = (short)(GXutil.lval( AV21ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22ComboTrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22ComboTrnCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_trncod_Enabled = false ;
         ucCombo_trncod.sendProperty(context, "", false, Combo_trncod_Internalname, "Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOMANCOD' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = AV23ManCod_Data ;
      GXv_char6[0] = AV21ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item9[0] = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      new app.trabajosexternos.trabajoexterno_header_trnloaddvcombo(remoteHandle, context).execute( "ManCod", Gx_mode, AV8EmprCod, AV13SalExtAlb, GXv_char6, GXv_objcol_SdtDVB_SDTComboData_Item9) ;
      trabajoexterno_header_trn_impl.this.AV21ComboSelectedValue = GXv_char6[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = GXv_objcol_SdtDVB_SDTComboData_Item9[0] ;
      AV23ManCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item8 ;
      Combo_mancod_Selectedvalue_set = AV21ComboSelectedValue ;
      ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "SelectedValue_set", Combo_mancod_Selectedvalue_set);
      AV24ComboManCod = (short)(GXutil.lval( AV21ComboSelectedValue)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24ComboManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24ComboManCod), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         Combo_mancod_Enabled = false ;
         ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "Enabled", GXutil.booltostr( Combo_mancod_Enabled));
      }
   }

   public void zm1UR305( int GX_JID )
   {
      if ( ( GX_JID == 45 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z2256SalExtFec = T01UR3_A2256SalExtFec[0] ;
            Z2257SalExtEst = T01UR3_A2257SalExtEst[0] ;
            Z2258SalExtLis = T01UR3_A2258SalExtLis[0] ;
            Z2254SalExtSec = T01UR3_A2254SalExtSec[0] ;
            Z6247SalExUln = T01UR3_A6247SalExUln[0] ;
            Z14398SalFecSal = T01UR3_A14398SalFecSal[0] ;
            Z6396SalExtHor = T01UR3_A6396SalExtHor[0] ;
            Z6397SalExtMat = T01UR3_A6397SalExtMat[0] ;
            Z7368SalExtUsu = T01UR3_A7368SalExtUsu[0] ;
            Z7369SalExtRec = T01UR3_A7369SalExtRec[0] ;
            Z7370ManCod_o = T01UR3_A7370ManCod_o[0] ;
            Z8655SalFecEnt = T01UR3_A8655SalFecEnt[0] ;
            Z11299SalExtFen = T01UR3_A11299SalExtFen[0] ;
            Z10767SalExtAT = T01UR3_A10767SalExtAT[0] ;
            Z10742SalCodeID = T01UR3_A10742SalCodeID[0] ;
            Z10741SalEnvAT = T01UR3_A10741SalEnvAT[0] ;
            Z10080SalSts = T01UR3_A10080SalSts[0] ;
            Z10079SalFmdD = T01UR3_A10079SalFmdD[0] ;
            Z10078SalGrossT = T01UR3_A10078SalGrossT[0] ;
            Z10077SalFmd = T01UR3_A10077SalFmd[0] ;
            Z10076SalFhh = T01UR3_A10076SalFhh[0] ;
            Z13244SalExtPre1 = T01UR3_A13244SalExtPre1[0] ;
            Z14348SalExtATCU = T01UR3_A14348SalExtATCU[0] ;
            Z14349SalExtSerA = T01UR3_A14349SalExtSerA[0] ;
            Z14350SalExtTipA = T01UR3_A14350SalExtTipA[0] ;
            Z840TrnCod = T01UR3_A840TrnCod[0] ;
            Z2248ManCod = T01UR3_A2248ManCod[0] ;
         }
         else
         {
            Z2256SalExtFec = A2256SalExtFec ;
            Z2257SalExtEst = A2257SalExtEst ;
            Z2258SalExtLis = A2258SalExtLis ;
            Z2254SalExtSec = A2254SalExtSec ;
            Z6247SalExUln = A6247SalExUln ;
            Z14398SalFecSal = A14398SalFecSal ;
            Z6396SalExtHor = A6396SalExtHor ;
            Z6397SalExtMat = A6397SalExtMat ;
            Z7368SalExtUsu = A7368SalExtUsu ;
            Z7369SalExtRec = A7369SalExtRec ;
            Z7370ManCod_o = A7370ManCod_o ;
            Z8655SalFecEnt = A8655SalFecEnt ;
            Z11299SalExtFen = A11299SalExtFen ;
            Z10767SalExtAT = A10767SalExtAT ;
            Z10742SalCodeID = A10742SalCodeID ;
            Z10741SalEnvAT = A10741SalEnvAT ;
            Z10080SalSts = A10080SalSts ;
            Z10079SalFmdD = A10079SalFmdD ;
            Z10078SalGrossT = A10078SalGrossT ;
            Z10077SalFmd = A10077SalFmd ;
            Z10076SalFhh = A10076SalFhh ;
            Z13244SalExtPre1 = A13244SalExtPre1 ;
            Z14348SalExtATCU = A14348SalExtATCU ;
            Z14349SalExtSerA = A14349SalExtSerA ;
            Z14350SalExtTipA = A14350SalExtTipA ;
            Z840TrnCod = A840TrnCod ;
            Z2248ManCod = A2248ManCod ;
         }
      }
      if ( GX_JID == -45 )
      {
         Z2253SalExtAlb = A2253SalExtAlb ;
         Z2256SalExtFec = A2256SalExtFec ;
         Z2257SalExtEst = A2257SalExtEst ;
         Z2258SalExtLis = A2258SalExtLis ;
         Z2254SalExtSec = A2254SalExtSec ;
         Z6247SalExUln = A6247SalExUln ;
         Z14398SalFecSal = A14398SalFecSal ;
         Z6396SalExtHor = A6396SalExtHor ;
         Z6397SalExtMat = A6397SalExtMat ;
         Z7368SalExtUsu = A7368SalExtUsu ;
         Z7369SalExtRec = A7369SalExtRec ;
         Z7370ManCod_o = A7370ManCod_o ;
         Z8655SalFecEnt = A8655SalFecEnt ;
         Z11299SalExtFen = A11299SalExtFen ;
         Z10767SalExtAT = A10767SalExtAT ;
         Z10742SalCodeID = A10742SalCodeID ;
         Z10741SalEnvAT = A10741SalEnvAT ;
         Z10080SalSts = A10080SalSts ;
         Z10079SalFmdD = A10079SalFmdD ;
         Z10078SalGrossT = A10078SalGrossT ;
         Z10077SalFmd = A10077SalFmd ;
         Z10076SalFhh = A10076SalFhh ;
         Z3554SalExtObs = A3554SalExtObs ;
         Z13244SalExtPre1 = A13244SalExtPre1 ;
         Z14348SalExtATCU = A14348SalExtATCU ;
         Z14349SalExtSerA = A14349SalExtSerA ;
         Z14350SalExtTipA = A14350SalExtTipA ;
         Z396EmprCod = A396EmprCod ;
         Z840TrnCod = A840TrnCod ;
         Z2248ManCod = A2248ManCod ;
         Z407EmprNom = A407EmprNom ;
         Z2249ManNom = A2249ManNom ;
         Z841TrnNom = A841TrnNom ;
      }
   }

   public void standaloneNotModal( )
   {
      cmbSalEnvAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalEnvAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSalEnvAT.getEnabled(), 5, 0), true);
      edtSalCodeID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalCodeID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalCodeID_Enabled), 5, 0), true);
      edtSalExtAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAT_Enabled), 5, 0), true);
      edtSalFhh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFhh_Enabled), 5, 0), true);
      edtSalExtATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtATCU_Enabled), 5, 0), true);
      edtSalFirma4d_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFirma4d_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFirma4d_Enabled), 5, 0), true);
      edtSalGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalGrossT_Enabled), 5, 0), true);
      edtSalFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmd_Enabled), 5, 0), true);
      edtSalFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFecSal_Enabled), 5, 0), true);
      edtSalExtHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtHor_Enabled), 5, 0), true);
      edtSalSts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalSts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalSts_Enabled), 5, 0), true);
      AV37Pgmdesc = httpContext.getMessage( "Trabajo Externo (Header)", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Pgmdesc", AV37Pgmdesc);
      AV36Pgmname = "TrabajosExternos.TrabajoExterno_Header_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV36Pgmname", AV36Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      cmbSalEnvAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalEnvAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSalEnvAT.getEnabled(), 5, 0), true);
      edtSalCodeID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalCodeID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalCodeID_Enabled), 5, 0), true);
      edtSalExtAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAT_Enabled), 5, 0), true);
      edtSalFhh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFhh_Enabled), 5, 0), true);
      edtSalExtATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtATCU_Enabled), 5, 0), true);
      edtSalFirma4d_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFirma4d_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFirma4d_Enabled), 5, 0), true);
      edtSalGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalGrossT_Enabled), 5, 0), true);
      edtSalFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmd_Enabled), 5, 0), true);
      edtSalFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFecSal_Enabled), 5, 0), true);
      edtSalExtHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtHor_Enabled), 5, 0), true);
      edtSalSts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalSts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalSts_Enabled), 5, 0), true);
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV8EmprCod)==0) )
      {
         A396EmprCod = AV8EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UR4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UR4_A407EmprNom[0] ;
      n407EmprNom = T01UR4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (0==AV13SalExtAlb) )
      {
         A2253SalExtAlb = AV13SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      if ( ! (0==AV13SalExtAlb) )
      {
         edtSalExtAlb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      }
      else
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            edtSalExtAlb_Enabled = 0 ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
         }
         else
         {
            edtSalExtAlb_Enabled = 1 ;
            httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
         }
      }
      if ( ! (0==AV13SalExtAlb) )
      {
         edtSalExtAlb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_ManCod) )
      {
         edtManCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      }
      else
      {
         edtManCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_TrnCod) )
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
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV17Insert_ManCod) )
      {
         A2248ManCod = AV17Insert_ManCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      else
      {
         A2248ManCod = AV24ComboManCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ! (0==AV18Insert_TrnCod) )
      {
         A840TrnCod = AV18Insert_TrnCod ;
         n840TrnCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      }
      else
      {
         if ( (0==AV22ComboTrnCod) )
         {
            A840TrnCod = (short)(0) ;
            n840TrnCod = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            n840TrnCod = true ;
            httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         }
         else
         {
            if ( ! (0==AV22ComboTrnCod) )
            {
               A840TrnCod = AV22ComboTrnCod ;
               n840TrnCod = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         edtSalExtAlb_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
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
      if ( isIns( )  && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A2256SalExtFec)) && ( Gx_BScreen == 0 ) )
      {
         A2256SalExtFec = GXutil.today( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      }
      if ( isIns( )  && (0==A2257SalExtEst) && ( Gx_BScreen == 0 ) )
      {
         A2257SalExtEst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      }
      if ( isIns( )  && (0==A2258SalExtLis) && ( Gx_BScreen == 0 ) )
      {
         A2258SalExtLis = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A7368SalExtUsu)==0) && ( Gx_BScreen == 0 ) )
      {
         A7368SalExtUsu = AV7UsurCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10742SalCodeID)==0) && ( Gx_BScreen == 0 ) )
      {
         A10742SalCodeID = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
      }
      if ( isIns( )  && (0==A10741SalEnvAT) && ( Gx_BScreen == 0 ) )
      {
         A10741SalEnvAT = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A10767SalExtAT)==0) && ( Gx_BScreen == 0 ) )
      {
         A10767SalExtAT = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
      }
      if ( isIns( )  && (GXutil.strcmp("", A10080SalSts)==0) && ( Gx_BScreen == 0 ) )
      {
         A10080SalSts = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         GXt_int10 = A14402SalLineasE ;
         GXv_int11[0] = GXt_int10 ;
         new app.trabajosexternos.haydatosexhdpz(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_int11) ;
         trabajoexterno_header_trn_impl.this.GXt_int10 = GXv_int11[0] ;
         A14402SalLineasE = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14402SalLineasE), 4, 0));
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14402SalLineasE > 0 ) )
         {
            Combo_mancod_Enabled = false ;
            ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "Enabled", GXutil.booltostr( Combo_mancod_Enabled));
         }
         GXt_date12 = A14397SalFecAnt ;
         GXv_date13[0] = GXt_date12 ;
         new app.trabajosexternos.trabajoexterno_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_date13) ;
         trabajoexterno_header_trn_impl.this.GXt_date12 = GXv_date13[0] ;
         A14397SalFecAnt = GXt_date12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
         /* Using cursor T01UR6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T01UR6_A2249ManNom[0] ;
         n2249ManNom = T01UR6_n2249ManNom[0] ;
         pr_default.close(4);
         /* Using cursor T01UR5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01UR5_A841TrnNom[0] ;
         n841TrnNom = T01UR5_n841TrnNom[0] ;
         pr_default.close(3);
      }
   }

   public void load1UR305( )
   {
      /* Using cursor T01UR7 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A3554SalExtObs = T01UR7_A3554SalExtObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
         A407EmprNom = T01UR7_A407EmprNom[0] ;
         n407EmprNom = T01UR7_n407EmprNom[0] ;
         A2249ManNom = T01UR7_A2249ManNom[0] ;
         n2249ManNom = T01UR7_n2249ManNom[0] ;
         A841TrnNom = T01UR7_A841TrnNom[0] ;
         n841TrnNom = T01UR7_n841TrnNom[0] ;
         A2256SalExtFec = T01UR7_A2256SalExtFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A2257SalExtEst = T01UR7_A2257SalExtEst[0] ;
         A2258SalExtLis = T01UR7_A2258SalExtLis[0] ;
         A2254SalExtSec = T01UR7_A2254SalExtSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
         A6247SalExUln = T01UR7_A6247SalExUln[0] ;
         A14398SalFecSal = T01UR7_A14398SalFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14398SalFecSal", localUtil.format(A14398SalFecSal, "99/99/99"));
         A6396SalExtHor = T01UR7_A6396SalExtHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
         A6397SalExtMat = T01UR7_A6397SalExtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
         A7368SalExtUsu = T01UR7_A7368SalExtUsu[0] ;
         A7369SalExtRec = T01UR7_A7369SalExtRec[0] ;
         A7370ManCod_o = T01UR7_A7370ManCod_o[0] ;
         A8655SalFecEnt = T01UR7_A8655SalFecEnt[0] ;
         A11299SalExtFen = T01UR7_A11299SalExtFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11299SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
         A10767SalExtAT = T01UR7_A10767SalExtAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
         A10742SalCodeID = T01UR7_A10742SalCodeID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
         A10741SalEnvAT = T01UR7_A10741SalEnvAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
         A10080SalSts = T01UR7_A10080SalSts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
         A10079SalFmdD = T01UR7_A10079SalFmdD[0] ;
         A10078SalGrossT = T01UR7_A10078SalGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
         A10077SalFmd = T01UR7_A10077SalFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
         A10076SalFhh = T01UR7_A10076SalFhh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13244SalExtPre1 = T01UR7_A13244SalExtPre1[0] ;
         A14348SalExtATCU = T01UR7_A14348SalExtATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14348SalExtATCU", A14348SalExtATCU);
         A14349SalExtSerA = T01UR7_A14349SalExtSerA[0] ;
         A14350SalExtTipA = T01UR7_A14350SalExtTipA[0] ;
         A840TrnCod = T01UR7_A840TrnCod[0] ;
         n840TrnCod = T01UR7_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T01UR7_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         zm1UR305( -45) ;
      }
      pr_default.close(5);
      onLoadActions1UR305( ) ;
   }

   public void onLoadActions1UR305( )
   {
      A14373SalFirma4d = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14373SalFirma4d", A14373SalFirma4d);
      GXt_int10 = A14402SalLineasE ;
      GXv_int11[0] = GXt_int10 ;
      new app.trabajosexternos.haydatosexhdpz(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_int11) ;
      trabajoexterno_header_trn_impl.this.GXt_int10 = GXv_int11[0] ;
      A14402SalLineasE = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14402SalLineasE), 4, 0));
      if ( ( GXutil.strcmp(sMode305, "INS") != 0 ) && ( A14402SalLineasE > 0 ) )
      {
         Combo_mancod_Enabled = false ;
         ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "Enabled", GXutil.booltostr( Combo_mancod_Enabled));
      }
      GXt_date12 = A14397SalFecAnt ;
      GXv_date13[0] = GXt_date12 ;
      new app.trabajosexternos.trabajoexterno_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_date13) ;
      trabajoexterno_header_trn_impl.this.GXt_date12 = GXv_date13[0] ;
      A14397SalFecAnt = GXt_date12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
      GXt_char3 = A7371ManNom_o ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int11[0] = A7370ManCod_o ;
      GXv_char5[0] = GXt_char3 ;
      new app.pmannom(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_char5) ;
      trabajoexterno_header_trn_impl.this.A396EmprCod = GXv_char6[0] ;
      trabajoexterno_header_trn_impl.this.A7370ManCod_o = GXv_int11[0] ;
      trabajoexterno_header_trn_impl.this.GXt_char3 = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A7370ManCod_o", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7370ManCod_o), 4, 0));
      A7371ManNom_o = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7371ManNom_o", A7371ManNom_o);
   }

   public void checkExtendedTable1UR305( )
   {
      nIsDirty_305 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      if ( (0==A2248ManCod) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido", ""), 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A14397SalFecAnt)) && GXutil.resetTime(A2256SalExtFec).before( GXutil.resetTime( A14397SalFecAnt )) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Data documento ", "")+GXutil.trim( localUtil.dtoc( A2256SalExtFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+httpContext.getMessage( ", inferior a Data Doc. Ant. ", "")+GXutil.trim( localUtil.dtoc( A14397SalFecAnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), 1, "SALEXTFEC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtFec_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      nIsDirty_305 = (short)(1) ;
      A14373SalFirma4d = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14373SalFirma4d", A14373SalFirma4d);
      /* Using cursor T01UR5 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(3) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01UR5_A841TrnNom[0] ;
      n841TrnNom = T01UR5_n841TrnNom[0] ;
      pr_default.close(3);
      /* Using cursor T01UR6 */
      pr_default.execute(4, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Manufacturador Inexistente", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T01UR6_A2249ManNom[0] ;
      n2249ManNom = T01UR6_n2249ManNom[0] ;
      pr_default.close(4);
      nIsDirty_305 = (short)(1) ;
      GXt_int10 = A14402SalLineasE ;
      GXv_int11[0] = GXt_int10 ;
      new app.trabajosexternos.haydatosexhdpz(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_int11) ;
      trabajoexterno_header_trn_impl.this.GXt_int10 = GXv_int11[0] ;
      A14402SalLineasE = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14402SalLineasE), 4, 0));
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14402SalLineasE > 0 ) )
      {
         Combo_mancod_Enabled = false ;
         ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "Enabled", GXutil.booltostr( Combo_mancod_Enabled));
      }
      nIsDirty_305 = (short)(1) ;
      GXt_date12 = A14397SalFecAnt ;
      GXv_date13[0] = GXt_date12 ;
      new app.trabajosexternos.trabajoexterno_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_date13) ;
      trabajoexterno_header_trn_impl.this.GXt_date12 = GXv_date13[0] ;
      A14397SalFecAnt = GXt_date12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
      nIsDirty_305 = (short)(1) ;
      GXt_char3 = A7371ManNom_o ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int11[0] = A7370ManCod_o ;
      GXv_char5[0] = GXt_char3 ;
      new app.pmannom(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_char5) ;
      trabajoexterno_header_trn_impl.this.A396EmprCod = GXv_char6[0] ;
      trabajoexterno_header_trn_impl.this.A7370ManCod_o = GXv_int11[0] ;
      trabajoexterno_header_trn_impl.this.GXt_char3 = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A7370ManCod_o", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7370ManCod_o), 4, 0));
      A7371ManNom_o = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7371ManNom_o", A7371ManNom_o);
   }

   public void closeExtendedTableCursors1UR305( )
   {
      pr_default.close(3);
      pr_default.close(4);
   }

   public void enableDisable( )
   {
   }

   public void gxload_47( String A396EmprCod ,
                          short A840TrnCod )
   {
      /* Using cursor T01UR8 */
      pr_default.execute(6, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(6) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      A841TrnNom = T01UR8_A841TrnNom[0] ;
      n841TrnNom = T01UR8_n841TrnNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A841TrnNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(6) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(6);
   }

   public void gxload_48( String A396EmprCod ,
                          short A2248ManCod )
   {
      /* Using cursor T01UR9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(7) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Manufacturador Inexistente", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A2249ManNom = T01UR9_A2249ManNom[0] ;
      n2249ManNom = T01UR9_n2249ManNom[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A2249ManNom))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(7) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(7);
   }

   public void getKey1UR305( )
   {
      /* Using cursor T01UR10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound305 = (short)(1) ;
      }
      else
      {
         RcdFound305 = (short)(0) ;
      }
      pr_default.close(8);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UR3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UR305( 45) ;
         RcdFound305 = (short)(1) ;
         A3554SalExtObs = T01UR3_A3554SalExtObs[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
         A2253SalExtAlb = T01UR3_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         A2256SalExtFec = T01UR3_A2256SalExtFec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
         A2257SalExtEst = T01UR3_A2257SalExtEst[0] ;
         A2258SalExtLis = T01UR3_A2258SalExtLis[0] ;
         A2254SalExtSec = T01UR3_A2254SalExtSec[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
         A6247SalExUln = T01UR3_A6247SalExUln[0] ;
         A14398SalFecSal = T01UR3_A14398SalFecSal[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14398SalFecSal", localUtil.format(A14398SalFecSal, "99/99/99"));
         A6396SalExtHor = T01UR3_A6396SalExtHor[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
         A6397SalExtMat = T01UR3_A6397SalExtMat[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
         A7368SalExtUsu = T01UR3_A7368SalExtUsu[0] ;
         A7369SalExtRec = T01UR3_A7369SalExtRec[0] ;
         A7370ManCod_o = T01UR3_A7370ManCod_o[0] ;
         A8655SalFecEnt = T01UR3_A8655SalFecEnt[0] ;
         A11299SalExtFen = T01UR3_A11299SalExtFen[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A11299SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
         A10767SalExtAT = T01UR3_A10767SalExtAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
         A10742SalCodeID = T01UR3_A10742SalCodeID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
         A10741SalEnvAT = T01UR3_A10741SalEnvAT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
         A10080SalSts = T01UR3_A10080SalSts[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
         A10079SalFmdD = T01UR3_A10079SalFmdD[0] ;
         A10078SalGrossT = T01UR3_A10078SalGrossT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
         A10077SalFmd = T01UR3_A10077SalFmd[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
         A10076SalFhh = T01UR3_A10076SalFhh[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         A13244SalExtPre1 = T01UR3_A13244SalExtPre1[0] ;
         A14348SalExtATCU = T01UR3_A14348SalExtATCU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14348SalExtATCU", A14348SalExtATCU);
         A14349SalExtSerA = T01UR3_A14349SalExtSerA[0] ;
         A14350SalExtTipA = T01UR3_A14350SalExtTipA[0] ;
         A396EmprCod = T01UR3_A396EmprCod[0] ;
         A840TrnCod = T01UR3_A840TrnCod[0] ;
         n840TrnCod = T01UR3_n840TrnCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
         A2248ManCod = T01UR3_A2248ManCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z2253SalExtAlb = A2253SalExtAlb ;
         sMode305 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UR305( ) ;
         if ( AnyError == 1 )
         {
            RcdFound305 = (short)(0) ;
            initializeNonKey1UR305( ) ;
         }
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound305 = (short)(0) ;
         initializeNonKey1UR305( ) ;
         sMode305 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode305 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UR305( ) ;
      if ( RcdFound305 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound305 = (short)(0) ;
      /* Using cursor T01UR11 */
      pr_default.execute(9, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UR11_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UR11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UR11_A2253SalExtAlb[0] < A2253SalExtAlb ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( GXutil.strcmp(T01UR11_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UR11_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UR11_A2253SalExtAlb[0] > A2253SalExtAlb ) ) )
         {
            A396EmprCod = T01UR11_A396EmprCod[0] ;
            A2253SalExtAlb = T01UR11_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound305 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void move_previous( )
   {
      RcdFound305 = (short)(0) ;
      /* Using cursor T01UR12 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UR12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UR12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UR12_A2253SalExtAlb[0] > A2253SalExtAlb ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T01UR12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UR12_A396EmprCod[0], A396EmprCod) == 0 ) && ( T01UR12_A2253SalExtAlb[0] < A2253SalExtAlb ) ) )
         {
            A396EmprCod = T01UR12_A396EmprCod[0] ;
            A2253SalExtAlb = T01UR12_A2253SalExtAlb[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
            RcdFound305 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UR305( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UR305( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound305 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A2253SalExtAlb = Z2253SalExtAlb ;
               httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "SALEXTALB");
               AnyError = (short)(1) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UR305( ) ;
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
            {
               /* Insert record */
               GX_FocusControl = edtSalExtAlb_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UR305( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "SALEXTALB");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtSalExtAlb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  /* Insert record */
                  GX_FocusControl = edtSalExtAlb_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UR305( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( A2253SalExtAlb != Z2253SalExtAlb ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A2253SalExtAlb = Z2253SalExtAlb ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "SALEXTALB");
         AnyError = (short)(1) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtSalExtAlb_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UR305( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UR2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXTSA"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( GXutil.dateCompare(GXutil.resetTime(Z2256SalExtFec), GXutil.resetTime(T01UR2_A2256SalExtFec[0])) ) || ( Z2257SalExtEst != T01UR2_A2257SalExtEst[0] ) || ( Z2258SalExtLis != T01UR2_A2258SalExtLis[0] ) || ( GXutil.strcmp(Z2254SalExtSec, T01UR2_A2254SalExtSec[0]) != 0 ) || ( Z6247SalExUln != T01UR2_A6247SalExUln[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(GXutil.resetTime(Z14398SalFecSal), GXutil.resetTime(T01UR2_A14398SalFecSal[0])) ) || ( GXutil.strcmp(Z6396SalExtHor, T01UR2_A6396SalExtHor[0]) != 0 ) || ( GXutil.strcmp(Z6397SalExtMat, T01UR2_A6397SalExtMat[0]) != 0 ) || ( GXutil.strcmp(Z7368SalExtUsu, T01UR2_A7368SalExtUsu[0]) != 0 ) || ( Z7369SalExtRec != T01UR2_A7369SalExtRec[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z7370ManCod_o != T01UR2_A7370ManCod_o[0] ) || !( GXutil.dateCompare(GXutil.resetTime(Z8655SalFecEnt), GXutil.resetTime(T01UR2_A8655SalFecEnt[0])) ) || !( GXutil.dateCompare(GXutil.resetTime(Z11299SalExtFen), GXutil.resetTime(T01UR2_A11299SalExtFen[0])) ) || ( GXutil.strcmp(Z10767SalExtAT, T01UR2_A10767SalExtAT[0]) != 0 ) || ( GXutil.strcmp(Z10742SalCodeID, T01UR2_A10742SalCodeID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z10741SalEnvAT != T01UR2_A10741SalEnvAT[0] ) || ( GXutil.strcmp(Z10080SalSts, T01UR2_A10080SalSts[0]) != 0 ) || ( GXutil.strcmp(Z10079SalFmdD, T01UR2_A10079SalFmdD[0]) != 0 ) || ( DecimalUtil.compareTo(Z10078SalGrossT, T01UR2_A10078SalGrossT[0]) != 0 ) || ( GXutil.strcmp(Z10077SalFmd, T01UR2_A10077SalFmd[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( GXutil.dateCompare(Z10076SalFhh, T01UR2_A10076SalFhh[0]) ) || ( DecimalUtil.compareTo(Z13244SalExtPre1, T01UR2_A13244SalExtPre1[0]) != 0 ) || ( GXutil.strcmp(Z14348SalExtATCU, T01UR2_A14348SalExtATCU[0]) != 0 ) || ( GXutil.strcmp(Z14349SalExtSerA, T01UR2_A14349SalExtSerA[0]) != 0 ) || ( GXutil.strcmp(Z14350SalExtTipA, T01UR2_A14350SalExtTipA[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z840TrnCod != T01UR2_A840TrnCod[0] ) || ( Z2248ManCod != T01UR2_A2248ManCod[0] ) )
         {
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z2256SalExtFec), GXutil.resetTime(T01UR2_A2256SalExtFec[0])) ) )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtFec");
               GXutil.writeLogRaw("Old: ",Z2256SalExtFec);
               GXutil.writeLogRaw("Current: ",T01UR2_A2256SalExtFec[0]);
            }
            if ( Z2257SalExtEst != T01UR2_A2257SalExtEst[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtEst");
               GXutil.writeLogRaw("Old: ",Z2257SalExtEst);
               GXutil.writeLogRaw("Current: ",T01UR2_A2257SalExtEst[0]);
            }
            if ( Z2258SalExtLis != T01UR2_A2258SalExtLis[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtLis");
               GXutil.writeLogRaw("Old: ",Z2258SalExtLis);
               GXutil.writeLogRaw("Current: ",T01UR2_A2258SalExtLis[0]);
            }
            if ( GXutil.strcmp(Z2254SalExtSec, T01UR2_A2254SalExtSec[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtSec");
               GXutil.writeLogRaw("Old: ",Z2254SalExtSec);
               GXutil.writeLogRaw("Current: ",T01UR2_A2254SalExtSec[0]);
            }
            if ( Z6247SalExUln != T01UR2_A6247SalExUln[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExUln");
               GXutil.writeLogRaw("Old: ",Z6247SalExUln);
               GXutil.writeLogRaw("Current: ",T01UR2_A6247SalExUln[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z14398SalFecSal), GXutil.resetTime(T01UR2_A14398SalFecSal[0])) ) )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalFecSal");
               GXutil.writeLogRaw("Old: ",Z14398SalFecSal);
               GXutil.writeLogRaw("Current: ",T01UR2_A14398SalFecSal[0]);
            }
            if ( GXutil.strcmp(Z6396SalExtHor, T01UR2_A6396SalExtHor[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtHor");
               GXutil.writeLogRaw("Old: ",Z6396SalExtHor);
               GXutil.writeLogRaw("Current: ",T01UR2_A6396SalExtHor[0]);
            }
            if ( GXutil.strcmp(Z6397SalExtMat, T01UR2_A6397SalExtMat[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtMat");
               GXutil.writeLogRaw("Old: ",Z6397SalExtMat);
               GXutil.writeLogRaw("Current: ",T01UR2_A6397SalExtMat[0]);
            }
            if ( GXutil.strcmp(Z7368SalExtUsu, T01UR2_A7368SalExtUsu[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtUsu");
               GXutil.writeLogRaw("Old: ",Z7368SalExtUsu);
               GXutil.writeLogRaw("Current: ",T01UR2_A7368SalExtUsu[0]);
            }
            if ( Z7369SalExtRec != T01UR2_A7369SalExtRec[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtRec");
               GXutil.writeLogRaw("Old: ",Z7369SalExtRec);
               GXutil.writeLogRaw("Current: ",T01UR2_A7369SalExtRec[0]);
            }
            if ( Z7370ManCod_o != T01UR2_A7370ManCod_o[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"ManCod_o");
               GXutil.writeLogRaw("Old: ",Z7370ManCod_o);
               GXutil.writeLogRaw("Current: ",T01UR2_A7370ManCod_o[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z8655SalFecEnt), GXutil.resetTime(T01UR2_A8655SalFecEnt[0])) ) )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalFecEnt");
               GXutil.writeLogRaw("Old: ",Z8655SalFecEnt);
               GXutil.writeLogRaw("Current: ",T01UR2_A8655SalFecEnt[0]);
            }
            if ( !( GXutil.dateCompare(GXutil.resetTime(Z11299SalExtFen), GXutil.resetTime(T01UR2_A11299SalExtFen[0])) ) )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtFen");
               GXutil.writeLogRaw("Old: ",Z11299SalExtFen);
               GXutil.writeLogRaw("Current: ",T01UR2_A11299SalExtFen[0]);
            }
            if ( GXutil.strcmp(Z10767SalExtAT, T01UR2_A10767SalExtAT[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtAT");
               GXutil.writeLogRaw("Old: ",Z10767SalExtAT);
               GXutil.writeLogRaw("Current: ",T01UR2_A10767SalExtAT[0]);
            }
            if ( GXutil.strcmp(Z10742SalCodeID, T01UR2_A10742SalCodeID[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalCodeID");
               GXutil.writeLogRaw("Old: ",Z10742SalCodeID);
               GXutil.writeLogRaw("Current: ",T01UR2_A10742SalCodeID[0]);
            }
            if ( Z10741SalEnvAT != T01UR2_A10741SalEnvAT[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalEnvAT");
               GXutil.writeLogRaw("Old: ",Z10741SalEnvAT);
               GXutil.writeLogRaw("Current: ",T01UR2_A10741SalEnvAT[0]);
            }
            if ( GXutil.strcmp(Z10080SalSts, T01UR2_A10080SalSts[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalSts");
               GXutil.writeLogRaw("Old: ",Z10080SalSts);
               GXutil.writeLogRaw("Current: ",T01UR2_A10080SalSts[0]);
            }
            if ( GXutil.strcmp(Z10079SalFmdD, T01UR2_A10079SalFmdD[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalFmdD");
               GXutil.writeLogRaw("Old: ",Z10079SalFmdD);
               GXutil.writeLogRaw("Current: ",T01UR2_A10079SalFmdD[0]);
            }
            if ( DecimalUtil.compareTo(Z10078SalGrossT, T01UR2_A10078SalGrossT[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalGrossT");
               GXutil.writeLogRaw("Old: ",Z10078SalGrossT);
               GXutil.writeLogRaw("Current: ",T01UR2_A10078SalGrossT[0]);
            }
            if ( GXutil.strcmp(Z10077SalFmd, T01UR2_A10077SalFmd[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalFmd");
               GXutil.writeLogRaw("Old: ",Z10077SalFmd);
               GXutil.writeLogRaw("Current: ",T01UR2_A10077SalFmd[0]);
            }
            if ( !( GXutil.dateCompare(Z10076SalFhh, T01UR2_A10076SalFhh[0]) ) )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalFhh");
               GXutil.writeLogRaw("Old: ",Z10076SalFhh);
               GXutil.writeLogRaw("Current: ",T01UR2_A10076SalFhh[0]);
            }
            if ( DecimalUtil.compareTo(Z13244SalExtPre1, T01UR2_A13244SalExtPre1[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtPre1");
               GXutil.writeLogRaw("Old: ",Z13244SalExtPre1);
               GXutil.writeLogRaw("Current: ",T01UR2_A13244SalExtPre1[0]);
            }
            if ( GXutil.strcmp(Z14348SalExtATCU, T01UR2_A14348SalExtATCU[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtATCU");
               GXutil.writeLogRaw("Old: ",Z14348SalExtATCU);
               GXutil.writeLogRaw("Current: ",T01UR2_A14348SalExtATCU[0]);
            }
            if ( GXutil.strcmp(Z14349SalExtSerA, T01UR2_A14349SalExtSerA[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtSerA");
               GXutil.writeLogRaw("Old: ",Z14349SalExtSerA);
               GXutil.writeLogRaw("Current: ",T01UR2_A14349SalExtSerA[0]);
            }
            if ( GXutil.strcmp(Z14350SalExtTipA, T01UR2_A14350SalExtTipA[0]) != 0 )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"SalExtTipA");
               GXutil.writeLogRaw("Old: ",Z14350SalExtTipA);
               GXutil.writeLogRaw("Current: ",T01UR2_A14350SalExtTipA[0]);
            }
            if ( Z840TrnCod != T01UR2_A840TrnCod[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"TrnCod");
               GXutil.writeLogRaw("Old: ",Z840TrnCod);
               GXutil.writeLogRaw("Current: ",T01UR2_A840TrnCod[0]);
            }
            if ( Z2248ManCod != T01UR2_A2248ManCod[0] )
            {
               GXutil.writeLogln("trabajosexternos.trabajoexterno_header_trn:[seudo value changed for attri]"+"ManCod");
               GXutil.writeLogRaw("Old: ",Z2248ManCod);
               GXutil.writeLogRaw("Current: ",T01UR2_A2248ManCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPCEXTSA"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UR305( )
   {
      beforeValidate1UR305( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UR305( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UR305( 0) ;
         checkOptimisticConcurrency1UR305( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UR305( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UR305( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UR13 */
                  pr_default.execute(11, new Object[] {Integer.valueOf(A2253SalExtAlb), A2256SalExtFec, Byte.valueOf(A2257SalExtEst), Byte.valueOf(A2258SalExtLis), A2254SalExtSec, Short.valueOf(A6247SalExUln), A14398SalFecSal, A6396SalExtHor, A6397SalExtMat, A7368SalExtUsu, Integer.valueOf(A7369SalExtRec), Short.valueOf(A7370ManCod_o), A8655SalFecEnt, A11299SalExtFen, A10767SalExtAT, A10742SalCodeID, Byte.valueOf(A10741SalEnvAT), A10080SalSts, A10079SalFmdD, A10078SalGrossT, A10077SalFmd, A10076SalFhh, A3554SalExtObs, A13244SalExtPre1, A14348SalExtATCU, A14349SalExtSerA, A14350SalExtTipA, A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Short.valueOf(A2248ManCod)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
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
                        resetCaption1UR0( ) ;
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
            load1UR305( ) ;
         }
         endLevel1UR305( ) ;
      }
      closeExtendedTableCursors1UR305( ) ;
   }

   public void update1UR305( )
   {
      beforeValidate1UR305( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UR305( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UR305( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UR305( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UR305( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UR14 */
                  pr_default.execute(12, new Object[] {A2256SalExtFec, Byte.valueOf(A2257SalExtEst), Byte.valueOf(A2258SalExtLis), A2254SalExtSec, Short.valueOf(A6247SalExUln), A14398SalFecSal, A6396SalExtHor, A6397SalExtMat, A7368SalExtUsu, Integer.valueOf(A7369SalExtRec), Short.valueOf(A7370ManCod_o), A8655SalFecEnt, A11299SalExtFen, A10767SalExtAT, A10742SalCodeID, Byte.valueOf(A10741SalEnvAT), A10080SalSts, A10079SalFmdD, A10078SalGrossT, A10077SalFmd, A10076SalFhh, A3554SalExtObs, A13244SalExtPre1, A14348SalExtATCU, A14349SalExtSerA, A14350SalExtTipA, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod), Short.valueOf(A2248ManCod), A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
                  if ( (pr_default.getStatus(12) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPCEXTSA"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UR305( ) ;
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
         endLevel1UR305( ) ;
      }
      closeExtendedTableCursors1UR305( ) ;
   }

   public void deferredUpdate1UR305( )
   {
   }

   public void delete( )
   {
      beforeValidate1UR305( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UR305( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UR305( ) ;
         afterConfirm1UR305( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UR305( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UR15 */
               pr_default.execute(13, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCEXTSA");
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
      sMode305 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UR305( ) ;
      Gx_mode = sMode305 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UR305( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         if ( (0==A2248ManCod) && isIns( )  )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido", ""), 1, "MANCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtManCod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         A14373SalFirma4d = GXutil.substring( A10077SalFmd, 1, 1) + GXutil.substring( A10077SalFmd, 11, 1) + GXutil.substring( A10077SalFmd, 21, 1) + GXutil.substring( A10077SalFmd, 31, 1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14373SalFirma4d", A14373SalFirma4d);
         /* Using cursor T01UR16 */
         pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
         A841TrnNom = T01UR16_A841TrnNom[0] ;
         n841TrnNom = T01UR16_n841TrnNom[0] ;
         pr_default.close(14);
         /* Using cursor T01UR17 */
         pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
         A2249ManNom = T01UR17_A2249ManNom[0] ;
         n2249ManNom = T01UR17_n2249ManNom[0] ;
         pr_default.close(15);
         GXt_int10 = A14402SalLineasE ;
         GXv_int11[0] = GXt_int10 ;
         new app.trabajosexternos.haydatosexhdpz(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_int11) ;
         trabajoexterno_header_trn_impl.this.GXt_int10 = GXv_int11[0] ;
         A14402SalLineasE = GXt_int10 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14402SalLineasE), 4, 0));
         if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14402SalLineasE > 0 ) )
         {
            Combo_mancod_Enabled = false ;
            ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "Enabled", GXutil.booltostr( Combo_mancod_Enabled));
         }
         GXt_date12 = A14397SalFecAnt ;
         GXv_date13[0] = GXt_date12 ;
         new app.trabajosexternos.trabajoexterno_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_date13) ;
         trabajoexterno_header_trn_impl.this.GXt_date12 = GXv_date13[0] ;
         A14397SalFecAnt = GXt_date12 ;
         httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
         GXt_char3 = A7371ManNom_o ;
         GXv_char6[0] = A396EmprCod ;
         GXv_int11[0] = A7370ManCod_o ;
         GXv_char5[0] = GXt_char3 ;
         new app.pmannom(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_char5) ;
         trabajoexterno_header_trn_impl.this.A396EmprCod = GXv_char6[0] ;
         trabajoexterno_header_trn_impl.this.A7370ManCod_o = GXv_int11[0] ;
         trabajoexterno_header_trn_impl.this.GXt_char3 = GXv_char5[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A7370ManCod_o", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7370ManCod_o), 4, 0));
         A7371ManNom_o = GXt_char3 ;
         httpContext.ajax_rsp_assign_attri("", false, "A7371ManNom_o", A7371ManNom_o);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UR18 */
         pr_default.execute(16, new Object[] {A396EmprCod, Integer.valueOf(A2253SalExtAlb)});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "LEXTSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void endLevel1UR305( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UR305( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_header_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UR0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "trabajosexternos.trabajoexterno_header_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UR305( )
   {
      /* Scan By routine */
      /* Using cursor T01UR19 */
      pr_default.execute(17);
      RcdFound305 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A396EmprCod = T01UR19_A396EmprCod[0] ;
         A2253SalExtAlb = T01UR19_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UR305( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound305 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound305 = (short)(1) ;
         A396EmprCod = T01UR19_A396EmprCod[0] ;
         A2253SalExtAlb = T01UR19_A2253SalExtAlb[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
   }

   public void scanEnd1UR305( )
   {
      pr_default.close(17);
   }

   public void afterConfirm1UR305( )
   {
      /* After Confirm Rules */
      if ( (0==A2253SalExtAlb) && true /* After */ )
      {
         GXv_int14[0] = A2253SalExtAlb ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_int14) ;
         trabajoexterno_header_trn_impl.this.A2253SalExtAlb = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
   }

   public void beforeInsert1UR305( )
   {
      /* Before Insert Rules */
      GXv_char6[0] = A14348SalExtATCU ;
      GXv_char5[0] = A14349SalExtSerA ;
      GXv_char4[0] = A14350SalExtTipA ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_char6, GXv_char5, GXv_char4, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV36Pgmname)+"."+GXutil.trim( AV37Pgmdesc)) ;
      trabajoexterno_header_trn_impl.this.A14348SalExtATCU = GXv_char6[0] ;
      trabajoexterno_header_trn_impl.this.A14349SalExtSerA = GXv_char5[0] ;
      trabajoexterno_header_trn_impl.this.A14350SalExtTipA = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14348SalExtATCU", A14348SalExtATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A14349SalExtSerA", A14349SalExtSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A14350SalExtTipA", A14350SalExtTipA);
      if ( (GXutil.strcmp("", A14348SalExtATCU)==0) )
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

   public void beforeUpdate1UR305( )
   {
      /* Before Update Rules */
      GXv_char6[0] = A14348SalExtATCU ;
      GXv_char5[0] = A14349SalExtSerA ;
      GXv_char4[0] = A14350SalExtTipA ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_char6, GXv_char5, GXv_char4, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV36Pgmname)+"."+GXutil.trim( AV37Pgmdesc)) ;
      trabajoexterno_header_trn_impl.this.A14348SalExtATCU = GXv_char6[0] ;
      trabajoexterno_header_trn_impl.this.A14349SalExtSerA = GXv_char5[0] ;
      trabajoexterno_header_trn_impl.this.A14350SalExtTipA = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14348SalExtATCU", A14348SalExtATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A14349SalExtSerA", A14349SalExtSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A14350SalExtTipA", A14350SalExtTipA);
      if ( (GXutil.strcmp("", A14348SalExtATCU)==0) )
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

   public void beforeDelete1UR305( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UR305( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UR305( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UR305( )
   {
      edtSalExtAlb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAlb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAlb_Enabled), 5, 0), true);
      edtSalExtFec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtFec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtFec_Enabled), 5, 0), true);
      edtSalFecAnt_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFecAnt_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFecAnt_Enabled), 5, 0), true);
      edtManCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtManCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtManCod_Enabled), 5, 0), true);
      edtTrnCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTrnCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTrnCod_Enabled), 5, 0), true);
      edtSalExtMat_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtMat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtMat_Enabled), 5, 0), true);
      edtSalFecSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFecSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFecSal_Enabled), 5, 0), true);
      edtSalExtHor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtHor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtHor_Enabled), 5, 0), true);
      edtSalExtFen_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtFen_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtFen_Enabled), 5, 0), true);
      edtSalExtObs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtObs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtObs_Enabled), 5, 0), true);
      edtSalLineasE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalLineasE_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalLineasE_Enabled), 5, 0), true);
      cmbSalEnvAT.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbSalEnvAT.getInternalname(), "Enabled", GXutil.ltrimstr( cmbSalEnvAT.getEnabled(), 5, 0), true);
      edtSalCodeID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalCodeID_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalCodeID_Enabled), 5, 0), true);
      edtSalExtAT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtAT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtAT_Enabled), 5, 0), true);
      edtSalFhh_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFhh_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFhh_Enabled), 5, 0), true);
      edtSalExtATCU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtATCU_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtATCU_Enabled), 5, 0), true);
      edtSalFirma4d_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFirma4d_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFirma4d_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavCombomancod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombomancod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombomancod_Enabled), 5, 0), true);
      edtavCombotrncod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCombotrncod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCombotrncod_Enabled), 5, 0), true);
      edtSalGrossT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalGrossT_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalGrossT_Enabled), 5, 0), true);
      edtSalFmd_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalFmd_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalFmd_Enabled), 5, 0), true);
      edtSalExtSec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalExtSec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalExtSec_Enabled), 5, 0), true);
      edtSalSts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtSalSts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtSalSts_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UR305( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UR0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_header_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13SalExtAlb,8,0))}, new String[] {"Gx_mode","EmprCod","SalExtAlb"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Header_TRN");
      forbiddenHiddens.add("SalEnvAT", localUtil.format( DecimalUtil.doubleToDec(A10741SalEnvAT), "9"));
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV36Pgmname, "")));
      forbiddenHiddens.add("SalExtEst", localUtil.format( DecimalUtil.doubleToDec(A2257SalExtEst), "9"));
      forbiddenHiddens.add("SalExtLis", localUtil.format( DecimalUtil.doubleToDec(A2258SalExtLis), "9"));
      forbiddenHiddens.add("SalExUln", localUtil.format( DecimalUtil.doubleToDec(A6247SalExUln), "ZZZ9"));
      forbiddenHiddens.add("SalFecSal", localUtil.format(A14398SalFecSal, "99/99/99"));
      forbiddenHiddens.add("SalExtHor", GXutil.rtrim( localUtil.format( A6396SalExtHor, "")));
      forbiddenHiddens.add("SalExtUsu", GXutil.rtrim( localUtil.format( A7368SalExtUsu, "@!")));
      forbiddenHiddens.add("SalExtRec", localUtil.format( DecimalUtil.doubleToDec(A7369SalExtRec), "ZZZZZ9"));
      forbiddenHiddens.add("ManCod_o", localUtil.format( DecimalUtil.doubleToDec(A7370ManCod_o), "ZZZ9"));
      forbiddenHiddens.add("SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
      forbiddenHiddens.add("SalExtAT", GXutil.rtrim( localUtil.format( A10767SalExtAT, "")));
      forbiddenHiddens.add("SalCodeID", GXutil.rtrim( localUtil.format( A10742SalCodeID, "")));
      forbiddenHiddens.add("SalSts", GXutil.rtrim( localUtil.format( A10080SalSts, "")));
      forbiddenHiddens.add("SalFmdD", GXutil.rtrim( localUtil.format( A10079SalFmdD, "")));
      forbiddenHiddens.add("SalGrossT", localUtil.format( A10078SalGrossT, "ZZZZZZZZZ9.99"));
      forbiddenHiddens.add("SalFmd", GXutil.rtrim( localUtil.format( A10077SalFmd, "")));
      forbiddenHiddens.add("SalFhh", localUtil.format( A10076SalFhh, "99/99/99 99:99"));
      forbiddenHiddens.add("SalExtPre1", localUtil.format( A13244SalExtPre1, "ZZZZZZ9.99999"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_header_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2253SalExtAlb", GXutil.ltrim( localUtil.ntoc( Z2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2256SalExtFec", localUtil.dtoc( Z2256SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2257SalExtEst", GXutil.ltrim( localUtil.ntoc( Z2257SalExtEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2258SalExtLis", GXutil.ltrim( localUtil.ntoc( Z2258SalExtLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2254SalExtSec", GXutil.rtrim( Z2254SalExtSec));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6247SalExUln", GXutil.ltrim( localUtil.ntoc( Z6247SalExUln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14398SalFecSal", localUtil.dtoc( Z14398SalFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6396SalExtHor", GXutil.rtrim( Z6396SalExtHor));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6397SalExtMat", GXutil.rtrim( Z6397SalExtMat));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7368SalExtUsu", GXutil.rtrim( Z7368SalExtUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7369SalExtRec", GXutil.ltrim( localUtil.ntoc( Z7369SalExtRec, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7370ManCod_o", GXutil.ltrim( localUtil.ntoc( Z7370ManCod_o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8655SalFecEnt", localUtil.dtoc( Z8655SalFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z11299SalExtFen", localUtil.dtoc( Z11299SalExtFen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10767SalExtAT", GXutil.rtrim( Z10767SalExtAT));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10742SalCodeID", GXutil.rtrim( Z10742SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10741SalEnvAT", GXutil.ltrim( localUtil.ntoc( Z10741SalEnvAT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10080SalSts", GXutil.rtrim( Z10080SalSts));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10079SalFmdD", GXutil.rtrim( Z10079SalFmdD));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10078SalGrossT", GXutil.ltrim( localUtil.ntoc( Z10078SalGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10077SalFmd", GXutil.rtrim( Z10077SalFmd));
      app.GxWebStd.gx_hidden_field( httpContext, "Z10076SalFhh", localUtil.ttoc( Z10076SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "Z13244SalExtPre1", GXutil.ltrim( localUtil.ntoc( Z13244SalExtPre1, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14348SalExtATCU", GXutil.rtrim( Z14348SalExtATCU));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14349SalExtSerA", GXutil.rtrim( Z14349SalExtSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14350SalExtTipA", GXutil.rtrim( Z14350SalExtTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "Z840TrnCod", GXutil.ltrim( localUtil.ntoc( Z840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z2248ManCod", GXutil.ltrim( localUtil.ntoc( Z2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "N2248ManCod", GXutil.ltrim( localUtil.ntoc( A2248ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "N840TrnCod", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANCOD_DATA", AV23ManCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANCOD_DATA", AV23ManCod_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCOD_DATA", AV20TrnCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCOD_DATA", AV20TrnCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV29Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29Hash, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOK", AV31ok);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOK", getSecureSignedToken( "", AV31ok));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV33Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV33Messages_json));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV15TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV15TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV15TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MANCOD_O", GXutil.ltrim( localUtil.ntoc( A7370ManCod_o, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MANNOM_O", GXutil.rtrim( A7371ManNom_o));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV13SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXTALB", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13SalExtAlb), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_MANCOD", GXutil.ltrim( localUtil.ntoc( AV17Insert_ManCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINSERT_TRNCOD", GXutil.ltrim( localUtil.ntoc( AV18Insert_TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTEST", GXutil.ltrim( localUtil.ntoc( A2257SalExtEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTLIS", GXutil.ltrim( localUtil.ntoc( A2258SalExtLis, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV7UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTUSU", GXutil.rtrim( A7368SalExtUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMDESC", GXutil.rtrim( AV37Pgmdesc));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTSERA", GXutil.rtrim( A14349SalExtSerA));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTTIPA", GXutil.rtrim( A14350SalExtTipA));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXULN", GXutil.ltrim( localUtil.ntoc( A6247SalExUln, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTREC", GXutil.ltrim( localUtil.ntoc( A7369SalExtRec, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALFECENT", localUtil.dtoc( A8655SalFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "SALFMDD", GXutil.rtrim( A10079SalFmdD));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTPRE1", GXutil.ltrim( localUtil.ntoc( A13244SalExtPre1, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "TRNNOM", GXutil.rtrim( A841TrnNom));
      app.GxWebStd.gx_hidden_field( httpContext, "MANNOM", GXutil.rtrim( A2249ManNom));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCOD_Objectcall", GXutil.rtrim( Combo_mancod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCOD_Cls", GXutil.rtrim( Combo_mancod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCOD_Selectedvalue_set", GXutil.rtrim( Combo_mancod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCOD_Enabled", GXutil.booltostr( Combo_mancod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_MANCOD_Emptyitem", GXutil.booltostr( Combo_mancod_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Objectcall", GXutil.rtrim( Combo_trncod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Cls", GXutil.rtrim( Combo_trncod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Selectedvalue_set", GXutil.rtrim( Combo_trncod_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Enabled", GXutil.booltostr( Combo_trncod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TRNCOD_Emptyitemtext", GXutil.rtrim( Combo_trncod_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Objectcall", GXutil.rtrim( Dvpanel_unnamedtable4_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Enabled", GXutil.booltostr( Dvpanel_unnamedtable4_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
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
      return formatLink("app.trabajosexternos.trabajoexterno_header_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV8EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV13SalExtAlb,8,0))}, new String[] {"Gx_mode","EmprCod","SalExtAlb"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Header_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Trabajo Externo (Header)", "") ;
   }

   public void initializeNonKey1UR305( )
   {
      A2248ManCod = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2248ManCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2248ManCod), 4, 0));
      A840TrnCod = (short)(0) ;
      n840TrnCod = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A840TrnCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A840TrnCod), 4, 0));
      A14373SalFirma4d = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14373SalFirma4d", A14373SalFirma4d);
      A7371ManNom_o = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7371ManNom_o", A7371ManNom_o);
      A14397SalFecAnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
      A14402SalLineasE = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14402SalLineasE), 4, 0));
      A2249ManNom = "" ;
      n2249ManNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", A2249ManNom);
      A841TrnNom = "" ;
      n841TrnNom = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", A841TrnNom);
      A2254SalExtSec = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A2254SalExtSec", A2254SalExtSec);
      A6247SalExUln = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6247SalExUln", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6247SalExUln), 4, 0));
      A14398SalFecSal = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A14398SalFecSal", localUtil.format(A14398SalFecSal, "99/99/99"));
      A6396SalExtHor = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6396SalExtHor", A6396SalExtHor);
      A6397SalExtMat = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6397SalExtMat", A6397SalExtMat);
      A7369SalExtRec = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7369SalExtRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7369SalExtRec), 6, 0));
      A7370ManCod_o = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A7370ManCod_o", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7370ManCod_o), 4, 0));
      A8655SalFecEnt = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A8655SalFecEnt", localUtil.format(A8655SalFecEnt, "99/99/99"));
      A11299SalExtFen = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "A11299SalExtFen", localUtil.format(A11299SalExtFen, "99/99/99"));
      A10079SalFmdD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10079SalFmdD", A10079SalFmdD);
      A10078SalGrossT = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A10078SalGrossT", GXutil.ltrimstr( A10078SalGrossT, 13, 2));
      A10077SalFmd = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A10077SalFmd", A10077SalFmd);
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A10076SalFhh", localUtil.ttoc( A10076SalFhh, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      A3554SalExtObs = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A3554SalExtObs", A3554SalExtObs);
      A13244SalExtPre1 = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "A13244SalExtPre1", GXutil.ltrimstr( A13244SalExtPre1, 13, 5));
      A14348SalExtATCU = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14348SalExtATCU", A14348SalExtATCU);
      A14349SalExtSerA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14349SalExtSerA", A14349SalExtSerA);
      A14350SalExtTipA = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A14350SalExtTipA", A14350SalExtTipA);
      A2256SalExtFec = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      A2257SalExtEst = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      A2258SalExtLis = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
      A7368SalExtUsu = AV7UsurCod ;
      httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
      A10767SalExtAT = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
      A10742SalCodeID = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
      A10741SalEnvAT = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
      A10080SalSts = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
      Z2256SalExtFec = GXutil.nullDate() ;
      Z2257SalExtEst = (byte)(0) ;
      Z2258SalExtLis = (byte)(0) ;
      Z2254SalExtSec = "" ;
      Z6247SalExUln = (short)(0) ;
      Z14398SalFecSal = GXutil.nullDate() ;
      Z6396SalExtHor = "" ;
      Z6397SalExtMat = "" ;
      Z7368SalExtUsu = "" ;
      Z7369SalExtRec = 0 ;
      Z7370ManCod_o = (short)(0) ;
      Z8655SalFecEnt = GXutil.nullDate() ;
      Z11299SalExtFen = GXutil.nullDate() ;
      Z10767SalExtAT = "" ;
      Z10742SalCodeID = "" ;
      Z10741SalEnvAT = (byte)(0) ;
      Z10080SalSts = "" ;
      Z10079SalFmdD = "" ;
      Z10078SalGrossT = DecimalUtil.ZERO ;
      Z10077SalFmd = "" ;
      Z10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      Z13244SalExtPre1 = DecimalUtil.ZERO ;
      Z14348SalExtATCU = "" ;
      Z14349SalExtSerA = "" ;
      Z14350SalExtTipA = "" ;
      Z840TrnCod = (short)(0) ;
      Z2248ManCod = (short)(0) ;
   }

   public void initAll1UR305( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A2253SalExtAlb = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      initializeNonKey1UR305( ) ;
   }

   public void standaloneModalInsert( )
   {
      A2256SalExtFec = i2256SalExtFec ;
      httpContext.ajax_rsp_assign_attri("", false, "A2256SalExtFec", localUtil.format(A2256SalExtFec, "99/99/99"));
      A2257SalExtEst = i2257SalExtEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A2257SalExtEst", GXutil.str( A2257SalExtEst, 1, 0));
      A2258SalExtLis = i2258SalExtLis ;
      httpContext.ajax_rsp_assign_attri("", false, "A2258SalExtLis", GXutil.str( A2258SalExtLis, 1, 0));
      A7368SalExtUsu = i7368SalExtUsu ;
      httpContext.ajax_rsp_assign_attri("", false, "A7368SalExtUsu", A7368SalExtUsu);
      A10742SalCodeID = i10742SalCodeID ;
      httpContext.ajax_rsp_assign_attri("", false, "A10742SalCodeID", A10742SalCodeID);
      A10741SalEnvAT = i10741SalEnvAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
      A10767SalExtAT = i10767SalExtAT ;
      httpContext.ajax_rsp_assign_attri("", false, "A10767SalExtAT", A10767SalExtAT);
      A10080SalSts = i10080SalSts ;
      httpContext.ajax_rsp_assign_attri("", false, "A10080SalSts", A10080SalSts);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116104259", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_header_trn.js", "?202682116104260", false, true);
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
      edtSalExtAlb_Internalname = "SALEXTALB" ;
      edtSalExtFec_Internalname = "SALEXTFEC" ;
      edtSalFecAnt_Internalname = "SALFECANT" ;
      lblTextblockmancod_Internalname = "TEXTBLOCKMANCOD" ;
      Combo_mancod_Internalname = "COMBO_MANCOD" ;
      edtManCod_Internalname = "MANCOD" ;
      divTablesplittedmancod_Internalname = "TABLESPLITTEDMANCOD" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      lblTextblocktrncod_Internalname = "TEXTBLOCKTRNCOD" ;
      Combo_trncod_Internalname = "COMBO_TRNCOD" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      divTablesplittedtrncod_Internalname = "TABLESPLITTEDTRNCOD" ;
      edtSalExtMat_Internalname = "SALEXTMAT" ;
      edtSalFecSal_Internalname = "SALFECSAL" ;
      edtSalExtHor_Internalname = "SALEXTHOR" ;
      edtSalExtFen_Internalname = "SALEXTFEN" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtSalExtObs_Internalname = "SALEXTOBS" ;
      edtSalLineasE_Internalname = "SALLINEASE" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbSalEnvAT.setInternalname( "SALENVAT" );
      edtSalCodeID_Internalname = "SALCODEID" ;
      edtSalExtAT_Internalname = "SALEXTAT" ;
      edtSalFhh_Internalname = "SALFHH" ;
      edtSalExtATCU_Internalname = "SALEXTATCU" ;
      edtSalFirma4d_Internalname = "SALFIRMA4D" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavCombomancod_Internalname = "vCOMBOMANCOD" ;
      divSectionattribute_mancod_Internalname = "SECTIONATTRIBUTE_MANCOD" ;
      edtavCombotrncod_Internalname = "vCOMBOTRNCOD" ;
      divSectionattribute_trncod_Internalname = "SECTIONATTRIBUTE_TRNCOD" ;
      edtSalGrossT_Internalname = "SALGROSST" ;
      edtSalFmd_Internalname = "SALFMD" ;
      edtSalExtSec_Internalname = "SALEXTSEC" ;
      edtSalSts_Internalname = "SALSTS" ;
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
      Form.setCaption( httpContext.getMessage( "Trabajo Externo (Header)", "") );
      edtSalSts_Jsonclick = "" ;
      edtSalSts_Enabled = 0 ;
      edtSalSts_Visible = 1 ;
      edtSalExtSec_Jsonclick = "" ;
      edtSalExtSec_Enabled = 1 ;
      edtSalExtSec_Visible = 1 ;
      edtSalFmd_Enabled = 0 ;
      edtSalFmd_Visible = 1 ;
      edtSalGrossT_Jsonclick = "" ;
      edtSalGrossT_Enabled = 0 ;
      edtSalGrossT_Visible = 1 ;
      edtavCombotrncod_Jsonclick = "" ;
      edtavCombotrncod_Enabled = 0 ;
      edtavCombotrncod_Visible = 1 ;
      edtavCombomancod_Jsonclick = "" ;
      edtavCombomancod_Enabled = 0 ;
      edtavCombomancod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtSalFirma4d_Jsonclick = "" ;
      edtSalFirma4d_Enabled = 0 ;
      edtSalExtATCU_Jsonclick = "" ;
      edtSalExtATCU_Enabled = 0 ;
      edtSalFhh_Jsonclick = "" ;
      edtSalFhh_Enabled = 0 ;
      edtSalExtAT_Jsonclick = "" ;
      edtSalExtAT_Enabled = 0 ;
      edtSalCodeID_Jsonclick = "" ;
      edtSalCodeID_Enabled = 0 ;
      cmbSalEnvAT.setJsonclick( "" );
      cmbSalEnvAT.setEnabled( 0 );
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "AT", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      edtSalLineasE_Jsonclick = "" ;
      edtSalLineasE_Enabled = 0 ;
      edtSalExtObs_Enabled = 1 ;
      edtSalExtFen_Jsonclick = "" ;
      edtSalExtFen_Enabled = 1 ;
      edtSalExtHor_Jsonclick = "" ;
      edtSalExtHor_Enabled = 0 ;
      edtSalFecSal_Jsonclick = "" ;
      edtSalFecSal_Enabled = 0 ;
      edtSalExtMat_Jsonclick = "" ;
      edtSalExtMat_Enabled = 1 ;
      edtTrnCod_Jsonclick = "" ;
      edtTrnCod_Enabled = 1 ;
      edtTrnCod_Visible = 1 ;
      Combo_trncod_Emptyitemtext = "" ;
      Combo_trncod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_trncod_Enabled = GXutil.toBoolean( -1) ;
      edtManCod_Jsonclick = "" ;
      edtManCod_Enabled = 1 ;
      edtManCod_Visible = 1 ;
      Combo_mancod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_mancod_Cls = "ExtendedCombo AttributeFL" ;
      Combo_mancod_Enabled = GXutil.toBoolean( -1) ;
      edtSalFecAnt_Jsonclick = "" ;
      edtSalFecAnt_Enabled = 0 ;
      edtSalExtFec_Jsonclick = "" ;
      edtSalExtFec_Enabled = 1 ;
      edtSalExtAlb_Jsonclick = "" ;
      edtSalExtAlb_Enabled = 1 ;
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

   public void gx3asasallinease1UR305( String A396EmprCod ,
                                       int A2253SalExtAlb )
   {
      GXt_int10 = A14402SalLineasE ;
      GXv_int11[0] = GXt_int10 ;
      new app.trabajosexternos.haydatosexhdpz(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_int11) ;
      trabajoexterno_header_trn_impl.this.GXt_int10 = GXv_int11[0] ;
      A14402SalLineasE = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrimstr( DecimalUtil.doubleToDec(A14402SalLineasE), 4, 0));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A14402SalLineasE, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx4asasalfecant1UR305( String A396EmprCod ,
                                      int A2253SalExtAlb )
   {
      GXt_date12 = A14397SalFecAnt ;
      GXv_date13[0] = GXt_date12 ;
      new app.trabajosexternos.trabajoexterno_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_date13) ;
      trabajoexterno_header_trn_impl.this.GXt_date12 = GXv_date13[0] ;
      A14397SalFecAnt = GXt_date12 ;
      httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( localUtil.format(A14397SalFecAnt, "99/99/99"))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void gx5asamannom_o1UR305( String A396EmprCod ,
                                     short A7370ManCod_o )
   {
      GXt_char3 = A7371ManNom_o ;
      GXv_char6[0] = A396EmprCod ;
      GXv_int11[0] = A7370ManCod_o ;
      GXv_char5[0] = GXt_char3 ;
      new app.pmannom(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_char5) ;
      trabajoexterno_header_trn_impl.this.A396EmprCod = GXv_char6[0] ;
      trabajoexterno_header_trn_impl.this.A7370ManCod_o = GXv_int11[0] ;
      trabajoexterno_header_trn_impl.this.GXt_char3 = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A7370ManCod_o", GXutil.ltrimstr( DecimalUtil.doubleToDec(A7370ManCod_o), 4, 0));
      A7371ManNom_o = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "A7371ManNom_o", A7371ManNom_o);
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A7371ManNom_o))+"\"") ;
      addString( "]") ;
      if ( true )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
   }

   public void xc_40_1UR305( )
   {
      if ( (0==A2253SalExtAlb) && true /* After */ )
      {
         GXv_int14[0] = A2253SalExtAlb ;
         new app.pnumdoc(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_int14) ;
         A2253SalExtAlb = GXv_int14[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2253SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(A2253SalExtAlb), 8, 0));
      }
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

   public void xc_43_1UR305( )
   {
      GXv_char6[0] = A14348SalExtATCU ;
      GXv_char5[0] = A14349SalExtSerA ;
      GXv_char4[0] = A14350SalExtTipA ;
      new app.patcud(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "EXTHDR", ""), GXv_char6, GXv_char5, GXv_char4, GXutil.trim( Gx_mode)+"/"+GXutil.trim( AV36Pgmname)+"."+GXutil.trim( AV37Pgmdesc)) ;
      A14348SalExtATCU = GXv_char6[0] ;
      A14349SalExtSerA = GXv_char5[0] ;
      A14350SalExtTipA = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A14348SalExtATCU", A14348SalExtATCU);
      httpContext.ajax_rsp_assign_attri("", false, "A14349SalExtSerA", A14349SalExtSerA);
      httpContext.ajax_rsp_assign_attri("", false, "A14350SalExtTipA", A14350SalExtTipA);
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
      cmbSalEnvAT.setName( "SALENVAT" );
      cmbSalEnvAT.setWebtags( "" );
      cmbSalEnvAT.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbSalEnvAT.addItem("3", httpContext.getMessage( "Enviada AT", ""), (short)(0));
      if ( cmbSalEnvAT.getItemCount() > 0 )
      {
         if ( isIns( ) && (0==A10741SalEnvAT) )
         {
            A10741SalEnvAT = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "A10741SalEnvAT", GXutil.str( A10741SalEnvAT, 1, 0));
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

   public void valid_Salextalb( )
   {
      GXt_int10 = A14402SalLineasE ;
      GXv_int11[0] = GXt_int10 ;
      new app.trabajosexternos.haydatosexhdpz(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_int11) ;
      trabajoexterno_header_trn_impl.this.GXt_int10 = GXv_int11[0] ;
      A14402SalLineasE = GXt_int10 ;
      if ( ( GXutil.strcmp(Gx_mode, "INS") != 0 ) && ( A14402SalLineasE > 0 ) )
      {
         Combo_mancod_Enabled = false ;
      }
      GXt_date12 = A14397SalFecAnt ;
      GXv_date13[0] = GXt_date12 ;
      new app.trabajosexternos.trabajoexterno_fechadocumentoanterior(remoteHandle, context).execute( A396EmprCod, A2253SalExtAlb, GXv_date13) ;
      trabajoexterno_header_trn_impl.this.GXt_date12 = GXv_date13[0] ;
      A14397SalFecAnt = GXt_date12 ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A14402SalLineasE", GXutil.ltrim( localUtil.ntoc( A14402SalLineasE, (byte)(4), (byte)(0), ".", "")));
      ucCombo_mancod.sendProperty(context, "", false, Combo_mancod_Internalname, "Enabled", GXutil.booltostr( Combo_mancod_Enabled));
      httpContext.ajax_rsp_assign_attri("", false, "A14397SalFecAnt", localUtil.format(A14397SalFecAnt, "99/99/99"));
   }

   public void valid_Mancod( )
   {
      n2249ManNom = false ;
      /* Using cursor T01UR17 */
      pr_default.execute(15, new Object[] {A396EmprCod, Short.valueOf(A2248ManCod)});
      if ( (pr_default.getStatus(15) == 101) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Manufacturador Inexistente", ""), "ForeignKeyNotFound", 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
      }
      A2249ManNom = T01UR17_A2249ManNom[0] ;
      n2249ManNom = T01UR17_n2249ManNom[0] ;
      pr_default.close(15);
      if ( (0==A2248ManCod) && isIns( )  )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Codigo NO Valido", ""), 1, "MANCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtManCod_Internalname ;
      }
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A2249ManNom", GXutil.rtrim( A2249ManNom));
   }

   public void valid_Trncod( )
   {
      n840TrnCod = false ;
      n841TrnNom = false ;
      /* Using cursor T01UR16 */
      pr_default.execute(14, new Object[] {A396EmprCod, Boolean.valueOf(n840TrnCod), Short.valueOf(A840TrnCod)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A396EmprCod)==0) || (0==A840TrnCod) ) )
         {
            httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "TRANSP", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "TRNCOD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTrnCod_Internalname ;
         }
      }
      A841TrnNom = T01UR16_A841TrnNom[0] ;
      n841TrnNom = T01UR16_n841TrnNom[0] ;
      pr_default.close(14);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A841TrnNom", GXutil.rtrim( A841TrnNom));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV29Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV31ok',fld:'vOK',pic:'',hsh:true},{av:'AV33Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV15TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV13SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9',hsh:true},{av:'cmbSalEnvAT'},{av:'A10741SalEnvAT',fld:'SALENVAT',pic:'9'},{av:'AV36Pgmname',fld:'vPGMNAME',pic:''},{av:'A2257SalExtEst',fld:'SALEXTEST',pic:'9'},{av:'A2258SalExtLis',fld:'SALEXTLIS',pic:'9'},{av:'A6247SalExUln',fld:'SALEXULN',pic:'ZZZ9'},{av:'A14398SalFecSal',fld:'SALFECSAL',pic:''},{av:'A6396SalExtHor',fld:'SALEXTHOR',pic:''},{av:'A7368SalExtUsu',fld:'SALEXTUSU',pic:'@!'},{av:'A7369SalExtRec',fld:'SALEXTREC',pic:'ZZZZZ9'},{av:'A7370ManCod_o',fld:'MANCOD_O',pic:'ZZZ9'},{av:'A8655SalFecEnt',fld:'SALFECENT',pic:''},{av:'A10767SalExtAT',fld:'SALEXTAT',pic:''},{av:'A10742SalCodeID',fld:'SALCODEID',pic:''},{av:'A10080SalSts',fld:'SALSTS',pic:''},{av:'A10079SalFmdD',fld:'SALFMDD',pic:''},{av:'A10078SalGrossT',fld:'SALGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10077SalFmd',fld:'SALFMD',pic:''},{av:'A10076SalFhh',fld:'SALFHH',pic:'99/99/99 99:99'},{av:'A13244SalExtPre1',fld:'SALEXTPRE1',pic:'ZZZZZZ9.99999'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UR2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV8EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A10076SalFhh',fld:'SALFHH',pic:'99/99/99 99:99'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''},{av:'A10742SalCodeID',fld:'SALCODEID',pic:''},{av:'cmbSalEnvAT'},{av:'A10741SalEnvAT',fld:'SALENVAT',pic:'9'},{av:'AV29Hash',fld:'vHASH',pic:'',hsh:true},{av:'AV31ok',fld:'vOK',pic:'',hsh:true},{av:'AV33Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV15TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_SALEXTALB","{handler:'valid_Salextalb',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A14402SalLineasE',fld:'SALLINEASE',pic:'ZZZ9'},{av:'A14397SalFecAnt',fld:'SALFECANT',pic:''}]");
      setEventMetadata("VALID_SALEXTALB",",oparms:[{av:'A14402SalLineasE',fld:'SALLINEASE',pic:'ZZZ9'},{av:'Combo_mancod_Enabled',ctrl:'COMBO_MANCOD',prop:'Enabled'},{av:'A14397SalFecAnt',fld:'SALFECANT',pic:''}]}");
      setEventMetadata("VALID_SALEXTFEC","{handler:'valid_Salextfec',iparms:[]");
      setEventMetadata("VALID_SALEXTFEC",",oparms:[]}");
      setEventMetadata("VALID_MANCOD","{handler:'valid_Mancod',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A2248ManCod',fld:'MANCOD',pic:'ZZZ9'},{av:'A2249ManNom',fld:'MANNOM',pic:''}]");
      setEventMetadata("VALID_MANCOD",",oparms:[{av:'A2249ManNom',fld:'MANNOM',pic:''}]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''}]");
      setEventMetadata("VALID_TRNCOD",",oparms:[{av:'A841TrnNom',fld:'TRNNOM',pic:''}]}");
      setEventMetadata("VALID_SALLINEASE","{handler:'valid_Sallinease',iparms:[]");
      setEventMetadata("VALID_SALLINEASE",",oparms:[]}");
      setEventMetadata("VALID_SALEXTATCU","{handler:'valid_Salextatcu',iparms:[]");
      setEventMetadata("VALID_SALEXTATCU",",oparms:[]}");
      setEventMetadata("VALIDV_PGMNAME","{handler:'validv_Pgmname',iparms:[]");
      setEventMetadata("VALIDV_PGMNAME",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOMANCOD","{handler:'validv_Combomancod',iparms:[]");
      setEventMetadata("VALIDV_COMBOMANCOD",",oparms:[]}");
      setEventMetadata("VALIDV_COMBOTRNCOD","{handler:'validv_Combotrncod',iparms:[]");
      setEventMetadata("VALIDV_COMBOTRNCOD",",oparms:[]}");
      setEventMetadata("VALID_SALFMD","{handler:'valid_Salfmd',iparms:[]");
      setEventMetadata("VALID_SALFMD",",oparms:[]}");
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
      wcpOAV8EmprCod = "" ;
      Z396EmprCod = "" ;
      Z2256SalExtFec = GXutil.nullDate() ;
      Z2254SalExtSec = "" ;
      Z14398SalFecSal = GXutil.nullDate() ;
      Z6396SalExtHor = "" ;
      Z6397SalExtMat = "" ;
      Z7368SalExtUsu = "" ;
      Z8655SalFecEnt = GXutil.nullDate() ;
      Z11299SalExtFen = GXutil.nullDate() ;
      Z10767SalExtAT = "" ;
      Z10742SalCodeID = "" ;
      Z10080SalSts = "" ;
      Z10079SalFmdD = "" ;
      Z10078SalGrossT = DecimalUtil.ZERO ;
      Z10077SalFmd = "" ;
      Z10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      Z13244SalExtPre1 = DecimalUtil.ZERO ;
      Z14348SalExtATCU = "" ;
      Z14349SalExtSerA = "" ;
      Z14350SalExtTipA = "" ;
      Combo_trncod_Selectedvalue_get = "" ;
      Combo_mancod_Selectedvalue_get = "" ;
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
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A14397SalFecAnt = GXutil.nullDate() ;
      lblTextblockmancod_Jsonclick = "" ;
      ucCombo_mancod = new com.genexus.webpanels.GXUserControl();
      Combo_mancod_Caption = "" ;
      AV23ManCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      lblTextblocktrncod_Jsonclick = "" ;
      ucCombo_trncod = new com.genexus.webpanels.GXUserControl();
      Combo_trncod_Caption = "" ;
      AV20TrnCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A6397SalExtMat = "" ;
      A14398SalFecSal = GXutil.nullDate() ;
      A6396SalExtHor = "" ;
      A11299SalExtFen = GXutil.nullDate() ;
      A3554SalExtObs = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      A10742SalCodeID = "" ;
      A10767SalExtAT = "" ;
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      A14348SalExtATCU = "" ;
      A14373SalFirma4d = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV36Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A10078SalGrossT = DecimalUtil.ZERO ;
      A10077SalFmd = "" ;
      A2254SalExtSec = "" ;
      A10080SalSts = "" ;
      A7368SalExtUsu = "" ;
      A8655SalFecEnt = GXutil.nullDate() ;
      A10079SalFmdD = "" ;
      A13244SalExtPre1 = DecimalUtil.ZERO ;
      A14349SalExtSerA = "" ;
      A14350SalExtTipA = "" ;
      A7371ManNom_o = "" ;
      AV7UsurCod = "" ;
      AV37Pgmdesc = "" ;
      A407EmprNom = "" ;
      A841TrnNom = "" ;
      A2249ManNom = "" ;
      Combo_mancod_Objectcall = "" ;
      Combo_mancod_Class = "" ;
      Combo_mancod_Icontype = "" ;
      Combo_mancod_Icon = "" ;
      Combo_mancod_Tooltip = "" ;
      Combo_mancod_Selectedvalue_set = "" ;
      Combo_mancod_Selectedtext_set = "" ;
      Combo_mancod_Selectedtext_get = "" ;
      Combo_mancod_Gamoauthtoken = "" ;
      Combo_mancod_Ddointernalname = "" ;
      Combo_mancod_Titlecontrolalign = "" ;
      Combo_mancod_Dropdownoptionstype = "" ;
      Combo_mancod_Titlecontrolidtoreplace = "" ;
      Combo_mancod_Datalisttype = "" ;
      Combo_mancod_Datalistfixedvalues = "" ;
      Combo_mancod_Datalistproc = "" ;
      Combo_mancod_Datalistprocparametersprefix = "" ;
      Combo_mancod_Remoteservicesparameters = "" ;
      Combo_mancod_Htmltemplate = "" ;
      Combo_mancod_Multiplevaluestype = "" ;
      Combo_mancod_Loadingdata = "" ;
      Combo_mancod_Noresultsfound = "" ;
      Combo_mancod_Emptyitemtext = "" ;
      Combo_mancod_Onlyselectedvalues = "" ;
      Combo_mancod_Selectalltext = "" ;
      Combo_mancod_Multiplevaluesseparator = "" ;
      Combo_mancod_Addnewoptiontext = "" ;
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
      Combo_trncod_Onlyselectedvalues = "" ;
      Combo_trncod_Selectalltext = "" ;
      Combo_trncod_Multiplevaluesseparator = "" ;
      Combo_trncod_Addnewoptiontext = "" ;
      Dvpanel_unnamedtable4_Objectcall = "" ;
      Dvpanel_unnamedtable4_Class = "" ;
      Dvpanel_unnamedtable4_Height = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode305 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXv_int2 = new byte[1] ;
      AV25Station = "" ;
      AV26EmprNom = "" ;
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV15TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16WebSession = httpContext.getWebSession();
      AV19TrnContextAtt = new app.wwpbaseobjects.SdtWWPTransactionContext_Attribute(remoteHandle, context);
      AV29Hash = "" ;
      AV33Messages_json = "" ;
      AV21ComboSelectedValue = "" ;
      GXt_objcol_SdtDVB_SDTComboData_Item8 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTComboData_Item9 = new GXBaseCollection[1] ;
      Z3554SalExtObs = "" ;
      Z407EmprNom = "" ;
      Z2249ManNom = "" ;
      Z841TrnNom = "" ;
      T01UR4_A407EmprNom = new String[] {""} ;
      T01UR4_n407EmprNom = new boolean[] {false} ;
      T01UR6_A2249ManNom = new String[] {""} ;
      T01UR6_n2249ManNom = new boolean[] {false} ;
      T01UR5_A841TrnNom = new String[] {""} ;
      T01UR5_n841TrnNom = new boolean[] {false} ;
      T01UR7_A3554SalExtObs = new String[] {""} ;
      T01UR7_A2253SalExtAlb = new int[1] ;
      T01UR7_A407EmprNom = new String[] {""} ;
      T01UR7_n407EmprNom = new boolean[] {false} ;
      T01UR7_A2249ManNom = new String[] {""} ;
      T01UR7_n2249ManNom = new boolean[] {false} ;
      T01UR7_A841TrnNom = new String[] {""} ;
      T01UR7_n841TrnNom = new boolean[] {false} ;
      T01UR7_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR7_A2257SalExtEst = new byte[1] ;
      T01UR7_A2258SalExtLis = new byte[1] ;
      T01UR7_A2254SalExtSec = new String[] {""} ;
      T01UR7_A6247SalExUln = new short[1] ;
      T01UR7_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR7_A6396SalExtHor = new String[] {""} ;
      T01UR7_A6397SalExtMat = new String[] {""} ;
      T01UR7_A7368SalExtUsu = new String[] {""} ;
      T01UR7_A7369SalExtRec = new int[1] ;
      T01UR7_A7370ManCod_o = new short[1] ;
      T01UR7_A8655SalFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR7_A11299SalExtFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR7_A10767SalExtAT = new String[] {""} ;
      T01UR7_A10742SalCodeID = new String[] {""} ;
      T01UR7_A10741SalEnvAT = new byte[1] ;
      T01UR7_A10080SalSts = new String[] {""} ;
      T01UR7_A10079SalFmdD = new String[] {""} ;
      T01UR7_A10078SalGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UR7_A10077SalFmd = new String[] {""} ;
      T01UR7_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR7_A13244SalExtPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UR7_A14348SalExtATCU = new String[] {""} ;
      T01UR7_A14349SalExtSerA = new String[] {""} ;
      T01UR7_A14350SalExtTipA = new String[] {""} ;
      T01UR7_A396EmprCod = new String[] {""} ;
      T01UR7_A840TrnCod = new short[1] ;
      T01UR7_n840TrnCod = new boolean[] {false} ;
      T01UR7_A2248ManCod = new short[1] ;
      T01UR8_A841TrnNom = new String[] {""} ;
      T01UR8_n841TrnNom = new boolean[] {false} ;
      T01UR9_A2249ManNom = new String[] {""} ;
      T01UR9_n2249ManNom = new boolean[] {false} ;
      T01UR10_A396EmprCod = new String[] {""} ;
      T01UR10_A2253SalExtAlb = new int[1] ;
      T01UR3_A3554SalExtObs = new String[] {""} ;
      T01UR3_A2253SalExtAlb = new int[1] ;
      T01UR3_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR3_A2257SalExtEst = new byte[1] ;
      T01UR3_A2258SalExtLis = new byte[1] ;
      T01UR3_A2254SalExtSec = new String[] {""} ;
      T01UR3_A6247SalExUln = new short[1] ;
      T01UR3_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR3_A6396SalExtHor = new String[] {""} ;
      T01UR3_A6397SalExtMat = new String[] {""} ;
      T01UR3_A7368SalExtUsu = new String[] {""} ;
      T01UR3_A7369SalExtRec = new int[1] ;
      T01UR3_A7370ManCod_o = new short[1] ;
      T01UR3_A8655SalFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR3_A11299SalExtFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR3_A10767SalExtAT = new String[] {""} ;
      T01UR3_A10742SalCodeID = new String[] {""} ;
      T01UR3_A10741SalEnvAT = new byte[1] ;
      T01UR3_A10080SalSts = new String[] {""} ;
      T01UR3_A10079SalFmdD = new String[] {""} ;
      T01UR3_A10078SalGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UR3_A10077SalFmd = new String[] {""} ;
      T01UR3_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR3_A13244SalExtPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UR3_A14348SalExtATCU = new String[] {""} ;
      T01UR3_A14349SalExtSerA = new String[] {""} ;
      T01UR3_A14350SalExtTipA = new String[] {""} ;
      T01UR3_A396EmprCod = new String[] {""} ;
      T01UR3_A840TrnCod = new short[1] ;
      T01UR3_n840TrnCod = new boolean[] {false} ;
      T01UR3_A2248ManCod = new short[1] ;
      T01UR11_A396EmprCod = new String[] {""} ;
      T01UR11_A2253SalExtAlb = new int[1] ;
      T01UR12_A396EmprCod = new String[] {""} ;
      T01UR12_A2253SalExtAlb = new int[1] ;
      T01UR2_A3554SalExtObs = new String[] {""} ;
      T01UR2_A2253SalExtAlb = new int[1] ;
      T01UR2_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR2_A2257SalExtEst = new byte[1] ;
      T01UR2_A2258SalExtLis = new byte[1] ;
      T01UR2_A2254SalExtSec = new String[] {""} ;
      T01UR2_A6247SalExUln = new short[1] ;
      T01UR2_A14398SalFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR2_A6396SalExtHor = new String[] {""} ;
      T01UR2_A6397SalExtMat = new String[] {""} ;
      T01UR2_A7368SalExtUsu = new String[] {""} ;
      T01UR2_A7369SalExtRec = new int[1] ;
      T01UR2_A7370ManCod_o = new short[1] ;
      T01UR2_A8655SalFecEnt = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR2_A11299SalExtFen = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR2_A10767SalExtAT = new String[] {""} ;
      T01UR2_A10742SalCodeID = new String[] {""} ;
      T01UR2_A10741SalEnvAT = new byte[1] ;
      T01UR2_A10080SalSts = new String[] {""} ;
      T01UR2_A10079SalFmdD = new String[] {""} ;
      T01UR2_A10078SalGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UR2_A10077SalFmd = new String[] {""} ;
      T01UR2_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      T01UR2_A13244SalExtPre1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T01UR2_A14348SalExtATCU = new String[] {""} ;
      T01UR2_A14349SalExtSerA = new String[] {""} ;
      T01UR2_A14350SalExtTipA = new String[] {""} ;
      T01UR2_A396EmprCod = new String[] {""} ;
      T01UR2_A840TrnCod = new short[1] ;
      T01UR2_n840TrnCod = new boolean[] {false} ;
      T01UR2_A2248ManCod = new short[1] ;
      T01UR16_A841TrnNom = new String[] {""} ;
      T01UR16_n841TrnNom = new boolean[] {false} ;
      T01UR17_A2249ManNom = new String[] {""} ;
      T01UR17_n2249ManNom = new boolean[] {false} ;
      T01UR18_A396EmprCod = new String[] {""} ;
      T01UR18_A2253SalExtAlb = new int[1] ;
      T01UR18_A129BarCod = new int[1] ;
      T01UR18_A132BarCodReo = new byte[1] ;
      T01UR18_A130BarCodPar = new String[] {""} ;
      T01UR19_A396EmprCod = new String[] {""} ;
      T01UR19_A2253SalExtAlb = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i2256SalExtFec = GXutil.nullDate() ;
      i7368SalExtUsu = "" ;
      i10742SalCodeID = "" ;
      i10767SalExtAT = "" ;
      i10080SalSts = "" ;
      GXt_char3 = "" ;
      GXv_int14 = new int[1] ;
      GXv_char6 = new String[1] ;
      GXv_char5 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXt_date12 = GXutil.nullDate() ;
      GXv_date13 = new java.util.Date[1] ;
      Z14397SalFecAnt = GXutil.nullDate() ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.trabajosexternos.trabajoexterno_header_trn__default(),
         new Object[] {
             new Object[] {
            T01UR2_A3554SalExtObs, T01UR2_A2253SalExtAlb, T01UR2_A2256SalExtFec, T01UR2_A2257SalExtEst, T01UR2_A2258SalExtLis, T01UR2_A2254SalExtSec, T01UR2_A6247SalExUln, T01UR2_A14398SalFecSal, T01UR2_A6396SalExtHor, T01UR2_A6397SalExtMat,
            T01UR2_A7368SalExtUsu, T01UR2_A7369SalExtRec, T01UR2_A7370ManCod_o, T01UR2_A8655SalFecEnt, T01UR2_A11299SalExtFen, T01UR2_A10767SalExtAT, T01UR2_A10742SalCodeID, T01UR2_A10741SalEnvAT, T01UR2_A10080SalSts, T01UR2_A10079SalFmdD,
            T01UR2_A10078SalGrossT, T01UR2_A10077SalFmd, T01UR2_A10076SalFhh, T01UR2_A13244SalExtPre1, T01UR2_A14348SalExtATCU, T01UR2_A14349SalExtSerA, T01UR2_A14350SalExtTipA, T01UR2_A396EmprCod, T01UR2_A840TrnCod, T01UR2_n840TrnCod,
            T01UR2_A2248ManCod
            }
            , new Object[] {
            T01UR3_A3554SalExtObs, T01UR3_A2253SalExtAlb, T01UR3_A2256SalExtFec, T01UR3_A2257SalExtEst, T01UR3_A2258SalExtLis, T01UR3_A2254SalExtSec, T01UR3_A6247SalExUln, T01UR3_A14398SalFecSal, T01UR3_A6396SalExtHor, T01UR3_A6397SalExtMat,
            T01UR3_A7368SalExtUsu, T01UR3_A7369SalExtRec, T01UR3_A7370ManCod_o, T01UR3_A8655SalFecEnt, T01UR3_A11299SalExtFen, T01UR3_A10767SalExtAT, T01UR3_A10742SalCodeID, T01UR3_A10741SalEnvAT, T01UR3_A10080SalSts, T01UR3_A10079SalFmdD,
            T01UR3_A10078SalGrossT, T01UR3_A10077SalFmd, T01UR3_A10076SalFhh, T01UR3_A13244SalExtPre1, T01UR3_A14348SalExtATCU, T01UR3_A14349SalExtSerA, T01UR3_A14350SalExtTipA, T01UR3_A396EmprCod, T01UR3_A840TrnCod, T01UR3_n840TrnCod,
            T01UR3_A2248ManCod
            }
            , new Object[] {
            T01UR4_A407EmprNom, T01UR4_n407EmprNom
            }
            , new Object[] {
            T01UR5_A841TrnNom, T01UR5_n841TrnNom
            }
            , new Object[] {
            T01UR6_A2249ManNom, T01UR6_n2249ManNom
            }
            , new Object[] {
            T01UR7_A3554SalExtObs, T01UR7_A2253SalExtAlb, T01UR7_A407EmprNom, T01UR7_n407EmprNom, T01UR7_A2249ManNom, T01UR7_n2249ManNom, T01UR7_A841TrnNom, T01UR7_n841TrnNom, T01UR7_A2256SalExtFec, T01UR7_A2257SalExtEst,
            T01UR7_A2258SalExtLis, T01UR7_A2254SalExtSec, T01UR7_A6247SalExUln, T01UR7_A14398SalFecSal, T01UR7_A6396SalExtHor, T01UR7_A6397SalExtMat, T01UR7_A7368SalExtUsu, T01UR7_A7369SalExtRec, T01UR7_A7370ManCod_o, T01UR7_A8655SalFecEnt,
            T01UR7_A11299SalExtFen, T01UR7_A10767SalExtAT, T01UR7_A10742SalCodeID, T01UR7_A10741SalEnvAT, T01UR7_A10080SalSts, T01UR7_A10079SalFmdD, T01UR7_A10078SalGrossT, T01UR7_A10077SalFmd, T01UR7_A10076SalFhh, T01UR7_A13244SalExtPre1,
            T01UR7_A14348SalExtATCU, T01UR7_A14349SalExtSerA, T01UR7_A14350SalExtTipA, T01UR7_A396EmprCod, T01UR7_A840TrnCod, T01UR7_n840TrnCod, T01UR7_A2248ManCod
            }
            , new Object[] {
            T01UR8_A841TrnNom, T01UR8_n841TrnNom
            }
            , new Object[] {
            T01UR9_A2249ManNom, T01UR9_n2249ManNom
            }
            , new Object[] {
            T01UR10_A396EmprCod, T01UR10_A2253SalExtAlb
            }
            , new Object[] {
            T01UR11_A396EmprCod, T01UR11_A2253SalExtAlb
            }
            , new Object[] {
            T01UR12_A396EmprCod, T01UR12_A2253SalExtAlb
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UR16_A841TrnNom, T01UR16_n841TrnNom
            }
            , new Object[] {
            T01UR17_A2249ManNom, T01UR17_n2249ManNom
            }
            , new Object[] {
            T01UR18_A396EmprCod, T01UR18_A2253SalExtAlb, T01UR18_A129BarCod, T01UR18_A132BarCodReo, T01UR18_A130BarCodPar
            }
            , new Object[] {
            T01UR19_A396EmprCod, T01UR19_A2253SalExtAlb
            }
         }
      );
      AV37Pgmdesc = httpContext.getMessage( "Trabajo Externo (Header)", "") ;
      AV36Pgmname = "TrabajosExternos.TrabajoExterno_Header_TRN" ;
      Z10080SalSts = " " ;
      A10080SalSts = " " ;
      i10080SalSts = " " ;
      Z10767SalExtAT = " " ;
      A10767SalExtAT = " " ;
      i10767SalExtAT = " " ;
      Z10741SalEnvAT = (byte)(0) ;
      A10741SalEnvAT = (byte)(0) ;
      i10741SalEnvAT = (byte)(0) ;
      Z10742SalCodeID = " " ;
      A10742SalCodeID = " " ;
      i10742SalCodeID = " " ;
      Z7368SalExtUsu = "" ;
      A7368SalExtUsu = "" ;
      i7368SalExtUsu = "" ;
      Z2258SalExtLis = (byte)(0) ;
      A2258SalExtLis = (byte)(0) ;
      i2258SalExtLis = (byte)(0) ;
      Z2257SalExtEst = (byte)(0) ;
      A2257SalExtEst = (byte)(0) ;
      i2257SalExtEst = (byte)(0) ;
      Z2256SalExtFec = GXutil.today( ) ;
      A2256SalExtFec = GXutil.today( ) ;
      i2256SalExtFec = GXutil.today( ) ;
   }

   private byte Z2257SalExtEst ;
   private byte Z2258SalExtLis ;
   private byte Z10741SalEnvAT ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A10741SalEnvAT ;
   private byte A2257SalExtEst ;
   private byte A2258SalExtLis ;
   private byte Gx_BScreen ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private byte gxajaxcallmode ;
   private byte i2257SalExtEst ;
   private byte i2258SalExtLis ;
   private byte i10741SalEnvAT ;
   private short Z6247SalExUln ;
   private short Z7370ManCod_o ;
   private short Z840TrnCod ;
   private short Z2248ManCod ;
   private short N2248ManCod ;
   private short N840TrnCod ;
   private short A7370ManCod_o ;
   private short A840TrnCod ;
   private short A2248ManCod ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A14402SalLineasE ;
   private short AV24ComboManCod ;
   private short AV22ComboTrnCod ;
   private short A6247SalExUln ;
   private short AV17Insert_ManCod ;
   private short AV18Insert_TrnCod ;
   private short RcdFound305 ;
   private short AV9FirmaD ;
   private short AV10Moda21 ;
   private short nIsDirty_305 ;
   private short GXt_int10 ;
   private short GXv_int11[] ;
   private short Z14402SalLineasE ;
   private int wcpOAV13SalExtAlb ;
   private int Z2253SalExtAlb ;
   private int Z7369SalExtRec ;
   private int A2253SalExtAlb ;
   private int AV13SalExtAlb ;
   private int trnEnded ;
   private int edtSalExtAlb_Enabled ;
   private int edtSalExtFec_Enabled ;
   private int edtSalFecAnt_Enabled ;
   private int edtManCod_Visible ;
   private int edtManCod_Enabled ;
   private int edtTrnCod_Visible ;
   private int edtTrnCod_Enabled ;
   private int edtSalExtMat_Enabled ;
   private int edtSalFecSal_Enabled ;
   private int edtSalExtHor_Enabled ;
   private int edtSalExtFen_Enabled ;
   private int edtSalExtObs_Enabled ;
   private int edtSalLineasE_Enabled ;
   private int edtSalCodeID_Enabled ;
   private int edtSalExtAT_Enabled ;
   private int edtSalFhh_Enabled ;
   private int edtSalExtATCU_Enabled ;
   private int edtSalFirma4d_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavCombomancod_Enabled ;
   private int edtavCombomancod_Visible ;
   private int edtavCombotrncod_Enabled ;
   private int edtavCombotrncod_Visible ;
   private int edtSalGrossT_Enabled ;
   private int edtSalGrossT_Visible ;
   private int edtSalFmd_Visible ;
   private int edtSalFmd_Enabled ;
   private int edtSalExtSec_Visible ;
   private int edtSalExtSec_Enabled ;
   private int edtSalSts_Visible ;
   private int edtSalSts_Enabled ;
   private int A7369SalExtRec ;
   private int Combo_mancod_Datalistupdateminimumcharacters ;
   private int Combo_trncod_Datalistupdateminimumcharacters ;
   private int Datamonjs_Gxcontroltype ;
   private int AV38GXV1 ;
   private int GX_JID ;
   private int idxLst ;
   private int GXv_int14[] ;
   private java.math.BigDecimal Z10078SalGrossT ;
   private java.math.BigDecimal Z13244SalExtPre1 ;
   private java.math.BigDecimal A10078SalGrossT ;
   private java.math.BigDecimal A13244SalExtPre1 ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV8EmprCod ;
   private String Z396EmprCod ;
   private String Z2254SalExtSec ;
   private String Z6396SalExtHor ;
   private String Z6397SalExtMat ;
   private String Z7368SalExtUsu ;
   private String Z10767SalExtAT ;
   private String Z10742SalCodeID ;
   private String Z10080SalSts ;
   private String Z10079SalFmdD ;
   private String Z10077SalFmd ;
   private String Z14348SalExtATCU ;
   private String Z14349SalExtSerA ;
   private String Z14350SalExtTipA ;
   private String Combo_trncod_Selectedvalue_get ;
   private String Combo_mancod_Selectedvalue_get ;
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
   private String edtSalExtAlb_Internalname ;
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
   private String edtSalExtAlb_Jsonclick ;
   private String edtSalExtFec_Internalname ;
   private String edtSalExtFec_Jsonclick ;
   private String edtSalFecAnt_Internalname ;
   private String edtSalFecAnt_Jsonclick ;
   private String divTablesplittedmancod_Internalname ;
   private String lblTextblockmancod_Internalname ;
   private String lblTextblockmancod_Jsonclick ;
   private String Combo_mancod_Caption ;
   private String Combo_mancod_Cls ;
   private String Combo_mancod_Internalname ;
   private String edtManCod_Internalname ;
   private String edtManCod_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedtrncod_Internalname ;
   private String lblTextblocktrncod_Internalname ;
   private String lblTextblocktrncod_Jsonclick ;
   private String Combo_trncod_Caption ;
   private String Combo_trncod_Cls ;
   private String Combo_trncod_Emptyitemtext ;
   private String Combo_trncod_Internalname ;
   private String edtTrnCod_Internalname ;
   private String edtTrnCod_Jsonclick ;
   private String edtSalExtMat_Internalname ;
   private String A6397SalExtMat ;
   private String edtSalExtMat_Jsonclick ;
   private String edtSalFecSal_Internalname ;
   private String edtSalFecSal_Jsonclick ;
   private String edtSalExtHor_Internalname ;
   private String A6396SalExtHor ;
   private String edtSalExtHor_Jsonclick ;
   private String edtSalExtFen_Internalname ;
   private String edtSalExtFen_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtSalExtObs_Internalname ;
   private String edtSalLineasE_Internalname ;
   private String edtSalLineasE_Jsonclick ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtSalCodeID_Internalname ;
   private String A10742SalCodeID ;
   private String edtSalCodeID_Jsonclick ;
   private String edtSalExtAT_Internalname ;
   private String A10767SalExtAT ;
   private String edtSalExtAT_Jsonclick ;
   private String edtSalFhh_Internalname ;
   private String edtSalFhh_Jsonclick ;
   private String edtSalExtATCU_Internalname ;
   private String A14348SalExtATCU ;
   private String edtSalExtATCU_Jsonclick ;
   private String edtSalFirma4d_Internalname ;
   private String A14373SalFirma4d ;
   private String edtSalFirma4d_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV36Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String divSectionattribute_mancod_Internalname ;
   private String edtavCombomancod_Internalname ;
   private String edtavCombomancod_Jsonclick ;
   private String divSectionattribute_trncod_Internalname ;
   private String edtavCombotrncod_Internalname ;
   private String edtavCombotrncod_Jsonclick ;
   private String edtSalGrossT_Internalname ;
   private String edtSalGrossT_Jsonclick ;
   private String edtSalFmd_Internalname ;
   private String A10077SalFmd ;
   private String edtSalExtSec_Internalname ;
   private String A2254SalExtSec ;
   private String edtSalExtSec_Jsonclick ;
   private String edtSalSts_Internalname ;
   private String A10080SalSts ;
   private String edtSalSts_Jsonclick ;
   private String A7368SalExtUsu ;
   private String A10079SalFmdD ;
   private String A14349SalExtSerA ;
   private String A14350SalExtTipA ;
   private String A7371ManNom_o ;
   private String AV7UsurCod ;
   private String AV37Pgmdesc ;
   private String A407EmprNom ;
   private String A841TrnNom ;
   private String A2249ManNom ;
   private String Combo_mancod_Objectcall ;
   private String Combo_mancod_Class ;
   private String Combo_mancod_Icontype ;
   private String Combo_mancod_Icon ;
   private String Combo_mancod_Tooltip ;
   private String Combo_mancod_Selectedvalue_set ;
   private String Combo_mancod_Selectedtext_set ;
   private String Combo_mancod_Selectedtext_get ;
   private String Combo_mancod_Gamoauthtoken ;
   private String Combo_mancod_Ddointernalname ;
   private String Combo_mancod_Titlecontrolalign ;
   private String Combo_mancod_Dropdownoptionstype ;
   private String Combo_mancod_Titlecontrolidtoreplace ;
   private String Combo_mancod_Datalisttype ;
   private String Combo_mancod_Datalistfixedvalues ;
   private String Combo_mancod_Datalistproc ;
   private String Combo_mancod_Datalistprocparametersprefix ;
   private String Combo_mancod_Remoteservicesparameters ;
   private String Combo_mancod_Htmltemplate ;
   private String Combo_mancod_Multiplevaluestype ;
   private String Combo_mancod_Loadingdata ;
   private String Combo_mancod_Noresultsfound ;
   private String Combo_mancod_Emptyitemtext ;
   private String Combo_mancod_Onlyselectedvalues ;
   private String Combo_mancod_Selectalltext ;
   private String Combo_mancod_Multiplevaluesseparator ;
   private String Combo_mancod_Addnewoptiontext ;
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
   private String Combo_trncod_Onlyselectedvalues ;
   private String Combo_trncod_Selectalltext ;
   private String Combo_trncod_Multiplevaluesseparator ;
   private String Combo_trncod_Addnewoptiontext ;
   private String Dvpanel_unnamedtable4_Objectcall ;
   private String Dvpanel_unnamedtable4_Class ;
   private String Dvpanel_unnamedtable4_Height ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode305 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV25Station ;
   private String AV26EmprNom ;
   private String Z407EmprNom ;
   private String Z2249ManNom ;
   private String Z841TrnNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i7368SalExtUsu ;
   private String i10742SalCodeID ;
   private String i10767SalExtAT ;
   private String i10080SalSts ;
   private String GXt_char3 ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private java.util.Date Z10076SalFhh ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date Z2256SalExtFec ;
   private java.util.Date Z14398SalFecSal ;
   private java.util.Date Z8655SalFecEnt ;
   private java.util.Date Z11299SalExtFen ;
   private java.util.Date A2256SalExtFec ;
   private java.util.Date A14397SalFecAnt ;
   private java.util.Date A14398SalFecSal ;
   private java.util.Date A11299SalExtFen ;
   private java.util.Date A8655SalFecEnt ;
   private java.util.Date i2256SalExtFec ;
   private java.util.Date GXt_date12 ;
   private java.util.Date GXv_date13[] ;
   private java.util.Date Z14397SalFecAnt ;
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
   private boolean Combo_mancod_Emptyitem ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean n407EmprNom ;
   private boolean n841TrnNom ;
   private boolean n2249ManNom ;
   private boolean Combo_mancod_Enabled ;
   private boolean Combo_mancod_Visible ;
   private boolean Combo_mancod_Allowmultipleselection ;
   private boolean Combo_mancod_Isgriditem ;
   private boolean Combo_mancod_Hasdescription ;
   private boolean Combo_mancod_Includeonlyselectedoption ;
   private boolean Combo_mancod_Includeselectalloption ;
   private boolean Combo_mancod_Includeaddnewoption ;
   private boolean Combo_trncod_Enabled ;
   private boolean Combo_trncod_Visible ;
   private boolean Combo_trncod_Allowmultipleselection ;
   private boolean Combo_trncod_Isgriditem ;
   private boolean Combo_trncod_Hasdescription ;
   private boolean Combo_trncod_Includeonlyselectedoption ;
   private boolean Combo_trncod_Includeselectalloption ;
   private boolean Combo_trncod_Emptyitem ;
   private boolean Combo_trncod_Includeaddnewoption ;
   private boolean Dvpanel_unnamedtable4_Enabled ;
   private boolean Dvpanel_unnamedtable4_Showheader ;
   private boolean Dvpanel_unnamedtable4_Visible ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean AV31ok ;
   private boolean Gx_longc ;
   private String A3554SalExtObs ;
   private String AV33Messages_json ;
   private String Z3554SalExtObs ;
   private String AV29Hash ;
   private String AV21ComboSelectedValue ;
   private com.genexus.webpanels.WebSession AV16WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucCombo_mancod ;
   private com.genexus.webpanels.GXUserControl ucCombo_trncod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbSalEnvAT ;
   private IDataStoreProvider pr_default ;
   private String[] T01UR4_A407EmprNom ;
   private boolean[] T01UR4_n407EmprNom ;
   private String[] T01UR6_A2249ManNom ;
   private boolean[] T01UR6_n2249ManNom ;
   private String[] T01UR5_A841TrnNom ;
   private boolean[] T01UR5_n841TrnNom ;
   private String[] T01UR7_A3554SalExtObs ;
   private int[] T01UR7_A2253SalExtAlb ;
   private String[] T01UR7_A407EmprNom ;
   private boolean[] T01UR7_n407EmprNom ;
   private String[] T01UR7_A2249ManNom ;
   private boolean[] T01UR7_n2249ManNom ;
   private String[] T01UR7_A841TrnNom ;
   private boolean[] T01UR7_n841TrnNom ;
   private java.util.Date[] T01UR7_A2256SalExtFec ;
   private byte[] T01UR7_A2257SalExtEst ;
   private byte[] T01UR7_A2258SalExtLis ;
   private String[] T01UR7_A2254SalExtSec ;
   private short[] T01UR7_A6247SalExUln ;
   private java.util.Date[] T01UR7_A14398SalFecSal ;
   private String[] T01UR7_A6396SalExtHor ;
   private String[] T01UR7_A6397SalExtMat ;
   private String[] T01UR7_A7368SalExtUsu ;
   private int[] T01UR7_A7369SalExtRec ;
   private short[] T01UR7_A7370ManCod_o ;
   private java.util.Date[] T01UR7_A8655SalFecEnt ;
   private java.util.Date[] T01UR7_A11299SalExtFen ;
   private String[] T01UR7_A10767SalExtAT ;
   private String[] T01UR7_A10742SalCodeID ;
   private byte[] T01UR7_A10741SalEnvAT ;
   private String[] T01UR7_A10080SalSts ;
   private String[] T01UR7_A10079SalFmdD ;
   private java.math.BigDecimal[] T01UR7_A10078SalGrossT ;
   private String[] T01UR7_A10077SalFmd ;
   private java.util.Date[] T01UR7_A10076SalFhh ;
   private java.math.BigDecimal[] T01UR7_A13244SalExtPre1 ;
   private String[] T01UR7_A14348SalExtATCU ;
   private String[] T01UR7_A14349SalExtSerA ;
   private String[] T01UR7_A14350SalExtTipA ;
   private String[] T01UR7_A396EmprCod ;
   private short[] T01UR7_A840TrnCod ;
   private boolean[] T01UR7_n840TrnCod ;
   private short[] T01UR7_A2248ManCod ;
   private String[] T01UR8_A841TrnNom ;
   private boolean[] T01UR8_n841TrnNom ;
   private String[] T01UR9_A2249ManNom ;
   private boolean[] T01UR9_n2249ManNom ;
   private String[] T01UR10_A396EmprCod ;
   private int[] T01UR10_A2253SalExtAlb ;
   private String[] T01UR3_A3554SalExtObs ;
   private int[] T01UR3_A2253SalExtAlb ;
   private java.util.Date[] T01UR3_A2256SalExtFec ;
   private byte[] T01UR3_A2257SalExtEst ;
   private byte[] T01UR3_A2258SalExtLis ;
   private String[] T01UR3_A2254SalExtSec ;
   private short[] T01UR3_A6247SalExUln ;
   private java.util.Date[] T01UR3_A14398SalFecSal ;
   private String[] T01UR3_A6396SalExtHor ;
   private String[] T01UR3_A6397SalExtMat ;
   private String[] T01UR3_A7368SalExtUsu ;
   private int[] T01UR3_A7369SalExtRec ;
   private short[] T01UR3_A7370ManCod_o ;
   private java.util.Date[] T01UR3_A8655SalFecEnt ;
   private java.util.Date[] T01UR3_A11299SalExtFen ;
   private String[] T01UR3_A10767SalExtAT ;
   private String[] T01UR3_A10742SalCodeID ;
   private byte[] T01UR3_A10741SalEnvAT ;
   private String[] T01UR3_A10080SalSts ;
   private String[] T01UR3_A10079SalFmdD ;
   private java.math.BigDecimal[] T01UR3_A10078SalGrossT ;
   private String[] T01UR3_A10077SalFmd ;
   private java.util.Date[] T01UR3_A10076SalFhh ;
   private java.math.BigDecimal[] T01UR3_A13244SalExtPre1 ;
   private String[] T01UR3_A14348SalExtATCU ;
   private String[] T01UR3_A14349SalExtSerA ;
   private String[] T01UR3_A14350SalExtTipA ;
   private String[] T01UR3_A396EmprCod ;
   private short[] T01UR3_A840TrnCod ;
   private boolean[] T01UR3_n840TrnCod ;
   private short[] T01UR3_A2248ManCod ;
   private String[] T01UR11_A396EmprCod ;
   private int[] T01UR11_A2253SalExtAlb ;
   private String[] T01UR12_A396EmprCod ;
   private int[] T01UR12_A2253SalExtAlb ;
   private String[] T01UR2_A3554SalExtObs ;
   private int[] T01UR2_A2253SalExtAlb ;
   private java.util.Date[] T01UR2_A2256SalExtFec ;
   private byte[] T01UR2_A2257SalExtEst ;
   private byte[] T01UR2_A2258SalExtLis ;
   private String[] T01UR2_A2254SalExtSec ;
   private short[] T01UR2_A6247SalExUln ;
   private java.util.Date[] T01UR2_A14398SalFecSal ;
   private String[] T01UR2_A6396SalExtHor ;
   private String[] T01UR2_A6397SalExtMat ;
   private String[] T01UR2_A7368SalExtUsu ;
   private int[] T01UR2_A7369SalExtRec ;
   private short[] T01UR2_A7370ManCod_o ;
   private java.util.Date[] T01UR2_A8655SalFecEnt ;
   private java.util.Date[] T01UR2_A11299SalExtFen ;
   private String[] T01UR2_A10767SalExtAT ;
   private String[] T01UR2_A10742SalCodeID ;
   private byte[] T01UR2_A10741SalEnvAT ;
   private String[] T01UR2_A10080SalSts ;
   private String[] T01UR2_A10079SalFmdD ;
   private java.math.BigDecimal[] T01UR2_A10078SalGrossT ;
   private String[] T01UR2_A10077SalFmd ;
   private java.util.Date[] T01UR2_A10076SalFhh ;
   private java.math.BigDecimal[] T01UR2_A13244SalExtPre1 ;
   private String[] T01UR2_A14348SalExtATCU ;
   private String[] T01UR2_A14349SalExtSerA ;
   private String[] T01UR2_A14350SalExtTipA ;
   private String[] T01UR2_A396EmprCod ;
   private short[] T01UR2_A840TrnCod ;
   private boolean[] T01UR2_n840TrnCod ;
   private short[] T01UR2_A2248ManCod ;
   private String[] T01UR16_A841TrnNom ;
   private boolean[] T01UR16_n841TrnNom ;
   private String[] T01UR17_A2249ManNom ;
   private boolean[] T01UR17_n2249ManNom ;
   private String[] T01UR18_A396EmprCod ;
   private int[] T01UR18_A2253SalExtAlb ;
   private int[] T01UR18_A129BarCod ;
   private byte[] T01UR18_A132BarCodReo ;
   private String[] T01UR18_A130BarCodPar ;
   private String[] T01UR19_A396EmprCod ;
   private int[] T01UR19_A2253SalExtAlb ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV23ManCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV20TrnCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item8 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item9[] ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV15TrnContext ;
   private app.wwpbaseobjects.SdtWWPTransactionContext_Attribute AV19TrnContextAtt ;
}

final  class trabajoexterno_header_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_header_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_header_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_header_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class trabajoexterno_header_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UR2", "SELECT SalExtObs, SalExtAlb, SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalFecSal, SalExtHor, SalExtMat, SalExtUsu, SalExtRec, ManCod_o, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtPre1, SalExtATCU, SalExtSerA, SalExtTipA, EmprCod, TrnCod, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ?  FOR UPDATE OF SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalFecSal, SalExtHor, SalExtMat, SalExtUsu, SalExtRec, ManCod_o, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtObs, SalExtPre1, SalExtATCU, SalExtSerA, SalExtTipA, TrnCod, ManCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR3", "SELECT SalExtObs, SalExtAlb, SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalFecSal, SalExtHor, SalExtMat, SalExtUsu, SalExtRec, ManCod_o, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtPre1, SalExtATCU, SalExtSerA, SalExtTipA, EmprCod, TrnCod, ManCod FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR5", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR6", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR7", "SELECT /*+ FIRST_ROWS(100) */ TM1.SalExtObs, TM1.SalExtAlb, T2.EmprNom, T3.ManNom, T4.TrnNom, TM1.SalExtFec, TM1.SalExtEst, TM1.SalExtLis, TM1.SalExtSec, TM1.SalExUln, TM1.SalFecSal, TM1.SalExtHor, TM1.SalExtMat, TM1.SalExtUsu, TM1.SalExtRec, TM1.ManCod_o, TM1.SalFecEnt, TM1.SalExtFen, TM1.SalExtAT, TM1.SalCodeID, TM1.SalEnvAT, TM1.SalSts, TM1.SalFmdD, TM1.SalGrossT, TM1.SalFmd, TM1.SalFhh, TM1.SalExtPre1, TM1.SalExtATCU, TM1.SalExtSerA, TM1.SalExtTipA, TM1.EmprCod, TM1.TrnCod, TM1.ManCod FROM (((TXPCEXTSA TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) INNER JOIN TXPMANUFA T3 ON T3.EmprCod = TM1.EmprCod AND T3.ManCod = TM1.ManCod) LEFT JOIN TXPTRANSP T4 ON T4.EmprCod = TM1.EmprCod AND T4.TrnCod = TM1.TrnCod) WHERE TM1.EmprCod = ? and TM1.SalExtAlb = ? ORDER BY TM1.EmprCod, TM1.SalExtAlb ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR8", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR9", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR10", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE EmprCod = ? AND SalExtAlb = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR11", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE ( EmprCod > ? or EmprCod = ? and SalExtAlb > ?) ORDER BY EmprCod, SalExtAlb) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UR12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, SalExtAlb FROM TXPCEXTSA WHERE ( EmprCod < ? or EmprCod = ? and SalExtAlb < ?) ORDER BY EmprCod DESC, SalExtAlb DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UR13", "INSERT INTO TXPCEXTSA(SalExtAlb, SalExtFec, SalExtEst, SalExtLis, SalExtSec, SalExUln, SalFecSal, SalExtHor, SalExtMat, SalExtUsu, SalExtRec, ManCod_o, SalFecEnt, SalExtFen, SalExtAT, SalCodeID, SalEnvAT, SalSts, SalFmdD, SalGrossT, SalFmd, SalFhh, SalExtObs, SalExtPre1, SalExtATCU, SalExtSerA, SalExtTipA, EmprCod, TrnCod, ManCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK, "TXPCEXTSA")
         ,new UpdateCursor("T01UR14", "UPDATE TXPCEXTSA SET SalExtFec=?, SalExtEst=?, SalExtLis=?, SalExtSec=?, SalExUln=?, SalFecSal=?, SalExtHor=?, SalExtMat=?, SalExtUsu=?, SalExtRec=?, ManCod_o=?, SalFecEnt=?, SalExtFen=?, SalExtAT=?, SalCodeID=?, SalEnvAT=?, SalSts=?, SalFmdD=?, SalGrossT=?, SalFmd=?, SalFhh=?, SalExtObs=?, SalExtPre1=?, SalExtATCU=?, SalExtSerA=?, SalExtTipA=?, TrnCod=?, ManCod=?  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK, "TXPCEXTSA")
         ,new UpdateCursor("T01UR15", "DELETE FROM TXPCEXTSA  WHERE EmprCod = ? AND SalExtAlb = ?", GX_NOMASK, "TXPCEXTSA")
         ,new ForEachCursor("T01UR16", "SELECT TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR17", "SELECT ManNom FROM TXPMANUFA WHERE EmprCod = ? AND ManCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UR18", "SELECT * FROM (SELECT EmprCod, SalExtAlb, BarCod, BarCodReo, BarCodPar FROM TXPLEXTSA WHERE EmprCod = ? AND SalExtAlb = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UR19", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, SalExtAlb FROM TXPCEXTSA ORDER BY EmprCod, SalExtAlb ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((String[]) buf[19])[0] = rslt.getString(20, 300);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[21])[0] = rslt.getString(22, 200);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((String[]) buf[24])[0] = rslt.getString(25, 20);
               ((String[]) buf[25])[0] = rslt.getString(26, 20);
               ((String[]) buf[26])[0] = rslt.getString(27, 4);
               ((String[]) buf[27])[0] = rslt.getString(28, 3);
               ((short[]) buf[28])[0] = rslt.getShort(29);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(30);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 8);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((short[]) buf[12])[0] = rslt.getShort(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDate(15);
               ((String[]) buf[15])[0] = rslt.getString(16, 1);
               ((String[]) buf[16])[0] = rslt.getString(17, 20);
               ((byte[]) buf[17])[0] = rslt.getByte(18);
               ((String[]) buf[18])[0] = rslt.getString(19, 1);
               ((String[]) buf[19])[0] = rslt.getString(20, 300);
               ((java.math.BigDecimal[]) buf[20])[0] = rslt.getBigDecimal(21,2);
               ((String[]) buf[21])[0] = rslt.getString(22, 200);
               ((java.util.Date[]) buf[22])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(24,5);
               ((String[]) buf[24])[0] = rslt.getString(25, 20);
               ((String[]) buf[25])[0] = rslt.getString(26, 20);
               ((String[]) buf[26])[0] = rslt.getString(27, 4);
               ((String[]) buf[27])[0] = rslt.getString(28, 3);
               ((short[]) buf[28])[0] = rslt.getShort(29);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((short[]) buf[30])[0] = rslt.getShort(30);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getLongVarchar(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(6);
               ((byte[]) buf[9])[0] = rslt.getByte(7);
               ((byte[]) buf[10])[0] = rslt.getByte(8);
               ((String[]) buf[11])[0] = rslt.getString(9, 1);
               ((short[]) buf[12])[0] = rslt.getShort(10);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(11);
               ((String[]) buf[14])[0] = rslt.getString(12, 8);
               ((String[]) buf[15])[0] = rslt.getString(13, 20);
               ((String[]) buf[16])[0] = rslt.getString(14, 8);
               ((int[]) buf[17])[0] = rslt.getInt(15);
               ((short[]) buf[18])[0] = rslt.getShort(16);
               ((java.util.Date[]) buf[19])[0] = rslt.getGXDate(17);
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDate(18);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((String[]) buf[22])[0] = rslt.getString(20, 20);
               ((byte[]) buf[23])[0] = rslt.getByte(21);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((String[]) buf[25])[0] = rslt.getString(23, 300);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[27])[0] = rslt.getString(25, 200);
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(26);
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(27,5);
               ((String[]) buf[30])[0] = rslt.getString(28, 20);
               ((String[]) buf[31])[0] = rslt.getString(29, 20);
               ((String[]) buf[32])[0] = rslt.getString(30, 4);
               ((String[]) buf[33])[0] = rslt.getString(31, 3);
               ((short[]) buf[34])[0] = rslt.getShort(32);
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((short[]) buf[36])[0] = rslt.getShort(33);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 11 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setDate(7, (java.util.Date)parms[6]);
               stmt.setString(8, (String)parms[7], 8);
               stmt.setString(9, (String)parms[8], 20);
               stmt.setString(10, (String)parms[9], 8);
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setDate(14, (java.util.Date)parms[13]);
               stmt.setString(15, (String)parms[14], 1);
               stmt.setString(16, (String)parms[15], 20);
               stmt.setByte(17, ((Number) parms[16]).byteValue());
               stmt.setString(18, (String)parms[17], 1);
               stmt.setString(19, (String)parms[18], 300);
               stmt.setBigDecimal(20, (java.math.BigDecimal)parms[19], 2);
               stmt.setString(21, (String)parms[20], 200);
               stmt.setDateTime(22, (java.util.Date)parms[21], false);
               stmt.setLongVarchar(23, (String)parms[22], false);
               stmt.setBigDecimal(24, (java.math.BigDecimal)parms[23], 5);
               stmt.setString(25, (String)parms[24], 20);
               stmt.setString(26, (String)parms[25], 20);
               stmt.setString(27, (String)parms[26], 4);
               stmt.setString(28, (String)parms[27], 3);
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(29, ((Number) parms[29]).shortValue());
               }
               stmt.setShort(30, ((Number) parms[30]).shortValue());
               return;
            case 12 :
               stmt.setDate(1, (java.util.Date)parms[0]);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setDate(6, (java.util.Date)parms[5]);
               stmt.setString(7, (String)parms[6], 8);
               stmt.setString(8, (String)parms[7], 20);
               stmt.setString(9, (String)parms[8], 8);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setDate(12, (java.util.Date)parms[11]);
               stmt.setDate(13, (java.util.Date)parms[12]);
               stmt.setString(14, (String)parms[13], 1);
               stmt.setString(15, (String)parms[14], 20);
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setString(17, (String)parms[16], 1);
               stmt.setString(18, (String)parms[17], 300);
               stmt.setBigDecimal(19, (java.math.BigDecimal)parms[18], 2);
               stmt.setString(20, (String)parms[19], 200);
               stmt.setDateTime(21, (java.util.Date)parms[20], false);
               stmt.setLongVarchar(22, (String)parms[21], false);
               stmt.setBigDecimal(23, (java.math.BigDecimal)parms[22], 5);
               stmt.setString(24, (String)parms[23], 20);
               stmt.setString(25, (String)parms[24], 20);
               stmt.setString(26, (String)parms[25], 4);
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(27, ((Number) parms[27]).shortValue());
               }
               stmt.setShort(28, ((Number) parms[28]).shortValue());
               stmt.setString(29, (String)parms[29], 3);
               stmt.setInt(30, ((Number) parms[30]).intValue());
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

