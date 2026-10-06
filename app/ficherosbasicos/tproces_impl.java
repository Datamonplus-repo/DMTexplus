package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tproces_impl extends GXDataArea
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
         A758ProCod = httpContext.GetPar( "ProCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_20( A396EmprCod, A758ProCod) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_22") == 0 )
      {
         A396EmprCod = httpContext.GetPar( "EmprCod") ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A457FasCod = httpContext.GetPar( "FasCod") ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_22( A396EmprCod, A457FasCod) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridlevel_fase") == 0 )
      {
         gxnrgridlevel_fase_newrow_invoke( ) ;
         return  ;
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
            AV58EmprCod = httpContext.GetPar( "EmprCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58EmprCod", AV58EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
            AV59ProCod = httpContext.GetPar( "ProCod") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59ProCod", AV59ProCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59ProCod, ""))));
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
         Form.getMeta().addItem("description", httpContext.getMessage( "PROCESOS DE PRODUCCION", ""), (short)(0)) ;
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

   public void gxnrgridlevel_fase_newrow_invoke( )
   {
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
      A775ProUltLin = (short)(GXutil.lval( httpContext.GetPar( "ProUltLin"))) ;
      Gx_BScreen = (byte)(GXutil.lval( httpContext.GetPar( "Gx_BScreen"))) ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridlevel_fase_newrow( ) ;
      /* End function gxnrGridlevel_fase_newrow_invoke */
   }

   public tproces_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tproces_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_impl.class ));
   }

   public tproces_impl( int remoteHandle ,
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
      app.GxWebStd.gx_label_element( httpContext, edtProCod_Internalname, httpContext.getMessage( "Codigo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProCod_Internalname, GXutil.rtrim( A758ProCod), GXutil.rtrim( localUtil.format( A758ProCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProCod_Enabled, 1, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPROCES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCellFL RequiredDataContentCellFL", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc_Internalname, GXutil.rtrim( A759ProDsc), GXutil.rtrim( localUtil.format( A759ProDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPROCES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DataContentCell", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDsc2_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDsc2_Internalname, httpContext.getMessage( "Descripcion (cont)", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDsc2_Internalname, GXutil.rtrim( A4628ProDsc2), GXutil.rtrim( localUtil.format( A4628ProDsc2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDsc2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDsc2_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPROCES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop30", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, cmbProEst.getInternalname(), httpContext.getMessage( "Estado Proceso", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'',0)\"" ;
      /* ComboBox */
      app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbProEst, cmbProEst.getInternalname(), GXutil.rtrim( A14284ProEst), 1, cmbProEst.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbProEst.getEnabled(), 1, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_FicherosBasicos\\TPROCES.htm");
      cmbProEst.setValue( GXutil.rtrim( A14284ProEst) );
      httpContext.ajax_rsp_assign_prop("", false, cmbProEst.getInternalname(), "Values", cmbProEst.ToJavascriptSource(), true);
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtProDscF_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      app.GxWebStd.gx_label_element( httpContext, edtProDscF_Internalname, httpContext.getMessage( "Descripcion Factura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      app.GxWebStd.gx_single_line_edit( httpContext, edtProDscF_Internalname, GXutil.rtrim( A6486ProDscF), GXutil.rtrim( localUtil.format( A6486ProDscF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtProDscF_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtProDscF_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPROCES.htm");
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
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, divTableleaflevel_fase_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid EditableGridCell_LinedAtts", "left", "top", "", "", "div");
      gxdraw_gridlevel_fase( ) ;
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
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "ButtonMaterial" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_enter_Internalname, "", httpContext.getMessage( "GX_BtnEnter", ""), bttBtntrn_enter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, bttBtntrn_enter_Visible, bttBtntrn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TPROCES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_cancel_Internalname, "", httpContext.getMessage( "GX_BtnCancel", ""), bttBtntrn_cancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, bttBtntrn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TPROCES.htm");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
      ClassString = "ButtonMaterialDefault" ;
      StyleString = "" ;
      app.GxWebStd.gx_button_ctrl( httpContext, bttBtntrn_delete_Internalname, "", httpContext.getMessage( "GX_BtnDelete", ""), bttBtntrn_delete_Jsonclick, 5, httpContext.getMessage( "GX_BtnDelete", ""), "", StyleString, ClassString, bttBtntrn_delete_Visible, bttBtntrn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\TPROCES.htm");
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
      app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV64Pgmname), GXutil.rtrim( localUtil.format( AV64Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\TPROCES.htm");
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
      /* User Defined Control */
      ucCombo_fascod.setProperty("Caption", Combo_fascod_Caption);
      ucCombo_fascod.setProperty("Cls", Combo_fascod_Cls);
      ucCombo_fascod.setProperty("IsGridItem", Combo_fascod_Isgriditem);
      ucCombo_fascod.setProperty("EmptyItem", Combo_fascod_Emptyitem);
      ucCombo_fascod.setProperty("DropDownOptionsData", AV60FasCod_Data);
      ucCombo_fascod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_fascod_Internalname, "COMBO_FASCODContainer");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void gxdraw_gridlevel_fase( )
   {
      /*  Grid Control  */
      startgridcontrol50( ) ;
      nGXsfl_50_idx = 0 ;
      if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
      {
         /* Enter key processing. */
         nBlankRcdCount88 = (short)(subGridlevel_fase_Rows) ;
         if ( ! isIns( ) )
         {
            /* Display confirmed (stored) records */
            nRcdExists_88 = (short)(1) ;
            scanStart2388( ) ;
            while ( RcdFound88 != 0 )
            {
               init_level_properties88( ) ;
               getByPrimaryKey2388( ) ;
               addRow2388( ) ;
               scanNext2388( ) ;
            }
            scanEnd2388( ) ;
            nBlankRcdCount88 = (short)(subGridlevel_fase_Rows) ;
         }
      }
      else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
      {
         /* Button check  or addlines. */
         B775ProUltLin = A775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         standaloneNotModal2388( ) ;
         standaloneModal2388( ) ;
         sMode88 = Gx_mode ;
         while ( nGXsfl_50_idx < nRC_GXsfl_50 )
         {
            bGXsfl_50_Refreshing = true ;
            readRow2388( ) ;
            edtProNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRONUMLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASVELPRO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasConPla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCONPLA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasConPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasConPla_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACAB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_50_Refreshing);
            if ( ( nRcdExists_88 == 0 ) && ! isIns( ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               standaloneModal2388( ) ;
            }
            sendRow2388( ) ;
            bGXsfl_50_Refreshing = false ;
         }
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A775ProUltLin = B775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      }
      else
      {
         /* Get or get-alike key processing. */
         nBlankRcdCount88 = (short)(subGridlevel_fase_Rows) ;
         nRcdExists_88 = (short)(1) ;
         if ( ! isIns( ) )
         {
            scanStart2388( ) ;
            while ( RcdFound88 != 0 )
            {
               sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
               subsflControlProps_5088( ) ;
               init_level_properties88( ) ;
               standaloneNotModal2388( ) ;
               getByPrimaryKey2388( ) ;
               standaloneModal2388( ) ;
               addRow2388( ) ;
               scanNext2388( ) ;
            }
            scanEnd2388( ) ;
         }
      }
      /* Initialize fields for 'new' records and send them. */
      if ( ! isDsp( ) && ! isDlt( ) )
      {
         sMode88 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx+1), 4, 0), (short)(4), "0") ;
         subsflControlProps_5088( ) ;
         initAll2388( ) ;
         init_level_properties88( ) ;
         B775ProUltLin = A775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         nRcdExists_88 = (short)(0) ;
         nIsMod_88 = (short)(0) ;
         nRcdDeleted_88 = (short)(0) ;
         nBlankRcdCount88 = (short)(nBlankRcdUsr88+nBlankRcdCount88) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount88 > 0 )
         {
            standaloneNotModal2388( ) ;
            standaloneModal2388( ) ;
            addRow2388( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtProNumLin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount88 = (short)(nBlankRcdCount88-1) ;
         }
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A775ProUltLin = B775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      }
      sStyleString = "" ;
      httpContext.writeText( "<div id=\""+"Gridlevel_faseContainer"+"Div\" "+sStyleString+">"+"</div>") ;
      httpContext.ajax_rsp_assign_grid("_"+"Gridlevel_fase", Gridlevel_faseContainer, subGridlevel_fase_Internalname);
      if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_faseContainerData", Gridlevel_faseContainer.ToJavascriptSource());
      }
      if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
      {
         app.GxWebStd.gx_hidden_field( httpContext, "Gridlevel_faseContainerData"+"V", Gridlevel_faseContainer.GridValuesHidden());
      }
      else
      {
         httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridlevel_faseContainerData"+"V"+"\" value='"+Gridlevel_faseContainer.GridValuesHidden()+"'/>") ;
      }
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
      e11232 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFASCOD_DATA"), AV60FasCod_Data);
            /* Read saved values. */
            Z396EmprCod = httpContext.cgiGet( "Z396EmprCod") ;
            Z758ProCod = httpContext.cgiGet( "Z758ProCod") ;
            Z759ProDsc = httpContext.cgiGet( "Z759ProDsc") ;
            Z4628ProDsc2 = httpContext.cgiGet( "Z4628ProDsc2") ;
            Z5289ProProvi = httpContext.cgiGet( "Z5289ProProvi") ;
            Z775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z775ProUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z6486ProDscF = httpContext.cgiGet( "Z6486ProDscF") ;
            Z7795ProTipP = httpContext.cgiGet( "Z7795ProTipP") ;
            Z8042ProTipT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8042ProTipT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Z14284ProEst = httpContext.cgiGet( "Z14284ProEst") ;
            A5289ProProvi = httpContext.cgiGet( "Z5289ProProvi") ;
            A775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "Z775ProUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A7795ProTipP = httpContext.cgiGet( "Z7795ProTipP") ;
            A8042ProTipT = (byte)(localUtil.ctol( httpContext.cgiGet( "Z8042ProTipT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            O775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "O775ProUltLin"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13771ProCDsc = httpContext.cgiGet( "PROCDSC") ;
            AV58EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
            A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
            AV59ProCod = httpContext.cgiGet( "vPROCOD") ;
            Gx_BScreen = (byte)(localUtil.ctol( httpContext.cgiGet( "vGXBSCREEN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A5289ProProvi = httpContext.cgiGet( "PROPROVI") ;
            A7795ProTipP = httpContext.cgiGet( "PROTIPP") ;
            A8042ProTipT = (byte)(localUtil.ctol( httpContext.cgiGet( "PROTIPT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A775ProUltLin = (short)(localUtil.ctol( httpContext.cgiGet( "PROULTLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A407EmprNom = httpContext.cgiGet( "EMPRNOM") ;
            n407EmprNom = false ;
            A13687ProMaxLin = (short)(localUtil.ctol( httpContext.cgiGet( "PROMAXLIN"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n13687ProMaxLin = false ;
            A6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( "PROULTFP"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A460FasDsc = httpContext.cgiGet( "FASDSC") ;
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
            /* Read variables values. */
            A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
            A4628ProDsc2 = httpContext.cgiGet( edtProDsc2_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
            cmbProEst.setName( cmbProEst.getInternalname() );
            cmbProEst.setValue( httpContext.cgiGet( cmbProEst.getInternalname()) );
            A14284ProEst = httpContext.cgiGet( cmbProEst.getInternalname()) ;
            httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
            A6486ProDscF = httpContext.cgiGet( edtProDscF_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
            AV64Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
            forbiddenHiddens = new com.genexus.util.GXProperties() ;
            forbiddenHiddens.add("hshsalt", "hsh"+"TPROCES");
            forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
            forbiddenHiddens.add("ProProvi", GXutil.rtrim( localUtil.format( A5289ProProvi, "@!")));
            forbiddenHiddens.add("ProTipP", GXutil.rtrim( localUtil.format( A7795ProTipP, "")));
            forbiddenHiddens.add("ProTipT", localUtil.format( DecimalUtil.doubleToDec(A8042ProTipT), "9"));
            hsh = httpContext.cgiGet( "hsh") ;
            if ( ( ! ( ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) ) || ( GXutil.strcmp(Gx_mode, "INS") == 0 ) ) && ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
            {
               GXutil.writeLogError("ficherosbasicos\\tproces:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
               GxWebError = (byte)(1) ;
               httpContext.sendError( 403 );
               GXutil.writeLog("send_http_error_code 403");
               AnyError = (short)(1) ;
               return  ;
            }
            /* Check if conditions changed and reset current page numbers */
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
                        confirm_230( ) ;
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
                        e11232 ();
                     }
                     else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        dynload_actions( ) ;
                        /* Execute user event: After Trn */
                        e12232 ();
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
                     sEvtType = GXutil.right( sEvt, 4) ;
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
         e12232 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2387( ) ;
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
         disableAttributes2387( ) ;
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

   public void confirm_230( )
   {
      beforeValidate2387( ) ;
      if ( AnyError == 0 )
      {
         if ( isDlt( ) )
         {
            onDeleteControls2387( ) ;
         }
         else
         {
            checkExtendedTable2387( ) ;
            closeExtendedTableCursors2387( ) ;
         }
      }
      if ( AnyError == 0 )
      {
         /* Save parent mode. */
         sMode87 = Gx_mode ;
         confirm_2388( ) ;
         if ( AnyError == 0 )
         {
            /* Restore parent mode. */
            Gx_mode = sMode87 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            IsConfirmed = (short)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
         }
         /* Restore parent mode. */
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
   }

   public void confirm_2388( )
   {
      s775ProUltLin = O775ProUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow2388( ) ;
         if ( ( nRcdExists_88 != 0 ) || ( nIsMod_88 != 0 ) )
         {
            getKey2388( ) ;
            if ( ( nRcdExists_88 == 0 ) && ( nRcdDeleted_88 == 0 ) )
            {
               if ( RcdFound88 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate2388( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable2388( ) ;
                     closeExtendedTableCursors2388( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                     }
                     O775ProUltLin = A775ProUltLin ;
                     httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
                  }
               }
               else
               {
                  GXCCtl = "PRONUMLIN_" + sGXsfl_50_idx ;
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, GXCCtl);
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtProNumLin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound88 != 0 )
               {
                  if ( nRcdDeleted_88 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey2388( ) ;
                     load2388( ) ;
                     beforeValidate2388( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls2388( ) ;
                        O775ProUltLin = A775ProUltLin ;
                        httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
                     }
                  }
                  else
                  {
                     if ( nIsMod_88 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate2388( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable2388( ) ;
                           closeExtendedTableCursors2388( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
                           }
                           O775ProUltLin = A775ProUltLin ;
                           httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_88 == 0 )
                  {
                     GXCCtl = "PRONUMLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProNumLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasConPla_Internalname, GXutil.rtrim( A4299FasConPla)) ;
         httpContext.changePostValue( edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( "ZT_"+"Z774ProNumLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6437ProUltFP_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_88_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_88_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_88_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_88 != 0 )
         {
            httpContext.changePostValue( "PRONUMLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCONPLA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACAB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      O775ProUltLin = s775ProUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      /* Start of After( level) rules */
      /* Using cursor T00236 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13687ProMaxLin = T00236_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00236_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      /* End of After( level) rules */
   }

   public void resetCaption230( )
   {
   }

   public void e11232( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV33Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      tproces_impl.this.GXt_char1 = GXv_char2[0] ;
      AV33Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Station", AV33Station);
      GXv_char2[0] = AV58EmprCod ;
      GXv_char3[0] = AV16EmprNom ;
      GXv_char4[0] = AV17UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char2, GXv_char3, GXv_char4) ;
      tproces_impl.this.AV58EmprCod = GXv_char2[0] ;
      tproces_impl.this.AV16EmprNom = GXv_char3[0] ;
      tproces_impl.this.AV17UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58EmprCod", AV58EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprNom", AV16EmprNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV17UsurCod", AV17UsurCod);
      GXv_SdtWWPContext5[0] = AV52WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV52WWPContext = GXv_SdtWWPContext5[0] ;
      Combo_fascod_Titlecontrolidtoreplace = edtFasCod_Internalname ;
      ucCombo_fascod.sendProperty(context, "", false, Combo_fascod_Internalname, "TitleControlIdToReplace", Combo_fascod_Titlecontrolidtoreplace);
      /* Execute user subroutine: 'LOADCOMBOFASCOD' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(6);
         pr_default.close(5);
         pr_default.close(3);
         pr_default.close(2);
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      AV53TrnContext.fromxml(AV54WebSession.getValue("TrnContext"), null, null);
      subGridlevel_fase_Rows = 0 ;
   }

   public void e12232( )
   {
      /* After Trn Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) && ! AV53TrnContext.getgxTv_SdtWWPTransactionContext_Callerondelete() )
      {
         callWebObject(formatLink("app.ficherosbasicos.tprocesww", new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      pr_default.close(6);
      pr_default.close(5);
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
      GXt_objcol_SdtDVB_SDTComboData_Item6 = AV60FasCod_Data ;
      GXv_char4[0] = AV61ComboSelectedValue ;
      GXv_objcol_SdtDVB_SDTComboData_Item7[0] = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
      new app.ficherosbasicos.tprocesloaddvcombo(remoteHandle, context).execute( "FasCod", Gx_mode, AV58EmprCod, AV59ProCod, GXv_char4, GXv_objcol_SdtDVB_SDTComboData_Item7) ;
      tproces_impl.this.AV61ComboSelectedValue = GXv_char4[0] ;
      GXt_objcol_SdtDVB_SDTComboData_Item6 = GXv_objcol_SdtDVB_SDTComboData_Item7[0] ;
      AV60FasCod_Data = GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   }

   public void zm2387( int GX_JID )
   {
      if ( ( GX_JID == 18 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z759ProDsc = T00238_A759ProDsc[0] ;
            Z4628ProDsc2 = T00238_A4628ProDsc2[0] ;
            Z5289ProProvi = T00238_A5289ProProvi[0] ;
            Z775ProUltLin = T00238_A775ProUltLin[0] ;
            Z6486ProDscF = T00238_A6486ProDscF[0] ;
            Z7795ProTipP = T00238_A7795ProTipP[0] ;
            Z8042ProTipT = T00238_A8042ProTipT[0] ;
            Z14284ProEst = T00238_A14284ProEst[0] ;
         }
         else
         {
            Z759ProDsc = A759ProDsc ;
            Z4628ProDsc2 = A4628ProDsc2 ;
            Z5289ProProvi = A5289ProProvi ;
            Z775ProUltLin = A775ProUltLin ;
            Z6486ProDscF = A6486ProDscF ;
            Z7795ProTipP = A7795ProTipP ;
            Z8042ProTipT = A8042ProTipT ;
            Z14284ProEst = A14284ProEst ;
         }
      }
      if ( GX_JID == -18 )
      {
         Z758ProCod = A758ProCod ;
         Z759ProDsc = A759ProDsc ;
         Z4628ProDsc2 = A4628ProDsc2 ;
         Z5289ProProvi = A5289ProProvi ;
         Z775ProUltLin = A775ProUltLin ;
         Z6486ProDscF = A6486ProDscF ;
         Z7795ProTipP = A7795ProTipP ;
         Z8042ProTipT = A8042ProTipT ;
         Z14284ProEst = A14284ProEst ;
         Z396EmprCod = A396EmprCod ;
         Z407EmprNom = A407EmprNom ;
         Z13687ProMaxLin = A13687ProMaxLin ;
      }
   }

   public void standaloneNotModal( )
   {
      AV64Pgmname = "FicherosBasicos.TPROCES" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Pgmname", AV64Pgmname);
      Gx_BScreen = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      bttBtntrn_delete_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtntrn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtntrn_delete_Enabled), 5, 0), true);
      if ( ! (GXutil.strcmp("", AV58EmprCod)==0) )
      {
         A396EmprCod = AV58EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      }
      /* Using cursor T00239 */
      pr_default.execute(6, new Object[] {A396EmprCod});
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "EMPRESAS", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "EMPRCOD");
         AnyError = (short)(1) ;
      }
      A407EmprNom = T00239_A407EmprNom[0] ;
      n407EmprNom = T00239_n407EmprNom[0] ;
      pr_default.close(6);
      if ( ! (GXutil.strcmp("", AV59ProCod)==0) )
      {
         A758ProCod = AV59ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      if ( ! (GXutil.strcmp("", AV59ProCod)==0) )
      {
         edtProCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      else
      {
         edtProCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      }
      if ( ! (GXutil.strcmp("", AV59ProCod)==0) )
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
         /* Using cursor T00236 */
         pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(3) != 101) )
         {
            A13687ProMaxLin = T00236_A13687ProMaxLin[0] ;
            n13687ProMaxLin = T00236_n13687ProMaxLin[0] ;
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

   public void load2387( )
   {
      /* Using cursor T002311 */
      pr_default.execute(7, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A759ProDsc = T002311_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = T002311_A4628ProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A5289ProProvi = T002311_A5289ProProvi[0] ;
         A407EmprNom = T002311_A407EmprNom[0] ;
         n407EmprNom = T002311_n407EmprNom[0] ;
         A775ProUltLin = T002311_A775ProUltLin[0] ;
         A6486ProDscF = T002311_A6486ProDscF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
         A7795ProTipP = T002311_A7795ProTipP[0] ;
         A8042ProTipT = T002311_A8042ProTipT[0] ;
         A14284ProEst = T002311_A14284ProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
         A13687ProMaxLin = T002311_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T002311_n13687ProMaxLin[0] ;
         zm2387( -18) ;
      }
      pr_default.close(7);
      onLoadActions2387( ) ;
   }

   public void onLoadActions2387( )
   {
      A13771ProCDsc = GXutil.trim( A758ProCod) + "-" + GXutil.trim( A759ProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
   }

   public void checkExtendedTable2387( )
   {
      nIsDirty_87 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal( ) ;
      nIsDirty_87 = (short)(1) ;
      A13771ProCDsc = GXutil.trim( A758ProCod) + "-" + GXutil.trim( A759ProDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
      if ( (GXutil.strcmp("", A759ProDsc)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Descripcion Proceso es requerido.", ""), 1, "PRODSC");
         AnyError = (short)(1) ;
         GX_FocusControl = edtProDsc_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( ( GXutil.strcmp(A14284ProEst, "A") == 0 ) || ( GXutil.strcmp(A14284ProEst, "I") == 0 ) ) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_OutOfRange", ""), httpContext.getMessage( "Estado Proceso", ""), "", "", "", "", "", "", "", ""), "OutOfRange", 1, "PROEST");
         AnyError = (short)(1) ;
         GX_FocusControl = cmbProEst.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      /* Using cursor T00236 */
      pr_default.execute(3, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(3) != 101) )
      {
         A13687ProMaxLin = T00236_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T00236_n13687ProMaxLin[0] ;
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

   public void closeExtendedTableCursors2387( )
   {
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_20( String A396EmprCod ,
                          String A758ProCod )
   {
      /* Using cursor T002313 */
      pr_default.execute(8, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(8) != 101) )
      {
         A13687ProMaxLin = T002313_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T002313_n13687ProMaxLin[0] ;
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
      if ( (pr_default.getStatus(8) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(8);
   }

   public void getKey2387( )
   {
      /* Using cursor T002314 */
      pr_default.execute(9, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound87 = (short)(1) ;
      }
      else
      {
         RcdFound87 = (short)(0) ;
      }
      pr_default.close(9);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00238 */
      pr_default.execute(5, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(5) != 101) )
      {
         zm2387( 18) ;
         RcdFound87 = (short)(1) ;
         A758ProCod = T00238_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
         A759ProDsc = T00238_A759ProDsc[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
         A4628ProDsc2 = T00238_A4628ProDsc2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
         A5289ProProvi = T00238_A5289ProProvi[0] ;
         A775ProUltLin = T00238_A775ProUltLin[0] ;
         A6486ProDscF = T00238_A6486ProDscF[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
         A7795ProTipP = T00238_A7795ProTipP[0] ;
         A8042ProTipT = T00238_A8042ProTipT[0] ;
         A14284ProEst = T00238_A14284ProEst[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
         A396EmprCod = T00238_A396EmprCod[0] ;
         O775ProUltLin = A775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2387( ) ;
         if ( AnyError == 1 )
         {
            RcdFound87 = (short)(0) ;
            initializeNonKey2387( ) ;
         }
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound87 = (short)(0) ;
         initializeNonKey2387( ) ;
         sMode87 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode87 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(5);
   }

   public void getEqualNoModal( )
   {
      getKey2387( ) ;
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
      /* Using cursor T002315 */
      pr_default.execute(10, new Object[] {A396EmprCod, A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(10) != 101) )
      {
         while ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T002315_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002315_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002315_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            pr_default.readNext(10);
         }
         if ( (pr_default.getStatus(10) != 101) && ( ( GXutil.strcmp(T002315_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002315_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002315_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            A396EmprCod = T002315_A396EmprCod[0] ;
            A758ProCod = T002315_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(10);
   }

   public void move_previous( )
   {
      RcdFound87 = (short)(0) ;
      /* Using cursor T002316 */
      pr_default.execute(11, new Object[] {A396EmprCod, A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(11) != 101) )
      {
         while ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T002316_A396EmprCod[0], A396EmprCod) > 0 ) || ( GXutil.strcmp(T002316_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002316_A758ProCod[0], A758ProCod) > 0 ) ) )
         {
            pr_default.readNext(11);
         }
         if ( (pr_default.getStatus(11) != 101) && ( ( GXutil.strcmp(T002316_A396EmprCod[0], A396EmprCod) < 0 ) || ( GXutil.strcmp(T002316_A396EmprCod[0], A396EmprCod) == 0 ) && ( GXutil.strcmp(T002316_A758ProCod[0], A758ProCod) < 0 ) ) )
         {
            A396EmprCod = T002316_A396EmprCod[0] ;
            A758ProCod = T002316_A758ProCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
            RcdFound87 = (short)(1) ;
         }
      }
      pr_default.close(11);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2387( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         A775ProUltLin = O775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2387( ) ;
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
               A775ProUltLin = O775ProUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               /* Update record */
               A775ProUltLin = O775ProUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
               update2387( ) ;
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A396EmprCod, Z396EmprCod) != 0 ) || ( GXutil.strcmp(A758ProCod, Z758ProCod) != 0 ) )
            {
               /* Insert record */
               A775ProUltLin = O775ProUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
               GX_FocusControl = edtProCod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2387( ) ;
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
                  A775ProUltLin = O775ProUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
                  GX_FocusControl = edtProCod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2387( ) ;
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
         A775ProUltLin = O775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtProCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
      }
   }

   public void checkOptimisticConcurrency2387( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00237 */
         pr_default.execute(4, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(4) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(4) == 101) || ( GXutil.strcmp(Z759ProDsc, T00237_A759ProDsc[0]) != 0 ) || ( GXutil.strcmp(Z4628ProDsc2, T00237_A4628ProDsc2[0]) != 0 ) || ( GXutil.strcmp(Z5289ProProvi, T00237_A5289ProProvi[0]) != 0 ) || ( Z775ProUltLin != T00237_A775ProUltLin[0] ) || ( GXutil.strcmp(Z6486ProDscF, T00237_A6486ProDscF[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z7795ProTipP, T00237_A7795ProTipP[0]) != 0 ) || ( Z8042ProTipT != T00237_A8042ProTipT[0] ) || ( GXutil.strcmp(Z14284ProEst, T00237_A14284ProEst[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z759ProDsc, T00237_A759ProDsc[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProDsc");
               GXutil.writeLogRaw("Old: ",Z759ProDsc);
               GXutil.writeLogRaw("Current: ",T00237_A759ProDsc[0]);
            }
            if ( GXutil.strcmp(Z4628ProDsc2, T00237_A4628ProDsc2[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProDsc2");
               GXutil.writeLogRaw("Old: ",Z4628ProDsc2);
               GXutil.writeLogRaw("Current: ",T00237_A4628ProDsc2[0]);
            }
            if ( GXutil.strcmp(Z5289ProProvi, T00237_A5289ProProvi[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProProvi");
               GXutil.writeLogRaw("Old: ",Z5289ProProvi);
               GXutil.writeLogRaw("Current: ",T00237_A5289ProProvi[0]);
            }
            if ( Z775ProUltLin != T00237_A775ProUltLin[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProUltLin");
               GXutil.writeLogRaw("Old: ",Z775ProUltLin);
               GXutil.writeLogRaw("Current: ",T00237_A775ProUltLin[0]);
            }
            if ( GXutil.strcmp(Z6486ProDscF, T00237_A6486ProDscF[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProDscF");
               GXutil.writeLogRaw("Old: ",Z6486ProDscF);
               GXutil.writeLogRaw("Current: ",T00237_A6486ProDscF[0]);
            }
            if ( GXutil.strcmp(Z7795ProTipP, T00237_A7795ProTipP[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProTipP");
               GXutil.writeLogRaw("Old: ",Z7795ProTipP);
               GXutil.writeLogRaw("Current: ",T00237_A7795ProTipP[0]);
            }
            if ( Z8042ProTipT != T00237_A8042ProTipT[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProTipT");
               GXutil.writeLogRaw("Old: ",Z8042ProTipT);
               GXutil.writeLogRaw("Current: ",T00237_A8042ProTipT[0]);
            }
            if ( GXutil.strcmp(Z14284ProEst, T00237_A14284ProEst[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProEst");
               GXutil.writeLogRaw("Old: ",Z14284ProEst);
               GXutil.writeLogRaw("Current: ",T00237_A14284ProEst[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROCES"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2387( )
   {
      beforeValidate2387( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2387( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2387( 0) ;
         checkOptimisticConcurrency2387( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2387( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2387( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002317 */
                  pr_default.execute(12, new Object[] {A758ProCod, A759ProDsc, A4628ProDsc2, A5289ProProvi, Short.valueOf(A775ProUltLin), A6486ProDscF, A7795ProTipP, Byte.valueOf(A8042ProTipT), A14284ProEst, A396EmprCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( (pr_default.getStatus(12) == 1) )
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
                        processLevel2387( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                           endTrnMsgCod = "SuccessfullyAdded" ;
                           resetCaption230( ) ;
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
         else
         {
            load2387( ) ;
         }
         endLevel2387( ) ;
      }
      closeExtendedTableCursors2387( ) ;
   }

   public void update2387( )
   {
      beforeValidate2387( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2387( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2387( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2387( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2387( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002318 */
                  pr_default.execute(13, new Object[] {A759ProDsc, A4628ProDsc2, A5289ProProvi, Short.valueOf(A775ProUltLin), A6486ProDscF, A7795ProTipP, Byte.valueOf(A8042ProTipT), A14284ProEst, A396EmprCod, A758ProCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
                  if ( (pr_default.getStatus(13) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROCES"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2387( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel2387( ) ;
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
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel2387( ) ;
      }
      closeExtendedTableCursors2387( ) ;
   }

   public void deferredUpdate2387( )
   {
   }

   public void delete( )
   {
      beforeValidate2387( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2387( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2387( ) ;
         afterConfirm2387( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2387( ) ;
            if ( AnyError == 0 )
            {
               A775ProUltLin = O775ProUltLin ;
               httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
               scanStart2388( ) ;
               while ( RcdFound88 != 0 )
               {
                  getByPrimaryKey2388( ) ;
                  delete2388( ) ;
                  scanNext2388( ) ;
                  O775ProUltLin = A775ProUltLin ;
                  httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
               }
               scanEnd2388( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002319 */
                  pr_default.execute(14, new Object[] {A396EmprCod, A758ProCod});
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
      }
      sMode87 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2387( ) ;
      Gx_mode = sMode87 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2387( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         A13771ProCDsc = GXutil.trim( A758ProCod) + "-" + GXutil.trim( A759ProDsc) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
         /* Using cursor T002321 */
         pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(15) != 101) )
         {
            A13687ProMaxLin = T002321_A13687ProMaxLin[0] ;
            n13687ProMaxLin = T002321_n13687ProMaxLin[0] ;
         }
         else
         {
            A13687ProMaxLin = (short)(0) ;
            n13687ProMaxLin = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
         }
         pr_default.close(15);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002322 */
         pr_default.execute(16, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T002323 */
         pr_default.execute(17, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Procesos", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
         /* Using cursor T002324 */
         pr_default.execute(18, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(18) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Fases Fac. x Cliente (Cab)", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(18);
         /* Using cursor T002325 */
         pr_default.execute(19, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(19) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "Level1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(19);
         /* Using cursor T002326 */
         pr_default.execute(20, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(20) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PREMFP", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(20);
         /* Using cursor T002327 */
         pr_default.execute(21, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(21) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "OTPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(21);
         /* Using cursor T002328 */
         pr_default.execute(22, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(22) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ENSLA1", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(22);
         /* Using cursor T002329 */
         pr_default.execute(23, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(23) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(23);
         /* Using cursor T002330 */
         pr_default.execute(24, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(24) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DISLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(24);
         /* Using cursor T002331 */
         pr_default.execute(25, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(25) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "BARPRO", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(25);
         /* Using cursor T002332 */
         pr_default.execute(26, new Object[] {A396EmprCod, A758ProCod});
         if ( (pr_default.getStatus(26) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "ARTLIN", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(26);
      }
   }

   public void processNestedLevel2388( )
   {
      s775ProUltLin = O775ProUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      nGXsfl_50_idx = 0 ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         readRow2388( ) ;
         if ( ( nRcdExists_88 != 0 ) || ( nIsMod_88 != 0 ) )
         {
            standaloneNotModal2388( ) ;
            getKey2388( ) ;
            if ( ( nRcdExists_88 == 0 ) && ( nRcdDeleted_88 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert2388( ) ;
            }
            else
            {
               if ( RcdFound88 != 0 )
               {
                  if ( ( nRcdDeleted_88 != 0 ) && ( nRcdExists_88 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete2388( ) ;
                  }
                  else
                  {
                     if ( nRcdExists_88 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update2388( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_88 == 0 )
                  {
                     GXCCtl = "PRONUMLIN_" + sGXsfl_50_idx ;
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, GXCCtl);
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtProNumLin_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
            O775ProUltLin = A775ProUltLin ;
            httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
         }
         httpContext.changePostValue( edtProNumLin_Internalname, GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasCod_Internalname, GXutil.rtrim( A457FasCod)) ;
         httpContext.changePostValue( edtFasDec_Internalname, GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtMaqCod_Internalname, GXutil.rtrim( A602MaqCod)) ;
         httpContext.changePostValue( edtFasPreSal_Internalname, GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasPrePie_Internalname, GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasVelPro_Internalname, GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasNumPas_Internalname, GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( edtFasForMul_Internalname, GXutil.rtrim( A4286FasForMul)) ;
         httpContext.changePostValue( edtFasConPla_Internalname, GXutil.rtrim( A4299FasConPla)) ;
         httpContext.changePostValue( edtFasAcab_Internalname, GXutil.rtrim( A4903FasAcab)) ;
         httpContext.changePostValue( edtFasActTin_Internalname, GXutil.rtrim( A456FasActTin)) ;
         httpContext.changePostValue( edtFasCon_Internalname, GXutil.rtrim( A458FasCon)) ;
         httpContext.changePostValue( "ZT_"+"Z774ProNumLin_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z6437ProUltFP_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( Z6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx, GXutil.rtrim( Z457FasCod)) ;
         httpContext.changePostValue( "nRcdDeleted_88_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nRcdExists_88_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         httpContext.changePostValue( "nIsMod_88_"+sGXsfl_50_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), ""))) ;
         if ( nIsMod_88 != 0 )
         {
            httpContext.changePostValue( "PRONUMLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASDEC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "MAQCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPRESAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASPREPIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASVELPRO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASNUMPAS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASFORMUL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCONPLA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACAB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASACTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "FASCON_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* Using cursor T002321 */
      pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13687ProMaxLin = T002321_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T002321_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      }
      /* End of After( level) rules */
      initAll2388( ) ;
      if ( AnyError != 0 )
      {
         O775ProUltLin = s775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      }
      nRcdExists_88 = (short)(0) ;
      nIsMod_88 = (short)(0) ;
      nRcdDeleted_88 = (short)(0) ;
   }

   public void processLevel2387( )
   {
      /* Save parent mode. */
      sMode87 = Gx_mode ;
      processNestedLevel2388( ) ;
      if ( AnyError != 0 )
      {
         O775ProUltLin = s775ProUltLin ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      }
      /* Restore parent mode. */
      Gx_mode = sMode87 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
      /* Using cursor T002333 */
      pr_default.execute(27, new Object[] {Short.valueOf(A775ProUltLin), A396EmprCod, A758ProCod});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROCES");
   }

   public void endLevel2387( )
   {
      pr_default.close(4);
      if ( AnyError == 0 )
      {
         beforeComplete2387( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tproces");
         if ( AnyError == 0 )
         {
            confirmValues230( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tproces");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2387( )
   {
      /* Scan By routine */
      /* Using cursor T002334 */
      pr_default.execute(28);
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A396EmprCod = T002334_A396EmprCod[0] ;
         A758ProCod = T002334_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2387( )
   {
      /* Scan next routine */
      pr_default.readNext(28);
      RcdFound87 = (short)(0) ;
      if ( (pr_default.getStatus(28) != 101) )
      {
         RcdFound87 = (short)(1) ;
         A396EmprCod = T002334_A396EmprCod[0] ;
         A758ProCod = T002334_A758ProCod[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      }
   }

   public void scanEnd2387( )
   {
      pr_default.close(28);
   }

   public void afterConfirm2387( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2387( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2387( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2387( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2387( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2387( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2387( )
   {
      edtProCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProCod_Enabled), 5, 0), true);
      edtProDsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc_Enabled), 5, 0), true);
      edtProDsc2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDsc2_Enabled), 5, 0), true);
      cmbProEst.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbProEst.getInternalname(), "Enabled", GXutil.ltrimstr( cmbProEst.getEnabled(), 5, 0), true);
      edtProDscF_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDscF_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProDscF_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void zm2388( int GX_JID )
   {
      if ( ( GX_JID == 21 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z6437ProUltFP = T00233_A6437ProUltFP[0] ;
            Z457FasCod = T00233_A457FasCod[0] ;
         }
         else
         {
            Z6437ProUltFP = A6437ProUltFP ;
            Z457FasCod = A457FasCod ;
         }
      }
      if ( GX_JID == -21 )
      {
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         Z6437ProUltFP = A6437ProUltFP ;
         Z396EmprCod = A396EmprCod ;
         Z457FasCod = A457FasCod ;
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

   public void standaloneNotModal2388( )
   {
   }

   public void standaloneModal2388( )
   {
      if ( isDlt( )  || isDsp( )  )
      {
         edtFasCod_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtFasCod_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      if ( isIns( )  )
      {
         A775ProUltLin = (short)(O775ProUltLin+100) ;
         httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      }
      if ( isIns( )  && ( Gx_BScreen == 1 ) )
      {
         A774ProNumLin = A775ProUltLin ;
      }
      if ( isIns( )  && (0==A6437ProUltFP) && ( Gx_BScreen == 0 ) )
      {
         A6437ProUltFP = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
      }
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtProNumLin_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
      else
      {
         edtProNumLin_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      }
   }

   public void load2388( )
   {
      /* Using cursor T002335 */
      pr_default.execute(29, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(29) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A6437ProUltFP = T002335_A6437ProUltFP[0] ;
         A460FasDsc = T002335_A460FasDsc[0] ;
         A459FasDec = T002335_A459FasDec[0] ;
         n459FasDec = T002335_n459FasDec[0] ;
         A469FasPreSal = T002335_A469FasPreSal[0] ;
         n469FasPreSal = T002335_n469FasPreSal[0] ;
         A468FasPrePie = T002335_A468FasPrePie[0] ;
         n468FasPrePie = T002335_n468FasPrePie[0] ;
         A472FasVelPro = T002335_A472FasVelPro[0] ;
         n472FasVelPro = T002335_n472FasVelPro[0] ;
         A464FasNumPas = T002335_A464FasNumPas[0] ;
         n464FasNumPas = T002335_n464FasNumPas[0] ;
         A456FasActTin = T002335_A456FasActTin[0] ;
         n456FasActTin = T002335_n456FasActTin[0] ;
         A458FasCon = T002335_A458FasCon[0] ;
         n458FasCon = T002335_n458FasCon[0] ;
         A4286FasForMul = T002335_A4286FasForMul[0] ;
         n4286FasForMul = T002335_n4286FasForMul[0] ;
         A4299FasConPla = T002335_A4299FasConPla[0] ;
         n4299FasConPla = T002335_n4299FasConPla[0] ;
         A4903FasAcab = T002335_A4903FasAcab[0] ;
         n4903FasAcab = T002335_n4903FasAcab[0] ;
         A457FasCod = T002335_A457FasCod[0] ;
         A602MaqCod = T002335_A602MaqCod[0] ;
         n602MaqCod = T002335_n602MaqCod[0] ;
         zm2388( -21) ;
      }
      pr_default.close(29);
      onLoadActions2388( ) ;
   }

   public void onLoadActions2388( )
   {
   }

   public void checkExtendedTable2388( )
   {
      nIsDirty_88 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_BScreen", GXutil.str( Gx_BScreen, 1, 0));
      standaloneModal2388( ) ;
      /* Using cursor T00234 */
      pr_default.execute(2, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(2) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T00234_A460FasDsc[0] ;
      A459FasDec = T00234_A459FasDec[0] ;
      n459FasDec = T00234_n459FasDec[0] ;
      A469FasPreSal = T00234_A469FasPreSal[0] ;
      n469FasPreSal = T00234_n469FasPreSal[0] ;
      A468FasPrePie = T00234_A468FasPrePie[0] ;
      n468FasPrePie = T00234_n468FasPrePie[0] ;
      A472FasVelPro = T00234_A472FasVelPro[0] ;
      n472FasVelPro = T00234_n472FasVelPro[0] ;
      A464FasNumPas = T00234_A464FasNumPas[0] ;
      n464FasNumPas = T00234_n464FasNumPas[0] ;
      A456FasActTin = T00234_A456FasActTin[0] ;
      n456FasActTin = T00234_n456FasActTin[0] ;
      A458FasCon = T00234_A458FasCon[0] ;
      n458FasCon = T00234_n458FasCon[0] ;
      A4286FasForMul = T00234_A4286FasForMul[0] ;
      n4286FasForMul = T00234_n4286FasForMul[0] ;
      A4299FasConPla = T00234_A4299FasConPla[0] ;
      n4299FasConPla = T00234_n4299FasConPla[0] ;
      A4903FasAcab = T00234_A4903FasAcab[0] ;
      n4903FasAcab = T00234_n4903FasAcab[0] ;
      A602MaqCod = T00234_A602MaqCod[0] ;
      n602MaqCod = T00234_n602MaqCod[0] ;
      pr_default.close(2);
   }

   public void closeExtendedTableCursors2388( )
   {
      pr_default.close(2);
   }

   public void enableDisable2388( )
   {
   }

   public void gxload_22( String A396EmprCod ,
                          String A457FasCod )
   {
      /* Using cursor T002336 */
      pr_default.execute(30, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(30) == 101) )
      {
         GXCCtl = "FASCOD_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      A460FasDsc = T002336_A460FasDsc[0] ;
      A459FasDec = T002336_A459FasDec[0] ;
      n459FasDec = T002336_n459FasDec[0] ;
      A469FasPreSal = T002336_A469FasPreSal[0] ;
      n469FasPreSal = T002336_n469FasPreSal[0] ;
      A468FasPrePie = T002336_A468FasPrePie[0] ;
      n468FasPrePie = T002336_n468FasPrePie[0] ;
      A472FasVelPro = T002336_A472FasVelPro[0] ;
      n472FasVelPro = T002336_n472FasVelPro[0] ;
      A464FasNumPas = T002336_A464FasNumPas[0] ;
      n464FasNumPas = T002336_n464FasNumPas[0] ;
      A456FasActTin = T002336_A456FasActTin[0] ;
      n456FasActTin = T002336_n456FasActTin[0] ;
      A458FasCon = T002336_A458FasCon[0] ;
      n458FasCon = T002336_n458FasCon[0] ;
      A4286FasForMul = T002336_A4286FasForMul[0] ;
      n4286FasForMul = T002336_n4286FasForMul[0] ;
      A4299FasConPla = T002336_A4299FasConPla[0] ;
      n4299FasConPla = T002336_n4299FasConPla[0] ;
      A4903FasAcab = T002336_A4903FasAcab[0] ;
      n4903FasAcab = T002336_n4903FasAcab[0] ;
      A602MaqCod = T002336_A602MaqCod[0] ;
      n602MaqCod = T002336_n602MaqCod[0] ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A460FasDsc))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456FasActTin))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A458FasCon))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4286FasForMul))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4299FasConPla))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A4903FasAcab))+"\""+","+"\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( (pr_default.getStatus(30) == 101) )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(30);
   }

   public void getKey2388( )
   {
      /* Using cursor T002337 */
      pr_default.execute(31, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(31) != 101) )
      {
         RcdFound88 = (short)(1) ;
      }
      else
      {
         RcdFound88 = (short)(0) ;
      }
      pr_default.close(31);
   }

   public void getByPrimaryKey2388( )
   {
      /* Using cursor T00233 */
      pr_default.execute(1, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm2388( 21) ;
         RcdFound88 = (short)(1) ;
         initializeNonKey2388( ) ;
         A774ProNumLin = T00233_A774ProNumLin[0] ;
         A6437ProUltFP = T00233_A6437ProUltFP[0] ;
         A457FasCod = T00233_A457FasCod[0] ;
         Z396EmprCod = A396EmprCod ;
         Z758ProCod = A758ProCod ;
         Z774ProNumLin = A774ProNumLin ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         load2388( ) ;
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound88 = (short)(0) ;
         initializeNonKey2388( ) ;
         sMode88 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal2388( ) ;
         Gx_mode = sMode88 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( isDsp( ) || isDlt( ) )
      {
         disableAttributes2388( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency2388( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T00232 */
         pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z6437ProUltFP != T00232_A6437ProUltFP[0] ) || ( GXutil.strcmp(Z457FasCod, T00232_A457FasCod[0]) != 0 ) )
         {
            if ( Z6437ProUltFP != T00232_A6437ProUltFP[0] )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"ProUltFP");
               GXutil.writeLogRaw("Old: ",Z6437ProUltFP);
               GXutil.writeLogRaw("Current: ",T00232_A6437ProUltFP[0]);
            }
            if ( GXutil.strcmp(Z457FasCod, T00232_A457FasCod[0]) != 0 )
            {
               GXutil.writeLogln("ficherosbasicos.tproces:[seudo value changed for attri]"+"FasCod");
               GXutil.writeLogRaw("Old: ",Z457FasCod);
               GXutil.writeLogRaw("Current: ",T00232_A457FasCod[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TXPPROLIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2388( )
   {
      beforeValidate2388( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2388( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2388( 0) ;
         checkOptimisticConcurrency2388( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2388( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2388( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002338 */
                  pr_default.execute(32, new Object[] {A758ProCod, Short.valueOf(A774ProNumLin), Short.valueOf(A6437ProUltFP), A396EmprCod, A457FasCod});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                  if ( (pr_default.getStatus(32) == 1) )
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
            load2388( ) ;
         }
         endLevel2388( ) ;
      }
      closeExtendedTableCursors2388( ) ;
   }

   public void update2388( )
   {
      beforeValidate2388( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2388( ) ;
      }
      if ( ( nIsMod_88 != 0 ) || ( nIsDirty_88 != 0 ) )
      {
         if ( AnyError == 0 )
         {
            checkOptimisticConcurrency2388( ) ;
            if ( AnyError == 0 )
            {
               afterConfirm2388( ) ;
               if ( AnyError == 0 )
               {
                  beforeUpdate2388( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Using cursor T002339 */
                     pr_default.execute(33, new Object[] {Short.valueOf(A6437ProUltFP), A457FasCod, A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
                     Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
                     if ( (pr_default.getStatus(33) == 103) )
                     {
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TXPPROLIN"}), "RecordIsLocked", 1, "");
                        AnyError = (short)(1) ;
                     }
                     deferredUpdate2388( ) ;
                     if ( AnyError == 0 )
                     {
                        /* Start of After( update) rules */
                        /* End of After( update) rules */
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey2388( ) ;
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
            endLevel2388( ) ;
         }
      }
      closeExtendedTableCursors2388( ) ;
   }

   public void deferredUpdate2388( )
   {
   }

   public void delete2388( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2388( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2388( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2388( ) ;
         afterConfirm2388( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2388( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002340 */
               pr_default.execute(34, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
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
      endLevel2388( ) ;
      Gx_mode = sMode88 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2388( )
   {
      standaloneModal2388( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         /* Using cursor T002341 */
         pr_default.execute(35, new Object[] {A396EmprCod, A457FasCod});
         A460FasDsc = T002341_A460FasDsc[0] ;
         A459FasDec = T002341_A459FasDec[0] ;
         n459FasDec = T002341_n459FasDec[0] ;
         A469FasPreSal = T002341_A469FasPreSal[0] ;
         n469FasPreSal = T002341_n469FasPreSal[0] ;
         A468FasPrePie = T002341_A468FasPrePie[0] ;
         n468FasPrePie = T002341_n468FasPrePie[0] ;
         A472FasVelPro = T002341_A472FasVelPro[0] ;
         n472FasVelPro = T002341_n472FasVelPro[0] ;
         A464FasNumPas = T002341_A464FasNumPas[0] ;
         n464FasNumPas = T002341_n464FasNumPas[0] ;
         A456FasActTin = T002341_A456FasActTin[0] ;
         n456FasActTin = T002341_n456FasActTin[0] ;
         A458FasCon = T002341_A458FasCon[0] ;
         n458FasCon = T002341_n458FasCon[0] ;
         A4286FasForMul = T002341_A4286FasForMul[0] ;
         n4286FasForMul = T002341_n4286FasForMul[0] ;
         A4299FasConPla = T002341_A4299FasConPla[0] ;
         n4299FasConPla = T002341_n4299FasConPla[0] ;
         A4903FasAcab = T002341_A4903FasAcab[0] ;
         n4903FasAcab = T002341_n4903FasAcab[0] ;
         A602MaqCod = T002341_A602MaqCod[0] ;
         n602MaqCod = T002341_n602MaqCod[0] ;
         pr_default.close(35);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T002342 */
         pr_default.execute(36, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(36) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "DT002", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(36);
         /* Using cursor T002343 */
         pr_default.execute(37, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin)});
         if ( (pr_default.getStatus(37) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {httpContext.getMessage( "PROFSA", "")}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(37);
      }
   }

   public void endLevel2388( )
   {
      if ( ! isIns( ) )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2388( )
   {
      /* Scan By routine */
      /* Using cursor T002344 */
      pr_default.execute(38, new Object[] {A396EmprCod, A758ProCod});
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A774ProNumLin = T002344_A774ProNumLin[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2388( )
   {
      /* Scan next routine */
      pr_default.readNext(38);
      RcdFound88 = (short)(0) ;
      if ( (pr_default.getStatus(38) != 101) )
      {
         RcdFound88 = (short)(1) ;
         A774ProNumLin = T002344_A774ProNumLin[0] ;
      }
   }

   public void scanEnd2388( )
   {
      pr_default.close(38);
   }

   public void afterConfirm2388( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2388( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2388( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2388( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2388( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2388( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2388( )
   {
      edtProNumLin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasDec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasDec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasDec_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtMaqCod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtMaqCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtMaqCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasPreSal_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPreSal_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPreSal_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasPrePie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasPrePie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasPrePie_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasVelPro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasVelPro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasVelPro_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasNumPas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasNumPas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasNumPas_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasForMul_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasForMul_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasForMul_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasConPla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasConPla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasConPla_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasAcab_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasAcab_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasAcab_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasActTin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasActTin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasActTin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtFasCon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCon_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void send_integrity_lvl_hashes2388( )
   {
   }

   public void send_integrity_lvl_hashes2387( )
   {
   }

   public void subsflControlProps_5088( )
   {
      edtProNumLin_Internalname = "PRONUMLIN_"+sGXsfl_50_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_50_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_50_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_50_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_50_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_50_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_50_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_50_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_50_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_50_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_50_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_50_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_5088( )
   {
      edtProNumLin_Internalname = "PRONUMLIN_"+sGXsfl_50_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_50_fel_idx ;
      edtFasDec_Internalname = "FASDEC_"+sGXsfl_50_fel_idx ;
      edtMaqCod_Internalname = "MAQCOD_"+sGXsfl_50_fel_idx ;
      edtFasPreSal_Internalname = "FASPRESAL_"+sGXsfl_50_fel_idx ;
      edtFasPrePie_Internalname = "FASPREPIE_"+sGXsfl_50_fel_idx ;
      edtFasVelPro_Internalname = "FASVELPRO_"+sGXsfl_50_fel_idx ;
      edtFasNumPas_Internalname = "FASNUMPAS_"+sGXsfl_50_fel_idx ;
      edtFasForMul_Internalname = "FASFORMUL_"+sGXsfl_50_fel_idx ;
      edtFasConPla_Internalname = "FASCONPLA_"+sGXsfl_50_fel_idx ;
      edtFasAcab_Internalname = "FASACAB_"+sGXsfl_50_fel_idx ;
      edtFasActTin_Internalname = "FASACTTIN_"+sGXsfl_50_fel_idx ;
      edtFasCon_Internalname = "FASCON_"+sGXsfl_50_fel_idx ;
   }

   public void addRow2388( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5088( ) ;
      sendRow2388( ) ;
   }

   public void sendRow2388( )
   {
      Gridlevel_faseRow = GXWebRow.GetNew(context) ;
      if ( subGridlevel_fase_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridlevel_fase_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridlevel_fase_Class, "") != 0 )
         {
            subGridlevel_fase_Linesclass = subGridlevel_fase_Class+"Odd" ;
         }
      }
      else if ( subGridlevel_fase_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridlevel_fase_Backstyle = (byte)(0) ;
         subGridlevel_fase_Backcolor = subGridlevel_fase_Allbackcolor ;
         if ( GXutil.strcmp(subGridlevel_fase_Class, "") != 0 )
         {
            subGridlevel_fase_Linesclass = subGridlevel_fase_Class+"Uniform" ;
         }
      }
      else if ( subGridlevel_fase_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridlevel_fase_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridlevel_fase_Class, "") != 0 )
         {
            subGridlevel_fase_Linesclass = subGridlevel_fase_Class+"Odd" ;
         }
         subGridlevel_fase_Backcolor = (int)(0x0) ;
      }
      else if ( subGridlevel_fase_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridlevel_fase_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
         {
            subGridlevel_fase_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_fase_Class, "") != 0 )
            {
               subGridlevel_fase_Linesclass = subGridlevel_fase_Class+"Even" ;
            }
         }
         else
         {
            subGridlevel_fase_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridlevel_fase_Class, "") != 0 )
            {
               subGridlevel_fase_Linesclass = subGridlevel_fase_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_88_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProNumLin_Internalname,GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A774ProNumLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProNumLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn WWActionColumn WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtProNumLin_Enabled),Integer.valueOf(1),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " data-gxoch1=\"gx.fn.setControlValue('nIsMod_88_" + sGXsfl_50_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_50_idx + "',50)\"" ;
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,52);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn AttributeWidth100Porc AttributeWidth100Porc","",Integer.valueOf(-1),Integer.valueOf(edtFasCod_Enabled),Integer.valueOf(1),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDec_Internalname,GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasDec_Enabled!=0) ? localUtil.format( A459FasDec, "ZZ9.9") : localUtil.format( A459FasDec, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasDec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCod_Internalname,GXutil.rtrim( A602MaqCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtMaqCod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPreSal_Internalname,GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPreSal_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A469FasPreSal), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPreSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasPreSal_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasPrePie_Internalname,GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasPrePie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A468FasPrePie), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasPrePie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasPrePie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasVelPro_Internalname,GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasVelPro_Enabled!=0) ? localUtil.format( A472FasVelPro, "ZZ9.9") : localUtil.format( A472FasVelPro, "ZZ9.9"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasVelPro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasVelPro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasNumPas_Internalname,GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtFasNumPas_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(A464FasNumPas), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasNumPas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasNumPas_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasForMul_Internalname,GXutil.rtrim( A4286FasForMul),GXutil.rtrim( localUtil.format( A4286FasForMul, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasForMul_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasForMul_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasConPla_Internalname,GXutil.rtrim( A4299FasConPla),GXutil.rtrim( localUtil.format( A4299FasConPla, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasConPla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasConPla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasAcab_Internalname,GXutil.rtrim( A4903FasAcab),GXutil.rtrim( localUtil.format( A4903FasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasAcab_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasAcab_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasActTin_Internalname,GXutil.rtrim( A456FasActTin),GXutil.rtrim( localUtil.format( A456FasActTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasActTin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasActTin_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      /* Subfile cell */
      /* Single line edit */
      ROClassString = "Attribute" ;
      Gridlevel_faseRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCon_Internalname,GXutil.rtrim( A458FasCon),GXutil.rtrim( localUtil.format( A458FasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"TrnColumn","",Integer.valueOf(-1),Integer.valueOf(edtFasCon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      httpContext.ajax_sending_grid_row(Gridlevel_faseRow);
      send_integrity_lvl_hashes2388( ) ;
      GXCCtl = "Z774ProNumLin_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z774ProNumLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z6437ProUltFP_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "Z457FasCod_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z457FasCod));
      GXCCtl = "nRcdDeleted_88_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nRcdExists_88_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "nIsMod_88_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_88, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      GXCCtl = "vMODE_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Gx_mode));
      GXCCtl = "vTRNCONTEXT_" + sGXsfl_50_idx ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, GXCCtl, AV53TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(GXCCtl, AV53TrnContext);
      }
      GXCCtl = "vEMPRCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV58EmprCod));
      GXCCtl = "vPROCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV59ProCod));
      GXCCtl = "EMPRCOD_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( A396EmprCod));
      GXCCtl = "PROULTFP_" + sGXsfl_50_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( A6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRONUMLIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDEC_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MAQCOD_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPRESAL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASPREPIE_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASVELPRO_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASNUMPAS_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASFORMUL_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCONPLA_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACAB_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASACTTIN_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCON_"+sGXsfl_50_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridlevel_faseContainer.AddRow(Gridlevel_faseRow);
   }

   public void readRow2388( )
   {
      nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5088( ) ;
      edtProNumLin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "PRONUMLIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasDec_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASDEC_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtMaqCod_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "MAQCOD_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPreSal_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPRESAL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasPrePie_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASPREPIE_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasVelPro_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASVELPRO_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasNumPas_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASNUMPAS_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasForMul_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASFORMUL_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasConPla_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCONPLA_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasAcab_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACAB_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasActTin_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASACTTIN_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      edtFasCon_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "FASCON_"+sGXsfl_50_idx+"Enabled"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
      {
         GXCCtl = "PRONUMLIN_" + sGXsfl_50_idx ;
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, GXCCtl);
         AnyError = (short)(1) ;
         GX_FocusControl = edtProNumLin_Internalname ;
         wbErr = true ;
         A774ProNumLin = (short)(0) ;
      }
      else
      {
         A774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( edtProNumLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
      A459FasDec = localUtil.ctond( httpContext.cgiGet( edtFasDec_Internalname)) ;
      n459FasDec = false ;
      A602MaqCod = httpContext.cgiGet( edtMaqCod_Internalname) ;
      n602MaqCod = false ;
      A469FasPreSal = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPreSal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n469FasPreSal = false ;
      A468FasPrePie = (short)(localUtil.ctol( httpContext.cgiGet( edtFasPrePie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n468FasPrePie = false ;
      A472FasVelPro = localUtil.ctond( httpContext.cgiGet( edtFasVelPro_Internalname)) ;
      n472FasVelPro = false ;
      A464FasNumPas = (short)(localUtil.ctol( httpContext.cgiGet( edtFasNumPas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      n464FasNumPas = false ;
      A4286FasForMul = GXutil.upper( httpContext.cgiGet( edtFasForMul_Internalname)) ;
      n4286FasForMul = false ;
      A4299FasConPla = GXutil.upper( httpContext.cgiGet( edtFasConPla_Internalname)) ;
      n4299FasConPla = false ;
      A4903FasAcab = GXutil.upper( httpContext.cgiGet( edtFasAcab_Internalname)) ;
      n4903FasAcab = false ;
      A456FasActTin = GXutil.upper( httpContext.cgiGet( edtFasActTin_Internalname)) ;
      n456FasActTin = false ;
      A458FasCon = GXutil.upper( httpContext.cgiGet( edtFasCon_Internalname)) ;
      n458FasCon = false ;
      GXCCtl = "Z774ProNumLin_" + sGXsfl_50_idx ;
      Z774ProNumLin = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z6437ProUltFP_" + sGXsfl_50_idx ;
      Z6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "Z457FasCod_" + sGXsfl_50_idx ;
      Z457FasCod = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z6437ProUltFP_" + sGXsfl_50_idx ;
      A6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdDeleted_88_" + sGXsfl_50_idx ;
      nRcdDeleted_88 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nRcdExists_88_" + sGXsfl_50_idx ;
      nRcdExists_88 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "nIsMod_88_" + sGXsfl_50_idx ;
      nIsMod_88 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      GXCCtl = "PROULTFP_" + sGXsfl_50_idx ;
      A6437ProUltFP = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
   }

   public void assign_properties_default( )
   {
      defedtFasCod_Enabled = edtFasCod_Enabled ;
      defedtProNumLin_Enabled = edtProNumLin_Enabled ;
   }

   public void confirmValues230( )
   {
      nGXsfl_50_idx = 0 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_5088( ) ;
      while ( nGXsfl_50_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5088( ) ;
         httpContext.changePostValue( "Z774ProNumLin_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z774ProNumLin_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z774ProNumLin_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z6437ProUltFP_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z6437ProUltFP_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z6437ProUltFP_"+sGXsfl_50_idx) ;
         httpContext.changePostValue( "Z457FasCod_"+sGXsfl_50_idx, httpContext.cgiGet( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z457FasCod_"+sGXsfl_50_idx) ;
      }
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.tproces", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV58EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV59ProCod))}, new String[] {"Gx_mode","EmprCod","ProCod"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", "hsh"+"TPROCES");
      forbiddenHiddens.add("Gx_mode", GXutil.rtrim( localUtil.format( Gx_mode, "@!")));
      forbiddenHiddens.add("ProProvi", GXutil.rtrim( localUtil.format( A5289ProProvi, "@!")));
      forbiddenHiddens.add("ProTipP", GXutil.rtrim( localUtil.format( A7795ProTipP, "")));
      forbiddenHiddens.add("ProTipT", localUtil.format( DecimalUtil.doubleToDec(A8042ProTipT), "9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\tproces:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      app.GxWebStd.gx_hidden_field( httpContext, "Z5289ProProvi", GXutil.rtrim( Z5289ProProvi));
      app.GxWebStd.gx_hidden_field( httpContext, "Z775ProUltLin", GXutil.ltrim( localUtil.ntoc( Z775ProUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z6486ProDscF", GXutil.rtrim( Z6486ProDscF));
      app.GxWebStd.gx_hidden_field( httpContext, "Z7795ProTipP", GXutil.rtrim( Z7795ProTipP));
      app.GxWebStd.gx_hidden_field( httpContext, "Z8042ProTipT", GXutil.ltrim( localUtil.ntoc( Z8042ProTipT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Z14284ProEst", GXutil.rtrim( Z14284ProEst));
      app.GxWebStd.gx_hidden_field( httpContext, "O775ProUltLin", GXutil.ltrim( localUtil.ntoc( O775ProUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Mode", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nGXsfl_50_idx, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFASCOD_DATA", AV60FasCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFASCOD_DATA", AV60FasCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRNCONTEXT", AV53TrnContext);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRNCONTEXT", AV53TrnContext);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRNCONTEXT", getSecureSignedToken( "", AV53TrnContext));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCDSC", A13771ProCDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV58EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV58EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV59ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59ProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGXBSCREEN", GXutil.ltrim( localUtil.ntoc( Gx_BScreen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROPROVI", GXutil.rtrim( A5289ProProvi));
      app.GxWebStd.gx_hidden_field( httpContext, "PROTIPP", GXutil.rtrim( A7795ProTipP));
      app.GxWebStd.gx_hidden_field( httpContext, "PROTIPT", GXutil.ltrim( localUtil.ntoc( A8042ProTipT, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROULTLIN", GXutil.ltrim( localUtil.ntoc( A775ProUltLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRNOM", GXutil.rtrim( A407EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "PROMAXLIN", GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PROULTFP", GXutil.ltrim( localUtil.ntoc( A6437ProUltFP, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Objectcall", GXutil.rtrim( Combo_fascod_Objectcall));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Cls", GXutil.rtrim( Combo_fascod_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Enabled", GXutil.booltostr( Combo_fascod_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Titlecontrolidtoreplace", GXutil.rtrim( Combo_fascod_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Isgriditem", GXutil.booltostr( Combo_fascod_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_FASCOD_Emptyitem", GXutil.booltostr( Combo_fascod_Emptyitem));
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
      return formatLink("app.ficherosbasicos.tproces", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV58EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV59ProCod))}, new String[] {"Gx_mode","EmprCod","ProCod"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.TPROCES" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "PROCESOS DE PRODUCCION", "") ;
   }

   public void initializeNonKey2387( )
   {
      A13771ProCDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13771ProCDsc", A13771ProCDsc);
      A759ProDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A759ProDsc", A759ProDsc);
      A4628ProDsc2 = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A4628ProDsc2", A4628ProDsc2);
      A775ProUltLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      A6486ProDscF = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A6486ProDscF", A6486ProDscF);
      A13687ProMaxLin = (short)(0) ;
      n13687ProMaxLin = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13687ProMaxLin), 4, 0));
      A5289ProProvi = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "A5289ProProvi", A5289ProProvi);
      A7795ProTipP = "*" ;
      httpContext.ajax_rsp_assign_attri("", false, "A7795ProTipP", A7795ProTipP);
      A8042ProTipT = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "A8042ProTipT", GXutil.str( A8042ProTipT, 1, 0));
      A14284ProEst = httpContext.getMessage( "A", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "A14284ProEst", A14284ProEst);
      O775ProUltLin = A775ProUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      Z5289ProProvi = "" ;
      Z775ProUltLin = (short)(0) ;
      Z6486ProDscF = "" ;
      Z7795ProTipP = "" ;
      Z8042ProTipT = (byte)(0) ;
      Z14284ProEst = "" ;
   }

   public void initAll2387( )
   {
      A396EmprCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A758ProCod = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A758ProCod", A758ProCod);
      initializeNonKey2387( ) ;
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

   public void initializeNonKey2388( )
   {
      A457FasCod = "" ;
      A460FasDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A460FasDsc", A460FasDsc);
      A602MaqCod = "" ;
      n602MaqCod = false ;
      A459FasDec = DecimalUtil.ZERO ;
      n459FasDec = false ;
      A469FasPreSal = (short)(0) ;
      n469FasPreSal = false ;
      A468FasPrePie = (short)(0) ;
      n468FasPrePie = false ;
      A472FasVelPro = DecimalUtil.ZERO ;
      n472FasVelPro = false ;
      A464FasNumPas = (short)(0) ;
      n464FasNumPas = false ;
      A456FasActTin = "" ;
      n456FasActTin = false ;
      A458FasCon = "" ;
      n458FasCon = false ;
      A4286FasForMul = "" ;
      n4286FasForMul = false ;
      A4299FasConPla = "" ;
      n4299FasConPla = false ;
      A4903FasAcab = "" ;
      n4903FasAcab = false ;
      A6437ProUltFP = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
      Z6437ProUltFP = (short)(0) ;
      Z457FasCod = "" ;
   }

   public void initAll2388( )
   {
      A774ProNumLin = (short)(0) ;
      initializeNonKey2388( ) ;
   }

   public void standaloneModalInsert2388( )
   {
      A775ProUltLin = i775ProUltLin ;
      httpContext.ajax_rsp_assign_attri("", false, "A775ProUltLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(A775ProUltLin), 4, 0));
      A6437ProUltFP = i6437ProUltFP ;
      httpContext.ajax_rsp_assign_attri("", false, "A6437ProUltFP", GXutil.ltrimstr( DecimalUtil.doubleToDec(A6437ProUltFP), 4, 0));
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821165273", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/tproces.js", "?2026821165273", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_level_properties88( )
   {
      edtFasCod_Enabled = defedtFasCod_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtFasCod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtFasCod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtProNumLin_Enabled = defedtProNumLin_Enabled ;
      httpContext.ajax_rsp_assign_prop("", false, edtProNumLin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtProNumLin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
   }

   public void startgridcontrol50( )
   {
      Gridlevel_faseContainer.AddObjectProperty("GridName", "Gridlevel_fase");
      Gridlevel_faseContainer.AddObjectProperty("Header", subGridlevel_fase_Header);
      Gridlevel_faseContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Gridlevel_faseContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("CmpContext", "");
      Gridlevel_faseContainer.AddObjectProperty("InMasterPage", "false");
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A774ProNumLin, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtProNumLin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A459FasDec, (byte)(5), (byte)(1), ".", "")));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasDec_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.rtrim( A602MaqCod));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtMaqCod_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A469FasPreSal, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPreSal_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A468FasPrePie, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasPrePie_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A472FasVelPro, (byte)(5), (byte)(1), ".", "")));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasVelPro_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A464FasNumPas, (byte)(3), (byte)(0), ".", "")));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasNumPas_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.rtrim( A4286FasForMul));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasForMul_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.rtrim( A4299FasConPla));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasConPla_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.rtrim( A4903FasAcab));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasAcab_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.rtrim( A456FasActTin));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasActTin_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      Gridlevel_faseColumn.AddObjectProperty("Value", GXutil.rtrim( A458FasCon));
      Gridlevel_faseColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtFasCon_Enabled, (byte)(5), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddColumnProperties(Gridlevel_faseColumn);
      Gridlevel_faseContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Selectedindex, (byte)(4), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Allowselection, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Allowhovering, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
      Gridlevel_faseContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridlevel_fase_Collapsed, (byte)(1), (byte)(0), ".", "")));
   }

   public void init_default_properties( )
   {
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtProDsc2_Internalname = "PRODSC2" ;
      cmbProEst.setInternalname( "PROEST" );
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtProDscF_Internalname = "PRODSCF" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtProNumLin_Internalname = "PRONUMLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDec_Internalname = "FASDEC" ;
      edtMaqCod_Internalname = "MAQCOD" ;
      edtFasPreSal_Internalname = "FASPRESAL" ;
      edtFasPrePie_Internalname = "FASPREPIE" ;
      edtFasVelPro_Internalname = "FASVELPRO" ;
      edtFasNumPas_Internalname = "FASNUMPAS" ;
      edtFasForMul_Internalname = "FASFORMUL" ;
      edtFasConPla_Internalname = "FASCONPLA" ;
      edtFasAcab_Internalname = "FASACAB" ;
      edtFasActTin_Internalname = "FASACTTIN" ;
      edtFasCon_Internalname = "FASCON" ;
      divTableleaflevel_fase_Internalname = "TABLELEAFLEVEL_FASE" ;
      bttBtntrn_enter_Internalname = "BTNTRN_ENTER" ;
      bttBtntrn_cancel_Internalname = "BTNTRN_CANCEL" ;
      bttBtntrn_delete_Internalname = "BTNTRN_DELETE" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Combo_fascod_Internalname = "COMBO_FASCOD" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridlevel_fase_Internalname = "GRIDLEVEL_FASE" ;
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
      subGridlevel_fase_Allowcollapsing = (byte)(0) ;
      subGridlevel_fase_Allowselection = (byte)(0) ;
      subGridlevel_fase_Header = "" ;
      Combo_fascod_Enabled = GXutil.toBoolean( -1) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "PROCESOS DE PRODUCCION", "") );
      edtFasCon_Jsonclick = "" ;
      edtFasActTin_Jsonclick = "" ;
      edtFasAcab_Jsonclick = "" ;
      edtFasConPla_Jsonclick = "" ;
      edtFasForMul_Jsonclick = "" ;
      edtFasNumPas_Jsonclick = "" ;
      edtFasVelPro_Jsonclick = "" ;
      edtFasPrePie_Jsonclick = "" ;
      edtFasPreSal_Jsonclick = "" ;
      edtMaqCod_Jsonclick = "" ;
      edtFasDec_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtProNumLin_Jsonclick = "" ;
      subGridlevel_fase_Class = "GridNoBorder WorkWith" ;
      subGridlevel_fase_Backcolorstyle = (byte)(0) ;
      Combo_fascod_Titlecontrolidtoreplace = "" ;
      edtFasCon_Enabled = 0 ;
      edtFasActTin_Enabled = 0 ;
      edtFasAcab_Enabled = 0 ;
      edtFasConPla_Enabled = 0 ;
      edtFasForMul_Enabled = 0 ;
      edtFasNumPas_Enabled = 0 ;
      edtFasVelPro_Enabled = 0 ;
      edtFasPrePie_Enabled = 0 ;
      edtFasPreSal_Enabled = 0 ;
      edtMaqCod_Enabled = 0 ;
      edtFasDec_Enabled = 0 ;
      edtFasCod_Enabled = 1 ;
      edtProNumLin_Enabled = 1 ;
      subGridlevel_fase_Rows = 1 ;
      Combo_fascod_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_fascod_Isgriditem = GXutil.toBoolean( -1) ;
      Combo_fascod_Cls = "ExtendedCombo" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtntrn_delete_Enabled = 0 ;
      bttBtntrn_delete_Visible = 1 ;
      bttBtntrn_cancel_Visible = 1 ;
      bttBtntrn_enter_Enabled = 1 ;
      bttBtntrn_enter_Visible = 1 ;
      edtProDscF_Jsonclick = "" ;
      edtProDscF_Enabled = 1 ;
      cmbProEst.setJsonclick( "" );
      cmbProEst.setEnabled( 1 );
      edtProDsc2_Jsonclick = "" ;
      edtProDsc2_Enabled = 1 ;
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

   public void gxnrgridlevel_fase_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_5088( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal2388( ) ;
         standaloneModal2388( ) ;
         init_web_controls( ) ;
         dynload_actions( ) ;
         sendRow2388( ) ;
         nGXsfl_50_idx = (int)(nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_5088( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridlevel_faseContainer)) ;
      /* End function gxnrGridlevel_fase_newrow */
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
      /* Using cursor T002321 */
      pr_default.execute(15, new Object[] {A396EmprCod, A758ProCod});
      if ( (pr_default.getStatus(15) != 101) )
      {
         A13687ProMaxLin = T002321_A13687ProMaxLin[0] ;
         n13687ProMaxLin = T002321_n13687ProMaxLin[0] ;
      }
      else
      {
         A13687ProMaxLin = (short)(0) ;
         n13687ProMaxLin = false ;
      }
      pr_default.close(15);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A13687ProMaxLin", GXutil.ltrim( localUtil.ntoc( A13687ProMaxLin, (byte)(4), (byte)(0), ".", "")));
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
      /* Using cursor T002341 */
      pr_default.execute(35, new Object[] {A396EmprCod, A457FasCod});
      if ( (pr_default.getStatus(35) == 101) )
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "GXSPC_ForeignKeyNotFound", ""), httpContext.getMessage( "FASPRO", ""), "", "", "", "", "", "", "", ""), "ForeignKeyNotFound", 1, "FASCOD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtFasCod_Internalname ;
      }
      A460FasDsc = T002341_A460FasDsc[0] ;
      A459FasDec = T002341_A459FasDec[0] ;
      n459FasDec = T002341_n459FasDec[0] ;
      A469FasPreSal = T002341_A469FasPreSal[0] ;
      n469FasPreSal = T002341_n469FasPreSal[0] ;
      A468FasPrePie = T002341_A468FasPrePie[0] ;
      n468FasPrePie = T002341_n468FasPrePie[0] ;
      A472FasVelPro = T002341_A472FasVelPro[0] ;
      n472FasVelPro = T002341_n472FasVelPro[0] ;
      A464FasNumPas = T002341_A464FasNumPas[0] ;
      n464FasNumPas = T002341_n464FasNumPas[0] ;
      A456FasActTin = T002341_A456FasActTin[0] ;
      n456FasActTin = T002341_n456FasActTin[0] ;
      A458FasCon = T002341_A458FasCon[0] ;
      n458FasCon = T002341_n458FasCon[0] ;
      A4286FasForMul = T002341_A4286FasForMul[0] ;
      n4286FasForMul = T002341_n4286FasForMul[0] ;
      A4299FasConPla = T002341_A4299FasConPla[0] ;
      n4299FasConPla = T002341_n4299FasConPla[0] ;
      A4903FasAcab = T002341_A4903FasAcab[0] ;
      n4903FasAcab = T002341_n4903FasAcab[0] ;
      A602MaqCod = T002341_A602MaqCod[0] ;
      n602MaqCod = T002341_n602MaqCod[0] ;
      pr_default.close(35);
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
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59ProCod',fld:'vPROCOD',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV53TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true},{av:'AV58EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV59ProCod',fld:'vPROCOD',pic:'',hsh:true},{av:'A5289ProProvi',fld:'PROPROVI',pic:'@!'},{av:'A7795ProTipP',fld:'PROTIPP',pic:''},{av:'A8042ProTipT',fld:'PROTIPT',pic:'9'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("AFTER TRN","{handler:'e12232',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV53TrnContext',fld:'vTRNCONTEXT',pic:'',hsh:true}]");
      setEventMetadata("AFTER TRN",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A13687ProMaxLin',fld:'PROMAXLIN',pic:'ZZZ9'}]");
      setEventMetadata("VALID_PROCOD",",oparms:[{av:'A13687ProMaxLin',fld:'PROMAXLIN',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_PRODSC","{handler:'valid_Prodsc',iparms:[]");
      setEventMetadata("VALID_PRODSC",",oparms:[]}");
      setEventMetadata("VALID_PROEST","{handler:'valid_Proest',iparms:[]");
      setEventMetadata("VALID_PROEST",",oparms:[]}");
      setEventMetadata("VALID_PRONUMLIN","{handler:'valid_Pronumlin',iparms:[]");
      setEventMetadata("VALID_PRONUMLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]");
      setEventMetadata("VALID_FASCOD",",oparms:[{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A459FasDec',fld:'FASDEC',pic:'ZZ9.9'},{av:'A469FasPreSal',fld:'FASPRESAL',pic:'ZZZ9'},{av:'A468FasPrePie',fld:'FASPREPIE',pic:'ZZZ9'},{av:'A472FasVelPro',fld:'FASVELPRO',pic:'ZZ9.9'},{av:'A464FasNumPas',fld:'FASNUMPAS',pic:'ZZ9'},{av:'A456FasActTin',fld:'FASACTTIN',pic:'@!'},{av:'A458FasCon',fld:'FASCON',pic:'@!'},{av:'A4286FasForMul',fld:'FASFORMUL',pic:'@!'},{av:'A4299FasConPla',fld:'FASCONPLA',pic:'@!'},{av:'A4903FasAcab',fld:'FASACAB',pic:'@!'},{av:'A602MaqCod',fld:'MAQCOD',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Fascon',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
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
      pr_default.close(35);
      pr_default.close(15);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      wcpOGx_mode = "" ;
      wcpOAV58EmprCod = "" ;
      wcpOAV59ProCod = "" ;
      Z396EmprCod = "" ;
      Z758ProCod = "" ;
      Z759ProDsc = "" ;
      Z4628ProDsc2 = "" ;
      Z5289ProProvi = "" ;
      Z6486ProDscF = "" ;
      Z7795ProTipP = "" ;
      Z14284ProEst = "" ;
      Z457FasCod = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      Gx_mode = "" ;
      AV58EmprCod = "" ;
      AV59ProCod = "" ;
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
      AV64Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucCombo_fascod = new com.genexus.webpanels.GXUserControl();
      Combo_fascod_Caption = "" ;
      AV60FasCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      Gridlevel_faseContainer = new com.genexus.webpanels.GXWebGrid(context);
      sMode88 = "" ;
      sStyleString = "" ;
      A5289ProProvi = "" ;
      A7795ProTipP = "" ;
      A13771ProCDsc = "" ;
      A407EmprNom = "" ;
      A460FasDsc = "" ;
      Dvpanel_tableattributes_Objectcall = "" ;
      Dvpanel_tableattributes_Class = "" ;
      Dvpanel_tableattributes_Height = "" ;
      Datamonjs_Objectcall = "" ;
      Datamonjs_Class = "" ;
      Datamonjs_Paramstr = "" ;
      Combo_fascod_Objectcall = "" ;
      Combo_fascod_Class = "" ;
      Combo_fascod_Icontype = "" ;
      Combo_fascod_Icon = "" ;
      Combo_fascod_Tooltip = "" ;
      Combo_fascod_Selectedvalue_set = "" ;
      Combo_fascod_Selectedvalue_get = "" ;
      Combo_fascod_Selectedtext_set = "" ;
      Combo_fascod_Selectedtext_get = "" ;
      Combo_fascod_Gamoauthtoken = "" ;
      Combo_fascod_Ddointernalname = "" ;
      Combo_fascod_Titlecontrolalign = "" ;
      Combo_fascod_Dropdownoptionstype = "" ;
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
      forbiddenHiddens = new com.genexus.util.GXProperties();
      hsh = "" ;
      sMode87 = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      GXCCtl = "" ;
      A459FasDec = DecimalUtil.ZERO ;
      A602MaqCod = "" ;
      A472FasVelPro = DecimalUtil.ZERO ;
      A4286FasForMul = "" ;
      A4299FasConPla = "" ;
      A4903FasAcab = "" ;
      A456FasActTin = "" ;
      A458FasCon = "" ;
      T00236_A13687ProMaxLin = new short[1] ;
      T00236_n13687ProMaxLin = new boolean[] {false} ;
      AV33Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV16EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV17UsurCod = "" ;
      AV52WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV53TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV54WebSession = httpContext.getWebSession();
      GXt_objcol_SdtDVB_SDTComboData_Item6 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV61ComboSelectedValue = "" ;
      GXv_char4 = new String[1] ;
      GXv_objcol_SdtDVB_SDTComboData_Item7 = new GXBaseCollection[1] ;
      Z407EmprNom = "" ;
      T00239_A407EmprNom = new String[] {""} ;
      T00239_n407EmprNom = new boolean[] {false} ;
      T002311_A758ProCod = new String[] {""} ;
      T002311_A759ProDsc = new String[] {""} ;
      T002311_A4628ProDsc2 = new String[] {""} ;
      T002311_A5289ProProvi = new String[] {""} ;
      T002311_A407EmprNom = new String[] {""} ;
      T002311_n407EmprNom = new boolean[] {false} ;
      T002311_A775ProUltLin = new short[1] ;
      T002311_A6486ProDscF = new String[] {""} ;
      T002311_A7795ProTipP = new String[] {""} ;
      T002311_A8042ProTipT = new byte[1] ;
      T002311_A14284ProEst = new String[] {""} ;
      T002311_A396EmprCod = new String[] {""} ;
      T002311_A13687ProMaxLin = new short[1] ;
      T002311_n13687ProMaxLin = new boolean[] {false} ;
      T002313_A13687ProMaxLin = new short[1] ;
      T002313_n13687ProMaxLin = new boolean[] {false} ;
      T002314_A396EmprCod = new String[] {""} ;
      T002314_A758ProCod = new String[] {""} ;
      T00238_A758ProCod = new String[] {""} ;
      T00238_A759ProDsc = new String[] {""} ;
      T00238_A4628ProDsc2 = new String[] {""} ;
      T00238_A5289ProProvi = new String[] {""} ;
      T00238_A775ProUltLin = new short[1] ;
      T00238_A6486ProDscF = new String[] {""} ;
      T00238_A7795ProTipP = new String[] {""} ;
      T00238_A8042ProTipT = new byte[1] ;
      T00238_A14284ProEst = new String[] {""} ;
      T00238_A396EmprCod = new String[] {""} ;
      T002315_A396EmprCod = new String[] {""} ;
      T002315_A758ProCod = new String[] {""} ;
      T002316_A396EmprCod = new String[] {""} ;
      T002316_A758ProCod = new String[] {""} ;
      T00237_A758ProCod = new String[] {""} ;
      T00237_A759ProDsc = new String[] {""} ;
      T00237_A4628ProDsc2 = new String[] {""} ;
      T00237_A5289ProProvi = new String[] {""} ;
      T00237_A775ProUltLin = new short[1] ;
      T00237_A6486ProDscF = new String[] {""} ;
      T00237_A7795ProTipP = new String[] {""} ;
      T00237_A8042ProTipT = new byte[1] ;
      T00237_A14284ProEst = new String[] {""} ;
      T00237_A396EmprCod = new String[] {""} ;
      T002321_A13687ProMaxLin = new short[1] ;
      T002321_n13687ProMaxLin = new boolean[] {false} ;
      T002322_A396EmprCod = new String[] {""} ;
      T002322_A13026PedDGId = new int[1] ;
      T002322_A758ProCod = new String[] {""} ;
      T002323_A396EmprCod = new String[] {""} ;
      T002323_A12851ProCodID = new String[] {""} ;
      T002323_A758ProCod = new String[] {""} ;
      T002324_A396EmprCod = new String[] {""} ;
      T002324_A252CliCod = new int[1] ;
      T002324_A4589FFProCod = new String[] {""} ;
      T002325_A396EmprCod = new String[] {""} ;
      T002325_A252CliCod = new int[1] ;
      T002325_A10839Txt_Cor = new String[] {""} ;
      T002325_A758ProCod = new String[] {""} ;
      T002326_A396EmprCod = new String[] {""} ;
      T002326_A2248ManCod = new short[1] ;
      T002326_A5835ManFasCod = new String[] {""} ;
      T002326_A758ProCod = new String[] {""} ;
      T002327_A396EmprCod = new String[] {""} ;
      T002327_A7843Int_Num = new int[1] ;
      T002327_A758ProCod = new String[] {""} ;
      T002328_A396EmprCod = new String[] {""} ;
      T002328_A4618EnsLCod = new int[1] ;
      T002328_A758ProCod = new String[] {""} ;
      T002329_A396EmprCod = new String[] {""} ;
      T002329_A758ProCod = new String[] {""} ;
      T002329_A774ProNumLin = new short[1] ;
      T002329_A6438ProFsaL = new short[1] ;
      T002330_A396EmprCod = new String[] {""} ;
      T002330_A361DisCod = new int[1] ;
      T002330_A758ProCod = new String[] {""} ;
      T002331_A396EmprCod = new String[] {""} ;
      T002331_A129BarCod = new int[1] ;
      T002331_A132BarCodReo = new byte[1] ;
      T002331_A130BarCodPar = new String[] {""} ;
      T002331_A758ProCod = new String[] {""} ;
      T002332_A396EmprCod = new String[] {""} ;
      T002332_A252CliCod = new int[1] ;
      T002332_A65ArtCod = new String[] {""} ;
      T002332_A758ProCod = new String[] {""} ;
      T002334_A396EmprCod = new String[] {""} ;
      T002334_A758ProCod = new String[] {""} ;
      Z460FasDsc = "" ;
      Z459FasDec = DecimalUtil.ZERO ;
      Z472FasVelPro = DecimalUtil.ZERO ;
      Z456FasActTin = "" ;
      Z458FasCon = "" ;
      Z4286FasForMul = "" ;
      Z4299FasConPla = "" ;
      Z4903FasAcab = "" ;
      Z602MaqCod = "" ;
      T002335_A758ProCod = new String[] {""} ;
      T002335_A774ProNumLin = new short[1] ;
      T002335_A6437ProUltFP = new short[1] ;
      T002335_A460FasDsc = new String[] {""} ;
      T002335_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002335_n459FasDec = new boolean[] {false} ;
      T002335_A469FasPreSal = new short[1] ;
      T002335_n469FasPreSal = new boolean[] {false} ;
      T002335_A468FasPrePie = new short[1] ;
      T002335_n468FasPrePie = new boolean[] {false} ;
      T002335_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002335_n472FasVelPro = new boolean[] {false} ;
      T002335_A464FasNumPas = new short[1] ;
      T002335_n464FasNumPas = new boolean[] {false} ;
      T002335_A456FasActTin = new String[] {""} ;
      T002335_n456FasActTin = new boolean[] {false} ;
      T002335_A458FasCon = new String[] {""} ;
      T002335_n458FasCon = new boolean[] {false} ;
      T002335_A4286FasForMul = new String[] {""} ;
      T002335_n4286FasForMul = new boolean[] {false} ;
      T002335_A4299FasConPla = new String[] {""} ;
      T002335_n4299FasConPla = new boolean[] {false} ;
      T002335_A4903FasAcab = new String[] {""} ;
      T002335_n4903FasAcab = new boolean[] {false} ;
      T002335_A396EmprCod = new String[] {""} ;
      T002335_A457FasCod = new String[] {""} ;
      T002335_A602MaqCod = new String[] {""} ;
      T002335_n602MaqCod = new boolean[] {false} ;
      T00234_A460FasDsc = new String[] {""} ;
      T00234_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00234_n459FasDec = new boolean[] {false} ;
      T00234_A469FasPreSal = new short[1] ;
      T00234_n469FasPreSal = new boolean[] {false} ;
      T00234_A468FasPrePie = new short[1] ;
      T00234_n468FasPrePie = new boolean[] {false} ;
      T00234_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T00234_n472FasVelPro = new boolean[] {false} ;
      T00234_A464FasNumPas = new short[1] ;
      T00234_n464FasNumPas = new boolean[] {false} ;
      T00234_A456FasActTin = new String[] {""} ;
      T00234_n456FasActTin = new boolean[] {false} ;
      T00234_A458FasCon = new String[] {""} ;
      T00234_n458FasCon = new boolean[] {false} ;
      T00234_A4286FasForMul = new String[] {""} ;
      T00234_n4286FasForMul = new boolean[] {false} ;
      T00234_A4299FasConPla = new String[] {""} ;
      T00234_n4299FasConPla = new boolean[] {false} ;
      T00234_A4903FasAcab = new String[] {""} ;
      T00234_n4903FasAcab = new boolean[] {false} ;
      T00234_A602MaqCod = new String[] {""} ;
      T00234_n602MaqCod = new boolean[] {false} ;
      T002336_A460FasDsc = new String[] {""} ;
      T002336_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002336_n459FasDec = new boolean[] {false} ;
      T002336_A469FasPreSal = new short[1] ;
      T002336_n469FasPreSal = new boolean[] {false} ;
      T002336_A468FasPrePie = new short[1] ;
      T002336_n468FasPrePie = new boolean[] {false} ;
      T002336_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002336_n472FasVelPro = new boolean[] {false} ;
      T002336_A464FasNumPas = new short[1] ;
      T002336_n464FasNumPas = new boolean[] {false} ;
      T002336_A456FasActTin = new String[] {""} ;
      T002336_n456FasActTin = new boolean[] {false} ;
      T002336_A458FasCon = new String[] {""} ;
      T002336_n458FasCon = new boolean[] {false} ;
      T002336_A4286FasForMul = new String[] {""} ;
      T002336_n4286FasForMul = new boolean[] {false} ;
      T002336_A4299FasConPla = new String[] {""} ;
      T002336_n4299FasConPla = new boolean[] {false} ;
      T002336_A4903FasAcab = new String[] {""} ;
      T002336_n4903FasAcab = new boolean[] {false} ;
      T002336_A602MaqCod = new String[] {""} ;
      T002336_n602MaqCod = new boolean[] {false} ;
      T002337_A396EmprCod = new String[] {""} ;
      T002337_A758ProCod = new String[] {""} ;
      T002337_A774ProNumLin = new short[1] ;
      T00233_A758ProCod = new String[] {""} ;
      T00233_A774ProNumLin = new short[1] ;
      T00233_A6437ProUltFP = new short[1] ;
      T00233_A396EmprCod = new String[] {""} ;
      T00233_A457FasCod = new String[] {""} ;
      T00232_A758ProCod = new String[] {""} ;
      T00232_A774ProNumLin = new short[1] ;
      T00232_A6437ProUltFP = new short[1] ;
      T00232_A396EmprCod = new String[] {""} ;
      T00232_A457FasCod = new String[] {""} ;
      T002341_A460FasDsc = new String[] {""} ;
      T002341_A459FasDec = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002341_n459FasDec = new boolean[] {false} ;
      T002341_A469FasPreSal = new short[1] ;
      T002341_n469FasPreSal = new boolean[] {false} ;
      T002341_A468FasPrePie = new short[1] ;
      T002341_n468FasPrePie = new boolean[] {false} ;
      T002341_A472FasVelPro = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      T002341_n472FasVelPro = new boolean[] {false} ;
      T002341_A464FasNumPas = new short[1] ;
      T002341_n464FasNumPas = new boolean[] {false} ;
      T002341_A456FasActTin = new String[] {""} ;
      T002341_n456FasActTin = new boolean[] {false} ;
      T002341_A458FasCon = new String[] {""} ;
      T002341_n458FasCon = new boolean[] {false} ;
      T002341_A4286FasForMul = new String[] {""} ;
      T002341_n4286FasForMul = new boolean[] {false} ;
      T002341_A4299FasConPla = new String[] {""} ;
      T002341_n4299FasConPla = new boolean[] {false} ;
      T002341_A4903FasAcab = new String[] {""} ;
      T002341_n4903FasAcab = new boolean[] {false} ;
      T002341_A602MaqCod = new String[] {""} ;
      T002341_n602MaqCod = new boolean[] {false} ;
      T002342_A396EmprCod = new String[] {""} ;
      T002342_A758ProCod = new String[] {""} ;
      T002342_A774ProNumLin = new short[1] ;
      T002342_A7897Dtp_Ordl = new short[1] ;
      T002343_A396EmprCod = new String[] {""} ;
      T002343_A758ProCod = new String[] {""} ;
      T002343_A774ProNumLin = new short[1] ;
      T002343_A6438ProFsaL = new short[1] ;
      T002344_A396EmprCod = new String[] {""} ;
      T002344_A758ProCod = new String[] {""} ;
      T002344_A774ProNumLin = new short[1] ;
      Gridlevel_faseRow = new com.genexus.webpanels.GXWebRow();
      subGridlevel_fase_Linesclass = "" ;
      ROClassString = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      i5289ProProvi = "" ;
      i7795ProTipP = "" ;
      i14284ProEst = "" ;
      Gridlevel_faseColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces__default(),
         new Object[] {
             new Object[] {
            T00232_A758ProCod, T00232_A774ProNumLin, T00232_A6437ProUltFP, T00232_A396EmprCod, T00232_A457FasCod
            }
            , new Object[] {
            T00233_A758ProCod, T00233_A774ProNumLin, T00233_A6437ProUltFP, T00233_A396EmprCod, T00233_A457FasCod
            }
            , new Object[] {
            T00234_A460FasDsc, T00234_A459FasDec, T00234_n459FasDec, T00234_A469FasPreSal, T00234_n469FasPreSal, T00234_A468FasPrePie, T00234_n468FasPrePie, T00234_A472FasVelPro, T00234_n472FasVelPro, T00234_A464FasNumPas,
            T00234_n464FasNumPas, T00234_A456FasActTin, T00234_n456FasActTin, T00234_A458FasCon, T00234_n458FasCon, T00234_A4286FasForMul, T00234_n4286FasForMul, T00234_A4299FasConPla, T00234_n4299FasConPla, T00234_A4903FasAcab,
            T00234_n4903FasAcab, T00234_A602MaqCod, T00234_n602MaqCod
            }
            , new Object[] {
            T00236_A13687ProMaxLin, T00236_n13687ProMaxLin
            }
            , new Object[] {
            T00237_A758ProCod, T00237_A759ProDsc, T00237_A4628ProDsc2, T00237_A5289ProProvi, T00237_A775ProUltLin, T00237_A6486ProDscF, T00237_A7795ProTipP, T00237_A8042ProTipT, T00237_A14284ProEst, T00237_A396EmprCod
            }
            , new Object[] {
            T00238_A758ProCod, T00238_A759ProDsc, T00238_A4628ProDsc2, T00238_A5289ProProvi, T00238_A775ProUltLin, T00238_A6486ProDscF, T00238_A7795ProTipP, T00238_A8042ProTipT, T00238_A14284ProEst, T00238_A396EmprCod
            }
            , new Object[] {
            T00239_A407EmprNom, T00239_n407EmprNom
            }
            , new Object[] {
            T002311_A758ProCod, T002311_A759ProDsc, T002311_A4628ProDsc2, T002311_A5289ProProvi, T002311_A407EmprNom, T002311_n407EmprNom, T002311_A775ProUltLin, T002311_A6486ProDscF, T002311_A7795ProTipP, T002311_A8042ProTipT,
            T002311_A14284ProEst, T002311_A396EmprCod, T002311_A13687ProMaxLin, T002311_n13687ProMaxLin
            }
            , new Object[] {
            T002313_A13687ProMaxLin, T002313_n13687ProMaxLin
            }
            , new Object[] {
            T002314_A396EmprCod, T002314_A758ProCod
            }
            , new Object[] {
            T002315_A396EmprCod, T002315_A758ProCod
            }
            , new Object[] {
            T002316_A396EmprCod, T002316_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002321_A13687ProMaxLin, T002321_n13687ProMaxLin
            }
            , new Object[] {
            T002322_A396EmprCod, T002322_A13026PedDGId, T002322_A758ProCod
            }
            , new Object[] {
            T002323_A396EmprCod, T002323_A12851ProCodID, T002323_A758ProCod
            }
            , new Object[] {
            T002324_A396EmprCod, T002324_A252CliCod, T002324_A4589FFProCod
            }
            , new Object[] {
            T002325_A396EmprCod, T002325_A252CliCod, T002325_A10839Txt_Cor, T002325_A758ProCod
            }
            , new Object[] {
            T002326_A396EmprCod, T002326_A2248ManCod, T002326_A5835ManFasCod, T002326_A758ProCod
            }
            , new Object[] {
            T002327_A396EmprCod, T002327_A7843Int_Num, T002327_A758ProCod
            }
            , new Object[] {
            T002328_A396EmprCod, T002328_A4618EnsLCod, T002328_A758ProCod
            }
            , new Object[] {
            T002329_A396EmprCod, T002329_A758ProCod, T002329_A774ProNumLin, T002329_A6438ProFsaL
            }
            , new Object[] {
            T002330_A396EmprCod, T002330_A361DisCod, T002330_A758ProCod
            }
            , new Object[] {
            T002331_A396EmprCod, T002331_A129BarCod, T002331_A132BarCodReo, T002331_A130BarCodPar, T002331_A758ProCod
            }
            , new Object[] {
            T002332_A396EmprCod, T002332_A252CliCod, T002332_A65ArtCod, T002332_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            T002334_A396EmprCod, T002334_A758ProCod
            }
            , new Object[] {
            T002335_A758ProCod, T002335_A774ProNumLin, T002335_A6437ProUltFP, T002335_A460FasDsc, T002335_A459FasDec, T002335_n459FasDec, T002335_A469FasPreSal, T002335_n469FasPreSal, T002335_A468FasPrePie, T002335_n468FasPrePie,
            T002335_A472FasVelPro, T002335_n472FasVelPro, T002335_A464FasNumPas, T002335_n464FasNumPas, T002335_A456FasActTin, T002335_n456FasActTin, T002335_A458FasCon, T002335_n458FasCon, T002335_A4286FasForMul, T002335_n4286FasForMul,
            T002335_A4299FasConPla, T002335_n4299FasConPla, T002335_A4903FasAcab, T002335_n4903FasAcab, T002335_A396EmprCod, T002335_A457FasCod, T002335_A602MaqCod, T002335_n602MaqCod
            }
            , new Object[] {
            T002336_A460FasDsc, T002336_A459FasDec, T002336_n459FasDec, T002336_A469FasPreSal, T002336_n469FasPreSal, T002336_A468FasPrePie, T002336_n468FasPrePie, T002336_A472FasVelPro, T002336_n472FasVelPro, T002336_A464FasNumPas,
            T002336_n464FasNumPas, T002336_A456FasActTin, T002336_n456FasActTin, T002336_A458FasCon, T002336_n458FasCon, T002336_A4286FasForMul, T002336_n4286FasForMul, T002336_A4299FasConPla, T002336_n4299FasConPla, T002336_A4903FasAcab,
            T002336_n4903FasAcab, T002336_A602MaqCod, T002336_n602MaqCod
            }
            , new Object[] {
            T002337_A396EmprCod, T002337_A758ProCod, T002337_A774ProNumLin
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002341_A460FasDsc, T002341_A459FasDec, T002341_n459FasDec, T002341_A469FasPreSal, T002341_n469FasPreSal, T002341_A468FasPrePie, T002341_n468FasPrePie, T002341_A472FasVelPro, T002341_n472FasVelPro, T002341_A464FasNumPas,
            T002341_n464FasNumPas, T002341_A456FasActTin, T002341_n456FasActTin, T002341_A458FasCon, T002341_n458FasCon, T002341_A4286FasForMul, T002341_n4286FasForMul, T002341_A4299FasConPla, T002341_n4299FasConPla, T002341_A4903FasAcab,
            T002341_n4903FasAcab, T002341_A602MaqCod, T002341_n602MaqCod
            }
            , new Object[] {
            T002342_A396EmprCod, T002342_A758ProCod, T002342_A774ProNumLin, T002342_A7897Dtp_Ordl
            }
            , new Object[] {
            T002343_A396EmprCod, T002343_A758ProCod, T002343_A774ProNumLin, T002343_A6438ProFsaL
            }
            , new Object[] {
            T002344_A396EmprCod, T002344_A758ProCod, T002344_A774ProNumLin
            }
         }
      );
      AV64Pgmname = "FicherosBasicos.TPROCES" ;
      Z14284ProEst = httpContext.getMessage( "A", "") ;
      A14284ProEst = httpContext.getMessage( "A", "") ;
      i14284ProEst = httpContext.getMessage( "A", "") ;
      Z6437ProUltFP = (short)(0) ;
      A6437ProUltFP = (short)(0) ;
      i6437ProUltFP = (short)(0) ;
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
   private byte Gx_BScreen ;
   private byte A8042ProTipT ;
   private byte subGridlevel_fase_Backcolorstyle ;
   private byte subGridlevel_fase_Backstyle ;
   private byte gxajaxcallmode ;
   private byte i8042ProTipT ;
   private byte subGridlevel_fase_Allowselection ;
   private byte subGridlevel_fase_Allowhovering ;
   private byte subGridlevel_fase_Allowcollapsing ;
   private byte subGridlevel_fase_Collapsed ;
   private short Z775ProUltLin ;
   private short O775ProUltLin ;
   private short Z774ProNumLin ;
   private short Z6437ProUltFP ;
   private short nRcdDeleted_88 ;
   private short nRcdExists_88 ;
   private short nIsMod_88 ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A775ProUltLin ;
   private short nBlankRcdCount88 ;
   private short RcdFound88 ;
   private short B775ProUltLin ;
   private short nBlankRcdUsr88 ;
   private short A13687ProMaxLin ;
   private short A6437ProUltFP ;
   private short RcdFound87 ;
   private short s775ProUltLin ;
   private short A774ProNumLin ;
   private short A469FasPreSal ;
   private short A468FasPrePie ;
   private short A464FasNumPas ;
   private short Z13687ProMaxLin ;
   private short nIsDirty_87 ;
   private short Z469FasPreSal ;
   private short Z468FasPrePie ;
   private short Z464FasNumPas ;
   private short nIsDirty_88 ;
   private short i775ProUltLin ;
   private short i6437ProUltFP ;
   private int nRC_GXsfl_50 ;
   private int nGXsfl_50_idx=1 ;
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
   private int subGridlevel_fase_Rows ;
   private int edtProNumLin_Enabled ;
   private int edtFasCod_Enabled ;
   private int edtFasDec_Enabled ;
   private int edtMaqCod_Enabled ;
   private int edtFasPreSal_Enabled ;
   private int edtFasPrePie_Enabled ;
   private int edtFasVelPro_Enabled ;
   private int edtFasNumPas_Enabled ;
   private int edtFasForMul_Enabled ;
   private int edtFasConPla_Enabled ;
   private int edtFasAcab_Enabled ;
   private int edtFasActTin_Enabled ;
   private int edtFasCon_Enabled ;
   private int fRowAdded ;
   private int Datamonjs_Gxcontroltype ;
   private int Combo_fascod_Datalistupdateminimumcharacters ;
   private int GX_JID ;
   private int subGridlevel_fase_Backcolor ;
   private int subGridlevel_fase_Allbackcolor ;
   private int defedtFasCod_Enabled ;
   private int defedtProNumLin_Enabled ;
   private int idxLst ;
   private int subGridlevel_fase_Selectedindex ;
   private int subGridlevel_fase_Selectioncolor ;
   private int subGridlevel_fase_Hoveringcolor ;
   private long GRIDLEVEL_FASE_nFirstRecordOnPage ;
   private java.math.BigDecimal A459FasDec ;
   private java.math.BigDecimal A472FasVelPro ;
   private java.math.BigDecimal Z459FasDec ;
   private java.math.BigDecimal Z472FasVelPro ;
   private String sPrefix ;
   private String wcpOGx_mode ;
   private String wcpOAV58EmprCod ;
   private String wcpOAV59ProCod ;
   private String Z396EmprCod ;
   private String Z758ProCod ;
   private String Z759ProDsc ;
   private String Z4628ProDsc2 ;
   private String Z5289ProProvi ;
   private String Z6486ProDscF ;
   private String Z7795ProTipP ;
   private String Z14284ProEst ;
   private String Z457FasCod ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String Gx_mode ;
   private String AV58EmprCod ;
   private String AV59ProCod ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtProCod_Internalname ;
   private String sGXsfl_50_idx="0001" ;
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
   private String edtProDsc2_Internalname ;
   private String A4628ProDsc2 ;
   private String edtProDsc2_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtProDscF_Internalname ;
   private String A6486ProDscF ;
   private String edtProDscF_Jsonclick ;
   private String divTableleaflevel_fase_Internalname ;
   private String bttBtntrn_enter_Internalname ;
   private String bttBtntrn_enter_Jsonclick ;
   private String bttBtntrn_cancel_Internalname ;
   private String bttBtntrn_cancel_Jsonclick ;
   private String bttBtntrn_delete_Internalname ;
   private String bttBtntrn_delete_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV64Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Combo_fascod_Caption ;
   private String Combo_fascod_Cls ;
   private String Combo_fascod_Internalname ;
   private String sMode88 ;
   private String edtProNumLin_Internalname ;
   private String edtFasCod_Internalname ;
   private String edtFasDec_Internalname ;
   private String edtMaqCod_Internalname ;
   private String edtFasPreSal_Internalname ;
   private String edtFasPrePie_Internalname ;
   private String edtFasVelPro_Internalname ;
   private String edtFasNumPas_Internalname ;
   private String edtFasForMul_Internalname ;
   private String edtFasConPla_Internalname ;
   private String edtFasAcab_Internalname ;
   private String edtFasActTin_Internalname ;
   private String edtFasCon_Internalname ;
   private String sStyleString ;
   private String subGridlevel_fase_Internalname ;
   private String A5289ProProvi ;
   private String A7795ProTipP ;
   private String A407EmprNom ;
   private String A460FasDsc ;
   private String Dvpanel_tableattributes_Objectcall ;
   private String Dvpanel_tableattributes_Class ;
   private String Dvpanel_tableattributes_Height ;
   private String Datamonjs_Objectcall ;
   private String Datamonjs_Class ;
   private String Datamonjs_Paramstr ;
   private String Combo_fascod_Objectcall ;
   private String Combo_fascod_Class ;
   private String Combo_fascod_Icontype ;
   private String Combo_fascod_Icon ;
   private String Combo_fascod_Tooltip ;
   private String Combo_fascod_Selectedvalue_set ;
   private String Combo_fascod_Selectedvalue_get ;
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
   private String hsh ;
   private String sMode87 ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String GXCCtl ;
   private String A602MaqCod ;
   private String A4286FasForMul ;
   private String A4299FasConPla ;
   private String A4903FasAcab ;
   private String A456FasActTin ;
   private String A458FasCon ;
   private String AV33Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV16EmprNom ;
   private String GXv_char3[] ;
   private String AV17UsurCod ;
   private String GXv_char4[] ;
   private String Z407EmprNom ;
   private String Z460FasDsc ;
   private String Z456FasActTin ;
   private String Z458FasCon ;
   private String Z4286FasForMul ;
   private String Z4299FasConPla ;
   private String Z4903FasAcab ;
   private String Z602MaqCod ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGridlevel_fase_Class ;
   private String subGridlevel_fase_Linesclass ;
   private String ROClassString ;
   private String edtProNumLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDec_Jsonclick ;
   private String edtMaqCod_Jsonclick ;
   private String edtFasPreSal_Jsonclick ;
   private String edtFasPrePie_Jsonclick ;
   private String edtFasVelPro_Jsonclick ;
   private String edtFasNumPas_Jsonclick ;
   private String edtFasForMul_Jsonclick ;
   private String edtFasConPla_Jsonclick ;
   private String edtFasAcab_Jsonclick ;
   private String edtFasActTin_Jsonclick ;
   private String edtFasCon_Jsonclick ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String i5289ProProvi ;
   private String i7795ProTipP ;
   private String i14284ProEst ;
   private String subGridlevel_fase_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_fascod_Isgriditem ;
   private boolean Combo_fascod_Emptyitem ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean n407EmprNom ;
   private boolean n13687ProMaxLin ;
   private boolean Dvpanel_tableattributes_Enabled ;
   private boolean Dvpanel_tableattributes_Showheader ;
   private boolean Dvpanel_tableattributes_Visible ;
   private boolean Datamonjs_Enabled ;
   private boolean Datamonjs_Visible ;
   private boolean Combo_fascod_Enabled ;
   private boolean Combo_fascod_Visible ;
   private boolean Combo_fascod_Allowmultipleselection ;
   private boolean Combo_fascod_Hasdescription ;
   private boolean Combo_fascod_Includeonlyselectedoption ;
   private boolean Combo_fascod_Includeselectalloption ;
   private boolean Combo_fascod_Includeaddnewoption ;
   private boolean returnInSub ;
   private boolean Gx_longc ;
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
   private String A13771ProCDsc ;
   private String AV61ComboSelectedValue ;
   private com.genexus.webpanels.GXWebGrid Gridlevel_faseContainer ;
   private com.genexus.webpanels.GXWebRow Gridlevel_faseRow ;
   private com.genexus.webpanels.GXWebColumn Gridlevel_faseColumn ;
   private com.genexus.webpanels.WebSession AV54WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucCombo_fascod ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbProEst ;
   private IDataStoreProvider pr_default ;
   private short[] T00236_A13687ProMaxLin ;
   private boolean[] T00236_n13687ProMaxLin ;
   private String[] T00239_A407EmprNom ;
   private boolean[] T00239_n407EmprNom ;
   private String[] T002311_A758ProCod ;
   private String[] T002311_A759ProDsc ;
   private String[] T002311_A4628ProDsc2 ;
   private String[] T002311_A5289ProProvi ;
   private String[] T002311_A407EmprNom ;
   private boolean[] T002311_n407EmprNom ;
   private short[] T002311_A775ProUltLin ;
   private String[] T002311_A6486ProDscF ;
   private String[] T002311_A7795ProTipP ;
   private byte[] T002311_A8042ProTipT ;
   private String[] T002311_A14284ProEst ;
   private String[] T002311_A396EmprCod ;
   private short[] T002311_A13687ProMaxLin ;
   private boolean[] T002311_n13687ProMaxLin ;
   private short[] T002313_A13687ProMaxLin ;
   private boolean[] T002313_n13687ProMaxLin ;
   private String[] T002314_A396EmprCod ;
   private String[] T002314_A758ProCod ;
   private String[] T00238_A758ProCod ;
   private String[] T00238_A759ProDsc ;
   private String[] T00238_A4628ProDsc2 ;
   private String[] T00238_A5289ProProvi ;
   private short[] T00238_A775ProUltLin ;
   private String[] T00238_A6486ProDscF ;
   private String[] T00238_A7795ProTipP ;
   private byte[] T00238_A8042ProTipT ;
   private String[] T00238_A14284ProEst ;
   private String[] T00238_A396EmprCod ;
   private String[] T002315_A396EmprCod ;
   private String[] T002315_A758ProCod ;
   private String[] T002316_A396EmprCod ;
   private String[] T002316_A758ProCod ;
   private String[] T00237_A758ProCod ;
   private String[] T00237_A759ProDsc ;
   private String[] T00237_A4628ProDsc2 ;
   private String[] T00237_A5289ProProvi ;
   private short[] T00237_A775ProUltLin ;
   private String[] T00237_A6486ProDscF ;
   private String[] T00237_A7795ProTipP ;
   private byte[] T00237_A8042ProTipT ;
   private String[] T00237_A14284ProEst ;
   private String[] T00237_A396EmprCod ;
   private short[] T002321_A13687ProMaxLin ;
   private boolean[] T002321_n13687ProMaxLin ;
   private String[] T002322_A396EmprCod ;
   private int[] T002322_A13026PedDGId ;
   private String[] T002322_A758ProCod ;
   private String[] T002323_A396EmprCod ;
   private String[] T002323_A12851ProCodID ;
   private String[] T002323_A758ProCod ;
   private String[] T002324_A396EmprCod ;
   private int[] T002324_A252CliCod ;
   private String[] T002324_A4589FFProCod ;
   private String[] T002325_A396EmprCod ;
   private int[] T002325_A252CliCod ;
   private String[] T002325_A10839Txt_Cor ;
   private String[] T002325_A758ProCod ;
   private String[] T002326_A396EmprCod ;
   private short[] T002326_A2248ManCod ;
   private String[] T002326_A5835ManFasCod ;
   private String[] T002326_A758ProCod ;
   private String[] T002327_A396EmprCod ;
   private int[] T002327_A7843Int_Num ;
   private String[] T002327_A758ProCod ;
   private String[] T002328_A396EmprCod ;
   private int[] T002328_A4618EnsLCod ;
   private String[] T002328_A758ProCod ;
   private String[] T002329_A396EmprCod ;
   private String[] T002329_A758ProCod ;
   private short[] T002329_A774ProNumLin ;
   private short[] T002329_A6438ProFsaL ;
   private String[] T002330_A396EmprCod ;
   private int[] T002330_A361DisCod ;
   private String[] T002330_A758ProCod ;
   private String[] T002331_A396EmprCod ;
   private int[] T002331_A129BarCod ;
   private byte[] T002331_A132BarCodReo ;
   private String[] T002331_A130BarCodPar ;
   private String[] T002331_A758ProCod ;
   private String[] T002332_A396EmprCod ;
   private int[] T002332_A252CliCod ;
   private String[] T002332_A65ArtCod ;
   private String[] T002332_A758ProCod ;
   private String[] T002334_A396EmprCod ;
   private String[] T002334_A758ProCod ;
   private String[] T002335_A758ProCod ;
   private short[] T002335_A774ProNumLin ;
   private short[] T002335_A6437ProUltFP ;
   private String[] T002335_A460FasDsc ;
   private java.math.BigDecimal[] T002335_A459FasDec ;
   private boolean[] T002335_n459FasDec ;
   private short[] T002335_A469FasPreSal ;
   private boolean[] T002335_n469FasPreSal ;
   private short[] T002335_A468FasPrePie ;
   private boolean[] T002335_n468FasPrePie ;
   private java.math.BigDecimal[] T002335_A472FasVelPro ;
   private boolean[] T002335_n472FasVelPro ;
   private short[] T002335_A464FasNumPas ;
   private boolean[] T002335_n464FasNumPas ;
   private String[] T002335_A456FasActTin ;
   private boolean[] T002335_n456FasActTin ;
   private String[] T002335_A458FasCon ;
   private boolean[] T002335_n458FasCon ;
   private String[] T002335_A4286FasForMul ;
   private boolean[] T002335_n4286FasForMul ;
   private String[] T002335_A4299FasConPla ;
   private boolean[] T002335_n4299FasConPla ;
   private String[] T002335_A4903FasAcab ;
   private boolean[] T002335_n4903FasAcab ;
   private String[] T002335_A396EmprCod ;
   private String[] T002335_A457FasCod ;
   private String[] T002335_A602MaqCod ;
   private boolean[] T002335_n602MaqCod ;
   private String[] T00234_A460FasDsc ;
   private java.math.BigDecimal[] T00234_A459FasDec ;
   private boolean[] T00234_n459FasDec ;
   private short[] T00234_A469FasPreSal ;
   private boolean[] T00234_n469FasPreSal ;
   private short[] T00234_A468FasPrePie ;
   private boolean[] T00234_n468FasPrePie ;
   private java.math.BigDecimal[] T00234_A472FasVelPro ;
   private boolean[] T00234_n472FasVelPro ;
   private short[] T00234_A464FasNumPas ;
   private boolean[] T00234_n464FasNumPas ;
   private String[] T00234_A456FasActTin ;
   private boolean[] T00234_n456FasActTin ;
   private String[] T00234_A458FasCon ;
   private boolean[] T00234_n458FasCon ;
   private String[] T00234_A4286FasForMul ;
   private boolean[] T00234_n4286FasForMul ;
   private String[] T00234_A4299FasConPla ;
   private boolean[] T00234_n4299FasConPla ;
   private String[] T00234_A4903FasAcab ;
   private boolean[] T00234_n4903FasAcab ;
   private String[] T00234_A602MaqCod ;
   private boolean[] T00234_n602MaqCod ;
   private String[] T002336_A460FasDsc ;
   private java.math.BigDecimal[] T002336_A459FasDec ;
   private boolean[] T002336_n459FasDec ;
   private short[] T002336_A469FasPreSal ;
   private boolean[] T002336_n469FasPreSal ;
   private short[] T002336_A468FasPrePie ;
   private boolean[] T002336_n468FasPrePie ;
   private java.math.BigDecimal[] T002336_A472FasVelPro ;
   private boolean[] T002336_n472FasVelPro ;
   private short[] T002336_A464FasNumPas ;
   private boolean[] T002336_n464FasNumPas ;
   private String[] T002336_A456FasActTin ;
   private boolean[] T002336_n456FasActTin ;
   private String[] T002336_A458FasCon ;
   private boolean[] T002336_n458FasCon ;
   private String[] T002336_A4286FasForMul ;
   private boolean[] T002336_n4286FasForMul ;
   private String[] T002336_A4299FasConPla ;
   private boolean[] T002336_n4299FasConPla ;
   private String[] T002336_A4903FasAcab ;
   private boolean[] T002336_n4903FasAcab ;
   private String[] T002336_A602MaqCod ;
   private boolean[] T002336_n602MaqCod ;
   private String[] T002337_A396EmprCod ;
   private String[] T002337_A758ProCod ;
   private short[] T002337_A774ProNumLin ;
   private String[] T00233_A758ProCod ;
   private short[] T00233_A774ProNumLin ;
   private short[] T00233_A6437ProUltFP ;
   private String[] T00233_A396EmprCod ;
   private String[] T00233_A457FasCod ;
   private String[] T00232_A758ProCod ;
   private short[] T00232_A774ProNumLin ;
   private short[] T00232_A6437ProUltFP ;
   private String[] T00232_A396EmprCod ;
   private String[] T00232_A457FasCod ;
   private String[] T002341_A460FasDsc ;
   private java.math.BigDecimal[] T002341_A459FasDec ;
   private boolean[] T002341_n459FasDec ;
   private short[] T002341_A469FasPreSal ;
   private boolean[] T002341_n469FasPreSal ;
   private short[] T002341_A468FasPrePie ;
   private boolean[] T002341_n468FasPrePie ;
   private java.math.BigDecimal[] T002341_A472FasVelPro ;
   private boolean[] T002341_n472FasVelPro ;
   private short[] T002341_A464FasNumPas ;
   private boolean[] T002341_n464FasNumPas ;
   private String[] T002341_A456FasActTin ;
   private boolean[] T002341_n456FasActTin ;
   private String[] T002341_A458FasCon ;
   private boolean[] T002341_n458FasCon ;
   private String[] T002341_A4286FasForMul ;
   private boolean[] T002341_n4286FasForMul ;
   private String[] T002341_A4299FasConPla ;
   private boolean[] T002341_n4299FasConPla ;
   private String[] T002341_A4903FasAcab ;
   private boolean[] T002341_n4903FasAcab ;
   private String[] T002341_A602MaqCod ;
   private boolean[] T002341_n602MaqCod ;
   private String[] T002342_A396EmprCod ;
   private String[] T002342_A758ProCod ;
   private short[] T002342_A774ProNumLin ;
   private short[] T002342_A7897Dtp_Ordl ;
   private String[] T002343_A396EmprCod ;
   private String[] T002343_A758ProCod ;
   private short[] T002343_A774ProNumLin ;
   private short[] T002343_A6438ProFsaL ;
   private String[] T002344_A396EmprCod ;
   private String[] T002344_A758ProCod ;
   private short[] T002344_A774ProNumLin ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV60FasCod_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXt_objcol_SdtDVB_SDTComboData_Item6 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> GXv_objcol_SdtDVB_SDTComboData_Item7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV52WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV53TrnContext ;
}

final  class tproces__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
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

final  class tproces__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00232", "SELECT ProCod, ProNumLin, ProUltFP, EmprCod, FasCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?  FOR UPDATE OF ProUltFP, FasCod NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00233", "SELECT ProCod, ProNumLin, ProUltFP, EmprCod, FasCod FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00234", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00236", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00237", "SELECT ProCod, ProDsc, ProDsc2, ProProvi, ProUltLin, ProDscF, ProTipP, ProTipT, ProEst, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ?  FOR UPDATE OF ProDsc, ProDsc2, ProProvi, ProUltLin, ProDscF, ProTipP, ProTipT, ProEst NOWAIT",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00238", "SELECT ProCod, ProDsc, ProDsc2, ProProvi, ProUltLin, ProDscF, ProTipP, ProTipT, ProEst, EmprCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T00239", "SELECT EmprNom FROM TXPEMPRES WHERE EmprCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002311", "SELECT /*+ FIRST_ROWS(100) */ TM1.ProCod, TM1.ProDsc, TM1.ProDsc2, TM1.ProProvi, T2.EmprNom, TM1.ProUltLin, TM1.ProDscF, TM1.ProTipP, TM1.ProTipT, TM1.ProEst, TM1.EmprCod, COALESCE( T3.ProMaxLin, 0) AS ProMaxLin FROM ((TXPPROCES TM1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = TM1.EmprCod) LEFT JOIN (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T3 ON T3.EmprCod = TM1.EmprCod AND T3.ProCod = TM1.ProCod) WHERE TM1.EmprCod = ? and TM1.ProCod = ? ORDER BY TM1.EmprCod, TM1.ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002313", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002314", "SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE EmprCod = ? AND ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002315", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( EmprCod > ? or EmprCod = ? and ProCod > ?) ORDER BY EmprCod, ProCod) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002316", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ EmprCod, ProCod FROM TXPPROCES WHERE ( EmprCod < ? or EmprCod = ? and ProCod < ?) ORDER BY EmprCod DESC, ProCod DESC) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002317", "INSERT INTO TXPPROCES(ProCod, ProDsc, ProDsc2, ProProvi, ProUltLin, ProDscF, ProTipP, ProTipT, ProEst, EmprCod, ProDscM, ProImBmp, ProImBmp2, ProImBmp3, ProImBmp4, ProCosPrd, ProMerPor, ProMarPor, ProPreMax, ProPreMin) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ' ', ' ', ' ', ' ', ' ', 0, 0, 0, 0, 0)", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T002318", "UPDATE TXPPROCES SET ProDsc=?, ProDsc2=?, ProProvi=?, ProUltLin=?, ProDscF=?, ProTipP=?, ProTipT=?, ProEst=?  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new UpdateCursor("T002319", "DELETE FROM TXPPROCES  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new ForEachCursor("T002321", "SELECT COALESCE( T1.ProMaxLin, 0) AS ProMaxLin FROM (SELECT MAX(ProNumLin) AS ProMaxLin, EmprCod, ProCod FROM TXPPROLIN GROUP BY EmprCod, ProCod ) T1 WHERE T1.EmprCod = ? AND T1.ProCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002322", "SELECT * FROM (SELECT EmprCod, PedDGId, ProCod FROM TXPPEDDG4 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002323", "SELECT * FROM (SELECT EmprCod, ProCodID, ProCod FROM TXPPROCo1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002324", "SELECT * FROM (SELECT EmprCod, CliCod, FFProCod FROM TXPFasFCl WHERE EmprCod = ? AND FFProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002325", "SELECT * FROM (SELECT EmprCod, CliCod, Txt_Cor, ProCod FROM TXPPRE001 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002326", "SELECT * FROM (SELECT EmprCod, ManCod, ManFasCod, ProCod FROM TXPPREMFP WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002327", "SELECT * FROM (SELECT EmprCod, Int_Num, ProCod FROM TXPOTPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002328", "SELECT * FROM (SELECT EmprCod, EnsLCod, ProCod FROM TXPENSLA1 WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002329", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002330", "SELECT * FROM (SELECT EmprCod, DisCod, ProCod FROM TXPDISLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002331", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARPRO WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002332", "SELECT * FROM (SELECT EmprCod, CliCod, ArtCod, ProCod FROM TXPARTLIN WHERE EmprCod = ? AND ProCod = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002333", "UPDATE TXPPROCES SET ProUltLin=?  WHERE EmprCod = ? AND ProCod = ?", GX_NOMASK, "TXPPROCES")
         ,new ForEachCursor("T002334", "SELECT /*+ FIRST_ROWS(100) */ EmprCod, ProCod FROM TXPPROCES ORDER BY EmprCod, ProCod ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002335", "SELECT T1.ProCod, T1.ProNumLin, T1.ProUltFP, T2.FasDsc, T2.FasDec, T2.FasPreSal, T2.FasPrePie, T2.FasVelPro, T2.FasNumPas, T2.FasActTin, T2.FasCon, T2.FasForMul, T2.FasConPla, T2.FasAcab, T1.EmprCod, T1.FasCod, T2.MaqCod FROM (TXPPROLIN T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.ProCod = ? and T1.ProNumLin = ? ORDER BY T1.EmprCod, T1.ProCod, T1.ProNumLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002336", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002337", "SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("T002338", "INSERT INTO TXPPROLIN(ProCod, ProNumLin, ProUltFP, EmprCod, FasCod, ProFasNot, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ?, ' ', ' ', 0, ' ', 0, 0, 0)", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T002339", "UPDATE TXPPROLIN SET ProUltFP=?, FasCod=?  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new UpdateCursor("T002340", "DELETE FROM TXPPROLIN  WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?", GX_NOMASK, "TXPPROLIN")
         ,new ForEachCursor("T002341", "SELECT FasDsc, FasDec, FasPreSal, FasPrePie, FasVelPro, FasNumPas, FasActTin, FasCon, FasForMul, FasConPla, FasAcab, MaqCod FROM TXPFASPRO WHERE EmprCod = ? AND FasCod = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002342", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, Dtp_Ordl FROM TXPDT002 WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002343", "SELECT * FROM (SELECT EmprCod, ProCod, ProNumLin, ProFsaL FROM TXPPROFSA WHERE EmprCod = ? AND ProCod = ? AND ProNumLin = ?) WHERE rownum <= 1 ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002344", "SELECT EmprCod, ProCod, ProNumLin FROM TXPPROLIN WHERE EmprCod = ? and ProCod = ? ORDER BY EmprCod, ProCod, ProNumLin ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
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
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 60);
               ((String[]) buf[6])[0] = rslt.getString(7, 2);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 1);
               ((String[]) buf[9])[0] = rslt.getString(10, 3);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 40);
               ((String[]) buf[2])[0] = rslt.getString(3, 100);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 60);
               ((String[]) buf[8])[0] = rslt.getString(8, 2);
               ((byte[]) buf[9])[0] = rslt.getByte(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((String[]) buf[11])[0] = rslt.getString(11, 3);
               ((short[]) buf[12])[0] = rslt.getShort(12);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 8 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 15 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 20);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 19 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 13);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 21 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 22 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 23 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 24 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 25 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               return;
            case 26 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               return;
            case 28 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               return;
            case 29 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 28);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(7);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(8,1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(9);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(11, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getString(12, 1);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(13, 1);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(14, 1);
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getString(15, 3);
               ((String[]) buf[25])[0] = rslt.getString(16, 8);
               ((String[]) buf[26])[0] = rslt.getString(17, 6);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
      }
      getresults30( cursor, rslt, buf) ;
   }

   public void getresults30( int cursor ,
                             IFieldGetter rslt ,
                             Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
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
            case 31 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               return;
            case 35 :
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
            case 36 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 37 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               return;
            case 38 :
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
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 9 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 10 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 11 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 12 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setString(2, (String)parms[1], 40);
               stmt.setString(3, (String)parms[2], 100);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setString(6, (String)parms[5], 60);
               stmt.setString(7, (String)parms[6], 2);
               stmt.setByte(8, ((Number) parms[7]).byteValue());
               stmt.setString(9, (String)parms[8], 1);
               stmt.setString(10, (String)parms[9], 3);
               return;
            case 13 :
               stmt.setString(1, (String)parms[0], 40);
               stmt.setString(2, (String)parms[1], 100);
               stmt.setString(3, (String)parms[2], 1);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setString(5, (String)parms[4], 60);
               stmt.setString(6, (String)parms[5], 2);
               stmt.setByte(7, ((Number) parms[6]).byteValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setString(9, (String)parms[8], 3);
               stmt.setString(10, (String)parms[9], 8);
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
            case 24 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 25 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 26 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 27 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 3);
               stmt.setString(3, (String)parms[2], 8);
               return;
            case 29 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
      setparameters30( cursor, stmt, parms) ;
   }

   public void setparameters30( int cursor ,
                                IFieldSetter stmt ,
                                Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 30 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 31 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 32 :
               stmt.setString(1, (String)parms[0], 8);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 33 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 3);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 34 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 35 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
            case 36 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 37 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 38 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 8);
               return;
      }
   }

}

