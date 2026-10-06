package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproces_trn_impl extends GXDataArea
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Procesos Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tproces_trn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tproces_trn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_trn_impl.class ));
   }

   public tproces_trn_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbProEst = new HTMLChoice();
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
      if ( cmbProEst.getItemCount() > 0 )
      {
         A14284ProEst = cmbProEst.getValidValue(A14284ProEst) ;
         httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbProEst.setValue( GXutil.rtrim( A14284ProEst) );
         httpContext.ajax_rsp_assign_prop("", false, cmbProEst.getInternalname(), "Values", cmbProEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProCod_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Proceso", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbProEst.getInternalname()+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbProEst.getInternalname(), httpContext.getMessage( "Estado", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbProEst, cmbProEst.getInternalname(), GXutil.rtrim( A14284ProEst), 1, cmbProEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbProEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "", true, (byte)(0), "HLP_FicherosBasicos\\TProces_TRN.htm");
      cmbProEst.setValue( GXutil.rtrim( A14284ProEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbProEst.getInternalname(), "Values", cmbProEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc2_Internalname, httpContext.getMessage( "Descripcion (large)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc2_Internalname, GXutil.rtrim( A4628ProDsc2), GXutil.rtrim( localUtil.format( A4628ProDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDscF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDscF_Internalname, httpContext.getMessage( "Descripcion (Facturacion)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDscF_Internalname, GXutil.rtrim( A6486ProDscF), GXutil.rtrim( localUtil.format( A6486ProDscF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDscF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDscF_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_TRN.htm");
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_TRN.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TProces_TRN.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV16Pgmname), GXutil.rtrim( localUtil.format( AV16Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TProces_TRN.htm");
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
      e111UK2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z759ProDsc = httpContext.cgiGet( "Z759ProDsc") ;
            Z4628ProDsc2 = httpContext.cgiGet( "Z4628ProDsc2") ;
            Z6486ProDscF = httpContext.cgiGet( "Z6486ProDscF") ;
            Z14284ProEst = httpContext.cgiGet( "Z14284ProEst") ;
            Z5289ProProvi = httpContext.cgiGet( "Z5289ProProvi") ;
            Z775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z775ProUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z7795ProTipP = httpContext.cgiGet( "Z7795ProTipP") ;
            Z8042ProTipT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8042ProTipT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5289ProProvi = httpContext.cgiGet( "Z5289ProProvi") ;
            A775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z775ProUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7795ProTipP = httpContext.cgiGet( "Z7795ProTipP") ;
            A8042ProTipT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8042ProTipT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            A13771ProCDsc = httpContext.cgiGet( "PROCDSC") ;
            AV7EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV8ProCod = httpContext.cgiGet( "vPROCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5289ProProvi = httpContext.cgiGet( "PROPROVI") ;
            A7795ProTipP = httpContext.cgiGet( "PROTIPP") ;
            A8042ProTipT = (byte)(localUtil.ctol( httpContext.cgiGet( "PROTIPT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            A775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "PROULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A13687ProMaxLin = (short)(localUtil.ctol( httpContext.cgiGet( "PROMAXLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13687ProMaxLin = false ;
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
            cmbProEst.setValue( httpContext.cgiGet( cmbProEst.getInternalname()) );
            A14284ProEst = httpContext.cgiGet( cmbProEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
            A4628ProDsc2 = httpContext.cgiGet( edtProDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
            A6486ProDscF = httpContext.cgiGet( edtProDscF_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
            AV16Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TProces_TRN");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("ProProvi", GXutil.rtrim( localUtil.format( A5289ProProvi, "@!")));
            forbiddenHiddens.add("ProUltLin", localUtil.format( DecimalUtil.doubleToDec(A775ProUltLin), "ZZZ9"));
            forbiddenHiddens.add("ProTipP", GXutil.rtrim( localUtil.format( A7795ProTipP, "")));
            forbiddenHiddens.add("ProTipT", localUtil.format( DecimalUtil.doubleToDec(A8042ProTipT), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tproces_trn:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
                  sMode87 = Gx_mode ;
                  Gx_mode = "UPD" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  Gx_mode = sMode87 ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               }
               standaloneModal( ) ;
               if ( ! isIns( ) )
               {
                  getByPrimaryKey( ) ;
                  if ( RcdFound87 == 1 )
                  {
                     if ( isDlt( ) )
                     {
                        /* Confirm record */
                        confirm_1UK0( ) ;
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
                        e111UK2 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e121UK2 ();
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
         e121UK2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll1UK87( ) ;
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
         disableAttributes1UK87( ) ;
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

   public void confirm_1UK0( )
   {
      beforeValidate1UK87( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls1UK87( ) ;
         }
         else
         {
            checkExtendedTable1UK87( ) ;
            closeExtendedTableCursors1UK87( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         IsConfirmed = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      }
   }

   public void resetCaption1UK0( )
   {
   }

   public void e111UK2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV12Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tproces_trn_impl.this.GXt_char1 = GXv_char2[0] ;
      AV12Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Station", AV12Station);
      GXv_char2[0] = AV7EmprCod ;
      GXv_char3[0] = AV13EmprNom ;
      GXv_char4[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV12Station, GXv_char2, GXv_char3, GXv_char4) ;
      tproces_trn_impl.this.AV7EmprCod = GXv_char2[0] ;
      tproces_trn_impl.this.AV13EmprNom = GXv_char3[0] ;
      tproces_trn_impl.this.AV14UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7EmprCod", AV7EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV13EmprNom", AV13EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV14UsurCod", AV14UsurCod);
      GXv_SdtWWPContext5[0] = AV9WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV9WWPContext = GXv_SdtWWPContext5[0] ;
      AV10TrnContext.fromxml(AV11WebSession.getValue("TrnContext"), null, null);
   }

   public void e121UK2( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         httpContext.popup(formatLink("app.ficherosbasicos.tproces_lineas_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc))}, new String[] {"Emprcod","ProCod","ProDsc"}) , new Object[] {});
      }
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV10TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tproces_trnww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
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

   public void zm1UK87( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z759ProDsc = T01UK3_A759ProDsc[0] ;
            Z4628ProDsc2 = T01UK3_A4628ProDsc2[0] ;
            Z6486ProDscF = T01UK3_A6486ProDscF[0] ;
            Z14284ProEst = T01UK3_A14284ProEst[0] ;
            Z5289ProProvi = T01UK3_A5289ProProvi[0] ;
            Z775ProUltLin = T01UK3_A775ProUltLin[0] ;
            Z7795ProTipP = T01UK3_A7795ProTipP[0] ;
            Z8042ProTipT = T01UK3_A8042ProTipT[0] ;
         }
         else
         {
            Z759ProDsc = A759ProDsc ;
            Z4628ProDsc2 = A4628ProDsc2 ;
            Z6486ProDscF = A6486ProDscF ;
            Z14284ProEst = A14284ProEst ;
            Z5289ProProvi = A5289ProProvi ;
            Z775ProUltLin = A775ProUltLin ;
            Z7795ProTipP = A7795ProTipP ;
            Z8042ProTipT = A8042ProTipT ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z4628ProDsc2 = A4628ProDsc2 ;
         Z6486ProDscF = A6486ProDscF ;
         Z14284ProEst = A14284ProEst ;
         Z5289ProProvi = A5289ProProvi ;
         Z775ProUltLin = A775ProUltLin ;
         Z7795ProTipP = A7795ProTipP ;
         Z8042ProTipT = A8042ProTipT ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13687ProMaxLin = A13687ProMaxLin ;
      }
   }

   public void standaloneNotModal( )
   {
      AV16Pgmname = "FicherosBasicos.TProces_TRN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16Pgmname", AV16Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV7EmprCod)==0) )
      {
         A396EmprCod = AV7EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T01UK4 */
      pr_default.execute(2, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T01UK4_A407EmprNom[0] ;
      n407EmprNom = T01UK4_n407EmprNom[0] ;
      pr_default.close(2);
      if ( ! (GXutil.strcmp("", AV8ProCod)==0) )
      {
         A758ProCod = AV8ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV8ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV8ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
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
      if ( isIns( )  && (GXutil.strcmp("", A5289ProProvi)==0) && ( Gx_BScreen == 0 ) )
      {
         A5289ProProvi = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      }
      if ( isIns( )  && (GXutil.strcmp("", A7795ProTipP)==0) && ( Gx_BScreen == 0 ) )
      {
         A7795ProTipP = "*" ;
         httpContext.ajax_rsp_assign_attri("", false, "A7795ProTipP", A7795ProTipP);
      }
      if ( isIns( )  && (0==A8042ProTipT) && ( Gx_BScreen == 0 ) )
      {
         A8042ProTipT = (byte)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "A8042ProTipT", GXutil.str( A8042ProTipT, 1, 0));
      }
      if ( isIns( )  && (GXutil.strcmp("", A14284ProEst)==0) && ( Gx_BScreen == 0 ) )
      {
         A14284ProEst = httpContext.getMessage( httpContext.getMessage( "A", ""), "") ;
         httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
      }
      if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && ( Gx_BScreen == 0 ) )
      {
         /* Using cursor T01UK6 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A13687ProMaxLin = T01UK6_A13687ProMaxLin[0] ;
            n13687ProMaxLin = T01UK6_n13687ProMaxLin[0] ;
         }
         else
         {
            A13687ProMaxLin = (short)(0) ;
            n13687ProMaxLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
         }
         pr_default.close(3);
      }
   }

   public void load1UK87( )
   {
      /* Using cursor T01UK8 */
      pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A759ProDsc = T01UK8_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = T01UK8_A4628ProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A6486ProDscF = T01UK8_A6486ProDscF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
         A14284ProEst = T01UK8_A14284ProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
         A5289ProProvi = T01UK8_A5289ProProvi[0] ;
         A407EmprNom = T01UK8_A407EmprNom[0] ;
         n407EmprNom = T01UK8_n407EmprNom[0] ;
         A775ProUltLin = T01UK8_A775ProUltLin[0] ;
         A7795ProTipP = T01UK8_A7795ProTipP[0] ;
         A8042ProTipT = T01UK8_A8042ProTipT[0] ;
         A13687ProMaxLin = T01UK8_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T01UK8_n13687ProMaxLin[0] ;
         zm1UK87( -13) ;
      }
      pr_default.close(4);
      onLoadActions1UK87( ) ;
   }

   public void onLoadActions1UK87( )
   {
      A13771ProCDsc = GXutil.trim( A758ProCod) + "-" + GXutil.trim( A759ProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
   }

   public void checkExtendedTable1UK87( )
   {
      nIsDirty_87 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_87 = (short)(1) ;
      A13771ProCDsc = GXutil.trim( A758ProCod) + "-" + GXutil.trim( A759ProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
      if ( ! ( ( GXutil.strcmp(A14284ProEst, "A") == 0 ) || ( GXutil.strcmp(A14284ProEst, "I") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Proceso", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbProEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T01UK6 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13687ProMaxLin = T01UK6_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T01UK6_n13687ProMaxLin[0] ;
      }
      else
      {
         nIsDirty_87 = (short)(1) ;
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      pr_default.close(3);
   }

   public void closeExtendedTableCursors1UK87( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T01UK10 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A13687ProMaxLin = T01UK10_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T01UK10_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), ".", "")))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(5) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(5);
   }

   public void getKey1UK87( )
   {
      /* Using cursor T01UK11 */
      pr_default.execute(6, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound87 = (short)(1) ;
      }
      else
      {
         RcdFound87 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T01UK3 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1UK87( 13) ;
         RcdFound87 = (short)(1) ;
         A758ProCod = T01UK3_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = T01UK3_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = T01UK3_A4628ProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A6486ProDscF = T01UK3_A6486ProDscF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
         A14284ProEst = T01UK3_A14284ProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
         A5289ProProvi = T01UK3_A5289ProProvi[0] ;
         A775ProUltLin = T01UK3_A775ProUltLin[0] ;
         A7795ProTipP = T01UK3_A7795ProTipP[0] ;
         A8042ProTipT = T01UK3_A8042ProTipT[0] ;
         A396EmprCod = T01UK3_A396EmprCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load1UK87( ) ;
         if ( AnyError == 1 )
         {
            RcdFound87 = (short)(0) ;
            initializeNonKey1UK87( ) ;
         }
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound87 = (short)(0) ;
         initializeNonKey1UK87( ) ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1UK87( ) ;
      if ( RcdFound87 == 0 )
      {
      }
      else
      {
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound87 = (short)(0) ;
      /* Using cursor T01UK12 */
      pr_default.execute(7, new Object[] {A396EmprCod, A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UK12_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UK12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UK12_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T01UK12_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UK12_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UK12_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            A396EmprCod = T01UK12_A396EmprCod[0] ;
            A758ProCod = T01UK12_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound87 = (short)(0) ;
      /* Using cursor T01UK13 */
      pr_default.execute(8, new Object[] {A396EmprCod, A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UK13_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T01UK13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UK13_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T01UK13_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T01UK13_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T01UK13_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            A396EmprCod = T01UK13_A396EmprCod[0] ;
            A758ProCod = T01UK13_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1UK87( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1UK87( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound87 == 1 )
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               A396EmprCod = Z396EmprCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               A758ProCod = Z758ProCod ;
               httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "PROCOD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               update1UK87( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               /* Insert record */
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1UK87( ) ;
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
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1UK87( ) ;
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
      if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
      {
         A396EmprCod = Z396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A758ProCod = Z758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency1UK87( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T01UK2 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z759ProDsc, T01UK2_A759ProDsc[0]) != 0 ) || ( GXutil.strcmp(Z4628ProDsc2, T01UK2_A4628ProDsc2[0]) != 0 ) || ( GXutil.strcmp(Z6486ProDscF, T01UK2_A6486ProDscF[0]) != 0 ) || ( GXutil.strcmp(Z14284ProEst, T01UK2_A14284ProEst[0]) != 0 ) || ( GXutil.strcmp(Z5289ProProvi, T01UK2_A5289ProProvi[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z775ProUltLin != T01UK2_A775ProUltLin[0] ) || ( GXutil.strcmp(Z7795ProTipP, T01UK2_A7795ProTipP[0]) != 0 ) || ( Z8042ProTipT != T01UK2_A8042ProTipT[0] ) )
         {
            if ( GXutil.strcmp(Z759ProDsc, T01UK2_A759ProDsc[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProDsc");
               GXutil.writeLogRaw("Old: ",Z759ProDsc);
               GXutil.writeLogRaw("Current: ",T01UK2_A759ProDsc[0]);
            }
            if ( GXutil.strcmp(Z4628ProDsc2, T01UK2_A4628ProDsc2[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProDsc2");
               GXutil.writeLogRaw("Old: ",Z4628ProDsc2);
               GXutil.writeLogRaw("Current: ",T01UK2_A4628ProDsc2[0]);
            }
            if ( GXutil.strcmp(Z6486ProDscF, T01UK2_A6486ProDscF[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProDscF");
               GXutil.writeLogRaw("Old: ",Z6486ProDscF);
               GXutil.writeLogRaw("Current: ",T01UK2_A6486ProDscF[0]);
            }
            if ( GXutil.strcmp(Z14284ProEst, T01UK2_A14284ProEst[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProEst");
               GXutil.writeLogRaw("Old: ",Z14284ProEst);
               GXutil.writeLogRaw("Current: ",T01UK2_A14284ProEst[0]);
            }
            if ( GXutil.strcmp(Z5289ProProvi, T01UK2_A5289ProProvi[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProProvi");
               GXutil.writeLogRaw("Old: ",Z5289ProProvi);
               GXutil.writeLogRaw("Current: ",T01UK2_A5289ProProvi[0]);
            }
            if ( Z775ProUltLin != T01UK2_A775ProUltLin[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProUltLin");
               GXutil.writeLogRaw("Old: ",Z775ProUltLin);
               GXutil.writeLogRaw("Current: ",T01UK2_A775ProUltLin[0]);
            }
            if ( GXutil.strcmp(Z7795ProTipP, T01UK2_A7795ProTipP[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProTipP");
               GXutil.writeLogRaw("Old: ",Z7795ProTipP);
               GXutil.writeLogRaw("Current: ",T01UK2_A7795ProTipP[0]);
            }
            if ( Z8042ProTipT != T01UK2_A8042ProTipT[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tproces_trn:[seudo value changed for attri]"+"ProTipT");
               GXutil.writeLogRaw("Old: ",Z8042ProTipT);
               GXutil.writeLogRaw("Current: ",T01UK2_A8042ProTipT[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROCES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1UK87( )
   {
      beforeValidate1UK87( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UK87( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1UK87( 0) ;
         checkOptimisticConcurrency1UK87( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UK87( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1UK87( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UK14 */
                  pr_default.execute(9, new Object[] {A758ProCod, A759ProDsc, A4628ProDsc2, A6486ProDscF, A14284ProEst, A5289ProProvi, Short.valueOf(A775ProUltLin), A7795ProTipP, Byte.valueOf(A8042ProTipT), A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( (pr_default.getStatus(9) == 1) )
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
                        resetCaption1UK0( ) ;
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
            load1UK87( ) ;
         }
         endLevel1UK87( ) ;
      }
      closeExtendedTableCursors1UK87( ) ;
   }

   public void update1UK87( )
   {
      beforeValidate1UK87( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1UK87( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UK87( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1UK87( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1UK87( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T01UK15 */
                  pr_default.execute(10, new Object[] {A759ProDsc, A4628ProDsc2, A6486ProDscF, A14284ProEst, A5289ProProvi, Short.valueOf(A775ProUltLin), A7795ProTipP, Byte.valueOf(A8042ProTipT), A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1UK87( ) ;
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
         endLevel1UK87( ) ;
      }
      closeExtendedTableCursors1UK87( ) ;
   }

   public void deferredUpdate1UK87( )
   {
   }

   public void delete( )
   {
      beforeValidate1UK87( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1UK87( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1UK87( ) ;
         afterConfirm1UK87( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1UK87( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T01UK16 */
               pr_default.execute(11, new Object[] {A396EmprCod, A758ProCod});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
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
      sMode87 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1UK87( ) ;
      Gx_mode = sMode87 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1UK87( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13771ProCDsc = GXutil.trim( A758ProCod) + "-" + GXutil.trim( A759ProDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
         /* Using cursor T01UK18 */
         pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(12) != 101) )
         {
            A13687ProMaxLin = T01UK18_A13687ProMaxLin[0] ;
            n13687ProMaxLin = T01UK18_n13687ProMaxLin[0] ;
         }
         else
         {
            A13687ProMaxLin = (short)(0) ;
            n13687ProMaxLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
         }
         pr_default.close(12);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T01UK19 */
         pr_default.execute(13, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T01UK20 */
         pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T01UK21 */
         pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases Fac. x Cliente (Cab)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T01UK22 */
         pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T01UK23 */
         pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMFP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T01UK24 */
         pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OTPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T01UK25 */
         pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T01UK26 */
         pr_default.execute(20, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T01UK27 */
         pr_default.execute(21, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T01UK28 */
         pr_default.execute(22, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T01UK29 */
         pr_default.execute(23, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
      }
   }

   public void endLevel1UK87( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1UK87( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tproces_trn");
         if ( AnyError == 0 )
         {
            confirmValues1UK0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tproces_trn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1UK87( )
   {
      /* Scan By routine */
      /* Using cursor T01UK30 */
      pr_default.execute(24);
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A396EmprCod = T01UK30_A396EmprCod[0] ;
         A758ProCod = T01UK30_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1UK87( )
   {
      /* Scan next routine */
      pr_default.readNext(24);
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(24) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A396EmprCod = T01UK30_A396EmprCod[0] ;
         A758ProCod = T01UK30_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
   }

   public void scanEnd1UK87( )
   {
      pr_default.close(24);
   }

   public void afterConfirm1UK87( )
   {
      /* After Confirm Rules */
      if ( (GXutil.strcmp("", A758ProCod)==0) && ( GXutil.strcmp(Gx_mode, "INS") == 0 ) && true /* After */ )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso NO valido", ""), 1, "PROCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         return  ;
      }
   }

   public void beforeInsert1UK87( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1UK87( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1UK87( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1UK87( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1UK87( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1UK87( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      cmbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbProEst.getEnabled(), 5, 0), true);
      edtProDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc2_Enabled), 5, 0), true);
      edtProDscF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDscF_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes1UK87( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1UK0( )
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tproces_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8ProCod))}, new String[] {"Gx_mode","EmprCod","ProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TProces_TRN");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("ProProvi", GXutil.rtrim( localUtil.format( A5289ProProvi, "@!")));
      forbiddenHiddens.add("ProUltLin", localUtil.format( DecimalUtil.doubleToDec(A775ProUltLin), "ZZZ9"));
      forbiddenHiddens.add("ProTipP", GXutil.rtrim( localUtil.format( A7795ProTipP, "")));
      forbiddenHiddens.add("ProTipT", localUtil.format( DecimalUtil.doubleToDec(A8042ProTipT), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tproces_trn:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "Z396EmprCod", GXutil.rtrim( Z396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z758ProCod", GXutil.rtrim( Z758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "Z759ProDsc", GXutil.rtrim( Z759ProDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "Z4628ProDsc2", GXutil.rtrim( Z4628ProDsc2));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6486ProDscF", GXutil.rtrim( Z6486ProDscF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14284ProEst", GXutil.rtrim( Z14284ProEst));
      app.GxWebStd.gx_hidden_field( httpContext, "Z5289ProProvi", GXutil.rtrim( Z5289ProProvi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z775ProUltLin", GXutil.ltrim( localUtil.ntoc( Z775ProUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7795ProTipP", GXutil.rtrim( Z7795ProTipP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8042ProTipT", GXutil.ltrim( localUtil.ntoc( Z8042ProTipT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV10TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV10TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV10TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCDSC", A13771ProCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV7EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV8ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPROVI", GXutil.rtrim( A5289ProProvi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROTIPP", GXutil.rtrim( A7795ProTipP));
      app.GxWebStd.gx_hidden_field( httpContext, "PROTIPT", GXutil.ltrim( localUtil.ntoc( A8042ProTipT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "PROULTLIN", GXutil.ltrim( localUtil.ntoc( A775ProUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMAXLIN", GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      return formatLink("app.ficherosbasicos.tproces_trn", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV7EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV8ProCod))}, new String[] {"Gx_mode","EmprCod","ProCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TProces_TRN" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Procesos Produccion", "") ;
   }

   public void initializeNonKey1UK87( )
   {
      A13771ProCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A4628ProDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
      A6486ProDscF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
      A775ProUltLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      A13687ProMaxLin = (short)(0) ;
      n13687ProMaxLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      A14284ProEst = httpContext.getMessage( "A", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
      A5289ProProvi = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      A7795ProTipP = "*" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7795ProTipP", A7795ProTipP);
      A8042ProTipT = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8042ProTipT", GXutil.str( A8042ProTipT, 1, 0));
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      Z6486ProDscF = "" ;
      Z14284ProEst = "" ;
      Z5289ProProvi = "" ;
      Z775ProUltLin = (short)(0) ;
      Z7795ProTipP = "" ;
      Z8042ProTipT = (byte)(0) ;
   }

   public void initAll1UK87( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      initializeNonKey1UK87( ) ;
   }

   public void standaloneModalInsert( )
   {
      A5289ProProvi = i5289ProProvi ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      A7795ProTipP = i7795ProTipP ;
      httpContext.ajax_rsp_assign_attri("", false, "A7795ProTipP", A7795ProTipP);
      A8042ProTipT = i8042ProTipT ;
      httpContext.ajax_rsp_assign_attri("", false, "A8042ProTipT", GXutil.str( A8042ProTipT, 1, 0));
      A14284ProEst = i14284ProEst ;
      httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116102538", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tproces_trn.js", "?202682116102538", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      cmbProEst.setInternalname( "PROEST" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtProDsc2_Internalname = "PRODSC2" ;
      edtProDscF_Internalname = "PRODSCF" ;
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
      Form.setCaption( httpContext.getMessage( "Procesos Produccion", "") );
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProDscF_Jsonclick = "" ;
      edtProDscF_Enabled = 1 ;
      edtProDsc2_Jsonclick = "" ;
      edtProDsc2_Enabled = 1 ;
      cmbProEst.setJsonclick( "" );
      cmbProEst.setEnabled( 1 );
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Enabled = 1 ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Enabled = 1 ;
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
      cmbProEst.setName( "PROEST" );
      cmbProEst.setWebtags( "" );
      cmbProEst.addItem("A", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbProEst.addItem("I", httpContext.getMessage( "Inactivo", ""), (short)(0));
      if ( cmbProEst.getItemCount() > 0 )
      {
         if ( isIns( ) && (GXutil.strcmp("", A14284ProEst)==0) )
         {
            A14284ProEst = httpContext.getMessage( "A", "") ;
            httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
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

   public void valid_Procod( )
   {
      n13687ProMaxLin = false ;
      /* Using cursor T01UK18 */
      pr_default.execute(12, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(12) != 101) )
      {
         A13687ProMaxLin = T01UK18_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T01UK18_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), ".", "")));
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8ProCod',fld:'vPROCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV8ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'},{av:'A775ProUltLin',fld:'PROULTLIN',pic:'ZZZ9'},{av:'A7795ProTipP',fld:'PROTIPP',pic:''},{av:'A8042ProTipT',fld:'PROTIPT',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e121UK2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV7EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'AV10TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A13687ProMaxLin',fld:'PROMAXLIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A13687ProMaxLin',fld:'PROMAXLIN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PRODSC","{handler:'valid_Prodsc',iparms:[]");
      setEventMetadata("VALID_PRODSC",",oparms:[]}");
      setEventMetadata("VALID_PROEST","{handler:'valid_Proest',iparms:[]");
      setEventMetadata("VALID_PROEST",",oparms:[]}");
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
      pr_default.close(12);
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
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      Z6486ProDscF = "" ;
      Z14284ProEst = "" ;
      Z5289ProProvi = "" ;
      Z7795ProTipP = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      Gx_mode = "" ;
      AV7EmprCod = "" ;
      AV8ProCod = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      A14284ProEst = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      A759ProDsc = "" ;
      A4628ProDsc2 = "" ;
      A6486ProDscF = "" ;
      bttBtntrn_enter_Jsonclick = "" ;
      bttBtntrn_cancel_Jsonclick = "" ;
      bttBtntrn_delete_Jsonclick = "" ;
      AV16Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      A5289ProProvi = "" ;
      A7795ProTipP = "" ;
      A13771ProCDsc = "" ;
      A407EmprNom = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode87 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      AV12Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV13EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV14UsurCod = "" ;
      GXv_char4 = new String[1] ;
      AV9WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV10TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV11WebSession = httpContext.getWebSession();
      Z407EmprNom = "" ;
      T01UK4_A407EmprNom = new String[] {""} ;
      T01UK4_n407EmprNom = new boolean[] {false} ;
      T01UK6_A13687ProMaxLin = new short[1] ;
      T01UK6_n13687ProMaxLin = new boolean[] {false} ;
      T01UK8_A758ProCod = new String[] {""} ;
      T01UK8_A759ProDsc = new String[] {""} ;
      T01UK8_A4628ProDsc2 = new String[] {""} ;
      T01UK8_A6486ProDscF = new String[] {""} ;
      T01UK8_A14284ProEst = new String[] {""} ;
      T01UK8_A5289ProProvi = new String[] {""} ;
      T01UK8_A407EmprNom = new String[] {""} ;
      T01UK8_n407EmprNom = new boolean[] {false} ;
      T01UK8_A775ProUltLin = new short[1] ;
      T01UK8_A7795ProTipP = new String[] {""} ;
      T01UK8_A8042ProTipT = new byte[1] ;
      T01UK8_A396EmprCod = new String[] {""} ;
      T01UK8_A13687ProMaxLin = new short[1] ;
      T01UK8_n13687ProMaxLin = new boolean[] {false} ;
      T01UK10_A13687ProMaxLin = new short[1] ;
      T01UK10_n13687ProMaxLin = new boolean[] {false} ;
      T01UK11_A396EmprCod = new String[] {""} ;
      T01UK11_A758ProCod = new String[] {""} ;
      T01UK3_A758ProCod = new String[] {""} ;
      T01UK3_A759ProDsc = new String[] {""} ;
      T01UK3_A4628ProDsc2 = new String[] {""} ;
      T01UK3_A6486ProDscF = new String[] {""} ;
      T01UK3_A14284ProEst = new String[] {""} ;
      T01UK3_A5289ProProvi = new String[] {""} ;
      T01UK3_A775ProUltLin = new short[1] ;
      T01UK3_A7795ProTipP = new String[] {""} ;
      T01UK3_A8042ProTipT = new byte[1] ;
      T01UK3_A396EmprCod = new String[] {""} ;
      T01UK12_A396EmprCod = new String[] {""} ;
      T01UK12_A758ProCod = new String[] {""} ;
      T01UK13_A396EmprCod = new String[] {""} ;
      T01UK13_A758ProCod = new String[] {""} ;
      T01UK2_A758ProCod = new String[] {""} ;
      T01UK2_A759ProDsc = new String[] {""} ;
      T01UK2_A4628ProDsc2 = new String[] {""} ;
      T01UK2_A6486ProDscF = new String[] {""} ;
      T01UK2_A14284ProEst = new String[] {""} ;
      T01UK2_A5289ProProvi = new String[] {""} ;
      T01UK2_A775ProUltLin = new short[1] ;
      T01UK2_A7795ProTipP = new String[] {""} ;
      T01UK2_A8042ProTipT = new byte[1] ;
      T01UK2_A396EmprCod = new String[] {""} ;
      T01UK18_A13687ProMaxLin = new short[1] ;
      T01UK18_n13687ProMaxLin = new boolean[] {false} ;
      T01UK19_A396EmprCod = new String[] {""} ;
      T01UK19_A13026PedDGId = new int[1] ;
      T01UK19_A758ProCod = new String[] {""} ;
      T01UK20_A396EmprCod = new String[] {""} ;
      T01UK20_A12851ProCodID = new String[] {""} ;
      T01UK20_A758ProCod = new String[] {""} ;
      T01UK21_A396EmprCod = new String[] {""} ;
      T01UK21_A252CliCod = new int[1] ;
      T01UK21_A4589FFProCod = new String[] {""} ;
      T01UK22_A396EmprCod = new String[] {""} ;
      T01UK22_A252CliCod = new int[1] ;
      T01UK22_A10839Txt_Cor = new String[] {""} ;
      T01UK22_A758ProCod = new String[] {""} ;
      T01UK23_A396EmprCod = new String[] {""} ;
      T01UK23_A2248ManCod = new short[1] ;
      T01UK23_A5835ManFasCod = new String[] {""} ;
      T01UK23_A758ProCod = new String[] {""} ;
      T01UK24_A396EmprCod = new String[] {""} ;
      T01UK24_A7843Int_Num = new int[1] ;
      T01UK24_A758ProCod = new String[] {""} ;
      T01UK25_A396EmprCod = new String[] {""} ;
      T01UK25_A4618EnsLCod = new int[1] ;
      T01UK25_A758ProCod = new String[] {""} ;
      T01UK26_A396EmprCod = new String[] {""} ;
      T01UK26_A758ProCod = new String[] {""} ;
      T01UK26_A774ProNumLin = new short[1] ;
      T01UK27_A396EmprCod = new String[] {""} ;
      T01UK27_A361DisCod = new int[1] ;
      T01UK27_A758ProCod = new String[] {""} ;
      T01UK28_A396EmprCod = new String[] {""} ;
      T01UK28_A129BarCod = new int[1] ;
      T01UK28_A132BarCodReo = new byte[1] ;
      T01UK28_A130BarCodPar = new String[] {""} ;
      T01UK28_A758ProCod = new String[] {""} ;
      T01UK29_A396EmprCod = new String[] {""} ;
      T01UK29_A252CliCod = new int[1] ;
      T01UK29_A65ArtCod = new String[] {""} ;
      T01UK29_A758ProCod = new String[] {""} ;
      T01UK30_A396EmprCod = new String[] {""} ;
      T01UK30_A758ProCod = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i5289ProProvi = "" ;
      i7795ProTipP = "" ;
      i14284ProEst = "" ;
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trn__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trn__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trn__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trn__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_trn__default(),
         new Object[] {
             new Object[] {
            T01UK2_A758ProCod, T01UK2_A759ProDsc, T01UK2_A4628ProDsc2, T01UK2_A6486ProDscF, T01UK2_A14284ProEst, T01UK2_A5289ProProvi, T01UK2_A775ProUltLin, T01UK2_A7795ProTipP, T01UK2_A8042ProTipT, T01UK2_A396EmprCod
            }
            , new Object[] {
            T01UK3_A758ProCod, T01UK3_A759ProDsc, T01UK3_A4628ProDsc2, T01UK3_A6486ProDscF, T01UK3_A14284ProEst, T01UK3_A5289ProProvi, T01UK3_A775ProUltLin, T01UK3_A7795ProTipP, T01UK3_A8042ProTipT, T01UK3_A396EmprCod
            }
            , new Object[] {
            T01UK4_A407EmprNom, T01UK4_n407EmprNom
            }
            , new Object[] {
            T01UK6_A13687ProMaxLin, T01UK6_n13687ProMaxLin
            }
            , new Object[] {
            T01UK8_A758ProCod, T01UK8_A759ProDsc, T01UK8_A4628ProDsc2, T01UK8_A6486ProDscF, T01UK8_A14284ProEst, T01UK8_A5289ProProvi, T01UK8_A407EmprNom, T01UK8_n407EmprNom, T01UK8_A775ProUltLin, T01UK8_A7795ProTipP,
            T01UK8_A8042ProTipT, T01UK8_A396EmprCod, T01UK8_A13687ProMaxLin, T01UK8_n13687ProMaxLin
            }
            , new Object[] {
            T01UK10_A13687ProMaxLin, T01UK10_n13687ProMaxLin
            }
            , new Object[] {
            T01UK11_A396EmprCod, T01UK11_A758ProCod
            }
            , new Object[] {
            T01UK12_A396EmprCod, T01UK12_A758ProCod
            }
            , new Object[] {
            T01UK13_A396EmprCod, T01UK13_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T01UK18_A13687ProMaxLin, T01UK18_n13687ProMaxLin
            }
            , new Object[] {
            T01UK19_A396EmprCod, T01UK19_A13026PedDGId, T01UK19_A758ProCod
            }
            , new Object[] {
            T01UK20_A396EmprCod, T01UK20_A12851ProCodID, T01UK20_A758ProCod
            }
            , new Object[] {
            T01UK21_A396EmprCod, T01UK21_A252CliCod, T01UK21_A4589FFProCod
            }
            , new Object[] {
            T01UK22_A396EmprCod, T01UK22_A252CliCod, T01UK22_A10839Txt_Cor, T01UK22_A758ProCod
            }
            , new Object[] {
            T01UK23_A396EmprCod, T01UK23_A2248ManCod, T01UK23_A5835ManFasCod, T01UK23_A758ProCod
            }
            , new Object[] {
            T01UK24_A396EmprCod, T01UK24_A7843Int_Num, T01UK24_A758ProCod
            }
            , new Object[] {
            T01UK25_A396EmprCod, T01UK25_A4618EnsLCod, T01UK25_A758ProCod
            }
            , new Object[] {
            T01UK26_A396EmprCod, T01UK26_A758ProCod, T01UK26_A774ProNumLin
            }
            , new Object[] {
            T01UK27_A396EmprCod, T01UK27_A361DisCod, T01UK27_A758ProCod
            }
            , new Object[] {
            T01UK28_A396EmprCod, T01UK28_A129BarCod, T01UK28_A132BarCodReo, T01UK28_A130BarCodPar, T01UK28_A758ProCod
            }
            , new Object[] {
            T01UK29_A396EmprCod, T01UK29_A252CliCod, T01UK29_A65ArtCod, T01UK29_A758ProCod
            }
            , new Object[] {
            T01UK30_A396EmprCod, T01UK30_A758ProCod
            }
         }
      );
      AV16Pgmname = "FicherosBasicos.TProces_TRN" ;
      Z14284ProEst = httpContext.getMessage( "A", "") ;
      A14284ProEst = httpContext.getMessage( "A", "") ;
      i14284ProEst = httpContext.getMessage( "A", "") ;
      Z8042ProTipT = (byte)(1) ;
      A8042ProTipT = (byte)(1) ;
      i8042ProTipT = (byte)(1) ;
      Z7795ProTipP = "*" ;
      A7795ProTipP = "*" ;
      i7795ProTipP = "*" ;
      Z5289ProProvi = " " ;
      A5289ProProvi = " " ;
      i5289ProProvi = " " ;
   }

   private byte Z8042ProTipT ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A8042ProTipT ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private byte i8042ProTipT ;
   private short Z775ProUltLin ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A775ProUltLin ;
   private short A13687ProMaxLin ;
   private short RcdFound87 ;
   private short Z13687ProMaxLin ;
   private short nIsDirty_87 ;
   private int trnEnded ;
   private int edtProCod_Enabled ;
   private int edtProDsc_Enabled ;
   private int edtProDsc2_Enabled ;
   private int edtProDscF_Enabled ;
   private int bttBtntrn_enter_Visible ;
   private int bttBtntrn_enter_Enabled ;
   private int bttBtntrn_cancel_Visible ;
   private int bttBtntrn_delete_Visible ;
   private int bttBtntrn_delete_Enabled ;
   private int edtavPgmname_Enabled ;
   private int Datamonjs_Gxcontroltype ;
   private int GX_JID ;
   private int idxLst ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV7EmprCod ;
   private String wcpOAV8ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z759ProDsc ;
   private String Z4628ProDsc2 ;
   private String Z6486ProDscF ;
   private String Z14284ProEst ;
   private String Z5289ProProvi ;
   private String Z7795ProTipP ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String Gx_mode ;
   private String AV7EmprCod ;
   private String AV8ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProCod_Internalname ;
   private String A14284ProEst ;
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
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtProDsc2_Internalname ;
   private String A4628ProDsc2 ;
   private String edtProDsc2_Jsonclick ;
   private String edtProDscF_Internalname ;
   private String A6486ProDscF ;
   private String edtProDscF_Jsonclick ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV16Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String A5289ProProvi ;
   private String A7795ProTipP ;
   private String A407EmprNom ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String hsh ;
   private String sMode87 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String AV12Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV13EmprNom ;
   private String GXv_char3[] ;
   private String AV14UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i5289ProProvi ;
   private String i7795ProTipP ;
   private String i14284ProEst ;
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
   private boolean n13687ProMaxLin ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
   private String A13771ProCDsc ;
   private com.genexus.webpanels.WebSession AV11WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbProEst ;
   private IDataStoreProvider pr_default ;
   private String[] T01UK4_A407EmprNom ;
   private boolean[] T01UK4_n407EmprNom ;
   private short[] T01UK6_A13687ProMaxLin ;
   private boolean[] T01UK6_n13687ProMaxLin ;
   private String[] T01UK8_A758ProCod ;
   private String[] T01UK8_A759ProDsc ;
   private String[] T01UK8_A4628ProDsc2 ;
   private String[] T01UK8_A6486ProDscF ;
   private String[] T01UK8_A14284ProEst ;
   private String[] T01UK8_A5289ProProvi ;
   private String[] T01UK8_A407EmprNom ;
   private boolean[] T01UK8_n407EmprNom ;
   private short[] T01UK8_A775ProUltLin ;
   private String[] T01UK8_A7795ProTipP ;
   private byte[] T01UK8_A8042ProTipT ;
   private String[] T01UK8_A396EmprCod ;
   private short[] T01UK8_A13687ProMaxLin ;
   private boolean[] T01UK8_n13687ProMaxLin ;
   private short[] T01UK10_A13687ProMaxLin ;
   private boolean[] T01UK10_n13687ProMaxLin ;
   private String[] T01UK11_A396EmprCod ;
   private String[] T01UK11_A758ProCod ;
   private String[] T01UK3_A758ProCod ;
   private String[] T01UK3_A759ProDsc ;
   private String[] T01UK3_A4628ProDsc2 ;
   private String[] T01UK3_A6486ProDscF ;
   private String[] T01UK3_A14284ProEst ;
   private String[] T01UK3_A5289ProProvi ;
   private short[] T01UK3_A775ProUltLin ;
   private String[] T01UK3_A7795ProTipP ;
   private byte[] T01UK3_A8042ProTipT ;
   private String[] T01UK3_A396EmprCod ;
   private String[] T01UK12_A396EmprCod ;
   private String[] T01UK12_A758ProCod ;
   private String[] T01UK13_A396EmprCod ;
   private String[] T01UK13_A758ProCod ;
   private String[] T01UK2_A758ProCod ;
   private String[] T01UK2_A759ProDsc ;
   private String[] T01UK2_A4628ProDsc2 ;
   private String[] T01UK2_A6486ProDscF ;
   private String[] T01UK2_A14284ProEst ;
   private String[] T01UK2_A5289ProProvi ;
   private short[] T01UK2_A775ProUltLin ;
   private String[] T01UK2_A7795ProTipP ;
   private byte[] T01UK2_A8042ProTipT ;
   private String[] T01UK2_A396EmprCod ;
   private short[] T01UK18_A13687ProMaxLin ;
   private boolean[] T01UK18_n13687ProMaxLin ;
   private String[] T01UK19_A396EmprCod ;
   private int[] T01UK19_A13026PedDGId ;
   private String[] T01UK19_A758ProCod ;
   private String[] T01UK20_A396EmprCod ;
   private String[] T01UK20_A12851ProCodID ;
   private String[] T01UK20_A758ProCod ;
   private String[] T01UK21_A396EmprCod ;
   private int[] T01UK21_A252CliCod ;
   private String[] T01UK21_A4589FFProCod ;
   private String[] T01UK22_A396EmprCod ;
   private int[] T01UK22_A252CliCod ;
   private String[] T01UK22_A10839Txt_Cor ;
   private String[] T01UK22_A758ProCod ;
   private String[] T01UK23_A396EmprCod ;
   private short[] T01UK23_A2248ManCod ;
   private String[] T01UK23_A5835ManFasCod ;
   private String[] T01UK23_A758ProCod ;
   private String[] T01UK24_A396EmprCod ;
   private int[] T01UK24_A7843Int_Num ;
   private String[] T01UK24_A758ProCod ;
   private String[] T01UK25_A396EmprCod ;
   private int[] T01UK25_A4618EnsLCod ;
   private String[] T01UK25_A758ProCod ;
   private String[] T01UK26_A396EmprCod ;
   private String[] T01UK26_A758ProCod ;
   private short[] T01UK26_A774ProNumLin ;
   private String[] T01UK27_A396EmprCod ;
   private int[] T01UK27_A361DisCod ;
   private String[] T01UK27_A758ProCod ;
   private String[] T01UK28_A396EmprCod ;
   private int[] T01UK28_A129BarCod ;
   private byte[] T01UK28_A132BarCodReo ;
   private String[] T01UK28_A130BarCodPar ;
   private String[] T01UK28_A758ProCod ;
   private String[] T01UK29_A396EmprCod ;
   private int[] T01UK29_A252CliCod ;
   private String[] T01UK29_A65ArtCod ;
   private String[] T01UK29_A758ProCod ;
   private String[] T01UK30_A396EmprCod ;
   private String[] T01UK30_A758ProCod ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPContext AV9WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV10TrnContext ;
}

final  class tproces_trn__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_trn__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_trn__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_trn__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces_trn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T01UK2", "SELECT ProCod, ProDsc, ProDsc2, ProDscF, ProEst, ProProvi, ProUltLin, ProTipP, ProTipT, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ?  FOR UPDATE OF ProDsc, ProDsc2, ProDscF, ProEst, ProProvi, ProUltLin, ProTipP, ProTipT NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK3", "SELECT ProCod, ProDsc, ProDsc2, ProDscF, ProEst, ProProvi, ProUltLin, ProTipP, ProTipT, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK4", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK6", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK8", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProCod, TM1.ProDsc, TM1.ProDsc2, TM1.ProDscF, TM1.ProEst, TM1.ProProvi, T2.EmprNom, TM1.ProUltLin, TM1.ProTipP, TM1.ProTipT, TM1.EmprCod, COALESCE( T3.ProMaxLin, 0) AS ProMaxLin FROM ((TXPPROCES TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK10", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK11", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK12", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( EmprCod > ? or EmprCod = ? and ProCod > ?) ORDER BY EmprCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK13", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( EmprCod < ? or EmprCod = ? and ProCod < ?) ORDER BY EmprCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T01UK14", "INSERT INTO TXPPROCES(ProCod, ProDsc, ProDsc2, ProDscF, ProEst, ProProvi, ProUltLin, ProTipP, ProTipT, EmprCod, ProDscM, ProImBmp, ProImBmp2, ProImBmp3, ProImBmp4, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T01UK15", "UPDATE TXPPROCES SET ProDsc=?, ProDsc2=?, ProDscF=?, ProEst=?, ProProvi=?, ProUltLin=?, ProTipP=?, ProTipT=?  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T01UK16", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new ForEachCursor("T01UK18", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T01UK19", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod FROM TXPPEDDG4 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK20", "SELECT * FROM (SELECT EmprCod, ProCodID, ProCod FROM TXPPROCo1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK21", "SELECT * FROM (SELECT EmprCod, CliCod, FFProCod FROM TXPFasFCl WHERE EmprCod = ? AND FFProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK22", "SELECT * FROM (SELECT EmprCod, CliCod, Txt_Cor, ProCod FROM TXPPRE001 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK23", "SELECT * FROM (SELECT EmprCod, ManCod, ManFasCod, ProCod FROM TXPPREMFP WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK24", "SELECT * FROM (SELECT EmprCod, Int_Num, ProCod FROM TXPOTPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK25", "SELECT * FROM (SELECT EmprCod, EnsLCod, ProCod FROM TXPENSLA1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK26", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK27", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK28", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK29", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T01UK30", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod FROM TXPPROCES ORDER BY EmprCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((short[]) buf[6])[0] = rslt.getShort(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 2);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 2);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 5 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 12 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 100);
               stmt.setString(4, (String)parms[3], 60);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setString(8, (String)parms[7], 2);
               stmt.setByte(9, ((Number) parms[8]).byteValue());
               stmt.setString(10, (String)parms[9], 3);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 100);
               stmt.setString(3, (String)parms[2], 60);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setString(7, (String)parms[6], 2);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
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
               return;
            case 16 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 17 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 18 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 19 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 20 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 21 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 22 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 23 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

